.class Lcom/facebook/orca/intents/a;
.super Lcom/facebook/fbservice/ops/h;
.source "CanonicalThreadHandler.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/intents/CanonicalThreadHandler;


# direct methods
.method constructor <init>(Lcom/facebook/orca/intents/CanonicalThreadHandler;)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lcom/facebook/orca/intents/a;->a:Lcom/facebook/orca/intents/CanonicalThreadHandler;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/facebook/orca/intents/a;->a:Lcom/facebook/orca/intents/CanonicalThreadHandler;

    invoke-static {v0, p1}, Lcom/facebook/orca/intents/CanonicalThreadHandler;->a(Lcom/facebook/orca/intents/CanonicalThreadHandler;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 87
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/orca/intents/a;->a:Lcom/facebook/orca/intents/CanonicalThreadHandler;

    invoke-static {v0, p1}, Lcom/facebook/orca/intents/CanonicalThreadHandler;->a(Lcom/facebook/orca/intents/CanonicalThreadHandler;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 92
    return-void
.end method
