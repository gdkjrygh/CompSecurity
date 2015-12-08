// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;


// Referenced classes of package org.xwalk.core.internal:
//            XWalkUIClientInternal

public static final class Q extends Enum
{

    private static final JAVASCRIPT_BEFOREUNLOAD $VALUES[];
    public static final JAVASCRIPT_BEFOREUNLOAD JAVASCRIPT_ALERT;
    public static final JAVASCRIPT_BEFOREUNLOAD JAVASCRIPT_BEFOREUNLOAD;
    public static final JAVASCRIPT_BEFOREUNLOAD JAVASCRIPT_CONFIRM;
    public static final JAVASCRIPT_BEFOREUNLOAD JAVASCRIPT_PROMPT;

    public static Q valueOf(String s)
    {
        return (Q)Enum.valueOf(org/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal, s);
    }

    public static Q[] values()
    {
        return (Q[])$VALUES.clone();
    }

    static 
    {
        JAVASCRIPT_ALERT = new <init>("JAVASCRIPT_ALERT", 0);
        JAVASCRIPT_CONFIRM = new <init>("JAVASCRIPT_CONFIRM", 1);
        JAVASCRIPT_PROMPT = new <init>("JAVASCRIPT_PROMPT", 2);
        JAVASCRIPT_BEFOREUNLOAD = new <init>("JAVASCRIPT_BEFOREUNLOAD", 3);
        $VALUES = (new .VALUES[] {
            JAVASCRIPT_ALERT, JAVASCRIPT_CONFIRM, JAVASCRIPT_PROMPT, JAVASCRIPT_BEFOREUNLOAD
        });
    }

    private Q(String s, int i)
    {
        super(s, i);
    }
}
