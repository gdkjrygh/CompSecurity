// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.util.Locale;

public final class ggo extends ggl
{

    private String d;

    protected ggo(Context context, Verified verified)
    {
        this(context, verified, "");
    }

    protected ggo(Context context, Verified verified, String s)
    {
        super(context, verified);
        d = s;
    }

    protected final void a(long l)
    {
        Object obj1 = (gcz)dmz.a(gcz);
        Object obj = gcz.h();
        obj = String.format(Locale.US, "Android OS %s API %d (%s, %s, %.1f)", new Object[] {
            android.os.Build.VERSION.RELEASE, Integer.valueOf(gcz.a()), ((gda) (obj)).d, ((gda) (obj)).b, Double.valueOf(((gcz) (obj1)).d())
        });
        obj1 = ((gcz) (obj1)).f();
        Locale locale = Locale.US;
        Verified verified = c();
        String s = d;
        dmz.a(com/spotify/mobile/android/util/ClientInfo);
        gdu.a(String.format(locale, "%s\t%d\t%s\t%d\t%s\t%s\t%s\t%s\t", new Object[] {
            "ViewExternal", Integer.valueOf(1), verified, Long.valueOf(l), s, obj, Integer.valueOf(0x1908b3e3), obj1
        }));
    }
}
