.class public Lcom/facebook/orca/server/FetchThreadListResult;
.super Lcom/facebook/fbservice/c/a;
.source "FetchThreadListResult.java"

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
            "Lcom/facebook/orca/server/FetchThreadListResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/orca/threads/FolderName;

.field private final b:Lcom/facebook/orca/threads/ThreadsCollection;

.field private final c:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
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

.field private final e:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/facebook/orca/threads/FolderCounts;

.field private final g:Lcom/facebook/orca/notify/NotificationSetting;

.field private final h:Z

.field private final i:J

.field private final j:Z

.field private final k:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Lcom/facebook/orca/threads/FolderName;",
            "Lcom/facebook/orca/server/FetchThreadListResult;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Lcom/facebook/fbservice/service/ServiceException;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 217
    new-instance v0, Lcom/facebook/orca/server/z;

    invoke-direct {v0}, Lcom/facebook/orca/server/z;-><init>()V

    sput-object v0, Lcom/facebook/orca/server/FetchThreadListResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 81
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/c/a;-><init>(Landroid/os/Parcel;)V

    .line 82
    const-class v0, Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->a:Lcom/facebook/orca/threads/FolderName;

    .line 83
    const-class v0, Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadsCollection;

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->b:Lcom/facebook/orca/threads/ThreadsCollection;

    .line 84
    const-class v0, Lcom/facebook/user/User;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->c:Lcom/google/common/a/es;

    .line 85
    const-class v0, Lcom/facebook/orca/threads/FolderCounts;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderCounts;

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->f:Lcom/facebook/orca/threads/FolderCounts;

    .line 86
    const-class v0, Lcom/facebook/orca/notify/NotificationSetting;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/notify/NotificationSetting;

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->g:Lcom/facebook/orca/notify/NotificationSetting;

    .line 87
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->d:Lcom/google/common/a/es;

    .line 88
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->e:Lcom/google/common/a/es;

    .line 89
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->h:Z

    .line 90
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/facebook/orca/server/FetchThreadListResult;->i:J

    .line 91
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1

    :goto_1
    iput-boolean v1, p0, Lcom/facebook/orca/server/FetchThreadListResult;->j:Z

    .line 92
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/ev;

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->k:Lcom/google/common/a/ev;

    .line 93
    const-class v0, Lcom/facebook/fbservice/service/ServiceException;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/ServiceException;

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->l:Lcom/facebook/fbservice/service/ServiceException;

    .line 94
    return-void

    :cond_0
    move v0, v2

    .line 89
    goto :goto_0

    :cond_1
    move v1, v2

    .line 91
    goto :goto_1
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/server/z;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/FetchThreadListResult;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Lcom/facebook/orca/server/aa;)V
    .locals 3

    .prologue
    .line 63
    invoke-virtual {p1}, Lcom/facebook/orca/server/aa;->a()Lcom/facebook/fbservice/c/b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/orca/server/aa;->j()J

    move-result-wide v1

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/fbservice/c/a;-><init>(Lcom/facebook/fbservice/c/b;J)V

    .line 64
    invoke-virtual {p1}, Lcom/facebook/orca/server/aa;->a()Lcom/facebook/fbservice/c/b;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    invoke-virtual {p1}, Lcom/facebook/orca/server/aa;->b()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->a:Lcom/facebook/orca/threads/FolderName;

    .line 66
    invoke-virtual {p1}, Lcom/facebook/orca/server/aa;->c()Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->b:Lcom/facebook/orca/threads/ThreadsCollection;

    .line 67
    invoke-virtual {p1}, Lcom/facebook/orca/server/aa;->d()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->c:Lcom/google/common/a/es;

    .line 68
    invoke-virtual {p1}, Lcom/facebook/orca/server/aa;->e()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->d:Lcom/google/common/a/es;

    .line 69
    invoke-virtual {p1}, Lcom/facebook/orca/server/aa;->f()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->e:Lcom/google/common/a/es;

    .line 70
    invoke-virtual {p1}, Lcom/facebook/orca/server/aa;->g()Lcom/facebook/orca/threads/FolderCounts;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->f:Lcom/facebook/orca/threads/FolderCounts;

    .line 71
    invoke-virtual {p1}, Lcom/facebook/orca/server/aa;->h()Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->g:Lcom/facebook/orca/notify/NotificationSetting;

    .line 72
    invoke-virtual {p1}, Lcom/facebook/orca/server/aa;->i()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->h:Z

    .line 73
    invoke-virtual {p1}, Lcom/facebook/orca/server/aa;->k()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->i:J

    .line 74
    invoke-virtual {p1}, Lcom/facebook/orca/server/aa;->l()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->j:Z

    .line 75
    invoke-virtual {p1}, Lcom/facebook/orca/server/aa;->m()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/orca/server/aa;->m()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/ev;->a(Ljava/util/Map;)Lcom/google/common/a/ev;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->k:Lcom/google/common/a/ev;

    .line 77
    invoke-virtual {p1}, Lcom/facebook/orca/server/aa;->n()Lcom/facebook/fbservice/service/ServiceException;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->l:Lcom/facebook/fbservice/service/ServiceException;

    .line 78
    return-void

    .line 75
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/server/FetchThreadListResult;
    .locals 2

    .prologue
    .line 59
    invoke-static {}, Lcom/facebook/orca/server/FetchThreadListResult;->newBuilder()Lcom/facebook/orca/server/aa;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/fbservice/c/b;)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/orca/server/aa;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/server/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/aa;->o()Lcom/facebook/orca/server/FetchThreadListResult;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder()Lcom/facebook/orca/server/aa;
    .locals 1

    .prologue
    .line 48
    new-instance v0, Lcom/facebook/orca/server/aa;

    invoke-direct {v0}, Lcom/facebook/orca/server/aa;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threads/FolderName;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->a:Lcom/facebook/orca/threads/FolderName;

    return-object v0
