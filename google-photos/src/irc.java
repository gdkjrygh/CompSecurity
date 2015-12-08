// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;
import android.graphics.Path;
import com.google.android.apps.photos.stories.StoryLayout;

public final class irc extends DataSetObserver
{

    private StoryLayout a;

    public irc(StoryLayout storylayout)
    {
        a = storylayout;
        super();
    }

    public final void onChanged()
    {
        StoryLayout.a(a, -1);
        StoryLayout.d(a).reset();
        if (StoryLayout.b(a) != null)
        {
            StoryLayout.b(a).c(0);
        }
        a.removeAllViewsInLayout();
        a.requestLayout();
    }

    public final void onInvalidated()
    {
    }
}
