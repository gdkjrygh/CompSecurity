// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications.view.style;


class 
{

    static final int $SwitchMap$com$pinterest$api$model$Notification$DataType[];
    static final int $SwitchMap$com$pinterest$api$model$NotificationTemplate$SubjectType[];

    static 
    {
        $SwitchMap$com$pinterest$api$model$NotificationTemplate$SubjectType = new int[com.pinterest.api.model.bjectType.values().length];
        try
        {
            $SwitchMap$com$pinterest$api$model$NotificationTemplate$SubjectType[com.pinterest.api.model.bjectType.USER.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$pinterest$api$model$NotificationTemplate$SubjectType[com.pinterest.api.model.bjectType.PIN.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$pinterest$api$model$NotificationTemplate$SubjectType[com.pinterest.api.model.bjectType.BOARD.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$pinterest$api$model$NotificationTemplate$SubjectType[com.pinterest.api.model.bjectType.COMMENT.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        $SwitchMap$com$pinterest$api$model$Notification$DataType = new int[com.pinterest.api.model.alues().length];
        try
        {
            $SwitchMap$com$pinterest$api$model$Notification$DataType[com.pinterest.api.model.SER.rdinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$pinterest$api$model$Notification$DataType[com.pinterest.api.model.IN.rdinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$pinterest$api$model$Notification$DataType[com.pinterest.api.model.OARD.rdinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$pinterest$api$model$Notification$DataType[com.pinterest.api.model.IN_COMMENT.rdinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
