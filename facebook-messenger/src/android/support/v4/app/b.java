// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            ad, Fragment, c, s

final class b extends ad
    implements Runnable
{

    final s a;
    c b;
    c c;
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

    public b(s s1)
    {
        l = true;
        o = -1;
        a = s1;
    }

    private void a(int i1, Fragment fragment, String s1, int j1)
    {
        fragment.C = a;
        if (s1 != null)
        {
            if (fragment.I != null && !s1.equals(fragment.I))
            {
                throw new IllegalStateException((new StringBuilder()).append("Can't change tag of fragment ").append(fragment).append(": was ").append(fragment.I).append(" now ").append(s1).toString());
            }
            fragment.I = s1;
        }
        if (i1 != 0)
        {
            if (fragment.G != 0 && fragment.G != i1)
            {
                throw new IllegalStateException((new StringBuilder()).append("Can't change container ID of fragment ").append(fragment).append(": was ").append(fragment.G).append(" now ").append(i1).toString());
            }
            fragment.G = i1;
            fragment.H = i1;
        }
        s1 = new c();
        s1.c = j1;
        s1.d = fragment;
        a(((c) (s1)));
    }

    public int a()
    {
        return a(false);
    }

    int a(boolean flag)
    {
        if (n)
        {
            throw new IllegalStateException("commit already called");
        }
        if (s.a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("Commit: ").append(this).toString());
            a("  ", ((FileDescriptor) (null)), new PrintWriter(new android.support.v4.c.b("FragmentManager")), ((String []) (null)));
        }
        n = true;
        if (k)
        {
            o = a.a(this);
        } else
        {
            o = -1;
        }
        a.a(this, flag);
        return o;
    }

    public ad a(int i1, int j1)
    {
        return a(i1, j1, 0, 0);
    }

    public ad a(int i1, int j1, int k1, int l1)
    {
        e = i1;
        f = j1;
        g = k1;
        h = l1;
        return this;
    }

    public ad a(int i1, Fragment fragment)
    {
        return b(i1, fragment, null);
    }

    public ad a(int i1, Fragment fragment, String s1)
    {
        a(i1, fragment, s1, 1);
        return this;
    }

    public ad a(Fragment fragment)
    {
        c c1 = new c();
        c1.c = 3;
        c1.d = fragment;
        a(c1);
        return this;
    }

    public ad a(Fragment fragment, String s1)
    {
        a(0, fragment, s1, 1);
        return this;
    }

    public ad a(String s1)
    {
        if (!l)
        {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        } else
        {
            k = true;
            m = s1;
            return this;
        }
    }

    void a(int i1)
    {
        if (k)
        {
            if (s.a)
            {
                Log.v("FragmentManager", (new StringBuilder()).append("Bump nesting in ").append(this).append(" by ").append(i1).toString());
            }
            c c1 = b;
            while (c1 != null) 
            {
                if (c1.d != null)
                {
                    Fragment fragment = c1.d;
                    fragment.B = fragment.B + i1;
                    if (s.a)
                    {
                        Log.v("FragmentManager", (new StringBuilder()).append("Bump nesting of ").append(c1.d).append(" to ").append(c1.d.B).toString());
                    }
                }
                if (c1.i != null)
                {
                    for (int j1 = c1.i.size() - 1; j1 >= 0; j1--)
                    {
                        Fragment fragment1 = (Fragment)c1.i.get(j1);
                        fragment1.B = fragment1.B + i1;
                        if (s.a)
                        {
                            Log.v("FragmentManager", (new StringBuilder()).append("Bump nesting of ").append(fragment1).append(" to ").append(fragment1.B).toString());
                        }
                    }

                }
                c1 = c1.a;
            }
        }
    }

    void a(c c1)
    {
        if (b == null)
        {
            c = c1;
            b = c1;
        } else
        {
            c1.b = c;
            c.a = c1;
            c = c1;
        }
        c1.e = e;
        c1.f = f;
        c1.g = g;
        c1.h = h;
        d = d + 1;
    }

    public void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        a(s1, printwriter, true);
    }

    public void a(String s1, PrintWriter printwriter, boolean flag)
    {
        c c1;
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
            break MISSING_BLOCK_LABEL_811;
        }
        printwriter.print(s1);
        printwriter.println("Operations:");
        s3 = (new StringBuilder()).append(s1).append("    ").toString();
        c1 = b;
        i1 = 0;
