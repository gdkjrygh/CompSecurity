// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class eug
{

    private static final String a;
    private final Context b;

    public eug(Context context)
    {
        b = context;
    }

    public final void a(String s, String s1, int i, String s2, String s3)
    {
        s = new dnm(s, a, s1, i, s2, s3, gcf.a());
        fop.a(b, s);
    }

    public final void a(String s, String s1, int i, String s2, String s3, String s4)
    {
        s = new dno(s, a, s1, i, s2, s3, s4, gcf.a());
        fop.a(b, s);
    }

    static 
    {
        a = FeatureIdentifier.E.a();
    }
}
