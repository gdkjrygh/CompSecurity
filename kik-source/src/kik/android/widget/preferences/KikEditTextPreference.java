// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.preference.EditTextPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.kik.e.a;
import com.kik.m.p;
import kik.a.e.e;
import kik.android.chat.fragment.KikDialogFragment;
import kik.android.chat.fragment.KikScopedDialogFragment;
import kik.android.util.cv;

// Referenced classes of package kik.android.widget.preferences:
//            j, KikPreference, k

public abstract class KikEditTextPreference extends EditTextPreference
    implements android.preference.Preference.OnPreferenceChangeListener, p
{

    protected e a;
    private final String b;
    private final int c;
    private com.kik.d.b.a.c d;
    private KikScopedDialogFragment e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private View j;

    public KikEditTextPreference(Context context, AttributeSet attributeset, int l, com.kik.d.b.a.c c1)
    {
        super(context, attributeset, l);
        f = false;
        g = false;
        h = false;
        i = false;
        d = c1;
        if (getTitle() != null)
        {
            c1 = getTitle().toString();
        } else
        {
            c1 = null;
        }
        b = c1;
        setLayoutResource(0x7f030088);
        c = context.obtainStyledAttributes(attributeset, kik.android.ag.b.k).getInt(0, 0);
        setOnPreferenceChangeListener(new j(this));
    }

    public KikEditTextPreference(Context context, AttributeSet attributeset, com.kik.d.b.a.c c1)
    {
        this(context, attributeset, 0x1010092, c1);
    }

    static com.kik.d.b.a.c a(KikEditTextPreference kikedittextpreference)
    {
        return kikedittextpreference.d;
    }

    public final void a()
    {
        h = true;
    }

    public void a(a a1)
    {
        a1.a(this);
    }

    public final void a(KikDialogFragment kikdialogfragment, kik.android.chat.fragment.KikScopedDialogFragment.a a1, String s)
    {
        e.a(kikdialogfragment, a1, s);
    }

    public final void a(KikScopedDialogFragment kikscopeddialogfragment)
    {
        e = kikscopeddialogfragment;
    }

    public final void a(boolean flag)
    {
        f = flag;
    }

    protected final KikScopedDialogFragment b()
    {
        return e;
    }

    public final void c()
    {
        if (cv.c(j.findViewById(0x7f0e01be)))
        {
            g = true;
            f = false;
        }
    }

    public final void d()
    {
        i = true;
    }

    public final void e()
    {
        g = false;
    }

    protected void onBindView(View view)
    {
        Object obj;
        super.onBindView(view);
        j = view;
        obj = (TextView)view.findViewById(0x1020016);
        if (obj == null) goto _L2; else goto _L1
_L1:
        ((TextView) (obj)).setText(b);
        obj = view.findViewById(0x7f0e01be);
        if (!f) goto _L4; else goto _L3
_L3:
        kik.android.widget.preferences.KikPreference.a(view, h, this);
_L2:
        obj = (TextView)view.findViewById(0x7f0e01c1);
        if (obj != null)
        {
            ((TextView) (obj)).setText(getText());
        }
        kik.android.widget.preferences.KikPreference.a(view, c);
        return;
_L4:
        if (g && !i)
        {
            cv.b(new View[] {
                obj
            });
            kik.android.widget.preferences.KikPreference.a(j, this);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void setOnPreferenceChangeListener(android.preference.Preference.OnPreferenceChangeListener onpreferencechangelistener)
    {
        super.setOnPreferenceChangeListener(new k(this, onpreferencechangelistener));
    }
}
