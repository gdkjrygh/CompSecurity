.class final Lcom/roidapp/photogrid/release/rl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ri;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ri;)V
    .locals 0

    .prologue
    .line 142
    iput-object p1, p0, Lcom/roidapp/photogrid/release/rl;->a:Lcom/roidapp/photogrid/release/ri;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 146
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rl;->a:Lcom/roidapp/photogrid/release/ri;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ri;->c(Lcom/roidapp/photogrid/release/ri;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/rl;->a:Lcom/roidapp/photogrid/release/ri;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ri;->d(Lcom/roidapp/photogrid/release/ri;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 147
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rl;->a:Lcom/roidapp/photogrid/release/ri;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ri;->c(Lcom/roidapp/photogrid/release/ri;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 148
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rl;->a:Lcom/roidapp/photogrid/release/ri;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ri;->d(Lcom/roidapp/photogrid/release/ri;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 149
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rl;->a:Lcom/roidapp/photogrid/release/ri;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ri;->e(Lcom/roidapp/photogrid/release/ri;)Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f07028c

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 153
    :goto_0
    return-void

    .line 151
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/rl;->a:Lcom/roidapp/photogrid/release/ri;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ri;->a(Lcom/roidapp/photogrid/release/ri;)V

    goto :goto_0
.end method
