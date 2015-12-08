// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//            Fragment, q

public abstract class m
{
    public static interface a
    {

        public abstract String e();
    }


    public m()
    {
    }

    public abstract Fragment.SavedState a(Fragment fragment);

    public abstract Fragment a(int i);

    public abstract Fragment a(Bundle bundle, String s);

    public abstract Fragment a(String s);

    public abstract q a();

    public abstract void a(Bundle bundle, String s, Fragment fragment);

    public abstract void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

    public abstract void b(int i);

    public abstract boolean b();

    public abstract a c(int i);

    public abstract boolean c();

    public abstract void d();

    public abstract int e();

    public abstract List f();

    public abstract boolean g();
}
