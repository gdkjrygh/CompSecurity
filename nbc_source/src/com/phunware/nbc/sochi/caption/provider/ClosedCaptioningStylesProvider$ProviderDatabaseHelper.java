// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.provider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.phunware.nbc.sochi.system.NBCSystem;

// Referenced classes of package com.phunware.nbc.sochi.caption.provider:
//            ClosedCaptioningStylesProvider

static class mContext extends SQLiteOpenHelper
{

    private static final String DATABASE_NAME = "Styles.db";
    private static final int DATABASE_VERSION = 1;
    private final Context mContext;

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        boolean _tmp = ClosedCaptioningStylesProvider.access$002("nbclive".equals("telemundo"));
        NBCSystem.debugLog(com/phunware/nbc/sochi/caption/provider/ClosedCaptioningStylesProvider.getSimpleName(), "Creating the Styles table");
        StringBuilder stringbuilder = (new StringBuilder()).append("CREATE TABLE Styles (_id INTEGER PRIMARY KEY AUTOINCREMENT,title TEXT, font TEXT default '");
        String s;
        if (ClosedCaptioningStylesProvider.access$000())
        {
            s = "Predeterminada";
        } else
        {
            s = "Default";
        }
        stringbuilder = stringbuilder.append(s).append("', ").append("text_size").append(" INTEGER default ").append(1).append(", ").append("text_color").append(" TEXT default ").append("White").append(", ").append("background_color").append(" TEXT default ").append("Black").append(", ").append("background_opacity").append(" INTEGER default ").append(50).append(", ").append("text_opacity").append(" INTEGER default ").append(100).append(", ").append("text_edge").append(" TEXT default '");
        if (ClosedCaptioningStylesProvider.access$000())
        {
            s = "Predeterminado";
        } else
        {
            s = "Default";
        }
        sqlitedatabase.execSQL(stringbuilder.append(s).append("', ").append("text_esp_color").append(" TEXT default Blanco").append(", ").append("background_esp_color").append(" TEXT default Negro").append("").append(");").toString());
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        Log.w(com/phunware/nbc/sochi/caption/provider/ClosedCaptioningStylesProvider.getSimpleName(), (new StringBuilder()).append("Upgrading database from version ").append(i).append(" to ").append(j).append(", which will destroy all old data").toString());
        onCreate(sqlitedatabase);
    }

    (Context context)
    {
        super(context, "Styles.db", null, 1);
        mContext = context;
    }
}
