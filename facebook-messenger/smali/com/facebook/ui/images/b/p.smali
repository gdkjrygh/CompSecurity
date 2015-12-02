.class public Lcom/facebook/ui/images/b/p;
.super Ljava/lang/Object;
.source "FetchImageRequest.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field private final a:Lcom/facebook/ui/images/b/m;

.field private final b:Z


# direct methods
.method constructor <init>(Lcom/facebook/ui/images/b/q;)V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/q;->a()Lcom/facebook/ui/images/b/m;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/b/p;->a:Lcom/facebook/ui/images/b/m;

    .line 19
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/q;->b()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/ui/images/b/p;->b:Z

    .line 20
    return-void
.end method

.method public static a(Lcom/facebook/ui/images/b/m;)Lcom/facebook/ui/images/b/q;
    .locals 1

    .prologue
    .line 29
    new-instance v0, Lcom/facebook/ui/images/b/q;

    invoke-direct {v0, p0}, Lcom/facebook/ui/images/b/q;-><init>(Lcom/facebook/ui/images/b/m;)V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/ui/images/b/m;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/facebook/ui/images/b/p;->a:Lcom/facebook/ui/images/b/m;

    return-object v0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 47
    iget-boolean v0, p0, Lcom/facebook/ui/images/b/p;->b:Z

    return v0
.end method
