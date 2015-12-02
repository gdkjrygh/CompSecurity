.class Lcom/facebook/orca/sms/bb;
.super Lcom/facebook/inject/d;
.source "MmsSmsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/sms/bn;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/sms/ah;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/sms/ah;)V
    .locals 0

    .prologue
    .line 337
    iput-object p1, p0, Lcom/facebook/orca/sms/bb;->a:Lcom/facebook/orca/sms/ah;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V
    .locals 0

    .prologue
    .line 337
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/bb;-><init>(Lcom/facebook/orca/sms/ah;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/sms/bn;
    .locals 3

    .prologue
    .line 342
    new-instance v2, Lcom/facebook/orca/sms/bn;

    invoke-virtual {p0}, Lcom/facebook/orca/sms/bb;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/orca/sms/bk;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/sms/bb;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/sms/bk;

    invoke-direct {v2, v0, v1}, Lcom/facebook/orca/sms/bn;-><init>(Landroid/content/Context;Lcom/facebook/orca/sms/bk;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 337
    invoke-virtual {p0}, Lcom/facebook/orca/sms/bb;->a()Lcom/facebook/orca/sms/bn;

    move-result-object v0

    return-object v0
.end method
