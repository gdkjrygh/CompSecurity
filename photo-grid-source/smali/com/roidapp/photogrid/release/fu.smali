.class final Lcom/roidapp/photogrid/release/fu;
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
    .line 114
    iput-object p1, p0, Lcom/roidapp/photogrid/release/fu;->k:Lcom/roidapp/photogrid/release/fr;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/fu;->a:Landroid/widget/ImageView;

    iput-object p3, p0, Lcom/roidapp/photogrid/release/fu;->b:Landroid/widget/ImageView;

    iput-object p4, p0, Lcom/roidapp/photogrid/release/fu;->c:Landroid/widget/RelativeLayout;

    iput-object p5, p0, Lcom/roidapp/photogrid/release/fu;->d:Landroid/widget/RelativeLayout;

    iput-object p6, p0, Lcom/roidapp/photogrid/release/fu;->e:Landroid/widget/RelativeLayout;

    iput-object p7, p0, Lcom/roidapp/photogrid/release/fu;->f:Landroid/widget/TextView;

    iput-object p8, p0, Lcom/roidapp/photogrid/release/fu;->g:Landroid/widget/TextView;

    iput-object p9, p0, Lcom/roidapp/photogrid/release/fu;->h:Landroid/widget/TextView;

    iput-object p10, p0, Lcom/roidapp/photogrid/release/fu;->i:Landroid/view/LayoutInflater;

    iput-object p11, p0, Lcom/roidapp/photogrid/release/fu;->j:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const/16 v1, 0x8

    const/4 v2, 0x0

    .line 118
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fu;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 119
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fu;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 120
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fu;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 121
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fu;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 122
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fu;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 123
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fu;->f:Landroid/widget/TextView;

    const v1, 0x7f020074

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 124
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fu;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 125
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fu;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 126
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fu;->k:Lcom/roidapp/photogrid/release/fr;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/fr;->a(Lcom/roidapp/photogrid/release/fr;I)I

    .line 128
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fu;->k:Lcom/roidapp/photogrid/release/fr;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fu;->i:Landroid/view/LayoutInflater;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/fu;->j:Landroid/view/ViewGroup;

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/release/fr;->a(Lcom/roidapp/photogrid/release/fr;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V

    .line 129
    return-void
.end method
