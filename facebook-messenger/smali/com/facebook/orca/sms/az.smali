.class Lcom/facebook/orca/sms/az;
.super Lcom/facebook/inject/d;
.source "MmsSmsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/push/sms/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/sms/ah;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/sms/ah;)V
    .locals 0

    .prologue
    .line 478
    iput-object p1, p0, Lcom/facebook/orca/sms/az;->a:Lcom/facebook/orca/sms/ah;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V
    .locals 0

    .prologue
    .line 478
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/az;-><init>(Lcom/facebook/orca/sms/ah;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/push/sms/a;
    .locals 5

    .prologue
    .line 483
    new-instance v1, Lcom/facebook/orca/push/sms/a;

    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsSmsNotifyEnabled;

    invoke-virtual {p0, v0, v2}, Lcom/facebook/orca/sms/az;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    const-class v0, Ljava/lang/Boolean;

    const-class v3, Lcom/facebook/orca/annotations/IsClientSmsEnabled;

    invoke-virtual {p0, v0, v3}, Lcom/facebook/orca/sms/az;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v0, Ljava/lang/Boolean;

    const-class v4, Lcom/facebook/orca/annotations/IsSmsReadPermitted;

    invoke-virtual {p0, v0, v4}, Lcom/facebook/orca/sms/az;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v0, Lcom/facebook/orca/nux/h;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/az;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/nux/h;

    invoke-direct {v1, v2, v3, v4, v0}, Lcom/facebook/orca/push/sms/a;-><init>(Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/orca/nux/h;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 478
    invoke-virtual {p0}, Lcom/facebook/orca/sms/az;->a()Lcom/facebook/orca/push/sms/a;

    move-result-object v0

    return-object v0
.end method
