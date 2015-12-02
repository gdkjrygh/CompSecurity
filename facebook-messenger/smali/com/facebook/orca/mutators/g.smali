.class Lcom/facebook/orca/mutators/g;
.super Ljava/lang/Object;
.source "LeaveThreadDialogFragment.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/mutators/LeaveThreadDialogFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/mutators/LeaveThreadDialogFragment;)V
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/facebook/orca/mutators/g;->a:Lcom/facebook/orca/mutators/LeaveThreadDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/orca/mutators/g;->a:Lcom/facebook/orca/mutators/LeaveThreadDialogFragment;

    invoke-static {v0}, Lcom/facebook/orca/mutators/LeaveThreadDialogFragment;->a(Lcom/facebook/orca/mutators/LeaveThreadDialogFragment;)Lcom/facebook/orca/mutators/h;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 33
    iget-object v0, p0, Lcom/facebook/orca/mutators/g;->a:Lcom/facebook/orca/mutators/LeaveThreadDialogFragment;

    invoke-static {v0}, Lcom/facebook/orca/mutators/LeaveThreadDialogFragment;->a(Lcom/facebook/orca/mutators/LeaveThreadDialogFragment;)Lcom/facebook/orca/mutators/h;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/orca/mutators/h;->a()V

    .line 35
    :cond_0
    return-void
.end method
