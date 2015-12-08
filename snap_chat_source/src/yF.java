// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;
import com.snapchat.android.database.schema.VerifiedDeviceSchema;

public final class yF extends CursorAdapter
{
    public static interface a
    {

        public abstract void a(String s);
    }

    static final class b
    {

        TextView a;
        TextView b;
        View c;
        View d;

        public b(View view)
        {
            a = (TextView)view.findViewById(0x7f0d0549);
            b = (TextView)view.findViewById(0x7f0d054a);
            c = view.findViewById(0x7f0d054b);
            d = view.findViewById(0x7f0d009a);
        }
    }


    private final Context a;
    private final String b;
    private final String c;
    private final a d;

    public yF(Context context, a a1)
    {
        super(context, null, 0);
        a = context;
        d = a1;
        c = a.getString(0x7f0802f6);
        b = a.getString(0x7f0802f5);
    }

    static a a(yF yf)
    {
        return yf.d;
    }

    static String b(yF yf)
    {
        return yf.b;
    }

    static String c(yF yf)
    {
        return yf.c;
    }

    static Context d(yF yf)
    {
        return yf.a;
    }

    public final void bindView(View view, Context context, Cursor cursor)
    {
        view = (b)view.getTag();
        context = cursor.getString(VerifiedDeviceSchema.DEVICE_ID.getColumnNumber());
        ((b) (view)).a.setText(cursor.getString(VerifiedDeviceSchema.DEVICE_NAME.getColumnNumber()));
        ((b) (view)).b.setText(IC.a(null, 0x7f0802f0, new Object[] {
            Ii.b(a, cursor.getLong(VerifiedDeviceSchema.LAST_LOGIN.getColumnNumber()))
        }));
        ((b) (view)).c.setVisibility(0);
        ((b) (view)).d.setVisibility(8);
        ((b) (view)).c.setOnClickListener(new android.view.View.OnClickListener(view, context) {

            final b a;
            final String b;
            final yF c;

            public final void onClick(View view1)
            {
                view1 = new Gc(yF.d(c));
                view1.g = yF.c(c);
                view1.h = yF.b(c);
                view1.a(0x7f080323, new Gc.a(this) {

                    private _cls1 a;

                    public final void a(Gc gc)
                    {
                        a.a.c.setVisibility(8);
                        a.a.d.setVisibility(0);
                        yF.a(a.c).a(a.b);
                    }

            
            {
                a = _pcls1;
                super();
            }
                }).b(0x7f080196, null).b();
            }

            
            {
                c = yF.this;
                a = b1;
                b = s;
                super();
            }
        });
    }

    public final View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f040108, viewgroup, false);
        context.setTag(new b(context));
        return context;
    }
}
