// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx.events;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.netflix.mediaclient.ui.mdx.events:
//            UpdateLanguageHandler, UpdateCapabilityHandler, UpdateStateHandler, DialogCancelHandler, 
//            DialogShowHandler, ErrorHandler, UpdateVideoMetadataAvailableHandler, UpdateVideoMetadataHandler, 
//            NotReadyHandler, ReadyHandler, UpdateTargetListHandler, MdxEventHandler

public final class MdxEventHandlerFactory
{

    private Map handlers;

    public MdxEventHandlerFactory()
    {
        handlers = new HashMap();
        handlers.put("com.netflix.mediaclient.intent.action.MDXUPDATE_AUDIOSUB", new UpdateLanguageHandler());
        handlers.put("com.netflix.mediaclient.intent.action.MDXUPDATE_CAPABILITY", new UpdateCapabilityHandler());
        handlers.put("com.netflix.mediaclient.intent.action.MDXUPDATE_STATE", new UpdateStateHandler());
        handlers.put("com.netflix.mediaclient.intent.action.MDXUPDATE_DIALOGCANCEL", new DialogCancelHandler());
        handlers.put("com.netflix.mediaclient.intent.action.MDXUPDATE_DIALOGSHOW", new DialogShowHandler());
        handlers.put("com.netflix.mediaclient.intent.action.MDXUPDATE_ERROR", new ErrorHandler());
        handlers.put("com.netflix.mediaclient.intent.action.MDXUPDATE_MOVIEMETADATA_AVAILABLE", new UpdateVideoMetadataAvailableHandler());
        handlers.put("com.netflix.mediaclient.intent.action.MDXUPDATE_MOVIEMETADA", new UpdateVideoMetadataHandler());
        handlers.put("com.netflix.mediaclient.intent.action.MDXUPDATE_NOTREADY", new NotReadyHandler());
        handlers.put("com.netflix.mediaclient.intent.action.MDXUPDATE_READY", new ReadyHandler());
        handlers.put("com.netflix.mediaclient.intent.action.MDXUPDATE_TARGETLIST", new UpdateTargetListHandler());
    }

    public MdxEventHandler getHandler(String s)
    {
        return (MdxEventHandler)handlers.get(s);
    }
}
