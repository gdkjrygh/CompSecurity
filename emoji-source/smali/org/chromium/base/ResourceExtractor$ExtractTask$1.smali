.class Lorg/chromium/base/ResourceExtractor$ExtractTask$1;
.super Ljava/lang/Object;
.source "ResourceExtractor.java"

# interfaces
.implements Ljava/io/FilenameFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/base/ResourceExtractor$ExtractTask;->checkPakTimestamp(Ljava/io/File;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lorg/chromium/base/ResourceExtractor$ExtractTask;


# direct methods
.method constructor <init>(Lorg/chromium/base/ResourceExtractor$ExtractTask;)V
    .locals 0

    .prologue
    .line 233
    iput-object p1, p0, Lorg/chromium/base/ResourceExtractor$ExtractTask$1;->this$1:Lorg/chromium/base/ResourceExtractor$ExtractTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 1
    .param p1, "dir"    # Ljava/io/File;
    .param p2, "name"    # Ljava/lang/String;

    .prologue
    .line 236
    const-string v0, "pak_timestamp-"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
