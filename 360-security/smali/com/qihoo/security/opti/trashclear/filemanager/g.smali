.class public final Lcom/qihoo/security/opti/trashclear/filemanager/g;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 14
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a:Ljava/util/Map;

    .line 16
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/g;->b:Ljava/util/Map;

    .line 19
    const-string/jumbo v0, "application/andrew-inset"

    const-string/jumbo v1, "ez"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    const-string/jumbo v0, "application/dsptype"

    const-string/jumbo v1, "tsp"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    const-string/jumbo v0, "application/futuresplash"

    const-string/jumbo v1, "spl"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    const-string/jumbo v0, "application/hta"

    const-string/jumbo v1, "hta"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    const-string/jumbo v0, "application/mac-binhex40"

    const-string/jumbo v1, "hqx"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    const-string/jumbo v0, "application/mac-compactpro"

    const-string/jumbo v1, "cpt"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    const-string/jumbo v0, "application/mathematica"

    const-string/jumbo v1, "nb"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    const-string/jumbo v0, "application/msaccess"

    const-string/jumbo v1, "mdb"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    const-string/jumbo v0, "application/oda"

    const-string/jumbo v1, "oda"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    const-string/jumbo v0, "application/ogg"

    const-string/jumbo v1, "ogg"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    const-string/jumbo v0, "application/pdf"

    const-string/jumbo v1, "pdf"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    const-string/jumbo v0, "application/pgp-keys"

    const-string/jumbo v1, "key"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    const-string/jumbo v0, "application/pgp-signature"

    const-string/jumbo v1, "pgp"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    const-string/jumbo v0, "application/pics-rules"

    const-string/jumbo v1, "prf"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    const-string/jumbo v0, "application/rar"

    const-string/jumbo v1, "rar"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    const-string/jumbo v0, "application/rdf+xml"

    const-string/jumbo v1, "rdf"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    const-string/jumbo v0, "application/rss+xml"

    const-string/jumbo v1, "rss"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    const-string/jumbo v0, "application/zip"

    const-string/jumbo v1, "zip"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    const-string/jumbo v0, "application/vnd.android.package-archive"

    const-string/jumbo v1, "apk"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    const-string/jumbo v0, "application/vnd.cinderella"

    const-string/jumbo v1, "cdy"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    const-string/jumbo v0, "application/vnd.ms-pki.stl"

    const-string/jumbo v1, "stl"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    const-string/jumbo v0, "application/vnd.oasis.opendocument.database"

    const-string/jumbo v1, "odb"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    const-string/jumbo v0, "application/vnd.oasis.opendocument.formula"

    const-string/jumbo v1, "odf"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    const-string/jumbo v0, "application/vnd.oasis.opendocument.graphics"

    const-string/jumbo v1, "odg"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    const-string/jumbo v0, "application/vnd.oasis.opendocument.graphics-template"

    const-string/jumbo v1, "otg"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    const-string/jumbo v0, "application/vnd.oasis.opendocument.image"

    const-string/jumbo v1, "odi"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    const-string/jumbo v0, "application/vnd.oasis.opendocument.spreadsheet"

    const-string/jumbo v1, "ods"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    const-string/jumbo v0, "application/vnd.oasis.opendocument.spreadsheet-template"

    const-string/jumbo v1, "ots"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    const-string/jumbo v0, "application/vnd.oasis.opendocument.text"

    const-string/jumbo v1, "odt"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    const-string/jumbo v0, "application/vnd.oasis.opendocument.text-master"

    const-string/jumbo v1, "odm"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    const-string/jumbo v0, "application/vnd.oasis.opendocument.text-template"

    const-string/jumbo v1, "ott"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    const-string/jumbo v0, "application/vnd.oasis.opendocument.text-web"

    const-string/jumbo v1, "oth"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    const-string/jumbo v0, "application/vnd.google-earth.kml+xml"

    const-string/jumbo v1, "kml"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    const-string/jumbo v0, "application/vnd.google-earth.kmz"

    const-string/jumbo v1, "kmz"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    const-string/jumbo v0, "application/msword"

    const-string/jumbo v1, "doc"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    const-string/jumbo v0, "application/msword"

    const-string/jumbo v1, "dot"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    const-string/jumbo v0, "application/vnd.openxmlformats-officedocument.wordprocessingml.document"

    const-string/jumbo v1, "docx"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    const-string/jumbo v0, "application/vnd.openxmlformats-officedocument.wordprocessingml.template"

    const-string/jumbo v1, "dotx"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    const-string/jumbo v0, "application/vnd.ms-excel"

    const-string/jumbo v1, "xls"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    const-string/jumbo v0, "application/vnd.ms-excel"

    const-string/jumbo v1, "xlt"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    const-string/jumbo v0, "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"

    const-string/jumbo v1, "xlsx"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    const-string/jumbo v0, "application/vnd.openxmlformats-officedocument.spreadsheetml.template"

    const-string/jumbo v1, "xltx"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    const-string/jumbo v0, "application/vnd.ms-powerpoint"

    const-string/jumbo v1, "ppt"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    const-string/jumbo v0, "application/vnd.ms-powerpoint"

    const-string/jumbo v1, "pot"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    const-string/jumbo v0, "application/vnd.ms-powerpoint"

    const-string/jumbo v1, "pps"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    const-string/jumbo v0, "application/vnd.openxmlformats-officedocument.presentationml.presentation"

    const-string/jumbo v1, "pptx"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    const-string/jumbo v0, "application/vnd.openxmlformats-officedocument.presentationml.template"

    const-string/jumbo v1, "potx"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    const-string/jumbo v0, "application/vnd.openxmlformats-officedocument.presentationml.slideshow"

    const-string/jumbo v1, "ppsx"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    const-string/jumbo v0, "application/vnd.rim.cod"

    const-string/jumbo v1, "cod"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    const-string/jumbo v0, "application/vnd.smaf"

    const-string/jumbo v1, "mmf"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    const-string/jumbo v0, "application/vnd.stardivision.calc"

    const-string/jumbo v1, "sdc"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    const-string/jumbo v0, "application/vnd.stardivision.draw"

    const-string/jumbo v1, "sda"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    const-string/jumbo v0, "application/vnd.stardivision.impress"

    const-string/jumbo v1, "sdd"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    const-string/jumbo v0, "application/vnd.stardivision.impress"

    const-string/jumbo v1, "sdp"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    const-string/jumbo v0, "application/vnd.stardivision.math"

    const-string/jumbo v1, "smf"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    const-string/jumbo v0, "application/vnd.stardivision.writer"

    const-string/jumbo v1, "sdw"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    const-string/jumbo v0, "application/vnd.stardivision.writer"

    const-string/jumbo v1, "vor"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    const-string/jumbo v0, "application/vnd.stardivision.writer-global"

    const-string/jumbo v1, "sgl"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    const-string/jumbo v0, "application/vnd.sun.xml.calc"

    const-string/jumbo v1, "sxc"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    const-string/jumbo v0, "application/vnd.sun.xml.calc.template"

    const-string/jumbo v1, "stc"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    const-string/jumbo v0, "application/vnd.sun.xml.draw"

    const-string/jumbo v1, "sxd"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    const-string/jumbo v0, "application/vnd.sun.xml.draw.template"

    const-string/jumbo v1, "std"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    const-string/jumbo v0, "application/vnd.sun.xml.impress"

    const-string/jumbo v1, "sxi"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    const-string/jumbo v0, "application/vnd.sun.xml.impress.template"

    const-string/jumbo v1, "sti"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    const-string/jumbo v0, "application/vnd.sun.xml.math"

    const-string/jumbo v1, "sxm"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    const-string/jumbo v0, "application/vnd.sun.xml.writer"

    const-string/jumbo v1, "sxw"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    const-string/jumbo v0, "application/vnd.sun.xml.writer.global"

    const-string/jumbo v1, "sxg"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    const-string/jumbo v0, "application/vnd.sun.xml.writer.template"

    const-string/jumbo v1, "stw"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    const-string/jumbo v0, "application/vnd.visio"

    const-string/jumbo v1, "vsd"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    const-string/jumbo v0, "application/x-abiword"

    const-string/jumbo v1, "abw"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    const-string/jumbo v0, "application/x-apple-diskimage"

    const-string/jumbo v1, "dmg"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    const-string/jumbo v0, "application/x-bcpio"

    const-string/jumbo v1, "bcpio"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    const-string/jumbo v0, "application/x-bittorrent"

    const-string/jumbo v1, "torrent"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    const-string/jumbo v0, "application/x-cdf"

    const-string/jumbo v1, "cdf"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    const-string/jumbo v0, "application/x-cdlink"

    const-string/jumbo v1, "vcd"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    const-string/jumbo v0, "application/x-chess-pgn"

    const-string/jumbo v1, "pgn"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    const-string/jumbo v0, "application/x-cpio"

    const-string/jumbo v1, "cpio"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    const-string/jumbo v0, "application/x-debian-package"

    const-string/jumbo v1, "deb"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    const-string/jumbo v0, "application/x-debian-package"

    const-string/jumbo v1, "udeb"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    const-string/jumbo v0, "application/x-director"

    const-string/jumbo v1, "dcr"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    const-string/jumbo v0, "application/x-director"

    const-string/jumbo v1, "dir"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    const-string/jumbo v0, "application/x-director"

    const-string/jumbo v1, "dxr"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    const-string/jumbo v0, "application/x-dms"

    const-string/jumbo v1, "dms"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    const-string/jumbo v0, "application/x-doom"

    const-string/jumbo v1, "wad"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    const-string/jumbo v0, "application/x-dvi"

    const-string/jumbo v1, "dvi"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    const-string/jumbo v0, "application/x-flac"

    const-string/jumbo v1, "flac"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    const-string/jumbo v0, "application/x-font"

    const-string/jumbo v1, "pfa"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    const-string/jumbo v0, "application/x-font"

    const-string/jumbo v1, "pfb"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    const-string/jumbo v0, "application/x-font"

    const-string/jumbo v1, "gsf"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    const-string/jumbo v0, "application/x-font"

    const-string/jumbo v1, "pcf"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    const-string/jumbo v0, "application/x-font"

    const-string/jumbo v1, "pcf.Z"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    const-string/jumbo v0, "application/x-freemind"

    const-string/jumbo v1, "mm"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    const-string/jumbo v0, "application/x-futuresplash"

    const-string/jumbo v1, "spl"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    const-string/jumbo v0, "application/x-gnumeric"

    const-string/jumbo v1, "gnumeric"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    const-string/jumbo v0, "application/x-go-sgf"

    const-string/jumbo v1, "sgf"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    const-string/jumbo v0, "application/x-graphing-calculator"

    const-string/jumbo v1, "gcf"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    const-string/jumbo v0, "application/x-gtar"

    const-string/jumbo v1, "gtar"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    const-string/jumbo v0, "application/x-gtar"

    const-string/jumbo v1, "tgz"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    const-string/jumbo v0, "application/x-gtar"

    const-string/jumbo v1, "taz"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    const-string/jumbo v0, "application/x-hdf"

    const-string/jumbo v1, "hdf"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    const-string/jumbo v0, "application/x-ica"

    const-string/jumbo v1, "ica"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    const-string/jumbo v0, "application/x-internet-signup"

    const-string/jumbo v1, "ins"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    const-string/jumbo v0, "application/x-internet-signup"

    const-string/jumbo v1, "isp"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    const-string/jumbo v0, "application/x-iphone"

    const-string/jumbo v1, "iii"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    const-string/jumbo v0, "application/x-iso9660-image"

    const-string/jumbo v1, "iso"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    const-string/jumbo v0, "application/x-jmol"

    const-string/jumbo v1, "jmz"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    const-string/jumbo v0, "application/x-kchart"

    const-string/jumbo v1, "chrt"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    const-string/jumbo v0, "application/x-killustrator"

    const-string/jumbo v1, "kil"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    const-string/jumbo v0, "application/x-koan"

    const-string/jumbo v1, "skp"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    const-string/jumbo v0, "application/x-koan"

    const-string/jumbo v1, "skd"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    const-string/jumbo v0, "application/x-koan"

    const-string/jumbo v1, "skt"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    const-string/jumbo v0, "application/x-koan"

    const-string/jumbo v1, "skm"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    const-string/jumbo v0, "application/x-kpresenter"

    const-string/jumbo v1, "kpr"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    const-string/jumbo v0, "application/x-kpresenter"

    const-string/jumbo v1, "kpt"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    const-string/jumbo v0, "application/x-kspread"

    const-string/jumbo v1, "ksp"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    const-string/jumbo v0, "application/x-kword"

    const-string/jumbo v1, "kwd"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    const-string/jumbo v0, "application/x-kword"

    const-string/jumbo v1, "kwt"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    const-string/jumbo v0, "application/x-latex"

    const-string/jumbo v1, "latex"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    const-string/jumbo v0, "application/x-lha"

    const-string/jumbo v1, "lha"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    const-string/jumbo v0, "application/x-lzh"

    const-string/jumbo v1, "lzh"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    const-string/jumbo v0, "application/x-lzx"

    const-string/jumbo v1, "lzx"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    const-string/jumbo v0, "application/x-maker"

    const-string/jumbo v1, "frm"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    const-string/jumbo v0, "application/x-maker"

    const-string/jumbo v1, "maker"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    const-string/jumbo v0, "application/x-maker"

    const-string/jumbo v1, "frame"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    const-string/jumbo v0, "application/x-maker"

    const-string/jumbo v1, "fb"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    const-string/jumbo v0, "application/x-maker"

    const-string/jumbo v1, "book"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    const-string/jumbo v0, "application/x-maker"

    const-string/jumbo v1, "fbdoc"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    const-string/jumbo v0, "application/x-mif"

    const-string/jumbo v1, "mif"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    const-string/jumbo v0, "application/x-ms-wmd"

    const-string/jumbo v1, "wmd"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    const-string/jumbo v0, "application/x-ms-wmz"

    const-string/jumbo v1, "wmz"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    const-string/jumbo v0, "application/x-msi"

    const-string/jumbo v1, "msi"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    const-string/jumbo v0, "application/x-ns-proxy-autoconfig"

    const-string/jumbo v1, "pac"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    const-string/jumbo v0, "application/x-nwc"

    const-string/jumbo v1, "nwc"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    const-string/jumbo v0, "application/x-object"

    const-string/jumbo v1, "o"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    const-string/jumbo v0, "application/x-oz-application"

    const-string/jumbo v1, "oza"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    const-string/jumbo v0, "application/x-pkcs12"

    const-string/jumbo v1, "p12"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    const-string/jumbo v0, "application/x-pkcs7-certreqresp"

    const-string/jumbo v1, "p7r"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    const-string/jumbo v0, "application/x-pkcs7-crl"

    const-string/jumbo v1, "crl"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    const-string/jumbo v0, "application/x-quicktimeplayer"

    const-string/jumbo v1, "qtl"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    const-string/jumbo v0, "application/x-shar"

    const-string/jumbo v1, "shar"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    const-string/jumbo v0, "application/x-shockwave-flash"

    const-string/jumbo v1, "swf"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    const-string/jumbo v0, "application/x-stuffit"

    const-string/jumbo v1, "sit"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    const-string/jumbo v0, "application/x-sv4cpio"

    const-string/jumbo v1, "sv4cpio"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    const-string/jumbo v0, "application/x-sv4crc"

    const-string/jumbo v1, "sv4crc"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    const-string/jumbo v0, "application/x-tar"

    const-string/jumbo v1, "tar"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    const-string/jumbo v0, "application/x-texinfo"

    const-string/jumbo v1, "texinfo"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    const-string/jumbo v0, "application/x-texinfo"

    const-string/jumbo v1, "texi"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    const-string/jumbo v0, "application/x-troff"

    const-string/jumbo v1, "t"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    const-string/jumbo v0, "application/x-troff"

    const-string/jumbo v1, "roff"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    const-string/jumbo v0, "application/x-troff-man"

    const-string/jumbo v1, "man"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    const-string/jumbo v0, "application/x-ustar"

    const-string/jumbo v1, "ustar"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    const-string/jumbo v0, "application/x-wais-source"

    const-string/jumbo v1, "src"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    const-string/jumbo v0, "application/x-wingz"

    const-string/jumbo v1, "wz"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    const-string/jumbo v0, "application/x-webarchive"

    const-string/jumbo v1, "webarchive"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    const-string/jumbo v0, "application/x-webarchive-xml"

    const-string/jumbo v1, "webarchivexml"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    const-string/jumbo v0, "application/x-x509-ca-cert"

    const-string/jumbo v1, "crt"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    const-string/jumbo v0, "application/x-x509-user-cert"

    const-string/jumbo v1, "crt"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    const-string/jumbo v0, "application/x-xcf"

    const-string/jumbo v1, "xcf"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    const-string/jumbo v0, "application/x-xfig"

    const-string/jumbo v1, "fig"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    const-string/jumbo v0, "application/xhtml+xml"

    const-string/jumbo v1, "xhtml"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    const-string/jumbo v0, "audio/3gpp"

    const-string/jumbo v1, "3gpp"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    const-string/jumbo v0, "audio/amr"

    const-string/jumbo v1, "amr"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    const-string/jumbo v0, "audio/basic"

    const-string/jumbo v1, "snd"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    const-string/jumbo v0, "audio/midi"

    const-string/jumbo v1, "mid"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    const-string/jumbo v0, "audio/midi"

    const-string/jumbo v1, "midi"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    const-string/jumbo v0, "audio/midi"

    const-string/jumbo v1, "kar"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    const-string/jumbo v0, "audio/midi"

    const-string/jumbo v1, "xmf"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    const-string/jumbo v0, "audio/mobile-xmf"

    const-string/jumbo v1, "mxmf"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    const-string/jumbo v0, "audio/mpeg"

    const-string/jumbo v1, "mpga"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    const-string/jumbo v0, "audio/mpeg"

    const-string/jumbo v1, "mpega"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    const-string/jumbo v0, "audio/mpeg"

    const-string/jumbo v1, "mp2"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    const-string/jumbo v0, "audio/mpeg"

    const-string/jumbo v1, "mp3"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    const-string/jumbo v0, "audio/mpeg"

    const-string/jumbo v1, "m4a"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    const-string/jumbo v0, "audio/mpeg"

    const-string/jumbo v1, "aac"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    const-string/jumbo v0, "audio/mpeg"

    const-string/jumbo v1, "awb"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    const-string/jumbo v0, "audio/mpeg"

    const-string/jumbo v1, "oga"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    const-string/jumbo v0, "audio/mpeg"

    const-string/jumbo v1, "mka"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    const-string/jumbo v0, "audio/mpeg"

    const-string/jumbo v1, "ape"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    const-string/jumbo v0, "audio/mpegurl"

    const-string/jumbo v1, "m3u"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    const-string/jumbo v0, "audio/prs.sid"

    const-string/jumbo v1, "sid"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    const-string/jumbo v0, "audio/x-aiff"

    const-string/jumbo v1, "aif"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    const-string/jumbo v0, "audio/x-aiff"

    const-string/jumbo v1, "aiff"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    const-string/jumbo v0, "audio/x-aiff"

    const-string/jumbo v1, "aifc"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    const-string/jumbo v0, "audio/x-gsm"

    const-string/jumbo v1, "gsm"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    const-string/jumbo v0, "audio/x-mpegurl"

    const-string/jumbo v1, "m3u"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    const-string/jumbo v0, "audio/x-ms-wma"

    const-string/jumbo v1, "wma"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    const-string/jumbo v0, "audio/x-ms-wax"

    const-string/jumbo v1, "wax"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    const-string/jumbo v0, "audio/x-pn-realaudio"

    const-string/jumbo v1, "ra"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    const-string/jumbo v0, "audio/x-pn-realaudio"

    const-string/jumbo v1, "rm"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    const-string/jumbo v0, "audio/x-pn-realaudio"

    const-string/jumbo v1, "ram"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    const-string/jumbo v0, "audio/x-realaudio"

    const-string/jumbo v1, "ra"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    const-string/jumbo v0, "audio/x-scpls"

    const-string/jumbo v1, "pls"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    const-string/jumbo v0, "audio/x-sd2"

    const-string/jumbo v1, "sd2"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    const-string/jumbo v0, "audio/x-wav"

    const-string/jumbo v1, "wav"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    const-string/jumbo v0, "image/bmp"

    const-string/jumbo v1, "bmp"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    const-string/jumbo v0, "audio/x-qcp"

    const-string/jumbo v1, "qcp"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    const-string/jumbo v0, "image/gif"

    const-string/jumbo v1, "gif"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    const-string/jumbo v0, "image/ico"

    const-string/jumbo v1, "cur"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    const-string/jumbo v0, "image/ico"

    const-string/jumbo v1, "ico"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    const-string/jumbo v0, "image/ief"

    const-string/jumbo v1, "ief"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 219
    const-string/jumbo v0, "image/jpeg"

    const-string/jumbo v1, "jpeg"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    const-string/jumbo v0, "image/jpeg"

    const-string/jumbo v1, "jpg"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    const-string/jumbo v0, "image/jpeg"

    const-string/jumbo v1, "jpe"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    const-string/jumbo v0, "image/jpeg"

    const-string/jumbo v1, "psd"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    const-string/jumbo v0, "image/jpeg"

    const-string/jumbo v1, "svg"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    const-string/jumbo v0, "image/jpeg"

    const-string/jumbo v1, "vsd"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    const-string/jumbo v0, "image/pcx"

    const-string/jumbo v1, "pcx"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    const-string/jumbo v0, "image/png"

    const-string/jumbo v1, "png"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    const-string/jumbo v0, "image/svg+xml"

    const-string/jumbo v1, "svg"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    const-string/jumbo v0, "image/svg+xml"

    const-string/jumbo v1, "svgz"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    const-string/jumbo v0, "image/tiff"

    const-string/jumbo v1, "tiff"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    const-string/jumbo v0, "image/tiff"

    const-string/jumbo v1, "tif"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    const-string/jumbo v0, "image/vnd.djvu"

    const-string/jumbo v1, "djvu"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    const-string/jumbo v0, "image/vnd.djvu"

    const-string/jumbo v1, "djv"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    const-string/jumbo v0, "image/vnd.wap.wbmp"

    const-string/jumbo v1, "wbmp"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    const-string/jumbo v0, "image/x-cmu-raster"

    const-string/jumbo v1, "ras"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    const-string/jumbo v0, "image/x-coreldraw"

    const-string/jumbo v1, "cdr"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    const-string/jumbo v0, "image/x-coreldrawpattern"

    const-string/jumbo v1, "pat"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    const-string/jumbo v0, "image/x-coreldrawtemplate"

    const-string/jumbo v1, "cdt"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    const-string/jumbo v0, "image/x-corelphotopaint"

    const-string/jumbo v1, "cpt"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    const-string/jumbo v0, "image/x-icon"

    const-string/jumbo v1, "ico"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    const-string/jumbo v0, "image/x-jg"

    const-string/jumbo v1, "art"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    const-string/jumbo v0, "image/x-jng"

    const-string/jumbo v1, "jng"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    const-string/jumbo v0, "image/x-ms-bmp"

    const-string/jumbo v1, "bmp"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    const-string/jumbo v0, "image/x-photoshop"

    const-string/jumbo v1, "psd"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    const-string/jumbo v0, "image/x-portable-anymap"

    const-string/jumbo v1, "pnm"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    const-string/jumbo v0, "image/x-portable-bitmap"

    const-string/jumbo v1, "pbm"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    const-string/jumbo v0, "image/x-portable-graymap"

    const-string/jumbo v1, "pgm"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    const-string/jumbo v0, "image/x-portable-pixmap"

    const-string/jumbo v1, "ppm"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    const-string/jumbo v0, "image/x-rgb"

    const-string/jumbo v1, "rgb"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    const-string/jumbo v0, "image/x-xbitmap"

    const-string/jumbo v1, "xbm"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    const-string/jumbo v0, "image/x-xpixmap"

    const-string/jumbo v1, "xpm"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    const-string/jumbo v0, "image/x-xwindowdump"

    const-string/jumbo v1, "xwd"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    const-string/jumbo v0, "model/iges"

    const-string/jumbo v1, "igs"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    const-string/jumbo v0, "model/iges"

    const-string/jumbo v1, "iges"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    const-string/jumbo v0, "model/mesh"

    const-string/jumbo v1, "msh"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    const-string/jumbo v0, "model/mesh"

    const-string/jumbo v1, "mesh"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    const-string/jumbo v0, "model/mesh"

    const-string/jumbo v1, "silo"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    const-string/jumbo v0, "text/calendar"

    const-string/jumbo v1, "ics"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    const-string/jumbo v0, "text/calendar"

    const-string/jumbo v1, "icz"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    const-string/jumbo v0, "text/comma-separated-values"

    const-string/jumbo v1, "csv"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    const-string/jumbo v0, "text/css"

    const-string/jumbo v1, "css"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    const-string/jumbo v0, "text/html"

    const-string/jumbo v1, "htm"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    const-string/jumbo v0, "text/html"

    const-string/jumbo v1, "html"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    const-string/jumbo v0, "text/html"

    const-string/jumbo v1, "xml"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    const-string/jumbo v0, "text/html"

    const-string/jumbo v1, "chm"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    const-string/jumbo v0, "text/h323"

    const-string/jumbo v1, "323"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    const-string/jumbo v0, "text/iuls"

    const-string/jumbo v1, "uls"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    const-string/jumbo v0, "text/mathml"

    const-string/jumbo v1, "mml"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    const-string/jumbo v0, "text/plain"

    const-string/jumbo v1, "txt"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    const-string/jumbo v0, "text/plain"

    const-string/jumbo v1, "log"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    const-string/jumbo v0, "text/plain"

    const-string/jumbo v1, "asc"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    const-string/jumbo v0, "text/plain"

    const-string/jumbo v1, "text"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    const-string/jumbo v0, "text/plain"

    const-string/jumbo v1, "diff"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    const-string/jumbo v0, "text/plain"

    const-string/jumbo v1, "po"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    const-string/jumbo v0, "text/plain"

    const-string/jumbo v1, "ini"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 275
    const-string/jumbo v0, "text/plain"

    const-string/jumbo v1, "lrc"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    const-string/jumbo v0, "text/plain"

    const-string/jumbo v1, "epub"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    const-string/jumbo v0, "text/richtext"

    const-string/jumbo v1, "rtx"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    const-string/jumbo v0, "text/rtf"

    const-string/jumbo v1, "rtf"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    const-string/jumbo v0, "text/text"

    const-string/jumbo v1, "phps"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    const-string/jumbo v0, "text/tab-separated-values"

    const-string/jumbo v1, "tsv"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    const-string/jumbo v0, "text/xml"

    const-string/jumbo v1, "xml"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    const-string/jumbo v0, "text/x-bibtex"

    const-string/jumbo v1, "bib"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    const-string/jumbo v0, "text/x-boo"

    const-string/jumbo v1, "boo"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    const-string/jumbo v0, "text/x-c++hdr"

    const-string/jumbo v1, "h++"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    const-string/jumbo v0, "text/x-c++hdr"

    const-string/jumbo v1, "hpp"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    const-string/jumbo v0, "text/x-c++hdr"

    const-string/jumbo v1, "hxx"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    const-string/jumbo v0, "text/x-c++hdr"

    const-string/jumbo v1, "hh"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    const-string/jumbo v0, "text/x-c++src"

    const-string/jumbo v1, "c++"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    const-string/jumbo v0, "text/x-c++src"

    const-string/jumbo v1, "cpp"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    const-string/jumbo v0, "text/x-c++src"

    const-string/jumbo v1, "cxx"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 291
    const-string/jumbo v0, "text/x-chdr"

    const-string/jumbo v1, "h"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    const-string/jumbo v0, "text/x-component"

    const-string/jumbo v1, "htc"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    const-string/jumbo v0, "text/x-csh"

    const-string/jumbo v1, "csh"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 294
    const-string/jumbo v0, "text/x-csrc"

    const-string/jumbo v1, "c"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    const-string/jumbo v0, "text/x-dsrc"

    const-string/jumbo v1, "d"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    const-string/jumbo v0, "text/x-haskell"

    const-string/jumbo v1, "hs"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    const-string/jumbo v0, "text/x-java"

    const-string/jumbo v1, "java"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    const-string/jumbo v0, "text/x-literate-haskell"

    const-string/jumbo v1, "lhs"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    const-string/jumbo v0, "text/x-moc"

    const-string/jumbo v1, "moc"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    const-string/jumbo v0, "text/x-pascal"

    const-string/jumbo v1, "p"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    const-string/jumbo v0, "text/x-pascal"

    const-string/jumbo v1, "pas"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    const-string/jumbo v0, "text/x-pcs-gcd"

    const-string/jumbo v1, "gcd"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 303
    const-string/jumbo v0, "text/x-setext"

    const-string/jumbo v1, "etx"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    const-string/jumbo v0, "text/x-tcl"

    const-string/jumbo v1, "tcl"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    const-string/jumbo v0, "text/x-tex"

    const-string/jumbo v1, "tex"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    const-string/jumbo v0, "text/x-tex"

    const-string/jumbo v1, "ltx"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    const-string/jumbo v0, "text/x-tex"

    const-string/jumbo v1, "sty"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    const-string/jumbo v0, "text/x-tex"

    const-string/jumbo v1, "cls"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    const-string/jumbo v0, "text/x-vcalendar"

    const-string/jumbo v1, "vcs"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    const-string/jumbo v0, "text/x-vcard"

    const-string/jumbo v1, "vcf"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    const-string/jumbo v0, "video/3gpp"

    const-string/jumbo v1, "3gpp"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 312
    const-string/jumbo v0, "video/3gpp"

    const-string/jumbo v1, "3gp"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    const-string/jumbo v0, "video/3gpp"

    const-string/jumbo v1, "3g2"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    const-string/jumbo v0, "video/3gpp"

    const-string/jumbo v1, "3gpp2"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    const-string/jumbo v0, "video/dl"

    const-string/jumbo v1, "dl"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    const-string/jumbo v0, "video/dv"

    const-string/jumbo v1, "dif"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    const-string/jumbo v0, "video/dv"

    const-string/jumbo v1, "dv"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    const-string/jumbo v0, "video/fli"

    const-string/jumbo v1, "fli"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    const-string/jumbo v0, "video/m4v"

    const-string/jumbo v1, "m4v"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    const-string/jumbo v0, "video/mpeg"

    const-string/jumbo v1, "mpeg"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 321
    const-string/jumbo v0, "video/mpeg"

    const-string/jumbo v1, "mpg"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    const-string/jumbo v0, "video/mpeg"

    const-string/jumbo v1, "mpe"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 323
    const-string/jumbo v0, "video/mpeg"

    const-string/jumbo v1, "flv"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    const-string/jumbo v0, "video/mp4"

    const-string/jumbo v1, "mp4"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    const-string/jumbo v0, "video/mpeg"

    const-string/jumbo v1, "vob"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 326
    const-string/jumbo v0, "video/quicktime"

    const-string/jumbo v1, "qt"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 327
    const-string/jumbo v0, "video/quicktime"

    const-string/jumbo v1, "mov"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    const-string/jumbo v0, "video/quicktime"

    const-string/jumbo v1, "mkv"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    const-string/jumbo v0, "video/vnd.mpegurl"

    const-string/jumbo v1, "mxu"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    const-string/jumbo v0, "video/x-la-asf"

    const-string/jumbo v1, "lsf"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 331
    const-string/jumbo v0, "video/x-la-asf"

    const-string/jumbo v1, "lsx"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    const-string/jumbo v0, "video/x-mng"

    const-string/jumbo v1, "mng"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    const-string/jumbo v0, "video/x-ms-asf"

    const-string/jumbo v1, "asf"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 334
    const-string/jumbo v0, "video/x-ms-asf"

    const-string/jumbo v1, "asx"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    const-string/jumbo v0, "video/x-ms-wm"

    const-string/jumbo v1, "wm"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 336
    const-string/jumbo v0, "video/x-ms-wmv"

    const-string/jumbo v1, "wmv"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 337
    const-string/jumbo v0, "video/x-ms-wmx"

    const-string/jumbo v1, "wmx"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    const-string/jumbo v0, "video/x-ms-wvx"

    const-string/jumbo v1, "wvx"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 339
    const-string/jumbo v0, "video/x-msvideo"

    const-string/jumbo v1, "avi"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 340
    const-string/jumbo v0, "video/x-sgi-movie"

    const-string/jumbo v1, "movie"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    const-string/jumbo v0, "video/mpeg"

    const-string/jumbo v1, "webm"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 342
    const-string/jumbo v0, "video/mpeg"

    const-string/jumbo v1, "ts"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 343
    const-string/jumbo v0, "video/mpeg"

    const-string/jumbo v1, "rmvb"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    const-string/jumbo v0, "video/mpeg"

    const-string/jumbo v1, "tp"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    const-string/jumbo v0, "video/mpeg"

    const-string/jumbo v1, "f4v"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    const-string/jumbo v0, "video/mpeg"

    const-string/jumbo v1, "bdv"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    const-string/jumbo v0, "video/mpeg"

    const-string/jumbo v1, "vdat"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    const-string/jumbo v0, "x-conference/x-cooltalk"

    const-string/jumbo v1, "ice"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    const-string/jumbo v0, "x-epoc/x-sisx-app"

    const-string/jumbo v1, "sisx"

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 350
    invoke-static {}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->b()V

    .line 351
    return-void
