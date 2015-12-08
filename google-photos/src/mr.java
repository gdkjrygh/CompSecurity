// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

class mr extends mq
{

    mr()
    {
    }

    public final int h(View view)
    {
        return view.getLayoutDirection();
    }

    public final int l(View view)
    {
        return view.getPaddingStart();
    }

    public final int m(View view)
    {
        return view.getPaddingEnd();
    }

    public final int t(View view)
    {
        return view.getWindowSystemUiVisibility();
    }
}
