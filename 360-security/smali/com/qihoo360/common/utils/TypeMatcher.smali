.class public Lcom/qihoo360/common/utils/TypeMatcher;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static final FILE_TYPE_APK:I = 0x3

.field public static final FILE_TYPE_DOCUMENT:I = 0x4

.field public static final FILE_TYPE_IMAGE:I = 0x0

.field public static final FILE_TYPE_MUSIC:I = 0x1

.field public static final FILE_TYPE_UNKNOWN:I = -0x1

.field public static final FILE_TYPE_VIEDO:I = 0x2

.field private static a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x4

    const/4 v2, 0x2

    const/4 v1, 0x1

    .line 16
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/qihoo360/common/utils/TypeMatcher;->a:Ljava/util/HashMap;

    .line 20
    const-string/jumbo v0, "JPG"

    invoke-static {v0, v4}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 21
    const-string/jumbo v0, "JPEG"

    invoke-static {v0, v4}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 22
    const-string/jumbo v0, "GIF"

    invoke-static {v0, v4}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 23
    const-string/jumbo v0, "PNG"

    invoke-static {v0, v4}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 24
    const-string/jumbo v0, "BMP"

    invoke-static {v0, v4}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 25
    const-string/jumbo v0, "WBMP"

    invoke-static {v0, v4}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 26
    const-string/jumbo v0, "PSD"

    invoke-static {v0, v4}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 27
    const-string/jumbo v0, "SVG"

    invoke-static {v0, v4}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 30
    const-string/jumbo v0, "MP3"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 31
    const-string/jumbo v0, "M4A"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 32
    const-string/jumbo v0, "WAV"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 33
    const-string/jumbo v0, "AMR"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 34
    const-string/jumbo v0, "AWB"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 35
    const-string/jumbo v0, "WMA"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 36
    const-string/jumbo v0, "OGG"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 37
    const-string/jumbo v0, "OGA"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 38
    const-string/jumbo v0, "AAC"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 39
    const-string/jumbo v0, "MKA"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 40
    const-string/jumbo v0, "APE"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 41
    const-string/jumbo v0, "FLAC"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 44
    const-string/jumbo v0, "MID"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 45
    const-string/jumbo v0, "MIDI"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 46
    const-string/jumbo v0, "XMF"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 47
    const-string/jumbo v0, "RTTTL"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 48
    const-string/jumbo v0, "SMF"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 49
    const-string/jumbo v0, "IMY"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 50
    const-string/jumbo v0, "RTX"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 51
    const-string/jumbo v0, "OTA"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 52
    const-string/jumbo v0, "MXMF"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 55
    const-string/jumbo v0, "MPEG"

    invoke-static {v0, v2}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 56
    const-string/jumbo v0, "MP4"

    invoke-static {v0, v2}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 57
    const-string/jumbo v0, "M4V"

    invoke-static {v0, v2}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 58
    const-string/jumbo v0, "3GP"

    invoke-static {v0, v2}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 59
    const-string/jumbo v0, "3GPP"

    invoke-static {v0, v2}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 60
    const-string/jumbo v0, "3G2"

    invoke-static {v0, v2}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 61
    const-string/jumbo v0, "3GPP2"

    invoke-static {v0, v2}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 62
    const-string/jumbo v0, "MKV"

    invoke-static {v0, v2}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 63
    const-string/jumbo v0, "WEBM"

    invoke-static {v0, v2}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 64
    const-string/jumbo v0, "TS"

    invoke-static {v0, v2}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 65
    const-string/jumbo v0, "WMV"

    invoke-static {v0, v2}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 66
    const-string/jumbo v0, "ASF"

    invoke-static {v0, v2}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 67
    const-string/jumbo v0, "FLV"

    invoke-static {v0, v2}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 68
    const-string/jumbo v0, "AVI"

    invoke-static {v0, v2}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 69
    const-string/jumbo v0, "RM"

    invoke-static {v0, v2}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 70
    const-string/jumbo v0, "RMVB"

    invoke-static {v0, v2}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 71
    const-string/jumbo v0, "MPG"

    invoke-static {v0, v2}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 72
    const-string/jumbo v0, "VOB"

    invoke-static {v0, v2}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 73
    const-string/jumbo v0, "MOV"

    invoke-static {v0, v2}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 74
    const-string/jumbo v0, "TP"

    invoke-static {v0, v2}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 77
    const-string/jumbo v0, "APK"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 80
    const-string/jumbo v0, "TXT"

    invoke-static {v0, v3}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 81
    const-string/jumbo v0, "DOC"

    invoke-static {v0, v3}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 82
    const-string/jumbo v0, "DOCX"

    invoke-static {v0, v3}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 83
    const-string/jumbo v0, "PDF"

    invoke-static {v0, v3}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 84
    const-string/jumbo v0, "CHM"

    invoke-static {v0, v3}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 85
    const-string/jumbo v0, "EPUB"

    invoke-static {v0, v3}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 86
    const-string/jumbo v0, "XLS"

    invoke-static {v0, v3}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 87
    const-string/jumbo v0, "XLSX"

    invoke-static {v0, v3}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 88
    const-string/jumbo v0, "PPT"

    invoke-static {v0, v3}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 89
    const-string/jumbo v0, "PPTX"

    invoke-static {v0, v3}, Lcom/qihoo360/common/utils/TypeMatcher;->a(Ljava/lang/String;I)V

    .line 90
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 93
    sget-object v0, Lcom/qihoo360/common/utils/TypeMatcher;->a:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    return-void
