.class public Lcom/facebook/orca/stickers/w;
.super Ljava/lang/Object;
.source "StickerServiceHandler.java"

# interfaces
.implements Lcom/facebook/fbservice/service/e;


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
.field private final b:Lcom/facebook/http/protocol/i;

.field private final c:Lcom/facebook/orca/protocol/methods/m;

.field private final d:Lcom/facebook/orca/protocol/methods/b;

.field private final e:Lcom/facebook/orca/stickers/c;

.field private final f:Lcom/facebook/orca/stickers/e;

.field private final g:Lcom/facebook/orca/stickers/ak;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    const-class v0, Lcom/facebook/orca/stickers/w;

    sput-object v0, Lcom/facebook/orca/stickers/w;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/http/protocol/i;Lcom/facebook/orca/protocol/methods/m;Lcom/facebook/orca/protocol/methods/b;Lcom/facebook/orca/stickers/c;Lcom/facebook/orca/stickers/e;Lcom/facebook/orca/stickers/ak;)V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lcom/facebook/orca/stickers/w;->b:Lcom/facebook/http/protocol/i;

    .line 55
    iput-object p2, p0, Lcom/facebook/orca/stickers/w;->c:Lcom/facebook/orca/protocol/methods/m;

    .line 56
    iput-object p3, p0, Lcom/facebook/orca/stickers/w;->d:Lcom/facebook/orca/protocol/methods/b;

    .line 57
    iput-object p4, p0, Lcom/facebook/orca/stickers/w;->e:Lcom/facebook/orca/stickers/c;

    .line 58
    iput-object p5, p0, Lcom/facebook/orca/stickers/w;->f:Lcom/facebook/orca/stickers/e;

    .line 59
    iput-object p6, p0, Lcom/facebook/orca/stickers/w;->g:Lcom/facebook/orca/stickers/ak;

    .line 60
    return-void
.end method

