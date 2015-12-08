// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.cast.LaunchOptions;

final class jul extends juq
{

    private String g;
    private LaunchOptions h;

    jul(juj juj, jyn jyn, String s, LaunchOptions launchoptions)
    {
        g = s;
        h = launchoptions;
        super(jyn);
    }

    protected final void a(jyl jyl)
    {
        jyl = (jwh)jyl;
        try
        {
            String s = g;
            LaunchOptions launchoptions = h;
            jyl.a(this);
            ((jwr)jyl.o()).a(s, launchoptions);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (jyl jyl)
        {
            a(2001);
        }
    }
}
