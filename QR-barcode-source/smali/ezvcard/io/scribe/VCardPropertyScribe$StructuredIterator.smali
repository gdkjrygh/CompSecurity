.class public Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;
.super Ljava/lang/Object;
.source "VCardPropertyScribe.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/io/scribe/VCardPropertyScribe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "StructuredIterator"
.end annotation


# instance fields
.field private final it:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Iterator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 880
    .local p1, "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/util/List<Ljava/lang/String;>;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 881
    iput-object p1, p0, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->it:Ljava/util/Iterator;

    .line 882
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .prologue
    .line 922
    iget-object v0, p0, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->it:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public nextComponent()Ljava/util/List;
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
    const/4 v3, 0x0

    .line 909
    invoke-virtual {p0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    .line 910
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 918
    :cond_0
    :goto_0
    return-object v0

    .line 913
    :cond_1
    iget-object v1, p0, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->it:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 914
    .local v0, "list":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    .line 915
    new-instance v0, Ljava/util/ArrayList;

    .end local v0    # "list":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    goto :goto_0
.end method

.method public nextString()Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 890
    invoke-virtual {p0}, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    .line 900
    :cond_0
    :goto_0
    return-object v2

    .line 894
    :cond_1
    iget-object v3, p0, Lezvcard/io/scribe/VCardPropertyScribe$StructuredIterator;->it:Ljava/util/Iterator;

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 895
    .local v0, "list":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    .line 899
    const/4 v3, 0x0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 900
    .local v1, "value":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_2

    move-object v1, v2

    .end local v1    # "value":Ljava/lang/String;
    :cond_2
    move-object v2, v1

    goto :goto_0
.end method
