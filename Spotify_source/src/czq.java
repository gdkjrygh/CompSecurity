// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.JsonWriter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

public final class czq
{

    private final czt a = new czt();
    private final List b;
    private final czs c = new czs();
    private final Handler d = new Handler(Looper.getMainLooper());
    private final cxu e;

    public czq(List list, cxu cxu1)
    {
        b = list;
        e = cxu1;
    }

    private void a(JsonWriter jsonwriter, View view)
    {
        float f1 = 0.0F;
        int i = view.getId();
        float f;
        Object obj;
        Class class1;
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
        class1 = view.getClass();
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            obj = (czf)iterator.next();
            if (((czf) (obj)).b.isAssignableFrom(class1) && ((czf) (obj)).c != null)
            {
                Object obj1 = ((czf) (obj)).c.a(view);
                if (obj1 != null)
                {
                    if (obj1 instanceof Number)
                    {
                        jsonwriter.name(((czf) (obj)).a).value((Number)obj1);
                    } else
                    if (obj1 instanceof Boolean)
                    {
                        jsonwriter.name(((czf) (obj)).a).value(((Boolean)obj1).booleanValue());
                    } else
                    if (obj1 instanceof ColorStateList)
                    {
                        jsonwriter.name(((czf) (obj)).a).value(Integer.valueOf(((ColorStateList)obj1).getDefaultColor()));
                    } else
                    if (obj1 instanceof Drawable)
                    {
                        obj1 = (Drawable)obj1;
                        Rect rect = ((Drawable) (obj1)).getBounds();
                        jsonwriter.name(((czf) (obj)).a);
                        jsonwriter.beginObject();
                        jsonwriter.name("classes");
                        jsonwriter.beginArray();
                        for (obj = obj1.getClass(); obj != java/lang/Object; obj = ((Class) (obj)).getSuperclass())
                        {
                            jsonwriter.value(((Class) (obj)).getCanonicalName());
                        }

                        jsonwriter.endArray();
                        jsonwriter.name("dimensions");
                        jsonwriter.beginObject();
                        jsonwriter.name("left").value(rect.left);
                        jsonwriter.name("right").value(rect.right);
                        jsonwriter.name("top").value(rect.top);
                        jsonwriter.name("bottom").value(rect.bottom);
                        jsonwriter.endObject();
                        if (obj1 instanceof ColorDrawable)
                        {
                            obj = (ColorDrawable)obj1;
                            jsonwriter.name("color").value(((ColorDrawable) (obj)).getColor());
                        }
                        jsonwriter.endObject();
                    } else
                    {
                        jsonwriter.name(((czf) (obj)).a).value(obj1.toString());
                    }
                }
            }
        }

        obj = view.getLayoutParams();
        if (obj instanceof android.widget.RelativeLayout.LayoutParams)
        {
            int ai[] = ((android.widget.RelativeLayout.LayoutParams)obj).getRules();
            jsonwriter.name("layoutRules");
            jsonwriter.beginArray();
            int i1 = ai.length;
            for (int j = 0; j < i1; j++)
            {
                jsonwriter.value(ai[j]);
            }

            jsonwriter.endArray();
        }
        jsonwriter.name("subviews");
        jsonwriter.beginArray();
        if (view instanceof ViewGroup)
        {
            ViewGroup viewgroup = (ViewGroup)view;
            int j1 = viewgroup.getChildCount();
            for (int k = 0; k < j1; k++)
            {
                View view2 = viewgroup.getChildAt(k);
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
            int k1 = view.getChildCount();
            for (int l = 0; l < k1; l++)
            {
                View view1 = view.getChildAt(l);
                if (view1 != null)
                {
                    a(jsonwriter, view1);
                }
            }

        }
    }

    public final void a(czh czh, OutputStream outputstream)
    {
        Object obj;
        OutputStreamWriter outputstreamwriter;
        a.a = czh;
        czh = new FutureTask(a);
        d.post(czh);
        outputstreamwriter = new OutputStreamWriter(outputstream);
        obj = Collections.emptyList();
        outputstreamwriter.write("[");
        czh = (List)czh.get(1L, TimeUnit.SECONDS);
_L2:
        int j = czh.size();
        for (int i = 0; i < j; i++)
        {
            if (i > 0)
            {
                outputstreamwriter.write(",");
            }
            obj = (czu)czh.get(i);
            outputstreamwriter.write("{");
            outputstreamwriter.write("\"activity\":");
            outputstreamwriter.write(JSONObject.quote(((czu) (obj)).a));
            outputstreamwriter.write(",");
            outputstreamwriter.write("\"scale\":");
            outputstreamwriter.write(String.format("%s", new Object[] {
                Float.valueOf(((czu) (obj)).d)
            }));
            outputstreamwriter.write(",");
            outputstreamwriter.write("\"serialized_objects\":");
            Object obj1 = new JsonWriter(outputstreamwriter);
            ((JsonWriter) (obj1)).beginObject();
            ((JsonWriter) (obj1)).name("rootObject").value(((czu) (obj)).b.hashCode());
            ((JsonWriter) (obj1)).name("objects");
            View view = ((czu) (obj)).b;
            ((JsonWriter) (obj1)).beginArray();
            a(((JsonWriter) (obj1)), view);
            ((JsonWriter) (obj1)).endArray();
            ((JsonWriter) (obj1)).endObject();
            ((JsonWriter) (obj1)).flush();
            outputstreamwriter.write(",");
            outputstreamwriter.write("\"screenshot\":");
            outputstreamwriter.flush();
            obj = ((czu) (obj)).c;
            obj1 = android.graphics.Bitmap.CompressFormat.PNG;
            ((czr) (obj)).a(outputstream);
            outputstreamwriter.write("}");
        }

        break; /* Loop/switch isn't completed */
        Object obj2;
        obj2;
        czh = ((czh) (obj));
        if (cxi.a)
        {
            Log.d("MixpanelAPI.Snapshot", "Screenshot interrupted, no screenshot will be sent.", ((Throwable) (obj2)));
            czh = ((czh) (obj));
        }
        continue; /* Loop/switch isn't completed */
        obj2;
        czh = ((czh) (obj));
        if (cxi.a)
        {
            Log.i("MixpanelAPI.Snapshot", "Screenshot took more than 1 second to be scheduled and executed. No screenshot will be sent.", ((Throwable) (obj2)));
            czh = ((czh) (obj));
        }
        continue; /* Loop/switch isn't completed */
        obj2;
        czh = ((czh) (obj));
        if (cxi.a)
        {
            Log.e("MixpanelAPI.Snapshot", "Exception thrown during screenshot attempt", ((Throwable) (obj2)));
            czh = ((czh) (obj));
        }
        if (true) goto _L2; else goto _L1
_L1:
        outputstreamwriter.write("]");
        outputstreamwriter.flush();
        return;
    }
}
