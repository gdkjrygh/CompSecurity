.class final Lcom/roidapp/photogrid/release/pl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ao;

.field final synthetic b:Lcom/roidapp/photogrid/release/PhotoView;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/ao;)V
    .locals 0

    .prologue
    .line 464
    iput-object p1, p0, Lcom/roidapp/photogrid/release/pl;->b:Lcom/roidapp/photogrid/release/PhotoView;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/pl;->a:Lcom/roidapp/photogrid/release/ao;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    const/4 v2, -0x1

    .line 467
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pl;->b:Lcom/roidapp/photogrid/release/PhotoView;

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    .line 468
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pl;->a:Lcom/roidapp/photogrid/release/ao;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v0, :cond_1

    .line 469
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pl;->b:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/PhotoView;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->K()V

    .line 470
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pl;->b:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/PhotoView;->b(Lcom/roidapp/photogrid/release/PhotoView;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/pl;->a:Lcom/roidapp/photogrid/release/ao;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 501
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pl;->b:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/PhotoView;->e(Lcom/roidapp/photogrid/release/PhotoView;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/pl;->a:Lcom/roidapp/photogrid/release/ao;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 502
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pl;->b:Lcom/roidapp/photogrid/release/PhotoView;

    iput v2, v0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    .line 503
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pl;->b:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    .line 504
    return-void

    .line 471
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pl;->a:Lcom/roidapp/photogrid/release/ao;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/qz;

    if-eqz v0, :cond_2

    .line 472
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pl;->b:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/PhotoView;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->K()V

    .line 473
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pl;->b:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/PhotoView;->c(Lcom/roidapp/photogrid/release/PhotoView;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/pl;->a:Lcom/roidapp/photogrid/release/ao;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 474
    invoke-static {}, Lcom/roidapp/photogrid/release/qx;->a()Lcom/roidapp/photogrid/release/qx;

    move-result-object v1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/pl;->a:Lcom/roidapp/photogrid/release/ao;

    check-cast v0, Lcom/roidapp/photogrid/release/qz;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/qx;->b(Lcom/roidapp/photogrid/release/qz;)V

    goto :goto_0

    .line 475
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pl;->a:Lcom/roidapp/photogrid/release/ao;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/ps;

    if-eqz v0, :cond_0

    .line 476
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pl;->a:Lcom/roidapp/photogrid/release/ao;

    check-cast v0, Lcom/roidapp/photogrid/release/ps;

    iget-object v3, v0, Lcom/roidapp/photogrid/release/ps;->H:Lcom/roidapp/photogrid/release/ig;

    .line 477
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pl;->b:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/PhotoView;->d(Lcom/roidapp/photogrid/release/PhotoView;)Ljava/util/List;

    move-result-object v0

    iget-object v4, p0, Lcom/roidapp/photogrid/release/pl;->a:Lcom/roidapp/photogrid/release/ao;

    invoke-interface {v0, v4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 478
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pl;->b:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/PhotoView;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    .line 479
    if-eqz v4, :cond_0

    array-length v0, v4

    if-lez v0, :cond_0

    .line 480
    array-length v0, v4

    add-int/lit8 v0, v0, -0x1

    new-array v5, v0, [Lcom/roidapp/photogrid/release/ig;

    move v0, v1

    move v1, v2

    .line 482
    :goto_1
    array-length v6, v5

    if-ge v0, v6, :cond_5

    .line 483
    if-gez v1, :cond_3

    .line 484
    aget-object v6, v4, v0

    aput-object v6, v5, v0

    .line 485
    aget-object v6, v4, v0

    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    move v1, v0

    .line 489
    :cond_3
    if-ltz v1, :cond_4

    .line 490
    add-int/lit8 v6, v0, 0x1

    aget-object v6, v4, v6

    aput-object v6, v5, v0

    .line 482
    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 493
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pl;->b:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/PhotoView;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    .line 6238
    iput-object v5, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    .line 494
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 498
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pl;->b:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/PhotoView;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->K()V

    goto/16 :goto_0
.end method
