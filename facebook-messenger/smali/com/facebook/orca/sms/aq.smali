.class Lcom/facebook/orca/sms/aq;
.super Lcom/facebook/inject/d;
.source "MmsSmsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/sms/z;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/sms/ah;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/sms/ah;)V
    .locals 0

    .prologue
    .line 219
    iput-object p1, p0, Lcom/facebook/orca/sms/aq;->a:Lcom/facebook/orca/sms/ah;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V
    .locals 0

    .prologue
    .line 219
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/aq;-><init>(Lcom/facebook/orca/sms/ah;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/sms/z;
    .locals 3

    .prologue
    .line 224
    new-instance v2, Lcom/facebook/orca/sms/z;

    const-class v0, Lcom/facebook/orca/sms/y;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/aq;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/sms/y;

    const-class v1, Lcom/facebook/orca/sms/bk;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/sms/aq;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/sms/bk;

    invoke-direct {v2, v0, v1}, Lcom/facebook/orca/sms/z;-><init>(Lcom/facebook/orca/sms/y;Lcom/facebook/orca/sms/bk;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 219
    invoke-virtual {p0}, Lcom/facebook/orca/sms/aq;->a()Lcom/facebook/orca/sms/z;

    move-result-object v0

    return-object v0
.end method
