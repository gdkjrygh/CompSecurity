.class Lcom/facebook/orca/sms/ax;
.super Lcom/facebook/inject/d;
.source "MmsSmsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/sms/bk;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/sms/ah;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/sms/ah;)V
    .locals 0

    .prologue
    .line 250
    iput-object p1, p0, Lcom/facebook/orca/sms/ax;->a:Lcom/facebook/orca/sms/ah;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V
    .locals 0

    .prologue
    .line 250
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/ax;-><init>(Lcom/facebook/orca/sms/ah;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/sms/bk;
    .locals 4

    .prologue
    .line 254
    new-instance v2, Lcom/facebook/orca/sms/bk;

    const-class v0, Lcom/facebook/user/User;

    const-class v1, Lcom/facebook/auth/annotations/LoggedInUser;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/sms/ax;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v0, Lcom/facebook/orca/p/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ax;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/p/a;

    const-class v1, Lcom/facebook/user/i;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/sms/ax;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/user/i;

    invoke-direct {v2, v3, v0, v1}, Lcom/facebook/orca/sms/bk;-><init>(Ljavax/inject/a;Lcom/facebook/orca/p/a;Lcom/facebook/user/i;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 250
    invoke-virtual {p0}, Lcom/facebook/orca/sms/ax;->a()Lcom/facebook/orca/sms/bk;

    move-result-object v0

    return-object v0
.end method
