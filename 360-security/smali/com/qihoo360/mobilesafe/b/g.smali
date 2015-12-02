.class public Lcom/qihoo360/mobilesafe/b/g;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/mobilesafe/b/g$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/util/DisplayMetrics;

.field private c:I

.field private d:I

.field private final e:Landroid/content/pm/PackageManager;

.field private final f:I

.field private g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo360/mobilesafe/b/g$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/16 v0, 0x30

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput v0, p0, Lcom/qihoo360/mobilesafe/b/g;->c:I

    .line 39
    iput v0, p0, Lcom/qihoo360/mobilesafe/b/g;->d:I

    .line 41
    const/4 v0, -0x1

    iput v0, p0, Lcom/qihoo360/mobilesafe/b/g;->f:I

    .line 57
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/b/g;->a:Landroid/content/Context;

    .line 58
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->e:Landroid/content/pm/PackageManager;

    .line 59
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->g:Ljava/util/HashMap;

    .line 61
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->b:Landroid/util/DisplayMetrics;

    .line 62
    const-string/jumbo v0, "window"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 63
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/b/g;->b:Landroid/util/DisplayMetrics;

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 64
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;II)V
    .locals 2

    .prologue
    const/16 v0, 0x30

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput v0, p0, Lcom/qihoo360/mobilesafe/b/g;->c:I

    .line 39
    iput v0, p0, Lcom/qihoo360/mobilesafe/b/g;->d:I

    .line 41
    const/4 v0, -0x1

    iput v0, p0, Lcom/qihoo360/mobilesafe/b/g;->f:I

    .line 67
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/b/g;->a:Landroid/content/Context;

    .line 68
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->e:Landroid/content/pm/PackageManager;

    .line 69
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->g:Ljava/util/HashMap;

    .line 71
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->b:Landroid/util/DisplayMetrics;

    .line 72
    const-string/jumbo v0, "window"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 73
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/b/g;->b:Landroid/util/DisplayMetrics;

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 74
    iput p2, p0, Lcom/qihoo360/mobilesafe/b/g;->c:I

    .line 75
    iput p3, p0, Lcom/qihoo360/mobilesafe/b/g;->d:I

    .line 77
    return-void
.end method

.method private a(Landroid/content/Context;F)I
    .locals 2

    .prologue
    .line 395
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 396
    mul-float/2addr v0, p2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private a(Landroid/graphics/BitmapFactory$Options;II)I
    .locals 4

    .prologue
    const/4 v1, -0x1

    .line 301
    iget v2, p1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 302
    iget v3, p1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 303
    const/4 v0, 0x1

    .line 305
    if-eq v2, v1, :cond_0

    if-ne v3, v1, :cond_2

    :cond_0
    move v0, v1

    .line 317
    :cond_1
    :goto_0
    return v0

    .line 310
    :cond_2
    if-gt v2, p3, :cond_3

    if-le v3, p2, :cond_1

    .line 311
    :cond_3
    if-le v3, v2, :cond_4

    .line 312
    int-to-float v0, v2

    int-to-float v1, p3

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    goto :goto_0

    .line 314
    :cond_4
    int-to-float v0, v3

    int-to-float v1, p2

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    goto :goto_0
.end method

