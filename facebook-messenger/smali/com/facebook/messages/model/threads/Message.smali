.class public Lcom/facebook/messages/model/threads/Message;
.super Ljava/lang/Object;
.source "Message.java"

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
            "Lcom/facebook/messages/model/threads/Message;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final A:Lcom/facebook/messages/model/threads/SendError;

.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:J

.field private final d:J

.field private final e:Lcom/facebook/messages/model/threads/ParticipantInfo;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private final i:J

.field private final j:Lcom/facebook/location/Coordinates;

.field private final k:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/ui/media/attachments/MediaResource;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/TitanAttachmentInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final m:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/share/Share;",
            ">;"
        }
    .end annotation
.end field

.field private final n:I

.field private final o:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Ljava/lang/String;

.field private final q:Z

.field private final r:Ljava/lang/String;

.field private final s:Lcom/facebook/messages/model/threads/c;

.field private final t:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/ui/media/attachments/MediaResource;",
            ">;"
        }
    .end annotation
.end field

.field private final u:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/share/Share;",
            ">;"
        }
    .end annotation
.end field

.field private final v:Ljava/lang/String;

.field private final w:J

.field private final x:Lcom/facebook/user/RecipientInfo;

.field private final y:Lcom/facebook/messages/model/threads/GroupMessageInfo;

.field private final z:Lcom/google/common/a/ev;
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


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 337
    new-instance v0, Lcom/facebook/messages/model/threads/b;

    invoke-direct {v0}, Lcom/facebook/messages/model/threads/b;-><init>()V

    sput-object v0, Lcom/facebook/messages/model/threads/Message;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->a:Ljava/lang/String;

    .line 132
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->b:Ljava/lang/String;

    .line 133
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/messages/model/threads/Message;->c:J

    .line 134
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/messages/model/threads/Message;->d:J

    .line 135
    const-class v0, Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/ParticipantInfo;

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->e:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 136
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->f:Ljava/lang/String;

    .line 137
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->g:Ljava/lang/String;

    .line 138
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->h:Ljava/lang/String;

    .line 139
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/messages/model/threads/Message;->i:J

    .line 140
    const-class v0, Lcom/facebook/location/Coordinates;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/location/Coordinates;

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->j:Lcom/facebook/location/Coordinates;

    .line 141
    const-class v0, Lcom/facebook/ui/media/attachments/MediaResource;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->k:Lcom/google/common/a/es;

    .line 143
    const-class v0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->l:Lcom/google/common/a/es;

    .line 145
    const-class v0, Lcom/facebook/messages/model/share/Share;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->m:Lcom/google/common/a/es;

    .line 146
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/messages/model/threads/Message;->n:I

    .line 147
    const-class v0, Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->o:Lcom/google/common/a/es;

    .line 148
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->p:Ljava/lang/String;

    .line 149
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/facebook/messages/model/threads/Message;->q:Z

    .line 150
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->r:Ljava/lang/String;

    .line 151
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/messages/model/threads/c;->valueOf(Ljava/lang/String;)Lcom/facebook/messages/model/threads/c;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->s:Lcom/facebook/messages/model/threads/c;

    .line 152
    const-class v0, Lcom/facebook/ui/media/attachments/MediaResource;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->t:Lcom/google/common/a/es;

    .line 154
    const-class v0, Lcom/facebook/messages/model/share/Share;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->u:Lcom/google/common/a/es;

    .line 155
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->v:Ljava/lang/String;

    .line 156
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/messages/model/threads/Message;->w:J

    .line 157
    const-class v0, Lcom/facebook/user/RecipientInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/RecipientInfo;

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->x:Lcom/facebook/user/RecipientInfo;

    .line 158
    const-class v0, Lcom/facebook/messages/model/threads/GroupMessageInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/GroupMessageInfo;

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->y:Lcom/facebook/messages/model/threads/GroupMessageInfo;

    .line 159
    const-class v0, Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/ev;->a(Ljava/util/Map;)Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->z:Lcom/google/common/a/ev;

    .line 160
    const-class v0, Lcom/facebook/messages/model/threads/SendError;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/SendError;

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->A:Lcom/facebook/messages/model/threads/SendError;

    .line 161
    return-void

    .line 149
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/messages/model/threads/b;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0, p1}, Lcom/facebook/messages/model/threads/Message;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Lcom/facebook/messages/model/threads/e;)V
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 93
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->a:Ljava/lang/String;

    .line 94
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->b:Ljava/lang/String;

    .line 95
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->c()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/facebook/messages/model/threads/Message;->c:J

    .line 96
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->d()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/facebook/messages/model/threads/Message;->d:J

    .line 97
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->e()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->e:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 98
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->f:Ljava/lang/String;

    .line 99
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->g:Ljava/lang/String;

    .line 100
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->h:Ljava/lang/String;

    .line 101
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->i()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/facebook/messages/model/threads/Message;->i:J

    .line 102
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->j()Lcom/facebook/location/Coordinates;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->j:Lcom/facebook/location/Coordinates;

    .line 103
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->k()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->k:Lcom/google/common/a/es;

    .line 104
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->l()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->l:Lcom/google/common/a/es;

    .line 105
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->m()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->m:Lcom/google/common/a/es;

    .line 106
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->n()I

    move-result v0

    iput v0, p0, Lcom/facebook/messages/model/threads/Message;->n:I

    .line 107
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->o()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->o:Lcom/google/common/a/es;

    .line 108
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->p:Ljava/lang/String;

    .line 109
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->q()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/messages/model/threads/Message;->q:Z

    .line 110
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->r()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->r:Ljava/lang/String;

    .line 111
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->s()Lcom/facebook/messages/model/threads/c;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->s:Lcom/facebook/messages/model/threads/c;

    .line 112
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->t()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->t:Lcom/google/common/a/es;

    .line 113
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->u()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->u:Lcom/google/common/a/es;

    .line 114
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->v()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->v:Ljava/lang/String;

    .line 115
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->w()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/facebook/messages/model/threads/Message;->w:J

    .line 116
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->x()Lcom/facebook/user/RecipientInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->x:Lcom/facebook/user/RecipientInfo;

    .line 117
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->y()Lcom/facebook/messages/model/threads/GroupMessageInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->y:Lcom/facebook/messages/model/threads/GroupMessageInfo;

    .line 118
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->z()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/ev;->a(Ljava/util/Map;)Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->z:Lcom/google/common/a/ev;

    .line 119
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/e;->A()Lcom/facebook/messages/model/threads/SendError;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/model/threads/Message;->A:Lcom/facebook/messages/model/threads/SendError;

    .line 124
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->x:Lcom/facebook/user/RecipientInfo;

    if-nez v0, :cond_1

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 127
    iget v0, p0, Lcom/facebook/messages/model/threads/Message;->n:I

    const/16 v3, 0x385

    if-ne v0, v3, :cond_2

    :goto_1
    sget-object v0, Lcom/facebook/messages/model/threads/SendError;->a:Lcom/facebook/messages/model/threads/SendError;

    iget-object v1, p0, Lcom/facebook/messages/model/threads/Message;->A:Lcom/facebook/messages/model/threads/SendError;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v2

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 128
    return-void

    :cond_1
    move v0, v1

    .line 124
    goto :goto_0

    :cond_2
    move v2, v1

    .line 127
    goto :goto_1
