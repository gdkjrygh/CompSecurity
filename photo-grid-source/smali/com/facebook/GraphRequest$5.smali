.class final Lcom/facebook/GraphRequest$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic val$callbacks:Ljava/util/ArrayList;

.field final synthetic val$requests:Lcom/facebook/GraphRequestBatch;


# direct methods
.method constructor <init>(Ljava/util/ArrayList;Lcom/facebook/GraphRequestBatch;)V
    .locals 0

    .prologue
    .line 1243
    iput-object p1, p0, Lcom/facebook/GraphRequest$5;->val$callbacks:Ljava/util/ArrayList;

    iput-object p2, p0, Lcom/facebook/GraphRequest$5;->val$requests:Lcom/facebook/GraphRequestBatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 1245
    iget-object v0, p0, Lcom/facebook/GraphRequest$5;->val$callbacks:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    .line 1246
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Lcom/facebook/GraphRequest$Callback;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Lcom/facebook/GraphResponse;

    invoke-interface {v1, v0}, Lcom/facebook/GraphRequest$Callback;->onCompleted(Lcom/facebook/GraphResponse;)V

    goto :goto_0

    .line 1249
    :cond_0
    iget-object v0, p0, Lcom/facebook/GraphRequest$5;->val$requests:Lcom/facebook/GraphRequestBatch;

    invoke-virtual {v0}, Lcom/facebook/GraphRequestBatch;->getCallbacks()Ljava/util/List;

    move-result-object v0

    .line 1250
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/GraphRequestBatch$Callback;

    .line 1251
    iget-object v2, p0, Lcom/facebook/GraphRequest$5;->val$requests:Lcom/facebook/GraphRequestBatch;

    invoke-interface {v0, v2}, Lcom/facebook/GraphRequestBatch$Callback;->onBatchCompleted(Lcom/facebook/GraphRequestBatch;)V

    goto :goto_1

    .line 1253
    :cond_1
    return-void
.end method
