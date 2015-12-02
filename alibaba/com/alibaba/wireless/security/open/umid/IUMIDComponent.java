// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.wireless.security.open.umid;

import com.alibaba.wireless.security.open.IComponent;
import com.alibaba.wireless.security.open.SecException;

// Referenced classes of package com.alibaba.wireless.security.open.umid:
//            IUMIDInitListenerEx, IUMIDInitListener

public interface IUMIDComponent
    extends IComponent
{

    public static final int ENVIRONMENT_DAILY = 1;
    public static final int ENVIRONMENT_ONLINE = 0;
    public static final int ENVIRONMENT_PRE = 2;

    public abstract String getSecurityToken()
        throws SecException;

    public abstract void initUMID(String s, int i, String s1, IUMIDInitListenerEx iumidinitlistenerex)
        throws SecException;

    public abstract void registerInitListener(IUMIDInitListener iumidinitlistener)
        throws SecException;
}
