// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.m;

import android.widget.ListView;
import java.lang.reflect.Field;
import org.c.b;
import org.c.c;

public final class n
{

    private static final b a = c.a("ListUtils");

    public static void a(ListView listview)
    {
        while (listview == null || listview.getAdapter() == null) 
        {
            return;
        }
        try
        {
            Field field = android/widget/ListView.getDeclaredField("mAreAllItemsSelectable");
            field.setAccessible(true);
            field.set(listview, Boolean.valueOf(true));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ListView listview)
        {
            return;
        }
    }

}
