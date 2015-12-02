.class Lcom/facebook/bugreporter/v;
.super Lcom/facebook/inject/d;
.source "BugReporterModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/bugreporter/ae;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/bugreporter/o;


# direct methods
.method private constructor <init>(Lcom/facebook/bugreporter/o;)V
    .locals 0

    .prologue
    .line 125
    iput-object p1, p0, Lcom/facebook/bugreporter/v;->a:Lcom/facebook/bugreporter/o;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/bugreporter/o;Lcom/facebook/bugreporter/p;)V
    .locals 0

    .prologue
    .line 125
    invoke-direct {p0, p1}, Lcom/facebook/bugreporter/v;-><init>(Lcom/facebook/bugreporter/o;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/bugreporter/ae;
    .locals 1

    .prologue
    .line 130
    const-class v0, Lcom/facebook/bugreporter/ab;

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/v;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/ab;

    invoke-virtual {v0}, Lcom/facebook/bugreporter/ab;->a()Lcom/facebook/bugreporter/ae;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 125
    invoke-virtual {p0}, Lcom/facebook/bugreporter/v;->a()Lcom/facebook/bugreporter/ae;

    move-result-object v0

    return-object v0
.end method
