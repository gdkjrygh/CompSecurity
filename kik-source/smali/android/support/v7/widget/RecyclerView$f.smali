.class final Landroid/support/v7/widget/RecyclerView$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v7/widget/RecyclerView$e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "f"
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/widget/RecyclerView;


# direct methods
.method private constructor <init>(Landroid/support/v7/widget/RecyclerView;)V
    .locals 0

    .prologue
    .line 9273
    iput-object p1, p0, Landroid/support/v7/widget/RecyclerView$f;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/widget/RecyclerView;B)V
    .locals 0

    .prologue
    .line 9273
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$f;-><init>(Landroid/support/v7/widget/RecyclerView;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/support/v7/widget/RecyclerView$t;)V
    .locals 3

    .prologue
    .line 9277
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView$t;->a(Z)V

    .line 9278
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$f;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p1, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    invoke-static {v0, v1}, Landroid/support/v7/widget/RecyclerView;->c(Landroid/support/v7/widget/RecyclerView;Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$t;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 9279
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$f;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p1, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v7/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 9281
    :cond_0
    return-void
.end method

.method public final b(Landroid/support/v7/widget/RecyclerView$t;)V
    .locals 2

    .prologue
    .line 9285
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView$t;->a(Z)V

    .line 9286
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView$t;->c(Landroid/support/v7/widget/RecyclerView$t;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 9287
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$f;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p1, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    invoke-static {v0, v1}, Landroid/support/v7/widget/RecyclerView;->c(Landroid/support/v7/widget/RecyclerView;Landroid/view/View;)Z

    .line 9289
    :cond_0
    return-void
.end method

.method public final c(Landroid/support/v7/widget/RecyclerView$t;)V
    .locals 2

    .prologue
    .line 9293
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView$t;->a(Z)V

    .line 9294
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView$t;->c(Landroid/support/v7/widget/RecyclerView$t;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 9295
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$f;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p1, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    invoke-static {v0, v1}, Landroid/support/v7/widget/RecyclerView;->c(Landroid/support/v7/widget/RecyclerView;Landroid/view/View;)Z

    .line 9297
    :cond_0
    return-void
.end method

.method public final d(Landroid/support/v7/widget/RecyclerView$t;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 9301
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView$t;->a(Z)V

    .line 9329
    iget-object v0, p1, Landroid/support/v7/widget/RecyclerView$t;->g:Landroid/support/v7/widget/RecyclerView$t;

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroid/support/v7/widget/RecyclerView$t;->h:Landroid/support/v7/widget/RecyclerView$t;

    if-nez v0, :cond_0

    .line 9330
    iput-object v2, p1, Landroid/support/v7/widget/RecyclerView$t;->g:Landroid/support/v7/widget/RecyclerView$t;

    .line 9331
    const/16 v0, -0x41

    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView$t;->d(Landroid/support/v7/widget/RecyclerView$t;)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/support/v7/widget/RecyclerView$t;->a(II)V

    .line 9335
    :cond_0
    iput-object v2, p1, Landroid/support/v7/widget/RecyclerView$t;->h:Landroid/support/v7/widget/RecyclerView$t;

    .line 9336
    invoke-static {p1}, Landroid/support/v7/widget/RecyclerView$t;->c(Landroid/support/v7/widget/RecyclerView$t;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 9337
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$f;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p1, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    invoke-static {v0, v1}, Landroid/support/v7/widget/RecyclerView;->c(Landroid/support/v7/widget/RecyclerView;Landroid/view/View;)Z

    .line 9339
    :cond_1
    return-void
.end method
