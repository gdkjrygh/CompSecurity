// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
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

    public static final Excluder DEFAULT = new Excluder();
    private double a;
    private int b;
    private boolean c;
    private List d;
    private List e;

    public Excluder()
    {
        a = -1D;
        b = 136;
        c = true;
        d = Collections.emptyList();
        e = Collections.emptyList();
    }

    private boolean a(Since since, Until until)
    {
        boolean flag;
        if (since != null && since.value() > a)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (flag)
        {
            if (until != null && until.value() <= a)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    private static boolean a(Class class1)
    {
        return !java/lang/Enum.isAssignableFrom(class1) && (class1.isAnonymousClass() || class1.isLocalClass());
    }

    private static boolean b(Class class1)
    {
        if (class1.isMemberClass())
        {
            boolean flag;
            if ((class1.getModifiers() & 8) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                return true;
            }
        }
        return false;
    }

    protected final Excluder clone()
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

    protected final volatile Object clone()
    {
        return clone();
    }

    public final TypeAdapter create(Gson gson, TypeToken typetoken)
    {
        Class class1 = typetoken.getRawType();
        boolean flag = excludeClass(class1, true);
        boolean flag1 = excludeClass(class1, false);
        if (!flag && !flag1)
        {
            return null;
        } else
        {
            return new TypeAdapter(flag1, flag, gson, typetoken) {

                private TypeAdapter a;
                private boolean b;
                private boolean c;
                private Gson d;
                private TypeToken e;
                private Excluder f;

                private TypeAdapter a()
                {
                    TypeAdapter typeadapter = a;
                    if (typeadapter != null)
                    {
                        return typeadapter;
                    } else
                    {
                        TypeAdapter typeadapter1 = d.getDelegateAdapter(f, e);
                        a = typeadapter1;
                        return typeadapter1;
                    }
                }

                public final Object read(JsonReader jsonreader)
                {
                    if (b)
                    {
                        jsonreader.skipValue();
                        return null;
                    } else
                    {
                        return a().read(jsonreader);
                    }
                }

                public final void write(JsonWriter jsonwriter, Object obj)
                {
                    if (c)
                    {
                        jsonwriter.nullValue();
                        return;
                    } else
                    {
                        a().write(jsonwriter, obj);
                        return;
                    }
                }

            
            {
                f = Excluder.this;
                b = flag;
                c = flag1;
                d = gson;
                e = typetoken;
                super();
            }
            };
        }
    }

    public final boolean excludeClass(Class class1, boolean flag)
    {
        if (a != -1D && !a((Since)class1.getAnnotation(com/google/gson/annotations/Since), (Until)class1.getAnnotation(com/google/gson/annotations/Until)))
        {
            return true;
        }
        if (!c && b(class1))
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
            obj = d;
        } else
        {
            obj = e;
        }
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            if (((ExclusionStrategy)((Iterator) (obj)).next()).shouldSkipClass(class1))
            {
                return true;
            }
        }

        return false;
    }

    public final boolean excludeField(Field field, boolean flag)
    {
label0:
        {
            if ((b & field.getModifiers()) != 0)
            {
                return true;
            }
            if (a != -1D && !a((Since)field.getAnnotation(com/google/gson/annotations/Since), (Until)field.getAnnotation(com/google/gson/annotations/Until)))
            {
                return true;
            }
            if (field.isSynthetic())
            {
                return true;
            }
            if (!c && b(field.getType()))
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
                obj = d;
            } else
            {
                obj = e;
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
            } while (!((ExclusionStrategy)((Iterator) (obj)).next()).shouldSkipField(field));
            return true;
        }
        return false;
    }

}
