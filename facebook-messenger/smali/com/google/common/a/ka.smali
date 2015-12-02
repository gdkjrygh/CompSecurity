.class final Lcom/google/common/a/ka;
.super Lcom/google/common/a/eq;
.source "RegularImmutableMap.java"

# interfaces
.implements Lcom/google/common/a/jz;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/eq",
        "<TK;TV;>;",
        "Lcom/google/common/a/jz",
        "<TK;TV;>;"
    }
.end annotation

.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field final a:Lcom/google/common/a/jz;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/jz",
            "<TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/common/a/jz;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Lcom/google/common/a/jz",
            "<TK;TV;>;)V"
        }
    .end annotation

    .prologue
    .line 116
    invoke-direct {p0, p1, p2}, Lcom/google/common/a/eq;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 117
    iput-object p3, p0, Lcom/google/common/a/ka;->a:Lcom/google/common/a/jz;

    .line 118
    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/jz;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/jz",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 121
    iget-object v0, p0, Lcom/google/common/a/ka;->a:Lcom/google/common/a/jz;

    return-object v0
.end method
