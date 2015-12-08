.class public LRaptureXML/RXMLElement;
.super Ljava/lang/Object;
.source "RXMLElement.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LRaptureXML/RXMLElement$Block;
    }
.end annotation


# instance fields
.field private _doc:Lorg/w3c/dom/Document;

.field private _node:Lorg/w3c/dom/Node;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 9
    .param p1, "file"    # Ljava/io/File;

    .prologue
    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    const/4 v5, 0x0

    .line 117
    .local v5, "xmlString":Ljava/lang/String;
    const/4 v3, 0x0

    .line 120
    .local v3, "in":Ljava/io/DataInputStream;
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v7

    long-to-int v7, v7

    new-array v0, v7, [B

    .line 121
    .local v0, "buffer":[B
    new-instance v4, Ljava/io/DataInputStream;

    new-instance v7, Ljava/io/FileInputStream;

    invoke-direct {v7, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v4, v7}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    .end local v3    # "in":Ljava/io/DataInputStream;
    .local v4, "in":Ljava/io/DataInputStream;
    :try_start_1
    invoke-virtual {v4, v0}, Ljava/io/DataInputStream;->readFully([B)V

    .line 123
    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v0}, Ljava/lang/String;-><init>([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 133
    .end local v5    # "xmlString":Ljava/lang/String;
    .local v6, "xmlString":Ljava/lang/String;
    if-eqz v4, :cond_3

    .line 134
    :try_start_2
    invoke-virtual {v4}, Ljava/io/DataInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    move-object v3, v4

    .end local v4    # "in":Ljava/io/DataInputStream;
    .restart local v3    # "in":Ljava/io/DataInputStream;
    move-object v5, v6

    .line 144
    .end local v0    # "buffer":[B
    .end local v6    # "xmlString":Ljava/lang/String;
    .restart local v5    # "xmlString":Ljava/lang/String;
    :cond_0
    :goto_0
    :try_start_3
    invoke-static {}, Ljavax/xml/parsers/DocumentBuilderFactory;->newInstance()Ljavax/xml/parsers/DocumentBuilderFactory;

    move-result-object v2

    .line 145
    .local v2, "factory":Ljavax/xml/parsers/DocumentBuilderFactory;
    invoke-virtual {v2}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;

    move-result-object v1

    .line 146
    .local v1, "builder":Ljavax/xml/parsers/DocumentBuilder;
    new-instance v7, Lorg/xml/sax/InputSource;

    new-instance v8, Ljava/io/StringReader;

    invoke-direct {v8, v5}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v7, v8}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/Reader;)V

    invoke-virtual {v1, v7}, Ljavax/xml/parsers/DocumentBuilder;->parse(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;

    move-result-object v7

    iput-object v7, p0, LRaptureXML/RXMLElement;->_doc:Lorg/w3c/dom/Document;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    .line 152
    .end local v1    # "builder":Ljavax/xml/parsers/DocumentBuilder;
    .end local v2    # "factory":Ljavax/xml/parsers/DocumentBuilderFactory;
    :goto_1
    iget-object v7, p0, LRaptureXML/RXMLElement;->_doc:Lorg/w3c/dom/Document;

    if-eqz v7, :cond_1

    .line 154
    iget-object v7, p0, LRaptureXML/RXMLElement;->_doc:Lorg/w3c/dom/Document;

    invoke-interface {v7}, Lorg/w3c/dom/Document;->getDocumentElement()Lorg/w3c/dom/Element;

    move-result-object v7

    iput-object v7, p0, LRaptureXML/RXMLElement;->_node:Lorg/w3c/dom/Node;

    .line 155
    iget-object v7, p0, LRaptureXML/RXMLElement;->_node:Lorg/w3c/dom/Node;

    if-nez v7, :cond_1

    .line 157
    const/4 v7, 0x0

    iput-object v7, p0, LRaptureXML/RXMLElement;->_doc:Lorg/w3c/dom/Document;

    .line 160
    :cond_1
    return-void

    .line 125
    :catch_0
    move-exception v7

    .line 133
    :goto_2
    if-eqz v3, :cond_0

    .line 134
    :try_start_4
    invoke-virtual {v3}, Ljava/io/DataInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_0

    .line 136
    :catch_1
    move-exception v7

    goto :goto_0

    .line 130
    :catchall_0
    move-exception v7

    .line 133
    :goto_3
    if-eqz v3, :cond_2

    .line 134
    :try_start_5
    invoke-virtual {v3}, Ljava/io/DataInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 140
    :cond_2
    :goto_4
    throw v7

    .line 136
    .end local v3    # "in":Ljava/io/DataInputStream;
    .end local v5    # "xmlString":Ljava/lang/String;
    .restart local v0    # "buffer":[B
    .restart local v4    # "in":Ljava/io/DataInputStream;
    .restart local v6    # "xmlString":Ljava/lang/String;
    :catch_2
    move-exception v7

    move-object v3, v4

    .end local v4    # "in":Ljava/io/DataInputStream;
    .restart local v3    # "in":Ljava/io/DataInputStream;
    move-object v5, v6

    .end local v6    # "xmlString":Ljava/lang/String;
    .restart local v5    # "xmlString":Ljava/lang/String;
    goto :goto_0

    .end local v0    # "buffer":[B
    :catch_3
    move-exception v8

    goto :goto_4

    .line 148
    :catch_4
    move-exception v7

    goto :goto_1

    .line 130
    .end local v3    # "in":Ljava/io/DataInputStream;
    .restart local v0    # "buffer":[B
    .restart local v4    # "in":Ljava/io/DataInputStream;
    :catchall_1
    move-exception v7

    move-object v3, v4

    .end local v4    # "in":Ljava/io/DataInputStream;
    .restart local v3    # "in":Ljava/io/DataInputStream;
    goto :goto_3

    .line 125
    .end local v3    # "in":Ljava/io/DataInputStream;
    .restart local v4    # "in":Ljava/io/DataInputStream;
    :catch_5
    move-exception v7

    move-object v3, v4

    .end local v4    # "in":Ljava/io/DataInputStream;
    .restart local v3    # "in":Ljava/io/DataInputStream;
    goto :goto_2

    .end local v3    # "in":Ljava/io/DataInputStream;
    .end local v5    # "xmlString":Ljava/lang/String;
    .restart local v4    # "in":Ljava/io/DataInputStream;
    .restart local v6    # "xmlString":Ljava/lang/String;
    :cond_3
    move-object v3, v4

    .end local v4    # "in":Ljava/io/DataInputStream;
    .restart local v3    # "in":Ljava/io/DataInputStream;
    move-object v5, v6

    .end local v6    # "xmlString":Ljava/lang/String;
    .restart local v5    # "xmlString":Ljava/lang/String;
    goto :goto_0
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4
    .param p1, "xmlString"    # Ljava/lang/String;

    .prologue
    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    if-eqz p1, :cond_0

    const-string v2, ""

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 112
    :cond_0
    :goto_0
    return-void

    .line 95
    :cond_1
    :try_start_0
    invoke-static {}, Ljavax/xml/parsers/DocumentBuilderFactory;->newInstance()Ljavax/xml/parsers/DocumentBuilderFactory;

    move-result-object v1

    .line 96
    .local v1, "factory":Ljavax/xml/parsers/DocumentBuilderFactory;
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljavax/xml/parsers/DocumentBuilderFactory;->setNamespaceAware(Z)V

    .line 97
    invoke-virtual {v1}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;

    move-result-object v0

    .line 98
    .local v0, "builder":Ljavax/xml/parsers/DocumentBuilder;
    new-instance v2, Lorg/xml/sax/InputSource;

    new-instance v3, Ljava/io/StringReader;

    invoke-direct {v3, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/Reader;)V

    invoke-virtual {v0, v2}, Ljavax/xml/parsers/DocumentBuilder;->parse(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;

    move-result-object v2

    iput-object v2, p0, LRaptureXML/RXMLElement;->_doc:Lorg/w3c/dom/Document;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 104
    .end local v0    # "builder":Ljavax/xml/parsers/DocumentBuilder;
    .end local v1    # "factory":Ljavax/xml/parsers/DocumentBuilderFactory;
    :goto_1
    iget-object v2, p0, LRaptureXML/RXMLElement;->_doc:Lorg/w3c/dom/Document;

    if-eqz v2, :cond_0

    .line 106
    iget-object v2, p0, LRaptureXML/RXMLElement;->_doc:Lorg/w3c/dom/Document;

    invoke-interface {v2}, Lorg/w3c/dom/Document;->getDocumentElement()Lorg/w3c/dom/Element;

    move-result-object v2

    iput-object v2, p0, LRaptureXML/RXMLElement;->_node:Lorg/w3c/dom/Node;

    .line 107
    iget-object v2, p0, LRaptureXML/RXMLElement;->_node:Lorg/w3c/dom/Node;

    if-nez v2, :cond_0

    .line 109
    const/4 v2, 0x0

    iput-object v2, p0, LRaptureXML/RXMLElement;->_doc:Lorg/w3c/dom/Document;

    goto :goto_0

    .line 100
    :catch_0
    move-exception v2

    goto :goto_1
.end method

.method public constructor <init>(Lorg/w3c/dom/Node;)V
    .locals 1
    .param p1, "node"    # Lorg/w3c/dom/Node;

    .prologue
    .line 162
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 164
    const/4 v0, 0x0

    iput-object v0, p0, LRaptureXML/RXMLElement;->_doc:Lorg/w3c/dom/Document;

    .line 165
    iput-object p1, p0, LRaptureXML/RXMLElement;->_node:Lorg/w3c/dom/Node;

    .line 166
    return-void
.end method

.method public static elementFromFile(Ljava/io/File;)LRaptureXML/RXMLElement;
    .locals 1
    .param p0, "file"    # Ljava/io/File;

    .prologue
    .line 179
    new-instance v0, LRaptureXML/RXMLElement;

    invoke-direct {v0, p0}, LRaptureXML/RXMLElement;-><init>(Ljava/io/File;)V

    return-object v0
.end method

.method public static elementFromNode(Lorg/w3c/dom/Node;)LRaptureXML/RXMLElement;
    .locals 1
    .param p0, "node"    # Lorg/w3c/dom/Node;

    .prologue
    .line 184
    new-instance v0, LRaptureXML/RXMLElement;

    invoke-direct {v0, p0}, LRaptureXML/RXMLElement;-><init>(Lorg/w3c/dom/Node;)V

    return-object v0
.end method

.method public static elementFromXMLString(Ljava/lang/String;)LRaptureXML/RXMLElement;
    .locals 1
    .param p0, "xmlString"    # Ljava/lang/String;

    .prologue
    .line 174
    new-instance v0, LRaptureXML/RXMLElement;

    invoke-direct {v0, p0}, LRaptureXML/RXMLElement;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static implode([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p0, "ary"    # [Ljava/lang/String;
    .param p1, "delim"    # Ljava/lang/String;

    .prologue
    .line 499
    const-string v1, ""

    .line 500
    .local v1, "out":Ljava/lang/String;
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    array-length v2, p0

    if-lt v0, v2, :cond_0

    .line 504
    return-object v1

    .line 501
    :cond_0
    if-eqz v0, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 502
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v3, p0, v0

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 500
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public attribute(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "attName"    # Ljava/lang/String;

    .prologue
    .line 236
    iget-object v2, p0, LRaptureXML/RXMLElement;->_node:Lorg/w3c/dom/Node;

    invoke-interface {v2}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v2

    invoke-interface {v2, p1}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v1

    .line 237
    .local v1, "node":Lorg/w3c/dom/Node;
    if-nez v1, :cond_1

    .line 238
    const-string v0, ""

    .line 242
    :cond_0
    :goto_0
    return-object v0

    .line 239
    :cond_1
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v0

    .line 240
    .local v0, "attribute":Ljava/lang/String;
    if-nez v0, :cond_0

    .line 241
    const-string v0, ""

    goto :goto_0
.end method

.method public attribute(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "attName"    # Ljava/lang/String;
    .param p2, "nameSpace"    # Ljava/lang/String;

    .prologue
    .line 247
    iget-object v1, p0, LRaptureXML/RXMLElement;->_node:Lorg/w3c/dom/Node;

    invoke-interface {v1}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object v1

    invoke-interface {v1, p2, p1}, Lorg/w3c/dom/NamedNodeMap;->getNamedItemNS(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Node;

    move-result-object v1

    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v0

    .line 248
    .local v0, "attribute":Ljava/lang/String;
    if-nez v0, :cond_0

    const-string v0, ""

    .end local v0    # "attribute":Ljava/lang/String;
    :cond_0
    return-object v0
.end method

.method public attributeAsDouble(Ljava/lang/String;)D
    .locals 2
    .param p1, "attName"    # Ljava/lang/String;

    .prologue
    .line 263
    invoke-virtual {p0, p1}, LRaptureXML/RXMLElement;->attribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0
.end method

.method public attributeAsDouble(Ljava/lang/String;Ljava/lang/String;)D
    .locals 2
    .param p1, "attName"    # Ljava/lang/String;
    .param p2, "nameSpace"    # Ljava/lang/String;

    .prologue
    .line 268
    invoke-virtual {p0, p1, p2}, LRaptureXML/RXMLElement;->attribute(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0
.end method

.method public attributeAsInt(Ljava/lang/String;)I
    .locals 1
    .param p1, "attName"    # Ljava/lang/String;

    .prologue
    .line 253
    invoke-virtual {p0, p1}, LRaptureXML/RXMLElement;->attribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public attributeAsInt(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1
    .param p1, "attName"    # Ljava/lang/String;
    .param p2, "nameSpace"    # Ljava/lang/String;

    .prologue
    .line 258
    invoke-virtual {p0, p1, p2}, LRaptureXML/RXMLElement;->attribute(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public child(Ljava/lang/String;)LRaptureXML/RXMLElement;
    .locals 7
    .param p1, "tag"    # Ljava/lang/String;

    .prologue
    .line 282
    iget-object v3, p0, LRaptureXML/RXMLElement;->_node:Lorg/w3c/dom/Node;

    if-nez v3, :cond_0

    .line 283
    new-instance v3, LRaptureXML/RXMLElement;

    invoke-direct {v3}, LRaptureXML/RXMLElement;-><init>()V

    .line 312
    :goto_0
    return-object v3

    .line 284
    :cond_0
    const-string v3, "\\."

    invoke-virtual {p1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 285
    .local v0, "components":[Ljava/lang/String;
    iget-object v1, p0, LRaptureXML/RXMLElement;->_node:Lorg/w3c/dom/Node;

    .line 288
    .local v1, "cur":Lorg/w3c/dom/Node;
    array-length v4, v0

    const/4 v3, 0x0

    :goto_1
    if-lt v3, v4, :cond_2

    .line 310
    :cond_1
    if-eqz v1, :cond_6

    .line 311
    invoke-static {v1}, LRaptureXML/RXMLElement;->elementFromNode(Lorg/w3c/dom/Node;)LRaptureXML/RXMLElement;

    move-result-object v3

    goto :goto_0

    .line 288
    :cond_2
    aget-object v2, v0, v3

    .line 290
    .local v2, "itag":Ljava/lang/String;
    const-string v5, "*"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 292
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v1

    .line 293
    :goto_2
    if-eqz v1, :cond_3

    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_4

    .line 306
    :cond_3
    if-eqz v1, :cond_1

    .line 288
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 294
    :cond_4
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNextSibling()Lorg/w3c/dom/Node;

    move-result-object v1

    goto :goto_2

    .line 298
    :cond_5
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v1

    .line 299
    :goto_3
    if-eqz v1, :cond_3

    .line 301
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    .line 303
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNextSibling()Lorg/w3c/dom/Node;

    move-result-object v1

    goto :goto_3

    .line 312
    .end local v2    # "itag":Ljava/lang/String;
    :cond_6
    new-instance v3, LRaptureXML/RXMLElement;

    invoke-direct {v3}, LRaptureXML/RXMLElement;-><init>()V

    goto :goto_0
.end method

.method public child(Ljava/lang/String;Ljava/lang/String;)LRaptureXML/RXMLElement;
    .locals 7
    .param p1, "tag"    # Ljava/lang/String;
    .param p2, "namespace"    # Ljava/lang/String;

    .prologue
    const/4 v6, 0x1

    .line 317
    iget-object v3, p0, LRaptureXML/RXMLElement;->_node:Lorg/w3c/dom/Node;

    if-nez v3, :cond_0

    .line 318
    new-instance v3, LRaptureXML/RXMLElement;

    invoke-direct {v3}, LRaptureXML/RXMLElement;-><init>()V

    .line 347
    :goto_0
    return-object v3

    .line 319
    :cond_0
    const-string v3, "\\."

    invoke-virtual {p1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 320
    .local v0, "components":[Ljava/lang/String;
    iget-object v1, p0, LRaptureXML/RXMLElement;->_node:Lorg/w3c/dom/Node;

    .line 323
    .local v1, "cur":Lorg/w3c/dom/Node;
    array-length v4, v0

    const/4 v3, 0x0

    :goto_1
    if-lt v3, v4, :cond_2

    .line 345
    :cond_1
    if-eqz v1, :cond_7

    .line 346
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v3

    invoke-static {v3}, LRaptureXML/RXMLElement;->elementFromNode(Lorg/w3c/dom/Node;)LRaptureXML/RXMLElement;

    move-result-object v3

    goto :goto_0

    .line 323
    :cond_2
    aget-object v2, v0, v3

    .line 325
    .local v2, "itag":Ljava/lang/String;
    const-string v5, "*"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 327
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v1

    .line 328
    :goto_2
    if-eqz v1, :cond_3

    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v5

    if-eq v5, v6, :cond_3

    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNamespaceURI()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 341
    :cond_3
    if-eqz v1, :cond_1

    .line 323
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 329
    :cond_4
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNextSibling()Lorg/w3c/dom/Node;

    move-result-object v1

    goto :goto_2

    .line 333
    :cond_5
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v1

    .line 334
    :goto_3
    if-eqz v1, :cond_3

    .line 336
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v5

    if-ne v5, v6, :cond_6

    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNamespaceURI()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 338
    :cond_6
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNextSibling()Lorg/w3c/dom/Node;

    move-result-object v1

    goto :goto_3

    .line 347
    .end local v2    # "itag":Ljava/lang/String;
    :cond_7
    new-instance v3, LRaptureXML/RXMLElement;

    invoke-direct {v3}, LRaptureXML/RXMLElement;-><init>()V

    goto :goto_0
.end method

.method public children(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 3
    .param p1, "tag"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "LRaptureXML/RXMLElement;",
            ">;"
        }
    .end annotation

    .prologue
    .line 352
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 353
    .local v0, "children":Ljava/util/ArrayList;, "Ljava/util/ArrayList<LRaptureXML/RXMLElement;>;"
    iget-object v2, p0, LRaptureXML/RXMLElement;->_node:Lorg/w3c/dom/Node;

    invoke-interface {v2}, Lorg/w3c/dom/Node;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v1

    .line 354
    .local v1, "cur":Lorg/w3c/dom/Node;
    :goto_0
    if-nez v1, :cond_0

    .line 360
    return-object v0

    .line 356
    :cond_0
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 357
    invoke-static {v1}, LRaptureXML/RXMLElement;->elementFromNode(Lorg/w3c/dom/Node;)LRaptureXML/RXMLElement;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 358
    :cond_1
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNextSibling()Lorg/w3c/dom/Node;

    move-result-object v1

    goto :goto_0
.end method

.method public children(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 5
    .param p1, "tag"    # Ljava/lang/String;
    .param p2, "namespace"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "LRaptureXML/RXMLElement;",
            ">;"
        }
    .end annotation

    .prologue
    .line 365
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 366
    .local v0, "children":Ljava/util/ArrayList;, "Ljava/util/ArrayList<LRaptureXML/RXMLElement;>;"
    iget-object v2, p0, LRaptureXML/RXMLElement;->_node:Lorg/w3c/dom/Node;

    invoke-interface {v2}, Lorg/w3c/dom/Node;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v1

    .line 367
    .local v1, "cur":Lorg/w3c/dom/Node;
    :goto_0
    if-nez v1, :cond_0

    .line 373
    return-object v0

    .line 369
    :cond_0
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ns:"

    const-string v4, ""

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNamespaceURI()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 370
    invoke-static {v1}, LRaptureXML/RXMLElement;->elementFromNode(Lorg/w3c/dom/Node;)LRaptureXML/RXMLElement;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 371
    :cond_1
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNextSibling()Lorg/w3c/dom/Node;

    move-result-object v1

    goto :goto_0
.end method

.method public childrenWithRootXPath(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 11
    .param p1, "query"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "LRaptureXML/RXMLElement;",
            ">;"
        }
    .end annotation

    .prologue
    .line 378
    if-nez p1, :cond_1

    .line 379
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 401
    :cond_0
    :goto_0
    return-object v7

    .line 381
    :cond_1
    invoke-static {}, Ljavax/xml/xpath/XPathFactory;->newInstance()Ljavax/xml/xpath/XPathFactory;

    move-result-object v4

    .line 382
    .local v4, "factory":Ljavax/xml/xpath/XPathFactory;
    invoke-virtual {v4}, Ljavax/xml/xpath/XPathFactory;->newXPath()Ljavax/xml/xpath/XPath;

    move-result-object v8

    .line 383
    .local v8, "xpath":Ljavax/xml/xpath/XPath;
    const/4 v6, 0x0

    .line 385
    .local v6, "nodes":Lorg/w3c/dom/NodeList;
    :try_start_0
    invoke-interface {v8, p1}, Ljavax/xml/xpath/XPath;->compile(Ljava/lang/String;)Ljavax/xml/xpath/XPathExpression;

    move-result-object v3

    .line 386
    .local v3, "expr":Ljavax/xml/xpath/XPathExpression;
    iget-object v9, p0, LRaptureXML/RXMLElement;->_node:Lorg/w3c/dom/Node;

    sget-object v10, Ljavax/xml/xpath/XPathConstants;->NODESET:Ljavax/xml/namespace/QName;

    invoke-interface {v3, v9, v10}, Ljavax/xml/xpath/XPathExpression;->evaluate(Ljava/lang/Object;Ljavax/xml/namespace/QName;)Ljava/lang/Object;

    move-result-object v9

    move-object v0, v9

    check-cast v0, Lorg/w3c/dom/NodeList;

    move-object v6, v0
    :try_end_0
    .catch Ljavax/xml/xpath/XPathExpressionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 390
    .end local v3    # "expr":Ljavax/xml/xpath/XPathExpression;
    :goto_1
    if-nez v6, :cond_2

    .line 391
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    .line 387
    :catch_0
    move-exception v1

    .line 388
    .local v1, "e":Ljavax/xml/xpath/XPathExpressionException;
    invoke-virtual {v1}, Ljavax/xml/xpath/XPathExpressionException;->printStackTrace()V

    goto :goto_1

    .line 393
    .end local v1    # "e":Ljavax/xml/xpath/XPathExpressionException;
    :cond_2
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 394
    .local v7, "resultNodes":Ljava/util/ArrayList;, "Ljava/util/ArrayList<LRaptureXML/RXMLElement;>;"
    const/4 v5, 0x0

    .local v5, "i":I
    :goto_2
    invoke-interface {v6}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v9

    if-ge v5, v9, :cond_0

    .line 396
    invoke-interface {v6, v5}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v9

    invoke-static {v9}, LRaptureXML/RXMLElement;->elementFromNode(Lorg/w3c/dom/Node;)LRaptureXML/RXMLElement;

    move-result-object v2

    .line 397
    .local v2, "element":LRaptureXML/RXMLElement;
    if-eqz v2, :cond_3

    .line 398
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 394
    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2
.end method

.method public description()Ljava/lang/String;
    .locals 1

    .prologue
    .line 193
    invoke-virtual {p0}, LRaptureXML/RXMLElement;->text()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isValid()Z
    .locals 1

    .prologue
    .line 273
    iget-object v0, p0, LRaptureXML/RXMLElement;->_node:Lorg/w3c/dom/Node;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public iterate(Ljava/lang/String;LRaptureXML/RXMLElement$Block;)V
    .locals 12
    .param p1, "query"    # Ljava/lang/String;
    .param p2, "blk"    # LRaptureXML/RXMLElement$Block;

    .prologue
    const/4 v11, 0x1

    .line 406
    if-nez p1, :cond_1

    .line 478
    :cond_0
    :goto_0
    return-void

    .line 409
    :cond_1
    const-string v9, "\\."

    invoke-virtual {p1, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 410
    .local v1, "components":[Ljava/lang/String;
    iget-object v2, p0, LRaptureXML/RXMLElement;->_node:Lorg/w3c/dom/Node;

    .line 413
    .local v2, "cur":Lorg/w3c/dom/Node;
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_1
    array-length v9, v1

    if-lt v4, v9, :cond_6

    .line 452
    :cond_2
    if-eqz v2, :cond_0

    .line 455
    array-length v9, v1

    if-lez v9, :cond_c

    array-length v9, v1

    add-int/lit8 v9, v9, -0x1

    aget-object v0, v1, v9

    .line 458
    .local v0, "childTagName":Ljava/lang/String;
    :cond_3
    :goto_2
    invoke-interface {v2}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v9

    if-ne v9, v11, :cond_4

    .line 460
    invoke-static {v2}, LRaptureXML/RXMLElement;->elementFromNode(Lorg/w3c/dom/Node;)LRaptureXML/RXMLElement;

    move-result-object v3

    .line 461
    .local v3, "element":LRaptureXML/RXMLElement;
    invoke-interface {p2, v3}, LRaptureXML/RXMLElement$Block;->block(LRaptureXML/RXMLElement;)V

    .line 464
    .end local v3    # "element":LRaptureXML/RXMLElement;
    :cond_4
    if-eqz v0, :cond_e

    const-string v9, "*"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_e

    .line 466
    invoke-interface {v2}, Lorg/w3c/dom/Node;->getNextSibling()Lorg/w3c/dom/Node;

    move-result-object v2

    .line 476
    :cond_5
    :goto_3
    if-nez v2, :cond_3

    goto :goto_0

    .line 415
    .end local v0    # "childTagName":Ljava/lang/String;
    :cond_6
    aget-object v5, v1, v4

    .line 417
    .local v5, "iTagName":Ljava/lang/String;
    const-string v9, "*"

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    .line 419
    invoke-interface {v2}, Lorg/w3c/dom/Node;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v2

    .line 422
    array-length v9, v1

    add-int/lit8 v9, v9, -0x1

    if-ge v4, v9, :cond_9

    .line 425
    :cond_7
    invoke-interface {v2}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v9

    if-ne v9, v11, :cond_8

    .line 427
    invoke-static {v2}, LRaptureXML/RXMLElement;->elementFromNode(Lorg/w3c/dom/Node;)LRaptureXML/RXMLElement;

    move-result-object v3

    .line 428
    .restart local v3    # "element":LRaptureXML/RXMLElement;
    array-length v9, v1

    sub-int/2addr v9, v4

    add-int/lit8 v6, v9, -0x1

    .line 429
    .local v6, "lengthOfSubStringArray":I
    new-array v8, v6, [Ljava/lang/String;

    .line 430
    .local v8, "subArray":[Ljava/lang/String;
    add-int/lit8 v9, v4, 0x1

    const/4 v10, 0x0

    invoke-static {v1, v9, v8, v10, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 431
    const-string v9, "."

    invoke-static {v8, v9}, LRaptureXML/RXMLElement;->implode([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 432
    .local v7, "restOfQuery":Ljava/lang/String;
    invoke-virtual {v3, v7, p2}, LRaptureXML/RXMLElement;->iterate(Ljava/lang/String;LRaptureXML/RXMLElement$Block;)V

    .line 434
    .end local v3    # "element":LRaptureXML/RXMLElement;
    .end local v6    # "lengthOfSubStringArray":I
    .end local v7    # "restOfQuery":Ljava/lang/String;
    .end local v8    # "subArray":[Ljava/lang/String;
    :cond_8
    invoke-interface {v2}, Lorg/w3c/dom/Node;->getNextSibling()Lorg/w3c/dom/Node;

    move-result-object v2

    .line 435
    if-nez v2, :cond_7

    .line 448
    :cond_9
    if-eqz v2, :cond_2

    .line 413
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 440
    :cond_a
    invoke-interface {v2}, Lorg/w3c/dom/Node;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v2

    .line 441
    :goto_4
    if-eqz v2, :cond_9

    .line 443
    invoke-interface {v2}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v9

    if-ne v9, v11, :cond_b

    invoke-interface {v2}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    .line 445
    :cond_b
    invoke-interface {v2}, Lorg/w3c/dom/Node;->getNextSibling()Lorg/w3c/dom/Node;

    move-result-object v2

    goto :goto_4

    .line 455
    .end local v5    # "iTagName":Ljava/lang/String;
    :cond_c
    const/4 v0, 0x0

    goto :goto_2

    .line 472
    .restart local v0    # "childTagName":Ljava/lang/String;
    :cond_d
    invoke-interface {v2}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v9

    if-ne v9, v11, :cond_e

    invoke-interface {v2}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    .line 470
    :cond_e
    invoke-interface {v2}, Lorg/w3c/dom/Node;->getNextSibling()Lorg/w3c/dom/Node;

    move-result-object v2

    if-nez v2, :cond_d

    goto :goto_3
.end method

.method public iterateElements(Ljava/util/ArrayList;LRaptureXML/RXMLElement$Block;)V
    .locals 3
    .param p2, "blk"    # LRaptureXML/RXMLElement$Block;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "LRaptureXML/RXMLElement;",
            ">;",
            "LRaptureXML/RXMLElement$Block;",
            ")V"
        }
    .end annotation

    .prologue
    .line 488
    .local p1, "elements":Ljava/util/ArrayList;, "Ljava/util/ArrayList<LRaptureXML/RXMLElement;>;"
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    .line 492
    return-void

    .line 488
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LRaptureXML/RXMLElement;

    .line 490
    .local v0, "element":LRaptureXML/RXMLElement;
    invoke-interface {p2, v0}, LRaptureXML/RXMLElement$Block;->block(LRaptureXML/RXMLElement;)V

    goto :goto_0
.end method

.method public iterateWithRootXPath(Ljava/lang/String;LRaptureXML/RXMLElement$Block;)V
    .locals 1
    .param p1, "query"    # Ljava/lang/String;
    .param p2, "blk"    # LRaptureXML/RXMLElement$Block;

    .prologue
    .line 482
    invoke-virtual {p0, p1}, LRaptureXML/RXMLElement;->childrenWithRootXPath(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 483
    .local v0, "children":Ljava/util/ArrayList;, "Ljava/util/ArrayList<LRaptureXML/RXMLElement;>;"
    invoke-virtual {p0, v0, p2}, LRaptureXML/RXMLElement;->iterateElements(Ljava/util/ArrayList;LRaptureXML/RXMLElement$Block;)V

    .line 484
    return-void
.end method

.method public tag()Ljava/lang/String;
    .locals 1

    .prologue
    .line 198
    iget-object v0, p0, LRaptureXML/RXMLElement;->_node:Lorg/w3c/dom/Node;

    invoke-interface {v0}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public text()Ljava/lang/String;
    .locals 7

    .prologue
    .line 203
    iget-object v5, p0, LRaptureXML/RXMLElement;->_node:Lorg/w3c/dom/Node;

    if-nez v5, :cond_0

    .line 204
    const-string v5, ""

    .line 221
    :goto_0
    return-object v5

    .line 205
    :cond_0
    iget-object v1, p0, LRaptureXML/RXMLElement;->_node:Lorg/w3c/dom/Node;

    .line 206
    .local v1, "cur":Lorg/w3c/dom/Node;
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object v0

    .line 207
    .local v0, "children":Lorg/w3c/dom/NodeList;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 208
    .local v4, "value":Ljava/lang/StringBuilder;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_1
    invoke-interface {v0}, Lorg/w3c/dom/NodeList;->getLength()I

    move-result v5

    if-lt v2, v5, :cond_1

    .line 218
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    .line 219
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 210
    :cond_1
    invoke-interface {v0, v2}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v3

    .line 211
    .local v3, "node":Lorg/w3c/dom/Node;
    invoke-interface {v3}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_2

    .line 212
    invoke-interface {v3}, Lorg/w3c/dom/Node;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v3

    .line 213
    :cond_2
    if-eqz v3, :cond_3

    .line 214
    invoke-interface {v3}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 221
    .end local v3    # "node":Lorg/w3c/dom/Node;
    :cond_4
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_0
.end method

.method public textAsDouble()D
    .locals 2

    .prologue
    .line 231
    invoke-virtual {p0}, LRaptureXML/RXMLElement;->text()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0
.end method

.method public textAsInt()I
    .locals 2

    .prologue
    .line 226
    invoke-virtual {p0}, LRaptureXML/RXMLElement;->text()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "0"

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p0}, LRaptureXML/RXMLElement;->text()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
