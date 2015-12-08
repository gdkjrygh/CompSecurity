.class final Lcom/roidapp/photogrid/release/pn;
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
    .line 530
    iput-object p1, p0, Lcom/roidapp/photogrid/release/pn;->b:Lcom/roidapp/photogrid/release/PhotoView;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/pn;->a:Lcom/roidapp/photogrid/release/ao;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 535
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pn;->a:Lcom/roidapp/photogrid/release/ao;

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ao;->x:Z

    .line 536
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pn;->b:Lcom/roidapp/photogrid/release/PhotoView;

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    .line 537
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pn;->a:Lcom/roidapp/photogrid/release/ao;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v0, :cond_1

    .line 538
    new-instance v0, Lcom/roidapp/photogrid/release/hc;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/hc;-><init>()V

    .line 539
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pn;->b:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/PhotoView;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    const v2, 0x7f0d03ec

    const-string v3, "FragmentTextOrder"

    invoke-virtual {v1, v2, v0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 553
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pn;->b:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    .line 554
    return-void

    .line 540
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pn;->a:Lcom/roidapp/photogrid/release/ao;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/qz;

    if-eqz v0, :cond_2

    .line 541
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pn;->b:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/PhotoView;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->I()V

    goto :goto_0

    .line 543
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pn;->a:Lcom/roidapp/photogrid/release/ao;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/ps;

    if-eqz v0, :cond_0

    .line 544
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pn;->b:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/PhotoView;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    const-string v1, "FragmentFreeEdit"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 545
    new-instance v0, Lcom/roidapp/photogrid/release/db;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/db;-><init>()V

    .line 546
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pn;->b:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/PhotoView;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    const v2, 0x7f0d028d

    const-string v3, "FragmentFreeEdit"

    invoke-virtual {v1, v2, v0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto :goto_0

    .line 549
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pn;->b:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/PhotoView;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    const-string v1, "FragmentFreeEdit"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/db;

    .line 550
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/db;->a()V

    goto :goto_0
.end method
