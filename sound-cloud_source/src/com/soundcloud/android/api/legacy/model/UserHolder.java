// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import com.soundcloud.android.api.legacy.model.behavior.Refreshable;

// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            PublicApiUser

public interface UserHolder
    extends Refreshable
{

    public abstract PublicApiUser getUser();
}
