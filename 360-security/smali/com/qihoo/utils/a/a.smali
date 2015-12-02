.class public Lcom/qihoo/utils/a/a;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static e:Lcom/qihoo/utils/a/a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/util/DisplayMetrics;

.field private final c:Landroid/content/res/Configuration;

.field private d:I


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/utils/a/a;->d:I

    .line 40
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/utils/a/a;->a:Landroid/content/Context;

    .line 41
    iget-object v0, p0, Lcom/qihoo/utils/a/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/utils/a/a;->b:Landroid/util/DisplayMetrics;

    .line 42
    iget-object v0, p0, Lcom/qihoo/utils/a/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/utils/a/a;->c:Landroid/content/res/Configuration;

    .line 43
    iget-object v0, p0, Lcom/qihoo/utils/a/a;->a:Landroid/content/Context;

    const/high16 v1, 0x42400000    # 48.0f

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/qihoo/utils/a/a;->d:I

    .line 44
    return-void
.end method

.method private a(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 81
    const/4 v1, 0x0

    .line 84
    new-instance v2, Landroid/content/res/AssetManager;

    invoke-direct {v2}, Landroid/content/res/AssetManager;-><init>()V

    .line 85
    iget-object v0, p1, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    invoke-virtual {v2, v0}, Landroid/content/res/AssetManager;->addAssetPath(Ljava/lang/String;)I

    .line 87
    new-instance v3, Landroid/content/res/Resources;

    iget-object v0, p0, Lcom/qihoo/utils/a/a;->b:Landroid/util/DisplayMetrics;

    iget-object v4, p0, Lcom/qihoo/utils/a/a;->c:Landroid/content/res/Configuration;

    invoke-direct {v3, v2, v0, v4}, Landroid/content/res/Resources;-><init>(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V

    .line 90
    :try_start_0
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 91
    const/4 v4, 0x1

    iput-boolean v4, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 92
    iget v4, p1, Landroid/content/pm/ApplicationInfo;->icon:I

    invoke-static {v3, v4, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 93
    iget v4, p0, Lcom/qihoo/utils/a/a;->d:I

    iget v5, p0, Lcom/qihoo/utils/a/a;->d:I

    invoke-virtual {p0, v0, v4, v5}, Lcom/qihoo/utils/a/a;->a(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v4

    iput v4, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 95
    const/4 v5, -0x1

    if-ne v4, v5, :cond_1

    .line 96
    iget-object v0, p0, Lcom/qihoo/utils/a/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/pm/PackageManager;->getDefaultActivityIcon()Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 109
    :goto_0
    invoke-virtual {v2}, Landroid/content/res/AssetManager;->close()V

    .line 112
    :goto_1
    if-nez v0, :cond_0

    .line 113
    iget-object v0, p0, Lcom/qihoo/utils/a/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/pm/PackageManager;->getDefaultActivityIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 116
    :cond_0
    return-object v0

    .line 97
    :cond_1
    if-ne v4, v6, :cond_2

    .line 98
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/utils/a/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/pm/ApplicationInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    .line 100
    :cond_2
    const/4 v4, 0x0

    iput-boolean v4, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 101
    iget v4, p1, Landroid/content/pm/ApplicationInfo;->icon:I

    invoke-static {v3, v4, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 102
    if-eqz v4, :cond_3

    .line 103
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v0, v3, v4}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 106
    :catch_0
    move-exception v0

    .line 107
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 109
    invoke-virtual {v2}, Landroid/content/res/AssetManager;->close()V

    move-object v0, v1

    .line 110
    goto :goto_1

    .line 109
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Landroid/content/res/AssetManager;->close()V

    throw v0

    :cond_3
    move-object v0, v1

    goto :goto_0
.end method

.method public static a()Lcom/qihoo/utils/a/a;
    .locals 1

    .prologue
    .line 47
    sget-object v0, Lcom/qihoo/utils/a/a;->e:Lcom/qihoo/utils/a/a;

    if-nez v0, :cond_0

    .line 48
    new-instance v0, Lcom/qihoo/utils/a/a;

    invoke-direct {v0}, Lcom/qihoo/utils/a/a;-><init>()V

    sput-object v0, Lcom/qihoo/utils/a/a;->e:Lcom/qihoo/utils/a/a;

    .line 50
    :cond_0
    sget-object v0, Lcom/qihoo/utils/a/a;->e:Lcom/qihoo/utils/a/a;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/graphics/BitmapFactory$Options;II)I
    .locals 4

    .prologue
    const/4 v1, -0x1

    .line 120
    iget v2, p1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 121
    iget v3, p1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 123
    const/4 v0, 0x1

    .line 125
    if-eq v2, v1, :cond_0

    if-ne v3, v1, :cond_2

    :cond_0
    move v0, v1

    .line 140
    :cond_1
    return v0

    .line 131
    :cond_2
    :goto_0
    div-int v1, v3, p2

    if-le v1, v0, :cond_3

    .line 132
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 136
    :cond_3
    :goto_1
    div-int v1, v2, p3

    if-le v1, v0, :cond_1

    .line 137
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 3

    .prologue
    .line 54
    const/4 v0, 0x0

    .line 56
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/utils/a/a;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 57
    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    .line 58
    invoke-direct {p0, v1}, Lcom/qihoo/utils/a/a;->a(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 62
    :goto_0
    return-object v0

    .line 59
    :catch_0
    move-exception v1

    .line 60
    invoke-virtual {v1}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    goto :goto_0
.end method

.method public b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 3

    .prologue
    .line 66
    const/4 v0, 0x0

    .line 68
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/utils/a/a;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 69
    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 70
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 71
    iput-object p1, v1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 72
    iput-object p1, v1, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 73
    invoke-direct {p0, v1}, Lcom/qihoo/utils/a/a;->a(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 77
    :goto_0
    return-object v0

    .line 74
    :catch_0
    move-exception v1

    .line 75
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method
