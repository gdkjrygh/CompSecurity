// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kik.m.d;
import kik.android.util.ct;
import kik.android.util.cv;

// Referenced classes of package kik.android.widget:
//            GalleryImageView, RobotoTextView, GalleryWidget

final class z extends CursorAdapter
{
    private final class a
    {

        GalleryImageView a;
        View b;
        RobotoTextView c;
        final z d;

        private a()
        {
            d = z.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private GalleryWidget a;
    private int b;
    private int c;

    public z(GalleryWidget gallerywidget, Context context, Cursor cursor, int i, int j)
    {
        super(context, cursor, 0);
        a = gallerywidget;
        b = i;
        c = j;
    }

    public final void a(int i)
    {
        b = i;
    }

    public final void bindView(View view, Context context, Cursor cursor)
    {
        context = (a)view.getTag();
        ((a) (context)).a.getLayoutParams().width = b;
        ((a) (context)).a.getLayoutParams().height = b;
        ((a) (context)).b.getLayoutParams().width = b;
        boolean flag = ct.a(cursor.getString(cursor.getColumnIndexOrThrow("_data")));
        if (flag)
        {
            cv.b(new View[] {
                ((a) (context)).b
            });
            long l;
            try
            {
                String s = ct.a(cursor.getInt(cursor.getColumnIndexOrThrow("duration")));
                cv.b(new View[] {
                    ((a) (context)).c
                });
                ((a) (context)).c.setText(s);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                cv.e(new View[] {
                    ((a) (context)).c
                });
            }
        } else
        {
            cv.e(new View[] {
                ((a) (context)).b
            });
        }
        l = cursor.getLong(c);
        a.a(l, "GalleryWidget", ((a) (context)).a, 1, flag);
        if (flag)
        {
            context = "AUTOMATION_GALLERY_VIDEO";
        } else
        {
            context = "AUTOMATION_GALLERY_PHOTO";
        }
        d.a(view, context);
    }

    public final View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(context).inflate(0x7f030074, viewgroup, false);
        a a1 = new a((byte)0);
        a1.a = (GalleryImageView)viewgroup.findViewById(0x7f0e0185);
        a1.b = viewgroup.findViewById(0x7f0e0186);
        a1.c = (RobotoTextView)viewgroup.findViewById(0x7f0e00e1);
        viewgroup.setTag(a1);
        bindView(viewgroup, context, cursor);
        return viewgroup;
    }
}
