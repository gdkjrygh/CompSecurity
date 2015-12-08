.class public Lcom/facebook/ads/internal/dto/e;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/lang/String;

.field public static b:Ljava/lang/String;

.field public static c:Ljava/lang/String;

.field public static d:Ljava/lang/String;

.field public static e:Ljava/lang/String;

.field public static f:Ljava/lang/String;

.field public static g:I

.field public static h:Ljava/lang/String;

.field public static i:I

.field public static j:Ljava/lang/String;

.field public static k:I

.field public static l:Ljava/lang/String;

.field public static m:Ljava/lang/String;

.field public static n:Ljava/lang/String;

.field public static o:Z

.field private static p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v1, 0x0

    sput-boolean v1, Lcom/facebook/ads/internal/dto/e;->p:Z

    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    sput-object v0, Lcom/facebook/ads/internal/dto/e;->a:Ljava/lang/String;

    const-string v0, ""

    sput-object v0, Lcom/facebook/ads/internal/dto/e;->b:Ljava/lang/String;

    const-string v0, ""

    sput-object v0, Lcom/facebook/ads/internal/dto/e;->c:Ljava/lang/String;

    const-string v0, ""

    sput-object v0, Lcom/facebook/ads/internal/dto/e;->d:Ljava/lang/String;

    const-string v0, ""

    sput-object v0, Lcom/facebook/ads/internal/dto/e;->e:Ljava/lang/String;

    const-string v0, ""

    sput-object v0, Lcom/facebook/ads/internal/dto/e;->f:Ljava/lang/String;

    sput v1, Lcom/facebook/ads/internal/dto/e;->g:I

    const-string v0, ""

    sput-object v0, Lcom/facebook/ads/internal/dto/e;->h:Ljava/lang/String;

    sput v1, Lcom/facebook/ads/internal/dto/e;->i:I

    const-string v0, ""

    sput-object v0, Lcom/facebook/ads/internal/dto/e;->j:Ljava/lang/String;

    sput v1, Lcom/facebook/ads/internal/dto/e;->k:I

    const-string v0, ""

    sput-object v0, Lcom/facebook/ads/internal/dto/e;->l:Ljava/lang/String;

    const-string v0, ""

    sput-object v0, Lcom/facebook/ads/internal/dto/e;->m:Ljava/lang/String;

    const-string v0, ""

    sput-object v0, Lcom/facebook/ads/internal/dto/e;->n:Ljava/lang/String;

    sput-boolean v1, Lcom/facebook/ads/internal/dto/e;->o:Z

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)V
    .locals 2

    const-class v1, Lcom/facebook/ads/internal/dto/e;

    monitor-enter v1

    :try_start_0
    sget-boolean v0, Lcom/facebook/ads/internal/dto/e;->p:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    sput-boolean v0, Lcom/facebook/ads/internal/dto/e;->p:Z

    invoke-static {p0}, Lcom/facebook/ads/internal/dto/e;->c(Landroid/content/Context;)V

    :cond_0
    invoke-static {p0}, Lcom/facebook/ads/internal/dto/e;->d(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static b(Landroid/content/Context;)V
    .locals 4

    const/4 v2, 0x0

    sget-boolean v0, Lcom/facebook/ads/internal/dto/e;->p:Z

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    const-string v0, "SDKIDFA"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v0, "attributionId"

    invoke-interface {v3, v0}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "attributionId"

    const-string v1, ""

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/ads/internal/dto/e;->m:Ljava/lang/String;

    :cond_1
    const-string v0, "advertisingId"

    invoke-interface {v3, v0}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "advertisingId"

    const-string v1, ""

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/ads/internal/dto/e;->n:Ljava/lang/String;

    const-string v0, "limitAdTracking"

    sget-boolean v1, Lcom/facebook/ads/internal/dto/e;->o:Z

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Lcom/facebook/ads/internal/dto/e;->o:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ads/internal/util/g;->a(Landroid/content/ContentResolver;)Lcom/facebook/ads/internal/util/g$a;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    :try_start_2
    invoke-static {p0, v1}, Lcom/facebook/ads/internal/f;->a(Landroid/content/Context;Lcom/facebook/ads/internal/util/g$a;)Lcom/facebook/ads/internal/f;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v2

    :goto_1
    :try_start_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    if-eqz v1, :cond_3

    iget-object v0, v1, Lcom/facebook/ads/internal/util/g$a;->a:Ljava/lang/String;

    if-eqz v0, :cond_3

    sput-object v0, Lcom/facebook/ads/internal/dto/e;->m:Ljava/lang/String;

    :cond_3
    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/facebook/ads/internal/f;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lcom/facebook/ads/internal/f;->b()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v0, :cond_4

    sput-object v0, Lcom/facebook/ads/internal/dto/e;->n:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    sput-boolean v0, Lcom/facebook/ads/internal/dto/e;->o:Z

    :cond_4
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "attributionId"

    sget-object v2, Lcom/facebook/ads/internal/dto/e;->m:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v1, "advertisingId"

    sget-object v2, Lcom/facebook/ads/internal/dto/e;->n:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v1, "limitAdTracking"

    sget-boolean v2, Lcom/facebook/ads/internal/dto/e;->o:Z

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_0

    :catch_1
    move-exception v0

    move-object v1, v2

    :goto_2
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_2
.end method

.method private static c(Landroid/content/Context;)V
    .locals 4

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v2, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    sput-object v2, Lcom/facebook/ads/internal/dto/e;->d:Ljava/lang/String;

    iget-object v2, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    sput-object v2, Lcom/facebook/ads/internal/dto/e;->f:Ljava/lang/String;

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    sput v0, Lcom/facebook/ads/internal/dto/e;->g:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/ads/internal/dto/e;->e:Ljava/lang/String;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1
    const-string v0, "phone"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_2

    sput-object v0, Lcom/facebook/ads/internal/dto/e;->h:Ljava/lang/String;

    :cond_0
    :goto_2
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_3

    sput-object v0, Lcom/facebook/ads/internal/dto/e;->b:Ljava/lang/String;

    :goto_3
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_4

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sput-object v0, Lcom/facebook/ads/internal/dto/e;->c:Ljava/lang/String;

    :goto_4
    return-void

    :catch_0
    move-exception v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to retrieve BUNDLE, APPVERS, APPBUILD"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ads/internal/dev/Debug;->v(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    :try_start_2
    const-string v0, "Failed to retrieve APPNAME"

    invoke-static {v0}, Lcom/facebook/ads/internal/dev/Debug;->v(Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to retrieve APPNAME "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ads/internal/dev/Debug;->v(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const-string v0, "Failed to retrieve CARRIER"

    invoke-static {v0}, Lcom/facebook/ads/internal/dev/Debug;->v(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    const-string v0, "Failed to retrieve MAKE"

    invoke-static {v0}, Lcom/facebook/ads/internal/dev/Debug;->v(Ljava/lang/String;)V

    goto :goto_3

    :cond_4
    const-string v0, "Failed to retrieve MODEL"

    invoke-static {v0}, Lcom/facebook/ads/internal/dev/Debug;->v(Ljava/lang/String;)V

    goto :goto_4
.end method

.method private static d(Landroid/content/Context;)V
    .locals 2

    :try_start_0
    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v1

    sput v1, Lcom/facebook/ads/internal/dto/e;->i:I

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/facebook/ads/internal/dto/e;->j:Ljava/lang/String;

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v1

    sput v1, Lcom/facebook/ads/internal/dto/e;->k:I

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getSubtypeName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/ads/internal/dto/e;->l:Ljava/lang/String;

    :goto_0
    return-void

    :cond_0
    const-string v0, "No network connection is currently active"

    invoke-static {v0}, Lcom/facebook/ads/internal/dev/Debug;->v(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "Missing permission ACCESS_NETWORK_STATE"

    invoke-static {v0}, Lcom/facebook/ads/internal/dev/Debug;->v(Ljava/lang/String;)V

    goto :goto_0
.end method
