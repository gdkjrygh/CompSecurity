.class Lcom/facebook/bugreporter/q;
.super Lcom/facebook/inject/d;
.source "BugReporterModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/bugreporter/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/bugreporter/o;


# direct methods
.method private constructor <init>(Lcom/facebook/bugreporter/o;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/facebook/bugreporter/q;->a:Lcom/facebook/bugreporter/o;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/bugreporter/o;Lcom/facebook/bugreporter/p;)V
    .locals 0

    .prologue
    .line 76
    invoke-direct {p0, p1}, Lcom/facebook/bugreporter/q;-><init>(Lcom/facebook/bugreporter/o;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/bugreporter/d;
    .locals 1

    .prologue
    .line 79
    new-instance v0, Lcom/facebook/bugreporter/d;

    invoke-direct {v0}, Lcom/facebook/bugreporter/d;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 76
    invoke-virtual {p0}, Lcom/facebook/bugreporter/q;->a()Lcom/facebook/bugreporter/d;

    move-result-object v0

    return-object v0
.end method
