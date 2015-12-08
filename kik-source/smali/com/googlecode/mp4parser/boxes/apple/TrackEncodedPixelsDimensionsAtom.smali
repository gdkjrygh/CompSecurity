.class public Lcom/googlecode/mp4parser/boxes/apple/TrackEncodedPixelsDimensionsAtom;
.super Lcom/googlecode/mp4parser/AbstractFullBox;
.source "SourceFile"


# static fields
.field public static final TYPE:Ljava/lang/String; = "enof"

.field private static final synthetic ajc$tjp_0:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_1:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_2:Lorg/b/a/a$a;

.field private static final synthetic ajc$tjp_3:Lorg/b/a/a$a;


# instance fields
.field height:D

.field width:D


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .prologue
    .line 1
    invoke-static {}, Lcom/googlecode/mp4parser/boxes/apple/TrackEncodedPixelsDimensionsAtom;->ajc$preClinit()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 21
    const-string v0, "enof"

    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/AbstractFullBox;-><init>(Ljava/lang/String;)V

    .line 22
    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 9

    .prologue
    .line 1
    new-instance v0, Lorg/b/b/b/b;

    const-string v1, "TrackEncodedPixelsDimensionsAtom.java"

    const-class v2, Lcom/googlecode/mp4parser/boxes/apple/TrackEncodedPixelsDimensionsAtom;

    invoke-direct {v0, v1, v2}, Lorg/b/b/b/b;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getWidth"

    const-string v3, "com.googlecode.mp4parser.boxes.apple.TrackEncodedPixelsDimensionsAtom"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "double"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x2c

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/googlecode/mp4parser/boxes/apple/TrackEncodedPixelsDimensionsAtom;->ajc$tjp_0:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setWidth"

    const-string v3, "com.googlecode.mp4parser.boxes.apple.TrackEncodedPixelsDimensionsAtom"

    const-string v4, "double"

    const-string v5, "width"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x30

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/googlecode/mp4parser/boxes/apple/TrackEncodedPixelsDimensionsAtom;->ajc$tjp_1:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "getHeight"

    const-string v3, "com.googlecode.mp4parser.boxes.apple.TrackEncodedPixelsDimensionsAtom"

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, "double"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x34

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v1

    sput-object v1, Lcom/googlecode/mp4parser/boxes/apple/TrackEncodedPixelsDimensionsAtom;->ajc$tjp_2:Lorg/b/a/a$a;

    const-string v8, "method-execution"

    const-string v1, "1"

    const-string v2, "setHeight"

    const-string v3, "com.googlecode.mp4parser.boxes.apple.TrackEncodedPixelsDimensionsAtom"

    const-string v4, "double"

    const-string v5, "height"

    const-string v6, ""

    const-string v7, "void"

    invoke-virtual/range {v0 .. v7}, Lorg/b/b/b/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/b/a/a/c;

    move-result-object v1

    const/16 v2, 0x38

    invoke-virtual {v0, v8, v1, v2}, Lorg/b/b/b/b;->a(Ljava/lang/String;Lorg/b/a/d;I)Lorg/b/a/a$a;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/boxes/apple/TrackEncodedPixelsDimensionsAtom;->ajc$tjp_3:Lorg/b/a/a$a;

    return-void
.end method


# virtual methods
.method protected _parseDetails(Ljava/nio/ByteBuffer;)V
    .locals 2

    .prologue
    .line 39
    invoke-virtual {p0, p1}, Lcom/googlecode/mp4parser/boxes/apple/TrackEncodedPixelsDimensionsAtom;->parseVersionAndFlags(Ljava/nio/ByteBuffer;)J

    .line 40
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readFixedPoint1616(Ljava/nio/ByteBuffer;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/googlecode/mp4parser/boxes/apple/TrackEncodedPixelsDimensionsAtom;->width:D

    .line 41
    invoke-static {p1}, Lcom/coremedia/iso/IsoTypeReader;->readFixedPoint1616(Ljava/nio/ByteBuffer;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/googlecode/mp4parser/boxes/apple/TrackEncodedPixelsDimensionsAtom;->height:D

    .line 42
    return-void
.end method

.method protected getContent(Ljava/nio/ByteBuffer;)V
    .locals 2

    .prologue
    .line 32
    invoke-virtual {p0, p1}, Lcom/googlecode/mp4parser/boxes/apple/TrackEncodedPixelsDimensionsAtom;->writeVersionAndFlags(Ljava/nio/ByteBuffer;)V

    .line 33
    iget-wide v0, p0, Lcom/googlecode/mp4parser/boxes/apple/TrackEncodedPixelsDimensionsAtom;->width:D

    invoke-static {p1, v0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeFixedPoint1616(Ljava/nio/ByteBuffer;D)V

    .line 34
    iget-wide v0, p0, Lcom/googlecode/mp4parser/boxes/apple/TrackEncodedPixelsDimensionsAtom;->height:D

    invoke-static {p1, v0, v1}, Lcom/coremedia/iso/IsoTypeWriter;->writeFixedPoint1616(Ljava/nio/ByteBuffer;D)V

    .line 35
    return-void
.end method

.method protected getContentSize()J
    .locals 2

    .prologue
    .line 27
    const-wide/16 v0, 0xc

    return-wide v0
.end method

.method public getHeight()D
    .locals 2

    .prologue
    sget-object v0, Lcom/googlecode/mp4parser/boxes/apple/TrackEncodedPixelsDimensionsAtom;->ajc$tjp_2:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 53
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget-wide v0, p0, Lcom/googlecode/mp4parser/boxes/apple/TrackEncodedPixelsDimensionsAtom;->height:D

    return-wide v0
.end method

.method public getWidth()D
    .locals 2

    .prologue
    sget-object v0, Lcom/googlecode/mp4parser/boxes/apple/TrackEncodedPixelsDimensionsAtom;->ajc$tjp_0:Lorg/b/a/a$a;

    invoke-static {v0, p0, p0}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 45
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iget-wide v0, p0, Lcom/googlecode/mp4parser/boxes/apple/TrackEncodedPixelsDimensionsAtom;->width:D

    return-wide v0
.end method

.method public setHeight(D)V
    .locals 3

    .prologue
    sget-object v0, Lcom/googlecode/mp4parser/boxes/apple/TrackEncodedPixelsDimensionsAtom;->ajc$tjp_3:Lorg/b/a/a$a;

    invoke-static {p1, p2}, Lorg/b/b/a/a;->a(D)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 57
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput-wide p1, p0, Lcom/googlecode/mp4parser/boxes/apple/TrackEncodedPixelsDimensionsAtom;->height:D

    .line 58
    return-void
.end method

.method public setWidth(D)V
    .locals 3

    .prologue
    sget-object v0, Lcom/googlecode/mp4parser/boxes/apple/TrackEncodedPixelsDimensionsAtom;->ajc$tjp_1:Lorg/b/a/a$a;

    invoke-static {p1, p2}, Lorg/b/b/a/a;->a(D)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, p0, v1}, Lorg/b/b/b/b;->a(Lorg/b/a/a$a;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/b/a/a;

    move-result-object v0

    .line 49
    invoke-static {}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->aspectOf()Lcom/googlecode/mp4parser/RequiresParseDetailAspect;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/RequiresParseDetailAspect;->before(Lorg/b/a/a;)V

    iput-wide p1, p0, Lcom/googlecode/mp4parser/boxes/apple/TrackEncodedPixelsDimensionsAtom;->width:D

    .line 50
    return-void
.end method
