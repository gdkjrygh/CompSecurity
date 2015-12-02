.class Lcom/facebook/orca/mutators/d;
.super Lcom/facebook/fbservice/ops/ac;
.source "DeleteThreadDialogFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;)V
    .locals 0

    .prologue
    .line 106
    iput-object p1, p0, Lcom/facebook/orca/mutators/d;->a:Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 109
    iget-object v0, p0, Lcom/facebook/orca/mutators/d;->a:Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;

    iget-object v1, p0, Lcom/facebook/orca/mutators/d;->a:Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;

    invoke-static {v1}, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->b(Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->a(Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;Ljava/lang/String;)V

    .line 110
    iget-object v0, p0, Lcom/facebook/orca/mutators/d;->a:Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->a()V

    .line 111
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 115
    iget-object v0, p0, Lcom/facebook/orca/mutators/d;->a:Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->a(Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 116
    iget-object v0, p0, Lcom/facebook/orca/mutators/d;->a:Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;

    invoke-static {v0, p1}, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->a(Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 117
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 106
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/mutators/d;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
