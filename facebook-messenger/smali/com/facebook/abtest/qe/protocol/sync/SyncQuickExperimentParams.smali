.class public Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;
.super Ljava/lang/Object;
.source "SyncQuickExperimentParams.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# static fields
.field public static a:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 46
    new-instance v0, Lcom/facebook/abtest/qe/protocol/sync/b;

    invoke-direct {v0}, Lcom/facebook/abtest/qe/protocol/sync/b;-><init>()V

    sput-object v0, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;->a:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;->b:Ljava/lang/String;

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;->c:Ljava/lang/String;

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;->d:Ljava/lang/String;

    .line 32
    return-void
.end method

.method private constructor <init>(Lcom/facebook/abtest/qe/protocol/sync/c;)V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    invoke-static {p1}, Lcom/facebook/abtest/qe/protocol/sync/c;->a(Lcom/facebook/abtest/qe/protocol/sync/c;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;->b:Ljava/lang/String;

    .line 24
    invoke-static {p1}, Lcom/facebook/abtest/qe/protocol/sync/c;->b(Lcom/facebook/abtest/qe/protocol/sync/c;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;->c:Ljava/lang/String;

    .line 25
    invoke-static {p1}, Lcom/facebook/abtest/qe/protocol/sync/c;->c(Lcom/facebook/abtest/qe/protocol/sync/c;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;->d:Ljava/lang/String;

    .line 26
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/abtest/qe/protocol/sync/c;Lcom/facebook/abtest/qe/protocol/sync/b;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0, p1}, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;-><init>(Lcom/facebook/abtest/qe/protocol/sync/c;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;->d:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 59
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 65
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 66
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 67
    return-void
.end method
