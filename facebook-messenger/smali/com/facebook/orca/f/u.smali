.class Lcom/facebook/orca/f/u;
.super Lcom/facebook/fbservice/ops/ac;
.source "SendMessageManager.java"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/facebook/orca/f/r;


# direct methods
.method constructor <init>(Lcom/facebook/orca/f/r;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 553
    iput-object p1, p0, Lcom/facebook/orca/f/u;->b:Lcom/facebook/orca/f/r;

    iput-object p2, p0, Lcom/facebook/orca/f/u;->a:Ljava/lang/String;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 556
    iget-object v0, p0, Lcom/facebook/orca/f/u;->b:Lcom/facebook/orca/f/r;

    invoke-static {v0, p1}, Lcom/facebook/orca/f/r;->a(Lcom/facebook/orca/f/r;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 557
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 561
    iget-object v0, p0, Lcom/facebook/orca/f/u;->b:Lcom/facebook/orca/f/r;

    iget-object v1, p0, Lcom/facebook/orca/f/u;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/facebook/orca/f/r;->a(Ljava/lang/String;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 562
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 553
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/f/u;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
