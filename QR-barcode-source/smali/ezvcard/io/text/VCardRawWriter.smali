.class public Lezvcard/io/text/VCardRawWriter;
.super Ljava/lang/Object;
.source "VCardRawWriter.java"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lezvcard/io/text/VCardRawWriter$1;,
        Lezvcard/io/text/VCardRawWriter$ProblemsListener;
    }
.end annotation


# static fields
.field private static final invalidParamValueChars:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lezvcard/VCardVersion;",
            "Ljava/util/BitSet;",
            ">;"
        }
    .end annotation
.end field

.field private static final newlineRegex:Ljava/util/regex/Pattern;

.field private static final propertyNameRegex:Ljava/util/regex/Pattern;

.field private static final quoteMeRegex:Ljava/util/regex/Pattern;


# instance fields
.field private caretEncodingEnabled:Z

.field private final foldingScheme:Lezvcard/io/text/FoldingScheme;

.field private final newline:Ljava/lang/String;

.field private problemsListener:Lezvcard/io/text/VCardRawWriter$ProblemsListener;

.field private version:Lezvcard/VCardVersion;

.field private final writer:Lezvcard/io/text/FoldedLineWriter;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/16 v4, 0x80

    const/4 v3, 0x0

    .line 55
    const-string v2, ".*?[,:;].*"

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    sput-object v2, Lezvcard/io/text/VCardRawWriter;->quoteMeRegex:Ljava/util/regex/Pattern;

    .line 60
    const-string v2, "\\r\\n|\\r|\\n"

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    sput-object v2, Lezvcard/io/text/VCardRawWriter;->newlineRegex:Ljava/util/regex/Pattern;

    .line 66
    const-string v2, "(?i)[-a-z0-9]+"

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    sput-object v2, Lezvcard/io/text/VCardRawWriter;->propertyNameRegex:Ljava/util/regex/Pattern;

    .line 72
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    sput-object v2, Lezvcard/io/text/VCardRawWriter;->invalidParamValueChars:Ljava/util/Map;

    .line 74
    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1, v4}, Ljava/util/BitSet;-><init>(I)V

    .line 75
    .local v1, "controlChars":Ljava/util/BitSet;
    const/16 v2, 0x1f

    invoke-virtual {v1, v3, v2}, Ljava/util/BitSet;->set(II)V

    .line 76
    const/16 v2, 0x7f

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 77
    const/16 v2, 0x9

    invoke-virtual {v1, v2, v3}, Ljava/util/BitSet;->set(IZ)V

    .line 78
    const/16 v2, 0xa

    invoke-virtual {v1, v2, v3}, Ljava/util/BitSet;->set(IZ)V

    .line 79
    const/16 v2, 0xd

    invoke-virtual {v1, v2, v3}, Ljava/util/BitSet;->set(IZ)V

    .line 83
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0, v4}, Ljava/util/BitSet;-><init>(I)V

    .line 84
    .local v0, "bitSet":Ljava/util/BitSet;
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 86
    const/16 v2, 0x2c

    invoke-virtual {v0, v2}, Ljava/util/BitSet;->set(I)V

    .line 87
    const/16 v2, 0x2e

    invoke-virtual {v0, v2}, Ljava/util/BitSet;->set(I)V

    .line 88
    const/16 v2, 0x3a

    invoke-virtual {v0, v2}, Ljava/util/BitSet;->set(I)V

    .line 89
    const/16 v2, 0x3d

    invoke-virtual {v0, v2}, Ljava/util/BitSet;->set(I)V

    .line 90
    const/16 v2, 0x5b

    invoke-virtual {v0, v2}, Ljava/util/BitSet;->set(I)V

    .line 91
    const/16 v2, 0x5d

    invoke-virtual {v0, v2}, Ljava/util/BitSet;->set(I)V

    .line 93
    sget-object v2, Lezvcard/io/text/VCardRawWriter;->invalidParamValueChars:Ljava/util/Map;

    sget-object v3, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    new-instance v0, Ljava/util/BitSet;

    .end local v0    # "bitSet":Ljava/util/BitSet;
    invoke-direct {v0, v4}, Ljava/util/BitSet;-><init>(I)V

    .line 99
    .restart local v0    # "bitSet":Ljava/util/BitSet;
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 101
    sget-object v2, Lezvcard/io/text/VCardRawWriter;->invalidParamValueChars:Ljava/util/Map;

    sget-object v3, Lezvcard/VCardVersion;->V3_0:Lezvcard/VCardVersion;

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    sget-object v2, Lezvcard/io/text/VCardRawWriter;->invalidParamValueChars:Ljava/util/Map;

    sget-object v3, Lezvcard/VCardVersion;->V4_0:Lezvcard/VCardVersion;

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;Lezvcard/VCardVersion;)V
    .locals 1
    .param p1, "writer"    # Ljava/io/Writer;
    .param p2, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 120
    sget-object v0, Lezvcard/io/text/FoldingScheme;->MIME_DIR:Lezvcard/io/text/FoldingScheme;

    invoke-direct {p0, p1, p2, v0}, Lezvcard/io/text/VCardRawWriter;-><init>(Ljava/io/Writer;Lezvcard/VCardVersion;Lezvcard/io/text/FoldingScheme;)V

    .line 121
    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;Lezvcard/VCardVersion;Lezvcard/io/text/FoldingScheme;)V
    .locals 1
    .param p1, "writer"    # Ljava/io/Writer;
    .param p2, "version"    # Lezvcard/VCardVersion;
    .param p3, "foldingScheme"    # Lezvcard/io/text/FoldingScheme;

    .prologue
    .line 130
    const-string v0, "\r\n"

    invoke-direct {p0, p1, p2, p3, v0}, Lezvcard/io/text/VCardRawWriter;-><init>(Ljava/io/Writer;Lezvcard/VCardVersion;Lezvcard/io/text/FoldingScheme;Ljava/lang/String;)V

    .line 131
    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;Lezvcard/VCardVersion;Lezvcard/io/text/FoldingScheme;Ljava/lang/String;)V
    .locals 3
    .param p1, "writer"    # Ljava/io/Writer;
    .param p2, "version"    # Lezvcard/VCardVersion;
    .param p3, "foldingScheme"    # Lezvcard/io/text/FoldingScheme;
    .param p4, "newline"    # Ljava/lang/String;

    .prologue
    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    const/4 v0, 0x0

    iput-boolean v0, p0, Lezvcard/io/text/VCardRawWriter;->caretEncodingEnabled:Z

    .line 141
    if-nez p3, :cond_0

    .line 142
    new-instance v0, Lezvcard/io/text/FoldedLineWriter;

    const/4 v1, 0x0

    const-string v2, ""

    invoke-direct {v0, p1, v1, v2, p4}, Lezvcard/io/text/FoldedLineWriter;-><init>(Ljava/io/Writer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lezvcard/io/text/VCardRawWriter;->writer:Lezvcard/io/text/FoldedLineWriter;

    .line 146
    :goto_0
    iput-object p2, p0, Lezvcard/io/text/VCardRawWriter;->version:Lezvcard/VCardVersion;

    .line 147
    iput-object p3, p0, Lezvcard/io/text/VCardRawWriter;->foldingScheme:Lezvcard/io/text/FoldingScheme;

    .line 148
    iput-object p4, p0, Lezvcard/io/text/VCardRawWriter;->newline:Ljava/lang/String;

    .line 149
    return-void

    .line 144
    :cond_0
    new-instance v0, Lezvcard/io/text/FoldedLineWriter;

    invoke-virtual {p3}, Lezvcard/io/text/FoldingScheme;->getLineLength()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p3}, Lezvcard/io/text/FoldingScheme;->getIndent()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2, p4}, Lezvcard/io/text/FoldedLineWriter;-><init>(Ljava/io/Writer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lezvcard/io/text/VCardRawWriter;->writer:Lezvcard/io/text/FoldedLineWriter;

    goto :goto_0
.end method

.method private applyCaretEncoding(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 565
    const-string v0, "^"

    const-string v1, "^^"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 566
    sget-object v0, Lezvcard/io/text/VCardRawWriter;->newlineRegex:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v1, "^n"

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 567
    const-string v0, "\""

    const-string v1, "^\'"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 568
    return-object p1
.end method

.method private containsNewlines(Ljava/lang/String;)Z
    .locals 1
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    .line 602
    sget-object v0, Lezvcard/io/text/VCardRawWriter;->newlineRegex:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    return v0
.end method

.method private escapeNewlines(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    .line 585
    sget-object v0, Lezvcard/io/text/VCardRawWriter;->newlineRegex:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v1, "\\\\n"

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private removeInvalidParameterValueChars(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 546
    sget-object v4, Lezvcard/io/text/VCardRawWriter;->invalidParamValueChars:Ljava/util/Map;

    iget-object v5, p0, Lezvcard/io/text/VCardRawWriter;->version:Lezvcard/VCardVersion;

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/BitSet;

    .line 547
    .local v2, "invalidChars":Ljava/util/BitSet;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 549
    .local v3, "sb":Ljava/lang/StringBuilder;
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v1, v4, :cond_1

    .line 550
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 551
    .local v0, "ch":C
    invoke-virtual {v2, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v4

    if-nez v4, :cond_0

    .line 552
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 549
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 556
    .end local v0    # "ch":C
    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    if-ne v4, v5, :cond_2

    .end local p1    # "value":Ljava/lang/String;
    :goto_1
    return-object p1

    .restart local p1    # "value":Ljava/lang/String;
    :cond_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1
.end method

.method private sanitizeParameterValue(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .param p1, "parameterValue"    # Ljava/lang/String;
    .param p2, "parameterName"    # Ljava/lang/String;
    .param p3, "propertyName"    # Ljava/lang/String;

    .prologue
    const/16 v7, 0x27

    const/16 v6, 0x22

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 466
    const/4 v0, 0x0

    .line 467
    .local v0, "modifiedValue":Ljava/lang/String;
    const/4 v1, 0x0

    .line 471
    .local v1, "valueChanged":Z
    sget-object v4, Lezvcard/io/text/VCardRawWriter$1;->$SwitchMap$ezvcard$VCardVersion:[I

    iget-object v5, p0, Lezvcard/io/text/VCardRawWriter;->version:Lezvcard/VCardVersion;

    invoke-virtual {v5}, Lezvcard/VCardVersion;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_0

    .line 533
    :goto_0
    if-eqz v1, :cond_0

    iget-object v2, p0, Lezvcard/io/text/VCardRawWriter;->problemsListener:Lezvcard/io/text/VCardRawWriter$ProblemsListener;

    if-eqz v2, :cond_0

    .line 534
    iget-object v2, p0, Lezvcard/io/text/VCardRawWriter;->problemsListener:Lezvcard/io/text/VCardRawWriter$ProblemsListener;

    invoke-interface {v2, p3, p2, p1, v0}, Lezvcard/io/text/VCardRawWriter$ProblemsListener;->onParameterValueChanged(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 537
    :cond_0
    return-object v0

    .line 474
    :pswitch_0
    invoke-direct {p0, p1}, Lezvcard/io/text/VCardRawWriter;->removeInvalidParameterValueChars(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 477
    sget-object v4, Lezvcard/io/text/VCardRawWriter;->newlineRegex:Ljava/util/regex/Pattern;

    invoke-virtual {v4, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 480
    if-eq p1, v0, :cond_1

    move v1, v2

    .line 483
    :goto_1
    const-string v2, "\\"

    const-string v3, "\\\\"

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 486
    const-string v2, ";"

    const-string v3, "\\;"

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 488
    goto :goto_0

    :cond_1
    move v1, v3

    .line 480
    goto :goto_1

    .line 492
    :pswitch_1
    invoke-direct {p0, p1}, Lezvcard/io/text/VCardRawWriter;->removeInvalidParameterValueChars(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 494
    iget-boolean v4, p0, Lezvcard/io/text/VCardRawWriter;->caretEncodingEnabled:Z

    if-eqz v4, :cond_3

    .line 495
    if-eq v0, p1, :cond_2

    move v1, v2

    .line 498
    :goto_2
    invoke-direct {p0, v0}, Lezvcard/io/text/VCardRawWriter;->applyCaretEncoding(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    move v1, v3

    .line 495
    goto :goto_2

    .line 501
    :cond_3
    invoke-virtual {v0, v6, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    .line 504
    sget-object v4, Lezvcard/io/text/VCardRawWriter;->newlineRegex:Ljava/util/regex/Pattern;

    invoke-virtual {v4, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 506
    if-eq v0, p1, :cond_4

    move v1, v2

    .line 509
    :goto_3
    goto :goto_0

    :cond_4
    move v1, v3

    .line 506
    goto :goto_3

    .line 513
    :pswitch_2
    invoke-direct {p0, p1}, Lezvcard/io/text/VCardRawWriter;->removeInvalidParameterValueChars(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 515
    iget-boolean v4, p0, Lezvcard/io/text/VCardRawWriter;->caretEncodingEnabled:Z

    if-eqz v4, :cond_6

    .line 516
    if-eq v0, p1, :cond_5

    move v1, v2

    .line 519
    :goto_4
    invoke-direct {p0, v0}, Lezvcard/io/text/VCardRawWriter;->applyCaretEncoding(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_5
    move v1, v3

    .line 516
    goto :goto_4

    .line 522
    :cond_6
    invoke-virtual {v0, v6, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    .line 524
    if-eq v0, p1, :cond_7

    move v1, v2

    .line 527
    :goto_5
    sget-object v2, Lezvcard/io/text/VCardRawWriter;->newlineRegex:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    const-string v3, "\\\\\\n"

    invoke-virtual {v2, v3}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_7
    move v1, v3

    .line 524
    goto :goto_5

    .line 471
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private sanitizeValue(Lezvcard/parameter/VCardParameters;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "parameters"    # Lezvcard/parameter/VCardParameters;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 444
    if-nez p2, :cond_0

    .line 445
    const-string p2, ""

    .line 454
    .end local p2    # "value":Ljava/lang/String;
    :goto_0
    return-object p2

    .line 448
    .restart local p2    # "value":Ljava/lang/String;
    :cond_0
    iget-object v0, p0, Lezvcard/io/text/VCardRawWriter;->version:Lezvcard/VCardVersion;

    sget-object v1, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    if-ne v0, v1, :cond_1

    invoke-direct {p0, p2}, Lezvcard/io/text/VCardRawWriter;->containsNewlines(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 450
    sget-object v0, Lezvcard/parameter/Encoding;->QUOTED_PRINTABLE:Lezvcard/parameter/Encoding;

    invoke-virtual {p1, v0}, Lezvcard/parameter/VCardParameters;->setEncoding(Lezvcard/parameter/Encoding;)V

    goto :goto_0

    .line 454
    :cond_1
    invoke-direct {p0, p2}, Lezvcard/io/text/VCardRawWriter;->escapeNewlines(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 618
    iget-object v0, p0, Lezvcard/io/text/VCardRawWriter;->writer:Lezvcard/io/text/FoldedLineWriter;

    invoke-virtual {v0}, Lezvcard/io/text/FoldedLineWriter;->close()V

    .line 619
    return-void
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 610
    iget-object v0, p0, Lezvcard/io/text/VCardRawWriter;->writer:Lezvcard/io/text/FoldedLineWriter;

    invoke-virtual {v0}, Lezvcard/io/text/FoldedLineWriter;->flush()V

    .line 611
    return-void
.end method

.method public getFoldingScheme()Lezvcard/io/text/FoldingScheme;
    .locals 1

    .prologue
    .line 304
    iget-object v0, p0, Lezvcard/io/text/VCardRawWriter;->foldingScheme:Lezvcard/io/text/FoldingScheme;

    return-object v0
.end method

.method public getNewline()Ljava/lang/String;
    .locals 1

    .prologue
    .line 280
    iget-object v0, p0, Lezvcard/io/text/VCardRawWriter;->newline:Ljava/lang/String;

    return-object v0
.end method

.method public getProblemsListener()Lezvcard/io/text/VCardRawWriter$ProblemsListener;
    .locals 1

    .prologue
    .line 288
    iget-object v0, p0, Lezvcard/io/text/VCardRawWriter;->problemsListener:Lezvcard/io/text/VCardRawWriter$ProblemsListener;

    return-object v0
.end method

.method public getVersion()Lezvcard/VCardVersion;
    .locals 1

    .prologue
    .line 264
    iget-object v0, p0, Lezvcard/io/text/VCardRawWriter;->version:Lezvcard/VCardVersion;

    return-object v0
.end method

.method public isCaretEncodingEnabled()Z
    .locals 1

    .prologue
    .line 202
    iget-boolean v0, p0, Lezvcard/io/text/VCardRawWriter;->caretEncodingEnabled:Z

    return v0
.end method

.method public setCaretEncodingEnabled(Z)V
    .locals 0
    .param p1, "enable"    # Z

    .prologue
    .line 256
    iput-boolean p1, p0, Lezvcard/io/text/VCardRawWriter;->caretEncodingEnabled:Z

    .line 257
    return-void
.end method

.method public setProblemsListener(Lezvcard/io/text/VCardRawWriter$ProblemsListener;)V
    .locals 0
    .param p1, "problemsListener"    # Lezvcard/io/text/VCardRawWriter$ProblemsListener;

    .prologue
    .line 296
    iput-object p1, p0, Lezvcard/io/text/VCardRawWriter;->problemsListener:Lezvcard/io/text/VCardRawWriter$ProblemsListener;

    .line 297
    return-void
.end method

.method public setVersion(Lezvcard/VCardVersion;)V
    .locals 0
    .param p1, "version"    # Lezvcard/VCardVersion;

    .prologue
    .line 272
    iput-object p1, p0, Lezvcard/io/text/VCardRawWriter;->version:Lezvcard/VCardVersion;

    .line 273
    return-void
.end method

.method public writeBeginComponent(Ljava/lang/String;)V
    .locals 1
    .param p1, "componentName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 314
    const-string v0, "BEGIN"

    invoke-virtual {p0, v0, p1}, Lezvcard/io/text/VCardRawWriter;->writeProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    return-void
.end method

.method public writeEndComponent(Ljava/lang/String;)V
    .locals 1
    .param p1, "componentName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 324
    const-string v0, "END"

    invoke-virtual {p0, v0, p1}, Lezvcard/io/text/VCardRawWriter;->writeProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    return-void
.end method

.method public writeProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "propertyName"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 345
    const/4 v0, 0x0

    new-instance v1, Lezvcard/parameter/VCardParameters;

    invoke-direct {v1}, Lezvcard/parameter/VCardParameters;-><init>()V

    invoke-virtual {p0, v0, p1, v1, p2}, Lezvcard/io/text/VCardRawWriter;->writeProperty(Ljava/lang/String;Ljava/lang/String;Lezvcard/parameter/VCardParameters;Ljava/lang/String;)V

    .line 346
    return-void
.end method

.method public writeProperty(Ljava/lang/String;Ljava/lang/String;Lezvcard/parameter/VCardParameters;Ljava/lang/String;)V
    .locals 14
    .param p1, "group"    # Ljava/lang/String;
    .param p2, "propertyName"    # Ljava/lang/String;
    .param p3, "parameters"    # Lezvcard/parameter/VCardParameters;
    .param p4, "value"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 361
    if-eqz p1, :cond_0

    sget-object v11, Lezvcard/io/text/VCardRawWriter;->propertyNameRegex:Ljava/util/regex/Pattern;

    invoke-virtual {v11, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/regex/Matcher;->matches()Z

    move-result v11

    if-nez v11, :cond_0

    .line 362
    new-instance v11, Ljava/lang/IllegalArgumentException;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Group contains invalid characters.  Valid characters are letters, numbers, and hyphens: "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v12}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v11

    .line 366
    :cond_0
    sget-object v11, Lezvcard/io/text/VCardRawWriter;->propertyNameRegex:Ljava/util/regex/Pattern;

    move-object/from16 v0, p2

    invoke-virtual {v11, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/regex/Matcher;->matches()Z

    move-result v11

    if-nez v11, :cond_1

    .line 367
    new-instance v11, Ljava/lang/IllegalArgumentException;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Property name contains invalid characters.  Valid characters are letters, numbers, and hyphens: "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    move-object/from16 v0, p2

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v12}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v11

    .line 370
    :cond_1
    move-object/from16 v0, p3

    move-object/from16 v1, p4

    invoke-direct {p0, v0, v1}, Lezvcard/io/text/VCardRawWriter;->sanitizeValue(Lezvcard/parameter/VCardParameters;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    .line 373
    if-eqz p1, :cond_2

    .line 374
    iget-object v11, p0, Lezvcard/io/text/VCardRawWriter;->writer:Lezvcard/io/text/FoldedLineWriter;

    invoke-virtual {v11, p1}, Lezvcard/io/text/FoldedLineWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 375
    iget-object v11, p0, Lezvcard/io/text/VCardRawWriter;->writer:Lezvcard/io/text/FoldedLineWriter;

    const/16 v12, 0x2e

    invoke-virtual {v11, v12}, Lezvcard/io/text/FoldedLineWriter;->append(C)Ljava/io/Writer;

    .line 379
    :cond_2
    iget-object v11, p0, Lezvcard/io/text/VCardRawWriter;->writer:Lezvcard/io/text/FoldedLineWriter;

    move-object/from16 v0, p2

    invoke-virtual {v11, v0}, Lezvcard/io/text/FoldedLineWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 382
    invoke-virtual/range {p3 .. p3}, Lezvcard/parameter/VCardParameters;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    .line 383
    .local v10, "subType":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 384
    .local v6, "parameterName":Ljava/lang/String;
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    .line 385
    .local v8, "parameterValues":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_3

    .line 389
    iget-object v11, p0, Lezvcard/io/text/VCardRawWriter;->version:Lezvcard/VCardVersion;

    sget-object v12, Lezvcard/VCardVersion;->V2_1:Lezvcard/VCardVersion;

    if-ne v11, v12, :cond_5

    .line 390
    const-string v11, "TYPE"

    invoke-virtual {v11, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    .line 391
    .local v5, "isTypeParameter":Z
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .local v4, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 392
    .local v7, "parameterValue":Ljava/lang/String;
    move-object/from16 v0, p2

    invoke-direct {p0, v7, v6, v0}, Lezvcard/io/text/VCardRawWriter;->sanitizeParameterValue(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 394
    if-eqz v5, :cond_4

    .line 396
    iget-object v11, p0, Lezvcard/io/text/VCardRawWriter;->writer:Lezvcard/io/text/FoldedLineWriter;

    const/16 v12, 0x3b

    invoke-virtual {v11, v12}, Lezvcard/io/text/FoldedLineWriter;->append(C)Ljava/io/Writer;

    move-result-object v11

    invoke-virtual {v7}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    goto :goto_0

    .line 399
    :cond_4
    iget-object v11, p0, Lezvcard/io/text/VCardRawWriter;->writer:Lezvcard/io/text/FoldedLineWriter;

    const/16 v12, 0x3b

    invoke-virtual {v11, v12}, Lezvcard/io/text/FoldedLineWriter;->append(C)Ljava/io/Writer;

    move-result-object v11

    invoke-virtual {v11, v6}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    move-result-object v11

    const/16 v12, 0x3d

    invoke-virtual {v11, v12}, Ljava/io/Writer;->append(C)Ljava/io/Writer;

    move-result-object v11

    invoke-virtual {v11, v7}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    goto :goto_0

    .line 405
    .end local v4    # "i$":Ljava/util/Iterator;
    .end local v5    # "isTypeParameter":Z
    .end local v7    # "parameterValue":Ljava/lang/String;
    :cond_5
    const/4 v2, 0x1

    .line 406
    .local v2, "first":Z
    iget-object v11, p0, Lezvcard/io/text/VCardRawWriter;->writer:Lezvcard/io/text/FoldedLineWriter;

    const/16 v12, 0x3b

    invoke-virtual {v11, v12}, Lezvcard/io/text/FoldedLineWriter;->append(C)Ljava/io/Writer;

    move-result-object v11

    invoke-virtual {v11, v6}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    move-result-object v11

    const/16 v12, 0x3d

    invoke-virtual {v11, v12}, Ljava/io/Writer;->append(C)Ljava/io/Writer;

    .line 407
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .restart local v4    # "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 408
    .restart local v7    # "parameterValue":Ljava/lang/String;
    if-nez v2, :cond_6

    .line 409
    iget-object v11, p0, Lezvcard/io/text/VCardRawWriter;->writer:Lezvcard/io/text/FoldedLineWriter;

    const/16 v12, 0x2c

    invoke-virtual {v11, v12}, Lezvcard/io/text/FoldedLineWriter;->append(C)Ljava/io/Writer;

    .line 412
    :cond_6
    move-object/from16 v0, p2

    invoke-direct {p0, v7, v6, v0}, Lezvcard/io/text/VCardRawWriter;->sanitizeParameterValue(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 415
    sget-object v11, Lezvcard/io/text/VCardRawWriter;->quoteMeRegex:Ljava/util/regex/Pattern;

    invoke-virtual {v11, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/regex/Matcher;->matches()Z

    move-result v11

    if-eqz v11, :cond_7

    .line 416
    iget-object v11, p0, Lezvcard/io/text/VCardRawWriter;->writer:Lezvcard/io/text/FoldedLineWriter;

    const/16 v12, 0x22

    invoke-virtual {v11, v12}, Lezvcard/io/text/FoldedLineWriter;->append(C)Ljava/io/Writer;

    .line 417
    iget-object v11, p0, Lezvcard/io/text/VCardRawWriter;->writer:Lezvcard/io/text/FoldedLineWriter;

    invoke-virtual {v11, v7}, Lezvcard/io/text/FoldedLineWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 418
    iget-object v11, p0, Lezvcard/io/text/VCardRawWriter;->writer:Lezvcard/io/text/FoldedLineWriter;

    const/16 v12, 0x22

    invoke-virtual {v11, v12}, Lezvcard/io/text/FoldedLineWriter;->append(C)Ljava/io/Writer;

    .line 423
    :goto_2
    const/4 v2, 0x0

    goto :goto_1

    .line 420
    :cond_7
    iget-object v11, p0, Lezvcard/io/text/VCardRawWriter;->writer:Lezvcard/io/text/FoldedLineWriter;

    invoke-virtual {v11, v7}, Lezvcard/io/text/FoldedLineWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    goto :goto_2

    .line 428
    .end local v2    # "first":Z
    .end local v4    # "i$":Ljava/util/Iterator;
    .end local v6    # "parameterName":Ljava/lang/String;
    .end local v7    # "parameterValue":Ljava/lang/String;
    .end local v8    # "parameterValues":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .end local v10    # "subType":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;"
    :cond_8
    iget-object v11, p0, Lezvcard/io/text/VCardRawWriter;->writer:Lezvcard/io/text/FoldedLineWriter;

    const/16 v12, 0x3a

    invoke-virtual {v11, v12}, Lezvcard/io/text/FoldedLineWriter;->append(C)Ljava/io/Writer;

    .line 431
    invoke-virtual/range {p3 .. p3}, Lezvcard/parameter/VCardParameters;->getEncoding()Lezvcard/parameter/Encoding;

    move-result-object v11

    sget-object v12, Lezvcard/parameter/Encoding;->QUOTED_PRINTABLE:Lezvcard/parameter/Encoding;

    if-ne v11, v12, :cond_9

    const/4 v9, 0x1

    .line 432
    .local v9, "quotedPrintable":Z
    :goto_3
    iget-object v11, p0, Lezvcard/io/text/VCardRawWriter;->writer:Lezvcard/io/text/FoldedLineWriter;

    move-object/from16 v0, p4

    invoke-virtual {v11, v0, v9}, Lezvcard/io/text/FoldedLineWriter;->append(Ljava/lang/CharSequence;Z)Lezvcard/io/text/FoldedLineWriter;

    .line 434
    iget-object v11, p0, Lezvcard/io/text/VCardRawWriter;->writer:Lezvcard/io/text/FoldedLineWriter;

    iget-object v12, p0, Lezvcard/io/text/VCardRawWriter;->newline:Ljava/lang/String;

    invoke-virtual {v11, v12}, Lezvcard/io/text/FoldedLineWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 435
    return-void

    .line 431
    .end local v9    # "quotedPrintable":Z
    :cond_9
    const/4 v9, 0x0

    goto :goto_3
.end method

.method public writeVersion()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 333
    const-string v0, "VERSION"

    iget-object v1, p0, Lezvcard/io/text/VCardRawWriter;->version:Lezvcard/VCardVersion;

    invoke-virtual {v1}, Lezvcard/VCardVersion;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lezvcard/io/text/VCardRawWriter;->writeProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 334
    return-void
.end method
