.class public Lcom/facebook/orca/threadview/dh;
.super Ljava/lang/Object;
.source "ThreadViewMessagesAdapterUpdater.java"


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
.field private final b:Lcom/facebook/widget/animatablelistview/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/widget/animatablelistview/d",
            "<",
            "Lcom/facebook/orca/threadview/ac;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/common/e/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 106
    const-class v0, Lcom/facebook/orca/threadview/dh;

    sput-object v0, Lcom/facebook/orca/threadview/dh;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/widget/animatablelistview/d;Lcom/facebook/common/e/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/widget/animatablelistview/d",
            "<",
            "Lcom/facebook/orca/threadview/ac;",
            ">;",
            "Lcom/facebook/common/e/h;",
            ")V"
        }
    .end annotation

    .prologue
    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    iput-object p1, p0, Lcom/facebook/orca/threadview/dh;->b:Lcom/facebook/widget/animatablelistview/d;

    .line 130
    iput-object p2, p0, Lcom/facebook/orca/threadview/dh;->c:Lcom/facebook/common/e/h;

    .line 131
    return-void
.end method

.method private a(IIILcom/facebook/orca/threadview/dj;La/d;Ljava/util/List;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Lcom/facebook/orca/threadview/dj;",
            "La/d;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/ac;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/ac;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v4, 0x5

    const/16 v3, 0xa

    .line 385
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 386
    const-string v1, "Cannot replace item. Exceeds final items.\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 387
    const-string v1, "Position: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 388
    const-string v1, "OriginalIndex: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 389
    const-string v1, "AdjustedIndex: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 390
    const-string v1, "ItemDeletionTracker: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 391
    const-string v1, "Delta: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n===\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    const-string v1, "Final orig items: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 393
    invoke-interface {p6}, Ljava/util/List;->size()I

    move-result v1

    .line 394
    const-string v2, "currentItems: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 395
    invoke-direct {p0, v4, p6, v0}, Lcom/facebook/orca/threadview/dh;->a(ILjava/util/List;Ljava/lang/StringBuilder;)V

    .line 396
    invoke-direct {p0, v4, p7, v0}, Lcom/facebook/orca/threadview/dh;->a(ILjava/util/List;Ljava/lang/StringBuilder;)V

    .line 398
    iget-object v1, p0, Lcom/facebook/orca/threadview/dh;->c:Lcom/facebook/common/e/h;

    const-string v2, "adapter_cannot_replace_item_error"

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 399
    return-void
.end method

.method private a(ILjava/util/List;Ljava/lang/StringBuilder;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/ac;",
            ">;",
            "Ljava/lang/StringBuilder;",
            ")V"
        }
    .end annotation

    .prologue
    const/16 v4, 0xa

    .line 682
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    .line 683
    const-string v0, "items size: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 684
    add-int/lit8 v0, v1, -0x1

    :goto_0
    add-int/lit8 v2, p1, 0x1

    add-int/2addr v2, v0

    if-le v2, v1, :cond_0

    if-ltz v0, :cond_0

    .line 685
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 684
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 687
    :cond_0
    const-string v0, "===\n"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 688
    return-void
.end method

.method private a(Lcom/facebook/widget/animatablelistview/k;IILcom/facebook/orca/threadview/dj;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/widget/animatablelistview/k",
            "<",
            "Lcom/facebook/orca/threadview/ac;",
            ">;II",
            "Lcom/facebook/orca/threadview/dj;",
            ")V"
        }
    .end annotation

    .prologue
    .line 601
    invoke-virtual {p1}, Lcom/facebook/widget/animatablelistview/k;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0xa

    if-ge v0, p2, :cond_0

    .line 602
    invoke-virtual {p1, p2}, Lcom/facebook/widget/animatablelistview/k;->c(I)V

    .line 603
    invoke-virtual {p4, p2}, Lcom/facebook/orca/threadview/dj;->b(I)V

    .line 608
    :goto_0
    return-void

    .line 605
    :cond_0
    invoke-virtual {p1, p2}, Lcom/facebook/widget/animatablelistview/k;->a(I)V

    .line 606
    invoke-virtual {p4, p3}, Lcom/facebook/orca/threadview/dj;->a(I)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/widget/animatablelistview/k;ILcom/facebook/orca/threadview/ac;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/widget/animatablelistview/k",
            "<",
            "Lcom/facebook/orca/threadview/ac;",
            ">;I",
            "Lcom/facebook/orca/threadview/ac;",
            ")V"
        }
    .end annotation

    .prologue
    .line 580
    invoke-virtual {p1}, Lcom/facebook/widget/animatablelistview/k;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0xa

    if-ge v0, p2, :cond_0

    .line 581
    invoke-virtual {p1, p2, p3}, Lcom/facebook/widget/animatablelistview/k;->b(ILjava/lang/Object;)V

    .line 586
    :goto_0
    return-void

    .line 584
    :cond_0
    invoke-virtual {p1, p2, p3}, Lcom/facebook/widget/animatablelistview/k;->a(ILjava/lang/Object;)V

    goto :goto_0
