// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.definitions;


// Referenced classes of package me.lyft.android.analytics.definitions:
//            Parameter

public abstract class ParameterStore
{

    public ParameterStore()
    {
    }

    private Object getValue(Object obj, Class class1)
    {
        if (obj != null)
        {
            return class1.cast(obj);
        } else
        {
            return null;
        }
    }

    public Boolean getBoolean(Parameter parameter)
    {
        return (Boolean)getValue(getParameterInternal(parameter), java/lang/Boolean);
    }

    public Double getDouble(Parameter parameter)
    {
        return (Double)getValue(getParameterInternal(parameter), java/lang/Double);
    }

    public Float getFloat(Parameter parameter)
    {
        return (Float)getValue(getParameterInternal(parameter), java/lang/Float);
    }

    public Integer getInteger(Parameter parameter)
    {
        return (Integer)getValue(getParameterInternal(parameter), java/lang/Integer);
    }

    public Long getLong(Parameter parameter)
    {
        return (Long)getValue(getParameterInternal(parameter), java/lang/Long);
    }

    protected abstract Object getParameterInternal(Parameter parameter);

    public String getString(Parameter parameter)
    {
        return (String)getValue(getParameterInternal(parameter), java/lang/String);
    }

    public void put(Parameter parameter, Boolean boolean1)
    {
        putParameterInternal(parameter, boolean1);
    }

    public void put(Parameter parameter, Double double1)
    {
        putParameterInternal(parameter, double1);
    }

    public void put(Parameter parameter, Float float1)
    {
        putParameterInternal(parameter, float1);
    }

    public void put(Parameter parameter, Integer integer)
    {
        putParameterInternal(parameter, integer);
    }

    public void put(Parameter parameter, Long long1)
    {
        putParameterInternal(parameter, long1);
    }

    public void put(Parameter parameter, String s)
    {
        putParameterInternal(parameter, s);
    }

    protected abstract void putParameterInternal(Parameter parameter, Object obj);
}
