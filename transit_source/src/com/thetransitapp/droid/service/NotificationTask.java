// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.service;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.location.Location;
import android.text.Editable;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.crashlytics.android.Crashlytics;
import com.thetransitapp.droid.data.BaseOnlineSource;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.thetransitapp.droid.service:
//            BaseServiceTask

public class NotificationTask extends BaseServiceTask
{

    private DefaultHttpClient client;
    private String email;
    private Location location;
    private String statURL;

    public NotificationTask(Context context, final Location alertDialog)
    {
        super(context);
        client = new DefaultHttpClient();
        location = alertDialog;
        int j = context.getResources().getDimensionPixelSize(0x7f080018);
        alertDialog = (new android.app.AlertDialog.Builder(context)).create();
        final EditText input = new EditText(context);
        final Pattern emailPattern = Patterns.EMAIL_ADDRESS;
        Account aaccount[] = AccountManager.get(context).getAccounts();
        int k = aaccount.length;
        int i = 0;
        do
        {
            if (i >= k)
            {
                alertDialog.setTitle(0x7f0a0097);
                alertDialog.setView(input, j, j, j, j);
                alertDialog.setButton(-1, context.getText(0x7f0a002f), null);
                alertDialog.setButton(-2, context.getText(0x7f0a0030), null);
                alertDialog.setOnShowListener(new android.content.DialogInterface.OnShowListener() {

                    final NotificationTask this$0;
                    private final AlertDialog val$alertDialog;
                    private final Pattern val$emailPattern;
                    private final EditText val$input;

                    public void onShow(DialogInterface dialoginterface)
                    {
                        alertDialog.getButton(-1).setOnClickListener(alertDialog. new android.view.View.OnClickListener() {

                            final _cls1 this$1;
                            private final AlertDialog val$alertDialog;
                            private final Pattern val$emailPattern;
                            private final EditText val$input;

                            public void onClick(View view)
                            {
                                email = input.getText().toString();
                                if (emailPattern.matcher(email).matches())
                                {
                                    execute();
                                    alertDialog.dismiss();
                                    return;
                                } else
                                {
                                    input.selectAll();
                                    view = getContext().getString(0x7f0a0099);
                                    Toast.makeText(getContext(), view, 0).show();
                                    return;
                                }
                            }

            
            {
                this$1 = final__pcls1;
                input = edittext;
                emailPattern = pattern;
                alertDialog = AlertDialog.this;
                super();
            }
                        });
                    }


            
            {
                this$0 = NotificationTask.this;
                alertDialog = alertdialog;
                input = edittext;
                emailPattern = pattern;
                super();
            }
                });
                alertDialog.show();
                return;
            }
            Account account = aaccount[i];
            if (emailPattern.matcher(account.name).matches())
            {
                input.setText(account.name);
            }
            i++;
        } while (true);
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Void call()
        throws Exception
    {
        Object obj = new HttpPost((new StringBuilder(String.valueOf(statURL))).append("/notification").toString());
        ((HttpPost) (obj)).setHeader("Authorization", (new StringBuilder("Basic ")).append(super.getOnlineSource().getAuth()).toString());
        ((HttpPost) (obj)).setHeader("User-Agent", super.getOnlineSource().getUserAgent());
        try
        {
            ArrayList arraylist = new ArrayList(1);
            arraylist.add(new BasicNameValuePair("email", email));
            arraylist.add(new BasicNameValuePair("lat", (new StringBuilder(String.valueOf(location.getLatitude()))).toString()));
            arraylist.add(new BasicNameValuePair("lng", (new StringBuilder(String.valueOf(location.getLongitude()))).toString()));
            ((HttpPost) (obj)).setEntity(new UrlEncodedFormEntity(arraylist));
            ((HttpPost) (obj)).setHeader("Content-Type", "application/x-www-form-urlencoded");
            obj = client.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
            if (((HttpResponse) (obj)).getStatusLine().getStatusCode() >= 300)
            {
                throw new HttpException(((HttpResponse) (obj)).getStatusLine().getReasonPhrase());
            }
        }
        catch (Exception exception)
        {
            Log.e(com/thetransitapp/droid/service/NotificationTask.getSimpleName(), exception.getMessage(), exception);
            Crashlytics.logException(exception);
        }
        return null;
    }

    protected void onException(Exception exception)
    {
        super.onException(exception);
        exception = super.getContext().getString(0x7f0a0073);
        Toast.makeText(super.getContext(), exception, 0).show();
    }

    protected volatile void onSuccess(Object obj)
        throws Exception
    {
        onSuccess((Void)obj);
    }

    protected void onSuccess(Void void1)
        throws Exception
    {
        super.onSuccess(void1);
        void1 = super.getContext().getString(0x7f0a0098);
        Toast.makeText(super.getContext(), void1, 0).show();
    }


}
