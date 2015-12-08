.class public Lcom/coremedia/iso/boxes/MovieHeaderBox;
.super Lcom/googlecode/mp4parser/AbstractFullBox;
.source "SourceFile"


# static fields
.field public static final TYPE:Ljava/lang/String; = "mvhd"

.field private static final synthetic ajc$tjp_0:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_1:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_10:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_11:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_12:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_13:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_14:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_15:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_16:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_17:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_18:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_19:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_2:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_20:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_21:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_22:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_23:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_24:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_25:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_26:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_27:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_28:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_3:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_4:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_5:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_6:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_7:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_8:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_9:Lorg/b/a/a$a;


# instance fields
.field private creationTime:Ljava/util/Date;

.field private currentTime:I

.field private duration:J

.field private matrix:Lcom/googlecode/mp4parser/util/Matrix;

.field private modificationTime:Ljava/util/Date;

.field private nextTrackId:J

.field private posterTime:I

.field private previewDuration:I

.field private previewTime:I

.field private rate:D

.field private selectionDuration:I

.field private selectionTime:I

.field private timescale:J

.field private volume:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .prologue
    .line 1
    invoke-static {}, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 60
    const-string v0, "mvhd"

    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/AbstractFullBox;-><init>(Ljava/lang/String;)V

    .line 44
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->rate:D

    .line 45
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->volume:F

    .line 46
    sget-object v0, Lcom/googlecode/mp4parser/util/Matrix;->ROTATE_0:Lcom/googlecode/mp4parser/util/Matrix;

    iput-object v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->matrix:Lcom/googlecode/mp4parser/util/Matrix;

    .line 61
    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 9

    .prologue
    .line 1
    new-instance v0, Lorg/b/b/b/b;

    const-string v1, "MovieHeaderBox.java"

    const-class v2, Lcom/coremedia/iso/boxes/MovieHeaderBox;

    invoke-direct {v0, v1, v2}, Lorg/b/b/b/b;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getCreationTime"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "java.util.Date"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x3f

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_0:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getModificationTime"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "java.util.Date"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x43

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_1:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setModificationTime"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, "java.util.Date"

    const-string v5, "modificationTime"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0xcb

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_10:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setTimescale"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, "long"

    const-string v5, "timescale"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0xd3

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_11:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setDuration"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, "long"

    const-string v5, "duration"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0xd7

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_12:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setRate"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, "double"

    const-string v5, "rate"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0xde

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_13:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setVolume"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, "float"

    const-string v5, "volume"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0xe2

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_14:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setMatrix"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, "com.googlecode.mp4parser.util.Matrix"

    const-string v5, "matrix"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0xe6

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_15:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setNextTrackId"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, "long"

    const-string v5, "nextTrackId"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0xea

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_16:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getPreviewTime"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0xee

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_17:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setPreviewTime"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, "int"

    const-string v5, "previewTime"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0xf2

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_18:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getPreviewDuration"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0xf6

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_19:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getTimescale"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "long"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x47

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_2:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setPreviewDuration"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, "int"

    const-string v5, "previewDuration"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0xfa

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_20:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getPosterTime"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0xfe

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_21:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setPosterTime"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, "int"

    const-string v5, "posterTime"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x102

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_22:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getSelectionTime"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x106

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_23:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setSelectionTime"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, "int"

    const-string v5, "selectionTime"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x10a

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_24:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getSelectionDuration"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x10e

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_25:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setSelectionDuration"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, "int"

    const-string v5, "selectionDuration"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x112

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_26:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getCurrentTime"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "int"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x116

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_27:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setCurrentTime"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, "int"

    const-string v5, "currentTime"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x11a

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_28:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getDuration"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "long"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x4b

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_3:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getRate"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "double"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x4f

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_4:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getVolume"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "float"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x53

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_5:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getMatrix"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "com.googlecode.mp4parser.util.Matrix"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x57

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_6:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getNextTrackId"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "long"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x5b

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_7:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "toString"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "java.lang.String"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x8b

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_8:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setCreationTime"

    const-string v3, "com.coremedia.iso.boxes.MovieHeaderBox"

    const-string v4, "java.util.Date"

    const-string v5, "creationTime"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0xc3

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v0

    sput-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_9:Lorg/b/a/a$a;

    return-void
