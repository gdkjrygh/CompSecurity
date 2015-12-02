.class public Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;
.super Ljava/lang/Object;
.source "SendWebrtcMessageMethod.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:J

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 52
    new-instance v0, Lcom/facebook/orca/protocol/methods/av;

    invoke-direct {v0}, Lcom/facebook/orca/protocol/methods/av;-><init>()V

    sput-object v0, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-wide p1, p0, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;->a:J

    .line 42
    iput-object p3, p0, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;->b:Ljava/lang/String;

    .line 43
    iput-object p4, p0, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;->c:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;->a:J

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;->b:Ljava/lang/String;

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;->c:Ljava/lang/String;

    .line 50
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .prologue
    .line 75
    iget-wide v0, p0, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;->a:J

    return-wide v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;->c:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 65
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 70
    iget-wide v0, p0, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;->a:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 71
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 72
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 73
    return-void
.end method
