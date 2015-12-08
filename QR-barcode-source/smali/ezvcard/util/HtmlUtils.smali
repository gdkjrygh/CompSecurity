.class public Lezvcard/util/HtmlUtils;
.super Ljava/lang/Object;
.source "HtmlUtils.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    return-void
.end method

.method public static isChildOf(Lorg/jsoup/nodes/Element;Lorg/jsoup/select/Elements;)Z
    .locals 3
    .param p0, "child"    # Lorg/jsoup/nodes/Element;
    .param p1, "possibleParents"    # Lorg/jsoup/select/Elements;

    .prologue
    .line 50
    invoke-virtual {p0}, Lorg/jsoup/nodes/Element;->parents()Lorg/jsoup/select/Elements;

    move-result-object v2

    invoke-virtual {v2}, Lorg/jsoup/select/Elements;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/jsoup/nodes/Element;

    .line 51
    .local v1, "parent":Lorg/jsoup/nodes/Element;
    invoke-virtual {p1, v1}, Lorg/jsoup/select/Elements;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 52
    const/4 v2, 0x1

    .line 55
    .end local v1    # "parent":Lorg/jsoup/nodes/Element;
    :goto_0
    return v2

    :cond_1
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public static toElement(Ljava/lang/String;)Lorg/jsoup/nodes/Element;
    .locals 1
    .param p0, "html"    # Ljava/lang/String;

    .prologue
    .line 64
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lezvcard/util/HtmlUtils;->toElement(Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/nodes/Element;

    move-result-object v0

    return-object v0
.end method

.method public static toElement(Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/nodes/Element;
    .locals 2
    .param p0, "html"    # Ljava/lang/String;
    .param p1, "baseUrl"    # Ljava/lang/String;

    .prologue
    .line 74
    if-nez p1, :cond_0

    invoke-static {p0}, Lorg/jsoup/Jsoup;->parse(Ljava/lang/String;)Lorg/jsoup/nodes/Document;

    move-result-object v0

    .line 75
    .local v0, "d":Lorg/jsoup/nodes/Document;
    :goto_0
    const-string v1, "body"

    invoke-virtual {v0, v1}, Lorg/jsoup/nodes/Document;->getElementsByTag(Ljava/lang/String;)Lorg/jsoup/select/Elements;

    move-result-object v1

    invoke-virtual {v1}, Lorg/jsoup/select/Elements;->first()Lorg/jsoup/nodes/Element;

    move-result-object v1

    invoke-virtual {v1}, Lorg/jsoup/nodes/Element;->children()Lorg/jsoup/select/Elements;

    move-result-object v1

    invoke-virtual {v1}, Lorg/jsoup/select/Elements;->first()Lorg/jsoup/nodes/Element;

    move-result-object v1

    return-object v1

    .line 74
    .end local v0    # "d":Lorg/jsoup/nodes/Document;
    :cond_0
    invoke-static {p0, p1}, Lorg/jsoup/Jsoup;->parse(Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/nodes/Document;

    move-result-object v0

    goto :goto_0
.end method
