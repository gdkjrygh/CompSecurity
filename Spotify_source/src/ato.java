// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.exception.SyncException;
import com.ford.syncV4.exception.SyncExceptionCause;
import com.ford.syncV4.proxy.rpc.enums.Language;
import com.ford.syncV4.proxy.rpc.enums.SyncDisconnectedReason;
import java.util.Vector;

public final class ato extends atp
{

    public ato(atv atv, String s, Vector vector, Vector vector1, Boolean boolean1, Language language, Language language1, 
            String s1)
    {
        super(atv, s, vector, vector1, boolean1, language, language1, s1, new axk());
        axg.a("Application constructed SyncProxyALM (using legacy constructor for BT transport) instance passing in: IProxyListener, syncProxyConfigurationResources, appName, ngnMediaScreenAppName, vrSynonyms, isMediaApp, syncMsgVersion, languageDesired, autoActivateID, callbackToUIThread and version", "42baba60-eb57-11df-98cf-0800200c9a66");
    }

    public final void a()
    {
        SyncDisconnectedReason syncdisconnectedreason = SyncDisconnectedReason.b;
        super.g();
    }

    public final String b()
    {
        if (f.booleanValue())
        {
            throw new SyncException("This object has been disposed, it is no long capable of executing methods.", SyncExceptionCause.k);
        } else
        {
            return "2.3";
        }
    }

    public final auo c()
    {
        if (f.booleanValue())
        {
            throw new SyncException("This object has been disposed, it is no long capable of executing methods.", SyncExceptionCause.k);
        }
        if (!e.booleanValue())
        {
            throw new SyncException("SYNC is unavailable. Unable to get the displayCapabilities.", SyncExceptionCause.m);
        } else
        {
            return i;
        }
    }

    public final Language d()
    {
        if (f.booleanValue())
        {
            throw new SyncException("This object has been disposed, it is no long capable of executing methods.", SyncExceptionCause.k);
        }
        if (!e.booleanValue())
        {
            throw new SyncException("SYNC is unavailable. Unable to get the syncLanguage.", SyncExceptionCause.m);
        } else
        {
            return h;
        }
    }

    public final awq e()
    {
        if (f.booleanValue())
        {
            throw new SyncException("This object has been disposed, it is no long capable of executing methods.", SyncExceptionCause.k);
        }
        if (!e.booleanValue())
        {
            throw new SyncException("SYNC is unavailable. Unable to get the syncMsgVersion.", SyncExceptionCause.m);
        } else
        {
            return g;
        }
    }

    public final awy f()
    {
        if (f.booleanValue())
        {
            throw new SyncException("This object has been disposed, it is no long capable of executing methods.", SyncExceptionCause.k);
        }
        if (!e.booleanValue())
        {
            throw new SyncException("SYNC is not connected. Unable to get the vehicleType.", SyncExceptionCause.m);
        } else
        {
            return j;
        }
    }
}
