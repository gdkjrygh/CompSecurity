// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.messaging;

import java.util.HashMap;

public class MessagingSmsConstMaps
{

    public static final HashMap smsDeliveryStatusDictS2I;
    public static final HashMap smsDiliveryStatusDictI2S;
    public static final HashMap smsStateDictI2S;
    public static final HashMap smsStateDictS2I;
    public static final HashMap smsTableColumnDict;
    public static final HashMap sortOrderDict;

    public MessagingSmsConstMaps()
    {
    }

    static 
    {
        smsTableColumnDict = new HashMap();
        smsDeliveryStatusDictS2I = new HashMap();
        smsDiliveryStatusDictI2S = new HashMap();
        smsStateDictI2S = new HashMap();
        smsStateDictS2I = new HashMap();
        sortOrderDict = new HashMap();
        smsTableColumnDict.put("id", "_id");
        smsTableColumnDict.put("date", "date");
        smsTableColumnDict.put("from", "address");
        smsTableColumnDict.put("state", "status");
        smsTableColumnDict.put("error", "read");
        smsDeliveryStatusDictS2I.put("success", Integer.valueOf(-1));
        smsDeliveryStatusDictS2I.put("pending", Integer.valueOf(64));
        smsDeliveryStatusDictS2I.put("success", Integer.valueOf(0));
        smsDeliveryStatusDictS2I.put("error", Integer.valueOf(128));
        smsDiliveryStatusDictI2S.put(Integer.valueOf(-1), "success");
        smsDiliveryStatusDictI2S.put(Integer.valueOf(64), "pending");
        smsDiliveryStatusDictI2S.put(Integer.valueOf(0), "success");
        smsDiliveryStatusDictI2S.put(Integer.valueOf(128), "error");
        smsStateDictI2S.put(Integer.valueOf(1), "received");
        smsStateDictI2S.put(Integer.valueOf(3), "draft");
        smsStateDictI2S.put(Integer.valueOf(4), "sending");
        smsStateDictI2S.put(Integer.valueOf(6), "sending");
        smsStateDictI2S.put(Integer.valueOf(2), "sent");
        smsStateDictI2S.put(Integer.valueOf(5), "failed");
        smsStateDictS2I.put("received", Integer.valueOf(1));
        smsStateDictS2I.put("draft", Integer.valueOf(3));
        smsStateDictS2I.put("sending", Integer.valueOf(4));
        smsStateDictS2I.put("sent", Integer.valueOf(2));
        smsStateDictS2I.put("failed", Integer.valueOf(5));
        sortOrderDict.put("ascending", "ASC");
        sortOrderDict.put("descending", "DESC");
    }
}
