.class public Lcom/facebook/orca/threads/ThreadSummary;
.super Ljava/lang/Object;
.source "ThreadSummary.java"

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
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:J

.field private final d:J

.field private final e:J

.field private final f:Ljava/lang/String;

.field private final g:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Z

.field private final k:Lcom/facebook/user/UserKey;

.field private final l:J

.field private final m:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Ljava/lang/String;

.field private final o:Ljava/lang/String;

.field private final p:Lcom/facebook/messages/model/threads/ParticipantInfo;

.field private final q:Ljava/lang/String;

.field private final r:Landroid/net/Uri;

.field private final s:Z

.field private final t:Z

.field private final u:Z

.field private final v:Z

.field private final w:Lcom/facebook/orca/threads/FolderName;

.field private final x:Lcom/facebook/orca/compose/MessageDraft;

.field private final y:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation
.end field

.field private final z:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Lcom/facebook/user/UserKey;",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 303
    new-instance v0, Lcom/facebook/orca/threads/t;

    invoke-direct {v0}, Lcom/facebook/orca/threads/t;-><init>()V

    sput-object v0, Lcom/facebook/orca/threads/ThreadSummary;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->a:Ljava/lang/String;

    .line 93
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->b:Ljava/lang/String;

    .line 94
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/facebook/orca/threads/ThreadSummary;->c:J

    .line 95
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/facebook/orca/threads/ThreadSummary;->d:J

    .line 96
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/facebook/orca/threads/ThreadSummary;->e:J

    .line 97
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->f:Ljava/lang/String;

    .line 98
    sget-object v0, Lcom/facebook/orca/threads/ThreadParticipant;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->g:Lcom/google/common/a/es;

    .line 99
    sget-object v0, Lcom/facebook/orca/threads/ThreadParticipant;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->h:Lcom/google/common/a/es;

    .line 100
    sget-object v0, Lcom/facebook/messages/model/threads/ParticipantInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->i:Lcom/google/common/a/es;

    .line 101
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->j:Z

    .line 102
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/UserKey;->a(Ljava/lang/String;)Lcom/facebook/user/UserKey;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->k:Lcom/facebook/user/UserKey;

    .line 103
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/facebook/orca/threads/ThreadSummary;->l:J

    .line 104
    sget-object v0, Lcom/facebook/messages/model/threads/ParticipantInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->m:Lcom/google/common/a/es;

    .line 105
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->n:Ljava/lang/String;

    .line 106
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->o:Ljava/lang/String;

    .line 107
    const-class v0, Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/ParticipantInfo;

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->p:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 108
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->q:Ljava/lang/String;

    .line 109
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->r:Landroid/net/Uri;

    .line 110
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->s:Z

    .line 111
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    :goto_2
    iput-boolean v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->t:Z

    .line 112
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_3

    move v0, v1

    :goto_3
    iput-boolean v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->u:Z

    .line 113
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_4

    :goto_4
    iput-boolean v1, p0, Lcom/facebook/orca/threads/ThreadSummary;->v:Z

    .line 114
    const-class v0, Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->w:Lcom/facebook/orca/threads/FolderName;

    .line 115
    const-class v0, Lcom/facebook/orca/compose/MessageDraft;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/compose/MessageDraft;

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->x:Lcom/facebook/orca/compose/MessageDraft;

    .line 116
    sget-object v0, Lcom/facebook/orca/threads/ThreadSummary;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->y:Lcom/google/common/a/es;

    .line 118
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->g:Lcom/google/common/a/es;

    iget-object v1, p0, Lcom/facebook/orca/threads/ThreadSummary;->h:Lcom/google/common/a/es;

    invoke-static {v0, v1}, Lcom/facebook/orca/threads/ThreadSummary;->a(Lcom/google/common/a/es;Lcom/google/common/a/es;)Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->z:Lcom/google/common/a/ev;

    .line 119
    return-void

    :cond_0
    move v0, v2

    .line 101
    goto/16 :goto_0

    :cond_1
    move v0, v2

    .line 110
    goto :goto_1

    :cond_2
    move v0, v2

    .line 111
    goto :goto_2

    :cond_3
    move v0, v2

    .line 112
    goto :goto_3

    :cond_4
    move v1, v2

    .line 113
    goto :goto_4
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/threads/t;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1}, Lcom/facebook/orca/threads/ThreadSummary;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Lcom/facebook/orca/threads/v;)V
    .locals 2

    .prologue
    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->w()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->a:Ljava/lang/String;

    .line 64
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->b:Ljava/lang/String;

    .line 65
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->f()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->c:J

    .line 66
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->d:J

    .line 67
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->d()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->e:J

    .line 68
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->f:Ljava/lang/String;

    .line 69
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->i()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->g:Lcom/google/common/a/es;

    .line 70
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->j()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->h:Lcom/google/common/a/es;

    .line 71
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->k()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->i:Lcom/google/common/a/es;

    .line 72
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->g()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->j:Z

    .line 73
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->h()Lcom/facebook/user/UserKey;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->k:Lcom/facebook/user/UserKey;

    .line 74
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->l()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->l:J

    .line 75
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->p()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->m:Lcom/google/common/a/es;

    .line 76
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->m()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->n:Ljava/lang/String;

    .line 77
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->o()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->o:Ljava/lang/String;

    .line 78
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->n()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->p:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 79
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->q()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->q:Ljava/lang/String;

    .line 80
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->r()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->r:Landroid/net/Uri;

    .line 81
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->s()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->s:Z

    .line 82
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->t()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->t:Z

    .line 83
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->u()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->u:Z

    .line 84
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->v()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->v:Z

    .line 85
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->w()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->w:Lcom/facebook/orca/threads/FolderName;

    .line 86
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->x()Lcom/facebook/orca/compose/MessageDraft;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->x:Lcom/facebook/orca/compose/MessageDraft;

    .line 87
    invoke-virtual {p1}, Lcom/facebook/orca/threads/v;->y()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->y:Lcom/google/common/a/es;

    .line 88
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->g:Lcom/google/common/a/es;

    iget-object v1, p0, Lcom/facebook/orca/threads/ThreadSummary;->h:Lcom/google/common/a/es;

    invoke-static {v0, v1}, Lcom/facebook/orca/threads/ThreadSummary;->a(Lcom/google/common/a/es;Lcom/google/common/a/es;)Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->z:Lcom/google/common/a/ev;

    .line 89
    return-void
