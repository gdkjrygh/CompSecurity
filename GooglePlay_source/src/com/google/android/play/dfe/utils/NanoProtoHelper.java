// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.dfe.utils;

import com.google.protobuf.nano.MessageNano;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public final class NanoProtoHelper
{

    private static final Map sFieldCache = new HashMap();

    public static MessageNano getParsedResponseFromWrapper(MessageNano messagenano, Class class1, Class class2)
    {
        Field field;
        Field afield[];
        int i;
        int j;
        try
        {
            field = (Field)sFieldCache.get(class2);
        }
        // Misplaced declaration of an exception variable
        catch (MessageNano messagenano)
        {
            throw new RuntimeException(messagenano);
        }
        if (field == null) goto _L2; else goto _L1
_L1:
        class1 = field;
_L3:
        return (MessageNano)class1.get(messagenano);
_L2:
        afield = class1.getFields();
        j = afield.length;
        i = 0;
_L4:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        field = afield[i];
        if (!field.getType().equals(class2) || !Modifier.isPublic(field.getModifiers()))
        {
            break MISSING_BLOCK_LABEL_102;
        }
        sFieldCache.put(class2, field);
        class1 = field;
          goto _L3
        i++;
          goto _L4
        throw new IllegalArgumentException((new StringBuilder("No field for ")).append(class2).append(" in ").append(class1).toString());
          goto _L3
    }

}
