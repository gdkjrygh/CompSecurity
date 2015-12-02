.class public Lcom/facebook/orca/threadview/RowReceiptParticipant;
.super Ljava/lang/Object;
.source "RowReceiptParticipant.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/orca/threadview/RowReceiptParticipant;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Lcom/facebook/orca/threadview/RowReceiptParticipant;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/messages/model/threads/ParticipantInfo;

.field private final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    new-instance v0, Lcom/facebook/orca/threadview/ag;

    invoke-direct {v0}, Lcom/facebook/orca/threadview/ag;-><init>()V

    sput-object v0, Lcom/facebook/orca/threadview/RowReceiptParticipant;->a:Ljava/util/Comparator;

    .line 59
    new-instance v0, Lcom/facebook/orca/threadview/ah;

    invoke-direct {v0}, Lcom/facebook/orca/threadview/ah;-><init>()V

    sput-object v0, Lcom/facebook/orca/threadview/RowReceiptParticipant;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    const-class v0, Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/ParticipantInfo;

    iput-object v0, p0, Lcom/facebook/orca/threadview/RowReceiptParticipant;->b:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/threadview/RowReceiptParticipant;->c:J

    .line 49
    return-void
.end method

.method public constructor <init>(Lcom/facebook/messages/model/threads/ParticipantInfo;J)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/facebook/orca/threadview/RowReceiptParticipant;->b:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 42
    iput-wide p2, p0, Lcom/facebook/orca/threadview/RowReceiptParticipant;->c:J

    .line 43
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/messages/model/threads/ParticipantInfo;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/facebook/orca/threadview/RowReceiptParticipant;->b:Lcom/facebook/messages/model/threads/ParticipantInfo;

    return-object v0
.end method

.method public b()J
    .locals 2

    .prologue
    .line 56
    iget-wide v0, p0, Lcom/facebook/orca/threadview/RowReceiptParticipant;->c:J

    return-wide v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 72
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 83
    const-class v0, Lcom/facebook/orca/threadview/RowReceiptParticipant;

    invoke-static {v0}, Lcom/google/common/base/Objects;->toStringHelper(Ljava/lang/Class;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "participantInfo"

    iget-object v2, p0, Lcom/facebook/orca/threadview/RowReceiptParticipant;->b:Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "readTimestampMs"

    iget-wide v2, p0, Lcom/facebook/orca/threadview/RowReceiptParticipant;->c:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/base/Objects$ToStringHelper;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/orca/threadview/RowReceiptParticipant;->b:Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 78
    iget-wide v0, p0, Lcom/facebook/orca/threadview/RowReceiptParticipant;->c:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 79
    return-void
.end method
