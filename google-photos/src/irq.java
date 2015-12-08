// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.photos.list.PhotoTileView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class irq
    implements Adapter
{

    private static final int a[] = {
        3, 2, 1
    };
    private static final oni k = new oni("debug.stories.color_unknown_els");
    private static final Set l;
    final DataSetObservable b;
    final Context c;
    public final isx d;
    public pev e;
    public int f;
    int g;
    isa h;
    public ipb i;
    Map j;
    private final int m;
    private final android.view.View.OnClickListener n;
    private final iry o;
    private final olm p;
    private final ioz q;
    private iui r;
    private int s;

    public irq(Context context, int i1, android.view.View.OnClickListener onclicklistener, iry iry1)
    {
        this(context, i1, onclicklistener, iry1, false);
    }

    private irq(Context context, int i1, android.view.View.OnClickListener onclicklistener, iry iry1, boolean flag)
    {
        b = new DataSetObservable();
        d = new isx(12);
        f = -1;
        g = 1;
        c = context;
        m = i1;
        n = new msj(onclicklistener);
        o = iry1;
        j = new HashMap();
        s = c.getResources().getColor(af.S);
        p = olm.b(context);
        q = (ioz)p.a(ioz);
    }

    public static int a(pfp pfp1)
    {
        pfp1 = b(pfp1);
        if (pfp1 == null)
        {
            return 10;
        }
        switch (pfp1.a)
        {
        default:
            int i1 = pfp1.a;
            Log.w("StoryLayoutAdapter", (new StringBuilder(43)).append("Unrecognized LayoutElementType: ").append(i1).toString());
            return 10;

        case 1: // '\001'
            return 0;

        case 2: // '\002'
            switch (pfp1.c.a)
            {
            case 6: // '\006'
            case 7: // '\007'
            case 15: // '\017'
            default:
                int j1 = pfp1.c.a;
                Log.w("StoryLayoutAdapter", (new StringBuilder(43)).append("Unrecognized LayoutContentType: ").append(j1).toString());
                return 10;

            case 3: // '\003'
            case 4: // '\004'
                return 1;

            case 10: // '\n'
                return 3;

            case 5: // '\005'
                return 9;

            case 1: // '\001'
            case 12: // '\f'
                return 2;

            case 9: // '\t'
                return 4;

            case 17: // '\021'
                return 11;

            case 2: // '\002'
            case 8: // '\b'
                switch (pfp1.c.c.a)
                {
                default:
                    int k1 = pfp1.c.c.a;
                    Log.w("StoryLayoutAdapter", (new StringBuilder(43)).append("Unrecognized ImageResourceType: ").append(k1).toString());
                    return 10;

                case 1: // '\001'
                    if (e(pfp1) == 0)
                    {
                        pfp1 = String.valueOf(pfp1.c.c);
                        Log.w("StoryLayoutAdapter", (new StringBuilder(String.valueOf(pfp1).length() + 29)).append("Unrecognized image resource: ").append(pfp1).toString());
                        return 10;
                    } else
                    {
                        return 5;
                    }

                case 2: // '\002'
                    return 2;
                }

            case 11: // '\013'
                return 6;

            case 13: // '\r'
            case 16: // '\020'
                return 7;

            case 14: // '\016'
                return 8;
            }
        }
    }

    static ipb a(irq irq1)
    {
        return irq1.i;
    }

    private static String a(pev pev1, pfp pfp1)
    {
        if (pfp1.c == null)
        {
            return null;
        }
        switch (pfp1.c.a)
        {
        default:
            int i1 = pfp1.c.a;
            Log.w("StoryLayoutAdapter", (new StringBuilder(38)).append("Unrecognized content type: ").append(i1).toString());
            return null;

        case 4: // '\004'
        case 14: // '\016'
            return pfp1.c.d;

        case 3: // '\003'
            switch (pfp1.c.b.f)
            {
            default:
                return (String)ite.b(pev1, pfp1.c.b, java/lang/String);

            case 11: // '\013'
                return ite.a((peq)ite.a(pev1, pfp1.c.b, peq));
            }
        }
    }

    private static njr a(Context context, qgg qgg1, iui iui1)
    {
        return njr.a(context, ite.a(qgg1, iui1), ite.a(qgg1));
    }

    private void a(pfp pfp1, isb isb1, View view)
    {
        isb isb3;
        Object obj;
        boolean flag2;
        obj = null;
        flag2 = true;
        if (pfp1.h != null)
        {
            isb isb2 = isb1.e;
            isb1 = null;
            do
            {
                isb3 = isb1;
                if (isb2 == null)
                {
                    break;
                }
                isb3 = isb1;
                if (isb1 != null)
                {
                    break;
                }
                boolean flag;
                if (isb2.a.h != null && isb2.a.h.b != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    isb1 = isb2.a.h.b;
                } else
                {
                    isb2 = isb2.e;
                }
            } while (true);
        } else
        {
            isb3 = null;
        }
        if (pfp1 == null || pfp1.h == null || pfp1.h.b == null || !c()) goto _L2; else goto _L1
_L1:
        if (pfp1.h.b.a != null)
        {
            pfp1 = pfp1.h.b.a;
        } else
        {
            pfp1 = pfp1.c.b;
        }
_L17:
        if (pfp1 != null) goto _L4; else goto _L3
_L3:
        return;
_L2:
        if (isb3 == null) goto _L6; else goto _L5
_L5:
        if (((pfs) (isb3)).a == null) goto _L8; else goto _L7
_L7:
        isb1 = ((pfs) (isb3)).a;
_L9:
        pfp1 = isb1;
        continue; /* Loop/switch isn't completed */
_L8:
        isb1 = obj;
        if (pfp1.c != null)
        {
            isb1 = obj;
            if (pfp1.c.b != null)
            {
                isb1 = pfp1.c.b;
            }
        }
        if (true) goto _L9; else goto _L4
_L4:
        ((pex) (pfp1)).a;
        JVM INSTR tableswitch 3 4: default 256
    //                   3 257
    //                   4 450;
           goto _L10 _L11 _L12
_L12:
        continue; /* Loop/switch isn't completed */
_L10:
        return;
_L11:
        isb1 = (peq)ite.a(e, pfp1, peq);
        if (isb1 == null) goto _L3; else goto _L13
_L13:
        if (((peq) (isb1)).b == 1)
        {
            view.setTag(s.bL, pfp1);
            view.setTag(s.bQ, ((peq) (isb1)).d.b.a);
            view.setTag(s.bG, Boolean.valueOf(true));
            pfp1 = ite.a(isb1);
            int i1 = s.bH;
            boolean flag1;
            if (!TextUtils.isEmpty(pfp1))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            view.setTag(i1, Boolean.valueOf(flag1));
            view.setTag(s.bF, pfp1);
            i1 = s.bI;
            if (((peq) (isb1)).d.d.a != 2)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            view.setTag(i1, Boolean.valueOf(flag1));
            return;
        }
        if (((peq) (isb1)).b != 2 || !ite.b(isb1)) goto _L3; else goto _L14
_L14:
        o.b(view);
        view.setTag(s.bJ, Boolean.valueOf(true));
        view.setTag(s.bL, pfp1);
        return;
        if (!ite.a((peh)ite.a(e, pfp1, peh))) goto _L3; else goto _L15
_L15:
        o.b(view);
        view.setTag(s.bJ, Boolean.valueOf(true));
        view.setTag(s.bL, pfp1);
        return;
_L6:
        pfp1 = null;
        if (true) goto _L17; else goto _L16
_L16:
    }

    static int b(irq irq1)
    {
        return irq1.s;
    }

    private static pfp b(pfp pfp1)
    {
_L4:
        if (pfp1 != null && pfp1.i != null && pfp1.i.length != 0) goto _L2; else goto _L1
_L1:
        return pfp1;
_L2:
        int ai[];
        int i1;
        int j1;
        ai = pfp1.i;
        j1 = ai.length;
        i1 = 0;
_L5:
        if (i1 >= j1) goto _L1; else goto _L3
_L3:
label0:
        {
            int k1 = ai[i1];
            if (l.contains(Integer.valueOf(k1)))
            {
                break label0;
            }
            pfp1 = pfp1.j;
        }
          goto _L4
        i1++;
          goto _L5
    }

    private int c(int i1)
    {
        int j1 = 3;
        int k1 = 0x7fffffff;
        int ai[] = a;
        int l2 = ai.length;
        int l1 = 0;
        while (l1 < l2) 
        {
            int k2 = ai[l1];
            int i2 = b.c(c, k2) - i1;
            if (i2 > 0 && i2 < k1)
            {
                k1 = k2;
                j1 = i2;
            } else
            {
                int j2 = j1;
                j1 = k1;
                k1 = j2;
            }
            i2 = l1 + 1;
            l1 = k1;
            k1 = j1;
            j1 = l1;
            l1 = i2;
        }
        return j1;
    }

    private static int c(pfp pfp1)
    {
        switch (pfp1.a)
        {
        case 2: // '\002'
            switch (pfp1.c.a)
            {
            case 3: // '\003'
                pfp1 = pfp1.c.b;
                if (((pex) (pfp1)).a == 5 && ((pex) (pfp1)).f == 2)
                {
                    return s.bB;
                }
                if (((pex) (pfp1)).f == 11)
                {
                    return s.bm;
                }
                break;

            case 5: // '\005'
                return s.bl;
            }
            break;
        }
        while (true) 
        {
            return -1;
        }
    }

    private boolean c()
    {
        return b.a(e.i, false);
    }

    private boolean d(pfp pfp1)
    {
        if (!c())
        {
            return false;
        }
        switch (pfp1.c.a)
        {
        default:
            return false;

        case 3: // '\003'
            switch (pfp1.c.b.f)
            {
            default:
                return false;

            case 2: // '\002'
            case 11: // '\013'
                return true;
            }

        case 14: // '\016'
            return true;
        }
    }

    private static int e(pfp pfp1)
    {
        if (pfp1.c == null || pfp1.c.c == null)
        {
            return 0;
        }
        switch (pfp1.c.c.b)
        {
        default:
            return 0;

        case 1: // '\001'
            return b.Av;

        case 4: // '\004'
            return b.Au;

        case 2: // '\002'
            return b.At;

        case 3: // '\003'
            return b.Ay;
        }
    }

    public final int a(List list)
    {
        if (e != null && f != -1)
        {
            pfp apfp[] = e.h[f].c;
            for (int i1 = apfp.length - 1; i1 >= 0; i1--)
            {
                pfp pfp1 = apfp[i1];
                if (pfp1.f != null && list.contains(new irx(pfp1.f)))
                {
                    return i1;
                }
            }

        }
        return -1;
    }

    public final View a(pfp pfp1, View view, ViewGroup viewgroup)
    {
        pfp pfp2;
        isb isb1;
        if (view != null)
        {
            view.setContentDescription(null);
            o.c(view);
            view.setLongClickable(false);
            view.setTag(s.bG, null);
            view.setTag(s.bH, null);
            view.setTag(s.bI, null);
            view.setTag(s.bJ, null);
            view.setTag(s.bP, null);
        }
        pfp2 = b(pfp1);
        if (viewgroup != null)
        {
            pfp1 = isb.a(viewgroup);
        } else
        {
            pfp1 = null;
        }
        isb1 = a(pfp2, ((isb) (pfp1)));
        a(pfp2);
        JVM INSTR tableswitch 0 11: default 156
    //                   0 172
    //                   1 1569
    //                   2 2418
    //                   3 3171
    //                   4 3533
    //                   5 3616
    //                   6 3661
    //                   7 890
    //                   8 1203
    //                   9 2004
    //                   10 3877
    //                   11 3478;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
        Log.w("StoryLayoutAdapter", "Cannot create view for unrecognised layout element type.");
        return null;
_L2:
        int l1;
        boolean flag;
        if (view != null)
        {
            pfp1 = (isw)view;
        } else
        {
            pfp1 = new isw(c);
        }
        pfp1.b = this;
        pfp1.c = a();
        pfp1.setTag(s.bz, isb1);
        pfp1.a = pfp2;
        viewgroup = isb.a(pfp1);
        l1 = ite.f(((isb) (viewgroup)).a);
        flag = viewgroup.o();
        if (viewgroup.s())
        {
            pfp1.i = viewgroup.t();
            if (((isw) (pfp1)).i == 1 && viewgroup.u())
            {
                pfp1.h = true;
                ((isw) (pfp1)).e.setColor(viewgroup.v());
                ((isw) (pfp1)).e.setStrokeWidth(viewgroup.w());
                ((isw) (pfp1)).e.setStyle(android.graphics.Paint.Style.STROKE);
            }
        }
        if (flag)
        {
            iou iou1 = (iou)olm.a(pfp1.getContext(), iou);
            int j2 = viewgroup.p();
            int i1;
            if (viewgroup.o())
            {
                i1 = b.a(((isb) (viewgroup)).a.b.r.a);
            } else
            {
                i1 = 0;
            }
            if (j2 <= 0)
            {
                throw new IllegalArgumentException((new StringBuilder(42)).append("Cannot create shadow with size ").append(j2).toString());
            }
            long l3 = (long)j2 << 32 | (long)i1;
            int l2;
            if (iou1.a.containsKey(Long.valueOf(l3)))
            {
                view = (Drawable)iou1.a.get(Long.valueOf(l3));
            } else
            {
                view = iou1.a(j2, i1);
                if (j2 < 100)
                {
                    iou1.a.put(Long.valueOf(l3), view);
                } else
                {
                    Log.w("ShadowManager", "Not caching shadow, too large.");
                }
            }
            pfp1.f = view;
        }
        if (((isw) (pfp1)).i == 1 || flag)
        {
            pfp1.setBackgroundColor(0);
            ((isw) (pfp1)).d.setColor(l1);
            pfp1.g = true;
        } else
        {
            pfp1.setBackgroundColor(l1);
            pfp1.g = false;
        }
        if (viewgroup.x())
        {
            pfp1.j = viewgroup.y();
            ((isw) (pfp1)).k.setColor(((isw) (pfp1)).j.b);
            ((isw) (pfp1)).k.setStrokeWidth(((isw) (pfp1)).j.a);
            ((isw) (pfp1)).k.setStyle(android.graphics.Paint.Style.STROKE);
        }
        j2 = 0;
        l1 = 0;
        view = pfp2.d;
        l2 = view.length;
        for (i1 = 0; i1 < l2; i1++)
        {
            viewgroup = view[i1];
            viewgroup = ((isw) (pfp1)).b.a(((pfp) (viewgroup)), ((isw) (pfp1)).c.a(a(((pfp) (viewgroup)))), ((ViewGroup) (pfp1)));
            ((isw) (pfp1)).l.put(j2, l1);
            pfp1.addView(viewgroup);
            j2++;
            l1++;
        }

_L16:
        if (android.os.Build.VERSION.SDK_INT > 10)
        {
            float f1;
            Object obj;
            njr njr1;
            int j1;
            int i2;
            int k2;
            long l4;
            boolean flag1;
            if (isb1.a.b != null && isb1.a.b.C != null)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (j1 != 0)
            {
                f1 = isb1.a.b.C.floatValue();
            } else
            {
                f1 = 1.0F;
            }
            pfp1.setAlpha(f1);
            j1 = s.bZ;
            if (f1 == 0.0F)
            {
                view = Boolean.valueOf(true);
            } else
            {
                view = null;
            }
            pfp1.setTag(j1, view);
        }
        view = isb1.d;
        if (view == null || !j.containsKey(view)) goto _L15; else goto _L14
_L14:
        for (obj = ((List)j.get(view)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            view = (irw)((Iterator) (obj)).next();
            viewgroup = h;
            l4 = ((irw) (view)).a;
            iph iph1 = (iph)((isa) (viewgroup)).f.get(Long.valueOf(l4));
            if (iph1 == null)
            {
                Log.w("StoryLayoutAdapter", "Couldn't find animation params for animation");
            } else
            {
                int k1 = isb1.j();
                switch (((irw) (view)).d)
                {
                default:
                    k1 = ((irw) (view)).d;
                    Log.w("StoryLayoutAdapter", (new StringBuilder(32)).append("Unknown TriggerType: ").append(k1).toString());
                    break;

                case 1: // '\001'
                    ipb ipb1 = i;
                    long l5 = ((irw) (view)).c;
                    l5 = ((irw) (view)).b + l5;
                    k1 = ((Integer)((irw) (view)).e).intValue();
                    if (!ipb1.d.contains(Integer.valueOf(k1)))
                    {
                        if (!ipb1.a.containsKey(Integer.valueOf(k1)))
                        {
                            ipb1.a.put(Integer.valueOf(k1), new ArrayList());
                        }
                        List list = (List)ipb1.a.get(Integer.valueOf(k1));
                        double d1;
                        double d2;
                        ioz ioz1;
                        boolean flag2;
                        boolean flag3;
                        if (iph1 instanceof ipt)
                        {
                            viewgroup = ObjectAnimator.ofFloat(pfp1, "verticalFold", new float[] {
                                0.0F, 1.0F
                            });
                            viewgroup.setDuration(iph1.c);
                            viewgroup.setStartDelay(l5);
                            viewgroup.setInterpolator(iph1.d);
                            list.add(viewgroup);
                            view = viewgroup;
                            if (iph1.e)
                            {
                                view = viewgroup;
                                if (pfp1 instanceof isr)
                                {
                                    ((isr)pfp1).setVerticalFold(0.0F);
                                    view = viewgroup;
                                }
                            }
                        } else
                        if (iph1 instanceof ipg)
                        {
                            viewgroup = (ipg)iph1;
                            view = ObjectAnimator.ofFloat(pfp1, "alpha", new float[] {
                                ((ipg) (viewgroup)).a, ((ipg) (viewgroup)).b
                            });
                            view.setDuration(iph1.c);
                            view.setStartDelay(l5);
                            view.setInterpolator(iph1.d);
                            list.add(view);
                            if (iph1.e)
                            {
                                pfp1.setAlpha(((ipg) (viewgroup)).a);
                            }
                        } else
                        if (iph1 instanceof ips)
                        {
                            viewgroup = (ips)iph1;
                            view = ObjectAnimator.ofFloat(pfp1, "translationX", new float[] {
                                (float)((ips) (viewgroup)).a, (float)((ips) (viewgroup)).f
                            });
                            view.setDuration(iph1.c);
                            view.setStartDelay(l5);
                            view.setInterpolator(iph1.d);
                            list.add(view);
                            view = (ips)iph1;
                            view = ObjectAnimator.ofFloat(pfp1, "translationY", new float[] {
                                (float)((ips) (view)).b, (float)((ips) (view)).g
                            });
                            view.setDuration(iph1.c);
                            view.setStartDelay(l5);
                            view.setInterpolator(iph1.d);
                            list.add(view);
                            if (iph1.e)
                            {
                                pfp1.setTranslationX(((ips) (viewgroup)).a);
                                pfp1.setTranslationY(((ips) (viewgroup)).b);
                            }
                        } else
                        if (iph1 instanceof ipm)
                        {
                            viewgroup = (ipm)iph1;
                            view = ObjectAnimator.ofFloat(pfp1, "scaleX", new float[] {
                                ((ipm) (viewgroup)).a, ((ipm) (viewgroup)).b
                            });
                            view.setDuration(iph1.c);
                            view.setStartDelay(l5);
                            view.setInterpolator(iph1.d);
                            list.add(view);
                            view = ObjectAnimator.ofFloat(pfp1, "scaleY", new float[] {
                                ((ipm) (viewgroup)).f, ((ipm) (viewgroup)).g
                            });
                            view.setDuration(iph1.c);
                            view.setStartDelay(l5);
                            view.setInterpolator(iph1.d);
                            list.add(view);
                            if (iph1.e)
                            {
                                pfp1.setScaleX(((ipm) (viewgroup)).a);
                                pfp1.setScaleY(((ipm) (viewgroup)).f);
                            }
                        } else
                        if (iph1 instanceof ipj)
                        {
                            viewgroup = ObjectAnimator.ofFloat(pfp1, "linePercentDrawn", new float[] {
                                0.0F, 1.0F
                            });
                            viewgroup.setDuration(iph1.c);
                            viewgroup.setStartDelay(l5);
                            viewgroup.setInterpolator(iph1.d);
                            list.add(viewgroup);
                            view = viewgroup;
                            if (iph1.e)
                            {
                                view = viewgroup;
                                if (pfp1 instanceof isv)
                                {
                                    ((isv)pfp1).setLinePercentDrawn(0.0F);
                                    view = viewgroup;
                                }
                            }
                        } else
                        {
                            view = null;
                        }
                        if (view != null)
                        {
                            ipb1.b(pfp1, view.getPropertyName());
                        }
                    }
                    break;

                case 2: // '\002'
                    i.a(iph1, true, k1, ((Integer)((irw) (view)).e).intValue(), pfp1);
                    break;

                case 3: // '\003'
                    i.a(iph1, false, k1, ((Integer)((irw) (view)).e).intValue(), pfp1);
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
        }

          goto _L15
_L9:
        if (view != null)
        {
            pfp1 = (isv)view;
        } else
        {
            pfp1 = new isv(c);
        }
        pfp1.setTag(s.bz, isb1);
        view = new Paint(1);
        view.setColor(ite.e(isb1.a));
        view.setStrokeWidth(isb1.r());
        view.setStyle(android.graphics.Paint.Style.STROKE);
        pfp1.a = view;
        if (isb1.a.b != null && isb1.a.b.v != null)
        {
            j1 = isb1.a.b.v.a;
        } else
        {
            j1 = 0;
        }
        if (j1 == 2)
        {
            j1 = c.getResources().getDimensionPixelSize(b.An);
            i2 = c.getResources().getDimensionPixelSize(b.Ao);
            pfp1.c = true;
            pfp1.d = j1;
            pfp1.e = i2;
            pfp1.f = j1 + i2;
            ((isv) (pfp1)).a.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        }
        if (pfp2.c.a == 13)
        {
            if (isb1.a.c != null)
            {
                view = isb1.a.c.e;
            } else
            {
                view = null;
            }
            view = isb1.a(view, true);
            ((isv) (pfp1)).b.reset();
            ((isv) (pfp1)).b.moveTo(((ish) (view)).a, ((ish) (view)).b);
            ((isv) (pfp1)).b.lineTo(((ish) (view)).c, ((ish) (view)).d);
            pfp1.b();
        } else
        if (pfp2.c.a == 16)
        {
            pfp1.a(isb1.B());
        }
          goto _L16
_L10:
        if (view != null)
        {
            pfp1 = (isi)view;
        } else
        {
            pfp1 = new isi(c);
        }
        pfp1.setId(s.aM);
        pfp1.setTag(s.bz, isb1);
        if ((isb1.n() & 0x70) == 80)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        pfp1.i = flag1;
        j1 = ite.f(isb1.a);
        ((isi) (pfp1)).g.setColor(j1);
        if (isb1.H())
        {
            if (!isb1.H())
            {
                view = null;
            } else
            {
                view = new isd(isb1.a(b.a(isb1.a.b.D.b, 0.0F)), isb1.a(b.a(isb1.a.b.D.a, 0.0F)), isb1.a(b.a(isb1.a.b.D.c, 0.0F)));
            }
            pfp1.a = ((isd) (view)).a;
            pfp1.b = ((isd) (view)).b;
            pfp1.d = ((isd) (view)).c;
            pfp1.e = ((isd) (view)).c;
        }
        view = a(e, pfp2);
        ((isi) (pfp1)).h.setText(view);
        j1 = ite.e(isb1.a);
        ((isi) (pfp1)).h.setTextColor(j1);
        f1 = isb1.q();
        ((isi) (pfp1)).h.setTextSize(0, f1);
        view = ite.g(pfp2);
        ((isi) (pfp1)).h.setTypeface(view);
        j1 = ite.h(pfp2);
        ((isi) (pfp1)).h.setGravity(j1);
        if (isb1.a.b != null && isb1.a.b.u != null)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 != 0)
        {
            j1 = isb1.r();
            pfp1.c = j1;
            ((isi) (pfp1)).f.setStrokeWidth(j1);
        }
          goto _L16
_L3:
        if (view != null)
        {
            pfp1 = (TextView)view;
        } else
        {
            pfp1 = new TextView(c);
        }
        pfp1.setId(c(pfp2));
        pfp1.setTag(s.bz, isb1);
        pfp1.setTag(s.bO, pfp2);
        pfp1.setText(a(e, pfp2));
        pfp1.setIncludeFontPadding(false);
        k2 = ite.f(isb1.a);
        if (k2 != 0) goto _L18; else goto _L17
_L17:
        if (pfp2.b != null)
        {
            j1 = pfp2.b.B;
        } else
        {
            j1 = 0;
        }
        if (pfp2.h == null || pfp2.h.a == null || pfp2.h.a.a != 1) goto _L20; else goto _L19
_L19:
        j1;
        JVM INSTR tableswitch 4 4: default 1712
    //                   4 1886;
           goto _L21 _L22
_L21:
        j1 = b.Aq;
_L23:
        if (j1 != 0)
        {
            i2 = c.getResources().getDimensionPixelSize(b.Ae);
        } else
        {
            i2 = 0;
        }
        if (k2 != 0)
        {
            pfp1.setBackgroundColor(k2);
        } else
        {
            pfp1.setBackgroundResource(j1);
        }
        pfp1.setPadding(i2, i2, i2, i2);
        pfp1.setTextColor(ite.e(isb1.a));
        pfp1.setTextSize(0, isb1.q());
        pfp1.setTypeface(ite.g(pfp2));
        pfp1.setGravity(ite.h(pfp2));
        if (isb1.a.b != null && isb1.a.b.l != null)
        {
            j1 = isb1.a.b.l.intValue();
        } else
        {
            j1 = 0x7fffffff;
        }
        if (j1 == 0x7fffffff)
        {
            view = null;
        } else
        {
            view = android.text.TextUtils.TruncateAt.END;
        }
        pfp1.setEllipsize(view);
        pfp1.setMaxLines(j1);
          goto _L16
_L22:
        j1 = 0;
          goto _L23
_L20:
        if (d(pfp2) && a(pfp2) == 1)
        {
            switch (j1)
            {
            case 3: // '\003'
            default:
                j1 = b.Ar;
                break;

            case 4: // '\004'
                j1 = 0;
                break;

            case 2: // '\002'
                j1 = b.As;
                break;
            }
        } else
        {
            j1 = 0;
        }
        continue; /* Loop/switch isn't completed */
_L18:
        j1 = 0;
        if (true) goto _L23; else goto _L24
_L24:
_L11:
        if (view != null)
        {
            pfp1 = (itd)view;
        } else
        {
            pfp1 = new itd(c);
        }
        pfp1.setContentDescription(c.getString(q.aI));
        pfp1.setId(c(pfp2));
        pfp1.setTag(s.bz, isb1);
        pfp1.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        pfp1.setTag(s.bP, Boolean.valueOf(true));
        viewgroup = (peq)ite.a(e, pfp2.c.b, peq);
        view = ((peq) (viewgroup)).d.b.a;
        obj = r.a(view);
        if (obj != null)
        {
            view = ((elt)((ekp) (obj)).a(elt)).e();
            viewgroup = ((ekp) (obj)).c();
        } else
        {
            view = euv.a(ite.a(((peq) (viewgroup)).d));
            if (view == euv.c)
            {
                obj = new gat(((peq) (viewgroup)).d.d.c.b.a, m);
                viewgroup = view;
                view = ((View) (obj));
            } else
            {
                obj = new gat(((peq) (viewgroup)).d.d.b.a.a, m);
                viewgroup = view;
                view = ((View) (obj));
            }
        }
        if (viewgroup == euv.c)
        {
            pfp1.h = fsd.b;
        } else
        {
            pfp1.h = fsd.a;
        }
        if (viewgroup == euv.e || viewgroup == euv.c)
        {
            viewgroup = new irs(this, pfp1);
            pfp1.s = viewgroup;
            obj = (fli)olm.a(c, fli);
            ((amh)olm.a(c, amh)).a(view).a(((fli) (obj)).c()).a(viewgroup);
        } else
        {
            viewgroup = new irt(this, pfp1);
            pfp1.s = viewgroup;
            obj = (fli)olm.a(c, fli);
            ((amh)olm.a(c, amh)).a(view).a(((fli) (obj)).d()).a(viewgroup);
        }
          goto _L16
_L4:
        if (view != null)
        {
            view = (isr)view;
        } else
        {
            view = new isr(c);
        }
        view.setTag(s.bz, isb1);
        j1 = c.getResources().getColor(af.N);
        ((isr) (view)).j.setColor(j1);
        view.a = isb1.t();
        flag1 = isb1.u();
        view.h = flag1;
        if (flag1)
        {
            j1 = isb1.v();
            f1 = isb1.w();
            ((isr) (view)).i.setColor(j1);
            ((isr) (view)).i.setStrokeWidth(f1);
        }
        if (isb1.C())
        {
            view.b = isb1.D();
        }
        if (isb1.F())
        {
            view.d = isb1.G();
        }
        if (isb1.E())
        {
            if (isb1.E())
            {
                f1 = isb1.a(isb1.a.b.A.a.a.floatValue());
            } else
            {
                f1 = 0.0F;
            }
            view.c = f1;
        }
        f1 = c.getResources().getDisplayMetrics().density;
        viewgroup = c;
        pfp1 = e;
        obj = r;
        if (pfp2.c != null) goto _L26; else goto _L25
_L25:
        pfp1 = null;
_L33:
        view.e = pfp1;
        view.setId(c(pfp2));
        view.f = 5;
        j1 = pfp2.c.a;
        if (j1 == 12)
        {
            view.setContentDescription(c.getString(q.aJ));
        } else
        if (j1 == 1)
        {
            view.setContentDescription(c.getString(q.ba));
        } else
        if (j1 == 2)
        {
            view.f = 4;
        }
        view.g = 8224;
        pfp1 = String.valueOf(view.hashCode());
        viewgroup = i;
        j1 = isb1.z();
        if (!((ipb) (viewgroup)).g.containsKey(Integer.valueOf(j1)))
        {
            ((ipb) (viewgroup)).g.put(Integer.valueOf(j1), new ArrayList());
        }
        ((List)((ipb) (viewgroup)).g.get(Integer.valueOf(j1))).add(pfp1);
        ((ipb) (viewgroup)).f.postDelayed(new ipf(viewgroup, j1, pfp1), 3000L);
        view.l = new iru(this, isb1, pfp1);
        pfp1 = view;
          goto _L16
_L26:
        pfp2.c.a;
        JVM INSTR lookupswitch 5: default 2908
    //                   1: 3000
    //                   2: 3091
    //                   5: 2951
    //                   10: 2981
    //                   12: 3027;
           goto _L27 _L28 _L29 _L30 _L31 _L32
_L27:
        j1 = pfp2.c.a;
        Log.w("StoryLayoutAdapter", (new StringBuilder(38)).append("Unrecognized content type: ").append(j1).toString());
        pfp1 = null;
          goto _L33
_L30:
        pfp1 = a(((Context) (viewgroup)), ((peq)ite.a(pfp1, pfp2.c.b, peq)).d, ((iui) (obj)));
          goto _L33
_L31:
        pfp1 = a(((Context) (viewgroup)), ((pev) (pfp1)).c.d[0], ((iui) (obj)));
          goto _L33
_L28:
        pfp1 = (String)ite.b(pfp1, pfp2.c.b, java/lang/String);
_L34:
        if (pfp1 == null)
        {
            pfp1 = null;
        } else
        {
            pfp1 = njr.a(viewgroup, pfp1, njx.a);
        }
          goto _L33
_L32:
        pfp1 = (peq)ite.a(pfp1, pfp2.c.b, peq);
        if (pfp1 != null && ((peq) (pfp1)).e != null)
        {
            pfp1 = b.a(b.a(((peq) (pfp1)).e.a, false), isb1.e(), isb1.g(), f1);
        } else
        {
            pfp1 = null;
        }
          goto _L34
_L29:
        if (pfp2.c.c != null)
        {
            pfp1 = pfp2.c.c.c;
        } else
        {
            pfp1 = null;
        }
          goto _L34
_L5:
        (new oce(9)).b(c);
        if (view != null)
        {
            pfp1 = (isk)view;
        } else
        {
            pfp1 = new isk(c);
        }
        pfp1.setTag(s.bz, isb1);
        if (e.c != null)
        {
            j1 = e.c.d.length;
        } else
        {
            j1 = 0;
        }
        view = new iso[j1];
        viewgroup = isb1.a(view.length);
        for (j1 = 0; j1 < view.length; j1++)
        {
            obj = ite.b(e.c.d[j1]);
            njr1 = njr.a(c, ((qdz) (obj)).a, njx.a);
            i2 = (int)((qdz) (obj)).b.longValue();
            k2 = (int)((qdz) (obj)).c.longValue();
            view[j1] = new iso(njr1, viewgroup[j1], i2, k2);
        }

        if (view.length == 0)
        {
            throw new IllegalArgumentException("StoryLayoutCoverImageView requires 1+ cover images");
        }
        if (view.length == 1)
        {
            pfp1.c = new iso[2];
            Arrays.fill(((isk) (pfp1)).c, view[0]);
        } else
        {
            pfp1.c = view;
        }
        if (isb1.C())
        {
            pfp1.a = isb1.D();
        }
        if (isb1.F())
        {
            pfp1.b = isb1.G();
        }
        pfp1.setContentDescription(c.getString(q.az));
        pfp1.d = 8224;
        pfp1.e = new irv(this);
          goto _L16
_L13:
        if (view != null)
        {
            pfp1 = (ProgressBar)view;
        } else
        {
            pfp1 = new irz(this, c);
        }
        pfp1.setIndeterminate(true);
        pfp1.setTag(s.bz, isb1);
        pfp1.getIndeterminateDrawable().setColorFilter(0xff444444, android.graphics.PorterDuff.Mode.SRC_IN);
          goto _L16
_L6:
        if (view != null)
        {
            pfp1 = (isj)view;
        } else
        {
            pfp1 = new isj(c);
        }
        pfp1.setTag(s.bz, isb1);
        j1 = ite.e(isb1.a);
        ((isj) (pfp1)).a.setColor(j1);
        ((isj) (pfp1)).b.setColor(j1);
        j1 = ite.f(isb1.a);
        ((isj) (pfp1)).c.setColor(j1);
          goto _L16
_L7:
        if (view != null)
        {
            pfp1 = (ImageView)view;
        } else
        {
            pfp1 = new ImageView(c);
        }
        pfp1.setTag(s.bz, isb1);
        pfp1.setImageResource(e(pfp2));
          goto _L16
_L8:
        viewgroup = (pqb)ite.b(e, pfp2.c.b, pqb);
        if (view != null)
        {
            pfp1 = (AvatarView)view;
        } else
        {
            pfp1 = new AvatarView(c);
        }
        pfp1.setTag(s.bz, isb1);
        if (viewgroup != null)
        {
            view = ((pqb) (viewgroup)).b;
        } else
        {
            view = null;
        }
        if (viewgroup != null)
        {
            viewgroup = ((pqb) (viewgroup)).e;
        } else
        {
            viewgroup = null;
        }
        pfp1.a(view, viewgroup);
        if (isb1.d())
        {
            if (isb1.f())
            {
                j1 = Math.min(isb1.e(), isb1.g());
            } else
            {
                j1 = isb1.e();
            }
        } else
        if (isb1.f())
        {
            j1 = isb1.g();
        } else
        {
            if (isb1.a.b != null)
            {
                f1 = b.a(isb1.a.b.t, 0.15F);
            } else
            {
                f1 = 0.15F;
            }
            j1 = isb1.a(f1);
        }
        pfp1.a(c(j1));
        pfp1.a = 1;
          goto _L16
_L12:
        if (view == null)
        {
            view = new View(c);
        }
        view.setTag(s.bz, isb1);
        return view;
_L15:
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            pfp1.setContentDescription(pfp1.getContentDescription());
        }
        a(pfp2);
        JVM INSTR lookupswitch 3: default 4840
    //                   1: 4986
    //                   8: 5265
    //                   9: 5234;
           goto _L35 _L36 _L37 _L38
_L35:
        pfp1.setOnClickListener(null);
        pfp1.setClickable(false);
_L47:
        a(pfp2, isb1, ((View) (pfp1)));
        pfp1.setTag(s.bE, null);
        if (pfp2 != null && pfp2.h != null)
        {
            view = pfp2.h.a;
        } else
        {
            view = null;
        }
        if (view == null) goto _L40; else goto _L39
_L39:
        ((pfr) (view)).a;
        JVM INSTR tableswitch 1 5: default 4932
    //                   1 6070
    //                   2 5937
    //                   3 5389
    //                   4 6215
    //                   5 5871;
           goto _L41 _L42 _L43 _L44 _L45 _L46
_L41:
        k1 = ((pfr) (view)).a;
        Log.w("StoryLayoutAdapter", (new StringBuilder(37)).append("Unrecognized action type: ").append(k1).toString());
_L40:
        viewgroup = pfp2.k;
        if (viewgroup != null && !b.e(pfp1))
        {
            if (pfp2 == null || pfp2.c == null || pfp2.c.b == null)
            {
                view = null;
            } else
            {
                view = (peq)ite.a(e, pfp2.c.b, peq);
                if (view == null || ((peq) (view)).d == null || ((peq) (view)).d.b == null)
                {
                    view = null;
                } else
                {
                    view = r.a(((peq) (view)).d.b.a);
                }
            }
            ioz1 = q;
            k1 = viewgroup.intValue();
            viewgroup = (msp)ioz1.b.get(Integer.valueOf(k1));
            if (viewgroup == null)
            {
                view = null;
            } else
            if (k1 == pxa.t.a)
            {
                if (view == null)
                {
                    view = new ogv(viewgroup, new ogw[] {
                        ogw.a(0)
                    });
                } else
                {
                    view = b.a(ioz1.a, viewgroup, view);
                }
            } else
            {
                view = new msm(viewgroup);
            }
            if (view != null)
            {
                b.a(pfp1, view);
            }
        }
        return pfp1;
_L36:
        k1 = c(pfp2);
        pfp1.setTag(s.bL, pfp2.c.b);
        if (k1 == s.bm)
        {
            view = (peq)ite.a(e, pfp2.c.b, peq);
            pfp1.setTag(s.bQ, ((peq) (view)).d.b.a);
        }
        flag3 = d(pfp2);
        if (flag3 || k1 == s.bB || k1 == s.bm)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        pfp1.setClickable(flag2);
        if (pfp1.isClickable())
        {
            pfp1.setOnClickListener(n);
        }
        if (flag3)
        {
            if (k1 == s.bB)
            {
                view = new StringBuilder();
                c.a(view, new CharSequence[] {
                    ((TextView)pfp1).getText(), c.getString(q.bk)
                });
                pfp1.setContentDescription(view.toString());
            } else
            if (k1 == s.bm)
            {
                view = new StringBuilder();
                c.a(view, new CharSequence[] {
                    ((TextView)pfp1).getText(), c.getString(q.aC)
                });
                pfp1.setContentDescription(view.toString());
            }
        }
          goto _L47
_L38:
        pfp1.setOnClickListener(n);
        pfp1.setClickable(true);
        pfp1.setTag(s.bL, pfp2.c.b);
          goto _L47
_L37:
        pfp1.setOnClickListener(n);
        pfp1.setClickable(true);
        view = (peq)ite.a(e, pfp2.c.b, peq);
        pfp1.setTag(s.bQ, ((peq) (view)).d.b.a);
        pfp1.setTag(s.bL, pfp2.c.b);
        view = new StringBuilder();
        c.a(view, new CharSequence[] {
            ((isi)pfp1).h.getText(), c.getString(q.aC)
        });
        pfp1.setContentDescription(view.toString());
          goto _L47
_L44:
        view = (peq)ite.a(e, ((pfr) (view)).b, peq);
        if (view != null && ((peq) (view)).e != null)
        {
            view = ((peq) (view)).e.a;
        } else
        {
            view = null;
        }
        if (view != null) goto _L49; else goto _L48
_L48:
        Log.w("StoryLayoutAdapter", "Missing placeLocation in PLACE_INTENT action.");
          goto _L40
_L49:
        if (((pet) (view)).a != null && ((pet) (view)).a.c != null)
        {
            viewgroup = new StringBuilder();
            c.a(viewgroup, new CharSequence[] {
                pfp1.getContentDescription(), ((pet) (view)).a.c, c.getString(q.aF)
            });
            pfp1.setContentDescription(viewgroup.toString());
        }
        if (((pet) (view)).b != 4 && ((pet) (view)).b != 2 && ((pet) (view)).b != 3) goto _L51; else goto _L50
_L50:
        if (((pet) (view)).d != null && ((pet) (view)).d.b != null) goto _L53; else goto _L52
_L52:
        Log.w("StoryLayoutAdapter", "Missing contact in PLACE_INTENT action.");
          goto _L40
_L53:
        pfp1.setTag(s.bE, Integer.valueOf(4));
        pfp1.setTag(s.bM, ((pet) (view)).d.b);
_L62:
        pfp1.setOnClickListener(n);
        pfp1.setClickable(true);
          goto _L40
_L51:
        viewgroup = ((pet) (view)).a;
        if (viewgroup == null) goto _L55; else goto _L54
_L54:
        if (((pet) (view)).b != 1 || ((pry) (viewgroup)).f == null) goto _L57; else goto _L56
_L56:
        view = Uri.parse(((pry) (viewgroup)).f);
_L61:
        if (view != null) goto _L59; else goto _L58
_L58:
        Log.w("StoryLayoutAdapter", "Cannot construct url for PLACE_INTENT action.");
          goto _L40
_L57:
        if (((pry) (viewgroup)).a == null || ((pry) (viewgroup)).b == null) goto _L55; else goto _L60
_L60:
        view = b.d(((pry) (viewgroup)).a.intValue(), ((pry) (viewgroup)).b.intValue());
        d1 = ((meo) (view)).a;
        d2 = ((meo) (view)).b;
        viewgroup = String.valueOf(((pry) (viewgroup)).c);
        viewgroup = Uri.encode((new StringBuilder(String.valueOf(viewgroup).length() + 51)).append(d1).append(",").append(d2).append("(").append(viewgroup).append(")").toString());
        d1 = ((meo) (view)).a;
        d2 = ((meo) (view)).b;
        view = Uri.parse((new StringBuilder(String.valueOf(viewgroup).length() + 70)).append("geo:").append(d1).append(",").append(d2).append("?q=").append(viewgroup).append("&z=16").toString());
          goto _L61
_L55:
        view = null;
          goto _L61
_L59:
        pfp1.setTag(s.bE, Integer.valueOf(0));
        pfp1.setTag(s.bN, view);
          goto _L62
_L46:
        view = (pqb)ite.b(e, ((pfr) (view)).b, pqb);
        if (view != null && ((pqb) (view)).b != null) goto _L64; else goto _L63
_L63:
        Log.w("StoryLayoutAdapter", "Missing person in PROFILE_INTENT action.");
          goto _L40
_L64:
        pfp1.setTag(s.bE, Integer.valueOf(4));
        pfp1.setTag(s.bM, ((pqb) (view)).b);
          goto _L62
_L43:
        view = (peh)ite.a(e, ((pfr) (view)).b, peh);
        if (view != null && ((peh) (view)).c != null && ((peh) (view)).c.a != null) goto _L66; else goto _L65
_L65:
        Log.w("StoryLayoutAdapter", "Missing landmarkData in LANDMARK_INTENT action.");
          goto _L40
_L66:
        pfp1.setTag(s.bE, Integer.valueOf(1));
        pfp1.setTag(s.bX, ((peh) (view)).c.a);
        viewgroup = new StringBuilder();
        c.a(viewgroup, new CharSequence[] {
            pfp1.getContentDescription(), ((peh) (view)).c.a, c.getString(q.aE)
        });
        pfp1.setContentDescription(viewgroup.toString());
          goto _L62
_L42:
        viewgroup = (peq)ite.a(e, ((pfr) (view)).b, peq);
        if (viewgroup != null && ((peq) (viewgroup)).e != null) goto _L68; else goto _L67
_L67:
        Log.w("StoryLayoutAdapter", "Missing place in PLACE_SELECTION action.");
          goto _L40
_L68:
        view = b.a(((peq) (viewgroup)).e);
        viewgroup = b.a(((peq) (viewgroup)).e.a, true);
        pfp1.setTag(s.bE, Integer.valueOf(3));
        pfp1.setTag(s.bU, view);
        pfp1.setTag(s.bK, viewgroup);
        view = new StringBuilder();
        if (viewgroup != null)
        {
            c.a(view, new CharSequence[] {
                pfp1.getContentDescription(), ((ioj) (viewgroup)).d, c.getString(q.aD)
            });
        }
        pfp1.setContentDescription(view.toString());
          goto _L62
_L45:
        pfp1.setTag(s.bE, Integer.valueOf(2));
        view = new StringBuilder();
        c.a(view, new CharSequence[] {
            pfp1.getContentDescription(), c.getString(q.aG)
        });
        pfp1.setContentDescription(view.toString());
          goto _L62
        if (true) goto _L14; else goto _L69
_L69:
    }

    protected final isb a(pfp pfp1, isb isb1)
    {
        return new isb(pfp1, g, isb1);
    }

    public isx a()
    {
        return d;
    }

    public pfp a(int i1)
    {
        return e.h[f].c[i1];
    }

    public final void a(iug iug1)
    {
        boolean flag2 = false;
        pev pev1;
        boolean flag;
        boolean flag1;
        if (iug1 != null)
        {
            pev1 = iug1.a;
        } else
        {
            pev1 = null;
        }
        if (e != pev1)
        {
            e = pev1;
            f = -1;
            h = null;
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag2;
        if (iug1.b != null)
        {
            flag1 = flag2;
            if (!iug1.b.equals(r))
            {
                r = iug1.b;
                flag1 = true;
            }
        }
        if (flag || flag1)
        {
            b.notifyChanged();
        }
    }

    void a(pfp apfp[])
    {
        int i1;
        int i2;
        i2 = apfp.length;
        i1 = 0;
_L7:
        if (i1 >= i2) goto _L2; else goto _L1
_L1:
        pfp pfp1;
        pgl apgl[];
        int j1;
        int j2;
        pfp1 = b(apfp[i1]);
        if (pfp1 == null || pfp1.b == null || pfp1.b.x == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        apgl = pfp1.b.x;
        j2 = apgl.length;
        j1 = 0;
_L5:
        pgl pgl1;
        pfe apfe[];
        int k1;
        int k2;
        long l3;
        if (j1 >= j2)
        {
            break MISSING_BLOCK_LABEL_400;
        }
        pgl1 = apgl[j1];
        l3 = pgl1.b.longValue();
        isa isa1 = h;
        if (isa1.a.g == null)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        apfe = isa1.a.g;
        k2 = apfe.length;
        k1 = 0;
_L6:
        pfe pfe1;
        if (k1 >= k2)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        pfe1 = apfe[k1];
        if (pfe1.a == null || pfe1.a.longValue() != l3) goto _L4; else goto _L3
_L3:
        if (pfe1 == null || pfe1.b == null)
        {
            Log.w("StoryLayoutAdapter", "Couldn't find referenced animation timeline for element");
        } else
        {
            int l2 = b.a(pgl1.c);
            pff apff[] = pfe1.b;
            int i3 = apff.length;
            int l1 = 0;
            while (l1 < i3) 
            {
                pff pff1 = apff[l1];
                if (pff1.b == null)
                {
                    Log.w("StoryLayoutAdapter", "Animation timeline element target is null");
                } else
                {
                    String s1 = new String(pff1.b);
                    irw irw1 = new irw();
                    irw1.a = b.a(pff1.c);
                    irw1.c = b.a(pff1.a);
                    irw1.b = l2;
                    irw1.d = b.a(Integer.valueOf(pgl1.a));
                    irw1.e = Integer.valueOf(b.a(pfp1.e));
                    if (!j.containsKey(s1))
                    {
                        j.put(s1, new ArrayList());
                    }
                    ((List)j.get(s1)).add(irw1);
                }
                l1++;
            }
        }
        j1++;
          goto _L5
_L4:
        k1++;
          goto _L6
        pfe1 = null;
          goto _L3
        a(pfp1.d);
        i1++;
          goto _L7
_L2:
    }

    public final List b(int i1)
    {
        ArrayList arraylist = new ArrayList();
        if (e != null && f != -1)
        {
            pfp apfp[] = e.h[f].c;
            int k1 = apfp.length;
            int j1 = 0;
            while (j1 < k1) 
            {
                pfp pfp1 = apfp[j1];
                if (pfp1.f == null)
                {
                    Log.w("StoryLayoutAdapter", "Layout element with no layout element ref");
                } else
                if (b.a(pfp1.e) <= i1)
                {
                    arraylist.add(new irx(pfp1.f));
                }
                j1++;
            }
        }
        return arraylist;
    }

    final boolean b()
    {
        return e != null && e.f != null && e.f.c != null && e.f.c.booleanValue();
    }

    public int getCount()
    {
        if (e == null || f == -1)
        {
            return 0;
        } else
        {
            return e.h[f].c.length;
        }
    }

    public Object getItem(int i1)
    {
        return a(i1);
    }

    public long getItemId(int i1)
    {
        return (long)i1;
    }

    public int getItemViewType(int i1)
    {
        return a(a(i1));
    }

    public View getView(int i1, View view, ViewGroup viewgroup)
    {
        return a(a(i1), view, viewgroup);
    }

    public int getViewTypeCount()
    {
        return 12;
    }

    public boolean hasStableIds()
    {
        return false;
    }

    public boolean isEmpty()
    {
        return getCount() == 0;
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        b.registerObserver(datasetobserver);
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        b.unregisterObserver(datasetobserver);
    }

    static 
    {
        HashSet hashset = new HashSet();
        l = hashset;
        hashset.add(Integer.valueOf(0));
        l.add(Integer.valueOf(1));
        l.add(Integer.valueOf(2));
    }
}
