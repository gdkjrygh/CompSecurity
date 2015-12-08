.class Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;
.super Lorg/xml/sax/helpers/DefaultHandler;
.source "GiftXmlParser.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/coocent/android/xmlparser/GiftXmlParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "GiftParserHandler"
.end annotation


# instance fields
.field private currentGift:Lnet/coocent/android/xmlparser/GiftEntity;

.field private giftList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lnet/coocent/android/xmlparser/GiftEntity;",
            ">;"
        }
    .end annotation
.end field

.field private tagName:Ljava/lang/String;

.field final synthetic this$0:Lnet/coocent/android/xmlparser/GiftXmlParser;


# direct methods
.method private constructor <init>(Lnet/coocent/android/xmlparser/GiftXmlParser;)V
    .locals 0

    .prologue
    .line 22
    iput-object p1, p0, Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;->this$0:Lnet/coocent/android/xmlparser/GiftXmlParser;

    invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lnet/coocent/android/xmlparser/GiftXmlParser;Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0, p1}, Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;-><init>(Lnet/coocent/android/xmlparser/GiftXmlParser;)V

    return-void
.end method

.method static synthetic access$1(Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;->giftList:Ljava/util/ArrayList;

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
    .line 30
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 31
    .local v0, "data":Ljava/lang/String;
    const-string v1, "packagename"

    iget-object v2, p0, Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;->tagName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 32
    iget-object v1, p0, Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;->currentGift:Lnet/coocent/android/xmlparser/GiftEntity;

    invoke-virtual {v1, v0}, Lnet/coocent/android/xmlparser/GiftEntity;->setPackagename(Ljava/lang/String;)V

    .line 38
    :cond_0
    :goto_0
    return-void

    .line 33
    :cond_1
    const-string v1, "title"

    iget-object v2, p0, Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;->tagName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 34
    iget-object v1, p0, Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;->currentGift:Lnet/coocent/android/xmlparser/GiftEntity;

    invoke-virtual {v1, v0}, Lnet/coocent/android/xmlparser/GiftEntity;->setTitle(Ljava/lang/String;)V

    goto :goto_0

    .line 35
    :cond_2
    const-string v1, "icon_imagePath"

    iget-object v2, p0, Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;->tagName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 36
    iget-object v1, p0, Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;->currentGift:Lnet/coocent/android/xmlparser/GiftEntity;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "http://www.coocent.net/coocentPromotion/yonggift/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnet/coocent/android/xmlparser/GiftEntity;->setIcon_imagePath(Ljava/lang/String;)V

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
    .line 43
    const-string v0, "gift"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    iget-object v0, p0, Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;->currentGift:Lnet/coocent/android/xmlparser/GiftEntity;

    invoke-virtual {v0}, Lnet/coocent/android/xmlparser/GiftEntity;->getPackagename()Ljava/lang/String;

    move-result-object v0

    .line 45
    iget-object v1, p0, Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;->this$0:Lnet/coocent/android/xmlparser/GiftXmlParser;

    # getter for: Lnet/coocent/android/xmlparser/GiftXmlParser;->mContext:Landroid/content/Context;
    invoke-static {v1}, Lnet/coocent/android/xmlparser/GiftXmlParser;->access$0(Lnet/coocent/android/xmlparser/GiftXmlParser;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 45
    if-nez v0, :cond_0

    .line 46
    iget-object v0, p0, Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;->giftList:Ljava/util/ArrayList;

    iget-object v1, p0, Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;->currentGift:Lnet/coocent/android/xmlparser/GiftEntity;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;->tagName:Ljava/lang/String;

    .line 49
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
    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;->giftList:Ljava/util/ArrayList;

    .line 54
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
    .line 59
    const-string v0, "gift"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 60
    new-instance v0, Lnet/coocent/android/xmlparser/GiftEntity;

    invoke-direct {v0}, Lnet/coocent/android/xmlparser/GiftEntity;-><init>()V

    iput-object v0, p0, Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;->currentGift:Lnet/coocent/android/xmlparser/GiftEntity;

    .line 61
    iget-object v0, p0, Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;->currentGift:Lnet/coocent/android/xmlparser/GiftEntity;

    const-string v1, "id"

    invoke-interface {p4, v1}, Lorg/xml/sax/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lnet/coocent/android/xmlparser/GiftEntity;->setId(I)V

    .line 63
    :cond_0
    iput-object p2, p0, Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;->tagName:Ljava/lang/String;

    .line 64
    return-void
.end method
