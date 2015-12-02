.class Lcom/facebook/orca/nux/r;
.super Ljava/lang/Object;
.source "ThreadListNuxController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/nux/k;


# direct methods
.method constructor <init>(Lcom/facebook/orca/nux/k;)V
    .locals 0

    .prologue
    .line 373
    iput-object p1, p0, Lcom/facebook/orca/nux/r;->a:Lcom/facebook/orca/nux/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 376
    iget-object v0, p0, Lcom/facebook/orca/nux/r;->a:Lcom/facebook/orca/nux/k;

    invoke-static {v0}, Lcom/facebook/orca/nux/k;->f(Lcom/facebook/orca/nux/k;)Lcom/facebook/prefs/shared/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/n;->g:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 379
    iget-object v0, p0, Lcom/facebook/orca/nux/r;->a:Lcom/facebook/orca/nux/k;

    invoke-static {v0}, Lcom/facebook/orca/nux/k;->g(Lcom/facebook/orca/nux/k;)Lcom/facebook/orca/app/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/app/g;->a()V

    .line 380
    iget-object v0, p0, Lcom/facebook/orca/nux/r;->a:Lcom/facebook/orca/nux/k;

    invoke-static {v0}, Lcom/facebook/orca/nux/k;->h(Lcom/facebook/orca/nux/k;)V

    .line 381
    return-void
.end method
