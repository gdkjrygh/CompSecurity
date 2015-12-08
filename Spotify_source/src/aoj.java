// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.facebook.FacebookException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public final class aoj
{

    private static final String a = aoj.getName();
    private static File b;

    public aoj()
    {
    }

    private static File a(Context context)
    {
        aoj;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new File(context.getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
        }
        context = b;
        aoj;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private static File a(UUID uuid, String s)
    {
        uuid = a(uuid, true);
        if (uuid == null)
        {
            return null;
        }
        try
        {
            uuid = new File(uuid, URLEncoder.encode(s, "UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (UUID uuid)
        {
            return null;
        }
        return uuid;
    }

    public static File a(UUID uuid, boolean flag)
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

    public static void a(Context context, UUID uuid, Map map, aok aok1)
    {
        if (map.size() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (b == null)
        {
            arp.a(a(context));
        }
        a(context).mkdirs();
        context = new ArrayList();
        try
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                Object obj1 = (java.util.Map.Entry)map.next();
                Object obj = (String)((java.util.Map.Entry) (obj1)).getKey();
                obj1 = ((java.util.Map.Entry) (obj1)).getValue();
                obj = a(uuid, ((String) (obj)));
                context.add(obj);
                aok1.a(obj1, ((File) (obj)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (UUID uuid)
        {
            Log.e(a, (new StringBuilder("Got unexpected exception:")).append(uuid).toString());
            for (context = context.iterator(); context.hasNext();)
            {
                map = (File)context.next();
                try
                {
                    map.delete();
                }
                // Misplaced declaration of an exception variable
                catch (Map map) { }
            }

            throw new FacebookException(uuid);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }


    // Unreferenced inner class aoj$1

/* anonymous class */
    public final class _cls1
        implements aok
    {

        public final void a(Object obj, File file)
        {
            obj = (Bitmap)obj;
            file = new FileOutputStream(file);
            ((Bitmap) (obj)).compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, file);
            arp.a(file);
            return;
            obj;
            arp.a(file);
            throw obj;
        }

    }


    // Unreferenced inner class aoj$2

/* anonymous class */
    public final class _cls2
        implements aok
    {

        public final void a(Object obj, File file)
        {
            FileOutputStream fileoutputstream;
            obj = (File)obj;
            fileoutputstream = new FileOutputStream(file);
            file = new FileInputStream(((File) (obj)));
            obj = new byte[1024];
_L3:
            int i = file.read(((byte []) (obj)));
            if (i <= 0) goto _L2; else goto _L1
_L1:
            fileoutputstream.write(((byte []) (obj)), 0, i);
              goto _L3
            obj;
_L5:
            arp.a(fileoutputstream);
            arp.a(file);
            throw obj;
_L2:
            arp.a(fileoutputstream);
            arp.a(file);
            return;
            obj;
            file = null;
            if (true) goto _L5; else goto _L4
_L4:
        }

    }

}
