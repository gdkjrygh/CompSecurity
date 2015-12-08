// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.content.res.Resources;
import android.widget.Toast;
import com.google.android.apps.photos.photosphere.PhotosphereViewerActivity;
import java.util.List;

public final class ilm
    implements emr, opv
{

    private static final ekk f = (new ekm()).a(hpg).b(elt).b(hdv).a();
    private static final ekw g;
    public emq a;
    public ar b;
    public euv c;
    public qgg d;
    public noz e;
    private ilu h;

    public ilm(opd opd1)
    {
        opd1.a(this);
    }

    public final void a()
    {
        h = new ilu(new ily(d, c, System.currentTimeMillis()));
        a.a(h, g, f);
    }

    public final void b(elb elb1)
    {
        Object obj;
        hdv hdv1;
        obj = (List)elb1.a();
        if (((List) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_234;
        }
        elb1 = (ekp)((List) (obj)).get(0);
        hdv1 = (hdv)elb1.b(hdv);
        if (hdv1 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        if (hdv1.m())
        {
            obj = new Intent(b, com/google/android/apps/photos/photosphere/PhotosphereViewerActivity);
            ((Intent) (obj)).putExtra("com.google.android.apps.photos.core.media", elb1);
            b.startActivity(((Intent) (obj)));
            return;
        }
        boolean flag;
        if (elb1.c() == euv.c && ((List) (obj)).size() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            elb1 = (new gne(b, -1)).a(elb1).a(h);
            ((gne) (elb1)).a.putExtra("com.google.android.apps.photos.pager.prevent_details", true);
            elb1 = elb1.c(true).e(true).f(true).g(true).b(true).d(true).a(false).h(flag);
            b.startActivity(((gne) (elb1)).a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (elb elb1)
        {
            elb1 = b.getResources().getString(b.Ab);
        }
        Toast.makeText(b, elb1, 0).show();
        b.finish();
        return;
    }

    static 
    {
        g = ekw.a;
    }
}
