.class Lcom/facebook/orca/creation/i;
.super Ljava/lang/Object;
.source "CreateThreadActivity.java"

# interfaces
.implements Lcom/facebook/orca/activity/d;


# instance fields
.field final synthetic a:Lcom/facebook/orca/creation/CreateThreadActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/creation/CreateThreadActivity;)V
    .locals 0

    .prologue
    .line 511
    iput-object p1, p0, Lcom/facebook/orca/creation/i;->a:Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    .prologue
    .line 514
    if-eqz p1, :cond_0

    .line 515
    iget-object v0, p0, Lcom/facebook/orca/creation/i;->a:Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-static {v0}, Lcom/facebook/orca/creation/CreateThreadActivity;->e(Lcom/facebook/orca/creation/CreateThreadActivity;)Lcom/facebook/orca/compose/ComposeFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->a()V

    .line 516
    iget-object v0, p0, Lcom/facebook/orca/creation/i;->a:Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-virtual {v0}, Lcom/facebook/orca/creation/CreateThreadActivity;->finish()V

    .line 518
    :cond_0
    return-void
.end method
