.class public Lezvcard/io/xml/XCardNamespaceContext;
.super Ljava/lang/Object;
.source "XCardNamespaceContext.java"

# interfaces
.implements Ljavax/xml/namespace/NamespaceContext;


# instance fields
.field private final ns:Ljava/lang/String;

.field private final prefix:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lezvcard/VCardVersion;Ljava/lang/String;)V
    .locals 1
    .param p1, "version"    # Lezvcard/VCardVersion;
    .param p2, "prefix"    # Ljava/lang/String;

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    invoke-virtual {p1}, Lezvcard/VCardVersion;->getXmlNamespace()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lezvcard/io/xml/XCardNamespaceContext;->ns:Ljava/lang/String;

    .line 26
    iput-object p2, p0, Lezvcard/io/xml/XCardNamespaceContext;->prefix:Ljava/lang/String;

    .line 27
    return-void
.end method


# virtual methods
.method public getNamespaceURI(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "prefix"    # Ljava/lang/String;

    .prologue
    .line 39
    iget-object v0, p0, Lezvcard/io/xml/XCardNamespaceContext;->prefix:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 40
    iget-object v0, p0, Lezvcard/io/xml/XCardNamespaceContext;->ns:Ljava/lang/String;

    .line 42
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getPrefix()Ljava/lang/String;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lezvcard/io/xml/XCardNamespaceContext;->prefix:Ljava/lang/String;

    return-object v0
.end method

.method public getPrefix(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "ns"    # Ljava/lang/String;

    .prologue
    .line 47
    iget-object v0, p0, Lezvcard/io/xml/XCardNamespaceContext;->ns:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 48
    iget-object v0, p0, Lezvcard/io/xml/XCardNamespaceContext;->prefix:Ljava/lang/String;

    .line 50
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getPrefixes(Ljava/lang/String;)Ljava/util/Iterator;
    .locals 3
    .param p1, "ns"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Iterator",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 55
    iget-object v0, p0, Lezvcard/io/xml/XCardNamespaceContext;->ns:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    iget-object v2, p0, Lezvcard/io/xml/XCardNamespaceContext;->prefix:Ljava/lang/String;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 58
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
