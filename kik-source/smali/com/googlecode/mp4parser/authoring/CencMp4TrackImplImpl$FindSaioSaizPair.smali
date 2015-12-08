.class Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "FindSaioSaizPair"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private container:Lcom/coremedia/iso/boxes/Container;

.field private saio:Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;

.field private saiz:Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;

.field final synthetic this$0:Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 207
    const-class v0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;Lcom/coremedia/iso/boxes/Container;)V
    .locals 0

    .prologue
    .line 212
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->this$0:Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 213
    iput-object p2, p0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->container:Lcom/coremedia/iso/boxes/Container;

    .line 214
    return-void
.end method

.method static synthetic access$0(Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;)Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;
    .locals 1

    .prologue
    .line 210
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->saio:Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;

    return-object v0
.end method

.method static synthetic access$1(Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;)Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;
    .locals 1

    .prologue
    .line 209
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->saiz:Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;

    return-object v0
.end method


# virtual methods
.method public getSaio()Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;
    .locals 1

    .prologue
    .line 221
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->saio:Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;

    return-object v0
.end method

.method public getSaiz()Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;
    .locals 1

    .prologue
    .line 217
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->saiz:Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;

    return-object v0
.end method

.method public invoke()Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 225
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->container:Lcom/coremedia/iso/boxes/Container;

    const-class v1, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;

    invoke-interface {v0, v1}, Lcom/coremedia/iso/boxes/Container;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    .line 226
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->container:Lcom/coremedia/iso/boxes/Container;

    const-class v1, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;

    invoke-interface {v0, v1}, Lcom/coremedia/iso/boxes/Container;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v3

    .line 227
    sget-boolean v0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 228
    :cond_0
    iput-object v4, p0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->saiz:Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;

    .line 229
    iput-object v4, p0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->saio:Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;

    .line 231
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lt v1, v0, :cond_1

    .line 247
    return-object p0

    .line 232
    :cond_1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->saiz:Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;

    if-nez v0, :cond_2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;

    invoke-virtual {v0}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;->getAuxInfoType()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    :cond_2
    const-string v4, "cenc"

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;

    invoke-virtual {v0}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;->getAuxInfoType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 233
    :cond_3
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->saiz:Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;

    .line 239
    :goto_1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->saio:Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;

    if-nez v0, :cond_4

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;

    invoke-virtual {v0}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;->getAuxInfoType()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    :cond_4
    const-string v4, "cenc"

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;

    invoke-virtual {v0}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;->getAuxInfoType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 240
    :cond_5
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->saio:Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;

    .line 231
    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 234
    :cond_6
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->saiz:Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->saiz:Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;

    invoke-virtual {v0}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;->getAuxInfoType()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_7

    const-string v4, "cenc"

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;

    invoke-virtual {v0}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;->getAuxInfoType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 235
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->saiz:Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationSizesBox;

    goto :goto_1

    .line 237
    :cond_7
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Are there two cenc labeled saiz?"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 241
    :cond_8
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->saio:Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->saio:Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;

    invoke-virtual {v0}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;->getAuxInfoType()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_9

    const-string v4, "cenc"

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;

    invoke-virtual {v0}, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;->getAuxInfoType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 242
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/CencMp4TrackImplImpl$FindSaioSaizPair;->saio:Lcom/mp4parser/iso14496/part12/SampleAuxiliaryInformationOffsetsBox;

    goto :goto_2

    .line 244
    :cond_9
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Are there two cenc labeled saio?"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
