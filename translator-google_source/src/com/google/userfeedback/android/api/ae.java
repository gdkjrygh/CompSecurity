// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.os.AsyncTask;

// Referenced classes of package com.google.userfeedback.android.api:
//            ad, z, af

final class ae extends AsyncTask
{

    final z a;
    final af b = null;
    final ad c;

    ae(ad ad1, z z)
    {
        c = ad1;
        a = z;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        ad.a(c, a);
        return null;
    }
}
