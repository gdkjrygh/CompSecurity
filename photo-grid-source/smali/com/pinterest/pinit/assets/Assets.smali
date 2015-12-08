.class public Lcom/pinterest/pinit/assets/Assets;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final DENSITY_DEFAULT:I = 0xa0

.field public static final DENSITY_HIGH:I = 0xf0

.field public static final DENSITY_MEDIUM:I = 0xa0

.field public static final DENSITY_TV:I = 0xd5

.field public static final DENSITY_XHIGH:I = 0x140

.field public static final DENSITY_XXHIGH:I = 0x1e0

.field private static statesDown:[I

.field private static statesUp:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 32
    new-array v0, v3, [I

    const v1, 0x101009e

    aput v1, v0, v2

    sput-object v0, Lcom/pinterest/pinit/assets/Assets;->statesUp:[I

    .line 35
    new-array v0, v3, [I

    const v1, 0x10100a7

    aput v1, v0, v2

    sput-object v0, Lcom/pinterest/pinit/assets/Assets;->statesDown:[I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static decode(Ljava/lang/String;)[B
    .locals 1

    .prologue
    .line 111
    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    return-object v0
.end method

.method public static getPinItDrawable(Landroid/content/Context;)Landroid/graphics/drawable/StateListDrawable;
    .locals 10

    .prologue
    const/4 v5, 0x0

    const/4 v9, 0x0

    .line 48
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 49
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v6, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 50
    new-instance v7, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v7}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 55
    sparse-switch v6, :sswitch_data_0

    .line 68
    invoke-static {}, Lcom/pinterest/pinit/assets/buttons/WhiteMdpi;->getDown()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/pinterest/pinit/assets/Assets;->decode(Ljava/lang/String;)[B

    move-result-object v0

    .line 72
    :goto_0
    array-length v2, v0

    invoke-static {v0, v9, v2}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 73
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B

    move-result-object v3

    .line 74
    invoke-static {v3}, Landroid/graphics/NinePatch;->isNinePatchChunk([B)Z

    .line 75
    sget-object v8, Lcom/pinterest/pinit/assets/Assets;->statesDown:[I

    new-instance v0, Landroid/graphics/drawable/NinePatchDrawable;

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    invoke-direct/range {v0 .. v5}, Landroid/graphics/drawable/NinePatchDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;[BLandroid/graphics/Rect;Ljava/lang/String;)V

    invoke-virtual {v7, v8, v0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 78
    sparse-switch v6, :sswitch_data_1

    .line 91
    invoke-static {}, Lcom/pinterest/pinit/assets/buttons/WhiteMdpi;->getUp()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/pinterest/pinit/assets/Assets;->decode(Ljava/lang/String;)[B

    move-result-object v0

    .line 95
    :goto_1
    array-length v2, v0

    invoke-static {v0, v9, v2}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 96
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B

    move-result-object v3

    .line 97
    invoke-static {v3}, Landroid/graphics/NinePatch;->isNinePatchChunk([B)Z

    .line 98
    sget-object v6, Lcom/pinterest/pinit/assets/Assets;->statesUp:[I

    new-instance v0, Landroid/graphics/drawable/NinePatchDrawable;

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    invoke-direct/range {v0 .. v5}, Landroid/graphics/drawable/NinePatchDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;[BLandroid/graphics/Rect;Ljava/lang/String;)V

    invoke-virtual {v7, v6, v0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 101
    return-object v7

    .line 58
    :sswitch_0
    invoke-static {}, Lcom/pinterest/pinit/assets/buttons/WhiteXhdpi;->getDown()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/pinterest/pinit/assets/Assets;->decode(Ljava/lang/String;)[B

    move-result-object v0

    goto :goto_0

    .line 62
    :sswitch_1
    invoke-static {}, Lcom/pinterest/pinit/assets/buttons/WhiteHdpi;->getDown()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/pinterest/pinit/assets/Assets;->decode(Ljava/lang/String;)[B

    move-result-object v0

    goto :goto_0

    .line 81
    :sswitch_2
    invoke-static {}, Lcom/pinterest/pinit/assets/buttons/WhiteXhdpi;->getUp()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/pinterest/pinit/assets/Assets;->decode(Ljava/lang/String;)[B

    move-result-object v0

    goto :goto_1

    .line 85
    :sswitch_3
    invoke-static {}, Lcom/pinterest/pinit/assets/buttons/WhiteHdpi;->getUp()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/pinterest/pinit/assets/Assets;->decode(Ljava/lang/String;)[B

    move-result-object v0

    goto :goto_1

    .line 55
    :sswitch_data_0
    .sparse-switch
        0xf0 -> :sswitch_1
        0x140 -> :sswitch_0
        0x1e0 -> :sswitch_0
    .end sparse-switch

    .line 78
    :sswitch_data_1
    .sparse-switch
        0xf0 -> :sswitch_3
        0x140 -> :sswitch_2
        0x1e0 -> :sswitch_2
    .end sparse-switch
.end method
