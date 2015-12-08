// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.tagmanager:
//            Container

public interface ContainerHolder
    extends Releasable, Result
{
    public static interface ContainerAvailableListener
    {

        public abstract void onContainerAvailable(ContainerHolder containerholder, String s);
    }


    public abstract Container getContainer();
}
