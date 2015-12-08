// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64OutputStream;
import android.util.DisplayMetrics;
import android.util.JsonWriter;
import android.util.Log;
import android.util.LruCache;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.mixpanel.android.mpmetrics.g;
import com.mixpanel.android.mpmetrics.l;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            f, a, h

class k
{
    private static class a
    {

        private Bitmap a;
        private final Paint b = new Paint(2);

        public void a(int i, int j, int i1, Bitmap bitmap)
        {
            this;
            JVM INSTR monitorenter ;
            if (a == null || a.getWidth() != i) goto _L2; else goto _L1
_L1:
            int j1 = a.getHeight();
            if (j1 == j) goto _L3; else goto _L2
_L2:
            a = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.RGB_565);
_L4:
            if (a != null)
            {
                a.setDensity(i1);
            }
_L3:
            if (a != null)
            {
                (new Canvas(a)).drawBitmap(bitmap, 0.0F, 0.0F, b);
            }
            this;
            JVM INSTR monitorexit ;
            return;
            OutOfMemoryError outofmemoryerror;
            outofmemoryerror;
            a = null;
              goto _L4
            bitmap;
            throw bitmap;
        }

        public void a(android.graphics.Bitmap.CompressFormat compressformat, int i, OutputStream outputstream)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (a != null && a.getWidth() != 0 && a.getHeight() != 0) goto _L2; else goto _L1
_L1:
            outputstream.write("null".getBytes());
_L4:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            outputstream.write(34);
            compressformat = new Base64OutputStream(outputstream, 2);
            a.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, compressformat);
            compressformat.flush();
            outputstream.write(34);
            if (true) goto _L4; else goto _L3
