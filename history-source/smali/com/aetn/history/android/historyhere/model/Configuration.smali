.class public Lcom/aetn/history/android/historyhere/model/Configuration;
.super Ljava/lang/Object;
.source "Configuration.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aetn/history/android/historyhere/model/Configuration$RateViewPrompting;,
        Lcom/aetn/history/android/historyhere/model/Configuration$Email;,
        Lcom/aetn/history/android/historyhere/model/Configuration$ShareTemplates;,
        Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;,
        Lcom/aetn/history/android/historyhere/model/Configuration$Values;,
        Lcom/aetn/history/android/historyhere/model/Configuration$Crittercisms;,
        Lcom/aetn/history/android/historyhere/model/Configuration$Localytics;
    }
.end annotation


# instance fields
.field public crittercisms:Lcom/aetn/history/android/historyhere/model/Configuration$Crittercisms;

.field public daysBetweenUpdateReminder:I

.field public initialMapViewPOICount:I

.field public localytics:Lcom/aetn/history/android/historyhere/model/Configuration$Localytics;

.field public minimumVersion:Ljava/lang/String;

.field public notificationVersion:Ljava/lang/String;

.field public playStoreURL:Ljava/lang/String;

.field public poiDatabaseRefreshDate:Ljava/lang/String;

.field public poiServiceHost:Ljava/lang/String;

.field public rateAppPrompting:Lcom/aetn/history/android/historyhere/model/Configuration$RateViewPrompting;

.field public requiredToNotify:Z

.field public shareTemplates:Lcom/aetn/history/android/historyhere/model/Configuration$ShareTemplates;

.field public shareURL:Ljava/lang/String;

.field public sponsorImageDisplaySecs:I

.field public sponsorImageURL:Ljava/lang/String;

.field public suggestServiceHost:Ljava/lang/String;

.field public supriseMeQualityMin:I

.field public tourSponsorData:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/Configuration$TourSponsorData;",
            ">;"
        }
    .end annotation
.end field

.field public version:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/Configuration;->poiServiceHost:Ljava/lang/String;

    .line 8
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/Configuration;->suggestServiceHost:Ljava/lang/String;

    .line 11
    const-string v0, "2014-01-01"

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/Configuration;->poiDatabaseRefreshDate:Ljava/lang/String;

    .line 12
    iput v1, p0, Lcom/aetn/history/android/historyhere/model/Configuration;->supriseMeQualityMin:I

    .line 13
    iput v1, p0, Lcom/aetn/history/android/historyhere/model/Configuration;->initialMapViewPOICount:I

    .line 22
    const/16 v0, 0xa

    iput v0, p0, Lcom/aetn/history/android/historyhere/model/Configuration;->daysBetweenUpdateReminder:I

    .line 24
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/Configuration;->shareURL:Ljava/lang/String;

    .line 61
    return-void
.end method
