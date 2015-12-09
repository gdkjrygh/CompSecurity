// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;


// Referenced classes of package org.keyczar:
//            DefaultKeyType

static final class 
{

    static final int $SwitchMap$org$keyczar$DefaultKeyType[];

    static 
    {
        $SwitchMap$org$keyczar$DefaultKeyType = new int[DefaultKeyType.values().length];
        try
        {
            $SwitchMap$org$keyczar$DefaultKeyType[DefaultKeyType.RSA_PRIV.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$org$keyczar$DefaultKeyType[DefaultKeyType.AES.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$org$keyczar$DefaultKeyType[DefaultKeyType.HMAC_SHA1.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$org$keyczar$DefaultKeyType[DefaultKeyType.DSA_PRIV.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$org$keyczar$DefaultKeyType[DefaultKeyType.DSA_PUB.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$org$keyczar$DefaultKeyType[DefaultKeyType.RSA_PUB.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
