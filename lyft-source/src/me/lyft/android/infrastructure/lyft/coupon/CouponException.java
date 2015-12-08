// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.coupon;

import java.util.Iterator;
import java.util.List;
import me.lyft.android.application.payment.PaymentException;
import me.lyft.android.infrastructure.lyft.LyftApiException;

public class CouponException extends PaymentException
{

    public static final String ALREADY_USED_REASON = "alreadyUsed";
    private static final String COUPON_FIELD = "coupon";
    public static final String LOCATION_REQUIRED_REASON = "locationRequired";
    public static final String NEW_USERS_ONLY_REASON = "newUsersOnly";
    public static final String NONE_REMAINING_REASON = "noneRemaining";
    public static final String OUTSIDE_COUPON_REGION_REASON = "outsideCouponRegion";
    public static final String TRANSIENT_FAILURE_REASON = "transientFailure";

    public CouponException(Throwable throwable)
    {
        super("Unable to apply coupon.", throwable, "coupon_unknown");
    }

    public static boolean containsCouponValidationError(LyftApiException lyftapiexception)
    {
        return firstCouponFailureReason(lyftapiexception) != null;
    }

    private static String firstCouponFailureReason(LyftApiException lyftapiexception)
    {
        for (lyftapiexception = lyftapiexception.getValidationErrors().iterator(); lyftapiexception.hasNext();)
        {
            me.lyft.android.infrastructure.lyft.LyftError.ValidationError validationerror = (me.lyft.android.infrastructure.lyft.LyftError.ValidationError)lyftapiexception.next();
            if ("coupon".equalsIgnoreCase(validationerror.getField()))
            {
                return validationerror.getReason();
            }
        }

        return null;
    }

    public String getFailureReason()
    {
        Object obj = getCause();
        if (obj instanceof LyftApiException)
        {
            obj = firstCouponFailureReason((LyftApiException)obj);
            if (obj != null)
            {
                return ((String) (obj));
            }
        }
        return "unknown";
    }

    public String getReason()
    {
        Object obj = getCause();
        if (obj instanceof LyftApiException)
        {
            String s = firstCouponFailureReason((LyftApiException)obj);
            obj = s;
            if (s == null)
            {
                obj = "other_lyft_error";
            }
        } else
        {
            obj = (new StringBuilder()).append("other_").append(obj.getClass().getSimpleName()).toString();
        }
        return (new StringBuilder()).append("coupon_").append(((String) (obj))).toString();
    }
}
