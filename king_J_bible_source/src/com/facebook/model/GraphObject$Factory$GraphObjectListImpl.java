// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.model;

import com.facebook.FacebookGraphObjectException;
import com.facebook.internal.Validate;
import java.util.AbstractList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.facebook.model:
//            GraphObjectList, GraphObject

private static final class itemType extends AbstractList
    implements GraphObjectList
{

    private final Class itemType;
    private final JSONArray state;

    private void checkIndex(int i)
    {
        if (i < 0 || i >= state.length())
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            return;
        }
    }

    private void put(int i, Object obj)
    {
        obj = state(obj);
        try
        {
            state.put(i, obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalArgumentException(((Throwable) (obj)));
        }
    }

    public void add(int i, Object obj)
    {
        if (i < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        if (i < size())
        {
            throw new UnsupportedOperationException("Only adding items at the end of the list is supported.");
        } else
        {
            put(i, obj);
            return;
        }
    }

    public final GraphObjectList castToListOf(Class class1)
    {
        if (com/facebook/model/GraphObject.isAssignableFrom(itemType))
        {
            if (class1.isAssignableFrom(itemType))
            {
                return this;
            } else
            {
                return itemType(state, class1);
            }
        } else
        {
            throw new FacebookGraphObjectException((new StringBuilder("Can't cast GraphObjectCollection of non-GraphObject type ")).append(itemType).toString());
        }
    }

    public void clear()
    {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj)
    {
        if (obj != null)
        {
            if (this == obj)
            {
                return true;
            }
            if (getClass() == obj.getClass())
            {
                obj = (itemType)obj;
                return state.equals(((state) (obj)).state);
            }
        }
        return false;
    }

    public Object get(int i)
    {
        checkIndex(i);
        return dType(state.opt(i), itemType, null);
    }

    public final JSONArray getInnerJSONArray()
    {
        return state;
    }

    public int hashCode()
    {
        return state.hashCode();
    }

    public boolean remove(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public Object set(int i, Object obj)
    {
        checkIndex(i);
        Object obj1 = get(i);
        put(i, obj);
        return obj1;
    }

    public int size()
    {
        return state.length();
    }

    public String toString()
    {
        return String.format("GraphObjectList{itemType=%s, state=%s}", new Object[] {
            itemType.getSimpleName(), state
        });
    }

    public (JSONArray jsonarray, Class class1)
    {
        Validate.notNull(jsonarray, "state");
        Validate.notNull(class1, "itemType");
        state = jsonarray;
        itemType = class1;
    }
}
