// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class ya
    implements android.view.View.OnClickListener
{

    private xx a;

    ya(xx xx1)
    {
        a = xx1;
        super();
    }

    public final void onClick(View view)
    {
        ((yb)view).a.e();
        int j = xx.a(a).getChildCount();
        int i = 0;
        while (i < j) 
        {
            View view1 = xx.a(a).getChildAt(i);
            boolean flag;
            if (view1 == view)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view1.setSelected(flag);
            i++;
        }
    }
}
