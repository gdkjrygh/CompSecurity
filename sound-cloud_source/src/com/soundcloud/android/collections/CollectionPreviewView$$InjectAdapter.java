// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import com.soundcloud.android.image.ImageOperations;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.collections:
//            CollectionPreviewView

public final class  extends b
    implements a
{

    private b imageOperations;

    public final void attach(l l1)
    {
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/collections/CollectionPreviewView, getClass().getClassLoader());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(imageOperations);
    }

    public final void injectMembers(CollectionPreviewView collectionpreviewview)
    {
        collectionpreviewview.imageOperations = (ImageOperations)imageOperations.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CollectionPreviewView)obj);
    }

    public ()
    {
        super(null, "members/com.soundcloud.android.collections.CollectionPreviewView", false, com/soundcloud/android/collections/CollectionPreviewView);
    }
}