.end method

.method private a(Ljava/lang/StringBuilder;Ljava/util/List;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/ac;",
            ">;I)V"
        }
    .end annotation

    .prologue
    .line 250
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 251
    :cond_0
    const-string v0, "    none\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    :cond_1
    return-void

    .line 253
    :cond_2
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p3, :cond_1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 254
    const-string v0, "   "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ac;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method private a(Ljava/util/List;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/ac;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/ac;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/16 v5, 0xa

    const/4 v4, 0x5

    .line 202
    iget-object v0, p0, Lcom/facebook/orca/threadview/dh;->c:Lcom/facebook/common/e/h;

    if-nez v0, :cond_0

    .line 215
    :goto_0
    return-void

    .line 205
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    .line 206
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    .line 207
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x64

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 208
    const-string v3, "CurrentItems: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 209
    const-string v0, "FinalItems: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 210
    const-string v0, "Last five items of each set:\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    invoke-direct {p0, v4, p1, v2}, Lcom/facebook/orca/threadview/dh;->a(ILjava/util/List;Ljava/lang/StringBuilder;)V

    .line 212
    invoke-direct {p0, v4, p2, v2}, Lcom/facebook/orca/threadview/dh;->a(ILjava/util/List;Ljava/lang/StringBuilder;)V

    .line 214
    iget-object v0, p0, Lcom/facebook/orca/threadview/dh;->c:Lcom/facebook/common/e/h;

    const-string v1, "adapter_items_size_changed_error"

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<*>;",
            "Ljava/util/List",
            "<*>;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/orca/threadview/ac;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/orca/threadview/ac;",
            "Lcom/facebook/orca/threadview/dk;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 468
    invoke-static {p2}, Lcom/google/common/a/kl;->a(Ljava/lang/Iterable;)Ljava/util/HashSet;

    move-result-object v4

    .line 469
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 470
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 471
    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 472
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ac;

    .line 474
    instance-of v1, v2, Lcom/facebook/orca/threadview/ae;

    if-eqz v1, :cond_2

    instance-of v1, v0, Lcom/facebook/orca/threadview/ae;

    if-eqz v1, :cond_2

    move-object v1, v2

    .line 476
    check-cast v1, Lcom/facebook/orca/threadview/ae;

    move-object v3, v0

    check-cast v3, Lcom/facebook/orca/threadview/ae;

    invoke-direct {p0, v1, v3}, Lcom/facebook/orca/threadview/dh;->d(Lcom/facebook/orca/threadview/ae;Lcom/facebook/orca/threadview/ae;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 477
    check-cast v2, Lcom/facebook/orca/threadview/ac;

    invoke-interface {p3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 478
    sget-object v1, Lcom/facebook/orca/threadview/dk;->NONE:Lcom/facebook/orca/threadview/dk;

    invoke-interface {p4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    invoke-interface {v6}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 482
    :cond_2
    instance-of v1, v2, Lcom/facebook/orca/threadview/ad;

    if-eqz v1, :cond_5

    instance-of v1, v0, Lcom/facebook/orca/threadview/ad;

    if-eqz v1, :cond_5

    move-object v1, v2

    .line 484
    check-cast v1, Lcom/facebook/orca/threadview/ad;

    move-object v3, v0

    .line 485
    check-cast v3, Lcom/facebook/orca/threadview/ad;

    .line 486
    invoke-virtual {p0, v1, v3}, Lcom/facebook/orca/threadview/dh;->a(Lcom/facebook/orca/threadview/ad;Lcom/facebook/orca/threadview/ad;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 487
    check-cast v2, Lcom/facebook/orca/threadview/ac;

    invoke-interface {p3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 488
    invoke-direct {p0, v1, v3}, Lcom/facebook/orca/threadview/dh;->c(Lcom/facebook/orca/threadview/ad;Lcom/facebook/orca/threadview/ad;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 489
    sget-object v1, Lcom/facebook/orca/threadview/dk;->HIDE:Lcom/facebook/orca/threadview/dk;

    invoke-interface {p4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 496
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 490
    :cond_3
    invoke-direct {p0, v1, v3}, Lcom/facebook/orca/threadview/dh;->b(Lcom/facebook/orca/threadview/ad;Lcom/facebook/orca/threadview/ad;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 492
    sget-object v1, Lcom/facebook/orca/threadview/dk;->REVEAL:Lcom/facebook/orca/threadview/dk;

    invoke-interface {p4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 494
    :cond_4
    sget-object v1, Lcom/facebook/orca/threadview/dk;->NONE:Lcom/facebook/orca/threadview/dk;

    invoke-interface {p4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 499
    :cond_5
    instance-of v1, v2, Lcom/facebook/orca/threadview/aj;

    if-eqz v1, :cond_6

    instance-of v1, v0, Lcom/facebook/orca/threadview/aj;

    if-eqz v1, :cond_6

    move-object v1, v2

    .line 500
    check-cast v1, Lcom/facebook/orca/threadview/aj;

    move-object v3, v0

    check-cast v3, Lcom/facebook/orca/threadview/aj;

    invoke-direct {p0, v1, v3}, Lcom/facebook/orca/threadview/dh;->a(Lcom/facebook/orca/threadview/ac;Lcom/facebook/orca/threadview/ac;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 501
    check-cast v2, Lcom/facebook/orca/threadview/ac;

    invoke-interface {p3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 502
    sget-object v1, Lcom/facebook/orca/threadview/dk;->NONE:Lcom/facebook/orca/threadview/dk;

    invoke-interface {p4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 503
    invoke-interface {v6}, Ljava/util/Iterator;->remove()V

    goto/16 :goto_0

    .line 506
    :cond_6
    instance-of v1, v2, Lcom/facebook/orca/threadview/ai;

    if-eqz v1, :cond_1

    instance-of v1, v0, Lcom/facebook/orca/threadview/ad;

    if-eqz v1, :cond_1

    .line 507
    check-cast v2, Lcom/facebook/orca/threadview/ac;

    invoke-interface {p3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 508
    sget-object v1, Lcom/facebook/orca/threadview/dk;->REVEAL:Lcom/facebook/orca/threadview/dk;

    invoke-interface {p4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 509
    invoke-interface {v6}, Ljava/util/Iterator;->remove()V

    goto/16 :goto_0

    .line 514
    :cond_7
    return-void
.end method

.method private a(Lcom/facebook/orca/threadview/ac;Lcom/facebook/orca/threadview/ac;)Z
    .locals 3

    .prologue
    const/4 v2, 0x3

    const/4 v1, 0x2

    .line 548
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ac;->a()I

    move-result v0

    if-ne v0, v1, :cond_0

    invoke-virtual {p2}, Lcom/facebook/orca/threadview/ac;->a()I

    move-result v0

    if-eq v0, v2, :cond_1

    :cond_0
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ac;->a()I

    move-result v0

    if-ne v0, v2, :cond_2

    invoke-virtual {p2}, Lcom/facebook/orca/threadview/ac;->a()I

    move-result v0

    if-ne v0, v1, :cond_2

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Lcom/facebook/widget/animatablelistview/k;La/i;Ljava/util/List;)Z
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/widget/animatablelistview/k",
            "<",
            "Lcom/facebook/orca/threadview/ac;",
            ">;",
            "La/i;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/ac;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 274
    new-instance v7, Lcom/facebook/orca/threadview/dj;

    const/4 v3, 0x0

    move-object/from16 v0, p0

    invoke-direct {v7, v0, v3}, Lcom/facebook/orca/threadview/dj;-><init>(Lcom/facebook/orca/threadview/dh;Lcom/facebook/orca/threadview/di;)V

    .line 275
    const/4 v3, 0x1

    .line 276
    invoke-virtual/range {p2 .. p2}, La/i;->a()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_0
    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, La/d;

    .line 277
    instance-of v4, v8, La/h;

    if-eqz v4, :cond_3

    .line 278
    invoke-virtual {v8}, La/d;->b()La/b;

    move-result-object v4

    invoke-virtual {v4}, La/b;->b()Ljava/util/List;

    move-result-object v6

    .line 279
    const/4 v4, 0x0

    move v5, v3

    :goto_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v3

    if-ge v4, v3, :cond_2

    .line 280
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/threadview/ac;

    .line 281
    invoke-virtual {v8}, La/d;->b()La/b;

    move-result-object v9

    invoke-virtual {v9}, La/b;->a()I

    move-result v9

    add-int/2addr v9, v4

    .line 283
    if-eqz v5, :cond_1

    .line 284
    invoke-virtual {v7, v9}, Lcom/facebook/orca/threadview/dj;->d(I)I

    move-result v5

    add-int/2addr v5, v9

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v5, v3}, Lcom/facebook/orca/threadview/dh;->a(Lcom/facebook/widget/animatablelistview/k;ILcom/facebook/orca/threadview/ac;)V

    .line 288
    const/4 v5, 0x0

    .line 279
    add-int/lit8 v3, v4, 0x1

    move v4, v3

    goto :goto_1

    .line 290
    :cond_1
    const/4 v3, 0x1

    .line 374
    :goto_2
    return v3

    :cond_2
    move v3, v5

    .line 293
    goto :goto_0

    :cond_3
    instance-of v4, v8, La/c;

    if-eqz v4, :cond_4

    .line 294
    invoke-virtual {v8}, La/d;->a()La/b;

    move-result-object v4

    invoke-virtual {v4}, La/b;->b()Ljava/util/List;

    move-result-object v5

    .line 295
    const/4 v4, 0x0

    :goto_3
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    if-ge v4, v6, :cond_0

    .line 296
    invoke-virtual {v8}, La/d;->a()La/b;

    move-result-object v6

    invoke-virtual {v6}, La/b;->a()I

    move-result v6

    add-int/2addr v6, v4

    .line 297
    invoke-virtual {v7, v6}, Lcom/facebook/orca/threadview/dj;->c(I)I

    move-result v9

    sub-int v9, v6, v9

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v9, v6, v7}, Lcom/facebook/orca/threadview/dh;->a(Lcom/facebook/widget/animatablelistview/k;IILcom/facebook/orca/threadview/dj;)V

    .line 295
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 303
    :cond_4
    instance-of v4, v8, La/a;

    if-eqz v4, :cond_0

    .line 304
    invoke-virtual {v8}, La/d;->a()La/b;

    move-result-object v4

    invoke-virtual {v4}, La/b;->b()Ljava/util/List;

    move-result-object v5

    .line 305
    invoke-virtual {v8}, La/d;->b()La/b;

    move-result-object v4

    invoke-virtual {v4}, La/b;->b()Ljava/util/List;

    move-result-object v15

    .line 306
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v6

    .line 307
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v16

    .line 308
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-direct {v0, v5, v15, v6, v1}, Lcom/facebook/orca/threadview/dh;->a(Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/Map;)V

    .line 315
    const/4 v4, 0x0

    :goto_4
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v9

    if-ge v4, v9, :cond_6

    .line 316
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v6, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    .line 317
    invoke-virtual {v8}, La/d;->a()La/b;

    move-result-object v9

    invoke-virtual {v9}, La/b;->a()I

    move-result v9

    add-int/2addr v9, v4

    .line 318
    invoke-virtual {v7, v9}, Lcom/facebook/orca/threadview/dj;->c(I)I

    move-result v10

    sub-int v10, v9, v10

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v10, v9, v7}, Lcom/facebook/orca/threadview/dh;->a(Lcom/facebook/widget/animatablelistview/k;IILcom/facebook/orca/threadview/dj;)V

    .line 315
    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 327
    :cond_6
    const/4 v4, 0x0

    move v12, v4

    move v13, v3

    :goto_5
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v3

    if-ge v12, v3, :cond_d

    .line 328
    invoke-interface {v15, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Lcom/facebook/orca/threadview/ac;

    .line 329
    invoke-virtual {v8}, La/d;->b()La/b;

    move-result-object v3

    invoke-virtual {v3}, La/b;->a()I

    move-result v3

    add-int/2addr v3, v12

    .line 330
    invoke-virtual {v7, v3}, Lcom/facebook/orca/threadview/dj;->d(I)I

    move-result v4

    add-int v17, v3, v4

    .line 331
    move-object/from16 v0, v16

    invoke-interface {v0, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 332
    move-object/from16 v0, v16

    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/threadview/dk;

    .line 333
    sget-object v4, Lcom/facebook/orca/threadview/dk;->HIDE:Lcom/facebook/orca/threadview/dk;

    if-ne v3, v4, :cond_7

    .line 334
    move-object/from16 v0, p1

    move/from16 v1, v17

    invoke-virtual {v0, v1, v11}, Lcom/facebook/widget/animatablelistview/k;->d(ILjava/lang/Object;)V

    .line 335
    sget v3, Lcom/facebook/i;->row_receipt_animating_item_view:I

    sget-object v4, Lcom/facebook/widget/animatablelistview/o;->HIDE_WITH_ANIMATION_DOWN:Lcom/facebook/widget/animatablelistview/o;

    move-object/from16 v0, p1

    move/from16 v1, v17

    invoke-virtual {v0, v1, v3, v4}, Lcom/facebook/widget/animatablelistview/k;->a(IILcom/facebook/widget/animatablelistview/o;)V

    :goto_6
    move v4, v13

    .line 327
    :goto_7
    add-int/lit8 v3, v12, 0x1

    move v12, v3

    move v13, v4

    goto :goto_5

    .line 339
    :cond_7
    sget-object v4, Lcom/facebook/orca/threadview/dk;->REVEAL:Lcom/facebook/orca/threadview/dk;

    if-ne v3, v4, :cond_9

    .line 340
    move-object/from16 v0, p1

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/facebook/widget/animatablelistview/k;->d(I)Z

    move-result v3

    if-nez v3, :cond_8

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/facebook/orca/threadview/dh;->c:Lcom/facebook/common/e/h;

    if-eqz v3, :cond_8

    .line 342
    invoke-virtual {v8}, La/d;->b()La/b;

    move-result-object v3

    invoke-virtual {v3}, La/b;->a()I

    move-result v4

    .line 343
    add-int v5, v4, v12

    .line 344
    invoke-virtual {v7, v5}, Lcom/facebook/orca/threadview/dj;->c(I)I

    move-result v6

    .line 345
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/widget/animatablelistview/k;->c()Ljava/util/List;

    move-result-object v10

    move-object/from16 v3, p0

    move-object/from16 v9, p3

    invoke-direct/range {v3 .. v10}, Lcom/facebook/orca/threadview/dh;->a(IIILcom/facebook/orca/threadview/dj;La/d;Ljava/util/List;Ljava/util/List;)V

    .line 354
    :cond_8
    move-object/from16 v0, p1

    move/from16 v1, v17

    invoke-virtual {v0, v1, v11}, Lcom/facebook/widget/animatablelistview/k;->c(ILjava/lang/Object;)V

    .line 355
    sget v3, Lcom/facebook/i;->row_receipt_animating_item_view:I

    sget-object v4, Lcom/facebook/widget/animatablelistview/o;->REVEAL_WITH_ANIMATION_UP:Lcom/facebook/widget/animatablelistview/o;

    move-object/from16 v0, p1

    move/from16 v1, v17

    invoke-virtual {v0, v1, v3, v4}, Lcom/facebook/widget/animatablelistview/k;->a(IILcom/facebook/widget/animatablelistview/o;)V

    goto :goto_6

    .line 360
    :cond_9
    move-object/from16 v0, p1

    move/from16 v1, v17

    invoke-virtual {v0, v1, v11}, Lcom/facebook/widget/animatablelistview/k;->c(ILjava/lang/Object;)V

    goto :goto_6

    .line 364
    :cond_a
    if-eqz v13, :cond_b

    .line 365
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v17

    invoke-direct {v0, v1, v2, v11}, Lcom/facebook/orca/threadview/dh;->a(Lcom/facebook/widget/animatablelistview/k;ILcom/facebook/orca/threadview/ac;)V

    .line 366
    const/4 v4, 0x0

    goto :goto_7

    .line 368
    :cond_b
    const/4 v3, 0x1

    goto/16 :goto_2

    .line 374
    :cond_c
    const/4 v3, 0x0

    goto/16 :goto_2

    :cond_d
    move v3, v13

    goto/16 :goto_0
.end method

.method private a(La/i;)[I
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x1

    .line 433
    const/4 v0, 0x2

    new-array v1, v0, [I

    .line 434
    invoke-virtual {p1}, La/i;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/d;

    .line 435
    instance-of v3, v0, La/c;

    if-eqz v3, :cond_1

    .line 436
    aget v3, v1, v6

    invoke-virtual {v0}, La/d;->a()La/b;

    move-result-object v0

    invoke-virtual {v0}, La/b;->c()I

    move-result v0

    add-int/2addr v0, v3

    aput v0, v1, v6

    goto :goto_0

    .line 437
    :cond_1
    instance-of v3, v0, La/h;

    if-eqz v3, :cond_2

    .line 438
    aget v3, v1, v7

    invoke-virtual {v0}, La/d;->b()La/b;

    move-result-object v0

    invoke-virtual {v0}, La/b;->c()I

    move-result v0

    add-int/2addr v0, v3

    aput v0, v1, v7

    goto :goto_0

    .line 439
    :cond_2
    instance-of v3, v0, La/a;

    if-eqz v3, :cond_0

    .line 440
    invoke-virtual {v0}, La/d;->a()La/b;

    move-result-object v3

    invoke-virtual {v3}, La/b;->c()I

    move-result v3

    invoke-virtual {v0}, La/d;->b()La/b;

    move-result-object v4

    invoke-virtual {v4}, La/b;->c()I

    move-result v4

    if-le v3, v4, :cond_3

    .line 441
    aget v3, v1, v6

    invoke-virtual {v0}, La/d;->a()La/b;

    move-result-object v0

    invoke-virtual {v0}, La/b;->c()I

    move-result v0

    add-int/2addr v0, v3

    aput v0, v1, v6

    goto :goto_0

    .line 442
    :cond_3
    invoke-virtual {v0}, La/d;->b()La/b;

    move-result-object v3

    invoke-virtual {v3}, La/b;->c()I

    move-result v3

    invoke-virtual {v0}, La/d;->a()La/b;

    move-result-object v4

    invoke-virtual {v4}, La/b;->c()I

    move-result v4

    if-le v3, v4, :cond_0

    .line 443
    aget v3, v1, v7

    invoke-virtual {v0}, La/d;->b()La/b;

    move-result-object v4

    invoke-virtual {v4}, La/b;->c()I

    move-result v4

    invoke-virtual {v0}, La/d;->a()La/b;

    move-result-object v5

    invoke-virtual {v5}, La/b;->c()I

    move-result v5

    sub-int/2addr v4, v5

    add-int/2addr v3, v4

    aput v3, v1, v7

    .line 444
    aget v3, v1, v6

    invoke-virtual {v0}, La/d;->a()La/b;

    move-result-object v0

    invoke-virtual {v0}, La/b;->c()I

    move-result v0

    add-int/2addr v0, v3

    aput v0, v1, v6

    goto/16 :goto_0

    .line 448
    :cond_4
    return-object v1
.end method

.method private b(Ljava/util/List;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/ac;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/ac;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v2, 0x6

    .line 227
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 240
    :goto_0
    return-void

    .line 231
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 232
    const-string v1, "Current messages:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    invoke-static {p1}, Lcom/google/common/a/hq;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/threadview/dh;->a(Ljava/lang/StringBuilder;Ljava/util/List;I)V

    .line 235
    const-string v1, "  New Message:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    invoke-static {p2}, Lcom/google/common/a/hq;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/threadview/dh;->a(Ljava/lang/StringBuilder;Ljava/util/List;I)V

    .line 238
    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    sget-object v1, Lcom/facebook/orca/threadview/dh;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private b(Lcom/facebook/orca/threadview/ad;Lcom/facebook/orca/threadview/ad;)Z
    .locals 1

    .prologue
    .line 525
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ad;->d()Lcom/facebook/orca/threadview/ae;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lcom/facebook/orca/threadview/ad;->d()Lcom/facebook/orca/threadview/ae;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c(Lcom/facebook/orca/threadview/ad;Lcom/facebook/orca/threadview/ad;)Z
    .locals 1

    .prologue
    .line 537
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ad;->d()Lcom/facebook/orca/threadview/ae;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/facebook/orca/threadview/ad;->d()Lcom/facebook/orca/threadview/ae;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private d(Lcom/facebook/orca/threadview/ae;Lcom/facebook/orca/threadview/ae;)Z
    .locals 1

    .prologue
    .line 563
    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/threadview/dh;->a(Lcom/facebook/orca/threadview/ae;Lcom/facebook/orca/threadview/ae;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/threadview/dh;->c(Lcom/facebook/orca/threadview/ae;Lcom/facebook/orca/threadview/ae;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/threadview/dh;->b(Lcom/facebook/orca/threadview/ae;Lcom/facebook/orca/threadview/ae;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/ac;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    .line 143
    iget-object v0, p0, Lcom/facebook/orca/threadview/dh;->b:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v0}, Lcom/facebook/widget/animatablelistview/d;->d()Lcom/google/common/a/es;

    move-result-object v1

    .line 144
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 145
    iget-object v0, p0, Lcom/facebook/orca/threadview/dh;->b:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v0}, Lcom/facebook/widget/animatablelistview/d;->a()Lcom/facebook/widget/animatablelistview/k;

    move-result-object v0

    .line 146
    invoke-virtual {v0, p1}, Lcom/facebook/widget/animatablelistview/k;->a(Ljava/util/Collection;)V

    .line 147
    invoke-virtual {v0}, Lcom/facebook/widget/animatablelistview/k;->b()V

    .line 197
    :cond_0
    :goto_0
    return-void

    .line 151
    :cond_1
    invoke-static {v1, p1}, La/g;->a(Ljava/util/List;Ljava/util/List;)La/i;

    move-result-object v0

    .line 152
    invoke-virtual {v0}, La/i;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 158
    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/dh;->a(La/i;)[I

    move-result-object v2

    .line 159
    aget v3, v2, v5

    const/4 v4, 0x3

    if-gt v3, v4, :cond_2

    aget v3, v2, v5

    const/4 v4, 0x1

    aget v2, v2, v4

    add-int/2addr v2, v3

    const/16 v3, 0x8

    if-le v2, v3, :cond_3

    .line 162
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/dh;->b:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v0}, Lcom/facebook/widget/animatablelistview/d;->b()V

    .line 163
    iget-object v0, p0, Lcom/facebook/orca/threadview/dh;->b:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v0}, Lcom/facebook/widget/animatablelistview/d;->a()Lcom/facebook/widget/animatablelistview/k;

    move-result-object v0

    .line 164
    invoke-virtual {v0, p1}, Lcom/facebook/widget/animatablelistview/k;->a(Ljava/util/Collection;)V

    .line 165
    invoke-virtual {v0}, Lcom/facebook/widget/animatablelistview/k;->b()V

    goto :goto_0

    .line 169
    :cond_3
    invoke-direct {p0, v1, p1}, Lcom/facebook/orca/threadview/dh;->b(Ljava/util/List;Ljava/util/List;)V

    .line 172
    iget-object v2, p0, Lcom/facebook/orca/threadview/dh;->b:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v2}, Lcom/facebook/widget/animatablelistview/d;->d()Lcom/google/common/a/es;

    move-result-object v2

    .line 173
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-eq v3, v4, :cond_4

    .line 175
    invoke-direct {p0, v1, v2}, Lcom/facebook/orca/threadview/dh;->a(Ljava/util/List;Ljava/util/List;)V

    .line 177
    iget-object v0, p0, Lcom/facebook/orca/threadview/dh;->b:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v0}, Lcom/facebook/widget/animatablelistview/d;->d()Lcom/google/common/a/es;

    move-result-object v1

    .line 178
    invoke-static {v1, p1}, La/g;->a(Ljava/util/List;Ljava/util/List;)La/i;

    move-result-object v0

    .line 179
    invoke-virtual {v0}, La/i;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 186
    :cond_4
    iget-object v2, p0, Lcom/facebook/orca/threadview/dh;->b:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v2}, Lcom/facebook/widget/animatablelistview/d;->a()Lcom/facebook/widget/animatablelistview/k;

    move-result-object v2

    move-object v6, v2

    move-object v2, v1

    move-object v1, v0

    move-object v0, v6

    .line 187
    :goto_1
    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/threadview/dh;->a(Lcom/facebook/widget/animatablelistview/k;La/i;Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 189
    invoke-virtual {v0}, Lcom/facebook/widget/animatablelistview/k;->b()V

    .line 191
    iget-object v0, p0, Lcom/facebook/orca/threadview/dh;->b:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v0}, Lcom/facebook/widget/animatablelistview/d;->a()Lcom/facebook/widget/animatablelistview/k;

    move-result-object v0

    .line 192
    iget-object v1, p0, Lcom/facebook/orca/threadview/dh;->b:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v1}, Lcom/facebook/widget/animatablelistview/d;->d()Lcom/google/common/a/es;

    move-result-object v2

    .line 193
    invoke-static {v2, p1}, La/g;->a(Ljava/util/List;Ljava/util/List;)La/i;

    move-result-object v1

    goto :goto_1

    .line 196
    :cond_5
    invoke-virtual {v0}, Lcom/facebook/widget/animatablelistview/k;->b()V

    goto/16 :goto_0
.end method

.method public a(ZLjava/util/List;Lcom/facebook/messages/model/threads/ParticipantInfo;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/ac;",
            ">;",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ")V"
        }
    .end annotation

    .prologue
    .line 415
    iget-object v0, p0, Lcom/facebook/orca/threadview/dh;->b:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v0}, Lcom/facebook/widget/animatablelistview/d;->d()Lcom/google/common/a/es;

    move-result-object v0

    .line 416
    iget-object v1, p0, Lcom/facebook/orca/threadview/dh;->b:Lcom/facebook/widget/animatablelistview/d;

    invoke-virtual {v1}, Lcom/facebook/widget/animatablelistview/d;->a()Lcom/facebook/widget/animatablelistview/k;

    move-result-object v1

    .line 418
    if-eqz p1, :cond_0

    .line 419
    new-instance v0, Lcom/facebook/orca/threadview/ai;

    invoke-direct {v0, p3}, Lcom/facebook/orca/threadview/ai;-><init>(Lcom/facebook/messages/model/threads/ParticipantInfo;)V

    invoke-virtual {v1, v0}, Lcom/facebook/widget/animatablelistview/k;->a(Ljava/lang/Object;)V

    .line 423
    :goto_0
    invoke-virtual {v1}, Lcom/facebook/widget/animatablelistview/k;->b()V

    .line 424
    return-void

    .line 421
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Lcom/facebook/widget/animatablelistview/k;->b(I)V

    goto :goto_0
.end method

.method public a(Lcom/facebook/orca/threadview/ad;Lcom/facebook/orca/threadview/ad;)Z
    .locals 5

    .prologue
    .line 662
    const/4 v0, 0x0

    .line 663
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ad;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    .line 664
    invoke-virtual {p2}, Lcom/facebook/orca/threadview/ad;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v2

    .line 665
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 668
    const/4 v0, 0x1

    .line 675
    :cond_0
    :goto_0
    return v0

    .line 669
    :cond_1
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 671
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public a(Lcom/facebook/orca/threadview/ae;Lcom/facebook/orca/threadview/ae;)Z
    .locals 2

    .prologue
    .line 618
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->b()Lcom/facebook/orca/threadview/af;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/threadview/af;->READ:Lcom/facebook/orca/threadview/af;

    if-ne v0, v1, :cond_0

    invoke-virtual {p2}, Lcom/facebook/orca/threadview/ae;->b()Lcom/facebook/orca/threadview/af;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/threadview/af;->DELIVERED:Lcom/facebook/orca/threadview/af;

    if-eq v0, v1, :cond_1

    :cond_0
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->b()Lcom/facebook/orca/threadview/af;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/threadview/af;->DELIVERED:Lcom/facebook/orca/threadview/af;

    if-ne v0, v1, :cond_2

    invoke-virtual {p2}, Lcom/facebook/orca/threadview/ae;->b()Lcom/facebook/orca/threadview/af;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/threadview/af;->READ:Lcom/facebook/orca/threadview/af;

    if-ne v0, v1, :cond_2

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Lcom/facebook/orca/threadview/ae;Lcom/facebook/orca/threadview/ae;)Z
    .locals 2

    .prologue
    .line 631
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->b()Lcom/facebook/orca/threadview/af;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/threadview/af;->READ:Lcom/facebook/orca/threadview/af;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/af;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/facebook/orca/threadview/ae;->b()Lcom/facebook/orca/threadview/af;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/threadview/af;->SENT_FROM_RECEIPT:Lcom/facebook/orca/threadview/af;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c(Lcom/facebook/orca/threadview/ae;Lcom/facebook/orca/threadview/ae;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 645
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->c()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p2}, Lcom/facebook/orca/threadview/ae;->c()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 646
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ae;->b()Lcom/facebook/orca/threadview/af;

    move-result-object v1

    sget-object v2, Lcom/facebook/orca/threadview/af;->READ:Lcom/facebook/orca/threadview/af;

    if-ne v1, v2, :cond_0

    invoke-virtual {p2}, Lcom/facebook/orca/threadview/ae;->b()Lcom/facebook/orca/threadview/af;

    move-result-object v1

    sget-object v2, Lcom/facebook/orca/threadview/af;->READ:Lcom/facebook/orca/threadview/af;

    if-ne v1, v2, :cond_0

    invoke-virtual {p1, p2}, Lcom/facebook/orca/threadview/ae;->a(Lcom/facebook/orca/threadview/ae;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    .line 650
    :cond_0
    return v0
.end method
