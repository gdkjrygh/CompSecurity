// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;


// Referenced classes of package org.chromium.content.browser:
//            ChildProcessConnection

public interface BindingManager
{

    public abstract void addNewConnection(int i, ChildProcessConnection childprocessconnection);

    public abstract void clearConnection(int i);

    public abstract boolean isOomProtected(int i);

    public abstract void onBroughtToForeground();

    public abstract void onSentToBackground();

    public abstract void setInForeground(int i, boolean flag);
}
