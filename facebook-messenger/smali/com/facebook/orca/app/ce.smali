.class Lcom/facebook/orca/app/ce;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/push/a/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1410
    iput-object p1, p0, Lcom/facebook/orca/app/ce;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1410
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/ce;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/push/a/b;
    .locals 9

    .prologue
    .line 1414
    new-instance v0, Lcom/facebook/orca/push/a/b;

    const-class v1, Lcom/facebook/orca/k/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/ce;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/k/a;

    const-class v2, Lcom/facebook/orca/protocol/methods/bb;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/ce;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/protocol/methods/bb;

    const-class v3, Lcom/facebook/orca/sms/bn;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/app/ce;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/sms/bn;

    const-class v4, Lcom/facebook/orca/sms/bk;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/app/ce;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/sms/bk;

    const-class v5, Lcom/facebook/orca/threads/a;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/app/ce;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/orca/threads/a;

    const-class v6, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/app/ce;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/fasterxml/jackson/databind/ObjectMapper;

    const-class v7, Ljava/lang/String;

    const-class v8, Lcom/facebook/auth/annotations/LoggedInUserId;

    invoke-virtual {p0, v7, v8}, Lcom/facebook/orca/app/ce;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v7

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/push/a/b;-><init>(Lcom/facebook/orca/k/a;Lcom/facebook/orca/protocol/methods/bb;Lcom/facebook/orca/sms/bn;Lcom/facebook/orca/sms/bk;Lcom/facebook/orca/threads/a;Lcom/fasterxml/jackson/databind/ObjectMapper;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1410
    invoke-virtual {p0}, Lcom/facebook/orca/app/ce;->a()Lcom/facebook/orca/push/a/b;

    move-result-object v0

    return-object v0
.end method
