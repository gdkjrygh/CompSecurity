.class public Lcom/facebook/share/internal/LikeContent$Builder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/share/model/ShareModelBuilder;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/share/model/ShareModelBuilder",
        "<",
        "Lcom/facebook/share/internal/LikeContent;",
        "Lcom/facebook/share/internal/LikeContent$Builder;",
        ">;"
    }
.end annotation


# instance fields
.field private objectId:Ljava/lang/String;

.field private objectType:Lcom/facebook/share/widget/LikeView$ObjectType;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    sget-object v0, Lcom/facebook/share/widget/LikeView$ObjectType;->UNKNOWN:Lcom/facebook/share/widget/LikeView$ObjectType;

    iput-object v0, p0, Lcom/facebook/share/internal/LikeContent$Builder;->objectType:Lcom/facebook/share/widget/LikeView$ObjectType;

    return-void
.end method

.method static synthetic access$000(Lcom/facebook/share/internal/LikeContent$Builder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/facebook/share/internal/LikeContent$Builder;->objectId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$100(Lcom/facebook/share/internal/LikeContent$Builder;)Lcom/facebook/share/widget/LikeView$ObjectType;
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/facebook/share/internal/LikeContent$Builder;->objectType:Lcom/facebook/share/widget/LikeView$ObjectType;

    return-object v0
.end method


# virtual methods
.method public build()Lcom/facebook/share/internal/LikeContent;
    .locals 2

    .prologue
    .line 106
    new-instance v0, Lcom/facebook/share/internal/LikeContent;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/share/internal/LikeContent;-><init>(Lcom/facebook/share/internal/LikeContent$Builder;Lcom/facebook/share/internal/LikeContent$1;)V

    return-object v0
.end method

.method public bridge synthetic build()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 81
    invoke-virtual {p0}, Lcom/facebook/share/internal/LikeContent$Builder;->build()Lcom/facebook/share/internal/LikeContent;

    move-result-object v0

    return-object v0
.end method

.method public readFrom(Landroid/os/Parcel;)Lcom/facebook/share/internal/LikeContent$Builder;
    .locals 1

    .prologue
    .line 121
    const-class v0, Lcom/facebook/share/internal/LikeContent;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/share/internal/LikeContent;

    invoke-virtual {p0, v0}, Lcom/facebook/share/internal/LikeContent$Builder;->readFrom(Lcom/facebook/share/internal/LikeContent;)Lcom/facebook/share/internal/LikeContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public readFrom(Lcom/facebook/share/internal/LikeContent;)Lcom/facebook/share/internal/LikeContent$Builder;
    .locals 2

    .prologue
    .line 111
    if-nez p1, :cond_0

    .line 114
    :goto_0
    return-object p0

    :cond_0
    invoke-virtual {p1}, Lcom/facebook/share/internal/LikeContent;->getObjectId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/share/internal/LikeContent$Builder;->setObjectId(Ljava/lang/String;)Lcom/facebook/share/internal/LikeContent$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/share/internal/LikeContent;->getObjectType()Lcom/facebook/share/widget/LikeView$ObjectType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/share/internal/LikeContent$Builder;->setObjectType(Lcom/facebook/share/widget/LikeView$ObjectType;)Lcom/facebook/share/internal/LikeContent$Builder;

    move-result-object p0

    goto :goto_0
.end method

.method public bridge synthetic readFrom(Landroid/os/Parcel;)Lcom/facebook/share/model/ShareModelBuilder;
    .locals 1

    .prologue
    .line 81
    invoke-virtual {p0, p1}, Lcom/facebook/share/internal/LikeContent$Builder;->readFrom(Landroid/os/Parcel;)Lcom/facebook/share/internal/LikeContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic readFrom(Lcom/facebook/share/model/ShareModel;)Lcom/facebook/share/model/ShareModelBuilder;
    .locals 1

    .prologue
    .line 81
    check-cast p1, Lcom/facebook/share/internal/LikeContent;

    invoke-virtual {p0, p1}, Lcom/facebook/share/internal/LikeContent$Builder;->readFrom(Lcom/facebook/share/internal/LikeContent;)Lcom/facebook/share/internal/LikeContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setObjectId(Ljava/lang/String;)Lcom/facebook/share/internal/LikeContent$Builder;
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/facebook/share/internal/LikeContent$Builder;->objectId:Ljava/lang/String;

    .line 92
    return-object p0
.end method

.method public setObjectType(Lcom/facebook/share/widget/LikeView$ObjectType;)Lcom/facebook/share/internal/LikeContent$Builder;
    .locals 0

    .prologue
    .line 100
    if-nez p1, :cond_0

    sget-object p1, Lcom/facebook/share/widget/LikeView$ObjectType;->UNKNOWN:Lcom/facebook/share/widget/LikeView$ObjectType;

    :cond_0
    iput-object p1, p0, Lcom/facebook/share/internal/LikeContent$Builder;->objectType:Lcom/facebook/share/widget/LikeView$ObjectType;

    .line 101
    return-object p0
.end method
