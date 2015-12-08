// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gdata;

import com.cardinalblue.android.piccollage.model.gson.IGsonable;
import com.google.b.i;
import com.google.b.j;
import com.google.b.k;
import com.google.b.l;
import com.google.b.o;
import com.google.b.p;
import java.lang.reflect.Type;

public class AlbumEntry
    implements IGsonable
{
    public static class a
        implements k
    {

        public AlbumEntry a(l l1, Type type, j j)
            throws p
        {
            if (l1 != null && l1.j()) goto _L2; else goto _L1
_L1:
            l1 = null;
_L4:
            return l1;
_L2:
            l1 = l1.m();
            int i1;
            try
            {
                type = new AlbumEntry();
                j = l1.e("gphoto$id");
            }
            // Misplaced declaration of an exception variable
            catch (l l1)
            {
                return null;
            }
            if (j == null)
            {
                break MISSING_BLOCK_LABEL_224;
            }
            if (!j.b("$t"))
            {
                break MISSING_BLOCK_LABEL_224;
            }
            type.a(j.c("$t").c());
            j = l1.e("title");
            if (j == null)
            {
                break MISSING_BLOCK_LABEL_226;
            }
            if (!j.b("$t"))
            {
                break MISSING_BLOCK_LABEL_226;
            }
            type.b(j.c("$t").c());
            j = l1.e("gphoto$numphotos");
            if (j == null)
            {
                break MISSING_BLOCK_LABEL_133;
            }
            if (j.b("$t"))
            {
                type.a(j.c("$t").g());
            }
            j = l1.e("media$group");
            l1 = type;
            if (j == null) goto _L4; else goto _L3
_L3:
            l1 = type;
            if (!j.b("media$thumbnail")) goto _L4; else goto _L5
_L5:
            j = j.d("media$thumbnail");
            i1 = j.a();
            l1 = type;
            if (i1 <= 0) goto _L4; else goto _L6
_L6:
            try
            {
                j = j.a(0).m();
            }
            // Misplaced declaration of an exception variable
            catch (l l1)
            {
                return type;
            }
            l1 = type;
            if (j == null) goto _L4; else goto _L7
_L7:
            l1 = type;
            if (!j.b("url")) goto _L4; else goto _L8
_L8:
            type.c(j.c("url").c());
            return type;
            return null;
            return null;
        }

        public Object deserialize(l l1, Type type, j j)
            throws p
        {
            return a(l1, type, j);
        }

        public a()
        {
        }
    }


    private String a;
    private String b;
    private int c;
    private String d;

    public AlbumEntry()
    {
        c = -1;
        d = null;
    }

    public String a()
    {
        return a;
    }

    public void a(int i)
    {
        c = i;
    }

    public void a(String s)
    {
        a = s;
    }

    public String b()
    {
        return b;
    }

    public void b(String s)
    {
        b = s;
    }

    public int c()
    {
        return c;
    }

    public void c(String s)
    {
        d = s;
    }

    public String d()
    {
        return d;
    }
}
