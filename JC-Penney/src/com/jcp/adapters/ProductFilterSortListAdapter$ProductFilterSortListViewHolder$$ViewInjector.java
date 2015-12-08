// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class a
    implements butterknife.ctor
{

    public void inject(butterknife.ctor ctor, a a, Object obj)
    {
        a.a = (TextView)ctor.ctor((View)ctor.ctor(obj, 0x7f0e005a, "field 'mTitle'"), 0x7f0e005a, "field 'mTitle'");
        a.a = (CheckBox)ctor.((View)ctor.(obj, 0x7f0e03c0, "field 'mCheckBox'"), 0x7f0e03c0, "field 'mCheckBox'");
        a.a = (ImageView)ctor.n((View)ctor.n(obj, 0x7f0e03c2, "field 'mColorIcon'"), 0x7f0e03c2, "field 'mColorIcon'");
        a.a = (RelativeLayout)ctor.t((View)ctor.t(obj, 0x7f0e03bf, "field 'mRowLayout'"), 0x7f0e03bf, "field 'mRowLayout'");
    }

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (inject)obj, obj1);
    }

    public void reset(inject inject1)
    {
        inject1.inject = null;
        inject1.inject = null;
        inject1.inject = null;
        inject1.inject = null;
    }

    public volatile void reset(Object obj)
    {
        reset((reset)obj);
    }

    public a()
    {
    }
}
