.class final Lcom/mobvista/sdk/m/core/loader/r;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/core/loader/n;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/loader/n;)V
    .locals 0

    .prologue
    .line 253
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/loader/r;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 256
    invoke-static {}, Lcom/mobvista/sdk/m/core/loader/n;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "js\u8d85\u65f6\uff01\u8d85\u65f6\u4e0a\u9650\uff1a"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/loader/r;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v2}, Lcom/mobvista/sdk/m/core/loader/n;->k(Lcom/mobvista/sdk/m/core/loader/n;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, "ms"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 257
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/r;->a:Lcom/mobvista/sdk/m/core/loader/n;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/loader/n;->c(Lcom/mobvista/sdk/m/core/loader/n;)V

    .line 258
    return-void
.end method
