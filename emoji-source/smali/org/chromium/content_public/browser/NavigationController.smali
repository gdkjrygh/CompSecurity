.class public interface abstract Lorg/chromium/content_public/browser/NavigationController;
.super Ljava/lang/Object;
.source "NavigationController.java"


# virtual methods
.method public abstract canGoBack()Z
.end method

.method public abstract canGoForward()Z
.end method

.method public abstract canGoToOffset(I)Z
.end method

.method public abstract cancelPendingReload()V
.end method

.method public abstract clearHistory()V
    .annotation build Lorg/chromium/base/VisibleForTesting;
    .end annotation
.end method

.method public abstract clearSslPreferences()V
.end method

.method public abstract continuePendingReload()V
.end method

.method public abstract getDirectedNavigationHistory(ZI)Lorg/chromium/content_public/browser/NavigationHistory;
.end method

.method public abstract getNavigationHistory()Lorg/chromium/content_public/browser/NavigationHistory;
.end method

.method public abstract getOriginalUrlForVisibleNavigationEntry()Ljava/lang/String;
.end method

.method public abstract getPendingEntry()Lorg/chromium/content_public/browser/NavigationEntry;
.end method

.method public abstract getUseDesktopUserAgent()Z
.end method

.method public abstract goBack()V
.end method

.method public abstract goForward()V
.end method

.method public abstract goToNavigationIndex(I)V
.end method

.method public abstract goToOffset(I)V
.end method

.method public abstract loadIfNecessary()V
.end method

.method public abstract loadUrl(Lorg/chromium/content_public/browser/LoadUrlParams;)V
.end method

.method public abstract reload(Z)V
.end method

.method public abstract reloadIgnoringCache(Z)V
.end method

.method public abstract requestRestoreLoad()V
.end method

.method public abstract setUseDesktopUserAgent(ZZ)V
.end method
