.class public Lcom/facebook/orca/server/ThreadCriteria;
.super Ljava/lang/Object;
.source "ThreadCriteria.java"

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
            "Lcom/facebook/orca/server/ThreadCriteria;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/facebook/user/UserKey;

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


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 86
    new-instance v0, Lcom/facebook/orca/server/az;

    invoke-direct {v0}, Lcom/facebook/orca/server/az;-><init>()V

    sput-object v0, Lcom/facebook/orca/server/ThreadCriteria;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/ThreadCriteria;->a:Ljava/lang/String;

    .line 69
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/UserKey;->a(Ljava/lang/String;)Lcom/facebook/user/UserKey;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/server/ThreadCriteria;->b:Lcom/facebook/user/UserKey;

    .line 70
    const-class v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    .line 71
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/facebook/orca/server/ThreadCriteria;->c:Lcom/google/common/a/es;

    .line 72
    return-void

    .line 71
    :cond_0
    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/server/az;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/facebook/orca/server/ThreadCriteria;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/facebook/user/UserKey;Lcom/google/common/a/es;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/facebook/user/UserKey;",
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    if-eqz p1, :cond_3

    move v2, v0

    .line 29
    :goto_0
    if-eqz p2, :cond_0

    .line 30
    add-int/lit8 v2, v2, 0x1

    .line 32
    :cond_0
    if-eqz p3, :cond_1

    .line 33
    add-int/lit8 v2, v2, 0x1

    .line 35
    :cond_1
    if-ne v2, v0, :cond_2

    :goto_1
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 36
    iput-object p1, p0, Lcom/facebook/orca/server/ThreadCriteria;->a:Ljava/lang/String;

    .line 37
    iput-object p2, p0, Lcom/facebook/orca/server/ThreadCriteria;->b:Lcom/facebook/user/UserKey;

    .line 38
    iput-object p3, p0, Lcom/facebook/orca/server/ThreadCriteria;->c:Lcom/google/common/a/es;

    .line 39
    return-void

    :cond_2
    move v0, v1

    .line 35
    goto :goto_1

    :cond_3
    move v2, v1

    goto :goto_0
.end method

