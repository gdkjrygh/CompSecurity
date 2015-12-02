.class Lcom/facebook/orca/chatheads/b/c;
.super Lcom/facebook/n/b;
.source "ChatHeadNuxBubbleView.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/b/a;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/chatheads/b/a;)V
    .locals 0

    .prologue
    .line 188
    iput-object p1, p0, Lcom/facebook/orca/chatheads/b/c;->a:Lcom/facebook/orca/chatheads/b/a;

    invoke-direct {p0}, Lcom/facebook/n/b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/chatheads/b/a;Lcom/facebook/orca/chatheads/b/b;)V
    .locals 0

    .prologue
    .line 188
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/b/c;-><init>(Lcom/facebook/orca/chatheads/b/a;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/n/c;)V
    .locals 2

    .prologue
    .line 192
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/c;->a:Lcom/facebook/orca/chatheads/b/a;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/b/a;->a(Lcom/facebook/orca/chatheads/b/a;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/facebook/orca/chatheads/b/a;->a(Landroid/view/View;Z)V

    .line 193
    return-void
.end method

.method public b(Lcom/facebook/n/c;)V
    .locals 2

    .prologue
    .line 197
    invoke-virtual {p1}, Lcom/facebook/n/c;->c()D

    move-result-wide v0

    double-to-float v0, v0

    .line 198
    iget-object v1, p0, Lcom/facebook/orca/chatheads/b/c;->a:Lcom/facebook/orca/chatheads/b/a;

    invoke-static {v1}, Lcom/facebook/orca/chatheads/b/a;->a(Lcom/facebook/orca/chatheads/b/a;)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/a/c/a;->e(Landroid/view/View;F)V

    .line 199
    iget-object v1, p0, Lcom/facebook/orca/chatheads/b/c;->a:Lcom/facebook/orca/chatheads/b/a;

    invoke-static {v1}, Lcom/facebook/orca/chatheads/b/a;->a(Lcom/facebook/orca/chatheads/b/a;)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/a/c/a;->f(Landroid/view/View;F)V

    .line 200
    iget-object v1, p0, Lcom/facebook/orca/chatheads/b/c;->a:Lcom/facebook/orca/chatheads/b/a;

    invoke-static {v1}, Lcom/facebook/orca/chatheads/b/a;->a(Lcom/facebook/orca/chatheads/b/a;)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/a/c/a;->a(Landroid/view/View;F)V

    .line 201
    return-void
.end method

.method public c(Lcom/facebook/n/c;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 205
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/c;->a:Lcom/facebook/orca/chatheads/b/a;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/b/a;->a(Lcom/facebook/orca/chatheads/b/a;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/chatheads/b/a;->a(Landroid/view/View;Z)V

    .line 207
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/c;->a:Lcom/facebook/orca/chatheads/b/a;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/b/a;->b(Lcom/facebook/orca/chatheads/b/a;)Lcom/google/common/d/a/ab;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 208
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/c;->a:Lcom/facebook/orca/chatheads/b/a;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/b/a;->b(Lcom/facebook/orca/chatheads/b/a;)Lcom/google/common/d/a/ab;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 209
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/c;->a:Lcom/facebook/orca/chatheads/b/a;

    invoke-static {v0, v2}, Lcom/facebook/orca/chatheads/b/a;->a(Lcom/facebook/orca/chatheads/b/a;Lcom/google/common/d/a/ab;)Lcom/google/common/d/a/ab;

    .line 211
    :cond_0
    return-void
.end method
