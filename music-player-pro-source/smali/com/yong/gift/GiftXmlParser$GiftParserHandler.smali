.class Lcom/yong/gift/GiftXmlParser$GiftParserHandler;
.super Lorg/xml/sax/helpers/DefaultHandler;
.source "GiftXmlParser.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yong/gift/GiftXmlParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "GiftParserHandler"
.end annotation


# instance fields
.field private currentGift:Lcom/yong/gift/GiftEntity;

.field private giftList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/yong/gift/GiftEntity;",
            ">;"
        }
    .end annotation
.end field

.field private tagName:Ljava/lang/String;

.field final synthetic this$0:Lcom/yong/gift/GiftXmlParser;


# direct methods
.method private constructor <init>(Lcom/yong/gift/GiftXmlParser;)V
    .locals 0

    .prologue
    .line 14
    iput-object p1, p0, Lcom/yong/gift/GiftXmlParser$GiftParserHandler;->this$0:Lcom/yong/gift/GiftXmlParser;

    invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/yong/gift/GiftXmlParser;Lcom/yong/gift/GiftXmlParser$GiftParserHandler;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0, p1}, Lcom/yong/gift/GiftXmlParser$GiftParserHandler;-><init>(Lcom/yong/gift/GiftXmlParser;)V

    return-void
.end method

.method static synthetic access$1(Lcom/yong/gift/GiftXmlParser$GiftParserHandler;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Lcom/yong/gift/GiftXmlParser$GiftParserHandler;->giftList:Ljava/util/ArrayList;

    return-object v0
.end method


# virtual methods
.method public characters([CII)V
    .locals 4
    .param p1, "ch"    # [C
    .param p2, "start"    # I
    .param p3, "length"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .prologue
    .line 22
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 23
    .local v0, "data":Ljava/lang/String;
    const-string v1, "title"

    iget-object v2, p0, Lcom/yong/gift/GiftXmlParser$GiftParserHandler;->tagName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 24
    iget-object v1, p0, Lcom/yong/gift/GiftXmlParser$GiftParserHandler;->currentGift:Lcom/yong/gift/GiftEntity;

    invoke-virtual {v1, v0}, Lcom/yong/gift/GiftEntity;->setTitle(Ljava/lang/String;)V

    .line 32
    :cond_0
    :goto_0
    return-void

    .line 25
    :cond_1
    const-string v1, "detailed"

    iget-object v2, p0, Lcom/yong/gift/GiftXmlParser$GiftParserHandler;->tagName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 26
    iget-object v1, p0, Lcom/yong/gift/GiftXmlParser$GiftParserHandler;->currentGift:Lcom/yong/gift/GiftEntity;

    invoke-virtual {v1, v0}, Lcom/yong/gift/GiftEntity;->setDetailed(Ljava/lang/String;)V

    goto :goto_0

    .line 27
    :cond_2
    const-string v1, "icon_imagePath"

    iget-object v2, p0, Lcom/yong/gift/GiftXmlParser$GiftParserHandler;->tagName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 28
    iget-object v1, p0, Lcom/yong/gift/GiftXmlParser$GiftParserHandler;->currentGift:Lcom/yong/gift/GiftEntity;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "http://moobosoft.com/giftmodule/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/yong/gift/GiftEntity;->setIcon_imagePath(Ljava/lang/String;)V

    goto :goto_0

    .line 29
    :cond_3
    const-string v1, "marketUrl"

    iget-object v2, p0, Lcom/yong/gift/GiftXmlParser$GiftParserHandler;->tagName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 30
    iget-object v1, p0, Lcom/yong/gift/GiftXmlParser$GiftParserHandler;->currentGift:Lcom/yong/gift/GiftEntity;

    invoke-virtual {v1, v0}, Lcom/yong/gift/GiftEntity;->setMarketUrl(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "uri"    # Ljava/lang/String;
    .param p2, "localName"    # Ljava/lang/String;
    .param p3, "qName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .prologue
    .line 37
    const-string v0, "gift"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    iget-object v0, p0, Lcom/yong/gift/GiftXmlParser$GiftParserHandler;->giftList:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/yong/gift/GiftXmlParser$GiftParserHandler;->currentGift:Lcom/yong/gift/GiftEntity;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/yong/gift/GiftXmlParser$GiftParserHandler;->tagName:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public startDocument()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .prologue
    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/yong/gift/GiftXmlParser$GiftParserHandler;->giftList:Ljava/util/ArrayList;

    .line 46
    return-void
.end method

.method public startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 2
    .param p1, "uri"    # Ljava/lang/String;
    .param p2, "localName"    # Ljava/lang/String;
    .param p3, "qName"    # Ljava/lang/String;
    .param p4, "attributes"    # Lorg/xml/sax/Attributes;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .prologue
    .line 51
    const-string v0, "gift"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 52
    new-instance v0, Lcom/yong/gift/GiftEntity;

    invoke-direct {v0}, Lcom/yong/gift/GiftEntity;-><init>()V

    iput-object v0, p0, Lcom/yong/gift/GiftXmlParser$GiftParserHandler;->currentGift:Lcom/yong/gift/GiftEntity;

    .line 53
    iget-object v0, p0, Lcom/yong/gift/GiftXmlParser$GiftParserHandler;->currentGift:Lcom/yong/gift/GiftEntity;

    const-string v1, "id"

    invoke-interface {p4, v1}, Lorg/xml/sax/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/yong/gift/GiftEntity;->setId(I)V

    .line 55
    :cond_0
    iput-object p2, p0, Lcom/yong/gift/GiftXmlParser$GiftParserHandler;->tagName:Ljava/lang/String;

    .line 56
    return-void
.end method
