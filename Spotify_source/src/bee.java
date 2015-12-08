// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Comparator;

public final class bee
{

    public static final Comparator a = new Comparator() {

        public final volatile int compare(Object obj, Object obj1)
        {
            obj = (bef)obj;
            obj1 = (bef)obj1;
            return ((bef) (obj)).a - ((bef) (obj1)).a;
        }

    };
    public static final Comparator b = new Comparator() {

        public final volatile int compare(Object obj, Object obj1)
        {
            obj = (bef)obj;
            obj1 = (bef)obj1;
            if (((bef) (obj)).c < ((bef) (obj1)).c)
            {
                return -1;
            }
            return ((bef) (obj1)).c >= ((bef) (obj)).c ? 0 : 1;
        }

    };
    public final int c = 2000;
    public final ArrayList d = new ArrayList();
    public final bef e[] = new bef[5];
    public int f;
    public int g;
    public int h;
    public int i;

    public bee()
    {
        f = -1;
    }

}
