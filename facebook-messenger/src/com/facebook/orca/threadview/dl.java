// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.common.w.n;
import com.facebook.h;
import com.facebook.i;
import com.facebook.k;
import com.facebook.orca.attachments.OtherAttachmentData;
import com.facebook.widget.d;

public class dl extends d
{

    private OtherAttachmentData a;
    private ImageView b;
    private TextView c;

    public dl(Context context)
    {
        this(context, null);
    }

    public dl(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public dl(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        setContentView(k.orca_thread_view_other_attachment);
        b = (ImageView)c(i.attachment_icon);
        c = (TextView)c(i.attachment_name);
    }

    private void a()
    {
        if (a == null)
        {
            b.setImageDrawable(null);
            c.setText("");
            return;
        } else
        {
            b.setImageDrawable(getResources().getDrawable(getResourceIdForAttachmentIcon()));
            c.setText(a.a());
            return;
        }
    }

    private int getResourceIdForAttachmentIcon()
    {
        if (a == null || n.a(a.d()))
        {
            return h.orca_attachment_file_generic;
        }
        String s = a.d().toLowerCase();
        if (s.contains("text") || s.contains("rtf"))
        {
            if (s.contains("rtf"))
            {
                return h.orca_attachment_file_richtext;
            } else
            {
                return h.orca_attachment_file_text;
            }
        }
        if (a.d().contains("video"))
        {
            return h.orca_attachment_file_movie;
        }
        if (a.d().contains("audio"))
        {
            return h.orca_attachment_file_music;
        } else
        {
            return h.orca_attachment_file_generic;
        }
    }

    public void setAttachmentInfo(OtherAttachmentData otherattachmentdata)
    {
        a = otherattachmentdata;
        a();
    }
}
