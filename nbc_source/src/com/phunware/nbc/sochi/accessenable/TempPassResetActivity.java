// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.accessenable;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import com.adobe.adobepass.accessenabler.utils.Log;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;
import timber.log.Timber;

public class TempPassResetActivity extends Activity
{
    private class TempPassResetRunner extends AsyncTask
    {

        final TempPassResetActivity this$0;

        private Integer performHttpDelete(String s, String s1)
        {
            int i;
            try
            {
                s1 = new HttpDelete(s1);
                s1.setHeader("apiKey", s);
                i = (new DefaultHttpClient()).execute(s1, new BasicHttpContext()).getStatusLine().getStatusCode();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Timber.e("Error on delete", new Object[] {
                    s
                });
                return Integer.valueOf(0);
            }
            return Integer.valueOf(i);
        }

        protected transient Integer doInBackground(String as[])
        {
            String s1 = as[0];
            String s = as[1];
            String s2 = as[2];
            as = as[3];
            as = (new StringBuilder()).append("https://").append(s1).append(TempPassResetActivity.RESET_SERVICE).append("?device_id=").append(s2).append("&requestor_id=").append(requestorId).append("&mvpd_id=").append(as).toString();
            Log.d("TempPassResetActivity", (new StringBuilder()).append("Target URL: ").append(as).toString());
            return performHttpDelete(s, as);
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected void onPostExecute(Integer integer)
        {
            handleResult(integer.intValue());
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Integer)obj);
        }

        private TempPassResetRunner()
        {
            this$0 = TempPassResetActivity.this;
            super();
        }

    }


    private static final String LOG_TAG = "TempPassResetActivity";
    private static String PREQUAL_URL = "mgmt.prequal.auth-staging.adobe.com";
    private static String RELEASE_URL = "mgmt.auth.adobe.com";
    private static String RESET_SERVICE = "/reset-tempass/v2/reset";
    private String apiKey;
    private final android.view.View.OnClickListener btnCancelListener = new android.view.View.OnClickListener() {

        final TempPassResetActivity this$0;

        public void onClick(View view)
        {
        }

            
            {
                this$0 = TempPassResetActivity.this;
                super();
            }
    };
    private final android.view.View.OnClickListener btnResetListener = new android.view.View.OnClickListener() {

        final TempPassResetActivity this$0;

        public void onClick(View view)
        {
            view = getEnvironment();
            String s = getDeviceId();
            if (apiKey == null || apiKey.trim().equals(""))
            {
                alertDialog("Temp Pass Reset", "Please provide your Temp Pass Reset API Key");
                return;
            } else
            {
                Log.d("TempPassResetActivity", (new StringBuilder()).append("Resetting Temp Pass for device ID: ").append(s).toString());
                progressDialog = ProgressDialog.show(TempPassResetActivity.this, "", "Talking to backend server...", true);
                (new TempPassResetRunner()).execute(new String[] {
                    view, apiKey, s, mvpdId
                });
                return;
            }
        }

            
            {
                this$0 = TempPassResetActivity.this;
                super();
            }
    };
    private EditText editCustomUrl;
    private String mvpdId;
    private ProgressDialog progressDialog;
    private RadioGroup radioGroup;
    private final android.widget.RadioGroup.OnCheckedChangeListener radioGroupOnCheckedChangeListener = new android.widget.RadioGroup.OnCheckedChangeListener() {

        final TempPassResetActivity this$0;

        public void onCheckedChanged(RadioGroup radiogroup, int i)
        {
            i = radiogroup.indexOfChild(radiogroup.findViewById(radiogroup.getCheckedRadioButtonId()));
            radiogroup = editCustomUrl;
            boolean flag;
            if (i == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            radiogroup.setEnabled(flag);
            if (!editCustomUrl.isEnabled())
            {
                editCustomUrl.setText("");
            }
        }

            
            {
                this$0 = TempPassResetActivity.this;
                super();
            }
    };
    private String requestorId;

    public TempPassResetActivity()
    {
    }

    private int firstDigit(int i)
    {
        return String.valueOf(i).charAt(0) - 48;
    }

    private String getDeviceId()
    {
        return android.provider.Settings.Secure.getString(getApplicationContext().getContentResolver(), "android_id");
    }

    private void handleResult(int i)
    {
        firstDigit(i);
        JVM INSTR tableswitch 2 2: default 24
    //                   2 57;
           goto _L1 _L2
_L1:
        alertDialog("Temp Pass Reset", (new StringBuilder()).append("FAILED: erro ").append(i).toString());
_L4:
        progressDialog.dismiss();
        return;
_L2:
        alertDialog("Temp Pass Reset", "SUCCESS");
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void alertDialog(String s, String s1)
    {
        (new android.app.AlertDialog.Builder(this)).setMessage(s1).setTitle(s).setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

            final TempPassResetActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                Log.i("TempPassResetActivity#alertDialog", "OK button clicked");
            }

            
            {
                this$0 = TempPassResetActivity.this;
                super();
            }
        }).setNegativeButton("Cancel", new android.content.DialogInterface.OnClickListener() {

            final TempPassResetActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.cancel();
            }

            
            {
                this$0 = TempPassResetActivity.this;
                super();
            }
        }).show();
    }

    public String getEnvironment()
    {
        int i = radioGroup.getCheckedRadioButtonId();
        View view = radioGroup.findViewById(i);
        switch (radioGroup.indexOfChild(view))
        {
        default:
            return editCustomUrl.getText().toString();

        case 0: // '\0'
            return PREQUAL_URL;

        case 1: // '\001'
            return RELEASE_URL;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0400a3);
        radioGroup = (RadioGroup)findViewById(0x7f0f01e9);
        editCustomUrl = (EditText)findViewById(0x7f0f01ed);
        bundle = (Button)findViewById(0x7f0f01ef);
        Button button = (Button)findViewById(0x7f0f01ee);
        radioGroup.setOnCheckedChangeListener(radioGroupOnCheckedChangeListener);
        bundle.setOnClickListener(btnResetListener);
        button.setOnClickListener(btnCancelListener);
        requestorId = "nbcentertainment";
        apiKey = "WEwV2lPkLvFCSBF83D5viGGwa2mI8y4s";
        mvpdId = "TempPass-LongTTL";
        editCustomUrl.setEnabled(false);
    }






/*
    static ProgressDialog access$302(TempPassResetActivity temppassresetactivity, ProgressDialog progressdialog)
    {
        temppassresetactivity.progressDialog = progressdialog;
        return progressdialog;
    }

*/




}
