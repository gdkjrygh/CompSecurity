.class public Lezvcard/util/StringUtils;
.super Ljava/lang/Object;
.source "StringUtils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lezvcard/util/StringUtils$JoinMapCallback;,
        Lezvcard/util/StringUtils$JoinCallback;
    }
.end annotation


# static fields
.field public static final NEWLINE:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 43
    const-string v0, "line.separator"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lezvcard/util/StringUtils;->NEWLINE:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 173
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 175
    return-void
.end method

.method public static join(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "delimiter"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection",
            "<TT;>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 86
    .local p0, "collection":Ljava/util/Collection;, "Ljava/util/Collection<TT;>;"
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .local v0, "sb":Ljava/lang/StringBuilder;
    invoke-static {p0, p1, v0}, Lezvcard/util/StringUtils;->join(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 88
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public static join(Ljava/util/Collection;Ljava/lang/String;Lezvcard/util/StringUtils$JoinCallback;)Ljava/lang/String;
    .locals 2
    .param p1, "delimiter"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection",
            "<TT;>;",
            "Ljava/lang/String;",
            "Lezvcard/util/StringUtils$JoinCallback",
            "<TT;>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 113
    .local p0, "collection":Ljava/util/Collection;, "Ljava/util/Collection<TT;>;"
    .local p2, "join":Lezvcard/util/StringUtils$JoinCallback;, "Lezvcard/util/StringUtils$JoinCallback<TT;>;"
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .local v0, "sb":Ljava/lang/StringBuilder;
    invoke-static {p0, p1, v0, p2}, Lezvcard/util/StringUtils;->join(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/StringBuilder;Lezvcard/util/StringUtils$JoinCallback;)V

    .line 115
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public static join(Ljava/util/Map;Ljava/lang/String;Lezvcard/util/StringUtils$JoinMapCallback;)Ljava/lang/String;
    .locals 2
    .param p1, "delimiter"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map",
            "<TK;TV;>;",
            "Ljava/lang/String;",
            "Lezvcard/util/StringUtils$JoinMapCallback",
            "<TK;TV;>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 145
    .local p0, "map":Ljava/util/Map;, "Ljava/util/Map<TK;TV;>;"
    .local p2, "join":Lezvcard/util/StringUtils$JoinMapCallback;, "Lezvcard/util/StringUtils$JoinMapCallback<TK;TV;>;"
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Lezvcard/util/StringUtils$2;

    invoke-direct {v1, p2}, Lezvcard/util/StringUtils$2;-><init>(Lezvcard/util/StringUtils$JoinMapCallback;)V

    invoke-static {v0, p1, v1}, Lezvcard/util/StringUtils;->join(Ljava/util/Collection;Ljava/lang/String;Lezvcard/util/StringUtils$JoinCallback;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static join(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 1
    .param p1, "delimiter"    # Ljava/lang/String;
    .param p2, "sb"    # Ljava/lang/StringBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection",
            "<TT;>;",
            "Ljava/lang/String;",
            "Ljava/lang/StringBuilder;",
            ")V"
        }
    .end annotation

    .prologue
    .line 98
    .local p0, "collection":Ljava/util/Collection;, "Ljava/util/Collection<TT;>;"
    new-instance v0, Lezvcard/util/StringUtils$1;

    invoke-direct {v0}, Lezvcard/util/StringUtils$1;-><init>()V

    invoke-static {p0, p1, p2, v0}, Lezvcard/util/StringUtils;->join(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/StringBuilder;Lezvcard/util/StringUtils$JoinCallback;)V

    .line 103
    return-void
.end method

.method public static join(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/StringBuilder;Lezvcard/util/StringUtils$JoinCallback;)V
    .locals 4
    .param p1, "delimiter"    # Ljava/lang/String;
    .param p2, "sb"    # Ljava/lang/StringBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection",
            "<TT;>;",
            "Ljava/lang/String;",
            "Ljava/lang/StringBuilder;",
            "Lezvcard/util/StringUtils$JoinCallback",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 126
    .local p0, "collection":Ljava/util/Collection;, "Ljava/util/Collection<TT;>;"
    .local p3, "join":Lezvcard/util/StringUtils$JoinCallback;, "Lezvcard/util/StringUtils$JoinCallback<TT;>;"
    const/4 v1, 0x1

    .line 127
    .local v1, "first":Z
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 128
    .local v0, "element":Ljava/lang/Object;, "TT;"
    if-eqz v1, :cond_0

    .line 129
    const/4 v1, 0x0

    .line 133
    :goto_1
    invoke-interface {p3, p2, v0}, Lezvcard/util/StringUtils$JoinCallback;->handle(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    goto :goto_0

    .line 131
    :cond_0
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 135
    .end local v0    # "element":Ljava/lang/Object;, "TT;"
    :cond_1
    return-void
.end method

.method public static ltrim(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "string"    # Ljava/lang/String;

    .prologue
    .line 51
    if-nez p0, :cond_0

    .line 52
    const/4 v1, 0x0

    .line 59
    :goto_0
    return-object v1

    .line 56
    :cond_0
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v1

    if-eqz v1, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 59
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v0, v1, :cond_2

    const-string v1, ""

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method public static rtrim(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "string"    # Ljava/lang/String;

    .prologue
    .line 68
    if-nez p0, :cond_0

    .line 69
    const/4 v1, 0x0

    .line 76
    :goto_0
    return-object v1

    .line 73
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v0, v1, -0x1

    .local v0, "i":I
    :goto_1
    if-ltz v0, :cond_1

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v1

    if-eqz v1, :cond_1

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    .line 76
    :cond_1
    if-nez v0, :cond_2

    const-string v1, ""

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    add-int/lit8 v2, v0, 0x1

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method
