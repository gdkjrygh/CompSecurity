// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import java.util.concurrent.Future;
import org.json.JSONObject;

public final class ahk
    implements ahi
{

    public ahk()
    {
    }

    private static acf b(ahh ahh1, JSONObject jsonobject)
    {
        ajw ajw = ahh1.a(jsonobject, "image", true);
        ajw ajw1 = ahh1.a(jsonobject, "app_icon", true);
        ahh1 = ahh1.a(jsonobject);
        return new acf(jsonobject.getString("headline"), (Drawable)ajw.get(), jsonobject.getString("body"), (Drawable)ajw1.get(), jsonobject.getString("call_to_action"), jsonobject.optDouble("rating", -1D), jsonobject.optString("store"), jsonobject.optString("price"), (acd)ahh1.get());
    }

    public final aci a(ahh ahh1, JSONObject jsonobject)
    {
        return b(ahh1, jsonobject);
    }
}
