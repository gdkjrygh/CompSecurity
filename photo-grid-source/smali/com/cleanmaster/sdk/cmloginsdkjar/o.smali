.class final Lcom/cleanmaster/sdk/cmloginsdkjar/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/util/ArrayList;

.field final synthetic b:Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;


# direct methods
.method constructor <init>(Ljava/util/ArrayList;Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)V
    .locals 0

    .prologue
    .line 1570
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/o;->a:Ljava/util/ArrayList;

    iput-object p2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/o;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 1572
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/o;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    .line 1573
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;

    invoke-interface {v1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;->onCompleted(Lcom/cleanmaster/sdk/cmloginsdkjar/Response;)V

    goto :goto_0

    .line 1576
    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/o;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    invoke-virtual {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;->getCallbacks()Ljava/util/List;

    move-result-object v0

    .line 1577
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch$Callback;

    .line 1578
    iget-object v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/o;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;

    invoke-interface {v0, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch$Callback;->onBatchCompleted(Lcom/cleanmaster/sdk/cmloginsdkjar/RequestBatch;)V

    goto :goto_1

    .line 1580
    :cond_1
    return-void
.end method
