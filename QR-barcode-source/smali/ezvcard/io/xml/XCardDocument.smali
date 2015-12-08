.class public Lezvcard/io/xml/XCardDocument;
.super Ljava/lang/Object;
.source "XCardDocument.java"


# static fields
.field private static final nsContext:Lezvcard/io/xml/XCardNamespaceContext;

.field private static final version4:Lezvcard/VCardVersion;


# instance fields
.field private addProdId:Z

.field private document:Lorg/w3c/dom/Document;

.field private index:Lezvcard/io/scribe/ScribeIndex;

.field private final parameterDataTypes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lezvcard/VCardDataType;",
            ">;"
        }
    .end annotation
.end field

.field private final parseWarnings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private root:Lorg/w3c/dom/Element;

.field private versionStrict:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 131
    sget-object v0, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    sput-object v0, Lezvcard/io/xml/XCardDocument;->version4:Lezvcard/VCardVersion;

    .line 132
    new-instance v0, Lezvcard/io/xml/XCardNamespaceContext;

    sget-object v1, Lezvcard/io/xml/XCardDocument;->version4:Lezvcard/VCardVersion;

    const-string v2, "v"

    invoke-direct {v0, v1, v2}, Lezvcard/io/xml/XCardNamespaceContext;-><init>(Lezvcard/VCardVersion;Ljava/lang/String;)V

    sput-object v0, Lezvcard/io/xml/XCardDocument;->nsContext:Lezvcard/io/xml/XCardNamespaceContext;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 163
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lezvcard/io/xml/XCardDocument;->parameterDataTypes:Ljava/util/Map;

    .line 140
    const-string v0, "ALTID"

    sget-object v1, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p0, v0, v1}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 141
    const-string v0, "CALSCALE"

    sget-object v1, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p0, v0, v1}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 142
    const-string v0, "GEO"

    sget-object v1, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    invoke-virtual {p0, v0, v1}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 143
    const-string v0, "LABEL"

    sget-object v1, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p0, v0, v1}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 144
    const-string v0, "LANGUAGE"

    sget-object v1, Lezvcard/VCardDataType;->LANGUAGE_TAG:Lezvcard/VCardDataType;

    invoke-virtual {p0, v0, v1}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 145
    const-string v0, "MEDIATYPE"

    sget-object v1, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p0, v0, v1}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 146
    const-string v0, "PID"

    sget-object v1, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p0, v0, v1}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 147
    const-string v0, "PREF"

    sget-object v1, Lezvcard/VCardDataType;->INTEGER:Lezvcard/VCardDataType;

    invoke-virtual {p0, v0, v1}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 148
    const-string v0, "SORT-AS"

    sget-object v1, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p0, v0, v1}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 149
    const-string v0, "TYPE"

    sget-object v1, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p0, v0, v1}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 150
    const-string v0, "TZ"

    sget-object v1, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    invoke-virtual {p0, v0, v1}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 153
    new-instance v0, Lezvcard/io/scribe/ScribeIndex;

    invoke-direct {v0}, Lezvcard/io/scribe/ScribeIndex;-><init>()V

    iput-object v0, p0, Lezvcard/io/xml/XCardDocument;->index:Lezvcard/io/scribe/ScribeIndex;

    .line 154
    iput-boolean v2, p0, Lezvcard/io/xml/XCardDocument;->addProdId:Z

    .line 155
    iput-boolean v2, p0, Lezvcard/io/xml/XCardDocument;->versionStrict:Z

    .line 156
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lezvcard/io/xml/XCardDocument;->parseWarnings:Ljava/util/List;

    .line 164
    invoke-static {}, Lezvcard/util/XmlUtils;->createDocument()Lorg/w3c/dom/Document;

    move-result-object v0

    iput-object v0, p0, Lezvcard/io/xml/XCardDocument;->document:Lorg/w3c/dom/Document;

    .line 165
    const-string v0, "vcards"

    invoke-direct {p0, v0}, Lezvcard/io/xml/XCardDocument;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v0

    iput-object v0, p0, Lezvcard/io/xml/XCardDocument;->root:Lorg/w3c/dom/Element;

    .line 166
    iget-object v0, p0, Lezvcard/io/xml/XCardDocument;->document:Lorg/w3c/dom/Document;

    iget-object v1, p0, Lezvcard/io/xml/XCardDocument;->root:Lorg/w3c/dom/Element;

    invoke-interface {v0, v1}, Lorg/w3c/dom/Document;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 167
    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 4
    .param p1, "file"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x1

    .line 194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lezvcard/io/xml/XCardDocument;->parameterDataTypes:Ljava/util/Map;

    .line 140
    const-string v1, "ALTID"

    sget-object v2, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p0, v1, v2}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 141
    const-string v1, "CALSCALE"

    sget-object v2, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p0, v1, v2}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 142
    const-string v1, "GEO"

    sget-object v2, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    invoke-virtual {p0, v1, v2}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 143
    const-string v1, "LABEL"

    sget-object v2, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p0, v1, v2}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 144
    const-string v1, "LANGUAGE"

    sget-object v2, Lezvcard/VCardDataType;->LANGUAGE_TAG:Lezvcard/VCardDataType;

    invoke-virtual {p0, v1, v2}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 145
    const-string v1, "MEDIATYPE"

    sget-object v2, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p0, v1, v2}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 146
    const-string v1, "PID"

    sget-object v2, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p0, v1, v2}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 147
    const-string v1, "PREF"

    sget-object v2, Lezvcard/VCardDataType;->INTEGER:Lezvcard/VCardDataType;

    invoke-virtual {p0, v1, v2}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 148
    const-string v1, "SORT-AS"

    sget-object v2, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p0, v1, v2}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 149
    const-string v1, "TYPE"

    sget-object v2, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p0, v1, v2}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 150
    const-string v1, "TZ"

    sget-object v2, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    invoke-virtual {p0, v1, v2}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 153
    new-instance v1, Lezvcard/io/scribe/ScribeIndex;

    invoke-direct {v1}, Lezvcard/io/scribe/ScribeIndex;-><init>()V

    iput-object v1, p0, Lezvcard/io/xml/XCardDocument;->index:Lezvcard/io/scribe/ScribeIndex;

    .line 154
    iput-boolean v3, p0, Lezvcard/io/xml/XCardDocument;->addProdId:Z

    .line 155
    iput-boolean v3, p0, Lezvcard/io/xml/XCardDocument;->versionStrict:Z

    .line 156
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lezvcard/io/xml/XCardDocument;->parseWarnings:Ljava/util/List;

    .line 195
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 197
    .local v0, "in":Ljava/io/InputStream;
    :try_start_0
    invoke-static {v0}, Lezvcard/util/XmlUtils;->toDocument(Ljava/io/InputStream;)Lorg/w3c/dom/Document;

    move-result-object v1

    invoke-direct {p0, v1}, Lezvcard/io/xml/XCardDocument;->init(Lorg/w3c/dom/Document;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    invoke-static {v0}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    .line 201
    return-void

    .line 199
    :catchall_0
    move-exception v1

    invoke-static {v0}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    throw v1
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1
    .param p1, "in"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 185
    invoke-static {p1}, Lezvcard/util/XmlUtils;->toDocument(Ljava/io/InputStream;)Lorg/w3c/dom/Document;

    move-result-object v0

    invoke-direct {p0, v0}, Lezvcard/io/xml/XCardDocument;-><init>(Lorg/w3c/dom/Document;)V

    .line 186
    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;)V
    .locals 1
    .param p1, "reader"    # Ljava/io/Reader;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 221
    invoke-static {p1}, Lezvcard/util/XmlUtils;->toDocument(Ljava/io/Reader;)Lorg/w3c/dom/Document;

    move-result-object v0

    invoke-direct {p0, v0}, Lezvcard/io/xml/XCardDocument;-><init>(Lorg/w3c/dom/Document;)V

    .line 222
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "xml"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .prologue
    .line 175
    invoke-static {p1}, Lezvcard/util/XmlUtils;->toDocument(Ljava/lang/String;)Lorg/w3c/dom/Document;

    move-result-object v0

    invoke-direct {p0, v0}, Lezvcard/io/xml/XCardDocument;-><init>(Lorg/w3c/dom/Document;)V

    .line 176
    return-void
