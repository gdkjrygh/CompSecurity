.class public Lcom/facebook/orca/attachments/AudioAttachmentData;
.super Ljava/lang/Object;
.source "AudioAttachmentData.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/orca/attachments/AudioAttachmentData;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:J

.field private final b:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 38
    new-instance v0, Lcom/facebook/orca/attachments/b;

    invoke-direct {v0}, Lcom/facebook/orca/attachments/b;-><init>()V

    sput-object v0, Lcom/facebook/orca/attachments/AudioAttachmentData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JLandroid/net/Uri;)V
    .locals 0
    .param p3    # Landroid/net/Uri;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-wide p1, p0, Lcom/facebook/orca/attachments/AudioAttachmentData;->a:J

    .line 22
    iput-object p3, p0, Lcom/facebook/orca/attachments/AudioAttachmentData;->b:Landroid/net/Uri;

    .line 23
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/attachments/AudioAttachmentData;->a:J

    .line 27
    const-class v0, Landroid/net/Uri;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, Lcom/facebook/orca/attachments/AudioAttachmentData;->b:Landroid/net/Uri;

    .line 28
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/attachments/b;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0, p1}, Lcom/facebook/orca/attachments/AudioAttachmentData;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .prologue
    .line 31
    iget-wide v0, p0, Lcom/facebook/orca/attachments/AudioAttachmentData;->a:J

    return-wide v0
.end method

.method public b()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/orca/attachments/AudioAttachmentData;->b:Landroid/net/Uri;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 51
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 56
    iget-wide v0, p0, Lcom/facebook/orca/attachments/AudioAttachmentData;->a:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 57
    iget-object v0, p0, Lcom/facebook/orca/attachments/AudioAttachmentData;->b:Landroid/net/Uri;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 58
    return-void
.end method
