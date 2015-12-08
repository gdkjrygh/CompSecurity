// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.save;

import Bk;
import com.snapchat.android.model.StorySnapLogbook;
import java.util.Comparator;

// Referenced classes of package com.snapchat.android.util.save:
//            SaveStoryToGalleryTask

final class this._cls0
    implements Comparator
{

    final SaveStoryToGalleryTask this$0;

    public final int compare(Object obj, Object obj1)
    {
        obj = (StorySnapLogbook)obj;
        obj1 = (StorySnapLogbook)obj1;
        if (((StorySnapLogbook) (obj)).mStorySnap.W() < ((StorySnapLogbook) (obj1)).mStorySnap.W())
        {
            return -1;
        }
        return ((StorySnapLogbook) (obj)).mStorySnap.W() <= ((StorySnapLogbook) (obj1)).mStorySnap.W() ? 0 : 1;
    }

    ()
    {
        this$0 = SaveStoryToGalleryTask.this;
        super();
    }
}
