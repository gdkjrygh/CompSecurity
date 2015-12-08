// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.util.AttributeSet;
import com.lyft.scoop.Scoop;
import me.lyft.android.ui.SlideMenuController;

// Referenced classes of package me.lyft.android.controls:
//            Toolbar

public class MenuButtonToolbar extends Toolbar
{

    SlideMenuController slideMenuController;

    public MenuButtonToolbar(Context context)
    {
        this(context, null);
    }

    public MenuButtonToolbar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MenuButtonToolbar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (isInEditMode())
        {
            return;
        } else
        {
            Scoop.a(this).b(this);
            setHomeIcon(0x7f020108);
            return;
        }
    }

    protected void onHomeClick()
    {
        super.onHomeClick();
        slideMenuController.toggle();
    }
}
