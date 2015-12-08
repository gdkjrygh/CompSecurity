// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.logging.Logger;

final class ang.Object
    implements dmi
{

    private dme a;

    public final void a(int i, Object obj)
    {
        obj = (String)obj;
        if (!a.a(i))
        {
            Logger.c("Request failed: %s", new Object[] {
                obj
            });
        }
    }

    public final void a(Throwable throwable, String s)
    {
        Logger.b(throwable, "request.failed: %s", new Object[] {
            s
        });
    }

    (dme dme1)
    {
        a = dme1;
        super();
    }
}
