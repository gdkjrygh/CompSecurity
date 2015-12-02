// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.attachments;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.facebook.debug.log.b;
import com.google.common.b.f;
import com.google.common.b.i;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

// Referenced classes of package com.facebook.ui.media.attachments:
//            MediaResource, b, c, g

public class a
{

    private final Class a = com/facebook/ui/media/attachments/a;
    private final Context b;
    private final MediaResource c;

    public a(Context context, MediaResource mediaresource)
    {
        b = context;
        c = mediaresource;
        context = c.d().getScheme();
        boolean flag;
        if (Objects.equal("content", context) || Objects.equal("file", context))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
    }

    public MediaResource a()
    {
        return c;
    }

    public InputStream b()
    {
        String s = c.d().getScheme();
        if (Objects.equal("content", s))
        {
            return b.getContentResolver().openInputStream(a().d());
        }
        if (Objects.equal("file", s))
        {
            return new FileInputStream(a().d().getPath());
        } else
        {
            throw new RuntimeException("Unexpected scheme");
        }
    }

    public i c()
    {
        String s = c.d().getScheme();
        if (Objects.equal("content", s))
        {
            return new com.facebook.ui.media.attachments.b(this);
        }
        if (Objects.equal("file", s))
        {
            return f.a(new File(a().d().getPath()));
        } else
        {
            throw new RuntimeException("Unexpected scheme");
        }
    }

    public String d()
    {
        switch (c.a[c.c().ordinal()])
        {
        default:
            com.facebook.debug.log.b.b(a, "Unexpected attachment type");
            throw new UnsupportedOperationException("Unexpected attachment type");

        case 1: // '\001'
            return "me/photos";

        case 2: // '\002'
            return "me/videos";

        case 3: // '\003'
            com.facebook.debug.log.b.b(a, "Audio shares are not implemented");
            break;
        }
        throw new UnsupportedOperationException("Audio shares are not implemented");
    }
}
