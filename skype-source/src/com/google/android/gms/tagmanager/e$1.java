// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.ads.a.a;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            e, ak

final class a
    implements a
{

    final e a;

    public final com.google.android.gms.ads.a..e._cls1 a()
    {
        com.google.android.gms.ads.a..e e1;
        try
        {
            e1 = com.google.android.gms.ads.a.a.a(com.google.android.gms.tagmanager.e.a(a));
        }
        catch (IllegalStateException illegalstateexception)
        {
            ak.b("IllegalStateException getting Advertising Id Info");
            return null;
        }
        catch (d d1)
        {
            ak.b("GooglePlayServicesRepairableException getting Advertising Id Info");
            return null;
        }
        catch (IOException ioexception)
        {
            ak.b("IOException getting Ad Id Info");
            return null;
        }
        catch (c c1)
        {
            ak.b("GooglePlayServicesNotAvailableException getting Advertising Id Info");
            return null;
        }
        catch (Exception exception)
        {
            ak.b("Unknown exception. Could not get the Advertising Id Info.");
            return null;
        }
        return e1;
    }

    (e e1)
    {
        a = e1;
        super();
    }
}
