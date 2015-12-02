// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.webrtc;

import com.facebook.debug.log.b;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.webrtc:
//            IWebrtcSignalingMessageInterface, IWebrtcUiInterface, IWebrtcConfigInterface, IWebrtcLoggingInterface

public class WebrtcEngine
{

    private static final Class a = com/facebook/webrtc/WebrtcEngine;
    private static boolean b;
    private static boolean c;
    private long nativeEngine;

    public WebrtcEngine(IWebrtcSignalingMessageInterface iwebrtcsignalingmessageinterface, IWebrtcUiInterface iwebrtcuiinterface, IWebrtcConfigInterface iwebrtcconfiginterface, IWebrtcLoggingInterface iwebrtclogginginterface)
    {
        Preconditions.checkNotNull(iwebrtcsignalingmessageinterface);
        Preconditions.checkNotNull(iwebrtcconfiginterface);
        Preconditions.checkNotNull(iwebrtcuiinterface);
        Preconditions.checkNotNull(iwebrtclogginginterface);
        if (e())
        {
            createEngineNative(iwebrtcsignalingmessageinterface, iwebrtcuiinterface, iwebrtcconfiginterface, iwebrtclogginginterface);
            com.facebook.debug.log.b.c(a, (new StringBuilder()).append("Loaded webrtc engine. id = ").append(Long.toString(nativeEngine)).toString());
        }
    }

    private native void acceptCallNative();

    private native void createEngineNative(IWebrtcSignalingMessageInterface iwebrtcsignalingmessageinterface, IWebrtcUiInterface iwebrtcuiinterface, IWebrtcConfigInterface iwebrtcconfiginterface, IWebrtcLoggingInterface iwebrtclogginginterface);

    private native void destroyEngineNative();

    private native void didShowUiNative();

    private static boolean e()
    {
        if (!b)
        {
            b = true;
            try
            {
                System.loadLibrary("fb_stl_shared");
                System.loadLibrary("fb_webrtc_jni");
                c = true;
            }
            catch (UnsatisfiedLinkError unsatisfiedlinkerror)
            {
                c = false;
                com.facebook.debug.log.b.d(a, "native library not available", unsatisfiedlinkerror);
            }
        }
        return c;
    }

    private native void endCallNative(int i);

    private native void onMessageFromPeerNative(long l, String s);

    private native void onMessageSendErrorNative(long l, int i, String s, String s1);

    private native void onMessageSendSuccessNative(long l);

    private native void setMuteNative(boolean flag);

    private native void startCallNative(long l);

    public void a(int i)
    {
        endCallNative(i);
    }

    public void a(long l)
    {
        startCallNative(l);
    }

    public void a(long l, int i, String s, String s1)
    {
        onMessageSendErrorNative(l, i, s, s1);
    }

    public void a(long l, String s)
    {
        onMessageFromPeerNative(l, s);
    }

    public void a(boolean flag)
    {
        setMuteNative(flag);
    }

    public boolean a()
    {
        return c;
    }

    public void b()
    {
        if (nativeEngine != 0L)
        {
            com.facebook.debug.log.b.c(a, (new StringBuilder()).append("Closing webrtc engine. id = ").append(Long.toString(nativeEngine)).toString());
            destroyEngineNative();
        }
    }

    public void b(long l)
    {
        onMessageSendSuccessNative(l);
    }

    public void c()
    {
        acceptCallNative();
    }

    public void d()
    {
        didShowUiNative();
    }

    protected void finalize()
    {
        b();
    }

}
