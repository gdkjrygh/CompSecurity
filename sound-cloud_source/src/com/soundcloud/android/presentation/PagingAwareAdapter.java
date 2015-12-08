// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;


// Referenced classes of package com.soundcloud.android.presentation:
//            ItemAdapter

public interface PagingAwareAdapter
    extends ItemAdapter
{

    public abstract boolean isIdle();

    public abstract void setLoading();

    public abstract void setOnErrorRetryListener(android.view.View.OnClickListener onclicklistener);
}
