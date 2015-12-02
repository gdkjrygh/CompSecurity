.class Lcom/facebook/f/m;
.super Lcom/facebook/inject/d;
.source "GkModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/f/g;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/f/k;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/facebook/f/m;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/f/g;
    .locals 4

    .prologue
    .line 44
    new-instance v2, Lcom/facebook/f/g;

    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/f/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    const-class v1, Lcom/facebook/f/a;

    invoke-virtual {p0, v1}, Lcom/facebook/f/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/f/a;

    const-class v3, Lcom/facebook/f/f;

    invoke-virtual {p0, v3}, Lcom/facebook/f/m;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v3

    invoke-direct {v2, v0, v1, v3}, Lcom/facebook/f/g;-><init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/f/a;Ljava/util/Set;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 39
    invoke-virtual {p0}, Lcom/facebook/f/m;->a()Lcom/facebook/f/g;

    move-result-object v0

    return-object v0
.end method
