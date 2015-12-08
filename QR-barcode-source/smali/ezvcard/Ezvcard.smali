.class public Lezvcard/Ezvcard;
.super Ljava/lang/Object;
.source "Ezvcard.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lezvcard/Ezvcard$1;,
        Lezvcard/Ezvcard$WriterChainJson;,
        Lezvcard/Ezvcard$WriterChainHtml;,
        Lezvcard/Ezvcard$WriterChainXml;,
        Lezvcard/Ezvcard$WriterChainText;,
        Lezvcard/Ezvcard$WriterChain;,
        Lezvcard/Ezvcard$ParserChainJsonString;,
        Lezvcard/Ezvcard$ParserChainJsonReader;,
        Lezvcard/Ezvcard$ParserChainJson;,
        Lezvcard/Ezvcard$ParserChainHtmlString;,
        Lezvcard/Ezvcard$ParserChainHtmlReader;,
        Lezvcard/Ezvcard$ParserChainHtml;,
        Lezvcard/Ezvcard$ParserChainXmlDom;,
        Lezvcard/Ezvcard$ParserChainXmlString;,
        Lezvcard/Ezvcard$ParserChainXmlReader;,
        Lezvcard/Ezvcard$ParserChainXml;,
        Lezvcard/Ezvcard$ParserChainTextString;,
        Lezvcard/Ezvcard$ParserChainTextReader;,
        Lezvcard/Ezvcard$ParserChainText;,
        Lezvcard/Ezvcard$ParserChain;
    }
.end annotation


# static fields
.field public static final URL:Ljava/lang/String;

.field public static final VERSION:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    .line 117
    const/4 v1, 0x0

    .line 119
    .local v1, "in":Ljava/io/InputStream;
    :try_start_0
    const-class v3, Lezvcard/Ezvcard;

    const-string v4, "/ez-vcard.properties"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    .line 120
    new-instance v2, Ljava/util/Properties;

    invoke-direct {v2}, Ljava/util/Properties;-><init>()V

    .line 121
    .local v2, "props":Ljava/util/Properties;
    invoke-virtual {v2, v1}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    .line 123
    const-string v3, "version"

    invoke-virtual {v2, v3}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lezvcard/Ezvcard;->VERSION:Ljava/lang/String;

    .line 124
    const-string v3, "url"

    invoke-virtual {v2, v3}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lezvcard/Ezvcard;->URL:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    invoke-static {v1}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    .line 130
    return-void

    .line 125
    .end local v2    # "props":Ljava/util/Properties;
    :catch_0
    move-exception v0

    .line 126
    .local v0, "e":Ljava/io/IOException;
    :try_start_1
    new-instance v3, Ljava/lang/RuntimeException;

    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    .end local v0    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v3

    invoke-static {v1}, Lezvcard/util/IOUtils;->closeQuietly(Ljava/io/Closeable;)V

    throw v3
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 1804
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1806
    return-void
.end method

.method public static parse(Ljava/io/File;)Lezvcard/Ezvcard$ParserChainTextReader;
    .locals 2
    .param p0, "file"    # Ljava/io/File;

    .prologue
    .line 165
    new-instance v0, Lezvcard/Ezvcard$ParserChainTextReader;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lezvcard/Ezvcard$ParserChainTextReader;-><init>(Ljava/io/File;Lezvcard/Ezvcard$1;)V

    return-object v0
.end method

