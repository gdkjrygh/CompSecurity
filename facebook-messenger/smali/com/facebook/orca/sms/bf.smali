.class Lcom/facebook/orca/sms/bf;
.super Lcom/facebook/inject/d;
.source "MmsSmsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/sms/br;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/sms/ah;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/sms/ah;)V
    .locals 0

    .prologue
    .line 349
    iput-object p1, p0, Lcom/facebook/orca/sms/bf;->a:Lcom/facebook/orca/sms/ah;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V
    .locals 0

    .prologue
    .line 349
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/bf;-><init>(Lcom/facebook/orca/sms/ah;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/sms/br;
    .locals 4

    .prologue
    .line 353
    new-instance v3, Lcom/facebook/orca/sms/br;

    invoke-virtual {p0}, Lcom/facebook/orca/sms/bf;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/orca/sms/bn;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/sms/bf;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/sms/bn;

    const-class v2, Lcom/facebook/orca/sms/af;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/sms/bf;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/sms/af;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/orca/sms/br;-><init>(Landroid/content/Context;Lcom/facebook/orca/sms/bn;Lcom/facebook/orca/sms/af;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 349
    invoke-virtual {p0}, Lcom/facebook/orca/sms/bf;->a()Lcom/facebook/orca/sms/br;

    move-result-object v0

    return-object v0
.end method
