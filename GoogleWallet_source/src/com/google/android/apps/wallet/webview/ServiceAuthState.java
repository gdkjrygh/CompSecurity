// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;


// Referenced classes of package com.google.android.apps.wallet.webview:
//            ServiceAuthInfo

public final class ServiceAuthState
{
    public static final class State extends Enum
    {

        private static final State $VALUES[];
        public static final State Authenticated;
        public static final State InProgress;
        public static final State NotAuthenticated;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/google/android/apps/wallet/webview/ServiceAuthState$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            NotAuthenticated = new State("NotAuthenticated", 0);
            InProgress = new State("InProgress", 1);
            Authenticated = new State("Authenticated", 2);
            $VALUES = (new State[] {
                NotAuthenticated, InProgress, Authenticated
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    private State authState;
    public ServiceAuthInfo info;
    private long lastAuthProcessStartTime;
    private long lastAuthTime;

    public ServiceAuthState(ServiceAuthInfo serviceauthinfo)
    {
        lastAuthTime = 0L;
        lastAuthProcessStartTime = 0L;
        info = serviceauthinfo;
        authState = State.NotAuthenticated;
    }

    public static boolean isInProgressStateStillValid(long l)
    {
        return l < 300L;
    }

    public final State getAuthState()
    {
        return authState;
    }

    public final void setAuthState(State state)
    {
        if (authState != State.Authenticated && state == State.Authenticated)
        {
            lastAuthTime = System.currentTimeMillis();
        }
        if (authState != State.InProgress && state == State.InProgress)
        {
            lastAuthProcessStartTime = System.currentTimeMillis();
        }
        authState = state;
    }

    public final long timeSinceLastAuthProcesssStartSecs()
    {
        if (lastAuthProcessStartTime == 0L)
        {
            return 0L;
        } else
        {
            return (System.currentTimeMillis() - lastAuthProcessStartTime) / 1000L;
        }
    }

    public final long timeSinceLastAuthSecs()
    {
        if (lastAuthTime == 0L)
        {
            return 0L;
        } else
        {
            return (System.currentTimeMillis() - lastAuthTime) / 1000L;
        }
    }
}
