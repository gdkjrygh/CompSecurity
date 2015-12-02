// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.filemanager;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package com.qihoo.security.opti.trashclear.filemanager:
//            a

class a
    implements Runnable
{

    final LinearLayout a;
    final a b;

    public void run()
    {
        DisplayMetrics displaymetrics = com.qihoo.security.opti.trashclear.filemanager.a.b(b).getResources().getDisplayMetrics();
        int i = a.getWidth();
        if (i > displaymetrics.widthPixels)
        {
            int j = displaymetrics.widthPixels;
            com.qihoo.security.opti.trashclear.filemanager.a.c(b).scrollBy(i - j, 0);
        }
    }

    (a a1, LinearLayout linearlayout)
    {
        b = a1;
        a = linearlayout;
        super();
    }
}
