.class Lcom/facebook/auth/d/l;
.super Lcom/facebook/inject/d;
.source "LoggedInUserAuthModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/auth/viewercontext/d;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/d/c;)V
    .locals 0

    .prologue
    .line 134
    invoke-direct {p0}, Lcom/facebook/auth/d/l;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/viewercontext/d;
    .locals 2

    .prologue
    .line 139
    new-instance v1, Lcom/facebook/auth/viewercontext/d;

    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    invoke-direct {v1, v0}, Lcom/facebook/auth/viewercontext/d;-><init>(Lcom/facebook/prefs/shared/d;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 134
    invoke-virtual {p0}, Lcom/facebook/auth/d/l;->a()Lcom/facebook/auth/viewercontext/d;

    move-result-object v0

    return-object v0
.end method
