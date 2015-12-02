.class Lcom/facebook/orca/sms/ap;
.super Lcom/facebook/inject/d;
.source "MmsSmsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/sms/y;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/sms/ah;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/sms/ah;)V
    .locals 0

    .prologue
    .line 231
    iput-object p1, p0, Lcom/facebook/orca/sms/ap;->a:Lcom/facebook/orca/sms/ah;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V
    .locals 0

    .prologue
    .line 231
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/ap;-><init>(Lcom/facebook/orca/sms/ah;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/sms/y;
    .locals 11

    .prologue
    .line 236
    new-instance v0, Lcom/facebook/orca/sms/y;

    invoke-virtual {p0}, Lcom/facebook/orca/sms/ap;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/orca/sms/bn;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/sms/ap;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/sms/bn;

    const-class v3, Lcom/facebook/orca/sms/r;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/sms/ap;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/sms/r;

    const-class v4, Lcom/facebook/orca/sms/a;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/sms/ap;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/sms/a;

    const-class v5, Lcom/facebook/orca/sms/bk;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/sms/ap;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/orca/sms/bk;

    const-class v6, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/sms/ap;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/prefs/shared/d;

    const-class v7, Lcom/facebook/orca/threads/r;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/sms/ap;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/orca/threads/r;

    const-class v8, Ljava/lang/Boolean;

    const-class v9, Lcom/facebook/orca/annotations/IsMmsReadPermitted;

    invoke-virtual {p0, v8, v9}, Lcom/facebook/orca/sms/ap;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v8

    const-class v9, Ljava/lang/Boolean;

    const-class v10, Lcom/facebook/orca/annotations/IsCallLogEnabled;

    invoke-virtual {p0, v9, v10}, Lcom/facebook/orca/sms/ap;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v9

    invoke-direct/range {v0 .. v9}, Lcom/facebook/orca/sms/y;-><init>(Landroid/content/Context;Lcom/facebook/orca/sms/bn;Lcom/facebook/orca/sms/r;Lcom/facebook/orca/sms/a;Lcom/facebook/orca/sms/bk;Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/threads/r;Ljavax/inject/a;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 231
    invoke-virtual {p0}, Lcom/facebook/orca/sms/ap;->a()Lcom/facebook/orca/sms/y;

    move-result-object v0

    return-object v0
.end method
