// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.chat;

import BG;
import FI;
import FK;
import Fe;
import If;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.snapchat.android.model.chat.ChatFeedItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.snapchat.android.ui.chat:
//            MediaCardView

public class MediaCardMapView extends MediaCardView
    implements FI.a, com.snapchat.android.ui.SnapchatResource.a
{

    private final String c = "Open in Google Maps";
    private final String d = "Open in Waze";
    private final String e;
    private final String f;
    private final TextView g = (TextView)findViewById(0x7f0d01a3);
    private final TextView h = (TextView)findViewById(0x7f0d01a4);
    private final ImageView i = (ImageView)findViewById(0x7f0d01a2);
    private final View j = findViewById(0x7f0d019e);
    private ImageView k;
    private ImageView l;
    private ProgressBar m;
    private final Fe n;
    private final FI o;

    public MediaCardMapView(Context context, BG bg, If.a a1, MediaCardView.a a2)
    {
        super(context, a1, a2);
        inflate(getContext(), 0x7f04003d, this);
        m = (ProgressBar)findViewById(0x7f0d019f);
        l = (ImageView)findViewById(0x7f0d01a1);
        k = (ImageView)findViewById(0x7f0d01a0);
        m.setVisibility(8);
        n = new Fe(bg, If.d(b.text), this);
        o = new FI(b.text, this);
        e = a.getString(0x7f0800ae);
        f = a.getString(0x7f08007f);
    }

    static String a(MediaCardMapView mediacardmapview)
    {
        return mediacardmapview.c;
    }

    static String b(MediaCardMapView mediacardmapview)
    {
        return mediacardmapview.d;
    }

    private boolean b(String s)
    {
        PackageManager packagemanager = a.getPackageManager();
        try
        {
            packagemanager.getPackageInfo(s, 1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    static String c(MediaCardMapView mediacardmapview)
    {
        return mediacardmapview.e;
    }

    static String d(MediaCardMapView mediacardmapview)
    {
        return mediacardmapview.f;
    }

    public final void a()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a);
        ArrayList arraylist = new ArrayList();
        if (b("com.google.android.apps.maps"))
        {
            arraylist.add(c);
        }
        if (b("com.waze"))
        {
            arraylist.add(d);
        }
        arraylist.add(e);
        arraylist.add(f);
        CharSequence acharsequence[] = (CharSequence[])arraylist.toArray(new CharSequence[arraylist.size()]);
        builder.setItems(acharsequence, new android.content.DialogInterface.OnClickListener(acharsequence) {

            private CharSequence a[];
            private MediaCardMapView b;

            public final void onClick(DialogInterface dialoginterface, int i1)
            {
                String s = a[i1].toString();
                if (TextUtils.equals(s, MediaCardMapView.a(b)))
                {
                    dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse(If.b(b.b.url)));
                    b.a.startActivity(dialoginterface);
                } else
                {
                    if (TextUtils.equals(s, MediaCardMapView.b(b)))
                    {
                        dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse(If.c(b.b.url)));
                        b.a.startActivity(dialoginterface);
                        return;
                    }
                    if (TextUtils.equals(s, MediaCardMapView.c(b)))
                    {
                        If.b(b.a, b.b.text);
                        return;
                    }
                    if (TextUtils.equals(s, MediaCardMapView.d(b)))
                    {
                        dialoginterface.dismiss();
                        return;
                    }
                }
            }

            
            {
                b = MediaCardMapView.this;
                a = acharsequence;
                super();
            }
        });
        builder.create().show();
    }

    public final void a(BG bg)
    {
        b(bg);
        a(((ChatFeedItem) (bg)));
        a(bg, ((View) (i)));
    }

    protected final void a(ChatFeedItem chatfeeditem)
    {
        g.setText(b.text);
    }

    public final void a(com.snapchat.android.ui.SnapchatResource.ResourceStatus resourcestatus)
    {
        if (resourcestatus == com.snapchat.android.ui.SnapchatResource.ResourceStatus.LOADED)
        {
            resourcestatus = n.a(a);
            if (resourcestatus != null)
            {
                l.setImageBitmap(resourcestatus);
                l.setVisibility(0);
                m.setVisibility(8);
            }
        } else
        if (resourcestatus == com.snapchat.android.ui.SnapchatResource.ResourceStatus.LOADING_FAILED)
        {
            m.setVisibility(8);
            k.setImageResource(0x7f0200d4);
            int i1 = getResources().getColor(0x7f0c0020);
            j.setBackgroundColor(i1);
            return;
        }
    }

    public final void a(String s)
    {
        if (s != null && !s.isEmpty())
        {
            h.setText(s);
        }
    }

    protected final void b(BG bg)
    {
        super.b(bg);
        n.a(a);
        FI fi = o;
        if (FI.a.containsKey(fi.b))
        {
            fi.c.a((String)FI.a.get(fi.b));
        } else
        {
            FK.a().a(fi);
        }
        if (bg.Q())
        {
            m.setVisibility(0);
            l.setVisibility(8);
            return;
        } else
        {
            m.setVisibility(8);
            l.setVisibility(0);
            return;
        }
    }
}
