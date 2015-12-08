// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.b.e;
import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            t, m, Fragment, b

final class a extends t
    implements Runnable
{

    final m a;
    b b;
    b c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    boolean k;
    boolean l;
    String m;
    boolean n;
    int o;
    int p;
    CharSequence q;
    int r;
    CharSequence s;

    public a(m m1)
    {
        l = true;
        o = -1;
        a = m1;
    }

    public final int a()
    {
        if (n)
        {
            throw new IllegalStateException("commit already called");
        }
        if (m.a)
        {
            Log.v("FragmentManager", (new StringBuilder("Commit: ")).append(this).toString());
            a("  ", new PrintWriter(new e("FragmentManager")));
        }
        n = true;
        if (k)
        {
            o = a.a(this);
        } else
        {
            o = -1;
        }
        a.a(this);
        return o;
    }

    public final t a(int i1, Fragment fragment, String s1)
    {
        fragment.s = a;
        if (s1 != null)
        {
            if (fragment.y != null && !s1.equals(fragment.y))
            {
                throw new IllegalStateException((new StringBuilder("Can't change tag of fragment ")).append(fragment).append(": was ").append(fragment.y).append(" now ").append(s1).toString());
            }
            fragment.y = s1;
        }
        if (i1 != 0)
        {
            if (fragment.w != 0 && fragment.w != i1)
            {
                throw new IllegalStateException((new StringBuilder("Can't change container ID of fragment ")).append(fragment).append(": was ").append(fragment.w).append(" now ").append(i1).toString());
            }
            fragment.w = i1;
            fragment.x = i1;
        }
        s1 = new b();
        s1.c = 1;
        s1.d = fragment;
        a(((b) (s1)));
        return this;
    }

    public final t a(Fragment fragment)
    {
        b b1 = new b();
        b1.c = 6;
        b1.d = fragment;
        a(b1);
        return this;
    }

    final void a(int i1)
    {
        if (k)
        {
            if (m.a)
            {
                Log.v("FragmentManager", (new StringBuilder("Bump nesting in ")).append(this).append(" by ").append(i1).toString());
            }
            b b1 = b;
            while (b1 != null) 
            {
                if (b1.d != null)
                {
                    Fragment fragment = b1.d;
                    fragment.r = fragment.r + i1;
                    if (m.a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("Bump nesting of ")).append(b1.d).append(" to ").append(b1.d.r).toString());
                    }
                }
                if (b1.i != null)
                {
                    for (int j1 = b1.i.size() - 1; j1 >= 0; j1--)
                    {
                        Fragment fragment1 = (Fragment)b1.i.get(j1);
                        fragment1.r = fragment1.r + i1;
                        if (m.a)
                        {
                            Log.v("FragmentManager", (new StringBuilder("Bump nesting of ")).append(fragment1).append(" to ").append(fragment1.r).toString());
                        }
                    }

                }
                b1 = b1.a;
            }
        }
    }

    final void a(b b1)
    {
        if (b == null)
        {
            c = b1;
            b = b1;
        } else
        {
            b1.b = c;
            c.a = b1;
            c = b1;
        }
        b1.e = e;
        b1.f = f;
        b1.g = g;
        b1.h = h;
        d = d + 1;
    }

    public final void a(String s1, PrintWriter printwriter)
    {
        a(s1, printwriter, true);
    }

    public final void a(String s1, PrintWriter printwriter, boolean flag)
    {
        b b1;
        String s3;
        int i1;
        if (flag)
        {
            printwriter.print(s1);
            printwriter.print("mName=");
            printwriter.print(m);
            printwriter.print(" mIndex=");
            printwriter.print(o);
            printwriter.print(" mCommitted=");
            printwriter.println(n);
            if (i != 0)
            {
                printwriter.print(s1);
                printwriter.print("mTransition=#");
                printwriter.print(Integer.toHexString(i));
                printwriter.print(" mTransitionStyle=#");
                printwriter.println(Integer.toHexString(j));
            }
            if (e != 0 || f != 0)
            {
                printwriter.print(s1);
                printwriter.print("mEnterAnim=#");
                printwriter.print(Integer.toHexString(e));
                printwriter.print(" mExitAnim=#");
                printwriter.println(Integer.toHexString(f));
            }
            if (g != 0 || h != 0)
            {
                printwriter.print(s1);
                printwriter.print("mPopEnterAnim=#");
                printwriter.print(Integer.toHexString(g));
                printwriter.print(" mPopExitAnim=#");
                printwriter.println(Integer.toHexString(h));
            }
            if (p != 0 || q != null)
            {
                printwriter.print(s1);
                printwriter.print("mBreadCrumbTitleRes=#");
                printwriter.print(Integer.toHexString(p));
                printwriter.print(" mBreadCrumbTitleText=");
                printwriter.println(q);
            }
            if (r != 0 || s != null)
            {
                printwriter.print(s1);
                printwriter.print("mBreadCrumbShortTitleRes=#");
                printwriter.print(Integer.toHexString(r));
                printwriter.print(" mBreadCrumbShortTitleText=");
                printwriter.println(s);
            }
        }
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_804;
        }
        printwriter.print(s1);
        printwriter.println("Operations:");
        s3 = (new StringBuilder()).append(s1).append("    ").toString();
        b1 = b;
        i1 = 0;
