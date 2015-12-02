.class public abstract Lcom/qihoo/security/ui/fragment/BaseFragment;
.super Landroid/support/v4/app/Fragment;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/fragment/BaseFragment$a;,
        Lcom/qihoo/security/ui/fragment/BaseFragment$b;
    }
.end annotation


# instance fields
.field protected d:Landroid/content/Context;

.field protected e:Lcom/qihoo/security/ui/fragment/BaseFragment$b;

.field protected f:Lcom/qihoo/security/locale/d;

.field protected g:Ljava/lang/Object;

.field protected h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

.field protected i:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 49
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/fragment/BaseFragment;->i:Z

    .line 157
    return-void
.end method


# virtual methods
.method protected a(Landroid/os/Message;)V
    .locals 0

    .prologue
    .line 175
    return-void
.end method

.method protected a(Landroid/support/v4/app/f;)V
    .locals 3

    .prologue
    .line 148
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string/jumbo v1, "noteStateNotSaved"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 149
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 155
    :goto_0
    return-void

    .line 150
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected e()Z
    .locals 1

    .prologue
    .line 127
    invoke-virtual {p0}, Lcom/qihoo/security/ui/fragment/BaseFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/ui/fragment/BaseFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected f()Z
    .locals 1

    .prologue
    .line 131
    invoke-virtual {p0}, Lcom/qihoo/security/ui/fragment/BaseFragment;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/qihoo/security/ui/fragment/BaseFragment;->i:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 4

    .prologue
    .line 65
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 67
    :try_start_0
    move-object v0, p1

    check-cast v0, Lcom/qihoo/security/ui/fragment/BaseFragment$b;

    move-object v1, v0

    iput-object v1, p0, Lcom/qihoo/security/ui/fragment/BaseFragment;->e:Lcom/qihoo/security/ui/fragment/BaseFragment$b;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    return-void

    .line 68
    :catch_0
    move-exception v1

    .line 69
    new-instance v1, Ljava/lang/ClassCastException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, " must implement onFragmentChangedListener"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 75
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 76
    invoke-virtual {p0}, Lcom/qihoo/security/ui/fragment/BaseFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    .line 77
    if-eqz v0, :cond_0

    .line 78
    const-string/jumbo v1, "ms_fragment_data"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/fragment/BaseFragment;->g:Ljava/lang/Object;

    .line 80
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/ui/fragment/BaseFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/fragment/BaseFragment;->d:Landroid/content/Context;

    .line 81
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/fragment/BaseFragment;->f:Lcom/qihoo/security/locale/d;

    .line 82
    new-instance v0, Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;-><init>(Lcom/qihoo/security/ui/fragment/BaseFragment;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/fragment/BaseFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    .line 83
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 182
    iget-object v0, p0, Lcom/qihoo/security/ui/fragment/BaseFragment;->h:Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 183
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 184
    return-void
.end method

.method public onStart()V
    .locals 1

    .prologue
    .line 87
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    .line 88
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/fragment/BaseFragment;->i:Z

    .line 89
    return-void
.end method

.method public onStop()V
    .locals 1

    .prologue
    .line 93
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V

    .line 94
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/fragment/BaseFragment;->i:Z

    .line 95
    return-void
.end method
