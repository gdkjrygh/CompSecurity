.class public Lcom/aetn/history/android/historyhere/model/POIDetail;
.super Lcom/aetn/history/android/historyhere/model/POI;
.source "POIDetail.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;,
        Lcom/aetn/history/android/historyhere/model/POIDetail$PhoneNumber;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "POIDetail"

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private asset:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;",
            ">;"
        }
    .end annotation
.end field

.field private description:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "body"
    .end annotation
.end field

.field private era:Ljava/lang/String;

.field private imageCredit:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "image_credit"
    .end annotation
.end field

.field private inactive:Z

.field private key:Ljava/lang/String;

.field private modified_time:Ljava/lang/String;

.field private phoneNumber:Lcom/aetn/history/android/historyhere/model/POIDetail$PhoneNumber;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "phone_number"
    .end annotation
.end field

.field private quality:I

.field private tags:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private tourListString:Ljava/lang/String;

.field private website:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "reference"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/aetn/history/android/historyhere/model/POI;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/aetn/history/android/historyhere/model/POI$Location;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/aetn/history/android/historyhere/model/POI$Address;Lcom/aetn/history/android/historyhere/model/POIDetail$PhoneNumber;Ljava/lang/String;)V
    .locals 9
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "title"    # Ljava/lang/String;
    .param p3, "location"    # Lcom/aetn/history/android/historyhere/model/POI$Location;
    .param p4, "distance"    # I
    .param p5, "short_description"    # Ljava/lang/String;
    .param p6, "image"    # Ljava/lang/String;
    .param p7, "imageCredit"    # Ljava/lang/String;
    .param p8, "category"    # Ljava/lang/String;
    .param p9, "key"    # Ljava/lang/String;
    .param p10, "description"    # Ljava/lang/String;
    .param p11, "address"    # Lcom/aetn/history/android/historyhere/model/POI$Address;
    .param p12, "phoneNumber"    # Lcom/aetn/history/android/historyhere/model/POIDetail$PhoneNumber;
    .param p13, "website"    # Ljava/lang/String;

    .prologue
    .line 44
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p8

    invoke-direct/range {v1 .. v8}, Lcom/aetn/history/android/historyhere/model/POI;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/aetn/history/android/historyhere/model/POI$Location;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    move-object/from16 v0, p10

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->description:Ljava/lang/String;

    .line 46
    move-object/from16 v0, p9

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->key:Ljava/lang/String;

    .line 47
    move-object/from16 v0, p7

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->imageCredit:Ljava/lang/String;

    .line 48
    move-object/from16 v0, p12

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->phoneNumber:Lcom/aetn/history/android/historyhere/model/POIDetail$PhoneNumber;

    .line 49
    return-void
.end method


