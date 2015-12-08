// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc;

import android.os.Process;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.net.Socket;
import org.xbmc.kore.utils.LogUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc:
//            HostConnection, ApiException

class val.socket
    implements Runnable
{

    final HostConnection this$0;
    final Socket val$socket;

    public void run()
    {
        Process.setThreadPriority(10);
        com.fasterxml.jackson.core.JsonParser jsonparser;
        LogUtils.LOGD(HostConnection.TAG, "Starting socket listener thread...");
        jsonparser = HostConnection.access$400(HostConnection.this).getFactory().createParser(val$socket.getInputStream());
_L1:
        ObjectNode objectnode = (ObjectNode)HostConnection.access$400(HostConnection.this).readTree(jsonparser);
        if (objectnode == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        LogUtils.LOGD(HostConnection.TAG, (new StringBuilder()).append("Read from socket: ").append(objectnode.toString()).toString());
        HostConnection.access$500(HostConnection.this, objectnode);
          goto _L1
        Object obj;
        obj;
        LogUtils.LOGW(HostConnection.TAG, "Got an exception while parsing JSON response.", ((Throwable) (obj)));
        HostConnection.access$600(HostConnection.this, null, new ApiException(0, ((Exception) (obj))));
        return;
        obj;
        LogUtils.LOGW(HostConnection.TAG, "Error reading from socket.", ((Throwable) (obj)));
        disconnect();
        HostConnection.access$600(HostConnection.this, null, new ApiException(3, ((Exception) (obj))));
        return;
    }

    ngException()
    {
        this$0 = final_hostconnection;
        val$socket = Socket.this;
        super();
    }
}
