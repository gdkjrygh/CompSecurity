// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.util.Log;
import android.widget.TextView;
import java.lang.reflect.Field;

class TextViewCompatDonut
{

    private static final int LINES = 1;
    private static final String LOG_TAG = "TextViewCompatDonut";
    private static Field sMaxModeField;
    private static boolean sMaxModeFieldFetched;
    private static Field sMaximumField;
    private static boolean sMaximumFieldFetched;
    private static Field sMinModeField;
    private static boolean sMinModeFieldFetched;
    private static Field sMinimumField;
    private static boolean sMinimumFieldFetched;

    TextViewCompatDonut()
    {
    }

    static int getMaxLines(TextView textview)
    {
        if (!sMaxModeFieldFetched)
        {
            sMaxModeField = retrieveField("mMaxMode");
            sMaxModeFieldFetched = true;
        }
        if (sMaxModeField != null && retrieveIntFromField(sMaxModeField, textview) == 1)
        {
            if (!sMaximumFieldFetched)
            {
                sMaximumField = retrieveField("mMaximum");
                sMaximumFieldFetched = true;
            }
            if (sMaximumField != null)
            {
                return retrieveIntFromField(sMaximumField, textview);
            }
        }
        return -1;
    }

    static int getMinLines(TextView textview)
    {
        if (!sMinModeFieldFetched)
        {
            sMinModeField = retrieveField("mMinMode");
            sMinModeFieldFetched = true;
        }
        if (sMinModeField != null && retrieveIntFromField(sMinModeField, textview) == 1)
        {
            if (!sMinimumFieldFetched)
            {
                sMinimumField = retrieveField("mMinimum");
                sMinimumFieldFetched = true;
            }
            if (sMinimumField != null)
            {
                return retrieveIntFromField(sMinimumField, textview);
            }
        }
        return -1;
    }

    private static Field retrieveField(String s)
    {
        Field field = null;
        Field field1;
        try
        {
            field1 = android/widget/TextView.getDeclaredField(s);
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            Log.e("TextViewCompatDonut", (new StringBuilder()).append("Could not retrieve ").append(s).append(" field.").toString());
            return field;
        }
        field = field1;
        field1.setAccessible(true);
        return field1;
    }

    private static int retrieveIntFromField(Field field, TextView textview)
    {
        int i;
        try
        {
            i = field.getInt(textview);
        }
        // Misplaced declaration of an exception variable
        catch (TextView textview)
        {
            Log.d("TextViewCompatDonut", (new StringBuilder()).append("Could not retrieve value of ").append(field.getName()).append(" field.").toString());
            return -1;
        }
        return i;
    }
}
