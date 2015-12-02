// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.g;
import com.facebook.i;
import com.facebook.k;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.emoji.z;
import com.facebook.orca.threads.r;
import com.facebook.user.tiles.UserTileView;
import com.facebook.user.tiles.e;
import com.facebook.widget.f;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class v extends f
{

    private static final Pattern a = Pattern.compile("\\n+");
    private UserTileView b;
    private TextView c;
    private TextView d;
    private ImageButton e;
    private Message f;
    private final Context g;
    private final z h;
    private final r i;

    public v(Context context, z z1, r r1)
    {
        super(context);
        g = context;
        h = z1;
        i = r1;
        a(context);
    }

    private String a(Message message)
    {
        message = i.a(message);
        if (message == null)
        {
            message = "";
        } else
        {
            Matcher matcher = a.matcher(message);
            if (matcher.find())
            {
                return matcher.replaceAll(" ");
            }
        }
        return message;
    }

    private void a(Context context)
    {
        setContentView(k.orca_in_app_notification);
        b = (UserTileView)getView(i.notification_user_tile);
        c = (TextView)getView(i.notification_title);
        d = (TextView)getView(i.notification_snippet);
        e = (ImageButton)getView(i.notification_dismiss_button);
    }

    public Message getMessage()
    {
        return f;
    }

    public void setMessage(Message message)
    {
        f = message;
        ParticipantInfo participantinfo = message.i();
        int j;
        if (participantinfo != null)
        {
            c.setText(participantinfo.d());
            b.setParams(com.facebook.user.tiles.e.a(participantinfo.e()));
        } else
        {
            c.setText("");
            b.setParams(null);
        }
        message = new SpannableStringBuilder(a(message));
        j = g.getResources().getDimensionPixelSize(g.in_app_notification_font_size_dp);
        h.a(message, j);
        d.setText(message);
    }

    public void setOnDismissListener(android.view.View.OnClickListener onclicklistener)
    {
        e.setOnClickListener(onclicklistener);
    }

}
