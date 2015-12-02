.class Lcom/facebook/base/fragment/a;
.super Ljava/lang/Object;
.source "AbstractNavigableFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/base/fragment/c;

.field final synthetic b:Lcom/facebook/base/fragment/AbstractNavigableFragment;


# direct methods
.method constructor <init>(Lcom/facebook/base/fragment/AbstractNavigableFragment;Lcom/facebook/base/fragment/c;)V
    .locals 0

    .prologue
    .line 116
    iput-object p1, p0, Lcom/facebook/base/fragment/a;->b:Lcom/facebook/base/fragment/AbstractNavigableFragment;

    iput-object p2, p0, Lcom/facebook/base/fragment/a;->a:Lcom/facebook/base/fragment/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 119
    iget-object v0, p0, Lcom/facebook/base/fragment/a;->a:Lcom/facebook/base/fragment/c;

    iget-object v1, p0, Lcom/facebook/base/fragment/a;->b:Lcom/facebook/base/fragment/AbstractNavigableFragment;

    iget-object v2, p0, Lcom/facebook/base/fragment/a;->b:Lcom/facebook/base/fragment/AbstractNavigableFragment;

    invoke-static {v2}, Lcom/facebook/base/fragment/AbstractNavigableFragment;->a(Lcom/facebook/base/fragment/AbstractNavigableFragment;)Landroid/content/Intent;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/base/fragment/c;->a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V

    .line 120
    iget-object v0, p0, Lcom/facebook/base/fragment/a;->b:Lcom/facebook/base/fragment/AbstractNavigableFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/base/fragment/AbstractNavigableFragment;->a(Lcom/facebook/base/fragment/AbstractNavigableFragment;Landroid/content/Intent;)Landroid/content/Intent;

    .line 121
    return-void
.end method
