// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.PropertyName;

final class isMarkedIgnored
{

    public final boolean isMarkedIgnored;
    public final boolean isNameExplicit;
    public final boolean isVisible;
    public final PropertyName name;
    public final withNext next;
    public final Object value;

    private isMarkedIgnored append(isMarkedIgnored ismarkedignored)
    {
        if (next == null)
        {
            return withNext(ismarkedignored);
        } else
        {
            return withNext(next.append(ismarkedignored));
        }
    }

    public final String toString()
    {
        String s1 = (new StringBuilder()).append(value.toString()).append("[visible=").append(isVisible).append(",ignore=").append(isMarkedIgnored).append(",explicitName=").append(isNameExplicit).append("]").toString();
        String s = s1;
        if (next != null)
        {
            s = (new StringBuilder()).append(s1).append(", ").append(next.toString()).toString();
        }
        return s;
    }

    public final toString trimByVisibility()
    {
        if (next == null)
        {
            return this;
        }
        toString tostring = next.trimByVisibility();
        if (name != null)
        {
            if (tostring.name == null)
            {
                return withNext(null);
            } else
            {
                return withNext(tostring);
            }
        }
        if (tostring.name != null)
        {
            return tostring;
        }
        if (isVisible == tostring.isVisible)
        {
            return withNext(tostring);
        }
        if (isVisible)
        {
            return withNext(null);
        } else
        {
            return tostring;
        }
    }

    public final withNext withNext(withNext withnext)
    {
        if (withnext == next)
        {
            return this;
        } else
        {
            return new <init>(value, withnext, name, isNameExplicit, isVisible, isMarkedIgnored);
        }
    }

    public final isMarkedIgnored withValue(Object obj)
    {
        if (obj == value)
        {
            return this;
        } else
        {
            return new <init>(obj, next, name, isNameExplicit, isVisible, isMarkedIgnored);
        }
    }

    public final isMarkedIgnored withoutIgnored()
    {
        isMarkedIgnored ismarkedignored = this;
_L9:
        if (!ismarkedignored.isMarkedIgnored) goto _L2; else goto _L1
_L1:
        if (ismarkedignored.next != null) goto _L4; else goto _L3
_L3:
        isMarkedIgnored ismarkedignored1 = null;
_L6:
        return ismarkedignored1;
_L4:
        ismarkedignored = ismarkedignored.next;
        continue; /* Loop/switch isn't completed */
_L2:
        ismarkedignored1 = ismarkedignored;
        if (ismarkedignored.next == null) goto _L6; else goto _L5
_L5:
        isMarkedIgnored ismarkedignored2;
        ismarkedignored2 = ismarkedignored.next.withoutIgnored();
        ismarkedignored1 = ismarkedignored;
        if (ismarkedignored2 == ismarkedignored.next) goto _L6; else goto _L7
_L7:
        return ismarkedignored.withNext(ismarkedignored2);
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final withNext withoutNext()
    {
        if (next == null)
        {
            return this;
        } else
        {
            return new <init>(value, null, name, isNameExplicit, isVisible, isMarkedIgnored);
        }
    }

    public final isMarkedIgnored withoutNonVisible()
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
