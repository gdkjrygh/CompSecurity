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

private class b
{

    StringBuilder a;
    File b;
    final DragSortListView c;
    private int d;
    private int e;
    private boolean f;

    public void a()
    {
        a.append("<DSLVStates>\n");
        e = 0;
        f = true;
    }

    public void b()
    {
        if (f)
        {
            a.append("<DSLVState>\n");
            int i1 = c.getChildCount();
            int j1 = c.getFirstVisiblePosition();
            a.append("    <Positions>");
            for (int i = 0; i < i1; i++)
            {
                a.append(j1 + i).append(",");
            }

            a.append("</Positions>\n");
            a.append("    <Tops>");
            for (int j = 0; j < i1; j++)
            {
                a.append(c.getChildAt(j).getTop()).append(",");
            }

            a.append("</Tops>\n");
            a.append("    <Bottoms>");
            for (int k = 0; k < i1; k++)
            {
                a.append(c.getChildAt(k).getBottom()).append(",");
            }

            a.append("</Bottoms>\n");
            a.append("    <FirstExpPos>").append(DragSortListView.l(c)).append("</FirstExpPos>\n");
            a.append("    <FirstExpBlankHeight>").append(DragSortListView.c(c, DragSortListView.l(c)) - DragSortListView.d(c, DragSortListView.l(c))).append("</FirstExpBlankHeight>\n");
            a.append("    <SecondExpPos>").append(DragSortListView.m(c)).append("</SecondExpPos>\n");
            a.append("    <SecondExpBlankHeight>").append(DragSortListView.c(c, DragSortListView.m(c)) - DragSortListView.d(c, DragSortListView.m(c))).append("</SecondExpBlankHeight>\n");
            a.append("    <SrcPos>").append(DragSortListView.h(c)).append("</SrcPos>\n");
            a.append("    <SrcHeight>").append(DragSortListView.j(c) + c.getDividerHeight()).append("</SrcHeight>\n");
            a.append("    <ViewHeight>").append(c.getHeight()).append("</ViewHeight>\n");
            a.append("    <LastY>").append(DragSortListView.x(c)).append("</LastY>\n");
            a.append("    <FloatY>").append(DragSortListView.r(c)).append("</FloatY>\n");
            a.append("    <ShuffleEdges>");
            for (int l = 0; l < i1; l++)
            {
                a.append(DragSortListView.a(c, j1 + l, c.getChildAt(l).getTop())).append(",");
            }

            a.append("</ShuffleEdges>\n");
            a.append("</DSLVState>\n");
            d = d + 1;
            if (d > 1000)
            {
                c();
                d = 0;
                return;
            }
        }
    }

    public void c()
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

    public void d()
    {
        if (f)
        {
            a.append("</DSLVStates>\n");
            c();
            f = false;
        }
    }

    public (DragSortListView dragsortlistview)
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
}
