// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//            MediaRouteSelector

public static final class _cls00
{

    private ArrayList mControlCategories;

    public _cls00 addControlCategories(Collection collection)
    {
        if (collection == null)
        {
            throw new IllegalArgumentException("categories must not be null");
        }
        if (!collection.isEmpty())
        {
            for (collection = collection.iterator(); collection.hasNext(); addControlCategory((String)collection.next())) { }
        }
        return this;
    }

    public addControlCategory addControlCategory(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("category must not be null");
        }
        if (mControlCategories == null)
        {
            mControlCategories = new ArrayList();
        }
        if (!mControlCategories.contains(s))
        {
            mControlCategories.add(s);
        }
        return this;
    }

    public mControlCategories addSelector(MediaRouteSelector mediarouteselector)
    {
        if (mediarouteselector == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        } else
        {
            addControlCategories(mediarouteselector.getControlCategories());
            return this;
        }
    }

    public MediaRouteSelector build()
    {
        if (mControlCategories == null)
        {
            return MediaRouteSelector.EMPTY;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", mControlCategories);
            return new MediaRouteSelector(bundle, mControlCategories, null);
        }
    }

    public _cls9()
    {
    }

    public _cls9(MediaRouteSelector mediarouteselector)
    {
        if (mediarouteselector == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        }
        MediaRouteSelector.access$000(mediarouteselector);
        if (!MediaRouteSelector.access$100(mediarouteselector).isEmpty())
        {
            mControlCategories = new ArrayList(MediaRouteSelector.access$100(mediarouteselector));
        }
    }
}
