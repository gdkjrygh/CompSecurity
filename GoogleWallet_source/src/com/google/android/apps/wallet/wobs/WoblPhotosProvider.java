// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.content.Context;
import android.database.MatrixCursor;
import android.net.Uri;
import android.support.v4.content.Loader;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.wobs.list.LayoutMatcher;
import com.google.android.apps.wallet.wobs.provider.WobUpdateEvent;
import com.google.android.apps.wallet.wobs.wobl.protorenderer.ProtoWoblRenderer;
import com.google.commerce.wobs.common.Entrypoint;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.wallet.wobl.exception.WoblMalformedDocException;
import com.google.wallet.wobl.exception.WoblParserException;
import com.google.wallet.wobl.intermediaterepresentation.ImageIr;
import com.google.wallet.wobl.intermediaterepresentation.IrUtil;
import com.google.wallet.wobl.parser.WoblParser;
import java.net.URI;
import java.util.Iterator;
import java.util.List;

class WoblPhotosProvider extends Loader
    implements EventHandler
{

    private static final String AUTHORITY = com/google/android/apps/wallet/wobs/WoblPhotosProvider.getName();
    public static final Predicate IMAGE_WIDGET = new Predicate() {

        private static boolean apply(com.google.wallet.proto.NanoCompiledWobl.Widget widget)
        {
            return widget.imageWidget != null;
        }

        public final volatile boolean apply(Object obj)
        {
            return apply((com.google.wallet.proto.NanoCompiledWobl.Widget)obj);
        }

    };
    private final EventBus eventBus;
    private final FeatureManager featureManager;
    private final LayoutMatcher layoutMatcher;
    private final String wobInstanceId;
    private final WoblParser woblParser;

    WoblPhotosProvider(Context context, EventBus eventbus, LayoutMatcher layoutmatcher, WoblParser woblparser, FeatureManager featuremanager, String s)
    {
        super(context);
        eventBus = eventbus;
        layoutMatcher = layoutmatcher;
        woblParser = woblparser;
        featureManager = featuremanager;
        wobInstanceId = s;
    }

    static String buildPhotoUri(String s)
    {
        android.net.Uri.Builder builder = (new android.net.Uri.Builder()).scheme("content").authority(AUTHORITY);
        String s1 = String.valueOf("woblphoto/");
        int i = s.hashCode();
        return builder.path((new StringBuilder(String.valueOf(s1).length() + 11)).append(s1).append(i).toString()).build().toString();
    }

    private List extractFullscreenImageUris(com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance)
    {
        Object obj;
        obj = layoutMatcher.getLayoutForEntrypoint(wobinstance.renderOutput, new String[] {
            Entrypoint.EXPANDED.toString()
        });
        wobinstance = Lists.newArrayList();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        if (featureManager.isFeatureEnabled(Feature.WOBL_PROTO))
        {
            if (((com.google.wallet.proto.NanoWalletWobl.Layout) (obj)).compiledWobl != null)
            {
                obj = ProtoWoblRenderer.findWidgets(((com.google.wallet.proto.NanoWalletWobl.Layout) (obj)).compiledWobl, IMAGE_WIDGET).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    String s = getFullScreenImageUriSource((com.google.wallet.proto.NanoCompiledWobl.Widget)((Iterator) (obj)).next());
                    if (s != null)
                    {
                        wobinstance.add(s);
                    }
                } while (true);
            }
            break MISSING_BLOCK_LABEL_173;
        }
        if (((com.google.wallet.proto.NanoWalletWobl.Layout) (obj)).wobl == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        obj = IrUtil.findElements(woblParser.parseWobl(((com.google.wallet.proto.NanoWalletWobl.Layout) (obj)).wobl), com/google/wallet/wobl/intermediaterepresentation/ImageIr).iterator();
_L2:
        String s1;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_173;
            }
            s1 = getFullScreenImageUriSource((ImageIr)((Iterator) (obj)).next());
        } while (s1 == null);
        wobinstance.add(s1);
        if (true) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1;
        return wobinstance;
        obj1;
        return wobinstance;
    }

    private static String getFullScreenImageUriSource(com.google.wallet.proto.NanoCompiledWobl.Widget widget)
    {
        Preconditions.checkNotNull(widget);
        Preconditions.checkNotNull(widget.imageWidget);
        widget = widget.imageWidget;
        if (((com.google.wallet.proto.NanoCompiledWobl.ImageWidget) (widget)).widgetAttributes.tapUri != null)
        {
            widget = ((com.google.wallet.proto.NanoCompiledWobl.ImageWidget) (widget)).widgetAttributes.tapUri;
            int j = widget.length;
            for (int i = 0; i < j; i++)
            {
                Uri uri = Uri.parse(((com.google.wallet.proto.NanoCompiledWobl.TapUri) (widget[i])).tapUri);
                if (isFullscreenImageUri(uri))
                {
                    return uri.getQueryParameter("src");
                }
            }

        }
        return null;
    }

    private static String getFullScreenImageUriSource(ImageIr imageir)
    {
        for (imageir = imageir.getTapUris().iterator(); imageir.hasNext();)
        {
            Uri uri = Uri.parse(((URI)imageir.next()).toString());
            if (isFullscreenImageUri(uri))
            {
                return uri.getQueryParameter("src");
            }
        }

        return null;
    }

    private void handleEvent(WobUpdateEvent wobupdateevent)
    {
        eventBus.unregisterAll(this);
        MatrixCursor matrixcursor = new MatrixCursor(com.android.ex.photo.provider.PhotoContract.PhotoQuery.PROJECTION);
        if (!wobupdateevent.hasError())
        {
            String s;
            for (wobupdateevent = extractFullscreenImageUris(wobupdateevent.getWobInstance()).iterator(); wobupdateevent.hasNext(); matrixcursor.newRow().add(buildPhotoUri(s)).add("").add(s).add("").add("image/jpg"))
            {
                s = (String)wobupdateevent.next();
            }

        }
        if (matrixcursor.getCount() == 0)
        {
            wobupdateevent = String.valueOf(getContext().getPackageName());
            int i = com.google.android.apps.walletnfcrel.R.drawable.img_wob_missing;
            wobupdateevent = (new StringBuilder(String.valueOf(wobupdateevent).length() + 31)).append("android.resource://").append(wobupdateevent).append("/").append(i).toString();
            matrixcursor.newRow().add(buildPhotoUri(wobupdateevent)).add("").add(wobupdateevent).add("").add("image/png");
        }
        deliverResult(matrixcursor);
    }

    private static boolean isFullscreenImageUri(Uri uri)
    {
        if (uri.getScheme().equals("comgooglewallet") && uri.getPath() != null)
        {
            uri = uri.getPathSegments();
            return uri.size() == 5 && ((String)uri.get(0)).equals("objects") && ((String)uri.get(1)).equals("instance") && ((String)uri.get(3)).equals("fullscreen") && ((String)uri.get(4)).equals("image");
        } else
        {
            return false;
        }
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((WobUpdateEvent)obj);
    }

    protected final void onAbandon()
    {
        eventBus.unregisterAll(this);
    }

    protected final void onStartLoading()
    {
        eventBus.register(this, com/google/android/apps/wallet/wobs/provider/WobUpdateEvent, wobInstanceId, this);
    }

}