.method private a(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
    .locals 8

    .prologue
    const v7, 0x7f020044

    const/4 v6, 0x1

    .line 199
    .line 200
    new-instance v1, Landroid/content/res/AssetManager;

    invoke-direct {v1}, Landroid/content/res/AssetManager;-><init>()V

    .line 201
    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/content/res/AssetManager;->addAssetPath(Ljava/lang/String;)I

    .line 203
    new-instance v0, Landroid/content/res/Configuration;

    invoke-direct {v0}, Landroid/content/res/Configuration;-><init>()V

    .line 204
    iput v6, v0, Landroid/content/res/Configuration;->screenLayout:I

    .line 206
    new-instance v2, Landroid/content/res/Resources;

    iget-object v3, p0, Lcom/qihoo360/mobilesafe/b/g;->b:Landroid/util/DisplayMetrics;

    invoke-direct {v2, v1, v3, v0}, Landroid/content/res/Resources;-><init>(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V

    .line 209
    :try_start_0
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 210
    const/4 v3, 0x1

    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 212
    iget v3, p1, Landroid/content/pm/ApplicationInfo;->icon:I

    invoke-static {v2, v3, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 216
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/b/g;->a:Landroid/content/Context;

    iget v4, p0, Lcom/qihoo360/mobilesafe/b/g;->c:I

    int-to-float v4, v4

    invoke-direct {p0, v3, v4}, Lcom/qihoo360/mobilesafe/b/g;->a(Landroid/content/Context;F)I

    move-result v3

    iget-object v4, p0, Lcom/qihoo360/mobilesafe/b/g;->a:Landroid/content/Context;

    iget v5, p0, Lcom/qihoo360/mobilesafe/b/g;->d:I

    int-to-float v5, v5

    invoke-direct {p0, v4, v5}, Lcom/qihoo360/mobilesafe/b/g;->a(Landroid/content/Context;F)I

    move-result v4

    invoke-direct {p0, v0, v3, v4}, Lcom/qihoo360/mobilesafe/b/g;->a(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v3

    iput v3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 219
    iget v3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_0

    .line 221
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f020044

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 238
    invoke-virtual {v1}, Landroid/content/res/AssetManager;->close()V

    .line 242
    :goto_0
    return-object v0

    .line 222
    :cond_0
    :try_start_1
    iget v3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    if-gt v3, v6, :cond_1

    .line 224
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->e:Landroid/content/pm/PackageManager;

    invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getApplicationIcon(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 238
    invoke-virtual {v1}, Landroid/content/res/AssetManager;->close()V

    goto :goto_0

    .line 225
    :cond_1
    :try_start_2
    iget v3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    if-le v3, v6, :cond_2

    .line 226
    const/4 v3, 0x0

    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 227
    iget v3, p1, Landroid/content/pm/ApplicationInfo;->icon:I

    invoke-static {v2, v3, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 228
    if-eqz v2, :cond_2

    .line 229
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v0, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V
    :try_end_2
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 238
    invoke-virtual {v1}, Landroid/content/res/AssetManager;->close()V

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Landroid/content/res/AssetManager;->close()V

    .line 242
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    .line 233
    :catch_0
    move-exception v0

    .line 234
    :try_start_3
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f020044

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v0

    .line 238
    invoke-virtual {v1}, Landroid/content/res/AssetManager;->close()V

    goto :goto_0

    .line 235
    :catch_1
    move-exception v0

    .line 236
    :try_start_4
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f020044

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result-object v0

    .line 238
    invoke-virtual {v1}, Landroid/content/res/AssetManager;->close()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/content/res/AssetManager;->close()V

    throw v0
.end method

.method private a(Landroid/content/pm/ApplicationInfo;I)Landroid/graphics/drawable/Drawable;
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 246
    .line 247
    new-instance v1, Landroid/content/res/AssetManager;

    invoke-direct {v1}, Landroid/content/res/AssetManager;-><init>()V

    .line 248
    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/content/res/AssetManager;->addAssetPath(Ljava/lang/String;)I

    .line 250
    new-instance v0, Landroid/content/res/Configuration;

    invoke-direct {v0}, Landroid/content/res/Configuration;-><init>()V

    .line 251
    iput v6, v0, Landroid/content/res/Configuration;->screenLayout:I

    .line 253
    new-instance v2, Landroid/content/res/Resources;

    iget-object v3, p0, Lcom/qihoo360/mobilesafe/b/g;->b:Landroid/util/DisplayMetrics;

    invoke-direct {v2, v1, v3, v0}, Landroid/content/res/Resources;-><init>(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V

    .line 256
    :try_start_0
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 257
    const/4 v3, 0x1

    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 259
    iget v3, p1, Landroid/content/pm/ApplicationInfo;->icon:I

    invoke-static {v2, v3, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 263
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/b/g;->a:Landroid/content/Context;

    iget v4, p0, Lcom/qihoo360/mobilesafe/b/g;->c:I

    int-to-float v4, v4

    invoke-direct {p0, v3, v4}, Lcom/qihoo360/mobilesafe/b/g;->a(Landroid/content/Context;F)I

    move-result v3

    iget-object v4, p0, Lcom/qihoo360/mobilesafe/b/g;->a:Landroid/content/Context;

    iget v5, p0, Lcom/qihoo360/mobilesafe/b/g;->d:I

    int-to-float v5, v5

    invoke-direct {p0, v4, v5}, Lcom/qihoo360/mobilesafe/b/g;->a(Landroid/content/Context;F)I

    move-result v4

    invoke-direct {p0, v0, v3, v4}, Lcom/qihoo360/mobilesafe/b/g;->a(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v3

    iput v3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 266
    iget v3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_0

    .line 268
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 285
    invoke-virtual {v1}, Landroid/content/res/AssetManager;->close()V

    .line 289
    :goto_0
    return-object v0

    .line 269
    :cond_0
    :try_start_1
    iget v3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    if-gt v3, v6, :cond_1

    .line 271
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->e:Landroid/content/pm/PackageManager;

    invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getApplicationIcon(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 285
    invoke-virtual {v1}, Landroid/content/res/AssetManager;->close()V

    goto :goto_0

    .line 272
    :cond_1
    :try_start_2
    iget v3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    if-le v3, v6, :cond_2

    .line 273
    const/4 v3, 0x0

    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 274
    iget v3, p1, Landroid/content/pm/ApplicationInfo;->icon:I

    invoke-static {v2, v3, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 275
    if-eqz v2, :cond_2

    .line 276
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v0, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V
    :try_end_2
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 285
    invoke-virtual {v1}, Landroid/content/res/AssetManager;->close()V

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Landroid/content/res/AssetManager;->close()V

    .line 289
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020044

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    .line 280
    :catch_0
    move-exception v0

    .line 281
    :try_start_3
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v0

    .line 285
    invoke-virtual {v1}, Landroid/content/res/AssetManager;->close()V

    goto :goto_0

    .line 282
    :catch_1
    move-exception v0

    .line 283
    :try_start_4
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result-object v0

    .line 285
    invoke-virtual {v1}, Landroid/content/res/AssetManager;->close()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/content/res/AssetManager;->close()V

    throw v0
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 3

    .prologue
    .line 122
    const/4 v0, 0x0

    .line 126
    :try_start_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/b/g;->e:Landroid/content/pm/PackageManager;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    .line 127
    if-eqz v1, :cond_0

    .line 128
    invoke-direct {p0, v1}, Lcom/qihoo360/mobilesafe/b/g;->a(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :cond_0
    move-object v1, v0

    .line 134
    :goto_0
    if-nez v1, :cond_2

    if-eqz p2, :cond_2

    .line 135
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->e:Landroid/content/pm/PackageManager;

    const/4 v2, 0x1

    invoke-virtual {v0, p2, v2}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 136
    if-eqz v0, :cond_2

    .line 137
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 138
    iput-object p2, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 139
    iput-object p2, v0, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 141
    :try_start_1
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/b/g;->e:Landroid/content/pm/PackageManager;

    invoke-virtual {v2, v0}, Landroid/content/pm/PackageManager;->getApplicationIcon(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    .line 148
    :goto_1
    if-nez v0, :cond_1

    .line 150
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020044

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 152
    :cond_1
    new-instance v1, Lcom/qihoo360/mobilesafe/b/g$a;

    invoke-direct {v1, p0, p1, v0}, Lcom/qihoo360/mobilesafe/b/g$a;-><init>(Lcom/qihoo360/mobilesafe/b/g;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 153
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/b/g;->g:Ljava/util/HashMap;

    invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    return-object v0

    .line 130
    :catch_0
    move-exception v1

    .line 131
    invoke-virtual {v1}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    move-object v1, v0

    goto :goto_0

    .line 142
    :catch_1
    move-exception v0

    .line 143
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;I)Landroid/graphics/drawable/Drawable;
    .locals 3

    .prologue
    .line 159
    const/4 v0, 0x0

    .line 163
    :try_start_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/b/g;->e:Landroid/content/pm/PackageManager;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    .line 164
    if-eqz v1, :cond_0

    .line 165
    invoke-direct {p0, v1, p3}, Lcom/qihoo360/mobilesafe/b/g;->a(Landroid/content/pm/ApplicationInfo;I)Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :cond_0
    move-object v1, v0

    .line 171
    :goto_0
    if-nez v1, :cond_2

    if-eqz p2, :cond_2

    .line 172
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->e:Landroid/content/pm/PackageManager;

    const/4 v2, 0x1

    invoke-virtual {v0, p2, v2}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 173
    if-eqz v0, :cond_2

    .line 174
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 175
    iput-object p2, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 176
    iput-object p2, v0, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 178
    :try_start_1
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/b/g;->e:Landroid/content/pm/PackageManager;

    invoke-virtual {v2, v0}, Landroid/content/pm/PackageManager;->getApplicationIcon(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    .line 185
    :goto_1
    if-nez v0, :cond_1

    .line 187
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 189
    :cond_1
    new-instance v1, Lcom/qihoo360/mobilesafe/b/g$a;

    invoke-direct {v1, p0, p1, v0}, Lcom/qihoo360/mobilesafe/b/g$a;-><init>(Lcom/qihoo360/mobilesafe/b/g;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 190
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/b/g;->g:Ljava/util/HashMap;

    invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    return-object v0

    .line 167
    :catch_0
    move-exception v1

    .line 168
    invoke-virtual {v1}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    move-object v1, v0

    goto :goto_0

    .line 179
    :catch_1
    move-exception v0

    .line 180
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 331
    const/4 v0, 0x0

    .line 333
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/b/g;->g:Ljava/util/HashMap;

    if-nez v1, :cond_0

    .line 334
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/qihoo360/mobilesafe/b/g;->g:Ljava/util/HashMap;

    .line 337
    :cond_0
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/b/g;->g:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 338
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/b/g$a;

    .line 339
    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/b/g$a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 342
    :cond_1
    if-nez v0, :cond_2

    .line 343
    invoke-direct {p0, p1, p2}, Lcom/qihoo360/mobilesafe/b/g;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 345
    :cond_2
    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 358
    const/4 v0, 0x0

    .line 360
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/b/g;->g:Ljava/util/HashMap;

    if-nez v1, :cond_0

    .line 361
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/qihoo360/mobilesafe/b/g;->g:Ljava/util/HashMap;

    .line 365
    :cond_0
    if-eqz p1, :cond_1

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/b/g;->g:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 366
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/b/g$a;

    .line 367
    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/b/g$a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 370
    :cond_1
    if-nez v0, :cond_2

    .line 371
    invoke-direct {p0, p1, p2, p3}, Lcom/qihoo360/mobilesafe/b/g;->b(Ljava/lang/String;Ljava/lang/String;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 373
    :cond_2
    return-object v0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 388
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->g:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    .line 389
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/g;->g:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 392
    :cond_0
    return-void
.end method
