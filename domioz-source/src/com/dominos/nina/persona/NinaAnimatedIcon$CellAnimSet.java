// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.DisplayMetrics;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.dominos.nina.persona:
//            RenderState, NinaAnimatedIcon

class reset extends reset
{

    private static final String JSON_KEY_CELL_COUNT = "cellCount";
    private static final String JSON_KEY_CELL_ID_FORMAT = "cellIdFormat";
    private static final String JSON_KEY_CELL_INDEX_START = "indexStart";
    private static final String JSON_KEY_CELL_SELECTOR = "cellSelector";
    private static final String JSON_KEY_CELL_SHEET_ID = "sheet";
    private static final String JSON_KEY_POSITION_OFFSET = "positionOffset";
    private static final String JSON_VALUE_SELECTOR_SEQUENTIAL = "sequential";
    private static final String JSON_VALUE_SELECTOR_VOLUME = "volume";
    private final .reset bitmapAgent;
    private final nt cells[];
    private final String name;
    private final RenderState renderState = new RenderState();
    private final  selector;

    boolean forward()
    {
        return selector.update();
    }

    String getName()
    {
        return name;
    }

    boolean isFinished()
    {
        return selector.isFinished();
    }

    void render(Canvas canvas)
    {
        int i = Math.max(0, selector.getCurrentCell());
        cells[i].draw(canvas, renderState);
    }

    void reset()
    {
        selector.reset();
    }

    nt(Context context, NinaAnimatedIcon ninaanimatedicon, JSONObject jsonobject, int i, int j, String s)
    {
        super(null);
        name = s;
        s = context.getResources();
        context = context.getPackageName();
        int k = jsonobject.optInt("indexStart");
        int l = jsonobject.getInt("cellCount");
        cells = new nt[l];
        float f1 = s.getDisplayMetrics().density;
        float f;
        if (jsonobject.has("positionOffset"))
        {
            JSONArray jsonarray = jsonobject.getJSONArray("positionOffset");
            f = (float)jsonarray.getDouble(0) * f1;
            f1 = (float)jsonarray.getDouble(1) * f1;
        } else
        {
            f = 0.0F;
            f1 = 0.0F;
        }
        if (jsonobject.has("cellSelector"))
        {
            String s1 = jsonobject.getString("cellSelector");
            if ("sequential".equals(s1))
            {
                selector = new llSelector(l, jsonobject);
            } else
            if ("volume".equals(s1))
            {
                selector = new lector(l, jsonobject);
            } else
            {
                throw new IllegalArgumentException((new StringBuilder("Failure parsing nina_animated_icon.json -- Unknown cell selector: ")).append(s1).toString());
            }
        } else
        {
            selector = new llSelector(l, jsonobject);
        }
        s1 = jsonobject.optString("sheet", null);
        if (s1 != null)
        {
            k = s.getIdentifier(s1, "raw", context);
            context = NinaAnimatedIcon.access$200(ninaanimatedicon.globCache, s, k);
            if (11 > android.os.n.globCache)
            {
                bitmapAgent = new pAgent(context, ninaanimatedicon.decoderBitmapCache, k);
            } else
            {
                bitmapAgent = new Agent(context, ninaanimatedicon.decoderBitmapCache);
            }
            for (k = 0; k < l; k++)
            {
                context = new geComponent(bitmapAgent, i, j, f, f1, k);
                cells[k] = context;
            }

        } else
        {
            bitmapAgent = null;
            jsonobject = jsonobject.getString("cellIdFormat");
            for (i = 0; i < l; i++)
            {
                Object obj = String.format(jsonobject, new Object[] {
                    Integer.valueOf(i + k)
                });
                j = s.getIdentifier(((String) (obj)), "drawable", context);
                android.graphics.Bitmap bitmap = NinaAnimatedIcon.access$300(ninaanimatedicon.bitmapCache, s, j);
                if (bitmap == null)
                {
                    throw new RuntimeException((new StringBuilder("Failure parsing nina_animated_icon.json -- Unable to load image with id: ")).append(((String) (obj))).toString());
                }
                obj = new nt(bitmap, f, f1, 0.0F, 0.0F);
                cells[i] = ((nt) (obj));
            }

        }
        reset();
    }
}
