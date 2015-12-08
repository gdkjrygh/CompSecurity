// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import org.json.JSONObject;

final class nvk
    implements lxi
{

    private JSONObject a;

    nvk(nvi nvi, JSONObject jsonobject)
    {
        a = jsonobject;
        super();
    }

    public final void a(Object obj)
    {
        if (!((Boolean)obj).booleanValue())
        {
            obj = String.valueOf(a.toString());
            if (((String) (obj)).length() != 0)
            {
                obj = "Message was not sent : ".concat(((String) (obj)));
            } else
            {
                obj = new String("Message was not sent : ");
            }
            Log.w("RemoteMediaController", ((String) (obj)));
        }
    }
}
