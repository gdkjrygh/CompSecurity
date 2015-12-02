.class Lcom/facebook/orca/mutators/a;
.super Lcom/facebook/fbservice/ops/h;
.source "DeleteMessagesDialogFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;)V
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lcom/facebook/orca/mutators/a;->a:Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/facebook/orca/mutators/a;->a:Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;

    invoke-static {v0, p1}, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->a(Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 77
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/facebook/orca/mutators/a;->a:Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;

    invoke-static {v0, p1}, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->a(Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 82
    return-void
.end method
