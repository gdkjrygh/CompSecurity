// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import org.xwalk.core.internal.extensions.XWalkExtensionAndroid;

public abstract class XWalkExtensionInternal extends XWalkExtensionAndroid
{

    public XWalkExtensionInternal(String s, String s1)
    {
        super(s, s1);
    }

    public XWalkExtensionInternal(String s, String s1, String as[])
    {
        super(s, s1, as);
    }

    public void broadcastMessage(String s)
    {
        super.broadcastMessage(s);
    }

    protected void destroyExtension()
    {
        super.destroyExtension();
    }

    public abstract void onMessage(int i, String s);

    public abstract String onSyncMessage(int i, String s);

    public void postMessage(int i, String s)
    {
        super.postMessage(i, s);
    }
}
