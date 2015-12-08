// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.util.Log;
import b.a.a.a.d;
import com.a.a.a;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.ApiRequestException;
import com.soundcloud.android.onboarding.exceptions.TokenRetrievalException;
import com.soundcloud.android.sync.SyncFailedException;
import com.soundcloud.java.strings.Strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.utils:
//            IOUtils, CallsiteToken

public final class ErrorUtils
{

    public static final String ERROR_CONTEXT_TAG = "error-context";

    private ErrorUtils()
    {
    }

    public static com.soundcloud.android.view.EmptyView.Status emptyViewStatusFromError(Throwable throwable)
    {
        if (throwable instanceof ApiRequestException)
        {
            if (((ApiRequestException)throwable).isNetworkError())
            {
                return com.soundcloud.android.view.EmptyView.Status.CONNECTION_ERROR;
            } else
            {
                return com.soundcloud.android.view.EmptyView.Status.SERVER_ERROR;
            }
        }
        if (throwable instanceof SyncFailedException)
        {
            return com.soundcloud.android.view.EmptyView.Status.CONNECTION_ERROR;
        } else
        {
            return com.soundcloud.android.view.EmptyView.Status.ERROR;
        }
    }

    public static Throwable findRootCause(Throwable throwable)
    {
        Throwable throwable1 = throwable;
        if (throwable != null) goto _L2; else goto _L1
_L1:
        throwable = null;
_L4:
        return throwable;
_L2:
        do
        {
            throwable = throwable1;
            if (throwable1.getCause() == null)
            {
                continue;
            }
            throwable1 = throwable1.getCause();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void handleSilentException(String s, Throwable throwable)
    {
        handleSilentException(throwable, "message", s);
    }

    public static void handleSilentException(Throwable throwable)
    {
        handleSilentException(throwable, null, null);
    }

    public static void handleSilentException(Throwable throwable, String s, String s1)
    {
        com/soundcloud/android/utils/ErrorUtils;
        JVM INSTR monitorenter ;
        throwable.printStackTrace();
        if (!d.c())
        {
            break MISSING_BLOCK_LABEL_48;
        }
        String s2 = SoundCloudApplication.TAG;
        (new StringBuilder("Handling silent exception: ")).append(throwable);
        if (s == null || s1 == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        a.a(s, s1);
        a.a(throwable);
        com/soundcloud/android/utils/ErrorUtils;
        JVM INSTR monitorexit ;
        return;
        throwable;
        throw throwable;
    }

    public static void handleSilentException(Throwable throwable, Map map)
    {
        if (d.c())
        {
            String s = SoundCloudApplication.TAG;
            (new StringBuilder("Handling silent exception: ")).append(throwable);
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); a.a((String)entry.getKey(), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

            a.a(throwable);
        }
    }

    public static void handleSilentExceptionWithLog(Throwable throwable, String s)
    {
        if (!d.c()) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = SoundCloudApplication.TAG;
        (new StringBuilder("Handling silent exception: ")).append(throwable);
        if (!Strings.isNotBlank(s))
        {
            break MISSING_BLOCK_LABEL_72;
        }
        obj = new BufferedReader(new StringReader(s));
        s = ((BufferedReader) (obj)).readLine();
_L4:
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        a.a(s);
        s = ((BufferedReader) (obj)).readLine();
        if (true) goto _L4; else goto _L3
_L3:
        IOUtils.close(((java.io.Closeable) (obj)));
_L6:
        a.a(throwable);
_L2:
        return;
        s;
        s = SoundCloudApplication.TAG;
        IOUtils.close(((java.io.Closeable) (obj)));
        if (true) goto _L6; else goto _L5
_L5:
        throwable;
        IOUtils.close(((java.io.Closeable) (obj)));
        throw throwable;
    }

    public static void handleThrowable(Throwable throwable, CallsiteToken callsitetoken)
    {
        StringWriter stringwriter = new StringWriter();
        callsitetoken.printStackTrace(new PrintWriter(stringwriter));
        handleThrowable(throwable, stringwriter.toString());
    }

    public static void handleThrowable(Throwable throwable, Class class1)
    {
        handleThrowable(throwable, class1.getCanonicalName());
    }

    public static void handleThrowable(Throwable throwable, String s)
    {
        com/soundcloud/android/utils/ErrorUtils;
        JVM INSTR monitorenter ;
        if (d.c())
        {
            a.a("error-context", s);
        }
        if (throwable instanceof RuntimeException)
        {
            throw (RuntimeException)throwable;
        }
        break MISSING_BLOCK_LABEL_33;
        throwable;
        com/soundcloud/android/utils/ErrorUtils;
        JVM INSTR monitorexit ;
        throw throwable;
        if (!includeInReports(throwable))
        {
            break MISSING_BLOCK_LABEL_48;
        }
        handleSilentException(throwable);
_L1:
        com/soundcloud/android/utils/ErrorUtils;
        JVM INSTR monitorexit ;
        return;
        throwable.printStackTrace();
          goto _L1
    }

    static boolean includeInReports(Throwable throwable)
    {
        if ((throwable instanceof SyncFailedException) || isIOExceptionUnrelatedToParsing(throwable) || (throwable instanceof com.soundcloud.android.playlists.PlaylistOperations.PlaylistMissingException))
        {
            return false;
        }
        if (throwable instanceof ApiRequestException)
        {
            return ((ApiRequestException)throwable).loggable();
        } else
        {
            return true;
        }
    }

    public static boolean isCausedByOutOfMemory(Throwable throwable)
    {
        for (; throwable != null; throwable = throwable.getCause())
        {
            if (throwable instanceof OutOfMemoryError)
            {
                return true;
            }
        }

        return false;
    }

    private static boolean isIOExceptionUnrelatedToParsing(Throwable throwable)
    {
        return java/io/IOException.isAssignableFrom(throwable.getClass()) && !com/fasterxml/jackson/core/JsonProcessingException.isAssignableFrom(throwable.getClass());
    }

    public static void log(int i, String s, String s1)
    {
        if (d.c())
        {
            a.a(i, s, s1);
            return;
        } else
        {
            Log.println(i, s, s1);
            return;
        }
    }

    public static Throwable removeTokenRetrievalException(Exception exception)
    {
        Object obj = exception;
        if (exception instanceof TokenRetrievalException)
        {
            obj = exception.getCause();
        }
        return ((Throwable) (obj));
    }
}
