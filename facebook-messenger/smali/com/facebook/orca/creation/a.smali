.class Lcom/facebook/orca/creation/a;
.super Ljava/lang/Object;
.source "CreateThreadActivity.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/creation/CreateThreadActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/creation/CreateThreadActivity;)V
    .locals 0

    .prologue
    .line 204
    iput-object p1, p0, Lcom/facebook/orca/creation/a;->a:Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalFocusChanged(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    .prologue
    .line 207
    iget-object v0, p0, Lcom/facebook/orca/creation/a;->a:Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-static {v0, p1, p2}, Lcom/facebook/orca/creation/CreateThreadActivity;->a(Lcom/facebook/orca/creation/CreateThreadActivity;Landroid/view/View;Landroid/view/View;)V

    .line 208
    return-void
.end method
