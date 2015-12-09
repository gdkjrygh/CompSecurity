// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.androidquery.a;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class q extends ArrayAdapter
{
    public static interface a
    {

        public abstract void a(PicUser picuser, View view);

        public abstract void a(WebPhoto webphoto, View view);
    }


    private final LayoutInflater a;
    private a b;

    public q(Context context)
    {
        super(context, 0);
        a = LayoutInflater.from(context);
    }

    private Spanned a(String s)
        throws XmlPullParserException, IOException
    {
        StringBuilder stringbuilder;
        XmlPullParser xmlpullparser;
        int i;
        stringbuilder = new StringBuilder();
        xmlpullparser = XmlPullParserFactory.newInstance().newPullParser();
        xmlpullparser.setInput(new StringReader(String.format("<root>%s</root>", new Object[] {
            s
        })));
        i = xmlpullparser.getEventType();
_L7:
        if (i == 1) goto _L2; else goto _L1
_L1:
        s = xmlpullparser.getName();
        i;
        JVM INSTR tableswitch 2 4: default 92
    //                   2 114
    //                   3 146
    //                   4 103;
           goto _L3 _L4 _L5 _L6
_L3:
        i = xmlpullparser.next();
          goto _L7
_L6:
        stringbuilder.append(xmlpullparser.getText());
_L4:
        if (s == null || !s.equals("user") && !s.equals("collage")) goto _L3; else goto _L8
_L8:
        stringbuilder.append("<b>");
          goto _L3
_L5:
        if (s != null && (s.equals("user") || s.equals("collage")))
        {
            stringbuilder.append("</b>");
        }
          goto _L3
_L2:
        return Html.fromHtml(stringbuilder.toString());
    }

    static a a(q q1)
    {
        return q1.b;
    }

    private CharSequence a(String s, CharSequence charsequence)
        throws IOException, XmlPullParserException
    {
        charsequence = new SpannableString(charsequence);
        charsequence.setSpan(new ForegroundColorSpan(Color.rgb(178, 178, 178)), 0, charsequence.length(), 18);
        return TextUtils.concat(new CharSequence[] {
            a(s), " ", charsequence
        });
    }

    public void a(a a1)
    {
        b = a1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        com.cardinalblue.android.piccollage.model.gson.NotificationResponse.Notifications.Notif notif = (com.cardinalblue.android.piccollage.model.gson.NotificationResponse.Notifications.Notif)getItem(i);
        if (view == null)
        {
            view = a.inflate(0x7f0300f8, viewgroup, false);
        }
        viewgroup = new com.androidquery.a(view);
        ((com.androidquery.a)viewgroup.a(0x7f100237)).a(new android.view.View.OnClickListener(notif) {

            final com.cardinalblue.android.piccollage.model.gson.NotificationResponse.Notifications.Notif a;
            final q b;

            public void onClick(View view1)
            {
                PicUser picuser = a.getUser();
                if (picuser != null && com.cardinalblue.android.piccollage.view.a.q.a(b) != null)
                {
                    com.cardinalblue.android.piccollage.view.a.q.a(b).a(picuser, view1);
                }
            }

            
            {
                b = q.this;
                a = notif;
                super();
            }
        });
        ((com.androidquery.a)viewgroup.a(0x7f10023a)).a(new android.view.View.OnClickListener(notif) {

            final com.cardinalblue.android.piccollage.model.gson.NotificationResponse.Notifications.Notif a;
            final q b;

            public void onClick(View view1)
            {
                WebPhoto webphoto = a.getCollage();
                if (webphoto != null && com.cardinalblue.android.piccollage.view.a.q.a(b) != null)
                {
                    com.cardinalblue.android.piccollage.view.a.q.a(b).a(webphoto, view1);
                }
            }

            
            {
                b = q.this;
                a = notif;
                super();
            }
        });
        i = notif.getResourceId();
        if (i != -1)
        {
            ((com.androidquery.a)((com.androidquery.a)viewgroup.a(0x7f100238)).e()).d(i);
        } else
        {
            ((com.androidquery.a)viewgroup.a(0x7f100238)).d();
        }
        ((com.androidquery.a)viewgroup.a(0x7f100237)).d(0x7f020224);
        ((com.androidquery.a)viewgroup.a(0x7f10023a)).d(0x7f020229);
        if (notif.getUser() != null)
        {
            ((com.androidquery.a)viewgroup.a(0x7f100237)).a(notif.getUser().getProfileImageUrl());
        } else
        {
            ((com.androidquery.a)viewgroup.a(0x7f100237)).d(0x7f02021b);
        }
        if (notif.getCollage() != null)
        {
            ((com.androidquery.a)viewgroup.a(0x7f10023a)).a(notif.getCollage().getThumbnailImageUrl());
        } else
        {
            ((com.androidquery.a)viewgroup.a(0x7f10023a)).c();
        }
        try
        {
            ((com.androidquery.a)viewgroup.a(0x7f100239)).a(a(notif.getText(), notif.getTimestamp()));
        }
        catch (Exception exception)
        {
            f.a(exception);
            ((com.androidquery.a)viewgroup.a(0x7f100239)).a(TextUtils.concat(new CharSequence[] {
                notif.getText(), " ", notif.getTimestamp()
            }));
            return view;
        }
        return view;
    }
}
