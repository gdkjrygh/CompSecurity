// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.w;

import android.database.DatabaseUtils;
import com.google.common.base.Function;

final class l
    implements Function
{

    l()
    {
    }

    public String a(Object obj)
    {
        if (obj == null)
        {
            obj = "null";
        } else
        {
            obj = obj.toString();
        }
        return DatabaseUtils.sqlEscapeString(((String) (obj)));
    }

    public Object apply(Object obj)
    {
        return a(obj);
    }
}
