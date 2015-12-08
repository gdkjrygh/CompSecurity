.class public final Lcom/roidapp/photogrid/common/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lcom/roidapp/photogrid/common/a;

.field private static final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Z

.field public b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 18
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/photogrid/common/a;->c:Lcom/roidapp/photogrid/common/a;

    .line 79
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "LG-E400"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "LG-E405"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "LG-L38C"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "LGL35G"

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/roidapp/photogrid/common/a;->d:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-boolean v0, p0, Lcom/roidapp/photogrid/common/a;->a:Z

    .line 21
    iput-boolean v0, p0, Lcom/roidapp/photogrid/common/a;->b:Z

    .line 25
    return-void
.end method

.method public static declared-synchronized a()Lcom/roidapp/photogrid/common/a;
    .locals 2

    .prologue
    .line 28
    const-class v1, Lcom/roidapp/photogrid/common/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/roidapp/photogrid/common/a;->c:Lcom/roidapp/photogrid/common/a;

    if-nez v0, :cond_0

    .line 29
    new-instance v0, Lcom/roidapp/photogrid/common/a;

    invoke-direct {v0}, Lcom/roidapp/photogrid/common/a;-><init>()V

    sput-object v0, Lcom/roidapp/photogrid/common/a;->c:Lcom/roidapp/photogrid/common/a;

    .line 31
    :cond_0
    sget-object v0, Lcom/roidapp/photogrid/common/a;->c:Lcom/roidapp/photogrid/common/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 28
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 4

    .prologue
    .line 38
    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v0

    const-string v1, "other"

    const-string v2, "ad_error_hide"

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Z)Z
    .locals 3

    .prologue
    .line 65
    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v0

    const-string v1, "admob"

    const-string v2, "country"

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/a/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 66
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    .line 67
    const-string v2, "locale"

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    .line 69
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 70
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 71
    const/4 v0, 0x0

    .line 76
    :goto_0
    return v0

    :cond_1
    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v0

    const-string v1, "admob"

    invoke-virtual {v0, v1, p1, p2}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 53
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 54
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "is_ad_error"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 55
    return-void
.end method


# virtual methods
.method public final c(Landroid/content/Context;)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 86
    sget-object v2, Lcom/roidapp/photogrid/common/a;->d:Ljava/util/List;

    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/roidapp/baselib/c/n;->a(Ljava/lang/Iterable;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 87
    iput-boolean v0, p0, Lcom/roidapp/photogrid/common/a;->a:Z

    .line 88
    invoke-static {}, Lcom/roidapp/baselib/c/n;->d()Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iput-boolean v0, p0, Lcom/roidapp/photogrid/common/a;->b:Z

    .line 100
    :cond_0
    :goto_1
    return v0

    :cond_1
    move v0, v1

    .line 88
    goto :goto_0

    .line 1104
    :cond_2
    :try_start_0
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/roidapp/cloudlib/al;->e(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 2046
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 2047
    const-string v3, "is_ad_error"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    .line 1104
    if-eqz v2, :cond_5

    invoke-static {p1}, Lcom/roidapp/photogrid/common/a;->a(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_3
    move v2, v0

    .line 92
    :goto_2
    iput-boolean v2, p0, Lcom/roidapp/photogrid/common/a;->a:Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    :goto_3
    invoke-static {}, Lcom/roidapp/baselib/c/n;->d()Z

    move-result v2

    if-nez v2, :cond_6

    move v2, v0

    :goto_4
    iput-boolean v2, p0, Lcom/roidapp/photogrid/common/a;->b:Z

    .line 100
    iget-boolean v2, p0, Lcom/roidapp/photogrid/common/a;->a:Z

    if-eqz v2, :cond_4

    iget-boolean v2, p0, Lcom/roidapp/photogrid/common/a;->b:Z

    if-nez v2, :cond_0

    :cond_4
    move v0, v1

    goto :goto_1

    :cond_5
    move v2, v1

    .line 1104
    goto :goto_2

    .line 95
    :catch_0
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 96
    iput-boolean v0, p0, Lcom/roidapp/photogrid/common/a;->a:Z

    goto :goto_3

    :cond_6
    move v2, v1

    .line 98
    goto :goto_4
.end method
