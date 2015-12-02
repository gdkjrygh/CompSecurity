.class Lcom/facebook/push/c2dm/j;
.super Lcom/facebook/inject/d;
.source "C2DMPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/push/c2dm/d;


# direct methods
.method private constructor <init>(Lcom/facebook/push/c2dm/d;)V
    .locals 0

    .prologue
    .line 121
    iput-object p1, p0, Lcom/facebook/push/c2dm/j;->a:Lcom/facebook/push/c2dm/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/push/c2dm/d;Lcom/facebook/push/c2dm/e;)V
    .locals 0

    .prologue
    .line 121
    invoke-direct {p0, p1}, Lcom/facebook/push/c2dm/j;-><init>(Lcom/facebook/push/c2dm/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;
    .locals 13

    .prologue
    .line 126
    new-instance v0, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    invoke-virtual {p0}, Lcom/facebook/push/c2dm/j;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {p0, v2}, Lcom/facebook/push/c2dm/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/fbservice/ops/k;

    const-class v3, Lcom/facebook/http/protocol/aq;

    invoke-virtual {p0, v3}, Lcom/facebook/push/c2dm/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/http/protocol/aq;

    const-class v4, Lcom/facebook/push/c2dm/ae;

    invoke-virtual {p0, v4}, Lcom/facebook/push/c2dm/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/push/c2dm/ae;

    const-class v5, Ljava/lang/String;

    const-class v6, Lcom/facebook/auth/annotations/LoggedInUserId;

    invoke-virtual {p0, v5, v6}, Lcom/facebook/push/c2dm/j;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v5

    const-class v6, Lcom/facebook/device_id/l;

    invoke-virtual {p0, v6}, Lcom/facebook/push/c2dm/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/device_id/l;

    const-class v7, Lcom/facebook/common/hardware/k;

    invoke-virtual {p0, v7}, Lcom/facebook/push/c2dm/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/common/hardware/k;

    const-class v8, Lcom/facebook/push/c2dm/y;

    invoke-virtual {p0, v8}, Lcom/facebook/push/c2dm/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/push/c2dm/y;

    const-class v9, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v9}, Lcom/facebook/push/c2dm/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/analytics/av;

    invoke-virtual {p0}, Lcom/facebook/push/c2dm/j;->e()Lcom/facebook/inject/ab;

    move-result-object v10

    const-class v11, Landroid/app/AlarmManager;

    invoke-interface {v10, v11}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/app/AlarmManager;

    const-class v11, Lcom/facebook/common/l/h;

    invoke-virtual {p0, v11}, Lcom/facebook/push/c2dm/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/facebook/common/l/h;

    const-class v12, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v12}, Lcom/facebook/push/c2dm/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/facebook/common/e/h;

    invoke-direct/range {v0 .. v12}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;-><init>(Landroid/content/Context;Lcom/facebook/fbservice/ops/k;Lcom/facebook/http/protocol/aq;Lcom/facebook/push/c2dm/ae;Ljavax/inject/a;Lcom/facebook/device_id/l;Lcom/facebook/common/hardware/k;Lcom/facebook/push/c2dm/y;Lcom/facebook/analytics/av;Landroid/app/AlarmManager;Lcom/facebook/common/l/h;Lcom/facebook/common/e/h;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 121
    invoke-virtual {p0}, Lcom/facebook/push/c2dm/j;->a()Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    move-result-object v0

    return-object v0
.end method
