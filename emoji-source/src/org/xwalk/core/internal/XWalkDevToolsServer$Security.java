// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;


// Referenced classes of package org.xwalk.core.internal:
//            XWalkDevToolsServer

public static final class  extends Enum
{

    private static final ALLOW_SOCKET_ACCESS $VALUES[];
    public static final ALLOW_SOCKET_ACCESS ALLOW_DEBUG_PERMISSION;
    public static final ALLOW_SOCKET_ACCESS ALLOW_SOCKET_ACCESS;
    public static final ALLOW_SOCKET_ACCESS DEFAULT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(org/xwalk/core/internal/XWalkDevToolsServer$Security, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DEFAULT = new <init>("DEFAULT", 0);
        ALLOW_DEBUG_PERMISSION = new <init>("ALLOW_DEBUG_PERMISSION", 1);
        ALLOW_SOCKET_ACCESS = new <init>("ALLOW_SOCKET_ACCESS", 2);
        $VALUES = (new .VALUES[] {
            DEFAULT, ALLOW_DEBUG_PERMISSION, ALLOW_SOCKET_ACCESS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
