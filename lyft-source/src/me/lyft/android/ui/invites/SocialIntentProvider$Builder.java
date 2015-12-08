// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import android.content.pm.PackageManager;
import me.lyft.android.IUserSession;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.Objects;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.infrastructure.lyft.constants.SocialSharing;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;

// Referenced classes of package me.lyft.android.ui.invites:
//            SocialIntentProvider

public class m
{

    private static final String COPY_PKG = null;
    private static final String FACEBOOK_PKG = "com.facebook.katana";
    private static final String GMAIL_PKG = "com.google.android.gm";
    private static final String HANGOUTS_PKG = "com.google.android.talk";
    private static final String TWITTER_PKG = "com.twitter.android";
    private m copyShareItem;
    private m facebookShareItem;
    private m gmailShareItem;
    private m hangoutsShareItem;
    private m twitterShareItem;

    public SocialIntentProvider build(PackageManager packagemanager, IUserSession iusersession, IConstantsProvider iconstantsprovider, IDevice idevice)
    {
        iconstantsprovider = iconstantsprovider.getConstants();
        iusersession = (String)Objects.firstNonNull(iusersession.getUser().getReferralUrl(), "");
        if (facebookShareItem == null)
        {
            facebook(iusersession);
        }
        if (twitterShareItem == null)
        {
            twitter((String)Objects.firstNonNull(iconstantsprovider.getSocialSharing().getInviteTwitterShareText(), iusersession));
        }
        if (gmailShareItem == null)
        {
            gmail(iconstantsprovider.getDefaultSmsInviteText());
        }
        if (hangoutsShareItem == null)
        {
            hangouts(iconstantsprovider.getDefaultSmsInviteText());
        }
        if (copyShareItem == null)
        {
            copy(iusersession);
        }
        return new SocialIntentProvider(packagemanager, idevice, facebookShareItem, twitterShareItem, gmailShareItem, hangoutsShareItem, copyShareItem, null);
    }

    public m copy(String s)
    {
        copyShareItem = new m(s, COPY_PKG, 0x7f020028, 0x7f07007e, "copy_to_clipboard");
        return this;
    }

    public COPY_PKG facebook(String s)
    {
        facebookShareItem = new m(s, "com.facebook.katana", 0x7f020029, 0x7f07007f, "facebook");
        return this;
    }

    public m gmail(String s)
    {
        gmailShareItem = new m(s, "com.google.android.gm", 0x7f02002a, 0x7f070080, "email");
        return this;
    }

    public m hangouts(String s)
    {
        hangoutsShareItem = new m(s, "com.google.android.talk", 0x7f02002b, 0x7f070081, "sms");
        return this;
    }

    public m twitter(String s)
    {
        twitterShareItem = new m(s, "com.twitter.android", 0x7f02002d, 0x7f070082, "twitter");
        return this;
    }


    public m()
    {
    }
}
