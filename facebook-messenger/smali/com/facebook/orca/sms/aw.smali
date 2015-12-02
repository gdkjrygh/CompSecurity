.class Lcom/facebook/orca/sms/aw;
.super Lcom/facebook/inject/d;
.source "MmsSmsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/sms/bj;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/sms/ah;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/sms/ah;)V
    .locals 0

    .prologue
    .line 192
    iput-object p1, p0, Lcom/facebook/orca/sms/aw;->a:Lcom/facebook/orca/sms/ah;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V
    .locals 0

    .prologue
    .line 192
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/aw;-><init>(Lcom/facebook/orca/sms/ah;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/sms/bj;
    .locals 8

    .prologue
    .line 196
    new-instance v0, Lcom/facebook/orca/sms/bj;

    const-class v1, Lcom/facebook/orca/sms/aa;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/sms/aw;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/sms/aa;

    const-class v2, Lcom/facebook/orca/sms/z;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/sms/aw;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/sms/z;

    const-class v3, Lcom/facebook/orca/sms/bi;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/sms/aw;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/sms/bi;

    const-class v4, Lcom/facebook/orca/sms/y;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/sms/aw;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/sms/y;

    const-class v5, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/sms/aw;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/prefs/shared/d;

    const-class v6, Lcom/facebook/orca/sms/af;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/sms/aw;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/orca/sms/af;

    const-class v7, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/sms/aw;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/common/e/h;

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/sms/bj;-><init>(Lcom/facebook/orca/sms/aa;Lcom/facebook/orca/sms/z;Lcom/facebook/orca/sms/bi;Lcom/facebook/orca/sms/y;Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/sms/af;Lcom/facebook/common/e/h;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 192
    invoke-virtual {p0}, Lcom/facebook/orca/sms/aw;->a()Lcom/facebook/orca/sms/bj;

    move-result-object v0

    return-object v0
.end method
