.class public Lcom/facebook/user/ChatContext;
.super Ljava/lang/Object;
.source "ChatContext.java"

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
            "Lcom/facebook/user/ChatContext;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/facebook/user/d;

.field private final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 91
    new-instance v0, Lcom/facebook/user/b;

    invoke-direct {v0}, Lcom/facebook/user/b;-><init>()V

    sput-object v0, Lcom/facebook/user/ChatContext;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/ChatContext;->a:Ljava/lang/String;

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/d;->valueOf(Ljava/lang/String;)Lcom/facebook/user/d;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/user/ChatContext;->b:Lcom/facebook/user/d;

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/facebook/user/ChatContext;->c:F

    .line 51
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/facebook/user/b;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/facebook/user/ChatContext;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/facebook/user/d;F)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "subtext"
        .end annotation
    .end param
    .param p2    # Lcom/facebook/user/d;
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "type"
        .end annotation
    .end param
    .param p3    # F
        .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
            value = "distance"
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonCreator;
    .end annotation

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/facebook/user/ChatContext;->a:Ljava/lang/String;

    .line 43
    iput-object p2, p0, Lcom/facebook/user/ChatContext;->b:Lcom/facebook/user/d;

    .line 44
    iput p3, p0, Lcom/facebook/user/ChatContext;->c:F

    .line 45
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    .prologue
    .line 82
    sget-object v0, Lcom/facebook/user/c;->a:[I

    iget-object v1, p0, Lcom/facebook/user/ChatContext;->b:Lcom/facebook/user/d;

    invoke-virtual {v1}, Lcom/facebook/user/d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 87
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 85
    :pswitch_0
    const/4 v0, 0x1

    goto :goto_0

    .line 82
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 104
    const/4 v0, 0x0

    return v0
.end method

.method public getDistanceMeters()F
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "distance"
    .end annotation

    .prologue
    .line 78
    iget v0, p0, Lcom/facebook/user/ChatContext;->c:F

    return v0
.end method

.method public getSubtext()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "subtext"
    .end annotation

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/user/ChatContext;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Lcom/facebook/user/d;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "type"
    .end annotation

    .prologue
    .line 73
    iget-object v0, p0, Lcom/facebook/user/ChatContext;->b:Lcom/facebook/user/d;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 116
    invoke-static {p0}, Lcom/google/common/base/Objects;->toStringHelper(Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "type"

    iget-object v2, p0, Lcom/facebook/user/ChatContext;->b:Lcom/facebook/user/d;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "subtext"

    iget-object v2, p0, Lcom/facebook/user/ChatContext;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "distance"

    iget v2, p0, Lcom/facebook/user/ChatContext;->c:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

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
    .line 109
    iget-object v0, p0, Lcom/facebook/user/ChatContext;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 110
    iget-object v0, p0, Lcom/facebook/user/ChatContext;->b:Lcom/facebook/user/d;

    invoke-virtual {v0}, Lcom/facebook/user/d;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 111
    iget v0, p0, Lcom/facebook/user/ChatContext;->c:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 112
    return-void
.end method
