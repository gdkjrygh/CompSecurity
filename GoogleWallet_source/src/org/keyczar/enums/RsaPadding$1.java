// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar.enums;


// Referenced classes of package org.keyczar.enums:
//            RsaPadding

static final class 
{

    static final int $SwitchMap$org$keyczar$enums$RsaPadding[];

    static 
    {
        $SwitchMap$org$keyczar$enums$RsaPadding = new int[RsaPadding.values().length];
        try
        {
            $SwitchMap$org$keyczar$enums$RsaPadding[RsaPadding.OAEP.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$org$keyczar$enums$RsaPadding[RsaPadding.PKCS.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
