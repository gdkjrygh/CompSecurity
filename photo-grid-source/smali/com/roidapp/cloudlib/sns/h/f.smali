.class final Lcom/roidapp/cloudlib/sns/h/f;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/x;",
        ">;"
    }
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/cloudlib/sns/h/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/sns/h/a;)V
    .locals 1

    .prologue
    .line 608
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    .line 609
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/f;->b:Ljava/lang/ref/WeakReference;

    .line 610
    invoke-static {p1}, Lcom/roidapp/cloudlib/sns/h/a;->h(Lcom/roidapp/cloudlib/sns/h/a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/f;->a:Ljava/lang/String;

    .line 611
    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 3

    .prologue
    .line 635
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/f;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/h/a;

    .line 636
    if-eqz v0, :cond_0

    .line 637
    instance-of v1, p2, Lcom/roidapp/cloudlib/sns/z;

    if-nez v1, :cond_1

    .line 643
    instance-of v1, p2, Ljava/io/IOException;

    if-eqz v1, :cond_1

    .line 644
    sget v1, Lcom/roidapp/cloudlib/at;->e:I

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/h/a;->a(Lcom/roidapp/cloudlib/sns/h/a;IZ)V

    .line 649
    :goto_0
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/a;->g(Lcom/roidapp/cloudlib/sns/h/a;)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/a;->g(Lcom/roidapp/cloudlib/sns/h/a;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 651
    :cond_0
    return-void

    .line 647
    :cond_1
    sget v1, Lcom/roidapp/cloudlib/at;->be:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/h/a;->a(Lcom/roidapp/cloudlib/sns/h/a;IZ)V

    goto :goto_0
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 603
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/x;

    .line 1616
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    .line 1617
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v1

    .line 1618
    if-eqz v1, :cond_0

    iget-object v2, v1, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return-void

    .line 1619
    :cond_1
    iget-object v2, v1, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v3, p1, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    iput-object v3, v2, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    .line 1620
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/b/q;->a(Lcom/roidapp/cloudlib/sns/b/p;)V

    .line 1623
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v0

    iget-object v2, p1, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/h/f;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/g/b;->b(Lcom/roidapp/cloudlib/sns/b/p;Ljava/lang/String;Ljava/lang/String;)V

    .line 1626
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/f;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/h/a;

    .line 1627
    if-eqz v0, :cond_0

    .line 1628
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/a;->i(Lcom/roidapp/cloudlib/sns/h/a;)V

    .line 1629
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/a;->g(Lcom/roidapp/cloudlib/sns/h/a;)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/a;->g(Lcom/roidapp/cloudlib/sns/h/a;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method
