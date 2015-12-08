// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.photos.stories.PrefetchStoryService;
import com.google.android.apps.photos.stories.database.PruneOldStoriesService;

public final class ioy
    implements esl
{

    private final Context a;

    public ioy(Context context)
    {
        a = context;
    }

    public final void a(String s, int i, esm esm1, qfz qfz1)
    {
        if (esm1 == esm.c && PruneOldStoriesService.a(qfz1.b.d.c.longValue()))
        {
            PrefetchStoryService.a(a, i, iuj.a(s));
        }
    }
}
