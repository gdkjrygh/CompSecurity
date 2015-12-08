// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.operation;

import android.content.res.Resources;
import com.fitbit.FitBitApplication;
import com.fitbit.config.BuildType;
import com.fitbit.config.b;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.savedstate.HardcodedSynclairSavedState;
import com.fitbit.serverinteraction.w;
import com.fitbit.synclair.config.SynclairConfigType;
import com.fitbit.synclair.config.a;
import com.fitbit.synclair.config.bean.DeviceBaseConfigBean;
import com.fitbit.synclair.config.c;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.synclair.operation:
//            d

public class f extends d
{

    private static final String a = "LoadPairingConfigOperation";
    private final TrackerType e;

    public f(TrackerType trackertype)
    {
        e = trackertype;
        a(trackertype, SynclairConfigType.a);
    }

    private static JSONObject a(com.fitbit.savedstate.HardcodedSynclairSavedState.SynclairDebugConfigType synclairdebugconfigtype)
        throws JSONException
    {
        InputStream inputstream;
        inputstream = null;
        if (com.fitbit.savedstate.HardcodedSynclairSavedState.SynclairDebugConfigType.b == synclairdebugconfigtype)
        {
            inputstream = FitBitApplication.a().getResources().openRawResource(0x7f070003);
        }
        byte abyte0[] = new byte[0];
        synclairdebugconfigtype = abyte0;
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        synclairdebugconfigtype = abyte0;
        byte abyte1[] = new byte[inputstream.available()];
        synclairdebugconfigtype = abyte1;
        inputstream.read(abyte1);
        synclairdebugconfigtype = abyte1;
        inputstream.close();
        synclairdebugconfigtype = abyte1;
_L2:
        return new JSONObject(new String(synclairdebugconfigtype));
        IOException ioexception;
        ioexception;
        ioexception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected a a(JSONObject jsonobject)
    {
        return new c(jsonobject, r(), t());
    }

    protected List a(DeviceBaseConfigBean devicebaseconfigbean, boolean flag)
    {
        com.fitbit.savedstate.HardcodedSynclairSavedState.SynclairDebugConfigType synclairdebugconfigtype = HardcodedSynclairSavedState.h();
        if (com.fitbit.savedstate.HardcodedSynclairSavedState.SynclairDebugConfigType.a != synclairdebugconfigtype && BuildType.e == b.a)
        {
            return null;
        } else
        {
            return super.a(devicebaseconfigbean, flag);
        }
    }

    protected String p()
    {
        return "LoadPairingConfigOperation";
    }

    protected JSONObject q()
        throws ServerCommunicationException, JSONException
    {
        com.fitbit.savedstate.HardcodedSynclairSavedState.SynclairDebugConfigType synclairdebugconfigtype = HardcodedSynclairSavedState.h();
        if (com.fitbit.savedstate.HardcodedSynclairSavedState.SynclairDebugConfigType.a != synclairdebugconfigtype && BuildType.e == b.a)
        {
            return a(synclairdebugconfigtype);
        } else
        {
            return w.a().a(e, SynclairConfigType.a);
        }
    }
}
