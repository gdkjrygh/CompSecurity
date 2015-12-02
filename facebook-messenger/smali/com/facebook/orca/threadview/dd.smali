.class Lcom/facebook/orca/threadview/dd;
.super Ljava/lang/Object;
.source "ThreadViewMessageFragment.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;)V
    .locals 0

    .prologue
    .line 393
    iput-object p1, p0, Lcom/facebook/orca/threadview/dd;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalFocusChanged(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    .prologue
    .line 396
    iget-object v0, p0, Lcom/facebook/orca/threadview/dd;->a:Lcom/facebook/orca/threadview/ThreadViewMessageFragment;

    invoke-static {v0, p1, p2}, Lcom/facebook/orca/threadview/ThreadViewMessageFragment;->a(Lcom/facebook/orca/threadview/ThreadViewMessageFragment;Landroid/view/View;Landroid/view/View;)V

    .line 397
    return-void
.end method
