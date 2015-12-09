// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.apps.wallet.util.camera.CameraManager;
import com.google.android.apps.wallet.wobs.add.ImageInfo;
import com.google.android.apps.wallet.wobs.add.ProgramCardInfo;
import com.google.android.apps.wallet.wobs.add.PromptValueSerialization;
import com.google.android.apps.wallet.wobs.add.SharedDataPromptConverter;
import com.google.android.apps.wallet.wobs.add.UserDataPrompt;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            LoyaltyProgram

public class LoyaltyCardInfo
    implements ProgramCardInfo
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static LoyaltyCardInfo createFromParcel(Parcel parcel)
        {
            boolean flag1 = true;
            ClassLoader classloader = com/google/android/apps/wallet/loyalty/LoyaltyCardInfo.getClassLoader();
            LoyaltyCardInfo loyaltycardinfo = new LoyaltyCardInfo();
            loyaltycardinfo.formPrompts = Lists.newArrayList();
            Parcelable aparcelable[] = parcel.readParcelableArray(classloader);
            int j = aparcelable.length;
            for (int i = 0; i < j; i++)
            {
                Parcelable parcelable = aparcelable[i];
                loyaltycardinfo.formPrompts.add((UserDataPrompt)parcelable);
            }

            loyaltycardinfo.merchantNamePrompt = (UserDataPrompt)parcel.readParcelable(classloader);
            loyaltycardinfo.colorPrompt = (UserDataPrompt)parcel.readParcelable(classloader);
            loyaltycardinfo.barcodePrompt = (UserDataPrompt)parcel.readParcelable(classloader);
            loyaltycardinfo.program = (LoyaltyProgram)parcel.readParcelable(classloader);
            boolean flag;
            if (parcel.readInt() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            loyaltycardinfo.isForOtherUser = flag;
            if (parcel.readInt() == 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            loyaltycardinfo.subscribeToPromoOffers = flag;
            return loyaltycardinfo;
        }

        private static LoyaltyCardInfo[] newArray(int i)
        {
            return new LoyaltyCardInfo[i];
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
    UserDataPrompt barcodePrompt;
    private UserDataPrompt colorPrompt;
    private List formPrompts;
    private ImageInfo images[];
    private boolean isForOtherUser;
    private UserDataPrompt merchantNamePrompt;
    private LoyaltyProgram program;
    private boolean subscribeToPromoOffers;

    public LoyaltyCardInfo()
    {
        formPrompts = Lists.newArrayList();
    }

    private LoyaltyCardInfo copy()
    {
        LoyaltyCardInfo loyaltycardinfo = new LoyaltyCardInfo();
        loyaltycardinfo.formPrompts = ImmutableList.copyOf(formPrompts);
        loyaltycardinfo.merchantNamePrompt = merchantNamePrompt;
        loyaltycardinfo.colorPrompt = colorPrompt;
        loyaltycardinfo.barcodePrompt = barcodePrompt;
        loyaltycardinfo.program = program;
        loyaltycardinfo.isForOtherUser = isForOtherUser;
        loyaltycardinfo.subscribeToPromoOffers = subscribeToPromoOffers;
        ImageInfo aimageinfo[];
        if (getImages() != null)
        {
            aimageinfo = (ImageInfo[])Arrays.copyOf(getImages(), getImages().length);
        } else
        {
            aimageinfo = null;
        }
        loyaltycardinfo.images = aimageinfo;
        return loyaltycardinfo;
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
        return null;
    }

    public final String getAddMsgTitle()
    {
        return null;
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
        if (barcodePrompt != null && barcodePrompt.hasValue())
        {
            arraylist.add(barcodePrompt);
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
                return Optional.fromNullable(userdataprompt.getValue());
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

    public final boolean getIsForOtherUser()
    {
        return isForOtherUser;
    }

    public final String getLogoUrl()
    {
        if (program != null)
        {
            return program.getLogoImageUrl();
        } else
        {
            return null;
        }
    }

    public final String getMerchantName()
    {
        if (program != null && program.getMerchantName() != null)
        {
            return program.getMerchantName();
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

    public final LoyaltyProgram getProgram()
    {
        return program;
    }

    final int getScanBarcodeState()
    {
        if (barcodePrompt != null && Strings.isNullOrEmpty(barcodePrompt.getPrefilledValue()) && barcodePrompt.isModifiable() && CameraManager.deviceSupportsBarcodeScanning())
        {
            return !barcodePrompt.hasValue() ? 1 : 2;
        } else
        {
            return 0;
        }
    }

    public final boolean getSubscribeToPromoOffers()
    {
        return subscribeToPromoOffers;
    }

    public final boolean includesBirthYear()
    {
        for (Iterator iterator = formPrompts.iterator(); iterator.hasNext();)
        {
            if (((UserDataPrompt)iterator.next()).getInputType().equals(com.google.android.apps.wallet.wobs.add.UserDataPrompt.InputType.BIRTHDATE))
            {
                return true;
            }
        }

        return false;
    }

    public final boolean nameWasModifiedByUser()
    {
        for (Iterator iterator = formPrompts.iterator(); iterator.hasNext();)
        {
            UserDataPrompt userdataprompt = (UserDataPrompt)iterator.next();
            if (SharedDataPromptConverter.createValue(userdataprompt).modifiedByUser.booleanValue() && (userdataprompt.getInputType().equals(com.google.android.apps.wallet.wobs.add.UserDataPrompt.InputType.FIRST_NAME) || userdataprompt.getInputType().equals(com.google.android.apps.wallet.wobs.add.UserDataPrompt.InputType.LAST_NAME)))
            {
                return true;
            }
        }

        return false;
    }

    final void setBarcode(com.google.wallet.proto.NanoWalletEntities.Barcode barcode)
    {
        Preconditions.checkNotNull(barcodePrompt);
        Preconditions.checkState(barcodePrompt.isModifiable());
        barcodePrompt.setValue(PromptValueSerialization.serializeBarcode(barcode));
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

    public final void setIsForOtherUser(boolean flag)
    {
        isForOtherUser = flag;
    }

    public final void setMerchantName(String s)
    {
        boolean flag;
        if (program.getDiscoverableId() == null)
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
        UserDataPrompt userdataprompt = (UserDataPrompt)Iterables.find(formPrompts, UserDataPrompt.withId(i), null);
        if (userdataprompt != null)
        {
            userdataprompt.setValue(s);
        }
    }

    public final void setSubscribeToPromoOffers(boolean flag)
    {
        subscribeToPromoOffers = flag;
    }

    public final void setupNewPrompts(LoyaltyProgram loyaltyprogram)
    {
        program = loyaltyprogram;
        loyaltyprogram = loyaltyprogram.getForm();
        Object obj = new SparseArray();
        UserDataPrompt userdataprompt;
        for (Iterator iterator = formPrompts.iterator(); iterator.hasNext(); ((SparseArray) (obj)).put(userdataprompt.getId().intValue(), userdataprompt))
        {
            userdataprompt = (UserDataPrompt)iterator.next();
        }

        formPrompts = Lists.newArrayList(Iterables.filter(loyaltyprogram, Predicates.and(new Predicate[] {
            Predicates.not(UserDataPrompt.withId(-6)), Predicates.not(UserDataPrompt.withId(-7)), Predicates.not(UserDataPrompt.withId(-8))
        })));
        Iterator iterator1 = formPrompts.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            UserDataPrompt userdataprompt1 = (UserDataPrompt)iterator1.next();
            UserDataPrompt userdataprompt2 = (UserDataPrompt)((SparseArray) (obj)).get(userdataprompt1.getId().intValue());
            if (userdataprompt2 != null)
            {
                userdataprompt1.setValue(userdataprompt2.getValue());
            }
        } while (true);
        obj = colorPrompt;
        colorPrompt = (UserDataPrompt)Iterables.find(loyaltyprogram, UserDataPrompt.withId(-6), null);
        if (colorPrompt != null && obj != null)
        {
            colorPrompt.setValue(((UserDataPrompt) (obj)).getValue());
        }
        merchantNamePrompt = (UserDataPrompt)Iterables.find(loyaltyprogram, UserDataPrompt.withId(-7), null);
        barcodePrompt = (UserDataPrompt)Iterables.find(loyaltyprogram, UserDataPrompt.withId(-8), null);
        if (barcodePrompt != null && !Strings.isNullOrEmpty(barcodePrompt.getPrefilledValue()))
        {
            barcodePrompt.setValue(barcodePrompt.getPrefilledValue());
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeParcelableArray((Parcelable[])formPrompts.toArray(new Parcelable[formPrompts.size()]), i);
        parcel.writeParcelable(merchantNamePrompt, i);
        parcel.writeParcelable(colorPrompt, i);
        parcel.writeParcelable(barcodePrompt, i);
        parcel.writeParcelable(program, i);
        if (isForOtherUser)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (subscribeToPromoOffers)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }




/*
    static List access$002(LoyaltyCardInfo loyaltycardinfo, List list)
    {
        loyaltycardinfo.formPrompts = list;
        return list;
    }

*/


/*
    static UserDataPrompt access$102(LoyaltyCardInfo loyaltycardinfo, UserDataPrompt userdataprompt)
    {
        loyaltycardinfo.merchantNamePrompt = userdataprompt;
        return userdataprompt;
    }

*/


/*
    static UserDataPrompt access$202(LoyaltyCardInfo loyaltycardinfo, UserDataPrompt userdataprompt)
    {
        loyaltycardinfo.colorPrompt = userdataprompt;
        return userdataprompt;
    }

*/


/*
    static LoyaltyProgram access$302(LoyaltyCardInfo loyaltycardinfo, LoyaltyProgram loyaltyprogram)
    {
        loyaltycardinfo.program = loyaltyprogram;
        return loyaltyprogram;
    }

*/


/*
    static boolean access$402(LoyaltyCardInfo loyaltycardinfo, boolean flag)
    {
        loyaltycardinfo.isForOtherUser = flag;
        return flag;
    }

*/


/*
    static boolean access$502(LoyaltyCardInfo loyaltycardinfo, boolean flag)
    {
        loyaltycardinfo.subscribeToPromoOffers = flag;
        return flag;
    }

*/
}
