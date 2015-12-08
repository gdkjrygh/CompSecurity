// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import org.json.JSONObject;

public final class dva
{

    public final boolean a;
    public final boolean b;

    public dva(Bundle bundle)
    {
        if (bundle == null)
        {
            a = false;
            b = false;
            return;
        } else
        {
            a = bundle.getBoolean("with_radio", false);
            b = bundle.getBoolean("shuffle_restricted", false);
            return;
        }
    }

    public dva(JSONObject jsonobject)
    {
        ctz.a(jsonobject);
        a = jsonobject.getBoolean("dmca-radio");
        b = jsonobject.optBoolean("shuffle-restricted");
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (dva)obj;
            if (a != ((dva) (obj)).a)
            {
                return false;
            }
            if (b != ((dva) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = 1;
        int i;
        if (a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!b)
        {
            j = 0;
        }
        return i * 31 + j;
    }
}
