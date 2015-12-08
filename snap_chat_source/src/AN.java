// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.res.Resources;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.model.StoryGroup;
import com.snapchat.android.model.StorySnapLogbook;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class AN extends StoryGroup
{

    public static final String MY_STORY_ID = "my_story_ads79sdf";
    private static AN sInstance;

    protected AN()
    {
        mStoryId = "my_story_ads79sdf";
        mDisplayName = SnapchatApplication.get().getResources().getString(0x7f08018e);
        mStorySnapLogbooks = new ArrayList();
    }

    public static AN a()
    {
        AN;
        JVM INSTR monitorenter ;
        AN an;
        if (sInstance == null)
        {
            sInstance = new AN();
        }
        an = sInstance;
        AN;
        JVM INSTR monitorexit ;
        return an;
        Exception exception;
        exception;
        throw exception;
    }

    public static void b()
    {
        AN;
        JVM INSTR monitorenter ;
        sInstance = null;
        AN;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(List list)
    {
        mStorySnapLogbooks.clear();
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            StorySnapLogbook storysnaplogbook = (StorySnapLogbook)iterator.next();
            storysnaplogbook.mStoryId = "my_story_ads79sdf";
            storysnaplogbook.mStorySnap.mPostedStoryId = "my_story_ads79sdf";
        }

        mStorySnapLogbooks.addAll(list);
    }
}
