// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos;

import android.os.Handler;
import com.spotify.cosmos.router.Response;

public abstract class ParsingCallbackReceiver extends com.spotify.cosmos.android.Resolver.CallbackReceiver
{

    private final Handler mHandler;

    public ParsingCallbackReceiver(Handler handler)
    {
        super(null);
        mHandler = handler;
    }

    private void postError(final Throwable error, final ErrorCause cause)
    {
        if (mHandler != null)
        {
            mHandler.post(new Runnable() {

                final ParsingCallbackReceiver this$0;
                final ErrorCause val$cause;
                final Throwable val$error;

                public void run()
                {
                    onError(error, cause);
                }

            
            {
                this$0 = ParsingCallbackReceiver.this;
                error = throwable;
                cause = errorcause;
                super();
            }
            });
            return;
        } else
        {
            onError(error, cause);
            return;
        }
    }

    private void postResult(final Response response, final Object parsedObject)
    {
        if (mHandler != null)
        {
            mHandler.post(new Runnable() {

                final ParsingCallbackReceiver this$0;
                final Object val$parsedObject;
                final Response val$response;

                public void run()
                {
                    onResolved(response, parsedObject);
                }

            
            {
                this$0 = ParsingCallbackReceiver.this;
                response = response1;
                parsedObject = obj;
                super();
            }
            });
            return;
        } else
        {
            onResolved(response, parsedObject);
            return;
        }
    }

    protected final void onError(Throwable throwable)
    {
        postError(throwable, ErrorCause.RESOLVING);
    }

    public abstract void onError(Throwable throwable, ErrorCause errorcause);

    protected final void onResolved(Response response)
    {
        try
        {
            verifyResponse(response);
            postResult(response, parseResponse(response));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            postError(response, ErrorCause.PARSING);
        }
    }

    public abstract void onResolved(Response response, Object obj);

    public abstract Object parseResponse(Response response);

    protected void verifyResponse(Response response)
    {
    }

    private class ErrorCause extends Enum
    {

        private static final ErrorCause $VALUES[];
        public static final ErrorCause PARSING;
        public static final ErrorCause RESOLVING;
        public static final ErrorCause UNKNOWN;

        public static ErrorCause valueOf(String s)
        {
            return (ErrorCause)Enum.valueOf(com/spotify/mobile/android/cosmos/ParsingCallbackReceiver$ErrorCause, s);
        }

        public static ErrorCause[] values()
        {
            return (ErrorCause[])$VALUES.clone();
        }

        static 
        {
            RESOLVING = new ErrorCause("RESOLVING", 0);
            PARSING = new ErrorCause("PARSING", 1);
            UNKNOWN = new ErrorCause("UNKNOWN", 2);
            $VALUES = (new ErrorCause[] {
                RESOLVING, PARSING, UNKNOWN
            });
        }

        private ErrorCause(String s, int i)
        {
            super(s, i);
        }
    }

}
