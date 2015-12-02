.class public Lcom/facebook/ui/images/b/q;
.super Ljava/lang/Object;
.source "FetchImageRequestBuilder.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private a:Lcom/facebook/ui/images/b/m;

.field private b:Z


# direct methods
.method public constructor <init>(Lcom/facebook/ui/images/b/m;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/facebook/ui/images/b/q;->a:Lcom/facebook/ui/images/b/m;

    .line 18
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/ui/images/b/m;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/facebook/ui/images/b/q;->a:Lcom/facebook/ui/images/b/m;

    return-object v0
.end method

.method public a(Z)Lcom/facebook/ui/images/b/q;
    .locals 0

    .prologue
    .line 47
    iput-boolean p1, p0, Lcom/facebook/ui/images/b/q;->b:Z

    .line 48
    return-object p0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 36
    iget-boolean v0, p0, Lcom/facebook/ui/images/b/q;->b:Z

    return v0
.end method

.method public c()Lcom/facebook/ui/images/b/p;
    .locals 1

    .prologue
    .line 57
    new-instance v0, Lcom/facebook/ui/images/b/p;

    invoke-direct {v0, p0}, Lcom/facebook/ui/images/b/p;-><init>(Lcom/facebook/ui/images/b/q;)V

    return-object v0
.end method