_L13:
        if (b1 == null) goto _L2; else goto _L1
_L1:
        b1.c;
        JVM INSTR tableswitch 0 7: default 408
    //                   0 683
    //                   1 691
    //                   2 699
    //                   3 707
    //                   4 715
    //                   5 723
    //                   6 731
    //                   7 739;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L11:
        break MISSING_BLOCK_LABEL_739;
_L3:
        String s2 = (new StringBuilder("cmd=")).append(b1.c).toString();
_L12:
        printwriter.print(s1);
        printwriter.print("  Op #");
        printwriter.print(i1);
        printwriter.print(": ");
        printwriter.print(s2);
        printwriter.print(" ");
        printwriter.println(b1.d);
        if (flag)
        {
            if (b1.e != 0 || b1.f != 0)
            {
                printwriter.print(s1);
                printwriter.print("enterAnim=#");
                printwriter.print(Integer.toHexString(b1.e));
                printwriter.print(" exitAnim=#");
                printwriter.println(Integer.toHexString(b1.f));
            }
            if (b1.g != 0 || b1.h != 0)
            {
                printwriter.print(s1);
                printwriter.print("popEnterAnim=#");
                printwriter.print(Integer.toHexString(b1.g));
                printwriter.print(" popExitAnim=#");
                printwriter.println(Integer.toHexString(b1.h));
            }
        }
        if (b1.i != null && b1.i.size() > 0)
        {
            int j1 = 0;
            while (j1 < b1.i.size()) 
            {
                printwriter.print(s3);
                if (b1.i.size() == 1)
                {
                    printwriter.print("Removed: ");
                } else
                {
                    if (j1 == 0)
                    {
                        printwriter.println("Removed:");
                    }
                    printwriter.print(s3);
                    printwriter.print("  #");
                    printwriter.print(j1);
                    printwriter.print(": ");
                }
                printwriter.println(b1.i.get(j1));
                j1++;
            }
        }
        break MISSING_BLOCK_LABEL_788;
_L4:
        s2 = "NULL";
          goto _L12
_L5:
        s2 = "ADD";
          goto _L12
_L6:
        s2 = "REPLACE";
          goto _L12
_L7:
        s2 = "REMOVE";
          goto _L12
_L8:
        s2 = "HIDE";
          goto _L12
_L9:
        s2 = "SHOW";
          goto _L12
_L10:
        s2 = "DETACH";
          goto _L12
        s2 = "ATTACH";
          goto _L12
        b1 = b1.a;
        i1++;
          goto _L13
_L2:
    }

    public final t b(Fragment fragment)
    {
        b b1 = new b();
        b1.c = 7;
        b1.d = fragment;
        a(b1);
        return this;
    }

    public final void b()
    {
        b b1;
        if (m.a)
        {
            Log.v("FragmentManager", (new StringBuilder("popFromBackStack: ")).append(this).toString());
            a("  ", new PrintWriter(new e("FragmentManager")));
        }
        a(-1);
        b1 = c;
_L10:
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_437;
        }
        b1.c;
        JVM INSTR tableswitch 1 7: default 112
    //                   1 140
    //                   2 180
    //                   3 272
    //                   4 297
    //                   5 332
    //                   6 367
    //                   7 402;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_402;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(b1.c).toString());
_L2:
        Fragment fragment = b1.d;
        fragment.G = b1.h;
        a.a(fragment, android.support.v4.app.m.c(i), j);
_L11:
        b1 = b1.b;
        if (true) goto _L10; else goto _L9
_L9:
        Fragment fragment1 = b1.d;
        if (fragment1 != null)
        {
            fragment1.G = b1.h;
            a.a(fragment1, android.support.v4.app.m.c(i), j);
        }
        if (b1.i != null)
        {
            int i1 = 0;
            while (i1 < b1.i.size()) 
            {
                Fragment fragment2 = (Fragment)b1.i.get(i1);
                fragment2.G = b1.g;
                a.a(fragment2, false);
                i1++;
            }
        }
          goto _L11
