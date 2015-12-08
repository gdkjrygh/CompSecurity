// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import android.support.v4.app.Fragment;

// Referenced classes of package com.soundcloud.android.main:
//            NavigationModel, Screen

public static interface 
{

    public abstract Fragment createFragment();

    public abstract int getIcon();

    public abstract int getName();

    public abstract Screen getScreen();
}
