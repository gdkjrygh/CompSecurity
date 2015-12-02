.class public Lcom/facebook/orca/login/a;
.super Ljava/lang/Object;
.source "OrcaAuthStateMachineConfig.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/facebook/auth/b/a;Landroid/os/Bundle;Landroid/os/Bundle;Landroid/os/Bundle;Landroid/os/Bundle;Landroid/os/Bundle;Landroid/os/Bundle;Landroid/os/Bundle;Landroid/os/Bundle;Lcom/facebook/fbservice/ops/ab;)Lcom/facebook/auth/login/AuthStateMachineConfig;
    .locals 4

    .prologue
    .line 39
    new-instance v0, Lcom/facebook/auth/login/AuthFragmentConfig;

    const-class v1, Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;

    invoke-direct {v0, v1, p1}, Lcom/facebook/auth/login/AuthFragmentConfig;-><init>(Ljava/lang/Class;Landroid/os/Bundle;)V

    new-instance v1, Lcom/facebook/auth/login/AuthFragmentConfig;

    const-class v2, Lcom/facebook/orca/login/WildfirePasswordCredentialsViewGroup;

    invoke-direct {v1, v2, p3}, Lcom/facebook/auth/login/AuthFragmentConfig;-><init>(Ljava/lang/Class;Landroid/os/Bundle;)V

    new-instance v2, Lcom/facebook/auth/login/AuthFragmentConfig;

    const-class v3, Lcom/facebook/auth/login/GenericLoginApprovalViewGroup;

    invoke-direct {v2, v3, p4}, Lcom/facebook/auth/login/AuthFragmentConfig;-><init>(Ljava/lang/Class;Landroid/os/Bundle;)V

    invoke-static {v0, v1, v2}, Lcom/facebook/auth/login/AuthStateMachineConfig;->a(Lcom/facebook/auth/login/AuthFragmentConfig;Lcom/facebook/auth/login/AuthFragmentConfig;Lcom/facebook/auth/login/AuthFragmentConfig;)Lcom/google/common/a/ew;

    move-result-object v0

    .line 47
    const-class v1, Lcom/facebook/auth/login/SilentLoginFragment;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/facebook/auth/login/AuthFragmentConfig;

    const-class v3, Lcom/facebook/orca/login/OrcaSilentLoginViewGroup;

    invoke-direct {v2, v3, p2}, Lcom/facebook/auth/login/AuthFragmentConfig;-><init>(Ljava/lang/Class;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 49
    const-class v1, Lcom/facebook/orca/login/WildfireRegStartFragment;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/facebook/auth/login/AuthFragmentConfig;

    const-class v3, Lcom/facebook/orca/login/WildfireRegStartViewGroup;

    invoke-direct {v2, v3, p6}, Lcom/facebook/auth/login/AuthFragmentConfig;-><init>(Ljava/lang/Class;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 51
    const-class v1, Lcom/facebook/orca/login/WildfireRegNameFragment;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/facebook/auth/login/AuthFragmentConfig;

    const-class v3, Lcom/facebook/orca/login/WildfireRegNameViewGroup;

    invoke-direct {v2, v3, p5}, Lcom/facebook/auth/login/AuthFragmentConfig;-><init>(Ljava/lang/Class;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 53
    const-class v1, Lcom/facebook/orca/login/WildfireRegPhoneNumberFragment;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/facebook/auth/login/AuthFragmentConfig;

    const-class v3, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;

    invoke-direct {v2, v3, p7}, Lcom/facebook/auth/login/AuthFragmentConfig;-><init>(Ljava/lang/Class;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 56
    const-class v1, Lcom/facebook/orca/login/WildfireRegSmsCodeFragment;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/facebook/auth/login/AuthFragmentConfig;

    const-class v3, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;

    invoke-direct {v2, v3, p8}, Lcom/facebook/auth/login/AuthFragmentConfig;-><init>(Ljava/lang/Class;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 58
    new-instance v1, Lcom/facebook/auth/login/AuthStateMachineConfig;

    invoke-virtual {v0}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    new-instance v2, Lcom/facebook/auth/login/bg;

    invoke-direct {v2, p9}, Lcom/facebook/auth/login/bg;-><init>(Lcom/facebook/fbservice/ops/ab;)V

    invoke-direct {v1, v0, v2}, Lcom/facebook/auth/login/AuthStateMachineConfig;-><init>(Lcom/google/common/a/ev;Lcom/facebook/auth/login/bg;)V

    return-object v1
.end method
