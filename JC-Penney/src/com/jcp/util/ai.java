// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import android.util.Log;
import com.jcp.JCP;
import com.jcp.model.LocalAdsCatalogs;
import com.jcp.pojo.LocalAdProduct;
import com.jcp.pojo.LocalAdPromotion;
import com.jcp.storepickup.pojo.Stores;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jcp.util:
//            g, ae, aa

public final class ai extends SQLiteOpenHelper
{

    private static final String a = com/jcp/util/g.getName();
    private static ai b;
    private Context c;

    private ai(Context context)
    {
        super(context, "JCP_LOCAL_ADS", null, 1);
        c = context;
    }

    public static ai a()
    {
        if (b == null)
        {
            b = new ai(JCP.d());
        }
        return b;
    }

    public List a(String s)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj5;
        Object obj6;
        Object obj9;
        String s2;
        String s3;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        ArrayList arraylist;
        obj18 = null;
        arraylist = new ArrayList();
        obj17 = null;
        s3 = null;
        obj10 = null;
        obj11 = null;
        obj5 = null;
        obj16 = null;
        obj1 = null;
        obj12 = null;
        obj13 = null;
        obj6 = null;
        s2 = null;
        obj = null;
        obj14 = null;
        obj15 = null;
        obj9 = null;
        obj2 = null;
        obj3 = null;
        Object obj4 = getReadableDatabase();
        obj3 = obj4;
        obj2 = obj4;
        s = ((SQLiteDatabase) (obj4)).rawQuery((new StringBuilder()).append("SELECT id,name,external_display_name,valid_from,valid_to,thumbnail_image_url FROM JCP_ADS_PUBLICATIONS WHERE store_id='").append(s).append("'").toString(), null);
        obj2 = s;
        obj1 = obj9;
        obj = obj6;
        s = ((String) (obj5));
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        obj1 = obj9;
        obj = obj6;
        s = ((String) (obj5));
        s3 = obj14;
        obj9 = obj12;
        obj3 = obj10;
        s2 = obj15;
        obj6 = obj13;
        obj5 = obj11;
        if (((Cursor) (obj2)).getCount() == 0) goto _L2; else goto _L3
_L3:
        s3 = obj14;
        obj9 = obj12;
        obj3 = obj10;
        s2 = obj15;
        obj6 = obj13;
        obj5 = obj11;
        int i = ((Cursor) (obj2)).getColumnIndex("id");
        s3 = obj14;
        obj9 = obj12;
        obj3 = obj10;
        s2 = obj15;
        obj6 = obj13;
        obj5 = obj11;
        int j = ((Cursor) (obj2)).getColumnIndex("name");
        s3 = obj14;
        obj9 = obj12;
        obj3 = obj10;
        s2 = obj15;
        obj6 = obj13;
        obj5 = obj11;
        int k = ((Cursor) (obj2)).getColumnIndex("external_display_name");
        s3 = obj14;
        obj9 = obj12;
        obj3 = obj10;
        s2 = obj15;
        obj6 = obj13;
        obj5 = obj11;
        int l = ((Cursor) (obj2)).getColumnIndex("valid_from");
        s3 = obj14;
        obj9 = obj12;
        obj3 = obj10;
        s2 = obj15;
        obj6 = obj13;
        obj5 = obj11;
        int i1 = ((Cursor) (obj2)).getColumnIndex("valid_to");
        s3 = obj14;
        obj9 = obj12;
        obj3 = obj10;
        s2 = obj15;
        obj6 = obj13;
        obj5 = obj11;
        int j1 = ((Cursor) (obj2)).getColumnIndex("thumbnail_image_url");
        s3 = obj14;
        obj9 = obj12;
        obj3 = obj10;
        s2 = obj15;
        obj6 = obj13;
        obj5 = obj11;
        ((Cursor) (obj2)).moveToFirst();
        s = null;
        obj = null;
        obj1 = null;
_L7:
        if (((Cursor) (obj2)).isAfterLast()) goto _L2; else goto _L4
_L4:
        obj3 = ((Cursor) (obj2)).getString(i);
        obj5 = ((Cursor) (obj2)).getString(j);
        obj9 = ((Cursor) (obj2)).getString(k);
        s2 = ((Cursor) (obj2)).getString(l);
        s3 = ((Cursor) (obj2)).getString(i1);
        String s4 = ((Cursor) (obj2)).getString(j1);
        obj6 = new LocalAdPromotion();
        ((LocalAdPromotion) (obj6)).setId(((String) (obj3)));
        ((LocalAdPromotion) (obj6)).setName(((String) (obj5)));
        ((LocalAdPromotion) (obj6)).setValidFrom(s2);
        ((LocalAdPromotion) (obj6)).setValidTo(s3);
        ((LocalAdPromotion) (obj6)).setThumbnailImageUrl(s4);
        if (TextUtils.isEmpty(((CharSequence) (obj9))))
        {
            break MISSING_BLOCK_LABEL_1326;
        }
        if (!((String) (obj9)).equalsIgnoreCase("Home Catalog") && !((String) (obj9)).equalsIgnoreCase("Catalog")) goto _L6; else goto _L5
_L5:
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_578;
        }
        obj3 = new ArrayList();
        obj = obj3;
        ((List) (obj)).add(obj6);
        obj3 = s;
        s = ((String) (obj1));
        obj1 = obj3;
