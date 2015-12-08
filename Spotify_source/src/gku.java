// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer.drm.UnsupportedDrmException;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.video.drm.DrmException;
import java.util.UUID;

final class gku
{

    static gkr a(UUID uuid, byte abyte0[], Looper looper, Handler handler, bbn bbn, gks gks)
    {
        try
        {
            uuid = new gkr(uuid, looper, bbn, handler, gks, abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (UUID uuid)
        {
            throw new DrmException(1, uuid);
        }
        // Misplaced declaration of an exception variable
        catch (UUID uuid)
        {
            Logger.b(uuid, "Got exception trying to create new session manager", new Object[0]);
            throw new DrmException(-1, uuid);
        }
        return uuid;
    }
}
