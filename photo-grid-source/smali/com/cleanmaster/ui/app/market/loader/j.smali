.class final Lcom/cleanmaster/ui/app/market/loader/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/cleanmaster/ui/app/market/loader/i;


# direct methods
.method constructor <init>(Lcom/cleanmaster/ui/app/market/loader/i;)V
    .locals 0

    .prologue
    .line 180
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/loader/j;->a:Lcom/cleanmaster/ui/app/market/loader/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 185
    :try_start_0
    invoke-static {}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a()Lcom/cleanmaster/ui/app/market/storage/MarketStorage;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/loader/j;->a:Lcom/cleanmaster/ui/app/market/loader/i;

    invoke-virtual {v1}, Lcom/cleanmaster/ui/app/market/loader/i;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->b(Ljava/lang/String;)V

    .line 186
    invoke-static {}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a()Lcom/cleanmaster/ui/app/market/storage/MarketStorage;

    move-result-object v0

    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/loader/j;->a:Lcom/cleanmaster/ui/app/market/loader/i;

    invoke-virtual {v1}, Lcom/cleanmaster/ui/app/market/loader/i;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/cleanmaster/ui/app/market/storage/MarketStorage;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 190
    :goto_0
    return-void

    .line 188
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method
