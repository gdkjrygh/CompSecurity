.class public Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;
.super Ljava/lang/Object;
.source "POIDetail.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/model/POIDetail;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Asset"
.end annotation


# static fields
.field public static final ASSET_TYPE_IMAGE:Ljava/lang/String; = "image_uri"

.field public static final ASSET_TYPE_MEMBER_POIS:Ljava/lang/String; = "member_pois"

.field public static final ASSET_TYPE_VIDEO:Ljava/lang/String; = "video_hls_uri"


# instance fields
.field private asset_body:Ljava/lang/String;

.field private asset_id:Ljava/lang/String;

.field private asset_title:Ljava/lang/String;

.field private asset_type:Ljava/lang/String;

.field final synthetic this$0:Lcom/aetn/history/android/historyhere/model/POIDetail;


# direct methods
.method public constructor <init>(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 203
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->this$0:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$002(Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 203
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->asset_type:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$102(Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 203
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->asset_title:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$202(Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 203
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->asset_body:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public getImageCredit()Ljava/lang/String;
    .locals 3

    .prologue
    .line 228
    const-string v0, ""

    .line 229
    .local v0, "credit":Ljava/lang/String;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->asset_title:Ljava/lang/String;

    const-string v2, "null"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 230
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->asset_title:Ljava/lang/String;

    .line 232
    :cond_0
    return-object v0
.end method

.method public getImageURL()Ljava/lang/String;
    .locals 1

    .prologue
    .line 225
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->asset_body:Ljava/lang/String;

    return-object v0
.end method

.method public getTourPois()Ljava/lang/String;
    .locals 3

    .prologue
    .line 222
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->asset_body:Ljava/lang/String;

    const-string v1, " "

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isAssetTypeImage()Z
    .locals 2

    .prologue
    .line 218
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->asset_type:Ljava/lang/String;

    const-string v1, "image_uri"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public isAssetTypeTourPois()Z
    .locals 2

    .prologue
    .line 214
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POIDetail$Asset;->asset_type:Ljava/lang/String;

    const-string v1, "member_pois"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
