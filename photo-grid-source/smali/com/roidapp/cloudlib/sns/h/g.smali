.class final Lcom/roidapp/cloudlib/sns/h/g;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/cloudlib/sns/h/a;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/sns/h/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 553
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    .line 554
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/g;->a:Ljava/lang/ref/WeakReference;

    .line 555
    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/h/g;->b:Ljava/lang/String;

    .line 556
    iput-object p3, p0, Lcom/roidapp/cloudlib/sns/h/g;->c:Ljava/lang/String;

    .line 557
    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 581
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/g;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/h/a;

    .line 582
    if-eqz v0, :cond_0

    .line 583
    instance-of v1, p2, Lcom/roidapp/cloudlib/sns/z;

    if-eqz v1, :cond_1

    .line 584
    check-cast p2, Lcom/roidapp/cloudlib/sns/z;

    invoke-virtual {p2}, Lcom/roidapp/cloudlib/sns/z;->a()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 589
    sget v1, Lcom/roidapp/cloudlib/at;->be:I

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/h/a;->a(Lcom/roidapp/cloudlib/sns/h/a;IZ)V

    .line 598
    :goto_0
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/a;->g(Lcom/roidapp/cloudlib/sns/h/a;)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/a;->g(Lcom/roidapp/cloudlib/sns/h/a;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 600
    :cond_0
    return-void

    .line 586
    :pswitch_0
    sget v1, Lcom/roidapp/cloudlib/at;->bl:I

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/h/a;->a(Lcom/roidapp/cloudlib/sns/h/a;IZ)V

    goto :goto_0

    .line 592
    :cond_1
    instance-of v1, p2, Ljava/io/IOException;

    if-eqz v1, :cond_2

    .line 593
    sget v1, Lcom/roidapp/cloudlib/at;->e:I

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/h/a;->a(Lcom/roidapp/cloudlib/sns/h/a;IZ)V

    goto :goto_0

    .line 596
    :cond_2
    sget v1, Lcom/roidapp/cloudlib/at;->be:I

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/h/a;->a(Lcom/roidapp/cloudlib/sns/h/a;IZ)V

    goto :goto_0

    .line 584
    :pswitch_data_0
    .packed-switch 0x3ed
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 547
    .line 1562
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    .line 1563
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v1

    .line 1564
    if-eqz v1, :cond_0

    iget-object v2, v1, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return-void

    .line 1565
    :cond_1
    iget-object v2, v1, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/h/g;->b:Ljava/lang/String;

    iput-object v3, v2, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    .line 1566
    iget-object v2, v1, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/h/g;->c:Ljava/lang/String;

    iput-object v3, v2, Lcom/roidapp/cloudlib/sns/b/x;->d:Ljava/lang/String;

    .line 1567
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/b/q;->a(Lcom/roidapp/cloudlib/sns/b/p;)V

    .line 1570
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/h/g;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/h/g;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/p;Ljava/lang/String;Ljava/lang/String;)V

    .line 1573
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/g;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/h/a;

    .line 1574
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/h/a;->isAdded()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1575
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/h/a;->dismiss()V

    goto :goto_0
.end method
