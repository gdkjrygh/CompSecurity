.class public Lcom/facebook/auth/login/AuthStateMachineConfig;
.super Ljava/lang/Object;
.source "AuthStateMachineConfig.java"


# instance fields
.field private final a:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/auth/login/AuthFragmentConfig;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/auth/login/bg;

.field private final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/auth/login/AuthFragmentBase;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/auth/login/AuthStateMachineConfig$ParcelableConfigInformation;Lcom/facebook/auth/login/bg;)V
    .locals 1

    .prologue
    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    iget-object v0, p1, Lcom/facebook/auth/login/AuthStateMachineConfig$ParcelableConfigInformation;->a:Lcom/google/common/a/ev;

    iput-object v0, p0, Lcom/facebook/auth/login/AuthStateMachineConfig;->a:Lcom/google/common/a/ev;

    .line 116
    iget-object v0, p1, Lcom/facebook/auth/login/AuthStateMachineConfig$ParcelableConfigInformation;->b:Ljava/lang/Class;

    iput-object v0, p0, Lcom/facebook/auth/login/AuthStateMachineConfig;->c:Ljava/lang/Class;

    .line 117
    iput-object p2, p0, Lcom/facebook/auth/login/AuthStateMachineConfig;->b:Lcom/facebook/auth/login/bg;

    .line 118
    return-void
.end method

.method public constructor <init>(Lcom/google/common/a/ev;Lcom/facebook/auth/login/bg;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/auth/login/AuthFragmentConfig;",
            ">;",
            "Lcom/facebook/auth/login/bg;",
            ")V"
        }
    .end annotation

    .prologue
    .line 100
    const-class v0, Lcom/facebook/auth/login/FirstPartySsoFragment;

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/auth/login/AuthStateMachineConfig;-><init>(Lcom/google/common/a/ev;Lcom/facebook/auth/login/bg;Ljava/lang/Class;)V

    .line 101
    return-void
.end method

.method public constructor <init>(Lcom/google/common/a/ev;Lcom/facebook/auth/login/bg;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/auth/login/AuthFragmentConfig;",
            ">;",
            "Lcom/facebook/auth/login/bg;",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/auth/login/AuthFragmentBase;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    iput-object p1, p0, Lcom/facebook/auth/login/AuthStateMachineConfig;->a:Lcom/google/common/a/ev;

    .line 108
    iput-object p2, p0, Lcom/facebook/auth/login/AuthStateMachineConfig;->b:Lcom/facebook/auth/login/bg;

    .line 109
    iput-object p3, p0, Lcom/facebook/auth/login/AuthStateMachineConfig;->c:Ljava/lang/Class;

    .line 110
    return-void
.end method

.method public static a(Lcom/facebook/auth/login/AuthFragmentConfig;Lcom/facebook/auth/login/AuthFragmentConfig;Lcom/facebook/auth/login/AuthFragmentConfig;)Lcom/google/common/a/ew;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/auth/login/AuthFragmentConfig",
            "<",
            "Lcom/facebook/auth/login/FirstPartySsoFragment;",
            ">;",
            "Lcom/facebook/auth/login/AuthFragmentConfig",
            "<",
            "Lcom/facebook/auth/login/PasswordCredentialsFragment;",
            ">;",
            "Lcom/facebook/auth/login/AuthFragmentConfig",
            "<",
            "Lcom/facebook/auth/login/LoginApprovalFragment;",
            ">;)",
            "Lcom/google/common/a/ew",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/auth/login/AuthFragmentConfig;",
            ">;"
        }
    .end annotation

    .prologue
    .line 79
    new-instance v0, Lcom/google/common/a/ew;

    invoke-direct {v0}, Lcom/google/common/a/ew;-><init>()V

    const-class v1, Lcom/facebook/auth/login/FirstPartySsoFragment;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/login/PasswordCredentialsFragment;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/login/LoginApprovalFragment;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lcom/facebook/auth/login/AuthFragmentConfig;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/auth/login/AuthFragmentBase;",
            ">;)",
            "Lcom/facebook/auth/login/AuthFragmentConfig;"
        }
    .end annotation

    .prologue
    .line 121
    iget-object v0, p0, Lcom/facebook/auth/login/AuthStateMachineConfig;->a:Lcom/google/common/a/ev;

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/login/AuthFragmentConfig;

    return-object v0
.end method

.method public a()Lcom/facebook/auth/login/bg;
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lcom/facebook/auth/login/AuthStateMachineConfig;->b:Lcom/facebook/auth/login/bg;

    return-object v0
.end method

.method public b()Lcom/facebook/auth/login/AuthStateMachineConfig$ParcelableConfigInformation;
    .locals 3

    .prologue
    .line 129
    new-instance v0, Lcom/facebook/auth/login/AuthStateMachineConfig$ParcelableConfigInformation;

    iget-object v1, p0, Lcom/facebook/auth/login/AuthStateMachineConfig;->a:Lcom/google/common/a/ev;

    iget-object v2, p0, Lcom/facebook/auth/login/AuthStateMachineConfig;->c:Ljava/lang/Class;

    invoke-direct {v0, v1, v2}, Lcom/facebook/auth/login/AuthStateMachineConfig$ParcelableConfigInformation;-><init>(Lcom/google/common/a/ev;Ljava/lang/Class;)V

    return-object v0
.end method

.method public c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/auth/login/AuthFragmentBase;",
            ">;"
        }
    .end annotation

    .prologue
    .line 133
    iget-object v0, p0, Lcom/facebook/auth/login/AuthStateMachineConfig;->c:Ljava/lang/Class;

    return-object v0
.end method
