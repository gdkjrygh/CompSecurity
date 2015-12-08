.class final Lcom/roidapp/photogrid/release/fv;
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
    .line 131
    iput-object p1, p0, Lcom/roidapp/photogrid/release/fv;->k:Lcom/roidapp/photogrid/release/fr;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/fv;->a:Landroid/widget/ImageView;

    iput-object p3, p0, Lcom/roidapp/photogrid/release/fv;->b:Landroid/widget/ImageView;

    iput-object p4, p0, Lcom/roidapp/photogrid/release/fv;->c:Landroid/widget/RelativeLayout;

    iput-object p5, p0, Lcom/roidapp/photogrid/release/fv;->d:Landroid/widget/RelativeLayout;

    iput-object p6, p0, Lcom/roidapp/photogrid/release/fv;->e:Landroid/widget/RelativeLayout;

    iput-object p7, p0, Lcom/roidapp/photogrid/release/fv;->f:Landroid/widget/TextView;

    iput-object p8, p0, Lcom/roidapp/photogrid/release/fv;->g:Landroid/widget/TextView;

    iput-object p9, p0, Lcom/roidapp/photogrid/release/fv;->h:Landroid/widget/TextView;

    iput-object p10, p0, Lcom/roidapp/photogrid/release/fv;->i:Landroid/view/LayoutInflater;

    iput-object p11, p0, Lcom/roidapp/photogrid/release/fv;->j:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 135
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fv;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 136
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fv;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 137
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fv;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 138
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fv;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 139
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fv;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 140
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fv;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 141
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fv;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 142
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fv;->h:Landroid/widget/TextView;

    const v1, 0x7f020074

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 143
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fv;->k:Lcom/roidapp/photogrid/release/fr;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/fr;->a(Lcom/roidapp/photogrid/release/fr;I)I

    .line 145
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fv;->k:Lcom/roidapp/photogrid/release/fr;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fv;->i:Landroid/view/LayoutInflater;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/fv;->j:Landroid/view/ViewGroup;

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/release/fr;->a(Lcom/roidapp/photogrid/release/fr;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V

    .line 146
    return-void
.end method
