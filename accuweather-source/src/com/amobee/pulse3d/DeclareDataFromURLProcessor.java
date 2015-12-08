// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            NativeCommandProcessor, Log, Pulse3DView, FetchTask, 
//            TextureResource, Pulse3DJavaScriptInterface, BufferViewIterator

class DeclareDataFromURLProcessor extends NativeCommandProcessor
{

    Context activity_;
    String baseUrl_;
    int expectedBytes_;
    String url_;
    Pulse3DView viewController_;

    DeclareDataFromURLProcessor(Pulse3DView pulse3dview, Context context)
    {
        viewController_ = pulse3dview;
        activity_ = context;
    }

    void execute()
    {
        Object obj;
        int l;
        l = 0;
        String s = url_;
        obj = s;
        if (!s.startsWith("http"))
        {
            obj = (new StringBuilder()).append(baseUrl_).append(s).toString();
        }
        Log.d("BinInterpreter", (new StringBuilder()).append("declareDataFromURL: ").append(((String) (obj))).toString());
        if (!((String) (obj)).toLowerCase().endsWith(".bin")) goto _L2; else goto _L1
_L1:
        if (viewController_.resources != null) goto _L4; else goto _L3
_L3:
        return;
_L4:
        int i = serial_;
        (new FetchTask(i) {

            final DeclareDataFromURLProcessor this$0;
            final int val$reservedSerial;

            public void callBack(Object obj4)
            {
                if (obj4 == null)
                {
                    if (viewController_.jsInterface3D != null)
                    {
                        viewController_.jsInterface3D.reportBackToJS(reservedSerial, false, (new StringBuilder()).append("").append(Pulse3DJavaScriptInterface.ResultCode.GENERIC_ERROR).toString());
                    }
                } else
                if (viewController_.resources != null)
                {
                    viewController_.resources.add(obj4);
                    int i1 = viewController_.resources.indexOf(obj4);
                    if (viewController_.jsInterface3D != null)
                    {
                        viewController_.jsInterface3D.reportBackToJS(reservedSerial, true, (new StringBuilder()).append("").append(i1).toString());
                        return;
                    }
                }
            }

            public void prepare(Object obj4)
            {
            }

            
            {
                this$0 = DeclareDataFromURLProcessor.this;
                reservedSerial = i;
                super(final_context);
            }
        }).execute(new Object[] {
            obj, [B
        });
        return;
_L2:
        int k;
        if (((String) (obj)).toLowerCase().endsWith(".png") || ((String) (obj)).toLowerCase().endsWith(".jpg") || ((String) (obj)).toLowerCase().endsWith(".jpeg") || ((String) (obj)).toLowerCase().endsWith(".pvr") || ((String) (obj)).toLowerCase().endsWith(".bmp") || ((String) (obj)).toLowerCase().endsWith(".pkm"))
        {
            Object obj1 = obj;
            if (((String) (obj)).toLowerCase().endsWith(".pvr"))
            {
                obj1 = ((String) (obj)).replace(".pvr", ".pkm").replace(".PVR", ".pkm");
            }
            obj = new TextureResource();
            viewController_.resources.add(obj);
            int j = viewController_.resources.indexOf(obj);
            l = serial_;
            obj.url = ((String) (obj1));
            obj = new FetchTask(j) {

                final DeclareDataFromURLProcessor this$0;
                final int val$reservedHandle;
                final int val$reservedSerial;
                final TextureResource val$texture;

                public void callBack(Object obj4)
                {
                    if (obj4 == null)
                    {
                        Log.d("BinInterpreter", (new StringBuilder()).append("download failed! ").append(texture.url).toString());
                        if (viewController_.jsInterface3D != null)
                        {
                            viewController_.jsInterface3D.reportBackToJS(reservedSerial, false, (new StringBuilder()).append("").append(Pulse3DJavaScriptInterface.ResultCode.GENERIC_ERROR).toString());
                        }
                    } else
                    {
                        texture.obj = obj4;
                        if (viewController_.jsInterface3D != null)
                        {
                            viewController_.jsInterface3D.reportBackToJS(reservedSerial, true, (new StringBuilder()).append("").append(reservedHandle).toString());
                            return;
                        }
                    }
                }

                public void prepare(Object obj4)
                {
                }

            
            {
                this$0 = DeclareDataFromURLProcessor.this;
                texture = textureresource;
                reservedSerial = i;
                reservedHandle = j;
                super(final_context);
            }
            };
            Log.d("declareDataFromURL", ((String) (obj1)));
            ((FetchTask) (obj)).execute(new Object[] {
                obj1, android/graphics/Bitmap
            });
            return;
        }
        if (!((String) (obj)).startsWith("data:image/png;base64,"))
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj2 = new ByteArrayInputStream(Base64.decode(((String) (obj)).replace("data:image/png;base64,", ""), 0));
        Object obj3 = new android.graphics.BitmapFactory.Options();
        obj3.inScaled = false;
        obj2 = BitmapFactory.decodeStream(((java.io.InputStream) (obj2)), null, ((android.graphics.BitmapFactory.Options) (obj3)));
        obj3 = new TextureResource();
        obj3.obj = obj2;
        obj3.url = ((String) (obj));
        viewController_.resources.add(obj3);
        k = viewController_.resources.indexOf(obj3);
_L6:
        if (viewController_.jsInterface3D != null)
        {
            viewController_.jsInterface3D.reportBackToJS(serial_, true, (new StringBuilder()).append("").append(k).toString());
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
        k = l;
        if (viewController_.jsInterface3D != null)
        {
            viewController_.jsInterface3D.notImplemented("declareDataFromUrl");
            k = l;
        }
          goto _L6
        if (true) goto _L3; else goto _L7
_L7:
    }

    void parse(BufferViewIterator bufferviewiterator)
    {
        url_ = bufferviewiterator.parseAlignedASCIIStringWithLength();
        baseUrl_ = bufferviewiterator.parseAlignedASCIIStringWithLength();
        expectedBytes_ = bufferviewiterator.parseInt();
    }
}