.end method


# virtual methods
.method public A()Lcom/facebook/messages/model/threads/c;
    .locals 1

    .prologue
    .line 286
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->s:Lcom/facebook/messages/model/threads/c;

    return-object v0
.end method

.method public B()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/media/attachments/MediaResource;",
            ">;"
        }
    .end annotation

    .prologue
    .line 290
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->t:Lcom/google/common/a/es;

    return-object v0
.end method

.method public C()Z
    .locals 1

    .prologue
    .line 294
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->t:Lcom/google/common/a/es;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->t:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public D()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/share/Share;",
            ">;"
        }
    .end annotation

    .prologue
    .line 301
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->u:Lcom/google/common/a/es;

    return-object v0
.end method

.method public E()Ljava/lang/String;
    .locals 1

    .prologue
    .line 310
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->v:Ljava/lang/String;

    return-object v0
.end method

.method public F()J
    .locals 2

    .prologue
    .line 314
    iget-wide v0, p0, Lcom/facebook/messages/model/threads/Message;->w:J

    return-wide v0
.end method

.method public G()Lcom/facebook/user/RecipientInfo;
    .locals 1

    .prologue
    .line 318
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->x:Lcom/facebook/user/RecipientInfo;

    return-object v0
.end method

.method public H()Lcom/facebook/messages/model/threads/GroupMessageInfo;
    .locals 1

    .prologue
    .line 322
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->y:Lcom/facebook/messages/model/threads/GroupMessageInfo;

    return-object v0
.end method

.method public I()Z
    .locals 1

    .prologue
    .line 326
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->z:Lcom/google/common/a/ev;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->z:Lcom/google/common/a/ev;

    invoke-virtual {v0}, Lcom/google/common/a/ev;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public J()Lcom/google/common/a/ev;
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
    .line 330
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->z:Lcom/google/common/a/ev;

    return-object v0
.end method

.method public K()Lcom/facebook/messages/model/threads/SendError;
    .locals 1

    .prologue
    .line 334
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->A:Lcom/facebook/messages/model/threads/SendError;

    return-object v0
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 168
    invoke-virtual {p0}, Lcom/facebook/messages/model/threads/Message;->b()Ljava/lang/String;

    move-result-object v0

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

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 176
    invoke-virtual {p0}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 184
    invoke-virtual {p0}, Lcom/facebook/messages/model/threads/Message;->t()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 188
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->a:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 352
    const/4 v0, 0x0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 192
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->b:Ljava/lang/String;

    return-object v0
.end method

.method public f()J
    .locals 2

    .prologue
    .line 196
    iget-wide v0, p0, Lcom/facebook/messages/model/threads/Message;->c:J

    return-wide v0
.end method

