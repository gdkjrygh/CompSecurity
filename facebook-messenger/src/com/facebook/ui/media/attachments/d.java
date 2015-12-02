// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.attachments;

import android.content.Context;
import android.net.Uri;

// Referenced classes of package com.facebook.ui.media.attachments:
//            MediaResource, a, h

public class d
{

    private static final Class a = com/facebook/ui/media/attachments/d;
    private final Context b;

    public d(Context context)
    {
        b = context;
    }

    public a a(Uri uri, long l)
    {
        return b(MediaResource.a(uri, l));
    }

    public a a(MediaResource mediaresource)
    {
        Uri uri = mediaresource.d();
        String s = uri.getScheme();
        if ("content".equals(s) || "file".equals(s))
        {
            return new a(b, mediaresource);
        } else
        {
            throw new h(uri);
        }
    }

    public a b(MediaResource mediaresource)
    {
        if (mediaresource == null || mediaresource.d() == null)
        {
            return null;
        }
        try
        {
            mediaresource = a(mediaresource);
        }
        // Misplaced declaration of an exception variable
        catch (MediaResource mediaresource)
        {
            return null;
        }
        return mediaresource;
    }

}
