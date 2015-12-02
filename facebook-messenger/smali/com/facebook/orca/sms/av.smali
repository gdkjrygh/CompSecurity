.class Lcom/facebook/orca/sms/av;
.super Lcom/facebook/inject/d;
.source "MmsSmsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/sms/bi;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/sms/ah;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/sms/ah;)V
    .locals 0

    .prologue
    .line 262
    iput-object p1, p0, Lcom/facebook/orca/sms/av;->a:Lcom/facebook/orca/sms/ah;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/sms/ah;Lcom/facebook/orca/sms/ai;)V
    .locals 0

    .prologue
    .line 262
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/av;-><init>(Lcom/facebook/orca/sms/ah;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/sms/bi;
    .locals 9

    .prologue
    .line 267
    new-instance v0, Lcom/facebook/orca/sms/bi;

    const-class v1, Lcom/facebook/orca/protocol/methods/ad;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/sms/av;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/protocol/methods/ad;

    const-class v2, Lcom/facebook/orca/threads/q;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/sms/av;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/threads/q;

    const-class v3, Lcom/facebook/orca/sms/y;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/sms/av;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/sms/y;

    const-class v4, Lcom/facebook/orca/sms/u;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/sms/av;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/sms/u;

    const-class v5, Lcom/facebook/orca/sms/br;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/sms/av;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/orca/sms/br;

    const-class v6, Lcom/facebook/orca/sms/bk;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/sms/av;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/orca/sms/bk;

    const-class v7, Lcom/facebook/orca/sms/af;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/sms/av;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/orca/sms/af;

    const-class v8, Lcom/facebook/orca/f/o;

    invoke-virtual {p0, v8}, Lcom/facebook/orca/sms/av;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/orca/f/o;

    invoke-direct/range {v0 .. v8}, Lcom/facebook/orca/sms/bi;-><init>(Lcom/facebook/orca/protocol/methods/ad;Lcom/facebook/orca/threads/q;Lcom/facebook/orca/sms/y;Lcom/facebook/orca/sms/u;Lcom/facebook/orca/sms/br;Lcom/facebook/orca/sms/bk;Lcom/facebook/orca/sms/af;Lcom/facebook/orca/f/o;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 262
    invoke-virtual {p0}, Lcom/facebook/orca/sms/av;->a()Lcom/facebook/orca/sms/bi;

    move-result-object v0

    return-object v0
.end method
