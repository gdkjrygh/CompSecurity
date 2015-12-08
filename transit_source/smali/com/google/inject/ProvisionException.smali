.class public final Lcom/google/inject/ProvisionException;
.super Ljava/lang/RuntimeException;
.source "ProvisionException.java"


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
.method public constructor <init>(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<",
            "Lcom/google/inject/spi/Message;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 38
    .local p1, "messages":Ljava/lang/Iterable;, "Ljava/lang/Iterable<Lcom/google/inject/spi/Message;>;"
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 39
    invoke-static {p1}, Lcom/google/inject/internal/util/$ImmutableSet;->copyOf(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/ProvisionException;->messages:Lcom/google/inject/internal/util/$ImmutableSet;

    .line 40
    iget-object v0, p0, Lcom/google/inject/ProvisionException;->messages:Lcom/google/inject/internal/util/$ImmutableSet;

    invoke-virtual {v0}, Lcom/google/inject/internal/util/$ImmutableSet;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/inject/internal/util/$Preconditions;->checkArgument(Z)V

    .line 41
    iget-object v0, p0, Lcom/google/inject/ProvisionException;->messages:Lcom/google/inject/internal/util/$ImmutableSet;

    invoke-static {v0}, Lcom/google/inject/internal/Errors;->getOnlyCause(Ljava/util/Collection;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/inject/ProvisionException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 42
    return-void

    .line 40
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 50
    new-instance v0, Lcom/google/inject/spi/Message;

    invoke-direct {v0, p1}, Lcom/google/inject/spi/Message;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/inject/internal/util/$ImmutableSet;->of(Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/ProvisionException;->messages:Lcom/google/inject/internal/util/$ImmutableSet;

    .line 51
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "cause"    # Ljava/lang/Throwable;

    .prologue
    .line 45
    invoke-direct {p0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 46
    new-instance v0, Lcom/google/inject/spi/Message;

    invoke-static {}, Lcom/google/inject/internal/util/$ImmutableList;->of()Lcom/google/inject/internal/util/$ImmutableList;

    move-result-object v1

    invoke-direct {v0, v1, p1, p2}, Lcom/google/inject/spi/Message;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0}, Lcom/google/inject/internal/util/$ImmutableSet;->of(Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/ProvisionException;->messages:Lcom/google/inject/internal/util/$ImmutableSet;

    .line 47
    return-void
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
    .line 55
    iget-object v0, p0, Lcom/google/inject/ProvisionException;->messages:Lcom/google/inject/internal/util/$ImmutableSet;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 2

    .prologue
    .line 59
    const-string v0, "Guice provision errors"

    iget-object v1, p0, Lcom/google/inject/ProvisionException;->messages:Lcom/google/inject/internal/util/$ImmutableSet;

    invoke-static {v0, v1}, Lcom/google/inject/internal/Errors;->format(Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
