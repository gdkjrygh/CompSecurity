// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class MediaRouteSelector
{
    public static final class Builder
    {

        private ArrayList mControlCategories;

        public Builder addControlCategories(Collection collection)
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

        public Builder addControlCategory(String s)
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

        public Builder addSelector(MediaRouteSelector mediarouteselector)
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
                return new MediaRouteSelector(bundle, mControlCategories);
            }
        }

        public Builder()
        {
        }

        public Builder(MediaRouteSelector mediarouteselector)
        {
            if (mediarouteselector == null)
            {
                throw new IllegalArgumentException("selector must not be null");
            }
            mediarouteselector.ensureControlCategories();
            if (!mediarouteselector.mControlCategories.isEmpty())
            {
                mControlCategories = new ArrayList(mediarouteselector.mControlCategories);
            }
        }
    }


    public static final MediaRouteSelector EMPTY = new MediaRouteSelector(new Bundle(), null);
    private static final String KEY_CONTROL_CATEGORIES = "controlCategories";
    private final Bundle mBundle;
    private List mControlCategories;

    private MediaRouteSelector(Bundle bundle, List list)
    {
        mBundle = bundle;
        mControlCategories = list;
    }


    private void ensureControlCategories()
    {
        if (mControlCategories == null)
        {
            mControlCategories = mBundle.getStringArrayList("controlCategories");
            if (mControlCategories == null || mControlCategories.isEmpty())
            {
                mControlCategories = Collections.emptyList();
            }
        }
    }

    public static MediaRouteSelector fromBundle(Bundle bundle)
    {
        if (bundle != null)
        {
            return new MediaRouteSelector(bundle, null);
        } else
        {
            return null;
        }
    }

    public Bundle asBundle()
    {
        return mBundle;
    }

    public boolean contains(MediaRouteSelector mediarouteselector)
    {
        if (mediarouteselector != null)
        {
            ensureControlCategories();
            mediarouteselector.ensureControlCategories();
            return mControlCategories.containsAll(mediarouteselector.mControlCategories);
        } else
        {
            return false;
        }
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof MediaRouteSelector)
        {
            obj = (MediaRouteSelector)obj;
            ensureControlCategories();
            ((MediaRouteSelector) (obj)).ensureControlCategories();
            return mControlCategories.equals(((MediaRouteSelector) (obj)).mControlCategories);
        } else
        {
            return false;
        }
    }

    public List getControlCategories()
    {
        ensureControlCategories();
        return mControlCategories;
    }

    public boolean hasControlCategory(String s)
    {
        if (s != null)
        {
            ensureControlCategories();
            int j = mControlCategories.size();
            for (int i = 0; i < j; i++)
            {
                if (((String)mControlCategories.get(i)).equals(s))
                {
                    return true;
                }
            }

        }
        return false;
    }

    public int hashCode()
    {
        ensureControlCategories();
        return mControlCategories.hashCode();
    }

    public boolean isEmpty()
    {
        ensureControlCategories();
        return mControlCategories.isEmpty();
    }

    public boolean isValid()
    {
        ensureControlCategories();
        return !mControlCategories.contains(null);
    }

    public boolean matchesControlFilters(List list)
    {
        if (list != null)
        {
            ensureControlCategories();
            int k = mControlCategories.size();
            if (k != 0)
            {
                int l = list.size();
label0:
                for (int i = 0; i < l; i++)
                {
                    IntentFilter intentfilter = (IntentFilter)list.get(i);
                    if (intentfilter == null)
                    {
                        continue;
                    }
                    int j = 0;
                    do
                    {
                        if (j >= k)
                        {
                            continue label0;
                        }
                        if (intentfilter.hasCategory((String)mControlCategories.get(j)))
                        {
                            return true;
                        }
                        j++;
                    } while (true);
                }

            }
        }
        return false;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("MediaRouteSelector{ ");
        stringbuilder.append("controlCategories=").append(Arrays.toString(getControlCategories().toArray()));
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }



}
