.class public Lcom/facebook/orca/threads/ThreadParticipant;
.super Ljava/lang/Object;
.source "ThreadParticipant.java"

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
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/messages/model/threads/ParticipantInfo;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/facebook/orca/notify/NotificationSetting;

.field private final d:J

.field private final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 84
    new-instance v0, Lcom/facebook/orca/threads/o;

    invoke-direct {v0}, Lcom/facebook/orca/threads/o;-><init>()V

    sput-object v0, Lcom/facebook/orca/threads/ThreadParticipant;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const-class v0, Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/ParticipantInfo;

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->a:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->b:Ljava/lang/String;

    .line 39
    const-class v0, Lcom/facebook/orca/notify/NotificationSetting;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/notify/NotificationSetting;

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->c:Lcom/facebook/orca/notify/NotificationSetting;

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->d:J

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->e:Ljava/lang/String;

    .line 42
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/threads/o;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0, p1}, Lcom/facebook/orca/threads/ThreadParticipant;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Lcom/facebook/orca/threads/p;)V
    .locals 2

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-virtual {p1}, Lcom/facebook/orca/threads/p;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->a:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 30
    invoke-virtual {p1}, Lcom/facebook/orca/threads/p;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->b:Ljava/lang/String;

    .line 31
    invoke-virtual {p1}, Lcom/facebook/orca/threads/p;->c()Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->c:Lcom/facebook/orca/notify/NotificationSetting;

    .line 32
    invoke-virtual {p1}, Lcom/facebook/orca/threads/p;->d()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->d:J

    .line 33
    invoke-virtual {p1}, Lcom/facebook/orca/threads/p;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->e:Ljava/lang/String;

    .line 34
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/messages/model/threads/ParticipantInfo;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->a:Lcom/facebook/messages/model/threads/ParticipantInfo;

    return-object v0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->a:Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->b()Z

    move-result v0

    return v0
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->a:Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->c()Z

    move-result v0

    return v0
.end method

.method public d()Lcom/facebook/user/UserKey;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->a:Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v0

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 97
    const/4 v0, 0x0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->a:Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->a:Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->b:Ljava/lang/String;

    return-object v0
.end method

.method public h()Lcom/facebook/orca/notify/NotificationSetting;
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->c:Lcom/facebook/orca/notify/NotificationSetting;

    return-object v0
.end method

.method public i()J
    .locals 2

    .prologue
    .line 77
    iget-wide v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->d:J

    return-wide v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->e:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 111
    const-class v0, Lcom/facebook/orca/threads/ThreadParticipant;

    invoke-static {v0}, Lcom/google/common/base/Objects;->toStringHelper(Ljava/lang/Class;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "participantInfo"

    iget-object v2, p0, Lcom/facebook/orca/threads/ThreadParticipant;->a:Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "threadId"

    iget-object v2, p0, Lcom/facebook/orca/threads/ThreadParticipant;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "lastReadReceiptTimestampMs"

    iget-wide v2, p0, Lcom/facebook/orca/threads/ThreadParticipant;->d:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "lastDeliveredReceiptMsgId"

    iget-object v2, p0, Lcom/facebook/orca/threads/ThreadParticipant;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/base/Objects$ToStringHelper;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 102
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->a:Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 103
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 104
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->c:Lcom/facebook/orca/notify/NotificationSetting;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 105
    iget-wide v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->d:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 106
    iget-object v0, p0, Lcom/facebook/orca/threads/ThreadParticipant;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 107
    return-void
.end method
