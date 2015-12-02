// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra;

import android.content.res.Configuration;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;

// Referenced classes of package com.facebook.acra:
//            ACRA

public class ConfigurationInspector
{

    private static final String FIELD_MCC = "mcc";
    private static final String FIELD_MNC = "mnc";
    private static final String FIELD_SCREENLAYOUT = "screenLayout";
    private static final String FIELD_UIMODE = "uiMode";
    private static final String PREFIX_HARDKEYBOARDHIDDEN = "HARDKEYBOARDHIDDEN_";
    private static final String PREFIX_KEYBOARD = "KEYBOARD_";
    private static final String PREFIX_KEYBOARDHIDDEN = "KEYBOARDHIDDEN_";
    private static final String PREFIX_NAVIGATION = "NAVIGATION_";
    private static final String PREFIX_NAVIGATIONHIDDEN = "NAVIGATIONHIDDEN_";
    private static final String PREFIX_ORIENTATION = "ORIENTATION_";
    private static final String PREFIX_SCREENLAYOUT = "SCREENLAYOUT_";
    private static final String PREFIX_TOUCHSCREEN = "TOUCHSCREEN_";
    private static final String PREFIX_UI_MODE = "UI_MODE_";
    private static final String SUFFIX_MASK = "_MASK";
    private static SparseArray mHardKeyboardHiddenValues;
    private static SparseArray mKeyboardHiddenValues;
    private static SparseArray mKeyboardValues;
    private static SparseArray mNavigationHiddenValues;
    private static SparseArray mNavigationValues;
    private static SparseArray mOrientationValues;
    private static SparseArray mScreenLayoutValues;
    private static SparseArray mTouchScreenValues;
    private static SparseArray mUiModeValues;
    private static final HashMap mValueArrays;

    public ConfigurationInspector()
    {
    }

