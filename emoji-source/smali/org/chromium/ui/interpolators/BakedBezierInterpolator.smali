.class public Lorg/chromium/ui/interpolators/BakedBezierInterpolator;
.super Ljava/lang/Object;
.source "BakedBezierInterpolator.java"

# interfaces
.implements Landroid/view/animation/Interpolator;


# static fields
.field public static final FADE_IN_CURVE:Lorg/chromium/ui/interpolators/BakedBezierInterpolator;

.field private static final FADE_IN_VALUES:[F

.field public static final FADE_OUT_CURVE:Lorg/chromium/ui/interpolators/BakedBezierInterpolator;

.field private static final FADE_OUT_VALUES:[F

.field public static final TRANSFORM_CURVE:Lorg/chromium/ui/interpolators/BakedBezierInterpolator;

.field public static final TRANSFORM_FOLLOW_THROUGH_CURVE:Lorg/chromium/ui/interpolators/BakedBezierInterpolator;

.field private static final TRANSFORM_FOLLOW_THROUGH_VALUES:[F

.field private static final TRANSFORM_VALUES:[F


# instance fields
.field private final mStepSize:F

.field private final mValues:[F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/16 v1, 0x65

    .line 25
    new-array v0, v1, [F

    fill-array-data v0, :array_0

    sput-object v0, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;->TRANSFORM_VALUES:[F

    .line 48
    new-array v0, v1, [F

    fill-array-data v0, :array_1

    sput-object v0, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;->FADE_OUT_VALUES:[F

    .line 71
    new-array v0, v1, [F

    fill-array-data v0, :array_2

    sput-object v0, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;->FADE_IN_VALUES:[F

    .line 92
    new-array v0, v1, [F

    fill-array-data v0, :array_3

    sput-object v0, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;->TRANSFORM_FOLLOW_THROUGH_VALUES:[F

    .line 109
    new-instance v0, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;

    sget-object v1, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;->TRANSFORM_VALUES:[F

    invoke-direct {v0, v1}, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;-><init>([F)V

    sput-object v0, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;->TRANSFORM_CURVE:Lorg/chromium/ui/interpolators/BakedBezierInterpolator;

    .line 115
    new-instance v0, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;

    sget-object v1, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;->FADE_OUT_VALUES:[F

    invoke-direct {v0, v1}, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;-><init>([F)V

    sput-object v0, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;->FADE_OUT_CURVE:Lorg/chromium/ui/interpolators/BakedBezierInterpolator;

    .line 121
    new-instance v0, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;

    sget-object v1, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;->FADE_IN_VALUES:[F

    invoke-direct {v0, v1}, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;-><init>([F)V

    sput-object v0, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;->FADE_IN_CURVE:Lorg/chromium/ui/interpolators/BakedBezierInterpolator;

    .line 127
    new-instance v0, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;

    sget-object v1, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;->TRANSFORM_FOLLOW_THROUGH_VALUES:[F

    invoke-direct {v0, v1}, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;-><init>([F)V

    sput-object v0, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;->TRANSFORM_FOLLOW_THROUGH_CURVE:Lorg/chromium/ui/interpolators/BakedBezierInterpolator;

    return-void

    .line 25
    nop

    :array_0
    .array-data 4
        0x0
        0x3951b717    # 2.0E-4f
        0x3a6bedfa    # 9.0E-4f
        0x3af9096c    # 0.0019f
        0x3b6bedfa    # 0.0036f
        0x3bc154ca    # 0.0059f
        0x3c0ce704    # 0.0086f
        0x3c42f838    # 0.0119f
        0x3c809d49    # 0.0157f
        0x3cab367a    # 0.0209f
        0x3cd288ce    # 0.0257f
        0x3d037b4a
        0x3d20902e    # 0.0392f
        0x3d401a37    # 0.0469f
        0x3d67d567    # 0.0566f
        0x3d86594b    # 0.0656f
        0x3d9d4952    # 0.0768f
        0x3db5a858    # 0.0887f
        0x3dd38ef3    # 0.1033f
        0x3df2e48f    # 0.1186f
        0x3e0a233a    # 0.1349f
        0x3e1b8bac    # 0.1519f
        0x3e2dab9f    # 0.1696f
        0x3e456d5d    # 0.1928f
        0x3e5930be    # 0.2121f
        0x3e72b021    # 0.237f
        0x3e86809d    # 0.2627f
        0x3e941206    # 0.2892f
        0x3e9f2e49    # 0.3109f
        0x3ead5cfb    # 0.3386f
        0x3ebbc01a    # 0.3667f
        0x3eca57a8    # 0.3952f
        0x3ed923a3    # 0.4241f
        0x3ee5119d    # 0.4474f
        0x3ef404ea    # 0.4766f
        0x3f000000    # 0.5f
        0x3f05fd8b    # 0.5234f
        0x3f0bfb16    # 0.5468f
        0x3f11f213    # 0.5701f
        0x3f17e282    # 0.5933f
        0x3f1d07c8    # 0.6134f
        0x3f221ff3    # 0.6333f
        0x3f273190    # 0.6531f
        0x3f2b7803    # 0.6698f
        0x3f3068dc    # 0.6891f
        0x3f349518    # 0.7054f
        0x3f38adac    # 0.7214f
        0x3f3c0ebf    # 0.7346f
        0x3f400d1b    # 0.7502f
        0x3f4353f8    # 0.763f
        0x3f468db9    # 0.7756f
        0x3f49b3d0    # 0.7879f
        0x3f4ccccd    # 0.8f
        0x3f4f8a09    # 0.8107f
        0x3f523a2a    # 0.8212f
        0x3f552546    # 0.8326f
        0x3f576c8b    # 0.8415f
        0x3f59ad43    # 0.8503f
        0x3f5bda51    # 0.8588f
        0x3f5e00d2    # 0.8672f
        0x3f601a37    # 0.8754f
        0x3f621ff3    # 0.8833f
        0x3f641f21    # 0.8911f
        0x3f65cfab    # 0.8977f
        0x3f677319    # 0.9041f
        0x3f694af5    # 0.9113f
        0x3f6a9fbe    # 0.9165f
        0x3f6c56d6    # 0.9232f
        0x3f6d97f6    # 0.9281f
        0x3f6ecbfb    # 0.9328f
        0x3f702de0    # 0.9382f
        0x3f7182aa    # 0.9434f
        0x3f7295ea    # 0.9476f
        0x3f73a92a    # 0.9518f
        0x3f74a8c1    # 0.9557f
        0x3f75a858    # 0.9596f
        0x3f769446    # 0.9632f
        0x3f7758e2    # 0.9662f
        0x3f783127    # 0.9695f
        0x3f78e219    # 0.9722f
        0x3f79ad43    # 0.9753f
        0x3f7a4a8c    # 0.9777f
        0x3f7b020c    # 0.9805f
        0x3f7b8bac    # 0.9826f
        0x3f7c154d    # 0.9847f
        0x3f7c91d1    # 0.9866f
        0x3f7d07c8    # 0.9884f
        0x3f7d7732    # 0.9901f
        0x3f7de00d    # 0.9917f
        0x3f7e3bcd    # 0.9931f
        0x3f7e9100    # 0.9944f
        0x3f7ed917    # 0.9955f
        0x3f7f1412    # 0.9964f
        0x3f7f4f0e    # 0.9973f
        0x3f7f837b    # 0.9981f
        0x3f7fa440    # 0.9986f
        0x3f7fcb92    # 0.9992f
        0x3f7fdf3b    # 0.9995f
        0x3f7ff2e5    # 0.9998f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    .line 48
    :array_1
    .array-data 4
        0x0
        0x3951b717    # 2.0E-4f
        0x3a51b717    # 8.0E-4f
        0x3af9096c    # 0.0019f
        0x3b51b717    # 0.0032f
        0x3ba0902e    # 0.0049f
        0x3be21965    # 0.0069f
        0x3c185f07    # 0.0093f
        0x3c42f838    # 0.0119f
        0x3c741f21    # 0.0149f
        0x3c95182b    # 0.0182f
        0x3cb295ea    # 0.0218f
        0x3cd288ce    # 0.0257f
        0x3cf4f0d8    # 0.0299f
        0x3d0ce704    # 0.0344f
        0x3d20902e    # 0.0392f
        0x3d3573eb    # 0.0443f
        0x3d4b295f    # 0.0496f
        0x3d621965    # 0.0552f
        0x3d76fd22    # 0.0603f
        0x3d86594b    # 0.0656f
        0x3d93404f    # 0.0719f
        0x3da0c49c    # 0.0785f
        0x3daeb1c4    # 0.0853f
        0x3dbd07c8    # 0.0923f
        0x3dc9eecc    # 0.0986f
        0x3dd73eab    # 0.1051f
        0x3de703b0    # 0.1128f
        0x3df6fd22    # 0.1206f
        0x3e03c9ef    # 0.1287f
        0x3e0b295f    # 0.1359f
        0x3e12bd3c    # 0.1433f
        0x3e1b8bac    # 0.1519f
        0x3e248e8a    # 0.1607f
        0x3e2dab9f    # 0.1696f
        0x3e35dcc6    # 0.1776f
        0x3e3e2824    # 0.1857f
        0x3e47e282    # 0.1952f
        0x3e51b717    # 0.2048f
        0x3e5ba5e3    # 0.2145f
        0x3e648e8a    # 0.2232f
        0x3e6d7732    # 0.2319f
        0x3e77e910    # 0.2421f
        0x3e812d77    # 0.2523f
        0x3e86809d    # 0.2627f
        0x3e8bedfa    # 0.2733f
        0x3e90b0f2    # 0.2826f
        0x3e9573eb    # 0.2919f
        0x3e9afb7f    # 0.3027f
        0x3ea09d49    # 0.3137f
        0x3ea63f14    # 0.3247f
        0x3eabedfa    # 0.3358f
        0x3eb19ce0    # 0.3469f
        0x3eb765fe    # 0.3582f
        0x3ebd2f1b    # 0.3695f
        0x3ec30553    # 0.3809f
        0x3ec8e8a7    # 0.3924f
        0x3ececbfb    # 0.4039f
        0x3ed4af4f    # 0.4154f
        0x3eda9fbe    # 0.427f
        0x3ee0902e    # 0.4386f
        0x3ee68db9    # 0.4503f
        0x3eec7e28    # 0.4619f
        0x3ef3404f    # 0.4751f
        0x3efa0275    # 0.4883f
        0x3f000000    # 0.5f
        0x3f02fec5    # 0.5117f
        0x3f06c227    # 0.5264f
        0x3f09c0ec    # 0.5381f
        0x3f0cb924    # 0.5497f
        0x3f1075f7    # 0.5643f
        0x3f136e2f    # 0.5759f
        0x3f172474    # 0.5904f
        0x3f1a71de    # 0.6033f
        0x3f1dbf48    # 0.6162f
        0x3f216873    # 0.6305f
        0x3f250481    # 0.6446f
        0x3f28a090    # 0.6587f
        0x3f2b7803    # 0.6698f
        0x3f2f0069    # 0.6836f
        0x3f333333    # 0.7f
        0x3f36a162    # 0.7134f
        0x3f3a0903    # 0.7267f
        0x3f3e147b    # 0.7425f
        0x3f4161e5    # 0.7554f
        0x3f45460b    # 0.7706f
        0x3f491687    # 0.7855f
        0x3f4ccccd    # 0.8f
        0x3f5075f7    # 0.8143f
        0x3f53fe5d    # 0.8281f
        0x3f580347    # 0.8438f
        0x3f5bda51    # 0.8588f
        0x3f5f9097    # 0.8733f
        0x3f63a29c    # 0.8892f
        0x3f677319    # 0.9041f
        0x3f6be76d    # 0.9215f
        0x3f6f34d7    # 0.9344f
        0x3f73a92a    # 0.9518f
        0x3f7779a7    # 0.9667f
        0x3f7b8bac    # 0.9826f
        0x3f7fd220    # 0.9993f
    .end array-data

    .line 71
    :array_2
    .array-data 4
        0x3b3e0ded    # 0.0029f
        0x3d3020c5    # 0.043f
        0x3da0c49c    # 0.0785f
        0x3deae7d5    # 0.1147f
        0x3e172474    # 0.1476f
        0x3e32617c    # 0.1742f
        0x3e4f41f2    # 0.2024f
        0x3e6d7732    # 0.2319f
        0x3e83d70a    # 0.2575f
        0x3e8ea4a9    # 0.2786f
        0x3e9c6a7f    # 0.3055f
        0x3ea7a0f9    # 0.3274f
        0x3eb318fc    # 0.3498f
        0x3ebd2f1b    # 0.3695f
        0x3ec76c8b    # 0.3895f
        0x3ed1b717    # 0.4096f
        0x3edc1bda    # 0.4299f
        0x3ee5119d    # 0.4474f
        0x3eee075f    # 0.4649f
        0x3ef6fd22    # 0.4824f
        0x3f000000    # 0.5f
        0x3f04816f    # 0.5176f
        0x3f083e42    # 0.5322f
        0x3f0bfb16    # 0.5468f
        0x3f1075f7    # 0.5643f
        0x3f142c3d    # 0.5788f
        0x3f178034    # 0.5918f
        0x3f1ad42c    # 0.6048f
        0x3f1e7d56    # 0.6191f
        0x3f221ff3    # 0.6333f
        0x3f250481    # 0.6446f
        0x3f2844d0    # 0.6573f
        0x3f2b7803    # 0.6698f
        0x3f2e48e9    # 0.6808f
        0x3f3119ce    # 0.6918f
        0x3f343958    # 0.704f
        0x3f36fd22    # 0.7148f
        0x3f39b3d0    # 0.7254f
        0x3f3c0ebf    # 0.7346f
        0x3f3ebee0    # 0.7451f
        0x3f4161e5    # 0.7554f
        0x3f43f7cf    # 0.7655f
        0x3f45e9e2    # 0.7731f
        0x3f4872b0    # 0.783f
        0x3f4aa64c    # 0.7916f
        0x3f4ccccd    # 0.8f
        0x3f4ef34d    # 0.8084f
        0x3f510cb3    # 0.8166f
        0x3f52d0e5    # 0.8235f
        0x3f54dd2f    # 0.8315f
        0x3f56dc5d    # 0.8393f
        0x3f588ce7    # 0.8459f
        0x3f5a7efa    # 0.8535f
        0x3f5c2268    # 0.8599f
        0x3f5e00d2    # 0.8672f
        0x3f5f9097    # 0.8733f
        0x3f61205c    # 0.8794f
        0x3f62a305    # 0.8853f
        0x3f641f21    # 0.8911f
        0x3f658e22    # 0.8967f
        0x3f66fd22    # 0.9023f
        0x3f685f07    # 0.9077f
        0x3f697f63    # 0.9121f
        0x3f6ad42c    # 0.9173f
        0x3f6c2268    # 0.9224f
        0x3f6d2f1b    # 0.9265f
        0x3f6e69ad    # 0.9313f
        0x3f6f6944    # 0.9352f
        0x3f70902e    # 0.9397f
        0x3f7182aa    # 0.9434f
        0x3f7295ea    # 0.9476f
        0x3f737b4a    # 0.9511f
        0x3f74538f    # 0.9544f
        0x3f752bd4    # 0.9577f
        0x3f761e4f    # 0.9614f
        0x3f76e2eb    # 0.9644f
        0x3f77a0f9    # 0.9673f
        0x3f785879    # 0.9701f
        0x3f7902de    # 0.9727f
        0x3f79ad43    # 0.9753f
        0x3f7a4a8c    # 0.9777f
        0x3f7ae148    # 0.98f
        0x3f7b573f    # 0.9818f
        0x3f7be0df    # 0.9839f
        0x3f7c63f1    # 0.9859f
        0x3f7cd9e8    # 0.9877f
        0x3f7d35a8    # 0.9891f
        0x3f7d9e84    # 0.9907f
        0x3f7e00d2    # 0.9922f
        0x3f7e48e9    # 0.9933f
        0x3f7e9e1b    # 0.9946f
        0x3f7ee632    # 0.9957f
        0x3f7f212d    # 0.9966f
        0x3f7f559b    # 0.9974f
        0x3f7f837b    # 0.9981f
        0x3f7fa440    # 0.9986f
        0x3f7fcb92    # 0.9992f
        0x3f7fdf3b    # 0.9995f
        0x3f7ff2e5    # 0.9998f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    .line 92
    :array_3
    .array-data 4
        0x3d9d14e4    # 0.0767f
        0x3ea147ae    # 0.315f
        0x3ed5a858    # 0.4173f
        0x3ef7ced9    # 0.484f
        0x3f0a233a    # 0.5396f
        0x3f14816f    # 0.5801f
        0x3f1ce704    # 0.6129f
        0x3f24dd2f    # 0.644f
        0x3f2b2fec    # 0.6687f
        0x3f30068e    # 0.6876f
        0x3f35cfab    # 0.7102f
        0x3f3a43fe    # 0.7276f
        0x3f3e8a72    # 0.7443f
        0x3f421ff3    # 0.7583f
        0x3f4594af    # 0.7718f
        0x3f48ef35    # 0.7849f
        0x3f4c28f6    # 0.7975f
        0x3f4ed289    # 0.8079f
        0x3f5161e5    # 0.8179f
        0x3f53dd98    # 0.8276f
        0x3f55e354    # 0.8355f
        0x3f5837b5    # 0.8446f
        0x3f5a161e    # 0.8519f
        0x3f5be76d    # 0.859f
        0x3f5dab9f    # 0.8659f
        0x3f5f62b7    # 0.8726f
        0x3f610cb3    # 0.8791f
        0x3f625461    # 0.8841f
        0x3f63e426    # 0.8902f
        0x3f65182b    # 0.8949f
        0x3f666cf4    # 0.9001f
        0x3f67b4a2    # 0.9051f
        0x3f68ce70    # 0.9094f
        0x3f69e1b1    # 0.9136f
        0x3f6aee63    # 0.9177f
        0x3f6bf488    # 0.9217f
        0x3f6ccccd    # 0.925f
        0x3f6da512    # 0.9283f
        0x3f6e9100    # 0.9319f
        0x3f6f7cee    # 0.9355f
        0x3f7020c5    # 0.938f
        0x3f70f909    # 0.9413f
        0x3f719653    # 0.9437f
        0x3f72680a    # 0.9469f
        0x3f72f838    # 0.9491f
        0x3f73a29c    # 0.9517f
        0x3f7432ca    # 0.9539f
        0x3f74d014    # 0.9563f
        0x3f755326    # 0.9583f
        0x3f75d639    # 0.9603f
        0x3f7652bd    # 0.9622f
        0x3f76dc5d    # 0.9643f
        0x3f775254    # 0.9661f
        0x3f77c84b    # 0.9679f
        0x3f78240b    # 0.9693f
        0x3f788ce7    # 0.9709f
        0x3f78f5c3    # 0.9725f
        0x3f795810    # 0.974f
        0x3f79ad43    # 0.9753f
        0x3f7a0903    # 0.9767f
        0x3f7a57a8    # 0.9779f
        0x3f7aacda    # 0.9792f
        0x3f7af4f1    # 0.9803f
        0x3f7b4a23    # 0.9816f
        0x3f7b8bac    # 0.9826f
        0x3f7bc6a8    # 0.9835f
        0x3f7c0831    # 0.9845f
        0x3f7c432d    # 0.9854f
        0x3f7c7e28    # 0.9863f
        0x3f7cb924    # 0.9872f
        0x3f7ced91    # 0.988f
        0x3f7d21ff    # 0.9888f
        0x3f7d4fdf    # 0.9895f
        0x3f7d844d    # 0.9903f
        0x3f7db22d    # 0.991f
        0x3f7de00d    # 0.9917f
        0x3f7e00d2    # 0.9922f
        0x3f7e2824    # 0.9928f
        0x3f7e4f76    # 0.9934f
        0x3f7e703b    # 0.9939f
        0x3f7e9100    # 0.9944f
        0x3f7eab36    # 0.9948f
        0x3f7ecbfb    # 0.9953f
        0x3f7ee632    # 0.9957f
        0x3f7f06f7    # 0.9962f
        0x3f7f1aa0    # 0.9965f
        0x3f7f34d7    # 0.9969f
        0x3f7f4880    # 0.9972f
        0x3f7f5c29    # 0.9975f
        0x3f7f6fd2    # 0.9978f
        0x3f7f837b    # 0.9981f
        0x3f7f9724    # 0.9984f
        0x3f7fa440    # 0.9986f
        0x3f7fb7e9    # 0.9989f
        0x3f7fc505    # 0.9991f
        0x3f7fcb92    # 0.9992f
        0x3f7fd8ae    # 0.9994f
        0x3f7fe5c9    # 0.9996f
        0x3f7fec57    # 0.9997f
        0x3f7ff972    # 0.9999f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private constructor <init>([F)V
    .locals 2
    .param p1, "values"    # [F

    .prologue
    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    iput-object p1, p0, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;->mValues:[F

    .line 139
    const/high16 v0, 0x3f800000    # 1.0f

    iget-object v1, p0, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;->mValues:[F

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;->mStepSize:F

    .line 140
    return-void
.end method


# virtual methods
.method public getInterpolation(F)F
    .locals 7
    .param p1, "input"    # F

    .prologue
    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    .line 144
    cmpl-float v6, p1, v4

    if-ltz v6, :cond_0

    .line 160
    :goto_0
    return v4

    .line 148
    :cond_0
    cmpg-float v4, p1, v5

    if-gtz v4, :cond_1

    move v4, v5

    .line 149
    goto :goto_0

    .line 152
    :cond_1
    iget-object v4, p0, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;->mValues:[F

    array-length v4, v4

    add-int/lit8 v4, v4, -0x1

    int-to-float v4, v4

    mul-float/2addr v4, p1

    float-to-int v4, v4

    iget-object v5, p0, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;->mValues:[F

    array-length v5, v5

    add-int/lit8 v5, v5, -0x2

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 156
    .local v1, "position":I
    int-to-float v4, v1

    iget v5, p0, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;->mStepSize:F

    mul-float v2, v4, v5

    .line 157
    .local v2, "quantized":F
    sub-float v0, p1, v2

    .line 158
    .local v0, "difference":F
    iget v4, p0, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;->mStepSize:F

    div-float v3, v0, v4

    .line 160
    .local v3, "weight":F
    iget-object v4, p0, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;->mValues:[F

    aget v4, v4, v1

    iget-object v5, p0, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;->mValues:[F

    add-int/lit8 v6, v1, 0x1

    aget v5, v5, v6

    iget-object v6, p0, Lorg/chromium/ui/interpolators/BakedBezierInterpolator;->mValues:[F

    aget v6, v6, v1

    sub-float/2addr v5, v6

    mul-float/2addr v5, v3

    add-float/2addr v4, v5

    goto :goto_0
.end method
