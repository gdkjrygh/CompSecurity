// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            o, ai, Fragment, q, 
//            s

public abstract class p
    implements o
{

    public p()
    {
    }

    public abstract Context a();

    abstract ai a(String s, boolean flag, boolean flag1);

    abstract void a(Fragment fragment);

    abstract void a(Fragment fragment, Intent intent, int k);

    abstract void a(q q);

    abstract void a(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo);

    abstract void a(String s);

    abstract void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

    public abstract Handler b();

    public abstract Window c();

    public abstract Resources d();

    public abstract LayoutInflater e();

    public abstract boolean f();

    abstract s g();

    abstract boolean h();

    abstract q i();

    abstract void j();
}
