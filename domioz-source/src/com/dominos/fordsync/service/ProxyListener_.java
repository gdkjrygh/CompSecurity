// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.service;

import android.content.Context;
import com.dominos.fordsync.FordSyncSession_;
import com.dominos.fordsync.util.ProxyImageHandler_;
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
import com.ford.syncV4.e.c.b;
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
import com.ford.syncV4.e.c.e;
import com.ford.syncV4.e.c.g;
import com.ford.syncV4.e.c.j;
import com.ford.syncV4.e.c.k;
import com.ford.syncV4.e.c.l;
import com.ford.syncV4.e.c.m;
import com.ford.syncV4.e.c.n;
import com.ford.syncV4.e.c.p;
import com.ford.syncV4.e.c.r;
import com.ford.syncV4.e.c.t;
import com.ford.syncV4.e.c.u;
import com.ford.syncV4.e.c.w;
import com.ford.syncV4.e.c.z;
import org.androidannotations.api.a;

// Referenced classes of package com.dominos.fordsync.service:
//            ProxyListener, AppLinkManager

public final class ProxyListener_ extends ProxyListener
{

    private Context context_;

    private ProxyListener_(Context context)
    {
        super(context);
        context_ = context;
        init_();
    }

    public static ProxyListener_ getInstance_(Context context)
    {
        return new ProxyListener_(context);
    }

    private void init_()
    {
        mFordSyncSession = FordSyncSession_.getInstance_(context_);
        mProxyImageHandler = ProxyImageHandler_.getInstance_(context_);
        onAfterInject();
    }

    public final volatile void onAddCommandResponse(b b)
    {
        super.onAddCommandResponse(b);
    }

    public final volatile void onAddSubMenuResponse(c c)
    {
        super.onAddSubMenuResponse(c);
    }

    public final volatile void onAlertResponse(e e)
    {
        super.onAlertResponse(e);
    }

    public final volatile void onChangeRegistrationResponse(g g)
    {
        super.onChangeRegistrationResponse(g);
    }

    public final volatile void onCreateInteractionChoiceSetResponse(j j)
    {
        super.onCreateInteractionChoiceSetResponse(j);
    }

    public final volatile void onDeleteCommandResponse(k k)
    {
        super.onDeleteCommandResponse(k);
    }

    public final volatile void onDeleteFileResponse(l l)
    {
        super.onDeleteFileResponse(l);
    }

    public final volatile void onDeleteInteractionChoiceSetResponse(m m)
    {
        super.onDeleteInteractionChoiceSetResponse(m);
    }

    public final volatile void onDeleteSubMenuResponse(n n)
    {
        super.onDeleteSubMenuResponse(n);
    }

    public final volatile void onDiagnosticMessageResponse(p p)
    {
        super.onDiagnosticMessageResponse(p);
    }

    public final volatile void onEndAudioPassThruResponse(r r)
    {
        super.onEndAudioPassThruResponse(r);
    }

    public final volatile void onError(String s, Exception exception)
    {
        super.onError(s, exception);
    }

    public final volatile void onGenericResponse(t t)
    {
        super.onGenericResponse(t);
    }

    public final volatile void onGetDTCsResponse(u u)
    {
        super.onGetDTCsResponse(u);
    }

    public final volatile void onGetVehicleDataResponse(w w)
    {
        super.onGetVehicleDataResponse(w);
    }

    public final volatile void onListFilesResponse(z z)
    {
        super.onListFilesResponse(z);
    }

    public final volatile void onOnAudioPassThru(ac ac)
    {
        super.onOnAudioPassThru(ac);
    }

    public final volatile void onOnButtonEvent(ad ad)
    {
        super.onOnButtonEvent(ad);
    }

    public final volatile void onOnButtonPress(ae ae)
    {
        super.onOnButtonPress(ae);
    }

    public final void onOnCommand(af af)
    {
        a.a(new _cls3(0, "", af));
    }

    public final volatile void onOnDriverDistraction(ag ag)
    {
        super.onOnDriverDistraction(ag);
    }

    public final volatile void onOnHMIStatus(ah ah)
    {
        super.onOnHMIStatus(ah);
    }

    public final volatile void onOnHashChange(ai ai)
    {
        super.onOnHashChange(ai);
    }

    public final volatile void onOnKeyboardInput(aj aj)
    {
        super.onOnKeyboardInput(aj);
    }