.method public static parse(Ljava/io/InputStream;)Lezvcard/Ezvcard$ParserChainTextReader;
    .locals 1
    .param p0, "in"    # Ljava/io/InputStream;

    .prologue
    .line 183
    new-instance v0, Ljava/io/InputStreamReader;

    invoke-direct {v0, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-static {v0}, Lezvcard/Ezvcard;->parse(Ljava/io/Reader;)Lezvcard/Ezvcard$ParserChainTextReader;

    move-result-object v0

    return-object v0
.end method

.method public static parse(Ljava/io/Reader;)Lezvcard/Ezvcard$ParserChainTextReader;
    .locals 2
    .param p0, "reader"    # Ljava/io/Reader;

    .prologue
    .line 201
    new-instance v0, Lezvcard/Ezvcard$ParserChainTextReader;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lezvcard/Ezvcard$ParserChainTextReader;-><init>(Ljava/io/Reader;Lezvcard/Ezvcard$1;)V

    return-object v0
.end method

.method public static parse(Ljava/lang/String;)Lezvcard/Ezvcard$ParserChainTextString;
    .locals 2
    .param p0, "str"    # Ljava/lang/String;

    .prologue
    .line 147
    new-instance v0, Lezvcard/Ezvcard$ParserChainTextString;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lezvcard/Ezvcard$ParserChainTextString;-><init>(Ljava/lang/String;Lezvcard/Ezvcard$1;)V

    return-object v0
.end method

.method public static parseHtml(Ljava/io/File;)Lezvcard/Ezvcard$ParserChainHtmlReader;
    .locals 2
    .param p0, "file"    # Ljava/io/File;

    .prologue
    .line 321
    new-instance v0, Lezvcard/Ezvcard$ParserChainHtmlReader;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lezvcard/Ezvcard$ParserChainHtmlReader;-><init>(Ljava/io/File;Lezvcard/Ezvcard$1;)V

    return-object v0
.end method

.method public static parseHtml(Ljava/io/InputStream;)Lezvcard/Ezvcard$ParserChainHtmlReader;
    .locals 1
    .param p0, "in"    # Ljava/io/InputStream;

    .prologue
    .line 337
    new-instance v0, Ljava/io/InputStreamReader;

    invoke-direct {v0, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-static {v0}, Lezvcard/Ezvcard;->parseHtml(Ljava/io/Reader;)Lezvcard/Ezvcard$ParserChainHtmlReader;

    move-result-object v0

    return-object v0
.end method

.method public static parseHtml(Ljava/io/Reader;)Lezvcard/Ezvcard$ParserChainHtmlReader;
    .locals 2
    .param p0, "reader"    # Ljava/io/Reader;

    .prologue
    .line 353
    new-instance v0, Lezvcard/Ezvcard$ParserChainHtmlReader;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lezvcard/Ezvcard$ParserChainHtmlReader;-><init>(Ljava/io/Reader;Lezvcard/Ezvcard$1;)V

    return-object v0
.end method

.method public static parseHtml(Ljava/net/URL;)Lezvcard/Ezvcard$ParserChainHtmlReader;
    .locals 2
    .param p0, "url"    # Ljava/net/URL;

    .prologue
    .line 369
    new-instance v0, Lezvcard/Ezvcard$ParserChainHtmlReader;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lezvcard/Ezvcard$ParserChainHtmlReader;-><init>(Ljava/net/URL;Lezvcard/Ezvcard$1;)V

    return-object v0
.end method

.method public static parseHtml(Ljava/lang/String;)Lezvcard/Ezvcard$ParserChainHtmlString;
    .locals 2
    .param p0, "html"    # Ljava/lang/String;

    .prologue
    .line 305
    new-instance v0, Lezvcard/Ezvcard$ParserChainHtmlString;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lezvcard/Ezvcard$ParserChainHtmlString;-><init>(Ljava/lang/String;Lezvcard/Ezvcard$1;)V

    return-object v0
.end method

.method public static parseJson(Ljava/io/File;)Lezvcard/Ezvcard$ParserChainJsonReader;
    .locals 2
    .param p0, "file"    # Ljava/io/File;

    .prologue
    .line 405
    new-instance v0, Lezvcard/Ezvcard$ParserChainJsonReader;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lezvcard/Ezvcard$ParserChainJsonReader;-><init>(Ljava/io/File;Lezvcard/Ezvcard$1;)V

    return-object v0
.end method

.method public static parseJson(Ljava/io/InputStream;)Lezvcard/Ezvcard$ParserChainJsonReader;
    .locals 2
    .param p0, "in"    # Ljava/io/InputStream;

    .prologue
    .line 423
    new-instance v0, Lezvcard/Ezvcard$ParserChainJsonReader;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lezvcard/Ezvcard$ParserChainJsonReader;-><init>(Ljava/io/InputStream;Lezvcard/Ezvcard$1;)V

    return-object v0
.end method

.method public static parseJson(Ljava/io/Reader;)Lezvcard/Ezvcard$ParserChainJsonReader;
    .locals 2
    .param p0, "reader"    # Ljava/io/Reader;

    .prologue
    .line 441
    new-instance v0, Lezvcard/Ezvcard$ParserChainJsonReader;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lezvcard/Ezvcard$ParserChainJsonReader;-><init>(Ljava/io/Reader;Lezvcard/Ezvcard$1;)V

    return-object v0
.end method

.method public static parseJson(Ljava/lang/String;)Lezvcard/Ezvcard$ParserChainJsonString;
    .locals 2
    .param p0, "json"    # Ljava/lang/String;

    .prologue
    .line 387
    new-instance v0, Lezvcard/Ezvcard$ParserChainJsonString;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lezvcard/Ezvcard$ParserChainJsonString;-><init>(Ljava/lang/String;Lezvcard/Ezvcard$1;)V

    return-object v0
.end method

.method public static parseXml(Lorg/w3c/dom/Document;)Lezvcard/Ezvcard$ParserChainXmlDom;
    .locals 2
    .param p0, "document"    # Lorg/w3c/dom/Document;

    .prologue
    .line 289
    new-instance v0, Lezvcard/Ezvcard$ParserChainXmlDom;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lezvcard/Ezvcard$ParserChainXmlDom;-><init>(Lorg/w3c/dom/Document;Lezvcard/Ezvcard$1;)V

    return-object v0
.end method

.method public static parseXml(Ljava/io/File;)Lezvcard/Ezvcard$ParserChainXmlReader;
    .locals 2
    .param p0, "file"    # Ljava/io/File;

    .prologue
    .line 233
    new-instance v0, Lezvcard/Ezvcard$ParserChainXmlReader;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lezvcard/Ezvcard$ParserChainXmlReader;-><init>(Ljava/io/File;Lezvcard/Ezvcard$1;)V

    return-object v0
.end method

.method public static parseXml(Ljava/io/InputStream;)Lezvcard/Ezvcard$ParserChainXmlReader;
    .locals 2
    .param p0, "in"    # Ljava/io/InputStream;

    .prologue
    .line 249
    new-instance v0, Lezvcard/Ezvcard$ParserChainXmlReader;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lezvcard/Ezvcard$ParserChainXmlReader;-><init>(Ljava/io/InputStream;Lezvcard/Ezvcard$1;)V

    return-object v0
.end method

.method public static parseXml(Ljava/io/Reader;)Lezvcard/Ezvcard$ParserChainXmlReader;
    .locals 2
    .param p0, "reader"    # Ljava/io/Reader;

    .prologue
    .line 273
    new-instance v0, Lezvcard/Ezvcard$ParserChainXmlReader;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lezvcard/Ezvcard$ParserChainXmlReader;-><init>(Ljava/io/Reader;Lezvcard/Ezvcard$1;)V

    return-object v0
.end method

.method public static parseXml(Ljava/lang/String;)Lezvcard/Ezvcard$ParserChainXmlString;
    .locals 2
    .param p0, "xml"    # Ljava/lang/String;

    .prologue
    .line 217
    new-instance v0, Lezvcard/Ezvcard$ParserChainXmlString;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lezvcard/Ezvcard$ParserChainXmlString;-><init>(Ljava/lang/String;Lezvcard/Ezvcard$1;)V

    return-object v0
.end method

.method public static write(Ljava/util/Collection;)Lezvcard/Ezvcard$WriterChainText;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/VCard;",
            ">;)",
            "Lezvcard/Ezvcard$WriterChainText;"
        }
    .end annotation

    .prologue
    .line 481
    .local p0, "vcards":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/VCard;>;"
    new-instance v0, Lezvcard/Ezvcard$WriterChainText;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lezvcard/Ezvcard$WriterChainText;-><init>(Ljava/util/Collection;Lezvcard/Ezvcard$1;)V

    return-object v0
.end method

.method public static varargs write([Lezvcard/VCard;)Lezvcard/Ezvcard$WriterChainText;
    .locals 1
    .param p0, "vcards"    # [Lezvcard/VCard;

    .prologue
    .line 461
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lezvcard/Ezvcard;->write(Ljava/util/Collection;)Lezvcard/Ezvcard$WriterChainText;

    move-result-object v0

    return-object v0
.end method

.method public static writeHtml(Ljava/util/Collection;)Lezvcard/Ezvcard$WriterChainHtml;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/VCard;",
            ">;)",
            "Lezvcard/Ezvcard$WriterChainHtml;"
        }
    .end annotation

    .prologue
    .line 551
    .local p0, "vcards":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/VCard;>;"
    new-instance v0, Lezvcard/Ezvcard$WriterChainHtml;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lezvcard/Ezvcard$WriterChainHtml;-><init>(Ljava/util/Collection;Lezvcard/Ezvcard$1;)V

    return-object v0
.end method

.method public static varargs writeHtml([Lezvcard/VCard;)Lezvcard/Ezvcard$WriterChainHtml;
    .locals 1
    .param p0, "vcards"    # [Lezvcard/VCard;

    .prologue
    .line 534
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lezvcard/Ezvcard;->writeHtml(Ljava/util/Collection;)Lezvcard/Ezvcard$WriterChainHtml;

    move-result-object v0

    return-object v0
.end method

.method public static writeJson(Ljava/util/Collection;)Lezvcard/Ezvcard$WriterChainJson;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/VCard;",
            ">;)",
            "Lezvcard/Ezvcard$WriterChainJson;"
        }
    .end annotation

    .prologue
    .line 589
    .local p0, "vcards":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/VCard;>;"
    new-instance v0, Lezvcard/Ezvcard$WriterChainJson;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lezvcard/Ezvcard$WriterChainJson;-><init>(Ljava/util/Collection;Lezvcard/Ezvcard$1;)V

    return-object v0
.end method

.method public static varargs writeJson([Lezvcard/VCard;)Lezvcard/Ezvcard$WriterChainJson;
    .locals 1
    .param p0, "vcards"    # [Lezvcard/VCard;

    .prologue
    .line 570
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lezvcard/Ezvcard;->writeJson(Ljava/util/Collection;)Lezvcard/Ezvcard$WriterChainJson;

    move-result-object v0

    return-object v0
.end method

.method public static writeXml(Ljava/util/Collection;)Lezvcard/Ezvcard$WriterChainXml;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lezvcard/VCard;",
            ">;)",
            "Lezvcard/Ezvcard$WriterChainXml;"
        }
    .end annotation

    .prologue
    .line 517
    .local p0, "vcards":Ljava/util/Collection;, "Ljava/util/Collection<Lezvcard/VCard;>;"
    new-instance v0, Lezvcard/Ezvcard$WriterChainXml;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lezvcard/Ezvcard$WriterChainXml;-><init>(Ljava/util/Collection;Lezvcard/Ezvcard$1;)V

    return-object v0
.end method

.method public static varargs writeXml([Lezvcard/VCard;)Lezvcard/Ezvcard$WriterChainXml;
    .locals 1
    .param p0, "vcards"    # [Lezvcard/VCard;

    .prologue
    .line 499
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lezvcard/Ezvcard;->writeXml(Ljava/util/Collection;)Lezvcard/Ezvcard$WriterChainXml;

    move-result-object v0

    return-object v0
.end method
