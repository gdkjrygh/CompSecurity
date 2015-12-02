.class public Lcom/facebook/orca/f/g;
.super Ljava/lang/Object;
.source "CacheFetchThreadsHandler.java"


# instance fields
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/orca/f/ad;

.field private final c:Lcom/facebook/orca/f/k;

.field private final d:Lcom/facebook/common/e/h;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/f/ad;Lcom/facebook/orca/f/k;Lcom/facebook/common/e/h;)V
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const-class v0, Lcom/facebook/orca/f/g;

    iput-object v0, p0, Lcom/facebook/orca/f/g;->a:Ljava/lang/Class;

    .line 45
    iput-object p1, p0, Lcom/facebook/orca/f/g;->b:Lcom/facebook/orca/f/ad;

    .line 46
    iput-object p2, p0, Lcom/facebook/orca/f/g;->c:Lcom/facebook/orca/f/k;

    .line 47
    iput-object p3, p0, Lcom/facebook/orca/f/g;->d:Lcom/facebook/common/e/h;

    .line 48
    return-void
.end method

.method private a(Lcom/facebook/orca/server/FetchThreadParams;Ljava/lang/String;)Lcom/facebook/orca/server/FetchThreadParams;
    .locals 5
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 201
    invoke-static {}, Lcom/facebook/orca/server/FetchThreadParams;->newBuilder()Lcom/facebook/orca/server/ac;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/orca/server/FetchThreadParams;)Lcom/facebook/orca/server/ac;

    move-result-object v0

    .line 205
    iget-object v1, p0, Lcom/facebook/orca/f/g;->c:Lcom/facebook/orca/f/k;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->b()Lcom/facebook/fbservice/service/s;

    move-result-object v2

    invoke-virtual {v1, p2, v2}, Lcom/facebook/orca/f/k;->a(Ljava/lang/String;Lcom/facebook/fbservice/service/s;)Lcom/facebook/fbservice/service/s;

    move-result-object v1

    .line 208
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->b()Lcom/facebook/fbservice/service/s;

    move-result-object v2

    if-eq v1, v2, :cond_0

    .line 209
    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/ac;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->b()Lcom/facebook/fbservice/service/s;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/ac;->b(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/ac;

    .line 214
    :cond_0
    if-nez p2, :cond_1

    .line 215
    invoke-virtual {v0}, Lcom/facebook/orca/server/ac;->h()Lcom/facebook/orca/server/FetchThreadParams;

    move-result-object v0

    .line 227
    :goto_0
    return-object v0

    .line 219
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/f/g;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v1, p2}, Lcom/facebook/orca/f/ad;->c(Ljava/lang/String;)J

    move-result-wide v1

    .line 220
    iget-object v3, p0, Lcom/facebook/orca/f/g;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v3, p2}, Lcom/facebook/orca/f/ad;->d(Ljava/lang/String;)J

    move-result-wide v3

    .line 221
    cmp-long v3, v1, v3

    if-lez v3, :cond_2

    .line 222
    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/facebook/orca/server/ac;->a(Z)Lcom/facebook/orca/server/ac;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, Lcom/facebook/orca/server/ac;->a(J)Lcom/facebook/orca/server/ac;

    .line 227
    :cond_2
    invoke-virtual {v0}, Lcom/facebook/orca/server/ac;->h()Lcom/facebook/orca/server/FetchThreadParams;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;)Lcom/facebook/orca/server/FetchThreadResult;
    .locals 8
    .param p1    # Lcom/facebook/orca/threads/ThreadSummary;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/facebook/orca/threads/MessagesCollection;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 272
    if-nez p1, :cond_0

    .line 273
    sget-object v0, Lcom/facebook/orca/server/FetchThreadResult;->a:Lcom/facebook/orca/server/FetchThreadResult;

    .line 298
    :goto_0
    return-object v0

    .line 276
    :cond_0
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 277
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->C()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 278
    iget-object v3, p0, Lcom/facebook/orca/f/g;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/user/User;

    move-result-object v0

    .line 279
    if-nez v0, :cond_1

    .line 282
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/g;->b(Lcom/facebook/orca/threads/ThreadSummary;)V

    goto :goto_1

    .line 284
    :cond_1
    invoke-virtual {v2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_1

    .line 287
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/f/g;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->y()Lcom/facebook/orca/threads/FolderName;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lcom/facebook/orca/f/ad;->a(Ljava/lang/String;Lcom/facebook/orca/threads/FolderName;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_CACHE_UP_TO_DATE:Lcom/facebook/fbservice/c/b;

    .line 291
    :goto_2
    new-instance v0, Lcom/facebook/orca/server/FetchThreadResult;

    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v4

    const/4 v5, 0x0

    const-wide/16 v6, -0x1

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/server/FetchThreadResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;Lcom/google/common/a/es;Lcom/facebook/user/User;J)V

    goto :goto_0

    .line 287
    :cond_3
    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_CACHE_STALE:Lcom/facebook/fbservice/c/b;

    goto :goto_2
.end method

.method private a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/MessagesCollection;
    .locals 3
    .param p1    # Lcom/facebook/orca/threads/ThreadSummary;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 181
    if-nez p1, :cond_0

    .line 182
    const/4 v0, 0x0

    .line 186
    :goto_0
    return-object v0

    .line 184
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    .line 185
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->y()Lcom/facebook/orca/threads/FolderName;

    move-result-object v1

    .line 186
    iget-object v2, p0, Lcom/facebook/orca/f/g;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v2, v1, v0}, Lcom/facebook/orca/f/ad;->b(Lcom/facebook/orca/threads/FolderName;Ljava/lang/String;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/server/FetchThreadParams;Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;)Z
    .locals 4
    .param p2    # Lcom/facebook/orca/threads/ThreadSummary;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/facebook/orca/threads/MessagesCollection;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v0, 0x0

    .line 243
    if-nez p2, :cond_1

    .line 259
    :cond_0
    :goto_0
    return v0

    .line 246
    :cond_1
    sget-object v1, Lcom/facebook/orca/f/h;->a:[I

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->b()Lcom/facebook/fbservice/service/s;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/fbservice/service/s;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 248
    :pswitch_0
    if-eqz p3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    .line 252
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/orca/f/g;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->f()I

    move-result v2

    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadSummary;->y()Lcom/facebook/orca/threads/FolderName;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/orca/f/ad;->a(Ljava/lang/String;ILcom/facebook/orca/threads/FolderName;)Z

    move-result v0

    goto :goto_0

    .line 246
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private b(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 8

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 308
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 309
    const-string v0, "["

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    iget-object v0, p0, Lcom/facebook/orca/f/g;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0}, Lcom/facebook/orca/f/ad;->e()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v1, v2

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 312
    if-nez v1, :cond_0

    .line 313
    const-string v6, ", "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    :goto_1
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    move v1, v3

    .line 315
    goto :goto_1

    .line 319
    :cond_1
    const-string v0, "]"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 322
    const-string v0, "["

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->C()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v1, v2

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 325
    if-nez v1, :cond_2

    .line 326
    const-string v7, ", "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    :goto_3
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_2
    move v1, v3

    .line 328
    goto :goto_3

    .line 332
    :cond_3
    const-string v0, "]"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "userCache: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nThread Summary: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nThread Participants: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 337
    iget-object v1, p0, Lcom/facebook/orca/f/g;->d:Lcom/facebook/common/e/h;

    iget-object v3, p0, Lcom/facebook/orca/f/g;->a:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lcom/facebook/common/e/m;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/common/e/n;

    move-result-object v0

    new-instance v3, Ljava/lang/Throwable;

    invoke-direct {v3}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v0, v3}, Lcom/facebook/common/e/n;->a(Ljava/lang/Throwable;)Lcom/facebook/common/e/n;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/facebook/common/e/n;->b(Z)Lcom/facebook/common/e/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/common/e/n;->g()Lcom/facebook/common/e/m;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/facebook/common/e/h;->a(Lcom/facebook/common/e/m;)V

    .line 343
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/server/FetchThreadListParams;)Lcom/facebook/orca/server/FetchThreadListParams;
    .locals 3

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/orca/f/g;->c:Lcom/facebook/orca/f/k;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->b()Lcom/facebook/orca/threads/FolderName;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->a()Lcom/facebook/fbservice/service/s;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/f/k;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/fbservice/service/s;)Lcom/facebook/fbservice/service/s;

    move-result-object v0

    .line 64
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListParams;->a()Lcom/facebook/fbservice/service/s;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 65
    invoke-static {}, Lcom/facebook/orca/server/FetchThreadListParams;->newBuilder()Lcom/facebook/orca/server/y;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/facebook/orca/server/y;->a(Lcom/facebook/orca/server/FetchThreadListParams;)Lcom/facebook/orca/server/y;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/orca/server/y;->a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/y;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/y;->f()Lcom/facebook/orca/server/FetchThreadListParams;

    move-result-object p1

    .line 70
    :cond_0
    return-object p1
