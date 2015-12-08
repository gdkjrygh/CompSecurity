// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.model.Friend;
import com.snapchat.android.stories.StoriesSection;

public class yW extends yZ
    implements zo
{

    public yW(Friend friend)
    {
        super(friend);
    }

    public StoriesSection a(boolean flag)
    {
        if (flag)
        {
            return StoriesSection.NONE;
        } else
        {
            return StoriesSection.ALL_STORIES;
        }
    }

    public final boolean b()
    {
        return true;
    }

    public int c()
    {
        return 5;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (yW)obj;
            return a.equals(((yW) (obj)).a);
        }
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public final boolean y_()
    {
        return true;
    }
}
