// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.preference.CheckBoxPreference;
import android.util.AttributeSet;
import android.view.View;
import com.kik.d.f;
import com.kik.e.a;
import com.kik.m.p;
import java.util.HashMap;
import java.util.Map;
import kik.a.e.e;
import kik.a.h.j;
import kik.android.chat.fragment.KikScopedDialogFragment;
import kik.android.util.cv;

// Referenced classes of package kik.android.widget.preferences:
//            KikPreference, h

public abstract class KikCheckBoxPreference extends CheckBoxPreference
    implements android.preference.Preference.OnPreferenceChangeListener, p
{

    protected e a;
    private com.kik.d.b.a.c b;
    private KikScopedDialogFragment c;
    private boolean d;
    private final int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private View j;

    public KikCheckBoxPreference(Context context, AttributeSet attributeset, int k, com.kik.d.b.a.c c1)
    {
        super(context, attributeset, k);
        d = false;
        f = false;
        g = false;
        h = false;
        i = false;
        setLayoutResource(0x7f030085);
        setWidgetLayoutResource(0x7f030057);
        b = c1;
        setOnPreferenceChangeListener(null);
        e = context.obtainStyledAttributes(attributeset, kik.android.ag.b.k).getInt(0, 0);
    }

    public KikCheckBoxPreference(Context context, AttributeSet attributeset, com.kik.d.b.a.c c1)
    {
        this(context, attributeset, 0, c1);
    }

    static com.kik.d.b.a.c a(KikCheckBoxPreference kikcheckboxpreference)
    {
        return kikcheckboxpreference.b;
    }

    public final void a()
    {
        h = true;
    }

    public void a(a a1)
    {
        a1.a(this);
    }

    public final void a(KikScopedDialogFragment kikscopeddialogfragment)
    {
        c = kikscopeddialogfragment;
    }

    public final void a(boolean flag)
    {
        f = flag;
    }

    protected final KikScopedDialogFragment b()
    {
        return c;
    }

    public final void c()
    {
        View view = j.findViewById(0x7f0e01be);
        if (view != null && view.getVisibility() == 0)
        {
            g = true;
            f = false;
        }
    }

    public final View d()
    {
        return j;
    }

    public final void e()
    {
        i = true;
    }

    public final void f()
    {
        f = false;
    }

    protected void onBindView(View view)
    {
        View view1;
        super.onBindView(view);
        j = view;
        view1 = view.findViewById(0x7f0e01be);
        if (!f) goto _L2; else goto _L1
_L1:
        kik.android.widget.preferences.KikPreference.a(view, h, this);
_L4:
        kik.android.widget.preferences.KikPreference.a(view, e);
        d = true;
        return;
_L2:
        if (g && !i)
        {
            cv.b(new View[] {
                view1
            });
            kik.android.widget.preferences.KikPreference.a(j, this);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setChecked(boolean flag)
    {
        if (isChecked() != flag && d && a != null)
        {
            HashMap hashmap = new HashMap();
            hashmap.put("s", Long.valueOf(b.a()));
            a.c().a(com.kik.d.b.a.k.M, null, null, hashmap, kik.a.h.j.b());
        }
        super.setChecked(flag);
    }

    public void setOnPreferenceChangeListener(android.preference.Preference.OnPreferenceChangeListener onpreferencechangelistener)
    {
        super.setOnPreferenceChangeListener(new h(this, onpreferencechangelistener));
    }
}
