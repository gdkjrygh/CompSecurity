.class Lcom/facebook/reflex/view/c/q;
.super Ljava/lang/Object;
.source "SelectionController.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/reflex/view/c/o;

.field private b:I

.field private c:Lcom/facebook/reflex/view/b/r;


# direct methods
.method private constructor <init>(Lcom/facebook/reflex/view/c/o;)V
    .locals 0

    .prologue
    .line 287
    iput-object p1, p0, Lcom/facebook/reflex/view/c/q;->a:Lcom/facebook/reflex/view/c/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/reflex/view/c/o;Lcom/facebook/reflex/view/c/p;)V
    .locals 0

    .prologue
    .line 287
    invoke-direct {p0, p1}, Lcom/facebook/reflex/view/c/q;-><init>(Lcom/facebook/reflex/view/c/o;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/reflex/view/b/r;)V
    .locals 1

    .prologue
    .line 293
    iget-object v0, p0, Lcom/facebook/reflex/view/c/q;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v0}, Lcom/facebook/reflex/view/c/o;->d(Lcom/facebook/reflex/view/c/o;)I

    move-result v0

    iput v0, p0, Lcom/facebook/reflex/view/c/q;->b:I

    .line 294
    iput-object p1, p0, Lcom/facebook/reflex/view/c/q;->c:Lcom/facebook/reflex/view/b/r;

    .line 295
    return-void
.end method

.method public run()V
    .locals 3

    .prologue
    .line 299
    iget-object v0, p0, Lcom/facebook/reflex/view/c/q;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v0}, Lcom/facebook/reflex/view/c/o;->e(Lcom/facebook/reflex/view/c/o;)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/facebook/reflex/view/c/q;->b:I

    iget-object v1, p0, Lcom/facebook/reflex/view/c/q;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v1}, Lcom/facebook/reflex/view/c/o;->d(Lcom/facebook/reflex/view/c/o;)I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/reflex/view/c/q;->c:Lcom/facebook/reflex/view/b/r;

    if-eqz v0, :cond_0

    .line 300
    iget-object v0, p0, Lcom/facebook/reflex/view/c/q;->a:Lcom/facebook/reflex/view/c/o;

    iget-object v1, p0, Lcom/facebook/reflex/view/c/q;->c:Lcom/facebook/reflex/view/b/r;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;Lcom/facebook/reflex/view/b/r;Z)V

    .line 301
    iget-object v0, p0, Lcom/facebook/reflex/view/c/q;->a:Lcom/facebook/reflex/view/c/o;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/view/c/o;->c(I)V

    .line 303
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/reflex/view/c/q;->c:Lcom/facebook/reflex/view/b/r;

    .line 304
    return-void
.end method
