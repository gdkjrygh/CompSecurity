// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.os.Handler;
import android.os.Looper;
import android.util.JsonWriter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.android.slyce.report.mpmetrics.ab;
import com.android.slyce.report.mpmetrics.ax;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce.report.c:
//            al, ak, y, a, 
//            am, aj, aa

class ai
{

    private final al a = new al();
    private final List b;
    private final ak c = new ak(255);
    private final Handler d = new Handler(Looper.getMainLooper());
    private final ax e;

    public ai(List list, ax ax1)
    {
        b = list;
        e = ax1;
    }

    private void b(JsonWriter jsonwriter, View view)
    {
        float f1 = 0.0F;
        int i = view.getId();
        float f;
        Object obj;
        if (-1 == i)
        {
            obj = null;
        } else
        {
            obj = e.a(i);
        }
        jsonwriter.beginObject();
        jsonwriter.name("hashCode").value(view.hashCode());
        jsonwriter.name("id").value(i);
        jsonwriter.name("mp_id_name").value(((String) (obj)));
        obj = view.getContentDescription();
        if (obj == null)
        {
            jsonwriter.name("contentDescription").nullValue();
        } else
        {
            jsonwriter.name("contentDescription").value(((CharSequence) (obj)).toString());
        }
        obj = view.getTag();
        if (obj == null)
        {
            jsonwriter.name("tag").nullValue();
        } else
        if (obj instanceof CharSequence)
        {
            jsonwriter.name("tag").value(obj.toString());
        }
        jsonwriter.name("top").value(view.getTop());
        jsonwriter.name("left").value(view.getLeft());
        jsonwriter.name("width").value(view.getWidth());
        jsonwriter.name("height").value(view.getHeight());
        jsonwriter.name("scrollX").value(view.getScrollX());
        jsonwriter.name("scrollY").value(view.getScrollY());
        jsonwriter.name("visibility").value(view.getVisibility());
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            f1 = view.getTranslationX();
            f = view.getTranslationY();
        } else
        {
            f = 0.0F;
        }
        jsonwriter.name("translationX").value(f1);
        jsonwriter.name("translationY").value(f);
        jsonwriter.name("classes");
        jsonwriter.beginArray();
        obj = view.getClass();
        do
        {
            jsonwriter.value((String)c.get(obj));
            obj = ((Class) (obj)).getSuperclass();
        } while (obj != java/lang/Object && obj != null);
        jsonwriter.endArray();
        c(jsonwriter, view);
        jsonwriter.name("subviews");
        jsonwriter.beginArray();
        if (view instanceof ViewGroup)
        {
            obj = (ViewGroup)view;
            int k = ((ViewGroup) (obj)).getChildCount();
            for (i = 0; i < k; i++)
            {
                View view2 = ((ViewGroup) (obj)).getChildAt(i);
                if (view2 != null)
                {
                    jsonwriter.value(view2.hashCode());
                }
            }

        }
        jsonwriter.endArray();
        jsonwriter.endObject();
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            int l = view.getChildCount();
            for (int j = 0; j < l; j++)
            {
                View view1 = view.getChildAt(j);
                if (view1 != null)
                {
                    b(jsonwriter, view1);
                }
            }

        }
    }

    private void c(JsonWriter jsonwriter, View view)
    {
        Class class1 = view.getClass();
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            y y1 = (y)iterator.next();
            if (y1.b.isAssignableFrom(class1) && y1.c != null)
            {
                Object obj = y1.c.a(view);
                if (obj != null)
                {
                    if (obj instanceof Number)
                    {
                        jsonwriter.name(y1.a).value((Number)obj);
                    } else
                    if (obj instanceof Boolean)
                    {
                        jsonwriter.name(y1.a).value(((Boolean)obj).booleanValue());
                    } else
                    {
                        jsonwriter.name(y1.a).value(obj.toString());
                    }
                }
            }
        } while (true);
    }

    void a(JsonWriter jsonwriter, View view)
    {
        jsonwriter.beginArray();
        b(jsonwriter, view);
        jsonwriter.endArray();
    }

    public void a(aa aa, OutputStream outputstream)
    {
        Object obj;
        a.a(aa);
        obj = new FutureTask(a);
        d.post(((Runnable) (obj)));
        aa = new OutputStreamWriter(outputstream);
        int j;
        obj = (List)((FutureTask) (obj)).get(1L, TimeUnit.SECONDS);
        j = ((List) (obj)).size();
        aa.write("[");
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        aa.write(",");
        am am1 = (am)((List) (obj)).get(i);
        aa.write("{");
        aa.write("\"activity\":");
        aa.write(JSONObject.quote(am1.a));
        aa.write(",");
        aa.write("\"scale\":");
        aa.write(String.format("%s", new Object[] {
            Float.valueOf(am1.d)
        }));
        aa.write(",");
        aa.write("\"serialized_objects\":");
        JsonWriter jsonwriter = new JsonWriter(aa);
        jsonwriter.beginObject();
        jsonwriter.name("rootObject").value(am1.b.hashCode());
        jsonwriter.name("objects");
        a(jsonwriter, am1.b);
        jsonwriter.endObject();
        jsonwriter.flush();
        aa.write(",");
        aa.write("\"screenshot\":");
        aa.flush();
        am1.c.a(android.graphics.Bitmap.CompressFormat.PNG, 100, outputstream);
        aa.write("}");
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        aa.write("]");
        aa.flush();
_L4:
        return;
        aa;
        if (!ab.a) goto _L4; else goto _L3
_L3:
        Log.d("MixpanelAPI.ViewSnapshot", "Screenshot interrupted, no screenshot will be sent.", aa);
        return;
        aa;
        if (!ab.a) goto _L4; else goto _L5
_L5:
        Log.i("MixpanelAPI.ViewSnapshot", "Screenshot took more than 1 second to be scheduled and executed. No screenshot will be sent.", aa);
        return;
        aa;
        if (ab.a)
        {
            Log.e("MixpanelAPI.ViewSnapshot", "Exception thrown during screenshot attempt", aa);
            return;
        }
          goto _L4
    }
}
