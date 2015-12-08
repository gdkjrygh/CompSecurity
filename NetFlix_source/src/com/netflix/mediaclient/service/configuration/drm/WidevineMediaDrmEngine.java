// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration.drm;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.Base64;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class WidevineMediaDrmEngine
{

    static final UUID NetflixWidevineUUID = new UUID(0x29701fe43cc74a34L, 0x8c5bae90c7439a47L);
    static final UUID WideVineUUID = new UUID(0xedef8ba979d64aceL, 0xa3c827dcd51d21edL);
    static boolean mKeyAdded = false;
    private final String TAG = "WidevineMediaDrmEngine";
    private MediaCrypto mCrypto;
    private MediaDrm mDrm;
    private byte mSessionId[];

    WidevineMediaDrmEngine()
    {
        mSessionId = null;
        Log.i("WidevineMediaDrmEngine", "create WidevineMediaDrmEngine");
        Log.i("WidevineMediaDrmEngine", "WidevineMediaDrmEngine done");
    }

    private void cleanup()
    {
        if (mDrm != null)
        {
            if (mCrypto != null)
            {
                mCrypto.release();
                mCrypto = null;
            }
            if (mSessionId != null)
            {
                mDrm.closeSession(mSessionId);
                mSessionId = null;
            }
            mDrm.release();
            mDrm = null;
        }
    }

    public void clearLicense(byte abyte0[])
    {
        if (mSessionId != null)
        {
            mDrm.removeKeys(mSessionId);
        }
    }

    public byte[] getChallenge(byte abyte0[])
    {
        byte abyte1[];
        HashMap hashmap;
        if (mSessionId == null)
        {
            Log.i("WidevineMediaDrmEngine", "create Session");
            int i;
            try
            {
                mSessionId = mDrm.openSession();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                Log.i("WidevineMediaDrmEngine", (new StringBuilder()).append("fail to openSession ").append(abyte0.getMessage()).toString());
                return null;
            }
        }
        hashmap = new HashMap();
        abyte1 = mDrm.getPropertyByteArray("provisioningUniqueId");
        if (abyte1 != null)
        {
            if (Log.isLoggable("WidevineMediaDrmEngine", 3))
            {
                StringBuilder stringbuilder = new StringBuilder();
                for (i = 0; i < abyte1.length; i++)
                {
                    stringbuilder.append(String.format("%02x  ", new Object[] {
                        Byte.valueOf(abyte1[i])
                    }));
                }

                Log.i("WidevineMediaDrmEngine", (new StringBuilder()).append("provisioningUniqueId ").append(stringbuilder.toString()).toString());
            }
            String s;
            try
            {
                s = Base64.encodeBytes(abyte1);
            }
            catch (IOException ioexception)
            {
                Log.i("WidevineMediaDrmEngine", "fail to encode property provisioningUniqueId");
                ioexception = null;
            }
            if (s != null)
            {
                hashmap.put("CDMID", s);
                if (Log.isLoggable("WidevineMediaDrmEngine", 3))
                {
                    Log.i("WidevineMediaDrmEngine", (new StringBuilder()).append("CDMID ").append(s).toString());
                }
            }
        }
        try
        {
            abyte0 = mDrm.getKeyRequest(mSessionId, abyte0, new String(), 1, hashmap);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.i("WidevineMediaDrmEngine", (new StringBuilder()).append("fail to getChallenge").append(abyte0.getMessage()).toString());
            return null;
        }
        if (abyte0 != null)
        {
            Log.i("WidevineMediaDrmEngine", (new StringBuilder()).append("getChallenge of size ").append(abyte0.getData().length).toString());
            return abyte0.getData();
        } else
        {
            Log.i("WidevineMediaDrmEngine", "getChallenge done");
            return null;
        }
    }

    public MediaCrypto getMediaCrypto()
    {
        Log.i("WidevineMediaDrmEngine", "get MediaCrypto");
        cleanup();
        if (mDrm == null)
        {
            try
            {
                mDrm = new MediaDrm(WideVineUUID);
            }
            catch (MediaDrmException mediadrmexception)
            {
                Log.e("WidevineMediaDrmEngine", (new StringBuilder()).append("fail to create MediaDrm: ").append(mediadrmexception.getMessage()).toString());
                return null;
            }
        }
        if (mSessionId == null)
        {
            Log.i("WidevineMediaDrmEngine", "create Session");
            try
            {
                mSessionId = mDrm.openSession();
            }
            catch (NotProvisionedException notprovisionedexception)
            {
                Log.i("WidevineMediaDrmEngine", (new StringBuilder()).append("fail to openSession ").append(notprovisionedexception.getMessage()).toString());
                return null;
            }
        }
        try
        {
            mCrypto = new MediaCrypto(WideVineUUID, mSessionId);
        }
        catch (MediaCryptoException mediacryptoexception)
        {
            Log.e("WidevineMediaDrmEngine", (new StringBuilder()).append("fail to create MediaCrypto: ").append(mediacryptoexception.getMessage()).toString());
            mediacryptoexception.printStackTrace();
            return null;
        }
        return mCrypto;
    }

    public List getSecureStops()
    {
        return mDrm.getSecureStops();
    }

    public boolean isKeyAdded()
    {
        return mKeyAdded;
    }

    public void releaseMediaCrypto()
    {
        Log.i("WidevineMediaDrmEngine", "release MediaCrypto and SessionId");
        cleanup();
    }

    public void releaseSecureStops(byte abyte0[])
    {
        mDrm.releaseSecureStops(abyte0);
    }

    public byte[] storeLicense(byte abyte0[])
    {
        try
        {
            mDrm.provideKeyResponse(mSessionId, abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.i("WidevineMediaDrmEngine", (new StringBuilder()).append("fail to storeLicense DeniedByServerException ").append(abyte0.getMessage()).toString());
            return new byte[0];
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.i("WidevineMediaDrmEngine", (new StringBuilder()).append("fail to storeLicense NotProvisionedException ").append(abyte0.getMessage()).toString());
            return new byte[0];
        }
        mKeyAdded = true;
        return mSessionId;
    }

}
