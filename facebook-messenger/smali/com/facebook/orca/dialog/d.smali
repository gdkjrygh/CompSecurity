.class Lcom/facebook/orca/dialog/d;
.super Ljava/lang/Object;
.source "MenuDialogFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/dialog/MenuDialogItem;

.field final synthetic b:Lcom/facebook/orca/dialog/MenuDialogFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/dialog/MenuDialogFragment;Lcom/facebook/orca/dialog/MenuDialogItem;)V
    .locals 0

    .prologue
    .line 94
    iput-object p1, p0, Lcom/facebook/orca/dialog/d;->b:Lcom/facebook/orca/dialog/MenuDialogFragment;

    iput-object p2, p0, Lcom/facebook/orca/dialog/d;->a:Lcom/facebook/orca/dialog/MenuDialogItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 97
    iget-object v0, p0, Lcom/facebook/orca/dialog/d;->b:Lcom/facebook/orca/dialog/MenuDialogFragment;

    invoke-static {v0}, Lcom/facebook/orca/dialog/MenuDialogFragment;->a(Lcom/facebook/orca/dialog/MenuDialogFragment;)Lcom/facebook/orca/dialog/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Lcom/facebook/orca/dialog/d;->b:Lcom/facebook/orca/dialog/MenuDialogFragment;

    invoke-static {v0}, Lcom/facebook/orca/dialog/MenuDialogFragment;->b(Lcom/facebook/orca/dialog/MenuDialogFragment;)Lcom/facebook/orca/dialog/MenuDialogParams;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/dialog/MenuDialogParams;->d()Landroid/os/Parcelable;

    move-result-object v0

    .line 99
    iget-object v1, p0, Lcom/facebook/orca/dialog/d;->b:Lcom/facebook/orca/dialog/MenuDialogFragment;

    invoke-static {v1}, Lcom/facebook/orca/dialog/MenuDialogFragment;->a(Lcom/facebook/orca/dialog/MenuDialogFragment;)Lcom/facebook/orca/dialog/e;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/dialog/d;->a:Lcom/facebook/orca/dialog/MenuDialogItem;

    invoke-interface {v1, v2, v0}, Lcom/facebook/orca/dialog/e;->a(Lcom/facebook/orca/dialog/MenuDialogItem;Landroid/os/Parcelable;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p0, Lcom/facebook/orca/dialog/d;->b:Lcom/facebook/orca/dialog/MenuDialogFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/dialog/MenuDialogFragment;->a()V

    .line 103
    :cond_0
    return-void
.end method
