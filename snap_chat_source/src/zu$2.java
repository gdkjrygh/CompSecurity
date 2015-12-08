// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.squareup.otto.Bus;

final class lang.Object
    implements android.view.OnClickListener
{

    private zu a;

    public final void onClick(View view)
    {
        a.m.hideSoftInputFromWindow(view.getWindowToken(), 0);
        a.l.a(new NU(a.r));
    }

    >(zu zu1)
    {
        a = zu1;
        super();
    }
}
