.class public abstract Lcom/dropbox/client2/VersionedSerializable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final instanceVersion:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    invoke-virtual {p0}, Lcom/dropbox/client2/VersionedSerializable;->getLatestVersion()I

    move-result v0

    iput v0, p0, Lcom/dropbox/client2/VersionedSerializable;->instanceVersion:I

    .line 57
    return-void
.end method


# virtual methods
.method public getInstanceVersion()I
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcom/dropbox/client2/VersionedSerializable;->instanceVersion:I

    return v0
.end method

.method public abstract getLatestVersion()I
.end method

.method public isStale()Z
    .locals 2

    .prologue
    .line 52
    iget v0, p0, Lcom/dropbox/client2/VersionedSerializable;->instanceVersion:I

    invoke-virtual {p0}, Lcom/dropbox/client2/VersionedSerializable;->getLatestVersion()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
