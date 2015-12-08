// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.shortcircuit;

import android.os.Bundle;
import android.widget.TextView;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.Navigation;
import java.util.Timer;
import java.util.TimerTask;

public class StallNewUserActivity extends SkypeActivity
{

    public static final int SCREEN_TIMEOUT = 4000;
    public static final int SECONDS = 1000;
    Navigation navigation;
    TextView progressMessagePrimary;
    TextView progressMessageSecondary;

    public StallNewUserActivity()
    {
    }

    private void showMessage()
    {
        CharSequence charsequence = getText(0x7f080423);
        progressMessagePrimary.setText(charsequence);
        progressMessagePrimary.setVisibility(0);
        progressMessagePrimary.setContentDescription(charsequence);
        if (progressMessageSecondary != null)
        {
            CharSequence charsequence1 = getText(0x7f0803df);
            progressMessageSecondary.setText(charsequence1);
            progressMessageSecondary.setVisibility(0);
            progressMessageSecondary.setContentDescription(charsequence1);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        showMessage();
        (new Timer(true)).schedule(new TimerTask() {

            final StallNewUserActivity this$0;

            public final void run()
            {
                navigation.people();
                finish();
            }

            
            {
                this$0 = StallNewUserActivity.this;
                super();
            }
        }, 4000L);
    }
}
