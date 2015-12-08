// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.image;

import android.graphics.drawable.TransitionDrawable;
import com.soundcloud.android.model.Urn;

// Referenced classes of package com.soundcloud.android.image:
//            ImageOperations, PlaceholderGenerator

class val.urn
    implements com.soundcloud.android.utils.cache.r
{

    final ImageOperations this$0;
    final Urn val$urn;

    public TransitionDrawable get(String s)
    {
        return ImageOperations.access$600(ImageOperations.this).generateTransitionDrawable(val$urn.toString());
    }

    public volatile Object get(Object obj)
        throws Exception
    {
        return get((String)obj);
    }

    or()
    {
        this$0 = final_imageoperations;
        val$urn = Urn.this;
        super();
    }
}
