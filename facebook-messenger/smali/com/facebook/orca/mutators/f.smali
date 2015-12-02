.class Lcom/facebook/orca/mutators/f;
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
    .line 39
    iput-object p1, p0, Lcom/facebook/orca/mutators/f;->a:Lcom/facebook/orca/mutators/LeaveThreadDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/facebook/orca/mutators/f;->a:Lcom/facebook/orca/mutators/LeaveThreadDialogFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/mutators/LeaveThreadDialogFragment;->a()V

    .line 42
    return-void
.end method
