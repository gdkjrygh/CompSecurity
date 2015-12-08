// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package android.support.v7.internal.widget:
//            d

private final class <init>
    implements <init>
{

    final d a;
    private final Map b;

    public final void a(List list, List list1)
    {
        Map map = b;
        map.clear();
        int k = list.size();
        for (int i = 0; i < k; i++)
        {
            <init> <init>1 = (b)list.get(i);
            <init>1.b = 0.0F;
            map.put(new ComponentName(<init>1.a.activityInfo.packageName, <init>1.a.activityInfo.name), <init>1);
        }

        int j = list1.size();
        float f = 1.0F;
        for (j--; j >= 0;)
        {
            <init> <init>2 = (Info)list1.get(j);
            <init> <init>3 = (Info)map.get(<init>2.a);
            float f1 = f;
            if (<init>3 != null)
            {
                <init>3.b = <init>3.b + <init>2.c * f;
                f1 = f * 0.95F;
            }
            j--;
            f = f1;
        }

        Collections.sort(list);
    }

    private (d d1)
    {
        a = d1;
        super();
        b = new HashMap();
    }

    b(d d1, byte byte0)
    {
        this(d1);
    }
}
