// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.comments;

import android.content.res.Resources;
import com.soundcloud.android.image.ImageOperations;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.comments:
//            CommentRenderer

public final class  extends b
    implements Provider
{

    private b imageOperations;
    private b resources;

    public final void attach(l l1)
    {
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/comments/CommentRenderer, getClass().getClassLoader());
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/comments/CommentRenderer, getClass().getClassLoader());
    }

    public final CommentRenderer get()
    {
        return new CommentRenderer((Resources)resources.get(), (ImageOperations)imageOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resources);
        set.add(imageOperations);
    }

    public ()
    {
        super("com.soundcloud.android.comments.CommentRenderer", "members/com.soundcloud.android.comments.CommentRenderer", false, com/soundcloud/android/comments/CommentRenderer);
    }
}
