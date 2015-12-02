.class Lcom/facebook/orca/compose/z;
.super Ljava/lang/Object;
.source "ComposeFragment.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/compose/ComposeFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/compose/ComposeFragment;)V
    .locals 0

    .prologue
    .line 470
    iput-object p1, p0, Lcom/facebook/orca/compose/z;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 473
    iget-object v0, p0, Lcom/facebook/orca/compose/z;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->e(Lcom/facebook/orca/compose/ComposeFragment;)Lcom/facebook/orca/compose/ap;

    move-result-object v0

    sget-object v3, Lcom/facebook/orca/compose/ap;->SHRUNK:Lcom/facebook/orca/compose/ap;

    if-ne v0, v3, :cond_1

    .line 474
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/compose/z;->a:Lcom/facebook/orca/compose/ComposeFragment;

    iget-object v3, p0, Lcom/facebook/orca/compose/z;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v3}, Lcom/facebook/orca/compose/ComposeFragment;->f(Lcom/facebook/orca/compose/ComposeFragment;)Landroid/widget/ImageButton;

    move-result-object v3

    invoke-static {v0, v3, p2}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ComposeFragment;Landroid/widget/ImageButton;Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/compose/z;->a:Lcom/facebook/orca/compose/ComposeFragment;

    iget-object v3, p0, Lcom/facebook/orca/compose/z;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v3}, Lcom/facebook/orca/compose/ComposeFragment;->g(Lcom/facebook/orca/compose/ComposeFragment;)Landroid/widget/ImageButton;

    move-result-object v3

    invoke-static {v0, v3, p2}, Lcom/facebook/orca/compose/ComposeFragment;->a(Lcom/facebook/orca/compose/ComposeFragment;Landroid/widget/ImageButton;Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 477
    iget-object v0, p0, Lcom/facebook/orca/compose/z;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v0}, Lcom/facebook/orca/compose/ComposeFragment;->h(Lcom/facebook/orca/compose/ComposeFragment;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocusFromTouch()Z

    .line 478
    iget-object v0, p0, Lcom/facebook/orca/compose/z;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeFragment;->n()Landroid/content/Context;

    move-result-object v0

    const-string v3, "input_method"

    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 480
    iget-object v3, p0, Lcom/facebook/orca/compose/z;->a:Lcom/facebook/orca/compose/ComposeFragment;

    invoke-static {v3}, Lcom/facebook/orca/compose/ComposeFragment;->h(Lcom/facebook/orca/compose/ComposeFragment;)Landroid/widget/EditText;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    :cond_0
    move v0, v1

    .line 484
    :goto_0
    return v0

    :cond_1
    move v0, v2

    goto :goto_0
.end method
