// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.util.AttributeSet;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.controls:
//            Toolbar

public class BackButtonToolbar extends Toolbar
{

    AppFlow appFlow;

    public BackButtonToolbar(Context context)
    {
        this(context, null);
    }

    public BackButtonToolbar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public BackButtonToolbar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        Scoop.a(this).b(this);
    }

    protected void onHomeClick()
    {
        super.onHomeClick();
        appFlow.goUp();
    }
}
