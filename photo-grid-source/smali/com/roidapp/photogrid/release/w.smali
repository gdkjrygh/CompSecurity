.class final Lcom/roidapp/photogrid/release/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/b;

.field final synthetic b:Lcom/roidapp/photogrid/release/v;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/v;Lcom/roidapp/photogrid/release/b;)V
    .locals 0

    .prologue
    .line 469
    iput-object p1, p0, Lcom/roidapp/photogrid/release/w;->b:Lcom/roidapp/photogrid/release/v;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/w;->a:Lcom/roidapp/photogrid/release/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 472
    iget-object v2, p0, Lcom/roidapp/photogrid/release/w;->b:Lcom/roidapp/photogrid/release/v;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/v;->b:Ljava/util/ArrayList;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/w;->b:Lcom/roidapp/photogrid/release/v;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/v;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-nez v2, :cond_1

    .line 513
    :cond_0
    :goto_0
    return-void

    .line 476
    :cond_1
    iget-object v2, p0, Lcom/roidapp/photogrid/release/w;->b:Lcom/roidapp/photogrid/release/v;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/v;->c:Lcom/roidapp/photogrid/release/r;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/r;->d(Lcom/roidapp/photogrid/release/r;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 477
    iget-object v2, p0, Lcom/roidapp/photogrid/release/w;->b:Lcom/roidapp/photogrid/release/v;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/v;->c:Lcom/roidapp/photogrid/release/r;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/r;->g(Lcom/roidapp/photogrid/release/r;)Lcom/roidapp/photogrid/release/a;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/w;->a:Lcom/roidapp/photogrid/release/b;

    invoke-interface {v2, v3}, Lcom/roidapp/photogrid/release/a;->d(Lcom/roidapp/photogrid/release/b;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 478
    iget-object v2, p0, Lcom/roidapp/photogrid/release/w;->b:Lcom/roidapp/photogrid/release/v;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/v;->c:Lcom/roidapp/photogrid/release/r;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/r;->a(Lcom/roidapp/photogrid/release/r;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/w;->b:Lcom/roidapp/photogrid/release/v;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/v;->c:Lcom/roidapp/photogrid/release/r;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/r;->a(Lcom/roidapp/photogrid/release/r;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/w;->b:Lcom/roidapp/photogrid/release/v;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/v;->c:Lcom/roidapp/photogrid/release/r;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/r;->h(Lcom/roidapp/photogrid/release/r;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 479
    new-instance v2, Landroid/app/AlertDialog$Builder;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/w;->b:Lcom/roidapp/photogrid/release/v;

    iget-object v3, v3, Lcom/roidapp/photogrid/release/v;->c:Lcom/roidapp/photogrid/release/r;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/r;->a(Lcom/roidapp/photogrid/release/r;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 480
    iget-object v3, p0, Lcom/roidapp/photogrid/release/w;->b:Lcom/roidapp/photogrid/release/v;

    iget-object v3, v3, Lcom/roidapp/photogrid/release/v;->c:Lcom/roidapp/photogrid/release/r;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/r;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0702f3

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 481
    new-array v4, v0, [Ljava/lang/Object;

    const/16 v5, 0xf

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 482
    const v1, 0x1040013

    new-instance v3, Lcom/roidapp/photogrid/release/x;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/release/x;-><init>(Lcom/roidapp/photogrid/release/w;)V

    invoke-virtual {v2, v1, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 488
    new-instance v1, Lcom/roidapp/photogrid/release/y;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/y;-><init>(Lcom/roidapp/photogrid/release/w;)V

    invoke-virtual {v2, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 495
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V

    .line 496
    iget-object v1, p0, Lcom/roidapp/photogrid/release/w;->b:Lcom/roidapp/photogrid/release/v;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/v;->c:Lcom/roidapp/photogrid/release/r;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/r;->a(Lcom/roidapp/photogrid/release/r;Z)Z

    goto/16 :goto_0

    .line 500
    :cond_2
    iget-object v2, p0, Lcom/roidapp/photogrid/release/w;->a:Lcom/roidapp/photogrid/release/b;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/w;->a:Lcom/roidapp/photogrid/release/b;

    iget-boolean v3, v3, Lcom/roidapp/photogrid/release/b;->b:Z

    if-nez v3, :cond_3

    :goto_1
    iput-boolean v0, v2, Lcom/roidapp/photogrid/release/b;->b:Z

    .line 501
    const v0, 0x7f0d021b

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/w;->a:Lcom/roidapp/photogrid/release/b;

    iget-boolean v2, v2, Lcom/roidapp/photogrid/release/b;->b:Z

    if-eqz v2, :cond_4

    :goto_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 503
    iget-object v0, p0, Lcom/roidapp/photogrid/release/w;->a:Lcom/roidapp/photogrid/release/b;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/b;->b:Z

    if-nez v0, :cond_5

    .line 504
    iget-object v0, p0, Lcom/roidapp/photogrid/release/w;->b:Lcom/roidapp/photogrid/release/v;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/v;->c:Lcom/roidapp/photogrid/release/r;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/r;->g(Lcom/roidapp/photogrid/release/r;)Lcom/roidapp/photogrid/release/a;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/w;->a:Lcom/roidapp/photogrid/release/b;

    invoke-interface {v0, v1}, Lcom/roidapp/photogrid/release/a;->b(Lcom/roidapp/photogrid/release/b;)V

    goto/16 :goto_0

    :cond_3
    move v0, v1

    .line 500
    goto :goto_1

    .line 501
    :cond_4
    const/4 v1, 0x4

    goto :goto_2

    .line 506
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/w;->b:Lcom/roidapp/photogrid/release/v;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/v;->c:Lcom/roidapp/photogrid/release/r;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/r;->g(Lcom/roidapp/photogrid/release/r;)Lcom/roidapp/photogrid/release/a;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/w;->a:Lcom/roidapp/photogrid/release/b;

    invoke-interface {v0, v1}, Lcom/roidapp/photogrid/release/a;->a(Lcom/roidapp/photogrid/release/b;)V

    goto/16 :goto_0

    .line 510
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/w;->b:Lcom/roidapp/photogrid/release/v;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/v;->c:Lcom/roidapp/photogrid/release/r;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/r;->g(Lcom/roidapp/photogrid/release/r;)Lcom/roidapp/photogrid/release/a;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/w;->a:Lcom/roidapp/photogrid/release/b;

    invoke-interface {v0, v1}, Lcom/roidapp/photogrid/release/a;->c(Lcom/roidapp/photogrid/release/b;)V

    goto/16 :goto_0
.end method
