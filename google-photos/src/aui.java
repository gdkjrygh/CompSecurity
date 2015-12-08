// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class aui
    implements atm
{

    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "file", "android.resource", "content"
    })));
    private final Context b;
    private final auk c;

    public aui(Context context, auk auk1)
    {
        b = context;
        c = auk1;
    }

    public final atn a(Object obj, int i, int j, ani ani)
    {
        obj = (Uri)obj;
        return new atn(new azw(obj), c.a(b, ((Uri) (obj))));
    }

    public final boolean a(Object obj)
    {
        obj = (Uri)obj;
        return a.contains(((Uri) (obj)).getScheme());
    }

}
