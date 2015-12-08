.class final Lcom/roidapp/photogrid/release/cj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/cg;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/cg;)V
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lcom/roidapp/photogrid/release/cj;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    const v5, 0x7f020365

    const v4, 0x7f020364

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 116
    iget-object v2, p0, Lcom/roidapp/photogrid/release/cj;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/cg;->a(Lcom/roidapp/photogrid/release/cg;)Lcom/roidapp/photogrid/release/ng;

    move-result-object v2

    if-nez v2, :cond_1

    .line 117
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->be()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 118
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cj;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cg;->d(Lcom/roidapp/photogrid/release/cg;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->bd()I

    move-result v2

    invoke-virtual {v0, v2, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(IZ)V

    .line 119
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cj;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cg;->c(Lcom/roidapp/photogrid/release/cg;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 135
    :goto_0
    return-void

    .line 121
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->g(Z)V

    .line 122
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cj;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/cg;->d(Lcom/roidapp/photogrid/release/cg;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->bd()I

    move-result v2

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(IZ)V

    .line 123
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cj;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cg;->c(Lcom/roidapp/photogrid/release/cg;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 126
    :cond_1
    iget-object v2, p0, Lcom/roidapp/photogrid/release/cj;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/cg;->e(Lcom/roidapp/photogrid/release/cg;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 127
    iget-object v2, p0, Lcom/roidapp/photogrid/release/cj;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/cg;->a(Lcom/roidapp/photogrid/release/cg;)Lcom/roidapp/photogrid/release/ng;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/cj;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/cg;->b(Lcom/roidapp/photogrid/release/cg;)I

    move-result v3

    div-int/lit8 v3, v3, 0x5

    add-int/lit8 v3, v3, 0x5

    invoke-virtual {v2, v3, v1}, Lcom/roidapp/photogrid/release/ng;->c(IZ)V

    .line 128
    iget-object v2, p0, Lcom/roidapp/photogrid/release/cj;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/cg;->c(Lcom/roidapp/photogrid/release/cg;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 133
    :goto_1
    iget-object v2, p0, Lcom/roidapp/photogrid/release/cj;->a:Lcom/roidapp/photogrid/release/cg;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/cj;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/cg;->e(Lcom/roidapp/photogrid/release/cg;)Z

    move-result v3

    if-nez v3, :cond_3

    :goto_2
    invoke-static {v2, v0}, Lcom/roidapp/photogrid/release/cg;->a(Lcom/roidapp/photogrid/release/cg;Z)Z

    goto :goto_0

    .line 130
    :cond_2
    iget-object v2, p0, Lcom/roidapp/photogrid/release/cj;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/cg;->a(Lcom/roidapp/photogrid/release/cg;)Lcom/roidapp/photogrid/release/ng;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/cj;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/cg;->b(Lcom/roidapp/photogrid/release/cg;)I

    move-result v3

    div-int/lit8 v3, v3, 0x5

    add-int/lit8 v3, v3, 0x5

    invoke-virtual {v2, v3, v0}, Lcom/roidapp/photogrid/release/ng;->c(IZ)V

    .line 131
    iget-object v2, p0, Lcom/roidapp/photogrid/release/cj;->a:Lcom/roidapp/photogrid/release/cg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/cg;->c(Lcom/roidapp/photogrid/release/cg;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    :cond_3
    move v0, v1

    .line 133
    goto :goto_2
.end method
