.class public Lcom/facebook/orca/server/FetchMoreThreadsResult;
.super Lcom/facebook/fbservice/c/a;
.source "FetchMoreThreadsResult.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/orca/server/FetchMoreThreadsResult;",
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

.field private final d:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Lcom/facebook/orca/threads/FolderName;",
            "Lcom/facebook/orca/server/FetchMoreThreadsResult;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 81
    new-instance v0, Lcom/facebook/orca/server/r;

    invoke-direct {v0}, Lcom/facebook/orca/server/r;-><init>()V

    sput-object v0, Lcom/facebook/orca/server/FetchMoreThreadsResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 58
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/c/a;-><init>(Landroid/os/Parcel;)V

    .line 59
    const-class v0, Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    iput-object v0, p0, Lcom/facebook/orca/server/FetchMoreThreadsResult;->a:Lcom/facebook/orca/threads/FolderName;

    .line 60
    const-class v0, Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadsCollection;

    iput-object v0, p0, Lcom/facebook/orca/server/FetchMoreThreadsResult;->b:Lcom/facebook/orca/threads/ThreadsCollection;

    .line 61
    const-class v0, Lcom/facebook/user/User;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchMoreThreadsResult;->c:Lcom/google/common/a/es;

    .line 62
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/ev;

    iput-object v0, p0, Lcom/facebook/orca/server/FetchMoreThreadsResult;->d:Lcom/google/common/a/ev;

    .line 63
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/server/r;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/FetchMoreThreadsResult;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/ThreadsCollection;Lcom/google/common/a/es;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/fbservice/c/b;",
            "Lcom/facebook/orca/threads/FolderName;",
            "Lcom/facebook/orca/threads/ThreadsCollection;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;J)V"
        }
    .end annotation

    .prologue
    .line 36
    invoke-direct {p0, p1, p5, p6}, Lcom/facebook/fbservice/c/a;-><init>(Lcom/facebook/fbservice/c/b;J)V

    .line 37
    iput-object p2, p0, Lcom/facebook/orca/server/FetchMoreThreadsResult;->a:Lcom/facebook/orca/threads/FolderName;

    .line 38
    iput-object p3, p0, Lcom/facebook/orca/server/FetchMoreThreadsResult;->b:Lcom/facebook/orca/threads/ThreadsCollection;

    .line 39
    iput-object p4, p0, Lcom/facebook/orca/server/FetchMoreThreadsResult;->c:Lcom/google/common/a/es;

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchMoreThreadsResult;->d:Lcom/google/common/a/ev;

    .line 41
    return-void
.end method

.method public constructor <init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/ThreadsCollection;Lcom/google/common/a/es;JLcom/google/common/a/ev;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/fbservice/c/b;",
            "Lcom/facebook/orca/threads/FolderName;",
            "Lcom/facebook/orca/threads/ThreadsCollection;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;J",
            "Lcom/google/common/a/ev",
            "<",
            "Lcom/facebook/orca/threads/FolderName;",
            "Lcom/facebook/orca/server/FetchMoreThreadsResult;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 50
    invoke-direct {p0, p1, p5, p6}, Lcom/facebook/fbservice/c/a;-><init>(Lcom/facebook/fbservice/c/b;J)V

    .line 51
    iput-object p2, p0, Lcom/facebook/orca/server/FetchMoreThreadsResult;->a:Lcom/facebook/orca/threads/FolderName;

    .line 52
    iput-object p3, p0, Lcom/facebook/orca/server/FetchMoreThreadsResult;->b:Lcom/facebook/orca/threads/ThreadsCollection;

    .line 53
    iput-object p4, p0, Lcom/facebook/orca/server/FetchMoreThreadsResult;->c:Lcom/google/common/a/es;

    .line 54
    iput-object p7, p0, Lcom/facebook/orca/server/FetchMoreThreadsResult;->d:Lcom/google/common/a/ev;

    .line 55
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threads/FolderName;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/orca/server/FetchMoreThreadsResult;->a:Lcom/facebook/orca/threads/FolderName;

    return-object v0
.end method

.method public b()Lcom/facebook/orca/threads/ThreadsCollection;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/facebook/orca/server/FetchMoreThreadsResult;->b:Lcom/facebook/orca/threads/ThreadsCollection;

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
    .line 74
    iget-object v0, p0, Lcom/facebook/orca/server/FetchMoreThreadsResult;->c:Lcom/google/common/a/es;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 94
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 99
    invoke-super {p0, p1, p2}, Lcom/facebook/fbservice/c/a;->writeToParcel(Landroid/os/Parcel;I)V

    .line 100
    iget-object v0, p0, Lcom/facebook/orca/server/FetchMoreThreadsResult;->a:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 101
    iget-object v0, p0, Lcom/facebook/orca/server/FetchMoreThreadsResult;->b:Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 102
    iget-object v0, p0, Lcom/facebook/orca/server/FetchMoreThreadsResult;->c:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 103
    iget-object v0, p0, Lcom/facebook/orca/server/FetchMoreThreadsResult;->d:Lcom/google/common/a/ev;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 104
    return-void
.end method
