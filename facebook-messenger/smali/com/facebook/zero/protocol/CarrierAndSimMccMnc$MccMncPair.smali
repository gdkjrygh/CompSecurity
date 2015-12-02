.class public Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;
.super Ljava/lang/Object;
.source "CarrierAndSimMccMnc.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 65
    new-instance v0, Lcom/facebook/zero/protocol/b;

    invoke-direct {v0}, Lcom/facebook/zero/protocol/b;-><init>()V

    sput-object v0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->a:Ljava/lang/String;

    .line 27
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->b:Ljava/lang/String;

    .line 28
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/zero/protocol/a;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0, p1}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->a:Ljava/lang/String;

    .line 22
    iput-object p2, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->b:Ljava/lang/String;

    .line 23
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->b:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 40
    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    if-nez v0, :cond_1

    :cond_0
    move v0, v1

    .line 44
    :goto_0
    return v0

    :cond_1
    iget-object v2, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->a:Ljava/lang/String;

    move-object v0, p1

    check-cast v0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    invoke-virtual {v0}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->b:Ljava/lang/String;

    check-cast p1, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    invoke-virtual {p1}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 51
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->b:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/common/base/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 62
    iget-object v0, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 63
    return-void
.end method
