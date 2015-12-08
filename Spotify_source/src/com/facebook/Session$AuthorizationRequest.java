// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import aof;
import apd;
import ape;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.facebook:
//            SessionLoginBehavior, SessionDefaultAudience

public class <init>
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    String applicationId;
    final String authId;
    private SessionDefaultAudience defaultAudience;
    private boolean isLegacy;
    private final Map loggingExtras;
    SessionLoginBehavior loginBehavior;
    List permissions;
    int requestCode;
    final apd startActivityDelegate;
    public ape statusCallback;
    public String validateSameFbidAsToken;

    static Map a(<init> <init>1)
    {
        return <init>1.loggingExtras;
    }

    static boolean b(loggingExtras loggingextras)
    {
        return loggingextras.isLegacy;
    }

    static SessionLoginBehavior c(isLegacy islegacy)
    {
        return islegacy.loginBehavior;
    }

    static int d(loginBehavior loginbehavior)
    {
        return loginbehavior.requestCode;
    }

    static List e(requestCode requestcode)
    {
        return requestcode.permissions;
    }

    static SessionDefaultAudience f(permissions permissions1)
    {
        return permissions1.defaultAudience;
    }

    static apd g(defaultAudience defaultaudience)
    {
        return defaultaudience.startActivityDelegate;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        throw new InvalidObjectException("Cannot readObject, serialization proxy required");
    }

    tionRequest a()
    {
        aof aof = new aof() {

            private Session.AuthorizationRequest a;

            public final Activity a()
            {
                return Session.AuthorizationRequest.g(a).a();
            }

            public final void a(Intent intent, int i)
            {
                Session.AuthorizationRequest.g(a).a(intent, i);
            }

            
            {
                a = Session.AuthorizationRequest.this;
                super();
            }
        };
        return new tionRequest(loginBehavior, requestCode, isLegacy, permissions, defaultAudience, applicationId, validateSameFbidAsToken, aof, authId);
    }

    authId a(int i)
    {
        if (i >= 0)
        {
            requestCode = i;
        }
        return this;
    }

    requestCode a(ape ape)
    {
        statusCallback = ape;
        return this;
    }

    statusCallback a(SessionDefaultAudience sessiondefaultaudience)
    {
        if (sessiondefaultaudience != null)
        {
            defaultAudience = sessiondefaultaudience;
        }
        return this;
    }

    defaultAudience a(SessionLoginBehavior sessionloginbehavior)
    {
        if (sessionloginbehavior != null)
        {
            loginBehavior = sessionloginbehavior;
        }
        return this;
    }

    loginBehavior a(List list)
    {
        if (list != null)
        {
            permissions = list;
        }
        return this;
    }

    Object writeReplace()
    {
        class AuthRequestSerializationProxyV1
            implements Serializable
        {

            private static final long serialVersionUID = 0x8697a02191312db1L;
            private final String applicationId;
            private final String defaultAudience;
            private boolean isLegacy;
            private final SessionLoginBehavior loginBehavior;
            private final List permissions;
            private final int requestCode;
            private final String validateSameFbidAsToken;

            private Object readResolve()
            {
                return new Session.AuthorizationRequest(loginBehavior, requestCode, permissions, defaultAudience, isLegacy, applicationId, validateSameFbidAsToken, (byte)0);
            }

            private AuthRequestSerializationProxyV1(SessionLoginBehavior sessionloginbehavior, int i, List list, String s, boolean flag, String s1, String s2)
            {
                loginBehavior = sessionloginbehavior;
                requestCode = i;
                permissions = list;
                defaultAudience = s;
                isLegacy = flag;
                applicationId = s1;
                validateSameFbidAsToken = s2;
            }

            AuthRequestSerializationProxyV1(SessionLoginBehavior sessionloginbehavior, int i, List list, String s, boolean flag, String s1, String s2, 
                    byte byte0)
            {
                this(sessionloginbehavior, i, list, s, flag, s1, s2);
            }
        }

        return new AuthRequestSerializationProxyV1(loginBehavior, requestCode, permissions, defaultAudience.name(), isLegacy, applicationId, validateSameFbidAsToken, (byte)0);
    }

    _cls4.a(Activity activity)
    {
        loginBehavior = SessionLoginBehavior.a;
        requestCode = 64206;
        isLegacy = false;
        permissions = Collections.emptyList();
        defaultAudience = SessionDefaultAudience.a;
        authId = UUID.randomUUID().toString();
        loggingExtras = new HashMap();
        startActivityDelegate = new apd(activity) {

            private Activity a;

            public final Activity a()
            {
                return a;
            }

            public final void a(Intent intent, int i)
            {
                a.startActivityForResult(intent, i);
            }

            
            {
                a = activity;
                super();
            }
        };
    }

    t(Fragment fragment)
    {
        loginBehavior = SessionLoginBehavior.a;
        requestCode = 64206;
        isLegacy = false;
        permissions = Collections.emptyList();
        defaultAudience = SessionDefaultAudience.a;
        authId = UUID.randomUUID().toString();
        loggingExtras = new HashMap();
        startActivityDelegate = new apd(fragment) {

            private Fragment a;

            public final Activity a()
            {
                return a.k();
            }

            public final void a(Intent intent, int i)
            {
                a.a(intent, i);
            }

            
            {
                a = fragment;
                super();
            }
        };
    }

    private _cls2.a(SessionLoginBehavior sessionloginbehavior, int i, List list, String s, boolean flag, String s1, String s2)
    {
        loginBehavior = SessionLoginBehavior.a;
        requestCode = 64206;
        isLegacy = false;
        permissions = Collections.emptyList();
        defaultAudience = SessionDefaultAudience.a;
        authId = UUID.randomUUID().toString();
        loggingExtras = new HashMap();
        startActivityDelegate = new apd() {

            public final Activity a()
            {
                throw new UnsupportedOperationException("Cannot create an AuthorizationRequest without a valid Activity or Fragment");
            }

            public final void a(Intent intent, int j)
            {
                throw new UnsupportedOperationException("Cannot create an AuthorizationRequest without a valid Activity or Fragment");
            }

        };
        loginBehavior = sessionloginbehavior;
        requestCode = i;
        permissions = list;
        defaultAudience = SessionDefaultAudience.valueOf(s);
        isLegacy = flag;
        applicationId = s1;
        validateSameFbidAsToken = s2;
    }

    validateSameFbidAsToken(SessionLoginBehavior sessionloginbehavior, int i, List list, String s, boolean flag, String s1, String s2, 
            byte byte0)
    {
        this(sessionloginbehavior, i, list, s, flag, s1, s2);
    }
}
