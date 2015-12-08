.class final Lcom/cleanmaster/ui/app/market/loader/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/cleanmaster/ui/app/market/data/MarketResponse;

.field final synthetic b:Lcom/cleanmaster/ui/app/market/loader/i;


# direct methods
.method constructor <init>(Lcom/cleanmaster/ui/app/market/loader/i;Lcom/cleanmaster/ui/app/market/data/MarketResponse;)V
    .locals 0

    .prologue
    .line 296
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/loader/k;->b:Lcom/cleanmaster/ui/app/market/loader/i;

    iput-object p2, p0, Lcom/cleanmaster/ui/app/market/loader/k;->a:Lcom/cleanmaster/ui/app/market/data/MarketResponse;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 299
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/k;->a:Lcom/cleanmaster/ui/app/market/data/MarketResponse;

    if-nez v0, :cond_0

    .line 300
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/k;->b:Lcom/cleanmaster/ui/app/market/loader/i;

    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/loader/k;->a:Lcom/cleanmaster/ui/app/market/data/MarketResponse;

    invoke-virtual {v0, v1}, Lcom/cleanmaster/ui/app/market/loader/i;->d(Lcom/cleanmaster/ui/app/market/data/MarketResponse;)V

    .line 311
    :goto_0
    return-void

    .line 303
    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/k;->a:Lcom/cleanmaster/ui/app/market/data/MarketResponse;

    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/data/MarketResponse;->success()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 304
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/k;->b:Lcom/cleanmaster/ui/app/market/loader/i;

    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/loader/k;->b:Lcom/cleanmaster/ui/app/market/loader/i;

    iget-object v2, p0, Lcom/cleanmaster/ui/app/market/loader/k;->a:Lcom/cleanmaster/ui/app/market/data/MarketResponse;

    invoke-static {v1, v2}, Lcom/cleanmaster/ui/app/market/loader/i;->a(Lcom/cleanmaster/ui/app/market/loader/i;Lcom/cleanmaster/ui/app/market/data/MarketResponse;)Lcom/cleanmaster/ui/app/market/data/MarketResponse;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/cleanmaster/ui/app/market/loader/i;->e(Lcom/cleanmaster/ui/app/market/data/MarketResponse;)V

    .line 310
    :goto_1
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/k;->b:Lcom/cleanmaster/ui/app/market/loader/i;

    const-string v1, "\n\n"

    invoke-virtual {v0, v1}, Lcom/cleanmaster/ui/app/market/loader/i;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 306
    :cond_1
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/loader/k;->b:Lcom/cleanmaster/ui/app/market/loader/i;

    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/loader/k;->a:Lcom/cleanmaster/ui/app/market/data/MarketResponse;

    invoke-virtual {v0, v1}, Lcom/cleanmaster/ui/app/market/loader/i;->d(Lcom/cleanmaster/ui/app/market/data/MarketResponse;)V

    goto :goto_1
.end method
