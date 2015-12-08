// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.roidapp.photogrid.common.az;

// Referenced classes of package com.roidapp.photogrid.release:
//            hw, hy, hz

public final class hx
{

    public AlertDialog a;
    public boolean b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private Activity i;

    public hx(Activity activity)
    {
        b = false;
        i = activity;
    }

    public static int a(int j, int k)
    {
        switch (k)
        {
        default:
            return 0x11cc40;

        case 0: // '\0'
            return j * j;

        case 1: // '\001'
            return (int)((float)j * 1.333333F * (float)j);

        case 2: // '\002'
            return (int)((float)j * 1.4F * (float)j);

        case 3: // '\003'
            return (int)((float)j * 1.5F * (float)j);

        case 4: // '\004'
            return (int)((float)j * 1.666667F * (float)j);

        case 5: // '\005'
            return (int)((float)j * 1.777778F * (float)j);
        }
    }

    private void a(int j)
    {
        switch (j)
        {
        default:
            return;

        case 1080: 
            e.setTextColor(0xff01aa51);
            f.setTextColor(0xffd84123);
            g.setTextColor(0xffd84123);
            h.setTextColor(0xffd84123);
            return;

        case 1660: 
            e.setTextColor(-1);
            f.setTextColor(0xff01aa51);
            g.setTextColor(0xffd84123);
            h.setTextColor(0xffd84123);
            return;

        case 1920: 
            e.setTextColor(-1);
            f.setTextColor(-1);
            g.setTextColor(0xff01aa51);
            h.setTextColor(0xffd84123);
            return;

        case 2048: 
            e.setTextColor(-1);
            break;
        }
        f.setTextColor(-1);
        g.setTextColor(-1);
        h.setTextColor(0xff01aa51);
    }

    private static boolean b(Context context, int j, int k, boolean flag)
    {
        switch (j)
        {
        default:
            return false;

        case 1080: 
            switch (k)
            {
            default:
                return false;

            case 0: // '\0'
                if (flag)
                {
                    return hw.aB(context);
                } else
                {
                    return hw.F(context);
                }

            case 1: // '\001'
                if (flag)
                {
                    return hw.ad(context);
                } else
                {
                    return hw.h(context);
                }

            case 2: // '\002'
                if (flag)
                {
                    return hw.al(context);
                } else
                {
                    return hw.p(context);
                }

            case 3: // '\003'
                if (flag)
                {
                    return hw.at(context);
                } else
                {
                    return hw.x(context);
                }

            case 4: // '\004'
                if (flag)
                {
                    return hw.aJ(context);
                } else
                {
                    return hw.N(context);
                }

            case 5: // '\005'
                break;
            }
            if (flag)
            {
                return hw.aR(context);
            } else
            {
                return hw.V(context);
            }

        case 1660: 
            switch (k)
            {
            default:
                return false;

            case 0: // '\0'
                if (flag)
                {
                    return hw.aD(context);
                } else
                {
                    return hw.H(context);
                }

            case 1: // '\001'
                if (flag)
                {
                    return hw.af(context);
                } else
                {
                    return hw.j(context);
                }

            case 2: // '\002'
                if (flag)
                {
                    return hw.an(context);
                } else
                {
                    return hw.r(context);
                }

            case 3: // '\003'
                if (flag)
                {
                    return hw.av(context);
                } else
                {
                    return hw.z(context);
                }

            case 4: // '\004'
                if (flag)
                {
                    return hw.aL(context);
                } else
                {
                    return hw.P(context);
                }

            case 5: // '\005'
                break;
            }
            if (flag)
            {
                return hw.aT(context);
            } else
            {
                return hw.X(context);
            }

        case 1920: 
            switch (k)
            {
            default:
                return false;

            case 0: // '\0'
                if (flag)
                {
                    return hw.aF(context);
                } else
                {
                    return hw.J(context);
                }

            case 1: // '\001'
                if (flag)
                {
                    return hw.ah(context);
                } else
                {
                    return hw.l(context);
                }

            case 2: // '\002'
                if (flag)
                {
                    return hw.ap(context);
                } else
                {
                    return hw.t(context);
                }

            case 3: // '\003'
                if (flag)
                {
                    return hw.ax(context);
                } else
                {
                    return hw.B(context);
                }

            case 4: // '\004'
                if (flag)
                {
                    return hw.aN(context);
                } else
                {
                    return hw.R(context);
                }

            case 5: // '\005'
                break;
            }
            if (flag)
            {
                return hw.aV(context);
            } else
            {
                return hw.Z(context);
            }

        case 2048: 
            switch (k)
            {
            default:
                return false;

            case 0: // '\0'
                if (flag)
                {
                    return hw.aH(context);
                } else
                {
                    return hw.L(context);
                }

            case 1: // '\001'
                if (flag)
                {
                    return hw.aj(context);
                } else
                {
                    return hw.n(context);
                }

            case 2: // '\002'
                if (flag)
                {
                    return hw.ar(context);
                } else
                {
                    return hw.v(context);
                }

            case 3: // '\003'
                if (flag)
                {
                    return com.roidapp.photogrid.release.hw.az(context);
                } else
                {
                    return hw.D(context);
                }

            case 4: // '\004'
                if (flag)
                {
                    return hw.aP(context);
                } else
                {
                    return hw.T(context);
                }

            case 5: // '\005'
                break;
            }
            break;
        }
        if (flag)
        {
            return hw.aX(context);
        } else
        {
            return hw.ab(context);
        }
    }

