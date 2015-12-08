.class Lcom/aetn/history/android/historyhere/fragment/MapFragment$15;
.super Ljava/lang/Object;
.source "MapFragment.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapFragment;->initToUsersLocation(Landroid/location/Location;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/aetn/history/android/historyhere/model/POIDetail;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 538
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$15;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/aetn/history/android/historyhere/model/POIDetail;Lcom/aetn/history/android/historyhere/model/POIDetail;)I
    .locals 4
    .param p1, "p1"    # Lcom/aetn/history/android/historyhere/model/POIDetail;
    .param p2, "p2"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 541
    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getDistance()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getDistance()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 538
    check-cast p1, Lcom/aetn/history/android/historyhere/model/POIDetail;

    check-cast p2, Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {p0, p1, p2}, Lcom/aetn/history/android/historyhere/fragment/MapFragment$15;->compare(Lcom/aetn/history/android/historyhere/model/POIDetail;Lcom/aetn/history/android/historyhere/model/POIDetail;)I

    move-result v0

    return v0
.end method
