.class Lcom/facebook/orca/f/q;
.super Lcom/facebook/fbservice/ops/ac;
.source "SaveDraftManager.java"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/facebook/orca/f/p;


# direct methods
.method constructor <init>(Lcom/facebook/orca/f/p;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/facebook/orca/f/q;->b:Lcom/facebook/orca/f/p;

    iput-object p2, p0, Lcom/facebook/orca/f/q;->a:Ljava/lang/String;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/orca/f/q;->b:Lcom/facebook/orca/f/p;

    invoke-static {v0}, Lcom/facebook/orca/f/p;->a(Lcom/facebook/orca/f/p;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/f/q;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/orca/f/q;->b:Lcom/facebook/orca/f/p;

    invoke-static {v0}, Lcom/facebook/orca/f/p;->a(Lcom/facebook/orca/f/p;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/f/q;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 46
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/f/q;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
