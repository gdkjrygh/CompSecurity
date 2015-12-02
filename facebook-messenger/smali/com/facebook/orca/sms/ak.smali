.class Lcom/facebook/orca/sms/ak;
.super Lcom/facebook/inject/d;
.source "MmsSmsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/sms/a/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/sms/ah;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/sms/ah;)V
    .locals 0

    .prologue
    .line 435
    iput-object p1, p0, Lcom/facebook/orca/sms/ak;->a:Lcom/facebook/orca/sms/ah;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V
    .locals 0

    .prologue
    .line 435
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/ak;-><init>(Lcom/facebook/orca/sms/ah;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/sms/a/a;
    .locals 4

    .prologue
    .line 440
    new-instance v2, Lcom/facebook/orca/sms/a/a;

    const-class v0, Lcom/facebook/auth/b/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ak;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/b/b;

    invoke-virtual {p0}, Lcom/facebook/orca/sms/ak;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v3, Lcom/facebook/fbservice/ops/k;

    invoke-interface {v1, v3}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/fbservice/ops/k;

    const-class v3, Lcom/facebook/orca/app/dt;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/sms/ak;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    invoke-direct {v2, v0, v1, v3}, Lcom/facebook/orca/sms/a/a;-><init>(Lcom/facebook/auth/b/b;Lcom/facebook/fbservice/ops/k;Ljavax/inject/a;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 435
    invoke-virtual {p0}, Lcom/facebook/orca/sms/ak;->a()Lcom/facebook/orca/sms/a/a;

    move-result-object v0

    return-object v0
.end method