.end method

.method public b()Lcom/facebook/orca/threads/ThreadsCollection;
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->b:Lcom/facebook/orca/threads/ThreadsCollection;

    return-object v0
.end method

.method public c()Lcom/google/common/a/es;
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
    .line 121
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->c:Lcom/google/common/a/es;

    return-object v0
.end method

.method public d()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 131
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->d:Lcom/google/common/a/es;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 230
    const/4 v0, 0x0

    return v0
.end method

.method public g()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 141
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->e:Lcom/google/common/a/es;

    return-object v0
.end method

.method public h()Lcom/facebook/orca/threads/FolderCounts;
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->f:Lcom/facebook/orca/threads/FolderCounts;

    return-object v0
.end method

.method public i()Lcom/facebook/orca/notify/NotificationSetting;
    .locals 1

    .prologue
    .line 162
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->g:Lcom/facebook/orca/notify/NotificationSetting;

    return-object v0
.end method

.method public j()Z
    .locals 1

    .prologue
    .line 173
    iget-boolean v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->h:Z

    return v0
.end method

.method public k()J
    .locals 2

    .prologue
    .line 185
    iget-wide v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->i:J

    return-wide v0
.end method

.method public l()Z
    .locals 1

    .prologue
    .line 194
    iget-boolean v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->j:Z

    return v0
.end method

.method public m()Lcom/google/common/a/ev;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<",
            "Lcom/facebook/orca/threads/FolderName;",
            "Lcom/facebook/orca/server/FetchThreadListResult;",
            ">;"
        }
    .end annotation

    .prologue
    .line 204
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->k:Lcom/google/common/a/ev;

    return-object v0
.end method

.method public n()Lcom/facebook/fbservice/service/ServiceException;
    .locals 1

    .prologue
    .line 214
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->l:Lcom/facebook/fbservice/service/ServiceException;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 235
    invoke-super {p0, p1, p2}, Lcom/facebook/fbservice/c/a;->writeToParcel(Landroid/os/Parcel;I)V

    .line 236
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->a:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 237
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->b:Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 238
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->c:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 239
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->f:Lcom/facebook/orca/threads/FolderCounts;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 240
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->g:Lcom/facebook/orca/notify/NotificationSetting;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 241
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->d:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 242
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->e:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 243
    iget-boolean v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->h:Z

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 244
    iget-wide v3, p0, Lcom/facebook/orca/server/FetchThreadListResult;->i:J

    invoke-virtual {p1, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    .line 245
    iget-boolean v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->j:Z

    if-eqz v0, :cond_1

    :goto_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 246
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->k:Lcom/google/common/a/ev;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 247
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadListResult;->l:Lcom/facebook/fbservice/service/ServiceException;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 248
    return-void

    :cond_0
    move v0, v2

    .line 243
    goto :goto_0

    :cond_1
    move v1, v2

    .line 245
    goto :goto_1
.end method
