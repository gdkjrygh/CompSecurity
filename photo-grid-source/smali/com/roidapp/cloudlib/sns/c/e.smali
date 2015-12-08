.class final Lcom/roidapp/cloudlib/sns/c/e;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/a/d;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/cloudlib/sns/c/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/roidapp/cloudlib/sns/c/c;)V
    .locals 1

    .prologue
    .line 233
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    .line 234
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/c/e;->a:Ljava/lang/ref/WeakReference;

    .line 235
    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/cloudlib/sns/c/c;B)V
    .locals 0

    .prologue
    .line 229
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/sns/c/e;-><init>(Lcom/roidapp/cloudlib/sns/c/c;)V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 3

    .prologue
    .line 271
    invoke-super {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/aa;->b(ILjava/lang/Exception;)V

    .line 273
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/e;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/c/c;

    .line 274
    if-nez v0, :cond_1

    .line 288
    :cond_0
    :goto_0
    return-void

    .line 277
    :cond_1
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/c/c;->b(Lcom/roidapp/cloudlib/sns/c/c;)V

    .line 279
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/c/c;->f(Lcom/roidapp/cloudlib/sns/c/c;)Z

    .line 281
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/c/c;->c(Lcom/roidapp/cloudlib/sns/c/c;)Lcom/roidapp/cloudlib/sns/login/a;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 282
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/c/c;->c(Lcom/roidapp/cloudlib/sns/c/c;)Lcom/roidapp/cloudlib/sns/login/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/login/a;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 283
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/c/c;->g(Lcom/roidapp/cloudlib/sns/c/c;)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/c/c;->g(Lcom/roidapp/cloudlib/sns/c/c;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_0

    .line 284
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/c/c;->g(Lcom/roidapp/cloudlib/sns/c/c;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 286
    :cond_2
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/c/c;->v()Lcom/roidapp/cloudlib/sns/i;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/at;->t:I

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/c/c;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/i;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final synthetic b(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 229
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/d;

    .line 1292
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/aa;->b(Ljava/lang/Object;)V

    .line 1293
    if-eqz p1, :cond_0

    .line 1296
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/e;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/c/c;

    .line 1297
    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/c/c;->h(Lcom/roidapp/cloudlib/sns/c/c;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/c/c;->c(Lcom/roidapp/cloudlib/sns/c/c;)Lcom/roidapp/cloudlib/sns/login/a;

    move-result-object v1

    if-nez v1, :cond_1

    .line 1298
    :cond_0
    :goto_0
    return-void

    .line 1301
    :cond_1
    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/a/d;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/c/c;->a(Lcom/roidapp/cloudlib/sns/c/c;Ljava/lang/String;)V

    .line 1302
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/c/c;->c(Lcom/roidapp/cloudlib/sns/c/c;)Lcom/roidapp/cloudlib/sns/login/a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/roidapp/cloudlib/sns/login/a;->a(Ljava/util/List;)V

    .line 1303
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/c/c;->d(Lcom/roidapp/cloudlib/sns/c/c;)V

    .line 1306
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/c/c;->e(Lcom/roidapp/cloudlib/sns/c/c;)Landroid/widget/ListView;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 1310
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/c/c;->c(Lcom/roidapp/cloudlib/sns/c/c;)Lcom/roidapp/cloudlib/sns/login/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/a;->notifyDataSetChanged()V

    goto :goto_0
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 229
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a/d;

    .line 2239
    if-nez p1, :cond_1

    .line 2240
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/c/e;->b(ILjava/lang/Exception;)V

    .line 2248
    :cond_0
    :goto_0
    return-void

    .line 2244
    :cond_1
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/aa;->c(Ljava/lang/Object;)V

    .line 2246
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/c/e;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/c/c;

    .line 2247
    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/c/c;->a(Lcom/roidapp/cloudlib/sns/c/c;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2250
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/c/c;->b(Lcom/roidapp/cloudlib/sns/c/c;)V

    .line 2253
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/c/c;->c(Lcom/roidapp/cloudlib/sns/c/c;)Lcom/roidapp/cloudlib/sns/login/a;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2256
    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/a/d;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/c/c;->a(Lcom/roidapp/cloudlib/sns/c/c;Ljava/lang/String;)V

    .line 2258
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/c/c;->c(Lcom/roidapp/cloudlib/sns/c/c;)Lcom/roidapp/cloudlib/sns/login/a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/roidapp/cloudlib/sns/login/a;->a(Ljava/util/List;)V

    .line 2259
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/c/c;->d(Lcom/roidapp/cloudlib/sns/c/c;)V

    .line 2262
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/c/c;->e(Lcom/roidapp/cloudlib/sns/c/c;)Landroid/widget/ListView;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2266
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/c/c;->c(Lcom/roidapp/cloudlib/sns/c/c;)Lcom/roidapp/cloudlib/sns/login/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/a;->notifyDataSetChanged()V

    goto :goto_0
.end method