    public final int a(Context context, int j, int k, boolean flag)
    {
        boolean flag1;
        if (az.q == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag)
        {
            if (j == 2048)
            {
                if (b(context, 2048, k, flag1))
                {
                    return 0;
                }
                if (b(context, 1920, k, flag1))
                {
                    return 0;
                } else
                {
                    a(1920);
                    return 1920;
                }
            }
            if (j == 1920)
            {
                if (b(context, 1920, k, flag1))
                {
                    return 0;
                }
                if (b(context, 1660, k, flag1))
                {
                    return 0;
                } else
                {
                    a(1660);
                    return 1660;
                }
            }
            if (j == 1660)
            {
                if (b(context, 1660, k, flag1))
                {
                    return 0;
                }
                if (b(context, 1080, k, flag1))
                {
                    return 0;
                } else
                {
                    a(1080);
                    return 1080;
                }
            }
            if (j == 1080)
            {
                if (!b(context, 1080, k, flag1))
                {
                    a(1080);
                }
                return 0;
            } else
            {
                return 0;
            }
        }
        if (flag1)
        {
            j = hw.bb(context);
        } else
        {
            j = hw.aZ(context);
        }
        if (a(2048, k) >= j)
        {
            a(2048);
            return 2048;
        }
        if (a(1920, k) >= j)
        {
            a(1920);
            return 1920;
        }
        if (a(1660, k) >= j)
        {
            a(1660);
            return 1660;
        }
        if (a(1080, k) >= j)
        {
            a(1080);
            return 1080;
        } else
        {
            return 0;
        }
    }

