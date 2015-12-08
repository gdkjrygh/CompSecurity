.class public Lcom/mopub/common/event/EventSampler;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/Random;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 18
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-direct {p0, v0}, Lcom/mopub/common/event/EventSampler;-><init>(Ljava/util/Random;)V

    .line 19
    return-void
.end method

.method public constructor <init>(Ljava/util/Random;)V
    .locals 0
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/mopub/common/event/EventSampler;->a:Ljava/util/Random;

    .line 24
    return-void
.end method


# virtual methods
.method final a(Lcom/mopub/common/event/BaseEvent;)Z
    .locals 4

    .prologue
    .line 35
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 37
    iget-object v0, p0, Lcom/mopub/common/event/EventSampler;->a:Ljava/util/Random;

    invoke-virtual {v0}, Ljava/util/Random;->nextDouble()D

    move-result-wide v0

    invoke-virtual {p1}, Lcom/mopub/common/event/BaseEvent;->getSamplingRate()D

    move-result-wide v2

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
