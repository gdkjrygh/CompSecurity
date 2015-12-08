// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.kik.e.a;
import com.kik.m.p;
import kik.a.e.e;
import kik.android.chat.fragment.KikScopedDialogFragment;
import kik.android.chat.fragment.ProgressDialogFragment;
import kik.android.util.av;
import kik.android.util.cv;

// Referenced classes of package kik.android.widget.preferences:
//            x, ab, y, w, 
//            aa

public abstract class KikPreference extends Preference
    implements android.preference.Preference.OnPreferenceClickListener, p
{

    protected e a;
    private boolean b;
    private boolean c;
    private View d;
    private com.kik.d.b.a.c e;
    private Drawable f;
    private KikScopedDialogFragment g;
    private int h;

    public KikPreference(Context context, AttributeSet attributeset, int i, com.kik.d.b.a.c c1)
    {
        super(context, attributeset, i);
        b = false;
        c = false;
        setLayoutResource(0x7f030086);
        f = context.obtainStyledAttributes(attributeset, kik.android.ag.b.k, i, 0).getDrawable(1);
        e = c1;
        h = context.obtainStyledAttributes(attributeset, kik.android.ag.b.k).getInt(0, 0);
        setOnPreferenceClickListener(new x(this));
    }

    public KikPreference(Context context, AttributeSet attributeset, com.kik.d.b.a.c c1)
    {
        this(context, attributeset, 0, c1);
    }

    static com.kik.d.b.a.c a(KikPreference kikpreference)
    {
        return kikpreference.e;
    }

    public static void a(View view, int i)
    {
        View view1 = view.findViewById(0x7f0e01bc);
        View view2 = view.findViewById(0x7f0e01c0);
        if (view1 != null)
        {
            if ((i & 5) == 0)
            {
                view1.setVisibility(8);
            } else
            {
                view1.setVisibility(0);
            }
            if ((i & 4) != 0)
            {
                view1.setBackgroundDrawable(view.getResources().getDrawable(0x7f020122));
            }
        }
        if (view2 != null)
        {
            if ((i & 0xa) == 0)
            {
                view2.setVisibility(8);
            } else
            {
                view2.setVisibility(0);
            }
            if ((i & 8) != 0)
            {
                view2.setBackgroundDrawable(view.getResources().getDrawable(0x7f020122));
                view2.setPadding(0, 0, 0, 0);
            }
        }
    }

    public static void a(View view, Preference preference)
    {
        View view1 = view.findViewById(0x7f0e01be);
        if (cv.c(view1) && (view1.getAnimation() == null || view1.getAnimation().hasEnded() || !view1.getAnimation().hasStarted()))
        {
            view.clearAnimation();
            av.a(view1, 300, new ab(preference));
        }
    }

    public static void a(View view, boolean flag, Preference preference)
    {
        View view1 = view.findViewById(0x7f0e01be);
        View view2 = view.findViewById(0x7f0e01bf);
        if (cv.d(view1))
        {
            cv.b(new View[] {
                view1
            });
            if (!flag)
            {
                view2.getBackground().mutate().setAlpha(51);
                cv.b(new View[] {
                    view2
                });
                view.postDelayed(new y(view2, view, preference), 20L);
            }
        }
    }

    public static void a(String s, com.kik.g.p p1, KikScopedDialogFragment kikscopeddialogfragment)
    {
        if (!p1.g())
        {
            s = new ProgressDialogFragment(s, false);
            s.e();
            s.setCancelable(false);
            kikscopeddialogfragment.a(s);
            p1.a(new w(s));
        }
    }

    public final void a()
    {
        c = true;
    }

    public void a(a a1)
    {
        a1.a(this);
    }

    public final void a(KikScopedDialogFragment kikscopeddialogfragment)
    {
        g = kikscopeddialogfragment;
    }

    public final void a(boolean flag)
    {
        b = flag;
    }

    protected final KikScopedDialogFragment b()
    {
        return g;
    }

    public final View c()
    {
        return d;
    }

    protected void onBindView(View view)
    {
        super.onBindView(view);
        d = view;
        a(view, h);
        ImageView imageview = (ImageView)view.findViewById(0x7f0e003a);
        if (imageview != null)
        {
            if (f != null)
            {
                imageview.setImageDrawable(f);
            } else
            {
                imageview.setVisibility(8);
            }
        }
        if (b)
        {
            a(view, c, this);
        }
    }

    public void setOnPreferenceClickListener(android.preference.Preference.OnPreferenceClickListener onpreferenceclicklistener)
    {
        super.setOnPreferenceClickListener(new aa(this, onpreferenceclicklistener));
    }
}
