.class Lcom/facebook/http/b/i;
.super Ljava/lang/Object;
.source "FbClientConnManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/http/b/g;


# direct methods
.method private constructor <init>(Lcom/facebook/http/b/g;)V
    .locals 0

    .prologue
    .line 302
    iput-object p1, p0, Lcom/facebook/http/b/i;->a:Lcom/facebook/http/b/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/http/b/g;Lcom/facebook/http/b/h;)V
    .locals 0

    .prologue
    .line 302
    invoke-direct {p0, p1}, Lcom/facebook/http/b/i;-><init>(Lcom/facebook/http/b/g;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 305
    iget-object v0, p0, Lcom/facebook/http/b/i;->a:Lcom/facebook/http/b/g;

    invoke-virtual {v0}, Lcom/facebook/http/b/g;->c()V

    .line 306
    return-void
.end method
