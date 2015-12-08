// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.session.MediaController;

final class fi
{

    public static Object a(Context context, Object obj)
    {
        return new MediaController(context, (android.media.session.MediaSession.Token)obj);
    }
}
