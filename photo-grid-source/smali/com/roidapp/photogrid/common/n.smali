.class public final Lcom/roidapp/photogrid/common/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/roidapp/photogrid/common/n;


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 45
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 46
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 48
    :try_start_0
    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    move-result-object v0

    .line 49
    invoke-virtual {v0, p1, p2, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 54
    :goto_0
    return v0

    .line 52
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    .line 54
    const/4 v0, -0x1

    goto :goto_0
.end method

.method private static a(Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 37
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    .line 38
    const-string v1, "drawable"

    .line 39
    invoke-static {v0, p0, v1}, Lcom/roidapp/photogrid/common/n;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static a()[I
    .locals 5

    .prologue
    const/16 v4, 0x2e

    .line 12
    new-array v1, v4, [I

    .line 13
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v4, :cond_0

    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "emoji_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v3, v0, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/photogrid/common/n;->a(Ljava/lang/String;)I

    move-result v2

    aput v2, v1, v0

    .line 13
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 16
    :cond_0
    return-object v1
.end method

.method public static b()[I
    .locals 5

    .prologue
    const/16 v4, 0x24

    .line 20
    new-array v1, v4, [I

    .line 21
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v4, :cond_0

    .line 22
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "deco_2_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v3, v0, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/photogrid/common/n;->a(Ljava/lang/String;)I

    move-result v2

    aput v2, v1, v0

    .line 21
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 24
    :cond_0
    return-object v1
.end method

.method public static declared-synchronized c()Lcom/roidapp/photogrid/common/n;
    .locals 2

    .prologue
    .line 64
    const-class v1, Lcom/roidapp/photogrid/common/n;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/roidapp/photogrid/common/n;->a:Lcom/roidapp/photogrid/common/n;

    if-nez v0, :cond_0

    .line 65
    new-instance v0, Lcom/roidapp/photogrid/common/n;

    invoke-direct {v0}, Lcom/roidapp/photogrid/common/n;-><init>()V

    sput-object v0, Lcom/roidapp/photogrid/common/n;->a:Lcom/roidapp/photogrid/common/n;

    .line 67
    :cond_0
    sget-object v0, Lcom/roidapp/photogrid/common/n;->a:Lcom/roidapp/photogrid/common/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 64
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static declared-synchronized d()V
    .locals 2

    .prologue
    .line 71
    const-class v0, Lcom/roidapp/photogrid/common/n;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    sput-object v1, Lcom/roidapp/photogrid/common/n;->a:Lcom/roidapp/photogrid/common/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    monitor-exit v0

    return-void

    .line 71
    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
