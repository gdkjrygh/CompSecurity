// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors.proxies.camera;

import android.app.Activity;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.util.Pair;
import com.google.android.apps.unveil.env.ImageUtils;
import com.google.android.apps.unveil.env.Size;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.v;
import com.google.android.apps.unveil.env.x;
import com.google.android.apps.unveil.g;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.apps.unveil.sensors.proxies.camera:
//            FakeCamera, ParametersProxy, CameraProxy

public class ImageSequenceCamera extends FakeCamera
{

    public static final String IMAGE_SEQUENCE_DIRECTORY_KEY = "image_sequence_directory";
    public static final String JPEG_EXTENSION = ".jpg";
    private static final int MAX_CACHE_BYTE_SIZE = 0xc00000;
    public static final String PNG_EXTENSION = ".png";
    public static final String SEQUENCES_DIRECTORY = "image_sequences";
    public static final String SEQUENCES_LOCAL_PATH = "/sdcard/goggles_data/image_sequences";
    private static final af logger = new af();
    private String allFiles[];
    private int fileNumber;
    private boolean fromAssets;
    private Map imageCache;
    private final x loader = new x();
    private FakeCamera.RawFrame rawFrame;
    private Size rawFrameSize;
    private String sequencePath;

    private ImageSequenceCamera(Handler handler, Map map, Resources resources)
    {
        super(handler, map, resources);
        fileNumber = 0;
        handler = getExtraValue("image_sequence_directory", "");
        fromAssets = v.a(handler);
        sequencePath = v.b(handler);
        logger.b("Loading image sequence from %s", new Object[] {
            sequencePath
        });
        try
        {
            allFiles = v.a(resources, fromAssets, sequencePath, new _cls1());
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            handler = String.valueOf(handler);
            if (handler.length() != 0)
            {
                handler = "Invalid directory given: ".concat(handler);
            } else
            {
                handler = new String("Invalid directory given: ");
            }
            throw new RuntimeException(handler, map);
        }
        Arrays.sort(allFiles);
        logger.b("Found %d image files", new Object[] {
            Integer.valueOf(allFiles.length)
        });
        handler = getParameters();
        rawFrameSize = getImageSize(allFiles[0]);
        handler.set("preview-size-values", rawFrameSize.toString());
        resources = rawFrameSize;
        setParameters(handler);
        if (allFiles.length * ImageUtils.b(rawFrameSize.width, rawFrameSize.height) <= 0xc00000 && ((String)map.get("skip_rendering")).equals("true") && !((String)map.get("lockstep_callbacks")).equals("true"))
        {
            imageCache = new HashMap();
        }
    }

    private boolean decodeJpeg(byte abyte0[], FakeCamera.RawFrame rawframe)
    {
        boolean flag = true;
        int ai[] = new int[2];
        ImageUtils.decodeJpegToYUV420SP(abyte0, rawframe.getYuvDataAndClearRgbData(), ai);
        abyte0 = rawframe.frameSize;
        if (ai[0] != ((Size) (abyte0)).width || ai[1] != ((Size) (abyte0)).height)
        {
            logger.c("Invalid dimensions for image. Expected %s but got %d x %d", new Object[] {
                abyte0, Integer.valueOf(ai[0]), Integer.valueOf(ai[1])
            });
            flag = false;
        }
        return flag;
    }

    private boolean decodePng(byte abyte0[], FakeCamera.RawFrame rawframe)
    {
        abyte0 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
        if (abyte0 == null)
        {
            return false;
        }
        Size size = rawframe.frameSize;
        if (abyte0.getWidth() != size.width || abyte0.getHeight() != size.height)
        {
            logger.e("Invalid dimensions for image. Expected %s but got %d x %d", new Object[] {
                rawFrameSize, Integer.valueOf(abyte0.getWidth()), Integer.valueOf(abyte0.getHeight())
            });
            return false;
        } else
        {
            abyte0.getPixels(rawframe.getRgbData(), 0, size.width, 0, 0, size.width, size.height);
            abyte0.recycle();
            return true;
        }
    }

    private byte[] getBytesForImage(String s)
    {
        byte abyte0[];
        try
        {
            InputStream inputstream = v.a(resources, fromAssets, s);
            loader.a.reset();
            abyte0 = loader.a(inputstream);
        }
        catch (IOException ioexception)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Couldn't open stream: ".concat(s);
            } else
            {
                s = new String("Couldn't open stream: ");
            }
            throw new RuntimeException(s, ioexception);
        }
        return abyte0;
    }

    public static Pair[] getImageSequenceDirectories(Activity activity)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        String as1[] = (new File("/sdcard/goggles_data/image_sequences")).list();
        if (as1 != null)
        {
            int k = as1.length;
            int i = 0;
            while (i < k) 
            {
                String s2 = as1[i];
                String s = String.valueOf("sdcard:");
                String s4 = String.valueOf(s2);
                if (s4.length() != 0)
                {
                    s = s.concat(s4);
                } else
                {
                    s = new String(s);
                }
                s4 = String.valueOf("sdcard:/sdcard/goggles_data/image_sequences/");
                s2 = String.valueOf(s2);
                if (s2.length() != 0)
                {
                    s2 = s4.concat(s2);
                } else
                {
                    s2 = new String(s4);
                }
                arraylist.add(new StringPair(s, s2));
                i++;
            }
        }
        String as[] = activity.getAssets().list("image_sequences");
        if (as == null) goto _L2; else goto _L1
