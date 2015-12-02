.class Lcom/facebook/reflex/view/j;
.super Landroid/database/DataSetObserver;
.source "ListView.java"


# instance fields
.field final synthetic a:Lcom/facebook/reflex/view/h;


# direct methods
.method constructor <init>(Lcom/facebook/reflex/view/h;)V
    .locals 0

    .prologue
    .line 323
    iput-object p1, p0, Lcom/facebook/reflex/view/j;->a:Lcom/facebook/reflex/view/h;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    .prologue
    .line 326
    iget-object v0, p0, Lcom/facebook/reflex/view/j;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v0}, Lcom/facebook/reflex/view/h;->a(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/view/c/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/reflex/view/c/o;->a()V

    .line 327
    iget-object v0, p0, Lcom/facebook/reflex/view/j;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v0}, Lcom/facebook/reflex/view/h;->b(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/view/c/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/reflex/view/c/d;->b()V

    .line 328
    iget-object v0, p0, Lcom/facebook/reflex/view/j;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v0}, Lcom/facebook/reflex/view/h;->c(Lcom/facebook/reflex/view/h;)V

    .line 329
    iget-object v0, p0, Lcom/facebook/reflex/view/j;->a:Lcom/facebook/reflex/view/h;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/h;->requestLayout()V

    .line 330
    return-void
.end method

.method public onInvalidated()V
    .locals 7

    .prologue
    .line 334
    iget-object v0, p0, Lcom/facebook/reflex/view/j;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v0}, Lcom/facebook/reflex/view/h;->a(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/view/c/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/reflex/view/c/o;->a()V

    .line 335
    iget-object v0, p0, Lcom/facebook/reflex/view/j;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v0}, Lcom/facebook/reflex/view/h;->b(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/view/c/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/reflex/view/c/d;->a()V

    .line 336
    iget-object v6, p0, Lcom/facebook/reflex/view/j;->a:Lcom/facebook/reflex/view/h;

    new-instance v0, Lcom/facebook/reflex/view/c/d;

    iget-object v1, p0, Lcom/facebook/reflex/view/j;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v1}, Lcom/facebook/reflex/view/h;->d(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/Scroller;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/reflex/view/j;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v2}, Lcom/facebook/reflex/view/h;->e(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/view/c/s;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/reflex/view/j;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v3}, Lcom/facebook/reflex/view/h;->f(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/view/c/f;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/reflex/view/j;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v4}, Lcom/facebook/reflex/view/h;->g(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/Transaction;

    move-result-object v4

    iget-object v5, p0, Lcom/facebook/reflex/view/j;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v5}, Lcom/facebook/reflex/view/h;->h(Lcom/facebook/reflex/view/h;)Lcom/facebook/reflex/a/c;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/facebook/reflex/view/c/d;-><init>(Lcom/facebook/reflex/Scroller;Lcom/facebook/reflex/view/c/s;Lcom/facebook/reflex/view/c/f;Lcom/facebook/reflex/Transaction;Lcom/facebook/reflex/a/c;)V

    invoke-static {v6, v0}, Lcom/facebook/reflex/view/h;->a(Lcom/facebook/reflex/view/h;Lcom/facebook/reflex/view/c/d;)Lcom/facebook/reflex/view/c/d;

    .line 342
    iget-object v0, p0, Lcom/facebook/reflex/view/j;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v0}, Lcom/facebook/reflex/view/h;->c(Lcom/facebook/reflex/view/h;)V

    .line 343
    iget-object v0, p0, Lcom/facebook/reflex/view/j;->a:Lcom/facebook/reflex/view/h;

    invoke-virtual {v0}, Lcom/facebook/reflex/view/h;->requestLayout()V

    .line 344
    return-void
.end method
