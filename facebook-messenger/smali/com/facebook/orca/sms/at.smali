.class Lcom/facebook/orca/sms/at;
.super Lcom/facebook/inject/d;
.source "MmsSmsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/sms/ac;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/sms/ah;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/sms/ah;)V
    .locals 0

    .prologue
    .line 447
    iput-object p1, p0, Lcom/facebook/orca/sms/at;->a:Lcom/facebook/orca/sms/ah;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V
    .locals 0

    .prologue
    .line 447
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/at;-><init>(Lcom/facebook/orca/sms/ah;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/sms/ac;
    .locals 10

    .prologue
    .line 452
    new-instance v0, Lcom/facebook/orca/sms/ac;

    const-class v1, Lcom/facebook/user/User;

    const-class v2, Lcom/facebook/auth/annotations/LoggedInUser;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/orca/sms/at;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    const-class v2, Ljava/lang/Boolean;

    const-class v3, Lcom/facebook/orca/annotations/IsClientSmsEnabled;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/orca/sms/at;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    const-class v3, Ljava/lang/Boolean;

    const-class v4, Lcom/facebook/orca/annotations/IsSmsReadPermitted;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/orca/sms/at;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v4, Lcom/facebook/orca/g/aa;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/sms/at;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/g/aa;

    const-class v5, Lcom/facebook/orca/g/r;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/sms/at;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/orca/g/r;

    const-class v6, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/sms/at;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/prefs/shared/d;

    const-class v7, Lcom/facebook/orca/sms/af;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/sms/at;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/orca/sms/af;

    const-class v8, Lcom/google/common/d/a/u;

    const-class v9, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-virtual {p0, v8, v9}, Lcom/facebook/orca/sms/at;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/common/d/a/u;

    const-class v9, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v9}, Lcom/facebook/orca/sms/at;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/common/time/a;

    invoke-direct/range {v0 .. v9}, Lcom/facebook/orca/sms/ac;-><init>(Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/orca/g/aa;Lcom/facebook/orca/g/r;Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/sms/af;Lcom/google/common/d/a/u;Lcom/facebook/common/time/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 447
    invoke-virtual {p0}, Lcom/facebook/orca/sms/at;->a()Lcom/facebook/orca/sms/ac;

    move-result-object v0

    return-object v0
.end method
