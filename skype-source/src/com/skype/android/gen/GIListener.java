// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.GI;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;

public class GIListener
    implements com.skype.GI.GIIListener
{
    public static class OnConnStatusChange
    {

        private com.skype.GI.CONNSTATUS _connStatus;
        private GI _sender;

        public com.skype.GI.CONNSTATUS getConnStatus()
        {
            return _connStatus;
        }

        public GI getSender()
        {
            return _sender;
        }

        public OnConnStatusChange(GI gi, com.skype.GI.CONNSTATUS connstatus)
        {
            _sender = gi;
            _connStatus = connstatus;
        }
    }

    public static class OnFileError
    {

        private com.skype.GI.FILEERROR _error;
        private GI _sender;

        public com.skype.GI.FILEERROR getError()
        {
            return _error;
        }

        public GI getSender()
        {
            return _sender;
        }

        public OnFileError(GI gi, com.skype.GI.FILEERROR fileerror)
        {
            _sender = gi;
            _error = fileerror;
        }
    }

    public static class OnLibStatusChange
    {

        private com.skype.GI.LIBSTATUS _newStatus;
        private GI _sender;

        public com.skype.GI.LIBSTATUS getNewStatus()
        {
            return _newStatus;
        }

        public GI getSender()
        {
            return _sender;
        }

        public OnLibStatusChange(GI gi, com.skype.GI.LIBSTATUS libstatus)
        {
            _sender = gi;
            _newStatus = libstatus;
        }
    }

    public static class OnNodeinfoChange
    {

        private byte _nodeinfo[];
        private GI _sender;

        public byte[] getNodeinfo()
        {
            return _nodeinfo;
        }

        public GI getSender()
        {
            return _sender;
        }

        public OnNodeinfoChange(GI gi, byte abyte0[])
        {
            _sender = gi;
            _nodeinfo = abyte0;
        }
    }

    public static class OnProxyAuthenticationFailure
    {

        private com.skype.GI.PROXYTYPE _proxyType;
        private GI _sender;

        public com.skype.GI.PROXYTYPE getProxyType()
        {
            return _proxyType;
        }

        public GI getSender()
        {
            return _sender;
        }

        public OnProxyAuthenticationFailure(GI gi, com.skype.GI.PROXYTYPE proxytype)
        {
            _sender = gi;
            _proxyType = proxytype;
        }
    }


    EventBus eventBus;

    public GIListener()
    {
        eventBus = EventBusInstance.a();
    }

    public void onConnStatusChange(GI gi, com.skype.GI.CONNSTATUS connstatus)
    {
        gi = new OnConnStatusChange(gi, connstatus);
        eventBus.a(gi);
    }

    public void onFileError(GI gi, com.skype.GI.FILEERROR fileerror)
    {
        gi = new OnFileError(gi, fileerror);
        eventBus.a(gi);
    }

    public void onLibStatusChange(GI gi, com.skype.GI.LIBSTATUS libstatus)
    {
        gi = new OnLibStatusChange(gi, libstatus);
        eventBus.a(gi);
    }

    public void onNodeinfoChange(GI gi, byte abyte0[])
    {
        gi = new OnNodeinfoChange(gi, abyte0);
        eventBus.a(gi);
    }

    public void onProxyAuthenticationFailure(GI gi, com.skype.GI.PROXYTYPE proxytype)
    {
        gi = new OnProxyAuthenticationFailure(gi, proxytype);
        eventBus.a(gi);
    }
}
