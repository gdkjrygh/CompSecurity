// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.w;


// Referenced classes of package com.facebook.common.w:
//            r

public final class q extends Enum
{

    private static final q $VALUES[];
    public static final q NO;
    public static final q UNSET;
    public static final q YES;

    private q(String s, int i)
    {
        super(s, i);
    }

    public static q valueOf(Boolean boolean1)
    {
        if (boolean1 != null)
        {
            return valueOf(boolean1.booleanValue());
        } else
        {
            return UNSET;
        }
    }

    public static q valueOf(String s)
    {
        return (q)Enum.valueOf(com/facebook/common/w/q, s);
    }

    public static q valueOf(boolean flag)
    {
        if (flag)
        {
            return YES;
        } else
        {
            return NO;
        }
    }

    public static q[] values()
    {
        return (q[])$VALUES.clone();
    }

    public boolean asBoolean()
    {
        switch (r.a[ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unrecognzied TriState value: ").append(this).toString());

        case 1: // '\001'
            return true;

        case 2: // '\002'
            return false;

        case 3: // '\003'
            throw new IllegalStateException("No boolean equivalent for UNSET");
        }
    }

    public boolean asBoolean(boolean flag)
    {
        switch (r.a[ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unrecognzied TriState value: ").append(this).toString());

        case 1: // '\001'
            flag = true;
            // fall through

        case 3: // '\003'
            return flag;

        case 2: // '\002'
            return false;
        }
    }

    public Boolean asBooleanObject()
    {
        switch (r.a[ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unrecognzied TriState value: ").append(this).toString());

        case 1: // '\001'
            return Boolean.TRUE;

        case 2: // '\002'
            return Boolean.FALSE;

        case 3: // '\003'
            return null;
        }
    }

    public boolean isSet()
    {
        return this != UNSET;
    }

    static 
    {
        YES = new q("YES", 0);
        NO = new q("NO", 1);
        UNSET = new q("UNSET", 2);
        $VALUES = (new q[] {
            YES, NO, UNSET
        });
    }
}
