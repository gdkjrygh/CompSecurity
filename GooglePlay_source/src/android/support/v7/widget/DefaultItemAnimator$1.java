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

final class val.moves
    implements Runnable
{

    final DefaultItemAnimator this$0;
    final ArrayList val$moves;

    public final void run()
    {
        DefaultItemAnimator defaultitemanimator;
        r r;
        Object obj;
        int i;
        int k;
        for (Iterator iterator = val$moves.iterator(); iterator.hasNext(); ((ViewPropertyAnimatorCompat) (obj)).setDuration(((tor) (defaultitemanimator)).mMoveDuration).setListener(new <init>(defaultitemanimator, r, k, i, ((ViewPropertyAnimatorCompat) (obj)))).start())
        {
            obj = (veInfo)iterator.next();
            defaultitemanimator = DefaultItemAnimator.this;
            r = ((veInfo) (obj)).holder;
            k = ((veInfo) (obj)).fromX;
            i = ((veInfo) (obj)).fromY;
            int l = ((veInfo) (obj)).toX;
            int j = ((veInfo) (obj)).toY;
            obj = r.itemView;
            k = l - k;
            i = j - i;
            if (k != 0)
            {
                ViewCompat.animate(((android.view.View) (obj))).translationX(0.0F);
            }
            if (i != 0)
            {
                ViewCompat.animate(((android.view.View) (obj))).translationY(0.0F);
            }
            obj = ViewCompat.animate(((android.view.View) (obj)));
            defaultitemanimator.mMoveAnimations.add(r);
        }

        val$moves.clear();
        mMovesList.remove(val$moves);
    }

    tor()
    {
        this$0 = final_defaultitemanimator;
        val$moves = ArrayList.this;
        super();
    }
}
