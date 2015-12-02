.class Lcom/facebook/orca/push/b/g;
.super Lcom/facebook/inject/d;
.source "OrcaMqttPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/push/b/i;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/push/b/b;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/push/b/b;)V
    .locals 0

    .prologue
    .line 105
    iput-object p1, p0, Lcom/facebook/orca/push/b/g;->a:Lcom/facebook/orca/push/b/b;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/push/b/b;Lcom/facebook/orca/push/b/c;)V
    .locals 0

    .prologue
    .line 105
    invoke-direct {p0, p1}, Lcom/facebook/orca/push/b/g;-><init>(Lcom/facebook/orca/push/b/b;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/push/b/i;
    .locals 3

    .prologue
    .line 110
    new-instance v0, Lcom/facebook/orca/push/b/i;

    const-class v1, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsVoipEnabledForUser;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/orca/push/b/g;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/orca/push/b/i;-><init>(Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 105
    invoke-virtual {p0}, Lcom/facebook/orca/push/b/g;->a()Lcom/facebook/orca/push/b/i;

    move-result-object v0

    return-object v0
.end method
