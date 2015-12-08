.class public Lcom/mopub/mobileads/VastAbsoluteProgressTracker;
.super Lcom/mopub/mobileads/VastTracker;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/mopub/mobileads/VastTracker;",
        "Ljava/io/Serializable;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/mopub/mobileads/VastAbsoluteProgressTracker;",
        ">;"
    }
.end annotation


# instance fields
.field private final b:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lcom/mopub/mobileads/VastTracker;-><init>(Ljava/lang/String;)V

    .line 20
    if-ltz p2, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/mopub/common/Preconditions;->checkArgument(Z)V

    .line 21
    iput p2, p0, Lcom/mopub/mobileads/VastAbsoluteProgressTracker;->b:I

    .line 22
    return-void

    .line 20
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public compareTo(Lcom/mopub/mobileads/VastAbsoluteProgressTracker;)I
    .locals 2

    .prologue
    .line 30
    invoke-virtual {p1}, Lcom/mopub/mobileads/VastAbsoluteProgressTracker;->getTrackingMilliseconds()I

    move-result v0

    .line 31
    invoke-virtual {p0}, Lcom/mopub/mobileads/VastAbsoluteProgressTracker;->getTrackingMilliseconds()I

    move-result v1

    .line 33
    sub-int v0, v1, v0

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 14
    check-cast p1, Lcom/mopub/mobileads/VastAbsoluteProgressTracker;

    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/VastAbsoluteProgressTracker;->compareTo(Lcom/mopub/mobileads/VastAbsoluteProgressTracker;)I

    move-result v0

    return v0
.end method

.method public getTrackingMilliseconds()I
    .locals 1

    .prologue
    .line 25
    iget v0, p0, Lcom/mopub/mobileads/VastAbsoluteProgressTracker;->b:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 38
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "%dms: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget v4, p0, Lcom/mopub/mobileads/VastAbsoluteProgressTracker;->b:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/mopub/mobileads/VastAbsoluteProgressTracker;->a:Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
