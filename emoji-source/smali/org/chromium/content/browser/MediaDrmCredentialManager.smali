.class public Lorg/chromium/content/browser/MediaDrmCredentialManager;
.super Ljava/lang/Object;
.source "MediaDrmCredentialManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/content/browser/MediaDrmCredentialManager$MediaDrmCredentialManagerCallback;
    }
.end annotation

.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "content"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    return-void
.end method

.method private static native nativeResetCredentials(Lorg/chromium/content/browser/MediaDrmCredentialManager$MediaDrmCredentialManagerCallback;)V
.end method

.method public static resetCredentials(Lorg/chromium/content/browser/MediaDrmCredentialManager$MediaDrmCredentialManagerCallback;)V
    .locals 0
    .param p0, "callback"    # Lorg/chromium/content/browser/MediaDrmCredentialManager$MediaDrmCredentialManagerCallback;

    .prologue
    .line 33
    invoke-static {p0}, Lorg/chromium/content/browser/MediaDrmCredentialManager;->nativeResetCredentials(Lorg/chromium/content/browser/MediaDrmCredentialManager$MediaDrmCredentialManagerCallback;)V

    .line 34
    return-void
.end method
