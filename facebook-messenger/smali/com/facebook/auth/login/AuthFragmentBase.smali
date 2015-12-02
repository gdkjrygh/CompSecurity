.class public abstract Lcom/facebook/auth/login/AuthFragmentBase;
.super Lcom/facebook/base/fragment/AbstractNavigableFragment;
.source "AuthFragmentBase.java"

# interfaces
.implements Lcom/facebook/auth/login/c;


# instance fields
.field private a:Lcom/facebook/auth/login/AuthStateMachineConfig;

.field private c:Ljava/lang/Class;

.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/facebook/base/fragment/AbstractNavigableFragment;-><init>()V

    return-void
.end method

.method private a()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lcom/facebook/auth/login/AuthFragmentBase;->c:Ljava/lang/Class;

    if-nez v0, :cond_0

    .line 122
    invoke-virtual {p0}, Lcom/facebook/auth/login/AuthFragmentBase;->d()Lcom/facebook/auth/login/AuthFragmentConfig;

    move-result-object v0

    iget-object v0, v0, Lcom/facebook/auth/login/AuthFragmentConfig;->a:Ljava/lang/Class;

    iput-object v0, p0, Lcom/facebook/auth/login/AuthFragmentBase;->c:Ljava/lang/Class;

    .line 125
    :cond_0
    iget-object v0, p0, Lcom/facebook/auth/login/AuthFragmentBase;->c:Ljava/lang/Class;

    return-object v0
.end method


# virtual methods
.method public O()Z
    .locals 1

    .prologue
    .line 111
    iget-boolean v0, p0, Lcom/facebook/auth/login/AuthFragmentBase;->d:Z

    return v0
.end method

.method protected P()V
    .locals 2

    .prologue
    .line 129
    new-instance v0, Lcom/facebook/base/fragment/e;

    invoke-virtual {p0}, Lcom/facebook/auth/login/AuthFragmentBase;->c()Lcom/facebook/auth/login/AuthStateMachineConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/auth/login/AuthStateMachineConfig;->c()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/base/fragment/e;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0}, Lcom/facebook/base/fragment/e;->b()Lcom/facebook/base/fragment/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/base/fragment/e;->c()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/AuthFragmentBase;->d(Landroid/content/Intent;)V

    .line 134
    return-void
.end method

.method protected a(Ljava/lang/Class;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/auth/login/c;",
            ">;",
            "Landroid/view/ViewGroup;",
            ")",
            "Landroid/view/View;"
        }
    .end annotation

    .prologue
    .line 42
    :try_start_0
    invoke-direct {p0}, Lcom/facebook/auth/login/AuthFragmentBase;->a()Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    const-class v3, Landroid/content/Context;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 44
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/facebook/auth/login/AuthFragmentBase;->n()Landroid/content/Context;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 45
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    return-object v0

    .line 48
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 49
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to create "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v0, p0, Lcom/facebook/auth/login/AuthFragmentBase;->c:Ljava/lang/Class;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/auth/login/AuthFragmentBase;->c:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_0
    const-string v0, "<unknown class>"

    goto :goto_0
.end method

.method public a(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 56
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/AbstractNavigableFragment;->a(Landroid/content/Context;)V

    .line 60
    invoke-virtual {p0}, Lcom/facebook/auth/login/AuthFragmentBase;->r()Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/login/AuthNavigationController;

    .line 61
    invoke-virtual {v0}, Lcom/facebook/auth/login/AuthNavigationController;->b()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/auth/login/AuthFragmentBase;->d:Z

    .line 62
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 66
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/AbstractNavigableFragment;->a(Landroid/os/Bundle;)V

    .line 67
    if-eqz p1, :cond_0

    .line 68
    const-string v0, "viewClassName"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 70
    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/login/AuthFragmentBase;->c:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    :cond_0
    :goto_0
    return-void

    .line 71
    :catch_0
    move-exception v0

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/auth/login/AuthFragmentBase;->c:Ljava/lang/Class;

    goto :goto_0
.end method

.method public b(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 116
    invoke-virtual {p0}, Lcom/facebook/auth/login/AuthFragmentBase;->S()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/c/s;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    .line 117
    invoke-virtual {p0}, Lcom/facebook/auth/login/AuthFragmentBase;->n()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    .line 118
    return-void
.end method

.method protected b()Z
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 87
    invoke-super {p0}, Lcom/facebook/base/fragment/AbstractNavigableFragment;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    :goto_0
    return v1

    .line 90
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/auth/login/AuthFragmentBase;->P()V

    goto :goto_0
.end method

.method public c()Lcom/facebook/auth/login/AuthStateMachineConfig;
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/facebook/auth/login/AuthFragmentBase;->a:Lcom/facebook/auth/login/AuthStateMachineConfig;

    if-nez v0, :cond_0

    .line 97
    invoke-virtual {p0}, Lcom/facebook/auth/login/AuthFragmentBase;->r()Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/login/AuthNavigationController;

    .line 98
    invoke-virtual {v0}, Lcom/facebook/auth/login/AuthNavigationController;->a()Lcom/facebook/auth/login/AuthStateMachineConfig;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/login/AuthFragmentBase;->a:Lcom/facebook/auth/login/AuthStateMachineConfig;

    .line 101
    :cond_0
    iget-object v0, p0, Lcom/facebook/auth/login/AuthFragmentBase;->a:Lcom/facebook/auth/login/AuthStateMachineConfig;

    return-object v0
.end method

.method public d()Lcom/facebook/auth/login/AuthFragmentConfig;
    .locals 2

    .prologue
    .line 106
    invoke-virtual {p0}, Lcom/facebook/auth/login/AuthFragmentBase;->c()Lcom/facebook/auth/login/AuthStateMachineConfig;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/auth/login/AuthStateMachineConfig;->a(Ljava/lang/Class;)Lcom/facebook/auth/login/AuthFragmentConfig;

    move-result-object v0

    return-object v0
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 79
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/AbstractNavigableFragment;->e(Landroid/os/Bundle;)V

    .line 80
    iget-object v0, p0, Lcom/facebook/auth/login/AuthFragmentBase;->c:Ljava/lang/Class;

    if-eqz v0, :cond_0

    .line 81
    const-string v0, "viewClassName"

    iget-object v1, p0, Lcom/facebook/auth/login/AuthFragmentBase;->c:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    :cond_0
    return-void
.end method
