.class public Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;
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
            "Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

.field private final b:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 151
    new-instance v0, Lcom/facebook/zero/protocol/a;

    invoke-direct {v0}, Lcom/facebook/zero/protocol/a;-><init>()V

    sput-object v0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    const-class v0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    iput-object v0, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->a:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    .line 102
    const-class v0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    iput-object v0, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->b:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    .line 103
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/zero/protocol/a;)V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0, p1}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;)V
    .locals 0

    .prologue
    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput-object p1, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->a:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    .line 89
    iput-object p2, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->b:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    .line 90
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 93
    const-string v0, ":"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a([Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v3

    .line 94
    invoke-virtual {v3}, Lcom/google/common/a/es;->size()I

    move-result v0

    const/4 v4, 0x4

    if-ne v0, v4, :cond_0

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 96
    new-instance v4, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    invoke-virtual {v3, v2}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v3, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {v4, v0, v1}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v4, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->a:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    .line 97
    new-instance v2, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    const/4 v0, 0x2

    invoke-virtual {v3, v0}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x3

    invoke-virtual {v3, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v2, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->b:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    .line 98
    return-void

    :cond_0
    move v0, v2

    .line 94
    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->a:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    return-object v0
.end method

.method public b()Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->b:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 2

    .prologue
    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->a:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    invoke-virtual {v1}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->a:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    invoke-virtual {v1}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->b:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    invoke-virtual {v1}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->b:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    invoke-virtual {v1}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 142
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 115
    if-eqz p1, :cond_0

    instance-of v1, p1, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;

    if-nez v1, :cond_1

    .line 121
    :cond_0
    :goto_0
    return v0

    .line 119
    :cond_1
    check-cast p1, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;

    .line 121
    iget-object v1, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->a:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    invoke-virtual {p1}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->a()Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->b:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    invoke-virtual {p1}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->b()Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 128
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->a:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->b:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/common/base/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 147
    iget-object v0, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->a:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 148
    iget-object v0, p0, Lcom/facebook/zero/protocol/CarrierAndSimMccMnc;->b:Lcom/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 149
    return-void
.end method
