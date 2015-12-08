// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.spotify.mobile.android.spotlets.eventshub.model.Concert;
import com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult;
import java.util.List;

public final class err extends ArrayAdapter
{

    private final gji a;

    public err(Context context, List list)
    {
        super(context, 0, list);
        dmz.a(gjj);
        a = gjj.a(context);
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj = dhu.b(view);
        view = ((View) (obj));
        if (obj == null)
        {
            view = dhv.e(getContext(), viewgroup);
            view.e(true);
        }
        obj = ((ConcertResult)getItem(i)).getConcert();
        viewgroup = (dib)view.u();
        viewgroup.a(((Concert) (obj)).getTitleArtist());
        viewgroup.b(((Concert) (obj)).getMetadata());
        obj = ((Concert) (obj)).getImageUri();
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            viewgroup.d().setVisibility(0);
            a.a(viewgroup.d(), ((String) (obj)), dff.a(getContext()), dfo.a());
        }
        return view.v();
    }
}
