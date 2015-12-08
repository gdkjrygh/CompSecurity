// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.mtp.MtpDevice;
import android.mtp.MtpObjectInfo;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class nde
    implements Runnable
{

    public ndf a;
    private String b;
    private Collection c;
    private MtpDevice d;
    private android.os.PowerManager.WakeLock e;

    public nde(MtpDevice mtpdevice, Collection collection, String s, Context context)
    {
        b = s;
        c = collection;
        d = mtpdevice;
        e = ((PowerManager)context.getSystemService("power")).newWakeLock(6, "Google Photos MTP Import Task");
    }

    private static boolean a(long l)
    {
        if ("mounted".equals(Environment.getExternalStorageState()))
        {
            Object obj = Environment.getExternalStorageDirectory().getPath();
            int i;
            long l1;
            try
            {
                obj = new StatFs(((String) (obj)));
                l1 = ((StatFs) (obj)).getAvailableBlocks();
                i = ((StatFs) (obj)).getBlockSize();
            }
            catch (Exception exception)
            {
                return false;
            }
            if ((long)i * l1 > l)
            {
                return true;
            }
        }
        return false;
    }

    public final void run()
    {
        e.acquire();
        LinkedList linkedlist;
        File file;
        Iterator iterator;
        int j;
        linkedlist = new LinkedList();
        j = c.size();
        a.a(0, j, null);
        file = new File(Environment.getExternalStorageDirectory(), b);
        file.mkdirs();
        iterator = c.iterator();
        int i = 0;
_L6:
        ndg ndg1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_256;
        }
        ndg1 = (ndg)iterator.next();
        i++;
        Object obj;
        if (!a(ndg1.d))
        {
            break MISSING_BLOCK_LABEL_303;
        }
        obj = d;
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((MtpDevice) (obj)).getObjectInfo(ndg1.a);
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj = ((MtpObjectInfo) (obj)).getName();
_L5:
        if (obj != null)
        {
            break; /* Loop/switch isn't completed */
        }
        String s;
        try
        {
            throw new FileNotFoundException("Failure in determining destination file");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            a = null;
        }
        a.i();
        a = null;
        e.release();
        return;
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
        s = (new File(file, ((String) (obj)))).getAbsolutePath();
        obj = s;
        if (!d.importFile(ndg1.a, s))
        {
            obj = null;
        }
        for (; obj != null; obj = null)
        {
            break MISSING_BLOCK_LABEL_232;
        }

        linkedlist.add(ndg1);
        if (a != null)
        {
            a.a(i, j, ((String) (obj)));
        }
          goto _L6
        if (a != null)
        {
            a.a(linkedlist, i);
        }
        a = null;
        e.release();
        return;
        e.release();
        throw obj;
    }
}
