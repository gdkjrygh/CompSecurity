// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.service;

import com.ibm.eo.model.StorageType;

class 
{

    static final int $SwitchMap$com$ibm$eo$model$StorageType[];

    static 
    {
        $SwitchMap$com$ibm$eo$model$StorageType = new int[StorageType.values().length];
        try
        {
            $SwitchMap$com$ibm$eo$model$StorageType[StorageType.PHONE_FREE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$ibm$eo$model$StorageType[StorageType.SD_CARD_FREE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$ibm$eo$model$StorageType[StorageType.PHONE_USED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$ibm$eo$model$StorageType[StorageType.SD_CARD_USED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$ibm$eo$model$StorageType[StorageType.PHONE_TOTAL.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$ibm$eo$model$StorageType[StorageType.SD_CARD_TOTAL.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
