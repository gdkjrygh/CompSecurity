// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;

import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.HashMap;

// Referenced classes of package org.chromium.media:
//            MediaDrmBridge

private class <init>
    implements android.media.ener
{

    static final boolean $assertionsDisabled;
    final MediaDrmBridge this$0;

    public void onEvent(MediaDrm mediadrm, byte abyte0[], int i, int j, byte abyte1[])
    {
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        Log.e("MediaDrmBridge", "MediaDrmListener: Null session.");
_L4:
        return;
_L2:
        abyte0 = ByteBuffer.wrap(abyte0);
        if (!MediaDrmBridge.access$1200(MediaDrmBridge.this, abyte0))
        {
            Log.e("MediaDrmBridge", "MediaDrmListener: Invalid session.");
            return;
        }
        mediadrm = (Integer)MediaDrmBridge.access$1300(MediaDrmBridge.this).get(abyte0);
        if (mediadrm == null || mediadrm.intValue() == 0)
        {
            Log.e("MediaDrmBridge", "MediaDrmListener: Invalid session ID.");
            return;
        }
        switch (i)
        {
        default:
            Log.e("MediaDrmBridge", (new StringBuilder()).append("Invalid DRM event ").append(i).toString());
            return;

        case 1: // '\001'
            Log.d("MediaDrmBridge", "MediaDrm.EVENT_PROVISION_REQUIRED");
            return;

        case 2: // '\002'
            Log.d("MediaDrmBridge", "MediaDrm.EVENT_KEY_REQUIRED");
            if (!MediaDrmBridge.access$1400(MediaDrmBridge.this))
            {
                String s = (String)MediaDrmBridge.access$1500(MediaDrmBridge.this).get(abyte0);
                try
                {
                    abyte0 = MediaDrmBridge.access$1600(MediaDrmBridge.this, abyte0, abyte1, s);
                }
                // Misplaced declaration of an exception variable
                catch (MediaDrm mediadrm)
                {
                    Log.e("MediaDrmBridge", "Device not provisioned", mediadrm);
                    MediaDrmBridge.access$1700(MediaDrmBridge.this);
                    return;
                }
                if (abyte0 != null)
                {
                    MediaDrmBridge.access$1800(MediaDrmBridge.this, mediadrm.intValue(), abyte0);
                    return;
                } else
                {
                    MediaDrmBridge.access$1900(MediaDrmBridge.this, mediadrm.intValue());
                    return;
                }
            }
            break;

        case 3: // '\003'
            Log.d("MediaDrmBridge", "MediaDrm.EVENT_KEY_EXPIRED");
            MediaDrmBridge.access$1900(MediaDrmBridge.this, mediadrm.intValue());
            return;

        case 4: // '\004'
            Log.d("MediaDrmBridge", "MediaDrm.EVENT_VENDOR_DEFINED");
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L4; else goto _L3
_L3:
        if ($assertionsDisabled) goto _L4; else goto _L5
_L5:
        throw new AssertionError();
    }

    static 
    {
        boolean flag;
        if (!org/chromium/media/MediaDrmBridge.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    private ()
    {
        this$0 = MediaDrmBridge.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
