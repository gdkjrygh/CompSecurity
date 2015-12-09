// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.imageurl;

import dagger.internal.Binding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.imageurl:
//            FifeImageUrlUtil

public final class  extends Binding
    implements Provider
{

    public final FifeImageUrlUtil get()
    {
        return new FifeImageUrlUtil();
    }

    public final volatile Object get()
    {
        return get();
    }

    public ()
    {
        super("com.google.android.libraries.imageurl.FifeImageUrlUtil", "members/com.google.android.libraries.imageurl.FifeImageUrlUtil", false, com/google/android/libraries/imageurl/FifeImageUrlUtil);
    }
}
