// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import org.json.JSONObject;

final class 
    implements apq
{

    public final void a(Bundle bundle, String s, Object obj)
    {
        bundle.putString(s, (String)obj);
    }

    public final void a(JSONObject jsonobject, String s, Object obj)
    {
        jsonobject.put(s, obj);
    }

    ()
    {
    }
}
