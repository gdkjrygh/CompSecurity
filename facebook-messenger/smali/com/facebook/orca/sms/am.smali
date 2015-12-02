.class Lcom/facebook/orca/sms/am;
.super Lcom/facebook/inject/d;
.source "MmsSmsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/sms/t;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/sms/ah;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/sms/ah;)V
    .locals 0

    .prologue
    .line 317
    iput-object p1, p0, Lcom/facebook/orca/sms/am;->a:Lcom/facebook/orca/sms/ah;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V
    .locals 0

    .prologue
    .line 317
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/am;-><init>(Lcom/facebook/orca/sms/ah;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/sms/t;
    .locals 2

    .prologue
    .line 322
    new-instance v1, Lcom/facebook/orca/sms/t;

    const-class v0, Lcom/facebook/common/hardware/n;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/am;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/hardware/n;

    invoke-direct {v1, v0}, Lcom/facebook/orca/sms/t;-><init>(Lcom/facebook/common/hardware/n;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 317
    invoke-virtual {p0}, Lcom/facebook/orca/sms/am;->a()Lcom/facebook/orca/sms/t;

    move-result-object v0

    return-object v0
.end method
