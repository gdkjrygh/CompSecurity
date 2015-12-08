// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.common.async.BackgroundTask;

// Referenced classes of package com.pinterest.api.model:
//            Place, ModelHelper

final class roundTask extends BackgroundTask
{

    final Place val$place;

    public final void run()
    {
        ModelHelper.setPlace(Place.merge(val$place));
    }

    per()
    {
        val$place = place1;
        super();
    }
}
