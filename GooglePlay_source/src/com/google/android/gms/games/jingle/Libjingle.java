// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.jingle;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import java.lang.ref.WeakReference;

public class Libjingle
{

    public static final String ANDROID_SETTINGS_KEYS_MAP[][] = {
        {
            "gtalk_vc_xmpp_connect_ojid", "XMPP_CONNECT_OJID"
        }, {
            "gtalk_vc_xmpp_hostname", "XMPP_HOSTNAME"
        }, {
            "gtalk_vc_xmpp_port", "XMPP_PORT"
        }, {
            "games.notification_channel", "GAMES_NOTIFICATION_CHANNEL"
        }, {
            "games.notification_jid", "GAMES_NOTIFICATION_JID"
        }, {
            "games.buzzbot_channel", "GAMES_BUZZBOT_CHANNEL"
        }, {
            "games.buzzbot_jid", "GAMES_BUZZBOT_JID"
        }, {
            "games.use_default_networks_only", "USE_DEFAULT_NETWORKS_ONLY"
        }, {
            "games.force_add_ipv4_default_address", "FORCE_ADD_IPV4_DEFAULT_ADDRESS"
        }
    };
    public static int FAILURE_OPS_ID = 0;
    private static final String TAG = "games_rtmp:Libjingle";
    public final Context mContext;
    private final Handler mHandler;
    public boolean mInitialized;
    private long mNativeContext;

    public Libjingle(Context context, Handler handler)
    {
        mContext = context;
        mHandler = handler;
    }