_L8:
        s3 = s;
        obj9 = obj;
        obj3 = obj1;
        s2 = s;
        obj6 = obj;
        obj5 = obj1;
        ((Cursor) (obj2)).moveToNext();
        obj3 = obj1;
        obj1 = s;
        s = ((String) (obj3));
          goto _L7
_L6:
        if (b() == null)
        {
            break MISSING_BLOCK_LABEL_1326;
        }
        if (!((String) (obj9)).equalsIgnoreCase("Store Ads") && !((String) (obj9)).equalsIgnoreCase("Mailer"))
        {
            break MISSING_BLOCK_LABEL_695;
        }
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_675;
        }
        obj3 = new ArrayList();
        s = ((String) (obj3));
        s.add(obj6);
        obj3 = s;
        s = ((String) (obj1));
        obj1 = obj3;
          goto _L8
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1326;
        }
        obj5 = new ArrayList();
        ((List) (obj5)).add(obj6);
        obj1 = s;
        s = ((String) (obj5));
          goto _L8
_L2:
        if (obj2 != null && !((Cursor) (obj2)).isClosed())
        {
            ((Cursor) (obj2)).close();
        }
        if (obj4 != null)
        {
            ((SQLiteDatabase) (obj4)).close();
        }
        if (s != null)
        {
            arraylist.add(new LocalAdsCatalogs("Store Ads", s));
        }
        if (obj != null)
        {
            arraylist.add(new LocalAdsCatalogs("Catalogs", ((List) (obj))));
        }
        if (obj1 != null)
        {
            arraylist.add(new LocalAdsCatalogs("Others", ((List) (obj1))));
        }
_L10:
        return arraylist;
        obj5;
        s = obj18;
        obj2 = obj17;
        obj1 = obj16;
        obj = s2;
        obj4 = obj3;
        obj3 = obj5;
_L13:
        ae.a(a, (new StringBuilder()).append("Error ! while fetching Local Ads from DB :").append(((Exception) (obj3)).getMessage()).toString());
        if (s != null && !s.isClosed())
        {
            s.close();
        }
        if (obj4 != null)
        {
            ((SQLiteDatabase) (obj4)).close();
        }
        if (obj2 != null)
        {
            arraylist.add(new LocalAdsCatalogs("Store Ads", ((List) (obj2))));
        }
        if (obj1 != null)
        {
            arraylist.add(new LocalAdsCatalogs("Catalogs", ((List) (obj1))));
        }
        if (obj == null) goto _L10; else goto _L9
