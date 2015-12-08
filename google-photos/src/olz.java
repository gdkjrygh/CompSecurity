// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

public class olz extends opx
    implements olp
{

    public final olm a = new olm();
    private opi c;

    public olz()
    {
    }

    static ool a(olz olz1)
    {
        return olz1.b;
    }

    public final olm ai_()
    {
        return a;
    }

    protected void onCreate(Bundle bundle)
    {
        olm olm1 = olm.b(getApplicationContext());
        a.a(this);
        a.a = olm1;
        a.a(new omi(this, b));
        for (Iterator iterator = a.c(omm).iterator(); iterator.hasNext(); ((omm)iterator.next()).a(this, b)) { }
        a.a();
        c = b.a(new oma(this, bundle));
        super.onCreate(bundle);
    }

    protected void onDestroy()
    {
        b.b(c);
        super.onDestroy();
    }
}
