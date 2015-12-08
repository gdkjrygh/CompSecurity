// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.preference.ListPreference;
import android.util.AttributeSet;
import android.view.View;
import com.kik.m.p;
import kik.android.util.cv;

// Referenced classes of package kik.android.widget.preferences:
//            KikPreference, s

public class KikListPreference extends ListPreference
    implements p
{

    private final int a;
    private boolean b;
    private boolean c;
    private View d;
    private boolean e;

    public KikListPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = false;
        c = false;
        e = false;
        setLayoutResource(0x7f030088);
        setOnPreferenceClickListener(null);
        a = context.obtainStyledAttributes(attributeset, kik.android.ag.b.k).getInt(0, 0);
    }

    public final void a()
    {
        c = true;
    }

    public final void a(boolean flag)
    {
        b = flag;
    }

    public final void b()
    {
        e = false;
    }

    protected void onBindView(View view)
    {
        View view1;
        super.onBindView(view);
        d = view;
        view1 = view.findViewById(0x7f0e01be);
        if (!b) goto _L2; else goto _L1
_L1:
        KikPreference.a(view, c, this);
_L4:
        KikPreference.a(view, a);
        return;
_L2:
        if (e)
        {
            cv.b(new View[] {
                view1
            });
            KikPreference.a(view, this);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onDialogClosed(boolean flag)
    {
        KikPreference.a(d, this);
        b = false;
        if (flag && cv.c(d.findViewById(0x7f0e01be)))
        {
            e = true;
        }
        super.onDialogClosed(flag);
    }

    public void setOnPreferenceClickListener(android.preference.Preference.OnPreferenceClickListener onpreferenceclicklistener)
    {
        super.setOnPreferenceClickListener(new s(this, onpreferenceclicklistener));
    }
}
