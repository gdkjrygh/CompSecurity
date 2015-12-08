// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.developer;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.api.ApiClientHelper;
import com.pinterest.api.ApiHttpClient;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.kit.utils.NetworkUtils;
import com.pinterest.ui.notify.PinterestDialog;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class DeveloperHelper
{

    private static boolean a = false;
    private static boolean b = false;
    private static boolean c = false;
    private static boolean d = false;
    private static String e;
    private static String f;
    private static int g = 0;
    private static android.view.View.OnClickListener h = new _cls13();

    public static void a(Context context)
    {
        if (!ApplicationInfo.isNonProduction())
        {
            return;
        }
        PinterestDialog pinterestdialog = ActivityHelper.getPinterestDialogCancelable(context);
        Object obj = LayoutInflater.from(context).inflate(0x7f03006d, null);
        pinterestdialog.setContent(((View) (obj)));
        Object obj1 = (TabHost)((View) (obj)).findViewById(0x7f0f0146);
        ((TabHost) (obj1)).setup();
        Object obj2 = ((TabHost) (obj1)).newTabSpec("tag1");
        ((android.widget.TabHost.TabSpec) (obj2)).setContent(0x7f0f0147);
        ((android.widget.TabHost.TabSpec) (obj2)).setIndicator("Basic");
        ((TabHost) (obj1)).addTab(((android.widget.TabHost.TabSpec) (obj2)));
        obj2 = ((TabHost) (obj1)).newTabSpec("tag2");
        ((android.widget.TabHost.TabSpec) (obj2)).setContent(0x7f0f0148);
        ((android.widget.TabHost.TabSpec) (obj2)).setIndicator("Experiments");
        ((TabHost) (obj1)).addTab(((android.widget.TabHost.TabSpec) (obj2)));
        ((TabHost) (obj1)).setCurrentTab(0);
        obj1 = (TextView)((View) (obj)).findViewById(0x7f0f014a);
        obj2 = NetworkUtils.getInstance().getCarrierName();
        Object obj3 = NetworkUtils.getInstance().getCarrierMccMnc();
        Object obj4 = new StringBuilder();
        ((StringBuilder) (obj4)).append(((String) (obj2)));
        ((StringBuilder) (obj4)).append(obj3);
        ((StringBuilder) (obj4)).append((new StringBuilder(" locale: ")).append(Locale.getDefault()).toString());
        ((StringBuilder) (obj4)).append((new StringBuilder("\n")).append(ApiClientHelper.a()).toString());
        ((TextView) (obj1)).setText(((CharSequence) (obj4)));
        ((Button)((View) (obj)).findViewById(0x7f0f0152)).setOnClickListener(new _cls14(((MccMnc) (obj3))));
        ((View) (obj)).findViewById(0x7f0f014b).setOnClickListener(h);
        ((View) (obj)).findViewById(0x7f0f014c).setOnClickListener(h);
        ((View) (obj)).findViewById(0x7f0f014d).setOnClickListener(h);
        ((Button)((View) (obj)).findViewById(0x7f0f014e)).setOnClickListener(new _cls1());
        ((Button)((View) (obj)).findViewById(0x7f0f014f)).setOnClickListener(new _cls2(pinterestdialog));
        ((View) (obj)).findViewById(0x7f0f0150);
        ((Button)((View) (obj)).findViewById(0x7f0f0151)).setOnClickListener(new _cls3(context));
        obj1 = (EditText)((View) (obj)).findViewById(0x7f0f0157);
        ((EditText) (obj1)).setText(ApiHttpClient.getBaseApiUrl());
        ((View) (obj)).findViewById(0x7f0f0155).setOnClickListener(new _cls4(((EditText) (obj1))));
        ((View) (obj)).findViewById(0x7f0f0156).setOnClickListener(new _cls5(((EditText) (obj1))));
        obj2 = (EditText)((View) (obj)).findViewById(0x7f0f015a);
        ((EditText) (obj2)).setText(ApiHttpClient.getBaseLoggingApiUrl());
        ((View) (obj)).findViewById(0x7f0f0158).setOnClickListener(new _cls6(((EditText) (obj2))));
        ((View) (obj)).findViewById(0x7f0f0159).setOnClickListener(new _cls7(((EditText) (obj2))));
        obj3 = (EditText)((View) (obj)).findViewById(0x7f0f015d);
        ((EditText) (obj3)).setText(ApiHttpClient.getBaseLoggingApiUrlV4());
        ((View) (obj)).findViewById(0x7f0f015b).setOnClickListener(new _cls8(((EditText) (obj3))));
        ((View) (obj)).findViewById(0x7f0f015c).setOnClickListener(new _cls9(((EditText) (obj3))));
        ((Button)((View) (obj)).findViewById(0x7f0f0154)).setOnClickListener(new _cls10());
        ((Button)((View) (obj)).findViewById(0x7f0f0153)).setOnClickListener(new _cls11());
        obj4 = (CheckBox)((View) (obj)).findViewById(0x7f0f015e);
        ((CheckBox) (obj4)).setChecked(a);
        CheckBox checkbox = (CheckBox)((View) (obj)).findViewById(0x7f0f015f);
        checkbox.setChecked(b());
        CheckBox checkbox1 = (CheckBox)((View) (obj)).findViewById(0x7f0f0160);
        checkbox1.setChecked(c());
        CheckBox checkbox2 = (CheckBox)((View) (obj)).findViewById(0x7f0f0161);
        checkbox2.setChecked(d());
        obj = (Spinner)((View) (obj)).findViewById(0x7f0f0162);
        ArrayList arraylist = new ArrayList();
        arraylist.add("Default");
        Locale alocale[] = Locale.getAvailableLocales();
        int j = alocale.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(alocale[i].getDisplayName());
        }

        context = new ArrayAdapter(context, 0x1090008, arraylist);
        context.setDropDownViewResource(0x1090009);
        ((Spinner) (obj)).setAdapter(context);
        ((Spinner) (obj)).setSelection(g);
        pinterestdialog.setTitle("Developer Options");
        pinterestdialog.setPositiveButton("Save", new _cls12(((EditText) (obj1)), ((EditText) (obj2)), ((EditText) (obj3)), ((CheckBox) (obj4)), checkbox, checkbox1, checkbox2, ((Spinner) (obj))));
        pinterestdialog.show();
    }

    static void a(Spinner spinner)
    {
        Object obj = null;
        int i = spinner.getSelectedItemPosition();
        g = i;
        if (i == 0)
        {
            e = null;
            spinner = obj;
        } else
        {
            spinner = Locale.getAvailableLocales()[g - 1];
            String s = spinner.getCountry();
            e = s;
            if (TextUtils.isEmpty(s))
            {
                spinner = spinner.getLanguage();
            } else
            {
                spinner = String.format("%s-%s", new Object[] {
                    spinner.getLanguage(), e
                });
            }
        }
        f = spinner;
    }

    public static void a(boolean flag)
    {
        a = flag;
    }

    public static boolean a()
    {
        return a;
    }

    public static void b(boolean flag)
    {
        b = flag;
    }

    public static boolean b()
    {
        return ApplicationInfo.isNonProduction() && b;
    }

    public static void c(boolean flag)
    {
        c = flag;
    }

    public static boolean c()
    {
        return ApplicationInfo.isNonProduction() && c;
    }

    public static void d(boolean flag)
    {
        d = flag;
    }

    public static boolean d()
    {
        return ApplicationInfo.isNonProduction() && d;
    }

    public static String e()
    {
        return e;
    }

    public static String f()
    {
        return f;
    }


    private class _cls14
        implements android.view.View.OnClickListener
    {

        final MccMnc a;

        public final void onClick(View view)
        {
            class _cls1 extends ApiResponseHandler
            {

                final _cls14 a;

                public void onSuccess(ApiResponse apiresponse)
                {
                    super.onSuccess(apiresponse);
                    Application.showToast((new StringBuilder("loadWidgetAvailability: ")).append(apiresponse).toString());
                }

                _cls1()
                {
                    a = _cls14.this;
                    super();
                }
            }

            WidgetApi.a(a.a, a.b, new _cls1());
        }

        _cls14(MccMnc mccmnc)
        {
            a = mccmnc;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        public final void onClick(View view)
        {
            AutoUpdateManager.a().startUpdate(null);
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final PinterestDialog a;

        public final void onClick(View view)
        {
            Events.post(new Navigation(Location.PIN_PICKS, "pinpicks/us/breakfast/"));
            a.dismiss();
        }

        _cls2(PinterestDialog pinterestdialog)
        {
            a = pinterestdialog;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final Context a;

        public final void onClick(View view)
        {
            ActivityHelper.goNUXExperience(a);
        }

        _cls3(Context context)
        {
            a = context;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final EditText a;

        public final void onClick(View view)
        {
            a.setText(ApiHttpClient.getDevBaseApiUrl());
        }

        _cls4(EditText edittext)
        {
            a = edittext;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final EditText a;

        public final void onClick(View view)
        {
            a.setText("https://api.pinterest.com/v3/%s");
        }

        _cls5(EditText edittext)
        {
            a = edittext;
            super();
        }
    }


    private class _cls6
        implements android.view.View.OnClickListener
    {

        final EditText a;

        public final void onClick(View view)
        {
            a.setText(ApiHttpClient.getDevBaseLoggingApiUrl());
        }

        _cls6(EditText edittext)
        {
            a = edittext;
            super();
        }
    }


    private class _cls7
        implements android.view.View.OnClickListener
    {

        final EditText a;

        public final void onClick(View view)
        {
            a.setText("https://trk.pinterest.com/v3/%s");
        }

        _cls7(EditText edittext)
        {
            a = edittext;
            super();
        }
    }


    private class _cls8
        implements android.view.View.OnClickListener
    {

        final EditText a;

        public final void onClick(View view)
        {
            a.setText(ApiHttpClient.getDevBaseLoggingApiUrlV4());
        }

        _cls8(EditText edittext)
        {
            a = edittext;
            super();
        }
    }


    private class _cls9
        implements android.view.View.OnClickListener
    {

        final EditText a;

        public final void onClick(View view)
        {
            a.setText("https://trk.pinterest.com/v4/%s");
        }

        _cls9(EditText edittext)
        {
            a = edittext;
            super();
        }
    }


    private class _cls10
        implements android.view.View.OnClickListener
    {

        public final void onClick(View view)
        {
            Events.post(new DialogEvent(new UploadContactsDialog()));
        }

        _cls10()
        {
        }
    }


    private class _cls11
        implements android.view.View.OnClickListener
    {

        public final void onClick(View view)
        {
            Services.startNotificationService();
        }

        _cls11()
        {
        }
    }


    private class _cls12
        implements android.content.DialogInterface.OnClickListener
    {

        final EditText a;
        final EditText b;
        final EditText c;
        final CheckBox d;
        final CheckBox e;
        final CheckBox f;
        final CheckBox g;
        final Spinner h;

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            String s = a.getText().toString();
            if (s.lastIndexOf("%s") != s.length() - 2)
            {
                Application.showToast("API URL must contain AND end with '%s'");
                return;
            }
            ApiHttpClient.setBaseApiUrl(s);
            s = b.getText().toString();
            if (s.lastIndexOf("%s") != s.length() - 2)
            {
                Application.showToast("Logging API URL must contain AND end with '%s'");
                return;
            }
            ApiHttpClient.setBaseLoggingApiUrl(s);
            String s1 = c.getText().toString();
            if (s1.lastIndexOf("%s") != s.length() - 2)
            {
                Application.showToast("Logging API URL V4 must contain AND end with '%s'");
                return;
            } else
            {
                ApiHttpClient.setBaseLoggingApiUrlV4(s1);
                DeveloperHelper.a(d.isChecked());
                DeveloperHelper.b(e.isChecked());
                DeveloperHelper.c(f.isChecked());
                DeveloperHelper.d(g.isChecked());
                DeveloperHelper.a(h);
                dialoginterface.dismiss();
                return;
            }
        }

        _cls12(EditText edittext, EditText edittext1, EditText edittext2, CheckBox checkbox, CheckBox checkbox1, CheckBox checkbox2, CheckBox checkbox3, 
                Spinner spinner)
        {
            a = edittext;
            b = edittext1;
            c = edittext2;
            d = checkbox;
            e = checkbox1;
            f = checkbox2;
            g = checkbox3;
            h = spinner;
            super();
        }
    }


    private class _cls13
        implements android.view.View.OnClickListener
    {

        public final void onClick(View view)
        {
            switch (view.getId())
            {
            default:
                return;

            case 2131689803: 
                Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.GPLUS, true));
                return;

            case 2131689804: 
                Events.post(new com.pinterest.base.Social.RequestDisconnectEvent(com.pinterest.base.Social.Network.GPLUS));
                return;

            case 2131689805: 
                Experiments.aa();
                break;
            }
        }

        _cls13()
        {
        }
    }

}
