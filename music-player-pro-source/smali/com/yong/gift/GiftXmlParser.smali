.class public Lcom/yong/gift/GiftXmlParser;
.super Ljava/lang/Object;
.source "GiftXmlParser.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yong/gift/GiftXmlParser$GiftParserHandler;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public parse(Ljava/io/InputStream;)Ljava/util/ArrayList;
    .locals 4
    .param p1, "is"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/yong/gift/GiftEntity;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 60
    if-eqz p1, :cond_0

    .line 61
    invoke-static {}, Ljavax/xml/parsers/SAXParserFactory;->newInstance()Ljavax/xml/parsers/SAXParserFactory;

    move-result-object v1

    .line 62
    .local v1, "factory":Ljavax/xml/parsers/SAXParserFactory;
    invoke-virtual {v1}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;

    move-result-object v2

    .line 63
    .local v2, "parser":Ljavax/xml/parsers/SAXParser;
    new-instance v0, Lcom/yong/gift/GiftXmlParser$GiftParserHandler;

    invoke-direct {v0, p0, v3}, Lcom/yong/gift/GiftXmlParser$GiftParserHandler;-><init>(Lcom/yong/gift/GiftXmlParser;Lcom/yong/gift/GiftXmlParser$GiftParserHandler;)V

    .line 64
    .local v0, "callback":Lcom/yong/gift/GiftXmlParser$GiftParserHandler;
    invoke-virtual {v2, p1, v0}, Ljavax/xml/parsers/SAXParser;->parse(Ljava/io/InputStream;Lorg/xml/sax/helpers/DefaultHandler;)V

    .line 66
    # getter for: Lcom/yong/gift/GiftXmlParser$GiftParserHandler;->giftList:Ljava/util/ArrayList;
    invoke-static {v0}, Lcom/yong/gift/GiftXmlParser$GiftParserHandler;->access$1(Lcom/yong/gift/GiftXmlParser$GiftParserHandler;)Ljava/util/ArrayList;

    move-result-object v3

    .line 68
    .end local v0    # "callback":Lcom/yong/gift/GiftXmlParser$GiftParserHandler;
    .end local v1    # "factory":Ljavax/xml/parsers/SAXParserFactory;
    .end local v2    # "parser":Ljavax/xml/parsers/SAXParser;
    :cond_0
    return-object v3
.end method
