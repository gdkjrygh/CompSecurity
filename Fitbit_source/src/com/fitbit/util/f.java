// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;

public class f
{
    public static abstract class a
    {

        private Object a;
        private Bundle b;

        private void a()
        {
            b(a);
        }

        static void a(a a1)
        {
            a1.a();
        }

        private void b()
        {
            a(a);
        }

        static void b(a a1)
        {
            a1.b();
        }

        public void a(Object obj)
        {
        }

        public abstract void b(Object obj);

        public Bundle g()
        {
            return b;
        }

        public a(Object obj)
        {
            a = obj;
        }

        public a(Object obj, Bundle bundle)
        {
            a = obj;
            b = bundle;
        }
    }


    public f()
    {
    }

    public static void a(a a1)
    {
        a(a1, null);
    }

    public static void a(a a1, View view)
    {
        (new AsyncTask(view, a1) {

            final View a;
            final a b;

            protected transient Void a(Void avoid[])
            {
                a.a(b);
                return null;
            }

            protected void a(Void void1)
            {
                if (a != null)
                {
                    a.setEnabled(true);
                }
                a.b(b);
            }

            protected Object doInBackground(Object aobj[])
            {
                return a((Void[])aobj);
            }

            protected void onPostExecute(Object obj)
            {
                a((Void)obj);
            }

            protected void onPreExecute()
            {
                if (a != null)
                {
                    a.setEnabled(false);
                }
            }

            
            {
                a = view;
                b = a1;
                super();
            }
        }).execute(new Void[0]);
    }

    public static void a(a a1, View view, boolean flag)
    {
        (new AsyncTask(view, a1, flag) {

            final View a;
            final a b;
            final boolean c;

            protected transient Void a(Void avoid[])
            {
                a.a(b);
                return null;
            }

            protected void a(Void void1)
            {
                if (a != null)
                {
                    a.setEnabled(c);
                }
                a.b(b);
            }

            protected Object doInBackground(Object aobj[])
            {
                return a((Void[])aobj);
            }

            protected void onPostExecute(Object obj)
            {
                a((Void)obj);
            }

            protected void onPreExecute()
            {
                if (a != null)
                {
                    a.setEnabled(false);
                }
            }

            
            {
                a = view;
                b = a1;
                c = flag;
                super();
            }
        }).execute(new Void[0]);
    }
}
