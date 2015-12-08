// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.rx;

import android.view.View;
import rx.functions.Action1;

public class VisibilityBinding
    implements Action1
{

    private View view;

    public VisibilityBinding(View view1)
    {
        view = view1;
    }

    public void call(Boolean boolean1)
    {
        View view1 = view;
        int i;
        if (boolean1.booleanValue())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view1.setVisibility(i);
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }
}
