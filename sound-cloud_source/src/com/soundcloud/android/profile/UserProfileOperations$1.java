// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.api.model.ModelCollection;
import com.soundcloud.android.api.model.PagedRemoteCollection;
import rx.b.f;

final class 
    implements f
{

    public final PagedRemoteCollection call(ModelCollection modelcollection)
    {
        return new PagedRemoteCollection(modelcollection);
    }

    public final volatile Object call(Object obj)
    {
        return call((ModelCollection)obj);
    }

    ()
    {
    }
}
