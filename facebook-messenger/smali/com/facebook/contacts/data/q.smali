.class Lcom/facebook/contacts/data/q;
.super Lcom/facebook/fbservice/ops/ac;
.source "DynamicContactDataEnsurer.java"


# instance fields
.field final synthetic a:Lcom/facebook/contacts/data/p;


# direct methods
.method constructor <init>(Lcom/facebook/contacts/data/p;)V
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Lcom/facebook/contacts/data/q;->a:Lcom/facebook/contacts/data/p;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/contacts/data/q;->a:Lcom/facebook/contacts/data/p;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/contacts/data/p;->a(Lcom/facebook/contacts/data/p;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 70
    iget-object v0, p0, Lcom/facebook/contacts/data/q;->a:Lcom/facebook/contacts/data/p;

    invoke-static {v0, p1}, Lcom/facebook/contacts/data/p;->a(Lcom/facebook/contacts/data/p;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 71
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 75
    iget-object v0, p0, Lcom/facebook/contacts/data/q;->a:Lcom/facebook/contacts/data/p;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/contacts/data/p;->a(Lcom/facebook/contacts/data/p;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 76
    iget-object v0, p0, Lcom/facebook/contacts/data/q;->a:Lcom/facebook/contacts/data/p;

    invoke-static {v0, p1}, Lcom/facebook/contacts/data/p;->a(Lcom/facebook/contacts/data/p;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 77
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 66
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/contacts/data/q;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
