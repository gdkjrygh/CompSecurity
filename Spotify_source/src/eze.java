// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.spotlets.phoenixinbox.InboxItemView;
import com.spotify.mobile.android.util.Assertion;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class eze extends os
{

    private final fuj c;

    public eze(Context context, fuj fuj)
    {
        super(context);
        c = fuj;
    }

    public final View a(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = new InboxItemView(context);
        context.setTag(new ezd());
        return context;
    }

    public final void a(View view, Context context, Cursor cursor)
    {
        boolean flag;
        flag = false;
        context = (ezd)view.getTag();
        context.c = cursor.getInt(0);
        context.k = ((Integer)ezd.a.get(gcw.a(cursor, 7, "unknown"))).intValue();
        context.g = gcw.a(cursor, 4, "");
        context.h = cursor.getString(5);
        context.i = cursor.getString(6);
        context.j = gcw.a(cursor, 9);
        context.f = gcw.a(cursor, 1);
        context.e = gcw.a(cursor, 2, "");
        context.d = cursor.getInt(3);
        context.v = false;
        context.w = false;
        context.u = false;
        cursor = new JSONObject(cursor.getString(8));
        ((ezd) (context)).k;
        JVM INSTR tableswitch -1 3: default 1260
    //                   -1 955
    //                   0 802
    //                   1 449
    //                   2 582
    //                   3 687;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        Assertion.a((new StringBuilder("Unexpected item type ")).append(((ezd) (context)).k).toString());
_L13:
        SpannableStringBuilder spannablestringbuilder;
        Calendar calendar;
        Object obj;
        cursor = (InboxItemView)view;
        calendar = Calendar.getInstance();
        calendar.add(13, -context.c());
        obj = context.a(cursor.getResources());
        view = context.d();
        spannablestringbuilder = new SpannableStringBuilder();
        byte byte0;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            spannablestringbuilder.append(cursor.getResources().getString(0x7f0803e1));
        } else
        {
            spannablestringbuilder.append(((CharSequence) (obj)));
            spannablestringbuilder.append(' ');
            spannablestringbuilder.append(context.b(cursor.getResources()));
            spannablestringbuilder.setSpan(new ForegroundColorSpan(dgo.b(cursor.getContext(), 0x7f0101d1)), 0, ((String) (obj)).length(), 33);
        }
        obj = new StringBuilder(context.f());
        if (!TextUtils.isEmpty(view))
        {
            ((StringBuilder) (obj)).append(": ");
            ((StringBuilder) (obj)).append(context.d().trim());
        }
        view = ((InboxItemView) (cursor)).a;
        if (context.e())
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
        if (TextUtils.isEmpty(context.h()))
        {
            ((InboxItemView) (cursor)).b.setImageDrawable(((InboxItemView) (cursor)).f);
        } else
        {
            ((InboxItemView) (cursor)).l.b(((InboxItemView) (cursor)).b, context.h());
        }
        context.j();
        JVM INSTR tableswitch -1 3: default 420
    //                   -1 1247
    //                   0 1053
    //                   1 1226
    //                   2 1233
    //                   3 1240;
           goto _L7 _L8 _L9 _L10 _L11 _L12
_L7:
        throw new AssertionError((new StringBuilder("Unexpected InboxItem type ")).append(context.j()).toString());
_L4:
        try
        {
            context.o = null;
            context.p = cursor.getString("album_name");
            context.q = cursor.getString("artist_name");
            context.r = null;
            context.s = cursor.getString("album_uri");
            context.t = cursor.getString("artist_uri");
            context.l = ((ezd) (context)).p;
            context.m = ((ezd) (context)).q;
            context.n = ((ezd) (context)).s;
            if (TextUtils.isEmpty(cursor.getString("album_image_small_uri")))
            {
                cursor.getString("album_image_uri");
            }
            cursor.getBoolean("is_queueable");
            context.u = cursor.getBoolean("is_available");
            cursor.getBoolean("is_radio_available");
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            context.a();
        }
          goto _L13
_L5:
        context.o = null;
        context.p = null;
        context.q = cursor.getString("artist_name");
        context.r = null;
        context.s = null;
        context.t = cursor.getString("artist_uri");
        context.l = ((ezd) (context)).q;
        context.m = "";
        context.n = ((ezd) (context)).t;
        if (TextUtils.isEmpty(cursor.getString("artist_image_small_uri")))
        {
            cursor.getString("artist_image_uri");
        }
        context.u = cursor.getBoolean("is_available");
        cursor.getBoolean("is_radio_available");
          goto _L13
_L6:
        context.o = null;
        context.p = null;
        context.q = null;
        context.r = null;
        context.s = null;
        context.t = null;
        context.v = cursor.getBoolean("is_starred");
        context.w = cursor.getBoolean("is_toptracks");
        context.l = cursor.getString("playlist_name");
        context.m = cursor.getString("playlist_owner_name");
        context.n = cursor.getString("playlist_uri");
        cursor.getString("playlist_image_uri");
        context.u = cursor.getBoolean("is_available");
        cursor.getBoolean("is_radio_available");
          goto _L13
_L3:
        context.o = cursor.getString("track_name");
        context.p = cursor.getString("album_name");
        context.q = cursor.getString("artist_name");
        context.r = cursor.getString("track_uri");
        context.s = cursor.getString("album_uri");
        context.t = cursor.getString("artist_uri");
        context.l = ((ezd) (context)).o;
        context.m = ((ezd) (context)).q;
        context.n = ((ezd) (context)).r;
        if (cursor.getString("album_image_small_uri").length() == 0)
        {
            cursor.getString("album_image_uri");
        }
        cursor.getBoolean("is_queueable");
        context.u = cursor.getBoolean("is_available");
        cursor.getBoolean("is_radio_available");
        cursor.getBoolean("is_album_browsable");
        cursor.getBoolean("is_artist_browsable");
          goto _L13
_L2:
        context.a();
          goto _L13
_L9:
        view = SpotifyIcon.ab;
_L14:
        ((InboxItemView) (cursor)).g.a(view);
        cursor.j = context.f();
        cursor.k = context.g();
        view = ((InboxItemView) (cursor)).h.format(calendar.getTime());
        ((InboxItemView) (cursor)).c.setText(view.toUpperCase(cursor.getResources().getConfiguration().locale));
        ((InboxItemView) (cursor)).d.setText(spannablestringbuilder);
        ((InboxItemView) (cursor)).d.setCompoundDrawablesWithIntrinsicBounds(((InboxItemView) (cursor)).g, null, null, null);
        ((InboxItemView) (cursor)).e.setText(((StringBuilder) (obj)).toString());
        view = ((InboxItemView) (cursor)).i;
        int i;
        if (context.r())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 4;
        }
        view.setVisibility(i);
        view = gae.a(b, c, context);
        ((InboxItemView) (cursor)).i.removeAllViews();
        ((InboxItemView) (cursor)).i.addView(view);
        cursor.setTag(0x7f110041, new fxh(c, context));
        return;
_L10:
        view = SpotifyIcon.a;
          goto _L14
_L11:
        view = SpotifyIcon.c;
          goto _L14
_L12:
        view = SpotifyIcon.D;
          goto _L14
_L8:
        view = SpotifyIcon.D;
          goto _L14
    }
}
