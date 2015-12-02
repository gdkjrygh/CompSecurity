.class Lcom/facebook/push/c2dm/k;
.super Lcom/facebook/inject/d;
.source "C2DMPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/push/c2dm/y;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/push/c2dm/d;


# direct methods
.method private constructor <init>(Lcom/facebook/push/c2dm/d;)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lcom/facebook/push/c2dm/k;->a:Lcom/facebook/push/c2dm/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/push/c2dm/d;Lcom/facebook/push/c2dm/e;)V
    .locals 0

    .prologue
    .line 108
    invoke-direct {p0, p1}, Lcom/facebook/push/c2dm/k;-><init>(Lcom/facebook/push/c2dm/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/push/c2dm/y;
    .locals 5

    .prologue
    .line 112
    new-instance v2, Lcom/facebook/push/c2dm/y;

    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    const-class v1, Ljava/lang/String;

    const-class v3, Lcom/facebook/auth/annotations/LoggedInUserId;

    invoke-virtual {p0, v1, v3}, Lcom/facebook/push/c2dm/k;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v1, Ljava/lang/Boolean;

    const-class v4, Lcom/facebook/push/annotations/IsGcmEnabled;

    invoke-virtual {p0, v1, v4}, Lcom/facebook/push/c2dm/k;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    const-class v1, Lcom/facebook/config/b/a;

    invoke-virtual {p0, v1}, Lcom/facebook/push/c2dm/k;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/config/b/a;

    invoke-interface {v1}, Lcom/facebook/config/b/a;->b()I

    move-result v1

    invoke-direct {v2, v0, v3, v4, v1}, Lcom/facebook/push/c2dm/y;-><init>(Lcom/facebook/prefs/shared/d;Ljavax/inject/a;ZI)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 108
    invoke-virtual {p0}, Lcom/facebook/push/c2dm/k;->a()Lcom/facebook/push/c2dm/y;

    move-result-object v0

    return-object v0
.end method
