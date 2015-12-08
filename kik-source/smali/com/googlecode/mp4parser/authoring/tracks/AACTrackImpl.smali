.class public Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;
.super Lcom/googlecode/mp4parser/authoring/AbstractTrack;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;
    }
.end annotation


# static fields
.field static audioObjectTypes:Ljava/util/Map;

.field public static samplingFrequencyIndexMap:Ljava/util/Map;


# instance fields
.field avgBitRate:J

.field bufferSizeDB:I

.field private dataSource:Lcom/googlecode/mp4parser/DataSource;

.field decTimes:[J

.field firstHeader:Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;

.field private lang:Ljava/lang/String;

.field maxBitRate:J

.field sampleDescriptionBox:Lcom/coremedia/iso/boxes/SampleDescriptionBox;

.field private samples:Ljava/util/List;

.field trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x5

    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    .line 37
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 40
    sput-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "AAC Main"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "AAC LC (Low Complexity)"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "AAC SSR (Scalable Sample Rate)"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "AAC LTP (Long Term Prediction)"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "SBR (Spectral Band Replication)"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "AAC Scalable"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "TwinVQ"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "CELP (Code Excited Linear Prediction)"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "HXVC (Harmonic Vector eXcitation Coding)"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Reserved"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0xb

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Reserved"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0xc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "TTSI (Text-To-Speech Interface)"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0xd

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Main Synthesis"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Wavetable Synthesis"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0xf

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "General MIDI"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x10

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Algorithmic Synthesis and Audio Effects"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ER (Error Resilient) AAC LC"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x12

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Reserved"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x13

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ER AAC LTP"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x14

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ER AAC Scalable"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x15

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ER TwinVQ"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x16

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ER BSAC (Bit-Sliced Arithmetic Coding)"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x17

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ER AAC LD (Low Delay)"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x18

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ER CELP"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ER HVXC"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x1a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ER HILN (Harmonic and Individual Lines plus Noise)"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x1b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ER Parametric"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x1c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "SSC (SinuSoidal Coding)"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x1d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "PS (Parametric Stereo)"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x1e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "MPEG Surround"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x1f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "(Escape value)"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x20

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Layer-1"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x21

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Layer-2"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x22

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Layer-3"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x23

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "DST (Direct Stream Transfer)"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x24

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ALS (Audio Lossless)"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x25

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "SLS (Scalable LosslesS)"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x26

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "SLS non-core"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x27

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ER AAC ELD (Enhanced Low Delay)"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x28

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "SMR (Symbolic Music Representation) Simple"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x29

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "SMR Main"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x2a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "USAC (Unified Speech and Audio Coding) (no SBR)"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x2b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "SAOC (Spatial Audio Object Coding)"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x2c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "LD MPEG Surround"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->audioObjectTypes:Ljava/util/Map;

    const/16 v1, 0x2d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "USAC"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 90
    sput-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    const v1, 0x17700

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    const v1, 0x15888

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    const v1, 0xfa00

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    const v1, 0xbb80

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    const v1, 0xac44

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    const/16 v1, 0x7d00

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    const/16 v1, 0x5dc0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    const/16 v1, 0x5622

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    const/16 v1, 0x3e80

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    const/16 v1, 0x2ee0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    const/16 v1, 0x2b11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xa

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    const/16 v1, 0x1f40

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xb

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0x17700

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0x15888

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0xfa00

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0xbb80

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0xac44

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x7d00

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x5dc0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x5622

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x3e80

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    const/16 v1, 0x9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x2ee0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x2b11

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    const/16 v1, 0xb

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x1f40

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    return-void
.end method

.method public constructor <init>(Lcom/googlecode/mp4parser/DataSource;)V
    .locals 1

    .prologue
    .line 135
    const-string v0, "eng"

    invoke-direct {p0, p1, v0}, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;-><init>(Lcom/googlecode/mp4parser/DataSource;Ljava/lang/String;)V

    .line 136
    return-void
.end method

.method public constructor <init>(Lcom/googlecode/mp4parser/DataSource;Ljava/lang/String;)V
    .locals 12

    .prologue
    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/authoring/AbstractTrack;-><init>(Ljava/lang/String;)V

    .line 116
    new-instance v0, Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    .line 127
    const-string v0, "eng"

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->lang:Ljava/lang/String;

    .line 139
    iput-object p2, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->lang:Ljava/lang/String;

    .line 140
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    .line 141
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samples:Ljava/util/List;

    .line 142
    invoke-direct {p0, p1}, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->readSamples(Lcom/googlecode/mp4parser/DataSource;)Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->firstHeader:Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;

    .line 144
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->firstHeader:Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;

    iget v0, v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->sampleRate:I

    int-to-double v0, v0

    const-wide/high16 v2, 0x4090000000000000L    # 1024.0

    div-double v4, v0, v2

    .line 145
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samples:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-double v0, v0

    div-double v6, v0, v4

    .line 147
    const-wide/16 v0, 0x0

    .line 148
    new-instance v8, Ljava/util/LinkedList;

    invoke-direct {v8}, Ljava/util/LinkedList;-><init>()V

    .line 149
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samples:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move-wide v2, v0

    :cond_0
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 168
    const-wide/16 v0, 0x8

    mul-long/2addr v0, v2

    long-to-double v0, v0

    div-double/2addr v0, v6

    double-to-int v0, v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->avgBitRate:J

    .line 170
    const/16 v0, 0x600

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->bufferSizeDB:I

    .line 172
    new-instance v0, Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/SampleDescriptionBox;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->sampleDescriptionBox:Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    .line 173
    new-instance v0, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;

    const-string v1, "mp4a"

    invoke-direct {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;-><init>(Ljava/lang/String;)V

    .line 174
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->firstHeader:Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;

    iget v1, v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->channelconfig:I

    const/4 v2, 0x7

    if-ne v1, v2, :cond_4

    .line 175
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setChannelCount(I)V

    .line 179
    :goto_1
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->firstHeader:Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;

    iget v1, v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->sampleRate:I

    int-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setSampleRate(J)V

    .line 180
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setDataReferenceIndex(I)V

    .line 181
    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setSampleSize(I)V

    .line 184
    new-instance v1, Lcom/googlecode/mp4parser/boxes/mp4/ESDescriptorBox;

    invoke-direct {v1}, Lcom/googlecode/mp4parser/boxes/mp4/ESDescriptorBox;-><init>()V

    .line 185
    new-instance v2, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;

    invoke-direct {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;-><init>()V

    .line 186
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->setEsId(I)V

    .line 188
    new-instance v3, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/SLConfigDescriptor;

    invoke-direct {v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/SLConfigDescriptor;-><init>()V

    .line 189
    const/4 v4, 0x2

    invoke-virtual {v3, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/SLConfigDescriptor;->setPredefined(I)V

    .line 190
    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->setSlConfigDescriptor(Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/SLConfigDescriptor;)V

    .line 192
    new-instance v3, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;

    invoke-direct {v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;-><init>()V

    .line 193
    const/16 v4, 0x40

    invoke-virtual {v3, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->setObjectTypeIndication(I)V

    .line 194
    const/4 v4, 0x5

    invoke-virtual {v3, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->setStreamType(I)V

    .line 195
    iget v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->bufferSizeDB:I

    invoke-virtual {v3, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->setBufferSizeDB(I)V

    .line 196
    iget-wide v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->maxBitRate:J

    invoke-virtual {v3, v4, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->setMaxBitRate(J)V

    .line 197
    iget-wide v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->avgBitRate:J

    invoke-virtual {v3, v4, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->setAvgBitRate(J)V

    .line 199
    new-instance v4, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/AudioSpecificConfig;

    invoke-direct {v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/AudioSpecificConfig;-><init>()V

    .line 200
    const/4 v5, 0x2

    invoke-virtual {v4, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/AudioSpecificConfig;->setAudioObjectType(I)V

    .line 201
    iget-object v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->firstHeader:Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;

    iget v5, v5, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->sampleFrequencyIndex:I

    invoke-virtual {v4, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/AudioSpecificConfig;->setSamplingFrequencyIndex(I)V

    .line 202
    iget-object v5, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->firstHeader:Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;

    iget v5, v5, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->channelconfig:I

    invoke-virtual {v4, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/AudioSpecificConfig;->setChannelConfiguration(I)V

    .line 203
    invoke-virtual {v3, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;->setAudioSpecificInfo(Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/AudioSpecificConfig;)V

    .line 205
    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->setDecoderConfigDescriptor(Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/DecoderConfigDescriptor;)V

    .line 207
    invoke-virtual {v2}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;->serialize()Ljava/nio/ByteBuffer;

    move-result-object v3

    .line 208
    invoke-virtual {v1, v2}, Lcom/googlecode/mp4parser/boxes/mp4/ESDescriptorBox;->setEsDescriptor(Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/ESDescriptor;)V

    .line 209
    invoke-virtual {v1, v3}, Lcom/googlecode/mp4parser/boxes/mp4/ESDescriptorBox;->setData(Ljava/nio/ByteBuffer;)V

    .line 210
    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->addBox(Lcom/coremedia/iso/boxes/Box;)V

    .line 211
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->sampleDescriptionBox:Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    invoke-virtual {v1, v0}, Lcom/coremedia/iso/boxes/SampleDescriptionBox;->addBox(Lcom/coremedia/iso/boxes/Box;)V

    .line 213
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->setCreationTime(Ljava/util/Date;)V

    .line 214
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->setModificationTime(Ljava/util/Date;)V

    .line 215
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    invoke-virtual {v0, p2}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->setLanguage(Ljava/lang/String;)V

    .line 216
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->setVolume(F)V

    .line 217
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->firstHeader:Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;

    iget v1, v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->sampleRate:I

    int-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->setTimescale(J)V

    .line 218
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samples:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [J

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->decTimes:[J

    .line 219
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->decTimes:[J

    const-wide/16 v2, 0x400

    invoke-static {v0, v2, v3}, Ljava/util/Arrays;->fill([JJ)V

    .line 220
    return-void

    .line 149
    :cond_1
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/googlecode/mp4parser/authoring/Sample;

    .line 150
    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Sample;->getSize()J

    move-result-wide v0

    long-to-int v0, v0

    .line 151
    int-to-long v10, v0

    add-long/2addr v2, v10

    .line 152
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 153
    :goto_2
    invoke-virtual {v8}, Ljava/util/LinkedList;->size()I

    move-result v0

    int-to-double v0, v0

    cmpl-double v0, v0, v4

    if-gtz v0, :cond_2

    .line 156
    invoke-virtual {v8}, Ljava/util/LinkedList;->size()I

    move-result v0

    double-to-int v1, v4

    if-ne v0, v1, :cond_0

    .line 157
    const/4 v0, 0x0

    .line 158
    invoke-virtual {v8}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move v1, v0

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_3

    .line 161
    const-wide/high16 v10, 0x4020000000000000L    # 8.0

    int-to-double v0, v1

    mul-double/2addr v0, v10

    invoke-virtual {v8}, Ljava/util/LinkedList;->size()I

    move-result v10

    int-to-double v10, v10

    div-double/2addr v0, v10

    mul-double/2addr v0, v4

    .line 162
    iget-wide v10, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->maxBitRate:J

    long-to-double v10, v10

    cmpl-double v10, v0, v10

    if-lez v10, :cond_0

    .line 163
    double-to-int v0, v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->maxBitRate:J

    goto/16 :goto_0

    .line 154
    :cond_2
    invoke-virtual {v8}, Ljava/util/LinkedList;->pop()Ljava/lang/Object;

    goto :goto_2

    .line 158
    :cond_3
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 159
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    goto :goto_3

    .line 177
    :cond_4
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->firstHeader:Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;

    iget v1, v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->channelconfig:I

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/sampleentry/AudioSampleEntry;->setChannelCount(I)V

    goto/16 :goto_1
.end method

.method static synthetic access$0(Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;)Lcom/googlecode/mp4parser/DataSource;
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    return-object v0
.end method

.method private readADTSHeader(Lcom/googlecode/mp4parser/DataSource;)Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;
    .locals 7

    .prologue
    const/4 v6, 0x7

    const/4 v5, 0x2

    const/4 v4, 0x1

    .line 282
    new-instance v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;

    invoke-direct {v1, p0}, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;-><init>(Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;)V

    .line 283
    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 284
    :cond_0
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v2

    if-lt v2, v6, :cond_1

    .line 290
    new-instance v2, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-direct {v2, v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;-><init>(Ljava/nio/ByteBuffer;)V

    .line 291
    const/16 v0, 0xc

    invoke-virtual {v2, v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v0

    .line 292
    const/16 v3, 0xfff

    if-eq v0, v3, :cond_2

    .line 293
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Expected Start Word 0xfff"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 285
    :cond_1
    invoke-interface {p1, v0}, Lcom/googlecode/mp4parser/DataSource;->read(Ljava/nio/ByteBuffer;)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    .line 286
    const/4 v0, 0x0

    .line 318
    :goto_0
    return-object v0

    .line 295
    :cond_2
    invoke-virtual {v2, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v0

    iput v0, v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->mpegVersion:I

    .line 296
    invoke-virtual {v2, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v0

    iput v0, v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->layer:I

    .line 297
    invoke-virtual {v2, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v0

    iput v0, v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->protectionAbsent:I

    .line 298
    invoke-virtual {v2, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iput v0, v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->profile:I

    .line 300
    const/4 v0, 0x4

    invoke-virtual {v2, v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v0

    iput v0, v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->sampleFrequencyIndex:I

    .line 301
    sget-object v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samplingFrequencyIndexMap:Ljava/util/Map;

    iget v3, v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->sampleFrequencyIndex:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->sampleRate:I

    .line 302
    invoke-virtual {v2, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    .line 303
    const/4 v0, 0x3

    invoke-virtual {v2, v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v0

    iput v0, v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->channelconfig:I

    .line 304
    invoke-virtual {v2, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v0

    iput v0, v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->original:I

    .line 305
    invoke-virtual {v2, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v0

    iput v0, v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->home:I

    .line 306
    invoke-virtual {v2, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v0

    iput v0, v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->copyrightedStream:I

    .line 307
    invoke-virtual {v2, v4}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v0

    iput v0, v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->copyrightStart:I

    .line 308
    const/16 v0, 0xd

    invoke-virtual {v2, v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v0

    iput v0, v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->frameLength:I

    .line 310
    const/16 v0, 0xb

    invoke-virtual {v2, v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v0

    iput v0, v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->bufferFullness:I

    .line 311
    invoke-virtual {v2, v5}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitReaderBuffer;->readBits(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iput v0, v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->numAacFramesPerAdtsFrame:I

    .line 312
    iget v0, v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->numAacFramesPerAdtsFrame:I

    if-eq v0, v4, :cond_3

    .line 313
    new-instance v0, Ljava/io/IOException;

    const-string v1, "This muxer can only work with 1 AAC frame per ADTS frame"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 315
    :cond_3
    iget v0, v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->protectionAbsent:I

    if-nez v0, :cond_4

    .line 316
    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/googlecode/mp4parser/DataSource;->read(Ljava/nio/ByteBuffer;)I

    :cond_4
    move-object v0, v1

    .line 318
    goto/16 :goto_0
.end method

.method private readSamples(Lcom/googlecode/mp4parser/DataSource;)Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;
    .locals 9

    .prologue
    .line 322
    const/4 v0, 0x0

    .line 325
    :goto_0
    invoke-direct {p0, p1}, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->readADTSHeader(Lcom/googlecode/mp4parser/DataSource;)Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;

    move-result-object v7

    if-nez v7, :cond_0

    .line 351
    return-object v0

    .line 326
    :cond_0
    if-nez v0, :cond_1

    move-object v6, v7

    .line 330
    :goto_1
    invoke-interface {p1}, Lcom/googlecode/mp4parser/DataSource;->position()J

    move-result-wide v2

    .line 331
    iget v0, v7, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->frameLength:I

    invoke-virtual {v7}, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->getSize()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-long v4, v0

    .line 332
    iget-object v8, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samples:Ljava/util/List;

    new-instance v0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$1;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$1;-><init>(Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;JJ)V

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 349
    invoke-interface {p1}, Lcom/googlecode/mp4parser/DataSource;->position()J

    move-result-wide v0

    iget v2, v7, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->frameLength:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    invoke-virtual {v7}, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->getSize()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr v0, v2

    invoke-interface {p1, v0, v1}, Lcom/googlecode/mp4parser/DataSource;->position(J)V

    move-object v0, v6

    goto :goto_0

    :cond_1
    move-object v6, v0

    goto :goto_1
.end method


# virtual methods
.method public close()V
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/DataSource;->close()V

    .line 132
    return-void
.end method

.method public getCompositionTimeEntries()Ljava/util/List;
    .locals 1

    .prologue
    .line 231
    const/4 v0, 0x0

    return-object v0
.end method

.method public getHandler()Ljava/lang/String;
    .locals 1

    .prologue
    .line 247
    const-string v0, "soun"

    return-object v0
.end method

.method public getSampleDependencies()Ljava/util/List;
    .locals 1

    .prologue
    .line 239
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSampleDescriptionBox()Lcom/coremedia/iso/boxes/SampleDescriptionBox;
    .locals 1

    .prologue
    .line 223
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->sampleDescriptionBox:Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    return-object v0
.end method

.method public getSampleDurations()[J
    .locals 1

    .prologue
    .line 227
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->decTimes:[J

    return-object v0
.end method

.method public getSamples()Ljava/util/List;
    .locals 1

    .prologue
    .line 251
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->samples:Ljava/util/List;

    return-object v0
.end method

.method public getSubsampleInformationBox()Lcom/coremedia/iso/boxes/SubSampleInformationBox;
    .locals 1

    .prologue
    .line 255
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSyncSamples()[J
    .locals 1

    .prologue
    .line 235
    const/4 v0, 0x0

    return-object v0
.end method

.method public getTrackMetaData()Lcom/googlecode/mp4parser/authoring/TrackMetaData;
    .locals 1

    .prologue
    .line 243
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 356
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AACTrackImpl{sampleRate="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 357
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->firstHeader:Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;

    iget v1, v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->sampleRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 358
    const-string v1, ", channelconfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl;->firstHeader:Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;

    iget v1, v1, Lcom/googlecode/mp4parser/authoring/tracks/AACTrackImpl$AdtsHeader;->channelconfig:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 359
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 356
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
