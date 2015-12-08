// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.kik.cache.ad;
import com.kik.e.a;
import kik.a.d.aa;
import kik.a.e.w;
import kik.android.chat.fragment.KikScopedDialogFragment;

// Referenced classes of package kik.android.widget.preferences:
//            KikModalPreference, bp, bq

public class UsernamePreference extends KikModalPreference
{

    protected w a;
    protected com.kik.android.a c;
    ad d;
    private Context e;

    public UsernamePreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, com.kik.d.b.a.c.w);
        e = context;
    }

    static Context a(UsernamePreference usernamepreference)
    {
        return usernamepreference.e;
    }

    public final void a(a a1)
    {
        a1.a(this);
    }

    protected void onBindView(View view)
    {
        super.onBindView(view);
        view = (TextView)view.findViewById(0x7f0e01c1);
        aa aa1 = a.d();
        if (view != null)
        {
            view.setText(aa1.c);
        }
    }

    public boolean onPreferenceClick(Preference preference)
    {
        String s = b().getString(0x7f0902a6);
        String s1 = b().getString(0x7f0900f5);
        kik.android.chat.fragment.KikDialogFragment.a a1 = new kik.android.chat.fragment.KikDialogFragment.a(b().getResources());
        a1.a(b().getString(0x7f0902c9));
        bp bp1 = new bp(this);
        a1.a(new CharSequence[] {
            s, s1
        }, bp1);
        a1.a(new bq(this, preference));
        b().a(a1.a(), kik.android.chat.fragment.KikScopedDialogFragment.a.b, "namePreference");
        return false;
    }
}
