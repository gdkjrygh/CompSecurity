.class public Lcom/facebook/common/o/e;
.super Ljava/lang/Object;
.source "ObjectPoolManager.java"


# instance fields
.field private final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Class;",
            "Lcom/facebook/common/o/a;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/common/time/a;


# direct methods
.method public constructor <init>(Lcom/facebook/common/time/a;)V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/common/o/e;->a:Ljava/util/HashMap;

    .line 19
    iput-object p1, p0, Lcom/facebook/common/o/e;->b:Lcom/facebook/common/time/a;

    .line 20
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lcom/facebook/common/o/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/facebook/common/o/d",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 30
    new-instance v0, Lcom/facebook/common/o/d;

    iget-object v1, p0, Lcom/facebook/common/o/e;->b:Lcom/facebook/common/time/a;

    invoke-direct {v0, p0, p1, v1}, Lcom/facebook/common/o/d;-><init>(Lcom/facebook/common/o/e;Ljava/lang/Class;Lcom/facebook/common/time/a;)V

    return-object v0
.end method

.method a(Ljava/lang/Class;Lcom/facebook/common/o/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Lcom/facebook/common/o/a",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/common/o/e;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    return-void
.end method

.method public b(Ljava/lang/Class;)Lcom/facebook/common/o/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/facebook/common/o/a",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/common/o/e;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/o/a;

    return-object v0
.end method
