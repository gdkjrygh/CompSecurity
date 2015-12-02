// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.threads;

import android.net.Uri;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.ui.media.attachments.g;
import com.google.common.base.Strings;
import java.io.File;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.messages.model.threads:
//            Message

public final class d
{

    public static final d a = new d(-1L, -1, -1, -1);
    public final long b;
    public final int c;
    public final int d;
    public final int e;

    private d(long l, int i, int j, int k)
    {
        b = l;
        c = i;
        d = j;
        e = k;
    }

    public static d a(Message message)
    {
        int k = 0;
        long l = 0L;
        Iterator iterator;
        MediaResource mediaresource;
        int i;
        int j;
        boolean flag;
        try
        {
            iterator = message.B().iterator();
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            return a;
        }
        i = 0;
        j = 0;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        mediaresource = (MediaResource)iterator.next();
        if (mediaresource.c() != g.AUDIO)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        l += (new File(mediaresource.d().getPath())).length();
        i++;
        continue; /* Loop/switch isn't completed */
        if (mediaresource.c() != g.PHOTO)
        {
            continue; /* Loop/switch isn't completed */
        }
        l += (new File(mediaresource.f())).length();
        j++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_21;
_L1:
        flag = Strings.isNullOrEmpty(message.E());
        if (!flag)
        {
            k = 1;
        }
        return new d(l, j, i, k);
    }

}
