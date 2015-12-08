// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.service;

import android.content.ContentResolver;
import android.os.Bundle;
import android.os.Handler;
import org.xbmc.kore.jsonrpc.HostConnection;

// Referenced classes of package org.xbmc.kore.service:
//            LibrarySyncService

private static interface strator
{

    public abstract String getDescription();

    public abstract Bundle getSyncExtras();

    public abstract String getSyncType();

    public abstract void sync(strator strator, HostConnection hostconnection, Handler handler, ContentResolver contentresolver);
}
