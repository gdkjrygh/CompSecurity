// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.provider;

import java.util.Collection;

public final class SelectionArgs
{

    private StringBuilder mSelection;
    public String mSelectionArgs[];

    private SelectionArgs(String s, int i)
    {
        mSelection = new StringBuilder((new StringBuilder()).append(s).append("(").toString());
        mSelectionArgs = new String[i];
    }

    public static SelectionArgs forObjects(String s, Collection collection)
    {
        collection = ((Collection) (collection.toArray()));
        SelectionArgs selectionargs = new SelectionArgs(s, collection.length);
        int j = collection.length;
        int i = 0;
        while (i < j) 
        {
            StringBuilder stringbuilder = selectionargs.mSelection;
            if (i == 0)
            {
                s = "?";
            } else
            {
                s = ",?";
            }
            stringbuilder.append(s);
            selectionargs.mSelectionArgs[i] = String.valueOf(collection[i]);
            i++;
        }
        return selectionargs;
    }

    public final String getSelection()
    {
        return (new StringBuilder()).append(mSelection.toString()).append(")").toString();
    }
}
