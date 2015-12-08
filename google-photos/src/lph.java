// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

final class lph
    implements lpj
{

    private lpg a;

    lph(lpg lpg1)
    {
        a = lpg1;
        super();
    }

    public final jnx a()
    {
        jnx jnx;
        try
        {
            jnx = jnw.a(lpg.a(a));
        }
        catch (IllegalStateException illegalstateexception)
        {
            lqh.b("IllegalStateException getting Advertising Id Info");
            return null;
        }
        catch (jyb jyb1)
        {
            lqh.b("GooglePlayServicesRepairableException getting Advertising Id Info");
            return null;
        }
        catch (IOException ioexception)
        {
            lqh.b("IOException getting Ad Id Info");
            return null;
        }
        catch (jya jya1)
        {
            lqh.b("GooglePlayServicesNotAvailableException getting Advertising Id Info");
            return null;
        }
        catch (Exception exception)
        {
            lqh.b("Unknown exception. Could not get the Advertising Id Info.");
            return null;
        }
        return jnx;
    }
}
