// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import org.xwalk.core.internal.extension.api.contacts.Contacts;
import org.xwalk.core.internal.extension.api.device_capabilities.DeviceCapabilities;
import org.xwalk.core.internal.extension.api.launchscreen.LaunchScreenExtension;
import org.xwalk.core.internal.extension.api.messaging.Messaging;
import org.xwalk.core.internal.extension.api.presentation.PresentationExtension;

public class BuiltinXWalkExtensions
{

    private static final String TAG = "BuiltinXWalkExtension";
    private static HashMap sBuiltinExtensions = new HashMap();

    public BuiltinXWalkExtensions()
    {
    }

    private static String getExtensionJSFileContent(Context context, String s, boolean flag)
        throws IOException
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj1 = null;
        obj = obj1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        obj = obj2;
        Object obj3 = context.getResources();
        obj = obj2;
        String s1 = (new File(s)).getName().split("\\.")[0];
        obj = obj2;
        int i = ((Resources) (obj3)).getIdentifier(s1, "raw", context.getPackageName());
        obj = obj1;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        obj = obj2;
        obj3 = ((Resources) (obj3)).openRawResource(i);
        obj = obj3;
_L2:
        obj1 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        obj1 = context.getAssets().open(s);
        obj = obj1;
        context = new byte[((InputStream) (obj1)).available()];
        obj = obj1;
        ((InputStream) (obj1)).read(context);
        obj = obj1;
        context = new String(context);
        if (obj1 != null)
        {
            ((InputStream) (obj1)).close();
        }
        return context;
        obj;
        obj = obj2;
        Log.w("BuiltinXWalkExtension", (new StringBuilder()).append("Inputstream failed to open for R.raw.").append(s1).append(", try to find it in assets").toString());
        obj = obj1;
        if (true) goto _L2; else goto _L1
_L1:
        context;
        if (obj != null)
        {
            ((InputStream) (obj)).close();
        }
        throw context;
    }

    public static void load(Context context, Activity activity)
    {
        try
        {
            String s = getExtensionJSFileContent(context, "jsapi/presentation_api.js", true);
            sBuiltinExtensions.put("jsapi/presentation_api.js", new PresentationExtension(s, activity));
        }
        catch (IOException ioexception)
        {
            Log.w("BuiltinXWalkExtension", "Failed to read JS API file: jsapi/presentation_api.js");
        }
        try
        {
            String s1 = getExtensionJSFileContent(context, "jsapi/launch_screen_api.js", true);
            sBuiltinExtensions.put("jsapi/launch_screen_api.js", new LaunchScreenExtension(s1, activity));
        }
        catch (IOException ioexception1)
        {
            Log.w("BuiltinXWalkExtension", "Failed to read JS API file: jsapi/launch_screen_api.js");
        }
        try
        {
            String s2 = getExtensionJSFileContent(context, "jsapi/contacts_api.js", true);
            sBuiltinExtensions.put("jsapi/contacts_api.js", new Contacts(s2, activity));
        }
        catch (IOException ioexception2)
        {
            Log.w("BuiltinXWalkExtension", "Failed to read JS API file: jsapi/contacts_api.js");
        }
        try
        {
            String s3 = getExtensionJSFileContent(context, "jsapi/device_capabilities_api.js", true);
            sBuiltinExtensions.put("jsapi/device_capabilities_api.js", new DeviceCapabilities(s3, activity));
        }
        catch (IOException ioexception3)
        {
            Log.w("BuiltinXWalkExtension", "Failed to read JS API file: jsapi/device_capabilities_api.js");
        }
        try
        {
            context = getExtensionJSFileContent(context, "jsapi/messaging_api.js", true);
            sBuiltinExtensions.put("jsapi/messaging_api.js", new Messaging(context, activity));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("BuiltinXWalkExtension", "Failed to read JS API file: jsapi/messaging_api.js");
        }
    }

}
