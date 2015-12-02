.class public Lcom/facebook/orca/l/w;
.super Ljava/lang/Object;
.source "MergingUtil.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 933
    return-void
.end method

.method public static a(ILcom/facebook/orca/server/FetchMoreMessagesResult;Ljava/util/Collection;)Lcom/facebook/orca/server/FetchMoreMessagesResult;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/facebook/orca/server/FetchMoreMessagesResult;",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/orca/server/FetchMoreMessagesResult;",
            ">;)",
            "Lcom/facebook/orca/server/FetchMoreMessagesResult;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 776
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    .line 777
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 778
    invoke-interface {v0, p2}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 780
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesResult;->a()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/threads/MessagesCollection;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/l/af;

    invoke-direct {v2, v3}, Lcom/facebook/orca/l/af;-><init>(Lcom/facebook/orca/l/x;)V

    invoke-static {v2, v0}, Lcom/facebook/orca/l/w;->a(Lcom/google/common/base/Function;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v2

    invoke-static {v1, p0, v2}, Lcom/facebook/orca/l/w;->a(Ljava/lang/String;ILjava/util/Collection;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v1

    .line 786
    new-instance v2, Lcom/facebook/orca/l/ac;

    invoke-direct {v2, v3}, Lcom/facebook/orca/l/ac;-><init>(Lcom/facebook/orca/l/x;)V

    invoke-static {v2, v0}, Lcom/facebook/orca/l/w;->a(Lcom/google/common/base/Function;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/l/w;->g(Ljava/util/Collection;)J

    move-result-wide v2

    .line 790
    new-instance v0, Lcom/facebook/orca/server/FetchMoreMessagesResult;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v4

    invoke-direct {v0, v4, v1, v2, v3}, Lcom/facebook/orca/server/FetchMoreMessagesResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/MessagesCollection;J)V

    return-object v0
.end method

.method public static a(ILcom/facebook/orca/server/FetchThreadResult;Ljava/util/Collection;)Lcom/facebook/orca/server/FetchThreadResult;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/facebook/orca/server/FetchThreadResult;",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/orca/server/FetchThreadResult;",
            ">;)",
            "Lcom/facebook/orca/server/FetchThreadResult;"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 740
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    .line 741
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 742
    invoke-interface {v0, p2}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 744
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    new-instance v2, Lcom/facebook/orca/l/ah;

    invoke-direct {v2, v4}, Lcom/facebook/orca/l/ah;-><init>(Lcom/facebook/orca/l/x;)V

    invoke-static {v2, p2}, Lcom/facebook/orca/l/w;->a(Lcom/google/common/base/Function;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/orca/l/w;->a(Lcom/facebook/orca/threads/ThreadSummary;Ljava/util/Collection;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v2

    .line 747
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/facebook/orca/l/ag;

    invoke-direct {v3, v4}, Lcom/facebook/orca/l/ag;-><init>(Lcom/facebook/orca/l/x;)V

    invoke-static {v3, v0}, Lcom/facebook/orca/l/w;->a(Lcom/google/common/base/Function;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v3

    invoke-static {v1, p0, v3}, Lcom/facebook/orca/l/w;->a(Ljava/lang/String;ILjava/util/Collection;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v3

    .line 751
    new-instance v1, Lcom/facebook/orca/l/ad;

    invoke-direct {v1, v4}, Lcom/facebook/orca/l/ad;-><init>(Lcom/facebook/orca/l/x;)V

    invoke-static {v1, v0}, Lcom/facebook/orca/l/w;->a(Lcom/google/common/base/Function;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/l/w;->g(Ljava/util/Collection;)J

    move-result-wide v6

    .line 753
    new-instance v0, Lcom/facebook/orca/server/FetchThreadResult;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->c()Lcom/google/common/a/es;

    move-result-object v4

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->d()Lcom/facebook/user/User;

    move-result-object v5

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/server/FetchThreadResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;Lcom/google/common/a/es;Lcom/facebook/user/User;J)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;ILjava/util/Collection;)Lcom/facebook/orca/threads/MessagesCollection;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/orca/threads/MessagesCollection;",
            ">;)",
            "Lcom/facebook/orca/threads/MessagesCollection;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 251
    new-instance v0, Lcom/facebook/orca/l/y;

    invoke-direct {v0}, Lcom/facebook/orca/l/y;-><init>()V

    invoke-static {p2, v0}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Lcom/google/common/base/Function;)Ljava/util/Collection;

    move-result-object v3

    .line 262
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v2

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 263
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    goto :goto_0

    .line 266
    :cond_0
    new-instance v0, Lcom/facebook/orca/l/aj;

    invoke-direct {v0}, Lcom/facebook/orca/l/aj;-><init>()V

    invoke-static {p1, v0, v3}, Lcom/facebook/orca/l/w;->a(ILjava/util/Comparator;Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    .line 273
    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v3

    if-ne v3, v1, :cond_1

    .line 274
    invoke-static {p2}, Lcom/facebook/orca/l/w;->b(Ljava/util/Collection;)Z

    move-result v2

    .line 276
    :cond_1
    new-instance v1, Lcom/facebook/orca/threads/MessagesCollection;

    invoke-direct {v1, p0, v0, v2}, Lcom/facebook/orca/threads/MessagesCollection;-><init>(Ljava/lang/String;Lcom/google/common/a/es;Z)V

    return-object v1
.end method

.method public static a(Lcom/facebook/orca/threads/ThreadSummary;Ljava/util/Collection;)Lcom/facebook/orca/threads/ThreadSummary;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;)",
            "Lcom/facebook/orca/threads/ThreadSummary;"
        }
    .end annotation

    .prologue
    const/4 v7, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 435
    invoke-virtual {p0}, Lcom/facebook/orca/threads/ThreadSummary;->y()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    sget-object v3, Lcom/facebook/orca/threads/FolderName;->b:Lcom/facebook/orca/threads/FolderName;

    if-ne v0, v3, :cond_1

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 436
    invoke-virtual {p0}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 437
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 482
    :cond_0
    :goto_1
    return-object p0

    :cond_1
    move v0, v2

    .line 435
    goto :goto_0

    .line 440
    :cond_2
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 441
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->y()Lcom/facebook/orca/threads/FolderName;

    move-result-object v3

    sget-object v5, Lcom/facebook/orca/threads/FolderName;->d:Lcom/facebook/orca/threads/FolderName;

    if-ne v3, v5, :cond_3

    move v3, v1

    :goto_3
    invoke-static {v3}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 442
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    goto :goto_2

    :cond_3
    move v3, v2

    .line 441
    goto :goto_3

    .line 446
    :cond_4
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, p0

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 447
    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->c()J

    move-result-wide v3

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->c()J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-gez v3, :cond_7

    :goto_5
    move-object v1, v0

    .line 448
    goto :goto_4

    .line 453
    :cond_5
    new-instance v0, Lcom/facebook/orca/threads/v;

    invoke-direct {v0}, Lcom/facebook/orca/threads/v;-><init>()V

    .line 454
    invoke-virtual {v0, p0}, Lcom/facebook/orca/threads/v;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/v;

    move-result-object v2

    sget-object v3, Lcom/facebook/orca/threads/FolderName;->e:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v2, v3}, Lcom/facebook/orca/threads/v;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/threads/v;

    .line 459
    if-eq p0, v1, :cond_6

    .line 460
    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->c()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/facebook/orca/threads/v;->c(J)Lcom/facebook/orca/threads/v;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->d()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/facebook/orca/threads/v;->a(J)Lcom/facebook/orca/threads/v;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->e()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/facebook/orca/threads/v;->b(J)Lcom/facebook/orca/threads/v;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->l()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/facebook/orca/threads/v;->d(J)Lcom/facebook/orca/threads/v;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->n()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/orca/threads/v;->d(Ljava/lang/String;)Lcom/facebook/orca/threads/v;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->p()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/orca/threads/v;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/orca/threads/v;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/facebook/orca/threads/v;->e(Ljava/lang/String;)Lcom/facebook/orca/threads/v;

    .line 471
    :cond_6
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    .line 472
    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 473
    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 474
    new-instance v2, Lcom/facebook/orca/l/ai;

    invoke-direct {v2, v7}, Lcom/facebook/orca/l/ai;-><init>(Lcom/facebook/orca/l/x;)V

    invoke-static {v2, v1}, Lcom/facebook/orca/l/w;->b(Lcom/google/common/base/Function;Ljava/util/Collection;)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threads/v;->b(Z)Lcom/facebook/orca/threads/v;

    move-result-object v2

    new-instance v3, Lcom/facebook/orca/l/ae;

    invoke-direct {v3, v7}, Lcom/facebook/orca/l/ae;-><init>(Lcom/facebook/orca/l/x;)V

    invoke-static {v3, v1}, Lcom/facebook/orca/l/w;->b(Lcom/google/common/base/Function;Ljava/util/Collection;)Z

    move-result v1

    invoke-virtual {v2, v1}, Lcom/facebook/orca/threads/v;->e(Z)Lcom/facebook/orca/threads/v;

    move-result-object v1

    invoke-static {p1}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/threads/v;->e(Ljava/util/List;)Lcom/facebook/orca/threads/v;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/threads/v;->z()Lcom/facebook/orca/threads/ThreadSummary;

    .line 482
    invoke-virtual {v0}, Lcom/facebook/orca/threads/v;->z()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object p0

    goto/16 :goto_1

    :cond_7
    move-object v0, v1

    goto :goto_5
.end method

.method public static a(ILjava/util/Collection;)Lcom/facebook/orca/threads/ThreadsCollection;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/orca/threads/ThreadsCollection;",
            ">;)",
            "Lcom/facebook/orca/threads/ThreadsCollection;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 345
    new-instance v0, Lcom/facebook/orca/l/z;

    invoke-direct {v0}, Lcom/facebook/orca/l/z;-><init>()V

    invoke-static {p1, v0}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Lcom/google/common/base/Function;)Ljava/util/Collection;

    move-result-object v3

    .line 356
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v2

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 357
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    goto :goto_0

    .line 359
    :cond_0
    new-instance v0, Lcom/facebook/orca/threads/w;

    invoke-direct {v0}, Lcom/facebook/orca/threads/w;-><init>()V

    invoke-static {p0, v0, v3}, Lcom/facebook/orca/l/w;->a(ILjava/util/Comparator;Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    .line 366
    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v3

    if-ne v3, v1, :cond_1

    .line 367
    invoke-static {p1}, Lcom/facebook/orca/l/w;->c(Ljava/util/Collection;)Z

    move-result v2

    .line 369
    :cond_1
    new-instance v1, Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-direct {v1, v0, v2}, Lcom/facebook/orca/threads/ThreadsCollection;-><init>(Lcom/google/common/a/es;Z)V

    return-object v1
.end method

.method public static a(ILjava/util/Comparator;Ljava/util/Collection;)Lcom/google/common/a/es;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Ljava/util/Comparator",
            "<TT;>;",
            "Ljava/util/Collection",
            "<",
            "Ljava/util/Collection",
            "<TT;>;>;)",
            "Lcom/google/common/a/es",
            "<TT;>;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 127
    new-instance v3, Lcom/facebook/orca/l/x;

    invoke-direct {v3, p1}, Lcom/facebook/orca/l/x;-><init>(Ljava/util/Comparator;)V

    .line 142
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 143
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 144
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/gg;->g(Ljava/util/Iterator;)Lcom/google/common/a/jr;

    move-result-object v0

    .line 146
    invoke-interface {v0}, Lcom/google/common/a/jr;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 147
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 151
    :cond_1
    invoke-static {v4, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 154
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v5

    move v1, v2

    .line 155
    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/jr;

    invoke-interface {v0}, Lcom/google/common/a/jr;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    if-ge v1, p0, :cond_4

    .line 157
    invoke-interface {v4, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/jr;

    .line 158
    invoke-interface {v0}, Lcom/google/common/a/jr;->next()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 159
    add-int/lit8 v1, v1, 0x1

    .line 160
    invoke-interface {v0}, Lcom/google/common/a/jr;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 162
    invoke-static {v4, v0, v3}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result v6

    .line 163
    if-gez v6, :cond_3

    .line 164
    neg-int v6, v6

    add-int/lit8 v6, v6, -0x1

    invoke-interface {v4, v6, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto :goto_1

    .line 167
    :cond_3
    invoke-interface {v4, v6, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto :goto_1

    .line 172
    :cond_4
    invoke-virtual {v5}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/util/Collection;)Lcom/google/common/a/es;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection",
            "<",
            "Ljava/util/Collection",
            "<TT;>;>;)",
            "Lcom/google/common/a/es",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 58
    const/4 v2, 0x0

    .line 59
    const/4 v1, 0x0

    .line 60
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 61
    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v4

    if-lez v4, :cond_4

    .line 63
    add-int/lit8 v1, v1, 0x1

    move v5, v1

    move-object v1, v0

    move v0, v5

    :goto_1
    move-object v2, v1

    move v1, v0

    goto :goto_0

    .line 66
    :cond_0
    if-nez v1, :cond_1

    .line 67
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    .line 75
    :goto_2
    return-object v0

    .line 68
    :cond_1
    const/4 v0, 0x1

    if-ne v1, v0, :cond_2

    .line 69
    invoke-static {v2}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_2

    .line 71
    :cond_2
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 72
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 73
    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Iterable;)Lcom/google/common/a/et;

    goto :goto_3

    .line 75
    :cond_3
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_2

    :cond_4
    move v0, v1

    move-object v1, v2

    goto :goto_1
.end method

.method public static a(Ljava/util/Comparator;Ljava/util/Collection;)Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator",
            "<TT;>;",
            "Ljava/util/Collection",
            "<",
            "Ljava/util/Collection",
            "<TT;>;>;)",
            "Lcom/google/common/a/es",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 99
    const v0, 0x7fffffff

    invoke-static {v0, p0, p1}, Lcom/facebook/orca/l/w;->a(ILjava/util/Comparator;Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public static varargs a([Ljava/util/Collection;)Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/util/Collection",
            "<TT;>;)",
            "Lcom/google/common/a/es",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 49
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/l/w;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/util/Map;Lcom/google/common/a/iw;)Lcom/google/common/a/ev;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/user/UserKey;",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;",
            "Lcom/google/common/a/iw",
            "<",
            "Lcom/facebook/user/UserKey;",
            "Lcom/facebook/user/UserKey;",
            ">;)",
            "Lcom/google/common/a/ev",
            "<",
            "Lcom/facebook/user/UserKey;",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation

    .prologue
    .line 495
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v3

    .line 497
    invoke-interface {p1}, Lcom/google/common/a/iw;->g()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserKey;

    .line 498
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/threads/ThreadSummary;

    .line 499
    if-eqz v1, :cond_0

    .line 500
    invoke-interface {p1, v0}, Lcom/google/common/a/iw;->c(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v2

    .line 501
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v5

    .line 502
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/user/UserKey;

    .line 503
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/threads/ThreadSummary;

    .line 505
    if-eqz v2, :cond_1

    .line 506
    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 510
    :cond_2
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 511
    invoke-static {v1, v5}, Lcom/facebook/orca/l/w;->a(Lcom/facebook/orca/threads/ThreadSummary;Ljava/util/Collection;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    .line 513
    invoke-virtual {v3, v0, v1}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 514
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 515
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->i()Lcom/facebook/user/UserKey;

    move-result-object v0

    .line 516
    invoke-virtual {v3, v0, v1}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_1

    .line 521
    :cond_3
    invoke-virtual {v3}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    return-object v0
.end method

.method private static a(Lcom/google/common/base/Function;Ljava/util/Collection;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/base/Function",
            "<TK;TV;>;",
            "Ljava/util/Collection",
            "<TK;>;)",
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 556
    new-instance v0, Lcom/facebook/orca/l/aa;

    invoke-direct {v0, p0}, Lcom/facebook/orca/l/aa;-><init>(Lcom/google/common/base/Function;)V

    invoke-static {p1, v0}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Lcom/google/common/base/Function;)Ljava/util/Collection;

    move-result-object v0

    .line 565
    return-object v0
.end method

.method private static b(Lcom/google/common/base/Function;Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/base/Function",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 578
    new-instance v0, Lcom/facebook/orca/l/ab;

    invoke-direct {v0, p0}, Lcom/facebook/orca/l/ab;-><init>(Lcom/google/common/base/Function;)V

    invoke-static {p1, v0}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Lcom/google/common/base/Function;)Ljava/util/Collection;

    move-result-object v0

    .line 587
    invoke-static {v0}, Lcom/facebook/orca/l/w;->f(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method static b(Ljava/util/Collection;)Z
    .locals 2
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/orca/threads/MessagesCollection;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 194
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/MessagesCollection;

    .line 195
    invoke-virtual {v0}, Lcom/facebook/orca/threads/MessagesCollection;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 196
    const/4 v0, 0x0

    .line 199
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static c(Ljava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/orca/threads/ThreadsCollection;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 296
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadsCollection;

    .line 297
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadsCollection;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 298
    const/4 v0, 0x0

    .line 301
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static d(Ljava/util/Collection;)Lcom/facebook/fbservice/c/b;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/fbservice/c/b;",
            ">;)",
            "Lcom/facebook/fbservice/c/b;"
        }
    .end annotation

    .prologue
    .line 389
    sget-object v0, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    .line 390
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/c/b;

    .line 391
    sget-object v3, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    if-ne v0, v3, :cond_1

    .line 392
    sget-object v0, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    :cond_0
    :goto_1
    move-object v1, v0

    .line 401
    goto :goto_0

    .line 393
    :cond_1
    sget-object v3, Lcom/facebook/fbservice/c/b;->FROM_CACHE_INCOMPLETE:Lcom/facebook/fbservice/c/b;

    if-ne v0, v3, :cond_2

    sget-object v3, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    if-eq v1, v3, :cond_2

    .line 395
    sget-object v0, Lcom/facebook/fbservice/c/b;->FROM_CACHE_INCOMPLETE:Lcom/facebook/fbservice/c/b;

    goto :goto_1

    .line 396
    :cond_2
    sget-object v3, Lcom/facebook/fbservice/c/b;->FROM_CACHE_STALE:Lcom/facebook/fbservice/c/b;

    if-ne v0, v3, :cond_3

    sget-object v3, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    if-eq v1, v3, :cond_3

    sget-object v3, Lcom/facebook/fbservice/c/b;->FROM_CACHE_INCOMPLETE:Lcom/facebook/fbservice/c/b;

    if-eq v1, v3, :cond_3

    .line 399
    sget-object v0, Lcom/facebook/fbservice/c/b;->FROM_CACHE_STALE:Lcom/facebook/fbservice/c/b;

    goto :goto_1

    .line 400
    :cond_3
    sget-object v3, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    if-eq v1, v3, :cond_0

    move-object v0, v1

    goto :goto_1

    .line 404
    :cond_4
    return-object v1
.end method

.method public static e(Ljava/util/Collection;)Lcom/facebook/orca/threads/FolderCounts;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/orca/threads/FolderCounts;",
            ">;)",
            "Lcom/facebook/orca/threads/FolderCounts;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 605
    .line 607
    const-wide v3, 0x7fffffffffffffffL

    .line 608
    const-wide/high16 v5, -0x8000000000000000L

    .line 609
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v1, v2

    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderCounts;

    .line 610
    if-eqz v0, :cond_0

    .line 611
    invoke-virtual {v0}, Lcom/facebook/orca/threads/FolderCounts;->a()I

    move-result v8

    add-int/2addr v1, v8

    .line 612
    invoke-virtual {v0}, Lcom/facebook/orca/threads/FolderCounts;->b()I

    move-result v8

    add-int/2addr v2, v8

    .line 613
    invoke-virtual {v0}, Lcom/facebook/orca/threads/FolderCounts;->c()J

    move-result-wide v8

    invoke-static {v3, v4, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    .line 614
    invoke-virtual {v0}, Lcom/facebook/orca/threads/FolderCounts;->d()J

    move-result-wide v8

    invoke-static {v5, v6, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    goto :goto_0

    .line 617
    :cond_1
    new-instance v0, Lcom/facebook/orca/threads/FolderCounts;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/threads/FolderCounts;-><init>(IIJJ)V

    return-object v0
.end method

.method public static f(Ljava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 635
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 636
    if-eqz v0, :cond_0

    .line 637
    const/4 v0, 0x1

    .line 640
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static g(Ljava/util/Collection;)J
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/Long;",
            ">;)J"
        }
    .end annotation

    .prologue
    .line 681
    const-wide/high16 v0, -0x8000000000000000L

    .line 682
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-wide v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    .line 683
    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    move-wide v1, v0

    goto :goto_0

    .line 685
    :cond_0
    return-wide v1
.end method
