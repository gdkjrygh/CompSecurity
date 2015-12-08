// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain;

import me.lyft.android.common.Enums;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.domain.payment.MoneyMapper;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;
import me.lyft.android.infrastructure.lyft.location.NullLocationDTO;
import me.lyft.android.infrastructure.lyft.profile.PhoneDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;

// Referenced classes of package me.lyft.android.domain:
//            User, Phone

public class UserMapper
{

    private static final String SEND_CONCUR_RIDE_RECEIPTS_ENABLED = "enabled";

    public UserMapper()
    {
    }

    public static User fromUserDTO(UserDTO userdto)
    {
        boolean flag1 = true;
        User user = new User();
        user.setId(userdto.getId());
        user.setFirstName(userdto.getFirstName());
        user.setLastName(userdto.getLastName());
        user.setEmail(userdto.getEmail());
        user.setPhotoUrl(userdto.getUserPhoto());
        user.setTermsAccepted((Boolean)Objects.firstNonNull(userdto.isTermsAccepted(), Boolean.valueOf(false)));
        user.setMode((User.UserMode)Enums.valueOf(me/lyft/android/domain/User$UserMode, userdto.getMode(), User.UserMode.UNAUTHORIZED));
        user.setShouldRedirectToDriverOnboarding(((Boolean)Objects.firstNonNull(userdto.getRedirectToDriverApplication(), Boolean.valueOf(false))).booleanValue());
        user.setIsApprovedDriver(((Boolean)Objects.firstNonNull(userdto.isApprovedDriver(), Boolean.valueOf(false))).booleanValue());
        user.setWheelchairNeeded(((Boolean)Objects.firstNonNull(userdto.getWheelchair(), Boolean.valueOf(false))).booleanValue());
        user.setBillingAddressRequired(((Boolean)Objects.firstNonNull(userdto.getRequiresBillingAddress(), Boolean.valueOf(false))).booleanValue());
        user.setCreditCardCaptureRequired(((Boolean)Objects.firstNonNull(userdto.getRequiresCreditCardCapture(), Boolean.valueOf(false))).booleanValue());
        user.setFacebookUid(userdto.getFacebookUid());
        user.setSubmittedDriverApplication(((Boolean)Objects.firstNonNull(userdto.getDriverDocumentsEnabled(), Boolean.valueOf(false))).booleanValue());
        user.setDriverLastRide(((Boolean)Objects.firstNonNull(userdto.isDriverLastRide(), Boolean.valueOf(false))).booleanValue());
        Phone phone = new Phone();
        String s;
        boolean flag;
        if (userdto.getPhone() != null)
        {
            s = userdto.getPhone().getNumber();
        } else
        {
            s = null;
        }
        phone.setNumber(s);
        if (userdto.getPhone() != null)
        {
            flag = ((Boolean)Objects.firstNonNull(userdto.getPhone().getVerificationNeeded(), Boolean.valueOf(true))).booleanValue();
        } else
        {
            flag = true;
        }
        phone.setVerificationNeeded(flag);
        user.setPhone(phone);
        user.setLocation(LocationMapper.fromLocationDTO((LocationDTO)Objects.firstNonNull(userdto.getLocation(), NullLocationDTO.getInstance())));
        user.debtMoney = MoneyMapper.fromMoneyDTO(userdto.getDebtMoney());
        if (userdto.isApprovedChauffeurDriver() != null)
        {
            flag = userdto.isApprovedChauffeurDriver().booleanValue();
        } else
        {
            flag = false;
        }
        user.setApprovedChauffeurDriver(flag);
        if (!Strings.isNullOrEmpty(userdto.getExpenseRidesToConcur()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        user.setIsConcurLiked(flag);
        if (user.isConcurLinked() && sendConcurRideReceiptsEnabled(userdto.getExpenseRidesToConcur()))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        user.setSendConcurRideReceipts(flag);
        user.setShowExpressPayPopUp(((Boolean)Objects.firstNonNull(userdto.getShowExpressPayPopUp(), Boolean.valueOf(false))).booleanValue());
        return user;
    }

    public static boolean sendConcurRideReceiptsEnabled(String s)
    {
        return "enabled".equalsIgnoreCase(s);
    }
}
