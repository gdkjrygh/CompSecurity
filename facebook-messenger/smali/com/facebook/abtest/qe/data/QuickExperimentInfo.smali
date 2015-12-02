.class public Lcom/facebook/abtest/qe/data/QuickExperimentInfo;
.super Ljava/lang/Object;
.source "QuickExperimentInfo.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/abtest/qe/data/QuickExperimentInfo;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Z

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Lcom/google/common/a/ev;
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

.field private final h:Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const-class v0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    sput-object v0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a:Ljava/lang/Class;

    .line 75
    new-instance v0, Lcom/facebook/abtest/qe/data/b;

    invoke-direct {v0}, Lcom/facebook/abtest/qe/data/b;-><init>()V

    sput-object v0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->b:Ljava/lang/String;

    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->c:Ljava/lang/String;

    .line 67
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->d:Z

    .line 68
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->e:Ljava/lang/String;

    .line 69
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->f:Ljava/lang/String;

    .line 70
    const-class v0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/ev;->a(Ljava/util/Map;)Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->g:Lcom/google/common/a/ev;

    .line 72
    const-class v0, Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;

    iput-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->h:Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;

    .line 73
    return-void

    .line 67
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/abtest/qe/data/b;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method private constructor <init>(Lcom/facebook/abtest/qe/data/c;)V
    .locals 1

    .prologue
    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    invoke-static {p1}, Lcom/facebook/abtest/qe/data/c;->a(Lcom/facebook/abtest/qe/data/c;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->b:Ljava/lang/String;

    .line 56
    invoke-static {p1}, Lcom/facebook/abtest/qe/data/c;->b(Lcom/facebook/abtest/qe/data/c;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->c:Ljava/lang/String;

    .line 57
    invoke-static {p1}, Lcom/facebook/abtest/qe/data/c;->c(Lcom/facebook/abtest/qe/data/c;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->d:Z

    .line 58
    invoke-static {p1}, Lcom/facebook/abtest/qe/data/c;->d(Lcom/facebook/abtest/qe/data/c;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->e:Ljava/lang/String;

    .line 59
    invoke-static {p1}, Lcom/facebook/abtest/qe/data/c;->e(Lcom/facebook/abtest/qe/data/c;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->f:Ljava/lang/String;

    .line 60
    invoke-static {p1}, Lcom/facebook/abtest/qe/data/c;->f(Lcom/facebook/abtest/qe/data/c;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Lcom/google/common/a/ev;->a(Ljava/util/Map;)Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->g:Lcom/google/common/a/ev;

    .line 61
    invoke-static {p1}, Lcom/facebook/abtest/qe/data/c;->g(Lcom/facebook/abtest/qe/data/c;)Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->h:Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;

    .line 62
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/abtest/qe/data/c;Lcom/facebook/abtest/qe/data/b;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;-><init>(Lcom/facebook/abtest/qe/data/c;)V

    return-void
.end method

.method public static a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 152
    if-nez p0, :cond_1

    if-eqz p1, :cond_1

    .line 169
    :cond_0
    :goto_0
    return v0

    .line 156
    :cond_1
    if-nez p1, :cond_2

    if-nez p0, :cond_0

    .line 160
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->c()Z

    move-result v1

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->c()Z

    move-result v2

    if-ne v1, v2, :cond_0

    invoke-virtual {p0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->f()Lcom/google/common/a/ev;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->f()Lcom/google/common/a/ev;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 169
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static newBuilder()Lcom/facebook/abtest/qe/data/c;
    .locals 1

    .prologue
    .line 230
    new-instance v0, Lcom/facebook/abtest/qe/data/c;

    invoke-direct {v0}, Lcom/facebook/abtest/qe/data/c;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/google/common/base/Optional;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 207
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;Ljava/util/Map;)Lcom/google/common/base/Optional;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/util/Map;)Lcom/google/common/base/Optional;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 183
    iget-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->c:Ljava/lang/String;

    const-string v1, "local_default_group"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 185
    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v0

    .line 202
    :goto_0
    return-object v0

    .line 187
    :cond_0
    iget-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->g:Lcom/google/common/a/ev;

    invoke-virtual {v0, p1}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 188
    if-nez v0, :cond_1

    .line 189
    invoke-static {}, Lcom/google/common/base/Optional;->absent()Lcom/google/common/base/Optional;

    move-result-object v0

    goto :goto_0

    .line 192
    :cond_1
    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 193
    :cond_2
    invoke-static {v0}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v0

    goto :goto_0

    .line 197
    :cond_3
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v2, v0

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 198
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\\{"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "\\}"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 199
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    .line 200
    goto :goto_1

    .line 202
    :cond_4
    invoke-static {v2}, Lcom/google/common/base/Optional;->of(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v0

    goto :goto_0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 122
    iget-boolean v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->d:Z

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->e:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 90
    const/4 v0, 0x0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->f:Ljava/lang/String;

    return-object v0
.end method

.method public f()Lcom/google/common/a/ev;
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
    .line 140
    iget-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->g:Lcom/google/common/a/ev;

    return-object v0
.end method

.method public g()Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->h:Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 213
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 214
    iget-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->b:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/Group:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/Experiment:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/Locale:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/customStrings: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    iget-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->g:Lcom/google/common/a/ev;

    invoke-virtual {v0}, Lcom/google/common/a/ev;->a()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 224
    const-string v1, "\n"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, ": "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 226
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 96
    iget-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 97
    iget-boolean v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->d:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 98
    iget-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 99
    iget-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 100
    iget-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->g:Lcom/google/common/a/ev;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 101
    iget-object v0, p0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->h:Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 102
    return-void

    .line 97
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
