// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Log;
import cxi;
import cym;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package com.mixpanel.android.util:
//            RemoteService

public final class ImageStore
{

    private final File a;
    private final RemoteService b;
    private final MessageDigest c;
    private final cxi d;

    public ImageStore(Context context, String s)
    {
        this(context, (new StringBuilder("MixpanelAPI.Images.")).append(s).toString(), ((RemoteService) (new cym())));
    }

    private ImageStore(Context context, String s, RemoteService remoteservice)
    {
        a = context.getDir(s, 0);
        b = remoteservice;
        d = cxi.a(context);
        try
        {
            context = MessageDigest.getInstance("SHA1");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("MixpanelAPI.ImageStore", "Images won't be stored because this platform doesn't supply a SHA1 hash function");
            context = null;
        }
        c = context;
    }

    public final Bitmap a(String s)
    {
        Object obj = null;
        Object obj2 = null;
        File file = b(s);
        Object obj1;
        if (file == null || !file.exists())
        {
            try
            {
                obj1 = d.a();
                obj1 = b.a(s, null, ((javax.net.ssl.SSLSocketFactory) (obj1)));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new CantGetImageException("Can't download bitmap", s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new CantGetImageException("Couldn't download image due to service availability", s);
            }
        } else
        {
            obj1 = null;
        }
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        if (file == null || obj1.length >= 0x989680)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        s = new FileOutputStream(file);
        obj = s;
        s.write(((byte []) (obj1)));
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("MixpanelAPI.ImageStore", "Problem closing output file", s);
        }
        obj = BitmapFactory.decodeByteArray(((byte []) (obj1)), 0, obj1.length);
        s = ((String) (obj));
        if (obj == null)
        {
            throw new CantGetImageException("Downloaded data could not be interpreted as a bitmap");
        }
          goto _L3
        obj1;
        s = null;
_L7:
        obj = s;
        throw new CantGetImageException("It appears that ImageStore is misconfigured, or disk storage is unavailable- can't write to bitmap directory", ((Throwable) (obj1)));
        s;
_L4:
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w("MixpanelAPI.ImageStore", "Problem closing output file", ((Throwable) (obj)));
            }
        }
        throw s;
        s;
        obj = obj2;
_L5:
        throw new CantGetImageException("Can't store bitmap", s);
        s;
          goto _L4
_L2:
        obj = BitmapFactory.decodeFile(file.getAbsolutePath());
        s = ((String) (obj));
        if (obj == null)
        {
            file.delete();
            throw new CantGetImageException("Bitmap on disk can't be opened or was corrupt");
        }
_L3:
        return s;
        obj1;
        obj = s;
        s = ((String) (obj1));
          goto _L5
        obj1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final File b(String s)
    {
        if (c == null)
        {
            return null;
        } else
        {
            s = c.digest(s.getBytes());
            s = (new StringBuilder("MP_IMG_")).append(Base64.encodeToString(s, 10)).toString();
            return new File(a, s);
        }
    }

    private class CantGetImageException extends Exception
    {

        public CantGetImageException(String s)
        {
            super(s);
        }

        public CantGetImageException(String s, Throwable throwable)
        {
            super(s, throwable);
        }
    }

}