.method private b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 12

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 78
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 79
    const-string v1, "fetchStickerPacksParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchStickerPacksParams;

    .line 81
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchStickerPacksParams;->a()Lcom/facebook/orca/server/v;

    move-result-object v6

    .line 82
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchStickerPacksParams;->b()Z

    move-result v7

    .line 83
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchStickerPacksParams;->c()Lcom/facebook/fbservice/service/s;

    move-result-object v8

    .line 85
    const-string v1, "StickerServiceHandler handleFetchStickerPacks"

    invoke-static {v1}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v9

    .line 88
    const/4 v1, 0x0

    .line 92
    :try_start_0
    sget-object v4, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    if-ne v8, v4, :cond_2

    .line 93
    iget-object v3, p0, Lcom/facebook/orca/stickers/w;->b:Lcom/facebook/http/protocol/i;

    iget-object v4, p0, Lcom/facebook/orca/stickers/w;->c:Lcom/facebook/orca/protocol/methods/m;

    invoke-interface {v3, v4, v0}, Lcom/facebook/http/protocol/i;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchStickerPacksResult;

    move-object v3, v1

    move v1, v2

    .line 130
    :goto_0
    if-eqz v2, :cond_0

    .line 131
    iget-object v2, p0, Lcom/facebook/orca/stickers/w;->g:Lcom/facebook/orca/stickers/ak;

    invoke-virtual {v2}, Lcom/facebook/orca/stickers/ak;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    .line 132
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 134
    :try_start_1
    iget-object v4, p0, Lcom/facebook/orca/stickers/w;->f:Lcom/facebook/orca/stickers/e;

    invoke-virtual {v4, v6, v0}, Lcom/facebook/orca/stickers/e;->a(Lcom/facebook/orca/server/v;Lcom/facebook/orca/server/FetchStickerPacksResult;)V

    .line 135
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 137
    :try_start_2
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 142
    :cond_0
    if-eqz v1, :cond_9

    .line 143
    iget-object v1, p0, Lcom/facebook/orca/stickers/w;->e:Lcom/facebook/orca/stickers/c;

    invoke-virtual {v1, v6, v0}, Lcom/facebook/orca/stickers/c;->a(Lcom/facebook/orca/server/v;Lcom/facebook/orca/server/FetchStickerPacksResult;)Lcom/facebook/orca/server/FetchStickerPacksResult;

    move-result-object v0

    move-object v4, v0

    .line 145
    :goto_1
    if-eqz v7, :cond_1

    .line 149
    :cond_1
    new-instance v0, Lcom/facebook/orca/server/FetchStickerPacksResult;

    invoke-virtual {v4}, Lcom/facebook/orca/server/FetchStickerPacksResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v1

    invoke-virtual {v4}, Lcom/facebook/orca/server/FetchStickerPacksResult;->a()Lcom/google/common/a/es;

    move-result-object v2

    invoke-virtual {v4}, Lcom/facebook/orca/server/FetchStickerPacksResult;->f()J

    move-result-wide v4

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/server/FetchStickerPacksResult;-><init>(Lcom/facebook/fbservice/c/b;Ljava/util/List;Ljava/util/List;J)V

    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result-object v0

    .line 155
    invoke-virtual {v9}, Lcom/facebook/debug/d/e;->a()J

    return-object v0

    .line 102
    :cond_2
    :try_start_3
    iget-object v4, p0, Lcom/facebook/orca/stickers/w;->e:Lcom/facebook/orca/stickers/c;

    invoke-virtual {v4, v6}, Lcom/facebook/orca/stickers/c;->a(Lcom/facebook/orca/server/v;)Lcom/facebook/orca/server/FetchStickerPacksResult;

    move-result-object v5

    .line 103
    if-eqz v7, :cond_c

    .line 104
    iget-object v1, p0, Lcom/facebook/orca/stickers/w;->e:Lcom/facebook/orca/stickers/c;

    invoke-virtual {v1}, Lcom/facebook/orca/stickers/c;->a()Ljava/util/List;

    move-result-object v4

    .line 108
    :goto_2
    invoke-virtual {v5}, Lcom/facebook/orca/server/FetchStickerPacksResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v1

    sget-object v10, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    if-ne v1, v10, :cond_b

    .line 109
    iget-object v1, p0, Lcom/facebook/orca/stickers/w;->f:Lcom/facebook/orca/stickers/e;

    invoke-virtual {v1, v6}, Lcom/facebook/orca/stickers/e;->a(Lcom/facebook/orca/server/v;)Lcom/facebook/orca/server/FetchStickerPacksResult;

    move-result-object v5

    .line 110
    invoke-virtual {v5}, Lcom/facebook/orca/server/FetchStickerPacksResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v1

    sget-object v10, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    if-eq v1, v10, :cond_6

    move v1, v2

    .line 112
    :goto_3
    if-eqz v7, :cond_3

    if-nez v4, :cond_3

    .line 113
    iget-object v4, p0, Lcom/facebook/orca/stickers/w;->f:Lcom/facebook/orca/stickers/e;

    invoke-virtual {v4}, Lcom/facebook/orca/stickers/e;->a()Ljava/util/List;

    move-result-object v4

    .line 119
    :cond_3
    sget-object v10, Lcom/facebook/fbservice/service/s;->PREFER_CACHE_IF_UP_TO_DATE:Lcom/facebook/fbservice/service/s;

    if-ne v8, v10, :cond_4

    invoke-virtual {v5}, Lcom/facebook/orca/server/FetchStickerPacksResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v10

    sget-object v11, Lcom/facebook/fbservice/c/b;->FROM_CACHE_STALE:Lcom/facebook/fbservice/c/b;

    if-eq v10, v11, :cond_5

    :cond_4
    sget-object v10, Lcom/facebook/fbservice/service/s;->DO_NOT_CHECK_SERVER:Lcom/facebook/fbservice/service/s;

    if-eq v8, v10, :cond_a

    invoke-virtual {v5}, Lcom/facebook/orca/server/FetchStickerPacksResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v8

    sget-object v10, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    if-ne v8, v10, :cond_a

    .line 123
    :cond_5
    iget-object v1, p0, Lcom/facebook/orca/stickers/w;->b:Lcom/facebook/http/protocol/i;

    iget-object v5, p0, Lcom/facebook/orca/stickers/w;->c:Lcom/facebook/orca/protocol/methods/m;

    invoke-interface {v1, v5, v0}, Lcom/facebook/http/protocol/i;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchStickerPacksResult;

    .line 124
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchStickerPacksResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v1

    sget-object v5, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    if-eq v1, v5, :cond_7

    move v1, v2

    .line 125
    :goto_4
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchStickerPacksResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v5

    sget-object v8, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    if-eq v5, v8, :cond_8

    :goto_5
    move-object v3, v4

    goto/16 :goto_0

    :cond_6
    move v1, v3

    .line 110
    goto :goto_3

    :cond_7
    move v1, v3

    .line 124
    goto :goto_4

    :cond_8
    move v2, v3

    .line 125
    goto :goto_5

    .line 137
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 155
    :catchall_1
    move-exception v0

    invoke-virtual {v9}, Lcom/facebook/debug/d/e;->a()J

    throw v0

    :cond_9
    move-object v4, v0

    goto/16 :goto_1

    :cond_a
    move v2, v3

    move-object v0, v5

    move-object v3, v4

    goto/16 :goto_0

    :cond_b
    move v1, v3

    goto :goto_3

    :cond_c
    move-object v4, v1

    goto :goto_2
