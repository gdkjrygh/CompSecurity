// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.media.CamcorderProfile;
import java.util.Collections;
import java.util.Set;

// Referenced classes of package com.skype.android.media:
//            Size

public interface DeviceProfile
{

    public static final DeviceProfile a = new DeviceProfile() {

        public final void a(CamcorderProfile camcorderprofile, android.hardware.Camera.Parameters parameters)
        {
        }

        public final CamcorderProfile b(int i1)
        {
            return CamcorderProfile.get(i1, 1);
        }

        public final boolean b()
        {
            return false;
        }

        public final int c(int i1)
        {
            return i1;
        }

        public final boolean d(int i1)
        {
            return false;
        }

        public final Size e(int i1)
        {
            return null;
        }

        public final boolean e()
        {
            return false;
        }

        public final boolean f()
        {
            return false;
        }

        public final Set g()
        {
            return Collections.emptySet();
        }

        public final Integer h()
        {
            return null;
        }

        public final Size i()
        {
            return null;
        }

        public final boolean j()
        {
            return false;
        }

        public final boolean k()
        {
            return false;
        }

        public final boolean l()
        {
            return false;
        }

        public final Size m()
        {
            return Size.c;
        }

        public final Size n()
        {
            return Size.a;
        }

        public final boolean o()
        {
            return false;
        }

        public final boolean p()
        {
            return false;
        }

        public final boolean q()
        {
            return false;
        }

        public final boolean r()
        {
            return false;
        }

        public final String toString()
        {
            return "DEFAULT";
        }

    };

    public abstract void a(CamcorderProfile camcorderprofile, android.hardware.Camera.Parameters parameters);

    public abstract CamcorderProfile b(int i1);

    public abstract boolean b();

    public abstract int c(int i1);

    public abstract boolean d(int i1);

    public abstract Size e(int i1);

    public abstract boolean e();

    public abstract boolean f();

    public abstract Set g();

    public abstract Integer h();

    public abstract Size i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract Size m();

    public abstract Size n();

    public abstract boolean o();

    public abstract boolean p();

    public abstract boolean q();

    public abstract boolean r();

}
