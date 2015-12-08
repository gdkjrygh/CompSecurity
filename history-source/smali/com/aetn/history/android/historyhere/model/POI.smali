.class public Lcom/aetn/history/android/historyhere/model/POI;
.super Ljava/lang/Object;
.source "POI.java"

# interfaces
.implements Lcom/google/maps/android/clustering/ClusterItem;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aetn/history/android/historyhere/model/POI$Address;,
        Lcom/aetn/history/android/historyhere/model/POI$Location;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final TAG:Ljava/lang/String;

.field private address:Lcom/aetn/history/android/historyhere/model/POI$Address;

.field private category:Ljava/lang/String;

.field private distance:J

.field private id:Ljava/lang/String;

.field private image:Ljava/lang/String;

.field private lat:D

.field private lng:D

.field private location:Lcom/aetn/history/android/historyhere/model/POI$Location;

.field private poi_id:Ljava/lang/String;

.field private short_description:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 6

    .prologue
    const-wide/16 v2, 0x0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const-string v0, "POI"

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->TAG:Ljava/lang/String;

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->title:Ljava/lang/String;

    .line 17
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->short_description:Ljava/lang/String;

    .line 18
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->image:Ljava/lang/String;

    .line 19
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->category:Ljava/lang/String;

    .line 22
    new-instance v0, Lcom/aetn/history/android/historyhere/model/POI$Address;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/model/POI$Address;-><init>(Lcom/aetn/history/android/historyhere/model/POI;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->address:Lcom/aetn/history/android/historyhere/model/POI$Address;

    .line 29
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->poi_id:Ljava/lang/String;

    .line 30
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->title:Ljava/lang/String;

    .line 31
    new-instance v0, Lcom/aetn/history/android/historyhere/model/POI$Location;

    move-object v1, p0

    move-wide v4, v2

    invoke-direct/range {v0 .. v5}, Lcom/aetn/history/android/historyhere/model/POI$Location;-><init>(Lcom/aetn/history/android/historyhere/model/POI;DD)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->location:Lcom/aetn/history/android/historyhere/model/POI$Location;

    .line 32
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->distance:J

    .line 33
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->short_description:Ljava/lang/String;

    .line 34
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->image:Ljava/lang/String;

    .line 35
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->category:Ljava/lang/String;

    .line 36
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/aetn/history/android/historyhere/model/POI$Location;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "poi_id"    # Ljava/lang/String;
    .param p2, "title"    # Ljava/lang/String;
    .param p3, "location"    # Lcom/aetn/history/android/historyhere/model/POI$Location;
    .param p4, "distance"    # I
    .param p5, "short_description"    # Ljava/lang/String;
    .param p6, "image"    # Ljava/lang/String;
    .param p7, "category"    # Ljava/lang/String;

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const-string v0, "POI"

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->TAG:Ljava/lang/String;

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->title:Ljava/lang/String;

    .line 17
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->short_description:Ljava/lang/String;

    .line 18
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->image:Ljava/lang/String;

    .line 19
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->category:Ljava/lang/String;

    .line 22
    new-instance v0, Lcom/aetn/history/android/historyhere/model/POI$Address;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/model/POI$Address;-><init>(Lcom/aetn/history/android/historyhere/model/POI;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->address:Lcom/aetn/history/android/historyhere/model/POI$Address;

    .line 46
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POI;->poi_id:Ljava/lang/String;

    .line 47
    iput-object p2, p0, Lcom/aetn/history/android/historyhere/model/POI;->title:Ljava/lang/String;

    .line 48
    iput-object p3, p0, Lcom/aetn/history/android/historyhere/model/POI;->location:Lcom/aetn/history/android/historyhere/model/POI$Location;

    .line 49
    int-to-long v0, p4

    iput-wide v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->distance:J

    .line 50
    iput-object p5, p0, Lcom/aetn/history/android/historyhere/model/POI;->short_description:Ljava/lang/String;

    .line 51
    iput-object p6, p0, Lcom/aetn/history/android/historyhere/model/POI;->image:Ljava/lang/String;

    .line 52
    iput-object p7, p0, Lcom/aetn/history/android/historyhere/model/POI;->category:Ljava/lang/String;

    .line 53
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/aetn/history/android/historyhere/model/POI$Location;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V
    .locals 2
    .param p1, "poi_id"    # Ljava/lang/String;
    .param p2, "title"    # Ljava/lang/String;
    .param p3, "location"    # Lcom/aetn/history/android/historyhere/model/POI$Location;
    .param p4, "distance"    # I
    .param p5, "short_description"    # Ljava/lang/String;
    .param p6, "image"    # Ljava/lang/String;
    .param p7, "category"    # Ljava/lang/String;
    .param p8, "id"    # Ljava/lang/String;
    .param p9, "lat"    # D
    .param p11, "lng"    # D

    .prologue
    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const-string v0, "POI"

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->TAG:Ljava/lang/String;

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->title:Ljava/lang/String;

    .line 17
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->short_description:Ljava/lang/String;

    .line 18
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->image:Ljava/lang/String;

    .line 19
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->category:Ljava/lang/String;

    .line 22
    new-instance v0, Lcom/aetn/history/android/historyhere/model/POI$Address;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/model/POI$Address;-><init>(Lcom/aetn/history/android/historyhere/model/POI;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->address:Lcom/aetn/history/android/historyhere/model/POI$Address;

    .line 66
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POI;->poi_id:Ljava/lang/String;

    .line 67
    iput-object p2, p0, Lcom/aetn/history/android/historyhere/model/POI;->title:Ljava/lang/String;

    .line 68
    iput-object p3, p0, Lcom/aetn/history/android/historyhere/model/POI;->location:Lcom/aetn/history/android/historyhere/model/POI$Location;

    .line 69
    int-to-long v0, p4

    iput-wide v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->distance:J

    .line 70
    iput-object p5, p0, Lcom/aetn/history/android/historyhere/model/POI;->short_description:Ljava/lang/String;

    .line 71
    iput-object p6, p0, Lcom/aetn/history/android/historyhere/model/POI;->image:Ljava/lang/String;

    .line 72
    iput-object p7, p0, Lcom/aetn/history/android/historyhere/model/POI;->category:Ljava/lang/String;

    .line 73
    iput-object p8, p0, Lcom/aetn/history/android/historyhere/model/POI;->id:Ljava/lang/String;

    .line 74
    iput-wide p9, p0, Lcom/aetn/history/android/historyhere/model/POI;->lat:D

    .line 75
    iput-wide p11, p0, Lcom/aetn/history/android/historyhere/model/POI;->lng:D

    .line 76
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;)V
    .locals 2
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "title"    # Ljava/lang/String;
    .param p3, "short_description"    # Ljava/lang/String;
    .param p4, "category"    # Ljava/lang/String;
    .param p5, "latitude"    # D
    .param p7, "longitude"    # D
    .param p9, "image"    # Ljava/lang/String;

    .prologue
    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const-string v0, "POI"

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->TAG:Ljava/lang/String;

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->title:Ljava/lang/String;

    .line 17
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->short_description:Ljava/lang/String;

    .line 18
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->image:Ljava/lang/String;

    .line 19
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->category:Ljava/lang/String;

    .line 22
    new-instance v0, Lcom/aetn/history/android/historyhere/model/POI$Address;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/model/POI$Address;-><init>(Lcom/aetn/history/android/historyhere/model/POI;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->address:Lcom/aetn/history/android/historyhere/model/POI$Address;

    .line 87
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POI;->poi_id:Ljava/lang/String;

    .line 88
    iput-object p2, p0, Lcom/aetn/history/android/historyhere/model/POI;->title:Ljava/lang/String;

    .line 89
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->distance:J

    .line 90
    iput-object p3, p0, Lcom/aetn/history/android/historyhere/model/POI;->short_description:Ljava/lang/String;

    .line 91
    iput-object p9, p0, Lcom/aetn/history/android/historyhere/model/POI;->image:Ljava/lang/String;

    .line 92
    iput-object p4, p0, Lcom/aetn/history/android/historyhere/model/POI;->category:Ljava/lang/String;

    .line 93
    new-instance v0, Lcom/aetn/history/android/historyhere/model/POI$Location;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/model/POI$Location;-><init>(Lcom/aetn/history/android/historyhere/model/POI;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->location:Lcom/aetn/history/android/historyhere/model/POI$Location;

    .line 94
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->location:Lcom/aetn/history/android/historyhere/model/POI$Location;

    iput-wide p5, v0, Lcom/aetn/history/android/historyhere/model/POI$Location;->lat:D

    .line 95
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->location:Lcom/aetn/history/android/historyhere/model/POI$Location;

    iput-wide p7, v0, Lcom/aetn/history/android/historyhere/model/POI$Location;->lng:D

    .line 97
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "object"    # Ljava/lang/Object;

    .prologue
    .line 101
    const/4 v1, 0x0

    .local v1, "result":Z
    move-object v0, p1

    .line 105
    check-cast v0, Lcom/aetn/history/android/historyhere/model/POI;

    .line 106
    .local v0, "p":Lcom/aetn/history/android/historyhere/model/POI;
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POI;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/POI;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 107
    const/4 v1, 0x1

    .line 110
    :cond_0
    return v1
.end method

.method public getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;
    .locals 1

    .prologue
    .line 202
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->address:Lcom/aetn/history/android/historyhere/model/POI$Address;

    return-object v0
.end method

.method public getCity()Ljava/lang/String;
    .locals 1

    .prologue
    .line 188
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POI;->getAddress()Lcom/aetn/history/android/historyhere/model/POI$Address;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/POI$Address;->getCity()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCityStateString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 206
    const-string v0, ", "

    .line 207
    .local v0, "separator":Ljava/lang/String;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/model/POI;->address:Lcom/aetn/history/android/historyhere/model/POI$Address;

    # getter for: Lcom/aetn/history/android/historyhere/model/POI$Address;->city:Ljava/lang/String;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/model/POI$Address;->access$200(Lcom/aetn/history/android/historyhere/model/POI$Address;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/model/POI;->address:Lcom/aetn/history/android/historyhere/model/POI$Address;

    # getter for: Lcom/aetn/history/android/historyhere/model/POI$Address;->state:Ljava/lang/String;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/model/POI$Address;->access$300(Lcom/aetn/history/android/historyhere/model/POI$Address;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 208
    .local v1, "str":Ljava/lang/String;
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 209
    const-string v1, ""

    .line 211
    :cond_0
    return-object v1
.end method

.method public getDistance()J
    .locals 2

    .prologue
    .line 152
    iget-wide v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->distance:J

    return-wide v0
.end method

.method public getFormattedAddress()Ljava/lang/String;
    .locals 10

    .prologue
    .line 217
    const-string v0, ""

    .line 219
    .local v0, "address":Ljava/lang/String;
    :try_start_0
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/model/POI;->address:Lcom/aetn/history/android/historyhere/model/POI$Address;

    # getter for: Lcom/aetn/history/android/historyhere/model/POI$Address;->address1:Ljava/lang/String;
    invoke-static {v7}, Lcom/aetn/history/android/historyhere/model/POI$Address;->access$000(Lcom/aetn/history/android/historyhere/model/POI$Address;)Ljava/lang/String;

    move-result-object v1

    .line 220
    .local v1, "address1":Ljava/lang/String;
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/model/POI;->address:Lcom/aetn/history/android/historyhere/model/POI$Address;

    # getter for: Lcom/aetn/history/android/historyhere/model/POI$Address;->address2:Ljava/lang/String;
    invoke-static {v7}, Lcom/aetn/history/android/historyhere/model/POI$Address;->access$100(Lcom/aetn/history/android/historyhere/model/POI$Address;)Ljava/lang/String;

    move-result-object v2

    .line 221
    .local v2, "address2":Ljava/lang/String;
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/model/POI;->address:Lcom/aetn/history/android/historyhere/model/POI$Address;

    # getter for: Lcom/aetn/history/android/historyhere/model/POI$Address;->city:Ljava/lang/String;
    invoke-static {v7}, Lcom/aetn/history/android/historyhere/model/POI$Address;->access$200(Lcom/aetn/history/android/historyhere/model/POI$Address;)Ljava/lang/String;

    move-result-object v3

    .line 222
    .local v3, "city":Ljava/lang/String;
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/model/POI;->address:Lcom/aetn/history/android/historyhere/model/POI$Address;

    # getter for: Lcom/aetn/history/android/historyhere/model/POI$Address;->state:Ljava/lang/String;
    invoke-static {v7}, Lcom/aetn/history/android/historyhere/model/POI$Address;->access$300(Lcom/aetn/history/android/historyhere/model/POI$Address;)Ljava/lang/String;

    move-result-object v5

    .line 223
    .local v5, "state":Ljava/lang/String;
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/model/POI;->address:Lcom/aetn/history/android/historyhere/model/POI$Address;

    # getter for: Lcom/aetn/history/android/historyhere/model/POI$Address;->zip:Ljava/lang/String;
    invoke-static {v7}, Lcom/aetn/history/android/historyhere/model/POI$Address;->access$400(Lcom/aetn/history/android/historyhere/model/POI$Address;)Ljava/lang/String;

    move-result-object v6

    .line 225
    .local v6, "zip":Ljava/lang/String;
    const-string v7, ""

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    .line 226
    move-object v0, v1

    .line 228
    :cond_0
    const-string v7, ""

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1

    .line 229
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "\n"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 232
    :cond_1
    const-string v7, ""

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const-string v7, ""

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    .line 233
    :cond_2
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "\n"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 235
    :cond_3
    const-string v7, ""

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    .line 236
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 238
    const-string v7, ""

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    .line 239
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ","

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 242
    :cond_4
    const-string v7, ""

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    .line 243
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 245
    :cond_5
    const-string v7, ""

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    .line 246
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 251
    .end local v1    # "address1":Ljava/lang/String;
    .end local v2    # "address2":Ljava/lang/String;
    .end local v3    # "city":Ljava/lang/String;
    .end local v5    # "state":Ljava/lang/String;
    .end local v6    # "zip":Ljava/lang/String;
    :cond_6
    :goto_0
    return-object v0

    .line 248
    :catch_0
    move-exception v4

    .line 249
    .local v4, "e":Ljava/lang/Exception;
    const-string v7, "POI"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "getFormattedAddress the error was:"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v4}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public getHtmlFormattedAddress()Ljava/lang/String;
    .locals 3

    .prologue
    .line 255
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POI;->getFormattedAddress()Ljava/lang/String;

    move-result-object v0

    .line 256
    .local v0, "address":Ljava/lang/String;
    const-string v1, "\n"

    const-string v2, "<br/>"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->id:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 119
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->id:Ljava/lang/String;

    .line 121
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->poi_id:Ljava/lang/String;

    goto :goto_0
.end method

.method public getImage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 180
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->image:Ljava/lang/String;

    return-object v0
.end method

.method public getLatitude()D
    .locals 2

    .prologue
    .line 145
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POI;->getLocation()Lcom/aetn/history/android/historyhere/model/POI$Location;

    move-result-object v0

    iget-wide v0, v0, Lcom/aetn/history/android/historyhere/model/POI$Location;->lat:D

    return-wide v0
.end method

.method public getLocation()Lcom/aetn/history/android/historyhere/model/POI$Location;
    .locals 3

    .prologue
    .line 129
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->location:Lcom/aetn/history/android/historyhere/model/POI$Location;

    if-nez v0, :cond_0

    .line 130
    new-instance v0, Lcom/aetn/history/android/historyhere/model/POI$Location;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/model/POI$Location;-><init>(Lcom/aetn/history/android/historyhere/model/POI;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->location:Lcom/aetn/history/android/historyhere/model/POI$Location;

    .line 131
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->location:Lcom/aetn/history/android/historyhere/model/POI$Location;

    iget-wide v1, p0, Lcom/aetn/history/android/historyhere/model/POI;->lat:D

    iput-wide v1, v0, Lcom/aetn/history/android/historyhere/model/POI$Location;->lat:D

    .line 132
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->location:Lcom/aetn/history/android/historyhere/model/POI$Location;

    iget-wide v1, p0, Lcom/aetn/history/android/historyhere/model/POI;->lng:D

    iput-wide v1, v0, Lcom/aetn/history/android/historyhere/model/POI$Location;->lng:D

    .line 134
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->location:Lcom/aetn/history/android/historyhere/model/POI$Location;

    return-object v0
.end method

.method public getLongitude()D
    .locals 2

    .prologue
    .line 149
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POI;->getLocation()Lcom/aetn/history/android/historyhere/model/POI$Location;

    move-result-object v0

    iget-wide v0, v0, Lcom/aetn/history/android/historyhere/model/POI$Location;->lng:D

    return-wide v0
.end method

.method public getMileageString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 159
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POI;->getDistance()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->convertMetersToMiles(J)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    .line 160
    .local v0, "miles":Ljava/lang/String;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "M"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public getPosition()Lcom/google/android/gms/maps/model/LatLng;
    .locals 6

    .prologue
    .line 323
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/model/POI;->getLocation()Lcom/aetn/history/android/historyhere/model/POI$Location;

    move-result-object v0

    .line 324
    .local v0, "l":Lcom/aetn/history/android/historyhere/model/POI$Location;
    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v2, v0, Lcom/aetn/history/android/historyhere/model/POI$Location;->lat:D

    iget-wide v4, v0, Lcom/aetn/history/android/historyhere/model/POI$Location;->lng:D

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    return-object v1
.end method

.method public getShortDescription()Ljava/lang/String;
    .locals 1

    .prologue
    .line 172
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->short_description:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->title:Ljava/lang/String;

    return-object v0
.end method

.method public setAddress(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "address1"    # Ljava/lang/String;
    .param p2, "address2"    # Ljava/lang/String;
    .param p3, "city"    # Ljava/lang/String;
    .param p4, "state"    # Ljava/lang/String;
    .param p5, "zip"    # Ljava/lang/String;

    .prologue
    .line 192
    new-instance v0, Lcom/aetn/history/android/historyhere/model/POI$Address;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/model/POI$Address;-><init>(Lcom/aetn/history/android/historyhere/model/POI;)V

    .line 193
    .local v0, "a":Lcom/aetn/history/android/historyhere/model/POI$Address;
    # setter for: Lcom/aetn/history/android/historyhere/model/POI$Address;->address1:Ljava/lang/String;
    invoke-static {v0, p1}, Lcom/aetn/history/android/historyhere/model/POI$Address;->access$002(Lcom/aetn/history/android/historyhere/model/POI$Address;Ljava/lang/String;)Ljava/lang/String;

    .line 194
    # setter for: Lcom/aetn/history/android/historyhere/model/POI$Address;->address2:Ljava/lang/String;
    invoke-static {v0, p2}, Lcom/aetn/history/android/historyhere/model/POI$Address;->access$102(Lcom/aetn/history/android/historyhere/model/POI$Address;Ljava/lang/String;)Ljava/lang/String;

    .line 195
    # setter for: Lcom/aetn/history/android/historyhere/model/POI$Address;->city:Ljava/lang/String;
    invoke-static {v0, p3}, Lcom/aetn/history/android/historyhere/model/POI$Address;->access$202(Lcom/aetn/history/android/historyhere/model/POI$Address;Ljava/lang/String;)Ljava/lang/String;

    .line 196
    # setter for: Lcom/aetn/history/android/historyhere/model/POI$Address;->state:Ljava/lang/String;
    invoke-static {v0, p4}, Lcom/aetn/history/android/historyhere/model/POI$Address;->access$302(Lcom/aetn/history/android/historyhere/model/POI$Address;Ljava/lang/String;)Ljava/lang/String;

    .line 197
    # setter for: Lcom/aetn/history/android/historyhere/model/POI$Address;->zip:Ljava/lang/String;
    invoke-static {v0, p5}, Lcom/aetn/history/android/historyhere/model/POI$Address;->access$402(Lcom/aetn/history/android/historyhere/model/POI$Address;Ljava/lang/String;)Ljava/lang/String;

    .line 198
    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->address:Lcom/aetn/history/android/historyhere/model/POI$Address;

    .line 199
    return-void
.end method

.method public setDistance(J)V
    .locals 0
    .param p1, "distance"    # J

    .prologue
    .line 155
    iput-wide p1, p0, Lcom/aetn/history/android/historyhere/model/POI;->distance:J

    .line 156
    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 126
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POI;->poi_id:Ljava/lang/String;

    .line 127
    return-void
.end method

.method public setImage(Ljava/lang/String;)V
    .locals 0
    .param p1, "image"    # Ljava/lang/String;

    .prologue
    .line 184
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POI;->image:Ljava/lang/String;

    .line 185
    return-void
.end method

.method public setLocation(DD)V
    .locals 1
    .param p1, "lat"    # D
    .param p3, "lng"    # D

    .prologue
    .line 137
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->location:Lcom/aetn/history/android/historyhere/model/POI$Location;

    if-nez v0, :cond_0

    .line 138
    new-instance v0, Lcom/aetn/history/android/historyhere/model/POI$Location;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/model/POI$Location;-><init>(Lcom/aetn/history/android/historyhere/model/POI;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->location:Lcom/aetn/history/android/historyhere/model/POI$Location;

    .line 140
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->location:Lcom/aetn/history/android/historyhere/model/POI$Location;

    iput-wide p1, v0, Lcom/aetn/history/android/historyhere/model/POI$Location;->lat:D

    .line 141
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI;->location:Lcom/aetn/history/android/historyhere/model/POI$Location;

    iput-wide p3, v0, Lcom/aetn/history/android/historyhere/model/POI$Location;->lng:D

    .line 142
    return-void
.end method

.method public setShortDescription(Ljava/lang/String;)V
    .locals 0
    .param p1, "s"    # Ljava/lang/String;

    .prologue
    .line 176
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POI;->short_description:Ljava/lang/String;

    .line 177
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 168
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POI;->title:Ljava/lang/String;

    .line 169
    return-void
.end method
