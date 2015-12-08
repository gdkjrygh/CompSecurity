.class final Lcom/roidapp/photogrid/release/cq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/widget/ImageView;

.field final synthetic b:Lcom/roidapp/photogrid/release/ck;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ck;Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 317
    iput-object p1, p0, Lcom/roidapp/photogrid/release/cq;->b:Lcom/roidapp/photogrid/release/ck;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/cq;->a:Landroid/widget/ImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 323
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->q(I)V

    .line 324
    new-instance v0, Lcom/roidapp/photogrid/release/cd;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/cd;-><init>()V

    .line 325
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cq;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ck;->b(Lcom/roidapp/photogrid/release/ck;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    const v2, 0x7f0d03ec

    const-string v3, "FragmentBgListSub"

    invoke-virtual {v1, v2, v0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 326
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cq;->a:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 327
    return-void
.end method
