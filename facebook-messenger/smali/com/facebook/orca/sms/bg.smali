.class Lcom/facebook/orca/sms/bg;
.super Lcom/facebook/inject/d;
.source "MmsSmsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/sms/a/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/sms/ah;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/sms/ah;)V
    .locals 0

    .prologue
    .line 409
    iput-object p1, p0, Lcom/facebook/orca/sms/bg;->a:Lcom/facebook/orca/sms/ah;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V
    .locals 0

    .prologue
    .line 409
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/bg;-><init>(Lcom/facebook/orca/sms/ah;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/sms/a/b;
    .locals 7

    .prologue
    .line 414
    new-instance v0, Lcom/facebook/orca/sms/a/b;

    invoke-virtual {p0}, Lcom/facebook/orca/sms/bg;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/content/ContentResolver;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ContentResolver;

    const-class v2, Lcom/facebook/orca/g/aa;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/sms/bg;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/g/aa;

    const-class v3, Lcom/facebook/orca/notify/at;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/sms/bg;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/notify/at;

    const-class v4, Ljava/lang/Boolean;

    const-class v5, Lcom/facebook/orca/annotations/IsClientSmsEnabled;

    invoke-virtual {p0, v4, v5}, Lcom/facebook/orca/sms/bg;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v5, Ljava/lang/Boolean;

    const-class v6, Lcom/facebook/orca/annotations/IsSmsReadPermitted;

    invoke-virtual {p0, v5, v6}, Lcom/facebook/orca/sms/bg;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v5

    const-class v6, Lcom/facebook/orca/sms/a/a;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/sms/bg;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/orca/sms/a/a;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/sms/a/b;-><init>(Landroid/content/ContentResolver;Lcom/facebook/orca/g/aa;Lcom/facebook/orca/notify/at;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/orca/sms/a/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 409
    invoke-virtual {p0}, Lcom/facebook/orca/sms/bg;->a()Lcom/facebook/orca/sms/a/b;

    move-result-object v0

    return-object v0
.end method
