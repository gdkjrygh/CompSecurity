.class Lcom/facebook/orca/chatheads/du;
.super Lcom/facebook/n/b;
.source "ChatThreadView.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/dh;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/chatheads/dh;)V
    .locals 0

    .prologue
    .line 1209
    iput-object p1, p0, Lcom/facebook/orca/chatheads/du;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-direct {p0}, Lcom/facebook/n/b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/chatheads/dh;Lcom/facebook/orca/chatheads/di;)V
    .locals 0

    .prologue
    .line 1209
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/du;-><init>(Lcom/facebook/orca/chatheads/dh;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/n/c;)V
    .locals 2

    .prologue
    .line 1213
    iget-object v0, p0, Lcom/facebook/orca/chatheads/du;->a:Lcom/facebook/orca/chatheads/dh;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/facebook/orca/chatheads/dh;->a(Landroid/view/View;Z)V

    .line 1214
    iget-object v0, p0, Lcom/facebook/orca/chatheads/du;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/dh;->d(Lcom/facebook/orca/chatheads/dh;)Lcom/facebook/orca/chatheads/ek;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ek;->a(Z)V

    .line 1215
    return-void
.end method

.method public b(Lcom/facebook/n/c;)V
    .locals 4

    .prologue
    .line 1219
    invoke-virtual {p1}, Lcom/facebook/n/c;->c()D

    move-result-wide v0

    double-to-float v0, v0

    .line 1220
    iget-object v1, p0, Lcom/facebook/orca/chatheads/du;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v1, v0}, Lcom/a/c/a;->e(Landroid/view/View;F)V

    .line 1221
    iget-object v1, p0, Lcom/facebook/orca/chatheads/du;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v1, v0}, Lcom/a/c/a;->f(Landroid/view/View;F)V

    .line 1222
    iget-object v1, p0, Lcom/facebook/orca/chatheads/du;->a:Lcom/facebook/orca/chatheads/dh;

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v0, v3}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v1, v0}, Lcom/a/c/a;->a(Landroid/view/View;F)V

    .line 1223
    return-void
.end method

.method public c(Lcom/facebook/n/c;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v0, 0x0

    .line 1227
    iget-object v1, p0, Lcom/facebook/orca/chatheads/du;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v1, v0}, Lcom/facebook/orca/chatheads/dh;->a(Landroid/view/View;Z)V

    .line 1228
    iget-object v1, p0, Lcom/facebook/orca/chatheads/du;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v1}, Lcom/facebook/orca/chatheads/dh;->a(Lcom/facebook/orca/chatheads/dh;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1229
    iget-object v1, p0, Lcom/facebook/orca/chatheads/du;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v1}, Lcom/facebook/orca/chatheads/dh;->b(Lcom/facebook/orca/chatheads/dh;)V

    .line 1231
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/chatheads/du;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v1}, Lcom/facebook/orca/chatheads/dh;->d(Lcom/facebook/orca/chatheads/dh;)Lcom/facebook/orca/chatheads/ek;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/n/c;->d()D

    move-result-wide v2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    cmpl-double v2, v2, v4

    if-nez v2, :cond_1

    const/4 v0, 0x1

    :cond_1
    invoke-virtual {v1, v0}, Lcom/facebook/orca/chatheads/ek;->a(Z)V

    .line 1232
    iget-object v0, p0, Lcom/facebook/orca/chatheads/du;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/dh;->n(Lcom/facebook/orca/chatheads/dh;)Lcom/google/common/d/a/ab;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1233
    iget-object v0, p0, Lcom/facebook/orca/chatheads/du;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/dh;->n(Lcom/facebook/orca/chatheads/dh;)Lcom/google/common/d/a/ab;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 1234
    iget-object v0, p0, Lcom/facebook/orca/chatheads/du;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0, v6}, Lcom/facebook/orca/chatheads/dh;->a(Lcom/facebook/orca/chatheads/dh;Lcom/google/common/d/a/ab;)Lcom/google/common/d/a/ab;

    .line 1236
    :cond_2
    return-void
.end method
