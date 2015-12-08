// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.kik.e.a;
import com.kik.m.p;
import kik.a.e.e;
import kik.android.chat.fragment.KikScopedDialogFragment;

// Referenced classes of package kik.android.widget.preferences:
//            t, KikPreference, u

public abstract class KikModalPreference extends Preference
    implements android.preference.Preference.OnPreferenceClickListener, p
{

    private String a;
    protected e b;
    private com.kik.d.b.a.c c;
    private KikScopedDialogFragment d;
    private int e;
    private boolean f;
    private boolean g;
    private View h;

    public KikModalPreference(Context context, AttributeSet attributeset, int i, com.kik.d.b.a.c c1)
    {
        super(context, attributeset, i);
        f = false;
        g = false;
        setLayoutResource(0x7f030088);
        c = c1;
        context = context.obtainStyledAttributes(attributeset, kik.android.ag.b.k);
        e = context.getInt(0, 0);
        setOnPreferenceClickListener(new t(this));
        context.recycle();
    }

    public KikModalPreference(Context context, AttributeSet attributeset, com.kik.d.b.a.c c1)
    {
        this(context, attributeset, 0, c1);
    }

    static com.kik.d.b.a.c a(KikModalPreference kikmodalpreference)
    {
        return kikmodalpreference.c;
    }

    public final void a()
    {
        g = true;
    }

    public void a(a a1)
    {
        a1.a(this);
    }

    public final void a(KikScopedDialogFragment kikscopeddialogfragment)
    {
        d = kikscopeddialogfragment;
    }

    public final void a(boolean flag)
    {
        f = flag;
    }

    protected final KikScopedDialogFragment b()
    {
        return d;
    }

    public final View c()
    {
        return h;
    }

    protected void onBindView(View view)
    {
        super.onBindView(view);
        h = view;
        kik.android.widget.preferences.KikPreference.a(view, e);
        TextView textview = (TextView)view.findViewById(0x7f0e01c1);
        if (textview != null)
        {
            if (a != null)
            {
                textview.setText(a);
            }
            if (f)
            {
                kik.android.widget.preferences.KikPreference.a(view, g, this);
            }
        }
    }

    public void setOnPreferenceClickListener(android.preference.Preference.OnPreferenceClickListener onpreferenceclicklistener)
    {
        super.setOnPreferenceClickListener(new u(this, onpreferenceclicklistener));
    }
}
