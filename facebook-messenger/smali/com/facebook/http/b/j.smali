.class Lcom/facebook/http/b/j;
.super Ljava/lang/Object;
.source "FbClientConnManager.java"

# interfaces
.implements Lcom/facebook/c/b;


# instance fields
.field final synthetic a:Lcom/facebook/http/b/g;


# direct methods
.method private constructor <init>(Lcom/facebook/http/b/g;)V
    .locals 0

    .prologue
    .line 312
    iput-object p1, p0, Lcom/facebook/http/b/j;->a:Lcom/facebook/http/b/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/http/b/g;Lcom/facebook/http/b/h;)V
    .locals 0

    .prologue
    .line 312
    invoke-direct {p0, p1}, Lcom/facebook/http/b/j;-><init>(Lcom/facebook/http/b/g;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 1

    .prologue
    .line 315
    iget-object v0, p0, Lcom/facebook/http/b/j;->a:Lcom/facebook/http/b/g;

    invoke-virtual {v0}, Lcom/facebook/http/b/g;->a()V

    .line 316
    return-void
.end method
