.class public Lcom/facebook/base/fragment/e;
.super Ljava/lang/Object;
.source "NavigableFragmentController.java"


# instance fields
.field a:Landroid/content/Intent;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/base/fragment/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.fragment.FRAGMENT_ACTION"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/fragment/e;->a:Landroid/content/Intent;

    .line 38
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/base/fragment/e;
    .locals 3

    .prologue
    .line 41
    iget-object v0, p0, Lcom/facebook/base/fragment/e;->a:Landroid/content/Intent;

    const-string v1, "com.facebook.fragment.PUSH_BACK_STACK"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 42
    return-object p0
.end method

.method public b()Lcom/facebook/base/fragment/e;
    .locals 3

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/base/fragment/e;->a:Landroid/content/Intent;

    const-string v1, "com.facebook.fragment.CLEAR_BACK_STACK"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 47
    return-object p0
.end method

.method public c()Landroid/content/Intent;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/base/fragment/e;->a:Landroid/content/Intent;

    return-object v0
.end method
