.class public Lezvcard/io/scribe/ImppScribe;
.super Lezvcard/io/scribe/VCardPropertyScribe;
.source "ImppScribe.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lezvcard/io/scribe/VCardPropertyScribe",
        "<",
        "Lezvcard/property/Impp;",
        ">;"
    }
.end annotation


# static fields
.field public static final AIM:Ljava/lang/String; = "aim"

.field public static final ICQ:Ljava/lang/String; = "icq"

.field public static final IRC:Ljava/lang/String; = "irc"

.field public static final MSN:Ljava/lang/String; = "msnim"

.field public static final SIP:Ljava/lang/String; = "sip"

.field public static final SKYPE:Ljava/lang/String; = "skype"

.field public static final XMPP:Ljava/lang/String; = "xmpp"

.field public static final YAHOO:Ljava/lang/String; = "ymsgr"

.field private static final htmlLinkFormats:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x2

    const/4 v5, 0x1

    .line 145
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 148
    .local v0, "list":Ljava/util/List;, "Ljava/util/List<Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;>;"
    new-instance v1, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;

    const-string v2, "aim"

    const-string v3, "(goim|addbuddy)\\?.*?\\bscreenname=(.*?)(&|$)"

    const-string v4, "goim?screenname=%s"

    invoke-direct {v1, v2, v3, v6, v4}, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 151
    new-instance v1, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;

    const-string v2, "ymsgr"

    const-string v3, "(sendim|addfriend|sendfile|call)\\?(.*)"

    const-string v4, "sendim?%s"

    invoke-direct {v1, v2, v3, v6, v4}, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 154
    new-instance v1, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;

    const-string v2, "skype"

    const-string v3, "(.*?)(\\?|$)"

    const-string v4, "%s"

    invoke-direct {v1, v2, v3, v5, v4}, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 157
    new-instance v1, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;

    const-string v2, "msnim"

    const-string v3, "(chat|add|voice|video)\\?contact=(.*?)(&|$)"

    const-string v4, "chat?contact=%s"

    invoke-direct {v1, v2, v3, v6, v4}, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    new-instance v1, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;

    const-string v2, "xmpp"

    const-string v3, "(.*?)(\\?|$)"

    const-string v4, "%s?message"

    invoke-direct {v1, v2, v3, v5, v4}, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 163
    new-instance v1, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;

    const-string v2, "icq"

    const-string v3, "message\\?uin=(\\d+)"

    const-string v4, "message?uin=%s"

    invoke-direct {v1, v2, v3, v5, v4}, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 167
    new-instance v1, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;

    const-string v2, "sip"

    invoke-direct {v1, v2}, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    new-instance v1, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;

    const-string v2, "irc"

    invoke-direct {v1, v2}, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 173
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lezvcard/io/scribe/ImppScribe;->htmlLinkFormats:Ljava/util/List;

    .line 174
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 60
    const-class v0, Lezvcard/property/Impp;

    const-string v1, "IMPP"

    invoke-direct {p0, v0, v1}, Lezvcard/io/scribe/VCardPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 61
    return-void
.end method

.method private parse(Ljava/lang/String;)Lezvcard/property/Impp;
    .locals 4
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 128
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    .line 129
    :cond_0
    new-instance v2, Lezvcard/property/Impp;

    const/4 v1, 0x0

    check-cast v1, Ljava/net/URI;

    invoke-direct {v2, v1}, Lezvcard/property/Impp;-><init>(Ljava/net/URI;)V

    move-object v1, v2

    .line 133
    :goto_0
    return-object v1

    :cond_1
    :try_start_0
    new-instance v1, Lezvcard/property/Impp;

    invoke-direct {v1, p1}, Lezvcard/property/Impp;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 134
    :catch_0
    move-exception v0

    .line 135
    .local v0, "e":Ljava/lang/IllegalArgumentException;
    new-instance v1, Lezvcard/io/CannotParseException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot parse URI \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lezvcard/io/CannotParseException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private write(Lezvcard/property/Impp;)Ljava/lang/String;
    .locals 2
    .param p1, "property"    # Lezvcard/property/Impp;

    .prologue
    .line 123
    invoke-virtual {p1}, Lezvcard/property/Impp;->getUri()Ljava/net/URI;

    move-result-object v0

    .line 124
    .local v0, "uri":Ljava/net/URI;
    if-nez v0, :cond_0

    const-string v1, ""

    :goto_0
    return-object v1

    :cond_0
    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method