.end method

.method private static a(Lcom/google/common/a/es;Lcom/google/common/a/es;)Lcom/google/common/a/ev;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;)",
            "Lcom/google/common/a/ev",
            "<",
            "Lcom/facebook/user/UserKey;",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;"
        }
    .end annotation

    .prologue
    .line 125
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v1

    .line 126
    invoke-virtual {p0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 127
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v3

    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 129
    :cond_0
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 130
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v3

    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 132
    :cond_1
    invoke-static {v1}, Lcom/google/common/a/ev;->a(Ljava/util/Map;)Lcom/google/common/a/ev;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 366
    if-nez p1, :cond_0

    .line 367
    const/4 v0, 0x0

    .line 369
    :goto_0
    return-object v0

    :cond_0
    const-string v0, "\n"

    const-string v1, " "

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static newBuilder()Lcom/facebook/orca/threads/v;
    .locals 1

    .prologue
    .line 136
    new-instance v0, Lcom/facebook/orca/threads/v;

    invoke-direct {v0}, Lcom/facebook/orca/threads/v;-><init>()V

    return-object v0
.end method


# virtual methods
.method public A()Lcom/google/common/a/es;
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
    .line 259
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->y:Lcom/google/common/a/es;

    return-object v0
.end method

.method public B()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;"
        }
    .end annotation

    .prologue
    .line 271
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->h:Lcom/google/common/a/es;

    return-object v0
