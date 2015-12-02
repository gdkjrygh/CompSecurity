.class Lcom/facebook/orca/threadlist/j;
.super Lcom/a/a/c;
.source "PublisherController.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/i;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/i;)V
    .locals 0

    .prologue
    .line 202
    iput-object p1, p0, Lcom/facebook/orca/threadlist/j;->a:Lcom/facebook/orca/threadlist/i;

    invoke-direct {p0}, Lcom/a/a/c;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/a/a/a;)V
    .locals 2

    .prologue
    .line 205
    iget-object v0, p0, Lcom/facebook/orca/threadlist/j;->a:Lcom/facebook/orca/threadlist/i;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/i;->a(Lcom/facebook/orca/threadlist/i;)I

    move-result v0

    iget-object v1, p0, Lcom/facebook/orca/threadlist/j;->a:Lcom/facebook/orca/threadlist/i;

    invoke-static {v1}, Lcom/facebook/orca/threadlist/i;->b(Lcom/facebook/orca/threadlist/i;)I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 207
    iget-object v0, p0, Lcom/facebook/orca/threadlist/j;->a:Lcom/facebook/orca/threadlist/i;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/i;->c(Lcom/facebook/orca/threadlist/i;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 208
    iget-object v0, p0, Lcom/facebook/orca/threadlist/j;->a:Lcom/facebook/orca/threadlist/i;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/i;->d(Lcom/facebook/orca/threadlist/i;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 216
    :cond_0
    :goto_0
    return-void

    .line 211
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadlist/j;->a:Lcom/facebook/orca/threadlist/i;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/i;->c(Lcom/facebook/orca/threadlist/i;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 212
    iget-object v0, p0, Lcom/facebook/orca/threadlist/j;->a:Lcom/facebook/orca/threadlist/i;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/i;->a(Lcom/facebook/orca/threadlist/i;)I

    move-result v0

    if-nez v0, :cond_0

    .line 213
    iget-object v0, p0, Lcom/facebook/orca/threadlist/j;->a:Lcom/facebook/orca/threadlist/i;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/i;->d(Lcom/facebook/orca/threadlist/i;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    goto :goto_0
.end method