.end method


# virtual methods
.method public _parseDetails(Ljava/nio/ByteBuffer;)V
    .locals 2

    .prologue
    .line 108
    invoke-virtual {p0, p1}, Lcom/coremedia/iso/boxes/MovieHeaderBox;->parseVersionAndFlags(Ljava/nio/ByteBuffer;)J

    .line 109
    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/MovieHeaderBox;->getVersion()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 110
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt64(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/DateHelper;->convert(J)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->creationTime:Ljava/util/Date;

    .line 111
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt64(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/DateHelper;->convert(J)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->modificationTime:Ljava/util/Date;

    .line 112
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->timescale:J

    .line 113
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt64(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->duration:J

    .line 120
    :goto_0
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readFixedPoint1616(Ljava/nio/ByteBuffer;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->rate:D

    .line 121
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readFixedPoint88(Ljava/nio/ByteBuffer;)F

    move-result v0

    iput v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->volume:F

    .line 122
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16(Ljava/nio/ByteBuffer;)I

    .line 123
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    .line 124
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    .line 126
    invoke-static {p1}, Lcom/googlecode/mp4parser/util/Matrix;->fromByteBuffer(Ljava/nio/ByteBuffer;)Lcom/googlecode/mp4parser/util/Matrix;

    move-result-object v0

    iput-object v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->matrix:Lcom/googlecode/mp4parser/util/Matrix;

    .line 128
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    iput v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->previewTime:I

    .line 129
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    iput v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->previewDuration:I

    .line 130
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    iput v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->posterTime:I

    .line 131
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    iput v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->selectionTime:I

    .line 132
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    iput v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->selectionDuration:I

    .line 133
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    iput v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->currentTime:I

    .line 135
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->nextTrackId:J

    .line 137
    return-void

    .line 115
    :cond_0
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/DateHelper;->convert(J)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->creationTime:Ljava/util/Date;

    .line 116
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/DateHelper;->convert(J)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->modificationTime:Ljava/util/Date;

    .line 117
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->timescale:J

    .line 118
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->duration:J

    goto :goto_0
.end method

.method protected getContent(Ljava/nio/ByteBuffer;)V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 164
    invoke-virtual {p0, p1}, Lcom/coremedia/iso/boxes/MovieHeaderBox;->writeVersionAndFlags(Ljava/nio/ByteBuffer;)V

    .line 165
    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/MovieHeaderBox;->getVersion()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 166
    iget-object v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->creationTime:Ljava/util/Date;

    invoke-static {v0}, Lcom/googlecode/mp4parser/util/DateHelper;->convert(Ljava/util/Date;)J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt64(Ljava/nio/ByteBuffer;J)V

    .line 167
    iget-object v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->modificationTime:Ljava/util/Date;

    invoke-static {v0}, Lcom/googlecode/mp4parser/util/DateHelper;->convert(Ljava/util/Date;)J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt64(Ljava/nio/ByteBuffer;J)V

    .line 168
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->timescale:J

    invoke-static {p1, v0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt32(Ljava/nio/ByteBuffer;J)V

    .line 169
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->duration:J

    invoke-static {p1, v0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt64(Ljava/nio/ByteBuffer;J)V

    .line 176
    :goto_0
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->rate:D

    invoke-static {p1, v0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeFixedPoint1616(Ljava/nio/ByteBuffer;D)V

    .line 177
    iget v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->volume:F

    float-to-double v0, v0

    invoke-static {p1, v0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeFixedPoint88(Ljava/nio/ByteBuffer;D)V

    .line 178
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt16(Ljava/nio/ByteBuffer;I)V

    .line 179
    invoke-static {p1, v2, v3}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt32(Ljava/nio/ByteBuffer;J)V

    .line 180
    invoke-static {p1, v2, v3}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt32(Ljava/nio/ByteBuffer;J)V

    .line 182
    iget-object v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->matrix:Lcom/googlecode/mp4parser/util/Matrix;

    invoke-virtual {v0, p1}, Lcom/googlecode/mp4parser/util/Matrix;->getContent(Ljava/nio/ByteBuffer;)V

    .line 184
    iget v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->previewTime:I

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 185
    iget v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->previewDuration:I

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 186
    iget v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->posterTime:I

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 187
    iget v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->selectionTime:I

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 188
    iget v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->selectionDuration:I

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 189
    iget v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->currentTime:I

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 191
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->nextTrackId:J

    invoke-static {p1, v0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt32(Ljava/nio/ByteBuffer;J)V

    .line 192
    return-void

    .line 171
    :cond_0
    iget-object v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->creationTime:Ljava/util/Date;

    invoke-static {v0}, Lcom/googlecode/mp4parser/util/DateHelper;->convert(Ljava/util/Date;)J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt32(Ljava/nio/ByteBuffer;J)V

    .line 172
    iget-object v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->modificationTime:Ljava/util/Date;

    invoke-static {v0}, Lcom/googlecode/mp4parser/util/DateHelper;->convert(Ljava/util/Date;)J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt32(Ljava/nio/ByteBuffer;J)V

    .line 173
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->timescale:J

    invoke-static {p1, v0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt32(Ljava/nio/ByteBuffer;J)V

    .line 174
    iget-wide v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->duration:J

    invoke-static {p1, v0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeUInt32(Ljava/nio/ByteBuffer;J)V

    goto :goto_0
.end method

.method protected getContentSize()J
    .locals 4

    .prologue
    .line 96
    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/MovieHeaderBox;->getVersion()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 98
    const-wide/16 v0, 0x20

    .line 102
    :goto_0
    const-wide/16 v2, 0x50

    add-long/2addr v0, v2

    .line 103
    return-wide v0

    .line 100
    :cond_0
    const-wide/16 v0, 0x14

    goto :goto_0
.end method

.method public getCreationTime()Ljava/util/Date;
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_0:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 64
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget-object v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->creationTime:Ljava/util/Date;

    return-object v0
.end method

.method public getCurrentTime()I
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_27:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 279
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->currentTime:I

    return v0
.end method

.method public getDuration()J
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_3:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 76
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget-wide v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->duration:J

    return-wide v0
.end method

.method public getMatrix()Lcom/googlecode/mp4parser/util/Matrix;
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_6:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 88
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget-object v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->matrix:Lcom/googlecode/mp4parser/util/Matrix;

    return-object v0
.end method

.method public getModificationTime()Ljava/util/Date;
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_1:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 68
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget-object v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->modificationTime:Ljava/util/Date;

    return-object v0
.end method

.method public getNextTrackId()J
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_7:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 92
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget-wide v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->nextTrackId:J

    return-wide v0
.end method

.method public getPosterTime()I
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_21:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 255
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->posterTime:I

    return v0
.end method

.method public getPreviewDuration()I
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_19:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 247
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->previewDuration:I

    return v0
.end method

.method public getPreviewTime()I
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_17:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 239
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->previewTime:I

    return v0
.end method

.method public getRate()D
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_4:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 80
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget-wide v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->rate:D

    return-wide v0
.end method

.method public getSelectionDuration()I
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_25:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 271
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->selectionDuration:I

    return v0
.end method

.method public getSelectionTime()I
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_23:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 263
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->selectionTime:I

    return v0
.end method

.method public getTimescale()J
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_2:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 72
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget-wide v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->timescale:J

    return-wide v0
.end method

.method public getVolume()F
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_5:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 84
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget v0, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->volume:F

    return v0
.end method

.method public setCreationTime(Ljava/util/Date;)V
    .locals 4

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_9:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0, p1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 196
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput-object p1, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->creationTime:Ljava/util/Date;

    .line 197
    invoke-static {p1}, Lcom/googlecode/mp4parser/util/DateHelper;->convert(Ljava/util/Date;)J

    move-result-wide v0

    const-wide v2, 0x100000000L

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 198
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/coremedia/iso/boxes/MovieHeaderBox;->setVersion(I)V

    .line 201
    :cond_0
    return-void
.end method

.method public setCurrentTime(I)V
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_28:Lorg/b/a/a$a;

    invoke-static {p1}, Lorg/b/b/a/a;->a(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 283
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput p1, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->currentTime:I

    .line 284
    return-void
.end method

.method public setDuration(J)V
    .locals 3

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_12:Lorg/b/a/a$a;

    invoke-static {p1, p2}, Lorg/b/b/a/a;->a(J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 216
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput-wide p1, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->duration:J

    .line 217
    const-wide v0, 0x100000000L

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    .line 218
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/coremedia/iso/boxes/MovieHeaderBox;->setVersion(I)V

    .line 220
    :cond_0
    return-void
.end method

.method public setMatrix(Lcom/googlecode/mp4parser/util/Matrix;)V
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_15:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0, p1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 231
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput-object p1, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->matrix:Lcom/googlecode/mp4parser/util/Matrix;

    .line 232
    return-void
.end method

.method public setModificationTime(Ljava/util/Date;)V
    .locals 4

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_10:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0, p1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 204
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput-object p1, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->modificationTime:Ljava/util/Date;

    .line 205
    invoke-static {p1}, Lcom/googlecode/mp4parser/util/DateHelper;->convert(Ljava/util/Date;)J

    move-result-wide v0

    const-wide v2, 0x100000000L

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 206
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/coremedia/iso/boxes/MovieHeaderBox;->setVersion(I)V

    .line 209
    :cond_0
    return-void
.end method

.method public setNextTrackId(J)V
    .locals 3

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_16:Lorg/b/a/a$a;

    invoke-static {p1, p2}, Lorg/b/b/a/a;->a(J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 235
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput-wide p1, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->nextTrackId:J

    .line 236
    return-void
.end method

.method public setPosterTime(I)V
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_22:Lorg/b/a/a$a;

    invoke-static {p1}, Lorg/b/b/a/a;->a(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 259
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput p1, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->posterTime:I

    .line 260
    return-void
.end method

.method public setPreviewDuration(I)V
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_20:Lorg/b/a/a$a;

    invoke-static {p1}, Lorg/b/b/a/a;->a(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 251
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput p1, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->previewDuration:I

    .line 252
    return-void
.end method

.method public setPreviewTime(I)V
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_18:Lorg/b/a/a$a;

    invoke-static {p1}, Lorg/b/b/a/a;->a(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 243
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput p1, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->previewTime:I

    .line 244
    return-void
.end method

.method public setRate(D)V
    .locals 3

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_13:Lorg/b/a/a$a;

    invoke-static {p1, p2}, Lorg/b/b/a/a;->a(D)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 223
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput-wide p1, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->rate:D

    .line 224
    return-void
.end method

.method public setSelectionDuration(I)V
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_26:Lorg/b/a/a$a;

    invoke-static {p1}, Lorg/b/b/a/a;->a(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 275
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput p1, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->selectionDuration:I

    .line 276
    return-void
.end method

.method public setSelectionTime(I)V
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_24:Lorg/b/a/a$a;

    invoke-static {p1}, Lorg/b/b/a/a;->a(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 267
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput p1, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->selectionTime:I

    .line 268
    return-void
.end method

.method public setTimescale(J)V
    .locals 3

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_11:Lorg/b/a/a$a;

    invoke-static {p1, p2}, Lorg/b/b/a/a;->a(J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 212
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput-wide p1, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->timescale:J

    .line 213
    return-void
.end method

.method public setVolume(F)V
    .locals 2

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_14:Lorg/b/a/a$a;

    invoke-static {p1}, Lorg/b/b/a/a;->a(F)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 227
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput p1, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->volume:F

    .line 228
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    sget-object v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->ajc$tjp_8:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 140
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    const-string v1, "MovieHeaderBox["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    const-string v1, "creationTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/MovieHeaderBox;->getCreationTime()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    const-string v1, "modificationTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/MovieHeaderBox;->getModificationTime()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    const-string v1, "timescale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/MovieHeaderBox;->getTimescale()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 147
    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    const-string v1, "duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/MovieHeaderBox;->getDuration()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 149
    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    const-string v1, "rate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/MovieHeaderBox;->getRate()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 151
    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    const-string v1, "volume="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/MovieHeaderBox;->getVolume()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 153
    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    const-string v1, "matrix="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/coremedia/iso/boxes/MovieHeaderBox;->matrix:Lcom/googlecode/mp4parser/util/Matrix;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    const-string v1, "nextTrackId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/MovieHeaderBox;->getNextTrackId()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 157
    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
