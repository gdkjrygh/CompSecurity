// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.WindowInsets;

public final class mw
    implements android.view.View.OnApplyWindowInsetsListener
{

    private mc a;

    public mw(mc mc1)
    {
        a = mc1;
        super();
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
    {
        windowinsets = new os(windowinsets);
        return ((os)a.a(view, windowinsets)).a;
    }
}