# virtual methods
.method protected _defaultDataType(Lezvcard/VCardVersion;)Lezvcard/VCardDataType;
    .locals 1
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 65
    sget-object v0, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    return-object v0
.end method

.method protected _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/Impp;
    .locals 6
    .param p1, "element"    # Lezvcard/io/html/HCardElement;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/html/HCardElement;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lezvcard/property/Impp;"
        }
    .end annotation

    .prologue
    .line 96
    .local p2, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const-string v3, "href"

    invoke-virtual {p1, v3}, Lezvcard/io/html/HCardElement;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 97
    .local v1, "href":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_0

    .line 98
    invoke-virtual {p1}, Lezvcard/io/html/HCardElement;->value()Ljava/lang/String;

    move-result-object v1

    .line 102
    :cond_0
    :try_start_0
    invoke-virtual {p0, v1}, Lezvcard/io/scribe/ImppScribe;->parseHtmlLink(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v2

    .line 103
    .local v2, "uri":Ljava/net/URI;
    if-nez v2, :cond_1

    .line 104
    new-instance v3, Ljava/lang/IllegalArgumentException;

    invoke-direct {v3}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    .end local v2    # "uri":Ljava/net/URI;
    :catch_0
    move-exception v0

    .line 108
    .local v0, "e":Ljava/lang/IllegalArgumentException;
    new-instance v3, Lezvcard/io/CannotParseException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Could not parse instant messenger information from link: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lezvcard/io/CannotParseException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 106
    .end local v0    # "e":Ljava/lang/IllegalArgumentException;
    .restart local v2    # "uri":Ljava/net/URI;
    :cond_1
    :try_start_1
    new-instance v3, Lezvcard/property/Impp;

    invoke-direct {v3, v2}, Lezvcard/property/Impp;-><init>(Ljava/net/URI;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v3
.end method

.method protected bridge synthetic _parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/html/HCardElement;
    .param p2, "x1"    # Ljava/util/List;

    .prologue
    .line 49
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/ImppScribe;->_parseHtml(Lezvcard/io/html/HCardElement;Ljava/util/List;)Lezvcard/property/Impp;

    move-result-object v0

    return-object v0
.end method

.method protected _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Impp;
    .locals 1
    .param p1, "value"    # Lezvcard/io/json/JCardValue;
    .param p2, "dataType"    # Lezvcard/VCardDataType;
    .param p3, "parameters"    # Lezvcard/parameter/VCardParameters;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/json/JCardValue;",
            "Lezvcard/VCardDataType;",
            "Lezvcard/parameter/VCardParameters;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lezvcard/property/Impp;"
        }
    .end annotation

    .prologue
    .line 119
    .local p4, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p1}, Lezvcard/io/json/JCardValue;->asSingle()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lezvcard/io/scribe/ImppScribe;->parse(Ljava/lang/String;)Lezvcard/property/Impp;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic _parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/json/JCardValue;
    .param p2, "x1"    # Lezvcard/VCardDataType;
    .param p3, "x2"    # Lezvcard/parameter/VCardParameters;
    .param p4, "x3"    # Ljava/util/List;

    .prologue
    .line 49
    invoke-virtual {p0, p1, p2, p3, p4}, Lezvcard/io/scribe/ImppScribe;->_parseJson(Lezvcard/io/json/JCardValue;Lezvcard/VCardDataType;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Impp;

    move-result-object v0

    return-object v0
.end method

.method protected _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Impp;
    .locals 1
    .param p1, "value"    # Ljava/lang/String;
    .param p2, "dataType"    # Lezvcard/VCardDataType;
    .param p3, "version"    # Lezvcard/VCardVersion;
    .param p4, "parameters"    # Lezvcard/parameter/VCardParameters;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lezvcard/VCardDataType;",
            "Lezvcard/VCardVersion;",
            "Lezvcard/parameter/VCardParameters;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lezvcard/property/Impp;"
        }
    .end annotation

    .prologue
    .line 75
    .local p5, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {p1}, Lezvcard/io/scribe/ImppScribe;->unescape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 76
    invoke-direct {p0, p1}, Lezvcard/io/scribe/ImppScribe;->parse(Ljava/lang/String;)Lezvcard/property/Impp;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic _parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # Lezvcard/VCardDataType;
    .param p3, "x2"    # Lezvcard/VCardVersion;
    .param p4, "x3"    # Lezvcard/parameter/VCardParameters;
    .param p5, "x4"    # Ljava/util/List;

    .prologue
    .line 49
    invoke-virtual/range {p0 .. p5}, Lezvcard/io/scribe/ImppScribe;->_parseText(Ljava/lang/String;Lezvcard/VCardDataType;Lezvcard/VCardVersion;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Impp;

    move-result-object v0

    return-object v0
.end method

.method protected _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Impp;
    .locals 5
    .param p1, "element"    # Lezvcard/io/xml/XCardElement;
    .param p2, "parameters"    # Lezvcard/parameter/VCardParameters;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/xml/XCardElement;",
            "Lezvcard/parameter/VCardParameters;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lezvcard/property/Impp;"
        }
    .end annotation

    .prologue
    .local p3, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 86
    new-array v1, v4, [Lezvcard/VCardDataType;

    sget-object v2, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    aput-object v2, v1, v3

    invoke-virtual {p1, v1}, Lezvcard/io/xml/XCardElement;->first([Lezvcard/VCardDataType;)Ljava/lang/String;

    move-result-object v0

    .line 87
    .local v0, "value":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 88
    invoke-direct {p0, v0}, Lezvcard/io/scribe/ImppScribe;->parse(Ljava/lang/String;)Lezvcard/property/Impp;

    move-result-object v1

    return-object v1

    .line 91
    :cond_0
    new-array v1, v4, [Lezvcard/VCardDataType;

    sget-object v2, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    aput-object v2, v1, v3

    invoke-static {v1}, Lezvcard/io/scribe/ImppScribe;->missingXmlElements([Lezvcard/VCardDataType;)Lezvcard/io/CannotParseException;

    move-result-object v1

    throw v1
.end method

.method protected bridge synthetic _parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/VCardProperty;
    .locals 1
    .param p1, "x0"    # Lezvcard/io/xml/XCardElement;
    .param p2, "x1"    # Lezvcard/parameter/VCardParameters;
    .param p3, "x2"    # Ljava/util/List;

    .prologue
    .line 49
    invoke-virtual {p0, p1, p2, p3}, Lezvcard/io/scribe/ImppScribe;->_parseXml(Lezvcard/io/xml/XCardElement;Lezvcard/parameter/VCardParameters;Ljava/util/List;)Lezvcard/property/Impp;

    move-result-object v0

    return-object v0
.end method

.method protected _writeJson(Lezvcard/property/Impp;)Lezvcard/io/json/JCardValue;
    .locals 1
    .param p1, "property"    # Lezvcard/property/Impp;

    .prologue
    .line 114
    invoke-direct {p0, p1}, Lezvcard/io/scribe/ImppScribe;->write(Lezvcard/property/Impp;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lezvcard/io/json/JCardValue;->single(Ljava/lang/Object;)Lezvcard/io/json/JCardValue;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic _writeJson(Lezvcard/property/VCardProperty;)Lezvcard/io/json/JCardValue;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;

    .prologue
    .line 49
    check-cast p1, Lezvcard/property/Impp;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/ImppScribe;->_writeJson(Lezvcard/property/Impp;)Lezvcard/io/json/JCardValue;

    move-result-object v0

    return-object v0
.end method

.method protected _writeText(Lezvcard/property/Impp;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 1
    .param p1, "property"    # Lezvcard/property/Impp;
    .param p2, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 70
    invoke-direct {p0, p1}, Lezvcard/io/scribe/ImppScribe;->write(Lezvcard/property/Impp;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic _writeText(Lezvcard/property/VCardProperty;Lezvcard/VCardVersion;)Ljava/lang/String;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/VCardVersion;

    .prologue
    .line 49
    check-cast p1, Lezvcard/property/Impp;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/ImppScribe;->_writeText(Lezvcard/property/Impp;Lezvcard/VCardVersion;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected _writeXml(Lezvcard/property/Impp;Lezvcard/io/xml/XCardElement;)V
    .locals 2
    .param p1, "property"    # Lezvcard/property/Impp;
    .param p2, "parent"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 81
    sget-object v0, Lezvcard/VCardDataType;->URI:Lezvcard/VCardDataType;

    invoke-direct {p0, p1}, Lezvcard/io/scribe/ImppScribe;->write(Lezvcard/property/Impp;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lezvcard/io/xml/XCardElement;->append(Lezvcard/VCardDataType;Ljava/lang/String;)Lorg/w3c/dom/Element;

    .line 82
    return-void
.end method

.method protected bridge synthetic _writeXml(Lezvcard/property/VCardProperty;Lezvcard/io/xml/XCardElement;)V
    .locals 0
    .param p1, "x0"    # Lezvcard/property/VCardProperty;
    .param p2, "x1"    # Lezvcard/io/xml/XCardElement;

    .prologue
    .line 49
    check-cast p1, Lezvcard/property/Impp;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1, p2}, Lezvcard/io/scribe/ImppScribe;->_writeXml(Lezvcard/property/Impp;Lezvcard/io/xml/XCardElement;)V

    return-void
.end method

.method public parseHtmlLink(Ljava/lang/String;)Ljava/net/URI;
    .locals 7
    .param p1, "linkUri"    # Ljava/lang/String;

    .prologue
    const/4 v4, 0x0

    .line 182
    sget-object v5, Lezvcard/io/scribe/ImppScribe;->htmlLinkFormats:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .local v3, "i$":Ljava/util/Iterator;
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;

    .line 183
    .local v1, "format":Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;
    invoke-virtual {v1, p1}, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;->parseHandle(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 184
    .local v2, "handle":Ljava/lang/String;
    if-eqz v2, :cond_0

    .line 189
    :try_start_0
    new-instance v4, Ljava/net/URI;

    invoke-virtual {v1}, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;->getProtocol()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-direct {v4, v5, v2, v6}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 194
    .end local v1    # "format":Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;
    .end local v2    # "handle":Ljava/lang/String;
    :cond_1
    return-object v4

    .line 190
    .restart local v1    # "format":Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;
    .restart local v2    # "handle":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 191
    .local v0, "e":Ljava/net/URISyntaxException;
    new-instance v4, Ljava/lang/IllegalArgumentException;

    invoke-direct {v4, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v4
.end method

.method public writeHtmlLink(Lezvcard/property/Impp;)Ljava/lang/String;
    .locals 6
    .param p1, "property"    # Lezvcard/property/Impp;

    .prologue
    .line 204
    invoke-virtual {p1}, Lezvcard/property/Impp;->getUri()Ljava/net/URI;

    move-result-object v4

    .line 205
    .local v4, "uri":Ljava/net/URI;
    if-nez v4, :cond_0

    .line 206
    const/4 v5, 0x0

    .line 217
    :goto_0
    return-object v5

    .line 209
    :cond_0
    invoke-virtual {v4}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v3

    .line 210
    .local v3, "protocol":Ljava/lang/String;
    invoke-virtual {v4}, Ljava/net/URI;->getSchemeSpecificPart()Ljava/lang/String;

    move-result-object v1

    .line 212
    .local v1, "handle":Ljava/lang/String;
    sget-object v5, Lezvcard/io/scribe/ImppScribe;->htmlLinkFormats:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;

    .line 213
    .local v0, "format":Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;
    invoke-virtual {v0}, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;->getProtocol()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 214
    invoke-virtual {v0, v1}, Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;->buildLink(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 217
    .end local v0    # "format":Lezvcard/io/scribe/ImppScribe$HtmlLinkFormat;
    :cond_2
    invoke-virtual {v4}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_0
.end method
