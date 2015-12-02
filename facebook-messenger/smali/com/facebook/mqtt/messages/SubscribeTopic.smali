.class public Lcom/facebook/mqtt/messages/SubscribeTopic;
.super Ljava/lang/Object;
.source "SubscribeTopic.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/mqtt/messages/SubscribeTopic;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 65
    new-instance v0, Lcom/facebook/mqtt/messages/t;

    invoke-direct {v0}, Lcom/facebook/mqtt/messages/t;-><init>()V

    sput-object v0, Lcom/facebook/mqtt/messages/SubscribeTopic;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/facebook/mqtt/messages/SubscribeTopic;->a:Ljava/lang/String;

    .line 19
    iput p2, p0, Lcom/facebook/mqtt/messages/SubscribeTopic;->b:I

    .line 20
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/mqtt/messages/SubscribeTopic;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 27
    iget v0, p0, Lcom/facebook/mqtt/messages/SubscribeTopic;->b:I

    return v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 37
    if-ne p0, p1, :cond_1

    .line 46
    :cond_0
    :goto_0
    return v0

    .line 38
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    .line 40
    :cond_3
    check-cast p1, Lcom/facebook/mqtt/messages/SubscribeTopic;

    .line 42
    iget v2, p0, Lcom/facebook/mqtt/messages/SubscribeTopic;->b:I

    iget v3, p1, Lcom/facebook/mqtt/messages/SubscribeTopic;->b:I

    if-eq v2, v3, :cond_4

    move v0, v1

    goto :goto_0

    .line 43
    :cond_4
    iget-object v2, p0, Lcom/facebook/mqtt/messages/SubscribeTopic;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/facebook/mqtt/messages/SubscribeTopic;->a:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    .line 44
    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 51
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/facebook/mqtt/messages/SubscribeTopic;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget v2, p0, Lcom/facebook/mqtt/messages/SubscribeTopic;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/common/base/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/mqtt/messages/SubscribeTopic;->a:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/mqtt/messages/SubscribeTopic;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 62
    iget v0, p0, Lcom/facebook/mqtt/messages/SubscribeTopic;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 63
    return-void
.end method