.end method

.method public a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/server/FetchThreadListResult;
    .locals 5

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/orca/f/g;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/ad;->c(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v1

    .line 105
    iget-object v0, p0, Lcom/facebook/orca/f/g;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0}, Lcom/facebook/orca/f/ad;->e()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v2

    .line 106
    iget-object v0, p0, Lcom/facebook/orca/f/g;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/ad;->b(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/fbservice/c/b;->FROM_CACHE_UP_TO_DATE:Lcom/facebook/fbservice/c/b;

    .line 108
    :goto_0
    iget-object v3, p0, Lcom/facebook/orca/f/g;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v3, p1}, Lcom/facebook/orca/f/ad;->e(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/threads/FolderCounts;

    move-result-object v3

    .line 110
    invoke-static {}, Lcom/facebook/orca/server/FetchThreadListResult;->newBuilder()Lcom/facebook/orca/server/aa;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/fbservice/c/b;)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/orca/threads/ThreadsCollection;)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/facebook/orca/server/aa;->a(Lcom/google/common/a/es;)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/orca/threads/FolderCounts;)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/aa;->o()Lcom/facebook/orca/server/FetchThreadListResult;

    move-result-object v0

    .line 117
    return-object v0

    .line 106
    :cond_0
    sget-object v0, Lcom/facebook/fbservice/c/b;->FROM_CACHE_STALE:Lcom/facebook/fbservice/c/b;

    goto :goto_0
