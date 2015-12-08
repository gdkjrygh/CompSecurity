// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.widget.ImageView;
import com.pandora.android.view.SafeImageView;
import p.an.f;
import p.an.k;

// Referenced classes of package com.pandora.android.util:
//            j

private static class <init> extends f
{

    public k a(ImageView imageview, Class class1)
    {
        if (imageview instanceof SafeImageView)
        {
            ((SafeImageView)imageview).setGlideCallStack(new Throwable((new StringBuilder()).append("Loading from ").append(class1).append(" into ").append(imageview).toString()));
        }
        return super.a(imageview, class1);
    }

    private ImageView()
    {
    }

    ImageView(ImageView imageview)
    {
        this();
    }
}
