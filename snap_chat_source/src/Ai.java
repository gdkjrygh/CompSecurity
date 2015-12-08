// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;

public final class Ai
    implements Ch.a
{

    private final JY a;
    private final Ao b;

    public Ai(JY jy, Ao ao)
    {
        a = (JY)dv.a(jy);
        b = (Ao)dv.a(ao);
    }

    public final void a(Cj cj)
    {
        b.a(cj.i, false);
    }

    public final void a(Cj cj, Pc pc, pi pi1)
    {
        if (pi1 == null)
        {
            Timber.c("ResourceDownloadHandler", "NetworkResult is null", new Object[0]);
            b.a(cj.i, false);
            return;
        }
        if (!pi1.c())
        {
            Timber.c("ResourceDownloadHandler", "NetworkResult was unsuccessful", new Object[0]);
            b.a(cj.i, false);
            return;
        }
        if (pc == null || pc.mSize <= 0)
        {
            Timber.c("ResourceDownloadHandler", "Buffer is null or empty", new Object[0]);
            b.a(cj.i, false);
            return;
        }
        cj = cj.i;
        try
        {
            a.a(cj, pc.mBuffer, pc.mSize);
        }
        // Misplaced declaration of an exception variable
        catch (Pc pc)
        {
            Timber.a("ResourceDownloadHandler", pc);
            b.a(cj, false);
            return;
        }
        b.a(cj, true);
    }
}
