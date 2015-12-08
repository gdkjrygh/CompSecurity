// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Locale;

public final class ocg
    implements mru
{

    public rar a;

    public ocg()
    {
    }

    public final String a(Context context, mrw mrw1)
    {
        return mrw1.a(context);
    }

    public final void a(Context context)
    {
    }

    public final String toString()
    {
        String s;
        if (a == null)
        {
            s = "";
        } else
        {
            s = a.toString();
        }
        return String.format(Locale.US, "MoviesDataEvent {assetsLoadedEvent: %s}", new Object[] {
            s
        });
    }
}
