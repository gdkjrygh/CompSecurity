// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.chat;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.snapchat.android.ui.chat:
//            ChatStickersDrawerView

final class a
    implements android.view.sDrawerView.b._cls1
{

    private RecyclerView a;
    private b b;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        int i = motionevent.getAction();
        view = a.getChildAt(0);
        boolean flag;
        if (view == null || view.getTop() >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = ChatStickersDrawerView.d(b.b).iterator();
        do
        {
            if (!view.hasNext())
            {
                break;
            }
            a a1 = (b)view.next();
            if (motionevent.getAction() == 2)
            {
                a1.b(motionevent, flag);
            } else
            if (i == 1)
            {
                a1.b();
            }
        } while (true);
        return false;
    }

    ( , RecyclerView recyclerview)
    {
        b = ;
        a = recyclerview;
        super();
    }
}
