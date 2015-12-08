// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v7.widget:
//            DefaultItemAnimator

class val.changes
    implements Runnable
{

    final DefaultItemAnimator this$0;
    final ArrayList val$changes;

    public void run()
    {
        angeInfo angeinfo;
        for (Iterator iterator = val$changes.iterator(); iterator.hasNext(); DefaultItemAnimator.access$200(DefaultItemAnimator.this, angeinfo))
        {
            angeinfo = (angeInfo)iterator.next();
        }

        val$changes.clear();
        DefaultItemAnimator.access$300(DefaultItemAnimator.this).remove(val$changes);
    }

    angeInfo()
    {
        this$0 = final_defaultitemanimator;
        val$changes = ArrayList.this;
        super();
    }
}
