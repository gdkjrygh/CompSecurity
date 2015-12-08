.class public Lcom/google/inject/CreationException;
.super Ljava/lang/RuntimeException;
.source "CreationException.java"


# static fields
.field private static final serialVersionUID:J


# instance fields
.field private final messages:Lcom/google/inject/internal/util/$ImmutableSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/util/$ImmutableSet",
            "<",
            "Lcom/google/inject/spi/Message;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/inject/spi/Message;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 36
    .local p1, "messages":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/google/inject/spi/Message;>;"
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 37
    invoke-static {p1}, Lcom/google/inject/internal/util/$ImmutableSet;->copyOf(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/CreationException;->messages:Lcom/google/inject/internal/util/$ImmutableSet;

    .line 38
    iget-object v0, p0, Lcom/google/inject/CreationException;->messages:Lcom/google/inject/internal/util/$ImmutableSet;

    invoke-virtual {v0}, Lcom/google/inject/internal/util/$ImmutableSet;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/inject/internal/util/$Preconditions;->checkArgument(Z)V

    .line 39
    iget-object v0, p0, Lcom/google/inject/CreationException;->messages:Lcom/google/inject/internal/util/$ImmutableSet;

    invoke-static {v0}, Lcom/google/inject/internal/Errors;->getOnlyCause(Ljava/util/Collection;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/inject/CreationException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 40
    return-void

    .line 38
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public getErrorMessages()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/inject/spi/Message;",
            ">;"
        }
    .end annotation

    .prologue
    .line 44
    iget-object v0, p0, Lcom/google/inject/CreationException;->messages:Lcom/google/inject/internal/util/$ImmutableSet;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 2

    .prologue
    .line 48
    const-string v0, "Guice creation errors"

    iget-object v1, p0, Lcom/google/inject/CreationException;->messages:Lcom/google/inject/internal/util/$ImmutableSet;

    invoke-static {v0, v1}, Lcom/google/inject/internal/Errors;->format(Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
