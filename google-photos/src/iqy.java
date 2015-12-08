// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.stories.StoryLayout;

public final class iqy
    implements Runnable
{

    private StoryLayout a;

    public iqy(StoryLayout storylayout)
    {
        a = storylayout;
        super();
    }

    public final void run()
    {
        boolean flag = true;
        ird ird1 = StoryLayout.a(a);
        if (ird1.a)
        {
            flag = false;
        } else
        {
            ird1.a = true;
        }
        if (flag)
        {
            a.performClick();
        }
    }
}
