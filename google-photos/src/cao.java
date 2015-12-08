// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public class cao extends mtf
{

    private static String a = cao.getSimpleName();
    private final bxp b;
    private final pye c;
    private final String j;
    private final String k;

    public cao(bxp bxp1, pye pye1, String s, String s1)
    {
        super(a);
        b = (bxp)b.a(bxp1, "storyboardCache", null);
        c = (pye)b.a(pye1, "newStoryboard", null);
        j = (String)b.a(s, "lastVersionId", null);
        k = (String)b.a(s1, "mediaKey", null);
    }

    protected final mue a(Context context)
    {
        context = cam.a(k, j, c);
        return new mue(b.a(context));
    }

}