_L9:
        arraylist.add(new LocalAdsCatalogs("Others", ((List) (obj))));
        return arraylist;
        s;
        obj5 = null;
        obj3 = s3;
        obj4 = obj2;
_L12:
        if (obj5 != null && !((Cursor) (obj5)).isClosed())
        {
            ((Cursor) (obj5)).close();
        }
        if (obj4 != null)
        {
            ((SQLiteDatabase) (obj4)).close();
        }
        if (obj3 != null)
        {
            arraylist.add(new LocalAdsCatalogs("Store Ads", ((List) (obj3))));
        }
        if (obj1 != null)
        {
            arraylist.add(new LocalAdsCatalogs("Catalogs", ((List) (obj1))));
        }
        if (obj != null)
        {
            arraylist.add(new LocalAdsCatalogs("Others", ((List) (obj))));
        }
        throw s;
        s;
        obj = s3;
        obj1 = obj9;
        obj5 = obj2;
        continue; /* Loop/switch isn't completed */
        obj6;
        obj3 = obj;
        obj5 = s;
        s = ((String) (obj6));
        obj = obj1;
        obj1 = obj3;
        obj3 = obj5;
        obj5 = obj2;
        continue; /* Loop/switch isn't completed */
        obj6;
        obj3 = s;
        obj5 = obj;
        s = ((String) (obj6));
        obj = obj1;
        obj1 = obj5;
        obj5 = obj2;
        continue; /* Loop/switch isn't completed */
        obj6;
        obj3 = obj;
        obj5 = s;
        obj = obj1;
        s = ((String) (obj6));
        obj1 = obj3;
        obj3 = obj5;
        obj5 = obj2;
        continue; /* Loop/switch isn't completed */
        obj6;
        obj1 = obj;
        obj3 = s;
        s = ((String) (obj6));
        obj = obj5;
        obj5 = obj2;
        continue; /* Loop/switch isn't completed */
        obj3;
        obj5 = s;
        s = ((String) (obj3));
        obj3 = obj2;
        if (true) goto _L12; else goto _L11
