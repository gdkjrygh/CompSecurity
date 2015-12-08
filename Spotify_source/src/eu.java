// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.support.v4.media.session.MediaSessionCompat;

public final class eu
{

    public final ez a;
    private final android.support.v4.media.session.MediaSessionCompat.Token b;

    public eu(Context context, android.support.v4.media.session.MediaSessionCompat.Token token)
    {
        if (token == null)
        {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        b = token;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new fa(context, token);
            return;
        } else
        {
            a = new fc(b);
            return;
        }
    }

    public eu(Context context, MediaSessionCompat mediasessioncompat)
    {
        if (mediasessioncompat == null)
        {
            throw new IllegalArgumentException("session must not be null");
        }
        b = mediasessioncompat.d();
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            a = new fb(context, mediasessioncompat);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new fa(context, mediasessioncompat);
            return;
        } else
        {
            a = new fc(b);
            return;
        }
    }

    public final fe a()
    {
        return a.a();
    }

    public final void a(ev ev)
    {
        if (ev == null)
        {
            throw new IllegalArgumentException("callback cannot be null");
        } else
        {
            a.a(ev);
            return;
        }
    }
}
