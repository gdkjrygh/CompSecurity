// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.model;

import com.cleanmaster.sdk.cmloginsdkjar.CmLoginSdkCmObjectException;
import com.cleanmaster.sdk.cmloginsdkjar.internal.Validate;
import java.util.AbstractList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar.model:
//            CmObjectList, CmObject

final class a extends AbstractList
    implements CmObjectList
{

    private final JSONArray a;
    private final Class b;

    public a(JSONArray jsonarray, Class class1)
    {
        Validate.notNull(jsonarray, "state");
        Validate.notNull(class1, "itemType");
        a = jsonarray;
        b = class1;
    }

    private void a(int i)
    {
        if (i < 0 || i >= a.length())
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            return;
        }
    }

    private void a(int i, Object obj)
    {
        obj = CmObject.Factory.access$200(obj);
        try
        {
            a.put(i, obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalArgumentException(((Throwable) (obj)));
        }
    }

    public final void add(int i, Object obj)
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
            a(i, obj);
            return;
        }
    }

    public final CmObjectList castToListOf(Class class1)
    {
        if (com/cleanmaster/sdk/cmloginsdkjar/model/CmObject.isAssignableFrom(b))
        {
            if (class1.isAssignableFrom(b))
            {
                return this;
            } else
            {
                return CmObject.Factory.createList(a, class1);
            }
        } else
        {
            throw new CmLoginSdkCmObjectException((new StringBuilder("Can't cast GraphObjectCollection of non-CmObject type ")).append(b).toString());
        }
    }

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj)
    {
        if (obj != null)
        {
            if (this == obj)
            {
                return true;
            }
            if (getClass() == obj.getClass())
            {
                obj = (a)obj;
                return a.equals(((a) (obj)).a);
            }
        }
        return false;
    }

    public final Object get(int i)
    {
        a(i);
        return CmObject.Factory.coerceValueToExpectedType(a.opt(i), b, null);
    }

    public final JSONArray getInnerJSONArray()
    {
        return a;
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final boolean remove(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final Object set(int i, Object obj)
    {
        a(i);
        Object obj1 = get(i);
        a(i, obj);
        return obj1;
    }

    public final int size()
    {
        return a.length();
    }

    public final String toString()
    {
        return String.format("CmObjectList{itemType=%s, state=%s}", new Object[] {
            b.getSimpleName(), a
        });
    }
}
