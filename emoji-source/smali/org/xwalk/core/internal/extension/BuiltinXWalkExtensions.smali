.class public Lorg/xwalk/core/internal/extension/BuiltinXWalkExtensions;
.super Ljava/lang/Object;
.source "BuiltinXWalkExtensions.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "BuiltinXWalkExtension"

.field private static sBuiltinExtensions:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lorg/xwalk/core/internal/XWalkExtensionInternal;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/xwalk/core/internal/extension/BuiltinXWalkExtensions;->sBuiltinExtensions:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static getExtensionJSFileContent(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 12
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "fileName"    # Ljava/lang/String;
    .param p2, "fromRaw"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 97
    const-string v7, ""

    .line 98
    .local v7, "result":Ljava/lang/String;
    const/4 v3, 0x0

    .line 100
    .local v3, "inputStream":Ljava/io/InputStream;
    if-eqz p2, :cond_0

    .line 103
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    .line 104
    .local v6, "resource":Landroid/content/res/Resources;
    new-instance v9, Ljava/io/File;

    invoke-direct {v9, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v9

    const-string v10, "\\."

    invoke-virtual {v9, v10}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    aget-object v5, v9, v10

    .line 105
    .local v5, "resName":Ljava/lang/String;
    const-string v9, "raw"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v5, v9, v10}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v4

    .line 106
    .local v4, "resId":I
    if-lez v4, :cond_0

    .line 108
    :try_start_1
    invoke-virtual {v6, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v3

    .line 115
    .end local v4    # "resId":I
    .end local v5    # "resName":Ljava/lang/String;
    .end local v6    # "resource":Landroid/content/res/Resources;
    :cond_0
    :goto_0
    if-nez v3, :cond_1

    .line 116
    :try_start_2
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    .line 117
    .local v0, "assetManager":Landroid/content/res/AssetManager;
    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v3

    .line 119
    .end local v0    # "assetManager":Landroid/content/res/AssetManager;
    :cond_1
    invoke-virtual {v3}, Ljava/io/InputStream;->available()I

    move-result v8

    .line 120
    .local v8, "size":I
    new-array v1, v8, [B

    .line 121
    .local v1, "buffer":[B
    invoke-virtual {v3, v1}, Ljava/io/InputStream;->read([B)I

    .line 122
    new-instance v7, Ljava/lang/String;

    .end local v7    # "result":Ljava/lang/String;
    invoke-direct {v7, v1}, Ljava/lang/String;-><init>([B)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 124
    .restart local v7    # "result":Ljava/lang/String;
    if-eqz v3, :cond_2

    .line 125
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 128
    :cond_2
    return-object v7

    .line 109
    .end local v1    # "buffer":[B
    .end local v8    # "size":I
    .restart local v4    # "resId":I
    .restart local v5    # "resName":Ljava/lang/String;
    .restart local v6    # "resource":Landroid/content/res/Resources;
    :catch_0
    move-exception v2

    .line 110
    .local v2, "e":Landroid/content/res/Resources$NotFoundException;
    :try_start_3
    const-string v9, "BuiltinXWalkExtension"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Inputstream failed to open for R.raw."

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, ", try to find it in assets"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 124
    .end local v2    # "e":Landroid/content/res/Resources$NotFoundException;
    .end local v4    # "resId":I
    .end local v5    # "resName":Ljava/lang/String;
    .end local v6    # "resource":Landroid/content/res/Resources;
    .end local v7    # "result":Ljava/lang/String;
    :catchall_0
    move-exception v9

    if-eqz v3, :cond_3

    .line 125
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    :cond_3
    throw v9
.end method

.method public static load(Landroid/content/Context;Landroid/app/Activity;)V
    .locals 5
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 34
    const-string v1, ""

    .line 36
    .local v1, "jsApiContent":Ljava/lang/String;
    :try_start_0
    const-string v2, "jsapi/presentation_api.js"

    const/4 v3, 0x1

    invoke-static {p0, v2, v3}, Lorg/xwalk/core/internal/extension/BuiltinXWalkExtensions;->getExtensionJSFileContent(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    .line 38
    sget-object v2, Lorg/xwalk/core/internal/extension/BuiltinXWalkExtensions;->sBuiltinExtensions:Ljava/util/HashMap;

    const-string v3, "jsapi/presentation_api.js"

    new-instance v4, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;

    invoke-direct {v4, v1, p1}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;-><init>(Ljava/lang/String;Landroid/app/Activity;)V

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    :goto_0
    const-string v1, ""

    .line 48
    :try_start_1
    const-string v2, "jsapi/launch_screen_api.js"

    const/4 v3, 0x1

    invoke-static {p0, v2, v3}, Lorg/xwalk/core/internal/extension/BuiltinXWalkExtensions;->getExtensionJSFileContent(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    .line 50
    sget-object v2, Lorg/xwalk/core/internal/extension/BuiltinXWalkExtensions;->sBuiltinExtensions:Ljava/util/HashMap;

    const-string v3, "jsapi/launch_screen_api.js"

    new-instance v4, Lorg/xwalk/core/internal/extension/api/launchscreen/LaunchScreenExtension;

    invoke-direct {v4, v1, p1}, Lorg/xwalk/core/internal/extension/api/launchscreen/LaunchScreenExtension;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 58
    :goto_1
    const-string v1, ""

    .line 60
    :try_start_2
    const-string v2, "jsapi/contacts_api.js"

    const/4 v3, 0x1

    invoke-static {p0, v2, v3}, Lorg/xwalk/core/internal/extension/BuiltinXWalkExtensions;->getExtensionJSFileContent(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    .line 62
    sget-object v2, Lorg/xwalk/core/internal/extension/BuiltinXWalkExtensions;->sBuiltinExtensions:Ljava/util/HashMap;

    const-string v3, "jsapi/contacts_api.js"

    new-instance v4, Lorg/xwalk/core/internal/extension/api/contacts/Contacts;

    invoke-direct {v4, v1, p1}, Lorg/xwalk/core/internal/extension/api/contacts/Contacts;-><init>(Ljava/lang/String;Landroid/app/Activity;)V

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 70
    :goto_2
    const-string v1, ""

    .line 72
    :try_start_3
    const-string v2, "jsapi/device_capabilities_api.js"

    const/4 v3, 0x1

    invoke-static {p0, v2, v3}, Lorg/xwalk/core/internal/extension/BuiltinXWalkExtensions;->getExtensionJSFileContent(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    .line 74
    sget-object v2, Lorg/xwalk/core/internal/extension/BuiltinXWalkExtensions;->sBuiltinExtensions:Ljava/util/HashMap;

    const-string v3, "jsapi/device_capabilities_api.js"

    new-instance v4, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;

    invoke-direct {v4, v1, p1}, Lorg/xwalk/core/internal/extension/api/device_capabilities/DeviceCapabilities;-><init>(Ljava/lang/String;Landroid/app/Activity;)V

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 82
    :goto_3
    const-string v1, ""

    .line 84
    :try_start_4
    const-string v2, "jsapi/messaging_api.js"

    const/4 v3, 0x1

    invoke-static {p0, v2, v3}, Lorg/xwalk/core/internal/extension/BuiltinXWalkExtensions;->getExtensionJSFileContent(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    .line 86
    sget-object v2, Lorg/xwalk/core/internal/extension/BuiltinXWalkExtensions;->sBuiltinExtensions:Ljava/util/HashMap;

    const-string v3, "jsapi/messaging_api.js"

    new-instance v4, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;

    invoke-direct {v4, v1, p1}, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;-><init>(Ljava/lang/String;Landroid/app/Activity;)V

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    .line 92
    :goto_4
    return-void

    .line 40
    :catch_0
    move-exception v0

    .line 41
    .local v0, "e":Ljava/io/IOException;
    const-string v2, "BuiltinXWalkExtension"

    const-string v3, "Failed to read JS API file: jsapi/presentation_api.js"

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 52
    .end local v0    # "e":Ljava/io/IOException;
    :catch_1
    move-exception v0

    .line 53
    .restart local v0    # "e":Ljava/io/IOException;
    const-string v2, "BuiltinXWalkExtension"

    const-string v3, "Failed to read JS API file: jsapi/launch_screen_api.js"

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 64
    .end local v0    # "e":Ljava/io/IOException;
    :catch_2
    move-exception v0

    .line 65
    .restart local v0    # "e":Ljava/io/IOException;
    const-string v2, "BuiltinXWalkExtension"

    const-string v3, "Failed to read JS API file: jsapi/contacts_api.js"

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 76
    .end local v0    # "e":Ljava/io/IOException;
    :catch_3
    move-exception v0

    .line 77
    .restart local v0    # "e":Ljava/io/IOException;
    const-string v2, "BuiltinXWalkExtension"

    const-string v3, "Failed to read JS API file: jsapi/device_capabilities_api.js"

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    .line 88
    .end local v0    # "e":Ljava/io/IOException;
    :catch_4
    move-exception v0

    .line 89
    .restart local v0    # "e":Ljava/io/IOException;
    const-string v2, "BuiltinXWalkExtension"

    const-string v3, "Failed to read JS API file: jsapi/messaging_api.js"

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4
.end method
