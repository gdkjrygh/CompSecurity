// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import android.database.Cursor;

// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            SoundAssociation

public class Like extends SoundAssociation
{

    public Like()
    {
        associationType = 1;
    }

    public Like(Cursor cursor)
    {
        super(cursor);
        associationType = 1;
    }
}
