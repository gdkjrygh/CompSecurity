// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.speechkit.speech;


public final class TransitionStringEnum extends Enum
{

    public static final TransitionStringEnum DEFAULT;
    public static final TransitionStringEnum DISSOLVE;
    private static final TransitionStringEnum ENUM$VALUES[];
    public static final TransitionStringEnum FADE;
    public static final TransitionStringEnum NONE;
    public static final TransitionStringEnum ROLL;
    public static final TransitionStringEnum SLIDE;
    public static final TransitionStringEnum ZOOM;
    private String text;

    private TransitionStringEnum(String s, int i, String s1)
    {
        super(s, i);
        text = s1;
    }

    public static TransitionStringEnum fromString(String s)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        TransitionStringEnum atransitionstringenum[];
        int i;
        int j;
        atransitionstringenum = values();
        j = atransitionstringenum.length;
        i = 0;
_L7:
        if (i < j) goto _L3; else goto _L2
_L2:
        TransitionStringEnum transitionstringenum = null;
_L5:
        return transitionstringenum;
_L3:
        TransitionStringEnum transitionstringenum1;
        transitionstringenum1 = atransitionstringenum[i];
        transitionstringenum = transitionstringenum1;
        if (s.equalsIgnoreCase(transitionstringenum1.text)) goto _L5; else goto _L4
_L4:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static TransitionStringEnum valueOf(String s)
    {
        return (TransitionStringEnum)Enum.valueOf(com/admarvel/speechkit/speech/TransitionStringEnum, s);
    }

    public static TransitionStringEnum[] values()
    {
        TransitionStringEnum atransitionstringenum[] = ENUM$VALUES;
        int i = atransitionstringenum.length;
        TransitionStringEnum atransitionstringenum1[] = new TransitionStringEnum[i];
        System.arraycopy(atransitionstringenum, 0, atransitionstringenum1, 0, i);
        return atransitionstringenum1;
    }

    public String getText()
    {
        return text;
    }

    static 
    {
        DEFAULT = new TransitionStringEnum("DEFAULT", 0, "default");
        DISSOLVE = new TransitionStringEnum("DISSOLVE", 1, "dissolve");
        FADE = new TransitionStringEnum("FADE", 2, "fade");
        ROLL = new TransitionStringEnum("ROLL", 3, "roll");
        SLIDE = new TransitionStringEnum("SLIDE", 4, "slide");
        ZOOM = new TransitionStringEnum("ZOOM", 5, "zoom");
        NONE = new TransitionStringEnum("NONE", 6, "none");
        ENUM$VALUES = (new TransitionStringEnum[] {
            DEFAULT, DISSOLVE, FADE, ROLL, SLIDE, ZOOM, NONE
        });
    }
}
