// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import com.kik.e.a;
import kik.android.chat.fragment.settings.d;

// Referenced classes of package kik.android.widget.preferences:
//            KikPreference

public class KikPreferenceScreen extends KikPreference
{

    int b;
    private int c;
    private int d;
    private int e;

    public KikPreferenceScreen(Context context, AttributeSet attributeset, int i, com.kik.d.b.a.c c1)
    {
        super(context, attributeset, i, c1);
        b = 0;
        setLayoutResource(0x7f030086);
        c1 = context.obtainStyledAttributes(attributeset, kik.android.ag.b.l, i, 0);
        b = c1.getResourceId(0, 0);
        c = c1.getResourceId(1, 0);
        e = c1.getResourceId(2, 0);
        d = context.obtainStyledAttributes(attributeset, kik.android.ag.b.k).getInt(0, 0);
        c1.recycle();
    }

    public KikPreferenceScreen(Context context, AttributeSet attributeset, com.kik.d.b.a.c c1)
    {
        this(context, attributeset, 0x101008b, c1);
    }

    public final void a(a a1)
    {
        a1.a(this);
    }

    public final int d()
    {
        return b;
    }

    public final int e()
    {
        return e;
    }

    protected void onBindView(View view)
    {
        super.onBindView(view);
        kik.android.widget.preferences.KikPreference.a(view, d);
    }

    public boolean onPreferenceClick(Preference preference)
    {
        preference = b();
        if (preference instanceof d)
        {
            ((d)preference).b();
        }
        return false;
    }
}
