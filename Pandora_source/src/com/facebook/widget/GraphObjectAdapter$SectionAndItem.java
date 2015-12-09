// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import com.facebook.model.GraphObject;

// Referenced classes of package com.facebook.widget:
//            GraphObjectAdapter

public static class graphObject
{
    public static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type ACTIVITY_CIRCLE;
        public static final Type GRAPH_OBJECT;
        public static final Type SECTION_HEADER;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/facebook/widget/GraphObjectAdapter$SectionAndItem$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            GRAPH_OBJECT = new Type("GRAPH_OBJECT", 0);
            SECTION_HEADER = new Type("SECTION_HEADER", 1);
            ACTIVITY_CIRCLE = new Type("ACTIVITY_CIRCLE", 2);
            $VALUES = (new Type[] {
                GRAPH_OBJECT, SECTION_HEADER, ACTIVITY_CIRCLE
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    public GraphObject graphObject;
    public String sectionKey;

    public Type getType()
    {
        if (sectionKey == null)
        {
            return Type.ACTIVITY_CIRCLE;
        }
        if (graphObject == null)
        {
            return Type.SECTION_HEADER;
        } else
        {
            return Type.GRAPH_OBJECT;
        }
    }

    public Type(String s, GraphObject graphobject)
    {
        sectionKey = s;
        graphObject = graphobject;
    }
}
