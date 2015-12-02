.class public Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;
.super Ljava/lang/Object;
.source "SyncQuickExperimentUserInfoResult.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Z

.field private final d:Ljava/lang/String;

.field private final e:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 56
    new-instance v0, Lcom/facebook/abtest/qe/protocol/sync/user/b;

    invoke-direct {v0}, Lcom/facebook/abtest/qe/protocol/sync/user/b;-><init>()V

    sput-object v0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->a:Ljava/lang/String;

    .line 29
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->b:Ljava/lang/String;

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->c:Z

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->d:Ljava/lang/String;

    .line 32
    const-class v0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/ev;->a(Ljava/util/Map;)Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->e:Lcom/google/common/a/ev;

    .line 34
    return-void

    .line 30
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>(Lcom/facebook/abtest/qe/protocol/sync/user/c;)V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    invoke-static {p1}, Lcom/facebook/abtest/qe/protocol/sync/user/c;->a(Lcom/facebook/abtest/qe/protocol/sync/user/c;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->a:Ljava/lang/String;

    .line 21
    invoke-static {p1}, Lcom/facebook/abtest/qe/protocol/sync/user/c;->b(Lcom/facebook/abtest/qe/protocol/sync/user/c;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->b:Ljava/lang/String;

    .line 22
    invoke-static {p1}, Lcom/facebook/abtest/qe/protocol/sync/user/c;->c(Lcom/facebook/abtest/qe/protocol/sync/user/c;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->c:Z

    .line 23
    invoke-static {p1}, Lcom/facebook/abtest/qe/protocol/sync/user/c;->d(Lcom/facebook/abtest/qe/protocol/sync/user/c;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->d:Ljava/lang/String;

    .line 24
    invoke-static {p1}, Lcom/facebook/abtest/qe/protocol/sync/user/c;->e(Lcom/facebook/abtest/qe/protocol/sync/user/c;)Lcom/google/common/a/ev;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Lcom/google/common/a/ev;->a(Ljava/util/Map;)Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->e:Lcom/google/common/a/ev;

    .line 25
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/abtest/qe/protocol/sync/user/c;Lcom/facebook/abtest/qe/protocol/sync/user/b;)V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0, p1}, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;-><init>(Lcom/facebook/abtest/qe/protocol/sync/user/c;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->d:Ljava/lang/String;

    return-object v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 49
    iget-boolean v0, p0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->c:Z

    return v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 71
    const/4 v0, 0x0

    return v0
.end method

.method public e()Lcom/google/common/a/ev;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->e:Lcom/google/common/a/ev;

    invoke-static {v0}, Lcom/google/common/a/ev;->a(Ljava/util/Map;)Lcom/google/common/a/ev;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 77
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 78
    iget-boolean v0, p0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 79
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 80
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->e:Lcom/google/common/a/ev;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 81
    return-void

    .line 78
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
