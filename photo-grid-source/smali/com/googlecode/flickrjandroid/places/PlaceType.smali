.class public Lcom/googlecode/flickrjandroid/places/PlaceType;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0xcL


# instance fields
.field placeTypeId:I

.field placeTypeName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getPlaceTypeId()I
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lcom/googlecode/flickrjandroid/places/PlaceType;->placeTypeId:I

    return v0
.end method

.method public getPlaceTypeName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/places/PlaceType;->placeTypeName:Ljava/lang/String;

    return-object v0
.end method

.method public setPlaceTypeId(I)V
    .locals 0

    .prologue
    .line 32
    iput p1, p0, Lcom/googlecode/flickrjandroid/places/PlaceType;->placeTypeId:I

    .line 33
    return-void
.end method

.method public setPlaceTypeId(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 27
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/places/PlaceType;->setPlaceTypeId(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public setPlaceTypeName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 40
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/places/PlaceType;->placeTypeName:Ljava/lang/String;

    .line 41
    return-void
.end method
