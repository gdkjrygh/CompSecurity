// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class Excluder
    implements TypeAdapterFactory, Cloneable
{

    public static final Excluder a = new Excluder();
    private double b;
    private int c;
    private boolean d;
    private boolean e;
    private List f;
    private List g;

    public Excluder()
    {
        b = -1D;
        c = 136;
        d = true;
        f = Collections.emptyList();
        g = Collections.emptyList();
    }

    private boolean a(Since since)
    {
        return since == null || since.a() <= b;
    }

    private boolean a(Since since, Until until)
    {
        return a(since) && a(until);
    }

    private boolean a(Until until)
    {
        return until == null || until.a() > b;
    }

    private boolean a(Class class1)
    {
        return !java/lang/Enum.isAssignableFrom(class1) && (class1.isAnonymousClass() || class1.isLocalClass());
    }

    private boolean b(Class class1)
    {
        return class1.isMemberClass() && !c(class1);
    }

    private boolean c(Class class1)
    {
        return (class1.getModifiers() & 8) != 0;
    }

    protected Excluder a()
    {
        Excluder excluder;
        try
        {
            excluder = (Excluder)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new AssertionError();
        }
        return excluder;
    }

    public boolean a(Class class1, boolean flag)
    {
        if (b != -1D && !a((Since)class1.getAnnotation(com/google/gson/annotations/Since), (Until)class1.getAnnotation(com/google/gson/annotations/Until)))
        {
            return true;
        }
        if (!d && b(class1))
        {
            return true;
        }
        if (a(class1))
        {
            return true;
        }
        Object obj;
        if (flag)
        {
            obj = f;
        } else
        {
            obj = g;
        }
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            if (((ExclusionStrategy)((Iterator) (obj)).next()).a(class1))
            {
                return true;
            }
        }

        return false;
    }

    public boolean a(Field field, boolean flag)
    {
label0:
        {
            if ((c & field.getModifiers()) != 0)
            {
                return true;
            }
            if (b != -1D && !a((Since)field.getAnnotation(com/google/gson/annotations/Since), (Until)field.getAnnotation(com/google/gson/annotations/Until)))
            {
                return true;
            }
            if (field.isSynthetic())
            {
                return true;
            }
            if (e)
            {
                Expose expose = (Expose)field.getAnnotation(com/google/gson/annotations/Expose);
                if (expose == null || (flag ? !expose.a() : !expose.b()))
                {
                    return true;
                }
            }
            if (!d && b(field.getType()))
            {
                return true;
            }
            if (a(field.getType()))
            {
                return true;
            }
            Object obj;
            if (flag)
            {
                obj = f;
            } else
            {
                obj = g;
            }
            if (((List) (obj)).isEmpty())
            {
                break label0;
            }
            field = new FieldAttributes(field);
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
            } while (!((ExclusionStrategy)((Iterator) (obj)).next()).a(field));
            return true;
        }
        return false;
    }

    protected Object clone()
    {
        return a();
    }

    public TypeAdapter create(Gson gson, TypeToken typetoken)
    {
        Class class1 = typetoken.getRawType();
        boolean flag = a(class1, true);
        boolean flag1 = a(class1, false);
        if (!flag && !flag1)
        {
            return null;
        } else
        {
            return new TypeAdapter(flag1, flag, gson, typetoken) {

                final boolean a;
                final boolean b;
                final Gson c;
                final TypeToken d;
                final Excluder e;
                private TypeAdapter f;

                private TypeAdapter a()
                {
                    TypeAdapter typeadapter = f;
                    if (typeadapter != null)
                    {
                        return typeadapter;
                    } else
                    {
                        TypeAdapter typeadapter1 = c.a(e, d);
                        f = typeadapter1;
                        return typeadapter1;
                    }
                }

                public Object read(JsonReader jsonreader)
                {
                    if (a)
                    {
                        jsonreader.n();
                        return null;
                    } else
                    {
                        return a().read(jsonreader);
                    }
                }

                public void write(JsonWriter jsonwriter, Object obj)
                {
                    if (b)
                    {
                        jsonwriter.f();
                        return;
                    } else
                    {
                        a().write(jsonwriter, obj);
                        return;
                    }
                }

            
            {
                e = Excluder.this;
                a = flag;
                b = flag1;
                c = gson;
                d = typetoken;
                super();
            }
            };
        }
    }

}