.end method

.method public constructor <init>(Lorg/w3c/dom/Document;)V
    .locals 3
    .param p1, "document"    # Lorg/w3c/dom/Document;

    .prologue
    const/4 v2, 0x1

    .line 228
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lezvcard/io/xml/XCardDocument;->parameterDataTypes:Ljava/util/Map;

    .line 140
    const-string v0, "ALTID"

    sget-object v1, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p0, v0, v1}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 141
    const-string v0, "CALSCALE"

    sget-object v1, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p0, v0, v1}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 142
    const-string v0, "GEO"

    sget-object v1, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    invoke-virtual {p0, v0, v1}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 143
    const-string v0, "LABEL"

    sget-object v1, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p0, v0, v1}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 144
    const-string v0, "LANGUAGE"

    sget-object v1, Lezvcard/VCardDataType;->LANGUAGE_TAG:Lezvcard/VCardDataType;

    invoke-virtual {p0, v0, v1}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 145
    const-string v0, "MEDIATYPE"

    sget-object v1, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p0, v0, v1}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 146
    const-string v0, "PID"

    sget-object v1, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p0, v0, v1}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 147
    const-string v0, "PREF"

    sget-object v1, Lezvcard/VCardDataType;->INTEGER:Lezvcard/VCardDataType;

    invoke-virtual {p0, v0, v1}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 148
    const-string v0, "SORT-AS"

    sget-object v1, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p0, v0, v1}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 149
    const-string v0, "TYPE"

    sget-object v1, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-virtual {p0, v0, v1}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 150
    const-string v0, "TZ"

    sget-object v1, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    invoke-virtual {p0, v0, v1}, Lezvcard/io/xml/XCardDocument;->registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 153
    new-instance v0, Lezvcard/io/scribe/ScribeIndex;

    invoke-direct {v0}, Lezvcard/io/scribe/ScribeIndex;-><init>()V

    iput-object v0, p0, Lezvcard/io/xml/XCardDocument;->index:Lezvcard/io/scribe/ScribeIndex;

    .line 154
    iput-boolean v2, p0, Lezvcard/io/xml/XCardDocument;->addProdId:Z

    .line 155
    iput-boolean v2, p0, Lezvcard/io/xml/XCardDocument;->versionStrict:Z

    .line 156
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lezvcard/io/xml/XCardDocument;->parseWarnings:Ljava/util/List;

    .line 229
    invoke-direct {p0, p1}, Lezvcard/io/xml/XCardDocument;->init(Lorg/w3c/dom/Document;)V

    .line 230
    return-void
.end method

