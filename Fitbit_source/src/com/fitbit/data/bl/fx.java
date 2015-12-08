// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.net.Uri;
import com.fitbit.config.BuildType;
import com.fitbit.config.b;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.e.a;
import com.fitbit.savedstate.LoadSavedState;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.util.ai;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, bs

public class fx extends e
{

    private static final String a = "UpdateProfilePhotoOperation";
    private static final String b = "UploadProfilePhotoOperation";
    private Uri d;

    public fx(bs bs1, boolean flag, Uri uri)
    {
        super(bs1, flag);
        d = uri;
    }

    public void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        byte abyte0[];
        abyte0 = null;
        a1 = abyte0;
        com.fitbit.e.a.a("UploadProfilePhotoOperation", "%s started", new Object[] {
            this
        });
        a1 = abyte0;
        e().a(true);
        a1 = abyte0;
        if (!b.a.a())
        {
            break MISSING_BLOCK_LABEL_62;
        }
        a1 = abyte0;
        com.fitbit.e.a.a("UploadProfilePhotoOperation", "Uri: %s", new Object[] {
            d
        });
        a1 = abyte0;
        Uri uri = d;
        if (uri == null)
        {
            if (false)
            {
                LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.e, com.fitbit.savedstate.LoadSavedState.Status.b);
            } else
            {
                LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.e, com.fitbit.savedstate.LoadSavedState.Status.c);
            }
            e().a(false);
            return;
        }
        a1 = abyte0;
        abyte0 = ai.a(d);
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        a1 = abyte0;
        com.fitbit.e.a.a("UploadProfilePhotoOperation", "Updating profile photo", new Object[0]);
        a1 = abyte0;
        (new PublicAPI(ServerGateway.a())).a(abyte0);
        if (abyte0 != null)
        {
            LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.e, com.fitbit.savedstate.LoadSavedState.Status.b);
        } else
        {
            LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.e, com.fitbit.savedstate.LoadSavedState.Status.c);
        }
        e().a(false);
        return;
        Exception exception;
        exception;
        if (a1 != null)
        {
            LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.e, com.fitbit.savedstate.LoadSavedState.Status.b);
        } else
        {
            LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.e, com.fitbit.savedstate.LoadSavedState.Status.c);
        }
        e().a(false);
        throw exception;
    }

    public String c()
    {
        return "UpdateProfilePhotoOperation";
    }
}
