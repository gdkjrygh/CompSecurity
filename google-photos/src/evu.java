// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Arrays;
import java.util.List;

final class evu
    implements fad
{

    private final Context a;

    public evu(Context context)
    {
        a = context;
    }

    public final ezz a(fab fab1)
    {
        if (fab1.equals(evt.a))
        {
            fab1 = a;
            return new ezz(fab1, evt.a, new evq(fab1), "TimestampProcessor");
        }
        if (fab1.equals(evt.b))
        {
            fab1 = a;
            return new ezz(fab1, evt.b, new evn(fab1), "AudienceProcessor");
        }
        if (fab1.equals(evt.c))
        {
            return evo.a(a);
        }
        if (fab1.equals(evt.d))
        {
            return evi.a(a);
        }
        if (fab1.equals(evt.e))
        {
            return evl.a(a);
        } else
        {
            fab1 = String.valueOf(fab1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(fab1).length() + 12)).append("unknown id: ").append(fab1).toString());
        }
    }

    public final Object a()
    {
        return "com.google.android.apps.photos.database.processor";
    }

    public final List b()
    {
        return Arrays.asList(new fab[] {
            evt.a, evt.b, evt.c, evt.d, evt.e
        });
    }
}
