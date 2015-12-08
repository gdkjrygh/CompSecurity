// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.proxy.rpc.enums.AudioStreamingState;
import com.ford.syncV4.proxy.rpc.enums.HMILevel;
import com.ford.syncV4.proxy.rpc.enums.SystemContext;
import java.util.Hashtable;

public final class avd extends atj
{

    public Boolean f;

    public avd()
    {
        super("OnHMIStatus");
    }

    public avd(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final HMILevel c()
    {
        Object obj = b.get("hmiLevel");
        if (obj instanceof HMILevel)
        {
            return (HMILevel)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = HMILevel.a((String)obj);
            }
            catch (Exception exception)
            {
                axt.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".hmiLevel").toString(), exception);
                return null;
            }
            return ((HMILevel) (obj));
        } else
        {
            return null;
        }
    }

    public final AudioStreamingState d()
    {
        Object obj = b.get("audioStreamingState");
        if (obj instanceof AudioStreamingState)
        {
            return (AudioStreamingState)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = AudioStreamingState.a((String)obj);
            }
            catch (Exception exception)
            {
                axt.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".audioStreamingState").toString(), exception);
                return null;
            }
            return ((AudioStreamingState) (obj));
        } else
        {
            return null;
        }
    }

    public final SystemContext e()
    {
        Object obj = b.get("systemContext");
        if (obj instanceof SystemContext)
        {
            return (SystemContext)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = SystemContext.a((String)obj);
            }
            catch (Exception exception)
            {
                axt.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".systemContext").toString(), exception);
                return null;
            }
            return ((SystemContext) (obj));
        } else
        {
            return null;
        }
    }
}
