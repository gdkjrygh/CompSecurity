.class public Lcom/facebook/orca/protocol/methods/SendBroadcastMethod$SingleBroadcastResult;
.super Ljava/lang/Object;
.source "SendBroadcastMethod.java"

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
            "Lcom/facebook/orca/protocol/methods/SendBroadcastMethod$SingleBroadcastResult;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 65
    new-instance v0, Lcom/facebook/orca/protocol/methods/ak;

    invoke-direct {v0}, Lcom/facebook/orca/protocol/methods/ak;-><init>()V

    sput-object v0, Lcom/facebook/orca/protocol/methods/SendBroadcastMethod$SingleBroadcastResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput p1, p0, Lcom/facebook/orca/protocol/methods/SendBroadcastMethod$SingleBroadcastResult;->a:I

    .line 56
    iput-object p2, p0, Lcom/facebook/orca/protocol/methods/SendBroadcastMethod$SingleBroadcastResult;->b:Ljava/lang/String;

    .line 57
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/protocol/methods/SendBroadcastMethod$SingleBroadcastResult;->a:I

    .line 61
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    .line 62
    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    iput-object v0, p0, Lcom/facebook/orca/protocol/methods/SendBroadcastMethod$SingleBroadcastResult;->b:Ljava/lang/String;

    .line 63
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/orca/protocol/methods/ai;)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0, p1}, Lcom/facebook/orca/protocol/methods/SendBroadcastMethod$SingleBroadcastResult;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 79
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 84
    iget v0, p0, Lcom/facebook/orca/protocol/methods/SendBroadcastMethod$SingleBroadcastResult;->a:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 85
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 86
    return-void
.end method
