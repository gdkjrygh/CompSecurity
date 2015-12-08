.class public Lcom/facebook/share/internal/LikeContent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/share/model/ShareModel;


# instance fields
.field private final objectId:Ljava/lang/String;

.field private final objectType:Lcom/facebook/share/widget/LikeView$ObjectType;


# direct methods
.method constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/internal/LikeContent;->objectId:Ljava/lang/String;

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v0}, Lcom/facebook/share/widget/LikeView$ObjectType;->fromInt(I)Lcom/facebook/share/widget/LikeView$ObjectType;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/internal/LikeContent;->objectType:Lcom/facebook/share/widget/LikeView$ObjectType;

    .line 49
    return-void
.end method

.method private constructor <init>(Lcom/facebook/share/internal/LikeContent$Builder;)V
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    # getter for: Lcom/facebook/share/internal/LikeContent$Builder;->objectId:Ljava/lang/String;
    invoke-static {p1}, Lcom/facebook/share/internal/LikeContent$Builder;->access$000(Lcom/facebook/share/internal/LikeContent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/internal/LikeContent;->objectId:Ljava/lang/String;

    .line 43
    # getter for: Lcom/facebook/share/internal/LikeContent$Builder;->objectType:Lcom/facebook/share/widget/LikeView$ObjectType;
    invoke-static {p1}, Lcom/facebook/share/internal/LikeContent$Builder;->access$100(Lcom/facebook/share/internal/LikeContent$Builder;)Lcom/facebook/share/widget/LikeView$ObjectType;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/share/internal/LikeContent;->objectType:Lcom/facebook/share/widget/LikeView$ObjectType;

    .line 44
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/share/internal/LikeContent$Builder;Lcom/facebook/share/internal/LikeContent$1;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lcom/facebook/share/internal/LikeContent;-><init>(Lcom/facebook/share/internal/LikeContent$Builder;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 70
    const/4 v0, 0x0

    return v0
.end method

.method public getObjectId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/share/internal/LikeContent;->objectId:Ljava/lang/String;

    return-object v0
.end method

.method public getObjectType()Lcom/facebook/share/widget/LikeView$ObjectType;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/share/internal/LikeContent;->objectType:Lcom/facebook/share/widget/LikeView$ObjectType;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/share/internal/LikeContent;->objectId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 75
    iget-object v0, p0, Lcom/facebook/share/internal/LikeContent;->objectType:Lcom/facebook/share/widget/LikeView$ObjectType;

    invoke-virtual {v0}, Lcom/facebook/share/widget/LikeView$ObjectType;->getValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 76
    return-void
.end method
