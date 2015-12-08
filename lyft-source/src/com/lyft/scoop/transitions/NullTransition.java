// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.lyft.scoop.transitions;

import android.view.View;
import android.view.ViewGroup;
import com.lyft.scoop.IScreenTransition;

public class NullTransition
    implements IScreenTransition
{

    public static final NullTransition a = new NullTransition();

    public NullTransition()
    {
    }

    public void a(ViewGroup viewgroup, View view, View view1)
    {
        viewgroup.removeView(view);
    }

}
