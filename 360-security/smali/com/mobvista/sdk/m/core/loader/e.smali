.class final Lcom/mobvista/sdk/m/core/loader/e;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/a/a/c/d;


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/core/loader/c;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/loader/c;)V
    .locals 0

    .prologue
    .line 252
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/loader/e;->a:Lcom/mobvista/sdk/m/core/loader/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final OnLoadCanceled(I)V
    .locals 2

    .prologue
    .line 278
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/e;->a:Lcom/mobvista/sdk/m/core/loader/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/core/loader/c;->b(Lcom/mobvista/sdk/m/core/loader/c;Z)Z

    .line 279
    return-void
.end method

.method public final OnLoadError(ILjava/lang/String;)V
    .locals 2

    .prologue
    .line 270
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/e;->a:Lcom/mobvista/sdk/m/core/loader/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/core/loader/c;->b(Lcom/mobvista/sdk/m/core/loader/c;Z)Z

    .line 271
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/e;->a:Lcom/mobvista/sdk/m/core/loader/c;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/c;->a(Lcom/mobvista/sdk/m/core/loader/c;)Lcom/mobvista/sdk/m/core/loader/g;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 272
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/e;->a:Lcom/mobvista/sdk/m/core/loader/c;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/c;->a(Lcom/mobvista/sdk/m/core/loader/c;)Lcom/mobvista/sdk/m/core/loader/g;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/mobvista/sdk/m/core/loader/g;->a(Ljava/lang/String;)V

    .line 274
    :cond_0
    return-void
.end method

.method public final OnLoadFinish(ILjava/lang/Object;)V
    .locals 2

    .prologue
    .line 262
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/e;->a:Lcom/mobvista/sdk/m/core/loader/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/core/loader/c;->b(Lcom/mobvista/sdk/m/core/loader/c;Z)Z

    .line 263
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/e;->a:Lcom/mobvista/sdk/m/core/loader/c;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/c;->a(Lcom/mobvista/sdk/m/core/loader/c;)Lcom/mobvista/sdk/m/core/loader/g;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 264
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/e;->a:Lcom/mobvista/sdk/m/core/loader/c;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/c;->a(Lcom/mobvista/sdk/m/core/loader/c;)Lcom/mobvista/sdk/m/core/loader/g;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/mobvista/sdk/m/core/loader/g;->a(Ljava/lang/Object;)V

    .line 266
    :cond_0
    return-void
.end method

.method public final OnLoadStart(I)V
    .locals 0

    .prologue
    .line 258
    return-void
.end method
