.class Lcom/facebook/config/server/p;
.super Lcom/facebook/inject/d;
.source "ServerConfigModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/config/server/k;


# direct methods
.method private constructor <init>(Lcom/facebook/config/server/k;)V
    .locals 0

    .prologue
    .line 61
    iput-object p1, p0, Lcom/facebook/config/server/p;->a:Lcom/facebook/config/server/k;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/config/server/k;Lcom/facebook/config/server/l;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0, p1}, Lcom/facebook/config/server/p;-><init>(Lcom/facebook/config/server/k;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 64
    const-class v0, Lcom/facebook/config/server/j;

    invoke-virtual {p0, v0}, Lcom/facebook/config/server/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/server/j;

    invoke-interface {v0}, Lcom/facebook/config/server/j;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 61
    invoke-virtual {p0}, Lcom/facebook/config/server/p;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