.end method

.method private c(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 6

    .prologue
    .line 161
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 162
    const-string v1, "stickerPack"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/stickers/StickerPack;

    .line 164
    iget-object v1, p0, Lcom/facebook/orca/stickers/w;->b:Lcom/facebook/http/protocol/i;

    iget-object v2, p0, Lcom/facebook/orca/stickers/w;->d:Lcom/facebook/orca/protocol/methods/b;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/i;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    new-instance v1, Lcom/facebook/orca/server/FetchStickerPacksParams;

    sget-object v2, Lcom/facebook/orca/server/v;->USER_PACKS:Lcom/facebook/orca/server/v;

    sget-object v3, Lcom/facebook/fbservice/service/s;->DO_NOT_CHECK_SERVER:Lcom/facebook/fbservice/service/s;

    invoke-direct {v1, v2, v3}, Lcom/facebook/orca/server/FetchStickerPacksParams;-><init>(Lcom/facebook/orca/server/v;Lcom/facebook/fbservice/service/s;)V

    .line 170
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 171
    const-string v3, "fetchStickerPacksParams"

    invoke-virtual {v2, v3, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 172
    new-instance v1, Lcom/facebook/fbservice/service/ad;

    sget-object v3, Lcom/facebook/orca/server/aq;->I:Lcom/facebook/fbservice/service/OperationType;

    invoke-direct {v1, v3, v2}, Lcom/facebook/fbservice/service/ad;-><init>(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    invoke-direct {p0, v1}, Lcom/facebook/orca/stickers/w;->b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 174
    invoke-virtual {v1}, Lcom/facebook/fbservice/service/OperationResult;->h()Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/server/FetchStickerPacksResult;

    .line 175
    invoke-virtual {v1}, Lcom/facebook/orca/server/FetchStickerPacksResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v2

    sget-object v3, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    if-ne v2, v3, :cond_0

    .line 176
    sget-object v0, Lcom/facebook/orca/stickers/w;->a:Ljava/lang/Class;

    const-string v1, "Couldn\'t find any cached data to update!"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 177
    iget-object v0, p0, Lcom/facebook/orca/stickers/w;->f:Lcom/facebook/orca/stickers/e;

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/e;->b()V

    .line 178
    iget-object v0, p0, Lcom/facebook/orca/stickers/w;->e:Lcom/facebook/orca/stickers/c;

    invoke-virtual {v0}, Lcom/facebook/orca/stickers/c;->b()V

    .line 179
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 204
    :goto_0
    return-object v0

    .line 181
    :cond_0
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 182
    invoke-virtual {v1}, Lcom/facebook/orca/server/FetchStickerPacksResult;->a()Lcom/google/common/a/es;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 183
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 186
    new-instance v0, Lcom/facebook/orca/server/FetchStickerPacksResult;

    sget-object v3, Lcom/facebook/fbservice/c/b;->FROM_CACHE_UP_TO_DATE:Lcom/facebook/fbservice/c/b;

    invoke-static {v2}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/orca/server/FetchStickerPacksResult;->f()J

    move-result-wide v4

    invoke-direct {v0, v3, v2, v4, v5}, Lcom/facebook/orca/server/FetchStickerPacksResult;-><init>(Lcom/facebook/fbservice/c/b;Ljava/util/List;J)V

    .line 192
    iget-object v1, p0, Lcom/facebook/orca/stickers/w;->g:Lcom/facebook/orca/stickers/ak;

    invoke-virtual {v1}, Lcom/facebook/orca/stickers/ak;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 193
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 195
    :try_start_0
    iget-object v2, p0, Lcom/facebook/orca/stickers/w;->f:Lcom/facebook/orca/stickers/e;

    sget-object v3, Lcom/facebook/orca/server/v;->USER_PACKS:Lcom/facebook/orca/server/v;

    invoke-virtual {v2, v3, v0}, Lcom/facebook/orca/stickers/e;->a(Lcom/facebook/orca/server/v;Lcom/facebook/orca/server/FetchStickerPacksResult;)V

    .line 196
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 198
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 202
    iget-object v1, p0, Lcom/facebook/orca/stickers/w;->e:Lcom/facebook/orca/stickers/c;

    sget-object v2, Lcom/facebook/orca/server/v;->USER_PACKS:Lcom/facebook/orca/server/v;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/orca/stickers/c;->a(Lcom/facebook/orca/server/v;Lcom/facebook/orca/server/FetchStickerPacksResult;)Lcom/facebook/orca/server/FetchStickerPacksResult;

    .line 204
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 198
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method private d(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 209
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 210
    const-string v1, "sticker"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/stickers/Sticker;

    .line 213
    iget-object v1, p0, Lcom/facebook/orca/stickers/w;->e:Lcom/facebook/orca/stickers/c;

    invoke-virtual {v1}, Lcom/facebook/orca/stickers/c;->a()Ljava/util/List;

    move-result-object v1

    .line 214
    if-nez v1, :cond_0

    .line 215
    iget-object v1, p0, Lcom/facebook/orca/stickers/w;->f:Lcom/facebook/orca/stickers/e;

    invoke-virtual {v1}, Lcom/facebook/orca/stickers/e;->a()Ljava/util/List;

    move-result-object v1

    .line 217
    :cond_0
    if-nez v1, :cond_1

    .line 218
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 223
    :cond_1
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 224
    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 226
    :cond_2
    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 227
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    const/16 v2, 0x10

    if-le v0, v2, :cond_3

    .line 228
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 232
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/stickers/w;->f:Lcom/facebook/orca/stickers/e;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/stickers/e;->a(Ljava/util/List;)V

    .line 233
    iget-object v0, p0, Lcom/facebook/orca/stickers/w;->e:Lcom/facebook/orca/stickers/c;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/stickers/c;->a(Ljava/util/List;)V

    .line 235
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 64
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    .line 65
    sget-object v1, Lcom/facebook/orca/server/aq;->I:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 66
    invoke-direct {p0, p1}, Lcom/facebook/orca/stickers/w;->b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 70
    :goto_0
    return-object v0

    .line 67
    :cond_0
    sget-object v1, Lcom/facebook/orca/server/aq;->J:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 68
    invoke-direct {p0, p1}, Lcom/facebook/orca/stickers/w;->c(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 69
    :cond_1
    sget-object v1, Lcom/facebook/orca/server/aq;->K:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 70
    invoke-direct {p0, p1}, Lcom/facebook/orca/stickers/w;->d(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 72
    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown operation type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
