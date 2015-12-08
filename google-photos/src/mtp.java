// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class mtp
{

    final List a = new LinkedList();
    private final int b;
    private final File c;
    private int d;
    private int e;

    public mtp(Context context, String s)
    {
        b = (android.os.Build.VERSION.RELEASE.hashCode() + 31) * 31 + a(context);
        context = String.valueOf(context.getDir(null, 0).getAbsolutePath());
        c = new File((new StringBuilder(String.valueOf(context).length() + 1 + String.valueOf(s).length())).append(context).append("/").append(s).toString());
        d();
        a();
    }

    private static int a(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("BackgroundTask", "Failed to get application version", context);
            return 0;
        }
        return i;
    }

    static int a(mue mue1)
    {
        mue1 = mue1.b();
        int i;
        if (mue1 != null)
        {
            i = mue1.length;
        } else
        {
            i = 0;
        }
        return i + 200;
    }

    private void a(Iterator iterator, mtq mtq1)
    {
        iterator.remove();
        e = e - a(mtq1.c);
    }

    private void d()
    {
        File file = c;
        file;
        JVM INSTR monitorenter ;
        android.os.StrictMode.ThreadPolicy threadpolicy = StrictMode.allowThreadDiskWrites();
        boolean flag = c.exists();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        if (c.exists())
        {
            c.delete();
        }
        d = 0;
        StrictMode.setThreadPolicy(threadpolicy);
        file;
        JVM INSTR monitorexit ;
        return;
        DataInputStream datainputstream = new DataInputStream(new BufferedInputStream(new FileInputStream(c)));
        Object obj = datainputstream;
        int i = datainputstream.readInt();
        obj = datainputstream;
        int j = b;
        if (i == j)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        Exception exception;
        byte abyte0[];
        Exception exception1;
        try
        {
            datainputstream.close();
        }
        catch (IOException ioexception) { }
        if (c.exists())
        {
            c.delete();
        }
        d = 0;
        StrictMode.setThreadPolicy(threadpolicy);
        file;
        JVM INSTR monitorexit ;
        return;
        obj;
        file;
        JVM INSTR monitorexit ;
        throw obj;
        obj = datainputstream;
        j = datainputstream.readInt();
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = datainputstream;
        abyte0 = new byte[datainputstream.readInt()];
        obj = datainputstream;
        datainputstream.readFully(abyte0);
        obj = datainputstream;
        a((mtq)b.a(abyte0, mtq.getClassLoader()));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj = datainputstream;
        if (!Log.isLoggable("BackgroundTask", 4))
        {
            break MISSING_BLOCK_LABEL_258;
        }
        obj = datainputstream;
        i = a.size();
        obj = datainputstream;
        (new StringBuilder(34)).append("readResults: num read: ").append(i);
        try
        {
            datainputstream.close();
        }
        catch (IOException ioexception1) { }
        if (c.exists())
        {
            c.delete();
        }
        d = 0;
        StrictMode.setThreadPolicy(threadpolicy);
_L3:
        file;
        JVM INSTR monitorexit ;
        return;
        exception1;
        datainputstream = null;
_L6:
        obj = datainputstream;
        Log.e("BackgroundTask", "Cannot read service results", exception1);
        if (datainputstream == null)
        {
            break MISSING_BLOCK_LABEL_316;
        }
        try
        {
            datainputstream.close();
        }
        catch (IOException ioexception2) { }
        if (c.exists())
        {
            c.delete();
        }
        d = 0;
        StrictMode.setThreadPolicy(threadpolicy);
          goto _L3
        exception;
        obj = null;
_L5:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_358;
        }
        try
        {
            ((DataInputStream) (obj)).close();
        }
        catch (IOException ioexception3) { }
        if (c.exists())
        {
            c.delete();
        }
        d = 0;
        StrictMode.setThreadPolicy(threadpolicy);
        throw exception;
        exception;
        if (true) goto _L5; else goto _L4
