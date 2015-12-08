// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.payment;

import java.util.List;
import me.lyft.android.common.Iterables;
import me.lyft.android.domain.payment.ICard;
import me.lyft.android.infrastructure.lyft.LyftApiException;
import me.lyft.android.infrastructure.lyft.LyftError;

// Referenced classes of package me.lyft.android.application.payment:
//            PaymentException

public class InvalidCardException extends PaymentException
{

    public static final String BILLING_ADDRESS_REJECTED = "billing_address_rejected";
    public static final String CLIENT_CARD_IS_EMPTY = "client_card_is_empty";
    public static final String CLIENT_CARD_IS_NULL = "client_card_null";
    public static final String CLIENT_CARD_OTHER = "client_card_other";
    public static final String INCORRECT_CVC = "incorrect_cvc";
    public static final String INCORRECT_EXPIRATION_DATE = "incorrect_expiration_date";
    public static final String INCORRECT_NUMBER = "incorrect_number";
    public static final String INCORRECT_ZIP = "incorrect_zip";
    Reason reason;

    public InvalidCardException(Reason reason1, String s, Throwable throwable)
    {
        String s1;
        if (throwable instanceof LyftApiException)
        {
            s1 = ((LyftApiException)throwable).getReason();
        } else
        {
            s1 = (new StringBuilder()).append("client_card_").append(reason1.toString().toLowerCase()).toString();
        }
        this(reason1, s, throwable, s1);
    }

    InvalidCardException(Reason reason1, String s, Throwable throwable, String s1)
    {
        super(s, throwable, s1);
        reason = reason1;
    }

    public InvalidCardException(Reason reason1, String s, Throwable throwable, ICard icard, boolean flag)
    {
        this(reason1, s, throwable, resolveClientInvalidReason(icard, flag));
    }

    public static String getServerLastInvalidReason(Throwable throwable)
    {
        if (throwable instanceof LyftApiException)
        {
            throwable = (LyftApiException)throwable;
            java.util.ArrayList arraylist = throwable.getLyftError().getErrors();
            if (arraylist.isEmpty())
            {
                return String.format("server empty reason: %s", new Object[] {
                    throwable.getReason()
                });
            } else
            {
                return ((me.lyft.android.infrastructure.lyft.LyftError.ValidationError)Iterables.last(arraylist)).getReason();
            }
        } else
        {
            return "client_card_other";
        }
    }

    private static String resolveClientInvalidReason(ICard icard, boolean flag)
    {
        if (icard == null)
        {
            return "client_card_null";
        }
        if (icard.isEmpty())
        {
            return "client_card_is_empty";
        }
        if (!icard.validateNumber())
        {
            return "client_card_incorrect_number";
        }
        if (!icard.validateExpiryDate())
        {
            return "client_card_incorrect_expiration_date";
        }
        if (!icard.validateCVC())
        {
            return "client_card_incorrect_cvc";
        }
        if (flag)
        {
            return "client_card_billing_address_rejected";
        } else
        {
            return "client_card_other";
        }
    }

    public Reason getValidationReason()
    {
        return reason;
    }

    private class Reason extends Enum
    {

        private static final Reason $VALUES[];
        public static final Reason CLIENT_VALIDATION_ERROR;
        public static final Reason INVALID_CARD_ERROR;
        public static final Reason SERVER_VALIDATION_ERROR;
        public static final Reason STRIPE_ERROR;

        public static Reason valueOf(String s)
        {
            return (Reason)Enum.valueOf(me/lyft/android/application/payment/InvalidCardException$Reason, s);
        }

        public static Reason[] values()
        {
            return (Reason[])$VALUES.clone();
        }

        static 
        {
            CLIENT_VALIDATION_ERROR = new Reason("CLIENT_VALIDATION_ERROR", 0);
            SERVER_VALIDATION_ERROR = new Reason("SERVER_VALIDATION_ERROR", 1);
            INVALID_CARD_ERROR = new Reason("INVALID_CARD_ERROR", 2);
            STRIPE_ERROR = new Reason("STRIPE_ERROR", 3);
            $VALUES = (new Reason[] {
                CLIENT_VALIDATION_ERROR, SERVER_VALIDATION_ERROR, INVALID_CARD_ERROR, STRIPE_ERROR
            });
        }

        private Reason(String s, int i)
        {
            super(s, i);
        }
    }

}
