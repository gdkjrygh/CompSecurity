// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.c;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.abtest.qe.data.QuickExperimentInfo;
import com.facebook.abtest.qe.data.c;
import com.facebook.abtest.qe.protocol.sync.full.d;
import com.facebook.common.executors.a;
import com.facebook.debug.log.b;
import com.facebook.debug.log.l;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.a.ev;
import com.google.common.a.ew;
import com.google.common.a.fi;
import com.google.common.a.fk;
import com.google.common.base.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.abtest.qe.c:
//            c, f

public class e
{

    private static final Class a = com/facebook/abtest/qe/c/e;
    private static final l b = new l();
    private static final String c[] = {
        "name", "groupName", "hash", "loggingEnabled", "locale", "customContentJSON", "dataSource", "meta_info"
    };
    private final a d;
    private final com.facebook.abtest.qe.c.c e;
    private final d f;
    private final ObjectMapper g;

    public e(a a1, com.facebook.abtest.qe.c.c c1, d d1, ObjectMapper objectmapper)
    {
        d = (a)Preconditions.checkNotNull(a1);
        e = (com.facebook.abtest.qe.c.c)Preconditions.checkNotNull(c1);
        f = d1;
        g = (ObjectMapper)Preconditions.checkNotNull(objectmapper);
    }

