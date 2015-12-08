// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.persistence.landing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.lyft.android.common.Strings;

public class SignupUser
{

    private static final String EMAIL_PATTERN = "^[\\w\\.+-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
    private static final Pattern PATTERN = Pattern.compile("^[\\w\\.+-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$", 2);
    private boolean agreedToS;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneString;

    private SignupUser(String s, String s1, String s2, boolean flag)
    {
        firstName = s;
        lastName = s1;
        email = s2;
        agreedToS = flag;
    }

    public static SignupUser create(String s, String s1, String s2, boolean flag)
    {
        return new SignupUser(s, s1, s2, flag);
    }

    public static SignupUser empty()
    {
        return create("", "", "", false);
    }

    public String getEmail()
    {
        return email;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getPhoneString()
    {
        return phoneString;
    }

    public boolean hasAgreedToS()
    {
        return agreedToS;
    }

    public boolean isValid()
    {
        return validateFirstName() && validateLastName() && validateEmail();
    }

    public void setAgreedToS(boolean flag)
    {
        agreedToS = flag;
    }

    public void setPhoneString(String s)
    {
        phoneString = s;
    }

    public boolean validateEmail()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (email != null)
        {
            Matcher matcher = PATTERN.matcher(email);
            flag = flag1;
            if (!Strings.isNullOrBlank(email))
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

    public boolean validateFirstName()
    {
        return !Strings.isNullOrBlank(firstName);
    }

    public boolean validateLastName()
    {
        return !Strings.isNullOrBlank(lastName);
    }

}
