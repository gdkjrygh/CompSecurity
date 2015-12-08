.class Lezvcard/util/PartialDate$Format;
.super Ljava/lang/Object;
.source "PartialDate.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/util/PartialDate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Format"
.end annotation


# instance fields
.field private componentIndexes:[I

.field private regex:Ljava/util/regex/Pattern;


# direct methods
.method public varargs constructor <init>(Ljava/lang/String;[I)V
    .locals 2
    .param p1, "regex"    # Ljava/lang/String;
    .param p2, "componentIndexes"    # [I

    .prologue
    .line 539
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 540
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "^"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "$"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lezvcard/util/PartialDate$Format;->regex:Ljava/util/regex/Pattern;

    .line 541
    iput-object p2, p0, Lezvcard/util/PartialDate$Format;->componentIndexes:[I

    .line 542
    return-void
.end method


# virtual methods
.method public parse(Lezvcard/util/PartialDate;Ljava/lang/String;)Z
    .locals 8
    .param p1, "partialDate"    # Lezvcard/util/PartialDate;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    const/4 v5, 0x1

    .line 551
    iget-object v6, p0, Lezvcard/util/PartialDate$Format;->regex:Ljava/util/regex/Pattern;

    invoke-virtual {v6, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    .line 552
    .local v4, "m":Ljava/util/regex/Matcher;
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 553
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    iget-object v6, p0, Lezvcard/util/PartialDate$Format;->componentIndexes:[I

    array-length v6, v6

    if-ge v2, v6, :cond_4

    .line 554
    iget-object v6, p0, Lezvcard/util/PartialDate$Format;->componentIndexes:[I

    aget v3, v6, v2

    .line 555
    .local v3, "index":I
    const/4 v6, -0x1

    if-ne v3, v6, :cond_1

    .line 553
    :cond_0
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 559
    :cond_1
    add-int/lit8 v0, v2, 0x1

    .line 560
    .local v0, "group":I
    invoke-virtual {v4, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    .line 561
    .local v1, "groupStr":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 562
    const-string v6, "+"

    invoke-virtual {v1, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 563
    invoke-virtual {v1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 565
    :cond_2
    iget-object v6, p1, Lezvcard/util/PartialDate;->components:[Ljava/lang/Integer;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v3

    goto :goto_1

    .line 570
    .end local v0    # "group":I
    .end local v1    # "groupStr":Ljava/lang/String;
    .end local v2    # "i":I
    .end local v3    # "index":I
    :cond_3
    const/4 v5, 0x0

    :cond_4
    return v5
.end method
