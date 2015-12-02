// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.c;

import android.content.Context;
import android.preference.EditTextPreference;
import android.view.View;
import com.facebook.common.w.n;
import com.facebook.inject.t;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.f;

// Referenced classes of package com.facebook.widget.c:
//            b

public class a extends EditTextPreference
{

    private f a;
    private CharSequence b;

    public a(Context context)
    {
        super(context);
        a(context);
    }

    private void a()
    {
        String s = getText();
        if (n.a(s))
        {
            setSummary(b);
            return;
        } else
        {
            setSummary(s);
            return;
        }
    }

    private void a(Context context)
    {
        context = (d)t.a(context).a(com/facebook/prefs/shared/d);
        a = new b(this, getKey());
        context.a(a);
        b = getSummary();
    }

    static void a(a a1)
    {
        a1.a();
    }

    public void a(CharSequence charsequence)
    {
        b = charsequence;
        a();
    }

    protected void onBindView(View view)
    {
        a();
        super.onBindView(view);
    }
}
