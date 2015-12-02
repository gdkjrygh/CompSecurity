.class Lcom/facebook/bugreporter/w;
.super Lcom/facebook/inject/d;
.source "BugReporterModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/bugreporter/ab;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/bugreporter/o;


# direct methods
.method private constructor <init>(Lcom/facebook/bugreporter/o;)V
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lcom/facebook/bugreporter/w;->a:Lcom/facebook/bugreporter/o;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/bugreporter/o;Lcom/facebook/bugreporter/p;)V
    .locals 0

    .prologue
    .line 113
    invoke-direct {p0, p1}, Lcom/facebook/bugreporter/w;-><init>(Lcom/facebook/bugreporter/o;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/bugreporter/ab;
    .locals 5

    .prologue
    .line 116
    new-instance v2, Lcom/facebook/bugreporter/ab;

    const-class v0, Lcom/facebook/bugreporter/g;

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/w;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/g;

    const-class v1, Ljava/lang/String;

    const-class v3, Lcom/facebook/auth/annotations/LoggedInUserId;

    invoke-virtual {p0, v1, v3}, Lcom/facebook/bugreporter/w;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v1, Ljava/lang/Boolean;

    const-class v4, Lcom/facebook/bugreporter/annotations/IsRageShakeAvailable;

    invoke-virtual {p0, v1, v4}, Lcom/facebook/bugreporter/w;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v1, Lcom/facebook/ui/i/g;

    invoke-virtual {p0, v1}, Lcom/facebook/bugreporter/w;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/ui/i/g;

    invoke-direct {v2, v0, v3, v4, v1}, Lcom/facebook/bugreporter/ab;-><init>(Lcom/facebook/bugreporter/g;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/ui/i/g;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 113
    invoke-virtual {p0}, Lcom/facebook/bugreporter/w;->a()Lcom/facebook/bugreporter/ab;

    move-result-object v0

    return-object v0
.end method
