.class public final Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaSessionCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "QueueItem"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;

.field public static final UNKNOWN_ID:I = -0x1


# instance fields
.field private final mDescription:Landroid/support/v4/media/MediaDescriptionCompat;

.field private final mId:J

.field private mItem:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 844
    new-instance v0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem$1;

    invoke-direct {v0}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem$1;-><init>()V

    sput-object v0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 779
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 780
    sget-object v0, Landroid/support/v4/media/MediaDescriptionCompat;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/media/MediaDescriptionCompat;

    iput-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->mDescription:Landroid/support/v4/media/MediaDescriptionCompat;

    .line 781
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->mId:J

    .line 782
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Landroid/support/v4/media/session/MediaSessionCompat$1;)V
    .locals 0

    .prologue
    .line 745
    invoke-direct {p0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Landroid/support/v4/media/MediaDescriptionCompat;J)V
    .locals 2

    .prologue
    .line 764
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2, p3}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;-><init>(Ljava/lang/Object;Landroid/support/v4/media/MediaDescriptionCompat;J)V

    .line 765
    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Landroid/support/v4/media/MediaDescriptionCompat;J)V
    .locals 3

    .prologue
    .line 767
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 768
    if-nez p2, :cond_0

    .line 769
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Description cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 771
    :cond_0
    const-wide/16 v0, -0x1

    cmp-long v0, p3, v0

    if-nez v0, :cond_1

    .line 772
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Id cannot be QueueItem.UNKNOWN_ID"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 774
    :cond_1
    iput-object p2, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->mDescription:Landroid/support/v4/media/MediaDescriptionCompat;

    .line 775
    iput-wide p3, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->mId:J

    .line 776
    iput-object p1, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->mItem:Ljava/lang/Object;

    .line 777
    return-void
.end method

.method public static obtain(Ljava/lang/Object;)Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;
    .locals 4

    .prologue
    .line 836
    invoke-static {p0}, Landroid/support/v4/media/session/MediaSessionCompatApi21$QueueItem;->getDescription(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 837
    invoke-static {v0}, Landroid/support/v4/media/MediaDescriptionCompat;->fromMediaDescription(Ljava/lang/Object;)Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object v0

    .line 839
    invoke-static {p0}, Landroid/support/v4/media/session/MediaSessionCompatApi21$QueueItem;->getQueueId(Ljava/lang/Object;)J

    move-result-wide v2

    .line 840
    new-instance v1, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    invoke-direct {v1, p0, v0, v2, v3}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;-><init>(Ljava/lang/Object;Landroid/support/v4/media/MediaDescriptionCompat;J)V

    return-object v1
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    .prologue
    .line 806
    const/4 v0, 0x0

    return v0
.end method

.method public final getDescription()Landroid/support/v4/media/MediaDescriptionCompat;
    .locals 1

    .prologue
    .line 788
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->mDescription:Landroid/support/v4/media/MediaDescriptionCompat;

    return-object v0
.end method

.method public final getQueueId()J
    .locals 2

    .prologue
    .line 795
    iget-wide v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->mId:J

    return-wide v0
.end method

.method public final getQueueItem()Ljava/lang/Object;
    .locals 4

    .prologue
    .line 820
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->mItem:Ljava/lang/Object;

    if-nez v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_1

    .line 821
    :cond_0
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->mItem:Ljava/lang/Object;

    .line 825
    :goto_0
    return-object v0

    .line 823
    :cond_1
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->mDescription:Landroid/support/v4/media/MediaDescriptionCompat;

    invoke-virtual {v0}, Landroid/support/v4/media/MediaDescriptionCompat;->getMediaDescription()Ljava/lang/Object;

    move-result-object v0

    iget-wide v2, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->mId:J

    invoke-static {v0, v2, v3}, Landroid/support/v4/media/session/MediaSessionCompatApi21$QueueItem;->createItem(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->mItem:Ljava/lang/Object;

    .line 825
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->mItem:Ljava/lang/Object;

    goto :goto_0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 859
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MediaSession.QueueItem {Description="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->mDescription:Landroid/support/v4/media/MediaDescriptionCompat;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->mId:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 800
    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->mDescription:Landroid/support/v4/media/MediaDescriptionCompat;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/media/MediaDescriptionCompat;->writeToParcel(Landroid/os/Parcel;I)V

    .line 801
    iget-wide v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;->mId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 802
    return-void
.end method
