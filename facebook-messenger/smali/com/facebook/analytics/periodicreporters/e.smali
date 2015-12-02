.class public Lcom/facebook/analytics/periodicreporters/e;
.super Ljava/lang/Object;
.source "DeviceInfoPeriodicReporter.java"

# interfaces
.implements Lcom/facebook/analytics/periodicreporters/l;


# instance fields
.field private a:J

.field private final b:Lcom/facebook/analytics/c/e;

.field private final c:Landroid/content/Context;

.field private final d:Landroid/content/pm/PackageManager;

.field private final e:Landroid/app/ActivityManager;

.field private final f:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable",
            "<",
            "Lcom/facebook/analytics/periodicreporters/j;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/analytics/c/e;Landroid/content/pm/PackageManager;Landroid/app/ActivityManager;Ljava/lang/Iterable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/analytics/c/e;",
            "Landroid/content/pm/PackageManager;",
            "Landroid/app/ActivityManager;",
            "Ljava/lang/Iterable",
            "<",
            "Lcom/facebook/analytics/periodicreporters/j;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/analytics/periodicreporters/e;->a:J

    .line 60
    iput-object p1, p0, Lcom/facebook/analytics/periodicreporters/e;->c:Landroid/content/Context;

    .line 61
    iput-object p2, p0, Lcom/facebook/analytics/periodicreporters/e;->b:Lcom/facebook/analytics/c/e;

    .line 62
    iput-object p3, p0, Lcom/facebook/analytics/periodicreporters/e;->d:Landroid/content/pm/PackageManager;

    .line 63
    iput-object p4, p0, Lcom/facebook/analytics/periodicreporters/e;->e:Landroid/app/ActivityManager;

    .line 64
    invoke-static {p5}, Lcom/google/common/a/fi;->a(Ljava/lang/Iterable;)Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/periodicreporters/e;->f:Ljava/lang/Iterable;

    .line 65
    return-void
.end method

