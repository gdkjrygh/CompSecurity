.class Lcom/facebook/push/c2dm/g;
.super Lcom/facebook/inject/d;
.source "C2DMPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/push/c2dm/C2DMRegistrar;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/push/c2dm/d;


# direct methods
.method private constructor <init>(Lcom/facebook/push/c2dm/d;)V
    .locals 0

    .prologue
    .line 143
    iput-object p1, p0, Lcom/facebook/push/c2dm/g;->a:Lcom/facebook/push/c2dm/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/push/c2dm/d;Lcom/facebook/push/c2dm/e;)V
    .locals 0

    .prologue
    .line 143
    invoke-direct {p0, p1}, Lcom/facebook/push/c2dm/g;-><init>(Lcom/facebook/push/c2dm/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/c2dm/C2DMRegistrar;
    .locals 10

    .prologue
    .line 147
    new-instance v0, Lcom/facebook/push/c2dm/C2DMRegistrar;

    invoke-virtual {p0}, Lcom/facebook/push/c2dm/g;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v2}, Lcom/facebook/push/c2dm/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/prefs/shared/d;

    const-class v3, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v3}, Lcom/facebook/push/c2dm/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/analytics/av;

    const-class v4, Ljava/lang/Boolean;

    const-class v5, Lcom/facebook/push/annotations/IsGcmEnabled;

    invoke-virtual {p0, v4, v5}, Lcom/facebook/push/c2dm/g;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    const-class v5, Lcom/facebook/common/hardware/k;

    invoke-virtual {p0, v5}, Lcom/facebook/push/c2dm/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/common/hardware/k;

    const-class v6, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    invoke-virtual {p0, v6}, Lcom/facebook/push/c2dm/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    const-class v7, Lcom/facebook/push/c2dm/y;

    invoke-virtual {p0, v7}, Lcom/facebook/push/c2dm/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/push/c2dm/y;

    invoke-virtual {p0}, Lcom/facebook/push/c2dm/g;->e()Lcom/facebook/inject/ab;

    move-result-object v8

    const-class v9, Landroid/app/AlarmManager;

    invoke-interface {v8, v9}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/app/AlarmManager;

    invoke-direct/range {v0 .. v8}, Lcom/facebook/push/c2dm/C2DMRegistrar;-><init>(Landroid/content/Context;Lcom/facebook/prefs/shared/d;Lcom/facebook/analytics/av;ZLcom/facebook/common/hardware/k;Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;Lcom/facebook/push/c2dm/y;Landroid/app/AlarmManager;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 143
    invoke-virtual {p0}, Lcom/facebook/push/c2dm/g;->a()Lcom/facebook/push/c2dm/C2DMRegistrar;

    move-result-object v0

    return-object v0
.end method
