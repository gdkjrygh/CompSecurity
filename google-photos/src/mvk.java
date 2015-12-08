// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;

final class mvk extends ThreadLocal
{

    mvk()
    {
    }

    protected final Object initialValue()
    {
        return new ContentValues();
    }
}
