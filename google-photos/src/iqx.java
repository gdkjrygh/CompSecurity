// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.stories.StoryLayout;

public final class iqx
    implements Runnable
{

    private StoryLayout a;

    public iqx(StoryLayout storylayout)
    {
        a = storylayout;
        super();
    }

    public final void run()
    {
        StoryLayout.a(a, true);
    }
}