    public final void a()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(i);
        Object obj = LayoutInflater.from(i).inflate(0x7f03011f, null);
        builder.setView(((View) (obj)));
        builder.create();
        builder.setCancelable(false);
        obj = (Button)((View) (obj)).findViewById(0x7f0d026a);
        ((Button) (obj)).setOnClickListener(new hy(this, ((Button) (obj))));
        a = builder.show();
        a.setCanceledOnTouchOutside(false);
        a.setOnKeyListener(new hz(this, ((Button) (obj))));
        d = (TextView)a.findViewById(0x7f0d049e);
        c = (TextView)a.findViewById(0x7f0d049f);
        e = (TextView)a.findViewById(0x7f0d049c);
        f = (TextView)a.findViewById(0x7f0d049b);
        g = (TextView)a.findViewById(0x7f0d049a);
        h = (TextView)a.findViewById(0x7f0d0499);
        if (az.q != 1)
        {
            hw.c(i, 0x71c71c);
            return;
        } else
        {
            hw.e(i, 0x71c71c);
            return;
        }
    }

    public final void a(int j, int k, int l)
    {
        k;
        JVM INSTR lookupswitch 4: default 44
    //                   1080: 125
    //                   1660: 137
    //                   1920: 149
    //                   2048: 161;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_161;
_L6:
        String s = (new StringBuilder()).append(k).append("P  ").append(j).append("% ").toString();
        c.setText(s);
        switch (l)
        {
        default:
            return;

        case 0: // '\0'
            d.setText(" 1:1 ");
            return;

        case 1: // '\001'
            d.setText(" 3:4 ");
            return;

        case 2: // '\002'
            d.setText(" 5:7 ");
            return;

        case 3: // '\003'
            d.setText(" 2:3 ");
            return;

        case 4: // '\004'
            d.setText(" 3:5 ");
            return;

        case 5: // '\005'
            d.setText("9:16 ");
            break;
        }
        break MISSING_BLOCK_LABEL_238;
_L2:
        e.setTextColor(0xff01aa51);
          goto _L6
_L3:
        f.setTextColor(0xff01aa51);
          goto _L6
_L4:
        g.setTextColor(0xff01aa51);
          goto _L6
        h.setTextColor(0xff01aa51);
          goto _L6
    }

    public final void a(Context context, int j, int k)
    {
label0:
        {
            int l;
            boolean flag;
            if (az.q == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                l = hw.bb(context);
            } else
            {
                l = hw.aZ(context);
            }
            k = a(j, k);
            j = l;
            if (k > l)
            {
                if (flag)
                {
                    hw.d(context, k);
                    j = k;
                } else
                {
                    hw.b(context, k);
                    j = k;
                }
            }
            if (j >= a(2048, 5))
            {
                if (flag)
                {
                    hw.aY(i);
                } else
                {
                    hw.ac(i);
                }
            }
            if (j >= a(2048, 4))
            {
                if (flag)
                {
                    hw.aQ(i);
                } else
                {
                    hw.U(i);
                }
            }
            if (j >= a(2048, 3))
            {
                if (flag)
                {
                    hw.aA(i);
                } else
                {
                    hw.E(i);
                }
            }
            if (j >= a(2048, 2))
            {
                if (flag)
                {
                    hw.as(i);
                } else
                {
                    hw.w(i);
                }
            }
            if (j >= a(2048, 1))
            {
                if (flag)
                {
                    hw.ak(i);
                } else
                {
                    hw.o(i);
                }
            }
            if (j >= a(2048, 0))
            {
                if (flag)
                {
                    hw.aI(i);
                } else
                {
                    hw.M(i);
                }
            }
            if (j >= a(1920, 5))
            {
                if (flag)
                {
                    hw.aW(i);
                } else
                {
                    hw.aa(i);
                }
            }
            if (j >= a(1920, 4))
            {
                if (flag)
                {
                    hw.aO(i);
                } else
                {
                    hw.S(i);
                }
            }
            if (j >= a(1920, 3))
            {
                if (flag)
                {
                    hw.ay(i);
                } else
                {
                    hw.C(i);
                }
            }
            if (j >= a(1920, 2))
            {
                if (flag)
                {
                    hw.aq(i);
                } else
                {
                    hw.u(i);
                }
            }
            if (j >= a(1920, 1))
            {
                if (flag)
                {
                    hw.ai(i);
                } else
                {
                    hw.m(i);
                }
            }
            if (j >= a(1920, 0))
            {
                if (flag)
                {
                    hw.aG(i);
                } else
                {
                    hw.K(i);
                }
            }
            if (j >= a(1660, 5))
            {
                if (flag)
                {
                    hw.aU(i);
                } else
                {
                    hw.Y(i);
                }
            }
            if (j >= a(1660, 4))
            {
                if (flag)
                {
                    hw.aM(i);
                } else
                {
                    hw.Q(i);
                }
            }
            if (j >= a(1660, 3))
            {
                if (flag)
                {
                    hw.aw(i);
                } else
                {
                    hw.A(i);
                }
            }
            if (j >= a(1660, 2))
            {
                if (flag)
                {
                    hw.ao(i);
                } else
                {
                    hw.s(i);
                }
            }
            if (j >= a(1660, 1))
            {
                if (flag)
                {
                    hw.ag(i);
                } else
                {
                    hw.k(i);
                }
            }
            if (j >= a(1660, 0))
            {
                if (flag)
                {
                    hw.aE(i);
                } else
                {
                    hw.I(i);
                }
            }
            if (j >= a(1080, 5))
            {
                if (flag)
                {
                    hw.aS(i);
                } else
                {
                    hw.W(i);
                }
            }
            if (j >= a(1080, 4))
            {
                if (flag)
                {
                    hw.aK(i);
                } else
                {
                    hw.O(i);
                }
            }
            if (j >= a(1080, 3))
            {
                if (flag)
                {
                    hw.au(i);
                } else
                {
                    hw.y(i);
                }
            }
            if (j >= a(1080, 2))
            {
                if (flag)
                {
                    hw.am(i);
                } else
                {
                    hw.q(i);
                }
            }
            if (j >= a(1080, 1))
            {
                if (flag)
                {
                    hw.ae(i);
                } else
                {
                    hw.i(i);
                }
            }
            if (j >= a(1080, 0))
            {
                if (!flag)
                {
                    break label0;
                }
                hw.aC(i);
            }
            return;
        }
        hw.G(i);
    }

    public final void b()
    {
        if (i != null && !i.isFinishing() && a != null && a.isShowing())
        {
            a.dismiss();
            a = null;
        }
    }
}
