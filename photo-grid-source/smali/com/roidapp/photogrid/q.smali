.class final Lcom/roidapp/photogrid/q;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/a/f;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/photogrid/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/roidapp/photogrid/k;)V
    .locals 1

    .prologue
    .line 676
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    .line 677
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/q;->a:Ljava/lang/ref/WeakReference;

    .line 678
    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/photogrid/k;B)V
    .locals 0

    .prologue
    .line 673
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/q;-><init>(Lcom/roidapp/photogrid/k;)V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 2

    .prologue
    .line 715
    iget-object v0, p0, Lcom/roidapp/photogrid/q;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/k;

    .line 716
    if-nez v0, :cond_1

    .line 724
    :cond_0
    :goto_0
    return-void

    .line 720
    :cond_1
    invoke-static {v0}, Lcom/roidapp/photogrid/k;->h(Lcom/roidapp/photogrid/k;)Z

    .line 721
    invoke-static {v0}, Lcom/roidapp/photogrid/k;->k(Lcom/roidapp/photogrid/k;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->k(Lcom/roidapp/photogrid/k;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 722
    :cond_2
    invoke-static {v0}, Lcom/roidapp/photogrid/k;->i(Lcom/roidapp/photogrid/k;)V

    goto :goto_0
.end method

.method public final synthetic b(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 673
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/f;

    .line 1699
    iget-object v0, p0, Lcom/roidapp/photogrid/q;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/k;

    .line 1700
    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->j(Lcom/roidapp/photogrid/k;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1706
    :cond_0
    :goto_0
    return-void

    .line 1704
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/f;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1705
    :cond_2
    invoke-static {v0}, Lcom/roidapp/photogrid/k;->i(Lcom/roidapp/photogrid/k;)V

    goto :goto_0

    .line 1709
    :cond_3
    invoke-static {v0, p1}, Lcom/roidapp/photogrid/k;->a(Lcom/roidapp/photogrid/k;Ljava/util/List;)Ljava/util/List;

    .line 1710
    invoke-static {v0, p1}, Lcom/roidapp/photogrid/k;->b(Lcom/roidapp/photogrid/k;Ljava/util/List;)V

    goto :goto_0
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 673
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/f;

    .line 2682
    iget-object v0, p0, Lcom/roidapp/photogrid/q;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/k;

    .line 2683
    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/roidapp/photogrid/k;->g(Lcom/roidapp/photogrid/k;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 2690
    :cond_0
    :goto_0
    return-void

    .line 2687
    :cond_1
    invoke-static {v0}, Lcom/roidapp/photogrid/k;->h(Lcom/roidapp/photogrid/k;)Z

    .line 2688
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/f;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 2689
    :cond_2
    invoke-static {v0}, Lcom/roidapp/photogrid/k;->i(Lcom/roidapp/photogrid/k;)V

    goto :goto_0

    .line 2693
    :cond_3
    invoke-static {v0, p1}, Lcom/roidapp/photogrid/k;->a(Lcom/roidapp/photogrid/k;Ljava/util/List;)Ljava/util/List;

    .line 2694
    invoke-static {v0, p1}, Lcom/roidapp/photogrid/k;->b(Lcom/roidapp/photogrid/k;Ljava/util/List;)V

    goto :goto_0
.end method
