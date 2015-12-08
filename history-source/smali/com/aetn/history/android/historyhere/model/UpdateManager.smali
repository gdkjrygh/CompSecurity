.class public Lcom/aetn/history/android/historyhere/model/UpdateManager;
.super Ljava/lang/Object;
.source "UpdateManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aetn/history/android/historyhere/model/UpdateManager$GetUpdateService;
    }
.end annotation


# static fields
.field public static final KEY_CONFIG_UPDATE_DETAILS:Ljava/lang/String; = "latestVersionDetails"

.field public static final KEY_CONFIG_VERSION:Ljava/lang/String; = "versionNumber"

.field public static final KEY_FACEBOOK_SHARE_LOGO_URL:Ljava/lang/String; = "facebookShareLogoURL"

.field public static final KEY_PROMO_URL:Ljava/lang/String; = "promoURL"

.field public static final KEY_SPONSOR_IMAGE_URL:Ljava/lang/String; = "sponsorImageURL"

.field public static final KEY_UPDATE_URL:Ljava/lang/String; = "latestVersionURL"

.field private static final TAG:Ljava/lang/String; = "UpdateManager"

.field public static final UPDATE_DATA_KEY:Ljava/lang/String; = "updateData"

.field public static final UPDATE_DATA_RECEIVED:Ljava/lang/String; = "update data received"


# instance fields
.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    return-void
.end method

.method static synthetic access$000(Lcom/aetn/history/android/historyhere/model/UpdateManager;)Landroid/content/Context;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/UpdateManager;

    .prologue
    .line 16
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/UpdateManager;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method private static isLatestVersion(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4
    .param p0, "currentVersion"    # Ljava/lang/String;
    .param p1, "comparetoVersion"    # Ljava/lang/String;

    .prologue
    .line 99
    invoke-static {p0}, Lcom/aetn/history/android/historyhere/model/UpdateManager;->normalisedVersion(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 100
    .local v1, "s1":Ljava/lang/String;
    invoke-static {p1}, Lcom/aetn/history/android/historyhere/model/UpdateManager;->normalisedVersion(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 101
    .local v2, "s2":Ljava/lang/String;
    invoke-virtual {v1, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    .line 102
    .local v0, "cmp":I
    if-gez v0, :cond_0

    .line 103
    const/4 v3, 0x0

    .line 105
    :goto_0
    return v3

    :cond_0
    const/4 v3, 0x1

    goto :goto_0
.end method

.method public static normalisedVersion(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "version"    # Ljava/lang/String;

    .prologue
    .line 115
    const-string v0, "."

    const/4 v1, 0x4

    invoke-static {p0, v0, v1}, Lcom/aetn/history/android/historyhere/model/UpdateManager;->normalisedVersion(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static normalisedVersion(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 8
    .param p0, "version"    # Ljava/lang/String;
    .param p1, "sep"    # Ljava/lang/String;
    .param p2, "maxWidth"    # I

    .prologue
    const/4 v4, 0x0

    .line 119
    const/16 v3, 0x10

    invoke-static {p1, v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object v2

    .line 120
    .local v2, "split":[Ljava/lang/String;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    .local v1, "sb":Ljava/lang/StringBuilder;
    array-length v5, v2

    move v3, v4

    :goto_0
    if-ge v3, v5, :cond_0

    aget-object v0, v2, v3

    .line 122
    .local v0, "s":Ljava/lang/String;
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "%"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const/16 v7, 0x73

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v0, v7, v4

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 124
    .end local v0    # "s":Ljava/lang/String;
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    return-object v3
.end method


# virtual methods
.method public updateConfig(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "_currentVersion"    # Ljava/lang/String;

    .prologue
    .line 33
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/UpdateManager;->mContext:Landroid/content/Context;

    .line 34
    new-instance v0, Lcom/aetn/history/android/historyhere/model/UpdateManager$GetUpdateService;

    invoke-direct {v0, p0}, Lcom/aetn/history/android/historyhere/model/UpdateManager$GetUpdateService;-><init>(Lcom/aetn/history/android/historyhere/model/UpdateManager;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/model/UpdateManager$GetUpdateService;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 35
    return-void
.end method
