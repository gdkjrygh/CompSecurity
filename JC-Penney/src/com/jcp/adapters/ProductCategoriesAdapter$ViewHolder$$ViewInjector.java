// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class 
    implements butterknife.ctor
{

    public void inject(butterknife.ctor ctor,  , Object obj)
    {
        . = (TextView)ctor.ctor((View)ctor.ctor(obj, 0x7f0e0261, "field 'title'"), 0x7f0e0261, "field 'title'");
        . = (ImageView)ctor.ctor((View)ctor.ctor(obj, 0x7f0e0260, "field 'icon'"), 0x7f0e0260, "field 'icon'");
        . = (View)ctor.ctor(obj, 0x7f0e025f, "field 'divider'");
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
    }

    public volatile void reset(Object obj)
    {
        reset((reset)obj);
    }

    public ()
    {
    }
}
