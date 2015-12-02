.class public final Lcom/facebook/zero/server/FetchZeroTokenParams;
.super Ljava/lang/Object;
.source "FetchZeroTokenParams.java"

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
            "Lcom/facebook/zero/server/FetchZeroTokenParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;

.field private final b:Lcom/facebook/zero/server/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    new-instance v0, Lcom/facebook/zero/server/a;

    invoke-direct {v0}, Lcom/facebook/zero/server/a;-><init>()V

    sput-object v0, Lcom/facebook/zero/server/FetchZeroTokenParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const-class v0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;

    iput-object v0, p0, Lcom/facebook/zero/server/FetchZeroTokenParams;->a:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;

    .line 34
    new-instance v0, Lcom/facebook/zero/server/c;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/zero/server/c;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/zero/server/FetchZeroTokenParams;->b:Lcom/facebook/zero/server/c;

    .line 35
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/zero/server/a;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/facebook/zero/server/FetchZeroTokenParams;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;Lcom/facebook/zero/server/c;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/facebook/zero/server/FetchZeroTokenParams;->a:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;

    .line 29
    iput-object p2, p0, Lcom/facebook/zero/server/FetchZeroTokenParams;->b:Lcom/facebook/zero/server/c;

    .line 30
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lcom/facebook/zero/server/FetchZeroTokenParams;->a:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;

    return-object v0
.end method

.method public b()Lcom/facebook/zero/server/c;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/zero/server/FetchZeroTokenParams;->b:Lcom/facebook/zero/server/c;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 52
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 71
    instance-of v1, p1, Lcom/facebook/zero/server/FetchZeroTokenParams;

    if-nez v1, :cond_1

    .line 76
    :cond_0
    :goto_0
    return v0

    .line 75
    :cond_1
    check-cast p1, Lcom/facebook/zero/server/FetchZeroTokenParams;

    .line 76
    iget-object v1, p0, Lcom/facebook/zero/server/FetchZeroTokenParams;->a:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;

    invoke-virtual {p1}, Lcom/facebook/zero/server/FetchZeroTokenParams;->a()Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/zero/server/FetchZeroTokenParams;->b:Lcom/facebook/zero/server/c;

    invoke-virtual {p1}, Lcom/facebook/zero/server/FetchZeroTokenParams;->b()Lcom/facebook/zero/server/c;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 83
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/facebook/zero/server/FetchZeroTokenParams;->a:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/facebook/zero/server/FetchZeroTokenParams;->b:Lcom/facebook/zero/server/c;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/common/base/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 63
    const-class v0, Lcom/facebook/zero/server/FetchZeroTokenParams;

    invoke-static {v0}, Lcom/google/common/base/Objects;->toStringHelper(Ljava/lang/Class;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "carrierAndSimMccMnc"

    iget-object v2, p0, Lcom/facebook/zero/server/FetchZeroTokenParams;->a:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "networkType"

    iget-object v2, p0, Lcom/facebook/zero/server/FetchZeroTokenParams;->b:Lcom/facebook/zero/server/c;

    invoke-virtual {v2}, Lcom/facebook/zero/server/c;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/base/Objects$ToStringHelper;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/zero/server/FetchZeroTokenParams;->a:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 58
    iget-object v0, p0, Lcom/facebook/zero/server/FetchZeroTokenParams;->b:Lcom/facebook/zero/server/c;

    invoke-virtual {v0}, Lcom/facebook/zero/server/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 59
    return-void
.end method
