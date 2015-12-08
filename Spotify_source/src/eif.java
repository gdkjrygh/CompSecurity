// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.spotlets.artist.model.Image;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.squareup.picasso.Picasso;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

public final class eif extends eie
{

    private ImageView ab;
    private TextView ac;
    private Button ad;
    private ImageView ae;
    private TextView af;
    private TextView ag;
    private TextView ah;
    private Button ai;
    private TextView aj;
    private TextView ak;
    private ImageView al;
    private int am;
    private final SimpleDateFormat an = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
    private final SimpleDateFormat ao = new SimpleDateFormat("cccc dd MMMM yyyy", Locale.getDefault());

    public eif()
    {
    }

    static String a(com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Concert concert)
    {
        return b(concert);
    }

    private static String b(com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Concert concert)
    {
        try
        {
            concert = URLEncoder.encode((new StringBuilder()).append(concert.venue).append(", ").append(concert.city).toString(), "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Concert concert)
        {
            throw new AssertionError();
        }
        return concert;
    }

    protected final View H()
    {
        View view = LayoutInflater.from(k()).inflate(0x7f0300da, null);
        ac = (TextView)view.findViewById(0x7f110418);
        ab = (ImageView)view.findViewById(0x7f11026a);
        ad = (Button)view.findViewById(0x7f11041a);
        ae = (ImageView)view.findViewById(0x7f11041b);
        af = (TextView)view.findViewById(0x7f11041c);
        ag = (TextView)view.findViewById(0x7f11041d);
        ah = (TextView)view.findViewById(0x7f11041e);
        ai = (Button)view.findViewById(0x7f11041f);
        aj = (TextView)view.findViewById(0x7f110420);
        ak = (TextView)view.findViewById(0x7f110421);
        al = (ImageView)view.findViewById(0x7f110422);
        return view;
    }

    public final String I()
    {
        return (new StringBuilder("concert:")).append(super.a).toString();
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f080351);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        am = g().getInt("concert_id");
    }

    protected final void a(ArtistModel artistmodel)
    {
        com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Concert concert = (com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Concert)artistmodel.upcomingConcerts.get(am);
        Object obj;
        String s;
        try
        {
            java.util.Date date = an.parse(concert.localtime);
            dsu.a(ae).a(date, Locale.getDefault());
            ag.setText(ao.format(date));
        }
        catch (ParseException parseexception)
        {
            Logger.a(parseexception, "Failed to parse date [%s] with formatter [%s]", new Object[] {
                concert.localtime, an
            });
            ag.setText("");
        }
        obj = artistmodel.getInfoSafe().portraits;
        if (((List) (obj)).size() > 0)
        {
            aa.c(ab, ((Image)((List) (obj)).get(0)).uri);
        }
        obj = artistmodel.getInfoSafe().name;
        ac.setText(((CharSequence) (obj)));
        ad.setText(((String) (obj)).toUpperCase(Locale.getDefault()));
        af.setText(concert.title);
        ah.setText((new StringBuilder()).append(concert.venue).append(", ").append(concert.city).toString());
        aj.setText(concert.venue);
        ak.setText(concert.city);
        ((fpe)k()).a(this, (new StringBuilder()).append(((String) (obj))).append(" ").append(k().getString(0x7f080351)).toString());
        obj = ((gft)dmz.a(gft)).a();
        s = b(concert);
        ((Picasso) (obj)).a((new StringBuilder("http://maps.googleapis.com/maps/api/staticmap?center=")).append(s).append("&zoom=13&scale=2&size=600x300&maptype=roadmap&sensor=false&markers=color:red%7C").append(s).toString()).a(al, null);
        al.setOnClickListener(new android.view.View.OnClickListener(concert) {

            private com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Concert a;
            private eif b;

            public final void onClick(View view)
            {
                view = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("http://maps.google.com/maps?q=loc:")).append(eif.a(a)).toString()));
                b.a(view);
            }

            
            {
                b = eif.this;
                a = concert;
                super();
            }
        });
        ai.setOnClickListener(new android.view.View.OnClickListener(concert) {

            private com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Concert a;
            private eif b;

            public final void onClick(View view)
            {
                view = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("http://www.songkick.com/concerts/")).append(a.appUri.substring(21)).toString()));
                b.a(view);
            }

            
            {
                b = eif.this;
                a = concert;
                super();
            }
        });
        ad.setOnClickListener(new android.view.View.OnClickListener(artistmodel) {

            private ArtistModel a;
            private eif b;

            public final void onClick(View view)
            {
                b.a(gms.a(b.k(), a.uri).a);
            }

            
            {
                b = eif.this;
                a = artistmodel;
                super();
            }
        });
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.M;
    }
}
