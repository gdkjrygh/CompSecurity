.class Lcom/facebook/orca/push/b/f;
.super Lcom/facebook/inject/d;
.source "OrcaMqttPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/push/b/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/push/b/b;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/push/b/b;)V
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lcom/facebook/orca/push/b/f;->a:Lcom/facebook/orca/push/b/b;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/push/b/b;Lcom/facebook/orca/push/b/c;)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0, p1}, Lcom/facebook/orca/push/b/f;-><init>(Lcom/facebook/orca/push/b/b;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/push/b/h;
    .locals 6

    .prologue
    .line 97
    new-instance v1, Lcom/facebook/orca/push/b/h;

    const-class v0, Lcom/facebook/config/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/push/b/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/a/a;

    const-class v2, Ljava/lang/Boolean;

    const-class v3, Lcom/facebook/orca/annotations/IsAppIconBadgingEnabled;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/orca/push/b/f;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    const-class v3, Ljava/lang/Boolean;

    const-class v4, Lcom/facebook/orca/annotations/IsPresenceEnabled;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/orca/push/b/f;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v4, Ljava/lang/Boolean;

    const-class v5, Lcom/facebook/orca/annotations/IsVoipEnabledForUser;

    invoke-virtual {p0, v4, v5}, Lcom/facebook/orca/push/b/f;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    invoke-direct {v1, v0, v2, v3, v4}, Lcom/facebook/orca/push/b/h;-><init>(Lcom/facebook/config/a/a;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 92
    invoke-virtual {p0}, Lcom/facebook/orca/push/b/f;->a()Lcom/facebook/orca/push/b/h;

    move-result-object v0

    return-object v0
.end method
