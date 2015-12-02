.class public Lcom/facebook/zero/ui/CarrierBottomBannerData;
.super Ljava/lang/Object;
.source "CarrierBottomBannerData.java"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lcom/facebook/common/json/jsonmirror/JMStaticKeysDictDestination;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/facebook/zero/ui/CarrierBottomBannerData;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;
    .annotation runtime Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;
        jsonFieldName = "id"
    .end annotation
.end field

.field private final b:Ljava/lang/String;
    .annotation runtime Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;
        jsonFieldName = "title"
    .end annotation
.end field

.field private final c:Ljava/lang/String;
    .annotation runtime Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;
        jsonFieldName = "content"
    .end annotation
.end field

.field private final d:Ljava/lang/String;
    .annotation runtime Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;
        jsonFieldName = "action_title"
    .end annotation
.end field

.field private final e:Ljava/lang/String;
    .annotation runtime Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;
        jsonFieldName = "action_url"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 133
    new-instance v0, Lcom/facebook/zero/ui/g;

    invoke-direct {v0}, Lcom/facebook/zero/ui/g;-><init>()V

    sput-object v0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 71
    move-object v0, p0

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    invoke-direct/range {v0 .. v5}, Lcom/facebook/zero/ui/CarrierBottomBannerData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->a:Ljava/lang/String;

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->b:Ljava/lang/String;

    .line 52
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->c:Ljava/lang/String;

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->d:Ljava/lang/String;

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->e:Ljava/lang/String;

    .line 55
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/zero/ui/g;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0, p1}, Lcom/facebook/zero/ui/CarrierBottomBannerData;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput-object p1, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->a:Ljava/lang/String;

    .line 64
    iput-object p2, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->b:Ljava/lang/String;

    .line 65
    iput-object p3, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->c:Ljava/lang/String;

    .line 66
    iput-object p4, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->d:Ljava/lang/String;

    .line 67
    iput-object p5, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->e:Ljava/lang/String;

    .line 68
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 101
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 115
    instance-of v1, p1, Lcom/facebook/zero/ui/CarrierBottomBannerData;

    if-nez v1, :cond_1

    .line 120
    :cond_0
    :goto_0
    return v0

    .line 119
    :cond_1
    check-cast p1, Lcom/facebook/zero/ui/CarrierBottomBannerData;

    .line 120
    iget-object v1, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->a:Ljava/lang/String;

    iget-object v2, p1, Lcom/facebook/zero/ui/CarrierBottomBannerData;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->b:Ljava/lang/String;

    iget-object v2, p1, Lcom/facebook/zero/ui/CarrierBottomBannerData;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->c:Ljava/lang/String;

    iget-object v2, p1, Lcom/facebook/zero/ui/CarrierBottomBannerData;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->d:Ljava/lang/String;

    iget-object v2, p1, Lcom/facebook/zero/ui/CarrierBottomBannerData;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->e:Ljava/lang/String;

    iget-object v2, p1, Lcom/facebook/zero/ui/CarrierBottomBannerData;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public getActionTitle()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "action_title"
    .end annotation

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->d:Ljava/lang/String;

    return-object v0
.end method

.method public getActionUrl()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "action_url"
    .end annotation

    .prologue
    .line 96
    iget-object v0, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->e:Ljava/lang/String;

    return-object v0
.end method

.method public getContent()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "content"
    .end annotation

    .prologue
    .line 86
    iget-object v0, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "id"
    .end annotation

    .prologue
    .line 76
    iget-object v0, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "title"
    .end annotation

    .prologue
    .line 81
    iget-object v0, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->b:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 130
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->b:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->c:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->d:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->e:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/common/base/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 107
    iget-object v0, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 108
    iget-object v0, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 109
    iget-object v0, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 110
    iget-object v0, p0, Lcom/facebook/zero/ui/CarrierBottomBannerData;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 111
    return-void
.end method
