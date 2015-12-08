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

final class val.additions
    implements Runnable
{

    final DefaultItemAnimator this$0;
    final ArrayList val$additions;

    public final void run()
    {
        r r;
        DefaultItemAnimator defaultitemanimator;
        ViewPropertyAnimatorCompat viewpropertyanimatorcompat;
        for (Iterator iterator = val$additions.iterator(); iterator.hasNext(); viewpropertyanimatorcompat.alpha(1.0F).setDuration(((tor) (defaultitemanimator)).mAddDuration).setListener(new <init>(defaultitemanimator, r, viewpropertyanimatorcompat)).start())
        {
            r = (r)iterator.next();
            defaultitemanimator = DefaultItemAnimator.this;
            viewpropertyanimatorcompat = ViewCompat.animate(r.itemView);
            defaultitemanimator.mAddAnimations.add(r);
        }

        val$additions.clear();
        mAdditionsList.remove(val$additions);
    }

    tor()
    {
        this$0 = final_defaultitemanimator;
        val$additions = ArrayList.this;
        super();
    }
}
