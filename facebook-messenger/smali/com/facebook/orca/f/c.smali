.class Lcom/facebook/orca/f/c;
.super Lcom/facebook/fbservice/ops/ac;
.source "ArchiveThreadManager.java"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/facebook/orca/f/b;


# direct methods
.method constructor <init>(Lcom/facebook/orca/f/b;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 54
    iput-object p1, p0, Lcom/facebook/orca/f/c;->b:Lcom/facebook/orca/f/b;

    iput-object p2, p0, Lcom/facebook/orca/f/c;->a:Ljava/lang/String;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/orca/f/c;->b:Lcom/facebook/orca/f/b;

    iget-object v1, p0, Lcom/facebook/orca/f/c;->a:Ljava/lang/String;

    invoke-static {v0, p1, v1}, Lcom/facebook/orca/f/b;->a(Lcom/facebook/orca/f/b;Lcom/facebook/fbservice/service/OperationResult;Ljava/lang/String;)V

    .line 58
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 62
    iget-object v0, p0, Lcom/facebook/orca/f/c;->b:Lcom/facebook/orca/f/b;

    iget-object v1, p0, Lcom/facebook/orca/f/c;->a:Ljava/lang/String;

    invoke-static {v0, p1, v1}, Lcom/facebook/orca/f/b;->a(Lcom/facebook/orca/f/b;Lcom/facebook/fbservice/service/ServiceException;Ljava/lang/String;)V

    .line 63
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 54
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/f/c;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