    private static void dispatchNativeEvent(Object obj, int i, int j, int k, Object obj1, Object obj2, Object obj3, Object obj4, 
            Object obj5)
    {
label0:
        {
label1:
            {
                obj = (Libjingle)((WeakReference)obj).get();
                if (instanceOk(((Libjingle) (obj))))
                {
                    switch (i)
                    {
                    default:
                        Log.i("games_rtmp:Libjingle", (new StringBuilder("Unknown message: ")).append(i).toString());
                        break;

                    case 1: // '\001'
                        break label0;

                    case 2: // '\002'
                        break label1;
                    }
                }
                return;
            }
            sendMessage(((Libjingle) (obj)), new JingleMessages.CallStateChangedOpData((String)obj1, (String)obj2, (String)obj3, j, k));
            return;
        }
        boolean flag;
        if (j == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        sendMessage(((Libjingle) (obj)), new JingleMessages.SigninStateChangedOpData(flag, (String)obj1, k));
    }

    private static boolean instanceOk(Libjingle libjingle)
    {
        if (libjingle != null && libjingle.mNativeContext != 0L)
        {
            return true;
        } else
        {
            Log.e("games_rtmp:Libjingle", "Received invalid Libjingle instance on callback.");
            return false;
        }
    }

    public static void log(String s)
    {
        Log.d("games_rtmp:Libjingle", s);
    }

    public static int logTagToInt(String s)
    {
        if (Log.isLoggable(s, 2))
        {
            return 2;
        }
        if (Log.isLoggable(s, 3))
        {
            return 3;
        }
        if (Log.isLoggable(s, 4))
        {
            return 4;
        }
        return !Log.isLoggable(s, 5) ? 6 : 5;
    }

    private final native void nativeDeclineCall(String s);

    private final native void nativeFinalize();

    private final native String nativeGetDebugString();

    private static native void nativeInit();

    private final native void nativePrepareEngine(String s);

    private final native void nativeProcessSessionStanza(String s);

    private final native void nativeProcessSessionStanzaResponse(String s, String s1);

    private final native void nativeRelease();

    private final native void nativeReleaseEngine();

    private final native void nativeSetJingleInfoStanza(String s);

    public static final native void nativeSetLoggingLevel(int i);

    private final native void nativeTerminateAllCalls();

    private final native void nativeUpdateRemoteJidForSession(String s, String s1);

    private static void onDataChannelConnectionResult(Object obj, String s, boolean flag, int i)
    {
        obj = (Libjingle)((WeakReference)obj).get();
        if (instanceOk(((Libjingle) (obj))))
        {
            sendMessage(((Libjingle) (obj)), new JingleMessages.P2pDataConnectionResult(s, flag, i));
        }
    }

    private static void onDirectedPresenceReceipt(Object obj, String s, boolean flag)
    {
        obj = (Libjingle)((WeakReference)obj).get();
        if (instanceOk(((Libjingle) (obj))))
        {
            sendMessage(((Libjingle) (obj)), new JingleMessages.DirectedPresenceReceipt(flag, s));
        }
    }

    private static void onNotifSubscriptionResult(Object obj, boolean flag)
    {
        obj = (Libjingle)((WeakReference)obj).get();
        if (instanceOk(((Libjingle) (obj))))
        {
            sendMessage(((Libjingle) (obj)), new JingleMessages.BuzzSubscriptionResultData(flag));
        }
    }

    private void prepareEngine(String s)
    {
        Log.d("games_rtmp:Libjingle", "prepare engine");
        nativePrepareEngine(s);
    }

    private static void receiveBuzzNotif(Object obj, byte abyte0[], byte abyte1[])
    {
        obj = (Libjingle)((WeakReference)obj).get();
        if (instanceOk(((Libjingle) (obj))))
        {
            sendMessage(((Libjingle) (obj)), new JingleMessages.BuzzNotifReceiveData(new String(abyte0), new String(abyte1)));
        }
    }

    private static void receiveDataChannelData(Object obj, String s, byte abyte0[])
    {
        obj = (Libjingle)((WeakReference)obj).get();
        if (instanceOk(((Libjingle) (obj))))
        {
            sendMessage(((Libjingle) (obj)), new JingleMessages.P2pDataReceive(s, abyte0));
        }
    }

    private static void receiveIbbData(Object obj, String s, byte abyte0[])
    {
        obj = (Libjingle)((WeakReference)obj).get();
        if (instanceOk(((Libjingle) (obj))))
        {
            sendMessage(((Libjingle) (obj)), new JingleMessages.IbbDataReceiveData(s, abyte0));
        }
    }

    private static void receiveIbbSendResult(Object obj, int i, String s, boolean flag)
    {
        obj = (Libjingle)((WeakReference)obj).get();
        if (instanceOk(((Libjingle) (obj))))
        {
            sendMessage(((Libjingle) (obj)), new JingleMessages.IbbSendResultData(i, s, flag));
        }
    }

    private static void sendMessage(Libjingle libjingle, JingleMessages.JingleMessageBase jinglemessagebase)
    {
        jinglemessagebase = libjingle.mHandler.obtainMessage(jinglemessagebase.mMessageId, jinglemessagebase);
        libjingle.mHandler.sendMessage(jinglemessagebase);
    }

    protected void finalize()
    {
        nativeFinalize();
    }

    public final native void nativeAcceptCall(String s);

    public final native void nativeCall(String s, String s1, int i);

    public final native void nativeConnectAndSignin(String s, boolean flag);

    public final native int nativeCreateSocketConnection(String s);

    public final native void nativeDisconnectAndSignout(String s);

    public final native void nativeEndCall(String s);

    public final native void nativeGetPeerDiagnosticMetrics(Object obj, String s);

    public final native void nativeListenForBuzzNotifications();

    public final native void nativeRegisterWithBuzzbot(String s, String s1);

    public final native void nativeSendData(String s, byte abyte0[]);

    public final native int nativeSendDirectedPresence(String s);

    public final native int nativeSendIbbData(String s, byte abyte0[]);

    public final native void nativeSetGServicesOverride(String s, String s1);

    public final native void nativeSetPeerCapabilities(String s, int i);

    public final native void nativeSetup(Object obj, boolean flag, int i);

    public final native void nativeSubscribeToBuzzChannels(boolean flag);

    public final native void nativeUnregisterWithBuzzbot();

    public final void release()
    {
        if (!mInitialized)
        {
            Log.d("games_rtmp:Libjingle", "release: already released");
            return;
        } else
        {
            mInitialized = false;
            Log.d("games_rtmp:Libjingle", "Release: call nativeRelease");
            nativeRelease();
            return;
        }
    }

    static 
    {
        System.loadLibrary("games_rtmp_jni");
        nativeInit();
        nativeSetLoggingLevel(5);
        FAILURE_OPS_ID = -1;
    }
}
