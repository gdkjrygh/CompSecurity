.class public final Lkik/android/util/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/util/e$a;,
        Lkik/android/util/e$b;
    }
.end annotation


# static fields
.field public static final a:[I

.field private static b:Lkik/android/util/br;

.field private static c:Landroid/graphics/BitmapFactory$Options;

.field private static d:Landroid/graphics/Bitmap;

.field private static final e:Landroid/graphics/Paint;

.field private static f:Landroid/graphics/Paint;

.field private static g:Landroid/graphics/Paint;

.field private static h:Landroid/graphics/Paint;

.field private static final i:Lorg/c/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 73
    new-instance v0, Lkik/android/util/br;

    invoke-direct {v0}, Lkik/android/util/br;-><init>()V

    sput-object v0, Lkik/android/util/e;->b:Lkik/android/util/br;

    .line 88
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lkik/android/util/e;->a:[I

    .line 94
    new-instance v0, Lkik/android/util/f;

    invoke-direct {v0}, Lkik/android/util/f;-><init>()V

    sput-object v0, Lkik/android/util/e;->e:Landroid/graphics/Paint;

    .line 101
    new-instance v0, Lkik/android/util/h;

    invoke-direct {v0}, Lkik/android/util/h;-><init>()V

    sput-object v0, Lkik/android/util/e;->f:Landroid/graphics/Paint;

    .line 111
    new-instance v0, Lkik/android/util/i;

    invoke-direct {v0}, Lkik/android/util/i;-><init>()V

    sput-object v0, Lkik/android/util/e;->g:Landroid/graphics/Paint;

    .line 120
    new-instance v0, Lkik/android/util/j;

    invoke-direct {v0}, Lkik/android/util/j;-><init>()V

    sput-object v0, Lkik/android/util/e;->h:Landroid/graphics/Paint;

    .line 129
    const-string v0, "AndroidImageUtils"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/util/e;->i:Lorg/c/b;

    return-void

    .line 88
    :array_0
    .array-data 4
        0x640
        0x4b0
        0x320
        0x190
    .end array-data
.end method

.method public static a(Landroid/content/Context;Landroid/net/Uri;Landroid/net/Uri;)Landroid/content/Intent;
    .locals 2

    .prologue
    .line 334
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lkik/android/chat/activity/KikCropActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 335
    const-string v1, "image/*"

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 336
    const-string v1, "output"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 337
    return-object v0
.end method

.method public static a(I)Landroid/graphics/Bitmap;
    .locals 14

    .prologue
    const/16 v12, 0x28

    const/16 v13, 0x12

    const/16 v11, 0x1b

    const/16 v10, 0xe

    const/4 v2, 0x0

    .line 474
    const/16 v0, 0x36

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v5

    const/4 v0, 0x2

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    new-instance v9, Landroid/graphics/Path;

    invoke-direct {v9}, Landroid/graphics/Path;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x1

    packed-switch p0, :pswitch_data_0

    const/16 v0, 0xf

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    new-instance v3, Landroid/graphics/Point;

    invoke-static {v11}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    const/16 v7, 0x8

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    const/16 v4, 0x8

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-static {v11}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    const/16 v4, 0xb

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    const/16 v7, 0x26

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    const/16 v4, 0x14

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    const/16 v7, 0x2e

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    const/16 v4, 0x22

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    const/16 v7, 0x2e

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    const/16 v4, 0x2c

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    const/16 v7, 0x26

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    const/16 v4, 0x2e

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-static {v11}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    invoke-static {v12}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v3, v2

    move v4, v1

    move v1, v0

    :goto_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v5, v5, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v10

    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, v10}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    sget-object v5, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v2, v5}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    if-nez p0, :cond_5

    const/16 v1, 0x24

    invoke-static {v1}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    new-instance v1, Landroid/graphics/Point;

    invoke-static {v13}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v5

    invoke-static {v13}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v11

    invoke-direct {v1, v5, v11}, Landroid/graphics/Point;-><init>(II)V

    int-to-float v5, v8

    invoke-static {v7, v1, v0, v9, v5}, Lkik/android/util/e;->a(ILandroid/graphics/Point;Landroid/graphics/Canvas;Landroid/graphics/Path;F)V

    :goto_1
    const/16 v1, 0x9

    if-lt p0, v1, :cond_0

    const/16 p0, 0x9

    :cond_0
    move v5, v2

    :goto_2
    if-ge v5, p0, :cond_3

    const/4 v1, 0x1

    if-ne p0, v1, :cond_1

    const/16 v1, 0x24

    invoke-static {v1}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v1

    new-instance v7, Landroid/graphics/Point;

    const/16 v11, 0x24

    invoke-static {v11}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v11

    const/16 v12, 0x24

    invoke-static {v12}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v12

    invoke-direct {v7, v11, v12}, Landroid/graphics/Point;-><init>(II)V

    int-to-float v11, v8

    invoke-static {v1, v7, v0, v9, v11}, Lkik/android/util/e;->a(ILandroid/graphics/Point;Landroid/graphics/Canvas;Landroid/graphics/Path;F)V

    new-instance v7, Landroid/graphics/Point;

    invoke-static {v13}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v11

    invoke-static {v13}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v12

    invoke-direct {v7, v11, v12}, Landroid/graphics/Point;-><init>(II)V

    invoke-static {v1, v7, v0, v9, v8}, Lkik/android/util/e;->a(ILandroid/graphics/Point;Landroid/graphics/Canvas;Landroid/graphics/Path;I)V

    :goto_3
    add-int/lit8 v5, v5, 0x1

    move v7, v1

    goto :goto_2

    :pswitch_0
    move v3, v2

    move v4, v2

    move v1, v2

    goto :goto_0

    :pswitch_1
    const/16 v0, 0x24

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    new-instance v1, Landroid/graphics/Point;

    const/16 v3, 0x24

    invoke-static {v3}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v3

    const/16 v4, 0x24

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-direct {v1, v3, v4}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroid/graphics/Point;

    invoke-static {v13}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v3

    invoke-static {v13}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-direct {v1, v3, v4}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v3, v2

    move v4, v2

    move v1, v0

    goto/16 :goto_0

    :pswitch_2
    const/16 v0, 0x1e

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    new-instance v1, Landroid/graphics/Point;

    const/16 v3, 0xf

    invoke-static {v3}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v3

    const/16 v4, 0x27

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-direct {v1, v3, v4}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroid/graphics/Point;

    const/16 v3, 0x27

    invoke-static {v3}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v3

    const/16 v4, 0x27

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-direct {v1, v3, v4}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroid/graphics/Point;

    const/16 v3, 0x1a

    invoke-static {v3}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v3

    const/16 v4, 0xf

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-direct {v1, v3, v4}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v3, v2

    move v4, v2

    move v1, v0

    goto/16 :goto_0

    :pswitch_3
    const/16 v0, 0x1c

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v3

    new-instance v0, Landroid/graphics/Point;

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v0, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Landroid/graphics/Point;

    invoke-static {v12}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v0, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Landroid/graphics/Point;

    invoke-static {v12}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-static {v12}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v0, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Landroid/graphics/Point;

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-static {v12}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v0, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v0, 0x9

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    move v4, v1

    move v1, v3

    move v3, v0

    goto/16 :goto_0

    :pswitch_4
    const/16 v0, 0x16

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    new-instance v3, Landroid/graphics/Point;

    invoke-static {v11}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    const/16 v7, 0xb

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    const/16 v4, 0xb

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    const/16 v7, 0x17

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    const/16 v4, 0x11

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    const/16 v7, 0x2a

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    const/16 v4, 0x25

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    const/16 v7, 0x2a

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    const/16 v4, 0x2b

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    const/16 v7, 0x17

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v3, v2

    move v4, v1

    move v1, v0

    goto/16 :goto_0

    :pswitch_5
    const/16 v0, 0x14

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v3

    new-instance v0, Landroid/graphics/Point;

    invoke-static {v13}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    const/16 v7, 0xd

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v0, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Landroid/graphics/Point;

    const/16 v4, 0xb

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-static {v11}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v0, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Landroid/graphics/Point;

    invoke-static {v13}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    const/16 v7, 0x29

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v0, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Landroid/graphics/Point;

    const/16 v4, 0x24

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    const/16 v7, 0x29

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v0, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Landroid/graphics/Point;

    const/16 v4, 0x2b

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-static {v11}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v0, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Landroid/graphics/Point;

    const/16 v4, 0x24

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    const/16 v7, 0xd

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v0, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x5

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    move v4, v1

    move v1, v3

    move v3, v0

    goto/16 :goto_0

    :pswitch_6
    const/16 v0, 0x13

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    new-instance v3, Landroid/graphics/Point;

    invoke-static {v11}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    const/16 v7, 0xb

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-static {v13}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    const/16 v4, 0xb

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    const/16 v7, 0x20

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    const/16 v4, 0x13

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    const/16 v7, 0x2b

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    const/16 v4, 0x23

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    const/16 v7, 0x2b

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    const/16 v4, 0x2b

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    const/16 v7, 0x20

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    invoke-static {v12}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-static {v13}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v3, v2

    move v4, v1

    move v1, v0

    goto/16 :goto_0

    :pswitch_7
    const/16 v0, 0x11

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    new-instance v3, Landroid/graphics/Point;

    invoke-static {v11}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    const/16 v7, 0x9

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    const/16 v4, 0x9

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-static {v11}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-static {v12}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    invoke-static {v11}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    const/16 v7, 0x2d

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    invoke-static {v12}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-static {v12}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    const/16 v4, 0x2d

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-static {v11}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Landroid/graphics/Point;

    invoke-static {v12}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v3, v4, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v3, v2

    move v4, v1

    move v1, v0

    goto/16 :goto_0

    :cond_1
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v5, v1, :cond_2

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Point;

    invoke-static {v7, v1, v0, v9, v8}, Lkik/android/util/e;->a(ILandroid/graphics/Point;Landroid/graphics/Canvas;Landroid/graphics/Path;I)V

    :cond_2
    move v1, v7

    goto/16 :goto_3

    :cond_3
    if-eqz v4, :cond_4

    if-lez p0, :cond_4

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_4

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/graphics/Point;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget v4, v6, Landroid/graphics/Point;->x:I

    add-int/2addr v3, v4

    int-to-float v3, v3

    iget v4, v6, Landroid/graphics/Point;->y:I

    add-int/2addr v4, v7

    int-to-float v4, v4

    sget-object v5, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->clipRect(FFFFLandroid/graphics/Region$Op;)Z

    invoke-virtual {v9}, Landroid/graphics/Path;->reset()V

    iget v1, v6, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget v2, v6, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    int-to-float v3, v7

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    int-to-float v4, v8

    add-float/2addr v3, v4

    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v9, v1, v2, v3, v4}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    sget-object v1, Lkik/android/util/e;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, v9, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {v9}, Landroid/graphics/Path;->reset()V

    iget v1, v6, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    iget v2, v6, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    int-to-float v3, v7

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v9, v1, v2, v3, v4}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    sget-object v1, Lkik/android/util/e;->h:Landroid/graphics/Paint;

    invoke-virtual {v0, v9, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    :cond_4
    return-object v10

    :cond_5
    move v7, v1

    goto/16 :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 13

    .prologue
    .line 967
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020178

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 968
    const v1, 0x7f090239

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 970
    const/16 v2, 0xdc

    const/16 v3, 0xdc

    const/4 v4, 0x1

    invoke-static {p2, v2, v3, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 971
    const/4 v3, 0x4

    invoke-static {p2, v3}, Lkik/android/util/r;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 972
    invoke-static {v3}, Lkik/android/util/r;->b(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 974
    const/16 v4, 0x280

    const/16 v5, 0x280

    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 975
    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 976
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 977
    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 978
    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setDither(Z)V

    .line 979
    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 981
    const/4 v7, 0x0

    new-instance v8, Landroid/graphics/Rect;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x280

    const/16 v12, 0x280

    invoke-direct {v8, v9, v10, v11, v12}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {v5, v3, v7, v8, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 983
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 984
    new-instance v7, Landroid/graphics/BitmapShader;

    sget-object v8, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    sget-object v9, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {v7, v2, v8, v9}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 985
    new-instance v8, Landroid/graphics/Matrix;

    invoke-direct {v8}, Landroid/graphics/Matrix;-><init>()V

    .line 986
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v9

    div-int/lit8 v9, v9, 0x2

    rsub-int v9, v9, 0x140

    int-to-float v9, v9

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v10

    div-int/lit8 v10, v10, 0x2

    rsub-int v10, v10, 0x10b

    int-to-float v10, v10

    invoke-virtual {v8, v9, v10}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 987
    invoke-virtual {v7, v8}, Landroid/graphics/BitmapShader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 988
    const/4 v8, 0x1

    invoke-virtual {v3, v8}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 989
    const/4 v8, 0x1

    invoke-virtual {v3, v8}, Landroid/graphics/Paint;->setDither(Z)V

    .line 990
    const/4 v8, 0x1

    invoke-virtual {v3, v8}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 991
    invoke-virtual {v3, v7}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 992
    const/high16 v7, 0x43a00000    # 320.0f

    const v8, 0x43858000    # 267.0f

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    invoke-virtual {v5, v7, v8, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 994
    const/4 v2, 0x0

    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 995
    const/4 v2, 0x0

    new-instance v3, Landroid/graphics/Rect;

    const/16 v7, 0x1fe

    const/16 v8, 0x22c

    const/16 v9, 0x262

    const/16 v10, 0x25e

    invoke-direct {v3, v7, v8, v9, v10}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {v5, v0, v2, v3, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 997
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 998
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v2, "fonts/Roboto-Medium.ttf"

    invoke-static {v0, v2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 999
    sget-object v0, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 1000
    const/high16 v0, -0x1000000

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 1001
    const/high16 v0, 0x42100000    # 36.0f

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 1002
    if-eqz v1, :cond_0

    .line 1003
    const/high16 v0, 0x43a00000    # 320.0f

    const/high16 v2, 0x43d70000    # 430.0f

    invoke-virtual {v5, v1, v0, v2, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 1005
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "fonts/Roboto-Italic.ttf"

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 1006
    const/high16 v0, 0x41f00000    # 30.0f

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 1007
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0c0019

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 1008
    if-eqz p1, :cond_1

    .line 1009
    const/high16 v0, 0x43a00000    # 320.0f

    const/high16 v1, 0x43ef0000    # 478.0f

    invoke-virtual {v5, p1, v0, v1, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 1012
    :cond_1
    return-object v4
.end method

.method public static a(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 1068
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 1085
    :cond_0
    :goto_0
    return-object v0

    .line 1073
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    .line 1074
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    .line 1075
    invoke-static {p1}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v3

    .line 1076
    invoke-static {p2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    .line 1077
    invoke-static {v1, v2, v3, v4}, Lkik/android/util/e;->a(IIII)Landroid/graphics/Point;

    move-result-object v1

    .line 1080
    :try_start_0
    iget v2, v1, Landroid/graphics/Point;->x:I

    iget v1, v1, Landroid/graphics/Point;->y:I

    const/4 v3, 0x1

    invoke-static {p0, v2, v1, v3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 1082
    :catch_0
    move-exception v1

    invoke-static {v1}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public static a(Lcom/kik/cache/ad;Lcom/kik/cache/z;)Landroid/graphics/Bitmap;
    .locals 3

    .prologue
    .line 853
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 854
    :cond_0
    const/4 v0, 0x0

    .line 873
    :goto_0
    return-object v0

    .line 856
    :cond_1
    new-instance v0, Lkik/android/util/e$b;

    invoke-direct {v0}, Lkik/android/util/e$b;-><init>()V

    .line 857
    new-instance v1, Lkik/android/util/n;

    invoke-direct {v1, v0}, Lkik/android/util/n;-><init>(Lkik/android/util/e$b;)V

    const/4 v2, 0x1

    invoke-virtual {p0, p1, v1, v2}, Lcom/kik/cache/ad;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad$d;Z)Lcom/kik/cache/ad$c;

    .line 873
    invoke-virtual {v0}, Lkik/android/util/e$b;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Ljava/io/File;)Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    .line 342
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 343
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/io/File;I)Landroid/graphics/Bitmap;
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 380
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/platform/util/ExifHelper;->a(Ljava/lang/String;)F

    move-result v1

    .line 382
    sget-object v0, Lkik/android/util/e;->c:Landroid/graphics/BitmapFactory$Options;

    if-nez v0, :cond_0

    .line 383
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 384
    sput-object v0, Lkik/android/util/e;->c:Landroid/graphics/BitmapFactory$Options;

    const/4 v2, 0x1

    iput-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 386
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lkik/android/util/e;->c:Landroid/graphics/BitmapFactory$Options;

    invoke-static {v0, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 387
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 388
    sget-object v2, Lkik/android/util/e;->c:Landroid/graphics/BitmapFactory$Options;

    iget v2, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    sget-object v3, Lkik/android/util/e;->c:Landroid/graphics/BitmapFactory$Options;

    iget v3, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 389
    if-le v2, p1, :cond_1

    .line 390
    div-int/2addr v2, p1

    int-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    iput v2, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 391
    const/4 v2, 0x1

    iput-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 393
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 394
    if-nez v0, :cond_2

    move-object v0, v7

    .line 415
    :goto_0
    return-object v0

    .line 397
    :cond_2
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 399
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 400
    const/4 v3, 0x0

    cmpl-float v3, v1, v3

    if-eqz v3, :cond_3

    .line 401
    invoke-virtual {v5, v1}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 404
    :cond_3
    int-to-float v1, p1

    .line 405
    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 406
    invoke-virtual {v5, v1, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 407
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 408
    if-eq v1, v0, :cond_4

    .line 409
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    move-object v0, v1

    .line 411
    goto :goto_0

    .line 415
    :catch_0
    move-exception v0

    move-object v0, v7

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 3

    .prologue
    .line 422
    const/4 v0, 0x0

    .line 423
    sget-object v1, Lkik/android/util/e;->b:Lkik/android/util/br;

    monitor-enter v1

    .line 424
    :try_start_0
    sget-object v2, Lkik/android/util/e;->b:Lkik/android/util/br;

    invoke-virtual {v2, p0}, Lkik/android/util/br;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 425
    sget-object v0, Lkik/android/util/e;->b:Lkik/android/util/br;

    invoke-virtual {v0, p0}, Lkik/android/util/br;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 427
    :cond_0
    monitor-exit v1

    .line 428
    return-object v0

    .line 427
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static a(Lkik/a/d/aa;Landroid/content/Context;Lcom/kik/cache/ad;)Landroid/graphics/Bitmap;
    .locals 10

    .prologue
    const/4 v1, 0x0

    const v9, 0x7f020305

    const/4 v2, 0x0

    .line 1017
    move-object v0, p0

    move-object v3, v1

    move v4, v2

    move v5, v2

    invoke-static/range {v0 .. v5}, Lcom/kik/cache/ak;->a(Lkik/a/d/aa;Lcom/android/volley/r$b;ZLcom/android/volley/r$a;ZZ)Lcom/kik/cache/ak;

    move-result-object v4

    .line 1018
    if-nez v4, :cond_0

    .line 1020
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, v9}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1042
    :goto_0
    return-object v0

    .line 1023
    :cond_0
    new-instance v0, Lkik/android/util/e$b;

    invoke-direct {v0}, Lkik/android/util/e$b;-><init>()V

    .line 1024
    new-instance v5, Lkik/android/util/g;

    invoke-direct {v5, v0}, Lkik/android/util/g;-><init>(Lkik/android/util/e$b;)V

    const/4 v8, 0x1

    move-object v3, p2

    move v6, v2

    move v7, v2

    invoke-virtual/range {v3 .. v8}, Lcom/kik/cache/ad;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad$d;IIZ)Lcom/kik/cache/ad$c;

    .line 1039
    invoke-virtual {v0}, Lkik/android/util/e$b;->a()Landroid/graphics/Bitmap;

    move-result-object v1

    if-nez v1, :cond_1

    .line 1040
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v1, v9}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/util/e$b;->a(Landroid/graphics/Bitmap;)V

    .line 1042
    :cond_1
    invoke-virtual {v0}, Lkik/android/util/e$b;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0
.end method

.method private static a(ILandroid/graphics/Point;Landroid/graphics/Canvas;ILandroid/graphics/Path;Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)Landroid/graphics/BitmapShader;
    .locals 5

    .prologue
    const/high16 v4, 0x40000000    # 2.0f

    .line 919
    if-eqz p5, :cond_0

    if-nez p1, :cond_1

    .line 920
    :cond_0
    const/4 v0, 0x0

    .line 938
    :goto_0
    return-object v0

    .line 922
    :cond_1
    invoke-virtual {p4}, Landroid/graphics/Path;->reset()V

    .line 923
    iget v0, p1, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, p1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    int-to-float v2, p0

    div-float/2addr v2, v4

    int-to-float v3, p3

    add-float/2addr v2, v3

    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {p4, v0, v1, v2, v3}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 924
    sget-object v0, Lkik/android/util/e;->f:Landroid/graphics/Paint;

    invoke-virtual {p2, p4, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 926
    invoke-virtual {p4}, Landroid/graphics/Path;->reset()V

    .line 927
    iget v0, p1, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, p1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    int-to-float v2, p0

    div-float/2addr v2, v4

    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {p4, v0, v1, v2, v3}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 928
    new-instance v0, Landroid/graphics/BitmapShader;

    sget-object v1, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    sget-object v2, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {v0, p5, v1, v2}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 930
    int-to-float v1, p0

    invoke-virtual {p5}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 931
    int-to-float v2, p0

    invoke-virtual {p5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 932
    invoke-virtual {p6}, Landroid/graphics/Matrix;->reset()V

    .line 933
    invoke-virtual {p6, v1, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 934
    iget v1, p1, Landroid/graphics/Point;->x:I

    div-int/lit8 v2, p0, 0x2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, p1, Landroid/graphics/Point;->y:I

    div-int/lit8 v3, p0, 0x2

    sub-int/2addr v2, v3

    int-to-float v2, v2

    invoke-virtual {p6, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 935
    invoke-virtual {v0, p6}, Landroid/graphics/BitmapShader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 936
    sget-object v1, Lkik/android/util/e;->e:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 937
    sget-object v1, Lkik/android/util/e;->e:Landroid/graphics/Paint;

    invoke-virtual {p2, p4, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_0
.end method

.method public static a(IIII)Landroid/graphics/Point;
    .locals 6

    .prologue
    .line 1047
    if-eqz p1, :cond_0

    if-nez p0, :cond_1

    .line 1050
    :cond_0
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0, p0, p1}, Landroid/graphics/Point;-><init>(II)V

    .line 1060
    :goto_0
    return-object v0

    .line 1052
    :cond_1
    int-to-double v0, p2

    int-to-double v2, p0

    div-double/2addr v0, v2

    .line 1053
    int-to-double v2, p3

    int-to-double v4, p1

    div-double/2addr v2, v4

    .line 1054
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    .line 1056
    int-to-double v2, p1

    mul-double/2addr v2, v0

    .line 1057
    int-to-double v4, p0

    mul-double/2addr v0, v4

    .line 1058
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    .line 1059
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v1, v0

    .line 1060
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    goto :goto_0
.end method

.method public static a(Landroid/content/Intent;)Landroid/net/Uri;
    .locals 4

    .prologue
    .line 133
    if-nez p0, :cond_1

    .line 134
    const/4 v0, 0x0

    .line 155
    :cond_0
    :goto_0
    return-object v0

    .line 136
    :cond_1
    invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    .line 139
    if-nez v0, :cond_0

    .line 143
    const-string v0, "android.intent.extra.STREAM"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    .line 144
    if-nez v0, :cond_0

    .line 149
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 151
    :catch_0
    move-exception v1

    .line 152
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid uri: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method public static a(Lcom/kik/cache/ad;Lcom/kik/cache/z;Z)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 885
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 886
    :cond_0
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 887
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "request or loader was null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 914
    :goto_0
    return-object v0

    .line 890
    :cond_1
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 891
    new-instance v1, Lkik/android/util/o;

    invoke-direct {v1, v0}, Lkik/android/util/o;-><init>(Lcom/kik/g/p;)V

    invoke-virtual {p0, p1, v1, p2}, Lcom/kik/cache/ad;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad$d;Z)Lcom/kik/cache/ad$c;

    goto :goto_0
.end method

.method public static a(Landroid/net/Uri;Landroid/content/Context;)Ljava/io/File;
    .locals 8

    .prologue
    const/4 v6, 0x0

    .line 160
    .line 161
    const-string v0, "file"

    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 162
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 209
    :cond_0
    :goto_0
    return-object v0

    .line 164
    :cond_1
    const-string v0, "content"

    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 167
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 170
    const/4 v1, 0x1

    :try_start_1
    new-array v2, v1, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v3, "_data"

    aput-object v3, v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v1

    move-object v2, v6

    move-object v6, v1

    .line 183
    :goto_1
    if-eqz v6, :cond_5

    :try_start_2
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 184
    const/4 v1, 0x0

    invoke-interface {v6, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 185
    if-eqz v3, :cond_2

    .line 186
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 187
    :try_start_3
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 188
    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 189
    new-instance v0, Ljava/io/File;

    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 204
    :goto_2
    if-eqz v6, :cond_0

    .line 205
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :catch_0
    move-exception v1

    .line 175
    :try_start_4
    invoke-virtual {v0, p0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v1

    .line 176
    invoke-static {p1, v1}, Lkik/android/KikFileProvider;->a(Landroid/content/Context;Ljava/io/InputStream;)Ljava/io/File;
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result-object v2

    goto :goto_1

    :catch_1
    move-exception v1

    move-object v2, v6

    goto :goto_1

    .line 195
    :cond_2
    :try_start_5
    invoke-virtual {v0, p0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    .line 196
    invoke-static {p1, v0}, Lkik/android/KikFileProvider;->a(Landroid/content/Context;Ljava/io/InputStream;)Ljava/io/File;
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-result-object v0

    goto :goto_2

    .line 200
    :catch_2
    move-exception v0

    move-object v1, v0

    move-object v0, v6

    :goto_3
    :try_start_6
    invoke-virtual {v1}, Ljava/io/FileNotFoundException;->printStackTrace()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 204
    if-eqz v6, :cond_0

    .line 205
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 204
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_3

    .line 205
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    :cond_3
    throw v0

    .line 200
    :catch_3
    move-exception v0

    move-object v1, v0

    move-object v0, v2

    goto :goto_3

    :catch_4
    move-exception v0

    move-object v7, v0

    move-object v0, v1

    move-object v1, v7

    goto :goto_3

    :cond_4
    move-object v0, v1

    goto :goto_2

    :cond_5
    move-object v0, v2

    goto :goto_2

    :cond_6
    move-object v0, v6

    goto/16 :goto_0
.end method

.method public static a(Ljava/io/File;Ljava/lang/String;ZILkik/a/e/v;)Ljava/io/File;
    .locals 8

    .prologue
    const/4 v6, 0x0

    .line 264
    :try_start_0
    new-instance v7, Ljava/io/ByteArrayOutputStream;

    const/16 v0, 0x5000

    invoke-direct {v7, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 267
    invoke-static {p0, p3}, Lkik/android/util/e;->a(Ljava/io/File;I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 268
    if-nez v0, :cond_0

    move-object v0, v6

    .line 291
    :goto_0
    return-object v0

    .line 272
    :cond_0
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x50

    invoke-virtual {v0, v1, v2, v7}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 273
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 274
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Scaled image upload size: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 278
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-object v0, p4

    move-object v1, p1

    move v4, p2

    invoke-interface/range {v0 .. v5}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Object;ZZZ)Ljava/io/File;

    move-result-object v0

    .line 279
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_0

    .line 282
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    :goto_1
    move-object v0, v6

    .line 291
    goto :goto_0

    .line 285
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    .line 288
    :catch_2
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lkik/a/e/v;)Ljava/io/File;
    .locals 8

    .prologue
    const/4 v6, 0x0

    .line 214
    :try_start_0
    new-instance v7, Ljava/io/ByteArrayOutputStream;

    const/16 v0, 0x5000

    invoke-direct {v7, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 218
    const/4 v0, 0x3

    .line 221
    new-instance v1, Ljava/util/zip/Deflater;

    invoke-direct {v1}, Ljava/util/zip/Deflater;-><init>()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_3

    move v1, v0

    move-object v2, v6

    move-object v0, v6

    .line 224
    :cond_0
    :try_start_1
    invoke-static {p0}, Lkik/a/h/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-static {v3}, Lcom/kik/m/e;->c([B)[B

    move-result-object v0

    .line 225
    const/4 v3, 0x0

    array-length v4, v0

    invoke-static {v0, v3, v4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_3

    move-result-object v2

    .line 230
    :goto_0
    add-int/lit8 v1, v1, -0x1

    if-lez v1, :cond_1

    if-eqz v2, :cond_0

    .line 232
    :cond_1
    if-nez v0, :cond_2

    .line 233
    const v0, 0x7f090062

    const/4 v1, 0x0

    :try_start_2
    invoke-static {p2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    move-object v0, v6

    .line 259
    :goto_1
    return-object v0

    .line 237
    :cond_2
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x50

    invoke-virtual {v2, v0, v1, v7}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 238
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 239
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Scaled image upload size: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 243
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p3

    move-object v1, p1

    invoke-interface/range {v0 .. v5}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Object;ZZZ)Ljava/io/File;

    move-result-object v0

    .line 244
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_1

    .line 247
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    :goto_2
    move-object v0, v6

    .line 259
    goto :goto_1

    .line 250
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_2

    .line 253
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/NullPointerException;->printStackTrace()V

    goto :goto_2

    .line 256
    :catch_3
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_2

    :catch_4
    move-exception v3

    goto :goto_0
.end method

.method public static a([BLjava/lang/String;Lkik/a/e/v;)Ljava/io/File;
    .locals 7

    .prologue
    const/4 v0, 0x0

    const/4 v6, 0x0

    .line 296
    if-nez p0, :cond_0

    move-object v0, v6

    .line 325
    :goto_0
    return-object v0

    .line 300
    :cond_0
    const/16 v1, 0x500

    :try_start_0
    invoke-static {p0, v1}, Lkik/android/util/u;->b([BI)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 301
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    const/16 v2, 0x5000

    invoke-direct {v3, v2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 302
    if-nez v1, :cond_1

    move-object v0, v6

    .line 303
    goto :goto_0

    .line 305
    :cond_1
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v4, 0x50

    invoke-virtual {v1, v2, v4, v3}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 306
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 307
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    .line 308
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 309
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Scaled image upload size: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-nez v2, :cond_2

    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 313
    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v0, p2

    move-object v1, p1

    invoke-interface/range {v0 .. v5}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Object;ZZZ)Ljava/io/File;

    move-result-object v0

    goto :goto_0

    .line 309
    :cond_2
    array-length v0, v2
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_1

    .line 316
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    :goto_2
    move-object v0, v6

    .line 325
    goto :goto_0

    .line 319
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_2

    .line 322
    :catch_2
    move-exception v0

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_2
.end method

.method public static a(Ljava/util/ArrayList;IZLcom/kik/cache/ad;)Lkik/android/util/e$a;
    .locals 23

    .prologue
    .line 632
    new-instance v18, Lkik/android/util/e$a;

    invoke-direct/range {v18 .. v18}, Lkik/android/util/e$a;-><init>()V

    .line 633
    mul-int/lit8 v2, p1, 0x36

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    .line 634
    mul-int/lit8 v2, p1, 0x2

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v19

    .line 635
    new-instance v3, Lkik/android/util/k;

    invoke-direct {v3}, Lkik/android/util/k;-><init>()V

    .line 642
    new-instance v4, Lkik/android/util/l;

    invoke-direct {v4}, Lkik/android/util/l;-><init>()V

    .line 649
    sget-object v2, Lkik/android/util/e;->d:Landroid/graphics/Bitmap;

    if-nez v2, :cond_0

    .line 650
    const v2, 0x7f020305

    invoke-static {v2}, Lkik/android/chat/KikApplication;->c(I)Landroid/graphics/Bitmap;

    move-result-object v2

    sput-object v2, Lkik/android/util/e;->d:Landroid/graphics/Bitmap;

    .line 653
    :cond_0
    new-instance v9, Landroid/graphics/Path;

    invoke-direct {v9}, Landroid/graphics/Path;-><init>()V

    .line 654
    new-instance v20, Ljava/util/ArrayList;

    invoke-direct/range {v20 .. v20}, Ljava/util/ArrayList;-><init>()V

    .line 655
    const/4 v5, 0x1

    .line 657
    const/4 v2, 0x0

    .line 659
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->size()I

    move-result v6

    packed-switch v6, :pswitch_data_0

    .line 731
    mul-int/lit8 v2, p1, 0xf

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v6

    .line 732
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x1b

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x8

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 733
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0xe

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0xe

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 734
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x8

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x1b

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 735
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0xb

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x26

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 736
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x14

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x2e

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 738
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x22

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x2e

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 739
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x2c

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x26

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 740
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x2e

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x1b

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 741
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x28

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0xe

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 742
    const/4 v2, 0x0

    move v12, v2

    move v13, v5

    move v2, v6

    .line 746
    :goto_0
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v7, v7, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v21

    .line 747
    new-instance v22, Landroid/graphics/Canvas;

    move-object/from16 v0, v22

    move-object/from16 v1, v21

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 749
    const/4 v5, 0x0

    sget-object v6, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    move-object/from16 v0, v22

    invoke-virtual {v0, v5, v6}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 751
    const/4 v14, 0x0

    .line 752
    new-instance v11, Landroid/graphics/Matrix;

    invoke-direct {v11}, Landroid/graphics/Matrix;-><init>()V

    .line 753
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 754
    const/16 v6, 0x9

    if-lt v5, v6, :cond_6

    const/16 v5, 0x9

    move/from16 v17, v5

    .line 755
    :goto_1
    if-nez v17, :cond_1

    .line 756
    mul-int/lit8 v2, p1, 0x24

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    .line 757
    new-instance v5, Landroid/graphics/Point;

    mul-int/lit8 v6, p1, 0x12

    invoke-static {v6}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v6

    mul-int/lit8 v7, p1, 0x12

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v5, v6, v7}, Landroid/graphics/Point;-><init>(II)V

    move/from16 v0, v19

    int-to-float v6, v0

    move-object/from16 v0, v22

    invoke-static {v2, v5, v0, v9, v6}, Lkik/android/util/e;->a(ILandroid/graphics/Point;Landroid/graphics/Canvas;Landroid/graphics/Path;F)V

    .line 760
    :cond_1
    const/4 v5, 0x0

    move/from16 v16, v5

    move v15, v2

    :goto_2
    move/from16 v0, v16

    move/from16 v1, v17

    if-ge v0, v1, :cond_b

    .line 761
    new-instance v10, Lkik/android/util/e$b;

    invoke-direct {v10}, Lkik/android/util/e$b;-><init>()V

    .line 762
    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkik/a/d/k;

    .line 763
    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lkik/a/d/k;->l()Z

    move-result v5

    if-nez v5, :cond_7

    if-eqz p2, :cond_7

    const/4 v5, 0x1

    .line 764
    :goto_3
    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Lcom/kik/cache/k;->a(Lkik/a/d/k;Lcom/android/volley/r$b;Lcom/android/volley/r$a;ZIZZ)Lcom/kik/cache/k;

    move-result-object v6

    .line 766
    if-eqz v6, :cond_2

    .line 767
    new-instance v7, Lkik/android/util/m;

    invoke-direct {v7, v10}, Lkik/android/util/m;-><init>(Lkik/android/util/e$b;)V

    const/4 v8, 0x1

    move-object/from16 v0, p3

    invoke-virtual {v0, v6, v7, v8}, Lcom/kik/cache/ad;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad$d;Z)Lcom/kik/cache/ad$c;

    .line 787
    :cond_2
    invoke-virtual {v10}, Lkik/android/util/e$b;->b()Z

    move-result v6

    if-nez v6, :cond_3

    .line 789
    const/4 v6, 0x0

    move-object/from16 v0, v18

    iput-boolean v6, v0, Lkik/android/util/e$a;->b:Z

    .line 792
    :cond_3
    invoke-virtual {v10}, Lkik/android/util/e$b;->a()Landroid/graphics/Bitmap;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v10}, Lkik/android/util/e$b;->b()Z

    move-result v6

    if-nez v6, :cond_8

    .line 793
    :cond_4
    sget-object v10, Lkik/android/util/e;->d:Landroid/graphics/Bitmap;

    .line 794
    if-eqz v5, :cond_5

    .line 796
    invoke-static {v10}, Lkik/android/util/r;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v10

    .line 807
    :cond_5
    :goto_4
    const/4 v2, 0x1

    move/from16 v0, v17

    if-ne v0, v2, :cond_a

    .line 808
    mul-int/lit8 v2, p1, 0x24

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v5

    .line 809
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v6, p1, 0x24

    invoke-static {v6}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v6

    mul-int/lit8 v7, p1, 0x24

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v2, v6, v7}, Landroid/graphics/Point;-><init>(II)V

    move/from16 v0, v19

    int-to-float v6, v0

    move-object/from16 v0, v22

    invoke-static {v5, v2, v0, v9, v6}, Lkik/android/util/e;->a(ILandroid/graphics/Point;Landroid/graphics/Canvas;Landroid/graphics/Path;F)V

    .line 810
    new-instance v6, Landroid/graphics/Point;

    mul-int/lit8 v2, p1, 0x12

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    mul-int/lit8 v7, p1, 0x12

    invoke-static {v7}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v7

    invoke-direct {v6, v2, v7}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v7, v22

    move/from16 v8, v19

    invoke-static/range {v5 .. v11}, Lkik/android/util/e;->a(ILandroid/graphics/Point;Landroid/graphics/Canvas;ILandroid/graphics/Path;Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)Landroid/graphics/BitmapShader;

    move-object v2, v14

    .line 760
    :goto_5
    add-int/lit8 v6, v16, 0x1

    move/from16 v16, v6

    move-object v14, v2

    move v15, v5

    goto/16 :goto_2

    .line 662
    :pswitch_0
    mul-int/lit8 v5, p1, 0x24

    invoke-static {v5}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v6

    .line 663
    new-instance v5, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x24

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x24

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v5, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 664
    new-instance v5, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x12

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x12

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v5, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 665
    const/4 v5, 0x0

    move v12, v2

    move v13, v5

    move v2, v6

    .line 666
    goto/16 :goto_0

    .line 668
    :pswitch_1
    mul-int/lit8 v5, p1, 0x1e

    invoke-static {v5}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v6

    .line 669
    new-instance v5, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0xf

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x27

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v5, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 670
    new-instance v5, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x27

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x27

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v5, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 671
    new-instance v5, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x1a

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0xf

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v5, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 672
    const/4 v5, 0x0

    move v12, v2

    move v13, v5

    move v2, v6

    .line 673
    goto/16 :goto_0

    .line 675
    :pswitch_2
    mul-int/lit8 v2, p1, 0x1c

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v6

    .line 676
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0xe

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0xe

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 677
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x28

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0xe

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 678
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x28

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x28

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 679
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0xe

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x28

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 680
    mul-int/lit8 v2, p1, 0x9

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    move v12, v2

    move v13, v5

    move v2, v6

    .line 681
    goto/16 :goto_0

    .line 683
    :pswitch_3
    mul-int/lit8 v2, p1, 0x16

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v6

    .line 684
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x1b

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0xb

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 685
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0xb

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x17

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 686
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x11

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x2a

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 687
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x25

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x2a

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 688
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x2b

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x17

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 689
    const/4 v2, 0x0

    move v12, v2

    move v13, v5

    move v2, v6

    .line 690
    goto/16 :goto_0

    .line 692
    :pswitch_4
    mul-int/lit8 v2, p1, 0x14

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v6

    .line 693
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x12

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0xd

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 694
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0xb

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x1b

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 695
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x12

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x29

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 697
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x24

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x29

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 698
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x2b

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x1b

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 699
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x24

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0xd

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 700
    mul-int/lit8 v2, p1, 0x5

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    move v12, v2

    move v13, v5

    move v2, v6

    .line 701
    goto/16 :goto_0

    .line 703
    :pswitch_5
    mul-int/lit8 v2, p1, 0x13

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v6

    .line 704
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x1b

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0xb

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 706
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0xe

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x12

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 707
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0xb

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x20

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 708
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x13

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x2b

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 710
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x23

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x2b

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 711
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x2b

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x20

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 712
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x28

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x12

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 713
    const/4 v2, 0x0

    move v12, v2

    move v13, v5

    move v2, v6

    .line 714
    goto/16 :goto_0

    .line 716
    :pswitch_6
    mul-int/lit8 v2, p1, 0x11

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v6

    .line 717
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x1b

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x9

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 719
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0xe

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0xe

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 720
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x9

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x1b

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 721
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0xe

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x28

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 723
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x1b

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x2d

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 725
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x28

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x28

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 726
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x2d

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0x1b

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 727
    new-instance v2, Landroid/graphics/Point;

    mul-int/lit8 v8, p1, 0x28

    invoke-static {v8}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v8

    mul-int/lit8 v10, p1, 0xe

    invoke-static {v10}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v10

    invoke-direct {v2, v8, v10}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 728
    const/4 v2, 0x0

    move v12, v2

    move v13, v5

    move v2, v6

    .line 729
    goto/16 :goto_0

    :cond_6
    move/from16 v17, v5

    .line 754
    goto/16 :goto_1

    .line 763
    :cond_7
    const/4 v5, 0x0

    goto/16 :goto_3

    .line 799
    :cond_8
    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lkik/a/d/k;->m()Z

    move-result v2

    if-eqz v2, :cond_9

    .line 801
    sget-object v10, Lkik/android/util/e;->d:Landroid/graphics/Bitmap;

    goto/16 :goto_4

    .line 804
    :cond_9
    invoke-virtual {v10}, Lkik/android/util/e$b;->a()Landroid/graphics/Bitmap;

    move-result-object v10

    goto/16 :goto_4

    .line 812
    :cond_a
    invoke-virtual/range {v20 .. v20}, Ljava/util/ArrayList;->size()I

    move-result v2

    move/from16 v0, v16

    if-ge v0, v2, :cond_d

    .line 813
    move-object/from16 v0, v20

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/Point;

    move v5, v15

    move-object/from16 v7, v22

    move/from16 v8, v19

    .line 814
    invoke-static/range {v5 .. v11}, Lkik/android/util/e;->a(ILandroid/graphics/Point;Landroid/graphics/Canvas;ILandroid/graphics/Path;Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)Landroid/graphics/BitmapShader;

    move-result-object v2

    .line 815
    if-nez v16, :cond_d

    move v5, v15

    .line 816
    goto/16 :goto_5

    .line 821
    :cond_b
    if-eqz v13, :cond_c

    if-eqz v14, :cond_c

    .line 822
    const/4 v2, 0x0

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroid/graphics/Point;

    .line 824
    invoke-virtual/range {v22 .. v22}, Landroid/graphics/Canvas;->save()I

    .line 826
    const/4 v3, 0x0

    const/4 v4, 0x0

    iget v2, v8, Landroid/graphics/Point;->x:I

    add-int/2addr v2, v12

    int-to-float v5, v2

    iget v2, v8, Landroid/graphics/Point;->y:I

    add-int/2addr v2, v15

    int-to-float v6, v2

    sget-object v7, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    move-object/from16 v2, v22

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->clipRect(FFFFLandroid/graphics/Region$Op;)Z

    .line 828
    invoke-virtual {v9}, Landroid/graphics/Path;->reset()V

    .line 829
    iget v2, v8, Landroid/graphics/Point;->x:I

    int-to-float v2, v2

    iget v3, v8, Landroid/graphics/Point;->y:I

    int-to-float v3, v3

    int-to-float v4, v15

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    move/from16 v0, v19

    int-to-float v5, v0

    add-float/2addr v4, v5

    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v9, v2, v3, v4, v5}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 830
    sget-object v2, Lkik/android/util/e;->f:Landroid/graphics/Paint;

    move-object/from16 v0, v22

    invoke-virtual {v0, v9, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 833
    invoke-virtual {v9}, Landroid/graphics/Path;->reset()V

    .line 834
    iget v2, v8, Landroid/graphics/Point;->x:I

    int-to-float v2, v2

    iget v3, v8, Landroid/graphics/Point;->y:I

    int-to-float v3, v3

    int-to-float v4, v15

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v9, v2, v3, v4, v5}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 835
    sget-object v2, Lkik/android/util/e;->e:Landroid/graphics/Paint;

    invoke-virtual {v2, v14}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 836
    sget-object v2, Lkik/android/util/e;->e:Landroid/graphics/Paint;

    move-object/from16 v0, v22

    invoke-virtual {v0, v9, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 837
    invoke-virtual/range {v22 .. v22}, Landroid/graphics/Canvas;->restore()V

    .line 839
    :cond_c
    move-object/from16 v0, v21

    move-object/from16 v1, v18

    iput-object v0, v1, Lkik/android/util/e$a;->a:Landroid/graphics/Bitmap;

    .line 840
    return-object v18

    :cond_d
    move-object v2, v14

    move v5, v15

    goto/16 :goto_5

    .line 659
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private static a(ILandroid/graphics/Point;Landroid/graphics/Canvas;Landroid/graphics/Path;F)V
    .locals 4

    .prologue
    .line 943
    invoke-virtual {p3}, Landroid/graphics/Path;->reset()V

    .line 947
    sget-object v0, Lkik/android/util/e;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, p4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 948
    iget v0, p1, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, p1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    int-to-float v2, p0

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v2, p4

    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {p3, v0, v1, v2, v3}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 949
    sget-object v0, Lkik/android/util/e;->g:Landroid/graphics/Paint;

    invoke-virtual {p2, p3, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 950
    return-void
.end method

.method private static a(ILandroid/graphics/Point;Landroid/graphics/Canvas;Landroid/graphics/Path;I)V
    .locals 5

    .prologue
    const/high16 v4, 0x40000000    # 2.0f

    .line 954
    if-nez p1, :cond_0

    .line 963
    :goto_0
    return-void

    .line 957
    :cond_0
    invoke-virtual {p3}, Landroid/graphics/Path;->reset()V

    .line 958
    iget v0, p1, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, p1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    int-to-float v2, p0

    div-float/2addr v2, v4

    int-to-float v3, p4

    add-float/2addr v2, v3

    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {p3, v0, v1, v2, v3}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 959
    sget-object v0, Lkik/android/util/e;->f:Landroid/graphics/Paint;

    invoke-virtual {p2, p3, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 960
    invoke-virtual {p3}, Landroid/graphics/Path;->reset()V

    .line 961
    iget v0, p1, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget v1, p1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    int-to-float v2, p0

    div-float/2addr v2, v4

    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {p3, v0, v1, v2, v3}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 962
    sget-object v0, Lkik/android/util/e;->h:Landroid/graphics/Paint;

    invoke-virtual {p2, p3, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_0
.end method

.method public static a(Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 434
    sget-object v1, Lkik/android/util/e;->b:Lkik/android/util/br;

    monitor-enter v1

    .line 435
    :try_start_0
    sget-object v0, Lkik/android/util/e;->b:Lkik/android/util/br;

    new-instance v2, Ljava/lang/ref/SoftReference;

    invoke-direct {v2, p0}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, v2}, Lkik/android/util/br;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static a(Landroid/graphics/Bitmap;)[B
    .locals 3

    .prologue
    .line 362
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 363
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x64

    invoke-virtual {p0, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 364
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 366
    :try_start_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 369
    :goto_0
    return-object v1

    :catch_0
    move-exception v0

    goto :goto_0
.end method
