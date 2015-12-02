.class Lcom/facebook/h/f;
.super Lcom/facebook/inject/d;
.source "LogControllerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/h/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/h/d;


# direct methods
.method private constructor <init>(Lcom/facebook/h/d;)V
    .locals 0

    .prologue
    .line 33
    iput-object p1, p0, Lcom/facebook/h/f;->a:Lcom/facebook/h/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/h/d;Lcom/facebook/h/e;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0, p1}, Lcom/facebook/h/f;-><init>(Lcom/facebook/h/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/h/a;
    .locals 5

    .prologue
    .line 38
    new-instance v2, Lcom/facebook/h/a;

    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/h/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    const-class v1, Lcom/facebook/config/a/a;

    invoke-virtual {p0, v1}, Lcom/facebook/h/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/config/a/a;

    const-class v3, Ljava/lang/Boolean;

    const-class v4, Lcom/facebook/common/annotations/IsDebugLogsEnabled;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/h/f;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    invoke-direct {v2, v0, v1, v3}, Lcom/facebook/h/a;-><init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/config/a/a;Ljavax/inject/a;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 33
    invoke-virtual {p0}, Lcom/facebook/h/f;->a()Lcom/facebook/h/a;

    move-result-object v0

    return-object v0
.end method
