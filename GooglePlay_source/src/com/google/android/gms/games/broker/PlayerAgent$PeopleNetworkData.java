// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.content.ContentValues;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.broker:
//            PlayerAgent

private static final class totalItems
{

    final String nextPageToken;
    final ArrayList playerValues;
    final int totalItems;

    (ContentValues contentvalues)
    {
        playerValues = new ArrayList();
        playerValues.add(contentvalues);
        nextPageToken = null;
        totalItems = 1;
    }

    totalItems(ArrayList arraylist, String s, int i)
    {
        playerValues = arraylist;
        nextPageToken = s;
        totalItems = i;
    }
}
