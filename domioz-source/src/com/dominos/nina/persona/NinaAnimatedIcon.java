// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.dominos.nina.persona:
//            NinaAnimConstants, VolumeAnim

public class NinaAnimatedIcon extends View
{

    private static final String CHARSET_ENCODING = "UTF-8";
    private static final int DEFAULT_FRAMERATE = 20;
    private static final String GLOB_DATA_RAW_TYPE = "raw";
    private static final String IMAGE_COMPONENT_DRAWABLE_TYPE = "drawable";
    private static final String JSON_KEY_ANIMATION_SETS = "animationSets";
    private static final String JSON_KEY_ANIMATION_SET_ALERT = "alert";
    private static final String JSON_KEY_ANIMATION_SET_DICTATION_LISTENING = "dictationListening";
    private static final String JSON_KEY_ANIMATION_SET_DICTATION_PROCESSING = "dictationProcessing";
    private static final String JSON_KEY_ANIMATION_SET_HINTS_RAISED_ACCENT = "hintsRaisedAccent";
    private static final String JSON_KEY_ANIMATION_SET_LISTENING = "listening";
    private static final String JSON_KEY_ANIMATION_SET_OFF = "off";
    private static final String JSON_KEY_ANIMATION_SET_PROCESSING = "processing";
    private static final String JSON_KEY_ANIMATION_SET_PROCESSING_COMPLETE = "processingComplete";
    private static final String JSON_KEY_ANIMATION_SET_PROMPT = "prompt";
    private static final String JSON_KEY_ANIMATION_SET_SLEEPING = "sleeping";
    private static final String JSON_KEY_CONSTANTS = "constants";
    private static final String JSON_KEY_DENSITY_HIGH = "hdpi";
    private static final String JSON_KEY_DENSITY_LOW = "ldpi";
    private static final String JSON_KEY_DENSITY_MEDIUM = "mdpi";
    private static final String JSON_KEY_DENSITY_TV = "tvdpi";
    private static final String JSON_KEY_DENSITY_XHIGH = "xhdpi";
    private static final String JSON_KEY_DENSITY_XXHIGH = "xxhdpi";
    private static final String JSON_KEY_DIMENSIONS = "dimensions";
    private static final String JSON_KEY_FRAMERATE = "frameRate";
    private static final String JSON_KEY_IMAGE_COMPONENTS = "imageComponents";
    private static final String JSON_KEY_IMAGE_COMPONENT_RESOURCE_NAME_FORMAT = "imageComponentResourceNameFormat";
    private static final String JSON_KEY_OFFSETS = "offsets";
    private static final String LOGTAG = "NinaAnimatedIcon";
    private static final SparseArray densityMap;
    private final AnimSet alertAnimSet;
    private final AtomicReference atomicTimer;
    private Bitmap backBuffer;
    private Canvas backCanvas;
    final SparseArray bitmapCache;
    private AnimSet currentAnimSet;
    final SparseArray decoderBitmapCache;
    private final AnimSet dictationListeningAnimSet;
    private boolean dictationMode;
    private final AnimSet dictationProcessingAnimSet;
    private final int frameTime;
    private Bitmap frontBuffer;
    private Canvas frontCanvas;
    final SparseArray globCache;
    private final AnimSet hintsRaisedAccentAnimSet;
    final int iconHeight;
    final int iconWidth;
    final HashMap imageComponentHash;
    final String imageComponentNames[];
    private final AnimSet listeningAnimSet;
    private final AnimSet offAnimSet;
    private final AnimSet processingAnimSet;
    private final AnimSet processingCompleteAnimSet;
    private final AnimSet promptAnimSet;
    private final AnimSet sleepingAnimSet;

    public NinaAnimatedIcon(Context context)
    {
        this(context, null);
    }

