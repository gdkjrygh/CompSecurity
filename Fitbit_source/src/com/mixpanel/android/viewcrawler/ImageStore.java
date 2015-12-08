// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Log;
import com.mixpanel.android.util.RemoteService;
import com.mixpanel.android.util.c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class ImageStore
{
    public static class CantGetImageException extends Exception
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


    private static final String d = "MixpanelAPI.Images";
    private static final int e = 0x989680;
    private static final String f = "MP_IMG_";
    private static final String g = "MixpanelAPI.ImageStore";
    private final File a;
    private final RemoteService b;
    private final MessageDigest c;

    public ImageStore(Context context)
    {
        this(context.getDir("MixpanelAPI.Images", 0), ((RemoteService) (new c())));
    }

    public ImageStore(File file, RemoteService remoteservice)
    {
        a = file;
        b = remoteservice;
        try
        {
            file = MessageDigest.getInstance("SHA1");
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            Log.w("MixpanelAPI.ImageStore", "Images won't be stored because this platform doesn't supply a SHA1 hash function");
            file = null;
        }
        c = file;
    }

    private File c(String s)
    {
        if (c == null)
        {
            return null;
        } else
        {
            s = c.digest(s.getBytes());
            s = (new StringBuilder()).append("MP_IMG_").append(Base64.encodeToString(s, 10)).toString();
            return new File(a, s);
        }
    }

    public Bitmap a(String s)
        throws CantGetImageException
    {
        Object obj = null;
        Object obj2 = null;
        File file = c(s);
        Object obj1;
        if (file == null || !file.exists())
        {
            try
            {
                obj1 = b.a(s, null);
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
            break MISSING_BLOCK_LABEL_78;
        }
        s = new FileOutputStream(file);
        obj = s;
        s.write(((byte []) (obj1)));
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.w("MixpanelAPI.ImageStore", "Problem closing output file", s);
            }
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

    public void a()
    {
        File afile[] = a.listFiles();
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            File file = afile[i];
            if (file.getName().startsWith("MP_IMG_"))
            {
                file.delete();
            }
        }

    }

    public void b(String s)
    {
        s = c(s);
        if (s != null)
        {
            s.delete();
        }
    }
}
