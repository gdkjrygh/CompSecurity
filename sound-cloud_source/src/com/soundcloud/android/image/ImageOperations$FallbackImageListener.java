// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.image;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.b.a.b.a.b;
import com.b.a.b.f.a;
import java.io.FileNotFoundException;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.image:
//            ImageOperations, ImageListenerUILAdapter, OneShotTransitionDrawable, ImageListener

static class <init>
    implements a
{

    private final ImageListenerUILAdapter listenerAdapter;
    private final Set notFoundUris;

    private void animatePlaceholder(View view)
    {
        if ((view instanceof ImageView) && (((ImageView)view).getDrawable() instanceof OneShotTransitionDrawable))
        {
            ((OneShotTransitionDrawable)((ImageView)view).getDrawable()).startTransition(200);
        }
    }

    public void onLoadingCancelled(String s, View view)
    {
        if (listenerAdapter != null)
        {
            listenerAdapter.onLoadingCancelled(s, view);
        }
    }

    public void onLoadingComplete(String s, View view, Bitmap bitmap)
    {
        if (bitmap == null)
        {
            animatePlaceholder(view);
        }
        if (listenerAdapter != null)
        {
            listenerAdapter.onLoadingComplete(s, view, bitmap);
        }
    }

    public void onLoadingFailed(String s, View view, b b1)
    {
        if (b1.a instanceof FileNotFoundException)
        {
            notFoundUris.add(s);
        }
        animatePlaceholder(view);
        if (listenerAdapter != null)
        {
            listenerAdapter.onLoadingFailed(s, view, b1);
        }
    }

    public void onLoadingStarted(String s, View view)
    {
        if (listenerAdapter != null)
        {
            listenerAdapter.onLoadingStarted(s, view);
        }
    }

    public (ImageListener imagelistener, Set set)
    {
        notFoundUris = set;
        if (imagelistener != null)
        {
            imagelistener = new ImageListenerUILAdapter(imagelistener);
        } else
        {
            imagelistener = null;
        }
        listenerAdapter = imagelistener;
    }

    public listenerAdapter(Set set)
    {
        this(null, set);
    }
}
