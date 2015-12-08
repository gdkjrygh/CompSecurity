.class public Lcom/aetn/history/android/historyhere/model/TourDetailResponse$TourDetail;
.super Ljava/lang/Object;
.source "TourDetailResponse.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/model/TourDetailResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TourDetail"
.end annotation


# instance fields
.field private member_pois:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation
.end field

.field private poi_id:Ljava/lang/String;

.field short_description:Ljava/lang/String;

.field final synthetic this$0:Lcom/aetn/history/android/historyhere/model/TourDetailResponse;

.field title:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/aetn/history/android/historyhere/model/TourDetailResponse;)V
    .locals 1
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/model/TourDetailResponse;

    .prologue
    .line 15
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/TourDetailResponse$TourDetail;->this$0:Lcom/aetn/history/android/historyhere/model/TourDetailResponse;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/TourDetailResponse$TourDetail;->title:Ljava/lang/String;

    .line 17
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/TourDetailResponse$TourDetail;->short_description:Ljava/lang/String;

    .line 18
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/TourDetailResponse$TourDetail;->poi_id:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/TourDetailResponse$TourDetail;->poi_id:Ljava/lang/String;

    return-object v0
.end method

.method public getPois()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;"
        }
    .end annotation

    .prologue
    .line 34
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/TourDetailResponse$TourDetail;->member_pois:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getShortDescription()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/TourDetailResponse$TourDetail;->short_description:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/TourDetailResponse$TourDetail;->title:Ljava/lang/String;

    return-object v0
.end method
