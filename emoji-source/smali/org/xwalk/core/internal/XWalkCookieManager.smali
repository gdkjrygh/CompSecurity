.class public final Lorg/xwalk/core/internal/XWalkCookieManager;
.super Ljava/lang/Object;
.source "XWalkCookieManager.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "xwalk"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private native nativeAcceptCookie()Z
.end method

.method private native nativeAllowFileSchemeCookies()Z
.end method

.method private native nativeFlushCookieStore()V
.end method

.method private native nativeGetCookie(Ljava/lang/String;)Ljava/lang/String;
.end method

.method private native nativeHasCookies()Z
.end method

.method private native nativeRemoveAllCookie()V
.end method

.method private native nativeRemoveExpiredCookie()V
.end method

.method private native nativeRemoveSessionCookie()V
.end method

.method private native nativeSetAcceptCookie(Z)V
.end method

.method private native nativeSetAcceptFileSchemeCookies(Z)V
.end method

.method private native nativeSetCookie(Ljava/lang/String;Ljava/lang/String;)V
.end method


# virtual methods
.method public acceptCookie()Z
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkCookieManager;->nativeAcceptCookie()Z

    move-result v0

    return v0
.end method

.method public allowFileSchemeCookies()Z
    .locals 1

    .prologue
    .line 93
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkCookieManager;->nativeAllowFileSchemeCookies()Z

    move-result v0

    return v0
.end method

.method public flushCookieStore()V
    .locals 0

    .prologue
    .line 86
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkCookieManager;->nativeFlushCookieStore()V

    .line 87
    return-void
.end method

.method public getCookie(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 52
    invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lorg/xwalk/core/internal/XWalkCookieManager;->nativeGetCookie(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 54
    .local v0, "cookie":Ljava/lang/String;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    .end local v0    # "cookie":Ljava/lang/String;
    :cond_1
    return-object v0
.end method

.method public hasCookies()Z
    .locals 1

    .prologue
    .line 75
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkCookieManager;->nativeHasCookies()Z

    move-result v0

    return v0
.end method

.method public removeAllCookie()V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkCookieManager;->nativeRemoveAllCookie()V

    .line 69
    return-void
.end method

.method public removeExpiredCookie()V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkCookieManager;->nativeRemoveExpiredCookie()V

    .line 83
    return-void
.end method

.method public removeSessionCookie()V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Lorg/xwalk/core/internal/XWalkCookieManager;->nativeRemoveSessionCookie()V

    .line 62
    return-void
.end method

.method public setAcceptCookie(Z)V
    .locals 0
    .param p1, "accept"    # Z

    .prologue
    .line 23
    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/XWalkCookieManager;->nativeSetAcceptCookie(Z)V

    .line 24
    return-void
.end method

.method public setAcceptFileSchemeCookies(Z)V
    .locals 0
    .param p1, "accept"    # Z

    .prologue
    .line 107
    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/XWalkCookieManager;->nativeSetAcceptFileSchemeCookies(Z)V

    .line 108
    return-void
.end method

.method public setCookie(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 42
    invoke-direct {p0, p1, p2}, Lorg/xwalk/core/internal/XWalkCookieManager;->nativeSetCookie(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    return-void
.end method
