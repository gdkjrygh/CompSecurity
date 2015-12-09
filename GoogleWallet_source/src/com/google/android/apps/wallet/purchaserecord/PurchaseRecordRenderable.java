// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.base.Optional;

public class PurchaseRecordRenderable
    implements Parcelable
{
    static final class Style extends Enum
    {

        private static final Style $VALUES[];
        public static final Style BOLD;
        public static final Style NORMAL;
        public static final Style STRIKETHROUGH;

        public static Style valueOf(String s)
        {
            return (Style)Enum.valueOf(com/google/android/apps/wallet/purchaserecord/PurchaseRecordRenderable$Style, s);
        }

        public static Style[] values()
        {
            return (Style[])$VALUES.clone();
        }

        static 
        {
            NORMAL = new Style("NORMAL", 0);
            BOLD = new Style("BOLD", 1);
            STRIKETHROUGH = new Style("STRIKETHROUGH", 2);
            $VALUES = (new Style[] {
                NORMAL, BOLD, STRIKETHROUGH
            });
        }

        private Style(String s, int i)
        {
            super(s, i);
        }
    }

    static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type DATE;
        public static final Type DATE_TIME;
        public static final Type EMPTY;
        public static final Type IMAGE_RESOURCE_ID;
        public static final Type IMAGE_URL;
        public static final Type TEXT;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/google/android/apps/wallet/purchaserecord/PurchaseRecordRenderable$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            EMPTY = new Type("EMPTY", 0);
            TEXT = new Type("TEXT", 1);
            IMAGE_RESOURCE_ID = new Type("IMAGE_RESOURCE_ID", 2);
            IMAGE_URL = new Type("IMAGE_URL", 3);
            DATE_TIME = new Type("DATE_TIME", 4);
            DATE = new Type("DATE", 5);
            $VALUES = (new Type[] {
                EMPTY, TEXT, IMAGE_RESOURCE_ID, IMAGE_URL, DATE_TIME, DATE
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static PurchaseRecordRenderable createFromParcel(Parcel parcel)
        {
            PurchaseRecordRenderable purchaserecordrenderable = new PurchaseRecordRenderable();
            purchaserecordrenderable.mStyle = Style.valueOf(parcel.readString());
            purchaserecordrenderable.mText = parcel.readString();
            purchaserecordrenderable.mImageUrl = parcel.readString();
            purchaserecordrenderable.mMillisSinceEpoch = (Long)parcel.readValue(java/lang/Long.getClassLoader());
            purchaserecordrenderable.mLinkUrl = parcel.readString();
            purchaserecordrenderable.mType = Type.valueOf(parcel.readString());
            purchaserecordrenderable.contentDescription = parcel.readString();
            return purchaserecordrenderable;
        }

        private static PurchaseRecordRenderable[] newArray(int i)
        {
            return new PurchaseRecordRenderable[i];
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
    private String contentDescription;
    private int mImageResourceId;
    private String mImageUrl;
    private String mLinkUrl;
    private Long mMillisSinceEpoch;
    private Style mStyle;
    private String mText;
    private Type mType;

    public PurchaseRecordRenderable()
    {
    }

    public static PurchaseRecordRenderable createWithDateTime(Long long1)
    {
        PurchaseRecordRenderable purchaserecordrenderable = new PurchaseRecordRenderable();
        purchaserecordrenderable.mStyle = Style.NORMAL;
        purchaserecordrenderable.mType = Type.DATE_TIME;
        purchaserecordrenderable.mMillisSinceEpoch = long1;
        return purchaserecordrenderable;
    }

    public static PurchaseRecordRenderable createWithText(Style style, String s, String s1)
    {
        PurchaseRecordRenderable purchaserecordrenderable = new PurchaseRecordRenderable();
        purchaserecordrenderable.mStyle = style;
        purchaserecordrenderable.mType = Type.TEXT;
        purchaserecordrenderable.mText = s;
        purchaserecordrenderable.mLinkUrl = s1;
        return purchaserecordrenderable;
    }

    public static PurchaseRecordRenderable fromRenderable(com.google.checkout.commonui.purchaserecord.proto.NanoView.Renderable renderable)
    {
        PurchaseRecordRenderable purchaserecordrenderable = new PurchaseRecordRenderable();
        if (Protos.valuesEqual(renderable.style, 1))
        {
            purchaserecordrenderable.mStyle = Style.BOLD;
        } else
        if (Protos.valuesEqual(renderable.style, 2))
        {
            purchaserecordrenderable.mStyle = Style.STRIKETHROUGH;
        } else
        {
            purchaserecordrenderable.mStyle = Style.NORMAL;
        }
        if (renderable.text != null)
        {
            purchaserecordrenderable.mText = renderable.text;
            purchaserecordrenderable.mType = Type.TEXT;
        } else
        if (renderable.imageUrl != null)
        {
            purchaserecordrenderable.mImageUrl = renderable.imageUrl;
            purchaserecordrenderable.mType = Type.IMAGE_URL;
        } else
        if (renderable.dateTime != null && renderable.dateTime.millisSinceEpoch != null)
        {
            purchaserecordrenderable.mMillisSinceEpoch = renderable.dateTime.millisSinceEpoch;
            Type type;
            if (renderable.dateTime.renderType != null && renderable.dateTime.renderType.intValue() == 1)
            {
                type = Type.DATE_TIME;
            } else
            {
                type = Type.DATE;
            }
            purchaserecordrenderable.mType = type;
        } else
        {
            purchaserecordrenderable.mType = Type.EMPTY;
        }
        if (renderable.linkUrl != null)
        {
            purchaserecordrenderable.mLinkUrl = renderable.linkUrl;
        }
        if (renderable.altImageText != null)
        {
            purchaserecordrenderable.contentDescription = renderable.altImageText;
        }
        return purchaserecordrenderable;
    }

    public int describeContents()
    {
        return 0;
    }

    public final Optional getContentDescription()
    {
        return Optional.fromNullable(contentDescription);
    }

    public final int getImageResourceId()
    {
        return mImageResourceId;
    }

    public final Optional getImageUrl()
    {
        return Optional.fromNullable(mImageUrl);
    }

    public final Optional getLinkUrl()
    {
        return Optional.fromNullable(mLinkUrl);
    }

    public final Optional getMillisSinceEpoch()
    {
        return Optional.fromNullable(mMillisSinceEpoch);
    }

    public final Style getStyle()
    {
        return mStyle;
    }

    public final Optional getText()
    {
        return Optional.fromNullable(mText);
    }

    public final Type getType()
    {
        return mType;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mStyle.name());
        parcel.writeString(mText);
        parcel.writeString(mImageUrl);
        parcel.writeValue(mMillisSinceEpoch);
        parcel.writeString(mLinkUrl);
        parcel.writeString(mType.name());
        parcel.writeString(contentDescription);
    }



/*
    static Style access$002(PurchaseRecordRenderable purchaserecordrenderable, Style style)
    {
        purchaserecordrenderable.mStyle = style;
        return style;
    }

*/


/*
    static String access$102(PurchaseRecordRenderable purchaserecordrenderable, String s)
    {
        purchaserecordrenderable.mText = s;
        return s;
    }

*/


/*
    static String access$202(PurchaseRecordRenderable purchaserecordrenderable, String s)
    {
        purchaserecordrenderable.mImageUrl = s;
        return s;
    }

*/


/*
    static Long access$302(PurchaseRecordRenderable purchaserecordrenderable, Long long1)
    {
        purchaserecordrenderable.mMillisSinceEpoch = long1;
        return long1;
    }

*/


/*
    static String access$402(PurchaseRecordRenderable purchaserecordrenderable, String s)
    {
        purchaserecordrenderable.mLinkUrl = s;
        return s;
    }

*/


/*
    static Type access$502(PurchaseRecordRenderable purchaserecordrenderable, Type type)
    {
        purchaserecordrenderable.mType = type;
        return type;
    }

*/


/*
    static String access$602(PurchaseRecordRenderable purchaserecordrenderable, String s)
    {
        purchaserecordrenderable.contentDescription = s;
        return s;
    }

*/
}
