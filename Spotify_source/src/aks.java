// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.crashlytics.android.answers.SessionEvent;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

final class aks extends hai
    implements alb
{

    private final gyh d;
    private final hba e;
    private ald f;
    private akt g;
    private har h;
    private boolean i;
    private boolean j;

    public aks(gyh gyh, Context context, ScheduledExecutorService scheduledexecutorservice, aky aky1, hba hba, ald ald)
    {
        super(context, scheduledexecutorservice, aky1);
        g = new aku();
        new gyx();
        i = true;
        j = true;
        d = gyh;
        e = hba;
        f = ald;
    }

    public final har a()
    {
        return h;
    }

    public final void a(alc alc1)
    {
        boolean flag = false;
        SessionEvent sessionevent = new SessionEvent(f, alc1.b, alc1.a, alc1.c, alc1.d, alc1.e, (byte)0);
        if (!i && com.crashlytics.android.answers.SessionEvent.Type.k.equals(sessionevent.c))
        {
            gya.a().a("Answers", (new StringBuilder("Custom events tracking disabled - skipping event: ")).append(sessionevent).toString());
        } else
        {
            if (!j && com.crashlytics.android.answers.SessionEvent.Type.l.equals(sessionevent.c))
            {
                gya.a().a("Answers", (new StringBuilder("Predefined events tracking disabled - skipping event: ")).append(sessionevent).toString());
                return;
            }
            if (g.a(sessionevent))
            {
                gya.a().a("Answers", (new StringBuilder("Skipping filtered event: ")).append(sessionevent).toString());
                return;
            }
            CommonUtils.a(super.a, sessionevent.toString());
            try
            {
                alc1 = super.b;
                byte abyte0[] = ((hak) (alc1)).c.a(sessionevent);
                int k = abyte0.length;
                if (!((hak) (alc1)).e.a(k, alc1.c()))
                {
                    String s = String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[] {
                        Integer.valueOf(((hak) (alc1)).e.a()), Integer.valueOf(k), Integer.valueOf(alc1.c())
                    });
                    CommonUtils.c(((hak) (alc1)).b, s);
                    alc1.d();
                }
                ((hak) (alc1)).e.a(abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (alc alc1)
            {
                CommonUtils.b(super.a, "Failed to write event.");
            }
            if (super.c != -1)
            {
                flag = true;
            }
            if (flag)
            {
                a(super.c, super.c);
                return;
            }
        }
    }

    public final void a(hbg hbg1, String s)
    {
        h = new akq(new akz(d, s, hbg1.a, e, gyx.a(a)), new akw(new hag(new akv(new hae()), new had((byte)0))));
        ((aky)b).a = hbg1;
        i = hbg1.e;
        gyk gyk1 = gya.a();
        StringBuilder stringbuilder = new StringBuilder("Custom event tracking ");
        if (i)
        {
            s = "enabled";
        } else
        {
            s = "disabled";
        }
        gyk1.a("Answers", stringbuilder.append(s).toString());
        j = hbg1.f;
        gyk1 = gya.a();
        stringbuilder = new StringBuilder("Predefined event tracking ");
        if (j)
        {
            s = "enabled";
        } else
        {
            s = "disabled";
        }
        gyk1.a("Answers", stringbuilder.append(s).toString());
        if (hbg1.g > 1)
        {
            gya.a().a("Answers", "Event sampling enabled");
            g = new akx(hbg1.g);
        }
        super.c = hbg1.b;
        a(0L, super.c);
    }
}
