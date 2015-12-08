// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import com.kik.cache.ad;
import com.kik.e.a;
import kik.a.e.w;
import kik.android.util.cc;

// Referenced classes of package kik.android.widget.preferences:
//            KikPreference

public class ShareProfilePreference extends KikPreference
{

    protected com.kik.android.a b;
    protected w c;
    ad d;
    private Context e;

    public ShareProfilePreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, null);
        e = context;
    }

    public ShareProfilePreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i, null);
        e = context;
    }

    public final void a(a a1)
    {
        a1.a(this);
    }

    public boolean onPreferenceClick(Preference preference)
    {
        cc.a(c.d(), e, b, d);
        return true;
    }
}
