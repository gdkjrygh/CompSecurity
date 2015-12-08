// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;


// Referenced classes of package com.google.android.gms.games.provider:
//            PlayGamesContentProvider

private static final class readTable
{

    public final String deleteSelection;
    public final String deleteTable;
    public final readTable deleter;
    public final String readColumn;
    public final String readSelection;
    public final String readTable;

    (String s, String s1, String s2,  )
    {
        readColumn = s1;
        deleteSelection = null;
        deleteTable = null;
        deleter = ;
        readSelection = s2;
        readTable = s;
    }

    readTable(String s, String s1, String s2, String s3, String s4)
    {
        readColumn = s1;
        deleteSelection = s4;
        deleteTable = s3;
        deleter = null;
        readSelection = s2;
        readTable = s;
    }
}
