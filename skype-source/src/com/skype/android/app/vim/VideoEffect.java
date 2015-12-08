// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.graphics.Matrix;
import com.skype.android.media.GLTextureView;
import com.skype.android.media.GLTextureViewWrapper;
import com.skype.android.media.ShaderEffect;
import com.skype.android.media.effects.FaceDecoration;
import com.skype.android.media.effects.ParticleSystemRenderer;

public final class VideoEffect extends Enum
{

    private static final VideoEffect $VALUES[];
    public static final VideoEffect BALLOONS;
    public static final VideoEffect BEARS;
    public static final VideoEffect BULGE;
    public static final VideoEffect COSTUME;
    public static final VideoEffect HALLOWEEN;
    public static final VideoEffect HEARTS;
    public static final VideoEffect KALEIDOSCOPE;
    public static final VideoEffect MIRROR;
    public static final VideoEffect NORMAL;
    public static final VideoEffect PIXELATE;
    public static final VideoEffect POSTER;
    public static final VideoEffect SNOW;
    public static final VideoEffect SQUEEZE;
    public static final VideoEffect XRAY;
    private ShaderEffect effect;
    private boolean enabled;
    private FaceDecoration faceDecoration;
    private int previewDrawableId;

    private VideoEffect(String s, int i, ShaderEffect shadereffect, int j)
    {
        this(s, i, shadereffect, null, j);
    }

    private VideoEffect(String s, int i, ShaderEffect shadereffect, FaceDecoration facedecoration, int j)
    {
        super(s, i);
        effect = shadereffect;
        faceDecoration = facedecoration;
        previewDrawableId = j;
    }

    public static VideoEffect valueOf(String s)
    {
        return (VideoEffect)Enum.valueOf(com/skype/android/app/vim/VideoEffect, s);
    }

    public static VideoEffect[] values()
    {
        return (VideoEffect[])$VALUES.clone();
    }

