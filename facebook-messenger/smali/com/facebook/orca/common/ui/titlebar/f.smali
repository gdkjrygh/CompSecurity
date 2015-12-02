.class Lcom/facebook/orca/common/ui/titlebar/f;
.super Ljava/lang/Object;
.source "DivebarController.java"

# interfaces
.implements Lcom/facebook/ui/touch/e;


# instance fields
.field final synthetic a:Lcom/facebook/orca/common/ui/titlebar/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/common/ui/titlebar/a;)V
    .locals 0

    .prologue
    .line 760
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/f;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 763
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/f;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 764
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/f;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->k(Lcom/facebook/orca/common/ui/titlebar/a;)V

    .line 766
    :cond_0
    return-void
.end method
