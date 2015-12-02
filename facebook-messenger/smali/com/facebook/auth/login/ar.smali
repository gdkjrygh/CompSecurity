.class Lcom/facebook/auth/login/ar;
.super Lcom/facebook/inject/d;
.source "LoginModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/auth/login/o;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/ap;


# direct methods
.method private constructor <init>(Lcom/facebook/auth/login/ap;)V
    .locals 0

    .prologue
    .line 129
    iput-object p1, p0, Lcom/facebook/auth/login/ar;->a:Lcom/facebook/auth/login/ap;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/login/ap;Lcom/facebook/auth/login/aq;)V
    .locals 0

    .prologue
    .line 129
    invoke-direct {p0, p1}, Lcom/facebook/auth/login/ar;-><init>(Lcom/facebook/auth/login/ap;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/login/o;
    .locals 13

    .prologue
    .line 133
    new-instance v0, Lcom/facebook/auth/login/o;

    const-class v1, Lcom/facebook/auth/b/a;

    invoke-virtual {p0, v1}, Lcom/facebook/auth/login/ar;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/auth/b/a;

    const-class v2, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v2}, Lcom/facebook/auth/login/ar;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/prefs/shared/d;

    const-class v3, Lcom/facebook/auth/a/b;

    invoke-virtual {p0, v3}, Lcom/facebook/auth/login/ar;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v3

    const-class v4, Lcom/facebook/auth/protocol/c;

    invoke-virtual {p0, v4}, Lcom/facebook/auth/login/ar;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/auth/protocol/c;

    const-class v5, Lcom/facebook/auth/protocol/e;

    invoke-virtual {p0, v5}, Lcom/facebook/auth/login/ar;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/auth/protocol/e;

    const-class v6, Lcom/facebook/auth/protocol/b;

    invoke-virtual {p0, v6}, Lcom/facebook/auth/login/ar;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/auth/protocol/b;

    const-class v7, Lcom/facebook/auth/protocol/a;

    invoke-virtual {p0, v7}, Lcom/facebook/auth/login/ar;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/auth/protocol/a;

    const-class v8, Lcom/facebook/http/protocol/aq;

    invoke-virtual {p0, v8}, Lcom/facebook/auth/login/ar;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v8

    const-class v9, Ljava/lang/Boolean;

    const-class v10, Lcom/facebook/auth/annotations/ShouldExpireAuthToken;

    invoke-virtual {p0, v9, v10}, Lcom/facebook/auth/login/ar;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v9

    const-class v10, Lcom/facebook/auth/login/am;

    invoke-virtual {p0, v10}, Lcom/facebook/auth/login/ar;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/auth/login/am;

    const-class v11, Ljava/lang/Boolean;

    const-class v12, Lcom/facebook/auth/annotations/ShouldRequestSessionCookiesWithAuth;

    invoke-virtual {p0, v11, v12}, Lcom/facebook/auth/login/ar;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v11

    const-class v12, Lcom/facebook/auth/login/a;

    invoke-virtual {p0, v12}, Lcom/facebook/auth/login/ar;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/facebook/auth/login/a;

    invoke-direct/range {v0 .. v12}, Lcom/facebook/auth/login/o;-><init>(Lcom/facebook/auth/b/a;Lcom/facebook/prefs/shared/d;Ljava/util/Set;Lcom/facebook/auth/protocol/c;Lcom/facebook/auth/protocol/e;Lcom/facebook/auth/protocol/b;Lcom/facebook/auth/protocol/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/auth/login/am;Ljavax/inject/a;Lcom/facebook/auth/login/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 129
    invoke-virtual {p0}, Lcom/facebook/auth/login/ar;->a()Lcom/facebook/auth/login/o;

    move-result-object v0

    return-object v0
.end method
