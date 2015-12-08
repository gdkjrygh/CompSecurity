// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dt;

import android.os.Looper;

// Referenced classes of package p.dt:
//            c

public interface k
{

    public static final k a = new k() {

        public void a(c c)
        {
        }

    };
    public static final k b = new k() {

        public void a(c c)
        {
            if (Looper.myLooper() != Looper.getMainLooper())
            {
                throw new IllegalStateException((new StringBuilder()).append("Event bus ").append(c).append(" accessed from non-main thread ").append(Looper.myLooper()).toString());
            } else
            {
                return;
            }
        }

    };

    public abstract void a(c c);

}
