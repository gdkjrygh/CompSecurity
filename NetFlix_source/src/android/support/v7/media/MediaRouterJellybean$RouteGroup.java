// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//            MediaRouterJellybean

public static final class 
{

    public static List getGroupedRoutes(Object obj)
    {
        obj = (android.media.RouteGroup)obj;
        int j = ((android.media.RouteGroup) (obj)).ount();
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            arraylist.add(((android.media.ount) (obj)).t(i));
        }

        return arraylist;
    }

    public ()
    {
    }
}
