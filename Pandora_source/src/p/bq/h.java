// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bq;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class h
{
    public static final class a extends Exception
    {

        public a(String s)
        {
            super(s);
        }
    }

    protected static interface b
        extends Annotation
    {

        public abstract String a();

        public abstract boolean b();
    }


    public h()
    {
    }

    protected void a()
    {
    }

    public void a(Map map)
        throws a
    {
        Object obj = new HashMap();
        Field afield[] = getClass().getFields();
        int j = afield.length;
        for (int i = 0; i < j; i++)
        {
            Field field1 = afield[i];
            b b1 = (b)field1.getAnnotation(p/bq/h$b);
            if (b1 != null)
            {
                ((Map) (obj)).put(b1.a(), field1);
            }
        }

        if (((Map) (obj)).isEmpty())
        {
            zzb.zzan("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            Field field2 = (Field)((Map) (obj)).remove(entry.getKey());
            if (field2 != null)
            {
                try
                {
                    field2.set(this, entry.getValue());
                }
                catch (IllegalAccessException illegalaccessexception)
                {
                    zzb.zzan((new StringBuilder()).append("Server option \"").append((String)entry.getKey()).append("\" could not be set: Illegal Access").toString());
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    zzb.zzan((new StringBuilder()).append("Server option \"").append((String)entry.getKey()).append("\" could not be set: Bad Type").toString());
                }
            } else
            {
                zzb.zzaj((new StringBuilder()).append("Unexpected server option: ").append((String)entry.getKey()).append(" = \"").append((String)entry.getValue()).append("\"").toString());
            }
        }

        map = new StringBuilder();
        obj = ((Map) (obj)).values().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Field field = (Field)((Iterator) (obj)).next();
            if (((b)field.getAnnotation(p/bq/h$b)).b())
            {
                zzb.zzan((new StringBuilder()).append("Required server option missing: ").append(((b)field.getAnnotation(p/bq/h$b)).a()).toString());
                if (map.length() > 0)
                {
                    map.append(", ");
                }
                map.append(((b)field.getAnnotation(p/bq/h$b)).a());
            }
        } while (true);
        if (map.length() > 0)
        {
            throw new a((new StringBuilder()).append("Required server option(s) missing: ").append(map.toString()).toString());
        } else
        {
            a();
            return;
        }
    }
}