_L3:
            compressformat;
            throw compressformat;
        }

        public a()
        {
            a = null;
        }
    }

    private static class b extends LruCache
    {

        protected String a(Class class1)
        {
            return class1.getCanonicalName();
        }

        protected Object create(Object obj)
        {
            return a((Class)obj);
        }

        public b(int i)
        {
            super(i);
        }
    }

    private static class c
        implements Callable
    {

        private h a;
        private final List b = new ArrayList();
        private final DisplayMetrics c = new DisplayMetrics();
        private final a d = new a();
        private final int e = 160;

        private void a(d d1)
        {
            Boolean boolean1;
            View view;
            view = d1.b;
            float f1;
            float f2;
            Object obj;
            Bitmap bitmap;
            int i;
            int j;
            int i1;
            int j1;
            try
            {
                obj = android/view/View.getDeclaredMethod("createSnapshot", new Class[] {
                    android/graphics/Bitmap$Config, Integer.TYPE, Boolean.TYPE
                });
                ((Method) (obj)).setAccessible(true);
                obj = (Bitmap)((Method) (obj)).invoke(view, new Object[] {
                    android.graphics.Bitmap.Config.RGB_565, Integer.valueOf(-1), Boolean.valueOf(false)
                });
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                if (g.b)
                {
                    Log.v("MixpanelAPI.Snapshot", "Can't call createSnapshot, will use drawCache", nosuchmethodexception);
                }
                nosuchmethodexception = null;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                Log.d("MixpanelAPI.Snapshot", "Can't call createSnapshot with arguments", illegalargumentexception);
                illegalargumentexception = null;
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                Log.e("MixpanelAPI.Snapshot", "Exception when calling createSnapshot", invocationtargetexception);
                invocationtargetexception = null;
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                Log.e("MixpanelAPI.Snapshot", "Can't access createSnapshot, using drawCache", illegalaccessexception);
                illegalaccessexception = null;
            }
            catch (ClassCastException classcastexception)
            {
                Log.e("MixpanelAPI.Snapshot", "createSnapshot didn't return a bitmap?", classcastexception);
                classcastexception = null;
            }
            if (obj != null) goto _L2; else goto _L1
_L1:
            boolean1 = Boolean.valueOf(view.isDrawingCacheEnabled());
            view.setDrawingCacheEnabled(true);
            view.buildDrawingCache(true);
            bitmap = view.getDrawingCache();
            obj = bitmap;
_L5:
            f1 = 1.0F;
            f2 = f1;
            if (obj != null)
            {
                i = ((Bitmap) (obj)).getDensity();
                if (i != 0)
                {
                    f1 = 160F / (float)i;
                }
                i = ((Bitmap) (obj)).getWidth();
                j = ((Bitmap) (obj)).getHeight();
                i1 = (int)((double)((float)((Bitmap) (obj)).getWidth() * f1) + 0.5D);
                j1 = (int)((double)((float)((Bitmap) (obj)).getHeight() * f1) + 0.5D);
                f2 = f1;
                if (i > 0)
                {
                    f2 = f1;
                    if (j > 0)
                    {
                        f2 = f1;
                        if (i1 > 0)
                        {
                            f2 = f1;
                            if (j1 > 0)
                            {
                                d.a(i1, j1, 160, ((Bitmap) (obj)));
                                f2 = f1;
                            }
                        }
                    }
                }
            }
            if (boolean1 != null && !boolean1.booleanValue())
            {
                view.setDrawingCacheEnabled(false);
            }
            d1.d = f2;
            d1.c = d;
            return;
            RuntimeException runtimeexception;
            runtimeexception;
            boolean1 = null;
_L3:
            if (g.b)
            {
                Log.v("MixpanelAPI.Snapshot", (new StringBuilder()).append("Can't take a bitmap snapshot of view ").append(view).append(", skipping for now.").toString(), runtimeexception);
            }
            continue; /* Loop/switch isn't completed */
            runtimeexception;
            if (true) goto _L3; else goto _L2
_L2:
            boolean1 = null;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public List a()
            throws Exception
        {
            b.clear();
            Object obj;
            for (Iterator iterator = a.a().iterator(); iterator.hasNext(); b.add(obj))
            {
                obj = (Activity)iterator.next();
                String s = obj.getClass().getCanonicalName();
                View view = ((Activity) (obj)).getWindow().getDecorView().getRootView();
                ((Activity) (obj)).getWindowManager().getDefaultDisplay().getMetrics(c);
                obj = new d(s, view);
            }

            int j = b.size();
            for (int i = 0; i < j; i++)
            {
                a((d)b.get(i));
            }

            return b;
        }

        public void a(h h1)
        {
            a = h1;
        }

        public Object call()
            throws Exception
        {
            return a();
        }

        public c()
        {
        }
    }

    private static class d
    {

        public final String a;
        public final View b;
        public a c;
        public float d;

        public d(String s, View view)
        {
            a = s;
            b = view;
            c = null;
            d = 1.0F;
        }
    }


    private static final int f = 255;
    private static final String g = "MixpanelAPI.Snapshot";
    private final c a = new c();
    private final List b;
    private final b c = new b(255);
    private final Handler d = new Handler(Looper.getMainLooper());
    private final l e;

    public k(List list, l l1)
    {
        b = list;
        e = l1;
    }

    private void b(JsonWriter jsonwriter, View view)
        throws IOException
    {
        float f2 = 0.0F;
        int i = view.getId();
        float f1;
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
            f2 = view.getTranslationX();
            f1 = view.getTranslationY();
        } else
        {
            f1 = 0.0F;
        }
        jsonwriter.name("translationX").value(f2);
        jsonwriter.name("translationY").value(f1);
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
        obj = view.getLayoutParams();
        if (obj instanceof android.widget.RelativeLayout.LayoutParams)
        {
            obj = ((android.widget.RelativeLayout.LayoutParams)obj).getRules();
            jsonwriter.name("layoutRules");
            jsonwriter.beginArray();
            int j1 = obj.length;
            for (i = 0; i < j1; i++)
            {
                jsonwriter.value(obj[i]);
            }

            jsonwriter.endArray();
        }
        jsonwriter.name("subviews");
        jsonwriter.beginArray();
        if (view instanceof ViewGroup)
        {
            ViewGroup viewgroup = (ViewGroup)view;
            int k1 = viewgroup.getChildCount();
            for (int j = 0; j < k1; j++)
            {
                View view2 = viewgroup.getChildAt(j);
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
            int l1 = view.getChildCount();
            for (int i1 = 0; i1 < l1; i1++)
            {
                View view1 = view.getChildAt(i1);
                if (view1 != null)
                {
                    b(jsonwriter, view1);
                }
            }

        }
    }

    private void c(JsonWriter jsonwriter, View view)
        throws IOException
    {
        Class class1 = view.getClass();
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (f)iterator.next();
            if (((f) (obj)).b.isAssignableFrom(class1) && ((f) (obj)).c != null)
            {
                Object obj1 = ((f) (obj)).c.a(view);
                if (obj1 != null)
                {
                    if (obj1 instanceof Number)
                    {
                        jsonwriter.name(((f) (obj)).a).value((Number)obj1);
                    } else
                    if (obj1 instanceof Boolean)
                    {
                        jsonwriter.name(((f) (obj)).a).value(((Boolean)obj1).booleanValue());
                    } else
                    if (obj1 instanceof ColorStateList)
                    {
                        jsonwriter.name(((f) (obj)).a).value(Integer.valueOf(((ColorStateList)obj1).getDefaultColor()));
                    } else
                    if (obj1 instanceof Drawable)
                    {
                        obj1 = (Drawable)obj1;
                        Rect rect = ((Drawable) (obj1)).getBounds();
                        jsonwriter.name(((f) (obj)).a);
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
                        jsonwriter.name(((f) (obj)).a).value(obj1.toString());
                    }
                }
            }
        } while (true);
    }

    List a()
    {
        return b;
    }

    void a(JsonWriter jsonwriter, View view)
        throws IOException
    {
        jsonwriter.beginArray();
        b(jsonwriter, view);
        jsonwriter.endArray();
    }

    public void a(h h, OutputStream outputstream)
        throws IOException
    {
        Object obj;
        OutputStreamWriter outputstreamwriter;
        a.a(h);
        h = new FutureTask(a);
        d.post(h);
        outputstreamwriter = new OutputStreamWriter(outputstream);
        obj = Collections.emptyList();
        outputstreamwriter.write("[");
        h = (List)h.get(1L, TimeUnit.SECONDS);
_L2:
        int j = h.size();
        for (int i = 0; i < j; i++)
        {
            if (i > 0)
            {
                outputstreamwriter.write(",");
            }
            obj = (d)h.get(i);
            outputstreamwriter.write("{");
            outputstreamwriter.write("\"activity\":");
            outputstreamwriter.write(JSONObject.quote(((d) (obj)).a));
            outputstreamwriter.write(",");
            outputstreamwriter.write("\"scale\":");
            outputstreamwriter.write(String.format("%s", new Object[] {
                Float.valueOf(((d) (obj)).d)
            }));
            outputstreamwriter.write(",");
            outputstreamwriter.write("\"serialized_objects\":");
            JsonWriter jsonwriter = new JsonWriter(outputstreamwriter);
            jsonwriter.beginObject();
            jsonwriter.name("rootObject").value(((d) (obj)).b.hashCode());
            jsonwriter.name("objects");
            a(jsonwriter, ((d) (obj)).b);
            jsonwriter.endObject();
            jsonwriter.flush();
            outputstreamwriter.write(",");
            outputstreamwriter.write("\"screenshot\":");
            outputstreamwriter.flush();
            ((d) (obj)).c.a(android.graphics.Bitmap.CompressFormat.PNG, 100, outputstream);
            outputstreamwriter.write("}");
        }

        break; /* Loop/switch isn't completed */
        Object obj1;
        obj1;
        h = ((h) (obj));
        if (g.b)
        {
            Log.d("MixpanelAPI.Snapshot", "Screenshot interrupted, no screenshot will be sent.", ((Throwable) (obj1)));
            h = ((h) (obj));
        }
        continue; /* Loop/switch isn't completed */
        obj1;
        h = ((h) (obj));
        if (g.b)
        {
            Log.i("MixpanelAPI.Snapshot", "Screenshot took more than 1 second to be scheduled and executed. No screenshot will be sent.", ((Throwable) (obj1)));
            h = ((h) (obj));
        }
        continue; /* Loop/switch isn't completed */
        obj1;
        h = ((h) (obj));
        if (g.b)
        {
            Log.e("MixpanelAPI.Snapshot", "Exception thrown during screenshot attempt", ((Throwable) (obj1)));
            h = ((h) (obj));
        }
        if (true) goto _L2; else goto _L1
_L1:
        outputstreamwriter.write("]");
        outputstreamwriter.flush();
        return;
    }
}
