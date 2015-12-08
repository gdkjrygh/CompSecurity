// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;


// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            POJOPropertyBuilder

private static final class isMarkedIgnored
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

    public final String toString()
    {
        String s1 = (new StringBuilder()).append(value.toString()).append("[visible=").append(isVisible).append("]").toString();
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
        if (explicitName != null)
        {
            if (tostring.explicitName == null)
            {
                return withNext(null);
            } else
            {
                return withNext(tostring);
            }
        }
        if (tostring.explicitName != null)
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
            return new <init>(value, withnext, explicitName, isVisible, isMarkedIgnored);
        }
    }

    public final isMarkedIgnored withValue(Object obj)
    {
        if (obj == value)
        {
            return this;
        } else
        {
            return new <init>(obj, next, explicitName, isVisible, isMarkedIgnored);
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

    public final withNext withoutNonVisible()
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
        if (s != null) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        explicitName = s;
        isVisible = flag;
        isMarkedIgnored = flag1;
        return;
_L2:
        if (s.length() == 0)
        {
            s = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
