.class Lcom/facebook/reflex/ab;
.super Lcom/facebook/inject/d;
.source "ReflexModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/reflex/a/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/reflex/z;


# direct methods
.method private constructor <init>(Lcom/facebook/reflex/z;)V
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/facebook/reflex/ab;->a:Lcom/facebook/reflex/z;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/reflex/z;Lcom/facebook/reflex/aa;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0, p1}, Lcom/facebook/reflex/ab;-><init>(Lcom/facebook/reflex/z;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/reflex/a/c;
    .locals 2

    .prologue
    .line 63
    new-instance v1, Lcom/facebook/reflex/a/c;

    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    invoke-direct {v1, v0}, Lcom/facebook/reflex/a/c;-><init>(Lcom/facebook/prefs/shared/d;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 59
    invoke-virtual {p0}, Lcom/facebook/reflex/ab;->a()Lcom/facebook/reflex/a/c;

    move-result-object v0

    return-object v0
.end method
