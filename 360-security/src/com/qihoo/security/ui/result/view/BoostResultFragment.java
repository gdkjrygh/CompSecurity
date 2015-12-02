// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.view;

import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.qihoo.security.booster.a;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.support.b;
import com.qihoo.security.ui.b.e;
import com.qihoo360.common.utils.SharedPref;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.share.c;
import java.text.NumberFormat;
import java.util.Random;

// Referenced classes of package com.qihoo.security.ui.result.view:
//            BaseResultFragment

public class BoostResultFragment extends BaseResultFragment
{

    private static BoostResultFragment A = null;
    private int u;
    private String v;
    private String w;
    private double x;
    private View y;
    private e z;

    public BoostResultFragment()
    {
        x = 0.0D;
    }

    static View a(BoostResultFragment boostresultfragment)
    {
        return boostresultfragment.y;
    }

    static com.qihoo.security.ui.fragment.BaseFragment.a b(BoostResultFragment boostresultfragment)
    {
        return boostresultfragment.h;
    }

    public static BoostResultFragment q()
    {
        com/qihoo/security/ui/result/view/BoostResultFragment;
        JVM INSTR monitorenter ;
        BoostResultFragment boostresultfragment;
        if (A == null)
        {
            A = new BoostResultFragment();
            Bundle bundle = new Bundle();
            A.setArguments(bundle);
        }
        boostresultfragment = A;
        com/qihoo/security/ui/result/view/BoostResultFragment;
        JVM INSTR monitorexit ;
        return boostresultfragment;
        Exception exception;
        exception;
        throw exception;
    }

    private void r()
    {
        z.a(0).b();
    }

    private void s()
    {
        double d3 = Utils.str2Double(v, 0.0D);
        if (x >= d3) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = NumberFormat.getInstance();
        ((NumberFormat) (obj)).setMaximumFractionDigits(1);
        if (d3 > 2D) goto _L4; else goto _L3
_L3:
        x = x + 0.10000000000000001D;
        ((NumberFormat) (obj)).setMinimumFractionDigits(1);
_L13:
        if (x > d3)
        {
            x = d3;
        }
        obj = ((NumberFormat) (obj)).format(x);
        if (u != 0) goto _L6; else goto _L5
_L5:
        o.setLocalText(f.a(0x7f0c0034, new Object[] {
            obj, com.qihoo.security.booster.a.a(Build.BRAND)
        }));
_L7:
        obj = new Message();
        obj.what = 100;
        h.sendMessageDelayed(((Message) (obj)), 50L);
        return;
_L4:
        if (d3 > 2D && d3 <= 10D)
        {
            x = x + 1.0D;
        } else
        if (d3 > 10D)
        {
            int i = (new Random()).nextInt(8);
            double d4 = x;
            double d1;
            if (i > 3)
            {
                d1 = i;
            } else
            {
                d1 = 3D;
            }
            x = d1 + d4;
        } else
        if (d3 > 60D)
        {
            int j = (new Random()).nextInt(18);
            double d5 = x;
            double d2;
            if (j > 6)
            {
                d2 = j;
            } else
            {
                d2 = 6D;
            }
            x = d2 + d5;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (u == 1)
        {
            o.setLocalText(f.a(0x7f0c0018, new Object[] {
                (new StringBuilder()).append(((String) (obj))).append(w).toString()
            }));
        }
        if (true) goto _L7; else goto _L2
_L2:
        if (u != 0) goto _L9; else goto _L8
_L8:
        o.setLocalText(f.a(0x7f0c0034, new Object[] {
            v, com.qihoo.security.booster.a.a(Build.BRAND)
        }));
_L11:
        if (h.hasMessages(100))
        {
            h.removeMessages(100);
        }
        x = 0.0D;
        return;
_L9:
        if (u == 1)
        {
            o.setLocalText(f.a(0x7f0c0018, new Object[] {
                (new StringBuilder()).append(v).append(w).toString()
            }));
        }
        if (true) goto _L11; else goto _L10
_L10:
        if (true) goto _L13; else goto _L12
_L12:
    }

    public void a(int i, String s1, String s2)
    {
        u = i;
        if (u == 1)
        {
            v = s1;
            w = s2;
        } else
        if (u == 0)
        {
            v = s1;
            return;
        }
    }

    protected void a(Message message)
    {
        super.a(message);
        switch (message.what)
        {
        default:
            return;

        case 100: // 'd'
            s();
            break;
        }
    }

    public void a(com.qihoo.security.ui.result.card.a a1)
    {
        super.a(a1);
        if (a1 == null)
        {
            return;
        }
        switch (l())
        {
        default:
            return;

        case 0: // '\0'
            switch (a1.a)
            {
            default:
                return;

            case 4: // '\004'
                com.qihoo.security.support.b.b(11304);
                break;
            }
            break;
        }
    }

    protected void d()
    {
        int i = SharedPref.getInt(d, "this_speed_of_boost", 0);
        if (c.a(d, i, 0L, 0))
        {
            String s1 = String.format(f.a(0x7f0c00c9), new Object[] {
                Integer.valueOf(i)
            });
            android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
            if (fragmentactivity != null)
            {
                c.a(fragmentactivity, s1, 0);
            }
            SharedPref.setInt(d, "this_speed_of_boost", 0);
        }
    }

    protected int l()
    {
        return 0;
    }

    protected void m()
    {
        n.setLocalText(0x7f0c002e);
    }

    protected void n()
    {
        r();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (u == 1)
        {
            o.setLocalText(f.a(0x7f0c0018, new Object[] {
                (new StringBuilder()).append("0").append(w).toString()
            }));
        } else
        if (u == 0)
        {
            o.setLocalText(f.a(0x7f0c0034, new Object[] {
                "0", com.qihoo.security.booster.a.a(Build.BRAND)
            }));
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        z = e.a(d);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        y = super.onCreateView(layoutinflater, viewgroup, bundle);
        return y;
    }

    public void onResume()
    {
        super.onResume();
    }

    public void onStop()
    {
        super.onStop();
        r();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        y.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final BoostResultFragment a;

            public void onGlobalLayout()
            {
                com.qihoo.security.ui.result.view.BoostResultFragment.a(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
                com.qihoo.security.ui.result.view.BoostResultFragment.b(a).sendEmptyMessage(100);
                a.o();
            }

            
            {
                a = BoostResultFragment.this;
                super();
            }
        });
    }

}
