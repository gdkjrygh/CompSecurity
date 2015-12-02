// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.qihoo.security.malware.vo.MaliciousInfo;
import com.qihoo.security.opti.trashclear.ui.i;
import com.qihoo.security.widget.ImageView.RemoteImageView;
import java.util.ArrayList;
import java.util.List;

public class FolderImageView extends FrameLayout
{

    private RemoteImageView a;
    private RemoteImageView b;
    private RemoteImageView c;
    private RemoteImageView d;
    private final List e = new ArrayList();

    public FolderImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        View.inflate(context, 0x7f0300a9, this);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = (RemoteImageView)findViewById(0x7f0b0223);
        b = (RemoteImageView)findViewById(0x7f0b0224);
        c = (RemoteImageView)findViewById(0x7f0b0225);
        d = (RemoteImageView)findViewById(0x7f0b0226);
        e.clear();
        e.add(a);
        e.add(b);
        e.add(c);
        e.add(d);
    }

    public void setFolderImageView(List list)
    {
        int l = e.size();
        int j;
        int k;
        if (list == null)
        {
            j = 0;
        } else
        {
            j = list.size();
        }
        k = 0;
        while (k < l) 
        {
            RemoteImageView remoteimageview = (RemoteImageView)e.get(k);
            if (k < j)
            {
                MaliciousInfo maliciousinfo = (MaliciousInfo)((i)list.get(k)).c();
                if (com.qihoo360.mobilesafe.b.i.a(getContext(), maliciousinfo.packageName))
                {
                    remoteimageview.b(maliciousinfo.packageName, 0x7f020042);
                } else
                {
                    remoteimageview.c(maliciousinfo.filePath, 0x7f020042);
                }
            } else
            {
                remoteimageview.setImageResource(0x7f020042);
            }
            k++;
        }
    }
}
