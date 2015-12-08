// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.roidapp.photogrid.common.az;
import java.io.File;

// Referenced classes of package com.roidapp.photogrid.release:
//            oj, ap, ml, hw, 
//            hx, ih, PhotoGridActivity, ig, 
//            PhotoView, az, ok

public abstract class oi
{

    public final int a = 1;
    public Activity b;
    public ig c[];
    public ml d;
    public String e;
    public int f;
    public PhotoView g;
    public com.roidapp.photogrid.release.az h;
    ok i;
    hx j;
    int k;
    float l;
    protected int m;
    protected String n;
    protected int o;
    protected String p;
    public Handler q;

    public oi()
    {
        j = null;
        k = 0;
        l = 1.0F;
        q = new oj(this);
    }

    public static void a(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        s = new File(s);
        if (s.exists())
        {
            s.delete();
        }
        return;
        s;
        s.printStackTrace();
        return;
    }

    private void h()
    {
        File file = new File(ap.b(b));
        if (file.exists() && file.canWrite() && file.isDirectory())
        {
            File afile[] = file.listFiles();
            if (afile != null)
            {
                int j1 = afile.length;
                for (int i1 = 0; i1 < j1; i1++)
                {
                    File file1 = afile[i1];
                    if (file1 != null && file1.isFile())
                    {
                        file1.delete();
                    }
                }

            }
        }
    }

    public abstract void a();

    public abstract void a(int i1);

    public final void a(Context context, String s)
    {
        if (az.q != 9 && az.q != 10)
        {
            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(new File(s))));
        }
        d.sendEmptyMessage(5);
    }

    public final String b()
    {
        return p;
    }

    public final void b(int i1)
    {
        Message message = Message.obtain();
        message.what = 0;
        message.arg1 = i1;
        q.sendMessage(message);
    }

    public int c()
    {
        return !hw.b(b) ? 2 : 1;
    }

    public final boolean d()
    {
        return b.getSharedPreferences(b.getPackageName(), 0).getBoolean("WATER_MARK", false);
    }

    public final void e()
    {
label0:
        {
            int j1 = 5;
            if (!hw.f(b) || b.getSharedPreferences("DebugMode", 0).getBoolean("DebugMode", false))
            {
                if (j == null)
                {
                    j = new hx(b);
                }
                h();
                j.a();
                boolean flag = hw.a(b);
                int i1;
                if (flag)
                {
                    i1 = 5;
                } else
                {
                    i1 = 0;
                }
                k = i1;
                l = ih.C().t();
                if (flag)
                {
                    i1 = 0;
                    do
                    {
                        if (j1 < 0)
                        {
                            break;
                        }
                        int l1 = j.a(b, 0, j1, false);
                        k = j1;
                        i1 = l1;
                        if (l1 != 0)
                        {
                            break;
                        }
                        j1--;
                        i1 = l1;
                    } while (true);
                } else
                {
                    i1 = 0;
                    int k1 = 0;
                    do
                    {
                        if (k1 > 5)
                        {
                            break;
                        }
                        int i2 = j.a(b, 0, k1, false);
                        k = k1;
                        i1 = i2;
                        if (i2 != 0)
                        {
                            break;
                        }
                        k1++;
                        i1 = i2;
                    } while (true);
                }
                if (i1 == 0)
                {
                    break label0;
                }
                a(i1);
            }
            return;
        }
        f();
    }

    protected final void f()
    {
        k = 6;
        j.b = false;
        ih.C().b(l);
        j.b();
        if (j != null)
        {
            j = null;
        }
        ((PhotoGridActivity)b).p = true;
        d.sendEmptyMessage(2);
        hw.g(b);
        h();
    }

    public void g()
    {
    }
}
