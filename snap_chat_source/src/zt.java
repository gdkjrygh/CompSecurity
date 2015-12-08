// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.snapchat.android.model.StoryGroup;
import com.snapchat.android.stories.StoriesSection;

public class zt
    implements zo
{

    public StoryGroup a;

    public zt(StoryGroup storygroup)
    {
        a = storygroup;
    }

    public final StoriesSection a(boolean flag)
    {
        return StoriesSection.ME;
    }

    public final String a()
    {
        return a.e();
    }

    public final boolean b()
    {
        return a.m() > 0;
    }

    public final int c()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof zt))
        {
            return false;
        } else
        {
            obj = (zt)obj;
            return TextUtils.equals(a.c(), ((zt) (obj)).a.c());
        }
    }

    public int hashCode()
    {
        return a.c().hashCode() + 629;
    }

    public final String i()
    {
        return a.c();
    }

    public final boolean y_()
    {
        return false;
    }
}
