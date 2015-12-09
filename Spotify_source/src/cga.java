// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

public final class cga extends cgg
{

    String a;
    boolean b;
    public int c;
    public int d;
    int e;
    int f;
    int g;
    int h;
    public final Object i = new Object();
    final ckw j;
    public final Activity k;
    AdSizeParcel l;
    ImageView m;
    LinearLayout n;
    cgh o;
    public PopupWindow p;
    RelativeLayout q;
    ViewGroup r;

    public cga(ckw ckw1, cgh cgh1)
    {
        super(ckw1, "resize");
        a = "top-right";
        b = true;
        c = 0;
        d = 0;
        e = -1;
        f = 0;
        g = 0;
        h = -1;
        j = ckw1;
        k = ckw1.e();
        o = cgh1;
    }

    public final void a(int i1, int j1)
    {
        bkv.e();
        int k1 = cjj.c(k)[0];
        int l1 = h;
        int i2 = e;
        try
        {
            JSONObject jsonobject = (new JSONObject()).put("x", i1).put("y", j1 - k1).put("width", l1).put("height", i2);
            super.s.a("onSizeChanged", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            bka.b("Error occured while dispatching size change.", jsonexception);
        }
    }

    public final void a(boolean flag)
    {
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (p == null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        p.dismiss();
        q.removeView(j.b());
        if (r != null)
        {
            r.removeView(m);
            r.addView(j.b());
            j.a(l);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        b("default");
        if (o != null)
        {
            o.A();
        }
        p = null;
        q = null;
        r = null;
        n = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int[] a()
    {
        int ai[];
        int i1;
        int i2;
        bkv.e();
        int ai2[] = cjj.b(k);
        bkv.e();
        ai = cjj.c(k);
        i2 = ai2[0];
        i1 = ai2[1];
        if (h >= 50 && h <= i2) goto _L2; else goto _L1
_L1:
        bka.e("Width is too small or too large.");
        i1 = 0;
_L21:
        if (i1 == 0)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (e < 50 || e > i1)
        {
            bka.e("Height is too small or too large.");
            i1 = 0;
            continue; /* Loop/switch isn't completed */
        }
        if (e == i1 && h == i2)
        {
            bka.e("Cannot resize to a full-screen ad.");
            i1 = 0;
            continue; /* Loop/switch isn't completed */
        }
        if (!b) goto _L4; else goto _L3
_L3:
        String s;
        s = a;
        i1 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 6: default 196
    //                   -1364013995: 330
    //                   -1012429441: 302
    //                   -655373719: 344
    //                   1163912186: 372
    //                   1288627767: 358
    //                   1755462605: 316;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L5:
        i1;
        JVM INSTR tableswitch 0 5: default 236
    //                   0 386
    //                   1 410
    //                   2 444
    //                   3 488
    //                   4 520
    //                   5 562;
           goto _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L12:
        int k1;
        i1 = (c + f + h) - 50;
        k1 = d + g;
_L19:
        if (i1 < 0 || i1 + 50 > i2 || k1 < ai[0] || k1 + 50 > ai[1])
        {
            i1 = 0;
            continue; /* Loop/switch isn't completed */
        }
          goto _L4
_L7:
        if (s.equals("top-left"))
        {
            i1 = 0;
        }
          goto _L5
_L11:
        if (s.equals("top-center"))
        {
            i1 = 1;
        }
          goto _L5
_L6:
        if (s.equals("center"))
        {
            i1 = 2;
        }
          goto _L5
_L8:
        if (s.equals("bottom-left"))
        {
            i1 = 3;
        }
          goto _L5
_L10:
        if (s.equals("bottom-center"))
        {
            i1 = 4;
        }
          goto _L5
_L9:
        if (s.equals("bottom-right"))
        {
            i1 = 5;
        }
          goto _L5
_L13:
        i1 = c + f;
        k1 = d + g;
          goto _L19
_L14:
        i1 = (c + f + h / 2) - 25;
        k1 = d + g;
          goto _L19
_L15:
        i1 = (c + f + h / 2) - 25;
        k1 = (d + g + e / 2) - 25;
          goto _L19
_L16:
        i1 = c + f;
        k1 = (d + g + e) - 50;
          goto _L19
_L17:
        i1 = (c + f + h / 2) - 25;
        k1 = (d + g + e) - 50;
          goto _L19
_L18:
        i1 = (c + f + h) - 50;
        k1 = (d + g + e) - 50;
          goto _L19
_L4:
        i1 = 1;
        if (true) goto _L21; else goto _L20
_L20:
        if (b)
        {
            return (new int[] {
                c + f, d + g
            });
        }
        bkv.e();
        int ai1[] = cjj.b(k);
        bkv.e();
        int ai3[] = cjj.c(k);
        int k2 = ai1[0];
        int l1 = c + f;
        int j2 = d + g;
        int j1;
        if (l1 < 0)
        {
            j1 = 0;
        } else
        {
            j1 = l1;
            if (h + l1 > k2)
            {
                j1 = k2 - h;
            }
        }
        if (j2 < ai3[0])
        {
            l1 = ai3[0];
        } else
        {
            l1 = j2;
            if (e + j2 > ai3[1])
            {
                l1 = ai3[1] - e;
            }
        }
        return (new int[] {
            j1, l1
        });
    }

    public final boolean b()
    {
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (p != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        new HashSet(Arrays.asList(new String[] {
            "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"
        }));
    }

    // Unreferenced inner class cga$1

/* anonymous class */
    final class _cls1
        implements android.view.View.OnClickListener
    {

        private cga a;

        public final void onClick(View view)
        {
            a.a(true);
        }

            
            {
                a = cga.this;
                super();
            }
    }

}