.method public static a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/orca/server/ThreadCriteria;
    .locals 2

    .prologue
    .line 54
    invoke-virtual {p0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    invoke-virtual {p0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/server/ThreadCriteria;->a(Ljava/lang/String;)Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    .line 61
    :goto_0
    return-object v0

    .line 56
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 57
    invoke-virtual {p0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->f()Lcom/facebook/user/UserIdentifier;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/UserKey;->a(Lcom/facebook/user/UserIdentifier;)Lcom/facebook/user/UserKey;

    move-result-object v0

    .line 58
    if-nez v0, :cond_1

    .line 59
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown type of identifier"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 61
    :cond_1
    invoke-static {v0}, Lcom/facebook/orca/server/ThreadCriteria;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    goto :goto_0

    .line 63
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Empty thread view spec"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/server/ThreadCriteria;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 46
    new-instance v0, Lcom/facebook/orca/server/ThreadCriteria;

    invoke-direct {v0, v1, p0, v1}, Lcom/facebook/orca/server/ThreadCriteria;-><init>(Ljava/lang/String;Lcom/facebook/user/UserKey;Lcom/google/common/a/es;)V

    return-object v0
.end method

.method public static a(Lcom/google/common/a/es;)Lcom/facebook/orca/server/ThreadCriteria;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/orca/server/ThreadCriteria;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 50
    new-instance v0, Lcom/facebook/orca/server/ThreadCriteria;

    invoke-direct {v0, v1, v1, p0}, Lcom/facebook/orca/server/ThreadCriteria;-><init>(Ljava/lang/String;Lcom/facebook/user/UserKey;Lcom/google/common/a/es;)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Lcom/facebook/orca/server/ThreadCriteria;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 42
    new-instance v0, Lcom/facebook/orca/server/ThreadCriteria;

    invoke-direct {v0, p0, v1, v1}, Lcom/facebook/orca/server/ThreadCriteria;-><init>(Ljava/lang/String;Lcom/facebook/user/UserKey;Lcom/google/common/a/es;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/facebook/orca/server/ThreadCriteria;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lcom/facebook/user/UserKey;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/facebook/orca/server/ThreadCriteria;->b:Lcom/facebook/user/UserKey;

    return-object v0
.end method

.method public c()Lcom/google/common/a/es;
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
    .line 83
    iget-object v0, p0, Lcom/facebook/orca/server/ThreadCriteria;->c:Lcom/google/common/a/es;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 99
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 111
    if-ne p0, p1, :cond_1

    .line 120
    :cond_0
    :goto_0
    return v0

    .line 112
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    .line 114
    :cond_3
    check-cast p1, Lcom/facebook/orca/server/ThreadCriteria;

    .line 116
    iget-object v2, p0, Lcom/facebook/orca/server/ThreadCriteria;->a:Ljava/lang/String;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/facebook/orca/server/ThreadCriteria;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/facebook/orca/server/ThreadCriteria;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_4
    move v0, v1

    goto :goto_0

    :cond_5
    iget-object v2, p1, Lcom/facebook/orca/server/ThreadCriteria;->a:Ljava/lang/String;

    if-nez v2, :cond_4

    .line 117
    :cond_6
    iget-object v2, p0, Lcom/facebook/orca/server/ThreadCriteria;->b:Lcom/facebook/user/UserKey;

    if-eqz v2, :cond_8

    iget-object v2, p0, Lcom/facebook/orca/server/ThreadCriteria;->b:Lcom/facebook/user/UserKey;

    iget-object v3, p1, Lcom/facebook/orca/server/ThreadCriteria;->b:Lcom/facebook/user/UserKey;

    invoke-virtual {v2, v3}, Lcom/facebook/user/UserKey;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :cond_7
    move v0, v1

    goto :goto_0

    :cond_8
    iget-object v2, p1, Lcom/facebook/orca/server/ThreadCriteria;->b:Lcom/facebook/user/UserKey;

    if-nez v2, :cond_7

    .line 118
    :cond_9
    iget-object v2, p0, Lcom/facebook/orca/server/ThreadCriteria;->c:Lcom/google/common/a/es;

    if-eqz v2, :cond_a

    iget-object v2, p0, Lcom/facebook/orca/server/ThreadCriteria;->c:Lcom/google/common/a/es;

    iget-object v3, p1, Lcom/facebook/orca/server/ThreadCriteria;->c:Lcom/google/common/a/es;

    invoke-virtual {v2, v3}, Lcom/google/common/a/es;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :goto_1
    move v0, v1

    goto :goto_0

    :cond_a
    iget-object v2, p1, Lcom/facebook/orca/server/ThreadCriteria;->c:Lcom/google/common/a/es;

    if-eqz v2, :cond_0

    goto :goto_1
.end method

.method public hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 125
    iget-object v0, p0, Lcom/facebook/orca/server/ThreadCriteria;->a:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/server/ThreadCriteria;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    .line 126
    :goto_0
    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/facebook/orca/server/ThreadCriteria;->b:Lcom/facebook/user/UserKey;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/server/ThreadCriteria;->b:Lcom/facebook/user/UserKey;

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v0, v2

    .line 127
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/facebook/orca/server/ThreadCriteria;->c:Lcom/google/common/a/es;

    if-eqz v2, :cond_0

    iget-object v1, p0, Lcom/facebook/orca/server/ThreadCriteria;->c:Lcom/google/common/a/es;

    invoke-virtual {v1}, Lcom/google/common/a/es;->hashCode()I

    move-result v1

    :cond_0
    add-int/2addr v0, v1

    .line 128
    return v0

    :cond_1
    move v0, v1

    .line 125
    goto :goto_0

    :cond_2
    move v0, v1

    .line 126
    goto :goto_1
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/orca/server/ThreadCriteria;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 105
    iget-object v0, p0, Lcom/facebook/orca/server/ThreadCriteria;->b:Lcom/facebook/user/UserKey;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/server/ThreadCriteria;->b:Lcom/facebook/user/UserKey;

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->c()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 106
    iget-object v0, p0, Lcom/facebook/orca/server/ThreadCriteria;->c:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 107
    return-void

    .line 105
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