    private static String activeFlags(SparseArray sparsearray, int i)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int j = 0; j < sparsearray.size(); j++)
        {
            int k = sparsearray.keyAt(j);
            if (!((String)sparsearray.get(k)).endsWith("_MASK"))
            {
                continue;
            }
            k = i & k;
            if (k <= 0)
            {
                continue;
            }
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append('+');
            }
            stringbuilder.append((String)sparsearray.get(k));
        }

        return stringbuilder.toString();
    }

    private static String getFieldValueName(Configuration configuration, Field field)
    {
        Object obj = field.getName();
        if (((String) (obj)).equals("mcc") || ((String) (obj)).equals("mnc"))
        {
            obj = Integer.toString(field.getInt(configuration));
        } else
        {
            if (((String) (obj)).equals("uiMode"))
            {
                return activeFlags((SparseArray)mValueArrays.get("UI_MODE_"), field.getInt(configuration));
            }
            if (((String) (obj)).equals("screenLayout"))
            {
                return activeFlags((SparseArray)mValueArrays.get("SCREENLAYOUT_"), field.getInt(configuration));
            }
            obj = (SparseArray)mValueArrays.get((new StringBuilder()).append(((String) (obj)).toUpperCase()).append('_').toString());
            if (obj == null)
            {
                return Integer.toString(field.getInt(configuration));
            }
            String s = (String)((SparseArray) (obj)).get(field.getInt(configuration));
            obj = s;
            if (s == null)
            {
                return Integer.toString(field.getInt(configuration));
            }
        }
        return ((String) (obj));
    }

    public static String toString(Configuration configuration)
    {
        StringBuilder stringbuilder;
        Field afield[];
        int i;
        int j;
        stringbuilder = new StringBuilder();
        afield = configuration.getClass().getFields();
        j = afield.length;
        i = 0;
_L7:
        if (i >= j) goto _L2; else goto _L1
_L1:
        Object obj = afield[i];
        if (Modifier.isStatic(((Field) (obj)).getModifiers()))
        {
            break MISSING_BLOCK_LABEL_159;
        }
        stringbuilder.append(((Field) (obj)).getName()).append('=');
        if (!((Field) (obj)).getType().equals(Integer.TYPE)) goto _L4; else goto _L3
_L3:
        stringbuilder.append(getFieldValueName(configuration, ((Field) (obj))));
_L5:
        stringbuilder.append('\n');
        break MISSING_BLOCK_LABEL_159;
_L4:
        if (((Field) (obj)).get(configuration) == null)
        {
            stringbuilder.append("null");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            stringbuilder.append(((Field) (obj)).get(configuration).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e(ACRA.LOG_TAG, "Error while inspecting device configuration: ", ((Throwable) (obj)));
            break MISSING_BLOCK_LABEL_159;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            Log.e(ACRA.LOG_TAG, "Error while inspecting device configuration: ", illegalaccessexception);
            break MISSING_BLOCK_LABEL_159;
        }
        if (true) goto _L5; else goto _L2
_L2:
        return stringbuilder.toString();
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static 
    {
        Field afield[];
        int i;
        int j;
        mHardKeyboardHiddenValues = new SparseArray();
        mKeyboardValues = new SparseArray();
        mKeyboardHiddenValues = new SparseArray();
        mNavigationValues = new SparseArray();
        mNavigationHiddenValues = new SparseArray();
        mOrientationValues = new SparseArray();
        mScreenLayoutValues = new SparseArray();
        mTouchScreenValues = new SparseArray();
        mUiModeValues = new SparseArray();
        HashMap hashmap = new HashMap();
        mValueArrays = hashmap;
        hashmap.put("HARDKEYBOARDHIDDEN_", mHardKeyboardHiddenValues);
        mValueArrays.put("KEYBOARD_", mKeyboardValues);
        mValueArrays.put("KEYBOARDHIDDEN_", mKeyboardHiddenValues);
        mValueArrays.put("NAVIGATION_", mNavigationValues);
        mValueArrays.put("NAVIGATIONHIDDEN_", mNavigationHiddenValues);
        mValueArrays.put("ORIENTATION_", mOrientationValues);
        mValueArrays.put("SCREENLAYOUT_", mScreenLayoutValues);
        mValueArrays.put("TOUCHSCREEN_", mTouchScreenValues);
        mValueArrays.put("UI_MODE_", mUiModeValues);
        afield = android/content/res/Configuration.getFields();
        j = afield.length;
        i = 0;
_L2:
        Object obj;
        String s;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_499;
        }
        obj = afield[i];
        if (!Modifier.isStatic(((Field) (obj)).getModifiers()) || !Modifier.isFinal(((Field) (obj)).getModifiers()))
        {
            break MISSING_BLOCK_LABEL_500;
        }
        s = ((Field) (obj)).getName();
        if (s.startsWith("HARDKEYBOARDHIDDEN_"))
        {
            mHardKeyboardHiddenValues.put(((Field) (obj)).getInt(null), s);
            break MISSING_BLOCK_LABEL_500;
        }
        if (s.startsWith("KEYBOARD_"))
        {
            mKeyboardValues.put(((Field) (obj)).getInt(null), s);
            break MISSING_BLOCK_LABEL_500;
        }
        if (s.startsWith("KEYBOARDHIDDEN_"))
        {
            mKeyboardHiddenValues.put(((Field) (obj)).getInt(null), s);
            break MISSING_BLOCK_LABEL_500;
        }
        if (s.startsWith("NAVIGATION_"))
        {
            mNavigationValues.put(((Field) (obj)).getInt(null), s);
            break MISSING_BLOCK_LABEL_500;
        }
        if (s.startsWith("NAVIGATIONHIDDEN_"))
        {
            mNavigationHiddenValues.put(((Field) (obj)).getInt(null), s);
            break MISSING_BLOCK_LABEL_500;
        }
        if (s.startsWith("ORIENTATION_"))
        {
            mOrientationValues.put(((Field) (obj)).getInt(null), s);
            break MISSING_BLOCK_LABEL_500;
        }
        if (s.startsWith("SCREENLAYOUT_"))
        {
            mScreenLayoutValues.put(((Field) (obj)).getInt(null), s);
            break MISSING_BLOCK_LABEL_500;
        }
        if (s.startsWith("TOUCHSCREEN_"))
        {
            mTouchScreenValues.put(((Field) (obj)).getInt(null), s);
            break MISSING_BLOCK_LABEL_500;
        }
        try
        {
            if (s.startsWith("UI_MODE_"))
            {
                mUiModeValues.put(((Field) (obj)).getInt(null), s);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w(ACRA.LOG_TAG, "Error while inspecting device configuration: ", ((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w(ACRA.LOG_TAG, "Error while inspecting device configuration: ", ((Throwable) (obj)));
        }
        break MISSING_BLOCK_LABEL_500;
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
