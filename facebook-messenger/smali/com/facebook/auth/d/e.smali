.class Lcom/facebook/auth/d/e;
.super Lcom/facebook/inject/d;
.source "LoggedInUserAuthModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/auth/c/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/auth/d/b;


# direct methods
.method private constructor <init>(Lcom/facebook/auth/d/b;)V
    .locals 0

    .prologue
    .line 247
    iput-object p1, p0, Lcom/facebook/auth/d/e;->a:Lcom/facebook/auth/d/b;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/d/b;Lcom/facebook/auth/d/c;)V
    .locals 0

    .prologue
    .line 247
    invoke-direct {p0, p1}, Lcom/facebook/auth/d/e;-><init>(Lcom/facebook/auth/d/b;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/c/b;
    .locals 1

    .prologue
    .line 251
    new-instance v0, Lcom/facebook/auth/c/b;

    invoke-direct {v0}, Lcom/facebook/auth/c/b;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 247
    invoke-virtual {p0}, Lcom/facebook/auth/d/e;->a()Lcom/facebook/auth/c/b;

    move-result-object v0

    return-object v0
.end method
