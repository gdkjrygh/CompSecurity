// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.provider;

import android.content.ContentValues;
import android.database.Cursor;
import com.pandora.radio.data.s;

// Referenced classes of package com.pandora.radio.provider:
//            b

static final class 
    implements 
{

    public ContentValues a(Object obj)
    {
        return ((s)obj).a();
    }

    public Object a(Cursor cursor)
    {
        return new s(cursor);
    }

    ()
    {
    }
}