_L11:
        obj3;
        s = ((String) (obj2));
        obj = s2;
        obj1 = obj6;
        obj2 = obj5;
          goto _L13
        obj3;
        obj5 = obj;
        Object obj7 = obj2;
        obj = obj1;
        obj1 = obj5;
        obj2 = s;
        s = ((String) (obj7));
          goto _L13
        obj3;
        obj5 = obj2;
        obj2 = obj;
        obj = obj1;
        obj1 = obj2;
        obj2 = s;
        s = ((String) (obj5));
          goto _L13
        obj3;
        obj5 = obj2;
        obj2 = obj;
        obj = obj1;
        obj1 = obj2;
        obj2 = s;
        s = ((String) (obj5));
          goto _L13
        obj3;
        obj1 = obj;
        Object obj8 = obj2;
        obj = obj5;
        obj2 = s;
        s = ((String) (obj8));
          goto _L13
        String s1 = s;
        s = ((String) (obj1));
        obj1 = s1;
          goto _L8
    }

    public void a(LocalAdProduct localadproduct)
    {
        Object obj1 = null;
        this;
        JVM INSTR monitorenter ;
        Object obj = getWritableDatabase();
        Object obj2;
        obj1 = obj;
        obj2 = obj;
        if (TextUtils.isEmpty(localadproduct.getCategory()))
        {
            break MISSING_BLOCK_LABEL_164;
        }
        obj1 = obj;
        obj2 = obj;
        if (TextUtils.isEmpty(localadproduct.getSku()))
        {
            break MISSING_BLOCK_LABEL_164;
        }
        obj1 = obj;
        obj2 = obj;
        ContentValues contentvalues = new ContentValues();
        obj1 = obj;
        obj2 = obj;
        contentvalues.put("id", localadproduct.getId());
        obj1 = obj;
        obj2 = obj;
        contentvalues.put("flyer_id", localadproduct.getFlyerId());
        obj1 = obj;
        obj2 = obj;
        contentvalues.put("name", localadproduct.getName());
        obj1 = obj;
        obj2 = obj;
        contentvalues.put("sku", localadproduct.getSku());
        obj1 = obj;
        obj2 = obj;
        contentvalues.put("category", localadproduct.getCategory());
        obj1 = obj;
        obj2 = obj;
        contentvalues.put("category_id", localadproduct.getCategoryId());
        obj1 = obj;
        obj2 = obj;
        ((SQLiteDatabase) (obj)).insertOrThrow("JCP_ADS_FLYER_PRODUCTS", null, contentvalues);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        ((SQLiteDatabase) (obj)).close();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        localadproduct;
        obj2 = obj1;
        ae.a(a, "SQLiteConstraintException while adding publication product");
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        ((SQLiteDatabase) (obj1)).close();
          goto _L2
        localadproduct;
        throw localadproduct;
        obj;
        localadproduct = null;
_L5:
        ae.a(a, (new StringBuilder()).append("Exception in addPublicationProduct(): ").append(((Exception) (obj)).getMessage()).toString());
        if (localadproduct == null) goto _L2; else goto _L3
_L3:
        localadproduct.close();
          goto _L2
_L4:
        if (localadproduct == null)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        localadproduct.close();
        throw obj;
        obj;
        localadproduct = ((LocalAdProduct) (obj2));
          goto _L4
        obj;
          goto _L4
        Exception exception;
        exception;
        localadproduct = ((LocalAdProduct) (obj));
        obj = exception;
          goto _L5
        obj;
        localadproduct = null;
          goto _L4
    }

    public void a(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("thumbnail_image_url", s1);
        sqlitedatabase.update("JCP_ADS_PUBLICATIONS", contentvalues, "id=?", new String[] {
            s
        });
        sqlitedatabase.close();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        ae.a(a, (new StringBuilder()).append("Exception in addPublicationImageUrl(): ").append(s.getMessage()).toString());
        if (true) goto _L2; else goto _L1
_L1:
        s;
        throw s;
    }

    public void a(LocalAdPromotion alocaladpromotion[], String s)
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        int j;
        sqlitedatabase = getWritableDatabase();
        j = alocaladpromotion.length;
        int i = 0;
_L2:
        LocalAdPromotion localadpromotion;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        localadpromotion = alocaladpromotion[i];
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("id", localadpromotion.getId());
        contentvalues.put("name", localadpromotion.getName());
        contentvalues.put("flyer_type", localadpromotion.getFlyerType());
        contentvalues.put("total_pages", localadpromotion.getTotalPages());
        contentvalues.put("external_display_name", localadpromotion.getExternalDisplayName());
        contentvalues.put("locale", localadpromotion.getLocale());
        contentvalues.put("postal_code", localadpromotion.getPostalCode());
        contentvalues.put("valid_from", localadpromotion.getValidFrom());
        contentvalues.put("valid_to", localadpromotion.getValidTo());
        contentvalues.put("available_from", localadpromotion.getAvailableFrom());
        contentvalues.put("available_to", localadpromotion.getAvailableTo());
        contentvalues.put("store_id", s);
        long l = sqlitedatabase.insert("JCP_ADS_PUBLICATIONS", null, contentvalues);
        ae.e(a, (new StringBuilder()).append("LocalAd Publication add result :").append(l).toString());
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        sqlitedatabase.close();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
        alocaladpromotion;
        ae.a(a, (new StringBuilder()).append("Exception in addPublications(): ").append(alocaladpromotion.getMessage()).toString());
        if (true) goto _L4; else goto _L3