.end method

.method public C()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;"
        }
    .end annotation

    .prologue
    .line 275
    new-instance v0, Lcom/facebook/orca/threads/u;

    iget-object v1, p0, Lcom/facebook/orca/threads/ThreadSummary;->g:Lcom/google/common/a/es;

    iget-object v2, p0, Lcom/facebook/orca/threads/ThreadSummary;->h:Lcom/google/common/a/es;

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/threads/u;-><init>(Lcom/google/common/a/es;Lcom/google/common/a/es;)V

    return-object v0
.end method

.method public a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/orca/threads/ThreadParticipant;
    .locals 1

    .prologue
    .line 267
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threads/ThreadSummary;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/threads/ThreadParticipant;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/threads/ThreadParticipant;
    .locals 1

    .prologue
    .line 263
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->z:Lcom/google/common/a/ev;

    invoke-virtual {v0, p1}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadParticipant;

    return-object v0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 140
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()J
    .locals 2

    .prologue
    .line 147
    iget-wide v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->c:J

    return-wide v0
.end method

.method public d()J
    .locals 2

    .prologue
    .line 151
    iget-wide v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->d:J

    return-wide v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 316
    const/4 v0, 0x0

    return v0
.end method

.method public e()J
    .locals 2

    .prologue
    .line 155
    iget-wide v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->e:J

    return-wide v0
.end method

.method public f()Z
    .locals 1

    .prologue
    .line 159
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->f:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 163
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->f:Ljava/lang/String;

    return-object v0
.end method

.method public h()Z
    .locals 1

    .prologue
    .line 167
    iget-boolean v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->j:Z

    return v0
.end method

.method public i()Lcom/facebook/user/UserKey;
    .locals 1

    .prologue
    .line 171
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->k:Lcom/facebook/user/UserKey;

    return-object v0
.end method

.method public j()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;"
        }
    .end annotation

    .prologue
    .line 175
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->g:Lcom/google/common/a/es;

    return-object v0
.end method

.method public k()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 179
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->i:Lcom/google/common/a/es;

    return-object v0
.end method

.method public l()J
    .locals 2

    .prologue
    .line 183
    iget-wide v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->l:J

    return-wide v0
.end method

.method public m()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 187
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->m:Lcom/google/common/a/es;

    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    .prologue
    .line 195
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->n:Ljava/lang/String;

    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    .prologue
    .line 199
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->o:Ljava/lang/String;

    return-object v0
.end method

.method public p()Lcom/facebook/messages/model/threads/ParticipantInfo;
    .locals 1

    .prologue
    .line 203
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->p:Lcom/facebook/messages/model/threads/ParticipantInfo;

    return-object v0
.end method

.method public q()Ljava/lang/String;
    .locals 1

    .prologue
    .line 207
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->q:Ljava/lang/String;

    return-object v0
.end method

.method public r()Z
    .locals 1

    .prologue
    .line 211
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->q:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public s()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 215
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->r:Landroid/net/Uri;

    return-object v0
.end method

