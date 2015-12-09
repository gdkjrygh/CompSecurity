// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.di;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.util.Pair;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.h;
import java.security.InvalidParameterException;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.dd.ab;
import p.dd.au;
import p.dd.bc;

public class i extends d
{

    protected boolean a;
    private int c;

    public i()
    {
        c = 0;
        a = false;
    }

    public void a()
    {
    }

    protected transient void a(Exception exception, Object aobj[])
    {
        aobj = new Pair(p.dd.ab.a.c, Integer.valueOf(c));
        c.z.a(new ab(exception.getMessage(), 2002, ((Pair) (aobj))));
    }

    public void a(Object obj)
    {
        a = true;
        if (obj instanceof aa)
        {
            obj = (aa)obj;
            c.z.a(new bc(((aa) (obj)), c, false));
        }
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient aa c(Object aobj[])
        throws JSONException, q, y, n, OperationApplicationException, RemoteException
    {
        Object obj;
        aa aa1;
        Object obj1;
        c c1;
        Integer integer;
        obj = null;
        c1 = (c)aobj[0];
        obj1 = aobj[1];
        if (obj1 instanceof aa)
        {
            aa1 = (aa)obj1;
        } else
        if (obj1 instanceof h)
        {
            obj = (h)obj1;
            aa1 = null;
        } else
        {
            throw new InvalidParameterException("Task needs either TrackData or FeedbackData");
        }
        integer = (Integer)aobj[2];
        if (obj != null && integer.intValue() != 0)
        {
            throw new InvalidParameterException("A Task provided with FeedbackData can only set rating of NONE");
        }
        if (aa1 != null)
        {
            c = aa1.E();
        }
        integer.intValue();
        JVM INSTR tableswitch -1 1: default 348
    //                   -1 227
    //                   0 255
    //                   1 169;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new InvalidParameterException((new StringBuilder()).append("Invalid song rating: ").append(integer).toString());
_L4:
        try
        {
            obj = c1.e().a(aa1.q(), aa1.w(), Boolean.valueOf(true));
            aobj = p.dd.au.a.b;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            a(obj1);
            throw aobj;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            a(obj1);
            throw aobj;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            a(obj1);
            throw aobj;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            a(obj1);
            throw aobj;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            a(obj1);
            throw aobj;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            a(obj1);
            throw aobj;
        }
        if (aa1 == null) goto _L6; else goto _L5
_L5:
        aa1.b(integer.intValue());
_L6:
        c1.a(new au(((com.pandora.radio.data.y) (obj)), ((p.dd.au.a) (aobj))));
        a();
        return aa1;
_L2:
        obj = c1.e().a(aa1.q(), aa1.w(), Boolean.valueOf(false));
        aobj = p.dd.au.a.c;
        break MISSING_BLOCK_LABEL_194;
_L3:
        aobj = p.dd.au.a.d;
        if (aa1 == null) goto _L8; else goto _L7
_L7:
        obj = c1.e().a(aa1.q(), aa1.w());
        break MISSING_BLOCK_LABEL_194;
_L8:
        obj = c1.e().e(((h) (obj)).b(), ((h) (obj)).a());
        break MISSING_BLOCK_LABEL_194;
    }
}
