// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONObject;

public final class chz
    implements chx
{

    private final boolean a;
    private final boolean b;

    public chz(boolean flag, boolean flag1)
    {
        a = flag;
        b = flag1;
    }

    public final bhh a(chw chw1, JSONObject jsonobject)
    {
        Object obj = chw1.a(jsonobject, "images", true, a, b);
        ckk ckk1 = chw1.a(jsonobject, "app_icon", true, a);
        chw1 = chw1.a(jsonobject);
        ArrayList arraylist = new ArrayList();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(((ckk)((Iterator) (obj)).next()).get())) { }
        return new bhc(jsonobject.getString("headline"), arraylist, jsonobject.getString("body"), (cbs)ckk1.get(), jsonobject.getString("call_to_action"), jsonobject.optDouble("rating", -1D), jsonobject.optString("store"), jsonobject.optString("price"), (bgz)chw1.get(), new Bundle());
    }
}