    private QuickExperimentInfo a(SQLiteDatabase sqlitedatabase, String s, f f1)
    {
        String s1;
        s1 = null;
        f1 = f.access$000(f1);
        f1 = sqlitedatabase.query("experiments", c, "name=? and dataSource=?", new String[] {
            s, f1
        }, null, null, null);
        sqlitedatabase = s1;
        if (f1.getCount() <= 1)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        com.facebook.debug.log.b.a(b, a, (new StringBuilder()).append("Multiple entries for experiment ").append(s).toString());
        sqlitedatabase = s1;
_L2:
        String s2;
        if (!f1.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = f1.getString(f1.getColumnIndex("name"));
        s1 = f1.getString(f1.getColumnIndex("groupName"));
        s2 = f1.getString(f1.getColumnIndex("hash"));
        String s3;
        String s4;
        boolean flag;
        if (f1.getInt(f1.getColumnIndex("loggingEnabled")) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s3 = f1.getString(f1.getColumnIndex("locale"));
        s4 = f1.getString(f1.getColumnIndex("customContentJSON"));
        sqlitedatabase = ev.j();
        if (s4 == null)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        sqlitedatabase = b(s4);
        Object obj = f1.getString(f1.getColumnIndex("meta_info"));
        obj = f.a(((String) (obj)));
        sqlitedatabase = (new c()).a(s).b(s1).c(s2).a(flag).d(s3).a(sqlitedatabase).a(((com.facebook.abtest.qe.protocol.sync.full.SyncQuickExperimentMetaInfoResult) (obj))).a();
        if (true) goto _L2; else goto _L1
_L1:
        f1.close();
        return sqlitedatabase;
        sqlitedatabase;
        f1.close();
        throw sqlitedatabase;
    }

    private void a(SQLiteDatabase sqlitedatabase, QuickExperimentInfo quickexperimentinfo, f f1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("name", quickexperimentinfo.a());
        contentvalues.put("groupName", quickexperimentinfo.b());
        contentvalues.put("hash", quickexperimentinfo.d());
        int i;
        if (quickexperimentinfo.c())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put("loggingEnabled", Integer.valueOf(i));
        contentvalues.put("locale", quickexperimentinfo.e());
        contentvalues.put("customContentJSON", a(quickexperimentinfo.f()));
        contentvalues.put("dataSource", f.access$000(f1));
        quickexperimentinfo = quickexperimentinfo.g();
        if (quickexperimentinfo != null)
        {
            contentvalues.put("meta_info", f.a(quickexperimentinfo));
        }
        sqlitedatabase.replace("experiments", null, contentvalues);
    }

    public QuickExperimentInfo a(String s, f f1)
    {
        Preconditions.checkNotNull(s);
        s = a(e.e(), s, f1);
        if (s != null)
        {
            return s;
        } else
        {
            return null;
        }
    }

    String a(ev ev1)
    {
        ByteArrayOutputStream bytearrayoutputstream;
        JsonGenerator jsongenerator;
        java.util.Map.Entry entry;
        try
        {
            bytearrayoutputstream = new ByteArrayOutputStream();
            jsongenerator = g.getJsonFactory().createJsonGenerator(bytearrayoutputstream, JsonEncoding.UTF8);
            jsongenerator.writeStartObject();
        }
        // Misplaced declaration of an exception variable
        catch (ev ev1)
        {
            com.facebook.debug.log.b.d(a, "Unable to store QE data", ev1);
            return "{}";
        }
        if (ev1 == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        for (ev1 = ev1.a().iterator(); ev1.hasNext(); jsongenerator.writeStringField((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)ev1.next();
        }

        jsongenerator.writeEndObject();
        jsongenerator.close();
        ev1 = new String(bytearrayoutputstream.toByteArray(), "UTF-8");
        return ev1;
    }

    public Set a(f f1)
    {
        com.facebook.debug.d.e e1;
        Object obj;
        d.b();
        e1 = com.facebook.debug.d.e.a("QuickExperimentStorage.loadAllQuickExperimentInfo");
        f1 = f.access$000(f1);
        f1 = e.e().query("experiments", c, "dataSource=?", new String[] {
            f1
        }, null, null, null);
        obj = fi.e();
        int i;
        int j;
        int k;
        int i1;
        int j1;
        int k1;
        int l1;
        i = f1.getColumnIndex("name");
        j = f1.getColumnIndex("groupName");
        k = f1.getColumnIndex("hash");
        i1 = f1.getColumnIndex("loggingEnabled");
        j1 = f1.getColumnIndex("locale");
        k1 = f1.getColumnIndex("customContentJSON");
        l1 = f1.getColumnIndex("meta_info");
_L1:
        String s;
        String s1;
        String s2;
        if (!f1.moveToNext())
        {
            break MISSING_BLOCK_LABEL_323;
        }
        s = f1.getString(i);
        s1 = f1.getString(j);
        s2 = f1.getString(k);
        String s3;
        ev ev1;
        com.facebook.abtest.qe.protocol.sync.full.SyncQuickExperimentMetaInfoResult syncquickexperimentmetainforesult;
        boolean flag;
        if (f1.getInt(i1) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s3 = f1.getString(j1);
        ev1 = b(f1.getString(k1));
        syncquickexperimentmetainforesult = f.a(f1.getString(l1));
        ((fk) (obj)).b((new c()).a(s).b(s1).c(s2).a(flag).d(s3).a(ev1).a(syncquickexperimentmetainforesult).a());
          goto _L1
        obj;
        f1.close();
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Loading all quick experiment info took ").append(e1.a()).append(" ms.").toString());
        throw obj;
        f1.close();
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Loading all quick experiment info took ").append(e1.a()).append(" ms.").toString());
        return ((fk) (obj)).b();
    }

    public void a()
    {
        e.e().delete("experiments", null, null);
    }

    public void a(QuickExperimentInfo quickexperimentinfo, f f1)
    {
        SQLiteDatabase sqlitedatabase;
        Preconditions.checkNotNull(quickexperimentinfo);
        sqlitedatabase = e.e();
        sqlitedatabase.beginTransaction();
        a(sqlitedatabase, quickexperimentinfo, f1);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        quickexperimentinfo;
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        throw quickexperimentinfo;
    }

    public void a(String s)
    {
        e.e().delete("experiments", "name=?", new String[] {
            s
        });
    }

    ev b(String s)
    {
        if (s == null)
        {
            return ev.j();
        }
        ew ew1 = new ew();
        try
        {
            JsonParser jsonparser = g.getJsonFactory().createJsonParser(s);
            jsonparser.nextToken();
            String s1;
            for (; jsonparser.nextToken() != JsonToken.END_OBJECT; ew1.b(s1, jsonparser.getText()))
            {
                s1 = jsonparser.getCurrentName();
                jsonparser.nextToken();
            }

        }
        catch (JsonParseException jsonparseexception)
        {
            com.facebook.debug.log.b.d(a, (new StringBuilder()).append("Error parsing ").append(s).append(": ").append(jsonparseexception).toString());
        }
        catch (IOException ioexception)
        {
            com.facebook.debug.log.b.d(a, (new StringBuilder()).append("Error parsing ").append(s).append(": ").append(ioexception).toString());
        }
        return ew1.b();
    }

}
