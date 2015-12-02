.class final Lcom/mobvista/sdk/m/core/loader/d;
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
    .line 191
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/loader/d;->a:Lcom/mobvista/sdk/m/core/loader/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final OnLoadCanceled(I)V
    .locals 2

    .prologue
    .line 219
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/d;->a:Lcom/mobvista/sdk/m/core/loader/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/core/loader/c;->a(Lcom/mobvista/sdk/m/core/loader/c;Z)Z

    .line 220
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/d;->a:Lcom/mobvista/sdk/m/core/loader/c;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/c;->a(Lcom/mobvista/sdk/m/core/loader/c;)Lcom/mobvista/sdk/m/core/loader/g;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 221
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/d;->a:Lcom/mobvista/sdk/m/core/loader/c;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/c;->a(Lcom/mobvista/sdk/m/core/loader/c;)Lcom/mobvista/sdk/m/core/loader/g;

    .line 223
    :cond_0
    return-void
.end method

.method public final OnLoadError(ILjava/lang/String;)V
    .locals 2

    .prologue
    .line 211
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/d;->a:Lcom/mobvista/sdk/m/core/loader/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/core/loader/c;->a(Lcom/mobvista/sdk/m/core/loader/c;Z)Z

    .line 212
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/d;->a:Lcom/mobvista/sdk/m/core/loader/c;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/c;->a(Lcom/mobvista/sdk/m/core/loader/c;)Lcom/mobvista/sdk/m/core/loader/g;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 213
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/d;->a:Lcom/mobvista/sdk/m/core/loader/c;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/c;->a(Lcom/mobvista/sdk/m/core/loader/c;)Lcom/mobvista/sdk/m/core/loader/g;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/mobvista/sdk/m/core/loader/g;->a(Ljava/lang/String;)V

    .line 215
    :cond_0
    return-void
.end method

.method public final OnLoadFinish(ILjava/lang/Object;)V
    .locals 2

    .prologue
    .line 203
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/d;->a:Lcom/mobvista/sdk/m/core/loader/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/core/loader/c;->a(Lcom/mobvista/sdk/m/core/loader/c;Z)Z

    .line 204
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/d;->a:Lcom/mobvista/sdk/m/core/loader/c;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/c;->a(Lcom/mobvista/sdk/m/core/loader/c;)Lcom/mobvista/sdk/m/core/loader/g;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 205
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/d;->a:Lcom/mobvista/sdk/m/core/loader/c;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/c;->a(Lcom/mobvista/sdk/m/core/loader/c;)Lcom/mobvista/sdk/m/core/loader/g;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/mobvista/sdk/m/core/loader/g;->a(Ljava/lang/Object;)V

    .line 207
    :cond_0
    return-void
.end method

.method public final OnLoadStart(I)V
    .locals 1

    .prologue
    .line 195
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/d;->a:Lcom/mobvista/sdk/m/core/loader/c;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/c;->a(Lcom/mobvista/sdk/m/core/loader/c;)Lcom/mobvista/sdk/m/core/loader/g;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 196
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/d;->a:Lcom/mobvista/sdk/m/core/loader/c;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/c;->a(Lcom/mobvista/sdk/m/core/loader/c;)Lcom/mobvista/sdk/m/core/loader/g;

    .line 199
    :cond_0
    return-void
.end method
