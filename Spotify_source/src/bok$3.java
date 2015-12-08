// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.cast.JoinOptions;

final class nit> extends bop
{

    private String a;

    protected final void a(bqr bqr)
    {
        bqr = (bpm)bqr;
        try
        {
            String s = a;
            bqr.a(this);
            JoinOptions joinoptions = new JoinOptions();
            ((bps)bqr.p()).a(s, null, joinoptions);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (bqr bqr)
        {
            a();
        }
    }

    (bqu bqu, String s)
    {
        a = s;
        super(bqu);
    }
}
