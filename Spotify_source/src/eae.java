// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.model.TermsAndConditionsModel;
import com.spotify.mobile.android.util.tracking.AppStartupTimerMessage;
import com.spotify.mobile.android.util.tracking.ViewLoadTimerMessage;
import com.spotify.mobile.android.util.viewuri.Verified;

public interface eae
{

    public abstract void a();

    public abstract void a(TermsAndConditionsModel termsandconditionsmodel);

    public abstract void a(AppStartupTimerMessage appstartuptimermessage);

    public abstract void a(ViewLoadTimerMessage viewloadtimermessage);

    public abstract void a(Verified verified, long l);

    public abstract void a(String s);

    public abstract void a(String s, String s1);

    public abstract void a(String s, String s1, String s2);

    public abstract void a(String s, String s1, String s2, String s3, String s4, String s5);

    public abstract void a(String s, String s1, boolean flag);

    public abstract void b();

    public abstract void b(String s);

    public abstract void b(String s, String s1);

    public abstract void c();

    public abstract void c(String s, String s1);

    public abstract void d();
}
