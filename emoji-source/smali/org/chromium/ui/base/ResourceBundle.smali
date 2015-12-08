.class Lorg/chromium/ui/base/ResourceBundle;
.super Ljava/lang/Object;
.source "ResourceBundle.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "ui"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static assetContainedInApk(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 4
    .param p0, "ctx"    # Landroid/content/Context;
    .param p1, "filename"    # Ljava/lang/String;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 24
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    .line 25
    .local v1, "am":Landroid/content/res/AssetManager;
    invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v0

    .line 26
    .local v0, "afd":Landroid/content/res/AssetFileDescriptor;
    invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    const/4 v3, 0x1

    .line 29
    .end local v0    # "afd":Landroid/content/res/AssetFileDescriptor;
    .end local v1    # "am":Landroid/content/res/AssetManager;
    :goto_0
    return v3

    .line 28
    :catch_0
    move-exception v2

    .line 29
    .local v2, "e":Ljava/io/IOException;
    const/4 v3, 0x0

    goto :goto_0
.end method
