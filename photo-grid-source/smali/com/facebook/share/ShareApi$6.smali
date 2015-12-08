.class final Lcom/facebook/share/ShareApi$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/internal/CollectionMapper$Collection;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/internal/CollectionMapper$Collection",
        "<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic val$arrayList:Ljava/util/ArrayList;

.field final synthetic val$stagedObject:Lorg/json/JSONArray;


# direct methods
.method constructor <init>(Ljava/util/ArrayList;Lorg/json/JSONArray;)V
    .locals 0

    .prologue
    .line 358
    iput-object p1, p0, Lcom/facebook/share/ShareApi$6;->val$arrayList:Ljava/util/ArrayList;

    iput-object p2, p0, Lcom/facebook/share/ShareApi$6;->val$stagedObject:Lorg/json/JSONArray;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Integer;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 382
    iget-object v0, p0, Lcom/facebook/share/ShareApi$6;->val$arrayList:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 358
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/facebook/share/ShareApi$6;->get(Ljava/lang/Integer;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final keyIterator()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .prologue
    .line 361
    iget-object v0, p0, Lcom/facebook/share/ShareApi$6;->val$arrayList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 362
    new-instance v1, Lcom/facebook/internal/Mutable;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/facebook/internal/Mutable;-><init>(Ljava/lang/Object;)V

    .line 363
    new-instance v2, Lcom/facebook/share/ShareApi$6$1;

    invoke-direct {v2, p0, v1, v0}, Lcom/facebook/share/ShareApi$6$1;-><init>(Lcom/facebook/share/ShareApi$6;Lcom/facebook/internal/Mutable;I)V

    return-object v2
.end method

.method public final set(Ljava/lang/Integer;Ljava/lang/Object;Lcom/facebook/internal/CollectionMapper$OnErrorListener;)V
    .locals 2

    .prologue
    .line 390
    :try_start_0
    iget-object v0, p0, Lcom/facebook/share/ShareApi$6;->val$stagedObject:Lorg/json/JSONArray;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 398
    :goto_0
    return-void

    .line 392
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    .line 393
    if-nez v0, :cond_0

    .line 394
    const-string v0, "Error staging object."

    .line 396
    :cond_0
    new-instance v1, Lcom/facebook/FacebookException;

    invoke-direct {v1, v0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    invoke-interface {p3, v1}, Lcom/facebook/internal/CollectionMapper$OnErrorListener;->onError(Lcom/facebook/FacebookException;)V

    goto :goto_0
.end method

.method public final bridge synthetic set(Ljava/lang/Object;Ljava/lang/Object;Lcom/facebook/internal/CollectionMapper$OnErrorListener;)V
    .locals 0

    .prologue
    .line 358
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/share/ShareApi$6;->set(Ljava/lang/Integer;Ljava/lang/Object;Lcom/facebook/internal/CollectionMapper$OnErrorListener;)V

    return-void
.end method
