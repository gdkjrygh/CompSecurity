// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.VCardVersion;

// Referenced classes of package ezvcard.io.scribe:
//            DateOrTimePropertyScribe

static class 
{

    static final int $SwitchMap$ezvcard$VCardVersion[];

    static 
    {
        $SwitchMap$ezvcard$VCardVersion = new int[VCardVersion.values().length];
        try
        {
            $SwitchMap$ezvcard$VCardVersion[VCardVersion.V2_1.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$ezvcard$VCardVersion[VCardVersion.V3_0.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$ezvcard$VCardVersion[VCardVersion.V4_0.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
