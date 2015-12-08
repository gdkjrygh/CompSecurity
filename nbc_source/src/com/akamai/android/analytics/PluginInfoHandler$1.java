// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;


// Referenced classes of package com.akamai.android.analytics:
//            PluginInfoHandler

class this._cls0
    implements serEventListener
{

    final PluginInfoHandler this$0;

    public void event(_EVENT _pevent, String s)
    {
        boolean flag = false;
        Object obj;
        PluginInfoHandler plugininfohandler;
        try
        {
            if (_pevent == _EVENT.DEBUG)
            {
                sendEvent(_pevent, s);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (_EVENT _pevent)
        {
            return;
        }
        obj = PluginInfoHandler.staticFieldLock;
        obj;
        JVM INSTR monitorenter ;
        plugininfohandler = PluginInfoHandler.this;
        if (_pevent == _EVENT.XML_LOADED)
        {
            flag = true;
        }
        plugininfohandler.updateXMLStatus(false, flag);
        if (PluginInfoHandler.access$0(PluginInfoHandler.this))
        {
            updateStaticVariables(PluginInfoHandler.configXMLCache, PluginInfoHandler.plugInfoCache, PluginInfoHandler.usageCountCache, PluginInfoHandler.access$1(PluginInfoHandler.this), PluginInfoHandler.access$2(PluginInfoHandler.this), PluginInfoHandler.lastModifiedTimeofConfigCache);
        }
        sendEvent(_pevent, s);
        obj;
        JVM INSTR monitorexit ;
        return;
        _pevent;
        obj;
        JVM INSTR monitorexit ;
        throw _pevent;
    }

    _EVENT()
    {
        this$0 = PluginInfoHandler.this;
        super();
    }
}
