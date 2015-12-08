// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.FacebookContentProvider;
import com.facebook.p;
import com.facebook.s;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.facebook.internal:
//            Y, U

public final class M
{
    public static final class a
    {

        final UUID a;
        public final String b;
        final String c;
        Bitmap d;
        Uri e;
        boolean f;
        boolean g;

        private a(UUID uuid, Bitmap bitmap, Uri uri)
        {
            boolean flag;
            flag = true;
            super();
            a = uuid;
            d = bitmap;
            e = uri;
            if (uri == null)
            {
                break MISSING_BLOCK_LABEL_162;
            }
            bitmap = uri.getScheme();
            if (!"content".equalsIgnoreCase(bitmap)) goto _L2; else goto _L1
_L1:
            f = true;
            if (uri.getAuthority() == null || uri.getAuthority().startsWith("media"))
            {
                flag = false;
            }
            g = flag;
_L5:
            if (!g)
            {
                bitmap = null;
            } else
            {
                bitmap = UUID.randomUUID().toString();
            }
            c = bitmap;
            if (!g)
            {
                uuid = e.toString();
            } else
            {
                uuid = FacebookContentProvider.a(s.h(), uuid, c);
            }
            b = uuid;
            return;
_L2:
            if (!"file".equalsIgnoreCase(uri.getScheme())) goto _L4; else goto _L3
_L3:
            g = true;
              goto _L5
_L4:
            if (U.b(uri)) goto _L5; else goto _L6
_L6:
            throw new p((new StringBuilder("Unsupported scheme for media Uri : ")).append(bitmap).toString());
            if (bitmap != null)
            {
                g = true;
            } else
            {
                throw new p("Cannot share media without a bitmap or Uri set");
            }
              goto _L5
        }

        a(UUID uuid, Bitmap bitmap, Uri uri, byte byte0)
        {
            this(uuid, bitmap, uri);
        }
    }


    private static final String a = com/facebook/internal/M.getName();
    private static File b;

    private M()
    {
    }

    public static a a(UUID uuid, Bitmap bitmap)
    {
        Y.a(uuid, "callId");
        Y.a(bitmap, "attachmentBitmap");
        return new a(uuid, bitmap, null, (byte)0);
    }

    public static a a(UUID uuid, Uri uri)
    {
        Y.a(uuid, "callId");
        Y.a(uri, "attachmentUri");
        return new a(uuid, null, uri, (byte)0);
    }

    private static File a()
    {
        com/facebook/internal/M;
        JVM INSTR monitorenter ;
        File file;
        if (b == null)
        {
            b = new File(s.f().getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
        }
        file = b;
        com/facebook/internal/M;
        JVM INSTR monitorexit ;
        return file;
        Exception exception;
        exception;
        throw exception;
    }

    public static File a(UUID uuid, String s1)
        throws FileNotFoundException
    {
        if (U.a(s1) || uuid == null)
        {
            throw new FileNotFoundException();
        }
        try
        {
            uuid = a(uuid, s1, false);
        }
        // Misplaced declaration of an exception variable
        catch (UUID uuid)
        {
            throw new FileNotFoundException();
        }
        return uuid;
    }

    private static File a(UUID uuid, String s1, boolean flag)
        throws IOException
    {
        uuid = a(uuid, flag);
        if (uuid == null)
        {
            return null;
        }
        try
        {
            uuid = new File(uuid, URLEncoder.encode(s1, "UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (UUID uuid)
        {
            return null;
        }
        return uuid;
    }

    private static File a(UUID uuid, boolean flag)
    {
        if (b == null)
        {
            uuid = null;
        } else
        {
            File file = new File(b, uuid.toString());
            uuid = file;
            if (flag)
            {
                uuid = file;
                if (!file.exists())
                {
                    file.mkdirs();
                    return file;
                }
            }
        }
        return uuid;
    }

    public static void a(Collection collection)
    {
        if (collection != null && collection.size() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        if (b == null)
        {
            U.a(a());
        }
        a().mkdirs();
        obj = new ArrayList();
        Object obj1 = collection.iterator();
_L5:
        Object obj3;
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            obj3 = (a)((Iterator) (obj1)).next();
        } while (!((a) (obj3)).g);
        collection = a(((a) (obj3)).a, ((a) (obj3)).c, true);
        ((List) (obj)).add(collection);
        if (((a) (obj3)).d == null) goto _L4; else goto _L3
_L3:
        obj3 = ((a) (obj3)).d;
        collection = new FileOutputStream(collection);
        ((Bitmap) (obj3)).compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, collection);
        Object obj2;
        U.a(collection);
          goto _L5
        obj2;
        U.a(collection);
        throw obj2;
_L4:
        if (((a) (obj3)).e == null) goto _L5; else goto _L6
_L6:
        Uri uri;
        boolean flag;
        uri = ((a) (obj3)).e;
        flag = ((a) (obj3)).f;
        obj3 = new FileOutputStream(collection);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        collection = new FileInputStream(uri.getPath());
_L7:
        U.a(collection, ((java.io.OutputStream) (obj3)));
        U.a(((java.io.Closeable) (obj3)));
          goto _L5
        collection = s.f().getContentResolver().openInputStream(uri);
          goto _L7
        collection;
        try
        {
            U.a(((java.io.Closeable) (obj3)));
            throw collection;
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            (new StringBuilder("Got unexpected exception:")).append(collection);
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
            {
                obj1 = (File)((Iterator) (obj)).next();
                try
                {
                    ((File) (obj1)).delete();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj2) { }
            }

        }
        throw new p(collection);
          goto _L5
        if (true) goto _L1; else goto _L8
_L8:
    }

    public static void a(UUID uuid)
    {
        uuid = a(uuid, false);
        if (uuid != null)
        {
            U.a(uuid);
        }
    }

}
