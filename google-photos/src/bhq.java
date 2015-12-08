// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.google.android.apps.moviemaker.MovieMakerActivity;

public final class bhq
    implements mpj
{

    private gfk a;
    private MovieMakerActivity b;

    public bhq(MovieMakerActivity moviemakeractivity, gfk gfk1)
    {
        b = moviemakeractivity;
        a = gfk1;
        super();
    }

    public final void a(int i, Intent intent)
    {
        if (i == -1)
        {
            intent = gfk.a(b, intent);
            MovieMakerActivity.a(b).a(new gfh(intent));
        }
    }
}
