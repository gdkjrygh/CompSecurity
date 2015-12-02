.class public Landroid_src/mms/a/b/e;
.super Landroid_src/mms/a/b;
.source "SmilDocumentImpl.java"

# interfaces
.implements Lorg/a/a/b/f;


# instance fields
.field b:Lorg/a/a/b/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Landroid_src/mms/a/b;-><init>()V

    .line 52
    return-void
.end method


# virtual methods
.method public a()Lorg/a/a/b/g;
    .locals 2

    .prologue
    .line 183
    invoke-virtual {p0}, Landroid_src/mms/a/b/e;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v0

    .line 184
    if-eqz v0, :cond_0

    instance-of v1, v0, Lorg/a/a/b/g;

    if-nez v1, :cond_1

    .line 186
    :cond_0
    const-string v0, "smil"

    invoke-virtual {p0, v0}, Landroid_src/mms/a/b/e;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v0

    .line 187
    invoke-virtual {p0, v0}, Landroid_src/mms/a/b/e;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 190
    :cond_1
    check-cast v0, Lorg/a/a/b/g;

    return-object v0
.end method

.method public a(F)V
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Landroid_src/mms/a/b/e;->b:Lorg/a/a/b/c;

    invoke-interface {v0, p1}, Lorg/a/a/b/c;->a(F)V

    .line 124
    return-void
.end method

.method public b()Lorg/a/a/b/g;
    .locals 3

    .prologue
    .line 198
    invoke-virtual {p0}, Landroid_src/mms/a/b/e;->a()Lorg/a/a/b/g;

    move-result-object v1

    .line 199
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v0

    .line 200
    if-eqz v0, :cond_0

    instance-of v2, v0, Lorg/a/a/b/g;

    if-nez v2, :cond_1

    .line 202
    :cond_0
    const-string v0, "head"

    invoke-virtual {p0, v0}, Landroid_src/mms/a/b/e;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v0

    .line 203
    invoke-interface {v1, v0}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 206
    :cond_1
    check-cast v0, Lorg/a/a/b/g;

    return-object v0
.end method

.method public c()Lorg/a/a/b/g;
    .locals 3

    .prologue
    .line 210
    invoke-virtual {p0}, Landroid_src/mms/a/b/e;->a()Lorg/a/a/b/g;

    move-result-object v0

    .line 211
    invoke-virtual {p0}, Landroid_src/mms/a/b/e;->b()Lorg/a/a/b/g;

    move-result-object v1

    .line 212
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNextSibling()Lorg/w3c/dom/Node;

    move-result-object v1

    .line 213
    if-eqz v1, :cond_0

    instance-of v2, v1, Lorg/a/a/b/g;

    if-nez v2, :cond_1

    .line 215
    :cond_0
    const-string v1, "body"

    invoke-virtual {p0, v1}, Landroid_src/mms/a/b/e;->createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;

    move-result-object v1

    .line 216
    invoke-interface {v0, v1}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 220
    :cond_1
    new-instance v2, Landroid_src/mms/a/b/f;

    move-object v0, v1

    check-cast v0, Lorg/a/a/b/g;

    invoke-direct {v2, p0, v0}, Landroid_src/mms/a/b/f;-><init>(Landroid_src/mms/a/b/e;Lorg/a/a/b/g;)V

    iput-object v2, p0, Landroid_src/mms/a/b/e;->b:Lorg/a/a/b/c;

    .line 259
    check-cast v1, Lorg/a/a/b/g;

    return-object v1
.end method

.method public createElement(Ljava/lang/String;)Lorg/w3c/dom/Element;
    .locals 2

    .prologue
    .line 157
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    .line 158
    const-string v0, "text"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "img"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "video"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 161
    :cond_0
    new-instance v0, Landroid_src/mms/a/b/o;

    invoke-direct {v0, p0, v1}, Landroid_src/mms/a/b/o;-><init>(Landroid_src/mms/a/b/e;Ljava/lang/String;)V

    .line 177
    :goto_0
    return-object v0

    .line 162
    :cond_1
    const-string v0, "audio"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 163
    new-instance v0, Landroid_src/mms/a/b/i;

    invoke-direct {v0, p0, v1}, Landroid_src/mms/a/b/i;-><init>(Landroid_src/mms/a/b/e;Ljava/lang/String;)V

    goto :goto_0

    .line 164
    :cond_2
    const-string v0, "layout"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 165
    new-instance v0, Landroid_src/mms/a/b/h;

    invoke-direct {v0, p0, v1}, Landroid_src/mms/a/b/h;-><init>(Landroid_src/mms/a/b/e;Ljava/lang/String;)V

    goto :goto_0

    .line 166
    :cond_3
    const-string v0, "root-layout"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 167
    new-instance v0, Landroid_src/mms/a/b/p;

    invoke-direct {v0, p0, v1}, Landroid_src/mms/a/b/p;-><init>(Landroid_src/mms/a/b/e;Ljava/lang/String;)V

    goto :goto_0

    .line 168
    :cond_4
    const-string v0, "region"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 169
    new-instance v0, Landroid_src/mms/a/b/n;

    invoke-direct {v0, p0, v1}, Landroid_src/mms/a/b/n;-><init>(Landroid_src/mms/a/b/e;Ljava/lang/String;)V

    goto :goto_0

    .line 170
    :cond_5
    const-string v0, "ref"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 171
    new-instance v0, Landroid_src/mms/a/b/m;

    invoke-direct {v0, p0, v1}, Landroid_src/mms/a/b/m;-><init>(Landroid_src/mms/a/b/e;Ljava/lang/String;)V

    goto :goto_0

    .line 172
    :cond_6
    const-string v0, "par"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 173
    new-instance v0, Landroid_src/mms/a/b/k;

    invoke-direct {v0, p0, v1}, Landroid_src/mms/a/b/k;-><init>(Landroid_src/mms/a/b/e;Ljava/lang/String;)V

    goto :goto_0

    .line 177
    :cond_7
    new-instance v0, Landroid_src/mms/a/b/g;

    invoke-direct {v0, p0, v1}, Landroid_src/mms/a/b/g;-><init>(Landroid_src/mms/a/b/e;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public d()Lorg/a/a/b/h;
    .locals 3

    .prologue
    .line 263
    invoke-virtual {p0}, Landroid_src/mms/a/b/e;->b()Lorg/a/a/b/g;

    move-result-object v1

    .line 267
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v0

    .line 268
    :goto_0
    if-eqz v0, :cond_0

    instance-of v2, v0, Lorg/a/a/b/h;

    if-nez v2, :cond_0

    .line 269
    invoke-interface {v0}, Lorg/w3c/dom/Node;->getNextSibling()Lorg/w3c/dom/Node;

    move-result-object v0

    goto :goto_0

    .line 272
    :cond_0
    if-nez v0, :cond_1

    .line 274
    new-instance v0, Landroid_src/mms/a/b/h;

    const-string v2, "layout"

    invoke-direct {v0, p0, v2}, Landroid_src/mms/a/b/h;-><init>(Landroid_src/mms/a/b/e;Ljava/lang/String;)V

    .line 275
    invoke-interface {v1, v0}, Lorg/w3c/dom/Node;->appendChild(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;

    .line 277
    :cond_1
    check-cast v0, Lorg/a/a/b/h;

    return-object v0
.end method

.method public synthetic getDocumentElement()Lorg/w3c/dom/Element;
    .locals 1

    .prologue
    .line 36
    invoke-virtual {p0}, Landroid_src/mms/a/b/e;->a()Lorg/a/a/b/g;

    move-result-object v0

    return-object v0
.end method
