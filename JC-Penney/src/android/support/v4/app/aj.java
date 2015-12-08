// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            Fragment, ak, ay, al

public abstract class aj
{

    public aj()
    {
    }

    public abstract Fragment.SavedState a(Fragment fragment);

    public abstract Fragment a(Bundle bundle, String s);

    public abstract Fragment a(String s);

    public abstract ak a(int i);

    public abstract ay a();

    public abstract void a(int i, int j);

    public abstract void a(Bundle bundle, String s, Fragment fragment);

    public abstract void a(al al);

    public abstract void a(String s, int i);

    public abstract void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

    public abstract void b(al al);

    public abstract boolean b();

    public abstract boolean b(String s, int i);

    public abstract void c();

    public abstract boolean d();

    public abstract int e();
}
