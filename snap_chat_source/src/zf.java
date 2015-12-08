// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.snapchat.android.model.StoryCollection;
import com.snapchat.android.stories.StoriesThumbnailType;

public final class zf extends yX
{

    public zf(View view)
    {
        super(view);
    }

    public final String s()
    {
        return (new StringBuilder()).append(l.mUsername).append("&liveStoryUnviewed").toString();
    }

    public final Jf x()
    {
        SV sv = l.mThumbnails;
        if (sv == null)
        {
            return new Jf(StoriesThumbnailType.NEWEST_SNAP_THUMBNAIL_WITHOUT_DECAY, l.e(), s());
        } else
        {
            return new Jf(s(), sv.a());
        }
    }
}
