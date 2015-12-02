.class Lcom/facebook/orca/creation/c;
.super Lcom/facebook/fbservice/ops/h;
.source "CreateThreadActivity.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/creation/CreateThreadActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/creation/CreateThreadActivity;)V
    .locals 0

    .prologue
    .line 229
    iput-object p1, p0, Lcom/facebook/orca/creation/c;->a:Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 232
    iget-object v0, p0, Lcom/facebook/orca/creation/c;->a:Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-static {v0, p1}, Lcom/facebook/orca/creation/CreateThreadActivity;->b(Lcom/facebook/orca/creation/CreateThreadActivity;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 233
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 1

    .prologue
    .line 237
    iget-object v0, p0, Lcom/facebook/orca/creation/c;->a:Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-static {v0, p1}, Lcom/facebook/orca/creation/CreateThreadActivity;->b(Lcom/facebook/orca/creation/CreateThreadActivity;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 238
    return-void
.end method
