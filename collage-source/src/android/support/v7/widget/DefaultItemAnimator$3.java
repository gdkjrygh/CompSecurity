// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v7.widget:
//            DefaultItemAnimator

class val.additions
    implements Runnable
{

    final DefaultItemAnimator this$0;
    final ArrayList val$additions;

    public void run()
    {
        r r;
        for (Iterator iterator = val$additions.iterator(); iterator.hasNext(); DefaultItemAnimator.access$400(DefaultItemAnimator.this, r))
        {
            r = (r)iterator.next();
        }

        val$additions.clear();
        DefaultItemAnimator.access$500(DefaultItemAnimator.this).remove(val$additions);
    }

    r()
    {
        this$0 = final_defaultitemanimator;
        val$additions = ArrayList.this;
        super();
    }
}
