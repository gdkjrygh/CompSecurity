// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import android.content.res.Resources;
import com.facebook.common.w.n;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.o;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.ui.media.attachments.g;
import java.util.List;

public class r
{

    Resources a;

    public r(Resources resources)
    {
        a = resources;
    }

    public String a(Message message)
    {
        if (message.l() && (!message.l() || message.k().length() != 0) || message.z() == null || !message.z().equals("mms")) goto _L2; else goto _L1
_L1:
        Object obj = message.o();
        if (((List) (obj)).size() <= 0) goto _L2; else goto _L3
_L3:
        if (((List) (obj)).size() <= 1) goto _L5; else goto _L4
_L4:
        obj = a.getString(o.attachments_multiple, new Object[] {
            message.i().d()
        });
_L7:
        return ((String) (obj));
_L5:
        obj = (MediaResource)((List) (obj)).get(0);
        if (g.PHOTO.equals(((MediaResource) (obj)).c()))
        {
            return a.getString(o.attachments_single_image, new Object[] {
                message.i().d()
            });
        } else
        {
            return a.getString(o.attachments_single_nonimage, new Object[] {
                message.i().d()
            });
        }
_L2:
        String s = message.j();
        obj = s;
        if (n.a(s))
        {
            return message.k();
        }
        if (true) goto _L7; else goto _L6
_L6:
    }
}
