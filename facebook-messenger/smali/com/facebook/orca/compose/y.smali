.class Lcom/facebook/orca/compose/y;
.super Ljava/lang/Object;
.source "ComposeFragment.java"

# interfaces
.implements Lcom/facebook/orca/emoji/o;


# instance fields
.field final synthetic a:Lcom/facebook/orca/compose/ComposeFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 1783
    iput-object p1, p0, Lcom/facebook/orca/compose/y;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 1812
    iget-object v0, p0, Lcom/facebook/orca/compose/y;->a:Lcom/facebook/orca/compose/ComposeFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ComposeFragment;Z)V

    .line 1813
    return-void
.end method

.method public a(I)V
    .locals 1

    .prologue
    .line 1792
    iget-object v0, p0, Lcom/facebook/orca/compose/y;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ComposeFragment;I)V

    .line 1793
    return-void
.end method

.method public a(Lcom/facebook/orca/emoji/c;)V
    .locals 1

    .prologue
    .line 1787
    iget-object v0, p0, Lcom/facebook/orca/compose/y;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ComposeFragment;Lcom/facebook/orca/emoji/c;)V

    .line 1788
    return-void
.end method

.method public a(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 1817
    iget-object v0, p0, Lcom/facebook/orca/compose/y;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0, p1}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ComposeFragment;Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 1802
    iget-object v0, p0, Lcom/facebook/orca/compose/y;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->J(Lcom/facebook/orca/compose/ComposeFragment;)V

    .line 1803
    return-void
.end method

.method public c()V
    .locals 4

    .prologue
    .line 1807
    iget-object v0, p0, Lcom/facebook/orca/compose/y;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->h(Lcom/facebook/orca/compose/ComposeFragment;)Landroid/widget/EditText;

    move-result-object v0

    new-instance v1, Landroid/view/KeyEvent;

    const/4 v2, 0x0

    const/16 v3, 0x43

    invoke-direct {v1, v2, v3}, Landroid/view/KeyEvent;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 1808
    return-void
.end method
