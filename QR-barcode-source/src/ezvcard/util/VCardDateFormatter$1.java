// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.util;


// Referenced classes of package ezvcard.util:
//            VCardDateFormatter, ISOFormat

static class 
{

    static final int $SwitchMap$ezvcard$util$ISOFormat[];

    static 
    {
        $SwitchMap$ezvcard$util$ISOFormat = new int[ISOFormat.values().length];
        try
        {
            $SwitchMap$ezvcard$util$ISOFormat[ISOFormat.UTC_TIME_BASIC.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$ezvcard$util$ISOFormat[ISOFormat.UTC_TIME_EXTENDED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$ezvcard$util$ISOFormat[ISOFormat.TIME_EXTENDED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$ezvcard$util$ISOFormat[ISOFormat.HCARD_TIME_TAG.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
