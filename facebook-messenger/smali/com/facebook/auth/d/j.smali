.class Lcom/facebook/auth/d/j;
.super Lcom/facebook/inject/d;
.source "LoggedInUserAuthModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/auth/login/bk;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/auth/d/b;


# direct methods
.method private constructor <init>(Lcom/facebook/auth/d/b;)V
    .locals 0

    .prologue
    .line 235
    iput-object p1, p0, Lcom/facebook/auth/d/j;->a:Lcom/facebook/auth/d/b;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/d/b;Lcom/facebook/auth/d/c;)V
    .locals 0

    .prologue
    .line 235
    invoke-direct {p0, p1}, Lcom/facebook/auth/d/j;-><init>(Lcom/facebook/auth/d/b;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/login/bk;
    .locals 4

    .prologue
    .line 239
    new-instance v1, Lcom/facebook/auth/login/bk;

    const-class v0, Lcom/facebook/prefs/shared/j;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/j;

    const-class v2, Lcom/facebook/prefs/shared/ad;

    invoke-virtual {p0, v2}, Lcom/facebook/auth/d/j;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v2

    const-class v3, Lcom/facebook/prefs/shared/ac;

    invoke-virtual {p0, v3}, Lcom/facebook/auth/d/j;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v3

    invoke-direct {v1, v0, v2, v3}, Lcom/facebook/auth/login/bk;-><init>(Lcom/facebook/prefs/shared/j;Ljava/util/Set;Ljava/util/Set;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 235
    invoke-virtual {p0}, Lcom/facebook/auth/d/j;->a()Lcom/facebook/auth/login/bk;

    move-result-object v0

    return-object v0
.end method
