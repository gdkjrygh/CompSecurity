// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.chat;

import BG;
import If;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.TextView;
import com.snapchat.android.model.chat.ChatFeedItem;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.snapchat.android.ui.chat:
//            MediaCardView

public class MediaCardPhoneView extends MediaCardView
{

    private final TextView c = (TextView)findViewById(0x7f0d01a3);

    public MediaCardPhoneView(Context context, If.a a1, MediaCardView.a a2)
    {
        super(context, a1, a2);
        inflate(getContext(), 0x7f04003e, this);
    }

    public final void a()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a);
        ArrayList arraylist = new ArrayList();
        String s = If.a(a, b.text);
        arraylist.add(String.format("Call %s", new Object[] {
            s
        }));
        arraylist.add(String.format("SMS %s", new Object[] {
            s
        }));
        arraylist.add(a.getString(0x7f0800ae));
        arraylist.add(a.getString(0x7f08007f));
        CharSequence acharsequence[] = new CharSequence[arraylist.size()];
        arraylist.toArray(acharsequence);
        builder.setItems(acharsequence, new android.content.DialogInterface.OnClickListener() {

            private MediaCardPhoneView a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                switch (i)
                {
                default:
                    return;

                case 0: // '\0'
                    dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse(a.b.url));
                    a.a.startActivity(dialoginterface);
                    return;

                case 1: // '\001'
                    dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse(If.a(a.b.text)));
                    a.a.startActivity(dialoginterface);
                    return;

                case 2: // '\002'
                    If.b(a.a, a.b.text);
                    return;

                case 3: // '\003'
                    dialoginterface.dismiss();
                    break;
                }
            }

            
            {
                a = MediaCardPhoneView.this;
                super();
            }
        });
        builder.create().show();
    }

    public final void a(BG bg)
    {
        b(bg);
        a(((ChatFeedItem) (bg)));
    }

    protected final void a(ChatFeedItem chatfeeditem)
    {
        if (chatfeeditem.Q())
        {
            chatfeeditem = a.getString(0x7f0800bd);
        } else
        {
            chatfeeditem = If.a(a, b.url);
        }
        c.setText(chatfeeditem);
    }
}
