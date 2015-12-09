// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.service;

import android.content.Context;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.fordsync.FordSyncSession;
import com.dominos.fordsync.interactions.CallStore_;
import com.dominos.fordsync.interactions.EasyOrder_;
import com.dominos.fordsync.interactions.RecentOrder_;
import com.dominos.fordsync.interactions.SyncInteraction;
import com.dominos.fordsync.interactions.TrackOrder_;
import com.dominos.fordsync.util.ProxyImageHandler;
import com.ford.syncV4.a.b;
import com.ford.syncV4.e.b.a;
import com.ford.syncV4.e.c.a.e;
import com.ford.syncV4.e.c.a.k;
import com.ford.syncV4.e.c.a.n;
import com.ford.syncV4.e.c.a.u;
import com.ford.syncV4.e.c.a.x;
import com.ford.syncV4.e.c.ac;
import com.ford.syncV4.e.c.ad;
import com.ford.syncV4.e.c.ae;
import com.ford.syncV4.e.c.af;
import com.ford.syncV4.e.c.ag;
import com.ford.syncV4.e.c.ah;
import com.ford.syncV4.e.c.ai;
import com.ford.syncV4.e.c.aj;
import com.ford.syncV4.e.c.ak;
import com.ford.syncV4.e.c.al;
import com.ford.syncV4.e.c.am;
import com.ford.syncV4.e.c.an;
import com.ford.syncV4.e.c.ao;
import com.ford.syncV4.e.c.ap;
import com.ford.syncV4.e.c.aq;
import com.ford.syncV4.e.c.ar;
import com.ford.syncV4.e.c.at;
import com.ford.syncV4.e.c.aw;
import com.ford.syncV4.e.c.ax;
import com.ford.syncV4.e.c.ba;
import com.ford.syncV4.e.c.bb;
import com.ford.syncV4.e.c.bd;
import com.ford.syncV4.e.c.bf;
import com.ford.syncV4.e.c.bg;
import com.ford.syncV4.e.c.bh;
import com.ford.syncV4.e.c.bj;
import com.ford.syncV4.e.c.bk;
import com.ford.syncV4.e.c.bo;
import com.ford.syncV4.e.c.bp;
import com.ford.syncV4.e.c.br;
import com.ford.syncV4.e.c.bu;
import com.ford.syncV4.e.c.by;
import com.ford.syncV4.e.c.bz;
import com.ford.syncV4.e.c.c;
import com.ford.syncV4.e.c.ca;
import com.ford.syncV4.e.c.g;
import com.ford.syncV4.e.c.j;
import com.ford.syncV4.e.c.l;
import com.ford.syncV4.e.c.m;
import com.ford.syncV4.e.c.p;
import com.ford.syncV4.e.c.r;
import com.ford.syncV4.e.c.t;
import com.ford.syncV4.e.c.w;
import com.ford.syncV4.e.c.z;
import java.util.BitSet;
import java.util.concurrent.CountDownLatch;
import org.a.a.a.a.f;

// Referenced classes of package com.dominos.fordsync.service:
//            AppLinkManager

