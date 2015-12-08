.class final Lcom/roidapp/photogrid/release/ft;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/widget/ImageView;

.field final synthetic b:Landroid/widget/ImageView;

.field final synthetic c:Landroid/widget/RelativeLayout;

.field final synthetic d:Landroid/widget/RelativeLayout;

.field final synthetic e:Landroid/widget/RelativeLayout;

.field final synthetic f:Landroid/widget/TextView;

.field final synthetic g:Landroid/widget/TextView;

.field final synthetic h:Landroid/widget/TextView;

.field final synthetic i:Landroid/view/LayoutInflater;

.field final synthetic j:Landroid/view/ViewGroup;

.field final synthetic k:Lcom/roidapp/photogrid/release/fr;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/fr;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/RelativeLayout;Landroid/widget/RelativeLayout;Landroid/widget/RelativeLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ft;->k:Lcom/roidapp/photogrid/release/fr;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/ft;->a:Landroid/widget/ImageView;

    iput-object p3, p0, Lcom/roidapp/photogrid/release/ft;->b:Landroid/widget/ImageView;

    iput-object p4, p0, Lcom/roidapp/photogrid/release/ft;->c:Landroid/widget/RelativeLayout;

    iput-object p5, p0, Lcom/roidapp/photogrid/release/ft;->d:Landroid/widget/RelativeLayout;

    iput-object p6, p0, Lcom/roidapp/photogrid/release/ft;->e:Landroid/widget/RelativeLayout;

    iput-object p7, p0, Lcom/roidapp/photogrid/release/ft;->f:Landroid/widget/TextView;

    iput-object p8, p0, Lcom/roidapp/photogrid/release/ft;->g:Landroid/widget/TextView;

    iput-object p9, p0, Lcom/roidapp/photogrid/release/ft;->h:Landroid/widget/TextView;

    iput-object p10, p0, Lcom/roidapp/photogrid/release/ft;->i:Landroid/view/LayoutInflater;

    iput-object p11, p0, Lcom/roidapp/photogrid/release/ft;->j:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/16 v2, 0x8

    .line 100
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ft;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-eq v0, v2, :cond_0

    .line 101
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ft;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 103
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ft;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 104
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ft;->c:Landroid/widget/RelativeLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 105
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ft;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 106
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ft;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 107
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ft;->f:Landroid/widget/TextView;

    const v1, 0x7f020074

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 108
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ft;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 109
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ft;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 110
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ft;->k:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v0, v3}, Lcom/roidapp/photogrid/release/fr;->a(Lcom/roidapp/photogrid/release/fr;I)I

    .line 111
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ft;->k:Lcom/roidapp/photogrid/release/fr;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ft;->i:Landroid/view/LayoutInflater;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ft;->j:Landroid/view/ViewGroup;

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/release/fr;->a(Lcom/roidapp/photogrid/release/fr;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V

    .line 112
    return-void
.end method
