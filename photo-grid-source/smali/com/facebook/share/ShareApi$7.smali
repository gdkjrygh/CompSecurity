.class final Lcom/facebook/share/ShareApi$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/internal/CollectionMapper$OnMapperCompleteListener;


# instance fields
.field final synthetic val$onArrayListStagedListener:Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;

.field final synthetic val$stagedObject:Lorg/json/JSONArray;


# direct methods
.method constructor <init>(Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;Lorg/json/JSONArray;)V
    .locals 0

    .prologue
    .line 401
    iput-object p1, p0, Lcom/facebook/share/ShareApi$7;->val$onArrayListStagedListener:Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;

    iput-object p2, p0, Lcom/facebook/share/ShareApi$7;->val$stagedObject:Lorg/json/JSONArray;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onComplete()V
    .locals 2

    .prologue
    .line 404
    iget-object v0, p0, Lcom/facebook/share/ShareApi$7;->val$onArrayListStagedListener:Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;

    iget-object v1, p0, Lcom/facebook/share/ShareApi$7;->val$stagedObject:Lorg/json/JSONArray;

    invoke-interface {v0, v1}, Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;->onComplete(Ljava/lang/Object;)V

    .line 405
    return-void
.end method

.method public final onError(Lcom/facebook/FacebookException;)V
    .locals 1

    .prologue
    .line 409
    iget-object v0, p0, Lcom/facebook/share/ShareApi$7;->val$onArrayListStagedListener:Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;

    invoke-interface {v0, p1}, Lcom/facebook/internal/CollectionMapper$OnMapValueCompleteListener;->onError(Lcom/facebook/FacebookException;)V

    .line 410
    return-void
.end method
