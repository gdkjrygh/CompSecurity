// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.c;


final class c
{
    static interface a
    {

        public abstract void a();

        public abstract void a(byte byte0);
    }

    static interface b
    {

        public abstract void a(char c1);
    }


    // Unreferenced inner class com/google/android/m4b/maps/c/c$1

/* anonymous class */
    static final class _cls1
        implements b
    {

        private StringBuilder a;

        public final void a(char c1)
        {
            a.append(c1);
        }

        public final String toString()
        {
            return a.toString();
        }

            
            {
                a = stringbuilder;
                super();
            }
    }

}
