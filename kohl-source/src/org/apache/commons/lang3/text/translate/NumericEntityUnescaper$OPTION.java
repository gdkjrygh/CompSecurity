// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text.translate;


// Referenced classes of package org.apache.commons.lang3.text.translate:
//            NumericEntityUnescaper

public static final class  extends Enum
{

    private static final errorIfNoSemiColon $VALUES[];
    public static final errorIfNoSemiColon errorIfNoSemiColon;
    public static final errorIfNoSemiColon semiColonOptional;
    public static final errorIfNoSemiColon semiColonRequired;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(org/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION, s);
    }

    public static final [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        semiColonRequired = new <init>("semiColonRequired", 0);
        semiColonOptional = new <init>("semiColonOptional", 1);
        errorIfNoSemiColon = new <init>("errorIfNoSemiColon", 2);
        $VALUES = (new .VALUES[] {
            semiColonRequired, semiColonOptional, errorIfNoSemiColon
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
