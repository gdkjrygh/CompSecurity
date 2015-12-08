// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.IOException;

class lxq
    implements lxo
{

    private jyn a;
    private jvx b;

    public lxq(lxf lxf)
    {
        a = ((lxu)lxf).a;
        b = new jvx();
        try
        {
            jug.b.a(a, ((jwg) (b.a)).c, b);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (lxf lxf)
        {
            Log.e("BaseGcoreRemoteMediaPlayerImpl", "Error registering with message received callback", lxf);
        }
    }

    public final void a(jvz jvz)
    {
        b.b = new lxr(this, jvz);
    }

    public final boolean a()
    {
        jvu jvu1 = b.a();
        return jvu1.d == 1 && jvu1.e == 1;
    }
}
