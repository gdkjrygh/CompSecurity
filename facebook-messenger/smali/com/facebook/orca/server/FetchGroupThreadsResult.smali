.class public Lcom/facebook/orca/server/FetchGroupThreadsResult;
.super Lcom/facebook/fbservice/c/a;
.source "FetchGroupThreadsResult.java"

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
            "Lcom/facebook/orca/server/FetchGroupThreadsResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/orca/threads/ThreadsCollection;

.field private final b:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Z

.field private final f:J

.field private final g:Lcom/facebook/fbservice/service/ServiceException;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 146
    new-instance v0, Lcom/facebook/orca/server/l;

    invoke-direct {v0}, Lcom/facebook/orca/server/l;-><init>()V

    sput-object v0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 64
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/c/a;-><init>(Landroid/os/Parcel;)V

    .line 65
    const-class v0, Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadsCollection;

    iput-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->a:Lcom/facebook/orca/threads/ThreadsCollection;

    .line 66
    const-class v0, Lcom/facebook/user/User;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->b:Lcom/google/common/a/es;

    .line 67
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->c:Lcom/google/common/a/es;

    .line 68
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->d:Lcom/google/common/a/es;

    .line 69
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->e:Z

    .line 70
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->f:J

    .line 71
    const-class v0, Lcom/facebook/fbservice/service/ServiceException;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/ServiceException;

    iput-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->g:Lcom/facebook/fbservice/service/ServiceException;

    .line 72
    return-void

    .line 69
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/server/l;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/FetchGroupThreadsResult;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Lcom/facebook/orca/server/m;)V
    .locals 3

    .prologue
    .line 52
    invoke-virtual {p1}, Lcom/facebook/orca/server/m;->a()Lcom/facebook/fbservice/c/b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/orca/server/m;->g()J

    move-result-wide v1

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/fbservice/c/a;-><init>(Lcom/facebook/fbservice/c/b;J)V

    .line 53
    invoke-virtual {p1}, Lcom/facebook/orca/server/m;->a()Lcom/facebook/fbservice/c/b;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    invoke-virtual {p1}, Lcom/facebook/orca/server/m;->b()Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->a:Lcom/facebook/orca/threads/ThreadsCollection;

    .line 55
    invoke-virtual {p1}, Lcom/facebook/orca/server/m;->c()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->b:Lcom/google/common/a/es;

    .line 56
    invoke-virtual {p1}, Lcom/facebook/orca/server/m;->d()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->c:Lcom/google/common/a/es;

    .line 57
    invoke-virtual {p1}, Lcom/facebook/orca/server/m;->e()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->d:Lcom/google/common/a/es;

    .line 58
    invoke-virtual {p1}, Lcom/facebook/orca/server/m;->f()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->e:Z

    .line 59
    invoke-virtual {p1}, Lcom/facebook/orca/server/m;->h()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->f:J

    .line 60
    invoke-virtual {p1}, Lcom/facebook/orca/server/m;->i()Lcom/facebook/fbservice/service/ServiceException;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->g:Lcom/facebook/fbservice/service/ServiceException;

    .line 61
    return-void
.end method

.method public static newBuilder()Lcom/facebook/orca/server/m;
    .locals 1

    .prologue
    .line 38
    new-instance v0, Lcom/facebook/orca/server/m;

    invoke-direct {v0}, Lcom/facebook/orca/server/m;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threads/ThreadsCollection;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->a:Lcom/facebook/orca/threads/ThreadsCollection;

    return-object v0
.end method

.method public b()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->b:Lcom/google/common/a/es;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 159
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 164
    invoke-super {p0, p1, p2}, Lcom/facebook/fbservice/c/a;->writeToParcel(Landroid/os/Parcel;I)V

    .line 165
    iget-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->a:Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 166
    iget-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->b:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 167
    iget-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->c:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 168
    iget-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->d:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 169
    iget-boolean v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 170
    iget-wide v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->f:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 171
    iget-object v0, p0, Lcom/facebook/orca/server/FetchGroupThreadsResult;->g:Lcom/facebook/fbservice/service/ServiceException;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 172
    return-void

    .line 169
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
