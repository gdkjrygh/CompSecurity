// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v7.widget:
//            DefaultItemAnimator

final class val.changes
    implements Runnable
{

    final DefaultItemAnimator this$0;
    final ArrayList val$changes;

    public final void run()
    {
        Iterator iterator = val$changes.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            angeInfo angeinfo = (angeInfo)iterator.next();
            DefaultItemAnimator defaultitemanimator = DefaultItemAnimator.this;
            Object obj = angeinfo.oldHolder;
            Object obj1;
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = ((r) (obj)).itemView;
            }
            obj1 = angeinfo.newHolder;
            if (obj1 != null)
            {
                obj1 = ((r) (obj1)).itemView;
            } else
            {
                obj1 = null;
            }
            if (obj != null)
            {
                obj = ViewCompat.animate(((android.view.View) (obj))).setDuration(((tor) (defaultitemanimator)).mChangeDuration);
                defaultitemanimator.mChangeAnimations.add(angeinfo.oldHolder);
                ((ViewPropertyAnimatorCompat) (obj)).translationX(angeinfo.toX - angeinfo.fromX);
                ((ViewPropertyAnimatorCompat) (obj)).translationY(angeinfo.toY - angeinfo.fromY);
                ((ViewPropertyAnimatorCompat) (obj)).alpha(0.0F).setListener(new <init>(defaultitemanimator, angeinfo, ((ViewPropertyAnimatorCompat) (obj)))).start();
            }
            if (obj1 != null)
            {
                obj = ViewCompat.animate(((android.view.View) (obj1)));
                defaultitemanimator.mChangeAnimations.add(angeinfo.newHolder);
                ((ViewPropertyAnimatorCompat) (obj)).translationX(0.0F).translationY(0.0F).setDuration(((tor) (defaultitemanimator)).mChangeDuration).alpha(1.0F).setListener(new <init>(defaultitemanimator, angeinfo, ((ViewPropertyAnimatorCompat) (obj)), ((android.view.View) (obj1)))).start();
            }
        } while (true);
        val$changes.clear();
        mChangesList.remove(val$changes);
    }

    at()
    {
        this$0 = final_defaultitemanimator;
        val$changes = ArrayList.this;
        super();
    }
}