    public NinaAnimatedIcon(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NinaAnimatedIcon(Context context, AttributeSet attributeset, int i)
    {
        InputStream inputstream;
        Resources resources;
        DisplayMetrics displaymetrics;
        int j;
        super(context, attributeset, i);
        bitmapCache = new SparseArray();
        globCache = new SparseArray();
        imageComponentHash = new HashMap();
        decoderBitmapCache = new SparseArray();
        dictationMode = false;
        atomicTimer = new AtomicReference();
        resources = getResources();
        displaymetrics = resources.getDisplayMetrics();
        i = displaymetrics.densityDpi;
        j = R.raw.nina_animated_icon;
        inputstream = resources.openRawResource(j);
        JSONObject jsonobject1;
        String s;
        int k;
        s = context.getPackageName();
        jsonobject1 = new JSONObject(new String(readAllFromStream(inputstream), "UTF-8"));
        k = jsonobject1.optInt("frameRate", 20);
        frameTime = 1000 / k;
        float f = 1.0F;
        Object obj = (String)densityMap.get(i);
        attributeset = ((AttributeSet) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        Log.w("NinaAnimatedIcon", (new StringBuilder("Unknown density ")).append(i).append(", deriving size and offsets from mdpi").toString());
        attributeset = "mdpi";
        f = displaymetrics.density;
        JSONObject jsonobject2 = jsonobject1.getJSONObject("dimensions");
        float f1;
        Object obj1;
        obj1 = attributeset;
        f1 = f;
        if (jsonobject2.has(attributeset))
        {
            break MISSING_BLOCK_LABEL_371;
        }
        obj = attributeset;
        if ("mdpi".equals(attributeset))
        {
            break MISSING_BLOCK_LABEL_286;
        }
        Log.w("NinaAnimatedIcon", (new StringBuilder("No icon dimensions for density ")).append(attributeset).append(", deriving size and offsets from mdpi").toString());
        obj = "mdpi";
        f = displaymetrics.density;
        obj1 = obj;
        f1 = f;
        if (!jsonobject2.has(((String) (obj))))
        {
            throw new UnsupportedOperationException((new StringBuilder("No icon dimensions specified for density ")).append(((String) (obj))).toString());
        }
        break MISSING_BLOCK_LABEL_371;
        context;
        throw new RuntimeException((new StringBuilder("Failure parsing ")).append(resources.getResourceEntryName(j)).toString(), context);
        context;
        closeQuietly(inputstream);
        throw context;
        attributeset = jsonobject2.getJSONArray(((String) (obj1)));
        iconWidth = (int)(0.5F + (float)attributeset.getInt(0) * f1);
        iconHeight = (int)((float)attributeset.getInt(1) * f1 + 0.5F);
        attributeset = jsonobject1.getJSONObject("offsets");
        if (!attributeset.has(((String) (obj1))))
        {
            throw new UnsupportedOperationException((new StringBuilder("No component offsets specified for density ")).append(((String) (obj1))).toString());
        }
        break MISSING_BLOCK_LABEL_491;
        context;
        throw new RuntimeException((new StringBuilder("Failure reading ")).append(resources.getResourceEntryName(j)).toString(), context);
        float f2;
        int l;
        attributeset = attributeset.getJSONObject(((String) (obj1)));
        obj = jsonobject1.getJSONArray("imageComponents");
        l = ((JSONArray) (obj)).length();
        imageComponentNames = new String[l];
        f = iconWidth;
        f2 = iconHeight;
        obj1 = jsonobject1.getString("imageComponentResourceNameFormat");
        i = 0;
_L2:
        if (i >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        String s1 = ((JSONArray) (obj)).getString(i);
        imageComponentNames[i] = s1;
        int i1 = resources.getIdentifier(String.format(((String) (obj1)), new Object[] {
            s1
        }), "drawable", s);
        Object obj2 = getBitmap(bitmapCache, resources, i1);
        if (!attributeset.has(s1))
        {
            throw new UnsupportedOperationException((new StringBuilder("No component offsets specified for image component ")).append(s1).toString());
        }
        JSONArray jsonarray = attributeset.getJSONArray(s1);
        obj2 = new ImageComponent(((Bitmap) (obj2)), (float)jsonarray.getInt(0) * f1, (float)jsonarray.getInt(1) * f1, 0.5F * f, 0.5F * f2);
        imageComponentHash.put(s1, obj2);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        attributeset = new NinaAnimConstants(displaymetrics.density, k, jsonobject1.getJSONObject("constants"));
        JSONObject jsonobject = jsonobject1.getJSONObject("animationSets");
        context = new AnimSetFactory(context, imageComponentNames, imageComponentHash, attributeset);
        offAnimSet = context.createAnimSet(jsonobject.getJSONObject("off"), "off");
        alertAnimSet = context.createAnimSet(jsonobject.getJSONObject("alert"), "alert");
        promptAnimSet = context.createAnimSet(jsonobject.getJSONObject("prompt"), "prompt");
        sleepingAnimSet = context.createAnimSet(jsonobject.getJSONObject("sleeping"), "sleeping");
        listeningAnimSet = context.createAnimSet(jsonobject.getJSONObject("listening"), "listening");
        processingAnimSet = context.createAnimSet(jsonobject.getJSONObject("processing"), "processing");
        processingCompleteAnimSet = context.createAnimSet(jsonobject.getJSONObject("processingComplete"), "processingComplete");
        hintsRaisedAccentAnimSet = context.createAnimSet(jsonobject.optJSONObject("hintsRaisedAccent"), "hintsRaisedAccent");
        dictationListeningAnimSet = context.createAnimSet(jsonobject.getJSONObject("dictationListening"), "dictationListening");
        dictationProcessingAnimSet = context.createAnimSet(jsonobject.getJSONObject("dictationProcessing"), "dictationProcessing");
        currentAnimSet = offAnimSet;
        closeQuietly(inputstream);
        frontBuffer = Bitmap.createBitmap(iconWidth, iconHeight, android.graphics.Bitmap.Config.ARGB_8888);
        frontCanvas = new Canvas(frontBuffer);
        backBuffer = Bitmap.createBitmap(iconWidth, iconHeight, android.graphics.Bitmap.Config.ARGB_8888);
        backCanvas = new Canvas(backBuffer);
        return;
    }

    private void activateAnimSet(AnimSet animset)
    {
        if (animset != currentAnimSet)
        {
            animset.reset();
        }
        currentAnimSet = animset;
    }

    static void closeQuietly(InputStream inputstream)
    {
        try
        {
            inputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return;
        }
    }

    private static Bitmap getBitmap(SparseArray sparsearray, Resources resources, int i)
    {
        Bitmap bitmap1 = (Bitmap)sparsearray.get(i);
        Bitmap bitmap = bitmap1;
        if (bitmap1 == null)
        {
            bitmap = BitmapFactory.decodeResource(resources, i);
            sparsearray.put(i, bitmap);
        }
        return bitmap;
    }

    private static BitmapGlob getBitmapGlob(SparseArray sparsearray, Resources resources, int i)
    {
        BitmapGlob bitmapglob = (BitmapGlob)sparsearray.get(i);
        if (bitmapglob != null)
        {
            return bitmapglob;
        }
        resources = resources.openRawResource(i);
        BitmapGlob bitmapglob1;
        bitmapglob1 = new BitmapGlob(resources);
        sparsearray.put(i, bitmapglob1);
        closeQuietly(resources);
        return bitmapglob1;
        sparsearray;
        closeQuietly(resources);
        throw sparsearray;
    }

    private void pushAnimSet(AnimSet animset)
    {
        if (animset == null)
        {
            return;
        } else
        {
            animset.next = currentAnimSet;
            activateAnimSet(animset);
            return;
        }
    }

    static byte[] readAllFromStream(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        byte abyte0[] = new byte[1024];
        do
        {
            int i = inputstream.read(abyte0);
            if (i >= 0)
            {
                bytearrayoutputstream.write(abyte0, 0, i);
            } else
            {
                return bytearrayoutputstream.toByteArray();
            }
        } while (true);
    }

    private void swapBuffers()
    {
        Object obj = frontBuffer;
        frontBuffer = backBuffer;
        backBuffer = ((Bitmap) (obj));
        obj = frontCanvas;
        frontCanvas = backCanvas;
        backCanvas = ((Canvas) (obj));
    }

    void alert()
    {
        activateAnimSet(alertAnimSet);
    }

    void destroy()
    {
        boolean flag = false;
        for (int i = 0; i < bitmapCache.size(); i++)
        {
            int l = bitmapCache.keyAt(i);
            ((Bitmap)bitmapCache.get(l)).recycle();
        }

        bitmapCache.clear();
        globCache.clear();
        for (int j = ((flag) ? 1 : 0); j < decoderBitmapCache.size(); j++)
        {
            int k = decoderBitmapCache.keyAt(j);
            ((BitmapCacheTuple)decoderBitmapCache.get(k)).bitmap.recycle();
        }

        decoderBitmapCache.clear();
        frontBuffer.recycle();
        backBuffer.recycle();
    }

    void hintsRaised()
    {
        pushAnimSet(hintsRaisedAccentAnimSet);
    }

    protected void onDraw(Canvas canvas)
    {
        canvas.drawBitmap(frontBuffer, 0.0F, 0.0F, null);
    }

    protected void onMeasure(int i, int j)
    {
        setMeasuredDimension(iconWidth, iconHeight);
    }

    void pause()
    {
        Timer timer = (Timer)atomicTimer.getAndSet(null);
        if (timer != null)
        {
            timer.cancel();
        }
    }

    void popAnimSet()
    {
        AnimSet animset = currentAnimSet.next;
        if (animset != null)
        {
            currentAnimSet.next = null;
            currentAnimSet = animset;
        }
    }

    void processingComplete()
    {
        activateAnimSet(processingCompleteAnimSet);
    }

    void prompt()
    {
        activateAnimSet(promptAnimSet);
    }

    protected void render()
    {
        Canvas canvas = backCanvas;
        canvas.save();
        canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        currentAnimSet.render(canvas);
        canvas.restore();
        swapBuffers();
        postInvalidate();
    }

    void reset()
    {
        activateAnimSet(offAnimSet);
        setVolumeIntensity(0.0F);
    }

    void resume()
    {
        Timer timer = new Timer();
        Timer timer1 = (Timer)atomicTimer.getAndSet(timer);
        if (timer1 != null)
        {
            timer1.cancel();
        }
        timer.schedule(new _cls1(), frameTime, frameTime);
    }

    void setDictationMode(boolean flag)
    {
        dictationMode = flag;
    }

    void setVolumeIntensity(float f)
    {
        VolumeCellSelector.volumeIntensity = f;
        VolumeAnim.volumeIntensity = f;
    }

    void toEditing()
    {
        activateAnimSet(offAnimSet);
    }

    void toLimbo()
    {
        activateAnimSet(offAnimSet);
    }

    void toListening()
    {
        setVolumeIntensity(0.0F);
        if (dictationMode)
        {
            activateAnimSet(dictationListeningAnimSet);
            return;
        } else
        {
            activateAnimSet(listeningAnimSet);
            return;
        }
    }

    void toProcessing()
    {
        if (dictationMode)
        {
            activateAnimSet(dictationProcessingAnimSet);
            return;
        } else
        {
            activateAnimSet(processingAnimSet);
            return;
        }
    }

    void toSleep()
    {
        activateAnimSet(sleepingAnimSet);
    }

    protected void update()
    {
        AnimSet animset = currentAnimSet.next;
        if (currentAnimSet.isFinished() && animset != null)
        {
            currentAnimSet.next = null;
            currentAnimSet = animset;
        }
        currentAnimSet.forward();
    }

    static 
    {
        SparseArray sparsearray = new SparseArray(4);
        densityMap = sparsearray;
        sparsearray.put(120, "ldpi");
        densityMap.put(160, "mdpi");
        densityMap.put(240, "hdpi");
        densityMap.put(213, "tvdpi");
        densityMap.put(320, "xhdpi");
        densityMap.put(480, "xxhdpi");
    }



    private class ImageComponent
    {

        final Bitmap bitmap;
        final float centerX;
        final float centerY;
        final float left;
        final Paint paint = new Paint();
        final float top;

        void draw(Canvas canvas, RenderState renderstate)
        {
            canvas.save();
            canvas.translate(renderstate.translateX, renderstate.translateY);
            canvas.rotate(renderstate.rotation, centerX, centerY);
            canvas.scale(renderstate.scaleX, renderstate.scaleY, centerX, centerY);
            paint.setColorFilter(new PorterDuffColorFilter(renderstate.color, android.graphics.PorterDuff.Mode.MULTIPLY));
            canvas.drawBitmap(bitmap, left, top, paint);
            canvas.restore();
        }

        ImageComponent(Bitmap bitmap1, float f, float f1, float f2, float f3)
        {
            bitmap = bitmap1;
            left = f;
            top = f1;
            centerX = f2;
            centerY = f3;
        }
    }


    private class AnimSetFactory
    {

        private static final String JSON_KEY_CELL_DATA = "cellData";
        private static final String JSON_KEY_CELL_SETS = "cellSets";
        private static final String JSON_KEY_IMAGE_COMPONENTS = "imageComponents";
        private final NinaAnimConstants animConstants;
        private final HashMap componentHash;
        private final Context context;
        private final String imageComponentNames[];
        final NinaAnimatedIcon this$0;

        AnimSet createAnimSet(JSONObject jsonobject, String s)
        {
            if (jsonobject == null)
            {
                return null;
            }
            if (jsonobject.has("cellData"))
            {
                jsonobject = jsonobject.getJSONObject("cellData");
                return new CellAnimSet(context, NinaAnimatedIcon.this, jsonobject, iconWidth, iconHeight, s);
            }
            LayeredAnimSet layeredanimset = new LayeredAnimSet(s);
            if (jsonobject.has("cellSets"))
            {
                JSONArray jsonarray = jsonobject.getJSONArray("cellSets");
                for (int i = 0; i < jsonarray.length(); i++)
                {
                    layeredanimset.append(new CellAnimSet(context, NinaAnimatedIcon.this, jsonarray.getJSONObject(i), iconWidth, iconHeight, s));
                }

            }
            if (jsonobject.has("imageComponents"))
            {
                JSONObject jsonobject1 = jsonobject.getJSONObject("imageComponents");
                layeredanimset.append(new CompositeAnimSet(imageComponentNames, componentHash, animConstants, jsonobject1, s));
            }
            if (layeredanimset.count() > 0)
            {
                return layeredanimset;
            } else
            {
                return new CompositeAnimSet(imageComponentNames, componentHash, animConstants, jsonobject, s);
            }
        }

        AnimSetFactory(Context context1, String as[], HashMap hashmap, NinaAnimConstants ninaanimconstants)
        {
            this$0 = NinaAnimatedIcon.this;
            super();
            context = context1;
            imageComponentNames = as;
            componentHash = hashmap;
            animConstants = ninaanimconstants;
        }

        private class CellAnimSet extends AnimSet
        {
            private class SequentialCellSelector extends CellSelector
            {

                private static final String JSON_KEY_LOOP_COUNT = "loopCount";
                private final int cellCount;
                private int currentCell;
                private int currentLoop;
                private final int loopCount;

                int getCurrentCell()
                {
                    return currentCell;
                }

                boolean incrementLoopCount()
                {
                    currentLoop = Math.min(currentLoop + 1, loopCount);
                    return isFinished();
                }

                boolean isFinished()
                {
                    return loopCount > 0 && currentLoop >= loopCount;
                }

                void reset()
                {
                    currentLoop = 0;
                    currentCell = -1;
                }

                boolean update()
                {
                    int i = currentCell + 1;
                    currentCell = i;
                    if (i >= cellCount)
                    {
                        if (incrementLoopCount())
                        {
                            currentCell = cellCount - 1;
                        } else
                        {
                            currentCell = 0;
                        }
                    }
                    return isFinished();
                }

                SequentialCellSelector(int i, JSONObject jsonobject)
                {
                    super(null);
                    currentLoop = 0;
                    cellCount = i;
                    loopCount = jsonobject.optInt("loopCount", 1);
                }
            }

            private class CachingBitmapAgent extends BitmapAgent
            {
                private class BitmapAgent
                {

                    final BitmapGlob glob;

                    abstract Bitmap getBitmap(int i);

                    void releaseBitmap(Bitmap bitmap)
                    {
                    }

                    BitmapAgent(BitmapGlob bitmapglob)
                    {
                        glob = bitmapglob;
                    }
                }


                final SparseArray decoderBitmapCache;
                final int sheetId;

                Bitmap getBitmap(int i)
                {
                    Object obj = (BitmapCacheTuple)decoderBitmapCache.get(i);
                    if (obj != null)
                    {
                        if (sheetId == ((BitmapCacheTuple) (obj)).sheetId)
                        {
                            return ((BitmapCacheTuple) (obj)).bitmap;
                        }
                        ((BitmapCacheTuple) (obj)).bitmap.recycle();
                    }
                    obj = glob.getBitmap(i, null);
                    BitmapCacheTuple bitmapcachetuple = new BitmapCacheTuple(sheetId, ((Bitmap) (obj)));
                    decoderBitmapCache.put(i, bitmapcachetuple);
                    return ((Bitmap) (obj));
                }

                CachingBitmapAgent(BitmapGlob bitmapglob, SparseArray sparsearray, int i)
                {
                    super(bitmapglob);
                    sheetId = i;
                    decoderBitmapCache = sparsearray;
                }
            }

            private class CellSheetImageComponent extends ImageComponent
            {

                final BitmapAgent bitmapAgent;
                final RectF dest;
                final int index;
                final Paint paint = new Paint();
                final Rect src = new Rect(0, 0, 0, 0);

                void draw(Canvas canvas, RenderState renderstate)
                {
                    renderstate = bitmapAgent.getBitmap(index);
                    canvas.save();
                    src.right = renderstate.getWidth();
                    src.bottom = renderstate.getHeight();
                    canvas.drawBitmap(renderstate, src, dest, paint);
                    canvas.restore();
                    bitmapAgent.releaseBitmap(renderstate);
                }

                CellSheetImageComponent(BitmapAgent bitmapagent, int i, int j, float f, float f1, int k)
                {
                    super(null, f, f1, 0.0F, 0.0F);
                    bitmapAgent = bitmapagent;
                    index = k;
                    dest = new RectF(f, f1, i, j);
                }
            }

            private class SharedBitmapAgent extends BitmapAgent
            {

                final Bitmap bitmap;
                final android.graphics.BitmapFactory.Options factoryOptions = new android.graphics.BitmapFactory.Options();

                Bitmap getBitmap(int i)
                {
                    return glob.getBitmap(i, factoryOptions);
                }

                SharedBitmapAgent(BitmapGlob bitmapglob, SparseArray sparsearray)
                {
                    super(bitmapglob);
                    factoryOptions.inMutable = true;
                    bitmap = bitmapglob.getBitmap(0, factoryOptions);
                    factoryOptions.inBitmap = bitmap;
                    factoryOptions.inSampleSize = 1;
                    bitmapglob = new BitmapCacheTuple(0, bitmap);
                    sparsearray.append(sparsearray.size(), bitmapglob);
                }
            }


            private static final String JSON_KEY_CELL_COUNT = "cellCount";
            private static final String JSON_KEY_CELL_ID_FORMAT = "cellIdFormat";
            private static final String JSON_KEY_CELL_INDEX_START = "indexStart";
            private static final String JSON_KEY_CELL_SELECTOR = "cellSelector";
            private static final String JSON_KEY_CELL_SHEET_ID = "sheet";
            private static final String JSON_KEY_POSITION_OFFSET = "positionOffset";
            private static final String JSON_VALUE_SELECTOR_SEQUENTIAL = "sequential";
            private static final String JSON_VALUE_SELECTOR_VOLUME = "volume";
            private final BitmapAgent bitmapAgent;
            private final ImageComponent cells[];
            private final String name;
            private final RenderState renderState = new RenderState();
            private final CellSelector selector;

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

            CellAnimSet(Context context1, NinaAnimatedIcon ninaanimatedicon, JSONObject jsonobject, int i, int j, String s)
            {
                super(null);
                name = s;
                s = context1.getResources();
                context1 = context1.getPackageName();
                int k = jsonobject.optInt("indexStart");
                int l = jsonobject.getInt("cellCount");
                cells = new ImageComponent[l];
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
                        selector = new SequentialCellSelector(l, jsonobject);
                    } else
                    if ("volume".equals(s1))
                    {
                        selector = new VolumeCellSelector(l, jsonobject);
                    } else
                    {
                        throw new IllegalArgumentException((new StringBuilder("Failure parsing nina_animated_icon.json -- Unknown cell selector: ")).append(s1).toString());
                    }
                } else
                {
                    selector = new SequentialCellSelector(l, jsonobject);
                }
                s1 = jsonobject.optString("sheet", null);
                if (s1 != null)
                {
                    k = s.getIdentifier(s1, "raw", context1);
                    context1 = NinaAnimatedIcon.getBitmapGlob(ninaanimatedicon.globCache, s, k);
                    if (11 > android.os.Build.VERSION.SDK_INT)
                    {
                        bitmapAgent = new CachingBitmapAgent(context1, ninaanimatedicon.decoderBitmapCache, k);
                    } else
                    {
                        bitmapAgent = new SharedBitmapAgent(context1, ninaanimatedicon.decoderBitmapCache);
                    }
                    for (k = 0; k < l; k++)
                    {
                        context1 = new CellSheetImageComponent(bitmapAgent, i, j, f, f1, k);
                        cells[k] = context1;
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
                        j = s.getIdentifier(((String) (obj)), "drawable", context1);
                        Bitmap bitmap = NinaAnimatedIcon.getBitmap(ninaanimatedicon.bitmapCache, s, j);
                        if (bitmap == null)
                        {
                            throw new RuntimeException((new StringBuilder("Failure parsing nina_animated_icon.json -- Unable to load image with id: ")).append(((String) (obj))).toString());
                        }
                        obj = new ImageComponent(bitmap, f, f1, 0.0F, 0.0F);
                        cells[i] = ((ImageComponent) (obj));
                    }

                }
                reset();
            }
        }


        private class LayeredAnimSet extends AnimSet
        {

            private final String name;
            private List sets;

            void append(AnimSet animset)
            {
                sets.add(animset);
            }

            int count()
            {
                return sets.size();
            }

            boolean forward()
            {
                for (Iterator iterator = sets.iterator(); iterator.hasNext(); ((AnimSet)iterator.next()).forward()) { }
                return isFinished();
            }

            String getName()
            {
                return name;
            }

            boolean isFinished()
            {
                for (Iterator iterator = sets.iterator(); iterator.hasNext();)
                {
                    if (!((AnimSet)iterator.next()).isFinished())
                    {
                        return false;
                    }
                }

                return true;
            }

            void render(Canvas canvas)
            {
                for (Iterator iterator = sets.iterator(); iterator.hasNext(); ((AnimSet)iterator.next()).render(canvas)) { }
            }

            void reset()
            {
                for (Iterator iterator = sets.iterator(); iterator.hasNext(); ((AnimSet)iterator.next()).reset()) { }
            }

            LayeredAnimSet(String s)
            {
                super(null);
                sets = new ArrayList();
                name = s;
            }
        }


        private class CompositeAnimSet extends AnimSet
        {

            private static final String JSON_KEY_LOCAL_CONSTANTS = "localConstants";
            private final ArrayList animComponents;
            private final String name;

            boolean forward()
            {
                Iterator iterator = animComponents.iterator();
                boolean flag;
                for (flag = true; iterator.hasNext(); flag = ((AnimComponent)iterator.next()).anim.incrementFrame() & flag) { }
                return flag;
            }

            String getName()
            {
                return name;
            }

            boolean isFinished()
            {
                Iterator iterator = animComponents.iterator();
                boolean flag = true;
                while (iterator.hasNext()) 
                {
                    AnimComponent animcomponent = (AnimComponent)iterator.next();
                    if (flag && animcomponent.anim.isFinished())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                }
                return flag;
            }

            void render(Canvas canvas)
            {
                AnimComponent animcomponent;
                for (Iterator iterator = animComponents.iterator(); iterator.hasNext(); animcomponent.imageComponent.draw(canvas, animcomponent.renderState))
                {
                    animcomponent = (AnimComponent)iterator.next();
                    animcomponent.renderState.identity();
                    animcomponent.anim.updateRenderState(animcomponent.renderState);
                }

            }

            void reset()
            {
                for (Iterator iterator = animComponents.iterator(); iterator.hasNext(); ((AnimComponent)iterator.next()).anim.reset()) { }
            }

            CompositeAnimSet(String as[], HashMap hashmap, NinaAnimConstants ninaanimconstants, JSONObject jsonobject, String s)
            {
                super(null);
                name = s;
                ninaanimconstants.setLocalMap(jsonobject.optJSONObject("localConstants"));
                animComponents = new ArrayList(hashmap.size());
                for (int i = 0; i < as.length; i++)
                {
                    Object obj = as[i];
                    s = jsonobject.optJSONObject(((String) (obj)));
                    if (s != null)
                    {
                        obj = (ImageComponent)hashmap.get(obj);
                        s = NinaAnimFactory.constructNinaAnim(ninaanimconstants, s);
                        class AnimComponent
                        {

                            final NinaAnim anim;
                            final ImageComponent imageComponent;
                            final RenderState renderState = new RenderState();

                    AnimComponent(NinaAnim ninaanim, ImageComponent imagecomponent)
                    {
                        anim = ninaanim;
                        imageComponent = imagecomponent;
                    }
                        }

                        animComponents.add(new AnimComponent(s, ((ImageComponent) (obj))));
                    }
                }

            }
        }

    }


    private class AnimSet
    {

        AnimSet next;

        abstract boolean forward();

        abstract String getName();

        abstract boolean isFinished();

        abstract void render(Canvas canvas);

        abstract void reset();

        private AnimSet()
        {
        }

        AnimSet(_cls1 _pcls1)
        {
            this();
        }
    }


    private class BitmapGlob
    {

        final int count;
        final byte data[];
        final int offsets[];
        final int sizes[];

        Bitmap getBitmap(int i, android.graphics.BitmapFactory.Options options)
        {
            int j = offsets[i];
            i = sizes[i];
            return BitmapFactory.decodeByteArray(data, j, i, options);
        }

        BitmapGlob(InputStream inputstream)
        {
            inputstream = new DataInputStream(inputstream);
            count = inputstream.readInt();
            offsets = new int[count];
            sizes = new int[count];
            for (int i = 0; i < count; i++)
            {
                offsets[i] = inputstream.readInt();
                sizes[i] = inputstream.readInt();
            }

            data = new byte[inputstream.readInt()];
            inputstream.read(data);
        }
    }


    private class BitmapCacheTuple
    {

        final Bitmap bitmap;
        final int sheetId;

        BitmapCacheTuple(int i, Bitmap bitmap1)
        {
            sheetId = i;
            bitmap = bitmap1;
        }
    }


    private class _cls1 extends TimerTask
    {

        final NinaAnimatedIcon this$0;

        public void run()
        {
            update();
            render();
        }

        _cls1()
        {
            this$0 = NinaAnimatedIcon.this;
            super();
        }
    }


    private class VolumeCellSelector extends CellSelector
    {
        private class CellSelector
        {

            abstract int getCurrentCell();

            abstract boolean isFinished();

            abstract void reset();

            abstract boolean update();

            private CellSelector()
            {
            }

            CellSelector(_cls1 _pcls1)
            {
                this();
            }
        }


        private static final int DEFAULT_VOLUME_THRESHOLD = 35;
        private static final String JSON_KEY_VOLUME_THRESHOLD = "volumeSelectorThreshold";
        static float volumeIntensity;
        private final float factor;
        private final float safetyMax;
        private final float threshold;

        int getCurrentCell()
        {
            float f = Math.max(0.0F, volumeIntensity - threshold);
            return (int)(Math.min(safetyMax, f) * factor);
        }

        boolean isFinished()
        {
            return false;
        }

        void reset()
        {
        }

        boolean update()
        {
            return false;
        }

        VolumeCellSelector(int i, JSONObject jsonobject)
        {
            super(null);
            int j = jsonobject.optInt("volumeSelectorThreshold", 35);
            if (j < 0 || 100 <= j)
            {
                throw new IllegalArgumentException((new StringBuilder("Failure parsing nina_animated_icon.json -- Volume selector threshold (")).append(j).append(") must be non-negative and less than 100").toString());
            } else
            {
                threshold = j;
                factor = (float)i / (100F - threshold);
                safetyMax = 99F - threshold;
                return;
            }
        }
    }

}
