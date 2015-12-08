// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import com.roidapp.baselib.d.a;
import com.roidapp.photogrid.common.b;
import com.roidapp.photogrid.common.bn;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;

// Referenced classes of package com.roidapp.photogrid.release:
//            rf, ky, kz, ku, 
//            kx, kv, kw

public final class kt
{

    private Context a;
    private Handler b;
    private LinkedHashMap c;
    private LinkedHashMap d;
    private LinkedHashMap e;
    private LinkedHashMap f;

    public kt(Context context, Handler handler)
    {
        c = new LinkedHashMap();
        d = new LinkedHashMap();
        e = new LinkedHashMap();
        f = new LinkedHashMap();
        a = context;
        b = handler;
    }

    static Context a(kt kt1)
    {
        return kt1.a;
    }

    static kz a(kt kt1, String s)
    {
        boolean flag = true;
        if (!Environment.getExternalStorageState().equals("mounted"))
        {
            Toast.makeText(kt1.a, 0x7f07028d, 1).show();
            return null;
        }
        ArrayList arraylist;
        if (!s.equals(com.roidapp.baselib.d.a.a()))
        {
            flag = false;
        }
        arraylist = new ArrayList();
        s = new File(s);
        if (s.isDirectory())
        {
            s = s.listFiles();
            if (s != null)
            {
                int j = s.length;
                int i = 0;
                while (i < j) 
                {
                    File file = s[i];
                    String s1 = file.getAbsolutePath().toLowerCase(Locale.ENGLISH);
                    if (s1.endsWith(".png") || s1.endsWith(".jpg") || s1.endsWith(".gif") || s1.endsWith(".bmp") || s1.endsWith(".jpeg") || s1.endsWith(".mpo") || bn.a(s1))
                    {
                        if (flag)
                        {
                            if (com.roidapp.photogrid.release.rf.a(file))
                            {
                                arraylist.add(file);
                            }
                        } else
                        {
                            arraylist.add(file);
                        }
                    }
                    i++;
                }
            }
        }
        Collections.sort(arraylist, new ky(kt1));
        if (arraylist.size() > 0)
        {
            kt1 = new kz(kt1, (byte)0);
            kt1.b = arraylist.size();
            kt1.a = ((File)arraylist.get(0)).getAbsolutePath();
        } else
        {
            kt1 = null;
        }
        return kt1;
    }

    static String a(String s)
    {
        return b(s);
    }

    static void a(kt kt1, int i)
    {
        kt1.b(i);
    }

    static Handler b(kt kt1)
    {
        return kt1.b;
    }

    private static String b(String s)
    {
        int i = s.lastIndexOf("/");
        if (i < 0)
        {
            return null;
        }
        try
        {
            s = s.substring(0, i);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return "";
        }
        return s;
    }

    private void b(int i)
    {
        Message message = Message.obtain();
        message.what = 19;
        message.arg1 = i;
        b.sendMessage(message);
    }

    static LinkedHashMap c(kt kt1)
    {
        return kt1.d;
    }

    static LinkedHashMap d(kt kt1)
    {
        return kt1.e;
    }

    private void d()
    {
        b.sendEmptyMessage(18);
    }

    static LinkedHashMap e(kt kt1)
    {
        return kt1.c;
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        c.clear();
        d.clear();
        e.clear();
        f.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void f(kt kt1)
    {
        kt1.e();
    }

    static LinkedHashMap g(kt kt1)
    {
        return kt1.f;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        d();
        e();
        com.roidapp.photogrid.common.b.a("ImageSelector/initGallery");
        if (Environment.getExternalStorageState().equals("mounted")) goto _L2; else goto _L1
_L1:
        Toast.makeText(a, 0x7f07028d, 1).show();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d();
        b(30);
        (new Thread(new ku(this))).start();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int i)
    {
        d();
        com.roidapp.photogrid.common.b.a("ImageSelector/initRecent");
        if (!Environment.getExternalStorageState().equals("mounted"))
        {
            Toast.makeText(a, 0x7f07028d, 1).show();
            return;
        } else
        {
            d();
            b(30);
            (new Thread(new kx(this, i))).start();
            return;
        }
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        e();
        d();
        (new Thread(new kv(this))).start();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        e();
        d();
        b(30);
        (new Thread(new kw(this))).start();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
