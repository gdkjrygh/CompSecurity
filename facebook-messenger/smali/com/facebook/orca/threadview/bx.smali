.class Lcom/facebook/orca/threadview/bx;
.super Ljava/lang/Object;
.source "ThreadViewFragment.java"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewFragment;)V
    .locals 0

    .prologue
    .line 512
    iput-object p1, p0, Lcom/facebook/orca/threadview/bx;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 1

    .prologue
    .line 515
    iget-object v0, p0, Lcom/facebook/orca/threadview/bx;->a:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-static {v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->i(Lcom/facebook/orca/threadview/ThreadViewFragment;)V

    .line 516
    return-void
.end method
