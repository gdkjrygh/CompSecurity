// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.os.Environment;
import android.util.Log;
import android.view.View;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Referenced classes of package com.mobeta.android.dslv:
//            DragSortListView

final class l
{

    StringBuilder a;
    File b;
    final DragSortListView c;
    private int d;
    private int e;
    private boolean f;

    public l(DragSortListView dragsortlistview)
    {
        c = dragsortlistview;
        super();
        a = new StringBuilder();
        d = 0;
        e = 0;
        f = false;
        b = new File(Environment.getExternalStorageDirectory(), "dslv_state.txt");
        if (b.exists())
        {
            break MISSING_BLOCK_LABEL_77;
        }
        b.createNewFile();
        Log.d("mobeta", "file created");
        return;
        dragsortlistview;
        Log.w("mobeta", "Could not create dslv_state.txt");
        Log.d("mobeta", dragsortlistview.getMessage());
        return;
    }

    private void d()
    {
        boolean flag;
        flag = false;
        if (!f)
        {
            return;
        }
        FileWriter filewriter;
        IOException ioexception;
        if (e != 0)
        {
            flag = true;
        }
        filewriter = new FileWriter(b, flag);
        filewriter.write(a.toString());
        a.delete(0, a.length());
        filewriter.flush();
        filewriter.close();
        e = e + 1;
        return;
        ioexception;
    }

    public final void a()
    {
        a.append("<DSLVStates>\n");
        e = 0;
        f = true;
    }

    public final void b()
    {
        if (f) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        int j;
        int k;
        a.append("<DSLVState>\n");
        j = c.getChildCount();
        k = c.getFirstVisiblePosition();
        a.append("    <Positions>");
        i = 0;
_L9:
        if (i < j) goto _L4; else goto _L3
_L3:
        a.append("</Positions>\n");
        a.append("    <Tops>");
        i = 0;
_L10:
        if (i < j) goto _L6; else goto _L5
_L5:
        a.append("</Tops>\n");
        a.append("    <Bottoms>");
        i = 0;
_L11:
        if (i < j) goto _L8; else goto _L7
_L7:
        a.append("</Bottoms>\n");
        a.append("    <FirstExpPos>").append(DragSortListView.m(c)).append("</FirstExpPos>\n");
        a.append("    <FirstExpBlankHeight>").append(DragSortListView.c(c, DragSortListView.m(c)) - DragSortListView.d(c, DragSortListView.m(c))).append("</FirstExpBlankHeight>\n");
        a.append("    <SecondExpPos>").append(DragSortListView.n(c)).append("</SecondExpPos>\n");
        a.append("    <SecondExpBlankHeight>").append(DragSortListView.c(c, DragSortListView.n(c)) - DragSortListView.d(c, DragSortListView.n(c))).append("</SecondExpBlankHeight>\n");
        a.append("    <SrcPos>").append(DragSortListView.i(c)).append("</SrcPos>\n");
        a.append("    <SrcHeight>").append(DragSortListView.k(c) + c.getDividerHeight()).append("</SrcHeight>\n");
        a.append("    <ViewHeight>").append(c.getHeight()).append("</ViewHeight>\n");
        a.append("    <LastY>").append(DragSortListView.y(c)).append("</LastY>\n");
        a.append("    <FloatY>").append(DragSortListView.s(c)).append("</FloatY>\n");
        a.append("    <ShuffleEdges>");
        i = 0;
_L12:
        if (i < j)
        {
            break MISSING_BLOCK_LABEL_544;
        }
        a.append("</ShuffleEdges>\n");
        a.append("</DSLVState>\n");
        d = d + 1;
        if (d > 1000)
        {
            d();
            d = 0;
            return;
        }
          goto _L1
_L4:
        a.append(k + i).append(",");
        i++;
          goto _L9
_L6:
        a.append(c.getChildAt(i).getTop()).append(",");
        i++;
          goto _L10
_L8:
        a.append(c.getChildAt(i).getBottom()).append(",");
        i++;
          goto _L11
        a.append(DragSortListView.a(c, k + i, c.getChildAt(i).getTop())).append(",");
        i++;
          goto _L12
    }

    public final void c()
    {
        if (f)
        {
            a.append("</DSLVStates>\n");
            d();
            f = false;
        }
    }
}
