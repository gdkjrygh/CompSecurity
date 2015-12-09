// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.Html;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.spotlets.artist.model.Image;
import com.spotify.mobile.android.spotlets.artist.view.BiographyImageView;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.HtmlUtil;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.ArrayList;

public final class eib extends eia
{

    private BiographyImageView Y;
    private TextView a;
    private BiographyImageView b;

    public eib()
    {
    }

    protected final View a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300d9, viewgroup, false);
        a = (TextView)layoutinflater.findViewById(0x7f110417);
        b = (BiographyImageView)layoutinflater.findViewById(0x7f110415);
        Y = (BiographyImageView)layoutinflater.findViewById(0x7f110416);
        return layoutinflater;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f080349);
    }

    protected final void b(ArtistModel artistmodel)
    {
        if (artistmodel.biography.b())
        {
            Spannable spannable = (Spannable)Html.fromHtml((String)artistmodel.biography.c());
            HtmlUtil.a(spannable, null);
            a.setText(spannable);
            a.setMovementMethod(LinkMovementMethod.getInstance());
        }
        artistmodel = new ArrayList(((com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ArtistGallery)artistmodel.gallery.a(com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ArtistGallery.EMPTY_GALLERY)).images);
        if (artistmodel.size() > 0)
        {
            b.a((Image)artistmodel.get(0));
            b.setVisibility(0);
        }
        if (artistmodel.size() >= 2)
        {
            Y.a((Image)artistmodel.get(1));
            Y.setVisibility(0);
        }
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.L;
    }
}