.end method

.method public static getFileType(Ljava/io/File;)I
    .locals 2

    .prologue
    const/4 v0, -0x1

    .line 97
    if-nez p0, :cond_1

    .line 106
    :cond_0
    :goto_0
    return v0

    .line 100
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 103
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_0

    .line 106
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/common/utils/TypeMatcher;->getFileType(Ljava/lang/String;)I

    move-result v0

    goto :goto_0
.end method

.method public static getFileType(Ljava/lang/String;)I
    .locals 3

    .prologue
    const/4 v1, -0x1

    .line 110
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 122
    :goto_0
    return v0

    .line 114
    :cond_0
    const-string/jumbo v0, "."

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    .line 115
    if-gez v0, :cond_1

    move v0, v1

    .line 116
    goto :goto_0

    .line 118
    :cond_1
    sget-object v2, Lcom/qihoo360/common/utils/TypeMatcher;->a:Ljava/util/HashMap;

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 119
    if-nez v0, :cond_2

    move v0, v1

    .line 120
    goto :goto_0

    .line 122
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0
.end method

.method public static isAudioFile(Ljava/io/File;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 149
    invoke-static {p0}, Lcom/qihoo360/common/utils/TypeMatcher;->getFileType(Ljava/io/File;)I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static isDocFile(Ljava/io/File;)Z
    .locals 2

    .prologue
    .line 145
    invoke-static {p0}, Lcom/qihoo360/common/utils/TypeMatcher;->getFileType(Ljava/io/File;)I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static isMediaFile(Ljava/io/File;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 126
    invoke-static {p0}, Lcom/qihoo360/common/utils/TypeMatcher;->getFileType(Ljava/io/File;)I

    move-result v1

    .line 128
    const/4 v2, 0x4

    if-eq v1, v2, :cond_0

    if-eqz v1, :cond_0

    .line 129
    if-eq v1, v0, :cond_0

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    .line 132
    :cond_0
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static isPictureFile(Ljava/io/File;)Z
    .locals 1

    .prologue
    .line 141
    invoke-static {p0}, Lcom/qihoo360/common/utils/TypeMatcher;->getFileType(Ljava/io/File;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static isVideoFile(Ljava/io/File;)Z
    .locals 2

    .prologue
    .line 137
    invoke-static {p0}, Lcom/qihoo360/common/utils/TypeMatcher;->getFileType(Ljava/io/File;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