class ProxyListener
    implements a
{

    private static final String LOG_TAG = "FORDSYNC_AppLinkManager";
    private BitSet firstRunsReceived;
    private AppLinkManager mAppLinkManager;
    private Context mContext;
    FordSyncSession mFordSyncSession;
    private UserProfileManager mProfileManager;
    ProxyImageHandler mProxyImageHandler;

    public ProxyListener(Context context)
    {
        firstRunsReceived = new BitSet();
        mContext = context;
    }

    public void onAddCommandResponse(com.ford.syncV4.e.c.b b1)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onAddCommandResponse: %s", new Object[] {
            f.a(b1)
        });
    }

    public void onAddSubMenuResponse(c c)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onAddSubMenuResponse: %s", new Object[] {
            f.a(c)
        });
    }

    protected void onAfterInject()
    {
        mProfileManager = (UserProfileManager)mFordSyncSession.getManager("user_manager");
    }

    public void onAlertResponse(com.ford.syncV4.e.c.e e1)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onAlertResponse: %s", new Object[] {
            f.a(e1)
        });
    }

    public void onChangeRegistrationResponse(g g)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onChangeRegistrationResponse: %s", new Object[] {
            f.a(g)
        });
    }

    public void onCreateInteractionChoiceSetResponse(j j)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onCreateInteractionChoiceSetResponse: %s", new Object[] {
            f.a(j)
        });
    }

    public void onDeleteCommandResponse(com.ford.syncV4.e.c.k k1)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onDeleteCommandResponse: %s", new Object[] {
            f.a(k1)
        });
    }

    public void onDeleteFileResponse(l l)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onDeleteFileResponse: %s", new Object[] {
            f.a(l)
        });
    }

    public void onDeleteInteractionChoiceSetResponse(m m)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onDeleteInteractionChoiceSetResponse: %s", new Object[] {
            f.a(m)
        });
    }

    public void onDeleteSubMenuResponse(com.ford.syncV4.e.c.n n1)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onDeleteSubMenuResponse: %s", new Object[] {
            f.a(n1)
        });
    }

    public void onDiagnosticMessageResponse(p p)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onDiagnosticMessageResponse: %s", new Object[] {
            f.a(p)
        });
    }

    public void onEndAudioPassThruResponse(r r)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onEndAudioPassThruResponse: %s", new Object[] {
            f.a(r)
        });
    }

    public void onError(String s, Exception exception)
    {
        LogUtil.e("FORDSYNC_AppLinkManager", s, exception, new Object[0]);
    }

    public void onGenericResponse(t t)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onGenericResponse: %s", new Object[] {
            f.a(t)
        });
    }

    public void onGetDTCsResponse(com.ford.syncV4.e.c.u u1)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onGetDTCsResponse: %s", new Object[] {
            f.a(u1)
        });
    }

    public void onGetVehicleDataResponse(w w1)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onGetVehicleDataResponse: %s", new Object[] {
            f.a(w1)
        });
        if (w1.d().booleanValue())
        {
            mAppLinkManager.processVehicleData(w1.k(), w1.l(), w1.i(), w1.j());
        }
    }

    public void onListFilesResponse(z z)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onListFilesResponse: %s", new Object[] {
            f.a(z)
        });
    }

    public void onOnAudioPassThru(ac ac)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onOnAudioPassThru: %s", new Object[] {
            f.a(ac)
        });
    }

    public void onOnButtonEvent(ad ad)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onOnButtonEvent: %s", new Object[] {
            f.a(ad)
        });
    }

    public void onOnButtonPress(ae ae1)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onOnButtonPress: %s", new Object[] {
            f.a(ae1)
        });
        switch (ae1.c().intValue())
        {
        default:
            return;

        case 1: // '\001'
            EasyOrder_.getInstance_(mContext).start();
            return;

        case 2: // '\002'
            RecentOrder_.getInstance_(mContext).start();
            return;

        case 3: // '\003'
            TrackOrder_.getInstance_(mContext).start();
            break;
        }
    }

    public void onOnCommand(af af1)
    {
        if (!mProfileManager.isAuthorizedUser())
        {
            CallStore_.getInstance_(mContext).start();
            return;
        }
        LogUtil.v("FORDSYNC_AppLinkManager", "onOnCommand: %s", new Object[] {
            f.a(af1)
        });
        switch (af1.c().intValue())
        {
        default:
            return;

        case 100: // 'd'
            EasyOrder_.getInstance_(mContext).start();
            return;

        case 101: // 'e'
            RecentOrder_.getInstance_(mContext).start();
            return;

        case 102: // 'f'
            TrackOrder_.getInstance_(mContext).start();
            return;

        case 103: // 'g'
            CallStore_.getInstance_(mContext).start();
            break;
        }
    }

    public void onOnDriverDistraction(ag ag)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onOnDriverDistraction: %s", new Object[] {
            f.a(ag)
        });
    }

    public void onOnHMIStatus(ah ah1)
    {
        e e1;
        boolean flag;
        LogUtil.v("FORDSYNC_AppLinkManager", "onOnHMIStatus: %s", new Object[] {
            f.a(ah1)
        });
        e1 = ah1.c();
        flag = ah1.f().booleanValue();
        LogUtil.v("FORDSYNC_AppLinkManager", "HMI Level: %s, First Run: %s", new Object[] {
            e1, Boolean.valueOf(flag)
        });
        LogUtil.v("FORDSYNC_AppLinkManager", "firstRunsReceived: %s", new Object[] {
            firstRunsReceived
        });
        if (firstRunsReceived.get(e1.ordinal()) && flag)
        {
            LogUtil.wtf("FORDSYNC_AppLinkManager", "Already seen firstRun for %s", new Object[] {
                e1
            });
        }
        if (flag)
        {
            firstRunsReceived.set(e1.ordinal());
        }
        _cls2..SwitchMap.com.ford.syncV4.proxy.rpc.enums.HMILevel[e1.ordinal()];
        JVM INSTR tableswitch 1 4: default 160
    //                   1 169
    //                   2 218
    //                   3 277
    //                   4 299;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        mAppLinkManager.setLastTurnHMILevel(e1);
        return;
_L2:
        if (!flag)
        {
            LogUtil.v("FORDSYNC_AppLinkManager", "HMI_NONE -> not first run, so buhbye", new Object[0]);
            mAppLinkManager.reset(false);
        } else
        {
            LogUtil.v("FORDSYNC_AppLinkManager", "HMI_NONE -> first run; uploading application icon", new Object[0]);
            mAppLinkManager.uploadApplicationIcon();
        }
        continue; /* Loop/switch isn't completed */
_L3:
        LogUtil.v("FORDSYNC_AppLinkManager", "HMI_BACKGROUND -> firstRun=%s", new Object[] {
            Boolean.valueOf(flag)
        });
        if (mAppLinkManager.getLastTurnHMILevel() == e.a)
        {
            mAppLinkManager.show(mAppLinkManager.getPrompts().getPrompter("app_welcome"), new Object[0]);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        LogUtil.v("FORDSYNC_AppLinkManager", "HMI_LIMITED -> firstRun=%s", new Object[] {
            Boolean.valueOf(flag)
        });
        continue; /* Loop/switch isn't completed */
_L5:
        LogUtil.d("FORDSYNC_AppLinkManager", "HMI_FULL happened", new Object[0]);
        if (flag || !mAppLinkManager.isSetup())
        {
            mAppLinkManager.setup(new _cls1());
        } else
        if (ah1.e() == u.a && mAppLinkManager.currentInteraction == null)
        {
            LogUtil.v("FORDSYNC_AppLinkManager", "HMI_FULL -> idle", new Object[0]);
            mAppLinkManager.show(mAppLinkManager.getPrompts().getPrompter("app_idle"), new Object[0]);
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void onOnHashChange(ai ai)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onOnHashChange: %s", new Object[] {
            f.a(ai)
        });
    }

    public void onOnKeyboardInput(aj aj)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onOnKeyboardInput: %s", new Object[] {
            f.a(aj)
        });
    }

    public void onOnLanguageChange(ak ak)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onOnLanguageChange: %s", new Object[] {
            f.a(ak)
        });
    }

    public void onOnLockScreenNotification(al al1)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onOnLockScreenNotification: getShowLockScreen() %s", new Object[] {
            al1.c()
        });
        al1 = al1.c();
        if (al1 == k.a || al1 == k.b)
        {
            mAppLinkManager.showLockScreen();
            return;
        } else
        {
            mAppLinkManager.clearLockScreen();
            return;
        }
    }

    public void onOnPermissionsChange(am am)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onOnPermissionsChange: %s", new Object[] {
            am
        });
    }

    public void onOnSystemRequest(an an)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onOnSystemRequest: %s", new Object[] {
            f.a(an)
        });
    }

    public void onOnTBTClientState(ao ao)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onOnTBTClientState: %s", new Object[] {
            f.a(ao)
        });
    }

    public void onOnTouchEvent(ap ap)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onOnTouchEvent: %s", new Object[] {
            f.a(ap)
        });
    }

    public void onOnVehicleData(aq aq1)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onOnVehicleData: %s", new Object[] {
            f.a(aq1)
        });
        mAppLinkManager.processVehicleData(aq1.e(), aq1.f(), aq1.c(), aq1.d());
    }

    public void onPerformAudioPassThruResponse(ar ar)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onPerformAudioPassThruResponse: %s", new Object[] {
            f.a(ar)
        });
    }

    public void onPerformInteractionResponse(at at1)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onPerformInteractionResponse: %s", new Object[] {
            f.a(at1)
        });
        if (at1.d().booleanValue())
        {
            if (mAppLinkManager.currentInteraction != null)
            {
                mAppLinkManager.currentInteraction.handleChoice(at1.i().intValue());
                return;
            } else
            {
                LogUtil.e("FORDSYNC_AppLinkManager", "currentInteraction is null on onPerformInteractionResponse!", new Object[0]);
                return;
            }
        } else
        {
            LogUtil.d("FORDSYNC_AppLinkManager", (new StringBuilder("SYNC says: ")).append(at1.e().name()).toString(), new Object[0]);
            mAppLinkManager.show(mAppLinkManager.getPrompts().getPrompter("app_idle"), new Object[0]);
            mAppLinkManager.updateLayout("TEXTBUTTONS_WITH_GRAPHIC");
            return;
        }
    }

    public void onProxyClosed$41146304(String s, Exception exception, int i)
    {
label0:
        {
            LogUtil.e("FORDSYNC_AppLinkManager", "onProxyClosed: %s", exception, new Object[] {
                s
            });
            s = (com.ford.syncV4.a.a)exception;
            if (s != null)
            {
                if (s.a() == b.k)
                {
                    break label0;
                }
                if (s.a() != b.b)
                {
                    mAppLinkManager.reset();
                }
            }
            return;
        }
        mAppLinkManager.reset(false);
    }

    public void onPutFileResponse(aw aw1)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onPutFileResponse: %s", new Object[] {
            f.a(aw1)
        });
        if (mProxyImageHandler.isCorrelationFromDefaultLoader(aw1.c().intValue()))
        {
            mProxyImageHandler.continueLoadingDefaultImages();
        }
        int i = mProxyImageHandler.getCorrelationForImage("LOGO_70");
        if (aw1.d().booleanValue() && i != -1 && i == aw1.c().intValue())
        {
            mAppLinkManager.setApplicationIcon();
        }
    }

    public void onReadDIDResponse(ax ax)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onReadDIDResponse: %s", new Object[] {
            f.a(ax)
        });
    }

    public void onResetGlobalPropertiesResponse(ba ba)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onResetGlobalPropertiesResponse: %s", new Object[] {
            f.a(ba)
        });
    }

    public void onScrollableMessageResponse(bb bb)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onScrollableMessageResponse: %s", new Object[] {
            f.a(bb)
        });
    }

    public void onSetAppIconResponse(bd bd)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onSetAppIconResponse: %s", new Object[] {
            f.a(bd)
        });
    }

    public void onSetDisplayLayoutResponse(bf bf)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onSetDisplayLayoutResponse: %s", new Object[] {
            f.a(bf)
        });
    }

    public void onSetGlobalPropertiesResponse(bg bg)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onSetGlobalPropertiesResponse: %s", new Object[] {
            f.a(bg)
        });
    }

    public void onSetMediaClockTimerResponse(bh bh)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onSetMediaClockTimerResponse: %s", new Object[] {
            f.a(bh)
        });
    }

    public void onShowResponse(bj bj)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onShowResponse: %s", new Object[] {
            f.a(bj)
        });
    }

    public void onSliderResponse(bk bk)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onSliderResponse: %s", new Object[] {
            f.a(bk)
        });
    }

    public void onSpeakResponse(bo bo)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onSpeakResponse: %s", new Object[] {
            f.a(bo)
        });
        if (mAppLinkManager.mSpeakLatch != null)
        {
            mAppLinkManager.mSpeakLatch.countDown();
        }
    }

    public void onSubscribeButtonResponse(bp bp)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onSubscribeButtonResponse: %s", new Object[] {
            f.a(bp)
        });
    }

    public void onSubscribeVehicleDataResponse(br br1)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onSubscribeVehicleDataResponse: %s", new Object[] {
            f.a(br1)
        });
        if (br1.d().booleanValue() && x.a.equals(br1.i().a()))
        {
            mAppLinkManager.startVehicleDataConsumer();
        }
    }

    public void onSystemRequestResponse(bu bu)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onSystemRequestResponse: %s", new Object[] {
            f.a(bu)
        });
    }

    public void onUnsubscribeButtonResponse(by by)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onUnsubscribeButtonResponse: %s", new Object[] {
            f.a(by)
        });
    }

    public void onUnsubscribeVehicleDataResponse(bz bz)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onUnsubscribeVehicleDataResponse: %s", new Object[] {
            f.a(bz)
        });
    }

    public void setAppLinkManager(AppLinkManager applinkmanager)
    {
        mAppLinkManager = applinkmanager;
    }


    private class _cls2
    {

        static final int $SwitchMap$com$ford$syncV4$proxy$rpc$enums$HMILevel[];

        static 
        {
            $SwitchMap$com$ford$syncV4$proxy$rpc$enums$HMILevel = new int[e.values().length];
            try
            {
                $SwitchMap$com$ford$syncV4$proxy$rpc$enums$HMILevel[e.d.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$ford$syncV4$proxy$rpc$enums$HMILevel[e.c.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$ford$syncV4$proxy$rpc$enums$HMILevel[e.b.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$ford$syncV4$proxy$rpc$enums$HMILevel[e.a.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls1 extends BaseCallback
    {

        final ProxyListener this$0;

        public void onFinish()
        {
            mAppLinkManager.performWelcomeInteraction();
        }

        _cls1()
        {
            this$0 = ProxyListener.this;
            super();
        }
    }

}