    public final com.skype.android.media.GLES20Renderer.Overlay createOverlay(GLTextureViewWrapper gltextureviewwrapper)
    {
        Object obj = null;
        if (this != HEARTS && this != SNOW && this != BEARS && this != BALLOONS && this != HALLOWEEN) goto _L2; else goto _L1
_L1:
        android.content.Context context;
        boolean flag;
        Matrix matrix = gltextureviewwrapper.a(null);
        obj = new float[9];
        context = gltextureviewwrapper.h().getContext();
        matrix.getValues(((float []) (obj)));
        gltextureviewwrapper = null;
        flag = true;
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$android$app$vim$VideoEffect[];

            static 
            {
                $SwitchMap$com$skype$android$app$vim$VideoEffect = new int[VideoEffect.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$vim$VideoEffect[VideoEffect.HEARTS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$android$app$vim$VideoEffect[VideoEffect.SNOW.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$app$vim$VideoEffect[VideoEffect.BALLOONS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$app$vim$VideoEffect[VideoEffect.BEARS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$vim$VideoEffect[VideoEffect.HALLOWEEN.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.skype.android.app.vim.VideoEffect[ordinal()];
        JVM INSTR tableswitch 1 5: default 112
    //                   1 172
    //                   2 184
    //                   3 218
    //                   4 240
    //                   5 255;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        gltextureviewwrapper = new ParticleSystemRenderer(context, ((float []) (obj)), gltextureviewwrapper, flag);
        obj = gltextureviewwrapper;
        switch (_cls1..SwitchMap.com.skype.android.app.vim.VideoEffect[ordinal()])
        {
        default:
            obj = gltextureviewwrapper;
            break;

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_282;

        case 2: // '\002'
            break;

        case 3: // '\003'
            break; /* Loop/switch isn't completed */

        case 4: // '\004'
            break MISSING_BLOCK_LABEL_296;

        case 5: // '\005'
            break MISSING_BLOCK_LABEL_303;
        }
_L2:
        return ((com.skype.android.media.GLES20Renderer.Overlay) (obj));
_L4:
        gltextureviewwrapper = new int[1];
        gltextureviewwrapper[0] = 0x7f070011;
        continue; /* Loop/switch isn't completed */
_L5:
        gltextureviewwrapper = new int[5];
        gltextureviewwrapper;
        gltextureviewwrapper[0] = 0x7f070012;
        gltextureviewwrapper[1] = 0x7f070013;
        gltextureviewwrapper[2] = 0x7f070014;
        gltextureviewwrapper[3] = 0x7f070015;
        gltextureviewwrapper[4] = 0x7f070016;
        continue; /* Loop/switch isn't completed */
_L6:
        gltextureviewwrapper = new int[2];
        gltextureviewwrapper;
        gltextureviewwrapper[0] = 0x7f07000e;
        gltextureviewwrapper[1] = 0x7f07000f;
        flag = false;
        continue; /* Loop/switch isn't completed */
_L7:
        gltextureviewwrapper = new int[1];
        gltextureviewwrapper[0] = 0x7f07001c;
        flag = false;
        continue; /* Loop/switch isn't completed */
_L8:
        gltextureviewwrapper = new int[1];
        gltextureviewwrapper[0] = 0x7f07001e;
        if (true) goto _L3; else goto _L9
_L9:
        gltextureviewwrapper.a(com.skype.android.media.effects.ParticleSystemRenderer.AnimationDirection.b);
        gltextureviewwrapper.a(3F);
        return gltextureviewwrapper;
        gltextureviewwrapper.a(com.skype.android.media.effects.ParticleSystemRenderer.AnimationDirection.b);
        gltextureviewwrapper.a(2.0F);
        return gltextureviewwrapper;
        gltextureviewwrapper.a(2.0F);
        return gltextureviewwrapper;
        gltextureviewwrapper.a(com.skype.android.media.effects.ParticleSystemRenderer.AnimationDirection.b);
        gltextureviewwrapper.a(2.0F);
        return gltextureviewwrapper;
    }

    public final ShaderEffect getEffect()
    {
        return effect;
    }

    public final FaceDecoration getFaceDecoration()
    {
        return faceDecoration;
    }

    public final int getPreviewDrawableId()
    {
        return previewDrawableId;
    }

    public final void setFaceDecoration(FaceDecoration facedecoration)
    {
        faceDecoration = facedecoration;
    }

    static 
    {
        NORMAL = new VideoEffect("NORMAL", 0, ShaderEffect.a, 0x7f02016d);
        BALLOONS = new VideoEffect("BALLOONS", 1, ShaderEffect.a, 0x7f020163);
        BEARS = new VideoEffect("BEARS", 2, ShaderEffect.a, 0x7f020164);
        COSTUME = new VideoEffect("COSTUME", 3, ShaderEffect.a, 0x7f02016a);
        KALEIDOSCOPE = new VideoEffect("KALEIDOSCOPE", 4, ShaderEffect.s, 0x7f020168);
        PIXELATE = new VideoEffect("PIXELATE", 5, ShaderEffect.h, 0x7f02016b);
        SQUEEZE = new VideoEffect("SQUEEZE", 6, ShaderEffect.j, 0x7f020166);
        BULGE = new VideoEffect("BULGE", 7, ShaderEffect.k, 0x7f020165);
        XRAY = new VideoEffect("XRAY", 8, ShaderEffect.f, 0x7f020172);
        POSTER = new VideoEffect("POSTER", 9, ShaderEffect.i, 0x7f02016e);
        SNOW = new VideoEffect("SNOW", 10, ShaderEffect.c, 0x7f020171);
        MIRROR = new VideoEffect("MIRROR", 11, ShaderEffect.q, 0x7f02016c);
        HEARTS = new VideoEffect("HEARTS", 12, ShaderEffect.a, 0x7f020169);
        HALLOWEEN = new VideoEffect("HALLOWEEN", 13, ShaderEffect.a, 0x7f020167);
        $VALUES = (new VideoEffect[] {
            NORMAL, BALLOONS, BEARS, COSTUME, KALEIDOSCOPE, PIXELATE, SQUEEZE, BULGE, XRAY, POSTER, 
            SNOW, MIRROR, HEARTS, HALLOWEEN
        });
    }
}
