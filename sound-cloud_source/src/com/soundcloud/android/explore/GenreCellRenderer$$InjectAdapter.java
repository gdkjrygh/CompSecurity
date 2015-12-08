// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import dagger.a.b;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.explore:
//            GenreCellRenderer

public final class  extends b
    implements Provider
{

    public final GenreCellRenderer get()
    {
        return new GenreCellRenderer();
    }

    public final volatile Object get()
    {
        return get();
    }

    public ()
    {
        super("com.soundcloud.android.explore.GenreCellRenderer", "members/com.soundcloud.android.explore.GenreCellRenderer", false, com/soundcloud/android/explore/GenreCellRenderer);
    }
}
