.class public Lcom/facebook/inject/s;
.super Ljava/lang/Object;
.source "EagerScopeInfo.java"


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
.field public final a:Lcom/google/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/a",
            "<TT;>;"
        }
    .end annotation
.end field

.field public final b:Lcom/facebook/inject/f;


# direct methods
.method public constructor <init>(Lcom/google/inject/a;Lcom/facebook/inject/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/a",
            "<TT;>;",
            "Lcom/facebook/inject/f;",
            ")V"
        }
    .end annotation

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/facebook/inject/s;->a:Lcom/google/inject/a;

    .line 17
    iput-object p2, p0, Lcom/facebook/inject/s;->b:Lcom/facebook/inject/f;

    .line 18
    return-void
.end method
