// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.common.async.BackgroundTask;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper, User

final class roundTask extends BackgroundTask
{

    final ardArtifact val$artifact;

    public final void run()
    {
        ModelHelper.setBoard(val$artifact.getBoard());
        ModelHelper.setPartner(val$artifact.getUser().getPartner());
        ModelHelper.setUser(val$artifact.getUser());
    }

    ardArtifact()
    {
        val$artifact = ardartifact;
        super();
    }
}
