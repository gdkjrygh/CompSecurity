.class Lcom/facebook/orca/threadview/bv;
.super Ljava/lang/Object;
.source "ThreadViewFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V
    .locals 0

    .prologue
    .line 482
    iput-object p1, p0, Lcom/facebook/orca/threadview/bv;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 485
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "click"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "button"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "save_group_name_button"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 488
    iget-object v1, p0, Lcom/facebook/orca/threadview/bv;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v1, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/threadview/ThreadViewFragment;Lcom/facebook/analytics/cb;)V

    .line 491
    iget-object v0, p0, Lcom/facebook/orca/threadview/bv;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    iget-object v1, p0, Lcom/facebook/orca/threadview/bv;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->g(Lcom/facebook/orca/threadview/ThreadViewFragment;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewFragment;->b(Lcom/facebook/orca/threadview/ThreadViewFragment;Ljava/lang/String;)V

    .line 492
    return-void
.end method
