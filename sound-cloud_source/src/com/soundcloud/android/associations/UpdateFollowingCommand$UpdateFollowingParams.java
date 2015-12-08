// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.associations;

import com.soundcloud.android.model.Urn;

// Referenced classes of package com.soundcloud.android.associations:
//            UpdateFollowingCommand

static final class following
{

    final boolean following;
    final Urn targetUrn;

    (Urn urn, boolean flag)
    {
        targetUrn = urn;
        following = flag;
    }
}
