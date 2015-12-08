// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.View;
import org.xbmc.kore.eventclient.EventServerConnection;
import org.xbmc.kore.eventclient.Packet;

// Referenced classes of package org.xbmc.kore.ui:
//            RemoteFragment

class val.packet
    implements android.view.ner
{

    final RemoteFragment this$0;
    final Packet val$packet;

    public void onClick(View view)
    {
        RemoteFragment.access$300(RemoteFragment.this).sendPacket(val$packet);
    }

    verConnection()
    {
        this$0 = final_remotefragment;
        val$packet = Packet.this;
        super();
    }
}
