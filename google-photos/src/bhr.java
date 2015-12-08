// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.moviemaker.MovieMakerActivity;

public final class bhr
    implements Runnable
{

    private MovieMakerActivity a;

    public bhr(MovieMakerActivity moviemakeractivity)
    {
        a = moviemakeractivity;
        super();
    }

    public final void run()
    {
        MovieMakerActivity.c(a).a = MovieMakerActivity.b(a).j;
        MovieMakerActivity.d(a).b();
    }
}
