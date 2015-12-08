// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.gesture.Gesture;
import android.gesture.GestureLibraries;
import android.gesture.GestureLibrary;
import android.gesture.GestureOverlayView;
import android.gesture.Prediction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.skype.android.SkypeApplication;
import com.skype.android.SkypeFragment;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.app.NavigationUrl;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.skype.android.app.settings:
//            AboutCreditsFragment, AttributionsFragment

public class AboutFragment extends SkypeFragment
{
    final class a
    {

        private GestureLibrary gestureLib;
        final AboutFragment this$0;

        public final View getView(View view)
        {
            GestureOverlayView gestureoverlayview = new GestureOverlayView(view.getContext());
            gestureoverlayview.addView(view);
            gestureoverlayview.setGestureVisible(false);
            gestureoverlayview.addOnGesturePerformedListener(new android.gesture.GestureOverlayView.OnGesturePerformedListener() {

                final a this$1;

                public final void onGesturePerformed(GestureOverlayView gestureoverlayview, Gesture gesture)
                {
                    gestureoverlayview = gestureLib.recognize(gesture).iterator();
                    do
                    {
                        if (!gestureoverlayview.hasNext())
                        {
                            break;
                        }
                        if (((Prediction)gestureoverlayview.next()).score > 2D)
                        {
                            gesture = getFragmentManager().a();
                            gesture.a(0x1020002, new AboutCreditsFragment());
                            gesture.a(com/skype/android/app/settings/AboutCreditsFragment.getName());
                            gesture.a();
                        }
                    } while (true);
                }

            
            {
                this$1 = a.this;
                super();
            }
            });
            gestureLib = GestureLibraries.fromRawResource(view.getContext(), 0x7f07001d);
            gestureLib.load();
            return gestureoverlayview;
        }


        a()
        {
            this$0 = AboutFragment.this;
            super();
        }
    }


    NavigationUrl navigationUrl;
    TextView privacyPolicy;
    TextView termsOfUse;
    TextView thirdParty;
    TextView version;

    public AboutFragment()
    {
    }

    private void showUrl(com.skype.android.res.Urls.Type type)
    {
        navigationUrl.goToUrl(getActivity(), type);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return (new a()).getView(layoutinflater.inflate(0x7f030018, viewgroup, false));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = (SkypeApplication)getActivity().getApplication();
        version.append((new StringBuilder(" ")).append(view.e()).toString());
        view = new SpannableString(getString(0x7f08027f));
        view.setSpan(new UnderlineSpan(), 0, view.length(), 0);
        termsOfUse.setText(view);
        termsOfUse.setOnClickListener(new android.view.View.OnClickListener() {

            final AboutFragment this$0;

            public final void onClick(View view1)
            {
                showUrl(com.skype.android.res.Urls.Type.s);
            }

            
            {
                this$0 = AboutFragment.this;
                super();
            }
        });
        view = new SpannableString(getString(0x7f080166));
        view.setSpan(new UnderlineSpan(), 0, view.length(), 0);
        privacyPolicy.setText(view);
        privacyPolicy.setOnClickListener(new android.view.View.OnClickListener() {

            final AboutFragment this$0;

            public final void onClick(View view1)
            {
                showUrl(com.skype.android.res.Urls.Type.t);
            }

            
            {
                this$0 = AboutFragment.this;
                super();
            }
        });
        view = new SpannableString(getString(0x7f080193));
        view.setSpan(new UnderlineSpan(), 0, view.length(), 0);
        thirdParty.setText(view);
        thirdParty.setOnClickListener(new android.view.View.OnClickListener() {

            final AboutFragment this$0;

            public final void onClick(View view1)
            {
                view1 = getFragmentManager().a();
                view1.a(0x7f100006, new AttributionsFragment());
                view1.a("tps");
                view1.a();
            }

            
            {
                this$0 = AboutFragment.this;
                super();
            }
        });
    }

}