.method public t()Z
    .locals 1

    .prologue
    .line 219
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->r:Landroid/net/Uri;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 350
    const-class v0, Lcom/facebook/orca/threads/ThreadSummary;

    invoke-static {v0}, Lcom/google/common/base/Objects;->toStringHelper(Ljava/lang/Class;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "id"

    iget-object v2, p0, Lcom/facebook/orca/threads/ThreadSummary;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "fbid"

    iget-object v2, p0, Lcom/facebook/orca/threads/ThreadSummary;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "folder"

    iget-object v2, p0, Lcom/facebook/orca/threads/ThreadSummary;->w:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v2}, Lcom/facebook/orca/threads/FolderName;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "singleRecipientCanonicalThread"

    iget-boolean v2, p0, Lcom/facebook/orca/threads/ThreadSummary;->j:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v1

    const-string v2, "singleRecipientUserKey"

    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->k:Lcom/facebook/user/UserKey;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->k:Lcom/facebook/user/UserKey;

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->c()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v2, v0}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "timestampMs"

    iget-wide v2, p0, Lcom/facebook/orca/threads/ThreadSummary;->l:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "participants"

    iget-object v2, p0, Lcom/facebook/orca/threads/ThreadSummary;->g:Lcom/google/common/a/es;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "senders"

    iget-object v2, p0, Lcom/facebook/orca/threads/ThreadSummary;->m:Lcom/google/common/a/es;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "snippet"

    iget-object v2, p0, Lcom/facebook/orca/threads/ThreadSummary;->n:Ljava/lang/String;

    invoke-direct {p0, v2}, Lcom/facebook/orca/threads/ThreadSummary;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "adminSnippet"

    iget-object v2, p0, Lcom/facebook/orca/threads/ThreadSummary;->o:Ljava/lang/String;

    invoke-direct {p0, v2}, Lcom/facebook/orca/threads/ThreadSummary;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/base/Objects$ToStringHelper;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public u()Z
    .locals 1

    .prologue
    .line 223
    iget-boolean v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->s:Z

    return v0
.end method

.method public v()Z
    .locals 1

    .prologue
    .line 227
    iget-boolean v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->t:Z

    return v0
.end method

.method public w()Z
    .locals 1

    .prologue
    .line 231
    iget-boolean v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->u:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 321
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 322
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 323
    iget-wide v3, p0, Lcom/facebook/orca/threads/ThreadSummary;->c:J

    invoke-virtual {p1, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    .line 324
    iget-wide v3, p0, Lcom/facebook/orca/threads/ThreadSummary;->d:J

    invoke-virtual {p1, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    .line 325
    iget-wide v3, p0, Lcom/facebook/orca/threads/ThreadSummary;->e:J

    invoke-virtual {p1, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    .line 326
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 327
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->g:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 328
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->h:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 329
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->i:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 330
    iget-boolean v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->j:Z

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 331
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->k:Lcom/facebook/user/UserKey;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->k:Lcom/facebook/user/UserKey;

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->c()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 332
    iget-wide v3, p0, Lcom/facebook/orca/threads/ThreadSummary;->l:J

    invoke-virtual {p1, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    .line 333
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->m:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 334
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->n:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 335
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->o:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 336
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->p:Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 337
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->q:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 338
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->r:Landroid/net/Uri;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 339
    iget-boolean v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->s:Z

    if-eqz v0, :cond_2

    move v0, v1

    :goto_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 340
    iget-boolean v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->t:Z

    if-eqz v0, :cond_3

    move v0, v1

    :goto_3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 341
    iget-boolean v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->u:Z

    if-eqz v0, :cond_4

    move v0, v1

    :goto_4
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 342
    iget-boolean v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->v:Z

    if-eqz v0, :cond_5

    :goto_5
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 343
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->w:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 344
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->x:Lcom/facebook/orca/compose/MessageDraft;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 345
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->y:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 346
    return-void

    :cond_0
    move v0, v2

    .line 330
    goto :goto_0

    .line 331
    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    move v0, v2

    .line 339
    goto :goto_2

    :cond_3
    move v0, v2

    .line 340
    goto :goto_3

    :cond_4
    move v0, v2

    .line 341
    goto :goto_4

    :cond_5
    move v1, v2

    .line 342
    goto :goto_5
.end method

.method public x()Z
    .locals 1

    .prologue
    .line 235
    iget-boolean v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->v:Z

    return v0
.end method

.method public y()Lcom/facebook/orca/threads/FolderName;
    .locals 1

    .prologue
    .line 239
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->w:Lcom/facebook/orca/threads/FolderName;

    return-object v0
.end method

.method public z()Lcom/facebook/orca/compose/MessageDraft;
    .locals 1

    .prologue
    .line 247
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadSummary;->x:Lcom/facebook/orca/compose/MessageDraft;

    return-object v0
.end method
