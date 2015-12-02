.class Lcom/facebook/orca/sms/bc;
.super Lcom/facebook/inject/d;
.source "MmsSmsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/sms/bo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/sms/ah;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/sms/ah;)V
    .locals 0

    .prologue
    .line 372
    iput-object p1, p0, Lcom/facebook/orca/sms/bc;->a:Lcom/facebook/orca/sms/ah;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V
    .locals 0

    .prologue
    .line 372
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/bc;-><init>(Lcom/facebook/orca/sms/ah;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/sms/bo;
    .locals 6

    .prologue
    .line 376
    new-instance v0, Lcom/facebook/orca/sms/bo;

    const-class v1, Landroid/content/Context;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/sms/bc;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Ljava/lang/Boolean;

    const-class v3, Lcom/facebook/orca/annotations/IsClientSmsEnabled;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/orca/sms/bc;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    const-class v3, Ljava/lang/Boolean;

    const-class v4, Lcom/facebook/orca/annotations/IsSmsReadPermitted;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/orca/sms/bc;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v4, Lcom/facebook/c/s;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/sms/bc;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/c/s;

    const-class v5, Lcom/facebook/user/i;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/sms/bc;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/user/i;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/sms/bo;-><init>(Landroid/content/Context;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/c/s;Lcom/facebook/user/i;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 372
    invoke-virtual {p0}, Lcom/facebook/orca/sms/bc;->a()Lcom/facebook/orca/sms/bo;

    move-result-object v0

    return-object v0
.end method
