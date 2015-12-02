.class public Lcom/facebook/orca/stickers/c;
.super Ljava/lang/Object;
.source "StickerCache.java"


# annotations
.annotation runtime Lcom/facebook/auth/userscope/UserScoped;
.end annotation

.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private b:Lcom/facebook/common/time/a;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/stickers/Sticker;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/facebook/orca/server/FetchStickerPacksResult;

.field private e:Lcom/facebook/orca/server/FetchStickerPacksResult;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-class v0, Lcom/facebook/orca/stickers/c;

    sput-object v0, Lcom/facebook/orca/stickers/c;->a:Ljava/lang/Class;

    return-void
.end method

.method constructor <init>(Lcom/facebook/common/time/a;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/facebook/orca/stickers/c;->b:Lcom/facebook/common/time/a;

    .line 40
    return-void
.end method

.method private a(Lcom/facebook/orca/server/FetchStickerPacksResult;)Lcom/facebook/orca/server/FetchStickerPacksResult;
    .locals 1

    .prologue
    .line 95
    iput-object p1, p0, Lcom/facebook/orca/stickers/c;->d:Lcom/facebook/orca/server/FetchStickerPacksResult;

    .line 96
    iget-object v0, p0, Lcom/facebook/orca/stickers/c;->d:Lcom/facebook/orca/server/FetchStickerPacksResult;

    return-object v0
.end method

.method private a(Lcom/google/common/a/es;)Lcom/google/common/a/es;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/stickers/StickerPack;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/stickers/StickerPack;",
            ">;"
        }
    .end annotation

    .prologue
    .line 124
    new-instance v1, Lcom/google/common/a/et;

    invoke-direct {v1}, Lcom/google/common/a/et;-><init>()V

    .line 125
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/stickers/StickerPack;

    .line 126
    invoke-virtual {v0}, Lcom/facebook/orca/stickers/StickerPack;->g()I

    move-result v3

    if-nez v3, :cond_0

    .line 127
    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 130
    :cond_1
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method private b(Lcom/facebook/orca/server/FetchStickerPacksResult;)Lcom/facebook/orca/server/FetchStickerPacksResult;
    .locals 5

    .prologue
    .line 105
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchStickerPacksResult;->a()Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/stickers/c;->a(Lcom/google/common/a/es;)Lcom/google/common/a/es;

    move-result-object v0

    .line 107
    new-instance v1, Lcom/facebook/orca/server/FetchStickerPacksResult;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchStickerPacksResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchStickerPacksResult;->f()J

    move-result-wide v3

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/facebook/orca/server/FetchStickerPacksResult;-><init>(Lcom/facebook/fbservice/c/b;Ljava/util/List;J)V

    iput-object v1, p0, Lcom/facebook/orca/stickers/c;->e:Lcom/facebook/orca/server/FetchStickerPacksResult;

    .line 111
    iget-object v0, p0, Lcom/facebook/orca/stickers/c;->e:Lcom/facebook/orca/server/FetchStickerPacksResult;

    return-object v0
.end method

.method private c(Lcom/facebook/orca/server/FetchStickerPacksResult;)Lcom/facebook/fbservice/c/b;
    .locals 4

    .prologue
    .line 115
    iget-object v0, p0, Lcom/facebook/orca/stickers/c;->b:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchStickerPacksResult;->f()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    sget-object v0, Lcom/facebook/fbservice/c/b;->FROM_CACHE_UP_TO_DATE:Lcom/facebook/fbservice/c/b;

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/facebook/fbservice/c/b;->FROM_CACHE_STALE:Lcom/facebook/fbservice/c/b;

    goto :goto_0
.end method


# virtual methods
.method declared-synchronized a(Lcom/facebook/orca/server/v;)Lcom/facebook/orca/server/FetchStickerPacksResult;
    .locals 6

    .prologue
    .line 44
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/facebook/orca/stickers/d;->a:[I

    invoke-virtual {p1}, Lcom/facebook/orca/server/v;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 54
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown sticker pack type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 46
    :pswitch_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/orca/stickers/c;->d:Lcom/facebook/orca/server/FetchStickerPacksResult;

    move-object v1, v0

    .line 57
    :goto_0
    if-nez v1, :cond_0

    .line 58
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v1

    .line 59
    new-instance v0, Lcom/facebook/orca/server/FetchStickerPacksResult;

    sget-object v2, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    const-wide/16 v3, -0x1

    invoke-direct {v0, v2, v1, v3, v4}, Lcom/facebook/orca/server/FetchStickerPacksResult;-><init>(Lcom/facebook/fbservice/c/b;Ljava/util/List;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    :goto_1
    monitor-exit p0

    return-object v0

    .line 50
    :pswitch_1
    :try_start_2
    iget-object v0, p0, Lcom/facebook/orca/stickers/c;->e:Lcom/facebook/orca/server/FetchStickerPacksResult;

    move-object v1, v0

    .line 51
    goto :goto_0

    .line 62
    :cond_0
    new-instance v0, Lcom/facebook/orca/server/FetchStickerPacksResult;

    invoke-direct {p0, v1}, Lcom/facebook/orca/stickers/c;->c(Lcom/facebook/orca/server/FetchStickerPacksResult;)Lcom/facebook/fbservice/c/b;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/orca/server/FetchStickerPacksResult;->a()Lcom/google/common/a/es;

    move-result-object v3

    invoke-virtual {v1}, Lcom/facebook/orca/server/FetchStickerPacksResult;->f()J

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/facebook/orca/server/FetchStickerPacksResult;-><init>(Lcom/facebook/fbservice/c/b;Ljava/util/List;J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 44
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method declared-synchronized a(Lcom/facebook/orca/server/v;Lcom/facebook/orca/server/FetchStickerPacksResult;)Lcom/facebook/orca/server/FetchStickerPacksResult;
    .locals 3

    .prologue
    .line 78
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/facebook/orca/stickers/d;->a:[I

    invoke-virtual {p1}, Lcom/facebook/orca/server/v;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 86
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown sticker pack type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 80
    :pswitch_0
    :try_start_1
    invoke-direct {p0, p2}, Lcom/facebook/orca/stickers/c;->a(Lcom/facebook/orca/server/FetchStickerPacksResult;)Lcom/facebook/orca/server/FetchStickerPacksResult;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 83
    :goto_0
    monitor-exit p0

    return-object v0

    :pswitch_1
    :try_start_2
    invoke-direct {p0, p2}, Lcom/facebook/orca/stickers/c;->b(Lcom/facebook/orca/server/FetchStickerPacksResult;)Lcom/facebook/orca/server/FetchStickerPacksResult;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    goto :goto_0

    .line 78
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method declared-synchronized a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/stickers/Sticker;",
            ">;"
        }
    .end annotation

    .prologue
    .line 134
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/stickers/c;->c:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/stickers/Sticker;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 138
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/facebook/orca/stickers/c;->c:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    monitor-exit p0

    return-void

    .line 138
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()V
    .locals 1

    .prologue
    .line 142
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/facebook/orca/stickers/c;->c:Ljava/util/List;

    .line 143
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/stickers/c;->d:Lcom/facebook/orca/server/FetchStickerPacksResult;

    .line 144
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/stickers/c;->e:Lcom/facebook/orca/server/FetchStickerPacksResult;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    monitor-exit p0

    return-void

    .line 142
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