_L13:
        if (c1 == null) goto _L2; else goto _L1
_L1:
        c1.c;
        JVM INSTR tableswitch 0 7: default 412
    //                   0 690
    //                   1 698
    //                   2 706
    //                   3 714
    //                   4 722
    //                   5 730
    //                   6 738
    //                   7 746;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L11:
        break MISSING_BLOCK_LABEL_746;
_L3:
        String s2 = (new StringBuilder()).append("cmd=").append(c1.c).toString();
_L12:
        printwriter.print(s1);
        printwriter.print("  Op #");
        printwriter.print(i1);
        printwriter.print(": ");
        printwriter.print(s2);
        printwriter.print(" ");
        printwriter.println(c1.d);
        if (flag)
        {
            if (c1.e != 0 || c1.f != 0)
            {
                printwriter.print(s1);
                printwriter.print("enterAnim=#");
                printwriter.print(Integer.toHexString(c1.e));
                printwriter.print(" exitAnim=#");
                printwriter.println(Integer.toHexString(c1.f));
            }
            if (c1.g != 0 || c1.h != 0)
            {
                printwriter.print(s1);
                printwriter.print("popEnterAnim=#");
                printwriter.print(Integer.toHexString(c1.g));
                printwriter.print(" popExitAnim=#");
                printwriter.println(Integer.toHexString(c1.h));
            }
        }
        if (c1.i != null && c1.i.size() > 0)
        {
            int j1 = 0;
            while (j1 < c1.i.size()) 
            {
                printwriter.print(s3);
                if (c1.i.size() == 1)
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
                printwriter.println(c1.i.get(j1));
                j1++;
            }
        }
        break MISSING_BLOCK_LABEL_795;
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
        c1 = c1.a;
        i1++;
          goto _L13
_L2:
    }

    public int b()
    {
        return a(true);
    }

    public ad b(int i1, Fragment fragment, String s1)
    {
        if (i1 == 0)
        {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        } else
        {
            a(i1, fragment, s1, 2);
            return this;
        }
    }

    public ad b(Fragment fragment)
    {
        c c1 = new c();
        c1.c = 4;
        c1.d = fragment;
        a(c1);
        return this;
    }

    public void b(boolean flag)
    {
        c c1;
        if (s.a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("popFromBackStack: ").append(this).toString());
            a("  ", ((FileDescriptor) (null)), new PrintWriter(new android.support.v4.c.b("FragmentManager")), ((String []) (null)));
        }
        a(-1);
        c1 = c;
_L10:
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_449;
        }
        c1.c;
        JVM INSTR tableswitch 1 7: default 116
    //                   1 147
    //                   2 187
    //                   3 284
    //                   4 309
    //                   5 344
    //                   6 379
    //                   7 414;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_414;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown cmd: ").append(c1.c).toString());
_L2:
        Fragment fragment = c1.d;
        fragment.Q = c1.h;
        a.a(fragment, android.support.v4.app.s.e(i), j);
_L11:
        c1 = c1.b;
        if (true) goto _L10; else goto _L9
_L9:
        Fragment fragment1 = c1.d;
        if (fragment1 != null)
        {
            fragment1.Q = c1.h;
            a.a(fragment1, android.support.v4.app.s.e(i), j);
        }
        if (c1.i != null)
        {
            int i1 = 0;
            while (i1 < c1.i.size()) 
            {
                Fragment fragment2 = (Fragment)c1.i.get(i1);
                fragment2.Q = c1.g;
                a.a(fragment2, false);
                i1++;
            }
        }
          goto _L11
_L4:
        Fragment fragment3 = c1.d;
        fragment3.Q = c1.g;
        a.a(fragment3, false);
          goto _L11
