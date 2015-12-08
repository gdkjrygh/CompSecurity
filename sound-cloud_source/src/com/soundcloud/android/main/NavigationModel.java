// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import android.support.v4.app.Fragment;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.soundcloud.android.main:
//            Screen

public class NavigationModel
{
    public static interface Target
    {

        public abstract Fragment createFragment();

        public abstract int getIcon();

        public abstract int getName();

        public abstract Screen getScreen();
    }


    public static final int NOT_FOUND = -1;
    private final List listItems;

    public transient NavigationModel(Target atarget[])
    {
        listItems = Arrays.asList(atarget);
    }

    public Target getItem(int i)
    {
        return (Target)listItems.get(i);
    }

    public int getItemCount()
    {
        return listItems.size();
    }

    public int getPosition(Screen screen)
    {
        for (int i = 0; i < listItems.size(); i++)
        {
            if (((Target)listItems.get(i)).getScreen().equals(screen))
            {
                return i;
            }
        }

        return -1;
    }
}
