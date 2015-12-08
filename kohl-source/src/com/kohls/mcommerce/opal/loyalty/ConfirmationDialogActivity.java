// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.wallet.util.OmnitureMeasurement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            SharePointsCompleteActivity

public class ConfirmationDialogActivity extends Activity
{

    private String email;
    private String mPositiviBtnStr;
    private String phoneNumber;
    private String rewardsId;
    private String shareType;

    public ConfirmationDialogActivity()
    {
    }

    private void displayDialog(CharSequence charsequence)
    {
        charsequence = (new android.app.AlertDialog.Builder(this)).setMessage(charsequence).setTitle(null).setPositiveButton(mPositiviBtnStr, new android.content.DialogInterface.OnClickListener() {

            final ConfirmationDialogActivity this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                j = isUserInputValid();
                if (j == 3005 || shareType.equalsIgnoreCase("donate"))
                {
                    Intent intent = new Intent(getApplicationContext(), com/kohls/mcommerce/opal/loyalty/SharePointsCompleteActivity);
                    intent.putExtra("email_of_friend", getIntent().getStringExtra("email_of_friend"));
                    intent.putExtra("charityname", getIntent().getStringExtra("charityname"));
                    intent.putExtra("charityimg", getIntent().getStringExtra("charityimg"));
                    intent.putExtra("message", getIntent().getStringExtra("message"));
                    intent.putExtra("points_to_share", getIntent().getStringExtra("points_to_share"));
                    intent.putExtra("loyaltyid", rewardsId);
                    intent.putExtra("sharewith", getIntent().getStringExtra("sharewith"));
                    intent.putExtra("phone", getIntent().getStringExtra("phone"));
                    startActivity(intent);
                } else
                {
                    setResult(j);
                }
                dialoginterface.dismiss();
            }

            
            {
                this$0 = ConfirmationDialogActivity.this;
                super();
            }
        }).setNegativeButton("Cancel", new android.content.DialogInterface.OnClickListener() {

            final ConfirmationDialogActivity this$0;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                dialoginterface.dismiss();
            }

            
            {
                this$0 = ConfirmationDialogActivity.this;
                super();
            }
        }).create();
        charsequence.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final ConfirmationDialogActivity this$0;

            public void onDismiss(DialogInterface dialoginterface)
            {
                finish();
            }

            
            {
                this$0 = ConfirmationDialogActivity.this;
                super();
            }
        });
        charsequence.show();
        ((TextView)charsequence.findViewById(0x102000b)).setGravity(17);
        ((TextView)charsequence.findViewById(0x102000b)).setTextAppearance(this, 0x7f0f001c);
        ((TextView)charsequence.findViewById(0x102000b)).setBackgroundColor(getResources().getColor(0x7f0c010a));
        ((TextView)charsequence.findViewById(0x102000b)).setPadding(40, 40, 40, 40);
        int i = getResources().getIdentifier("titleDivider", "id", "android");
        charsequence.getWindow().getDecorView().findViewById(i).setBackgroundColor(getResources().getColor(0x7f0c0040));
    }

    private int isUserInputValid()
    {
        if (!TextUtils.isEmpty(email) && !Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {
            return 3001;
        }
        if (!TextUtils.isEmpty(phoneNumber) && phoneNumber.length() < 10)
        {
            return 3002;
        }
        if (!TextUtils.isEmpty(rewardsId) && rewardsId.length() < 11)
        {
            return 3003;
        }
        return TextUtils.isEmpty(rewardsId) || !rewardsId.equalsIgnoreCase(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref()) ? 3005 : 3004;
    }

    private Spanned setConfirmationMessage(Spanned spanned)
    {
        StringBuilder stringbuilder;
        String s;
        stringbuilder = new StringBuilder();
        s = getString(0x7f0801c2);
        email = getIntent().getStringExtra("email_of_friend");
        phoneNumber = getIntent().getStringExtra("phone");
        rewardsId = getIntent().getStringExtra("loyaltyid");
        if (!TextUtils.isEmpty(getIntent().getStringExtra("message"))) goto _L2; else goto _L1
_L1:
        if (!TextUtils.isEmpty(email))
        {
            stringbuilder.append("<b>").append(s).append("</b><br><br>");
            stringbuilder.append("Double-check the info below to make sure it's correct, then tap Share.").append("<br><br>").append("Share with:").append(" ").append("<b>").append(email).append("</b>").append("<br>").append("Points:").append(" ").append("<b>").append(getIntent().getStringExtra("points_to_share")).append("</b>");
            spanned = Html.fromHtml(stringbuilder.toString());
        } else
        if (!TextUtils.isEmpty(phoneNumber))
        {
            stringbuilder.append("<b>").append(s).append("</b><br><br>");
            stringbuilder.append("Double-check the info below to make sure it's correct, then tap Share.").append("<br><br>").append("Share with:").append(" ").append("<b>").append(phoneNumber).append("</b>").append("<br>").append("Points:").append(" ").append("<b>").append(getIntent().getStringExtra("points_to_share")).append("</b>");
            spanned = Html.fromHtml(stringbuilder.toString());
        } else
        {
            stringbuilder.append("<b>").append(s).append("</b><br><br>");
            stringbuilder.append("Double-check the info below to make sure it's correct, then tap Share.").append("<br><br>").append("Share with:").append(" ").append("<b>").append(rewardsId).append("</b>").append("<br>").append("Points:").append(" ").append("<b>").append(getIntent().getStringExtra("points_to_share")).append("</b>");
            spanned = Html.fromHtml(stringbuilder.toString());
        }
_L4:
        mPositiviBtnStr = "Share";
        OmnitureMeasurement.getInstance().setShareConfirmEvents();
        return spanned;
_L2:
        spanned = null;
        if (TextUtils.isEmpty(email))
        {
            break; /* Loop/switch isn't completed */
        }
        spanned = email;
_L6:
        stringbuilder.append("<b>").append(s).append("</b><br><br>");
        stringbuilder.append("Double-check the info below to make sure it's correct, then tap Share.").append("<br><br>").append("Share with:").append(" ").append("<b>").append(spanned).append("</b>").append("<br>").append("Points:").append(" ").append("<b>").append(getIntent().getStringExtra("points_to_share")).append("</b>").append("<br>").append("Message:").append(" ").append("<b>").append(getIntent().getStringExtra("message")).append("</b>");
        spanned = Html.fromHtml(stringbuilder.toString());
        if (true) goto _L4; else goto _L3
_L3:
        if (TextUtils.isEmpty(phoneNumber)) goto _L6; else goto _L5
_L5:
        spanned = phoneNumber;
          goto _L6
    }

    private Spanned setDonationMessage(Spanned spanned)
    {
        spanned = getString(0x7f0801c2);
        rewardsId = getIntent().getStringExtra("loyaltyid");
        spanned = Html.fromHtml((new StringBuilder()).append("<b>").append(spanned).append("</b>").append("<br><br>").append("Double-check the info below to make sure it's correct, then tap Donate.").append("<br><br>").append("I want to donate").append(" ").append("<b>").append(getIntent().getStringExtra("points_to_share")).append("</b>").append(" ").append("points to").append(" ").append(getIntent().getStringExtra("charity")).toString());
        mPositiviBtnStr = "Donate";
        return spanned;
    }

    public void onBackPressed()
    {
        finish();
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        Object obj;
        super.onCreate(bundle);
        obj = null;
        shareType = getIntent().getStringExtra("sharewith");
        if (TextUtils.isEmpty(shareType) || !shareType.equalsIgnoreCase("frnds")) goto _L2; else goto _L1
_L1:
        bundle = setConfirmationMessage(null);
_L4:
        displayDialog(bundle);
        return;
_L2:
        bundle = obj;
        if (!TextUtils.isEmpty(shareType))
        {
            bundle = obj;
            if (shareType.equalsIgnoreCase("donate"))
            {
                bundle = setDonationMessage(null);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            finish();
        }
        return super.onKeyDown(i, keyevent);
    }



}
