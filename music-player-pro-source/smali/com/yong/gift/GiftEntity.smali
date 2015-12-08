.class public Lcom/yong/gift/GiftEntity;
.super Ljava/lang/Object;
.source "GiftEntity.java"


# instance fields
.field private detailed:Ljava/lang/String;

.field private icon_imagePath:Ljava/lang/String;

.field private id:I

.field private marketUrl:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    const-string v0, ""

    iput-object v0, p0, Lcom/yong/gift/GiftEntity;->icon_imagePath:Ljava/lang/String;

    .line 3
    return-void
.end method


# virtual methods
.method public getDetailed()Ljava/lang/String;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/yong/gift/GiftEntity;->detailed:Ljava/lang/String;

    return-object v0
.end method

.method public getIcon_imagePath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/yong/gift/GiftEntity;->icon_imagePath:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .prologue
    .line 11
    iget v0, p0, Lcom/yong/gift/GiftEntity;->id:I

    return v0
.end method

.method public getMarketUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/yong/gift/GiftEntity;->marketUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/yong/gift/GiftEntity;->title:Ljava/lang/String;

    return-object v0
.end method

.method public setDetailed(Ljava/lang/String;)V
    .locals 0
    .param p1, "detailed"    # Ljava/lang/String;

    .prologue
    .line 26
    iput-object p1, p0, Lcom/yong/gift/GiftEntity;->detailed:Ljava/lang/String;

    .line 27
    return-void
.end method

.method public setIcon_imagePath(Ljava/lang/String;)V
    .locals 0
    .param p1, "icon_image"    # Ljava/lang/String;

    .prologue
    .line 32
    iput-object p1, p0, Lcom/yong/gift/GiftEntity;->icon_imagePath:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public setId(I)V
    .locals 0
    .param p1, "id"    # I

    .prologue
    .line 14
    iput p1, p0, Lcom/yong/gift/GiftEntity;->id:I

    .line 15
    return-void
.end method

.method public setMarketUrl(Ljava/lang/String;)V
    .locals 0
    .param p1, "market_path"    # Ljava/lang/String;

    .prologue
    .line 38
    iput-object p1, p0, Lcom/yong/gift/GiftEntity;->marketUrl:Ljava/lang/String;

    .line 39
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 20
    iput-object p1, p0, Lcom/yong/gift/GiftEntity;->title:Ljava/lang/String;

    .line 21
    return-void
.end method
