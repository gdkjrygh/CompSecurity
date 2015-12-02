.class Lcom/facebook/orca/sms/ba;
.super Lcom/facebook/inject/d;
.source "MmsSmsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/push/sms/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/sms/ah;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/sms/ah;)V
    .locals 0

    .prologue
    .line 465
    iput-object p1, p0, Lcom/facebook/orca/sms/ba;->a:Lcom/facebook/orca/sms/ah;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V
    .locals 0

    .prologue
    .line 465
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/ba;-><init>(Lcom/facebook/orca/sms/ah;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/push/sms/b;
    .locals 5

    .prologue
    .line 470
    new-instance v2, Lcom/facebook/orca/push/sms/b;

    const-class v0, Ljava/lang/Boolean;

    const-class v1, Lcom/facebook/orca/annotations/IsSmsNotifyEnabled;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/sms/ba;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v0, Ljava/lang/Boolean;

    const-class v1, Lcom/facebook/orca/annotations/IsSmsReceivePermitted;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/sms/ba;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v0, Lcom/facebook/orca/nux/h;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/ba;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/nux/h;

    const-class v1, Lcom/facebook/orca/phonenumber/identification/f;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/sms/ba;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/phonenumber/identification/f;

    invoke-direct {v2, v3, v4, v0, v1}, Lcom/facebook/orca/push/sms/b;-><init>(Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/orca/nux/h;Lcom/facebook/orca/phonenumber/identification/f;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 465
    invoke-virtual {p0}, Lcom/facebook/orca/sms/ba;->a()Lcom/facebook/orca/push/sms/b;

    move-result-object v0

    return-object v0
.end method
