// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//            MediaRouterJellybean

public static final class A
{

    public static CharSequence getName(Object obj, Context context)
    {
        return ((android.media.teCategory)obj).teCategory(context);
    }

    public static List getRoutes(Object obj)
    {
        ArrayList arraylist = new ArrayList();
        ((android.media.teCategory)obj).(arraylist);
        return arraylist;
    }

    public static int getSupportedTypes(Object obj)
    {
        return ((android.media.)obj).tedTypes();
    }

    public static boolean isGroupable(Object obj)
    {
        return ((android.media.tedTypes)obj).le();
    }

    public A()
    {
    }
}
