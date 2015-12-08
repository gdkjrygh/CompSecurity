.class public Lezvcard/io/scribe/VCardPropertyScribe$Splitter;
.super Ljava/lang/Object;
.source "VCardPropertyScribe.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/io/scribe/VCardPropertyScribe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "Splitter"
.end annotation


# instance fields
.field private delimiter:Ljava/lang/String;

.field private limit:I

.field private removeEmpties:Z

.field private string:Ljava/lang/String;

.field private unescape:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "string"    # Ljava/lang/String;
    .param p2, "delimiter"    # Ljava/lang/String;

    .prologue
    const/4 v0, 0x0

    .line 694
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 685
    iput-boolean v0, p0, Lezvcard/io/scribe/VCardPropertyScribe$Splitter;->removeEmpties:Z

    .line 686
    iput-boolean v0, p0, Lezvcard/io/scribe/VCardPropertyScribe$Splitter;->unescape:Z

    .line 687
    const/4 v0, -0x1

    iput v0, p0, Lezvcard/io/scribe/VCardPropertyScribe$Splitter;->limit:I

    .line 695
    iput-object p1, p0, Lezvcard/io/scribe/VCardPropertyScribe$Splitter;->string:Ljava/lang/String;

    .line 696
    iput-object p2, p0, Lezvcard/io/scribe/VCardPropertyScribe$Splitter;->delimiter:Ljava/lang/String;

    .line 697
    return-void
.end method


# virtual methods
.method public limit(I)Lezvcard/io/scribe/VCardPropertyScribe$Splitter;
    .locals 0
    .param p1, "limit"    # I

    .prologue
    .line 726
    iput p1, p0, Lezvcard/io/scribe/VCardPropertyScribe$Splitter;->limit:I

    .line 727
    return-object p0
.end method

.method public removeEmpties(Z)Lezvcard/io/scribe/VCardPropertyScribe$Splitter;
    .locals 0
    .param p1, "removeEmpties"    # Z

    .prologue
    .line 706
    iput-boolean p1, p0, Lezvcard/io/scribe/VCardPropertyScribe$Splitter;->removeEmpties:Z

    .line 707
    return-object p0
.end method

.method public split()Ljava/util/List;
    .locals 9
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
    .line 736
    iget-object v6, p0, Lezvcard/io/scribe/VCardPropertyScribe$Splitter;->string:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "\\s*(?<!\\\\)"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v8, p0, Lezvcard/io/scribe/VCardPropertyScribe$Splitter;->delimiter:Ljava/lang/String;

    invoke-static {v8}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "\\s*"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    iget v8, p0, Lezvcard/io/scribe/VCardPropertyScribe$Splitter;->limit:I

    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v5

    .line 738
    .local v5, "split":[Ljava/lang/String;
    new-instance v3, Ljava/util/ArrayList;

    array-length v6, v5

    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 739
    .local v3, "list":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    move-object v0, v5

    .local v0, "arr$":[Ljava/lang/String;
    array-length v2, v0

    .local v2, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_0
    if-ge v1, v2, :cond_2

    aget-object v4, v0, v1

    .line 740
    .local v4, "s":Ljava/lang/String;
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_0

    iget-boolean v6, p0, Lezvcard/io/scribe/VCardPropertyScribe$Splitter;->removeEmpties:Z

    if-eqz v6, :cond_0

    .line 739
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 744
    :cond_0
    iget-boolean v6, p0, Lezvcard/io/scribe/VCardPropertyScribe$Splitter;->unescape:Z

    if-eqz v6, :cond_1

    .line 745
    invoke-static {v4}, Lezvcard/io/scribe/VCardPropertyScribe;->unescape(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 748
    :cond_1
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 750
    .end local v4    # "s":Ljava/lang/String;
    :cond_2
    return-object v3
.end method

.method public unescape(Z)Lezvcard/io/scribe/VCardPropertyScribe$Splitter;
    .locals 0
    .param p1, "unescape"    # Z

    .prologue
    .line 716
    iput-boolean p1, p0, Lezvcard/io/scribe/VCardPropertyScribe$Splitter;->unescape:Z

    .line 717
    return-object p0
.end method
