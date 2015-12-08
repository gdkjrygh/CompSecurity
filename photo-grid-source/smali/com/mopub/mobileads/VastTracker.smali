.class public Lcom/mopub/mobileads/VastTracker;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field protected final a:Ljava/lang/String;

.field private b:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 20
    iput-object p1, p0, Lcom/mopub/mobileads/VastTracker;->a:Ljava/lang/String;

    .line 21
    return-void
.end method


# virtual methods
.method public getTrackingUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/mopub/mobileads/VastTracker;->a:Ljava/lang/String;

    return-object v0
.end method

.method public isTracked()Z
    .locals 1

    .prologue
    .line 33
    iget-boolean v0, p0, Lcom/mopub/mobileads/VastTracker;->b:Z

    return v0
.end method

.method public setTracked()V
    .locals 1

    .prologue
    .line 29
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/mobileads/VastTracker;->b:Z

    .line 30
    return-void
.end method
