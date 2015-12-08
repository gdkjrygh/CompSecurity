.class public Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;
.super Lcom/googlecode/mp4parser/authoring/AbstractTrack;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$TextTrackNamespaceContext;
    }
.end annotation


# static fields
.field public static final SMPTE_TT_NAMESPACE:Ljava/lang/String; = "http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt"


# instance fields
.field XMLSubtitleSampleEntry:Lcom/mp4parser/iso14496/part30/XMLSubtitleSampleEntry;

.field containsImages:Z

.field sampleDescriptionBox:Lcom/coremedia/iso/boxes/SampleDescriptionBox;

.field private sampleDurations:[J

.field samples:Ljava/util/List;

.field subSampleInformationBox:Lcom/coremedia/iso/boxes/SubSampleInformationBox;

.field trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;


# direct methods
.method public varargs constructor <init>([Ljava/io/File;)V
    .locals 17

    .prologue
    .line 127
    const/4 v2, 0x0

    aget-object v2, p1, v2

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/googlecode/mp4parser/authoring/AbstractTrack;-><init>(Ljava/lang/String;)V

    .line 34
    new-instance v2, Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    invoke-direct {v2}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;-><init>()V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    .line 35
    new-instance v2, Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    invoke-direct {v2}, Lcom/coremedia/iso/boxes/SampleDescriptionBox;-><init>()V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->sampleDescriptionBox:Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    .line 36
    new-instance v2, Lcom/mp4parser/iso14496/part30/XMLSubtitleSampleEntry;

    invoke-direct {v2}, Lcom/mp4parser/iso14496/part30/XMLSubtitleSampleEntry;-><init>()V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->XMLSubtitleSampleEntry:Lcom/mp4parser/iso14496/part30/XMLSubtitleSampleEntry;

    .line 38
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->samples:Ljava/util/List;

    .line 39
    new-instance v2, Lcom/coremedia/iso/boxes/SubSampleInformationBox;

    invoke-direct {v2}, Lcom/coremedia/iso/boxes/SubSampleInformationBox;-><init>()V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->subSampleInformationBox:Lcom/coremedia/iso/boxes/SubSampleInformationBox;

    .line 128
    move-object/from16 v0, p1

    array-length v2, v0

    new-array v2, v2, [J

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->sampleDurations:[J

    .line 129
    invoke-static {}, Ljavax/xml/parsers/DocumentBuilderFactory;->newInstance()Ljavax/xml/parsers/DocumentBuilderFactory;

    move-result-object v2

    .line 130
    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljavax/xml/parsers/DocumentBuilderFactory;->setNamespaceAware(Z)V

    .line 131
    invoke-virtual {v2}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;

    move-result-object v12

    .line 132
    const-wide/16 v4, 0x0

    .line 133
    const/4 v3, 0x0

    .line 134
    const/4 v2, 0x0

    move v7, v2

    move-wide v8, v4

    :goto_0
    move-object/from16 v0, p1

    array-length v2, v0

    if-lt v7, v2, :cond_0

    .line 244
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    invoke-static {v3}, Lcom/googlecode/mp4parser/util/Iso639;->convert2to3(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->setLanguage(Ljava/lang/String;)V

    .line 245
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->XMLSubtitleSampleEntry:Lcom/mp4parser/iso14496/part30/XMLSubtitleSampleEntry;

    const-string v3, "http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt"

    invoke-virtual {v2, v3}, Lcom/mp4parser/iso14496/part30/XMLSubtitleSampleEntry;->setNamespace(Ljava/lang/String;)V

    .line 246
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->XMLSubtitleSampleEntry:Lcom/mp4parser/iso14496/part30/XMLSubtitleSampleEntry;

    const-string v3, "http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt"

    invoke-virtual {v2, v3}, Lcom/mp4parser/iso14496/part30/XMLSubtitleSampleEntry;->setSchemaLocation(Ljava/lang/String;)V

    .line 247
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->containsImages:Z

    if-eqz v2, :cond_7

    .line 248
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->XMLSubtitleSampleEntry:Lcom/mp4parser/iso14496/part30/XMLSubtitleSampleEntry;

    const-string v3, "image/png"

    invoke-virtual {v2, v3}, Lcom/mp4parser/iso14496/part30/XMLSubtitleSampleEntry;->setAuxiliaryMimeTypes(Ljava/lang/String;)V

    .line 252
    :goto_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->sampleDescriptionBox:Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->XMLSubtitleSampleEntry:Lcom/mp4parser/iso14496/part30/XMLSubtitleSampleEntry;

    invoke-virtual {v2, v3}, Lcom/coremedia/iso/boxes/SampleDescriptionBox;->addBox(Lcom/coremedia/iso/boxes/Box;)V

    .line 253
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    const-wide/16 v4, 0x7530

    invoke-virtual {v2, v4, v5}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->setTimescale(J)V

    .line 254
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    const v3, 0xffff

    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->setLayer(I)V

    .line 257
    return-void

    .line 135
    :cond_0
    aget-object v13, p1, v7

    .line 136
    new-instance v14, Lcom/coremedia/iso/boxes/SubSampleInformationBox$SubSampleEntry;

    invoke-direct {v14}, Lcom/coremedia/iso/boxes/SubSampleInformationBox$SubSampleEntry;-><init>()V

    .line 137
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->subSampleInformationBox:Lcom/coremedia/iso/boxes/SubSampleInformationBox;

    invoke-virtual {v2}, Lcom/coremedia/iso/boxes/SubSampleInformationBox;->getEntries()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 138
    const-wide/16 v4, 0x1

    invoke-virtual {v14, v4, v5}, Lcom/coremedia/iso/boxes/SubSampleInformationBox$SubSampleEntry;->setSampleDelta(J)V

    .line 140
    invoke-virtual {v12, v13}, Ljavax/xml/parsers/DocumentBuilder;->parse(Ljava/io/File;)Lorg/w3c/dom/Document;

    move-result-object v4

    .line 141
    invoke-static {v4}, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->getLanguage(Lorg/w3c/dom/Document;)Ljava/lang/String;

    move-result-object v2

    .line 142
    if-nez v3, :cond_1

    move-object v5, v2

    .line 148
    :goto_2
    invoke-static {}, Ljavax/xml/xpath/XPathFactory;->newInstance()Ljavax/xml/xpath/XPathFactory;

    move-result-object v2

    .line 149
    new-instance v3, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$TextTrackNamespaceContext;

    const/4 v6, 0x0

    invoke-direct {v3, v6}, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$TextTrackNamespaceContext;-><init>(Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$TextTrackNamespaceContext;)V

    .line 150
    invoke-virtual {v2}, Ljavax/xml/xpath/XPathFactory;->newXPath()Ljavax/xml/xpath/XPath;

    move-result-object v2

    .line 151
    invoke-interface {v2, v3}, Ljavax/xml/xpath/XPath;->setNamespaceContext(Ljavax/xml/namespace/NamespaceContext;)V

    .line 153
    invoke-static {v4}, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->latestTimestamp(Lorg/w3c/dom/Document;)J

    move-result-wide v10

    .line 154
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->sampleDurations:[J

    sub-long v8, v10, v8

    aput-wide v8, v3, v7

    .line 157
    const-string v3, "/ttml:tt/ttml:body/ttml:div/@smpte:backgroundImage"

    invoke-interface {v2, v3}, Ljavax/xml/xpath/XPath;->compile(Ljava/lang/String;)Ljavax/xml/xpath/XPathExpression;

    move-result-object v2

    .line 158
    sget-object v3, Ljavax/xml/xpath/XPathConstants;->NODESET:Ljavax/xml/namespace/QName;

    invoke-interface {v2, v4, v3}, Ljavax/xml/xpath/XPathExpression;->evaluate(Ljava/lang/Object;Ljavax/xml/namespace/QName;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/w3c/dom/NodeList;

    .line 160
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 161
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 162
    const/4 v3, 0x0

    :goto_3
    invoke-interface {v2}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v6

    if-lt v3, v6, :cond_2

    .line 165
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object v2, v3

    .line 166
    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 168
    const/4 v2, 0x1

    .line 169
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move v4, v2

    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_3

    .line 173
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    .line 174
    new-instance v2, Ljava/lang/String;

    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, v13}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object/from16 v0, p0

    invoke-direct {v0, v4}, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->streamToByteArray(Ljava/io/InputStream;)[B

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/lang/String;-><init>([B)V

    .line 175
    invoke-virtual {v8}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move-object v6, v2

    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_4

    .line 179
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 180
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->samples:Ljava/util/List;

    new-instance v8, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$1;

    move-object/from16 v0, p0

    invoke-direct {v8, v0, v6, v4}, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$1;-><init>(Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 213
    new-instance v2, Lcom/coremedia/iso/boxes/SubSampleInformationBox$SubSampleEntry$SubsampleEntry;

    invoke-direct {v2}, Lcom/coremedia/iso/boxes/SubSampleInformationBox$SubSampleEntry$SubsampleEntry;-><init>()V

    .line 214
    invoke-static {v6}, Lcom/coremedia/iso/Utf8;->utf8StringLengthInBytes(Ljava/lang/String;)I

    move-result v6

    int-to-long v8, v6

    invoke-virtual {v2, v8, v9}, Lcom/coremedia/iso/boxes/SubSampleInformationBox$SubSampleEntry$SubsampleEntry;->setSubsampleSize(J)V

    .line 215
    invoke-virtual {v14}, Lcom/coremedia/iso/boxes/SubSampleInformationBox$SubSampleEntry;->getSubsampleEntries()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 216
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_5

    .line 134
    :goto_7
    add-int/lit8 v2, v7, 0x1

    move v7, v2

    move-wide v8, v10

    move-object v3, v5

    goto/16 :goto_0

    .line 144
    :cond_1
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    .line 145
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Within one Track all sample documents need to have the same language"

    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 163
    :cond_2
    invoke-interface {v2, v3}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v6

    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 162
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_3

    .line 169
    :cond_3
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 170
    const-string v6, "."

    invoke-virtual {v2, v6}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v15

    .line 171
    new-instance v16, Ljava/lang/StringBuilder;

    const-string v6, "urn:dece:container:subtitleimageindex:"

    move-object/from16 v0, v16

    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v6, v4, 0x1

    move-object/from16 v0, v16

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v4, v6

    goto/16 :goto_4

    .line 175
    :cond_4
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/util/Map$Entry;

    .line 176
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v6, v2, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    move-object v6, v2

    goto/16 :goto_5

    .line 216
    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 217
    new-instance v6, Ljava/io/File;

    invoke-virtual {v13}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v8

    invoke-direct {v6, v8, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 218
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 220
    new-instance v2, Lcom/coremedia/iso/boxes/SubSampleInformationBox$SubSampleEntry$SubsampleEntry;

    invoke-direct {v2}, Lcom/coremedia/iso/boxes/SubSampleInformationBox$SubSampleEntry$SubsampleEntry;-><init>()V

    .line 221
    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v8

    invoke-virtual {v2, v8, v9}, Lcom/coremedia/iso/boxes/SubSampleInformationBox$SubSampleEntry$SubsampleEntry;->setSubsampleSize(J)V

    .line 222
    invoke-virtual {v14}, Lcom/coremedia/iso/boxes/SubSampleInformationBox$SubSampleEntry;->getSubsampleEntries()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    .line 225
    :cond_6
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->samples:Ljava/util/List;

    new-instance v3, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$2;

    move-object/from16 v0, p0

    invoke-direct {v3, v0, v13}, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$2;-><init>(Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;Ljava/io/File;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_7

    .line 250
    :cond_7
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->XMLSubtitleSampleEntry:Lcom/mp4parser/iso14496/part30/XMLSubtitleSampleEntry;

    const-string v3, ""

    invoke-virtual {v2, v3}, Lcom/mp4parser/iso14496/part30/XMLSubtitleSampleEntry;->setAuxiliaryMimeTypes(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_8
    move-object v5, v3

    goto/16 :goto_2
.end method

.method static synthetic access$0(Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;Ljava/io/InputStream;)[B
    .locals 1

    .prologue
    .line 259
    invoke-direct {p0, p1}, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->streamToByteArray(Ljava/io/InputStream;)[B

    move-result-object v0

    return-object v0
.end method

.method public static earliestTimestamp(Lorg/w3c/dom/Document;)J
    .locals 6

    .prologue
    .line 72
    invoke-static {}, Ljavax/xml/xpath/XPathFactory;->newInstance()Ljavax/xml/xpath/XPathFactory;

    move-result-object v0

    .line 73
    new-instance v1, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$TextTrackNamespaceContext;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$TextTrackNamespaceContext;-><init>(Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$TextTrackNamespaceContext;)V

    .line 74
    invoke-virtual {v0}, Ljavax/xml/xpath/XPathFactory;->newXPath()Ljavax/xml/xpath/XPath;

    move-result-object v0

    .line 75
    invoke-interface {v0, v1}, Ljavax/xml/xpath/XPath;->setNamespaceContext(Ljavax/xml/namespace/NamespaceContext;)V

    .line 78
    :try_start_0
    const-string v1, "//*[@begin]"

    invoke-interface {v0, v1}, Ljavax/xml/xpath/XPath;->compile(Ljava/lang/String;)Ljavax/xml/xpath/XPathExpression;

    move-result-object v0

    .line 79
    sget-object v1, Ljavax/xml/xpath/XPathConstants;->NODESET:Ljavax/xml/namespace/QName;

    invoke-interface {v0, p0, v1}, Ljavax/xml/xpath/XPathExpression;->evaluate(Ljava/lang/Object;Ljavax/xml/namespace/QName;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/w3c/dom/NodeList;

    .line 81
    const-wide/16 v2, 0x0

    .line 82
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v4

    if-lt v1, v4, :cond_0

    .line 87
    return-wide v2

    .line 83
    :cond_0
    invoke-interface {v0, v1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v4

    .line 84
    invoke-interface {v4}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v4

    const-string v5, "begin"

    invoke-interface {v4, v5}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v4

    invoke-interface {v4}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v4

    .line 85
    invoke-static {v4}, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->toTime(Ljava/lang/String;)J

    move-result-wide v4

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J
    :try_end_0
    .catch Ljavax/xml/xpath/XPathExpressionException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v2

    .line 82
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 88
    :catch_0
    move-exception v0

    .line 89
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static getLanguage(Lorg/w3c/dom/Document;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 68
    invoke-interface {p0}, Lorg/w3c/dom/Document;->getDocumentElement()Lorg/w3c/dom/Element;

    move-result-object v0

    const-string v1, "xml:lang"

    invoke-interface {v0, v1}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static latestTimestamp(Lorg/w3c/dom/Document;)J
    .locals 8

    .prologue
    .line 95
    invoke-static {}, Ljavax/xml/xpath/XPathFactory;->newInstance()Ljavax/xml/xpath/XPathFactory;

    move-result-object v0

    .line 96
    new-instance v1, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$TextTrackNamespaceContext;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$TextTrackNamespaceContext;-><init>(Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl$TextTrackNamespaceContext;)V

    .line 97
    invoke-virtual {v0}, Ljavax/xml/xpath/XPathFactory;->newXPath()Ljavax/xml/xpath/XPath;

    move-result-object v0

    .line 98
    invoke-interface {v0, v1}, Ljavax/xml/xpath/XPath;->setNamespaceContext(Ljavax/xml/namespace/NamespaceContext;)V

    .line 101
    :try_start_0
    const-string v1, "//*[@begin]"

    invoke-interface {v0, v1}, Ljavax/xml/xpath/XPath;->compile(Ljava/lang/String;)Ljavax/xml/xpath/XPathExpression;

    move-result-object v0

    .line 103
    sget-object v1, Ljavax/xml/xpath/XPathConstants;->NODESET:Ljavax/xml/namespace/QName;

    invoke-interface {v0, p0, v1}, Ljavax/xml/xpath/XPathExpression;->evaluate(Ljava/lang/Object;Ljavax/xml/namespace/QName;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/w3c/dom/NodeList;

    .line 105
    const-wide/16 v2, 0x0

    .line 106
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v4

    if-lt v1, v4, :cond_0

    .line 119
    return-wide v2

    .line 107
    :cond_0
    invoke-interface {v0, v1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v4

    .line 108
    invoke-interface {v4}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v5

    const-string v6, "begin"

    invoke-interface {v5, v6}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v5

    invoke-interface {v5}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v5

    .line 110
    invoke-interface {v4}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v6

    const-string v7, "dur"

    invoke-interface {v6, v7}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 111
    invoke-static {v5}, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->toTime(Ljava/lang/String;)J

    move-result-wide v6

    invoke-interface {v4}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v4

    const-string v5, "dur"

    invoke-interface {v4, v5}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v4

    invoke-interface {v4}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->toTime(Ljava/lang/String;)J

    move-result-wide v4

    add-long/2addr v4, v6

    .line 117
    :goto_1
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    .line 106
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 112
    :cond_1
    invoke-interface {v4}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v5

    const-string v6, "end"

    invoke-interface {v5, v6}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 113
    invoke-interface {v4}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v4

    const-string v5, "end"

    invoke-interface {v4, v5}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v4

    invoke-interface {v4}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->toTime(Ljava/lang/String;)J

    move-result-wide v4

    goto :goto_1

    .line 115
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "neither end nor dur attribute is present"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljavax/xml/xpath/XPathExpressionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 120
    :catch_0
    move-exception v0

    .line 121
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private streamToByteArray(Ljava/io/InputStream;)[B
    .locals 4

    .prologue
    .line 260
    const/16 v0, 0x1fa0

    new-array v0, v0, [B

    .line 261
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 264
    :goto_0
    const/4 v2, -0x1

    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    move-result v3

    if-ne v2, v3, :cond_0

    .line 267
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0

    .line 265
    :cond_0
    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0
.end method

.method static toTime(Ljava/lang/String;)J
    .locals 12

    .prologue
    const-wide/16 v10, 0x3e8

    const-wide/16 v8, 0x3c

    .line 46
    const-string v0, "([0-9][0-9]):([0-9][0-9]):([0-9][0-9])([\\.:][0-9][0-9]?[0-9]?)?"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 47
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 49
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    .line 50
    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    .line 51
    const/4 v3, 0x3

    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    .line 52
    const/4 v4, 0x4

    invoke-virtual {v0, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    .line 53
    if-nez v0, :cond_0

    .line 54
    const-string v0, ".000"

    .line 56
    :cond_0
    const-string v4, ":"

    const-string v5, "."

    invoke-virtual {v0, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 57
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    mul-long/2addr v4, v8

    mul-long/2addr v4, v8

    mul-long/2addr v4, v10

    .line 58
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    mul-long/2addr v6, v8

    mul-long/2addr v6, v10

    add-long/2addr v4, v6

    .line 59
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    mul-long/2addr v2, v10

    add-long/2addr v2, v4

    .line 60
    long-to-double v2, v2

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "0"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-wide v4, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v4

    add-double/2addr v0, v2

    double-to-long v0, v0

    .line 61
    return-wide v0

    .line 63
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot match "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " to time expression"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public close()V
    .locals 0

    .prologue
    .line 304
    return-void
.end method

.method public getHandler()Ljava/lang/String;
    .locals 1

    .prologue
    .line 289
    const-string v0, "subt"

    return-object v0
.end method

.method public getSampleDescriptionBox()Lcom/coremedia/iso/boxes/SampleDescriptionBox;
    .locals 1

    .prologue
    .line 271
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->sampleDescriptionBox:Lcom/coremedia/iso/boxes/SampleDescriptionBox;

    return-object v0
.end method

.method public getSampleDurations()[J
    .locals 6

    .prologue
    .line 276
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->sampleDurations:[J

    array-length v0, v0

    new-array v1, v0, [J

    .line 277
    const/4 v0, 0x0

    :goto_0
    array-length v2, v1

    if-lt v0, v2, :cond_0

    .line 280
    return-object v1

    .line 278
    :cond_0
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->sampleDurations:[J

    aget-wide v2, v2, v0

    iget-object v4, p0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    invoke-virtual {v4}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->getTimescale()J

    move-result-wide v4

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    aput-wide v2, v1, v0

    .line 277
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getSamples()Ljava/util/List;
    .locals 1

    .prologue
    .line 293
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->samples:Ljava/util/List;

    return-object v0
.end method

.method public getSubsampleInformationBox()Lcom/coremedia/iso/boxes/SubSampleInformationBox;
    .locals 1

    .prologue
    .line 298
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->subSampleInformationBox:Lcom/coremedia/iso/boxes/SubSampleInformationBox;

    return-object v0
.end method

.method public getTrackMetaData()Lcom/googlecode/mp4parser/authoring/TrackMetaData;
    .locals 1

    .prologue
    .line 285
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/SMPTETTTrackImpl;->trackMetaData:Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    return-object v0
.end method
