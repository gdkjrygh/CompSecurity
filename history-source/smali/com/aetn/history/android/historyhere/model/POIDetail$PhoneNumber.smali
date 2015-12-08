.class public Lcom/aetn/history/android/historyhere/model/POIDetail$PhoneNumber;
.super Ljava/lang/Object;
.source "POIDetail.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/model/POIDetail;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "PhoneNumber"
.end annotation


# instance fields
.field public areacode:Ljava/lang/String;

.field public digits:Ljava/lang/String;

.field final synthetic this$0:Lcom/aetn/history/android/historyhere/model/POIDetail;


# direct methods
.method public constructor <init>(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 198
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POIDetail$PhoneNumber;->this$0:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
