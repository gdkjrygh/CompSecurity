// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.you;

import dagger.a.b;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.you:
//            YouViewFactory

public final class  extends b
    implements Provider
{

    public final YouViewFactory get()
    {
        return new YouViewFactory();
    }

    public final volatile Object get()
    {
        return get();
    }

    public ()
    {
        super("com.soundcloud.android.you.YouViewFactory", "members/com.soundcloud.android.you.YouViewFactory", false, com/soundcloud/android/you/YouViewFactory);
    }
}
