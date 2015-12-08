.class public Lcom/googlecode/mp4parser/boxes/dece/AssetInformationBox$Entry;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/mp4parser/boxes/dece/AssetInformationBox;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Entry"
.end annotation


# instance fields
.field public assetId:Ljava/lang/String;

.field public namespace:Ljava/lang/String;

.field public profileLevelIdc:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/googlecode/mp4parser/boxes/dece/AssetInformationBox$Entry;->namespace:Ljava/lang/String;

    .line 56
    iput-object p2, p0, Lcom/googlecode/mp4parser/boxes/dece/AssetInformationBox$Entry;->profileLevelIdc:Ljava/lang/String;

    .line 57
    iput-object p3, p0, Lcom/googlecode/mp4parser/boxes/dece/AssetInformationBox$Entry;->assetId:Ljava/lang/String;

    .line 58
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 75
    if-ne p0, p1, :cond_1

    .line 84
    :cond_0
    :goto_0
    return v0

    .line 76
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

    .line 78
    :cond_3
    check-cast p1, Lcom/googlecode/mp4parser/boxes/dece/AssetInformationBox$Entry;

    .line 80
    iget-object v2, p0, Lcom/googlecode/mp4parser/boxes/dece/AssetInformationBox$Entry;->assetId:Ljava/lang/String;

    iget-object v3, p1, Lcom/googlecode/mp4parser/boxes/dece/AssetInformationBox$Entry;->assetId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    move v0, v1

    goto :goto_0

    .line 81
    :cond_4
    iget-object v2, p0, Lcom/googlecode/mp4parser/boxes/dece/AssetInformationBox$Entry;->namespace:Ljava/lang/String;

    iget-object v3, p1, Lcom/googlecode/mp4parser/boxes/dece/AssetInformationBox$Entry;->namespace:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    move v0, v1

    goto :goto_0

    .line 82
    :cond_5
    iget-object v2, p0, Lcom/googlecode/mp4parser/boxes/dece/AssetInformationBox$Entry;->profileLevelIdc:Ljava/lang/String;

    iget-object v3, p1, Lcom/googlecode/mp4parser/boxes/dece/AssetInformationBox$Entry;->profileLevelIdc:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public getSize()I
    .locals 2

    .prologue
    .line 96
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/dece/AssetInformationBox$Entry;->namespace:Ljava/lang/String;

    invoke-static {v0}, Lcom/coremedia/iso/Utf8;->utf8StringLengthInBytes(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    .line 97
    iget-object v1, p0, Lcom/googlecode/mp4parser/boxes/dece/AssetInformationBox$Entry;->profileLevelIdc:Ljava/lang/String;

    invoke-static {v1}, Lcom/coremedia/iso/Utf8;->utf8StringLengthInBytes(Ljava/lang/String;)I

    move-result v1

    .line 96
    add-int/2addr v0, v1

    .line 97
    iget-object v1, p0, Lcom/googlecode/mp4parser/boxes/dece/AssetInformationBox$Entry;->assetId:Ljava/lang/String;

    invoke-static {v1}, Lcom/coremedia/iso/Utf8;->utf8StringLengthInBytes(Ljava/lang/String;)I

    move-result v1

    .line 96
    add-int/2addr v0, v1

    return v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 89
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/dece/AssetInformationBox$Entry;->namespace:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    .line 90
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/googlecode/mp4parser/boxes/dece/AssetInformationBox$Entry;->profileLevelIdc:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 91
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/googlecode/mp4parser/boxes/dece/AssetInformationBox$Entry;->assetId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 92
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    const/16 v2, 0x27

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{namespace=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    iget-object v1, p0, Lcom/googlecode/mp4parser/boxes/dece/AssetInformationBox$Entry;->namespace:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 68
    const-string v1, ", profileLevelIdc=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/googlecode/mp4parser/boxes/dece/AssetInformationBox$Entry;->profileLevelIdc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 69
    const-string v1, ", assetId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/googlecode/mp4parser/boxes/dece/AssetInformationBox$Entry;->assetId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 70
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
