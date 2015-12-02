.class Lcom/facebook/orca/protocol/w;
.super Lcom/facebook/inject/d;
.source "WebServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/protocol/methods/af;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/protocol/d;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/protocol/d;)V
    .locals 0

    .prologue
    .line 324
    iput-object p1, p0, Lcom/facebook/orca/protocol/w;->a:Lcom/facebook/orca/protocol/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/protocol/d;Lcom/facebook/orca/protocol/e;)V
    .locals 0

    .prologue
    .line 324
    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/w;-><init>(Lcom/facebook/orca/protocol/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/protocol/methods/af;
    .locals 3

    .prologue
    .line 328
    new-instance v0, Lcom/facebook/orca/protocol/methods/af;

    const-class v1, Ljava/lang/String;

    const-class v2, Lcom/facebook/auth/annotations/LoggedInUserId;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/orca/protocol/w;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/orca/protocol/methods/af;-><init>(Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 324
    invoke-virtual {p0}, Lcom/facebook/orca/protocol/w;->a()Lcom/facebook/orca/protocol/methods/af;

    move-result-object v0

    return-object v0
.end method
