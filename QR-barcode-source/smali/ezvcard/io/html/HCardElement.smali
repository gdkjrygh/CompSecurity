.class public Lezvcard/io/html/HCardElement;
.super Ljava/lang/Object;
.source "HCardElement.java"


# instance fields
.field private final element:Lorg/jsoup/nodes/Element;


# direct methods
.method public constructor <init>(Lorg/jsoup/nodes/Element;)V
    .locals 0
    .param p1, "element"    # Lorg/jsoup/nodes/Element;

    .prologue
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Lezvcard/io/html/HCardElement;->element:Lorg/jsoup/nodes/Element;

    .line 58
    return-void
.end method

.method private value(Lorg/jsoup/nodes/Element;)Ljava/lang/String;
    .locals 7
    .param p1, "element"    # Lorg/jsoup/nodes/Element;

    .prologue
    .line 188
    const-string v5, "abbr"

    invoke-virtual {p1}, Lorg/jsoup/nodes/Element;->tagName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 189
    const-string v5, "title"

    invoke-virtual {p1, v5}, Lorg/jsoup/nodes/Element;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 190
    .local v1, "title":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_0

    .line 218
    .end local v1    # "title":Ljava/lang/String;
    :goto_0
    return-object v1

    .line 195
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 196
    .local v2, "value":Ljava/lang/StringBuilder;
    const-string v5, "value"

    invoke-virtual {p1, v5}, Lorg/jsoup/nodes/Element;->getElementsByClass(Ljava/lang/String;)Lorg/jsoup/select/Elements;

    move-result-object v4

    .line 197
    .local v4, "valueElements":Lorg/jsoup/select/Elements;
    invoke-virtual {v4}, Lorg/jsoup/select/Elements;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 199
    invoke-direct {p0, p1, v2}, Lezvcard/io/html/HCardElement;->visitForValue(Lorg/jsoup/nodes/Element;Ljava/lang/StringBuilder;)V

    .line 218
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 202
    :cond_2
    invoke-virtual {v4}, Lorg/jsoup/select/Elements;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/jsoup/nodes/Element;

    .line 203
    .local v3, "valueElement":Lorg/jsoup/nodes/Element;
    invoke-static {v3, v4}, Lezvcard/util/HtmlUtils;->isChildOf(Lorg/jsoup/nodes/Element;Lorg/jsoup/select/Elements;)Z

    move-result v5

    if-nez v5, :cond_3

    .line 208
    const-string v5, "abbr"

    invoke-virtual {v3}, Lorg/jsoup/nodes/Element;->tagName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 209
    const-string v5, "title"

    invoke-virtual {v3, v5}, Lorg/jsoup/nodes/Element;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 210
    .restart local v1    # "title":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_4

    .line 211
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 215
    .end local v1    # "title":Ljava/lang/String;
    :cond_4
    invoke-direct {p0, v3, v2}, Lezvcard/io/html/HCardElement;->visitForValue(Lorg/jsoup/nodes/Element;Ljava/lang/StringBuilder;)V

    goto :goto_1
.end method

.method private visitForValue(Lorg/jsoup/nodes/Element;Ljava/lang/StringBuilder;)V
    .locals 6
    .param p1, "element"    # Lorg/jsoup/nodes/Element;
    .param p2, "value"    # Ljava/lang/StringBuilder;

    .prologue
    .line 222
    invoke-virtual {p1}, Lorg/jsoup/nodes/Element;->childNodes()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/jsoup/nodes/Node;

    .line 223
    .local v2, "node":Lorg/jsoup/nodes/Node;
    instance-of v4, v2, Lorg/jsoup/nodes/Element;

    if-eqz v4, :cond_2

    move-object v0, v2

    .line 224
    check-cast v0, Lorg/jsoup/nodes/Element;

    .line 225
    .local v0, "e":Lorg/jsoup/nodes/Element;
    invoke-virtual {v0}, Lorg/jsoup/nodes/Element;->classNames()Ljava/util/Set;

    move-result-object v4

    const-string v5, "type"

    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 226
    const-string v4, "br"

    invoke-virtual {v0}, Lorg/jsoup/nodes/Element;->tagName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 228
    sget-object v4, Lezvcard/util/StringUtils;->NEWLINE:Ljava/lang/String;

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 229
    :cond_1
    const-string v4, "del"

    invoke-virtual {v0}, Lorg/jsoup/nodes/Element;->tagName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 232
    invoke-direct {p0, v0, p2}, Lezvcard/io/html/HCardElement;->visitForValue(Lorg/jsoup/nodes/Element;Ljava/lang/StringBuilder;)V

    goto :goto_0

    .line 235
    .end local v0    # "e":Lorg/jsoup/nodes/Element;
    :cond_2
    instance-of v4, v2, Lorg/jsoup/nodes/TextNode;

    if-eqz v4, :cond_0

    move-object v3, v2

    .line 236
    check-cast v3, Lorg/jsoup/nodes/TextNode;

    .line 237
    .local v3, "t":Lorg/jsoup/nodes/TextNode;
    invoke-virtual {v3}, Lorg/jsoup/nodes/TextNode;->text()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 240
    .end local v2    # "node":Lorg/jsoup/nodes/Node;
    .end local v3    # "t":Lorg/jsoup/nodes/TextNode;
    :cond_3
    return-void
.end method


