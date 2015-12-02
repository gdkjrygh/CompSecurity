.class public Lcom/qihoo/security/clearengine/sdk/ApkScanService;
.super Landroid/app/Service;
.source "360Security"


# instance fields
.field private a:Landroid/content/Context;

.field private final b:Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService$Stub;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 62
    new-instance v0, Lcom/qihoo/security/clearengine/sdk/ApkScanService$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/clearengine/sdk/ApkScanService$1;-><init>(Lcom/qihoo/security/clearengine/sdk/ApkScanService;)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/sdk/ApkScanService;->b:Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService$Stub;

    .line 29
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/clearengine/sdk/ApkScanService;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/ApkScanService;->a:Landroid/content/Context;

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;
    .locals 6

    .prologue
    .line 122
    const/4 v0, 0x0

    .line 123
    new-instance v2, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;

    invoke-direct {v2}, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;-><init>()V

    .line 124
    iput-object p1, v2, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->path:Ljava/lang/String;

    .line 125
    new-instance v1, Ljava/io/File;

    iget-object v3, v2, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->path:Ljava/lang/String;

    invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 126
    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v4

    iput-wide v4, v2, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->size:J

    .line 127
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->desc:Ljava/lang/String;

    .line 128
    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    move-result-wide v4

    iput-wide v4, v2, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->modifyTime:J

    .line 130
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 131
    const/4 v1, 0x0

    .line 134
    :try_start_0
    iget-object v4, v2, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->path:Ljava/lang/String;

    const/16 v5, 0x1000

    invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    .line 140
    :goto_0
    if-eqz v1, :cond_1

    .line 142
    iget-object v4, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iput-object v4, v2, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->apkVersionName:Ljava/lang/String;

    .line 143
    iget v4, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    iput v4, v2, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->apkVersionCode:I

    .line 144
    iget-object v4, v1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iput-object v4, v2, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->packageName:Ljava/lang/String;

    .line 145
    iget-object v4, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v4, v4, Landroid/content/pm/ApplicationInfo;->icon:I

    iput v4, v2, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->apkIconID:I

    .line 150
    :try_start_1
    iget-object v4, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v4, v4, Landroid/content/pm/ApplicationInfo;->labelRes:I

    if-nez v4, :cond_3

    .line 151
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v3, v1}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->desc:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    .line 161
    :cond_0
    :goto_1
    const/4 v0, 0x1

    .line 167
    :cond_1
    :goto_2
    if-nez v0, :cond_2

    .line 168
    const/4 v0, 0x2

    iput v0, v2, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->dataType:I

    .line 174
    :cond_2
    return-object v2

    .line 153
    :cond_3
    :try_start_2
    iget-object v3, v2, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->path:Ljava/lang/String;

    invoke-static {p0, v3}, Lcom/qihoo/security/clearengine/sdk/ApkScanService;->b(Landroid/content/Context;Ljava/lang/String;)Landroid/content/res/Resources;

    move-result-object v3

    .line 154
    if-eqz v3, :cond_4

    .line 155
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v1, v1, Landroid/content/pm/ApplicationInfo;->labelRes:I

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->desc:Ljava/lang/String;

    .line 157
    :cond_4
    iget-object v1, v2, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->desc:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 158
    iget-object v1, v2, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->desc:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->desc:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    .line 162
    :catch_0
    move-exception v1

    goto :goto_2

    .line 135
    :catch_1
    move-exception v4

    goto :goto_0
.end method

.method private a()V
    .locals 4

    .prologue
    .line 104
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 105
    new-instance v1, Lcom/qihoo/security/clearengine/sdk/ApkScanService$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/clearengine/sdk/ApkScanService$2;-><init>(Lcom/qihoo/security/clearengine/sdk/ApkScanService;)V

    .line 115
    const-wide/16 v2, 0x64

    .line 105
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 116
    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)Landroid/content/res/Resources;
    .locals 7

    .prologue
    .line 181
    .line 184
    const/4 v2, 0x0

    .line 186
    :try_start_0
    const-string/jumbo v0, "android.content.res.AssetManager"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 187
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    .line 188
    const-string/jumbo v3, "addAssetPath"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Class;

    const/4 v5, 0x0

    const-class v6, Ljava/lang/String;

    aput-object v6, v4, v5

    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 189
    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v1, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 191
    new-instance v1, Landroid/content/res/Resources;

    check-cast v0, Landroid/content/res/AssetManager;

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    invoke-direct {v1, v0, v4, v3}, Landroid/content/res/Resources;-><init>(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    .line 196
    :goto_0
    return-object v0

    .line 192
    :catch_0
    move-exception v0

    move-object v0, v2

    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/clearengine/sdk/ApkScanService;)V
    .locals 0

    .prologue
    .line 103
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/sdk/ApkScanService;->a()V

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/ApkScanService;->b:Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService$Stub;

    return-object v0
.end method

.method public onCreate()V
    .locals 1

    .prologue
    .line 41
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 42
    invoke-virtual {p0}, Lcom/qihoo/security/clearengine/sdk/ApkScanService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/clearengine/sdk/ApkScanService;->a:Landroid/content/Context;

    .line 45
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .prologue
    .line 51
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 52
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/sdk/ApkScanService;->a()V

    .line 53
    return-void
.end method
