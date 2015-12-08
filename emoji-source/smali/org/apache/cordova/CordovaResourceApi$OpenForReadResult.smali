.class public final Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;
.super Ljava/lang/Object;
.source "CordovaResourceApi.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/cordova/CordovaResourceApi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OpenForReadResult"
.end annotation


# instance fields
.field public final assetFd:Landroid/content/res/AssetFileDescriptor;

.field public final inputStream:Ljava/io/InputStream;

.field public final length:J

.field public final mimeType:Ljava/lang/String;

.field public final uri:Landroid/net/Uri;


# direct methods
.method constructor <init>(Landroid/net/Uri;Ljava/io/InputStream;Ljava/lang/String;JLandroid/content/res/AssetFileDescriptor;)V
    .locals 0
    .param p1, "uri"    # Landroid/net/Uri;
    .param p2, "inputStream"    # Ljava/io/InputStream;
    .param p3, "mimeType"    # Ljava/lang/String;
    .param p4, "length"    # J
    .param p6, "assetFd"    # Landroid/content/res/AssetFileDescriptor;

    .prologue
    .line 439
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 440
    iput-object p1, p0, Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;->uri:Landroid/net/Uri;

    .line 441
    iput-object p2, p0, Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;->inputStream:Ljava/io/InputStream;

    .line 442
    iput-object p3, p0, Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;->mimeType:Ljava/lang/String;

    .line 443
    iput-wide p4, p0, Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;->length:J

    .line 444
    iput-object p6, p0, Lorg/apache/cordova/CordovaResourceApi$OpenForReadResult;->assetFd:Landroid/content/res/AssetFileDescriptor;

    .line 445
    return-void
.end method
