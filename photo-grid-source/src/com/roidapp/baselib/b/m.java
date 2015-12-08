// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.b;

import android.graphics.BitmapFactory;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.roidapp.baselib.c.c;
import com.roidapp.baselib.d.a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.roidapp.baselib.b:
//            k, o, n, p

final class m extends c
{

    final k a;
    private Object b;
    private p c;
    private final WeakReference d;
    private final WeakReference e;

    public m(k k1, ImageView imageview, ProgressBar progressbar, p p1)
    {
        a = k1;
        super();
        c = p1;
        d = new WeakReference(progressbar);
        e = new WeakReference(imageview);
    }

    private ImageView a()
    {
        ImageView imageview = (ImageView)e.get();
        if (this == k.b(imageview))
        {
            return imageview;
        } else
        {
            return null;
        }
    }

    static Object a(m m1)
    {
        return m1.b;
    }

    private transient String a(Object aobj[])
    {
        String s;
        Object obj1;
        String s1;
        b = aobj[0];
        obj1 = String.valueOf(b);
        s1 = (new StringBuilder()).append(a.c).append(File.separator).append(".download_temp").toString();
        InterruptedException interruptedexception;
        boolean flag;
        if (com.roidapp.baselib.b.k.a(a))
        {
            s = (new StringBuilder()).append(a.c).append(File.separator).append(com.roidapp.baselib.d.a.b(com.roidapp.baselib.d.a.a(((String) (obj1))))).toString();
        } else
        {
            s = (new StringBuilder()).append(a.c).append(File.separator).append(com.roidapp.baselib.d.a.b(((String) (obj1)))).toString();
        }
        aobj = ((Object []) (k.b(a)));
        aobj;
        JVM INSTR monitorenter ;
_L4:
        if (!a.a) goto _L2; else goto _L1
_L1:
        flag = isCancelled();
        if (flag) goto _L2; else goto _L3
_L3:
        Exception exception;
        try
        {
            k.b(a).wait();
        }
        // Misplaced declaration of an exception variable
        catch (InterruptedException interruptedexception) { }
        finally { }
        if (true) goto _L4; else goto _L2
_L2:
        aobj;
        JVM INSTR monitorexit ;
        if (isCancelled() || a() == null || com.roidapp.baselib.b.k.c(a))
        {
            break MISSING_BLOCK_LABEL_302;
        }
        aobj = new File(s);
        if (!((File) (aobj)).exists() || !((File) (aobj)).isFile() || ((File) (aobj)).length() <= 0L)
        {
            break MISSING_BLOCK_LABEL_302;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, options);
        if (options.outWidth > 0 && options.outHeight > 0)
        {
            publishProgress(new Integer[] {
                Integer.valueOf(100)
            });
            return s;
        }
        break MISSING_BLOCK_LABEL_297;
        aobj;
        JVM INSTR monitorexit ;
        throw exception;
        ((File) (aobj)).delete();
        if (isCancelled() || a() == null || com.roidapp.baselib.b.k.c(a))
        {
            break MISSING_BLOCK_LABEL_528;
        }
        FileOutputStream fileoutputstream;
        if (a.c != null)
        {
            aobj = new File(a.c);
            if (!((File) (aobj)).exists())
            {
                ((File) (aobj)).mkdirs();
            }
        }
        aobj = new File(s1);
        if (((File) (aobj)).exists() && ((File) (aobj)).isFile())
        {
            ((File) (aobj)).delete();
        }
        fileoutputstream = new FileOutputStream(s1);
        aobj = fileoutputstream;
        boolean flag1 = a(((String) (obj1)), ((OutputStream) (fileoutputstream)));
        aobj = fileoutputstream;
        obj1 = new File(s1);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_502;
        }
        aobj = fileoutputstream;
        if (!((File) (obj1)).exists())
        {
            break MISSING_BLOCK_LABEL_520;
        }
        aobj = fileoutputstream;
        if (!((File) (obj1)).isFile())
        {
            break MISSING_BLOCK_LABEL_520;
        }
        aobj = fileoutputstream;
        if (((File) (obj1)).length() <= 0L)
        {
            break MISSING_BLOCK_LABEL_520;
        }
        aobj = fileoutputstream;
        flag1 = ((File) (obj1)).renameTo(new File(s));
        if (flag1)
        {
            try
            {
                fileoutputstream.flush();
                fileoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                ((Exception) (aobj)).printStackTrace();
                return s;
            }
            return s;
        }
        break MISSING_BLOCK_LABEL_520;
        aobj = fileoutputstream;
        if (!((File) (obj1)).exists())
        {
            break MISSING_BLOCK_LABEL_520;
        }
        aobj = fileoutputstream;
        ((File) (obj1)).delete();
        try
        {
            fileoutputstream.flush();
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            ((Exception) (aobj)).printStackTrace();
        }
_L5:
        return null;
        Object obj;
        obj;
        fileoutputstream = null;
_L9:
        aobj = fileoutputstream;
        Log.e("NetworkImageFetcher", (new StringBuilder()).append(((IOException) (obj)).getMessage()).toString());
        aobj = fileoutputstream;
        ((IOException) (obj)).printStackTrace();
        if (fileoutputstream != null)
        {
            try
            {
                fileoutputstream.flush();
                fileoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                ((Exception) (aobj)).printStackTrace();
            }
        }
          goto _L5
        obj;
        fileoutputstream = null;
_L8:
        aobj = fileoutputstream;
        Log.e("NetworkImageFetcher", (new StringBuilder("doInBackground - ")).append(((IllegalStateException) (obj)).getMessage()).toString());
        aobj = fileoutputstream;
        ((IllegalStateException) (obj)).printStackTrace();
        if (fileoutputstream != null)
        {
            try
            {
                fileoutputstream.flush();
                fileoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                ((Exception) (aobj)).printStackTrace();
            }
        }
          goto _L5
        fileoutputstream;
        aobj = null;
_L7:
        if (aobj != null)
        {
            try
            {
                ((FileOutputStream) (aobj)).flush();
                ((FileOutputStream) (aobj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                ((Exception) (aobj)).printStackTrace();
            }
        }
        throw fileoutputstream;
        fileoutputstream;
        if (true) goto _L7; else goto _L6
_L6:
        obj;
          goto _L8
        obj;
          goto _L9
    }

    private boolean a(String s, OutputStream outputstream)
    {
        Object obj1;
        Object obj2;
        Exception exception1;
        Object obj3 = null;
        exception1 = null;
        Object obj;
        int i;
        int j;
        int l;
        try
        {
            obj = (HttpURLConnection)(new URL(s)).openConnection();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            outputstream = null;
            obj = null;
            obj2 = exception1;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj = null;
            outputstream = null;
            obj2 = obj3;
        }
        try
        {
_L5:
            ((HttpURLConnection) (obj)).setConnectTimeout(10000);
            ((HttpURLConnection) (obj)).setReadTimeout(10000);
            obj1 = new BufferedInputStream(((HttpURLConnection) (obj)).getInputStream(), 8192);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            outputstream = null;
            obj2 = exception1;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj1 = null;
            outputstream = ((OutputStream) (obj));
            obj = obj1;
            obj2 = obj3;
            continue; /* Loop/switch isn't completed */
        }
        obj2 = new BufferedOutputStream(outputstream, 8192);
        l = ((HttpURLConnection) (obj)).getContentLength();
        i = 0;
_L4:
        j = ((BufferedInputStream) (obj1)).read();
        if (j == -1) goto _L2; else goto _L1
_L1:
        ((BufferedOutputStream) (obj2)).write(j);
        j = i + 1;
        i = j;
        if (j % 512 != 0) goto _L4; else goto _L3
_L3:
        publishProgress(new Integer[] {
            Integer.valueOf((int)(((double)j / (double)l) * 100D))
        });
        i = j;
          goto _L4
        exception1;
        outputstream = ((OutputStream) (obj1));
        obj1 = exception1;
_L8:
        if (c != null)
        {
            k.d(a).post(new o(this, s, ((Exception) (obj1))));
        }
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        ((BufferedOutputStream) (obj2)).close();
        if (outputstream != null)
        {
            try
            {
                outputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        return false;
_L2:
        if (c != null)
        {
            k.d(a).post(new n(this, s));
        }
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        Exception exception;
        try
        {
            ((BufferedOutputStream) (obj2)).close();
            ((BufferedInputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        return true;
        if (outputstream != null)
        {
            outputstream.disconnect();
        }
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_285;
        }
        ((BufferedOutputStream) (obj2)).close();
        if (obj != null)
        {
            try
            {
                ((BufferedInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (OutputStream outputstream) { }
        }
        throw s;
        s;
        outputstream = ((OutputStream) (obj));
        obj = obj1;
        obj2 = obj3;
        continue; /* Loop/switch isn't completed */
        s;
        outputstream = ((OutputStream) (obj));
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        s;
        obj1 = outputstream;
        outputstream = ((OutputStream) (obj));
        obj = obj1;
        if (true) goto _L6; else goto _L5
_L6:
        break MISSING_BLOCK_LABEL_267;
        exception;
        outputstream = ((OutputStream) (obj1));
        obj1 = exception;
        exception = exception1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static p b(m m1)
    {
        return m1.c;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    protected final void onCancelled(Object obj)
    {
        super.onCancelled((String)obj);
        synchronized (k.b(a))
        {
            k.b(a).notifyAll();
        }
        Log.w("NetworkImageFetcher", (new StringBuilder("cancel in downloadBitmap - ")).append(String.valueOf(b)).toString());
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (String)obj;
        if (isCancelled() || com.roidapp.baselib.b.k.c(a))
        {
            obj = null;
        }
        if (c != null)
        {
            c.a(String.valueOf(b), ((String) (obj)));
        }
    }

    protected final void onProgressUpdate(Object aobj[])
    {
        aobj = (Integer[])aobj;
        if (d != null)
        {
            ProgressBar progressbar = (ProgressBar)d.get();
            if (progressbar != null)
            {
                progressbar.setProgress(((Integer) (aobj[0])).intValue());
            }
        }
        if (c != null)
        {
            p p1 = c;
            String.valueOf(b);
            p1.a(((Integer) (aobj[0])).intValue());
        }
    }
}
