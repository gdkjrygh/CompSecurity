.class public Lcom/facebook/orca/server/FetchMultipleThreadsParams;
.super Ljava/lang/Object;
.source "FetchMultipleThreadsParams.java"

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
            "Lcom/facebook/orca/server/FetchMultipleThreadsParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/orca/threads/FolderName;

.field private final b:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/server/FetchThreadParams;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 101
    new-instance v0, Lcom/facebook/orca/server/s;

    invoke-direct {v0}, Lcom/facebook/orca/server/s;-><init>()V

    sput-object v0, Lcom/facebook/orca/server/FetchMultipleThreadsParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    const-class v0, Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    iput-object v0, p0, Lcom/facebook/orca/server/FetchMultipleThreadsParams;->a:Lcom/facebook/orca/threads/FolderName;

    .line 89
    const-class v0, Lcom/facebook/orca/server/FetchThreadParams;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchMultipleThreadsParams;->b:Lcom/google/common/a/es;

    .line 91
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/server/s;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/FetchMultipleThreadsParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/threads/FolderName;Lcom/google/common/a/es;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/threads/FolderName;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/server/FetchThreadParams;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    sget-object v0, Lcom/facebook/orca/threads/FolderName;->b:Lcom/facebook/orca/threads/FolderName;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/facebook/orca/threads/FolderName;->d:Lcom/facebook/orca/threads/FolderName;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/facebook/orca/threads/FolderName;->e:Lcom/facebook/orca/threads/FolderName;

    if-ne p1, v0, :cond_1

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 33
    if-eqz p2, :cond_2

    :goto_1
    invoke-static {v2}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 34
    sget-object v0, Lcom/facebook/orca/threads/FolderName;->b:Lcom/facebook/orca/threads/FolderName;

    if-ne p1, v0, :cond_3

    .line 35
    invoke-direct {p0, p2}, Lcom/facebook/orca/server/FetchMultipleThreadsParams;->a(Lcom/google/common/a/es;)V

    .line 41
    :goto_2
    iput-object p1, p0, Lcom/facebook/orca/server/FetchMultipleThreadsParams;->a:Lcom/facebook/orca/threads/FolderName;

    .line 42
    iput-object p2, p0, Lcom/facebook/orca/server/FetchMultipleThreadsParams;->b:Lcom/google/common/a/es;

    .line 43
    return-void

    :cond_1
    move v0, v1

    .line 29
    goto :goto_0

    :cond_2
    move v2, v1

    .line 33
    goto :goto_1

    .line 36
    :cond_3
    sget-object v0, Lcom/facebook/orca/threads/FolderName;->d:Lcom/facebook/orca/threads/FolderName;

    if-ne p1, v0, :cond_4

    .line 37
    invoke-direct {p0, p2}, Lcom/facebook/orca/server/FetchMultipleThreadsParams;->b(Lcom/google/common/a/es;)V

    goto :goto_2

    .line 39
    :cond_4
    invoke-direct {p0, p2}, Lcom/facebook/orca/server/FetchMultipleThreadsParams;->c(Lcom/google/common/a/es;)V

    goto :goto_2
.end method

.method private a(Lcom/google/common/a/es;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/server/FetchThreadParams;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 47
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadParams;

    .line 48
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    .line 49
    invoke-virtual {v0}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 50
    invoke-virtual {v0}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    .line 51
    sget-object v4, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-ne v0, v4, :cond_0

    move v0, v1

    :goto_1
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    goto :goto_0

    :cond_0
    move v0, v2

    goto :goto_1

    .line 53
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v0

    .line 54
    invoke-static {v0}, Lcom/facebook/orca/threads/m;->g(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    :goto_2
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_2

    .line 57
    :cond_3
    return-void
.end method

.method private b(Lcom/google/common/a/es;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/server/FetchThreadParams;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 61
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadParams;

    .line 62
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    .line 63
    invoke-virtual {v0}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 64
    invoke-virtual {v0}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    .line 65
    sget-object v2, Lcom/facebook/user/n;->PHONE_NUMBER:Lcom/facebook/user/n;

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    .line 67
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v0

    .line 68
    invoke-static {v0}, Lcom/facebook/orca/threads/m;->g(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    goto :goto_0

    .line 71
    :cond_2
    return-void
.end method

.method private c(Lcom/google/common/a/es;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/server/FetchThreadParams;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 75
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadParams;

    .line 76
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    .line 77
    invoke-virtual {v0}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 78
    invoke-virtual {v0}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    .line 79
    sget-object v2, Lcom/facebook/user/n;->PHONE_NUMBER:Lcom/facebook/user/n;

    if-eq v0, v2, :cond_1

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-ne v0, v2, :cond_2

    :cond_1
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    .line 85
    :cond_3
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threads/FolderName;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lcom/facebook/orca/server/FetchMultipleThreadsParams;->a:Lcom/facebook/orca/threads/FolderName;

    return-object v0
.end method

.method public b()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/server/FetchThreadParams;",
            ">;"
        }
    .end annotation

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/orca/server/FetchMultipleThreadsParams;->b:Lcom/google/common/a/es;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 114
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lcom/facebook/orca/server/FetchMultipleThreadsParams;->a:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 120
    iget-object v0, p0, Lcom/facebook/orca/server/FetchMultipleThreadsParams;->b:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 121
    return-void
.end method
