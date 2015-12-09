// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;

public final class cfz extends cgg
{

    final Context a;
    String b;
    long c;
    long d;
    String e;
    String f;
    private final Map g;

    public cfz(ckw ckw1, Map map)
    {
        super(ckw1, "createCalendarEvent");
        g = map;
        a = ckw1.e();
        b = c("description");
        e = c("summary");
        c = d("start_ticks");
        d = d("end_ticks");
        f = c("location");
    }

    private String c(String s)
    {
        if (TextUtils.isEmpty((CharSequence)g.get(s)))
        {
            return "";
        } else
        {
            return (String)g.get(s);
        }
    }

    private long d(String s)
    {
        s = (String)g.get(s);
        if (s == null)
        {
            return -1L;
        }
        long l;
        try
        {
            l = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1L;
        }
        return l;
    }

    // Unreferenced inner class cfz$1

/* anonymous class */
    final class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        private cfz a;

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface = a;
            Intent intent = (new Intent("android.intent.action.EDIT")).setData(android.provider.CalendarContract.Events.CONTENT_URI);
            intent.putExtra("title", ((cfz) (dialoginterface)).b);
            intent.putExtra("eventLocation", ((cfz) (dialoginterface)).f);
            intent.putExtra("description", ((cfz) (dialoginterface)).e);
            if (((cfz) (dialoginterface)).c > -1L)
            {
                intent.putExtra("beginTime", ((cfz) (dialoginterface)).c);
            }
            if (((cfz) (dialoginterface)).d > -1L)
            {
                intent.putExtra("endTime", ((cfz) (dialoginterface)).d);
            }
            intent.setFlags(0x10000000);
            bkv.e();
            cjj.a(a.a, intent);
        }

            
            {
                a = cfz.this;
                super();
            }
    }


    // Unreferenced inner class cfz$2

/* anonymous class */
    final class _cls2
        implements android.content.DialogInterface.OnClickListener
    {

        private cfz a;

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            a.a("Operation denied by user.");
        }

            
            {
                a = cfz.this;
                super();
            }
    }

}
