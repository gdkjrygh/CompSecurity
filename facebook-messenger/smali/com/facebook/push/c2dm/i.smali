.class Lcom/facebook/push/c2dm/i;
.super Lcom/facebook/inject/d;
.source "C2DMPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/push/c2dm/s;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/push/c2dm/d;


# direct methods
.method private constructor <init>(Lcom/facebook/push/c2dm/d;)V
    .locals 0

    .prologue
    .line 96
    iput-object p1, p0, Lcom/facebook/push/c2dm/i;->a:Lcom/facebook/push/c2dm/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/push/c2dm/d;Lcom/facebook/push/c2dm/e;)V
    .locals 0

    .prologue
    .line 96
    invoke-direct {p0, p1}, Lcom/facebook/push/c2dm/i;-><init>(Lcom/facebook/push/c2dm/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/c2dm/s;
    .locals 5

    .prologue
    .line 100
    new-instance v2, Lcom/facebook/push/c2dm/s;

    const-class v0, Lcom/facebook/push/c2dm/C2DMRegistrar;

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/c2dm/C2DMRegistrar;

    const-class v1, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    invoke-virtual {p0, v1}, Lcom/facebook/push/c2dm/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    const-class v3, Ljava/lang/String;

    const-class v4, Lcom/facebook/auth/annotations/LoggedInUserId;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/push/c2dm/i;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    invoke-direct {v2, v0, v1, v3}, Lcom/facebook/push/c2dm/s;-><init>(Lcom/facebook/push/c2dm/C2DMRegistrar;Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;Ljavax/inject/a;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 96
    invoke-virtual {p0}, Lcom/facebook/push/c2dm/i;->a()Lcom/facebook/push/c2dm/s;

    move-result-object v0

    return-object v0
.end method
