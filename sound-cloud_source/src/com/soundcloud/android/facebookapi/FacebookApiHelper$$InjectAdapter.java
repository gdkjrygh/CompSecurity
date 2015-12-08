// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.facebookapi;

import dagger.a.b;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.facebookapi:
//            FacebookApiHelper

public final class I extends b
    implements Provider
{

    public final FacebookApiHelper get()
    {
        return new FacebookApiHelper();
    }

    public final volatile Object get()
    {
        return get();
    }

    public I()
    {
        super("com.soundcloud.android.facebookapi.FacebookApiHelper", "members/com.soundcloud.android.facebookapi.FacebookApiHelper", false, com/soundcloud/android/facebookapi/FacebookApiHelper);
    }
}
