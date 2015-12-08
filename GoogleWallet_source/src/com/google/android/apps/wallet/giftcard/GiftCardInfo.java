// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.apps.wallet.wobs.add.ImageInfo;
import com.google.android.apps.wallet.wobs.add.ProgramCardInfo;
import com.google.android.apps.wallet.wobs.add.UserDataPrompt;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.giftcard:
//            GiftCardProgram

class GiftCardInfo
    implements ProgramCardInfo
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static GiftCardInfo createFromParcel(Parcel parcel)
        {
            ClassLoader classloader = com/google/android/apps/wallet/giftcard/GiftCardInfo.getClassLoader();
            GiftCardInfo giftcardinfo = new GiftCardInfo();
            giftcardinfo.formPrompts = Lists.newArrayList();
            Parcelable aparcelable[] = parcel.readParcelableArray(classloader);
            int j = aparcelable.length;
            for (int i = 0; i < j; i++)
            {
                Parcelable parcelable = aparcelable[i];
                giftcardinfo.formPrompts.add((UserDataPrompt)parcelable);
            }

            giftcardinfo.merchantNamePrompt = (UserDataPrompt)parcel.readParcelable(classloader);
            giftcardinfo.colorPrompt = (UserDataPrompt)parcel.readParcelable(classloader);
            parcel = parcel.createByteArray();
            if (parcel != null && parcel.length > 0)
            {
                giftcardinfo.discoverable = new com.google.wallet.proto.api.NanoWalletGiftCards.DiscoverableGiftCard();
                try
                {
                    MessageNano.mergeFrom(giftcardinfo.discoverable, parcel);
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

    };
    private UserDataPrompt colorPrompt;
    private com.google.wallet.proto.api.NanoWalletGiftCards.DiscoverableGiftCard discoverable;
    private List formPrompts;
    private ImageInfo images[];
    private UserDataPrompt merchantNamePrompt;

    GiftCardInfo()
    {
        formPrompts = Lists.newArrayList();
    }

    private GiftCardInfo copy()
    {
        GiftCardInfo giftcardinfo = new GiftCardInfo();
        giftcardinfo.formPrompts = ImmutableList.copyOf(formPrompts);
        giftcardinfo.merchantNamePrompt = merchantNamePrompt;
        giftcardinfo.colorPrompt = colorPrompt;
        giftcardinfo.discoverable = discoverable;
        ImageInfo aimageinfo[];
        if (getImages() != null)
        {
            aimageinfo = (ImageInfo[])Arrays.copyOf(getImages(), getImages().length);
        } else
        {
            aimageinfo = null;
        }
        giftcardinfo.images = aimageinfo;
        return giftcardinfo;
    }

    public final volatile ProgramCardInfo copy()
    {
        return copy();
    }

    public int describeContents()
    {
        return 0;
    }

    public final String getAddMsgContent()
    {
        if (discoverable != null && discoverable.addMessage != null)
        {
            return discoverable.addMessage.content;
        } else
        {
            return null;
        }
    }

    public final String getAddMsgTitle()
    {
        if (discoverable != null && discoverable.addMessage != null)
        {
            return discoverable.addMessage.title;
        } else
        {
            return null;
        }
    }

    final List getAllPrompts()
    {
        java.util.ArrayList arraylist = Lists.newArrayList(formPrompts);
        if (merchantNamePrompt != null && merchantNamePrompt.isModifiable())
        {
            arraylist.add(merchantNamePrompt);
        }
        if (colorPrompt != null)
        {
            arraylist.add(colorPrompt);
        }
        return arraylist;
    }

    public final Optional getCardNumber()
    {
        UserDataPrompt userdataprompt = (UserDataPrompt)Iterables.find(formPrompts, UserDataPrompt.withId(-1), null);
        if (userdataprompt != null)
        {
            if (userdataprompt.hasValue())
            {
                return Optional.of(userdataprompt.getValue());
            }
            if (!TextUtils.isEmpty(userdataprompt.getPrefilledValue()))
            {
                return Optional.fromNullable(userdataprompt.getPrefilledValue());
            }
        }
        return Optional.absent();
    }

    public final UserDataPrompt getColorPrompt()
    {
        return colorPrompt;
    }

    public final com.google.wallet.proto.api.NanoWalletGiftCards.DiscoverableGiftCard getDiscoverable()
    {
        return discoverable;
    }

    public final List getFormPrompts()
    {
        return ImmutableList.copyOf(formPrompts);
    }

    public final ImageInfo getImage(com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side side)
    {
        if (images != null)
        {
            ImageInfo aimageinfo[] = images;
            int j = aimageinfo.length;
            for (int i = 0; i < j; i++)
            {
                ImageInfo imageinfo = aimageinfo[i];
                if (imageinfo.getSide() == side)
                {
                    return imageinfo;
                }
            }

        }
        return null;
    }

    public final ImageInfo[] getImages()
    {
        return images;
    }

    public final String getLogoUrl()
    {
        if (discoverable != null)
        {
            return discoverable.nativeRenderingInfo.logoImageUrl;
        } else
        {
            return null;
        }
    }

    public final String getMerchantName()
    {
        if (discoverable != null)
        {
            return discoverable.nativeRenderingInfo.merchantName;
        }
        if (merchantNamePrompt != null)
        {
            if (merchantNamePrompt.hasValue())
            {
                return merchantNamePrompt.getValue();
            }
            if (!TextUtils.isEmpty(merchantNamePrompt.getPrefilledValue()))
            {
                return merchantNamePrompt.getPrefilledValue();
            }
        }
        return null;
    }

    public final void setImages(ImageInfo aimageinfo[])
    {
        boolean flag;
        if (aimageinfo == null || aimageinfo.length == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "images should be either null or an array of 2");
        images = aimageinfo;
    }

    public final void setMerchantName(String s)
    {
        boolean flag;
        if (discoverable == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        Preconditions.checkNotNull(merchantNamePrompt);
        Preconditions.checkState(merchantNamePrompt.isModifiable());
        merchantNamePrompt.setValue(s);
    }

    final void setPromptValue(int i, String s)
    {
        Iterator iterator = formPrompts.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            UserDataPrompt userdataprompt = (UserDataPrompt)iterator.next();
            if (userdataprompt.getId().intValue() != i)
            {
                continue;
            }
            userdataprompt.setValue(s);
            break;
        } while (true);
    }

    public final void setupNewPrompts(GiftCardProgram giftcardprogram)
    {
        discoverable = giftcardprogram.getDiscoverable();
        giftcardprogram = giftcardprogram.getPrompts();
        Object obj = new SparseArray();
        Iterator iterator = formPrompts.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            UserDataPrompt userdataprompt = (UserDataPrompt)iterator.next();
            if (userdataprompt.getId().intValue() != 0)
            {
                ((SparseArray) (obj)).put(userdataprompt.getId().intValue(), userdataprompt);
            }
        } while (true);
        formPrompts = Lists.newArrayList(Iterables.filter(giftcardprogram, Predicates.and(Predicates.not(UserDataPrompt.withId(-6)), Predicates.not(UserDataPrompt.withId(-7)))));
        iterator = formPrompts.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            UserDataPrompt userdataprompt1 = (UserDataPrompt)iterator.next();
            UserDataPrompt userdataprompt2 = (UserDataPrompt)((SparseArray) (obj)).get(userdataprompt1.getId().intValue());
            if (userdataprompt2 != null)
            {
                userdataprompt1.setValue(userdataprompt2.getValue());
            }
        } while (true);
        obj = colorPrompt;
        colorPrompt = (UserDataPrompt)Iterables.find(giftcardprogram, UserDataPrompt.withId(-6), null);
        if (colorPrompt != null && obj != null)
        {
            colorPrompt.setValue(((UserDataPrompt) (obj)).getValue());
        }
        obj = merchantNamePrompt;
        merchantNamePrompt = (UserDataPrompt)Iterables.find(giftcardprogram, UserDataPrompt.withId(-7), null);
        if (merchantNamePrompt != null && obj != null)
        {
            merchantNamePrompt.setValue(((UserDataPrompt) (obj)).getValue());
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelableArray((Parcelable[])formPrompts.toArray(new Parcelable[formPrompts.size()]), i);
        parcel.writeParcelable(merchantNamePrompt, i);
        parcel.writeParcelable(colorPrompt, i);
        byte abyte0[];
        if (discoverable != null)
        {
            abyte0 = MessageNano.toByteArray(discoverable);
        } else
        {
            abyte0 = null;
        }
        parcel.writeByteArray(abyte0);
    }




/*
    static List access$002(GiftCardInfo giftcardinfo, List list)
    {
        giftcardinfo.formPrompts = list;
        return list;
    }

*/


/*
    static UserDataPrompt access$102(GiftCardInfo giftcardinfo, UserDataPrompt userdataprompt)
    {
        giftcardinfo.merchantNamePrompt = userdataprompt;
        return userdataprompt;
    }

*/


/*
    static UserDataPrompt access$202(GiftCardInfo giftcardinfo, UserDataPrompt userdataprompt)
    {
        giftcardinfo.colorPrompt = userdataprompt;
        return userdataprompt;
    }

*/



/*
    static com.google.wallet.proto.api.NanoWalletGiftCards.DiscoverableGiftCard access$302(GiftCardInfo giftcardinfo, com.google.wallet.proto.api.NanoWalletGiftCards.DiscoverableGiftCard discoverablegiftcard)
    {
        giftcardinfo.discoverable = discoverablegiftcard;
        return discoverablegiftcard;
    }

*/
}
