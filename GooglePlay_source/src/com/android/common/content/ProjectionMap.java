// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.common.content;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class ProjectionMap extends HashMap
{
    public static class Builder
    {

        private ProjectionMap mMap;

        public Builder add(String s)
        {
            mMap.put(s, s);
            return this;
        }

        public Builder add(String s, String s1)
        {
            mMap.put(s, (new StringBuilder()).append(s1).append(" AS ").append(s).toString());
            return this;
        }

        public Builder addAll(String as[])
        {
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                add(as[i]);
            }

            return this;
        }

        public final ProjectionMap build()
        {
            String as[] = new String[mMap.size()];
            mMap.keySet().toArray(as);
            Arrays.sort(as);
            mMap.mColumns = as;
            return mMap;
        }

        public Builder()
        {
            mMap = new ProjectionMap();
        }
    }


    private String mColumns[];

    public ProjectionMap()
    {
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public final volatile Object put(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public final void putAll(Map map)
    {
        throw new UnsupportedOperationException();
    }



/*
    static String[] access$102(ProjectionMap projectionmap, String as[])
    {
        projectionmap.mColumns = as;
        return as;
    }

*/
}
