// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.formats.a;
import com.google.android.gms.ads.internal.formats.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            fh, ha, bk

public final class fj
    implements fh.a
{

    private final boolean a;
    private final boolean b;

    public fj(boolean flag, boolean flag1)
    {
        a = flag;
        b = flag1;
    }

    public final com.google.android.gms.ads.internal.formats.h.a a(fh fh1, JSONObject jsonobject)
        throws JSONException, InterruptedException, ExecutionException
    {
        Object obj = fh1.b(jsonobject, "images", a, b);
        ha ha1 = fh1.a(jsonobject, "secondary_image", false, a);
        fh1 = fh1.a(jsonobject);
        ArrayList arraylist = new ArrayList();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(((ha)((Iterator) (obj)).next()).get())) { }
        return new e(jsonobject.getString("headline"), arraylist, jsonobject.getString("body"), (bk)ha1.get(), jsonobject.getString("call_to_action"), jsonobject.getString("advertiser"), (a)fh1.get(), new Bundle());
    }
}
