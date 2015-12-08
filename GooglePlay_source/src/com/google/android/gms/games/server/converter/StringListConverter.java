// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.converter;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class StringListConverter
    implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
{

    public StringListConverter()
    {
    }

    public final volatile Object convert(Object obj)
    {
        return TextUtils.join(",", (List)obj);
    }

    public final volatile Object convertBack(Object obj)
    {
        obj = (String)obj;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return new ArrayList();
        } else
        {
            return Arrays.asList(((String) (obj)).split(","));
        }
    }

    public final int getTypeOut()
    {
        return 7;
    }
}
