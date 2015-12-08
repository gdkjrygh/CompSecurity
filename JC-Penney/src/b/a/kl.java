// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package b.a:
//            eu

public final class kl
{

    public boolean a;
    public boolean b;
    public boolean c;
    public int d;

    public kl(Context context)
    {
        a = false;
        b = false;
        c = false;
        d = 10;
        if (a(context).exists())
        {
            c = true;
        }
    }

    public kl(JSONObject jsonobject)
    {
        a = false;
        b = false;
        c = false;
        d = 10;
        if (!jsonobject.has("net"))
        {
            return;
        }
        try
        {
            jsonobject = jsonobject.getJSONObject("net");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return;
        }
        a = jsonobject.optBoolean("enabled", false);
        b = jsonobject.optBoolean("persist", false);
        c = jsonobject.optBoolean("kill", false);
        d = jsonobject.optInt("interval", 10);
    }

    public static File a(Context context)
    {
        return new File((new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append("/.crittercism.apm.disabled.").toString());
    }

    public static void b(Context context)
    {
        try
        {
            a(context).createNewFile();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            eu.b((new StringBuilder("Unable to kill APM: ")).append(context.getMessage()).toString());
        }
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof kl))
            {
                return false;
            }
            obj = (kl)obj;
            if (c != ((kl) (obj)).c)
            {
                return false;
            }
            if (a != ((kl) (obj)).a)
            {
                return false;
            }
            if (b != ((kl) (obj)).b)
            {
                return false;
            }
            if (d != ((kl) (obj)).d)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        char c3 = '\u04CF';
        char c1;
        char c2;
        if (c)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        if (a)
        {
            c2 = '\u04CF';
        } else
        {
            c2 = '\u04D5';
        }
        if (!b)
        {
            c3 = '\u04D5';
        }
        return ((c2 + (c1 + 31) * 31) * 31 + c3) * 31 + d;
    }

    public final String toString()
    {
        return (new StringBuilder("OptmzConfiguration [\nisSendTaskEnabled=")).append(a).append("\n, shouldPersist=").append(b).append("\n, isKilled=").append(c).append("\n, statisticsSendInterval=").append(d).append("]").toString();
    }
}