.end method

.method private static a()Ljava/io/InputStream;
    .locals 4

    .prologue
    .line 362
    const-string/jumbo v0, "content.types.user.table"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 363
    if-eqz v0, :cond_0

    .line 364
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 365
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 367
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 381
    :goto_0
    return-object v0

    .line 368
    :catch_0
    move-exception v0

    .line 373
    :cond_0
    new-instance v1, Ljava/io/File;

    const-string/jumbo v0, "java.home"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "lib"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "content-types.properties"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 374
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 376
    :try_start_1
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 377
    :catch_1
    move-exception v0

    .line 381
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 407
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 408
    const/4 v0, 0x0

    .line 410
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/g;->b:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 355
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 356
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/g;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    return-void
.end method

.method private static b()V
    .locals 4

    .prologue
    .line 385
    invoke-static {}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a()Ljava/io/InputStream;

    move-result-object v2

    .line 386
    if-nez v2, :cond_0

    .line 404
    :goto_0
    return-void

    .line 392
    :cond_0
    :try_start_0
    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    .line 393
    invoke-virtual {v0, v2}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    .line 394
    invoke-virtual {v0}, Ljava/util/Properties;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 395
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 396
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 397
    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/g;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 400
    :catchall_0
    move-exception v0

    :try_start_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    throw v0

    .line 402
    :catch_0
    move-exception v0

    goto :goto_0

    .line 400
    :cond_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method
