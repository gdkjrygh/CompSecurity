// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class BaseOperationsBuilder
{

    String accountName;
    Context context;
    String identity;
    ArrayList operations;

    public BaseOperationsBuilder(Context context1, String s, String s1)
    {
        operations = new ArrayList();
        context = context1;
        accountName = s1;
        identity = s;
    }

    static Uri addCallerIsSyncAdapterParameter(Uri uri)
    {
        return uri.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
    }

    static Uri getUriForContactOperation()
    {
        return addCallerIsSyncAdapterParameter(android.provider.ContactsContract.RawContacts.CONTENT_URI);
    }

    static Uri getUriForDataOperation()
    {
        return addCallerIsSyncAdapterParameter(android.provider.ContactsContract.Data.CONTENT_URI);
    }

    static Uri getUriForStatusOperation()
    {
        return addCallerIsSyncAdapterParameter(android.provider.ContactsContract.StatusUpdates.CONTENT_URI);
    }

    String createSelection(String s, String as[])
    {
        s = new StringBuffer(s);
        for (int i = 0; i < as.length; i++)
        {
            if (s.length() > 0)
            {
                s.append(" AND ");
            }
            s.append(as[i]).append(" = ? ");
        }

        return s.toString();
    }

    public ArrayList getOperations()
    {
        return operations;
    }

    String[] mergeArrays(String as[], String as1[])
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(Arrays.asList(as));
        arraylist.addAll(Arrays.asList(as1));
        as = new String[arraylist.size()];
        arraylist.toArray(as);
        return as;
    }
}
