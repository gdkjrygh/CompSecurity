// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.appstatelogger;

import android.support.v4.util.SimpleArrayMap;
import android.util.JsonWriter;
import com.facebook.common.process.ProcessName;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

// Referenced classes of package com.facebook.analytics.appstatelogger:
//            ActivityState

class AppStateSerializer
{

    private AppStateSerializer()
    {
    }

    public static void a(OutputStream outputstream, SimpleArrayMap simplearraymap, ProcessName processname)
    {
        outputstream = new JsonWriter(new OutputStreamWriter(outputstream, "UTF-8"));
        outputstream.beginObject();
        processname = processname.b();
        outputstream.name("processName").value(processname);
        outputstream.name("activities").beginArray();
        int j = simplearraymap.size();
        for (int i = 0; i < j; i++)
        {
            processname = (String)simplearraymap.b(i);
            int k = ((Integer)simplearraymap.c(i)).intValue();
            outputstream.beginObject();
            outputstream.name("name").value(processname);
            outputstream.name("state").value(ActivityState.a(k));
            outputstream.endObject();
        }

        outputstream.endArray();
        outputstream.endObject();
        outputstream.flush();
    }
}
