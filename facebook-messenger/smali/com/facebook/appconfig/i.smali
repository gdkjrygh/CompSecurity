.class Lcom/facebook/appconfig/i;
.super Lcom/facebook/inject/d;
.source "AppConfigModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/appconfig/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/appconfig/f;


# direct methods
.method private constructor <init>(Lcom/facebook/appconfig/f;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/facebook/appconfig/i;->a:Lcom/facebook/appconfig/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/appconfig/f;Lcom/facebook/appconfig/g;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1}, Lcom/facebook/appconfig/i;-><init>(Lcom/facebook/appconfig/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/appconfig/c;
    .locals 3

    .prologue
    .line 68
    new-instance v2, Lcom/facebook/appconfig/c;

    const-class v0, Lcom/facebook/appconfig/o;

    invoke-virtual {p0, v0}, Lcom/facebook/appconfig/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/appconfig/o;

    const-class v1, Lcom/facebook/appconfig/b;

    invoke-virtual {p0, v1}, Lcom/facebook/appconfig/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/appconfig/b;

    invoke-direct {v2, v0, v1}, Lcom/facebook/appconfig/c;-><init>(Lcom/facebook/appconfig/o;Lcom/facebook/appconfig/b;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 63
    invoke-virtual {p0}, Lcom/facebook/appconfig/i;->a()Lcom/facebook/appconfig/c;

    move-result-object v0

    return-object v0
.end method