.method public g()Z
    .locals 4

    .prologue
    .line 200
    iget-wide v0, p0, Lcom/facebook/messages/model/threads/Message;->d:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public h()J
    .locals 2

    .prologue
    .line 204
    iget-wide v0, p0, Lcom/facebook/messages/model/threads/Message;->d:J

    return-wide v0
.end method

.method public i()Lcom/facebook/messages/model/threads/ParticipantInfo;
    .locals 1

    .prologue
    .line 212
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->e:Lcom/facebook/messages/model/threads/ParticipantInfo;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .prologue
    .line 216
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->f:Ljava/lang/String;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .prologue
    .line 220
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->g:Ljava/lang/String;

    return-object v0
.end method

.method public l()Z
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->g:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->h:Ljava/lang/String;

    return-object v0
.end method

.method public n()Lcom/facebook/location/Coordinates;
    .locals 1

    .prologue
    .line 232
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->j:Lcom/facebook/location/Coordinates;

    return-object v0
.end method

.method public o()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/media/attachments/MediaResource;",
            ">;"
        }
    .end annotation

    .prologue
    .line 236
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->k:Lcom/google/common/a/es;

    return-object v0
.end method

.method public p()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/TitanAttachmentInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 240
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->l:Lcom/google/common/a/es;

    return-object v0
.end method

.method public q()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/share/Share;",
            ">;"
        }
    .end annotation

    .prologue
    .line 244
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->m:Lcom/google/common/a/es;

    return-object v0
.end method

.method public r()Z
    .locals 1

    .prologue
    .line 248
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->j:Lcom/facebook/location/Coordinates;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public s()J
    .locals 2

    .prologue
    .line 252
    iget-wide v0, p0, Lcom/facebook/messages/model/threads/Message;->i:J

    return-wide v0
.end method

.method public t()Z
    .locals 2

    .prologue
    .line 256
    iget v0, p0, Lcom/facebook/messages/model/threads/Message;->n:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/facebook/messages/model/threads/Message;->n:I

    const/16 v1, 0x384

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/facebook/messages/model/threads/Message;->n:I

    const/16 v1, 0x385

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    const/16 v4, 0xa

    .line 388
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 389
    invoke-virtual {p0}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    invoke-virtual {p0}, Lcom/facebook/messages/model/threads/Message;->x()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 391
    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    :cond_0
    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/messages/model/threads/Message;->A()Lcom/facebook/messages/model/threads/c;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 394
    const-string v1, " t: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/facebook/messages/model/threads/Message;->c:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 395
    const-string v1, " st: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/facebook/messages/model/threads/Message;->d:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 396
    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    invoke-virtual {p0}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v1

    .line 398
    invoke-static {v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 399
    const-string v1, "[empty]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 400
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, v4, :cond_2

    .line 401
    const/4 v2, 0x0

    invoke-virtual {v1, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 403
    :cond_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method public u()I
    .locals 1

    .prologue
    .line 262
    iget v0, p0, Lcom/facebook/messages/model/threads/Message;->n:I

    return v0
.end method

.method public v()Lcom/google/common/a/es;
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
    .line 266
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->o:Lcom/google/common/a/es;

    return-object v0
.end method

.method public w()Ljava/lang/String;
    .locals 1

    .prologue
    .line 270
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->p:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 357
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 358
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 359
    iget-wide v0, p0, Lcom/facebook/messages/model/threads/Message;->c:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 360
    iget-wide v0, p0, Lcom/facebook/messages/model/threads/Message;->d:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 361
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->e:Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 362
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 363
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 364
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 365
    iget-wide v0, p0, Lcom/facebook/messages/model/threads/Message;->i:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 366
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->j:Lcom/facebook/location/Coordinates;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 367
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->k:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 368
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->l:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 369
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->m:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 370
    iget v0, p0, Lcom/facebook/messages/model/threads/Message;->n:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 371
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->o:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 372
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->p:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 373
    iget-boolean v0, p0, Lcom/facebook/messages/model/threads/Message;->q:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 374
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->r:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 375
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->s:Lcom/facebook/messages/model/threads/c;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/c;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 376
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->t:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 377
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->u:Lcom/google/common/a/es;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 378
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->v:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 379
    iget-wide v0, p0, Lcom/facebook/messages/model/threads/Message;->w:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 380
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->x:Lcom/facebook/user/RecipientInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 381
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->y:Lcom/facebook/messages/model/threads/GroupMessageInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 382
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->z:Lcom/google/common/a/ev;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 383
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->A:Lcom/facebook/messages/model/threads/SendError;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 384
    return-void

    .line 373
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public x()Z
    .locals 1

    .prologue
    .line 274
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->p:Ljava/lang/String;

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

.method public y()Z
    .locals 1

    .prologue
    .line 278
    iget-boolean v0, p0, Lcom/facebook/messages/model/threads/Message;->q:Z

    return v0
.end method

.method public z()Ljava/lang/String;
    .locals 1

    .prologue
    .line 282
    iget-object v0, p0, Lcom/facebook/messages/model/threads/Message;->r:Ljava/lang/String;

    return-object v0
.end method
