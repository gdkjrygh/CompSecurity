// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogEvent;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;

// Referenced classes of package com.skype.android.app.signin:
//            SignInConstants

public class TermsOfUseActivity extends SkypeActivity
    implements android.view.View.OnClickListener, SignInConstants
{

    AccessibilityUtil accessibilityUtil;
    Button agreeButton;
    Analytics analytics;
    CheckBox marketingOption;
    TextView termsTOU;

    public TermsOfUseActivity()
    {
    }

    public void onClick(View view)
    {
        if (getIntent().hasExtra("com.skype.nextIntent"))
        {
            view = (Intent)getIntent().getParcelableExtra("com.skype.nextIntent");
            view.putExtra("marketing", marketingOption.isChecked());
            analytics.a(LogEvent.z);
            startActivity(view);
            finish();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        accessibilityUtil.a(termsTOU, Html.fromHtml(getString(0x7f080354)), true);
        ViewUtil.a(this, new View[] {
            agreeButton
        });
    }
}
