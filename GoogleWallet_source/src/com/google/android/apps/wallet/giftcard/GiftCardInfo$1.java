// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import android.os.Parcel;
import com.google.android.apps.wallet.wobs.add.UserDataPrompt;
import com.google.common.base.Throwables;
import com.google.common.collect.Lists;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.giftcard:
//            GiftCardInfo

final class tion
    implements android.os.tor
{

    private static GiftCardInfo createFromParcel(Parcel parcel)
    {
        ClassLoader classloader = com/google/android/apps/wallet/giftcard/GiftCardInfo.getClassLoader();
        GiftCardInfo giftcardinfo = new GiftCardInfo();
        GiftCardInfo.access$002(giftcardinfo, Lists.newArrayList());
        android.os.Parcelable aparcelable[] = parcel.readParcelableArray(classloader);
        int j = aparcelable.length;
        for (int i = 0; i < j; i++)
        {
            android.os.Parcelable parcelable = aparcelable[i];
            GiftCardInfo.access$000(giftcardinfo).add((UserDataPrompt)parcelable);
        }

        GiftCardInfo.access$102(giftcardinfo, (UserDataPrompt)parcel.readParcelable(classloader));
        GiftCardInfo.access$202(giftcardinfo, (UserDataPrompt)parcel.readParcelable(classloader));
        parcel = parcel.createByteArray();
        if (parcel != null && parcel.length > 0)
        {
            GiftCardInfo.access$302(giftcardinfo, new com.google.wallet.proto.api.ards.DiscoverableGiftCard());
            try
            {
                MessageNano.mergeFrom(GiftCardInfo.access$300(giftcardinfo), parcel);
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                throw Throwables.propagate(parcel);
            }
        }
        return giftcardinfo;
    }

    private static GiftCardInfo[] newArray(int i)
    {
        return new GiftCardInfo[i];
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    tion()
    {
    }
}
