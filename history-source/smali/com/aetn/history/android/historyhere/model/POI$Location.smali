.class public Lcom/aetn/history/android/historyhere/model/POI$Location;
.super Ljava/lang/Object;
.source "POI.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/model/POI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Location"
.end annotation


# instance fields
.field public lat:D

.field public lng:D

.field final synthetic this$0:Lcom/aetn/history/android/historyhere/model/POI;


# direct methods
.method public constructor <init>(Lcom/aetn/history/android/historyhere/model/POI;)V
    .locals 2
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/model/POI;

    .prologue
    .line 264
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POI$Location;->this$0:Lcom/aetn/history/android/historyhere/model/POI;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 265
    iget-wide v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Location;->lat:D

    iput-wide v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Location;->lat:D

    .line 266
    iget-wide v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Location;->lng:D

    iput-wide v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Location;->lng:D

    .line 267
    return-void
.end method

.method public constructor <init>(Lcom/aetn/history/android/historyhere/model/POI;DD)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/model/POI;
    .param p2, "lat"    # D
    .param p4, "lng"    # D

    .prologue
    .line 268
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POI$Location;->this$0:Lcom/aetn/history/android/historyhere/model/POI;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 269
    iput-wide p2, p0, Lcom/aetn/history/android/historyhere/model/POI$Location;->lat:D

    .line 270
    iput-wide p4, p0, Lcom/aetn/history/android/historyhere/model/POI$Location;->lng:D

    .line 271
    return-void
.end method
