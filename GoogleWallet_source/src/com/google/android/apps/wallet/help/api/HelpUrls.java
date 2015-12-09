// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.help.api;

import android.net.Uri;
import java.util.Locale;

public final class HelpUrls
{

    public static Uri createAboutGiftCardBalanceHelpUrl()
    {
        return createFullHelpUrl("https://support.google.com/wallet/go/about_gift_card_balance");
    }

    public static Uri createAboutLoyaltyHelpUrl()
    {
        return createFullHelpUrl("https://support.google.com/wallet/go/about_loyalty");
    }

    public static Uri createBankAccountLearnMoreUrl()
    {
        return createFullHelpUrl("https://support.google.com/wallet/go/bank_account");
    }

    public static Uri createChallengeDepositHelpUrl()
    {
        return createFullHelpUrl("https://support.google.com/wallet/go/challenge_deposit");
    }

    public static Uri createCoppaViolationHelpUrl()
    {
        String s = String.valueOf("https://support.google.com/accounts/answer/1333913?hl=");
        String s1 = String.valueOf(getLanguage());
        if (s1.length() != 0)
        {
            s = s.concat(s1);
        } else
        {
            s = new String(s);
        }
        return Uri.parse(s);
    }

    public static Uri createFindOffersHelpUrl()
    {
        return createFullHelpUrl("https://www.google.com/wallet/shop-in-stores/index.html#offers");
    }

    private static Uri createFullHelpUrl(String s)
    {
        return Uri.parse(s).buildUpon().appendQueryParameter("version", "2").appendQueryParameter("hl", getLanguage()).build();
    }

    public static Uri createKycHelpUrl()
    {
        return createFullHelpUrl("https://support.google.com/wallet/bin/answer.py?answer=2583667");
    }

    public static String createLegalAgreementsHelpUrl()
    {
        String s = String.valueOf("https://wallet.google.com/files/mobile_document_links.html?hl=");
        String s1 = String.valueOf(getLanguage());
        if (s1.length() != 0)
        {
            return s.concat(s1);
        } else
        {
            return new String(s);
        }
    }

    public static Uri createP2pBusinessHelpUrl()
    {
        return createFullHelpUrl("https://support.google.com/wallet/go/business_transactions");
    }

    public static Uri createPinHelpUrl()
    {
        return createFullHelpUrl("https://support.google.com/wallet/go/about_pin");
    }

    public static Uri createSettleBalanceHelpUrl()
    {
        return createFullHelpUrl("https://support.google.com/wallet/go/settle_balance");
    }

    public static Uri createTapAndPayHelpUrl()
    {
        return createFullHelpUrl("https://support.google.com/wallet/go/tap_and_pay");
    }

    public static Uri createTelephoneHelpUrl()
    {
        return Uri.parse("tel:8554925538");
    }

    public static Uri createTopLevelTopicUrl()
    {
        return createFullHelpUrl("https://support.google.com/wallet/topic/6026061");
    }

    public static Uri createTosLearnMoreUrl()
    {
        return Uri.parse("https://support.google.com/wallet/bin/answer.py?answer=2647087&ctx=go");
    }

    public static Uri createVirtualCardTosUrl()
    {
        String s = String.valueOf("https://wallet.google.com/files/virtualcard-tos.html?hl=");
        String s1 = String.valueOf(getLanguage());
        if (s1.length() != 0)
        {
            s = s.concat(s1);
        } else
        {
            s = new String(s);
        }
        return Uri.parse(s);
    }

    public static Uri createWalletCardFaqUrl()
    {
        return createFullHelpUrl("https://www.google.com/wallet/faq.html#faq-card");
    }

    public static Uri createWalletCardTosUrl()
    {
        String s = String.valueOf("https://wallet.google.com/legaldocument?family=0.walletcard&hl=");
        String s1 = String.valueOf(getLanguage());
        if (s1.length() != 0)
        {
            s = s.concat(s1);
        } else
        {
            s = new String(s);
        }
        return Uri.parse(s);
    }

    public static Uri createWalletCardWrongAddressHelpUrl()
    {
        return createFullHelpUrl("https://support.google.com/wallet/go/wrong_address");
    }

    public static Uri createWithdrawBalanceHelpUrl()
    {
        return createFullHelpUrl("https://support.google.com/wallet/go/add_balance");
    }

    private static String getLanguage()
    {
        Object obj = Locale.getDefault();
        if (((Locale) (obj)).getCountry().length() > 0)
        {
            String s = String.valueOf(((Locale) (obj)).getLanguage());
            String s1 = String.valueOf("-");
            obj = String.valueOf(((Locale) (obj)).getCountry());
            return (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(s1).length() + String.valueOf(obj).length())).append(s).append(s1).append(((String) (obj))).toString();
        } else
        {
            return ((Locale) (obj)).getLanguage();
        }
    }
}
