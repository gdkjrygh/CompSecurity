.class public final Lcom/google/inject/ConfigurationException;
.super Ljava/lang/RuntimeException;
.source "ConfigurationException.java"


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

.field private partialValue:Ljava/lang/Object;


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

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/inject/ConfigurationException;->partialValue:Ljava/lang/Object;

    .line 39
    invoke-static {p1}, Lcom/google/inject/internal/util/$ImmutableSet;->copyOf(Ljava/lang/Iterable;)Lcom/google/inject/internal/util/$ImmutableSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/ConfigurationException;->messages:Lcom/google/inject/internal/util/$ImmutableSet;

    .line 40
    iget-object v0, p0, Lcom/google/inject/ConfigurationException;->messages:Lcom/google/inject/internal/util/$ImmutableSet;

    invoke-static {v0}, Lcom/google/inject/internal/Errors;->getOnlyCause(Ljava/util/Collection;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/inject/ConfigurationException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 41
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
    .line 54
    iget-object v0, p0, Lcom/google/inject/ConfigurationException;->messages:Lcom/google/inject/internal/util/$ImmutableSet;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 2

    .prologue
    .line 70
    const-string v0, "Guice configuration errors"

    iget-object v1, p0, Lcom/google/inject/ConfigurationException;->messages:Lcom/google/inject/internal/util/$ImmutableSet;

    invoke-static {v0, v1}, Lcom/google/inject/internal/Errors;->format(Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPartialValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()TE;"
        }
    .end annotation

    .prologue
    .line 66
    iget-object v0, p0, Lcom/google/inject/ConfigurationException;->partialValue:Ljava/lang/Object;

    return-object v0
.end method

.method public withPartialValue(Ljava/lang/Object;)Lcom/google/inject/ConfigurationException;
    .locals 7
    .param p1, "partialValue"    # Ljava/lang/Object;

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 45
    iget-object v1, p0, Lcom/google/inject/ConfigurationException;->partialValue:Ljava/lang/Object;

    if-nez v1, :cond_0

    move v1, v2

    :goto_0
    const-string v4, "Can\'t clobber existing partial value %s with %s"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/google/inject/ConfigurationException;->partialValue:Ljava/lang/Object;

    aput-object v6, v5, v3

    aput-object p1, v5, v2

    invoke-static {v1, v4, v5}, Lcom/google/inject/internal/util/$Preconditions;->checkState(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 47
    new-instance v0, Lcom/google/inject/ConfigurationException;

    iget-object v1, p0, Lcom/google/inject/ConfigurationException;->messages:Lcom/google/inject/internal/util/$ImmutableSet;

    invoke-direct {v0, v1}, Lcom/google/inject/ConfigurationException;-><init>(Ljava/lang/Iterable;)V

    .line 48
    .local v0, "result":Lcom/google/inject/ConfigurationException;
    iput-object p1, v0, Lcom/google/inject/ConfigurationException;->partialValue:Ljava/lang/Object;

    .line 49
    return-object v0

    .end local v0    # "result":Lcom/google/inject/ConfigurationException;
    :cond_0
    move v1, v3

    .line 45
    goto :goto_0
.end method
