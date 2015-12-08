// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.graphics.Movie;
import com.skype.android.concurrent.ListenableCompletableFuture;

// Referenced classes of package com.skype.android.app.media:
//            UrlPreviewMediaAgent

public static class path
{

    private ListenableCompletableFuture future;
    private Movie movie;
    private String path;

    public ListenableCompletableFuture getFuture()
    {
        return future;
    }

    public String getPath()
    {
        return path;
    }

    public Movie getResult()
    {
        return movie;
    }

    public (ListenableCompletableFuture listenablecompletablefuture, Movie movie1, String s)
    {
        future = listenablecompletablefuture;
        movie = movie1;
        path = s;
    }
}
