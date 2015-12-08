// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gal extends ogq
{

    private static final ekk b = (new ekm()).a(hpe).a();
    private final Context c;
    private final ekq d;
    private final noz e;

    public gal(Context context, msp msp, ekq ekq1)
    {
        super(msp);
        p.a(ekq1);
        c = context.getApplicationContext();
        d = ekq1;
        e = noz.a(context, 3, "PhotosDeferredVEs", new String[0]);
    }

    private ogu b(msp msp)
    {
        try
        {
            msp = new ogu(msp, new String[] {
                ((hpe)((ekq)b.b(c, d).a(d, b).a()).a(hpe)).a.a
            });
        }
        // Misplaced declaration of an exception variable
        catch (msp msp)
        {
            if (e.a())
            {
                b.a(d);
            }
            throw new IllegalStateException("Error resolving media collection in VE", msp);
        }
        return msp;
    }

    protected final msm a(msp msp)
    {
        return b(msp);
    }

}
