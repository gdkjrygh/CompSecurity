// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import com.netflix.mediaclient.servicemgr.Trackable;
import com.netflix.mediaclient.ui.common.PlayContextProvider;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            VideoViewGroup

public static interface 
    extends PlayContextProvider
{

    public abstract void hide();

    public abstract void update(Object obj, Trackable trackable, int i, boolean flag);
}
