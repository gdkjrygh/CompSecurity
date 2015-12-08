// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.model.TermsAndConditionsModel;
import com.spotify.mobile.android.orbit.OrbitSessionInterface;
import com.spotify.mobile.android.util.tracking.AppStartupTimerMessage;
import com.spotify.mobile.android.util.tracking.ViewLoadTimerMessage;
import com.spotify.mobile.android.util.viewuri.Verified;

public final class eaf
    implements eae
{

    private OrbitSessionInterface a;

    public eaf(OrbitSessionInterface orbitsessioninterface)
    {
        a = orbitsessioninterface;
    }

    public final void a()
    {
        a.logout(true);
    }

    public final void a(TermsAndConditionsModel termsandconditionsmodel)
    {
        a.logAcceptUserTerms(termsandconditionsmodel.a, termsandconditionsmodel.b, termsandconditionsmodel.c, termsandconditionsmodel.d);
    }

    public final void a(AppStartupTimerMessage appstartuptimermessage)
    {
        a.logAppStartupTimer(appstartuptimermessage.a, appstartuptimermessage.b, appstartuptimermessage.c);
    }

    public final void a(ViewLoadTimerMessage viewloadtimermessage)
    {
        a.logViewLoadTimer(viewloadtimermessage.a, viewloadtimermessage.b, viewloadtimermessage.c, viewloadtimermessage.d, viewloadtimermessage.e, viewloadtimermessage.f, viewloadtimermessage.g);
    }

    public final void a(Verified verified, long l)
    {
        a.logView(verified.toString(), l);
    }

    public final void a(String s)
    {
        a.log(s);
    }

    public final void a(String s, String s1)
    {
        a.login(s, s1);
    }

    public final void a(String s, String s1, String s2)
    {
        a.sendToInbox(s, s1, s2);
    }

    public final void a(String s, String s1, String s2, String s3, String s4, String s5)
    {
        a.logEvent(s, s1, s2, s3, s4, s5);
    }

    public final void a(String s, String s1, boolean flag)
    {
        a.loginWithFacebookToken(s, s1, flag);
    }

    public final void b()
    {
        a.eraseOfflineUser();
    }

    public final void b(String s)
    {
        a.setLanguage(s);
    }

    public final void b(String s, String s1)
    {
        a.logDeviceIdentifier(s, s1);
    }

    public final void c()
    {
        a.loginWithStoredCredentials();
    }

    public final void c(String s, String s1)
    {
        a.logABTesting(s, s1);
    }

    public final void d()
    {
        a.reportAdUrlClicked();
    }
}
