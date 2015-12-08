.class public Lnet/coocent/android/xmlparser/GiftXmlParser;
.super Ljava/lang/Object;
.source "GiftXmlParser.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;
    }
.end annotation


# instance fields
.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lnet/coocent/android/xmlparser/GiftXmlParser;->mContext:Landroid/content/Context;

    .line 20
    return-void
.end method

.method static synthetic access$0(Lnet/coocent/android/xmlparser/GiftXmlParser;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 16
    iget-object v0, p0, Lnet/coocent/android/xmlparser/GiftXmlParser;->mContext:Landroid/content/Context;

    return-object v0
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
            "Lnet/coocent/android/xmlparser/GiftEntity;",
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

    .line 68
    if-eqz p1, :cond_0

    .line 69
    invoke-static {}, Ljavax/xml/parsers/SAXParserFactory;->newInstance()Ljavax/xml/parsers/SAXParserFactory;

    move-result-object v1

    .line 70
    .local v1, "factory":Ljavax/xml/parsers/SAXParserFactory;
    invoke-virtual {v1}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;

    move-result-object v2

    .line 71
    .local v2, "parser":Ljavax/xml/parsers/SAXParser;
    new-instance v0, Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;

    invoke-direct {v0, p0, v3}, Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;-><init>(Lnet/coocent/android/xmlparser/GiftXmlParser;Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;)V

    .line 72
    .local v0, "callback":Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;
    invoke-virtual {v2, p1, v0}, Ljavax/xml/parsers/SAXParser;->parse(Ljava/io/InputStream;Lorg/xml/sax/helpers/DefaultHandler;)V

    .line 74
    # getter for: Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;->giftList:Ljava/util/ArrayList;
    invoke-static {v0}, Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;->access$1(Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;)Ljava/util/ArrayList;

    move-result-object v3

    .line 76
    .end local v0    # "callback":Lnet/coocent/android/xmlparser/GiftXmlParser$GiftParserHandler;
    .end local v1    # "factory":Ljavax/xml/parsers/SAXParserFactory;
    .end local v2    # "parser":Ljavax/xml/parsers/SAXParser;
    :cond_0
    return-object v3
.end method
