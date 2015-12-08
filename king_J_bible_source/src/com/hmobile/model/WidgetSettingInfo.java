// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.model;

import com.hmobile.activerecorbase.ActiveRecordBase;
import com.hmobile.activerecorbase.ActiveRecordException;
import com.hmobile.biblekjv.HolyBibleApplication;
import java.util.List;

public class WidgetSettingInfo extends ActiveRecordBase
{

    public int WidgetFontSize;
    public String WidgetFontStyle;
    public boolean isLowLight;

    public WidgetSettingInfo()
    {
        WidgetFontSize = 18;
        isLowLight = false;
        WidgetFontStyle = "Roboto-Regular.ttf";
    }

    public static void ResetDbValue()
    {
        updateWidgetSetting(18, "Roboto-Regular.ttf", false);
    }

    public static WidgetSettingInfo getSetting()
    {
        Object obj;
        try
        {
            obj = HolyBibleApplication.Connection().findAll(com/hmobile/model/WidgetSettingInfo);
        }
        catch (ActiveRecordException activerecordexception)
        {
            activerecordexception.printStackTrace();
            return null;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        if (((List) (obj)).size() > 0)
        {
            return (WidgetSettingInfo)((List) (obj)).get(0);
        }
        obj = (WidgetSettingInfo)HolyBibleApplication.Connection().newEntity(com/hmobile/model/WidgetSettingInfo);
        ((WidgetSettingInfo) (obj)).save();
        return ((WidgetSettingInfo) (obj));
    }

    public static void updateWidgetSetting(int i, String s, boolean flag)
    {
        Object obj = HolyBibleApplication.Connection().findAll(com/hmobile/model/WidgetSettingInfo);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        if (((List) (obj)).size() > 0)
        {
            obj = (WidgetSettingInfo)((List) (obj)).get(0);
            obj.WidgetFontSize = i;
            obj.WidgetFontStyle = s;
            obj.isLowLight = flag;
            ((WidgetSettingInfo) (obj)).save();
            return;
        }
        try
        {
            WidgetSettingInfo widgetsettinginfo = (WidgetSettingInfo)HolyBibleApplication.Connection().newEntity(com/hmobile/model/WidgetSettingInfo);
            widgetsettinginfo.WidgetFontSize = i;
            widgetsettinginfo.WidgetFontStyle = s;
            widgetsettinginfo.isLowLight = flag;
            widgetsettinginfo.save();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        return;
    }
}
