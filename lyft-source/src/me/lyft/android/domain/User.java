// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.lyft.android.common.INullable;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.NullLocation;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.domain.payment.NullMoney;

// Referenced classes of package me.lyft.android.domain:
//            Phone

public class User
    implements INullable
{

    private static final String EMAIL_PATTERN = "^[\\w\\.+-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
    private static final Pattern PATTERN = Pattern.compile("^[\\w\\.+-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$", 2);
    private boolean approvedChauffeurDriver;
    protected boolean billingAddressRequired;
    private boolean creditCardCaptureRequired;
    protected Money debtMoney;
    private String email;
    private String facebookUid;
    private String firstName;
    protected String id;
    private boolean isApprovedDriver;
    private boolean isConcurLinked;
    private boolean isDriverLastRide;
    private String lastName;
    private Location location;
    protected UserMode mode;
    private Phone phone;
    private String photoUrl;
    private boolean sendConcurRideReceipts;
    private boolean shouldRedirectToDriverOnboarding;
    private boolean showExpressPayPopUp;
    private boolean submittedDriverApplication;
    private boolean termsAccepted;
    private boolean wheelchairNeeded;

    public User()
    {
        mode = UserMode.UNAUTHORIZED;
    }

    public User(String s, String s1)
    {
        mode = UserMode.UNAUTHORIZED;
        id = s;
        firstName = s1;
    }

    public static User empty()
    {
        return NullUser.getInstance();
    }

    public Money getDebtMoney()
    {
        return (Money)Objects.firstNonNull(debtMoney, NullMoney.getInstance());
    }

    public String getEmail()
    {
        return email;
    }

    public String getFacebookUid()
    {
        return facebookUid;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getFullName()
    {
        if (!Strings.isNullOrEmpty(firstName))
        {
            if (!Strings.isNullOrEmpty(lastName))
            {
                return String.format("%s %s", new Object[] {
                    firstName, lastName
                });
            } else
            {
                return firstName;
            }
        }
        if (!Strings.isNullOrEmpty(lastName))
        {
            return lastName;
        } else
        {
            return "";
        }
    }

    public String getId()
    {
        return id;
    }

    public String getLastName()
    {
        return lastName;
    }

    public Location getLocation()
    {
        return (Location)Objects.firstNonNull(location, NullLocation.getInstance());
    }

    public UserMode getMode()
    {
        return mode;
    }

    public Phone getPhone()
    {
        return (Phone)Objects.firstNonNull(phone, Phone.empty());
    }

    public String getPhotoUrl()
    {
        return photoUrl;
    }

    public boolean hasDebt()
    {
        return getDebtMoney().getAmount().intValue() > 0;
    }

    public boolean hasFirstAndLastName()
    {
        return hasValidFirstName() && hasValidLastName();
    }

    public boolean hasPhoneNumber()
    {
        return !Strings.isNullOrEmpty(getPhone().getNumber());
    }

    public boolean hasValidEmail()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (email != null)
        {
            Matcher matcher = PATTERN.matcher(email);
            flag = flag1;
            if (!Strings.isNullOrEmpty(email))
            {
                flag = flag1;
                if (matcher.matches())
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public boolean hasValidFirstName()
    {
        return !Strings.isNullOrEmpty(firstName);
    }

    public boolean hasValidLastName()
    {
        return !Strings.isNullOrEmpty(lastName);
    }

    public boolean hasValidNameAndEmail()
    {
        return hasFirstAndLastName() && hasValidEmail();
    }

    public boolean hasValidPhoneNumber()
    {
        return hasPhoneNumber() && !getPhone().isVerificationNeeded();
    }

    public boolean isApprovedChauffeurDriver()
    {
        return approvedChauffeurDriver;
    }

    public boolean isApprovedDriver()
    {
        return isApprovedDriver;
    }

    public boolean isBillingAddressRequired()
    {
        return billingAddressRequired;
    }

    public boolean isConcurLinked()
    {
        return isConcurLinked;
    }

    public boolean isCreditCardCaptureRequired()
    {
        return creditCardCaptureRequired;
    }

    public boolean isDriverLastRide()
    {
        return isDriverLastRide;
    }

    public boolean isInDriverMode()
    {
        return mode == UserMode.DRIVER;
    }

    public boolean isInPassengerMode()
    {
        return mode == UserMode.PASSENGER;
    }

    public boolean isNull()
    {
        return false;
    }

    public boolean isTermsAccepted()
    {
        return termsAccepted;
    }

    public boolean isUnauthorized()
    {
        return mode == UserMode.UNAUTHORIZED;
    }

    public boolean isUnauthorizedOrPassenger()
    {
        return mode == UserMode.PASSENGER || mode == UserMode.UNAUTHORIZED;
    }

    public boolean isWheelchairNeeded()
    {
        return wheelchairNeeded;
    }

    public boolean profileIsComplete()
    {
        return hasValidPhoneNumber() && hasValidEmail() && hasFirstAndLastName();
    }

    public boolean sendConcurRideReceipts()
    {
        return sendConcurRideReceipts;
    }

    void setApprovedChauffeurDriver(boolean flag)
    {
        approvedChauffeurDriver = flag;
    }

    void setBillingAddressRequired(boolean flag)
    {
        billingAddressRequired = flag;
    }

    void setCreditCardCaptureRequired(boolean flag)
    {
        creditCardCaptureRequired = flag;
    }

    void setDriverLastRide(boolean flag)
    {
        isDriverLastRide = flag;
    }

    public void setEmail(String s)
    {
        email = s;
    }

    void setFacebookUid(String s)
    {
        facebookUid = s;
    }

    public void setFirstName(String s)
    {
        firstName = s;
    }

    void setId(String s)
    {
        id = s;
    }

    public void setIsApprovedDriver(boolean flag)
    {
        isApprovedDriver = flag;
    }

    public void setIsConcurLiked(boolean flag)
    {
        isConcurLinked = flag;
    }

    public void setLastName(String s)
    {
        lastName = s;
    }

    public void setLocation(Location location1)
    {
        location = location1;
    }

    void setMode(UserMode usermode)
    {
        mode = usermode;
    }

    public void setPhone(Phone phone1)
    {
        phone = phone1;
    }

    void setPhotoUrl(String s)
    {
        photoUrl = s;
    }

    public void setSendConcurRideReceipts(boolean flag)
    {
        sendConcurRideReceipts = flag;
    }

    public void setShouldRedirectToDriverOnboarding(boolean flag)
    {
        shouldRedirectToDriverOnboarding = flag;
    }

    public void setShowExpressPayPopUp(boolean flag)
    {
        showExpressPayPopUp = flag;
    }

    void setSubmittedDriverApplication(boolean flag)
    {
        submittedDriverApplication = flag;
    }

    public void setTermsAccepted(Boolean boolean1)
    {
        termsAccepted = boolean1.booleanValue();
    }

    public void setWheelchairNeeded(boolean flag)
    {
        wheelchairNeeded = flag;
    }

    public boolean shouldRedirectToDriverOnboarding()
    {
        return shouldRedirectToDriverOnboarding && !isApprovedDriver;
    }

    public boolean showExpressPayPopUp()
    {
        return showExpressPayPopUp;
    }

    public boolean submittedDriverApplication()
    {
        return submittedDriverApplication;
    }


    private class UserMode extends Enum
    {

        private static final UserMode $VALUES[];
        public static final UserMode DRIVER;
        public static final UserMode PASSENGER;
        public static final UserMode UNAUTHORIZED;

        public static UserMode valueOf(String s)
        {
            return (UserMode)Enum.valueOf(me/lyft/android/domain/User$UserMode, s);
        }

        public static UserMode[] values()
        {
            return (UserMode[])$VALUES.clone();
        }

        static 
        {
            PASSENGER = new UserMode("PASSENGER", 0);
            DRIVER = new UserMode("DRIVER", 1);
            UNAUTHORIZED = new UserMode("UNAUTHORIZED", 2);
            $VALUES = (new UserMode[] {
                PASSENGER, DRIVER, UNAUTHORIZED
            });
        }

        private UserMode(String s, int i)
        {
            super(s, i);
        }
    }


    private class NullUser extends User
    {

        private static final User INSTANCE = new NullUser();

        static User getInstance()
        {
            return INSTANCE;
        }

        public boolean isNull()
        {
            return true;
        }


        private NullUser()
        {
        }
    }

}
