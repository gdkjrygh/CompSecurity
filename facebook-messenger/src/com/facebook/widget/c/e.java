// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.c;

import android.content.Context;
import android.view.View;
import com.facebook.inject.t;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.f;

// Referenced classes of package com.facebook.widget.c:
//            d, f

public class e extends com.facebook.widget.c.d
{

    private final f a = new com.facebook.widget.c.f(this);

    public e(Context context)
    {
        super(context);
        context = (d)t.a(context).a(com/facebook/prefs/shared/d);
        context.a(a);
    }

    private void a()
    {
        int j = findIndexOfValue(getValue());
        int i = j;
        if (j == -1)
        {
            i = 0;
        }
        setSummary(getEntries()[i]);
    }

    static void a(e e1)
    {
        e1.a();
    }

    protected void onBindView(View view)
    {
        a();
        super.onBindView(view);
    }
}
