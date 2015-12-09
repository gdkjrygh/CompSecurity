// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import android.content.ContentValues;
import android.database.Cursor;
import com.vungle.log.Logger;
import com.vungle.publisher.bg;
import com.vungle.publisher.bi;
import com.vungle.publisher.bt;
import com.vungle.publisher.env.SdkConfig;
import java.util.Arrays;
import java.util.List;
import javax.inject.Provider;
import org.json.JSONArray;
import org.json.JSONException;

public class LoggedException extends bi
{
    public static class Factory extends com.vungle.publisher.bi.a
    {

        bt a;
        SdkConfig b;
        Provider d;

        private LoggedException a()
        {
            return (LoggedException)d.get();
        }

        private static LoggedException a(LoggedException loggedexception, Cursor cursor)
        {
            loggedexception.a = bg.e(cursor, "insert_timestamp_millis").longValue();
            loggedexception.c = bg.c(cursor, "type");
            loggedexception.d = bg.f(cursor, "tag");
            loggedexception.e = bg.f(cursor, "log_message");
            loggedexception.f = bg.f(cursor, "class");
            loggedexception.g = bg.f(cursor, "android_version");
            loggedexception.h = bg.f(cursor, "sdk_version");
            loggedexception.i = bg.f(cursor, "play_services_version");
            loggedexception.t = bg.d(cursor, "id");
            String as[];
            JSONArray jsonarray;
            int k;
            try
            {
                cursor = bg.f(cursor, "stack_trace");
            }
            // Misplaced declaration of an exception variable
            catch (Cursor cursor)
            {
                Logger.e("VungleDatabase", "could not parse stack trace string", cursor);
                return loggedexception;
            }
            if (cursor != null) goto _L2; else goto _L1
_L1:
            cursor = null;
_L4:
            loggedexception.b = cursor;
            return loggedexception;
_L2:
            jsonarray = new JSONArray(cursor);
            as = new String[jsonarray.length()];
            k = 0;
_L5:
            cursor = as;
            if (k >= jsonarray.length()) goto _L4; else goto _L3
_L3:
            as[k] = jsonarray.getString(k);
            k++;
              goto _L5
        }

        private void a(int k, String s, String s1, Throwable throwable)
        {
label0:
            {
                Logger.e(s, s1, throwable);
                if (b.b())
                {
                    if (e() >= 100)
                    {
                        break label0;
                    }
                    LoggedException loggedexception = a();
                    loggedexception.d = s;
                    loggedexception.e = s1;
                    loggedexception.f = throwable.getClass().toString();
                    loggedexception.c = k;
                    loggedexception.g = a.g();
                    loggedexception.h = "VungleDroid/3.3.3";
                    loggedexception.i = a.q();
                    s1 = null;
                    s = s1;
                    if (throwable != null)
                    {
                        throwable = throwable.getStackTrace();
                        s = s1;
                        if (throwable != null)
                        {
                            s = new String[throwable.length];
                            for (k = 0; k < throwable.length; k++)
                            {
                                s[k] = throwable[k].toString();
                            }

                        }
                    }
                    loggedexception.b = s;
                    loggedexception.r();
                }
                return;
            }
            Logger.w(s, "could not insert logged exception... too many already!");
        }

        public final volatile int a(List list)
        {
            return super.a(list);
        }

        protected final volatile bi a(bi bi1, Cursor cursor)
        {
            return a((LoggedException)bi1, cursor);
        }

        public final void a(String s, String s1, Throwable throwable)
        {
            a(2, s, s1, throwable);
        }

        public final void b(String s, String s1, Throwable throwable)
        {
            a(1, s, s1, throwable);
        }

        protected final volatile Object[] b(int k)
        {
            return new Integer[k];
        }

        protected final volatile bi[] c(int k)
        {
            return new LoggedException[k];
        }

        protected final bi c_()
        {
            return a();
        }

        public final volatile List d()
        {
            return super.d();
        }

        public final volatile List d(int k)
        {
            return super.d(k);
        }

        protected final String e_()
        {
            return "logged_exceptions";
        }

        Factory()
        {
        }
    }


    public long a;
    public String b[];
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    Factory j;

    public LoggedException()
    {
    }

    protected final ContentValues a(boolean flag)
    {
        ContentValues contentvalues = new ContentValues();
        if (flag)
        {
            contentvalues.put("id", (Integer)s());
            long l = System.currentTimeMillis();
            a = l;
            contentvalues.put("insert_timestamp_millis", Long.valueOf(l));
        }
        contentvalues.put("type", Integer.valueOf(c));
        contentvalues.put("tag", d);
        contentvalues.put("log_message", e);
        contentvalues.put("class", f);
        contentvalues.put("android_version", g);
        contentvalues.put("sdk_version", h);
        contentvalues.put("play_services_version", i);
        String s;
        String as[];
        try
        {
            as = b;
        }
        catch (JSONException jsonexception)
        {
            Logger.e("VungleDatabase", "could not parse stack trace array", jsonexception);
            return contentvalues;
        }
        s = null;
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        s = (new JSONArray(Arrays.asList(as))).toString();
        contentvalues.put("stack_trace", s);
        return contentvalues;
    }

    protected final volatile com.vungle.publisher.bi.a a_()
    {
        return j;
    }

    protected final String b()
    {
        return "logged_exceptions";
    }
}