_L3:
        alocaladpromotion;
        throw alocaladpromotion;
    }

    public Stores b()
    {
        return (Stores)aa.a(c.getSharedPreferences("MyPrefsForStore", 0).getString("storeList", null), com/jcp/storepickup/pojo/Stores);
    }

    public List b(String s, String s1)
    {
        String s2;
        String s3;
        Object obj;
        Object obj1;
        ArrayList arraylist;
        obj1 = null;
        obj = null;
        arraylist = new ArrayList();
        s3 = obj;
        s2 = obj1;
        SQLiteDatabase sqlitedatabase = getReadableDatabase();
        s3 = obj;
        s2 = obj1;
        s = sqlitedatabase.rawQuery((new StringBuilder()).append("SELECT DISTINCT sku FROM JCP_ADS_FLYER_PRODUCTS WHERE flyer_id='").append(s).append("' AND ").append("category_id").append("='").append(s1).append("'").toString(), null);
        if (s == null) goto _L2; else goto _L1
_L1:
        s3 = s;
        s2 = s;
        if (s.getCount() == 0) goto _L2; else goto _L3
_L3:
        s3 = s;
        s2 = s;
        int i = s.getColumnIndex("sku");
        s3 = s;
        s2 = s;
        s.moveToFirst();
_L4:
        s3 = s;
        s2 = s;
        if (s.isAfterLast())
        {
            break; /* Loop/switch isn't completed */
        }
        s3 = s;
        s2 = s;
        s1 = s.getString(i);
        s3 = s;
        s2 = s;
        Log.e(a, (new StringBuilder()).append("SKU ").append(s1).toString());
        s3 = s;
        s2 = s;
        arraylist.add(s1);
        s3 = s;
        s2 = s;
        s.moveToNext();
        if (true) goto _L4; else goto _L2
        s;
        s2 = s3;
        ae.a(a, (new StringBuilder()).append("Error! while fetching SKU Ids from db").append(s.getMessage()).toString());
        if (s3 != null && !s3.isClosed())
        {
            s3.close();
        }
_L6:
        return arraylist;
_L2:
        s3 = s;
        s2 = s;
        sqlitedatabase.close();
        if (s == null || s.isClosed()) goto _L6; else goto _L5
_L5:
        s.close();
        return arraylist;
        s;
        if (s2 != null && !s2.isClosed())
        {
            s2.close();
        }
        throw s;
    }

    public boolean b(String s)
    {
        Object obj;
        boolean flag;
        try
        {
            obj = (new StringBuilder()).append("SELECT id FROM JCP_ADS_PUBLICATIONS WHERE store_id=").append(s).toString();
            s = getReadableDatabase();
            obj = s.rawQuery(((String) (obj)), null);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (((Cursor) (obj)).getCount() == 0) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        ((Cursor) (obj)).close();
        s.close();
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public String c()
    {
        return "2795";
    }

    public boolean c(String s)
    {
        Object obj;
        obj = (new StringBuilder()).append("SELECT sku FROM JCP_ADS_FLYER_PRODUCTS WHERE flyer_id='").append(s).append("'").toString();
        s = getReadableDatabase();
        obj = s.rawQuery(((String) (obj)), null);
        boolean flag;
        if (((Cursor) (obj)).getCount() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            ((Cursor) (obj)).close();
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return flag;
    }

    public void d()
    {
        if (c != null)
        {
            c.deleteDatabase("JCP_LOCAL_ADS");
        }
        b = null;
        close();
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS JCP_ADS_PUBLICATIONS(id TEXT,name TEXT,flyer_type TEXT,total_pages TEXT,external_display_name TEXT,locale TEXT,postal_code TEXT,valid_from TEXT,valid_to TEXT,available_from TEXT,available_to TEXT,thumbnail_image_url TEXT,store_id TEXT)");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS JCP_ADS_FLYER_PRODUCTS(id TEXT,flyer_id TEXT,name TEXT,sku TEXT,category TEXT,category_id TEXT NOT NULL)");
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }

}
