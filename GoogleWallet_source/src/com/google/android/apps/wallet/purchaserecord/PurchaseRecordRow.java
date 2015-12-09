// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.checkout.commonui.purchaserecord.common.RowTag;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordRenderable

public final class PurchaseRecordRow
    implements Parcelable
{
    static final class RuleWeight extends Enum
    {

        private static final RuleWeight $VALUES[];
        public static final RuleWeight NONE;
        public static final RuleWeight THICK;
        public static final RuleWeight THIN;

        public static RuleWeight valueOf(String s)
        {
            return (RuleWeight)Enum.valueOf(com/google/android/apps/wallet/purchaserecord/PurchaseRecordRow$RuleWeight, s);
        }

        public static RuleWeight[] values()
        {
            return (RuleWeight[])$VALUES.clone();
        }

        static 
        {
            NONE = new RuleWeight("NONE", 0);
            THICK = new RuleWeight("THICK", 1);
            THIN = new RuleWeight("THIN", 2);
            $VALUES = (new RuleWeight[] {
                NONE, THICK, THIN
            });
        }

        private RuleWeight(String s, int i)
        {
            super(s, i);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static PurchaseRecordRow createFromParcel(Parcel parcel)
        {
            PurchaseRecordRow purchaserecordrow = new PurchaseRecordRow();
            purchaserecordrow.header = parcel.readString();
            purchaserecordrow.footer = parcel.readString();
            purchaserecordrow.footerLinkUrl = parcel.readString();
            purchaserecordrow.ruleWeight = RuleWeight.valueOf(parcel.readString());
            purchaserecordrow.content = (PurchaseRecordRenderable)parcel.readParcelable(com/google/android/apps/wallet/purchaserecord/PurchaseRecordRenderable.getClassLoader());
            purchaserecordrow.rightContent = (PurchaseRecordRenderable)parcel.readParcelable(com/google/android/apps/wallet/purchaserecord/PurchaseRecordRenderable.getClassLoader());
            boolean aflag[] = new boolean[1];
            parcel.readBooleanArray(aflag);
            purchaserecordrow.isTitleRow = aflag[0];
            return purchaserecordrow;
        }

        private static PurchaseRecordRow[] newArray(int i)
        {
            return new PurchaseRecordRow[i];
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    static final ImmutableSet supportedRowTags;
    private PurchaseRecordRenderable content;
    private String footer;
    private String footerLinkUrl;
    private String header;
    private boolean isTitleRow;
    private PurchaseRecordRenderable rightContent;
    private RuleWeight ruleWeight;

    public PurchaseRecordRow()
    {
    }

    public PurchaseRecordRow(String s, String s1, String s2, RuleWeight ruleweight, PurchaseRecordRenderable purchaserecordrenderable, PurchaseRecordRenderable purchaserecordrenderable1, boolean flag)
    {
        header = s;
        footer = s1;
        footerLinkUrl = s2;
        ruleWeight = ruleweight;
        content = purchaserecordrenderable;
        rightContent = purchaserecordrenderable1;
        isTitleRow = flag;
    }

    private static PurchaseRecordRow fromRow(com.google.checkout.commonui.purchaserecord.proto.NanoView.Row row)
    {
        PurchaseRecordRow purchaserecordrow;
        Preconditions.checkNotNull(row, "Row is null");
        purchaserecordrow = new PurchaseRecordRow();
        if (row.header != null)
        {
            purchaserecordrow.header = row.header;
        }
        if (row.footer != null)
        {
            purchaserecordrow.footer = row.footer;
        }
        if (row.footerLinkUrl != null)
        {
            purchaserecordrow.footerLinkUrl = row.footerLinkUrl;
        }
        Protos.valueWithDefault(row.rule, 0);
        JVM INSTR tableswitch 1 2: default 92
    //                   1 159
    //                   2 169;
           goto _L1 _L2 _L3
_L1:
        purchaserecordrow.ruleWeight = RuleWeight.NONE;
_L5:
        if (row.content != null)
        {
            purchaserecordrow.content = PurchaseRecordRenderable.fromRenderable(row.content);
        }
        if (row.rightContent != null)
        {
            purchaserecordrow.rightContent = PurchaseRecordRenderable.fromRenderable(row.rightContent);
        }
        purchaserecordrow.isTitleRow = Arrays.asList(row.tag).contains(RowTag.TITLE.getValue());
        return purchaserecordrow;
_L2:
        purchaserecordrow.ruleWeight = RuleWeight.THICK;
        continue; /* Loop/switch isn't completed */
_L3:
        purchaserecordrow.ruleWeight = RuleWeight.THIN;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static List fromRows(List list)
    {
        Preconditions.checkNotNull(list, "Rows is null");
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(fromRow((com.google.checkout.commonui.purchaserecord.proto.NanoView.Row)list.next()))) { }
        return arraylist;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final Optional getContent()
    {
        return Optional.fromNullable(content);
    }

    public final Optional getFooter()
    {
        return Optional.fromNullable(footer);
    }

    public final Optional getFooterLinkUrl()
    {
        return Optional.fromNullable(footerLinkUrl);
    }

    public final Optional getHeader()
    {
        return Optional.fromNullable(header);
    }

    public final Optional getRightContent()
    {
        return Optional.fromNullable(rightContent);
    }

    public final RuleWeight getRuleWeight()
    {
        return ruleWeight;
    }

    public final boolean isTitleRow()
    {
        return isTitleRow;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(header);
        parcel.writeString(footer);
        parcel.writeString(footerLinkUrl);
        parcel.writeString(ruleWeight.name());
        parcel.writeParcelable(content, 0);
        parcel.writeParcelable(rightContent, 0);
        parcel.writeBooleanArray(new boolean[] {
            isTitleRow()
        });
    }

    static 
    {
        supportedRowTags = ImmutableSet.of(RowTag.TITLE.getValue());
    }


/*
    static String access$002(PurchaseRecordRow purchaserecordrow, String s)
    {
        purchaserecordrow.header = s;
        return s;
    }

*/


/*
    static String access$102(PurchaseRecordRow purchaserecordrow, String s)
    {
        purchaserecordrow.footer = s;
        return s;
    }

*/


/*
    static String access$202(PurchaseRecordRow purchaserecordrow, String s)
    {
        purchaserecordrow.footerLinkUrl = s;
        return s;
    }

*/


/*
    static RuleWeight access$302(PurchaseRecordRow purchaserecordrow, RuleWeight ruleweight)
    {
        purchaserecordrow.ruleWeight = ruleweight;
        return ruleweight;
    }

*/


/*
    static PurchaseRecordRenderable access$402(PurchaseRecordRow purchaserecordrow, PurchaseRecordRenderable purchaserecordrenderable)
    {
        purchaserecordrow.content = purchaserecordrenderable;
        return purchaserecordrenderable;
    }

*/


/*
    static PurchaseRecordRenderable access$502(PurchaseRecordRow purchaserecordrow, PurchaseRecordRenderable purchaserecordrenderable)
    {
        purchaserecordrow.rightContent = purchaserecordrenderable;
        return purchaserecordrenderable;
    }

*/


/*
    static boolean access$602(PurchaseRecordRow purchaserecordrow, boolean flag)
    {
        purchaserecordrow.isTitleRow = flag;
        return flag;
    }

*/
}
