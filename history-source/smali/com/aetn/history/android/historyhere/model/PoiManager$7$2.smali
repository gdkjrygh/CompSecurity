.class Lcom/aetn/history/android/historyhere/model/PoiManager$7$2;
.super Ljava/lang/Object;
.source "PoiManager.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/model/PoiManager$7;->onResponse(Ljava/lang/String;)V
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
        "Lcom/aetn/history/android/historyhere/model/POI;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/aetn/history/android/historyhere/model/PoiManager$7;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/model/PoiManager$7;)V
    .locals 0
    .param p1, "this$1"    # Lcom/aetn/history/android/historyhere/model/PoiManager$7;

    .prologue
    .line 618
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PoiManager$7$2;->this$1:Lcom/aetn/history/android/historyhere/model/PoiManager$7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/aetn/history/android/historyhere/model/POI;Lcom/aetn/history/android/historyhere/model/POI;)I
    .locals 2
    .param p1, "p1"    # Lcom/aetn/history/android/historyhere/model/POI;
    .param p2, "p2"    # Lcom/aetn/history/android/historyhere/model/POI;

    .prologue
    .line 621
    invoke-virtual {p1}, Lcom/aetn/history/android/historyhere/model/POI;->getCity()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/aetn/history/android/historyhere/model/POI;->getCity()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 618
    check-cast p1, Lcom/aetn/history/android/historyhere/model/POI;

    check-cast p2, Lcom/aetn/history/android/historyhere/model/POI;

    invoke-virtual {p0, p1, p2}, Lcom/aetn/history/android/historyhere/model/PoiManager$7$2;->compare(Lcom/aetn/history/android/historyhere/model/POI;Lcom/aetn/history/android/historyhere/model/POI;)I

    move-result v0

    return v0
.end method
