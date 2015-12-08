// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.transport.Transport;

// Referenced classes of package com.netflix.mediaclient.javabridge.invoke:
//            Invoke

public abstract class BaseInvoke
    implements Invoke
{

    protected static final String TAG = "nf_invoke";
    protected String arguments;
    protected String method;
    protected String path;
    protected String target;

    public BaseInvoke(String s, String s1)
    {
        arguments = "{}";
        if (s == null)
        {
            throw new IllegalArgumentException("Target can not be null!");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("Method can not be null!");
        }
        target = s;
        method = s1;
        if (s.startsWith("nrdp"))
        {
            Log.d("nf_invoke", "Target is nrdp or somebody is setting whole path to target");
            path = s;
            return;
        } else
        {
            path = (new StringBuilder()).append("nrdp.").append(s).toString();
            return;
        }
    }

    public void execute(Transport transport)
    {
        if (transport == null)
        {
            throw new IllegalArgumentException("Transport is null");
        } else
        {
            transport.invokeMethod(this);
            return;
        }
    }

    public String getArguments()
    {
        return arguments;
    }

    public String getMethod()
    {
        return method;
    }

    public String getObject()
    {
        return path;
    }

    public String getTarget()
    {
        return target;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Invoke [target=").append(target).append(", method=").append(method).append(", arguments=").append(arguments).append("]").toString();
    }
}
