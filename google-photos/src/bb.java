// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class bb extends ay
    implements li
{

    private static Interpolator A = new DecelerateInterpolator(1.5F);
    static boolean a = false;
    private static boolean k;
    private static Interpolator z = new DecelerateInterpolator(2.5F);
    ArrayList b;
    ArrayList c;
    ArrayList d;
    ArrayList e;
    ArrayList f;
    int g;
    ax h;
    av i;
    String j;
    private ArrayList l;
    private Runnable m[];
    private boolean n;
    private ArrayList o;
    private ArrayList p;
    private ArrayList q;
    private am r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private Bundle w;
    private SparseArray x;
    private Runnable y;

    bb()
    {
        g = 0;
        w = null;
        x = null;
        y = new bc(this);
    }

    private static Animation a(float f1, float f2)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(f1, f2);
        alphaanimation.setInterpolator(A);
        alphaanimation.setDuration(220L);
        return alphaanimation;
    }

    private static Animation a(float f1, float f2, float f3, float f4)
    {
        AnimationSet animationset = new AnimationSet(false);
        Object obj = new ScaleAnimation(f1, f2, f1, f2, 1, 0.5F, 1, 0.5F);
        ((ScaleAnimation) (obj)).setInterpolator(z);
        ((ScaleAnimation) (obj)).setDuration(220L);
        animationset.addAnimation(((Animation) (obj)));
        obj = new AlphaAnimation(f3, f4);
        ((AlphaAnimation) (obj)).setInterpolator(A);
        ((AlphaAnimation) (obj)).setDuration(220L);
        animationset.addAnimation(((Animation) (obj)));
        return animationset;
    }

    private Animation a(am am1, int i1, boolean flag, int j1)
    {
        Animation animation;
        int k1 = am1.P;
        animation = am1.g(flag);
        if (animation == null) goto _L2; else goto _L1
_L1:
        am1 = animation;
_L4:
        return am1;
_L2:
        if (am1.P == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        animation = AnimationUtils.loadAnimation(h.b, am1.P);
        am1 = animation;
        if (animation != null) goto _L4; else goto _L3
_L3:
        byte byte0;
        if (i1 == 0)
        {
            return null;
        }
        byte0 = -1;
        i1;
        JVM INSTR lookupswitch 3: default 100
    //                   4097: 109
    //                   4099: 137
    //                   8194: 123;
           goto _L5 _L6 _L7 _L8
_L5:
        i1 = byte0;
_L10:
        if (i1 < 0)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L6:
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (flag)
        {
            i1 = 3;
        } else
        {
            i1 = 4;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (flag)
        {
            i1 = 5;
        } else
        {
            i1 = 6;
        }
        if (true) goto _L10; else goto _L9
_L9:
        switch (i1)
        {
        default:
            i1 = j1;
            if (j1 == 0)
            {
                i1 = j1;
                if (h.e())
                {
                    i1 = h.f();
                }
            }
            if (i1 == 0)
            {
                return null;
            } else
            {
                return null;
            }

        case 1: // '\001'
            return a(1.125F, 1.0F, 0.0F, 1.0F);

        case 2: // '\002'
            return a(1.0F, 0.975F, 1.0F, 0.0F);

        case 3: // '\003'
            return a(0.975F, 1.0F, 0.0F, 1.0F);

        case 4: // '\004'
            return a(1.0F, 1.075F, 1.0F, 0.0F);

        case 5: // '\005'
            return a(0.0F, 1.0F);

        case 6: // '\006'
            return a(1.0F, 0.0F);
        }
    }

    private void a(int i1, ab ab1)
    {
        this;
        JVM INSTR monitorenter ;
        int k1;
        if (e == null)
        {
            e = new ArrayList();
        }
        k1 = e.size();
        int j1 = k1;
        if (i1 >= k1) goto _L2; else goto _L1
_L1:
        e.set(i1, ab1);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (j1 >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        e.add(null);
        if (f == null)
        {
            f = new ArrayList();
        }
        f.add(Integer.valueOf(j1));
        j1++;
        if (true) goto _L2; else goto _L3
_L3:
        e.add(ab1);
          goto _L4
        ab1;
        this;
        JVM INSTR monitorexit ;
        throw ab1;
    }

    private void a(RuntimeException runtimeexception)
    {
        Log.e("FragmentManager", runtimeexception.getMessage());
        Log.e("FragmentManager", "Activity state:");
        Object obj = new PrintWriter(new jn("FragmentManager"));
        if (h != null)
        {
            try
            {
                h.a("  ", null, ((PrintWriter) (obj)), new String[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("FragmentManager", "Failed dumping state", ((Throwable) (obj)));
            }
        } else
        {
            try
            {
                a("  ", ((FileDescriptor) (null)), ((PrintWriter) (obj)), new String[0]);
            }
            catch (Exception exception)
            {
                Log.e("FragmentManager", "Failed dumping state", exception);
            }
        }
        throw runtimeexception;
    }

    static boolean a(View view, Animation animation)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (mk.g(view) != 0) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (!mk.x(view)) goto _L2; else goto _L3
_L3:
        if (!(animation instanceof AlphaAnimation)) goto _L5; else goto _L4
_L4:
        int i1 = 1;
_L7:
        flag = flag1;
        if (i1 != 0)
        {
            flag = true;
        }
_L2:
        return flag;
_L5:
        if (animation instanceof AnimationSet)
        {
            view = ((AnimationSet)animation).getAnimations();
            i1 = 0;
            do
            {
                if (i1 >= view.size())
                {
                    break;
                }
                if (view.get(i1) instanceof AlphaAnimation)
                {
                    i1 = 1;
                    continue; /* Loop/switch isn't completed */
                }
                i1++;
            } while (true);
        }
        i1 = 0;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static void b(View view, Animation animation)
    {
        while (view == null || animation == null || !a(view, animation)) 
        {
            return;
        }
        animation.setAnimationListener(new bh(view, animation));
    }

    public static int c(int i1)
    {
        switch (i1)
        {
        default:
            return 0;

        case 4097: 
            return 8194;

        case 8194: 
            return 4097;

        case 4099: 
            return 4099;
        }
    }

    private void c(am am1)
    {
        a(am1, g, 0, 0, false);
    }

    private void d(am am1)
    {
        if (am1.S != null)
        {
            if (x == null)
            {
                x = new SparseArray();
            } else
            {
                x.clear();
            }
            am1.S.saveHierarchyState(x);
            if (x.size() > 0)
            {
                am1.n = x;
                x = null;
                return;
            }
        }
    }

    private Bundle e(am am1)
    {
        if (w == null)
        {
            w = new Bundle();
        }
        am1.h(w);
        Bundle bundle;
        Bundle bundle1;
        if (!w.isEmpty())
        {
            bundle1 = w;
            w = null;
        } else
        {
            bundle1 = null;
        }
        if (am1.R != null)
        {
            d(am1);
        }
        bundle = bundle1;
        if (am1.n != null)
        {
            bundle = bundle1;
            if (bundle1 == null)
            {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", am1.n);
        }
        bundle1 = bundle;
        if (!am1.U)
        {
            bundle1 = bundle;
            if (bundle == null)
            {
                bundle1 = new Bundle();
            }
            bundle1.putBoolean("android:user_visible_hint", am1.U);
        }
        return bundle1;
    }

    private void s()
    {
        if (t)
        {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (j != null)
        {
            throw new IllegalStateException((new StringBuilder("Can not perform this action inside of ")).append(j).toString());
        } else
        {
            return;
        }
    }

    public final int a(ab ab1)
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        if (f != null && f.size() > 0)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        if (e == null)
        {
            e = new ArrayList();
        }
        i1 = e.size();
        e.add(ab1);
        this;
        JVM INSTR monitorexit ;
        return i1;
        i1 = ((Integer)f.remove(f.size() - 1)).intValue();
        e.set(i1, ab1);
        this;
        JVM INSTR monitorexit ;
        return i1;
        ab1;
        this;
        JVM INSTR monitorexit ;
        throw ab1;
    }

    public final am a(int i1)
    {
        if (c == null) goto _L2; else goto _L1
_L1:
        int j1 = c.size() - 1;
_L11:
        if (j1 < 0) goto _L2; else goto _L3
_L3:
        am am1 = (am)c.get(j1);
        if (am1 == null || am1.F != i1) goto _L5; else goto _L4
_L4:
        return am1;
_L5:
        j1--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        j1 = b.size() - 1;
_L9:
        if (j1 < 0) goto _L7; else goto _L6
_L6:
        am am2;
        am2 = (am)b.get(j1);
        if (am2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        am1 = am2;
        if (am2.F == i1) goto _L4; else goto _L8
_L8:
        j1--;
          goto _L9
_L7:
        return null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final am a(Bundle bundle, String s1)
    {
        int i1 = bundle.getInt(s1, -1);
        if (i1 == -1)
        {
            bundle = null;
        } else
        {
            if (i1 >= b.size())
            {
                a(((RuntimeException) (new IllegalStateException((new StringBuilder("Fragment no longer exists for key ")).append(s1).append(": index ").append(i1).toString()))));
            }
            am am1 = (am)b.get(i1);
            bundle = am1;
            if (am1 == null)
            {
                a(((RuntimeException) (new IllegalStateException((new StringBuilder("Fragment no longer exists for key ")).append(s1).append(": index ").append(i1).toString()))));
                return am1;
            }
        }
        return bundle;
    }

    public final am a(String s1)
    {
        if (c == null || s1 == null) goto _L2; else goto _L1
_L1:
        int i1 = c.size() - 1;
_L11:
        if (i1 < 0) goto _L2; else goto _L3
_L3:
        am am1 = (am)c.get(i1);
        if (am1 == null || !s1.equals(am1.H)) goto _L5; else goto _L4
_L4:
        return am1;
_L5:
        i1--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (b == null || s1 == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        i1 = b.size() - 1;
_L9:
        if (i1 < 0) goto _L7; else goto _L6
_L6:
        am am2;
        am2 = (am)b.get(i1);
        if (am2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        am1 = am2;
        if (s1.equals(am2.H)) goto _L4; else goto _L8
_L8:
        i1--;
          goto _L9
_L7:
        return null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final View a(View view, String s1, Context context, AttributeSet attributeset)
    {
        if (!"fragment".equals(s1))
        {
            return null;
        }
        String s2 = attributeset.getAttributeValue(null, "class");
        s1 = context.obtainStyledAttributes(attributeset, bi.a);
        if (s2 == null)
        {
            s2 = s1.getString(0);
        }
        int k1 = s1.getResourceId(1, -1);
        String s3 = s1.getString(2);
        s1.recycle();
        if (!am.b(h.b, s2))
        {
            return null;
        }
        int i1;
        if (view != null)
        {
            i1 = view.getId();
        } else
        {
            i1 = 0;
        }
        if (i1 == -1 && k1 == -1 && s3 == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Must specify unique android:id, android:tag, or have a parent with an id for ").append(s2).toString());
        }
        if (k1 != -1)
        {
            s1 = a(k1);
        } else
        {
            s1 = null;
        }
        view = s1;
        if (s1 == null)
        {
            view = s1;
            if (s3 != null)
            {
                view = a(s3);
            }
        }
        s1 = view;
        if (view == null)
        {
            s1 = view;
            if (i1 != -1)
            {
                s1 = a(i1);
            }
        }
        if (s1 == null)
        {
            view = am.a(context, s2);
            view.x = true;
            int j1;
            if (k1 != 0)
            {
                j1 = k1;
            } else
            {
                j1 = i1;
            }
            view.F = j1;
            view.G = i1;
            view.H = s3;
            view.y = true;
            view.B = this;
            view.a(attributeset, ((am) (view)).m);
            a(((am) (view)), true);
        } else
        {
            if (((am) (s1)).y)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Duplicate id 0x").append(Integer.toHexString(k1)).append(", tag ").append(s3).append(", or parent id 0x").append(Integer.toHexString(i1)).append(" with another fragment for ").append(s2).toString());
            }
            s1.y = true;
            if (!((am) (s1)).L)
            {
                s1.a(attributeset, ((am) (s1)).m);
            }
            view = s1;
        }
        if (g <= 0 && ((am) (view)).x)
        {
            a(((am) (view)), 1, 0, 0, false);
        } else
        {
            c(view);
        }
        if (((am) (view)).R == null)
        {
            throw new IllegalStateException((new StringBuilder("Fragment ")).append(s2).append(" did not create a view.").toString());
        }
        if (k1 != 0)
        {
            ((am) (view)).R.setId(k1);
        }
        if (((am) (view)).R.getTag() == null)
        {
            ((am) (view)).R.setTag(s3);
        }
        return ((am) (view)).R;
    }

    public final ap a(am am1)
    {
        Object obj = null;
        if (am1.o < 0)
        {
            a(((RuntimeException) (new IllegalStateException((new StringBuilder("Fragment ")).append(am1).append(" is not currently in the FragmentManager").toString()))));
        }
        ap ap1 = obj;
        if (am1.j > 0)
        {
            am1 = e(am1);
            ap1 = obj;
            if (am1 != null)
            {
                ap1 = new ap(am1);
            }
        }
        return ap1;
    }

    public final bp a()
    {
        return new ab(this);
    }

    public final void a(int i1, int j1)
    {
        if (i1 < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad id: ")).append(i1).toString());
        } else
        {
            a(((Runnable) (new bf(this, i1, 1))), false);
            return;
        }
    }

    final void a(int i1, int j1, int k1, boolean flag)
    {
        if (h == null && i1 != 0)
        {
            throw new IllegalStateException("No host");
        }
        if (flag || g != i1)
        {
            g = i1;
            if (b != null)
            {
                int l1 = 0;
                boolean flag1 = false;
                for (; l1 < b.size(); l1++)
                {
                    am am1 = (am)b.get(l1);
                    if (am1 == null)
                    {
                        continue;
                    }
                    a(am1, i1, j1, k1, false);
                    if (am1.V != null)
                    {
                        flag1 |= am1.V.a();
                    }
                }

                if (!flag1)
                {
                    h();
                }
                if (s && h != null && g == 5)
                {
                    h.d();
                    s = false;
                    return;
                }
            }
        }
    }

    final void a(int i1, boolean flag)
    {
        a(i1, 0, 0, false);
    }

    public final void a(am am1, int i1, int j1)
    {
        int k1;
        if (am1.A > 0)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (k1 == 0)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (!am1.J || k1 != 0)
        {
            if (c != null)
            {
                c.remove(am1);
            }
            if (am1.M && am1.N)
            {
                s = true;
            }
            am1.u = false;
            am1.v = true;
            if (k1 != 0)
            {
                k1 = 0;
            } else
            {
                k1 = 1;
            }
            a(am1, k1, i1, j1, false);
        }
    }

    final void a(am am1, int i1, int j1, int k1, boolean flag)
    {
        int l1;
label0:
        {
            if (am1.u)
            {
                l1 = i1;
                if (!am1.J)
                {
                    break label0;
                }
            }
            l1 = i1;
            if (i1 > 1)
            {
                l1 = 1;
            }
        }
        int j2 = l1;
        if (am1.v)
        {
            j2 = l1;
            if (l1 > am1.j)
            {
                j2 = am1.j;
            }
        }
        i1 = j2;
        if (am1.T)
        {
            i1 = j2;
            if (am1.j < 4)
            {
                i1 = j2;
                if (j2 > 3)
                {
                    i1 = 3;
                }
            }
        }
        if (am1.j >= i1) goto _L2; else goto _L1
_L1:
        int i2;
        int k2;
        int l2;
        if (am1.x && !am1.y)
        {
            return;
        }
        if (am1.k != null)
        {
            am1.k = null;
            a(am1, am1.l, 0, 0, true);
        }
        i2 = i1;
        l2 = i1;
        k2 = i1;
        am1.j;
        JVM INSTR tableswitch 0 4: default 184
    //                   0 194
    //                   1 688
    //                   2 1176
    //                   3 1176
    //                   4 1291;
           goto _L3 _L4 _L5 _L6 _L6 _L7
_L3:
        i2 = i1;
_L16:
        am1.j = i2;
        return;
_L4:
        k2 = i1;
        if (am1.m != null)
        {
            am1.m.setClassLoader(h.b.getClassLoader());
            am1.n = am1.m.getSparseParcelableArray("android:view_state");
            am1.r = a(am1.m, "android:target_state");
            if (am1.r != null)
            {
                am1.t = am1.m.getInt("android:target_req_state", 0);
            }
            am1.U = am1.m.getBoolean("android:user_visible_hint", true);
            k2 = i1;
            if (!am1.U)
            {
                am1.T = true;
                k2 = i1;
                if (i1 > 3)
                {
                    k2 = 3;
                }
            }
        }
        am1.C = h;
        am1.E = r;
        Object obj;
        if (r != null)
        {
            obj = r.D;
        } else
        {
            obj = h.d;
        }
        am1.B = ((bb) (obj));
        am1.O = false;
        am1.O = true;
        if (am1.C == null)
        {
            obj = null;
        } else
        {
            obj = am1.C.a;
        }
        if (obj != null)
        {
            am1.O = false;
            am1.a(((android.app.Activity) (obj)));
        }
        if (!am1.O)
        {
            throw new dv((new StringBuilder("Fragment ")).append(am1).append(" did not call through to super.onAttach()").toString());
        }
        if (am1.E == null)
        {
            h.a(am1);
        }
        if (!am1.L)
        {
            Object obj1 = am1.m;
            if (am1.D != null)
            {
                am1.D.noteStateNotSaved();
            }
            am1.O = false;
            am1.a(((Bundle) (obj1)));
            if (!am1.O)
            {
                throw new dv((new StringBuilder("Fragment ")).append(am1).append(" did not call through to super.onCreate()").toString());
            }
            if (obj1 != null)
            {
                obj1 = ((Bundle) (obj1)).getParcelable("android:support:fragments");
                if (obj1 != null)
                {
                    if (am1.D == null)
                    {
                        am1.R_();
                    }
                    am1.D.a(((Parcelable) (obj1)), ((List) (null)));
                    am1.D.l();
                }
            }
        }
        am1.L = false;
        i2 = k2;
        if (am1.x)
        {
            am1.R = am1.b(am1.b(am1.m), null, am1.m);
            if (am1.R != null)
            {
                am1.S = am1.R;
                Object obj3;
                if (android.os.Build.VERSION.SDK_INT >= 11)
                {
                    mk.a(am1.R, false);
                } else
                {
                    am1.R = cg.a(am1.R);
                }
                if (am1.I)
                {
                    am1.R.setVisibility(8);
                }
                am1.a(am1.R, am1.m);
                i2 = k2;
            } else
            {
                am1.S = null;
                i2 = k2;
            }
        }
_L5:
        l2 = i2;
        if (i2 > 1)
        {
            if (!am1.x)
            {
                Object obj2;
                if (am1.G != 0)
                {
                    obj3 = (ViewGroup)i.a(am1.G);
                    obj2 = obj3;
                    if (obj3 == null)
                    {
                        obj2 = obj3;
                        if (!am1.z)
                        {
                            a(((RuntimeException) (new IllegalArgumentException((new StringBuilder("No view found for id 0x")).append(Integer.toHexString(am1.G)).append(" (").append(am1.g().getResourceName(am1.G)).append(") for fragment ").append(am1).toString()))));
                            obj2 = obj3;
                        }
                    }
                } else
                {
                    obj2 = null;
                }
                am1.Q = ((ViewGroup) (obj2));
                am1.R = am1.b(am1.b(am1.m), ((ViewGroup) (obj2)), am1.m);
                if (am1.R != null)
                {
                    am1.S = am1.R;
                    if (android.os.Build.VERSION.SDK_INT >= 11)
                    {
                        mk.a(am1.R, false);
                    } else
                    {
                        am1.R = cg.a(am1.R);
                    }
                    if (obj2 != null)
                    {
                        obj3 = a(am1, j1, true, k1);
                        if (obj3 != null)
                        {
                            b(am1.R, ((Animation) (obj3)));
                            am1.R.startAnimation(((Animation) (obj3)));
                        }
                        ((ViewGroup) (obj2)).addView(am1.R);
                    }
                    if (am1.I)
                    {
                        am1.R.setVisibility(8);
                    }
                    am1.a(am1.R, am1.m);
                } else
                {
                    am1.S = null;
                }
            }
            obj2 = am1.m;
            if (am1.D != null)
            {
                am1.D.noteStateNotSaved();
            }
            am1.O = false;
            am1.d(((Bundle) (obj2)));
            if (!am1.O)
            {
                throw new dv((new StringBuilder("Fragment ")).append(am1).append(" did not call through to super.onActivityCreated()").toString());
            }
            if (am1.D != null)
            {
                am1.D.m();
            }
            if (am1.R != null)
            {
                obj2 = am1.m;
                if (am1.n != null)
                {
                    am1.S.restoreHierarchyState(am1.n);
                    am1.n = null;
                }
                am1.O = false;
                am1.g(((Bundle) (obj2)));
                if (!am1.O)
                {
                    throw new dv((new StringBuilder("Fragment ")).append(am1).append(" did not call through to super.onViewStateRestored()").toString());
                }
            }
            am1.m = null;
            l2 = i2;
        }
_L6:
        k2 = l2;
        if (l2 > 3)
        {
            if (am1.D != null)
            {
                am1.D.noteStateNotSaved();
                am1.D.i();
            }
            am1.O = false;
            am1.au_();
            if (!am1.O)
            {
                throw new dv((new StringBuilder("Fragment ")).append(am1).append(" did not call through to super.onStart()").toString());
            }
            if (am1.D != null)
            {
                am1.D.n();
            }
            k2 = l2;
            if (am1.V != null)
            {
                am1.V.f();
                k2 = l2;
            }
        }
_L7:
        i2 = k2;
        if (k2 > 4)
        {
            am1.w = true;
            if (am1.D != null)
            {
                am1.D.noteStateNotSaved();
                am1.D.i();
            }
            am1.O = false;
            am1.l();
            if (!am1.O)
            {
                throw new dv((new StringBuilder("Fragment ")).append(am1).append(" did not call through to super.onResume()").toString());
            }
            if (am1.D != null)
            {
                am1.D.o();
                am1.D.i();
            }
            am1.m = null;
            am1.n = null;
            i2 = k2;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        i2 = i1;
        if (am1.j <= i1)
        {
            continue; /* Loop/switch isn't completed */
        }
        am1.j;
        JVM INSTR tableswitch 1 5: default 1464
    //                   1 1470
    //                   2 1673
    //                   3 1664
    //                   4 1598
    //                   5 1525;
           goto _L8 _L9 _L10 _L11 _L12 _L13
_L8:
        i2 = i1;
        break; /* Loop/switch isn't completed */
_L9:
        i2 = i1;
        if (i1 > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (u && am1.k != null)
        {
            obj2 = am1.k;
            am1.k = null;
            ((View) (obj2)).clearAnimation();
        }
        if (am1.k != null)
        {
            am1.l = i1;
            i2 = 1;
            break; /* Loop/switch isn't completed */
        }
          goto _L14
_L13:
        if (i1 < 5)
        {
            if (am1.D != null)
            {
                am1.D.a(4, false);
            }
            am1.O = false;
            am1.m();
            if (!am1.O)
            {
                throw new dv((new StringBuilder("Fragment ")).append(am1).append(" did not call through to super.onPause()").toString());
            }
            am1.w = false;
        }
_L12:
        if (i1 < 4)
        {
            if (am1.D != null)
            {
                am1.D.p();
            }
            am1.O = false;
            am1.aj_();
            if (!am1.O)
            {
                throw new dv((new StringBuilder("Fragment ")).append(am1).append(" did not call through to super.onStop()").toString());
            }
        }
_L11:
        if (i1 < 3)
        {
            am1.S_();
        }
_L10:
        if (i1 < 2)
        {
            if (am1.R != null && h.b() && am1.n == null)
            {
                d(am1);
            }
            if (am1.D != null)
            {
                am1.D.a(1, false);
            }
            am1.O = false;
            am1.ak_();
            if (!am1.O)
            {
                throw new dv((new StringBuilder("Fragment ")).append(am1).append(" did not call through to super.onDestroyView()").toString());
            }
            if (am1.V != null)
            {
                am1.V.e();
            }
            if (am1.R != null && am1.Q != null)
            {
                if (g > 0 && !u)
                {
                    obj2 = a(am1, j1, false, k1);
                } else
                {
                    obj2 = null;
                }
                if (obj2 != null)
                {
                    am1.k = am1.R;
                    am1.l = i1;
                    ((Animation) (obj2)).setAnimationListener(new bg(this, am1.R, ((Animation) (obj2)), am1));
                    am1.R.startAnimation(((Animation) (obj2)));
                }
                am1.Q.removeView(am1.R);
            }
            am1.Q = null;
            am1.R = null;
            am1.S = null;
        }
        if (true) goto _L9; else goto _L14
_L14:
        if (!am1.L)
        {
            if (am1.D != null)
            {
                am1.D.q();
            }
            am1.O = false;
            am1.n();
            if (!am1.O)
            {
                throw new dv((new StringBuilder("Fragment ")).append(am1).append(" did not call through to super.onDestroy()").toString());
            }
        }
        am1.O = false;
        am1.s_();
        if (!am1.O)
        {
            throw new dv((new StringBuilder("Fragment ")).append(am1).append(" did not call through to super.onDetach()").toString());
        }
        i2 = i1;
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!am1.L)
        {
            i2 = i1;
            if (am1.o >= 0)
            {
                b.set(am1.o, null);
                if (o == null)
                {
                    o = new ArrayList();
                }
                o.add(Integer.valueOf(am1.o));
                h.a(am1.p);
                am1.o = -1;
                am1.p = null;
                am1.u = false;
                am1.v = false;
                am1.w = false;
                am1.x = false;
                am1.y = false;
                am1.z = false;
                am1.A = 0;
                am1.B = null;
                am1.D = null;
                am1.C = null;
                am1.F = 0;
                am1.G = 0;
                am1.H = null;
                am1.I = false;
                am1.J = false;
                am1.L = false;
                am1.V = null;
                am1.W = false;
                am1.X = false;
                i2 = i1;
            }
        } else
        {
            am1.C = null;
            am1.E = null;
            am1.B = null;
            am1.D = null;
            i2 = i1;
        }
        if (true) goto _L16; else goto _L15
_L15:
    }

    public final void a(am am1, boolean flag)
    {
        if (c == null)
        {
            c = new ArrayList();
        }
        if (am1.o < 0)
        {
            if (o == null || o.size() <= 0)
            {
                if (b == null)
                {
                    b = new ArrayList();
                }
                am1.a(b.size(), r);
                b.add(am1);
            } else
            {
                am1.a(((Integer)o.remove(o.size() - 1)).intValue(), r);
                b.set(am1.o, am1);
            }
        }
        if (!am1.J)
        {
            if (c.contains(am1))
            {
                throw new IllegalStateException((new StringBuilder("Fragment already added: ")).append(am1).toString());
            }
            c.add(am1);
            am1.u = true;
            am1.v = false;
            if (am1.M && am1.N)
            {
                s = true;
            }
            if (flag)
            {
                c(am1);
            }
        }
    }

    public final void a(Configuration configuration)
    {
        if (c != null)
        {
            for (int i1 = 0; i1 < c.size(); i1++)
            {
                am am1 = (am)c.get(i1);
                if (am1 == null)
                {
                    continue;
                }
                am1.onConfigurationChanged(configuration);
                if (am1.D != null)
                {
                    am1.D.a(configuration);
                }
            }

        }
    }

    public final void a(Bundle bundle, String s1, am am1)
    {
        if (am1.o < 0)
        {
            a(((RuntimeException) (new IllegalStateException((new StringBuilder("Fragment ")).append(am1).append(" is not currently in the FragmentManager").toString()))));
        }
        bundle.putInt(s1, am1.o);
    }

    final void a(Parcelable parcelable, List list)
    {
        boolean flag = false;
        if (parcelable != null) goto _L2; else goto _L1
_L1:
        bj bj1;
        return;
_L2:
        if ((bj1 = (bj)parcelable).a != null)
        {
            if (list != null)
            {
                for (int i1 = 0; i1 < list.size(); i1++)
                {
                    parcelable = (am)list.get(i1);
                    bm bm1 = bj1.a[((am) (parcelable)).o];
                    bm1.k = parcelable;
                    parcelable.n = null;
                    parcelable.A = 0;
                    parcelable.y = false;
                    parcelable.u = false;
                    parcelable.r = null;
                    if (bm1.j != null)
                    {
                        bm1.j.setClassLoader(h.b.getClassLoader());
                        parcelable.n = bm1.j.getSparseParcelableArray("android:view_state");
                        parcelable.m = bm1.j;
                    }
                }

            }
            b = new ArrayList(bj1.a.length);
            if (o != null)
            {
                o.clear();
            }
            int j1 = 0;
            while (j1 < bj1.a.length) 
            {
                bm bm2 = bj1.a[j1];
                if (bm2 != null)
                {
                    parcelable = h;
                    am am1 = r;
                    if (bm2.k != null)
                    {
                        parcelable = bm2.k;
                    } else
                    {
                        Context context = ((ax) (parcelable)).b;
                        if (bm2.i != null)
                        {
                            bm2.i.setClassLoader(context.getClassLoader());
                        }
                        bm2.k = am.a(context, bm2.a, bm2.i);
                        if (bm2.j != null)
                        {
                            bm2.j.setClassLoader(context.getClassLoader());
                            bm2.k.m = bm2.j;
                        }
                        bm2.k.a(bm2.b, am1);
                        bm2.k.x = bm2.c;
                        bm2.k.z = true;
                        bm2.k.F = bm2.d;
                        bm2.k.G = bm2.e;
                        bm2.k.H = bm2.f;
                        bm2.k.K = bm2.g;
                        bm2.k.J = bm2.h;
                        bm2.k.B = ((ax) (parcelable)).d;
                        boolean flag1 = a;
                        parcelable = bm2.k;
                    }
                    b.add(parcelable);
                    bm2.k = null;
                } else
                {
                    b.add(null);
                    if (o == null)
                    {
                        o = new ArrayList();
                    }
                    o.add(Integer.valueOf(j1));
                }
                j1++;
            }
            if (list != null)
            {
                int k1 = 0;
                while (k1 < list.size()) 
                {
                    parcelable = (am)list.get(k1);
                    if (((am) (parcelable)).s >= 0)
                    {
                        if (((am) (parcelable)).s < b.size())
                        {
                            parcelable.r = (am)b.get(((am) (parcelable)).s);
                        } else
                        {
                            Log.w("FragmentManager", (new StringBuilder("Re-attaching retained fragment ")).append(parcelable).append(" target no longer exists: ").append(((am) (parcelable)).s).toString());
                            parcelable.r = null;
                        }
                    }
                    k1++;
                }
            }
            if (bj1.b != null)
            {
                c = new ArrayList(bj1.b.length);
                for (int l1 = 0; l1 < bj1.b.length; l1++)
                {
                    parcelable = (am)b.get(bj1.b[l1]);
                    if (parcelable == null)
                    {
                        a(((RuntimeException) (new IllegalStateException((new StringBuilder("No instantiated fragment for index #")).append(bj1.b[l1]).toString()))));
                    }
                    parcelable.u = true;
                    if (c.contains(parcelable))
                    {
                        throw new IllegalStateException("Already added!");
                    }
                    c.add(parcelable);
                }

            } else
            {
                c = null;
            }
            if (bj1.c != null)
            {
                d = new ArrayList(bj1.c.length);
                int i2 = ((flag) ? 1 : 0);
                while (i2 < bj1.c.length) 
                {
                    parcelable = bj1.c[i2].a(this);
                    d.add(parcelable);
                    if (((ab) (parcelable)).g >= 0)
                    {
                        a(((ab) (parcelable)).g, ((ab) (parcelable)));
                    }
                    i2++;
                }
            } else
            {
                d = null;
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void a(ax ax1, av av1, am am1)
    {
        if (h != null)
        {
            throw new IllegalStateException("Already attached");
        } else
        {
            h = ax1;
            i = av1;
            r = am1;
            return;
        }
    }

    public final void a(ba ba1)
    {
        if (q == null)
        {
            q = new ArrayList();
        }
        q.add(ba1);
    }

    public final void a(Runnable runnable, boolean flag)
    {
        if (!flag)
        {
            s();
        }
        this;
        JVM INSTR monitorenter ;
        if (u || h == null)
        {
            throw new IllegalStateException("Activity has been destroyed");
        }
        break MISSING_BLOCK_LABEL_40;
        runnable;
        this;
        JVM INSTR monitorexit ;
        throw runnable;
        if (l == null)
        {
            l = new ArrayList();
        }
        l.add(runnable);
        if (l.size() == 1)
        {
            h.c.removeCallbacks(y);
            h.c.post(y);
        }
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(String s1, int i1)
    {
        a(((Runnable) (new be(this, s1, 1))), false);
    }

    public final void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        boolean flag;
        flag = false;
        String s2 = (new StringBuilder()).append(s1).append("    ").toString();
        if (b != null)
        {
            int k2 = b.size();
            if (k2 > 0)
            {
                printwriter.print(s1);
                printwriter.print("Active Fragments in ");
                printwriter.print(Integer.toHexString(System.identityHashCode(this)));
                printwriter.println(":");
                for (int i1 = 0; i1 < k2; i1++)
                {
                    am am1 = (am)b.get(i1);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(i1);
                    printwriter.print(": ");
                    printwriter.println(am1);
                    if (am1 != null)
                    {
                        am1.a(s2, filedescriptor, printwriter, as);
                    }
                }

            }
        }
        if (c != null)
        {
            int l2 = c.size();
            if (l2 > 0)
            {
                printwriter.print(s1);
                printwriter.println("Added Fragments:");
                for (int j1 = 0; j1 < l2; j1++)
                {
                    filedescriptor = (am)c.get(j1);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(j1);
                    printwriter.print(": ");
                    printwriter.println(filedescriptor.toString());
                }

            }
        }
        if (p != null)
        {
            int i3 = p.size();
            if (i3 > 0)
            {
                printwriter.print(s1);
                printwriter.println("Fragments Created Menus:");
                for (int k1 = 0; k1 < i3; k1++)
                {
                    filedescriptor = (am)p.get(k1);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(k1);
                    printwriter.print(": ");
                    printwriter.println(filedescriptor.toString());
                }

            }
        }
        if (d != null)
        {
            int j3 = d.size();
            if (j3 > 0)
            {
                printwriter.print(s1);
                printwriter.println("Back Stack:");
                for (int l1 = 0; l1 < j3; l1++)
                {
                    filedescriptor = (ab)d.get(l1);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(l1);
                    printwriter.print(": ");
                    printwriter.println(filedescriptor.toString());
                    filedescriptor.a(s2, printwriter);
                }

            }
        }
        this;
        JVM INSTR monitorenter ;
        if (e == null) goto _L2; else goto _L1
_L1:
        int k3 = e.size();
        if (k3 <= 0) goto _L2; else goto _L3
_L3:
        printwriter.print(s1);
        printwriter.println("Back Stack Indices:");
        int i2 = 0;
_L4:
        if (i2 >= k3)
        {
            break; /* Loop/switch isn't completed */
        }
        filedescriptor = (ab)e.get(i2);
        printwriter.print(s1);
        printwriter.print("  #");
        printwriter.print(i2);
        printwriter.print(": ");
        printwriter.println(filedescriptor);
        i2++;
        if (true) goto _L4; else goto _L2
_L2:
        if (f != null && f.size() > 0)
        {
            printwriter.print(s1);
            printwriter.print("mAvailBackStackIndices: ");
            printwriter.println(Arrays.toString(f.toArray()));
        }
        this;
        JVM INSTR monitorexit ;
        if (l != null)
        {
            int l3 = l.size();
            if (l3 > 0)
            {
                printwriter.print(s1);
                printwriter.println("Pending Actions:");
                for (int j2 = ((flag) ? 1 : 0); j2 < l3; j2++)
                {
                    filedescriptor = (Runnable)l.get(j2);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(j2);
                    printwriter.print(": ");
                    printwriter.println(filedescriptor);
                }

            }
        }
        break MISSING_BLOCK_LABEL_700;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
        printwriter.print(s1);
        printwriter.println("FragmentManager misc state:");
        printwriter.print(s1);
        printwriter.print("  mHost=");
        printwriter.println(h);
        printwriter.print(s1);
        printwriter.print("  mContainer=");
        printwriter.println(i);
        if (r != null)
        {
            printwriter.print(s1);
            printwriter.print("  mParent=");
            printwriter.println(r);
        }
        printwriter.print(s1);
        printwriter.print("  mCurState=");
        printwriter.print(g);
        printwriter.print(" mStateSaved=");
        printwriter.print(t);
        printwriter.print(" mDestroyed=");
        printwriter.println(u);
        if (s)
        {
            printwriter.print(s1);
            printwriter.print("  mNeedMenuInvalidate=");
            printwriter.println(s);
        }
        if (j != null)
        {
            printwriter.print(s1);
            printwriter.print("  mNoTransactionsBecause=");
            printwriter.println(j);
        }
        if (o != null && o.size() > 0)
        {
            printwriter.print(s1);
            printwriter.print("  mAvailIndices: ");
            printwriter.println(Arrays.toString(o.toArray()));
        }
        return;
    }

    public final boolean a(Menu menu)
    {
        if (c == null) goto _L2; else goto _L1
_L1:
        int i1;
        boolean flag2;
        i1 = 0;
        flag2 = false;
_L5:
        boolean flag3 = flag2;
        if (i1 >= c.size()) goto _L4; else goto _L3
_L3:
        am am1 = (am)c.get(i1);
        flag3 = flag2;
        if (am1 != null)
        {
            boolean flag1;
            if (!am1.I)
            {
                boolean flag;
                if (am1.M && am1.N)
                {
                    am1.a(menu);
                    flag = true;
                } else
                {
                    flag = false;
                }
                flag1 = flag;
                if (am1.D != null)
                {
                    flag1 = flag | am1.D.a(menu);
                }
            } else
            {
                flag1 = false;
            }
            flag3 = flag2;
            if (flag1)
            {
                flag3 = true;
            }
        }
        i1++;
        flag2 = flag3;
        if (true) goto _L5; else goto _L4
_L2:
        flag3 = false;
_L4:
        return flag3;
    }

    public final boolean a(Menu menu, MenuInflater menuinflater)
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        boolean flag1;
        flag1 = false;
        arraylist1 = null;
        arraylist = null;
        if (c == null) goto _L2; else goto _L1
_L1:
        int j1;
        boolean flag2;
        j1 = 0;
        flag2 = false;
_L5:
        boolean flag3;
        arraylist1 = arraylist;
        flag3 = flag2;
        if (j1 >= c.size()) goto _L4; else goto _L3
_L3:
        am am1 = (am)c.get(j1);
        if (am1 != null)
        {
            boolean flag;
            if (!am1.I)
            {
                int i1;
                if (am1.M && am1.N)
                {
                    am1.a(menu, menuinflater);
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                flag = i1;
                if (am1.D != null)
                {
                    flag = i1 | am1.D.a(menu, menuinflater);
                }
            } else
            {
                flag = false;
            }
            if (flag)
            {
                arraylist1 = arraylist;
                if (arraylist == null)
                {
                    arraylist1 = new ArrayList();
                }
                arraylist1.add(am1);
                flag2 = true;
                arraylist = arraylist1;
            }
        }
        j1++;
        if (true) goto _L5; else goto _L4
_L2:
        flag3 = false;
_L4:
        if (p != null)
        {
            for (i1 = ((flag1) ? 1 : 0); i1 < p.size(); i1++)
            {
                menu = (am)p.get(i1);
                if (arraylist1 == null || !arraylist1.contains(menu))
                {
                    am.Q_();
                }
            }

        }
        p = arraylist1;
        return flag3;
    }

    public final boolean a(MenuItem menuitem)
    {
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = flag2;
        if (c == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L12:
        flag1 = flag2;
        if (i1 >= c.size()) goto _L2; else goto _L3
_L3:
        am am1 = (am)c.get(i1);
        if (am1 == null) goto _L5; else goto _L4
_L4:
        if (am1.I) goto _L7; else goto _L6
_L6:
        if (!am1.M || !am1.N || !am1.a_(menuitem)) goto _L9; else goto _L8
_L8:
        boolean flag = true;
_L10:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = true;
_L2:
        return flag1;
_L9:
        if (am1.D != null && am1.D.a(menuitem))
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
_L7:
        flag = false;
        if (true) goto _L10; else goto _L5
_L5:
        i1++;
        if (true) goto _L12; else goto _L11
_L11:
    }

    final boolean a(String s1, int i1, int j1)
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (s1 != null || i1 >= 0 || (j1 & 1) != 0) goto _L4; else goto _L3
_L3:
        if ((i1 = d.size() - 1) < 0) goto _L1; else goto _L5
_L5:
        s1 = (ab)d.remove(i1);
        SparseArray sparsearray = new SparseArray();
        SparseArray sparsearray1 = new SparseArray();
        s1.a(sparsearray, sparsearray1);
        s1.a(true, null, sparsearray, sparsearray1);
_L8:
        j();
        return true;
_L4:
        int k1;
        int l1;
        k1 = -1;
        if (s1 == null && i1 < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        l1 = d.size() - 1;
        do
        {
            if (l1 < 0)
            {
                break;
            }
            ab ab1 = (ab)d.get(l1);
            if (s1 != null && s1.equals(ab1.f) || i1 >= 0 && i1 == ab1.g)
            {
                break;
            }
            l1--;
        } while (true);
        if (l1 < 0) goto _L1; else goto _L6
_L6:
        k1 = l1;
        if ((j1 & 1) != 0)
        {
            j1 = l1 - 1;
            do
            {
                k1 = j1;
                if (j1 < 0)
                {
                    break;
                }
                ab ab2 = (ab)d.get(j1);
                if (s1 == null || !s1.equals(ab2.f))
                {
                    k1 = j1;
                    if (i1 < 0)
                    {
                        break;
                    }
                    k1 = j1;
                    if (i1 != ab2.g)
                    {
                        break;
                    }
                }
                j1--;
            } while (true);
        }
        if (k1 == d.size() - 1) goto _L1; else goto _L7
_L7:
        ArrayList arraylist = new ArrayList();
        for (i1 = d.size() - 1; i1 > k1; i1--)
        {
            arraylist.add(d.remove(i1));
        }

        j1 = arraylist.size() - 1;
        SparseArray sparsearray2 = new SparseArray();
        SparseArray sparsearray3 = new SparseArray();
        for (i1 = 0; i1 <= j1; i1++)
        {
            ((ab)arraylist.get(i1)).a(sparsearray2, sparsearray3);
        }

        s1 = null;
        i1 = 0;
        while (i1 <= j1) 
        {
            ab ab3 = (ab)arraylist.get(i1);
            boolean flag;
            if (i1 == j1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s1 = ab3.a(flag, s1, sparsearray2, sparsearray3);
            i1++;
        }
          goto _L8
    }

    public final az b(int i1)
    {
        return (az)d.get(i1);
    }

    public final void b(am am1)
    {
label0:
        {
            if (am1.T)
            {
                if (!n)
                {
                    break label0;
                }
                v = true;
            }
            return;
        }
        am1.T = false;
        a(am1, g, 0, 0, false);
    }

    public final void b(am am1, int i1, int j1)
    {
        if (!am1.I)
        {
            am1.I = true;
            if (am1.R != null)
            {
                Animation animation = a(am1, i1, false, j1);
                if (animation != null)
                {
                    b(am1.R, animation);
                    am1.R.startAnimation(animation);
                }
                am1.R.setVisibility(8);
            }
            if (am1.u && am1.M && am1.N)
            {
                s = true;
            }
            am.P_();
        }
    }

    public final void b(Menu menu)
    {
        if (c != null)
        {
            for (int i1 = 0; i1 < c.size(); i1++)
            {
                am am1 = (am)c.get(i1);
                if (am1 != null && !am1.I && am1.D != null)
                {
                    am1.D.b(menu);
                }
            }

        }
    }

    public final boolean b()
    {
        return i();
    }

    public final boolean b(MenuItem menuitem)
    {
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = flag2;
        if (c == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L12:
        flag1 = flag2;
        if (i1 >= c.size()) goto _L2; else goto _L3
_L3:
        am am1 = (am)c.get(i1);
        if (am1 == null) goto _L5; else goto _L4
_L4:
        if (am1.I) goto _L7; else goto _L6
_L6:
        if (!am1.b(menuitem)) goto _L9; else goto _L8
_L8:
        boolean flag = true;
_L10:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = true;
_L2:
        return flag1;
_L9:
        if (am1.D != null && am1.D.b(menuitem))
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
_L7:
        flag = false;
        if (true) goto _L10; else goto _L5
_L5:
        i1++;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public final void c()
    {
        a(new bd(this), false);
    }

    public final void c(am am1, int i1, int j1)
    {
        if (am1.I)
        {
            am1.I = false;
            if (am1.R != null)
            {
                Animation animation = a(am1, i1, true, j1);
                if (animation != null)
                {
                    b(am1.R, animation);
                    am1.R.startAnimation(animation);
                }
                am1.R.setVisibility(0);
            }
            if (am1.u && am1.M && am1.N)
            {
                s = true;
            }
            am.P_();
        }
    }

    public final void d(am am1, int i1, int j1)
    {
        if (!am1.J)
        {
            am1.J = true;
            if (am1.u)
            {
                if (c != null)
                {
                    c.remove(am1);
                }
                if (am1.M && am1.N)
                {
                    s = true;
                }
                am1.u = false;
                a(am1, 1, i1, j1, false);
            }
        }
    }

    public final boolean d()
    {
        s();
        i();
        return a(((String) (null)), -1, 0);
    }

    public final int e()
    {
        if (d != null)
        {
            return d.size();
        } else
        {
            return 0;
        }
    }

    public final void e(am am1, int i1, int j1)
    {
        if (am1.J)
        {
            am1.J = false;
            if (!am1.u)
            {
                if (c == null)
                {
                    c = new ArrayList();
                }
                if (c.contains(am1))
                {
                    throw new IllegalStateException((new StringBuilder("Fragment already added: ")).append(am1).toString());
                }
                c.add(am1);
                am1.u = true;
                if (am1.M && am1.N)
                {
                    s = true;
                }
                a(am1, g, i1, j1, false);
            }
        }
    }

    public final List f()
    {
        return b;
    }

    public final boolean g()
    {
        return u;
    }

    final void h()
    {
        if (b != null)
        {
            int i1 = 0;
            while (i1 < b.size()) 
            {
                am am1 = (am)b.get(i1);
                if (am1 != null)
                {
                    b(am1);
                }
                i1++;
            }
        }
    }

    public final boolean i()
    {
        if (n)
        {
            throw new IllegalStateException("Recursive entry to executePendingTransactions");
        }
        if (Looper.myLooper() != h.c.getLooper())
        {
            throw new IllegalStateException("Must be called from main thread of process");
        }
        boolean flag = false;
_L2:
        this;
        JVM INSTR monitorenter ;
        if (l != null && l.size() != 0)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        this;
        JVM INSTR monitorexit ;
        int k1;
        if (!v)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        int i1 = 0;
        int l1;
        for (k1 = 0; i1 < b.size(); k1 = l1)
        {
            am am1 = (am)b.get(i1);
            l1 = k1;
            if (am1 != null)
            {
                l1 = k1;
                if (am1.V != null)
                {
                    l1 = k1 | am1.V.a();
                }
            }
            i1++;
        }

        break; /* Loop/switch isn't completed */
        k1 = l.size();
        if (m == null || m.length < k1)
        {
            m = new Runnable[k1];
        }
        l.toArray(m);
        l.clear();
        h.c.removeCallbacks(y);
        this;
        JVM INSTR monitorexit ;
        n = true;
        for (int j1 = 0; j1 < k1; j1++)
        {
            m[j1].run();
            m[j1] = null;
        }

        break MISSING_BLOCK_LABEL_250;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        n = false;
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
        if (k1 == 0)
        {
            v = false;
            h();
        }
        return flag;
    }

    final void j()
    {
        if (q != null)
        {
            for (int i1 = 0; i1 < q.size(); i1++)
            {
                ((ba)q.get(i1)).aa_();
            }

        }
    }

    final Parcelable k()
    {
        bj bj1;
        bj1 = null;
        i();
        if (k)
        {
            t = true;
        }
        if (b != null && b.size() > 0) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        bm abm[];
        boolean flag;
        int k1;
        int j2;
        j2 = b.size();
        abm = new bm[j2];
        k1 = 0;
        flag = false;
_L4:
        am am1;
        bm bm1;
        if (k1 >= j2)
        {
            continue; /* Loop/switch isn't completed */
        }
        am1 = (am)b.get(k1);
        if (am1 != null)
        {
            if (am1.o < 0)
            {
                a(new IllegalStateException((new StringBuilder("Failure saving state: active ")).append(am1).append(" has cleared index: ").append(am1.o).toString()));
            }
            bm1 = new bm(am1);
            abm[k1] = bm1;
            if (am1.j <= 0 || bm1.j != null)
            {
                break; /* Loop/switch isn't completed */
            }
            bm1.j = e(am1);
            if (am1.r == null)
            {
                break MISSING_BLOCK_LABEL_301;
            }
            if (am1.r.o < 0)
            {
                a(new IllegalStateException((new StringBuilder("Failure saving state: ")).append(am1).append(" has target not in fragment manager: ").append(am1.r).toString()));
            }
            if (bm1.j == null)
            {
                bm1.j = new Bundle();
            }
            a(bm1.j, "android:target_state", am1.r);
            if (am1.t == 0)
            {
                break MISSING_BLOCK_LABEL_301;
            }
            bm1.j.putInt("android:target_req_state", am1.t);
            flag = true;
        }
_L5:
        k1++;
        if (true) goto _L4; else goto _L3
_L3:
        bm1.j = am1.m;
        flag = true;
          goto _L5
        if (!flag) goto _L1; else goto _L6
_L6:
        int ai[];
label0:
        {
            if (c != null)
            {
                int l1 = c.size();
                if (l1 > 0)
                {
                    int ai1[] = new int[l1];
                    int i1 = 0;
                    do
                    {
                        ai = ai1;
                        if (i1 >= l1)
                        {
                            break;
                        }
                        ai1[i1] = ((am)c.get(i1)).o;
                        if (ai1[i1] < 0)
                        {
                            a(new IllegalStateException((new StringBuilder("Failure saving state: active ")).append(c.get(i1)).append(" has cleared index: ").append(ai1[i1]).toString()));
                        }
                        i1++;
                    } while (true);
                    break label0;
                }
            }
            ai = null;
        }
        ah aah[] = bj1;
        if (d != null)
        {
            int i2 = d.size();
            aah = bj1;
            if (i2 > 0)
            {
                ah aah1[] = new ah[i2];
                int j1 = 0;
                do
                {
                    aah = aah1;
                    if (j1 >= i2)
                    {
                        break;
                    }
                    aah1[j1] = new ah((ab)d.get(j1));
                    j1++;
                } while (true);
            }
        }
        aah1 = new bj();
        aah1.a = abm;
        aah1.b = ai;
        aah1.c = aah;
        return aah1;
    }

    public final void l()
    {
        t = false;
        a(1, false);
    }

    public final void m()
    {
        t = false;
        a(2, false);
    }

    public final void n()
    {
        t = false;
        a(4, false);
    }

    public final void noteStateNotSaved()
    {
        t = false;
    }

    public final void o()
    {
        t = false;
        a(5, false);
    }

    public final void p()
    {
        t = true;
        a(3, false);
    }

    public final void q()
    {
        u = true;
        i();
        a(0, false);
        h = null;
        i = null;
        r = null;
    }

    public final void r()
    {
        if (c != null)
        {
            for (int i1 = 0; i1 < c.size(); i1++)
            {
                am am1 = (am)c.get(i1);
                if (am1 == null)
                {
                    continue;
                }
                am1.onLowMemory();
                if (am1.D != null)
                {
                    am1.D.r();
                }
            }

        }
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("FragmentManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        if (r != null)
        {
            b.a(r, stringbuilder);
        } else
        {
            b.a(h, stringbuilder);
        }
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

    static 
    {
        boolean flag = false;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        }
        k = flag;
        new AccelerateInterpolator(2.5F);
        new AccelerateInterpolator(1.5F);
    }
}
