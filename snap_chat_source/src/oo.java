// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;

public final class oo extends ok
{
    final class a
    {

        final String passcode;
        final boolean passcodeConfirmation;
        final oo this$0;

        a()
        {
            this$0 = oo.this;
            super();
            passcodeConfirmation = oo.a(oo.this);
            passcode = oo.b(oo.this);
        }
    }

    public static interface b
    {

        public abstract void a();

        public abstract void a(int i);
    }


    public static final int SC_TOO_MANY_ATTEMPTS_STATUS_CODE = 429;
    private static final String TAG = "UpdateSquareSettingsTask";
    private String mPasscode;
    private boolean mPasscodeEnabled;
    private b mUpdateSuccessListener;

    public oo(String s, b b1)
    {
        mPasscodeEnabled = false;
        mPasscode = s;
        mUpdateSuccessListener = b1;
    }

    public oo(b b1)
    {
        mPasscodeEnabled = true;
        mUpdateSuccessListener = b1;
    }

    static boolean a(oo oo1)
    {
        return oo1.mPasscodeEnabled;
    }

    static String b(oo oo1)
    {
        return oo1.mPasscode;
    }

    protected final String a()
    {
        return "cash/settings/passcode";
    }

    public final pn getRequestPayload()
    {
        return new oZ(new a());
    }

    public final void onResult(pi pi1)
    {
        Timber.b("UpdateSquareSettingsTask", "CASH-LOG: UpdateSquareSettingsTask finished with status code %d", new Object[] {
            Integer.valueOf(pi1.mResponseCode)
        });
        if (pi1.mResponseCode == 200)
        {
            mUpdateSuccessListener.a();
            return;
        } else
        {
            mUpdateSuccessListener.a(pi1.mResponseCode);
            return;
        }
    }
}
