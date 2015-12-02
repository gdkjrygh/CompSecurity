.class public Lcom/facebook/orca/threads/MessagesCollection;
.super Ljava/lang/Object;
.source "MessagesCollection.java"

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
            "Lcom/facebook/orca/threads/MessagesCollection;",
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


# instance fields
.field private final c:Ljava/lang/String;

.field private final d:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    const-class v0, Lcom/facebook/orca/threads/MessagesCollection;

    sput-object v0, Lcom/facebook/orca/threads/MessagesCollection;->a:Ljava/lang/Class;

    .line 23
    new-instance v0, Lcom/facebook/debug/log/l;

    invoke-direct {v0}, Lcom/facebook/debug/log/l;-><init>()V

    sput-object v0, Lcom/facebook/orca/threads/MessagesCollection;->b:Lcom/facebook/debug/log/l;

    .line 149
    new-instance v0, Lcom/facebook/orca/threads/h;

    invoke-direct {v0}, Lcom/facebook/orca/threads/h;-><init>()V

    sput-object v0, Lcom/facebook/orca/threads/MessagesCollection;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/MessagesCollection;->c:Ljava/lang/String;

    .line 40
    sget-object v0, Lcom/facebook/messages/model/threads/Message;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/MessagesCollection;->d:Lcom/google/common/a/es;

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/orca/threads/MessagesCollection;->e:Z

    .line 42
    iget-object v0, p0, Lcom/facebook/orca/threads/MessagesCollection;->d:Lcom/google/common/a/es;

    invoke-static {v0}, Lcom/facebook/orca/threads/MessagesCollection;->a(Lcom/google/common/a/es;)V

    .line 43
    return-void

    .line 41
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/threads/h;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lcom/facebook/orca/threads/MessagesCollection;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/google/common/a/es;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/facebook/orca/threads/MessagesCollection;->c:Ljava/lang/String;

    .line 33
    iput-object p2, p0, Lcom/facebook/orca/threads/MessagesCollection;->d:Lcom/google/common/a/es;

    .line 34
    iput-boolean p3, p0, Lcom/facebook/orca/threads/MessagesCollection;->e:Z

    .line 35
    invoke-static {p2}, Lcom/facebook/orca/threads/MessagesCollection;->a(Lcom/google/common/a/es;)V

    .line 36
    return-void
.end method

.method public static a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/threads/MessagesCollection;
    .locals 4

    .prologue
    .line 46
    new-instance v0, Lcom/facebook/orca/threads/MessagesCollection;

    invoke-virtual {p0}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/orca/threads/MessagesCollection;-><init>(Ljava/lang/String;Lcom/google/common/a/es;Z)V

    return-object v0
.end method

.method private static a(Lcom/google/common/a/es;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;)V"
        }
    .end annotation

    .prologue
    const-wide v0, 0x7fffffffffffffffL

    .line 53
    .line 55
    invoke-virtual {p0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move-wide v3, v0

    move-wide v8, v0

    move-wide v1, v8

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 56
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->y()Z

    move-result v6

    if-nez v6, :cond_0

    .line 62
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v6

    cmp-long v3, v6, v3

    if-lez v3, :cond_2

    invoke-static {v0}, Lcom/facebook/orca/threads/MessagesCollection;->b(Lcom/facebook/messages/model/threads/Message;)J

    move-result-wide v3

    cmp-long v1, v3, v1

    if-lez v1, :cond_2

    .line 64
    sget-object v0, Lcom/facebook/orca/threads/MessagesCollection;->b:Lcom/facebook/debug/log/l;

    sget-object v1, Lcom/facebook/orca/threads/MessagesCollection;->a:Ljava/lang/Class;

    const-string v2, "Thread messages were not in order"

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;)V

    .line 70
    :cond_1
    return-void

    .line 67
    :cond_2
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v2

    .line 68
    invoke-static {v0}, Lcom/facebook/orca/threads/MessagesCollection;->b(Lcom/facebook/messages/model/threads/Message;)J

    move-result-wide v0

    move-wide v8, v0

    move-wide v10, v2

    move-wide v3, v10

    move-wide v1, v8

    goto :goto_0
.end method

.method private static b(Lcom/facebook/messages/model/threads/Message;)J
    .locals 2

    .prologue
    .line 73
    invoke-virtual {p0}, Lcom/facebook/messages/model/threads/Message;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v0

    goto :goto_0
.end method


# virtual methods
.method public a(I)Lcom/facebook/messages/model/threads/Message;
    .locals 1

    .prologue
    .line 146
    iget-object v0, p0, Lcom/facebook/orca/threads/MessagesCollection;->d:Lcom/google/common/a/es;

    invoke-virtual {v0, p1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    return-object v0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/facebook/orca/threads/MessagesCollection;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;"
        }
    .end annotation

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/orca/threads/MessagesCollection;->d:Lcom/google/common/a/es;

    return-object v0
.end method

.method public c()Lcom/facebook/messages/model/threads/Message;
    .locals 2

    .prologue
    .line 100
    iget-object v0, p0, Lcom/facebook/orca/threads/MessagesCollection;->d:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threads/MessagesCollection;->d:Lcom/google/common/a/es;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    goto :goto_0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 118
    iget-boolean v0, p0, Lcom/facebook/orca/threads/MessagesCollection;->e:Z

    return v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 162
    const/4 v0, 0x0

    return v0
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lcom/facebook/orca/threads/MessagesCollection;->d:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public f()I
    .locals 1

    .prologue
    .line 136
    iget-object v0, p0, Lcom/facebook/orca/threads/MessagesCollection;->d:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 167
    iget-object v0, p0, Lcom/facebook/orca/threads/MessagesCollection;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 168
    iget-object v0, p0, Lcom/facebook/orca/threads/MessagesCollection;->d:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 169
    iget-boolean v0, p0, Lcom/facebook/orca/threads/MessagesCollection;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 170
    return-void

    .line 169
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
