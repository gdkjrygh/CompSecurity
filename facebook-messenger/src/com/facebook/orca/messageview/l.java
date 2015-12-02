// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.messageview;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.c.s;
import com.facebook.common.n.a;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.orca.attachments.OtherAttachmentData;
import com.facebook.widget.d;

// Referenced classes of package com.facebook.orca.messageview:
//            m

public class l extends d
{

    private a a;
    private s b;
    private OtherAttachmentData c;
    private Button d;
    private TextView e;
    private TextView f;

    public l(Context context)
    {
        super(context);
        a();
    }

    private void a()
    {
        t t1 = getInjector();
        a = (a)t1.a(com/facebook/common/n/a);
        b = (s)t1.a(com/facebook/c/s);
        setContentView(k.orca_message_view_other_attachment);
        d = (Button)c(i.attachment_download);
        e = (TextView)c(i.attachment_name);
        f = (TextView)c(i.attachment_size);
        d.setOnClickListener(new m(this));
    }

    static void a(l l1)
    {
        l1.c();
    }

    private void b()
    {
        if (c == null)
        {
            e.setText("");
            f.setText("");
            return;
        } else
        {
            e.setText(c.a());
            f.setText(a.a(c.b()));
            return;
        }
    }

    private void c()
    {
        Context context;
        Object obj;
        String s1;
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        obj = c.c();
        s1 = c.d();
        context = getContext();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(((android.net.Uri) (obj)), s1);
        b.b(intent, context);
        return;
        ActivityNotFoundException activitynotfoundexception1;
        activitynotfoundexception1;
        try
        {
            obj = new Intent("android.intent.action.VIEW", ((android.net.Uri) (obj)));
            b.b(((Intent) (obj)), context);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            com.facebook.ui.d.a.a(getContext()).a(o.app_error_dialog_title).b(o.attachment_download_error).a();
        }
        return;
    }

    public OtherAttachmentData getAttachmentInfo()
    {
        return c;
    }

    public void setAttachmentInfo(OtherAttachmentData otherattachmentdata)
    {
        c = otherattachmentdata;
        b();
    }
}
