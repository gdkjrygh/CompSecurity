// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.provider;

import android.content.ContentUris;
import android.net.Uri;
import com.google.android.gms.common.internal.Asserts;

public final class QuerySpec
{

    public StringBuilder mExtraWhere;
    public String mSelectionArgs[];
    public final Uri mUri;

    public QuerySpec(Uri uri)
    {
        this(uri, null, null);
    }

    public QuerySpec(Uri uri, String s, String as[])
    {
        mUri = uri;
        mSelectionArgs = as;
        if (s != null)
        {
            mExtraWhere = new StringBuilder(s);
        }
    }

    public static String[] insertSelectionArg(String as[], String s)
    {
        if (as == null)
        {
            return (new String[] {
                s
            });
        } else
        {
            String as1[] = new String[as.length + 1];
            System.arraycopy(as, 0, as1, 0, as.length);
            as1[as.length] = s;
            return as1;
        }
    }

    public final void addWhere(String s, String s1)
    {
        addWhere(s, s1, "=?");
    }

    public final void addWhere(String s, String s1, String s2)
    {
        if (mExtraWhere == null)
        {
            mExtraWhere = new StringBuilder("(");
        } else
        {
            mExtraWhere.append(" AND (");
        }
        mExtraWhere.append(s);
        mExtraWhere.append(s2);
        mExtraWhere.append(")");
        mSelectionArgs = insertSelectionArg(mSelectionArgs, s1);
    }

    public final void addWhereById(String s)
    {
        boolean flag;
        if (ContentUris.parseId(mUri) >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        addWhereByStringKey(s);
    }

    public final void addWhereById(String s, long l)
    {
        addWhere(s, String.valueOf(l));
    }

    public final void addWhereByQuery(String s, String s1)
    {
        s = mUri.getQueryParameter(s);
        if (s != null)
        {
            addWhere(s1, s);
        }
    }

    public final void addWhereByStringKey(String s)
    {
        addWhere(s, mUri.getLastPathSegment());
    }

    public final void addWhereForMask(String s, int i)
    {
        addWhere(s, String.valueOf(i), " & ?");
    }

    public final void addWhereIn(String s, String as[])
    {
        int i;
        boolean flag;
        int j;
        if (mExtraWhere == null)
        {
            mExtraWhere = new StringBuilder("(");
        } else
        {
            mExtraWhere.append(" AND (");
        }
        mExtraWhere.append(s);
        mExtraWhere.append(" IN (");
        flag = true;
        j = as.length;
        i = 0;
        while (i < j) 
        {
            s = as[i];
            if (flag)
            {
                flag = false;
            } else
            {
                mExtraWhere.append(',');
            }
            mExtraWhere.append('\'');
            mExtraWhere.append(s);
            mExtraWhere.append('\'');
            i++;
        }
        mExtraWhere.append(")");
        mExtraWhere.append(")");
    }

    public final void addWhereRaw(String s)
    {
        if (mExtraWhere == null)
        {
            mExtraWhere = new StringBuilder("(");
        } else
        {
            mExtraWhere.append(" AND (");
        }
        mExtraWhere.append(s);
        mExtraWhere.append(")");
    }

    public final String getSelection()
    {
        if (mExtraWhere == null)
        {
            return null;
        } else
        {
            return mExtraWhere.toString();
        }
    }
}
