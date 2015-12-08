// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.content.ContentValues;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

static final class ilder extends ilder
{

    public ilder withRow(ContentValues contentvalues)
    {
        throw new UnsupportedOperationException("Cannot add data to empty builder");
    }

    public ilder withRow(HashMap hashmap)
    {
        throw new UnsupportedOperationException("Cannot add data to empty builder");
    }

    ilder(String as[], String s)
    {
        super(as, s, null);
    }
}
