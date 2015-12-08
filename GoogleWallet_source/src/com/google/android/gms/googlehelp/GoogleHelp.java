// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.telephony.PhoneNumberUtils;
import android.text.SpannableStringBuilder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.googlehelp:
//            a

public final class GoogleHelp
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    public static final int CUSTOM_HELP_ACTIVITY_THEME = 2;
    public static final int DARK_HELP_ACTIVITY_THEME = 1;
    public static final String EXTRA_GOOGLE_HELP = "EXTRA_GOOGLE_HELP";
    public static final String EXTRA_SHOW_CONTACT_CARD_ONLY = "EXTRA_SHOW_CONTACT_CARD_ONLY";
    public static final String GOOGLE_HELP = "GoogleHelp";
    public static final String HELP_ACTION = "com.google.android.gms.googlehelp.HELP";
    public static final int JPEG_QUALITY = 60;
    public static final int LIGHT_HELP_ACTIVITY_THEME = 0;
    public static final int LIGHT_WITH_DARK_ACTION_BAR_HELP_ACTIVITY_THEME = 1;
    private Bitmap afS;
    String arN;
    Account arO;
    boolean arP;
    boolean arQ;
    List arR;
    Bundle arS;
    Bitmap arT;
    byte arU[];
    int arV;
    int arW;
    String arX;
    Uri arY;
    List arZ;
    int asa;
    List asb;
    boolean asc;
    ErrorReport asd;
    Bundle mPsdBundle;
    final int mVersionCode;

    GoogleHelp(int i, String s, Account account, Bundle bundle, boolean flag, boolean flag1, List list, 
            Bundle bundle1, Bitmap bitmap, byte abyte0[], int j, int k, String s1, Uri uri, 
            List list1, int l, List list2, boolean flag2, ErrorReport errorreport)
    {
        asd = new ErrorReport();
        mVersionCode = i;
        arN = s;
        arO = account;
        mPsdBundle = bundle;
        arP = flag;
        arQ = flag1;
        arR = list;
        arS = bundle1;
        arT = bitmap;
        arU = abyte0;
        arV = j;
        arW = k;
        arX = s1;
        arY = uri;
        arZ = list1;
        asa = l;
        asb = list2;
        asc = flag2;
        asd = errorreport;
    }

    private GoogleHelp(String s)
    {
        this(3, s, null, null, true, true, ((List) (new ArrayList())), null, null, null, 0, 0, null, null, ((List) (new ArrayList())), 0, ((List) (new ArrayList())), false, new ErrorReport());
    }

    private GoogleHelp addSupportPhoneNumber(String s, Locale locale)
    {
        s = new SpannableStringBuilder(s);
        PhoneNumberUtils.formatNumber(s, PhoneNumberUtils.getFormatTypeForLocale(locale));
        arR.add(s.toString());
        return this;
    }

    private Intent buildHelpIntent()
    {
        return (new Intent("com.google.android.gms.googlehelp.HELP")).setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", this);
    }

    public static GoogleHelp newInstance(String s)
    {
        return new GoogleHelp(s);
    }

    public final GoogleHelp addAdditionalOverflowMenuItem(int i, String s, Intent intent)
    {
        arZ.add(new OverflowMenuItem(i, s, intent));
        return this;
    }

    public final GoogleHelp addSupportPhoneNumber(String s)
    {
        return addSupportPhoneNumber(s, Locale.getDefault());
    }

    public final Intent buildHelpIntent(Context context)
    {
        return buildHelpIntent();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final Uri getFallbackSupportUri()
    {
        return arY;
    }

    public final GoogleHelp setFallbackSupportUri(Uri uri)
    {
        arY = uri;
        return this;
    }

    public final GoogleHelp setGoogleAccount(Account account)
    {
        arO = account;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (afS != null)
        {
            asd.setScreenshot(afS);
        }
        a.a(this, parcel, i);
    }

}
