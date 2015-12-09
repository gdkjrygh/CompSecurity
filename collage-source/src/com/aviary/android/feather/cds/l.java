// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.database.Cursor;

public class l
{
    public static final class a extends t.a
    {

        private long a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private String j;
        private boolean k;
        private String l;
        private boolean m;

        public static a a(Cursor cursor)
        {
            boolean flag1 = true;
            if (t.b.b(cursor))
            {
                a a1 = new a(cursor.getLong(cursor.getColumnIndex("msgcnt_id")), cursor.getLong(cursor.getColumnIndex("msgcnt_messageId")));
                int i1 = cursor.getColumnIndex("msgcnt_contentIdentifier");
                if (i1 > -1)
                {
                    a1.b = cursor.getString(i1);
                }
                i1 = cursor.getColumnIndex("msgcnt_beginDate");
                if (i1 > -1)
                {
                    a1.c = cursor.getString(i1);
                }
                i1 = cursor.getColumnIndex("msgcnt_endDate");
                if (i1 > -1)
                {
                    a1.d = cursor.getString(i1);
                }
                i1 = cursor.getColumnIndex("msgcnt_title");
                if (i1 > -1)
                {
                    a1.e = cursor.getString(i1);
                }
                i1 = cursor.getColumnIndex("msgcnt_paragraph");
                if (i1 > -1)
                {
                    a1.f = cursor.getString(i1);
                }
                i1 = cursor.getColumnIndex("msgcnt_dismissButton");
                if (i1 > -1)
                {
                    a1.g = cursor.getString(i1);
                }
                i1 = cursor.getColumnIndex("msgcnt_actionButton");
                if (i1 > -1)
                {
                    a1.h = cursor.getString(i1);
                }
                i1 = cursor.getColumnIndex("msgcnt_contentURL");
                if (i1 > -1)
                {
                    a1.i = cursor.getString(i1);
                }
                i1 = cursor.getColumnIndex("msgcnt_layoutStyle");
                if (i1 > -1)
                {
                    a1.j = cursor.getString(i1);
                }
                i1 = cursor.getColumnIndex("msgcnt_showNewBanner");
                boolean flag;
                if (i1 > -1)
                {
                    if (cursor.getInt(i1) == 1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    a1.k = flag;
                }
                i1 = cursor.getColumnIndex("msgcnt_visited");
                if (i1 > -1)
                {
                    if (cursor.getInt(i1) == 1)
                    {
                        flag = flag1;
                    } else
                    {
                        flag = false;
                    }
                    a1.m = flag;
                }
                i1 = cursor.getColumnIndex("msgcnt_contentPath");
                if (i1 > -1)
                {
                    a1.l = cursor.getString(i1);
                }
                return a1;
            } else
            {
                return null;
            }
        }

        public String a()
        {
            return i;
        }

        public String b()
        {
            return l;
        }

        public Object clone()
        {
            a a1 = new a(s, a);
            a1.b = b;
            a1.c = c;
            a1.d = d;
            a1.e = e;
            a1.f = f;
            a1.g = g;
            a1.h = h;
            a1.i = i;
            a1.j = j;
            a1.k = k;
            a1.l = l;
            a1.m = m;
            return a1;
        }

        public a(long l1, long l2)
        {
            super(l1);
            a = l2;
        }
    }


    public l()
    {
    }
}
