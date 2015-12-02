.class Lcom/facebook/auth/login/ba;
.super Lcom/facebook/inject/d;
.source "LoginModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/auth/login/bm;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/ap;


# direct methods
.method private constructor <init>(Lcom/facebook/auth/login/ap;)V
    .locals 0

    .prologue
    .line 180
    iput-object p1, p0, Lcom/facebook/auth/login/ba;->a:Lcom/facebook/auth/login/ap;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/login/ap;Lcom/facebook/auth/login/aq;)V
    .locals 0

    .prologue
    .line 180
    invoke-direct {p0, p1}, Lcom/facebook/auth/login/ba;-><init>(Lcom/facebook/auth/login/ap;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/login/bm;
    .locals 6

    .prologue
    .line 184
    new-instance v2, Lcom/facebook/auth/login/bm;

    const-class v0, Ljava/lang/Boolean;

    const-class v1, Lcom/facebook/auth/annotations/IsFirstPartySsoEnabled;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/auth/login/ba;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v0, Lcom/facebook/config/a/b;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ba;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/ba;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0}, Lcom/facebook/auth/login/ba;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v5, Landroid/content/ContentResolver;

    invoke-interface {v1, v5}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ContentResolver;

    invoke-direct {v2, v3, v4, v0, v1}, Lcom/facebook/auth/login/bm;-><init>(Ljavax/inject/a;Ljavax/inject/a;Lcom/fasterxml/jackson/databind/ObjectMapper;Landroid/content/ContentResolver;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 180
    invoke-virtual {p0}, Lcom/facebook/auth/login/ba;->a()Lcom/facebook/auth/login/bm;

    move-result-object v0

    return-object v0
.end method
