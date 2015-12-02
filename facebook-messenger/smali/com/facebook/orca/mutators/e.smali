.class Lcom/facebook/orca/mutators/e;
.super Ljava/lang/Object;
.source "DeleteThreadDialogFragment.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;)V
    .locals 0

    .prologue
    .line 143
    iput-object p1, p0, Lcom/facebook/orca/mutators/e;->a:Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 146
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 147
    return-void
.end method
