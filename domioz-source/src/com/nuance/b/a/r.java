// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;


// Referenced classes of package com.nuance.b.a:
//            ai, t, s, z

public class r
    implements ai
{

    public static final int MAX_CAPTURE_TIME_DEFAULT = 15;
    public final String defaultValue;
    protected ai groundingBlock;
    public final int maxCaptureTime;
    public final String name;
    public final s type;
    protected t value;

    public r(String s, s s1, String s2)
    {
        this(s, s1, s2, 15);
    }

    public r(String s, s s1, String s2, int i)
    {
        groundingBlock = this;
        if (s == null)
        {
            throw new NullPointerException("name cannot be null");
        }
        if (s1 == null)
        {
            throw new NullPointerException("type cannot be null");
        } else
        {
            name = s;
            type = s1;
            defaultValue = s2;
            maxCaptureTime = i;
            return;
        }
    }

    public String getGroundedMeaning(r r1, z z)
    {
        if (value == null)
        {
            return null;
        }
        if (this != groundingBlock && groundingBlock != null)
        {
            r1 = groundingBlock.getGroundedMeaning(r1, z);
            value = new t(value, r1);
            return r1;
        } else
        {
            return value.b;
        }
    }

    public String getGroundedMeaning(z z)
    {
        return getGroundedMeaning(this, z);
    }

    public t getValue()
    {
        return value;
    }

    public void setMeaningGrounder(ai ai1)
    {
        if (ai1 == null)
        {
            groundingBlock = this;
            return;
        } else
        {
            groundingBlock = ai1;
            return;
        }
    }

    public void setValue(t t1)
    {
        value = t1;
    }

    public String toString()
    {
        return (new StringBuilder("[Concept ")).append(name).append(": type=").append(type).append(" defaultValue=").append(defaultValue).append(" maxCaptureTime=").append(maxCaptureTime).append("]").toString();
    }
}
