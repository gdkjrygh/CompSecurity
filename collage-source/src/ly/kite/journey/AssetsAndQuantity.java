// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.journey;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import ly.kite.catalogue.Asset;

public class AssetsAndQuantity
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private static final byte FALSE_AS_BYTE = 0;
    private static final String LOG_TAG = "AssetsAndQuantity";
    private static final byte TRUE_AS_BYTE = 1;
    private Asset mEditedAsset;
    private String mEditedForProductId;
    private int mQuantity;
    private Asset mUneditedAsset;

    private AssetsAndQuantity(Parcel parcel)
    {
        mUneditedAsset = (Asset)parcel.readParcelable(ly/kite/catalogue/Asset.getClassLoader());
        if (parcel.readByte() == 1)
        {
            mEditedAsset = (Asset)parcel.readParcelable(ly/kite/catalogue/Asset.getClassLoader());
        }
        mQuantity = parcel.readInt();
        mEditedForProductId = parcel.readString();
    }

    AssetsAndQuantity(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public AssetsAndQuantity(Asset asset)
    {
        this(asset, 1);
    }

    public AssetsAndQuantity(Asset asset, int i)
    {
        mUneditedAsset = asset;
        mQuantity = i;
    }

    public static boolean uneditedAssetIsInList(List list, Asset asset)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            if (((AssetsAndQuantity)list.next()).getUneditedAsset().equals(asset))
            {
                return true;
            }
        }

        return false;
    }

    public int decrement()
    {
        if (mQuantity > 0)
        {
            mQuantity = mQuantity - 1;
        }
        return mQuantity;
    }

    public int describeContents()
    {
        return 0;
    }

    public Asset getEditedAsset()
    {
        return mEditedAsset;
    }

    public String getEditedForProductId()
    {
        return mEditedForProductId;
    }

    public int getQuantity()
    {
        return mQuantity;
    }

    public Asset getUneditedAsset()
    {
        return mUneditedAsset;
    }

    public int increment()
    {
        int i = mQuantity + 1;
        mQuantity = i;
        return i;
    }

    public void setEditedAsset(Asset asset, String s)
    {
        mEditedAsset = asset;
        if (asset == null)
        {
            mEditedForProductId = null;
            return;
        } else
        {
            mEditedForProductId = s;
            return;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(mUneditedAsset, i);
        if (mEditedAsset != null)
        {
            parcel.writeByte((byte)1);
            parcel.writeParcelable(mEditedAsset, i);
        } else
        {
            parcel.writeByte((byte)0);
        }
        parcel.writeInt(mQuantity);
        parcel.writeString(mEditedForProductId);
    }


    /* member class not found */
    class _cls1 {}

}
