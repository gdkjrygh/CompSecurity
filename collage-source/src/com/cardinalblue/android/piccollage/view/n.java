// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.Matrix;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.model.gson.BaseScrapModel;
import com.cardinalblue.android.piccollage.model.gson.FontModel;
import com.cardinalblue.android.piccollage.model.gson.TextFormatModel;
import com.cardinalblue.android.piccollage.model.gson.TextScrapModel;

// Referenced classes of package com.cardinalblue.android.piccollage.view:
//            k, m

public class n extends com.cardinalblue.android.piccollage.view.k
{
    public static class a extends k.a
    {

        public static void a(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL("CREATE TABLE texts (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, collage_id INTEGER NOT NULL, center_x FLOAT NOT NULL, center_y FLOAT NOT NULL, scale FLOAT NOT NULL, angle FLOAT NOT NULL, z_index INTEGER NOT NULL, text_string TEXT NOT NULL, text_font TEXT NOT NULL, text_color INTEGER NOT NULL, text_outline_color INTEGER NOT NULL);");
        }

        public static void a(SQLiteDatabase sqlitedatabase, int l, int i1, Context context)
        {
            l;
            JVM INSTR tableswitch 3 15: default 68
        //                       3 85
        //                       4 85
        //                       5 85
        //                       6 89
        //                       7 89
        //                       8 89
        //                       9 89
        //                       10 89
        //                       11 89
        //                       12 89
        //                       13 89
        //                       14 89
        //                       15 89;
               goto _L1 _L2 _L2 _L2 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3
_L1:
            if (l != 15)
            {
                sqlitedatabase.execSQL("DROP TABLE IF EXISTS texts;");
                a(sqlitedatabase);
            }
            return;
_L2:
            a(sqlitedatabase);
_L3:
            a(sqlitedatabase, context);
            l = 15;
            if (true) goto _L1; else goto _L4
_L4:
        }

        private static void a(SQLiteDatabase sqlitedatabase, Context context)
        {
            sqlitedatabase.beginTransaction();
            int l;
            l = context.getResources().getDimensionPixelSize(0x7f0b000a);
            context = sqlitedatabase.query("texts", new String[] {
                "_id", "center_y"
            }, null, null, null, null, null);
            if (context.moveToFirst())
            {
                for (; !context.isAfterLast(); context.moveToNext())
                {
                    ContentValues contentvalues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(context, contentvalues);
                    contentvalues.put("center_y", Float.valueOf(contentvalues.getAsFloat("center_y").floatValue() - (float)l));
                    sqlitedatabase.update("texts", contentvalues, (new StringBuilder()).append("_id=").append(contentvalues.getAsLong("_id")).toString(), null);
                }

            }
            break MISSING_BLOCK_LABEL_151;
            Exception exception;
            exception;
            context.close();
            throw exception;
            context;
            sqlitedatabase.endTransaction();
            throw context;
            context.close();
            sqlitedatabase.setTransactionSuccessful();
            sqlitedatabase.endTransaction();
            return;
        }

        public a()
        {
        }
    }


    private m a;
    private boolean b;
    private int c;
    private int d;
    private int e;

    public n(Context context, ContentValues contentvalues)
        throws com.cardinalblue.android.piccollage.model.k.a, NullPointerException
    {
        super(contentvalues);
        c = contentvalues.getAsInteger("text_color").intValue();
        d = 0;
        e = contentvalues.getAsInteger("text_outline_color").intValue();
        TextScrapModel textscrapmodel;
        TextFormatModel textformatmodel;
        boolean flag;
        if (e != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        textscrapmodel = TextScrapModel.newEmptyTextModel(context);
        textscrapmodel.getText().setText(contentvalues.getAsString("text_string"));
        textformatmodel = textscrapmodel.getText().getTextFormat();
        textformatmodel.setTextColor(c);
        textformatmodel.setBorderColor(e);
        textformatmodel.setBackgroundColor(0);
        textformatmodel.setTextBorder(b);
        textformatmodel.getFont().setFontName(contentvalues.getAsString("text_font"));
        a = new m(context, textscrapmodel, true);
        f();
        a(contentvalues.getAsFloat("center_x").floatValue(), contentvalues.getAsFloat("center_y").floatValue(), contentvalues.getAsFloat("scale").floatValue(), contentvalues.getAsFloat("angle").floatValue());
    }

    public n(TextScrapModel textscrapmodel)
        throws IllegalArgumentException
    {
        super(textscrapmodel);
        b(textscrapmodel);
    }

    private void b(TextScrapModel textscrapmodel)
    {
        TextFormatModel textformatmodel = textscrapmodel.getText().getTextFormat();
        c = textformatmodel.getTextColor();
        d = textformatmodel.getTextBackgroundColor();
        e = textformatmodel.getTextBorderColor();
        b = textformatmodel.hasTextBorder();
        a = new m(com.cardinalblue.android.b.k.a(), textscrapmodel, true);
        f();
        J();
    }

    public BaseScrapModel D()
    {
        return k();
    }

    public void J()
    {
        l = new Matrix();
        float f1 = R();
        l.postTranslate(-h, -i);
        l.postRotate(-f1);
        f1 = 3F / j;
        l.postScale(f1, f1);
        l.invert(m);
    }

    public void a(Canvas canvas)
    {
        a.a(canvas);
    }

    public volatile void a(BaseScrapModel basescrapmodel)
    {
        a((TextScrapModel)basescrapmodel);
    }

    public void a(TextScrapModel textscrapmodel)
    {
        super.a(textscrapmodel);
        b(textscrapmodel);
    }

    public void b(int l)
    {
        a.b(l);
    }

    public String c()
    {
        return a.a();
    }

    public boolean c(float f1, float f2)
    {
        float f3 = (float)S() * 1.5F;
        float f4 = -f3;
        float f5 = 1.5F * (float)T();
        float f6 = -f5;
        return f1 >= f4 && f1 < f3 && f2 >= f6 && f2 < f5;
    }

    public String d()
    {
        return a.b();
    }

    public int e()
    {
        return c;
    }

    protected void f()
    {
        e(a.c());
        f(a.d());
    }

    public int g()
    {
        return d;
    }

    public int h()
    {
        return e;
    }

    public boolean i()
    {
        return b;
    }

    public void j()
    {
        f();
        J();
    }

    public TextScrapModel k()
    {
        return TextScrapModel.newInstance(this);
    }

    protected void x()
    {
    }
}
