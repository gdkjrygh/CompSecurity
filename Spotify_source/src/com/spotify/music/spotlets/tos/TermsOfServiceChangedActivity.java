// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.tos;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dfi;
import dfj;
import dgo;
import dgp;
import dmz;
import fop;
import foq;
import for;
import fou;
import ggn;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TermsOfServiceChangedActivity extends fou
{

    private DialogStage d;
    private String i[];
    private boolean j;
    private dfi k;
    private int l;
    private String m;

    public TermsOfServiceChangedActivity()
    {
        new foq();
        dmz.a(for);
    }

    public static Intent a(Context context, String as[], boolean flag, int i1, String s)
    {
        Assertion.a(as, "licenses cannot be null.");
        boolean flag1;
        if (as.length > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Assertion.a(flag1, "There must be at least one license.");
        context = new Intent(context, com/spotify/music/spotlets/tos/TermsOfServiceChangedActivity);
        context.putExtra("licenses", as);
        context.putExtra("postponable", flag);
        context.putExtra("remaining_days", i1);
        context.putExtra("country_code", s);
        context.addFlags(0x20000000);
        return context;
    }

    private TextView a(CharSequence charsequence)
    {
        TextView textview = dgp.a(this, null);
        dgo.a(this, textview, 0x7f0b0142);
        TypedArray typedarray = obtainStyledAttributes(0x7f0b017f, new int[] {
            0x7f0101c5
        });
        int i1;
        if (typedarray == null)
        {
            i1 = 0;
        } else
        {
            i1 = typedarray.getDimensionPixelSize(0, 0);
            typedarray.recycle();
        }
        textview.setPadding(0, i1, 0, i1);
        textview.setText(charsequence);
        return textview;
    }

    private void a(com.spotify.mobile.android.model.TermsAndConditionsFactory.Decision decision)
    {
        String as[] = i;
        int j1 = as.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            foq.a(this, decision, "popup hard gate", as[i1]);
        }

    }

    private void a(com.spotify.mobile.android.util.ClientEvent.SubEvent subevent, int i1)
    {
        dmz.a(fop);
        fop.a(this, ViewUri.ap, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, subevent));
        setResult(i1);
        finish();
    }

    static void a(TermsOfServiceChangedActivity termsofservicechangedactivity)
    {
        for.a(termsofservicechangedactivity);
        termsofservicechangedactivity.a(com.spotify.mobile.android.model.TermsAndConditionsFactory.Decision.a);
        termsofservicechangedactivity.a(com.spotify.mobile.android.util.ClientEvent.SubEvent.C, -1);
    }

    private void a(dfi dfi1)
    {
        k = dfi1;
        dfi1.show();
    }

    static void b(TermsOfServiceChangedActivity termsofservicechangedactivity)
    {
        termsofservicechangedactivity.g();
    }

    static void c(TermsOfServiceChangedActivity termsofservicechangedactivity)
    {
        termsofservicechangedactivity.i();
    }

    static void d(TermsOfServiceChangedActivity termsofservicechangedactivity)
    {
        termsofservicechangedactivity.f();
    }

    static void e(TermsOfServiceChangedActivity termsofservicechangedactivity)
    {
        termsofservicechangedactivity.a(com.spotify.mobile.android.util.ClientEvent.SubEvent.D, 2);
    }

    private void f()
    {
        d = DialogStage.a;
        Object obj;
        if (h())
        {
            obj = new StringBuilder(getString(0x7f08058e));
            Object obj1 = getString(0x7f08058a);
            dfj dfj1;
            String s2;
            Uri uri;
            if (l < 0)
            {
                String s = getString(0x7f08058c);
                String s1 = getString(0x7f08058d);
                ((StringBuilder) (obj)).append(s).append(((String) (obj1))).append(s1);
            } else
            {
                Date date = new Date(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(l));
                ((StringBuilder) (obj)).append(getString(0x7f08058b, new Object[] {
                    DateFormat.getDateInstance().format(date)
                })).append(((String) (obj1)));
            }
            obj = ((StringBuilder) (obj)).toString();
        } else
        {
            obj = new StringBuilder(getString(0x7f080589));
            if (j && l < 0)
            {
                ((StringBuilder) (obj)).append("<br><br>").append(getString(0x7f080590));
            }
            obj = ((StringBuilder) (obj)).toString();
        }
        obj = new StringBuilder(((String) (obj)));
        if (j && l < 0)
        {
            ((StringBuilder) (obj)).append("<br><br>");
            ((StringBuilder) (obj)).append(getString(0x7f080590));
        }
        dfj1 = (new dfj(this, 0x7f0b0181)).a().a(0x7f080591);
        s2 = ((StringBuilder) (obj)).toString();
        obj = i;
        if (obj.length > 0)
        {
            obj = obj[0];
        } else
        {
            obj = getString(0x7f080627);
        }
        uri = Uri.parse(((String) (obj)));
        obj1 = Uri.parse(getString(0x7f080626));
        obj = obj1;
        if (!TextUtils.isEmpty(uri.getQueryParameter("version")))
        {
            obj = ((Uri) (obj1)).buildUpon().appendQueryParameter("version", uri.getQueryParameter("version")).build();
        }
        obj = a(Html.fromHtml(s2.replaceAll("spotify:internal:signup:tos", (new StringBuilder("spotify:internal:signup:tos:")).append(uri.toString()).toString()).replaceAll("spotify:internal:signup:policy", (new StringBuilder("spotify:internal:signup:policy:")).append(((Uri) (obj)).toString()).toString()).replaceAll("spotify:internal:signup", "com.spotify.mobile.android.tos:spotify:internal:signup")));
        ((TextView) (obj)).setMovementMethod(LinkMovementMethod.getInstance());
        obj = dfj1.a(((android.view.View) (obj))).a(getString(0x7f0804fc), new android.content.DialogInterface.OnClickListener() {

            private TermsOfServiceChangedActivity a;

            public final void onClick(DialogInterface dialoginterface, int i1)
            {
                ((dfi)dialoginterface).setOnDismissListener(null);
                TermsOfServiceChangedActivity.a(a);
            }

            
            {
                a = TermsOfServiceChangedActivity.this;
                super();
            }
        });
        if (j && l >= 0)
        {
            ((dfj) (obj)).b(0x7f080588, new android.content.DialogInterface.OnClickListener() {

                private TermsOfServiceChangedActivity a;

                public final void onClick(DialogInterface dialoginterface, int i1)
                {
                    TermsOfServiceChangedActivity.b(a);
                }

            
            {
                a = TermsOfServiceChangedActivity.this;
                super();
            }
            });
            ((dfj) (obj)).a(new android.content.DialogInterface.OnCancelListener() {

                private TermsOfServiceChangedActivity a;

                public final void onCancel(DialogInterface dialoginterface)
                {
                    TermsOfServiceChangedActivity.b(a);
                }

            
            {
                a = TermsOfServiceChangedActivity.this;
                super();
            }
            });
        } else
        {
            ((dfj) (obj)).a(new android.content.DialogInterface.OnCancelListener() {

                private TermsOfServiceChangedActivity a;

                public final void onCancel(DialogInterface dialoginterface)
                {
                    TermsOfServiceChangedActivity.c(a);
                }

            
            {
                a = TermsOfServiceChangedActivity.this;
                super();
            }
            });
        }
        a(((dfj) (obj)).b());
    }

    private void g()
    {
        d = DialogStage.b;
        dfj dfj1 = (new dfj(this, 0x7f0b0181)).a().a(0x7f080591);
        Object obj;
        if (h())
        {
            obj = new Date(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(l));
            obj = getString(0x7f08058f, new Object[] {
                DateFormat.getDateInstance().format(((Date) (obj)))
            });
        } else
        {
            obj = new StringBuilder(getResources().getQuantityString(0x7f090023, l, new Object[] {
                Integer.valueOf(l)
            }));
            ((StringBuilder) (obj)).append("<br><br>").append(getString(0x7f080590));
            obj = ((StringBuilder) (obj)).toString();
        }
        a(dfj1.a(a(Html.fromHtml(((String) (obj))))).a(0x7f0805a1, new android.content.DialogInterface.OnClickListener() {

            private TermsOfServiceChangedActivity a;

            public final void onClick(DialogInterface dialoginterface, int i1)
            {
                TermsOfServiceChangedActivity.e(a);
            }

            
            {
                a = TermsOfServiceChangedActivity.this;
                super();
            }
        }).b(0x7f080587, new android.content.DialogInterface.OnClickListener() {

            private TermsOfServiceChangedActivity a;

            public final void onClick(DialogInterface dialoginterface, int i1)
            {
                TermsOfServiceChangedActivity.d(a);
            }

            
            {
                a = TermsOfServiceChangedActivity.this;
                super();
            }
        }).a(new android.content.DialogInterface.OnCancelListener() {

            private TermsOfServiceChangedActivity a;

            public final void onCancel(DialogInterface dialoginterface)
            {
                TermsOfServiceChangedActivity.d(a);
            }

            
            {
                a = TermsOfServiceChangedActivity.this;
                super();
            }
        }).b());
    }

    private boolean h()
    {
        return "de".equalsIgnoreCase(m);
    }

    private void i()
    {
        a(com.spotify.mobile.android.model.TermsAndConditionsFactory.Decision.b);
        a(com.spotify.mobile.android.util.ClientEvent.SubEvent.B, 1);
    }

    public void onBackPressed()
    {
        i();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030021);
        setFinishOnTouchOutside(false);
        Intent intent = getIntent();
        i = intent.getStringArrayExtra("licenses");
        j = intent.getBooleanExtra("postponable", false);
        l = intent.getIntExtra("remaining_days", -1);
        m = intent.getExtras().getString("country_code", "");
        if (bundle != null)
        {
            d = (DialogStage)bundle.getSerializable("dialog_stage");
        } else
        {
            d = DialogStage.a;
        }
        super.e = ggn.a(this, ViewUri.ap);
    }

    public void onPause()
    {
        if (k != null)
        {
            k.dismiss();
            k = null;
        }
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        final class _cls8
        {

            static final int a[];

            static 
            {
                a = new int[DialogStage.values().length];
                try
                {
                    a[DialogStage.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[DialogStage.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls8.a[d.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            f();
            return;

        case 2: // '\002'
            g();
            break;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("dialog_stage", d);
    }

    private class DialogStage extends Enum
    {

        public static final DialogStage a;
        public static final DialogStage b;
        private static final DialogStage c[];

        public static DialogStage valueOf(String s)
        {
            return (DialogStage)Enum.valueOf(com/spotify/music/spotlets/tos/TermsOfServiceChangedActivity$DialogStage, s);
        }

        public static DialogStage[] values()
        {
            return (DialogStage[])c.clone();
        }

        static 
        {
            a = new DialogStage("CHANGE_NOTIFICATION_DIALOG", 0);
            b = new DialogStage("POSTPONE_DIALOG", 1);
            c = (new DialogStage[] {
                a, b
            });
        }

        private DialogStage(String s, int i1)
        {
            super(s, i1);
        }
    }

}
