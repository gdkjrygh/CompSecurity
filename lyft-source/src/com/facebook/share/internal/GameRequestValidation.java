// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.internal.Validate;
import com.facebook.share.model.GameRequestContent;

public class GameRequestValidation
{

    public GameRequestValidation()
    {
    }

    public static void validate(GameRequestContent gamerequestcontent)
    {
        boolean flag = false;
        Validate.notNull(gamerequestcontent.getMessage(), "message");
        int i;
        int j;
        if (gamerequestcontent.getObjectId() != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (gamerequestcontent.getActionType() == com.facebook.share.model.GameRequestContent.ActionType.ASKFOR || gamerequestcontent.getActionType() == com.facebook.share.model.GameRequestContent.ActionType.SEND)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (i ^ j)
        {
            throw new IllegalArgumentException("Object id should be provided if and only if action type is send or askfor");
        }
        j = ((flag) ? 1 : 0);
        if (gamerequestcontent.getTo() != null)
        {
            j = 1;
        }
        i = j;
        if (gamerequestcontent.getSuggestions() != null)
        {
            i = j + 1;
        }
        j = i;
        if (gamerequestcontent.getFilters() != null)
        {
            j = i + 1;
        }
        if (j > 1)
        {
            throw new IllegalArgumentException("Parameters to, filters and suggestions are mutually exclusive");
        } else
        {
            return;
        }
    }
}
