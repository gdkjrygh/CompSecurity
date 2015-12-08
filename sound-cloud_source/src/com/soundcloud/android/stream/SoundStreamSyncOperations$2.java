// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.functions.Predicate;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.stream:
//            SoundStreamSyncOperations

class val.lastNotified
    implements Predicate
{

    final SoundStreamSyncOperations this$0;
    final long val$lastNotified;

    public boolean apply(PropertySet propertyset)
    {
        return ((Date)propertyset.get(PlayableProperty.CREATED_AT)).getTime() > val$lastNotified;
    }

    public volatile boolean apply(Object obj)
    {
        return apply((PropertySet)obj);
    }

    ()
    {
        this$0 = final_soundstreamsyncoperations;
        val$lastNotified = J.this;
        super();
    }
}
