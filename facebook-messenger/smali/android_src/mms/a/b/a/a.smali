.class public Landroid_src/mms/a/b/a/a;
.super Lorg/xml/sax/helpers/DefaultHandler;
.source "SmilContentHandler.java"


# instance fields
.field private a:Lorg/a/a/b/f;

.field private b:Lorg/w3c/dom/Node;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 43
    new-instance v0, Landroid_src/mms/a/b/e;

    invoke-direct {v0}, Landroid_src/mms/a/b/e;-><init>()V

    iput-object v0, p0, Landroid_src/mms/a/b/a/a;->a:Lorg/a/a/b/f;

    .line 44
    iget-object v0, p0, Landroid_src/mms/a/b/a/a;->a:Lorg/a/a/b/f;

    iput-object v0, p0, Landroid_src/mms/a/b/a/a;->b:Lorg/w3c/dom/Node;

    .line 45
    return-void
.end method

.method public b()Lorg/a/a/b/f;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Landroid_src/mms/a/b/a/a;->a:Lorg/a/a/b/f;

    return-object v0
.end method

.method public characters([CII)V
    .locals 0

    .prologue
    .line 93
    return-void
.end method

.method public endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Landroid_src/mms/a/b/a/a;->b:Lorg/w3c/dom/Node;

    invoke-interface {v0}, Lorg/w3c/dom/Node;->getParentNode()Lorg/w3c/dom/Node;

    move-result-object v0

    iput-object v0, p0, Landroid_src/mms/a/b/a/a;->b:Lorg/w3c/dom/Node;

    .line 86
    return-void
.end method

.method public startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 4

    .prologue
    .line 60
    iget-object v0, p0, Landroid_src/mms/a/b/a/a;->a:Lorg/a/a/b/f;

    invoke-interface {v0, p2}, Lorg/a/a/b/f;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v1

    .line 61
    if-eqz p4, :cond_0

    .line 62
    const/4 v0, 0x0

    :goto_0
    invoke-interface {p4}, Lorg/xml/sax/Attributes;->getLength()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 68
    invoke-interface {p4, v0}, Lorg/xml/sax/Attributes;->getLocalName(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p4, v0}, Lorg/xml/sax/Attributes;->getValue(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lorg/w3c/dom/Element;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 75
    :cond_0
    iget-object v0, p0, Landroid_src/mms/a/b/a/a;->b:Lorg/w3c/dom/Node;

    invoke-interface {v0, v1}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 77
    iput-object v1, p0, Landroid_src/mms/a/b/a/a;->b:Lorg/w3c/dom/Node;

    .line 78
    return-void
.end method
