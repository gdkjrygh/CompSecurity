// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.PropertyName;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            POJOPropertyBuilder

private static final class isMarkedIgnored
{

    public final boolean isMarkedIgnored;
    public final boolean isNameExplicit;
    public final boolean isVisible;
    public final PropertyName name;
    public final withNext next;
    public final Object value;

    protected isMarkedIgnored append(isMarkedIgnored ismarkedignored)
    {
        if (next == null)
        {
            return withNext(ismarkedignored);
        } else
        {
            return withNext(next.append(ismarkedignored));
        }
    }

    public String toString()
    {
        String s1 = (new StringBuilder()).append(value.toString()).append("[visible=").append(isVisible).append(",ignore=").append(isMarkedIgnored).append(",explicitName=").append(isNameExplicit).append("]").toString();
        String s = s1;
        if (next != null)
        {
            s = (new StringBuilder()).append(s1).append(", ").append(next.toString()).toString();
        }
        return s;
    }

    public toString trimByVisibility()
    {
        toString tostring;
        if (next == null)
        {
            tostring = this;
        } else
        {
            toString tostring1 = next.trimByVisibility();
            if (name != null)
            {
                if (tostring1.name == null)
                {
                    return withNext(null);
                } else
                {
                    return withNext(tostring1);
                }
            }
            tostring = tostring1;
            if (tostring1.name == null)
            {
                if (isVisible == tostring1.isVisible)
                {
                    return withNext(tostring1);
                }
                tostring = tostring1;
                if (isVisible)
                {
                    return withNext(null);
                }
            }
        }
        return tostring;
    }

    public withNext withNext(withNext withnext)
    {
        if (withnext == next)
        {
            return this;
        } else
        {
            return new <init>(value, withnext, name, isNameExplicit, isVisible, isMarkedIgnored);
        }
    }

    public isMarkedIgnored withValue(Object obj)
    {
        if (obj == value)
        {
            return this;
        } else
        {
            return new <init>(obj, next, name, isNameExplicit, isVisible, isMarkedIgnored);
        }
    }

    public isMarkedIgnored withoutIgnored()
    {
        if (isMarkedIgnored)
        {
            if (next == null)
            {
                return null;
            } else
            {
                return next.withoutIgnored();
            }
        }
        if (next != null)
        {
            isMarkedIgnored ismarkedignored = next.withoutIgnored();
            if (ismarkedignored != next)
            {
                return withNext(ismarkedignored);
            }
        }
        return this;
    }

    public withNext withoutNext()
    {
        if (next == null)
        {
            return this;
        } else
        {
            return new <init>(value, null, name, isNameExplicit, isVisible, isMarkedIgnored);
        }
    }

    public isMarkedIgnored withoutNonVisible()
    {
        isMarkedIgnored ismarkedignored;
        isMarkedIgnored ismarkedignored1;
        if (next == null)
        {
            ismarkedignored = null;
        } else
        {
            ismarkedignored = next.withoutNonVisible();
        }
        ismarkedignored1 = ismarkedignored;
        if (isVisible)
        {
            ismarkedignored1 = withNext(ismarkedignored);
        }
        return ismarkedignored1;
    }

    public (Object obj,  , PropertyName propertyname, boolean flag, boolean flag1, boolean flag2)
    {
        value = obj;
        next = ;
        boolean flag3;
        if (propertyname == null || propertyname.isEmpty())
        {
            obj = null;
        } else
        {
            obj = propertyname;
        }
        name = ((PropertyName) (obj));
        flag3 = flag;
        if (flag)
        {
            if (name == null)
            {
                throw new IllegalArgumentException("Can not pass true for 'explName' if name is null/empty");
            }
            flag3 = flag;
            if (!propertyname.hasSimpleName())
            {
                flag3 = false;
            }
        }
        isNameExplicit = flag3;
        isVisible = flag1;
        isMarkedIgnored = flag2;
    }
}