_L5:
        Fragment fragment4 = c1.d;
        fragment4.Q = c1.g;
        a.c(fragment4, android.support.v4.app.s.e(i), j);
          goto _L11
_L6:
        Fragment fragment5 = c1.d;
        fragment5.Q = c1.h;
        a.b(fragment5, android.support.v4.app.s.e(i), j);
          goto _L11
_L7:
        Fragment fragment6 = c1.d;
        fragment6.Q = c1.g;
        a.e(fragment6, android.support.v4.app.s.e(i), j);
          goto _L11
        Fragment fragment7 = c1.d;
        fragment7.Q = c1.g;
        a.d(fragment7, android.support.v4.app.s.e(i), j);
          goto _L11
        if (flag)
        {
            a.a(a.n, android.support.v4.app.s.e(i), j, true);
        }
        if (o >= 0)
        {
            a.d(o);
            o = -1;
        }
        return;
    }

    public ad c(Fragment fragment)
    {
        c c1 = new c();
        c1.c = 5;
        c1.d = fragment;
        a(c1);
        return this;
    }

    public String c()
    {
        return m;
    }

    public ad d(Fragment fragment)
    {
        c c1 = new c();
        c1.c = 6;
        c1.d = fragment;
        a(c1);
        return this;
    }

    public boolean d()
    {
        return d == 0;
    }

    public ad e(Fragment fragment)
    {
        c c1 = new c();
        c1.c = 7;
        c1.d = fragment;
        a(c1);
        return this;
    }

    public void run()
    {
        c c1;
        if (s.a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("Run: ").append(this).toString());
        }
        if (k && o < 0)
        {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        a(1);
        c1 = b;
_L10:
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_623;
        }
        c1.c;
        JVM INSTR tableswitch 1 7: default 116
    //                   1 147
    //                   2 177
    //                   3 463
    //                   4 495
    //                   5 527
    //                   6 559
    //                   7 591;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_591;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown cmd: ").append(c1.c).toString());
_L2:
        Fragment fragment = c1.d;
        fragment.Q = c1.e;
        a.a(fragment, false);
_L11:
        c1 = c1.a;
        if (true) goto _L10; else goto _L9
_L9:
        Fragment fragment1 = c1.d;
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
                    if (s.a)
                    {
                        Log.v("FragmentManager", (new StringBuilder()).append("OP_REPLACE: adding=").append(fragment1).append(" old=").append(fragment8).toString());
                    }
                    if (fragment1 != null)
                    {
                        fragment7 = fragment1;
                        if (fragment8.H != fragment1.H)
                        {
                            break label1;
                        }
                    }
                    if (fragment8 == fragment1)
                    {
                        fragment7 = null;
                        c1.d = null;
                    } else
                    {
                        if (c1.i == null)
                        {
                            c1.i = new ArrayList();
                        }
                        c1.i.add(fragment8);
                        fragment8.Q = c1.f;
                        if (k)
                        {
                            fragment8.B = fragment8.B + 1;
                            if (s.a)
                            {
                                Log.v("FragmentManager", (new StringBuilder()).append("Bump nesting of ").append(fragment8).append(" to ").append(fragment8.B).toString());
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
            fragment7.Q = c1.e;
            a.a(fragment7, false);
        }
          goto _L11
_L4:
        Fragment fragment2 = c1.d;
        fragment2.Q = c1.f;
        a.a(fragment2, i, j);
          goto _L11
_L5:
        Fragment fragment3 = c1.d;
        fragment3.Q = c1.f;
        a.b(fragment3, i, j);
          goto _L11
_L6:
        Fragment fragment4 = c1.d;
        fragment4.Q = c1.e;
        a.c(fragment4, i, j);
          goto _L11
_L7:
        Fragment fragment5 = c1.d;
        fragment5.Q = c1.f;
        a.d(fragment5, i, j);
          goto _L11
        Fragment fragment6 = c1.d;
        fragment6.Q = c1.e;
        a.e(fragment6, i, j);
          goto _L11
        a.a(a.n, i, j, true);
        if (k)
        {
            a.b(this);
        }
        return;
    }

    public String toString()
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
