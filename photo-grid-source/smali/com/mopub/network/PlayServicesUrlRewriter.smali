.class public Lcom/mopub/network/PlayServicesUrlRewriter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/volley/toolbox/HurlStack$UrlRewriter;


# static fields
.field public static final DO_NOT_TRACK_TEMPLATE:Ljava/lang/String; = "mp_tmpl_do_not_track"

.field public static final UDID_TEMPLATE:Ljava/lang/String; = "mp_tmpl_advertising_id"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/mopub/network/PlayServicesUrlRewriter;->a:Ljava/lang/String;

    .line 24
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/network/PlayServicesUrlRewriter;->b:Landroid/content/Context;

    .line 25
    return-void
.end method


# virtual methods
.method public rewriteUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 29
    const-string v0, "mp_tmpl_advertising_id"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "mp_tmpl_do_not_track"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 49
    :goto_0
    return-object p1

    .line 33
    :cond_0
    const-string v2, ""

    .line 34
    new-instance v1, Lcom/mopub/common/GpsHelper$AdvertisingInfo;

    iget-object v0, p0, Lcom/mopub/network/PlayServicesUrlRewriter;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v3}, Lcom/mopub/common/GpsHelper$AdvertisingInfo;-><init>(Ljava/lang/String;Z)V

    .line 37
    iget-object v0, p0, Lcom/mopub/network/PlayServicesUrlRewriter;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/mopub/common/GpsHelper;->isPlayServicesAvailable(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 39
    iget-object v0, p0, Lcom/mopub/network/PlayServicesUrlRewriter;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/mopub/common/GpsHelper;->fetchAdvertisingInfoSync(Landroid/content/Context;)Lcom/mopub/common/GpsHelper$AdvertisingInfo;

    move-result-object v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    const-string v1, "ifa:"

    .line 47
    :goto_1
    const-string v2, "mp_tmpl_advertising_id"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v3, v0, Lcom/mopub/common/GpsHelper$AdvertisingInfo;->advertisingId:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 48
    const-string v2, "mp_tmpl_do_not_track"

    iget-boolean v0, v0, Lcom/mopub/common/GpsHelper$AdvertisingInfo;->limitAdTracking:Z

    if-eqz v0, :cond_1

    const-string v0, "1"

    :goto_2
    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const-string v0, "0"

    goto :goto_2

    :cond_2
    move-object v0, v1

    move-object v1, v2

    goto :goto_1
.end method