# virtual methods
.method public getAssets()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;",
            ">;"
        }
    .end annotation

    .prologue
    .line 140
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 141
    .local v1, "assets":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;>;"
    new-instance v0, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;-><init>(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 142
    .local v0, "a":Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;
    const-string v5, "image_uri"

    # setter for: Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->asset_type:Ljava/lang/String;
    invoke-static {v0, v5}, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->access$002(Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;Ljava/lang/String;)Ljava/lang/String;

    .line 143
    const-string v5, "http://mobileassets.aetndigital.com/history-here/132731.jpg"

    # setter for: Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->asset_title:Ljava/lang/String;
    invoke-static {v0, v5}, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->access$102(Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;Ljava/lang/String;)Ljava/lang/String;

    .line 144
    const-string v5, "\u00a9Corbis Images"

    # setter for: Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->asset_body:Ljava/lang/String;
    invoke-static {v0, v5}, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->access$202(Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;Ljava/lang/String;)Ljava/lang/String;

    .line 146
    new-instance v2, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;

    invoke-direct {v2, p0}, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;-><init>(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 147
    .local v2, "b":Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;
    const-string v5, "image_uri"

    # setter for: Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->asset_type:Ljava/lang/String;
    invoke-static {v2, v5}, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->access$002(Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;Ljava/lang/String;)Ljava/lang/String;

    .line 148
    const-string v5, "http://mobileassets.aetndigital.com/history-here/132747.jpg"

    # setter for: Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->asset_title:Ljava/lang/String;
    invoke-static {v2, v5}, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->access$102(Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;Ljava/lang/String;)Ljava/lang/String;

    .line 149
    const-string v5, "\u00a9Eliot Porter"

    # setter for: Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->asset_body:Ljava/lang/String;
    invoke-static {v2, v5}, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->access$202(Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;Ljava/lang/String;)Ljava/lang/String;

    .line 151
    new-instance v3, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;

    invoke-direct {v3, p0}, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;-><init>(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 152
    .local v3, "c":Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;
    const-string v5, "image_uri"

    # setter for: Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->asset_type:Ljava/lang/String;
    invoke-static {v3, v5}, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->access$002(Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;Ljava/lang/String;)Ljava/lang/String;

    .line 153
    const-string v5, "http://mobileassets.aetndigital.com/history-here/132789.jpg"

    # setter for: Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->asset_title:Ljava/lang/String;
    invoke-static {v3, v5}, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->access$102(Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;Ljava/lang/String;)Ljava/lang/String;

    .line 154
    const-string v5, "\u00a9Ansel Adams"

    # setter for: Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->asset_body:Ljava/lang/String;
    invoke-static {v3, v5}, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->access$202(Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;Ljava/lang/String;)Ljava/lang/String;

    .line 156
    new-instance v4, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;

    invoke-direct {v4, p0}, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;-><init>(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 157
    .local v4, "d":Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;
    const-string v5, "video_hls_uri"

    # setter for: Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->asset_type:Ljava/lang/String;
    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->access$002(Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;Ljava/lang/String;)Ljava/lang/String;

    .line 158
    const-string v5, "http://mobileassets.aetndigital.com/history-here/132789.mp3"

    # setter for: Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->asset_title:Ljava/lang/String;
    invoke-static {v4, v5}, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->access$102(Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;Ljava/lang/String;)Ljava/lang/String;

    .line 160
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->asset:Ljava/util/ArrayList;

    return-object v5
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getEra()Ljava/lang/String;
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->era:Ljava/lang/String;

    return-object v0
.end method

.method public getFormattedPhoneNumber()Ljava/lang/String;
    .locals 5

    .prologue
    .line 130
    const-string v2, ""

    .line 131
    .local v2, "phoneNum":Ljava/lang/String;
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->phoneNumber:Lcom/aetn/history/android/historyhere/model/POIDetail$PhoneNumber;

    iget-object v0, v3, Lcom/aetn/history/android/historyhere/model/POIDetail$PhoneNumber;->areacode:Ljava/lang/String;

    .line 132
    .local v0, "areacode":Ljava/lang/String;
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->phoneNumber:Lcom/aetn/history/android/historyhere/model/POIDetail$PhoneNumber;

    iget-object v1, v3, Lcom/aetn/history/android/historyhere/model/POIDetail$PhoneNumber;->digits:Ljava/lang/String;

    .line 133
    .local v1, "digits":Ljava/lang/String;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 134
    return-object v2
.end method

.method public getImageCredit()Ljava/lang/String;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->imageCredit:Ljava/lang/String;

    return-object v0
.end method

.method public getInactive()I
    .locals 2

    .prologue
    .line 84
    const/4 v0, 0x0

    .line 85
    .local v0, "i":I
    iget-boolean v1, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->inactive:Z

    if-eqz v1, :cond_0

    .line 86
    const/4 v0, 0x1

    .line 88
    :cond_0
    return v0
.end method

.method public getKey()Ljava/lang/String;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->key:Ljava/lang/String;

    return-object v0
.end method

.method public getModifiedTime()Ljava/lang/String;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->modified_time:Ljava/lang/String;

    return-object v0
.end method

.method public getPhoneNumber()Lcom/aetn/history/android/historyhere/model/POIDetail$PhoneNumber;
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->phoneNumber:Lcom/aetn/history/android/historyhere/model/POIDetail$PhoneNumber;

    return-object v0
.end method

.method public getPoiTourList()Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 179
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->asset:Ljava/util/ArrayList;

    if-nez v2, :cond_1

    .line 185
    :cond_0
    :goto_0
    return-object v1

    .line 180
    :cond_1
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->asset:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;

    .line 181
    .local v0, "a":Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;
    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->isAssetTypeTourPois()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 182
    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->getTourPois()Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method public getQuality()I
    .locals 1

    .prologue
    .line 76
    iget v0, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->quality:I

    return v0
.end method

.method public getTags()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 109
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->tags:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getTourListString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 193
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->tourListString:Ljava/lang/String;

    return-object v0
.end method

.method public getWebsite()Ljava/lang/String;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->website:Ljava/lang/String;

    return-object v0
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0
    .param p1, "description"    # Ljava/lang/String;

    .prologue
    .line 67
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->description:Ljava/lang/String;

    .line 68
    return-void
.end method

.method public setEra(Ljava/lang/String;)V
    .locals 0
    .param p1, "era"    # Ljava/lang/String;

    .prologue
    .line 118
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->era:Ljava/lang/String;

    .line 119
    return-void
.end method

.method public setImageCredit(Ljava/lang/String;)V
    .locals 0
    .param p1, "credit"    # Ljava/lang/String;

    .prologue
    .line 73
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->imageCredit:Ljava/lang/String;

    .line 74
    return-void
.end method

.method public setKey(Ljava/lang/String;)V
    .locals 0
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    .line 61
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->key:Ljava/lang/String;

    .line 62
    return-void
.end method

.method public setPhoneNumber(Lcom/aetn/history/android/historyhere/model/POIDetail$PhoneNumber;)V
    .locals 0
    .param p1, "phoneNumber"    # Lcom/aetn/history/android/historyhere/model/POIDetail$PhoneNumber;

    .prologue
    .line 98
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->phoneNumber:Lcom/aetn/history/android/historyhere/model/POIDetail$PhoneNumber;

    .line 99
    return-void
.end method

.method public setTags(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 112
    .local p1, "tags":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->tags:Ljava/util/ArrayList;

    .line 113
    return-void
.end method

.method public setTourListString(Ljava/lang/String;)V
    .locals 0
    .param p1, "str"    # Ljava/lang/String;

    .prologue
    .line 189
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->tourListString:Ljava/lang/String;

    .line 190
    return-void
.end method

.method public setWebsite(Ljava/lang/String;)V
    .locals 0
    .param p1, "website"    # Ljava/lang/String;

    .prologue
    .line 105
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POIDetail;->website:Ljava/lang/String;

    .line 106
    return-void
.end method
