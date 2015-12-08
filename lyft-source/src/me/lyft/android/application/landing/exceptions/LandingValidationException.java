// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.landing.exceptions;

import java.util.ArrayList;
import java.util.List;
import me.lyft.android.application.landing.InvalidField;

// Referenced classes of package me.lyft.android.application.landing.exceptions:
//            LandingServiceException

public class LandingValidationException extends LandingServiceException
{

    public static final String EMAIL_FIELD = "email";
    public static final String FIRST_NAME_FIELD = "first_name";
    public static final String LAST_NAME_FIELD = "last_name";
    List fields;

    public LandingValidationException()
    {
        fields = new ArrayList();
    }

    public void addField(String s)
    {
        fields.add(new InvalidField(s));
    }

    public List getFields()
    {
        return fields;
    }

    public String getReason()
    {
        return "invalid_profile_info";
    }
}
