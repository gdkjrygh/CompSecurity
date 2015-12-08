// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.chat;

import BG;
import Fe;
import If;
import RM;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.snapchat.android.model.chat.ChatFeedItem;

// Referenced classes of package com.snapchat.android.ui.chat:
//            MediaCardView

public class MediaCardLinkView extends MediaCardView
    implements com.snapchat.android.ui.SnapchatResource.a
{

    private final BG c;
    private final TextView d = (TextView)findViewById(0x7f0d01a3);
    private final TextView e = (TextView)findViewById(0x7f0d01a4);
    private final ImageView f = (ImageView)findViewById(0x7f0d01a2);
    private ImageView g;
    private ProgressBar h;
    private Fe i;

    public MediaCardLinkView(Context context, BG bg, If.a a1, MediaCardView.a a2)
    {
        super(context, a1, a2);
        c = bg;
        inflate(context, 0x7f04003d, this);
        setVisibility(8);
        h = (ProgressBar)findViewById(0x7f0d019f);
        g = (ImageView)findViewById(0x7f0d01a1);
    }

    public final void a()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a);
        String s = a.getString(0x7f0800af);
        String s1 = a.getString(0x7f0800ae);
        String s2 = a.getString(0x7f08007f);
        android.content.DialogInterface.OnClickListener onclicklistener = new android.content.DialogInterface.OnClickListener() {

            private MediaCardLinkView a;

            public final void onClick(DialogInterface dialoginterface, int j)
            {
                switch (j)
                {
                default:
                    return;

                case 0: // '\0'
                    dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse(a.b.url));
                    a.a.startActivity(dialoginterface);
                    return;

                case 1: // '\001'
                    If.b(a.a, a.b.text);
                    return;

                case 2: // '\002'
                    dialoginterface.dismiss();
                    break;
                }
            }

            
            {
                a = MediaCardLinkView.this;
                super();
            }
        };
        builder.setItems(new CharSequence[] {
            s, s1, s2
        }, onclicklistener);
        builder.create().show();
    }

    public final void a(BG bg)
    {
        b(bg);
        a(bg, ((android.view.View) (f)));
    }

    protected final void a(ChatFeedItem chatfeeditem)
    {
    }

    public final void a(com.snapchat.android.ui.SnapchatResource.ResourceStatus resourcestatus)
    {
        if (resourcestatus == com.snapchat.android.ui.SnapchatResource.ResourceStatus.LOADED)
        {
            if (i != null)
            {
                resourcestatus = i.a(a);
                if (resourcestatus != null)
                {
                    g.setImageBitmap(resourcestatus);
                    g.setVisibility(0);
                    h.setVisibility(8);
                }
            }
        } else
        if (resourcestatus == com.snapchat.android.ui.SnapchatResource.ResourceStatus.LOADING_FAILED)
        {
            g.setImageResource(0x7f020007);
            h.setVisibility(8);
            return;
        }
    }

    protected final void b(BG bg)
    {
        super.b(bg);
        if (bg.Q())
        {
            h.setVisibility(0);
            g.setVisibility(8);
            return;
        } else
        {
            h.setVisibility(8);
            g.setVisibility(0);
            return;
        }
    }

    public void setLinkContent(RM rm)
    {
label0:
        {
            if (rm != null)
            {
                setVisibility(0);
                String s = rm.a();
                if (s == null)
                {
                    d.setText(b.text);
                } else
                {
                    d.setText(s);
                }
                s = rm.c();
                e.setText(s);
                rm = rm.d();
                if (rm != null && !rm.isEmpty())
                {
                    break label0;
                }
                g.setImageResource(0x7f020007);
            }
            return;
        }
        if (i == null)
        {
            i = new Fe(c, rm, this);
        }
        i.a(a);
    }
}
