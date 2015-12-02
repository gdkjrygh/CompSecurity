.class public Lcom/facebook/common/g/c;
.super Ljava/lang/Object;
.source "FutureAndCallbackHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/common/g/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/g/b",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/common/d/a/s;Lcom/facebook/common/g/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/d/a/s",
            "<TT;>;",
            "Lcom/facebook/common/g/b",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/facebook/common/g/c;->a:Lcom/google/common/d/a/s;

    .line 25
    iput-object p2, p0, Lcom/facebook/common/g/c;->b:Lcom/facebook/common/g/b;

    .line 26
    return-void
.end method

.method public static a(Lcom/google/common/d/a/s;Lcom/facebook/common/g/b;)Lcom/facebook/common/g/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/d/a/s",
            "<TT;>;",
            "Lcom/facebook/common/g/b",
            "<TT;>;)",
            "Lcom/facebook/common/g/c",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 38
    new-instance v0, Lcom/facebook/common/g/c;

    invoke-direct {v0, p0, p1}, Lcom/facebook/common/g/c;-><init>(Lcom/google/common/d/a/s;Lcom/facebook/common/g/b;)V

    return-object v0
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/common/g/c;->b:Lcom/facebook/common/g/b;

    invoke-interface {v0}, Lcom/facebook/common/g/b;->a()V

    .line 69
    iget-object v0, p0, Lcom/facebook/common/g/c;->a:Lcom/google/common/d/a/s;

    invoke-interface {v0, p1}, Lcom/google/common/d/a/s;->cancel(Z)Z

    .line 70
    return-void
.end method