_L4:
        exception1;
          goto _L6
    }

    public final int a(int i)
    {
        List list = a;
        list;
        JVM INSTR monitorenter ;
        int j = 0;
        Iterator iterator = a.iterator();
_L1:
        mtq mtq1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_65;
            }
            mtq1 = (mtq)iterator.next();
        } while (mtq1.a != i);
        a(iterator, mtq1);
        j++;
          goto _L1
        list;
        JVM INSTR monitorexit ;
        return j;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final mue a(int i, String s)
    {
label0:
        {
            synchronized (a)
            {
                Iterator iterator = a.iterator();
                mtq mtq1;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    mtq1 = (mtq)iterator.next();
                } while (mtq1.a != i || !TextUtils.equals(mtq1.b, s));
                a(iterator, mtq1);
                s = mtq1.c;
            }
            return s;
        }
        list;
        JVM INSTR monitorexit ;
        return null;
        s;
        list;
        JVM INSTR monitorexit ;
        throw s;
    }

    void a()
    {
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            mtq mtq1 = (mtq)iterator.next();
            mue mue1 = mtq1.c;
            boolean flag;
            if (System.currentTimeMillis() - mue1.e > mue.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                if (Log.isLoggable("BackgroundTask", 4))
                {
                    String s = String.valueOf(mtq1.c);
                    String s1 = mtq1.b;
                    (new StringBuilder(String.valueOf(s).length() + 32 + String.valueOf(s1).length())).append("Dropping expired result: ").append(s).append(", tag: ").append(s1);
                }
                a(iterator, mtq1);
            }
        } while (true);
    }

    void a(mtq mtq1)
    {
        a.add(mtq1);
        e = e + a(mtq1.c);
    }

    void b()
    {
        mtq mtq1;
        for (Iterator iterator = a.iterator(); e > 0x7d000 && iterator.hasNext(); a(iterator, mtq1))
        {
            mtq1 = (mtq)iterator.next();
            if (Log.isLoggable("BackgroundTask", 4))
            {
                String s = String.valueOf(mtq1.c);
                String s1 = mtq1.b;
                (new StringBuilder(String.valueOf(s).length() + 37 + String.valueOf(s1).length())).append("Dropping result to make room: ").append(s).append(", tag: ").append(s1);
            }
        }

    }

    public final int c()
    {
        List list = a;
        list;
        JVM INSTR monitorenter ;
        Object obj2;
        obj2 = new ArrayList(a.size());
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            mtq mtq1 = (mtq)iterator.next();
            if (mtq1.c.f == muf.b)
            {
                ((List) (obj2)).add(mtq1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_85;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        list;
        JVM INSTR monitorexit ;
        int i;
label0:
        {
            synchronized (c)
            {
                i = ((List) (obj2)).hashCode();
                if (i != d)
                {
                    break label0;
                }
            }
            return 0;
        }
        Object obj1 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(c)));
        obj = obj1;
        ((DataOutputStream) (obj1)).writeInt(b);
        obj = obj1;
        ((DataOutputStream) (obj1)).writeInt(((List) (obj2)).size());
        obj = obj1;
        Iterator iterator1 = ((List) (obj2)).iterator();
_L2:
        obj = obj1;
        if (!iterator1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        byte abyte0[] = b.a((mtq)iterator1.next());
        obj = obj1;
        ((DataOutputStream) (obj1)).writeInt(abyte0.length);
        obj = obj1;
        ((DataOutputStream) (obj1)).write(abyte0);
        if (true) goto _L2; else goto _L1
        obj2;
_L6:
        obj = obj1;
        Log.e("BackgroundTask", "Cannot save background task results", ((Throwable) (obj2)));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        try
        {
            ((DataOutputStream) (obj1)).close();
        }
        catch (IOException ioexception1) { }
        file;
        JVM INSTR monitorexit ;
        return -1;
_L1:
        obj = obj1;
        d = i;
        obj = obj1;
        if (!Log.isLoggable("BackgroundTask", 4))
        {
            break MISSING_BLOCK_LABEL_303;
        }
        obj = obj1;
        i = ((List) (obj2)).size();
        obj = obj1;
        (new StringBuilder(38)).append("writeResults: num written: ").append(i);
        obj = obj1;
        i = ((List) (obj2)).size();
        try
        {
            ((DataOutputStream) (obj1)).close();
        }
        catch (IOException ioexception) { }
        file;
        JVM INSTR monitorexit ;
        return i;
        obj;
        file;
        JVM INSTR monitorexit ;
        throw obj;
        obj1;
        obj = null;
_L4:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_340;
        }
        try
        {
            ((DataOutputStream) (obj)).close();
        }
        catch (IOException ioexception2) { }
        throw obj1;
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
        obj1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
