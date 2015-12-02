.class public Lcom/facebook/orca/threads/ThreadsCollection;
.super Ljava/lang/Object;
.source "ThreadsCollection.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/orca/threads/ThreadsCollection;",
            ">;"
        }
    .end annotation
.end field

.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Lcom/facebook/debug/log/l;

.field private static final c:Lcom/facebook/orca/threads/ThreadsCollection;


# instance fields
.field private final d:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 19
    const-class v0, Lcom/facebook/orca/threads/ThreadsCollection;

    sput-object v0, Lcom/facebook/orca/threads/ThreadsCollection;->a:Ljava/lang/Class;

    .line 21
    new-instance v0, Lcom/facebook/debug/log/l;

    invoke-direct {v0}, Lcom/facebook/debug/log/l;-><init>()V

    sput-object v0, Lcom/facebook/orca/threads/ThreadsCollection;->b:Lcom/facebook/debug/log/l;

    .line 23
    new-instance v0, Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/threads/ThreadsCollection;-><init>(Lcom/google/common/a/es;Z)V

    sput-object v0, Lcom/facebook/orca/threads/ThreadsCollection;->c:Lcom/facebook/orca/threads/ThreadsCollection;

    .line 144
    new-instance v0, Lcom/facebook/orca/threads/y;

    invoke-direct {v0}, Lcom/facebook/orca/threads/y;-><init>()V

    sput-object v0, Lcom/facebook/orca/threads/ThreadsCollection;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const-class v0, Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadsCollection;->d:Lcom/google/common/a/es;

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/orca/threads/ThreadsCollection;->e:Z

    .line 39
    return-void

    .line 38
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/threads/y;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0, p1}, Lcom/facebook/orca/threads/ThreadsCollection;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/common/a/es;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/facebook/orca/threads/ThreadsCollection;->d:Lcom/google/common/a/es;

    .line 32
    iput-boolean p2, p0, Lcom/facebook/orca/threads/ThreadsCollection;->e:Z

    .line 33
    invoke-static {p1}, Lcom/facebook/orca/threads/ThreadsCollection;->a(Lcom/google/common/a/es;)V

    .line 34
    return-void
.end method

.method public static a()Lcom/facebook/orca/threads/ThreadsCollection;
    .locals 1

    .prologue
    .line 42
    sget-object v0, Lcom/facebook/orca/threads/ThreadsCollection;->c:Lcom/facebook/orca/threads/ThreadsCollection;

    return-object v0
.end method

.method public static a(Lcom/facebook/orca/threads/ThreadsCollection;Lcom/facebook/orca/threads/ThreadsCollection;)Lcom/facebook/orca/threads/ThreadsCollection;
    .locals 5

    .prologue
    .line 114
    invoke-virtual {p0}, Lcom/facebook/orca/threads/ThreadsCollection;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadsCollection;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 139
    :cond_0
    :goto_0
    return-object p0

    .line 116
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/orca/threads/ThreadsCollection;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    move-object p0, p1

    .line 117
    goto :goto_0

    .line 118
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadsCollection;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 123
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v1

    .line 126
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 128
    invoke-virtual {p0}, Lcom/facebook/orca/threads/ThreadsCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 129
    invoke-virtual {v2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 130
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 133
    :cond_3
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadsCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 134
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    .line 135
    invoke-virtual {v2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_2

    .line 139
    :cond_5
    new-instance p0, Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadsCollection;->c()Z

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/threads/ThreadsCollection;-><init>(Lcom/google/common/a/es;Z)V

    goto :goto_0
.end method

.method private static a(Lcom/google/common/a/es;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 46
    const-wide v0, 0x7fffffffffffffffL

    .line 47
    invoke-virtual {p0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-wide v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 48
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->l()J

    move-result-wide v4

    cmp-long v1, v4, v1

    if-lez v1, :cond_1

    .line 49
    sget-object v0, Lcom/facebook/orca/threads/ThreadsCollection;->b:Lcom/facebook/debug/log/l;

    sget-object v1, Lcom/facebook/orca/threads/ThreadsCollection;->a:Ljava/lang/Class;

    const-string v2, "Threads were not in order"

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;)V

    .line 54
    :cond_0
    return-void

    .line 52
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->l()J

    move-result-wide v0

    move-wide v1, v0

    goto :goto_0
.end method


# virtual methods
.method public a(I)Lcom/facebook/orca/threads/ThreadSummary;
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadsCollection;->d:Lcom/google/common/a/es;

    invoke-virtual {v0, p1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    return-object v0
.end method

.method public b()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation

    .prologue
    .line 62
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadsCollection;->d:Lcom/google/common/a/es;

    return-object v0
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 71
    iget-boolean v0, p0, Lcom/facebook/orca/threads/ThreadsCollection;->e:Z

    return v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadsCollection;->d:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 157
    const/4 v0, 0x0

    return v0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadsCollection;->d:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 162
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadsCollection;->d:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 163
    iget-boolean v0, p0, Lcom/facebook/orca/threads/ThreadsCollection;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 164
    return-void

    .line 163
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
