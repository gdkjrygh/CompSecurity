// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photos;

import java.io.Serializable;

public class PhotoPlace
    implements Serializable
{

    public static final int POOL = 2;
    public static final int SET = 1;
    public static final long serialVersionUID = 12L;
    private String id;
    private int kind;
    private String title;

    public PhotoPlace(int i, String s, String s1)
    {
        setKind(i);
        id = s;
        title = s1;
    }

    public PhotoPlace(String s, String s1, String s2)
    {
        setKind(s);
        id = s1;
        title = s2;
    }

    public boolean equals(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof PhotoPlace)) goto _L1; else goto _L3
_L3:
        obj = (PhotoPlace)obj;
        if (((PhotoPlace) (obj)).kind != kind) goto _L1; else goto _L4
_L4:
        if (id == null) goto _L6; else goto _L5
_L5:
        if (!id.equals(((PhotoPlace) (obj)).id)) goto _L1; else goto _L7
_L7:
        if (title == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        if (!title.equals(((PhotoPlace) (obj)).title)) goto _L1; else goto _L8
_L8:
        return true;
_L6:
        if (((PhotoPlace) (obj)).id != null)
        {
            return false;
        }
          goto _L7
        if (((PhotoPlace) (obj)).title != null)
        {
            return false;
        }
          goto _L8
    }

    public String getId()
    {
        return id;
    }

    public int getKind()
    {
        return kind;
    }

    public String getKindAsString()
    {
        switch (kind)
        {
        default:
            return (new StringBuilder("unknown(")).append(kind).append(")").toString();

        case 1: // '\001'
            return "set";

        case 2: // '\002'
            return "pool";
        }
    }

    public String getTitle()
    {
        return title;
    }

    public int hashCode()
    {
        if (id != null)
        {
            return id.hashCode();
        } else
        {
            return 0;
        }
    }

    protected void setKind(int i)
    {
        kind = i;
    }

    protected void setKind(String s)
    {
        if ("pool".equalsIgnoreCase(s))
        {
            setKind(2);
            return;
        }
        if ("set".equalsIgnoreCase(s))
        {
            setKind(1);
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid kind [")).append(s).append("]").toString());
        }
    }

    public String toString()
    {
        return (new StringBuilder(String.valueOf(getClass().getName()))).append("[").append(getKindAsString()).append(" id=\"").append(id).append("\" title=\"").append(title).append("\"]").toString();
    }
}
