// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import com.soundcloud.propeller.schema.Table;

final class _cls9
    implements Table
{

    public final String name()
    {
        return "events";
    }

    public final com.soundcloud.propeller.schema. primaryKey()
    {
        return com.soundcloud.propeller.schema.(new String[] {
            "_id"
        });
    }

    _cls9()
    {
    }
}
