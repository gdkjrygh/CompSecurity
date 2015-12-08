// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;

import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

// Referenced classes of package com.fasterxml.jackson.annotation:
//            JsonAutoDetect

public static final class  extends Enum
{

    private static final DEFAULT $VALUES[];
    public static final DEFAULT ANY;
    public static final DEFAULT DEFAULT;
    public static final DEFAULT NONE;
    public static final DEFAULT NON_PRIVATE;
    public static final DEFAULT PROTECTED_AND_PUBLIC;
    public static final DEFAULT PUBLIC_ONLY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fasterxml/jackson/annotation/JsonAutoDetect$Visibility, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public boolean isVisible(Member member)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = flag1;
        p.com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility[ordinal()];
        JVM INSTR tableswitch 1 5: default 48
    //                   1 50
    //                   2 52
    //                   3 54
    //                   4 70
    //                   5 84;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L2:
        break MISSING_BLOCK_LABEL_50;
_L1:
        flag = false;
_L8:
        return flag;
_L3:
        return false;
_L4:
        flag = flag1;
        if (!Modifier.isPrivate(member.getModifiers())) goto _L8; else goto _L7
_L7:
        return false;
_L5:
        flag = flag1;
        if (Modifier.isProtected(member.getModifiers())) goto _L8; else goto _L6
_L6:
        return Modifier.isPublic(member.getModifiers());
    }

    static 
    {
        ANY = new <init>("ANY", 0);
        NON_PRIVATE = new <init>("NON_PRIVATE", 1);
        PROTECTED_AND_PUBLIC = new <init>("PROTECTED_AND_PUBLIC", 2);
        PUBLIC_ONLY = new <init>("PUBLIC_ONLY", 3);
        NONE = new <init>("NONE", 4);
        DEFAULT = new <init>("DEFAULT", 5);
        $VALUES = (new .VALUES[] {
            ANY, NON_PRIVATE, PROTECTED_AND_PUBLIC, PUBLIC_ONLY, NONE, DEFAULT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
