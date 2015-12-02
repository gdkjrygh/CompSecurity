.class public Lcom/facebook/orca/server/FetchThreadResult;
.super Lcom/facebook/fbservice/c/a;
.source "FetchThreadResult.java"

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
            "Lcom/facebook/orca/server/FetchThreadResult;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:Lcom/facebook/orca/server/FetchThreadResult;


# instance fields
.field private final b:Lcom/facebook/orca/threads/ThreadSummary;

.field private final c:Lcom/facebook/orca/threads/MessagesCollection;

.field private final d:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/facebook/user/User;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 23
    new-instance v0, Lcom/facebook/orca/server/FetchThreadResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v4

    const-wide/16 v6, -0x1

    move-object v3, v2

    move-object v5, v2

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/server/FetchThreadResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;Lcom/google/common/a/es;Lcom/facebook/user/User;J)V

    sput-object v0, Lcom/facebook/orca/server/FetchThreadResult;->a:Lcom/facebook/orca/server/FetchThreadResult;

    .line 83
    new-instance v0, Lcom/facebook/orca/server/ad;

    invoke-direct {v0}, Lcom/facebook/orca/server/ad;-><init>()V

    sput-object v0, Lcom/facebook/orca/server/FetchThreadResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 60
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/c/a;-><init>(Landroid/os/Parcel;)V

    .line 61
    const-class v0, Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadResult;->b:Lcom/facebook/orca/threads/ThreadSummary;

    .line 62
    const-class v0, Lcom/facebook/orca/threads/MessagesCollection;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/MessagesCollection;

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadResult;->c:Lcom/facebook/orca/threads/MessagesCollection;

    .line 63
    const-class v0, Lcom/facebook/user/User;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadResult;->d:Lcom/google/common/a/es;

    .line 64
    const-class v0, Lcom/facebook/user/User;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    iput-object v0, p0, Lcom/facebook/orca/server/FetchThreadResult;->e:Lcom/facebook/user/User;

    .line 65
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/server/ad;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/FetchThreadResult;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/server/FetchThreadResult;)V
    .locals 8

    .prologue
    .line 51
    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v2

    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->b()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v3

    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->c()Lcom/google/common/a/es;

    move-result-object v4

    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->d()Lcom/facebook/user/User;

    move-result-object v5

    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->f()J

    move-result-wide v6

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/server/FetchThreadResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;Lcom/google/common/a/es;Lcom/facebook/user/User;J)V

    .line 57
    return-void
.end method

.method public constructor <init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;Lcom/google/common/a/es;Lcom/facebook/user/User;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/fbservice/c/b;",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            "Lcom/facebook/orca/threads/MessagesCollection;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;",
            "Lcom/facebook/user/User;",
            "J)V"
        }
    .end annotation

    .prologue
    .line 42
    invoke-direct {p0, p1, p6, p7}, Lcom/facebook/fbservice/c/a;-><init>(Lcom/facebook/fbservice/c/b;J)V

    .line 43
    iput-object p2, p0, Lcom/facebook/orca/server/FetchThreadResult;->b:Lcom/facebook/orca/threads/ThreadSummary;

    .line 44
    iput-object p3, p0, Lcom/facebook/orca/server/FetchThreadResult;->c:Lcom/facebook/orca/threads/MessagesCollection;

    .line 45
    iput-object p4, p0, Lcom/facebook/orca/server/FetchThreadResult;->d:Lcom/google/common/a/es;

    .line 46
    iput-object p5, p0, Lcom/facebook/orca/server/FetchThreadResult;->e:Lcom/facebook/user/User;

    .line 47
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threads/ThreadSummary;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadResult;->b:Lcom/facebook/orca/threads/ThreadSummary;

    return-object v0
.end method

.method public b()Lcom/facebook/orca/threads/MessagesCollection;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadResult;->c:Lcom/facebook/orca/threads/MessagesCollection;

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
    .line 76
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadResult;->d:Lcom/google/common/a/es;

    return-object v0
.end method

.method public d()Lcom/facebook/user/User;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadResult;->e:Lcom/facebook/user/User;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 96
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 101
    invoke-super {p0, p1, p2}, Lcom/facebook/fbservice/c/a;->writeToParcel(Landroid/os/Parcel;I)V

    .line 102
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadResult;->b:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 103
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadResult;->c:Lcom/facebook/orca/threads/MessagesCollection;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 104
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadResult;->d:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 105
    iget-object v0, p0, Lcom/facebook/orca/server/FetchThreadResult;->e:Lcom/facebook/user/User;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 106
    return-void
.end method
