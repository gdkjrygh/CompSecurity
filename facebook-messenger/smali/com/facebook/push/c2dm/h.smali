.class Lcom/facebook/push/c2dm/h;
.super Lcom/facebook/inject/d;
.source "C2DMPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/push/c2dm/r;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/push/c2dm/d;


# direct methods
.method private constructor <init>(Lcom/facebook/push/c2dm/d;)V
    .locals 0

    .prologue
    .line 170
    iput-object p1, p0, Lcom/facebook/push/c2dm/h;->a:Lcom/facebook/push/c2dm/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/push/c2dm/d;Lcom/facebook/push/c2dm/e;)V
    .locals 0

    .prologue
    .line 170
    invoke-direct {p0, p1}, Lcom/facebook/push/c2dm/h;-><init>(Lcom/facebook/push/c2dm/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/c2dm/r;
    .locals 4

    .prologue
    .line 174
    new-instance v2, Lcom/facebook/push/c2dm/r;

    const-class v0, Lcom/facebook/push/c2dm/aa;

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/c2dm/aa;

    const-class v1, Lcom/facebook/push/c2dm/ae;

    invoke-virtual {p0, v1}, Lcom/facebook/push/c2dm/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/push/c2dm/ae;

    const-class v3, Lcom/facebook/http/protocol/aq;

    invoke-virtual {p0, v3}, Lcom/facebook/push/c2dm/h;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    invoke-direct {v2, v0, v1, v3}, Lcom/facebook/push/c2dm/r;-><init>(Lcom/facebook/push/c2dm/aa;Lcom/facebook/push/c2dm/ae;Ljavax/inject/a;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 170
    invoke-virtual {p0}, Lcom/facebook/push/c2dm/h;->a()Lcom/facebook/push/c2dm/r;

    move-result-object v0

    return-object v0
.end method
