.class Lcom/facebook/orca/f/y;
.super Lcom/facebook/fbservice/ops/ac;
.source "SpamThreadManager.java"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/facebook/orca/f/x;


# direct methods
.method constructor <init>(Lcom/facebook/orca/f/x;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/facebook/orca/f/y;->b:Lcom/facebook/orca/f/x;

    iput-object p2, p0, Lcom/facebook/orca/f/y;->a:Ljava/lang/String;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 58
    iget-object v0, p0, Lcom/facebook/orca/f/y;->b:Lcom/facebook/orca/f/x;

    iget-object v1, p0, Lcom/facebook/orca/f/y;->a:Ljava/lang/String;

    invoke-static {v0, p1, v1}, Lcom/facebook/orca/f/x;->a(Lcom/facebook/orca/f/x;Lcom/facebook/fbservice/service/OperationResult;Ljava/lang/String;)V

    .line 59
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/orca/f/y;->b:Lcom/facebook/orca/f/x;

    iget-object v1, p0, Lcom/facebook/orca/f/y;->a:Ljava/lang/String;

    invoke-static {v0, p1, v1}, Lcom/facebook/orca/f/x;->a(Lcom/facebook/orca/f/x;Lcom/facebook/fbservice/service/ServiceException;Ljava/lang/String;)V

    .line 64
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 55
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/f/y;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
