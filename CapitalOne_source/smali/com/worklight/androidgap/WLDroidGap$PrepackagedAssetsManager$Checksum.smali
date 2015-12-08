.class Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager$Checksum;
.super Ljava/lang/Object;
.source "WLDroidGap.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "Checksum"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager$Checksum;",
        ">;"
    }
.end annotation


# instance fields
.field private checksum:Ljava/lang/String;

.field private date:Ljava/lang/Long;

.field private machine:Ljava/lang/String;

.field final synthetic this$1:Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;


# direct methods
.method public constructor <init>(Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;Lorg/json/JSONObject;)V
    .locals 2
    .param p2, "jsonObject"    # Lorg/json/JSONObject;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 549
    iput-object p1, p0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager$Checksum;->this$1:Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;

    .line 550
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 551
    const-string v0, "checksum"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager$Checksum;->checksum:Ljava/lang/String;

    .line 552
    const-string v0, "date"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager$Checksum;->date:Ljava/lang/Long;

    .line 553
    const-string v0, "machine"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager$Checksum;->machine:Ljava/lang/String;

    .line 554
    return-void
.end method


# virtual methods
.method public compareTo(Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager$Checksum;)I
    .locals 2
    .param p1, "another"    # Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager$Checksum;

    .prologue
    .line 571
    iget-object v0, p0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager$Checksum;->checksum:Ljava/lang/String;

    iget-object v1, p1, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager$Checksum;->checksum:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 572
    iget-object v0, p0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager$Checksum;->date:Ljava/lang/Long;

    iget-object v1, p1, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager$Checksum;->date:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    move-result v0

    .line 574
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager$Checksum;

    invoke-virtual {p0, p1}, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager$Checksum;->compareTo(Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager$Checksum;)I

    move-result v0

    return v0
.end method

.method public getChecksum()Ljava/lang/String;
    .locals 1

    .prologue
    .line 557
    iget-object v0, p0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager$Checksum;->checksum:Ljava/lang/String;

    return-object v0
.end method

.method public getDate()Ljava/lang/Long;
    .locals 1

    .prologue
    .line 561
    iget-object v0, p0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager$Checksum;->date:Ljava/lang/Long;

    return-object v0
.end method

.method public getMachine()Ljava/lang/String;
    .locals 1

    .prologue
    .line 565
    iget-object v0, p0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager$Checksum;->machine:Ljava/lang/String;

    return-object v0
.end method