.method private a()J
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 79
    iget-wide v0, p0, Lcom/facebook/analytics/periodicreporters/e;->a:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 80
    iget-object v0, p0, Lcom/facebook/analytics/periodicreporters/e;->b:Lcom/facebook/analytics/c/e;

    sget-object v1, Lcom/facebook/analytics/c/b;->g:Lcom/facebook/analytics/c/c;

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/analytics/c/e;->a(Lcom/facebook/common/s/a;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/analytics/periodicreporters/e;->a:J

    .line 84
    :cond_0
    iget-wide v0, p0, Lcom/facebook/analytics/periodicreporters/e;->a:J

    return-wide v0
.end method

.method private a(Landroid/util/DisplayMetrics;)Landroid/graphics/Point;
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    .line 146
    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    .line 147
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xe

    if-lt v0, v2, :cond_0

    .line 148
    iget-object v0, p0, Lcom/facebook/analytics/periodicreporters/e;->c:Landroid/content/Context;

    const-string v2, "window"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 149
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 154
    :goto_0
    return-object v1

    .line 151
    :cond_0
    iget v0, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, v1, Landroid/graphics/Point;->x:I

    .line 152
    iget v0, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, v1, Landroid/graphics/Point;->y:I

    goto :goto_0
.end method

.method private static a(Landroid/content/Context;)Lcom/fasterxml/jackson/databind/node/ObjectNode;
    .locals 4

    .prologue
    .line 158
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v0

    .line 159
    new-instance v2, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v2, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 160
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 161
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    goto :goto_0

    .line 163
    :cond_0
    return-object v2
.end method

.method private a(Lcom/facebook/analytics/cb;)V
    .locals 8

    .prologue
    const-wide/16 v2, 0x0

    .line 168
    .line 171
    :try_start_0
    new-instance v0, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 172
    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v1

    int-to-long v4, v1

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    int-to-long v6, v1

    mul-long/2addr v4, v6

    .line 173
    :try_start_1
    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockCount()I

    move-result v1

    int-to-long v6, v1

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    move-result v0

    int-to-long v0, v0

    mul-long/2addr v0, v6

    .line 176
    :goto_0
    const-string v6, "device_free_space"

    invoke-virtual {p1, v6, v4, v5}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 177
    const-string v4, "device_total_space"

    invoke-virtual {p1, v4, v0, v1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 182
    :try_start_2
    new-instance v4, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 183
    invoke-virtual {v4}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v4}, Landroid/os/StatFs;->getBlockSize()I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-result v5

    int-to-long v5, v5

    mul-long/2addr v0, v5

    .line 184
    :try_start_3
    invoke-virtual {v4}, Landroid/os/StatFs;->getBlockSize()I

    move-result v5

    int-to-long v5, v5

    invoke-virtual {v4}, Landroid/os/StatFs;->getBlockCount()I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    move-result v2

    int-to-long v2, v2

    mul-long/2addr v2, v5

    .line 187
    :goto_1
    const-string v4, "sd_free_space"

    invoke-virtual {p1, v4, v0, v1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 188
    const-string v0, "sd_total_space"

    invoke-virtual {p1, v0, v2, v3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 189
    return-void

    .line 174
    :catch_0
    move-exception v0

    move-wide v0, v2

    :goto_2
    move-wide v4, v0

    move-wide v0, v2

    goto :goto_0

    .line 185
    :catch_1
    move-exception v0

    move-wide v0, v2

    goto :goto_1

    :catch_2
    move-exception v4

    goto :goto_1

    .line 174
    :catch_3
    move-exception v0

    move-wide v0, v4

    goto :goto_2
.end method

.method private b(JLjava/lang/String;)Lcom/facebook/analytics/ca;
    .locals 6

    .prologue
    .line 98
    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v0, "device_info"

    invoke-direct {v1, v0}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 99
    invoke-virtual {v1, p1, p2}, Lcom/facebook/analytics/cb;->a(J)Lcom/facebook/analytics/ca;

    .line 100
    invoke-virtual {v1, p3}, Lcom/facebook/analytics/cb;->c(Ljava/lang/String;)Lcom/facebook/analytics/ca;

    .line 102
    iget-object v0, p0, Lcom/facebook/analytics/periodicreporters/e;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    .line 103
    invoke-direct {p0, v2}, Lcom/facebook/analytics/periodicreporters/e;->a(Landroid/util/DisplayMetrics;)Landroid/graphics/Point;

    move-result-object v3

    .line 104
    iget-object v0, p0, Lcom/facebook/analytics/periodicreporters/e;->f:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/periodicreporters/j;

    .line 105
    invoke-interface {v0, v1}, Lcom/facebook/analytics/periodicreporters/j;->a(Lcom/facebook/analytics/cb;)V

    goto :goto_0

    .line 107
    :cond_0
    const-string v0, "device_type"

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v1, v0, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 108
    const-string v0, "brand"

    sget-object v4, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v1, v0, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 109
    const-string v0, "manufacturer"

    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v1, v0, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 110
    const-string v0, "os_type"

    const-string v4, "Android"

    invoke-virtual {v1, v0, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 111
    const-string v0, "os_ver"

    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v1, v0, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 112
    const-string v0, "density"

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    float-to-double v4, v2

    invoke-virtual {v1, v0, v4, v5}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;D)Lcom/facebook/analytics/cb;

    .line 113
    const-string v0, "screen_width"

    iget v2, v3, Landroid/graphics/Point;->x:I

    invoke-virtual {v1, v0, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 114
    const-string v0, "screen_height"

    iget v2, v3, Landroid/graphics/Point;->y:I

    invoke-virtual {v1, v0, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 115
    const-string v0, "front_camera"

    iget-object v2, p0, Lcom/facebook/analytics/periodicreporters/e;->d:Landroid/content/pm/PackageManager;

    const-string v3, "android.hardware.camera.front"

    invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    .line 117
    const-string v0, "rear_camera"

    iget-object v2, p0, Lcom/facebook/analytics/periodicreporters/e;->d:Landroid/content/pm/PackageManager;

    const-string v3, "android.hardware.camera"

    invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    .line 119
    const-string v0, "allows_non_market_installs"

    iget-object v2, p0, Lcom/facebook/analytics/periodicreporters/e;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    const-string v3, "install_non_market_apps"

    invoke-static {v2, v3}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 122
    const-string v0, "android_id"

    iget-object v2, p0, Lcom/facebook/analytics/periodicreporters/e;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    const-string v3, "android_id"

    invoke-static {v2, v3}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 125
    const-string v0, "preferences"

    iget-object v2, p0, Lcom/facebook/analytics/periodicreporters/e;->c:Landroid/content/Context;

    invoke-static {v2}, Lcom/facebook/analytics/periodicreporters/e;->a(Landroid/content/Context;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/analytics/cb;

    .line 126
    const-string v0, "opengl_version"

    iget-object v2, p0, Lcom/facebook/analytics/periodicreporters/e;->e:Landroid/app/ActivityManager;

    invoke-virtual {v2}, Landroid/app/ActivityManager;->getDeviceConfigurationInfo()Landroid/content/pm/ConfigurationInfo;

    move-result-object v2

    iget v2, v2, Landroid/content/pm/ConfigurationInfo;->reqGlEsVersion:I

    invoke-virtual {v1, v0, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 128
    invoke-direct {p0}, Lcom/facebook/analytics/periodicreporters/e;->b()Lcom/facebook/analytics/periodicreporters/h;

    move-result-object v0

    .line 130
    const-string v2, "google_play_services_installation"

    invoke-static {v0}, Lcom/facebook/analytics/periodicreporters/h;->a(Lcom/facebook/analytics/periodicreporters/h;)Lcom/facebook/analytics/periodicreporters/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/analytics/periodicreporters/i;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 133
    const-string v2, "google_play_services_version"

    invoke-static {v0}, Lcom/facebook/analytics/periodicreporters/h;->b(Lcom/facebook/analytics/periodicreporters/h;)I

    move-result v0

    invoke-virtual {v1, v2, v0}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 136
    const-string v0, "device"

    invoke-virtual {v1, v0}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 138
    invoke-direct {p0, v1}, Lcom/facebook/analytics/periodicreporters/e;->a(Lcom/facebook/analytics/cb;)V

    .line 139
    invoke-direct {p0, v1}, Lcom/facebook/analytics/periodicreporters/e;->b(Lcom/facebook/analytics/cb;)V

    .line 141
    return-object v1
.end method

.method private b()Lcom/facebook/analytics/periodicreporters/h;
    .locals 4

    .prologue
    const/4 v3, -0x1

    .line 270
    :try_start_0
    iget-object v0, p0, Lcom/facebook/analytics/periodicreporters/e;->d:Landroid/content/pm/PackageManager;

    const-string v1, "com.android.vending"

    const/16 v2, 0x40

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 278
    :try_start_1
    iget-object v0, p0, Lcom/facebook/analytics/periodicreporters/e;->d:Landroid/content/pm/PackageManager;

    const-string v1, "com.google.android.gms"

    const/16 v2, 0x40

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    .line 288
    :try_start_2
    iget-object v0, p0, Lcom/facebook/analytics/periodicreporters/e;->d:Landroid/content/pm/PackageManager;

    const-string v2, "com.google.android.gms"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v0

    .line 294
    iget-boolean v0, v0, Landroid/content/pm/ApplicationInfo;->enabled:Z

    if-nez v0, :cond_0

    .line 295
    new-instance v0, Lcom/facebook/analytics/periodicreporters/h;

    sget-object v2, Lcom/facebook/analytics/periodicreporters/i;->SERVICE_DISABLED:Lcom/facebook/analytics/periodicreporters/i;

    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-direct {v0, v2, v1}, Lcom/facebook/analytics/periodicreporters/h;-><init>(Lcom/facebook/analytics/periodicreporters/i;I)V

    .line 299
    :goto_0
    return-object v0

    .line 271
    :catch_0
    move-exception v0

    .line 272
    new-instance v0, Lcom/facebook/analytics/periodicreporters/h;

    sget-object v1, Lcom/facebook/analytics/periodicreporters/i;->SERVICE_MISSING:Lcom/facebook/analytics/periodicreporters/i;

    invoke-direct {v0, v1, v3}, Lcom/facebook/analytics/periodicreporters/h;-><init>(Lcom/facebook/analytics/periodicreporters/i;I)V

    goto :goto_0

    .line 281
    :catch_1
    move-exception v0

    .line 282
    new-instance v0, Lcom/facebook/analytics/periodicreporters/h;

    sget-object v1, Lcom/facebook/analytics/periodicreporters/i;->SERVICE_MISSING:Lcom/facebook/analytics/periodicreporters/i;

    invoke-direct {v0, v1, v3}, Lcom/facebook/analytics/periodicreporters/h;-><init>(Lcom/facebook/analytics/periodicreporters/i;I)V

    goto :goto_0

    .line 289
    :catch_2
    move-exception v0

    .line 290
    new-instance v0, Lcom/facebook/analytics/periodicreporters/h;

    sget-object v2, Lcom/facebook/analytics/periodicreporters/i;->SERVICE_MISSING:Lcom/facebook/analytics/periodicreporters/i;

    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-direct {v0, v2, v1}, Lcom/facebook/analytics/periodicreporters/h;-><init>(Lcom/facebook/analytics/periodicreporters/i;I)V

    goto :goto_0

    .line 299
    :cond_0
    new-instance v0, Lcom/facebook/analytics/periodicreporters/h;

    sget-object v2, Lcom/facebook/analytics/periodicreporters/i;->SERVICE_ENABLED:Lcom/facebook/analytics/periodicreporters/i;

    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-direct {v0, v2, v1}, Lcom/facebook/analytics/periodicreporters/h;-><init>(Lcom/facebook/analytics/periodicreporters/i;I)V

    goto :goto_0
.end method

.method private b(J)V
    .locals 2

    .prologue
    .line 88
    iput-wide p1, p0, Lcom/facebook/analytics/periodicreporters/e;->a:J

    .line 89
    iget-object v0, p0, Lcom/facebook/analytics/periodicreporters/e;->b:Lcom/facebook/analytics/c/e;

    sget-object v1, Lcom/facebook/analytics/c/b;->g:Lcom/facebook/analytics/c/c;

    invoke-virtual {v0, v1, p1, p2}, Lcom/facebook/analytics/c/e;->b(Lcom/facebook/common/s/a;J)V

    .line 90
    return-void
.end method

.method private b(Lcom/facebook/analytics/cb;)V
    .locals 13

    .prologue
    const/4 v0, 0x0

    .line 223
    const-wide/16 v1, 0x0

    .line 224
    new-instance v4, Lcom/fasterxml/jackson/databind/node/ArrayNode;

    sget-object v3, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v4, v3}, Lcom/fasterxml/jackson/databind/node/ArrayNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 227
    :try_start_0
    new-instance v3, Ljava/io/File;

    iget-object v5, p0, Lcom/facebook/analytics/periodicreporters/e;->c:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    const-string v6, "databases"

    invoke-direct {v3, v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v5

    .line 229
    new-instance v6, Ljava/util/ArrayList;

    array-length v3, v5

    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 230
    array-length v7, v5

    move v3, v0

    :goto_0
    if-ge v3, v7, :cond_0

    aget-object v8, v5, v3

    .line 231
    invoke-virtual {v8}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 232
    invoke-virtual {v8}, Ljava/io/File;->length()J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v9

    add-long v0, v1, v9

    .line 233
    :try_start_1
    new-instance v2, Lcom/facebook/analytics/periodicreporters/f;

    invoke-direct {v2, v8}, Lcom/facebook/analytics/periodicreporters/f;-><init>(Ljava/io/File;)V

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 230
    :goto_1
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    move-wide v11, v0

    move-wide v1, v11

    goto :goto_0

    .line 237
    :cond_0
    :try_start_2
    invoke-static {}, Lcom/facebook/analytics/periodicreporters/f;->a()Ljava/util/Comparator;

    move-result-object v0

    invoke-static {v6, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 238
    const/4 v0, 0x7

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 239
    const/4 v3, 0x0

    invoke-interface {v6, v3, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    .line 240
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/periodicreporters/f;

    .line 241
    invoke-static {v0}, Lcom/facebook/analytics/periodicreporters/f;->b(Lcom/facebook/analytics/periodicreporters/f;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/fasterxml/jackson/databind/node/ArrayNode;->add(Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/fasterxml/jackson/databind/node/ArrayNode;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    .line 243
    :catch_0
    move-exception v0

    .line 246
    :cond_1
    :goto_3
    const-string v0, "db_folder_size"

    invoke-virtual {p1, v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 247
    const-string v0, "db_top_sizes"

    invoke-virtual {p1, v0, v4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;)Lcom/facebook/analytics/cb;

    .line 248
    return-void

    .line 243
    :catch_1
    move-exception v2

    move-wide v1, v0

    goto :goto_3

    :cond_2
    move-wide v0, v1

    goto :goto_1
.end method


# virtual methods
.method public a(JLjava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/facebook/analytics/ca;",
            ">;"
        }
    .end annotation

    .prologue
    .line 74
    invoke-direct {p0, p1, p2}, Lcom/facebook/analytics/periodicreporters/e;->b(J)V

    .line 75
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/analytics/periodicreporters/e;->b(JLjava/lang/String;)Lcom/facebook/analytics/ca;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(J)Z
    .locals 4

    .prologue
    .line 69
    invoke-direct {p0}, Lcom/facebook/analytics/periodicreporters/e;->a()J

    move-result-wide v0

    sub-long v0, p1, v0

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