    public final volatile void onOnLanguageChange(ak ak)
    {
        super.onOnLanguageChange(ak);
    }

    public final volatile void onOnLockScreenNotification(al al)
    {
        super.onOnLockScreenNotification(al);
    }

    public final volatile void onOnPermissionsChange(am am)
    {
        super.onOnPermissionsChange(am);
    }

    public final volatile void onOnSystemRequest(an an)
    {
        super.onOnSystemRequest(an);
    }

    public final volatile void onOnTBTClientState(ao ao)
    {
        super.onOnTBTClientState(ao);
    }

    public final volatile void onOnTouchEvent(ap ap)
    {
        super.onOnTouchEvent(ap);
    }

    public final volatile void onOnVehicleData(aq aq)
    {
        super.onOnVehicleData(aq);
    }

    public final volatile void onPerformAudioPassThruResponse(ar ar)
    {
        super.onPerformAudioPassThruResponse(ar);
    }

    public final void onPerformInteractionResponse(at at)
    {
        a.a(new _cls2(0, "", at));
    }

    public final volatile void onProxyClosed$41146304(String s, Exception exception, int i)
    {
        super.onProxyClosed$41146304(s, exception, i);
    }

    public final void onPutFileResponse(aw aw)
    {
        a.a(new _cls1(0, "", aw));
    }

    public final volatile void onReadDIDResponse(ax ax)
    {
        super.onReadDIDResponse(ax);
    }

    public final volatile void onResetGlobalPropertiesResponse(ba ba)
    {
        super.onResetGlobalPropertiesResponse(ba);
    }

    public final volatile void onScrollableMessageResponse(bb bb)
    {
        super.onScrollableMessageResponse(bb);
    }

    public final volatile void onSetAppIconResponse(bd bd)
    {
        super.onSetAppIconResponse(bd);
    }

    public final volatile void onSetDisplayLayoutResponse(bf bf)
    {
        super.onSetDisplayLayoutResponse(bf);
    }

    public final volatile void onSetGlobalPropertiesResponse(bg bg)
    {
        super.onSetGlobalPropertiesResponse(bg);
    }

    public final volatile void onSetMediaClockTimerResponse(bh bh)
    {
        super.onSetMediaClockTimerResponse(bh);
    }

    public final volatile void onShowResponse(bj bj)
    {
        super.onShowResponse(bj);
    }

    public final volatile void onSliderResponse(bk bk)
    {
        super.onSliderResponse(bk);
    }

    public final volatile void onSpeakResponse(bo bo)
    {
        super.onSpeakResponse(bo);
    }

    public final volatile void onSubscribeButtonResponse(bp bp)
    {
        super.onSubscribeButtonResponse(bp);
    }

    public final volatile void onSubscribeVehicleDataResponse(br br)
    {
        super.onSubscribeVehicleDataResponse(br);
    }

    public final volatile void onSystemRequestResponse(bu bu)
    {
        super.onSystemRequestResponse(bu);
    }

    public final volatile void onUnsubscribeButtonResponse(by by)
    {
        super.onUnsubscribeButtonResponse(by);
    }

    public final volatile void onUnsubscribeVehicleDataResponse(bz bz)
    {
        super.onUnsubscribeVehicleDataResponse(bz);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }

    public final volatile void setAppLinkManager(AppLinkManager applinkmanager)
    {
        super.setAppLinkManager(applinkmanager);
    }




    private class _cls3 extends org.androidannotations.api.c
    {

        final ProxyListener_ this$0;
        final af val$notification;

        public void execute()
        {
            try
            {
                onOnCommand(notification);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls3(int i, String s1, af af)
        {
            this$0 = ProxyListener_.this;
            notification = af;
            super(final_s, i, s1);
        }
    }


    private class _cls2 extends org.androidannotations.api.c
    {

        final ProxyListener_ this$0;
        final at val$response;

        public void execute()
        {
            try
            {
                onPerformInteractionResponse(response);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls2(int i, String s1, at at)
        {
            this$0 = ProxyListener_.this;
            response = at;
            super(final_s, i, s1);
        }
    }


    private class _cls1 extends org.androidannotations.api.c
    {

        final ProxyListener_ this$0;
        final aw val$response;

        public void execute()
        {
            try
            {
                onPutFileResponse(response);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls1(int i, String s1, aw aw)
        {
            this$0 = ProxyListener_.this;
            response = aw;
            super(final_s, i, s1);
        }
    }

}
