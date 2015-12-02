.class Lcom/facebook/orca/sms/bd;
.super Lcom/facebook/inject/d;
.source "MmsSmsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/sms/a/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/sms/ah;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/sms/ah;)V
    .locals 0

    .prologue
    .line 394
    iput-object p1, p0, Lcom/facebook/orca/sms/bd;->a:Lcom/facebook/orca/sms/ah;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V
    .locals 0

    .prologue
    .line 394
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/bd;-><init>(Lcom/facebook/orca/sms/ah;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/sms/a/c;
    .locals 8

    .prologue
    .line 399
    new-instance v0, Lcom/facebook/orca/sms/a/c;

    const-class v1, Lcom/facebook/orca/sms/bn;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/sms/bd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/sms/bn;

    const-class v2, Lcom/facebook/orca/g/b;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/sms/bd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/g/b;

    const-class v3, Lcom/facebook/orca/push/b;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/sms/bd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/push/b;

    const-class v4, Lcom/facebook/orca/sms/af;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/sms/bd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/sms/af;

    const-class v5, Ljava/lang/Boolean;

    const-class v6, Lcom/facebook/orca/annotations/IsSmsReadPermitted;

    invoke-virtual {p0, v5, v6}, Lcom/facebook/orca/sms/bd;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v5

    const-class v6, Ljava/lang/Boolean;

    const-class v7, Lcom/facebook/orca/annotations/IsSmsNotifyEnabled;

    invoke-virtual {p0, v6, v7}, Lcom/facebook/orca/sms/bd;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/sms/a/c;-><init>(Lcom/facebook/orca/sms/bn;Lcom/facebook/orca/g/b;Lcom/facebook/orca/push/b;Lcom/facebook/orca/sms/af;Ljavax/inject/a;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 394
    invoke-virtual {p0}, Lcom/facebook/orca/sms/bd;->a()Lcom/facebook/orca/sms/a/c;

    move-result-object v0

    return-object v0
.end method
