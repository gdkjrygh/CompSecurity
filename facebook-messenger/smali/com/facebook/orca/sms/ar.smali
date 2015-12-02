.class Lcom/facebook/orca/sms/ar;
.super Lcom/facebook/inject/d;
.source "MmsSmsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/sms/aa;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/sms/ah;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/sms/ah;)V
    .locals 0

    .prologue
    .line 208
    iput-object p1, p0, Lcom/facebook/orca/sms/ar;->a:Lcom/facebook/orca/sms/ah;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V
    .locals 0

    .prologue
    .line 208
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/ar;-><init>(Lcom/facebook/orca/sms/ah;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/sms/aa;
    .locals 2

    .prologue
    .line 213
    new-instance v1, Lcom/facebook/orca/sms/aa;

    const-class v0, Lcom/facebook/orca/sms/y;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ar;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/sms/y;

    invoke-direct {v1, v0}, Lcom/facebook/orca/sms/aa;-><init>(Lcom/facebook/orca/sms/y;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 208
    invoke-virtual {p0}, Lcom/facebook/orca/sms/ar;->a()Lcom/facebook/orca/sms/aa;

    move-result-object v0

    return-object v0
.end method
