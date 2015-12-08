// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.content.Context;
import android.database.Cursor;
import it.sephiroth.android.library.picasso.f;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            k

class <init> extends <init>
{

    final k p;

    protected f a(long l, int i, String s, String s1)
    {
        if (s != null)
        {
            return new <init>(p, p.v);
        } else
        {
            return null;
        }
    }

    public (k k1, Context context, int i, int j, int l, int i1, Cursor cursor)
    {
        p = k1;
        super(k1, context, i, j, l, i1, cursor);
    }
}
