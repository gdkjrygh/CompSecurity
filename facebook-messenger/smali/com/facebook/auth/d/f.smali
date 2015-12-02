.class Lcom/facebook/auth/d/f;
.super Lcom/facebook/inject/d;
.source "LoggedInUserAuthModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/auth/login/w;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/auth/d/b;


# direct methods
.method private constructor <init>(Lcom/facebook/auth/d/b;)V
    .locals 0

    .prologue
    .line 220
    iput-object p1, p0, Lcom/facebook/auth/d/f;->a:Lcom/facebook/auth/d/b;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/d/b;Lcom/facebook/auth/d/c;)V
    .locals 0

    .prologue
    .line 220
    invoke-direct {p0, p1}, Lcom/facebook/auth/d/f;-><init>(Lcom/facebook/auth/d/b;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/login/w;
    .locals 6

    .prologue
    .line 225
    new-instance v0, Lcom/facebook/auth/login/w;

    const-class v1, Landroid/app/Activity;

    invoke-virtual {p0, v1}, Lcom/facebook/auth/d/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    const-class v2, Lcom/facebook/auth/b/b;

    invoke-virtual {p0, v2}, Lcom/facebook/auth/d/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/auth/b/b;

    const-class v3, Lcom/facebook/base/a/d;

    invoke-virtual {p0, v3}, Lcom/facebook/auth/d/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/base/a/d;

    const-class v4, Lcom/facebook/fbservice/ops/o;

    invoke-virtual {p0, v4}, Lcom/facebook/auth/d/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/fbservice/ops/o;

    const-class v5, Lcom/facebook/auth/login/al;

    invoke-virtual {p0, v5}, Lcom/facebook/auth/d/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/auth/login/al;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/auth/login/w;-><init>(Landroid/app/Activity;Lcom/facebook/auth/b/b;Lcom/facebook/base/a/d;Lcom/facebook/fbservice/ops/o;Lcom/facebook/auth/login/al;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 220
    invoke-virtual {p0}, Lcom/facebook/auth/d/f;->a()Lcom/facebook/auth/login/w;

    move-result-object v0

    return-object v0
.end method
