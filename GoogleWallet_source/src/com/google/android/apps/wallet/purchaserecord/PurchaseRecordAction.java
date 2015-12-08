// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import java.util.List;

final class PurchaseRecordAction
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static PurchaseRecordAction createFromParcel(Parcel parcel)
        {
            return new PurchaseRecordAction(parcel.readString(), parcel.readString());
        }

        private static PurchaseRecordAction[] newArray(int i)
        {
            return new PurchaseRecordAction[i];
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
    private String linkUri;
    private String text;

    PurchaseRecordAction(String s, String s1)
    {
        text = s;
        linkUri = s1;
    }

    public static List fromActionRenderables(List list)
    {
        return Lists.transform(list, new Function() {

            private static PurchaseRecordAction apply(com.google.checkout.commonui.purchaserecord.proto.NanoCommon.ActionRenderable actionrenderable)
            {
                return new PurchaseRecordAction(actionrenderable.text, actionrenderable.linkUri);
            }

            public final volatile Object apply(Object obj)
            {
                return apply((com.google.checkout.commonui.purchaserecord.proto.NanoCommon.ActionRenderable)obj);
            }

        });
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String getLinkUri()
    {
        return linkUri;
    }

    public final String getText()
    {
        return text;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(text);
        parcel.writeString(linkUri);
    }

}
