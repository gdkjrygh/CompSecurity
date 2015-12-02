.class public Lcom/facebook/widget/animatablelistview/j;
.super Ljava/lang/Object;
.source "AnimatingListTransaction.java"


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
.field private final a:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/widget/animatablelistview/h",
            "<TT;>;>;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/common/a/es;Lcom/google/common/a/es;Lcom/google/common/a/es;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/widget/animatablelistview/h",
            "<TT;>;>;",
            "Lcom/google/common/a/es",
            "<TT;>;",
            "Lcom/google/common/a/es",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/facebook/widget/animatablelistview/j;->a:Lcom/google/common/a/es;

    .line 22
    iput-object p2, p0, Lcom/facebook/widget/animatablelistview/j;->b:Lcom/google/common/a/es;

    .line 23
    iput-object p3, p0, Lcom/facebook/widget/animatablelistview/j;->c:Lcom/google/common/a/es;

    .line 24
    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/widget/animatablelistview/h",
            "<TT;>;>;"
        }
    .end annotation

    .prologue
    .line 27
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/j;->a:Lcom/google/common/a/es;

    return-object v0
.end method

.method public b()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/j;->b:Lcom/google/common/a/es;

    return-object v0
.end method

.method public c()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/widget/animatablelistview/j;->c:Lcom/google/common/a/es;

    return-object v0
.end method
