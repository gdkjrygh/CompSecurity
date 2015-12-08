// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            PasswordSpecificationCreator

public final class PasswordSpecification
    implements SafeParcelable
{
    public static final class Builder
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
                throw new InvalidSpecificationError((new StringBuilder()).append(s1).append(" cannot be null or empty").toString());
            }
            TreeSet treeset = new TreeSet();
            s = s.toCharArray();
            int j = s.length;
            for (int i = 0; i < j; i++)
            {
                char c = s[i];
                if (s < 32 || s > 126)
                {
                    throw new InvalidSpecificationError((new StringBuilder()).append(s1).append(" must only contain ASCII printable characters").toString());
                }
                treeset.add(Character.valueOf(c));
            }

            return treeset;
        }

        public final Builder allow(String s)
        {
            mAllowedCharSet.addAll(checkAndSortChars(s, "allowedChars"));
            return this;
        }

        public final PasswordSpecification build()
        {
            if (mAllowedCharSet.isEmpty())
            {
                throw new InvalidSpecificationError("no allowed characters specified");
            }
            Iterator iterator = mRequiredCharCounts.iterator();
            int i;
            for (i = 0; iterator.hasNext(); i = ((Integer)iterator.next()).intValue() + i) { }
            if (i > mMaximumSize)
            {
                throw new InvalidSpecificationError("required character count cannot be greater than the max password size");
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
                        throw new InvalidSpecificationError((new StringBuilder("character ")).append(c).append(" occurs in more than one required character set").toString());
                    }
                    aflag[c - 32] = true;
                    j++;
                }
            }

            return new PasswordSpecification(1, char ac[] = new char[this.size()], mRequiredCharSets, mRequiredCharCounts, mMinimumSize, mMaximumSize);
        }

        public final Builder ofLength$17e0b814()
        {
            mMinimumSize = 12;
            mMaximumSize = 16;
            return this;
        }

        public final Builder require$55bdf885(String s)
        {
            s = checkAndSortChars(s, "requiredChars");
            mRequiredCharSets.add(char ac[] = new char[this.size()]);
            mRequiredCharCounts.add(Integer.valueOf(1));
            return this;
        }

        public Builder()
        {
            mMinimumSize = 12;
            mMaximumSize = 16;
        }
    }

    public static final class InvalidSpecificationError extends Error
    {

        public InvalidSpecificationError(String s)
        {
            super(s);
        }
    }


    public static final PasswordSpecificationCreator CREATOR = new PasswordSpecificationCreator();
    public static final PasswordSpecification DEFAULT = (new Builder())._mth17e0b814().allow("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789")._mth55bdf885("abcdefghijkmnopqrstxyz")._mth55bdf885("ABCDEFGHJKLMNPQRSTXY")._mth55bdf885("3456789").build();
    public static final PasswordSpecification DEFAULT_FOR_VALIDATION = (new Builder())._mth17e0b814().allow("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890")._mth55bdf885("abcdefghijklmnopqrstuvwxyz")._mth55bdf885("ABCDEFGHIJKLMNOPQRSTUVWXYZ")._mth55bdf885("1234567890").build();
    final String mAllowedChars;
    final int mMaximumSize;
    final int mMinimumSize;
    private final Random mRandom = new SecureRandom();
    final List mRequiredCharCounts;
    final List mRequiredCharSets;
    private final int mRequiredSpecMapping[] = extractRequiredSpecMapping();
    final int mVersionCode;

    PasswordSpecification(int i, String s, List list, List list1, int j, int k)
    {
        mVersionCode = i;
        mAllowedChars = s;
        mRequiredCharSets = Collections.unmodifiableList(list);
        mRequiredCharCounts = Collections.unmodifiableList(list1);
        mMinimumSize = j;
        mMaximumSize = k;
    }

    private int[] extractRequiredSpecMapping()
    {
        int ai[] = new int[95];
        Arrays.fill(ai, -1);
        int i = 0;
        for (Iterator iterator = mRequiredCharSets.iterator(); iterator.hasNext();)
        {
            char ac[] = ((String)iterator.next()).toCharArray();
            int k = ac.length;
            for (int j = 0; j < k; j++)
            {
                ai[ac[j] - 32] = i;
            }

            i++;
        }

        return ai;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        PasswordSpecificationCreator.writeToParcel$18e098bf(this, parcel);
    }



/*
    static String access$000(Collection collection)
    {
        char ac[] = new char[collection.size()];
        collection = collection.iterator();
        for (int i = 0; collection.hasNext(); i++)
        {
            ac[i] = ((Character)collection.next()).charValue();
        }

        return new String(ac);
    }

*/

}
