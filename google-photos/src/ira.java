// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.stories.StoryLayout;
import java.util.Comparator;

public final class ira
    implements Comparator
{

    public ira(StoryLayout storylayout)
    {
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (java.util.Map.Entry)obj;
        obj1 = (java.util.Map.Entry)obj1;
        int i = ((Integer)((java.util.Map.Entry) (obj)).getValue()).intValue() - ((Integer)((java.util.Map.Entry) (obj1)).getValue()).intValue();
        if (i != 0)
        {
            return i;
        } else
        {
            return ((Integer)((java.util.Map.Entry) (obj)).getKey()).intValue() - ((Integer)((java.util.Map.Entry) (obj1)).getKey()).intValue();
        }
    }
}
