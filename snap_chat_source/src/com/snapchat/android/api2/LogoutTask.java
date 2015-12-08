// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2;

import Br;
import Bt;
import Nk;
import PG;
import Qd;
import android.text.TextUtils;
import android.widget.Toast;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.util.debug.ReleaseManager;
import com.squareup.otto.Bus;
import java.util.Map;
import mN;
import pi;
import qk;

public final class LogoutTask extends mN
{
    public static final class LogoutReason extends Enum
    {

        private static final LogoutReason $VALUES[];
        public static final LogoutReason CHAT_NO_USERNAME;
        public static final LogoutReason TERMS_OF_USE;
        public static final LogoutReason UNAUTHORIZED_NETWORK_CALL;
        public static final LogoutReason UNKNOWN;
        public static final LogoutReason USER_ACTION;

        public static LogoutReason valueOf(String s)
        {
            return (LogoutReason)Enum.valueOf(com/snapchat/android/api2/LogoutTask$LogoutReason, s);
        }

        public static LogoutReason[] values()
        {
            return (LogoutReason[])$VALUES.clone();
        }

        static 
        {
            USER_ACTION = new LogoutReason("USER_ACTION", 0);
            TERMS_OF_USE = new LogoutReason("TERMS_OF_USE", 1);
            UNAUTHORIZED_NETWORK_CALL = new LogoutReason("UNAUTHORIZED_NETWORK_CALL", 2);
            CHAT_NO_USERNAME = new LogoutReason("CHAT_NO_USERNAME", 3);
            UNKNOWN = new LogoutReason("UNKNOWN", 4);
            $VALUES = (new LogoutReason[] {
                USER_ACTION, TERMS_OF_USE, UNAUTHORIZED_NETWORK_CALL, CHAT_NO_USERNAME, UNKNOWN
            });
        }

        private LogoutReason(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String PATH = "/ph/logout";
    private static final String TAG = "LogoutTask";
    private LogoutReason mReason;
    private String mReasonParams[];
    private final ReleaseManager mReleaseManager;
    private final String mUsername;

    public LogoutTask()
    {
        Bt.a();
        this(ReleaseManager.a());
    }

    private LogoutTask(ReleaseManager releasemanager)
    {
        mReason = LogoutReason.UNKNOWN;
        mUsername = Bt.q();
        mReleaseManager = releasemanager;
        Bt.v();
    }

    public final transient LogoutTask a(LogoutReason logoutreason, String as[])
    {
        mReason = logoutreason;
        mReasonParams = as;
        return this;
    }

    protected final boolean a()
    {
        return false;
    }

    protected final Qd b()
    {
        Qd qd = super.b();
        qd.username = mUsername;
        return qd;
    }

    protected final String getPath()
    {
        return "/ph/logout";
    }

    public final com.snapchat.android.networkmanager.NetworkManager.Priority getPriority()
    {
        return com.snapchat.android.networkmanager.NetworkManager.Priority.HIGH;
    }

    public final String getRequestTag()
    {
        return "/ph/logout";
    }

    public final void onResult(pi pi1)
    {
        super.onResult(pi1);
        if (mReleaseManager.c())
        {
            final String printableReason;
            if (mReasonParams == null)
            {
                printableReason = mReason.name();
            } else
            {
                printableReason = (new StringBuilder()).append(mReason.name()).append(" ").append(TextUtils.join(",", mReasonParams)).toString();
            }
            Timber.c("LogoutTask", (new StringBuilder("onResult - wasSuccessful ")).append(pi1.c()).append(" LogoutReason ").append(printableReason).toString(), new Object[0]);
            if (mReason != LogoutReason.USER_ACTION)
            {
                PG.a(new Runnable() {

                    final LogoutTask this$0;
                    final String val$printableReason;

                    public final void run()
                    {
                        Toast toast = Toast.makeText(SnapchatApplication.get(), (new StringBuilder("[DEBUG] LogoutReason ")).append(printableReason).toString(), 1);
                        toast.setGravity(17, 0, 0);
                        toast.show();
                    }

            
            {
                this$0 = LogoutTask.this;
                printableReason = s;
                super();
            }
                });
            }
        }
        if (mUser != null)
        {
            pi1 = mUser;
            Timber.c("User", "DB-LOG: User#logout", new Object[0]);
            ((Br) (pi1)).mSnapStateStore.a(((Br) (pi1)).mSnapsToBeUpdatedOnServer.values());
            pi1.h();
            ((Br) (pi1)).mBus.a(new Nk());
        }
    }
}
