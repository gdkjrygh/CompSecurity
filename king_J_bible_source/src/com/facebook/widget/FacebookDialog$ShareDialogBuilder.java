// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.app.Activity;
import java.util.EnumSet;
import java.util.List;

// Referenced classes of package com.facebook.widget:
//            FacebookDialog

public static class ase extends ase
{

    protected EnumSet getDialogFeatures()
    {
        return EnumSet.of(SHARE_DIALOG);
    }

    public volatile ase setCaption(String s)
    {
        return super.setCaption(s);
    }

    public volatile ase setDataErrorsFatal(boolean flag)
    {
        return super.setDataErrorsFatal(flag);
    }

    public volatile ase setDescription(String s)
    {
        return super.setDescription(s);
    }

    public volatile ase setFriends(List list)
    {
        return super.setFriends(list);
    }

    public volatile ase setLink(String s)
    {
        return super.setLink(s);
    }

    public volatile ase setName(String s)
    {
        return super.setName(s);
    }

    public volatile ase setPicture(String s)
    {
        return super.setPicture(s);
    }

    public volatile ase setPlace(String s)
    {
        return super.setPlace(s);
    }

    public volatile ase setRef(String s)
    {
        return super.setRef(s);
    }

    public ase(Activity activity)
    {
        super(activity);
    }
}
