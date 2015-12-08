// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.video.drm.DrmException;
import com.spotify.mobile.android.video.exo.NoSuitableRepresentationException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class gkt
    implements dmx
{

    public gkt()
    {
    }

    public static gkr a(bat bat1, Looper looper, Handler handler, gks gks, bbn bbn)
    {
        if (bat1.e.isEmpty())
        {
            throw new NoSuitableRepresentationException(0);
        }
        bat1 = (baw)bat1.e.get(0);
        int i = bat1.a(0);
        if (i == -1)
        {
            throw new NoSuitableRepresentationException(1);
        }
        bat1 = (baq)((baw) (bat1)).a.get(i);
        if (!bat1.a()) goto _L2; else goto _L1
_L1:
        Iterator iterator = ((baq) (bat1)).c.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Object obj;
        obj = (bar)iterator.next();
        bat1 = a(((bar) (obj)).a);
        if (!gkv.a.contains(bat1)) goto _L6; else goto _L5
_L5:
        byte abyte0[] = ((bar) (obj)).c;
_L9:
        obj = bat1;
        if (bat1 == null)
        {
            throw new DrmException(1);
        }
          goto _L7
_L2:
        abyte0 = null;
        obj = null;
_L7:
        if (obj != null)
        {
            if (gcl.b)
            {
                throw new DrmException(2);
            }
            bat1 = gku.a(((UUID) (obj)), abyte0, looper, handler, bbn, gks);
            if (!"L3".equals(bat1.b("securityLevel")))
            {
                bat1.a("securityLevel", "L3");
            }
            return bat1;
        } else
        {
            return null;
        }
_L4:
        abyte0 = null;
        bat1 = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static UUID a(String s)
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            if (s.startsWith("urn:uuid:"))
            {
                return UUID.fromString(s.substring(9));
            }
            s = UUID.fromString(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.b(s, "Unable to parse uuid", new Object[0]);
            return null;
        }
        return s;
    }
}
