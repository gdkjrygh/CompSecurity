.class Lcom/facebook/orca/compose/af;
.super Ljava/lang/Object;
.source "ComposeFragment.java"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field final synthetic a:Lcom/facebook/orca/compose/ComposeFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 549
    iput-object p1, p0, Lcom/facebook/orca/compose/af;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    .prologue
    .line 567
    iget-object v0, p0, Lcom/facebook/orca/compose/af;->a:Lcom/facebook/orca/compose/ComposeFragment;

    const-wide/16 v1, 0x1f4

    invoke-static {v0, v1, v2}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ComposeFragment;J)V

    .line 568
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 552
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 1

    .prologue
    .line 556
    iget-object v0, p0, Lcom/facebook/orca/compose/af;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->s(Lcom/facebook/orca/compose/ComposeFragment;)V

    .line 560
    if-lez p4, :cond_0

    .line 561
    iget-object v0, p0, Lcom/facebook/orca/compose/af;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0, p2, p4}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ComposeFragment;II)V

    .line 563
    :cond_0
    return-void
.end method
