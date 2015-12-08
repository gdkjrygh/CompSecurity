// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.b;
import com.google.android.gms.maps.d;
import com.google.android.gms.maps.e;
import com.google.android.gms.maps.h;
import com.google.android.gms.maps.model.LatLng;
import com.skype.Message;
import com.skype.android.app.Navigation;
import com.skype.android.app.location.LocationUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.permission.Permission;
import com.skype.android.util.permission.PermissionHandlerAdapter;
import com.skype.android.util.permission.PermissionRequest;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.bubbles.Bubblable;
import com.skype.android.widget.bubbles.BubbleRelativeLayout;
import com.skype.android.widget.bubbles.BubbleTextView;
import java.util.concurrent.Future;

// Referenced classes of package com.skype.android.app.chat:
//            e, MessageViewAdapterComponent, MessageHolder, j, 
//            f

final class g extends com.skype.android.app.chat.e
{
    private final class a
        implements android.view.View.OnClickListener, com.google.android.gms.maps.b.c
    {

        private final j holder;
        private final Message message;
        final g this$0;

        private void onClick()
        {
            permissionRequest.a(Permission.o, true, new PermissionHandlerAdapter() {

                final a this$1;

                public final void onGranted()
                {
                    navigation.toLocation(message, holder.isOutgoing());
                }

            
            {
                this$1 = a.this;
                super();
            }
            });
        }

        public final void onClick(View view)
        {
            onClick();
        }

        public final void onMapClick(LatLng latlng)
        {
            onClick();
        }



        a(Message message1, j j1)
        {
            this$0 = g.this;
            super();
            message = message1;
            holder = j1;
        }
    }

    private final class b extends f
    {

        TextView addressView;
        com.google.android.gms.maps.b googleMap;
        BubbleRelativeLayout locationBubble;
        MapView mapView;
        ImageView pinView;
        BubbleTextView removedTextView;
        Future staticMapFuture;
        View staticMapOverlay;
        SymbolView staticMapPlaceholder;
        final g this$0;

        public b(View view)
        {
            this$0 = g.this;
            super(view);
            removedTextView = (BubbleTextView)ViewUtil.a(view, 0x7f1002b6);
            locationBubble = (BubbleRelativeLayout)ViewUtil.a(getInlineContent(), 0x7f100291);
            staticMapOverlay = ViewUtil.a(getInlineContent(), 0x7f100294);
            addressView = (TextView)ViewUtil.a(getInlineContent(), 0x7f100290);
            staticMapPlaceholder = (SymbolView)ViewUtil.a(getInlineContent(), 0x7f100297);
            pinView = (ImageView)ViewUtil.a(getInlineContent(), 0x7f100296);
            mapView = (MapView)ViewUtil.a(getInlineContent(), 0x7f100293);
            mapView.a();
        }
    }


    private static final int LAT_LONG_PRECISION = 0xf4240;
    private static final int supportedMessageTypes[];
    ConversationUtil conversationUtil;
    ImageCache imageCache;
    private final LocationUtil locationUtil = new LocationUtil();
    Navigation navigation;
    PermissionRequest permissionRequest;

    public g(Activity activity)
    {
        super(activity);
        getComponent().inject(this);
    }

    private void displayLocationPlaceholder(b b1)
    {
        b1.mapView.setVisibility(8);
        b1.staticMapOverlay.setVisibility(8);
        b1.staticMapPlaceholder.setVisibility(0);
        b1.pinView.setVisibility(8);
    }

    private void displayStaticMap(b b1)
    {
        b1.mapView.setVisibility(0);
        b1.staticMapOverlay.setVisibility(0);
        b1.staticMapPlaceholder.setVisibility(8);
        if (b1.isOutgoing())
        {
            b1.pinView.setImageResource(0x7f0201d6);
        } else
        {
            b1.pinView.setImageResource(0x7f0201d5);
        }
        b1.pinView.setVisibility(0);
    }

    protected final void bindContentView(j j1, final MessageHolder clickListener)
    {
        final b holder = (b)j1;
        Message message = (Message)clickListener.getMessageObject();
        if (holder.staticMapFuture != null)
        {
            holder.staticMapFuture.cancel(true);
        }
        byte byte0;
        if (TextUtils.isEmpty(clickListener.getTextContent()) && ((Message)clickListener.getMessageObject()).getEditTimestampProp() > 0)
        {
            holder.locationBubble.setVisibility(8);
            holder.removedTextView.setVisibility(0);
            holder.removedTextView.setText(conversationUtil.a());
            if (j1.isOutgoing())
            {
                holder.getInlineContent().setPadding(getContext().getResources().getDimensionPixelSize(0x7f0c0246), 0, 0, 0);
            } else
            {
                holder.getInlineContent().setPadding(0, 0, getContext().getResources().getDimensionPixelSize(0x7f0c0246), 0);
            }
            j1 = holder.removedTextView;
        } else
        {
            holder.locationBubble.setVisibility(0);
            holder.removedTextView.setVisibility(8);
            displayLocationPlaceholder(holder);
            clickListener = new a(message, j1);
            j1 = message.getLocation();
            if (((com.skype.Message.GetLocation_Result) (j1)).m_return)
            {
                final LatLng centerPoint = new LatLng((float)((com.skype.Message.GetLocation_Result) (j1)).m_latitude / 1000000F, (float)((com.skype.Message.GetLocation_Result) (j1)).m_longitude / 1000000F);
                if (holder.googleMap == null)
                {
                    holder.mapView.a(new e() {

                        final g this$0;
                        final LatLng val$centerPoint;
                        final a val$clickListener;
                        final b val$holder;

                        public final void onMapReady(com.google.android.gms.maps.b b1)
                        {
                            holder.googleMap = b1;
                            d.a(getContext());
                            b1.f().b();
                            updateMapContents(centerPoint, holder, clickListener);
                        }

            
            {
                this$0 = g.this;
                holder = b1;
                centerPoint = latlng;
                clickListener = a1;
                super();
            }
                    });
                } else
                {
                    updateMapContents(centerPoint, holder, clickListener);
                }
                holder.addressView.setText(locationUtil.getAddressString(j1, 2));
            }
            holder.getInlineContent().setPadding(0, 0, 0, 0);
            j1 = holder.locationBubble;
            holder.locationBubble.setOnClickListener(clickListener);
        }
        setOnItemLongClickListener(message, (View)j1, holder.getLayoutPosition());
        clickListener = (RelativeLayout)holder.getInlineContent();
        if (holder.isOutgoing())
        {
            byte0 = 5;
        } else
        {
            byte0 = 3;
        }
        clickListener.setGravity(byte0);
        if (holder.isOutgoing())
        {
            clickListener = com.skype.android.widget.bubbles.Bubblable.Direction.b;
        } else
        {
            clickListener = com.skype.android.widget.bubbles.Bubblable.Direction.a;
        }
        j1.setDirectionState(clickListener, holder.isChained());
    }

    protected final j createMessageViewHolder(View view)
    {
        return new b(view);
    }

    protected final int getLayoutId(int i)
    {
        return 0x7f03003e;
    }

    public final int[] getSupportedMessageTypes()
    {
        return supportedMessageTypes;
    }

    protected final void updateMapContents(LatLng latlng, b b1, a a1)
    {
        b1.googleMap.c();
        b1.googleMap.a(a1);
        latlng = CameraUpdateFactory.newLatLng(latlng);
        b1.googleMap.a(latlng);
        displayStaticMap(b1);
    }

    static 
    {
        supportedMessageTypes = (new int[] {
            com.skype.Message.TYPE.POSTED_LOCATION.toInt()
        });
    }
}
