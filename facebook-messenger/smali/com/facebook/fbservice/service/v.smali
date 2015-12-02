.class public Lcom/facebook/fbservice/service/v;
.super Ljava/lang/Object;
.source "FilterChainLink.java"

# interfaces
.implements Lcom/facebook/fbservice/service/e;


# instance fields
.field private final a:Lcom/facebook/fbservice/service/f;

.field private final b:Lcom/facebook/fbservice/service/e;


# direct methods
.method public constructor <init>(Lcom/facebook/fbservice/service/f;Lcom/facebook/fbservice/service/e;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/facebook/fbservice/service/v;->a:Lcom/facebook/fbservice/service/f;

    .line 15
    iput-object p2, p0, Lcom/facebook/fbservice/service/v;->b:Lcom/facebook/fbservice/service/e;

    .line 16
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 20
    iget-object v0, p0, Lcom/facebook/fbservice/service/v;->a:Lcom/facebook/fbservice/service/f;

    iget-object v1, p0, Lcom/facebook/fbservice/service/v;->b:Lcom/facebook/fbservice/service/e;

    invoke-interface {v0, p1, v1}, Lcom/facebook/fbservice/service/f;->a(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method
