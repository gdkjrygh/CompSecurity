// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;


final class isMarkedIgnored
{

    public final String explicitName;
    public final boolean isMarkedIgnored;
    public final boolean isVisible;
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

    public String toString()
    {
        String s1 = (new StringBuilder()).append(value.toString()).append("[visible=").append(isVisible).append("]").toString();
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
            if (explicitName != null)
            {
                if (tostring1.explicitName == null)
                {
                    return withNext(null);
                } else
                {
                    return withNext(tostring1);
                }
            }
            tostring = tostring1;
            if (tostring1.explicitName == null)
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
            return new <init>(value, withnext, explicitName, isVisible, isMarkedIgnored);
        }
    }

    public isMarkedIgnored withValue(Object obj)
    {
        if (obj == value)
        {
            return this;
        } else
        {
            return new <init>(obj, next, explicitName, isVisible, isMarkedIgnored);
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

    public withNext withoutNonVisible()
    {
        withNext withnext;
        withNext withnext1;
        if (next == null)
        {
            withnext = null;
        } else
        {
            withnext = next.withoutNonVisible();
        }
        withnext1 = withnext;
        if (isVisible)
        {
            withnext1 = withNext(withnext);
        }
        return withnext1;
    }


    public (Object obj,  , String s, boolean flag, boolean flag1)
    {
        value = obj;
        next = ;
        if (s == null)
        {
            explicitName = null;
        } else
        {
            obj = s;
            if (s.length() == 0)
            {
                obj = null;
            }
            explicitName = ((String) (obj));
        }
        isVisible = flag;
        isMarkedIgnored = flag1;
    }
}
