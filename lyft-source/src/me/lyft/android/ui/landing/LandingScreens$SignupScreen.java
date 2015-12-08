// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import com.lyft.scoop.IHaveParent;
import com.lyft.scoop.Screen;

// Referenced classes of package me.lyft.android.ui.landing:
//            LandingScreens

public class creen extends LandingScreens
    implements IHaveParent
{

    public Screen getParent()
    {
        return new creen("back_from_upstream");
    }

    public creen()
    {
    }
}
