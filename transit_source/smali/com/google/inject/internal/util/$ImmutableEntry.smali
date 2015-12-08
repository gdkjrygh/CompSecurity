.class Lcom/google/inject/internal/util/$ImmutableEntry;
.super Lcom/google/inject/internal/util/$AbstractMapEntry;
.source "ImmutableEntry.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/inject/internal/util/$AbstractMapEntry",
        "<TK;TV;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J


# instance fields
.field private final key:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field private final value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lcom/google/inject/internal/util/$Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Lcom/google/inject/internal/util/$Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    .prologue
    .line 29
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableEntry;, "Lcom/google/inject/internal/util/$ImmutableEntry<TK;TV;>;"
    .local p1, "key":Ljava/lang/Object;, "TK;"
    .local p2, "value":Ljava/lang/Object;, "TV;"
    invoke-direct {p0}, Lcom/google/inject/internal/util/$AbstractMapEntry;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/google/inject/internal/util/$ImmutableEntry;->key:Ljava/lang/Object;

    .line 31
    iput-object p2, p0, Lcom/google/inject/internal/util/$ImmutableEntry;->value:Ljava/lang/Object;

    .line 32
    return-void
.end method


# virtual methods
.method public getKey()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    .prologue
    .line 35
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableEntry;, "Lcom/google/inject/internal/util/$ImmutableEntry<TK;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableEntry;->key:Ljava/lang/Object;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .prologue
    .line 39
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableEntry;, "Lcom/google/inject/internal/util/$ImmutableEntry<TK;TV;>;"
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableEntry;->value:Ljava/lang/Object;

    return-object v0
.end method