_L4:
        Fragment fragment3 = b1.d;
        fragment3.G = b1.g;
        a.a(fragment3, false);
          goto _L11
_L5:
        Fragment fragment4 = b1.d;
        fragment4.G = b1.g;
        a.c(fragment4, android.support.v4.app.m.c(i), j);
          goto _L11
_L6:
        Fragment fragment5 = b1.d;
        fragment5.G = b1.h;
        a.b(fragment5, android.support.v4.app.m.c(i), j);
          goto _L11
_L7:
        Fragment fragment6 = b1.d;
        fragment6.G = b1.g;
        a.e(fragment6, android.support.v4.app.m.c(i), j);
          goto _L11
        Fragment fragment7 = b1.d;
        fragment7.G = b1.g;
        a.d(fragment7, android.support.v4.app.m.c(i), j);
          goto _L11
        a.a(a.n, android.support.v4.app.m.c(i), j, true);
        if (o >= 0)
        {
            a.b(o);
            o = -1;
        }
        return;
    }

    public final void run()
    {
        b b1;
        if (m.a)
        {
            Log.v("FragmentManager", (new StringBuilder("Run: ")).append(this).toString());
        }
        if (k && o < 0)
        {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        a(1);
        b1 = b;
_L10:
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_614;
        }
        b1.c;
        JVM INSTR tableswitch 1 7: default 116
    //                   1 144
    //                   2 174
    //                   3 454
    //                   4 486
    //                   5 518
    //                   6 550
    //                   7 582;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_582;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(b1.c).toString());
_L2:
        Fragment fragment = b1.d;
        fragment.G = b1.e;
        a.a(fragment, false);
_L11:
        b1 = b1.a;
        if (true) goto _L10; else goto _L9
_L9:
        Fragment fragment1 = b1.d;
        Fragment fragment7;
        if (a.g != null)
        {
            int i1 = 0;
label0:
            do
            {
label1:
                {
                    fragment7 = fragment1;
                    if (i1 >= a.g.size())
                    {
                        break label0;
                    }
                    Fragment fragment8 = (Fragment)a.g.get(i1);
                    if (m.a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("OP_REPLACE: adding=")).append(fragment1).append(" old=").append(fragment8).toString());
                    }
                    if (fragment1 != null)
                    {
                        fragment7 = fragment1;
                        if (fragment8.x != fragment1.x)
                        {
                            break label1;
                        }
                    }
                    if (fragment8 == fragment1)
                    {
                        fragment7 = null;
                        b1.d = null;
                    } else
                    {
                        if (b1.i == null)
                        {
                            b1.i = new ArrayList();
                        }
                        b1.i.add(fragment8);
                        fragment8.G = b1.f;
                        if (k)
                        {
                            fragment8.r = fragment8.r + 1;
                            if (m.a)
                            {
                                Log.v("FragmentManager", (new StringBuilder("Bump nesting of ")).append(fragment8).append(" to ").append(fragment8.r).toString());
                            }
                        }
                        a.a(fragment8, i, j);
                        fragment7 = fragment1;
                    }
                }
                i1++;
                fragment1 = fragment7;
            } while (true);
        } else
        {
            fragment7 = fragment1;
        }
        if (fragment7 != null)
        {
            fragment7.G = b1.e;
            a.a(fragment7, false);
        }
          goto _L11
_L4:
        Fragment fragment2 = b1.d;
        fragment2.G = b1.f;
        a.a(fragment2, i, j);
          goto _L11
_L5:
        Fragment fragment3 = b1.d;
        fragment3.G = b1.f;
        a.b(fragment3, i, j);
          goto _L11
_L6:
        Fragment fragment4 = b1.d;
        fragment4.G = b1.e;
        a.c(fragment4, i, j);
          goto _L11
_L7:
        Fragment fragment5 = b1.d;
        fragment5.G = b1.f;
        a.d(fragment5, i, j);
          goto _L11
        Fragment fragment6 = b1.d;
        fragment6.G = b1.e;
        a.e(fragment6, i, j);
          goto _L11
        a.a(a.n, i, j, true);
        if (k)
        {
            a.b(this);
        }
        return;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("BackStackEntry{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (o >= 0)
        {
            stringbuilder.append(" #");
            stringbuilder.append(o);
        }
        if (m != null)
        {
            stringbuilder.append(" ");
            stringbuilder.append(m);
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
