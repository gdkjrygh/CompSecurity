// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.aviary.android.feather.common.a.a;
import com.aviary.android.feather.common.utils.d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.aviary.android.feather.cds:
//            g, h

final class c
{

    private static final com.aviary.android.feather.common.a.a.c a;
    private static final String b;
    private Context c;

    public c(Context context)
    {
        c = context;
    }

    private long a(SQLiteDatabase sqlitedatabase, ContentValues acontentvalues[])
    {
        long l;
        boolean flag;
        if (acontentvalues != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assert.assertTrue(flag);
        if (acontentvalues.length > 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assert.assertTrue(flag);
        a.a((new StringBuilder()).append("insert pack, content and items: ").append(acontentvalues.length).toString());
        l = com.aviary.android.feather.cds.g.a("packs_table", acontentvalues[0], sqlitedatabase);
        if (l < 0L)
        {
            a.d((new StringBuilder()).append("packId=").append(l).toString());
            return -1L;
        }
        ContentValues contentvalues = acontentvalues[1];
        contentvalues.put("content_packId", Long.valueOf(l));
        long l1 = com.aviary.android.feather.cds.g.a("content_table", contentvalues, sqlitedatabase);
        if (l1 < 0L)
        {
            a.d((new StringBuilder()).append("rowId=").append(l1).toString());
            return -1L;
        }
        for (int i = 2; i < acontentvalues.length; i++)
        {
            ContentValues contentvalues1 = acontentvalues[i];
            contentvalues1.put("item_packId", Long.valueOf(l));
            long l2 = com.aviary.android.feather.cds.g.a("items_table", contentvalues1, sqlitedatabase);
            if (l2 < 0L)
            {
                a.d((new StringBuilder()).append("itemId=").append(l2).toString());
                return -1L;
            }
        }

        return l;
    }

    private void a(SQLiteDatabase sqlitedatabase, String s, String s1)
        throws AssertionError
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("version_versionKey", s);
        contentvalues.put("version_assetsBaseURL", s1);
        boolean flag;
        if (sqlitedatabase.insert("version_table", null, contentvalues) > -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assert.assertTrue(flag);
    }

    private void a(SQLiteDatabase sqlitedatabase, String s, String s1, long l)
        throws IOException, AssertionError, android.content.res.Resources.NotFoundException
    {
        Object obj;
        boolean flag;
        boolean flag1 = true;
        a.c("extractIcon: %s", new Object[] {
            s1
        });
        obj = c.getResources();
        int i = ((Resources) (obj)).getIdentifier(s, "raw", c.getPackageName());
        File file;
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assert.assertTrue(flag);
        obj = ((Resources) (obj)).openRawResource(i);
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assert.assertTrue(flag);
        s1 = (new StringBuilder()).append(c.getFilesDir()).append("/").append(h.c(s1)).toString();
        file = new File(s1);
        file.mkdirs();
        Assert.assertTrue(file.isDirectory());
        s1 = new File((new StringBuilder()).append(s1).append("/").append(s).append(".png").toString());
        a.a((new StringBuilder()).append("iconFilePath: ").append(s1.getAbsolutePath()).toString());
        s = new FileOutputStream(s1, true);
        d.a(((java.io.InputStream) (obj)), s);
        d.a(s);
        d.a(((java.io.Closeable) (obj)));
        if (a(sqlitedatabase, l, s1.getAbsolutePath(), 0) > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Assert.assertTrue(flag);
        return;
        sqlitedatabase;
        d.a(s);
        d.a(((java.io.Closeable) (obj)));
        throw sqlitedatabase;
    }

    private void a(SQLiteDatabase sqlitedatabase, String s, String s1, long l, String s2)
        throws AssertionError, android.content.res.Resources.NotFoundException, IOException
    {
        boolean flag;
        boolean flag1 = true;
        a.c("extractContent: %s", new Object[] {
            s1
        });
        s2 = c.getResources();
        int i = s2.getIdentifier(s, "raw", c.getPackageName());
        a.b("contentResId: %d", new Object[] {
            Integer.valueOf(i)
        });
        s = (new StringBuilder()).append("could not find content ").append(s).append(", contentResId: ").append(i).toString();
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assert.assertTrue(s, flag);
        s = s2.openRawResource(i);
        if (s != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assert.assertTrue(flag);
        a.b((new StringBuilder()).append("Extracting ").append(s1).toString());
        s1 = new File((new StringBuilder()).append(c.getFilesDir()).append("/").append(com.aviary.android.feather.cds.h.d(s1)).toString());
        s1.mkdirs();
        Assert.assertTrue("failed to create output dir", s1.isDirectory());
        s1.setReadable(true, false);
        d.a(s, s1);
        d.a(s);
        i = a(sqlitedatabase, l, s1.getAbsolutePath());
        a.a((new StringBuilder()).append("updateContentPath result: ").append(i).toString());
        if (i > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Assert.assertTrue(flag);
        return;
        sqlitedatabase;
        d.a(s);
        throw sqlitedatabase;
    }

    private void a(SQLiteDatabase sqlitedatabase, JSONObject jsonobject, boolean flag)
        throws JSONException, IOException, AssertionError
    {
        a.b("loadPackContent");
        Object obj1 = new com.aviary.android.feather.cds.a.a();
        if (((com.aviary.android.feather.cds.a.a) (obj1)).b(jsonobject) != 0)
        {
            throw new AssertionFailedError(((com.aviary.android.feather.cds.a.a) (obj1)).o());
        }
        jsonobject = ((com.aviary.android.feather.cds.a.a) (obj1)).b();
        String s = ((com.aviary.android.feather.cds.a.a) (obj1)).d();
        a.c("loadPackContent: %s", new Object[] {
            s
        });
        Object obj = new ArrayList();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("pack_identifier", jsonobject);
        contentvalues.put("pack_type", s);
        contentvalues.put("pack_versionKey", ((com.aviary.android.feather.cds.a.a) (obj1)).c());
        contentvalues.put("pack_visible", Integer.valueOf(1));
        contentvalues.put("pack_displayOrder", Integer.valueOf(0));
        ((ArrayList) (obj)).add(contentvalues);
        contentvalues = new ContentValues();
        contentvalues.put("content_displayName", ((com.aviary.android.feather.cds.a.a) (obj1)).e());
        contentvalues.put("content_displayDescription", ((com.aviary.android.feather.cds.a.a) (obj1)).f());
        contentvalues.put("content_contentURL", (new StringBuilder()).append(b).append(((com.aviary.android.feather.cds.a.a) (obj1)).k()).toString());
        contentvalues.put("content_contentVersion", ((com.aviary.android.feather.cds.a.a) (obj1)).l());
        contentvalues.put("content_iconUrl", (new StringBuilder()).append(b).append(((com.aviary.android.feather.cds.a.a) (obj1)).g()).toString());
        contentvalues.put("content_iconVersion", ((com.aviary.android.feather.cds.a.a) (obj1)).h());
        contentvalues.put("content_previewURL", (new StringBuilder()).append(b).append(((com.aviary.android.feather.cds.a.a) (obj1)).i()).toString());
        contentvalues.put("content_previewVersion", ((com.aviary.android.feather.cds.a.a) (obj1)).j());
        int i;
        if (((com.aviary.android.feather.cds.a.a) (obj1)).m())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put("content_isFree", Integer.valueOf(i));
        if (flag)
        {
            contentvalues.put("content_purchased", Integer.valueOf(1));
        }
        ((ArrayList) (obj)).add(contentvalues);
        obj1 = ((com.aviary.android.feather.cds.a.a) (obj1)).a();
        for (i = 0; i < ((List) (obj1)).size(); i++)
        {
            com.aviary.android.feather.cds.a.a.a a1 = (com.aviary.android.feather.cds.a.a.a)((List) (obj1)).get(i);
            ContentValues contentvalues1 = new ContentValues();
            contentvalues1.put("item_identifier", a1.a());
            contentvalues1.put("item_displayName", a1.b());
            if (a1.c() != null)
            {
                contentvalues1.put("item_options", a1.c());
            }
            ((ArrayList) (obj)).add(contentvalues1);
        }

        long l = a(sqlitedatabase, (ContentValues[])((ArrayList) (obj)).toArray(new ContentValues[((ArrayList) (obj)).size()]));
        a.b("added pack: %d", new Object[] {
            Long.valueOf(l)
        });
        boolean flag1;
        if (l > -1L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Assert.assertTrue(flag1);
        obj = jsonobject.replace(".", "_");
        a.b("resIdentifier: %s", new Object[] {
            obj
        });
        a(sqlitedatabase, (new StringBuilder()).append(((String) (obj))).append("_icon").toString(), ((String) (jsonobject)), l);
        if (flag)
        {
            a(sqlitedatabase, (new StringBuilder()).append(((String) (obj))).append("_content").toString(), ((String) (jsonobject)), l, s);
        }
    }

    public int a(SQLiteDatabase sqlitedatabase, long l, String s)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("content_contentPath", s);
        contentvalues.put("content_installDate", com.aviary.android.feather.common.utils.c.a(System.currentTimeMillis()));
        return sqlitedatabase.update("content_table", contentvalues, "content_packId=?", new String[] {
            String.valueOf(l)
        });
    }

    public int a(SQLiteDatabase sqlitedatabase, long l, String s, int i)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("content_iconPath", s);
        contentvalues.put("content_iconNeedDownload", Integer.valueOf(i));
        return sqlitedatabase.update("content_table", contentvalues, "content_packId=?", new String[] {
            String.valueOf(l)
        });
    }

    public boolean a(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor;
        cursor = sqlitedatabase.query("version_table", new String[] {
            "version_id"
        }, null, null, null, null, null, "1");
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        if (cursor.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        a.c("database is not empty");
        d.a(cursor);
        return false;
        d.a(cursor);
        if (sqlitedatabase.isReadOnly())
        {
            a.c("Failed to load default content because db is readOnly.");
            return false;
        }
        break MISSING_BLOCK_LABEL_86;
        sqlitedatabase;
        d.a(cursor);
        throw sqlitedatabase;
        sqlitedatabase.beginTransaction();
        a.a("Beginning load default content transaction");
        a(sqlitedatabase, new JSONObject("{\"packType\":\"effect\",\"displayName\":\"Original\",\"displayDescription\":\"Get started with this free pack of essential effects for beautiful, everyday photography.\",\"icon\":\"/cdsv2/assets/com.aviary.effectpack.04/images.iconNoBorder.1a1d49d0-8fab-469f-ab84-8153b8b248e4.png\",\"iconVersion\":\"67b12f4b7ff2388e92b36feaa7bd697e\",\"previewURL\":\"/cdsv2/assets/com.aviary.effectpack.04/zips.androidPreviewHiRes.461e6277-9015-4bac-8b13-825821ce79cd.zip\",\"previewVersion\":\"11a5a08e3a31b7c119eef4aa98e4f419\",\"contentURL\":\"/cdsv2/assets/com.aviary.effectpack.04/zips.effectJSON.dc704195-6ef7-4dcd-86bf-c4d5611fd3e9.zip\",\"contentVersion\":\"93a42476c27cedb213642f9760ee6911\",\"isFree\":true,\"identifier\":\"com.aviary.effectpack.04\",\"items\":[{\"identifier\":\"default5\",\"displayName\":\"Clyde\"},{\"identifier\":\"default10\",\"displayName\":\"Avenue\"},{\"identifier\":\"default2\",\"displayName\":\"Haas\"},{\"identifier\":\"default9\",\"displayName\":\"Arizona\"},{\"identifier\":\"default11\",\"displayName\":\"Lucky\"},{\"identifier\":\"default1\",\"displayName\":\"Dean\"},{\"identifier\":\"default8\",\"displayName\":\"Keylime\"},{\"identifier\":\"default3\",\"displayName\":\"Boardwalk\"},{\"identifier\":\"default7\",\"displayName\":\"Sentosa\"},{\"identifier\":\"default13\",\"displayName\":\"Sage\"},{\"identifier\":\"default6\",\"displayName\":\"Metropolis\"},{\"identifier\":\"default12\",\"displayName\":\"Cruz\"}],\"versionKey\":\"525da7194b6dc747530082b3\",\"v\":1382031299426,\"code\":0,\"status\":\"Ok\"}"), true);
        a(sqlitedatabase, new JSONObject("{\"packType\":\"sticker\",\"displayName\":\"Original\",\"displayDescription\":\"Decorate all of your photos with this fun and totally free pack of hats, eyewear, neckwear, speech bubbles, shapes and more!\",\"icon\":\"/cdsv2/assets/com.aviary.stickerpack.00/images.iconNoRoll.3b1ec9a6-6ab5-4bb0-9ee0-7b9f3dd93cea.png\",\"iconVersion\":\"759f327f8a900c362e17597aa030520a\",\"previewURL\":\"/cdsv2/assets/com.aviary.stickerpack.00/zips.androidPreviewHiRes.de2afa87-b8a3-42cd-a3b6-4b32c6e2aca7.zip\",\"previewVersion\":\"309187b016c83a2ae3d8aa340c6445dc\",\"contentURL\":\"/cdsv2/assets/com.aviary.stickerpack.00/zips.contentAndroidHiRes.3d8cf538-dca9-4121-91aa-14604118eb05.zip\",\"contentVersion\":\"11e0b876e7b8db319b3c5db32d716649\",\"isFree\":true,\"identifier\":\"com.aviary.stickerpack.00\",\"items\":[{\"identifier\":\"sombrero\",\"displayName\":\"Sombrero\"},{\"identifier\":\"helicopter\",\"displayName\":\"Helicopter\"},{\"identifier\":\"crown\",\"displayName\":\"Crown\"},{\"identifier\":\"fez\",\"displayName\":\"Fez\"},{\"identifier\":\"3d_glasses\",\"displayName\":\"3D Glasses\"},{\"identifier\":\"hipster_glasses\",\"displayName\":\"Hipster Glasses\"},{\"identifier\":\"disguise\",\"displayName\":\"Disguise\"},{\"identifier\":\"aviators\",\"displayName\":\"Aviators\"},{\"identifier\":\"eyepatch\",\"displayName\":\"Eyepatch\"},{\"identifier\":\"bowtie\",\"displayName\":\"Bow Tie\"},{\"identifier\":\"tie\",\"displayName\":\"Tie\"},{\"identifier\":\"pipe\",\"displayName\":\"Pipe\"},{\"identifier\":\"cigar\",\"displayName\":\"Cigar\"},{\"identifier\":\"arrow\",\"displayName\":\"Arrow\"},{\"identifier\":\"green_bubble\",\"displayName\":\"Green Bubble\"},{\"identifier\":\"orange_bubble\",\"displayName\":\"Orange Bubble\"},{\"identifier\":\"blue_bubble\",\"displayName\":\"Blue Bubble\"},{\"identifier\":\"pink_bubble\",\"displayName\":\"Pink Bubble\"},{\"identifier\":\"star\",\"displayName\":\"Star\"},{\"identifier\":\"heart_original\",\"displayName\":\"Heart\"},{\"identifier\":\"red_arrow\",\"displayName\":\"Red Arrow\"},{\"identifier\":\"blue_arrow\",\"displayName\":\"Blue Arrow\"},{\"identifier\":\"green_circle\",\"displayName\":\"Green Circle\"},{\"identifier\":\"orange_square\",\"displayName\":\"Orange Square\"}],\"versionKey\":\"525da75c4b6dc74753008383\",\"v\":1382031518696,\"code\":0,\"status\":\"Ok\"}"), false);
        a(sqlitedatabase, new JSONObject("{\"packType\":\"frame\",\"displayName\":\"Original\",\"displayDescription\":\"Get started with this free pack of beautiful, high resolution frames.\",\"icon\":\"/cdsv2/assets/com.aviary.framepack.00/images.iconSquare.591e2c46-4057-42f5-977c-7ce4d6fe9365.png\",\"iconVersion\":\"8fdcd0bf0c8003ccca0075de17bf736f\",\"previewURL\":\"/cdsv2/assets/com.aviary.framepack.00/zips.androidPreviewHiRes.9ccd202e-446b-4095-a05c-4a8209ba88d8.zip\",\"previewVersion\":\"8fa83467e7a542e5b07bd1b4a2330671\",\"contentURL\":\"/cdsv2/assets/com.aviary.framepack.00/zips.contentAndroidHiRes.8c9434eb-c7af-471e-919a-8df7db755fb4.zip\",\"contentVersion\":\"c9e2d1edf0d5af6d0a17489a22cf7bd8\",\"isFree\":true,\"identifier\":\"com.aviary.framepack.00\",\"items\":[{\"identifier\":\"border12\",\"displayName\":\"Pistol\",\"options\":{\"width\":0.15}},{\"identifier\":\"border11\",\"displayName\":\"Ivory\",\"options\":{\"width\":0.15}},{\"identifier\":\"border3\",\"displayName\":\"Punch\",\"options\":{\"width\":0.15}},{\"identifier\":\"border1\",\"displayName\":\"Instant\",\"options\":{\"width\":0.15}},{\"identifier\":\"border4\",\"displayName\":\"Studio\",\"options\":{\"width\":0.15}},{\"identifier\":\"border2\",\"displayName\":\"Antique\",\"options\":{\"width\":0.15}},{\"identifier\":\"border5\",\"displayName\":\"Splatter\",\"options\":{\"width\":0.15}},{\"identifier\":\"border6\",\"displayName\":\"Grit\",\"options\":{\"width\":0.15}},{\"identifier\":\"border7\",\"displayName\":\"Negative\",\"options\":{\"width\":0.15}},{\"identifier\":\"border10\",\"displayName\":\"Stamp\",\"options\":{\"width\":0.15}},{\"identifier\":\"border8\",\"displayName\":\"Museum\",\"options\":{\"width\":0.15}},{\"identifier\":\"border9\",\"displayName\":\"Matte\",\"options\":{\"width\":0.15}}],\"versionKey\":\"523349925e332a22040000b9\",\"v\":1382030470429,\"code\":0,\"status\":\"Ok\"}"), false);
        a(sqlitedatabase, "0", b);
        sqlitedatabase.setTransactionSuccessful();
        a.a("finally");
        sqlitedatabase.endTransaction();
        a.a("Load default content success");
        return true;
        Object obj;
        obj;
        ((Throwable) (obj)).printStackTrace();
        a.c("Error in JSON parsing.");
        a.a("finally");
        sqlitedatabase.endTransaction();
        return false;
        obj;
        a.a("finally");
        sqlitedatabase.endTransaction();
        throw obj;
    }

    static 
    {
        a = com.aviary.android.feather.common.a.a.a("AviaryCdsDefaultContentLoader", com.aviary.android.feather.common.a.a.d.a);
        String s;
        if ("alpha".equals("production"))
        {
            s = "http://testassets.aviary.com.s3.amazonaws.com";
        } else
        {
            s = "http://assets.aviary.com";
        }
        b = s;
    }
}
