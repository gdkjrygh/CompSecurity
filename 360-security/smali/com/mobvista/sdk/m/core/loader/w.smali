.class final Lcom/mobvista/sdk/m/core/loader/w;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/core/loader/t;


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/core/loader/v;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/loader/v;)V
    .locals 0

    .prologue
    .line 179
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/loader/w;->a:Lcom/mobvista/sdk/m/core/loader/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a()V
    .locals 3

    .prologue
    .line 212
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/w;->a:Lcom/mobvista/sdk/m/core/loader/v;

    iget-object v1, v0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    monitor-enter v1

    .line 213
    :try_start_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/w;->a:Lcom/mobvista/sdk/m/core/loader/v;

    iget-object v0, v0, Lcom/mobvista/sdk/m/core/loader/v;->a:Lcom/mobvista/sdk/m/core/loader/u;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/u;->a(Lcom/mobvista/sdk/m/core/loader/u;)Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/mobvista/sdk/m/core/loader/JumpLoader$JumpLoaderResult;->setSuccess(Z)V

    .line 214
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/w;->a:Lcom/mobvista/sdk/m/core/loader/v;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/v;->a(Lcom/mobvista/sdk/m/core/loader/v;)V

    .line 215
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 183
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/w;->a:Lcom/mobvista/sdk/m/core/loader/v;

    invoke-static {v0, p1}, Lcom/mobvista/sdk/m/core/loader/v;->a(Lcom/mobvista/sdk/m/core/loader/v;Ljava/lang/String;)Z

    move-result v0

    .line 184
    if-eqz v0, :cond_0

    .line 185
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/w;->a()V

    .line 187
    :cond_0
    return v0
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 192
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/w;->a:Lcom/mobvista/sdk/m/core/loader/v;

    invoke-static {v0, p1}, Lcom/mobvista/sdk/m/core/loader/v;->a(Lcom/mobvista/sdk/m/core/loader/v;Ljava/lang/String;)Z

    move-result v0

    .line 193
    if-eqz v0, :cond_0

    .line 194
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/w;->a()V

    .line 196
    :cond_0
    return v0
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 206
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/w;->a:Lcom/mobvista/sdk/m/core/loader/v;

    invoke-static {v0, p1}, Lcom/mobvista/sdk/m/core/loader/v;->a(Lcom/mobvista/sdk/m/core/loader/v;Ljava/lang/String;)Z

    .line 208
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/w;->a()V

    .line 209
    return-void
.end method
