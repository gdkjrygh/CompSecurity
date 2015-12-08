// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            PasswordSpecification

public static final class mMaximumSize
{

    private final TreeSet mAllowedCharSet = new TreeSet();
    private int mMaximumSize;
    private int mMinimumSize;
    private final List mRequiredCharCounts = new ArrayList();
    private final List mRequiredCharSets = new ArrayList();

    private static TreeSet checkAndSortChars(String s, String s1)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new pecificationError((new StringBuilder()).append(s1).append(" cannot be null or empty").toString());
        }
        TreeSet treeset = new TreeSet();
        s = s.toCharArray();
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            char c = s[i];
            if (PasswordSpecification.access$100$4868d312(c))
            {
                throw new pecificationError((new StringBuilder()).append(s1).append(" must only contain ASCII printable characters").toString());
            }
            treeset.add(Character.valueOf(c));
        }

        return treeset;
    }

    public final pecificationError allow(String s)
    {
        mAllowedCharSet.addAll(checkAndSortChars(s, "allowedChars"));
        return this;
    }

    public final PasswordSpecification build()
    {
        if (mAllowedCharSet.isEmpty())
        {
            throw new pecificationError("no allowed characters specified");
        }
        Iterator iterator = mRequiredCharCounts.iterator();
        int i;
        for (i = 0; iterator.hasNext(); i = ((Integer)iterator.next()).intValue() + i) { }
        if (i > mMaximumSize)
        {
            throw new pecificationError("required character count cannot be greater than the max password size");
        }
        boolean aflag[] = new boolean[95];
        for (Iterator iterator1 = mRequiredCharSets.iterator(); iterator1.hasNext();)
        {
            char ac[] = ((String)iterator1.next()).toCharArray();
            int k = ac.length;
            int j = 0;
            while (j < k) 
            {
                char c = ac[j];
                if (aflag[c - 32])
                {
                    throw new pecificationError((new StringBuilder("character ")).append(c).append(" occurs in more than one required character set").toString());
                }
                aflag[c - 32] = true;
                j++;
            }
        }

        return new PasswordSpecification(1, PasswordSpecification.access$000(mAllowedCharSet), mRequiredCharSets, mRequiredCharCounts, mMinimumSize, mMaximumSize);
    }

    public final mMaximumSize ofLength$17e0b814()
    {
        mMinimumSize = 12;
        mMaximumSize = 16;
        return this;
    }

    public final mMaximumSize require$55bdf885(String s)
    {
        s = checkAndSortChars(s, "requiredChars");
        mRequiredCharSets.add(PasswordSpecification.access$000(s));
        mRequiredCharCounts.add(Integer.valueOf(1));
        return this;
    }

    public pecificationError()
    {
        mMinimumSize = 12;
        mMaximumSize = 16;
    }
}
