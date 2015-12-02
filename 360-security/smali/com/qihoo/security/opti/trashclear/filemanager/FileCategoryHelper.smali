.class public Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;
    }
.end annotation


# static fields
.field public static a:Ljava/lang/String;

.field public static b:Ljava/lang/String;

.field public static c:[Ljava/lang/String;

.field public static d:[Ljava/lang/String;

.field public static e:[Ljava/lang/String;

.field public static f:[Ljava/lang/String;

.field public static g:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 17
    const-string/jumbo v0, "apk"

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->a:Ljava/lang/String;

    .line 18
    const-string/jumbo v0, "mtz"

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->b:Ljava/lang/String;

    .line 19
    const/16 v0, 0xe

    new-array v0, v0, [Ljava/lang/String;

    const-string/jumbo v1, "log"

    aput-object v1, v0, v3

    const-string/jumbo v1, "xml"

    aput-object v1, v0, v4

    const-string/jumbo v1, "ini"

    aput-object v1, v0, v5

    const-string/jumbo v1, "lrc"

    aput-object v1, v0, v6

    const-string/jumbo v1, "txt"

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-string/jumbo v2, "doc"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string/jumbo v2, "docx"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string/jumbo v2, "pdf"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string/jumbo v2, "chm"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string/jumbo v2, "epub"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string/jumbo v2, "xls"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string/jumbo v2, "xlsx"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string/jumbo v2, "ppt"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string/jumbo v2, "pptx"

    aput-object v2, v0, v1

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->c:[Ljava/lang/String;

    .line 21
    new-array v0, v5, [Ljava/lang/String;

    const-string/jumbo v1, "zip"

    aput-object v1, v0, v3

    const-string/jumbo v1, "rar"

    aput-object v1, v0, v4

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->d:[Ljava/lang/String;

    .line 22
    const/16 v0, 0x17

    new-array v0, v0, [Ljava/lang/String;

    const-string/jumbo v1, "mpeg"

    aput-object v1, v0, v3

    const-string/jumbo v1, "mp4"

    aput-object v1, v0, v4

    const-string/jumbo v1, "m4v"

    aput-object v1, v0, v5

    const-string/jumbo v1, "3gp"

    aput-object v1, v0, v6

    const-string/jumbo v1, "3gpp"

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-string/jumbo v2, "3g2"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string/jumbo v2, "3gpp2"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string/jumbo v2, "mkv"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string/jumbo v2, "webm"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string/jumbo v2, "ts"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string/jumbo v2, "wmv"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string/jumbo v2, "asf"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string/jumbo v2, "avi"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string/jumbo v2, "flv"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string/jumbo v2, "rm"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string/jumbo v2, "rmvb"

    aput-object v2, v0, v1

    const/16 v1, 0x10

    const-string/jumbo v2, "mpg"

    aput-object v2, v0, v1

    const/16 v1, 0x11

    const-string/jumbo v2, "vob"

    aput-object v2, v0, v1

    const/16 v1, 0x12

    const-string/jumbo v2, "mov"

    aput-object v2, v0, v1

    const/16 v1, 0x13

    const-string/jumbo v2, "tp"

    aput-object v2, v0, v1

    const/16 v1, 0x14

    const-string/jumbo v2, "f4v"

    aput-object v2, v0, v1

    const/16 v1, 0x15

    const-string/jumbo v2, "bdv"

    aput-object v2, v0, v1

    const/16 v1, 0x16

    const-string/jumbo v2, "vdat"

    aput-object v2, v0, v1

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->e:[Ljava/lang/String;

    .line 25
    const/16 v0, 0x9

    new-array v0, v0, [Ljava/lang/String;

    const-string/jumbo v1, "jpg"

    aput-object v1, v0, v3

    const-string/jumbo v1, "jpeg"

    aput-object v1, v0, v4

    const-string/jumbo v1, "gif"

    aput-object v1, v0, v5

    const-string/jumbo v1, "png"

    aput-object v1, v0, v6

    const-string/jumbo v1, "bmp"

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-string/jumbo v2, "wbmp"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string/jumbo v2, "psd"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string/jumbo v2, "svg"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string/jumbo v2, "vsd"

    aput-object v2, v0, v1

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->f:[Ljava/lang/String;

    .line 28
    const/16 v0, 0xe

    new-array v0, v0, [Ljava/lang/String;

    const-string/jumbo v1, "mp3"

    aput-object v1, v0, v3

    const-string/jumbo v1, "wma"

    aput-object v1, v0, v4

    const-string/jumbo v1, "wav"

    aput-object v1, v0, v5

    const-string/jumbo v1, "mid"

    aput-object v1, v0, v6

    const-string/jumbo v1, "aac"

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-string/jumbo v2, "m4a"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string/jumbo v2, "amr"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string/jumbo v2, "awb"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string/jumbo v2, "ogg"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string/jumbo v2, "oga"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string/jumbo v2, "mka"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string/jumbo v2, "ape"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string/jumbo v2, "flac"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string/jumbo v2, "midi"

    aput-object v2, v0, v1

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->g:[Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;
    .locals 2

    .prologue
    .line 32
    const/16 v0, 0x2e

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    .line 33
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 34
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Other:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    .line 64
    :goto_0
    return-object v0

    .line 36
    :cond_0
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 37
    sget-object v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 38
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Apk:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    goto :goto_0

    .line 41
    :cond_1
    sget-object v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 42
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Theme:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    goto :goto_0

    .line 45
    :cond_2
    sget-object v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->c:[Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 46
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Doc:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    goto :goto_0

    .line 49
    :cond_3
    sget-object v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->d:[Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 50
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Zip:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    goto :goto_0

    .line 53
    :cond_4
    sget-object v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->e:[Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 54
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Video:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    goto :goto_0

    .line 57
    :cond_5
    sget-object v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->f:[Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 58
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Picture:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    goto :goto_0

    .line 61
    :cond_6
    sget-object v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->g:[Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 62
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Music:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    goto :goto_0

    .line 64
    :cond_7
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Other:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    goto :goto_0
.end method

.method private static a(Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 68
    array-length v2, p1

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, p1, v1

    .line 69
    invoke-virtual {v3, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 70
    const/4 v0, 0x1

    .line 72
    :cond_0
    return v0

    .line 68
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method
