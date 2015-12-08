// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import com.worklight.common.Logger;
import com.worklight.common.security.PRNGFixes;
import com.worklight.wlclient.api.WLClient;
import com.worklight.wlclient.api.challengehandler.WLChallengeHandler;

public class UIActivity extends Activity
{

    private static Logger logger = Logger.getInstance("UIActivity");

    public UIActivity()
    {
    }

    private void createAndShowDialogue(String s, String s1, String s2, android.content.DialogInterface.OnClickListener onclicklistener, String s3, android.content.DialogInterface.OnClickListener onclicklistener1)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle(s);
        builder.setMessage(s1);
        if (s2 != null && onclicklistener != null)
        {
            builder.setPositiveButton(s2, onclicklistener);
        }
        if (s3 != null && onclicklistener1 != null)
        {
            builder.setNeutralButton(s3, onclicklistener1);
        }
        s = builder.create();
        s.setCanceledOnTouchOutside(false);
        s.setCancelable(false);
        s.show();
    }

    private void exitApplication()
    {
        finish();
        moveTaskToBack(true);
    }

    private void handleDialogue(String s)
    {
        Intent intent = getIntent();
        if (s.equalsIgnoreCase("wl_remoteDisableRealm"))
        {
            handleRemoteDisableDialogue(intent);
        } else
        {
            if (s.equalsIgnoreCase("notify"))
            {
                handleNotifyDialogue(intent);
                return;
            }
            if (s.equalsIgnoreCase("exit"))
            {
                handleExitDialogue(intent);
                return;
            }
        }
    }

    private void handleExitDialogue(Intent intent)
    {
        createAndShowDialogue(intent.getStringExtra("dialogue_title"), intent.getStringExtra("dialogue_message"), intent.getStringExtra("positive_button_text"), new android.content.DialogInterface.OnClickListener() {

            final UIActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                finish();
            }

            
            {
                this$0 = UIActivity.this;
                super();
            }
        }, null, null);
    }

    private void handleNotifyDialogue(Intent intent)
    {
        String s = intent.getStringExtra("dialogue_title");
        String s1 = intent.getStringExtra("dialogue_message");
        final String messageId = intent.getStringExtra("dialogue_message_id");
        createAndShowDialogue(s, s1, intent.getStringExtra("positive_button_text"), new android.content.DialogInterface.OnClickListener() {

            final UIActivity this$0;
            final String val$messageId;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface = WLClient.getInstance().getWLChallengeHandler("wl_remoteDisableRealm");
                if (dialoginterface != null)
                {
                    dialoginterface.submitChallengeAnswer(messageId);
                }
                finish();
            }

            
            {
                this$0 = UIActivity.this;
                messageId = s;
                super();
            }
        }, null, null);
    }

    private void handleRemoteDisableDialogue(Intent intent)
    {
        String s1 = intent.getStringExtra("dialogue_title");
        String s2 = intent.getStringExtra("dialogue_message");
        String s3 = intent.getStringExtra("positive_button_text");
        android.content.DialogInterface.OnClickListener onclicklistener1 = new android.content.DialogInterface.OnClickListener() {

            final UIActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                finish();
            }

            
            {
                this$0 = UIActivity.this;
                super();
            }
        };
        final String downloadLink = intent.getStringExtra("download_link");
        String s = null;
        android.content.DialogInterface.OnClickListener onclicklistener = null;
        if (downloadLink != null)
        {
            s = intent.getStringExtra("neutral_button_text");
            onclicklistener = new android.content.DialogInterface.OnClickListener() {

                final UIActivity this$0;
                final String val$downloadLink;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    openURL(downloadLink);
                    finish();
                }

            
            {
                this$0 = UIActivity.this;
                downloadLink = s;
                super();
            }
            };
        }
        createAndShowDialogue(s1, s2, s3, onclicklistener1, s, onclicklistener);
    }

    private void openURL(String s)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
    }

    public void onCreate(Bundle bundle)
    {
        Logger.setContext(this);
        super.onCreate(bundle);
        try
        {
            PRNGFixes.apply();
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            logger.error("Failed to apply Android PRNG secure random fixes.");
        }
        handleDialogue(getIntent().getStringExtra("action"));
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return true;
    }


}
