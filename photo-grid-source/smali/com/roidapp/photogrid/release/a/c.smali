.class public Lcom/roidapp/photogrid/release/a/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lcom/roidapp/photogrid/release/a/c;


# instance fields
.field a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/StickerInfo;",
            ">;"
        }
    .end annotation
.end field

.field b:Lcom/roidapp/photogrid/release/a/a;

.field private c:Ljava/io/File;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 29
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/photogrid/release/a/c;->d:Lcom/roidapp/photogrid/release/a/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    const-string v1, "sticker_data_file"

    invoke-virtual {v0, v1}, Landroid/app/Application;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/a/c;->c:Ljava/io/File;

    .line 47
    return-void
.end method

.method public static a()Lcom/roidapp/photogrid/release/a/c;
    .locals 2

    .prologue
    .line 34
    sget-object v0, Lcom/roidapp/photogrid/release/a/c;->d:Lcom/roidapp/photogrid/release/a/c;

    if-nez v0, :cond_1

    .line 35
    const-class v1, Lcom/roidapp/photogrid/release/a/c;

    monitor-enter v1

    .line 36
    :try_start_0
    sget-object v0, Lcom/roidapp/photogrid/release/a/c;->d:Lcom/roidapp/photogrid/release/a/c;

    if-nez v0, :cond_0

    .line 37
    new-instance v0, Lcom/roidapp/photogrid/release/a/c;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/a/c;-><init>()V

    sput-object v0, Lcom/roidapp/photogrid/release/a/c;->d:Lcom/roidapp/photogrid/release/a/c;

    .line 39
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    :cond_1
    sget-object v0, Lcom/roidapp/photogrid/release/a/c;->d:Lcom/roidapp/photogrid/release/a/c;

    return-object v0

    .line 39
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public final b()V
    .locals 4

    .prologue
    .line 1100
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "sticker_check_cycle"

    const-wide/16 v2, -0x1

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    .line 1102
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v0, v2, v0

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    .line 1103
    const/4 v0, 0x1

    .line 59
    :goto_0
    if-eqz v0, :cond_1

    .line 2051
    iget-object v0, p0, Lcom/roidapp/photogrid/release/a/c;->b:Lcom/roidapp/photogrid/release/a/a;

    if-nez v0, :cond_0

    .line 2052
    new-instance v0, Lcom/roidapp/photogrid/release/a/a;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/a/a;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/a/c;->b:Lcom/roidapp/photogrid/release/a/a;

    .line 2054
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/a/c;->b:Lcom/roidapp/photogrid/release/a/a;

    .line 60
    iget-object v1, p0, Lcom/roidapp/photogrid/release/a/c;->c:Ljava/io/File;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/a/a;->a(Ljava/io/File;)V

    .line 62
    :cond_1
    return-void

    .line 1105
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/StickerInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/photogrid/release/a/c;->a:Ljava/util/List;

    if-nez v0, :cond_0

    .line 73
    iget-object v0, p0, Lcom/roidapp/photogrid/release/a/c;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 74
    iget-object v0, p0, Lcom/roidapp/photogrid/release/a/c;->c:Ljava/io/File;

    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 75
    new-instance v1, Lcom/google/a/k;

    invoke-direct {v1}, Lcom/google/a/k;-><init>()V

    new-instance v2, Lcom/roidapp/photogrid/release/a/d;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/a/d;-><init>(Lcom/roidapp/photogrid/release/a/c;)V

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/a/d;->b()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/google/a/k;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/a/c;->a:Ljava/util/List;

    .line 82
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/a/c;->a:Ljava/util/List;

    return-object v0

    .line 78
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/a/c;->b()V

    goto :goto_0
.end method
