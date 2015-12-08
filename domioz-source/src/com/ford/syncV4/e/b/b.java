// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.b;

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

public interface b
{

    public abstract void onAddCommandResponse(com.ford.syncV4.e.c.b b1);

    public abstract void onAddSubMenuResponse(c c);

    public abstract void onAlertResponse(e e);

    public abstract void onChangeRegistrationResponse(g g);

    public abstract void onCreateInteractionChoiceSetResponse(j j);

    public abstract void onDeleteCommandResponse(k k);

    public abstract void onDeleteFileResponse(l l);

    public abstract void onDeleteInteractionChoiceSetResponse(m m);

    public abstract void onDeleteSubMenuResponse(n n);

    public abstract void onDiagnosticMessageResponse(p p);

    public abstract void onEndAudioPassThruResponse(r r);

    public abstract void onError(String s, Exception exception);

    public abstract void onGenericResponse(t t);

    public abstract void onGetDTCsResponse(u u);

    public abstract void onGetVehicleDataResponse(w w);

    public abstract void onListFilesResponse(z z);

    public abstract void onOnAudioPassThru(ac ac);

    public abstract void onOnButtonEvent(ad ad);

    public abstract void onOnButtonPress(ae ae);

    public abstract void onOnCommand(af af);

    public abstract void onOnDriverDistraction(ag ag);

    public abstract void onOnHMIStatus(ah ah);

    public abstract void onOnHashChange(ai ai);

    public abstract void onOnKeyboardInput(aj aj);

    public abstract void onOnLanguageChange(ak ak);

    public abstract void onOnLockScreenNotification(al al);

    public abstract void onOnPermissionsChange(am am);

    public abstract void onOnSystemRequest(an an);

    public abstract void onOnTBTClientState(ao ao);

    public abstract void onOnTouchEvent(ap ap);

    public abstract void onOnVehicleData(aq aq);

    public abstract void onPerformAudioPassThruResponse(ar ar);

    public abstract void onPerformInteractionResponse(at at);

    public abstract void onProxyClosed$41146304(String s, Exception exception, int i);

    public abstract void onPutFileResponse(aw aw);

    public abstract void onReadDIDResponse(ax ax);

    public abstract void onResetGlobalPropertiesResponse(ba ba);

    public abstract void onScrollableMessageResponse(bb bb);

    public abstract void onSetAppIconResponse(bd bd);

    public abstract void onSetDisplayLayoutResponse(bf bf);

    public abstract void onSetGlobalPropertiesResponse(bg bg);

    public abstract void onSetMediaClockTimerResponse(bh bh);

    public abstract void onShowResponse(bj bj);

    public abstract void onSliderResponse(bk bk);

    public abstract void onSpeakResponse(bo bo);

    public abstract void onSubscribeButtonResponse(bp bp);

    public abstract void onSubscribeVehicleDataResponse(br br);

    public abstract void onSystemRequestResponse(bu bu);

    public abstract void onUnsubscribeButtonResponse(by by);

    public abstract void onUnsubscribeVehicleDataResponse(bz bz);
}