# virtual methods
.method public absUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 83
    iget-object v1, p0, Lezvcard/io/html/HCardElement;->element:Lorg/jsoup/nodes/Element;

    invoke-virtual {v1, p1}, Lorg/jsoup/nodes/Element;->absUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 84
    .local v0, "url":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    .line 85
    iget-object v1, p0, Lezvcard/io/html/HCardElement;->element:Lorg/jsoup/nodes/Element;

    invoke-virtual {v1, p1}, Lorg/jsoup/nodes/Element;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 87
    :cond_0
    return-object v0
.end method

.method public allValues(Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .param p1, "cssClass"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 136
    iget-object v4, p0, Lezvcard/io/html/HCardElement;->element:Lorg/jsoup/nodes/Element;

    invoke-virtual {v4, p1}, Lorg/jsoup/nodes/Element;->getElementsByClass(Ljava/lang/String;)Lorg/jsoup/select/Elements;

    move-result-object v1

    .line 137
    .local v1, "elements":Lorg/jsoup/select/Elements;
    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual {v1}, Lorg/jsoup/select/Elements;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 138
    .local v3, "values":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {v1}, Lorg/jsoup/select/Elements;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jsoup/nodes/Element;

    .line 139
    .local v0, "e":Lorg/jsoup/nodes/Element;
    invoke-direct {p0, v0}, Lezvcard/io/html/HCardElement;->value(Lorg/jsoup/nodes/Element;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 141
    .end local v0    # "e":Lorg/jsoup/nodes/Element;
    :cond_0
    return-object v3
.end method

.method public append(Ljava/lang/String;)V
    .locals 5
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    const/4 v4, 0x0

    .line 164
    const-string v3, "\\r\\n|\\n|\\r"

    invoke-virtual {p1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 165
    .local v2, "split":[Ljava/lang/String;
    aget-object v3, v2, v4

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_0

    .line 166
    iget-object v3, p0, Lezvcard/io/html/HCardElement;->element:Lorg/jsoup/nodes/Element;

    aget-object v4, v2, v4

    invoke-virtual {v3, v4}, Lorg/jsoup/nodes/Element;->appendText(Ljava/lang/String;)Lorg/jsoup/nodes/Element;

    .line 168
    :cond_0
    const/4 v0, 0x1

    .local v0, "i":I
    :goto_0
    array-length v3, v2

    if-ge v0, v3, :cond_2

    .line 169
    aget-object v1, v2, v0

    .line 170
    .local v1, "s":Ljava/lang/String;
    iget-object v3, p0, Lezvcard/io/html/HCardElement;->element:Lorg/jsoup/nodes/Element;

    const-string v4, "br"

    invoke-virtual {v3, v4}, Lorg/jsoup/nodes/Element;->appendElement(Ljava/lang/String;)Lorg/jsoup/nodes/Element;

    .line 171
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_1

    .line 172
    iget-object v3, p0, Lezvcard/io/html/HCardElement;->element:Lorg/jsoup/nodes/Element;

    invoke-virtual {v3, v1}, Lorg/jsoup/nodes/Element;->appendText(Ljava/lang/String;)Lorg/jsoup/nodes/Element;

    .line 168
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 175
    .end local v1    # "s":Ljava/lang/String;
    :cond_2
    return-void
.end method

.method public attr(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 74
    iget-object v0, p0, Lezvcard/io/html/HCardElement;->element:Lorg/jsoup/nodes/Element;

    invoke-virtual {v0, p1}, Lorg/jsoup/nodes/Element;->attr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public classNames()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 95
    iget-object v0, p0, Lezvcard/io/html/HCardElement;->element:Lorg/jsoup/nodes/Element;

    invoke-virtual {v0}, Lorg/jsoup/nodes/Element;->classNames()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public firstValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "cssClass"    # Ljava/lang/String;

    .prologue
    .line 125
    iget-object v1, p0, Lezvcard/io/html/HCardElement;->element:Lorg/jsoup/nodes/Element;

    invoke-virtual {v1, p1}, Lorg/jsoup/nodes/Element;->getElementsByClass(Ljava/lang/String;)Lorg/jsoup/select/Elements;

    move-result-object v0

    .line 126
    .local v0, "elements":Lorg/jsoup/select/Elements;
    invoke-virtual {v0}, Lorg/jsoup/select/Elements;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    :goto_0
    return-object v1

    :cond_0
    invoke-virtual {v0}, Lorg/jsoup/select/Elements;->first()Lorg/jsoup/nodes/Element;

    move-result-object v1

    invoke-direct {p0, v1}, Lezvcard/io/html/HCardElement;->value(Lorg/jsoup/nodes/Element;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method public getElement()Lorg/jsoup/nodes/Element;
    .locals 1

    .prologue
    .line 182
    iget-object v0, p0, Lezvcard/io/html/HCardElement;->element:Lorg/jsoup/nodes/Element;

    return-object v0
.end method

.method public tagName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lezvcard/io/html/HCardElement;->element:Lorg/jsoup/nodes/Element;

    invoke-virtual {v0}, Lorg/jsoup/nodes/Element;->tagName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public types()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 149
    const-string v3, "type"

    invoke-virtual {p0, v3}, Lezvcard/io/html/HCardElement;->allValues(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 150
    .local v2, "types":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_0

    .line 151
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 152
    .local v1, "type":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v0, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 150
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 154
    .end local v1    # "type":Ljava/lang/String;
    :cond_0
    return-object v2
.end method

.method public value()Ljava/lang/String;
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lezvcard/io/html/HCardElement;->element:Lorg/jsoup/nodes/Element;

    invoke-direct {p0, v0}, Lezvcard/io/html/HCardElement;->value(Lorg/jsoup/nodes/Element;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
