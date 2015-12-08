// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.provider;

import android.net.Uri;
import android.provider.BaseColumns;

// Referenced classes of package com.phunware.nbc.sochi.caption.provider:
//            ClosedCaptioningStylesContract

public static final class 
    implements BaseColumns
{

    public static final String COLUMN_NAME_BACKGROUND_COLOR = "background_color";
    public static final String COLUMN_NAME_BACKGROUND_OPACITY = "background_opacity";
    public static final String COLUMN_NAME_FONT = "font";
    public static final String COLUMN_NAME_FONT_EDGE = "text_edge";
    public static final String COLUMN_NAME_TEXT_COLOR = "text_color";
    public static final String COLUMN_NAME_TEXT_OPACITY = "text_opacity";
    public static final String COLUMN_NAME_TEXT_SIZE = "text_size";
    public static final String COLUMN_NAME_TITLE = "title";
    public static final String COLUMN_SPANISH_NAME_BACKGROUND_COLOR = "background_esp_color";
    public static final String COLUMN_SPANISH_NAME_TEXT_COLOR = "text_esp_color";
    public static final Uri CONTENT_ID_URI_BASE;
    public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.npike.styles";
    public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.npike.styles";
    public static final Uri CONTENT_URI;
    public static final String DEFAULT_SORT_ORDER = "_id asc";
    public static final String DEFAULT_VALUE_BACKGROUND_COLOR = "Black";
    public static final int DEFAULT_VALUE_BACKGROUND_OPACITY = 50;
    public static final String DEFAULT_VALUE_FONT = "Default";
    public static final String DEFAULT_VALUE_FONT_EDGE = "Default";
    public static final String DEFAULT_VALUE_TEXT_COLOR = "White";
    public static final int DEFAULT_VALUE_TEXT_OPACITY = 100;
    public static final int DEFAULT_VALUE_TEXT_SIZE = 1;
    public static final int ID_PATH_POSITION = 1;
    public static final long STYLE_DEFAULT_ID = -1L;
    public static final long STYLE_LARGE_TEXT_ID = 0L;
    public static final String TABLE_NAME = "Styles";

    static 
    {
        CONTENT_ID_URI_BASE = Uri.parse((new StringBuilder()).append("content://").append(ClosedCaptioningStylesContract.AUTHORITY).append("/").append("Styles").append("/").toString());
        CONTENT_URI = Uri.parse((new StringBuilder()).append("content://").append(ClosedCaptioningStylesContract.AUTHORITY).append("/").append("Styles").toString());
    }

    private ()
    {
    }
}