.end method

.method public a(Lcom/facebook/fbservice/service/ad;Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/server/FetchThreadResult;
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 130
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v3

    .line 131
    const-string v0, "fetchThreadParams"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadParams;

    .line 132
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v1

    .line 133
    invoke-virtual {p0, p2, v1}, Lcom/facebook/orca/f/g;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v4

    .line 134
    invoke-direct {p0, v4}, Lcom/facebook/orca/f/g;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v5

    .line 137
    if-eqz v4, :cond_1

    .line 138
    invoke-virtual {v4}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    .line 140
    :goto_0
    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/f/g;->a(Lcom/facebook/orca/server/FetchThreadParams;Ljava/lang/String;)Lcom/facebook/orca/server/FetchThreadParams;

    move-result-object v0

    .line 141
    const-string v1, "fetchThreadParams"

    invoke-virtual {v3, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 144
    invoke-direct {p0, v0, v4, v5}, Lcom/facebook/orca/f/g;->a(Lcom/facebook/orca/server/FetchThreadParams;Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;)Z

    move-result v0

    .line 148
    if-nez v0, :cond_0

    .line 156
    :goto_1
    return-object v2

    .line 152
    :cond_0
    invoke-direct {p0, v4, v5}, Lcom/facebook/orca/f/g;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v1, v2

    goto :goto_0
.end method

.method public a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/threads/ThreadSummary;
    .locals 1

    .prologue
    .line 170
    iget-object v0, p0, Lcom/facebook/orca/f/g;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/fbservice/service/s;)Z
    .locals 2

    .prologue
    .line 84
    sget-object v0, Lcom/facebook/orca/f/h;->a:[I

    invoke-virtual {p2}, Lcom/facebook/fbservice/service/s;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 94
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 86
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/orca/f/g;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v0

    goto :goto_0

    .line 90
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/orca/f/g;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/ad;->b(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v0

    goto :goto_0

    .line 84
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