_L1:
        int l = as.length;
        int j = 0;
_L9:
        if (j >= l) goto _L2; else goto _L3
_L3:
        String s1 = as[j];
        String s3;
        activity = String.valueOf("assets:");
        s3 = String.valueOf(s1);
        if (s3.length() == 0) goto _L5; else goto _L4
_L4:
        activity = activity.concat(s3);
_L6:
        s3 = String.valueOf("assets:image_sequences/");
        s1 = String.valueOf(s1);
        if (s1.length() == 0)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        s1 = s3.concat(s1);
_L7:
        arraylist.add(new StringPair(activity, s1));
        j++;
        continue; /* Loop/switch isn't completed */
_L5:
        activity = new String(activity);
          goto _L6
        s1 = new String(s3);
          goto _L7
        activity;
        logger.e("Couldn't list assets directory!", new Object[0]);
_L2:
        activity = (StringPair[])arraylist.toArray(new StringPair[arraylist.size()]);
        Arrays.sort(activity);
        return activity;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private Size getImageSize(String s)
    {
        try
        {
            s = v.a(resources, fromAssets, s);
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(s, null, options);
            s.close();
            s = new Size(options.outWidth, options.outHeight);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("Couldn't open stream!", s);
        }
        return s;
    }

    public static void initializePreferences(PreferenceActivity preferenceactivity)
    {
        int i = 0;
        Pair apair[] = getImageSequenceDirectories(preferenceactivity);
        if (apair.length == 0)
        {
            preferenceactivity.findPreference(preferenceactivity.getString(g.camera_image_sequence_dir_key)).setEnabled(false);
            return;
        }
        preferenceactivity = (ListPreference)preferenceactivity.findPreference(preferenceactivity.getString(g.camera_image_sequence_dir_key));
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        for (int j = apair.length; i < j; i++)
        {
            Pair pair = apair[i];
            arraylist.add(pair.first);
            arraylist1.add(pair.second);
        }

        preferenceactivity.setEntries((CharSequence[])arraylist.toArray(new String[arraylist.size()]));
        preferenceactivity.setEntryValues((CharSequence[])arraylist1.toArray(new String[arraylist.size()]));
    }

    public static CameraProxy open(Handler handler, Map map, Resources resources)
    {
        if (camera == null || ((String)map.get("lockstep_callbacks")).equals("true"))
        {
            camera = new ImageSequenceCamera(handler, map, resources);
        }
        return camera;
    }

    protected FakeCamera.RawFrame generateFrame()
    {
        String s = allFiles[fileNumber];
        fileNumber = (fileNumber + 1) % allFiles.length;
        Object obj;
        if (imageCache != null && imageCache.containsKey(s))
        {
            obj = (FakeCamera.RawFrame)imageCache.get(s);
        } else
        {
            obj = getBytesForImage(s);
            if (rawFrame == null)
            {
                rawFrame = new FakeCamera.RawFrame(this, rawFrameSize.width, rawFrameSize.height, new byte[ImageUtils.b(rawFrameSize.width, rawFrameSize.height)]);
            }
            if (s.endsWith(".jpg"))
            {
                if (!decodeJpeg(((byte []) (obj)), rawFrame))
                {
                    obj = String.valueOf(s);
                    if (((String) (obj)).length() != 0)
                    {
                        obj = "Jpeg decoding failed for ".concat(((String) (obj)));
                    } else
                    {
                        obj = new String("Jpeg decoding failed for ");
                    }
                    throw new RuntimeException(((String) (obj)));
                }
            } else
            if (s.endsWith(".png") && !decodePng(((byte []) (obj)), rawFrame))
            {
                obj = String.valueOf(s);
                if (((String) (obj)).length() != 0)
                {
                    obj = "Png decoding failed for ".concat(((String) (obj)));
                } else
                {
                    obj = new String("Png decoding failed for ");
                }
                throw new RuntimeException(((String) (obj)));
            }
            FakeCamera.RawFrame rawframe = rawFrame;
            obj = rawframe;
            if (imageCache != null)
            {
                imageCache.put(s, rawFrame);
                rawFrame = null;
                return rawframe;
            }
        }
        return ((FakeCamera.RawFrame) (obj));
    }


    private class _cls1
        implements FilenameFilter
    {

        final ImageSequenceCamera this$0;

        public boolean accept(File file, String s)
        {
            return s.contains(".jpg") || s.contains(".png");
        }

        _cls1()
        {
            this$0 = ImageSequenceCamera.this;
            super();
        }
    }


    private class StringPair extends Pair
        implements Comparable
    {

        public int compareTo(StringPair stringpair)
        {
            return ((String)first).compareTo((String)stringpair.first);
        }

        public volatile int compareTo(Object obj)
        {
            return compareTo((StringPair)obj);
        }

        public StringPair(String s, String s1)
        {
            super(s, s1);
        }
    }

}