.method private addWarning(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 2
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "propertyName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 735
    .local p3, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " property: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 736
    return-void
.end method

.method private createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 721
    sget-object v0, Lezvcard/io/xml/XCardDocument;->version4:Lezvcard/VCardVersion;

    invoke-virtual {v0}, Lezvcard/VCardVersion;->getXmlNamespace()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lezvcard/io/xml/XCardDocument;->createElement(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v0

    return-object v0
.end method

.method private createElement(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "ns"    # Ljava/lang/String;

    .prologue
    .line 731
    iget-object v0, p0, Lezvcard/io/xml/XCardDocument;->document:Lorg/w3c/dom/Document;

    invoke-interface {v0, p2, p1}, Lorg/w3c/dom/Document;->createElementNS(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v0

    return-object v0
.end method

.method private getChildElements(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .param p1, "parent"    # Lorg/w3c/dom/Element;
    .param p2, "localName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/w3c/dom/Element;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Lorg/w3c/dom/Element;",
            ">;"
        }
    .end annotation

    .prologue
    .line 706
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 707
    .local v1, "elements":Ljava/util/List;, "Ljava/util/List<Lorg/w3c/dom/Element;>;"
    invoke-interface {p1}, Lorg/w3c/dom/Element;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object v3

    invoke-static {v3}, Lezvcard/util/XmlUtils;->toElementList(Lorg/w3c/dom/NodeList;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/w3c/dom/Element;

    .line 708
    .local v0, "child":Lorg/w3c/dom/Element;
    invoke-interface {v0}, Lorg/w3c/dom/Element;->getLocalName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Lezvcard/io/xml/XCardDocument;->version4:Lezvcard/VCardVersion;

    invoke-virtual {v3}, Lezvcard/VCardVersion;->getXmlNamespace()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0}, Lorg/w3c/dom/Element;->getNamespaceURI()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 709
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 712
    .end local v0    # "child":Lorg/w3c/dom/Element;
    :cond_1
    return-object v1
.end method

.method private getVCardElements()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lorg/w3c/dom/Element;",
            ">;"
        }
    .end annotation

    .prologue
    .line 702
    iget-object v0, p0, Lezvcard/io/xml/XCardDocument;->root:Lorg/w3c/dom/Element;

    const-string v1, "vcard"

    invoke-direct {p0, v0, v1}, Lezvcard/io/xml/XCardDocument;->getChildElements(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private init(Lorg/w3c/dom/Document;)V
    .locals 4
    .param p1, "document"    # Lorg/w3c/dom/Document;

    .prologue
    .line 233
    invoke-static {}, Ljavax/xml/xpath/XPathFactory;->newInstance()Ljavax/xml/xpath/XPathFactory;

    move-result-object v2

    invoke-virtual {v2}, Ljavax/xml/xpath/XPathFactory;->newXPath()Ljavax/xml/xpath/XPath;

    move-result-object v1

    .line 234
    .local v1, "xpath":Ljavax/xml/xpath/XPath;
    sget-object v2, Lezvcard/io/xml/XCardDocument;->nsContext:Lezvcard/io/xml/XCardNamespaceContext;

    invoke-interface {v1, v2}, Ljavax/xml/xpath/XPath;->setNamespaceContext(Ljavax/xml/namespace/NamespaceContext;)V

    .line 238
    :try_start_0
    sget-object v2, Lezvcard/io/xml/XCardDocument;->nsContext:Lezvcard/io/xml/XCardNamespaceContext;

    invoke-virtual {v2}, Lezvcard/io/xml/XCardNamespaceContext;->getPrefix()Ljava/lang/String;

    move-result-object v0

    .line 239
    .local v0, "prefix":Ljava/lang/String;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "//"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":vcards"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljavax/xml/xpath/XPathConstants;->NODE:Ljavax/xml/namespace/QName;

    invoke-interface {v1, v2, p1, v3}, Ljavax/xml/xpath/XPath;->evaluate(Ljava/lang/String;Ljava/lang/Object;Ljavax/xml/namespace/QName;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/w3c/dom/Element;

    iput-object v2, p0, Lezvcard/io/xml/XCardDocument;->root:Lorg/w3c/dom/Element;
    :try_end_0
    .catch Ljavax/xml/xpath/XPathExpressionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 243
    .end local v0    # "prefix":Ljava/lang/String;
    :goto_0
    return-void

    .line 240
    :catch_0
    move-exception v2

    goto :goto_0
.end method

.method private marshalSubTypes(Lezvcard/parameter/VCardParameters;)Lorg/w3c/dom/Element;
    .locals 11
    .param p1, "parameters"    # Lezvcard/parameter/VCardParameters;

    .prologue
    .line 681
    const-string v10, "parameters"

    invoke-direct {p0, v10}, Lezvcard/io/xml/XCardDocument;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v9

    .line 683
    .local v9, "parametersElement":Lorg/w3c/dom/Element;
    invoke-virtual {p1}, Lezvcard/parameter/VCardParameters;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 684
    .local v5, "param":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v10}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v8

    .line 685
    .local v8, "parameterName":Ljava/lang/String;
    invoke-direct {p0, v8}, Lezvcard/io/xml/XCardDocument;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v7

    .line 687
    .local v7, "parameterElement":Lorg/w3c/dom/Element;
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .local v4, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 688
    .local v6, "paramValue":Ljava/lang/String;
    iget-object v10, p0, Lezvcard/io/xml/XCardDocument;->parameterDataTypes:Ljava/util/Map;

    invoke-interface {v10, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/VCardDataType;

    .line 689
    .local v0, "dataType":Lezvcard/VCardDataType;
    if-nez v0, :cond_0

    const-string v2, "unknown"

    .line 690
    .local v2, "dataTypeElementName":Ljava/lang/String;
    :goto_2
    invoke-direct {p0, v2}, Lezvcard/io/xml/XCardDocument;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v1

    .line 691
    .local v1, "dataTypeElement":Lorg/w3c/dom/Element;
    invoke-interface {v1, v6}, Lorg/w3c/dom/Element;->setTextContent(Ljava/lang/String;)V

    .line 692
    invoke-interface {v7, v1}, Lorg/w3c/dom/Element;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    goto :goto_1

    .line 689
    .end local v1    # "dataTypeElement":Lorg/w3c/dom/Element;
    .end local v2    # "dataTypeElementName":Ljava/lang/String;
    :cond_0
    invoke-virtual {v0}, Lezvcard/VCardDataType;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    .line 695
    .end local v0    # "dataType":Lezvcard/VCardDataType;
    .end local v6    # "paramValue":Ljava/lang/String;
    :cond_1
    invoke-interface {v9, v7}, Lorg/w3c/dom/Element;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    goto :goto_0

    .line 698
    .end local v4    # "i$":Ljava/util/Iterator;
    .end local v5    # "param":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    .end local v7    # "parameterElement":Lorg/w3c/dom/Element;
    .end local v8    # "parameterName":Ljava/lang/String;
    :cond_2
    return-object v9
.end method

.method private marshalType(Lezvcard/property/VCardProperty;Lezvcard/VCard;)Lorg/w3c/dom/Element;
    .locals 8
    .param p1, "type"    # Lezvcard/property/VCardProperty;
    .param p2, "vcard"    # Lezvcard/VCard;

    .prologue
    .line 658
    iget-object v5, p0, Lezvcard/io/xml/XCardDocument;->index:Lezvcard/io/scribe/ScribeIndex;

    invoke-virtual {v5, p1}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Lezvcard/property/VCardProperty;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v3

    .line 659
    .local v3, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;
    if-nez v3, :cond_0

    .line 660
    new-instance v5, Ljava/lang/IllegalArgumentException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "No marshaller found for property class \""

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "\"."

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 663
    :cond_0
    sget-object v5, Lezvcard/io/xml/XCardDocument;->version4:Lezvcard/VCardVersion;

    invoke-virtual {v3, p1, v5, p2}, Lezvcard/io/scribe/VCardPropertyScribe;->prepareParameters(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;Lezvcard/VCard;)Lezvcard/parameter/VCardParameters;

    move-result-object v0

    .line 665
    .local v0, "parameters":Lezvcard/parameter/VCardParameters;
    invoke-virtual {v3}, Lezvcard/io/scribe/VCardPropertyScribe;->getQName()Ljavax/xml/namespace/QName;

    move-result-object v2

    .line 666
    .local v2, "qname":Ljavax/xml/namespace/QName;
    invoke-virtual {v2}, Ljavax/xml/namespace/QName;->getLocalPart()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Ljavax/xml/namespace/QName;->getNamespaceURI()Ljava/lang/String;

    move-result-object v6

    invoke-direct {p0, v5, v6}, Lezvcard/io/xml/XCardDocument;->createElement(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v4

    .line 669
    .local v4, "typeElement":Lorg/w3c/dom/Element;
    invoke-virtual {v0}, Lezvcard/parameter/VCardParameters;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    .line 670
    invoke-direct {p0, v0}, Lezvcard/io/xml/XCardDocument;->marshalSubTypes(Lezvcard/parameter/VCardParameters;)Lorg/w3c/dom/Element;

    move-result-object v1

    .line 671
    .local v1, "parametersElement":Lorg/w3c/dom/Element;
    invoke-interface {v4, v1}, Lorg/w3c/dom/Element;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 675
    .end local v1    # "parametersElement":Lorg/w3c/dom/Element;
    :cond_1
    invoke-virtual {v3, p1, v4}, Lezvcard/io/scribe/VCardPropertyScribe;->writeXml(Lezvcard/property/VCardProperty;Lorg/w3c/dom/Element;)V

    .line 677
    return-object v4
.end method

.method private parseAndAddElement(Lorg/w3c/dom/Element;Ljava/lang/String;Lezvcard/VCard;Ljava/util/List;)V
    .locals 13
    .param p1, "element"    # Lorg/w3c/dom/Element;
    .param p2, "group"    # Ljava/lang/String;
    .param p3, "vcard"    # Lezvcard/VCard;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/w3c/dom/Element;",
            "Ljava/lang/String;",
            "Lezvcard/VCard;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 425
    .local p4, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0, p1}, Lezvcard/io/xml/XCardDocument;->parseSubTypes(Lorg/w3c/dom/Element;)Lezvcard/parameter/VCardParameters;

    move-result-object v4

    .line 428
    .local v4, "parameters":Lezvcard/parameter/VCardParameters;
    invoke-interface {p1}, Lorg/w3c/dom/Element;->getLocalName()Ljava/lang/String;

    move-result-object v6

    .line 429
    .local v6, "propertyName":Ljava/lang/String;
    invoke-interface {p1}, Lorg/w3c/dom/Element;->getNamespaceURI()Ljava/lang/String;

    move-result-object v3

    .line 430
    .local v3, "ns":Ljava/lang/String;
    iget-object v11, p0, Lezvcard/io/xml/XCardDocument;->index:Lezvcard/io/scribe/ScribeIndex;

    new-instance v12, Ljavax/xml/namespace/QName;

    invoke-direct {v12, v3, v6}, Ljavax/xml/namespace/QName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v11, v12}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljavax/xml/namespace/QName;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v8

    .line 432
    .local v8, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    :try_start_0
    invoke-virtual {v8, p1, v4}, Lezvcard/io/scribe/VCardPropertyScribe;->parseXml(Lorg/w3c/dom/Element;Lezvcard/parameter/VCardParameters;)Lezvcard/io/scribe/VCardPropertyScribe$Result;

    move-result-object v7

    .line 434
    .local v7, "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    invoke-virtual {v7}, Lezvcard/io/scribe/VCardPropertyScribe$Result;->getProperty()Lezvcard/property/VCardProperty;

    move-result-object v5

    .line 435
    .local v5, "property":Lezvcard/property/VCardProperty;
    invoke-virtual {v5, p2}, Lezvcard/property/VCardProperty;->setGroup(Ljava/lang/String;)V

    .line 437
    invoke-virtual {v7}, Lezvcard/io/scribe/VCardPropertyScribe$Result;->getWarnings()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 438
    .local v9, "warning":Ljava/lang/String;
    move-object/from16 v0, p4

    invoke-direct {p0, v9, v6, v0}, Lezvcard/io/xml/XCardDocument;->addWarning(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Lezvcard/io/SkipMeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lezvcard/io/CannotParseException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lezvcard/io/EmbeddedVCardException; {:try_start_0 .. :try_end_0} :catch_3

    goto :goto_0

    .line 440
    .end local v2    # "i$":Ljava/util/Iterator;
    .end local v5    # "property":Lezvcard/property/VCardProperty;
    .end local v7    # "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    .end local v9    # "warning":Ljava/lang/String;
    :catch_0
    move-exception v1

    .line 441
    .local v1, "e":Lezvcard/io/SkipMeException;
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Property has requested that it be skipped: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v1}, Lezvcard/io/SkipMeException;->getMessage()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    move-object/from16 v0, p4

    invoke-direct {p0, v11, v6, v0}, Lezvcard/io/xml/XCardDocument;->addWarning(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 464
    .end local v1    # "e":Lezvcard/io/SkipMeException;
    :goto_1
    return-void

    .line 443
    :catch_1
    move-exception v1

    .line 444
    .local v1, "e":Lezvcard/io/CannotParseException;
    invoke-static {p1}, Lezvcard/util/XmlUtils;->toString(Lorg/w3c/dom/Node;)Ljava/lang/String;

    move-result-object v10

    .line 445
    .local v10, "xml":Ljava/lang/String;
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Property value could not be parsed.  It will be unmarshalled as a "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-class v12, Lezvcard/property/Xml;

    invoke-virtual {v12}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, " property instead."

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    sget-object v12, Lezvcard/util/StringUtils;->NEWLINE:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, "  XML: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    sget-object v12, Lezvcard/util/StringUtils;->NEWLINE:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, "  Reason: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v1}, Lezvcard/io/CannotParseException;->getMessage()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    move-object/from16 v0, p4

    invoke-direct {p0, v11, v6, v0}, Lezvcard/io/xml/XCardDocument;->addWarning(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 447
    iget-object v11, p0, Lezvcard/io/xml/XCardDocument;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v12, Lezvcard/property/Xml;

    invoke-virtual {v11, v12}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v8

    .line 448
    invoke-virtual {v8, p1, v4}, Lezvcard/io/scribe/VCardPropertyScribe;->parseXml(Lorg/w3c/dom/Element;Lezvcard/parameter/VCardParameters;)Lezvcard/io/scribe/VCardPropertyScribe$Result;

    move-result-object v7

    .line 449
    .restart local v7    # "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    invoke-virtual {v7}, Lezvcard/io/scribe/VCardPropertyScribe$Result;->getProperty()Lezvcard/property/VCardProperty;

    move-result-object v5

    .line 450
    .restart local v5    # "property":Lezvcard/property/VCardProperty;
    invoke-virtual {v5, p2}, Lezvcard/property/VCardProperty;->setGroup(Ljava/lang/String;)V

    .line 463
    .end local v1    # "e":Lezvcard/io/CannotParseException;
    .end local v10    # "xml":Ljava/lang/String;
    :cond_0
    :goto_2
    move-object/from16 v0, p3

    invoke-virtual {v0, v5}, Lezvcard/VCard;->addProperty(Lezvcard/property/VCardProperty;)V

    goto :goto_1

    .line 451
    .end local v5    # "property":Lezvcard/property/VCardProperty;
    .end local v7    # "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    :catch_2
    move-exception v1

    .line 452
    .local v1, "e":Ljava/lang/UnsupportedOperationException;
    iget-object v11, p0, Lezvcard/io/xml/XCardDocument;->index:Lezvcard/io/scribe/ScribeIndex;

    const-class v12, Lezvcard/property/Xml;

    invoke-virtual {v11, v12}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Ljava/lang/Class;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v8

    .line 453
    invoke-virtual {v8, p1, v4}, Lezvcard/io/scribe/VCardPropertyScribe;->parseXml(Lorg/w3c/dom/Element;Lezvcard/parameter/VCardParameters;)Lezvcard/io/scribe/VCardPropertyScribe$Result;

    move-result-object v7

    .line 454
    .restart local v7    # "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    invoke-virtual {v7}, Lezvcard/io/scribe/VCardPropertyScribe$Result;->getProperty()Lezvcard/property/VCardProperty;

    move-result-object v5

    .line 455
    .restart local v5    # "property":Lezvcard/property/VCardProperty;
    invoke-virtual {v5, p2}, Lezvcard/property/VCardProperty;->setGroup(Ljava/lang/String;)V

    .line 457
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Property class \""

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, "\" does not support xCard unmarshalling.  It will be unmarshalled as a "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-class v12, Lezvcard/property/Xml;

    invoke-virtual {v12}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, " property instead."

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    move-object/from16 v0, p4

    invoke-direct {p0, v11, v6, v0}, Lezvcard/io/xml/XCardDocument;->addWarning(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_2

    .line 458
    .end local v1    # "e":Ljava/lang/UnsupportedOperationException;
    .end local v5    # "property":Lezvcard/property/VCardProperty;
    .end local v7    # "result":Lezvcard/io/scribe/VCardPropertyScribe$Result;, "Lezvcard/io/scribe/VCardPropertyScribe$Result<+Lezvcard/property/VCardProperty;>;"
    :catch_3
    move-exception v1

    .line 459
    .local v1, "e":Lezvcard/io/EmbeddedVCardException;
    const-string v11, "Property will not be unmarshalled because xCard does not supported embedded vCards."

    move-object/from16 v0, p4

    invoke-direct {p0, v11, v6, v0}, Lezvcard/io/xml/XCardDocument;->addWarning(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    goto/16 :goto_1
.end method

.method private parseSubTypes(Lorg/w3c/dom/Element;)Lezvcard/parameter/VCardParameters;
    .locals 14
    .param p1, "element"    # Lorg/w3c/dom/Element;

    .prologue
    .line 472
    new-instance v8, Lezvcard/parameter/VCardParameters;

    invoke-direct {v8}, Lezvcard/parameter/VCardParameters;-><init>()V

    .line 474
    .local v8, "subTypes":Lezvcard/parameter/VCardParameters;
    sget-object v12, Lezvcard/io/xml/XCardDocument;->version4:Lezvcard/VCardVersion;

    invoke-virtual {v12}, Lezvcard/VCardVersion;->getXmlNamespace()Ljava/lang/String;

    move-result-object v12

    const-string v13, "parameters"

    invoke-interface {p1, v12, v13}, Lorg/w3c/dom/Element;->getElementsByTagNameNS(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v12

    invoke-static {v12}, Lezvcard/util/XmlUtils;->toElementList(Lorg/w3c/dom/NodeList;)Ljava/util/List;

    move-result-object v7

    .line 475
    .local v7, "parametersElements":Ljava/util/List;, "Ljava/util/List<Lorg/w3c/dom/Element;>;"
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/w3c/dom/Element;

    .line 476
    .local v6, "parametersElement":Lorg/w3c/dom/Element;
    invoke-interface {v6}, Lorg/w3c/dom/Element;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object v12

    invoke-static {v12}, Lezvcard/util/XmlUtils;->toElementList(Lorg/w3c/dom/NodeList;)Ljava/util/List;

    move-result-object v5

    .line 477
    .local v5, "paramElements":Ljava/util/List;, "Ljava/util/List<Lorg/w3c/dom/Element;>;"
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/w3c/dom/Element;

    .line 478
    .local v4, "paramElement":Lorg/w3c/dom/Element;
    invoke-interface {v4}, Lorg/w3c/dom/Element;->getLocalName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v3

    .line 479
    .local v3, "name":Ljava/lang/String;
    invoke-interface {v4}, Lorg/w3c/dom/Element;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object v12

    invoke-static {v12}, Lezvcard/util/XmlUtils;->toElementList(Lorg/w3c/dom/NodeList;)Ljava/util/List;

    move-result-object v11

    .line 480
    .local v11, "valueElements":Ljava/util/List;, "Ljava/util/List<Lorg/w3c/dom/Element;>;"
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_2

    .line 481
    invoke-interface {v4}, Lorg/w3c/dom/Element;->getTextContent()Ljava/lang/String;

    move-result-object v9

    .line 482
    .local v9, "value":Ljava/lang/String;
    invoke-virtual {v8, v3, v9}, Lezvcard/parameter/VCardParameters;->put(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 484
    .end local v9    # "value":Ljava/lang/String;
    :cond_2
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lorg/w3c/dom/Element;

    .line 485
    .local v10, "valueElement":Lorg/w3c/dom/Element;
    invoke-interface {v10}, Lorg/w3c/dom/Element;->getTextContent()Ljava/lang/String;

    move-result-object v9

    .line 486
    .restart local v9    # "value":Ljava/lang/String;
    invoke-virtual {v8, v3, v9}, Lezvcard/parameter/VCardParameters;->put(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    .line 492
    .end local v2    # "i$":Ljava/util/Iterator;
    .end local v3    # "name":Ljava/lang/String;
    .end local v4    # "paramElement":Lorg/w3c/dom/Element;
    .end local v5    # "paramElements":Ljava/util/List;, "Ljava/util/List<Lorg/w3c/dom/Element;>;"
    .end local v6    # "parametersElement":Lorg/w3c/dom/Element;
    .end local v9    # "value":Ljava/lang/String;
    .end local v10    # "valueElement":Lorg/w3c/dom/Element;
    .end local v11    # "valueElements":Ljava/util/List;, "Ljava/util/List<Lorg/w3c/dom/Element;>;"
    :cond_3
    return-object v8
.end method

.method private parseVCardElement(Lorg/w3c/dom/Element;Ljava/util/List;)Lezvcard/VCard;
    .locals 11
    .param p1, "vcardElement"    # Lorg/w3c/dom/Element;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/w3c/dom/Element;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lezvcard/VCard;"
        }
    .end annotation

    .prologue
    .line 392
    .local p2, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v8, Lezvcard/VCard;

    invoke-direct {v8}, Lezvcard/VCard;-><init>()V

    .line 393
    .local v8, "vcard":Lezvcard/VCard;
    sget-object v9, Lezvcard/io/xml/XCardDocument;->version4:Lezvcard/VCardVersion;

    invoke-virtual {v8, v9}, Lezvcard/VCard;->setVersion(Lezvcard/VCardVersion;)V

    .line 395
    sget-object v9, Lezvcard/io/xml/XCardDocument;->version4:Lezvcard/VCardVersion;

    invoke-virtual {v9}, Lezvcard/VCardVersion;->getXmlNamespace()Ljava/lang/String;

    move-result-object v5

    .line 396
    .local v5, "ns":Ljava/lang/String;
    invoke-interface {p1}, Lorg/w3c/dom/Element;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object v9

    invoke-static {v9}, Lezvcard/util/XmlUtils;->toElementList(Lorg/w3c/dom/NodeList;)Ljava/util/List;

    move-result-object v1

    .line 397
    .local v1, "children":Ljava/util/List;, "Ljava/util/List<Lorg/w3c/dom/Element;>;"
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/w3c/dom/Element;

    .line 398
    .local v0, "child":Lorg/w3c/dom/Element;
    const-string v9, "group"

    invoke-interface {v0}, Lorg/w3c/dom/Element;->getLocalName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v0}, Lorg/w3c/dom/Element;->getNamespaceURI()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 399
    const-string v9, "name"

    invoke-interface {v0, v9}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 400
    .local v2, "group":Ljava/lang/String;
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v9

    if-nez v9, :cond_1

    .line 401
    const/4 v2, 0x0

    .line 403
    :cond_1
    invoke-interface {v0}, Lorg/w3c/dom/Element;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object v9

    invoke-static {v9}, Lezvcard/util/XmlUtils;->toElementList(Lorg/w3c/dom/NodeList;)Ljava/util/List;

    move-result-object v7

    .line 404
    .local v7, "propElements":Ljava/util/List;, "Ljava/util/List<Lorg/w3c/dom/Element;>;"
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .local v4, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/w3c/dom/Element;

    .line 405
    .local v6, "propElement":Lorg/w3c/dom/Element;
    invoke-direct {p0, v6, v2, v8, p2}, Lezvcard/io/xml/XCardDocument;->parseAndAddElement(Lorg/w3c/dom/Element;Ljava/lang/String;Lezvcard/VCard;Ljava/util/List;)V

    goto :goto_1

    .line 408
    .end local v2    # "group":Ljava/lang/String;
    .end local v4    # "i$":Ljava/util/Iterator;
    .end local v6    # "propElement":Lorg/w3c/dom/Element;
    .end local v7    # "propElements":Ljava/util/List;, "Ljava/util/List<Lorg/w3c/dom/Element;>;"
    :cond_2
    const/4 v9, 0x0

    invoke-direct {p0, v0, v9, v8, p2}, Lezvcard/io/xml/XCardDocument;->parseAndAddElement(Lorg/w3c/dom/Element;Ljava/lang/String;Lezvcard/VCard;Ljava/util/List;)V

    goto :goto_0

    .line 412
    .end local v0    # "child":Lorg/w3c/dom/Element;
    :cond_3
    return-object v8
.end method


# virtual methods
.method public add(Lezvcard/VCard;)V
    .locals 13
    .param p1, "vcard"    # Lezvcard/VCard;

    .prologue
    .line 596
    new-instance v8, Lezvcard/util/ListMultimap;

    invoke-direct {v8}, Lezvcard/util/ListMultimap;-><init>()V

    .line 598
    .local v8, "typesToAdd":Lezvcard/util/ListMultimap;, "Lezvcard/util/ListMultimap<Ljava/lang/String;Lezvcard/property/VCardProperty;>;"
    invoke-virtual {p1}, Lezvcard/VCard;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lezvcard/property/VCardProperty;

    .line 599
    .local v6, "type":Lezvcard/property/VCardProperty;
    iget-boolean v10, p0, Lezvcard/io/xml/XCardDocument;->addProdId:Z

    if-eqz v10, :cond_1

    instance-of v10, v6, Lezvcard/property/ProductId;

    if-nez v10, :cond_0

    .line 604
    :cond_1
    iget-boolean v10, p0, Lezvcard/io/xml/XCardDocument;->versionStrict:Z

    if-eqz v10, :cond_2

    invoke-virtual {v6}, Lezvcard/property/VCardProperty;->getSupportedVersions()Ljava/util/Set;

    move-result-object v10

    sget-object v11, Lezvcard/io/xml/XCardDocument;->version4:Lezvcard/VCardVersion;

    invoke-interface {v10, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    .line 610
    :cond_2
    iget-object v10, p0, Lezvcard/io/xml/XCardDocument;->index:Lezvcard/io/scribe/ScribeIndex;

    invoke-virtual {v10, v6}, Lezvcard/io/scribe/ScribeIndex;->getPropertyScribe(Lezvcard/property/VCardProperty;)Lezvcard/io/scribe/VCardPropertyScribe;

    move-result-object v10

    if-nez v10, :cond_3

    .line 611
    new-instance v10, Ljava/lang/IllegalArgumentException;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "No scribe found for property class \""

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, "\"."

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v10

    .line 614
    :cond_3
    invoke-virtual {v6}, Lezvcard/property/VCardProperty;->getGroup()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10, v6}, Lezvcard/util/ListMultimap;->put(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 618
    .end local v6    # "type":Lezvcard/property/VCardProperty;
    :cond_4
    iget-boolean v10, p0, Lezvcard/io/xml/XCardDocument;->addProdId:Z

    if-eqz v10, :cond_5

    .line 619
    new-instance v5, Lezvcard/property/ProductId;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "ez-vcard "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    sget-object v11, Lezvcard/Ezvcard;->VERSION:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v5, v10}, Lezvcard/property/ProductId;-><init>(Ljava/lang/String;)V

    .line 620
    .local v5, "prodId":Lezvcard/property/ProductId;
    invoke-virtual {v5}, Lezvcard/property/ProductId;->getGroup()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10, v5}, Lezvcard/util/ListMultimap;->put(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 624
    .end local v5    # "prodId":Lezvcard/property/ProductId;
    :cond_5
    const-string v10, "vcard"

    invoke-direct {p0, v10}, Lezvcard/io/xml/XCardDocument;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v9

    .line 625
    .local v9, "vcardElement":Lorg/w3c/dom/Element;
    invoke-virtual {v8}, Lezvcard/util/ListMultimap;->keySet()Ljava/util/Set;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .end local v2    # "i$":Ljava/util/Iterator;
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 627
    .local v1, "groupName":Ljava/lang/String;
    if-eqz v1, :cond_7

    .line 628
    const-string v10, "group"

    invoke-direct {p0, v10}, Lezvcard/io/xml/XCardDocument;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v0

    .line 629
    .local v0, "groupElement":Lorg/w3c/dom/Element;
    const-string v10, "name"

    invoke-interface {v0, v10, v1}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 630
    invoke-interface {v9, v0}, Lorg/w3c/dom/Element;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 631
    move-object v4, v0

    .line 636
    .end local v0    # "groupElement":Lorg/w3c/dom/Element;
    .local v4, "parent":Lorg/w3c/dom/Element;
    :goto_1
    invoke-virtual {v8, v1}, Lezvcard/util/ListMultimap;->get(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .local v3, "i$":Ljava/util/Iterator;
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lezvcard/property/VCardProperty;

    .line 638
    .restart local v6    # "type":Lezvcard/property/VCardProperty;
    :try_start_0
    invoke-direct {p0, v6, p1}, Lezvcard/io/xml/XCardDocument;->marshalType(Lezvcard/property/VCardProperty;Lezvcard/VCard;)Lorg/w3c/dom/Element;

    move-result-object v7

    .line 639
    .local v7, "typeElement":Lorg/w3c/dom/Element;
    invoke-interface {v4, v7}, Lorg/w3c/dom/Element;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;
    :try_end_0
    .catch Lezvcard/io/SkipMeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lezvcard/io/EmbeddedVCardException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_2

    .line 640
    .end local v7    # "typeElement":Lorg/w3c/dom/Element;
    :catch_0
    move-exception v10

    goto :goto_2

    .line 633
    .end local v3    # "i$":Ljava/util/Iterator;
    .end local v4    # "parent":Lorg/w3c/dom/Element;
    .end local v6    # "type":Lezvcard/property/VCardProperty;
    :cond_7
    move-object v4, v9

    .restart local v4    # "parent":Lorg/w3c/dom/Element;
    goto :goto_1

    .line 647
    .end local v1    # "groupName":Ljava/lang/String;
    .end local v4    # "parent":Lorg/w3c/dom/Element;
    :cond_8
    iget-object v10, p0, Lezvcard/io/xml/XCardDocument;->root:Lorg/w3c/dom/Element;

    invoke-interface {v10, v9}, Lorg/w3c/dom/Element;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 648
    return-void

    .line 642
    .restart local v1    # "groupName":Ljava/lang/String;
    .restart local v3    # "i$":Ljava/util/Iterator;
    .restart local v4    # "parent":Lorg/w3c/dom/Element;
    .restart local v6    # "type":Lezvcard/property/VCardProperty;
    :catch_1
    move-exception v10

    goto :goto_2
.end method

.method public getDocument()Lorg/w3c/dom/Document;
    .locals 1

    .prologue
    .line 345
    iget-object v0, p0, Lezvcard/io/xml/XCardDocument;->document:Lorg/w3c/dom/Document;

    return-object v0
.end method

.method public getParseWarnings()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 293
    iget-object v0, p0, Lezvcard/io/xml/XCardDocument;->parseWarnings:Ljava/util/List;

    return-object v0
.end method

.method public getScribeIndex()Lezvcard/io/scribe/ScribeIndex;
    .locals 1

    .prologue
    .line 329
    iget-object v0, p0, Lezvcard/io/xml/XCardDocument;->index:Lezvcard/io/scribe/ScribeIndex;

    return-object v0
.end method

.method public isAddProdId()Z
    .locals 1

    .prologue
    .line 252
    iget-boolean v0, p0, Lezvcard/io/xml/XCardDocument;->addProdId:Z

    return v0
.end method

.method public isVersionStrict()Z
    .locals 1

    .prologue
    .line 272
    iget-boolean v0, p0, Lezvcard/io/xml/XCardDocument;->versionStrict:Z

    return v0
.end method

.method public parseAll()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/VCard;",
            ">;"
        }
    .end annotation

    .prologue
    .line 353
    iget-object v5, p0, Lezvcard/io/xml/XCardDocument;->parseWarnings:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->clear()V

    .line 355
    iget-object v5, p0, Lezvcard/io/xml/XCardDocument;->root:Lorg/w3c/dom/Element;

    if-nez v5, :cond_1

    .line 356
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    .line 367
    :cond_0
    return-object v3

    .line 359
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 360
    .local v3, "vcards":Ljava/util/List;, "Ljava/util/List<Lezvcard/VCard;>;"
    invoke-direct {p0}, Lezvcard/io/xml/XCardDocument;->getVCardElements()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/w3c/dom/Element;

    .line 361
    .local v2, "vcardElement":Lorg/w3c/dom/Element;
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 362
    .local v4, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iget-object v5, p0, Lezvcard/io/xml/XCardDocument;->parseWarnings:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 363
    invoke-direct {p0, v2, v4}, Lezvcard/io/xml/XCardDocument;->parseVCardElement(Lorg/w3c/dom/Element;Ljava/util/List;)Lezvcard/VCard;

    move-result-object v1

    .line 364
    .local v1, "vcard":Lezvcard/VCard;
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public parseFirst()Lezvcard/VCard;
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 375
    iget-object v3, p0, Lezvcard/io/xml/XCardDocument;->parseWarnings:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 377
    iget-object v3, p0, Lezvcard/io/xml/XCardDocument;->root:Lorg/w3c/dom/Element;

    if-nez v3, :cond_1

    .line 388
    :cond_0
    :goto_0
    return-object v2

    .line 381
    :cond_1
    invoke-direct {p0}, Lezvcard/io/xml/XCardDocument;->getVCardElements()Ljava/util/List;

    move-result-object v0

    .line 382
    .local v0, "vcardElements":Ljava/util/List;, "Ljava/util/List<Lorg/w3c/dom/Element;>;"
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    .line 386
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 387
    .local v1, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iget-object v2, p0, Lezvcard/io/xml/XCardDocument;->parseWarnings:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 388
    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/w3c/dom/Element;

    invoke-direct {p0, v2, v1}, Lezvcard/io/xml/XCardDocument;->parseVCardElement(Lorg/w3c/dom/Element;Ljava/util/List;)Lezvcard/VCard;

    move-result-object v2

    goto :goto_0
.end method

.method public registerParameterDataType(Ljava/lang/String;Lezvcard/VCardDataType;)V
    .locals 1
    .param p1, "parameterName"    # Ljava/lang/String;
    .param p2, "dataType"    # Lezvcard/VCardDataType;

    .prologue
    .line 303
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    .line 304
    if-nez p2, :cond_0

    .line 305
    iget-object v0, p0, Lezvcard/io/xml/XCardDocument;->parameterDataTypes:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    :goto_0
    return-void

    .line 307
    :cond_0
    iget-object v0, p0, Lezvcard/io/xml/XCardDocument;->parameterDataTypes:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public registerScribe(Lezvcard/io/scribe/VCardPropertyScribe;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 321
    .local p1, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    iget-object v0, p0, Lezvcard/io/xml/XCardDocument;->index:Lezvcard/io/scribe/ScribeIndex;

    invoke-virtual {v0, p1}, Lezvcard/io/scribe/ScribeIndex;->register(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 322
    return-void
.end method

.method public setAddProdId(Z)V
    .locals 0
    .param p1, "addProdId"    # Z

    .prologue
    .line 262
    iput-boolean p1, p0, Lezvcard/io/xml/XCardDocument;->addProdId:Z

    .line 263
    return-void
.end method

.method public setScribeIndex(Lezvcard/io/scribe/ScribeIndex;)V
    .locals 0
    .param p1, "index"    # Lezvcard/io/scribe/ScribeIndex;

    .prologue
    .line 337
    iput-object p1, p0, Lezvcard/io/xml/XCardDocument;->index:Lezvcard/io/scribe/ScribeIndex;

    .line 338
    return-void
.end method

.method public setVersionStrict(Z)V
    .locals 0
    .param p1, "versionStrict"    # Z

    .prologue
    .line 282
    iput-boolean p1, p0, Lezvcard/io/xml/XCardDocument;->versionStrict:Z

    .line 283
    return-void
.end method

.method public write()Ljava/lang/String;
    .locals 1

    .prologue
    .line 500
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lezvcard/io/xml/XCardDocument;->write(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public write(I)Ljava/lang/String;
    .locals 2
    .param p1, "indent"    # I

    .prologue
    .line 509
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 511
    .local v0, "sw":Ljava/io/StringWriter;
    :try_start_0
    invoke-virtual {p0, v0, p1}, Lezvcard/io/xml/XCardDocument;->write(Ljava/io/Writer;I)V
    :try_end_0
    .catch Ljavax/xml/transform/TransformerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 515
    :goto_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    .line 512
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public write(Ljava/io/File;)V
    .locals 1
    .param p1, "file"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/transform/TransformerException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 546
    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0}, Lezvcard/io/xml/XCardDocument;->write(Ljava/io/File;I)V

    .line 547
    return-void
.end method

.method public write(Ljava/io/File;I)V
    .locals 2
    .param p1, "file"    # Ljava/io/File;
    .param p2, "indent"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/transform/TransformerException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 557
    invoke-static {p1}, Lezvcard/util/IOUtils;->utf8Writer(Ljava/io/File;)Ljava/io/Writer;

    move-result-object v0

    .line 559
    .local v0, "writer":Ljava/io/Writer;
    :try_start_0
    invoke-virtual {p0, v0, p2}, Lezvcard/io/xml/XCardDocument;->write(Ljava/io/Writer;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 561
    invoke-static {v0}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    .line 563
    return-void

    .line 561
    :catchall_0
    move-exception v1

    invoke-static {v0}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    throw v1
.end method

.method public write(Ljava/io/OutputStream;)V
    .locals 1
    .param p1, "out"    # Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/transform/TransformerException;
        }
    .end annotation

    .prologue
    .line 525
    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0}, Lezvcard/io/xml/XCardDocument;->write(Ljava/io/OutputStream;I)V

    .line 526
    return-void
.end method

.method public write(Ljava/io/OutputStream;I)V
    .locals 1
    .param p1, "out"    # Ljava/io/OutputStream;
    .param p2, "indent"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/transform/TransformerException;
        }
    .end annotation

    .prologue
    .line 536
    invoke-static {p1}, Lezvcard/util/IOUtils;->utf8Writer(Ljava/io/OutputStream;)Ljava/io/Writer;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lezvcard/io/xml/XCardDocument;->write(Ljava/io/Writer;I)V

    .line 537
    return-void
.end method

.method public write(Ljava/io/Writer;)V
    .locals 1
    .param p1, "writer"    # Ljava/io/Writer;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/transform/TransformerException;
        }
    .end annotation

    .prologue
    .line 571
    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0}, Lezvcard/io/xml/XCardDocument;->write(Ljava/io/Writer;I)V

    .line 572
    return-void
.end method

.method public write(Ljava/io/Writer;I)V
    .locals 4
    .param p1, "writer"    # Ljava/io/Writer;
    .param p2, "indent"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/xml/transform/TransformerException;
        }
    .end annotation

    .prologue
    .line 581
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 582
    .local v0, "properties":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    if-ltz p2, :cond_0

    .line 583
    const-string v1, "indent"

    const-string v2, "yes"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 584
    const-string v1, "{http://xml.apache.org/xslt}indent-amount"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 586
    :cond_0
    iget-object v1, p0, Lezvcard/io/xml/XCardDocument;->document:Lorg/w3c/dom/Document;

    invoke-static {v1, p1, v0}, Lezvcard/util/XmlUtils;->toWriter(Lorg/w3c/dom/Node;Ljava/io/Writer;Ljava/util/Map;)V

    .line 587
    return-void
.end method
