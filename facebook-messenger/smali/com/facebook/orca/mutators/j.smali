.class Lcom/facebook/orca/mutators/j;
.super Lcom/facebook/fbservice/ops/h;
.source "ResendMessageDialogFragment.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/mutators/ResendMessageDialogFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/mutators/ResendMessageDialogFragment;)V
    .locals 0

    .prologue
    .line 163
    iput-object p1, p0, Lcom/facebook/orca/mutators/j;->a:Lcom/facebook/orca/mutators/ResendMessageDialogFragment;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lcom/facebook/orca/mutators/j;->a:Lcom/facebook/orca/mutators/ResendMessageDialogFragment;

    invoke-static {v0, p1}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->a(Lcom/facebook/orca/mutators/ResendMessageDialogFragment;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 167
    return-void
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 1

    .prologue
    .line 171
    iget-object v0, p0, Lcom/facebook/orca/mutators/j;->a:Lcom/facebook/orca/mutators/ResendMessageDialogFragment;

    invoke-static {v0, p1}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->a(Lcom/facebook/orca/mutators/ResendMessageDialogFragment;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 172
    return-void
.end method
