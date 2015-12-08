.class final Lorg/chromium/net/X509Util$TrustStorageListener;
.super Landroid/content/BroadcastReceiver;
.source "X509Util.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/net/X509Util;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "TrustStorageListener"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/chromium/net/X509Util$1;)V
    .locals 0
    .param p1, "x0"    # Lorg/chromium/net/X509Util$1;

    .prologue
    .line 53
    invoke-direct {p0}, Lorg/chromium/net/X509Util$TrustStorageListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 55
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    const-string v2, "android.security.STORAGE_CHANGED"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 57
    :try_start_0
    # invokes: Lorg/chromium/net/X509Util;->reloadDefaultTrustManager()V
    invoke-static {}, Lorg/chromium/net/X509Util;->access$000()V
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_2

    .line 66
    :cond_0
    :goto_0
    return-void

    .line 58
    :catch_0
    move-exception v0

    .line 59
    .local v0, "e":Ljava/security/cert/CertificateException;
    const-string v1, "X509Util"

    const-string v2, "Unable to reload the default TrustManager"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 60
    .end local v0    # "e":Ljava/security/cert/CertificateException;
    :catch_1
    move-exception v0

    .line 61
    .local v0, "e":Ljava/security/KeyStoreException;
    const-string v1, "X509Util"

    const-string v2, "Unable to reload the default TrustManager"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 62
    .end local v0    # "e":Ljava/security/KeyStoreException;
    :catch_2
    move-exception v0

    .line 63
    .local v0, "e":Ljava/security/NoSuchAlgorithmException;
    const-string v1, "X509Util"

    const-string v2, "Unable to reload the default TrustManager"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method
