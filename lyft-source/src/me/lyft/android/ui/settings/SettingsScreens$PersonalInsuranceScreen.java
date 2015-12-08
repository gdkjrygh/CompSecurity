// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import com.lyft.scoop.IHaveParent;
import com.lyft.scoop.Screen;

// Referenced classes of package me.lyft.android.ui.settings:
//            SettingsScreens

public class I extends SettingsScreens
    implements IHaveParent
{

    public Screen getParent()
    {
        return new I();
    }

    public I()
    {
    }
}
