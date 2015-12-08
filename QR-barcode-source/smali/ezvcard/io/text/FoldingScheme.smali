.class public Lezvcard/io/text/FoldingScheme;
.super Ljava/lang/Object;
.source "FoldingScheme.java"


# static fields
.field public static final MAC_ADDRESS_BOOK:Lezvcard/io/text/FoldingScheme;

.field public static final MIME_DIR:Lezvcard/io/text/FoldingScheme;

.field public static final MS_OUTLOOK:Lezvcard/io/text/FoldingScheme;


# instance fields
.field private final indent:Ljava/lang/String;

.field private final lineLength:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 71
    new-instance v0, Lezvcard/io/text/FoldingScheme;

    const/16 v1, 0x4b

    const-string v2, " "

    invoke-direct {v0, v1, v2}, Lezvcard/io/text/FoldingScheme;-><init>(ILjava/lang/String;)V

    sput-object v0, Lezvcard/io/text/FoldingScheme;->MIME_DIR:Lezvcard/io/text/FoldingScheme;

    .line 77
    new-instance v0, Lezvcard/io/text/FoldingScheme;

    const/16 v1, 0x48

    const-string v2, " "

    invoke-direct {v0, v1, v2}, Lezvcard/io/text/FoldingScheme;-><init>(ILjava/lang/String;)V

    sput-object v0, Lezvcard/io/text/FoldingScheme;->MS_OUTLOOK:Lezvcard/io/text/FoldingScheme;

    .line 83
    new-instance v0, Lezvcard/io/text/FoldingScheme;

    const/16 v1, 0x4c

    const-string v2, "  "

    invoke-direct {v0, v1, v2}, Lezvcard/io/text/FoldingScheme;-><init>(ILjava/lang/String;)V

    sput-object v0, Lezvcard/io/text/FoldingScheme;->MAC_ADDRESS_BOOK:Lezvcard/io/text/FoldingScheme;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 2
    .param p1, "lineLength"    # I
    .param p2, "indent"    # Ljava/lang/String;

    .prologue
    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    if-gtz p1, :cond_0

    .line 98
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The line length must be greater than 0."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 100
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, p1, :cond_1

    .line 101
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The line length must be greater than the length of the indentation string."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 103
    :cond_1
    iput p1, p0, Lezvcard/io/text/FoldingScheme;->lineLength:I

    .line 104
    iput-object p2, p0, Lezvcard/io/text/FoldingScheme;->indent:Ljava/lang/String;

    .line 105
    return-void
.end method


# virtual methods
.method public getIndent()Ljava/lang/String;
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lezvcard/io/text/FoldingScheme;->indent:Ljava/lang/String;

    return-object v0
.end method

.method public getLineLength()I
    .locals 1

    .prologue
    .line 113
    iget v0, p0, Lezvcard/io/text/FoldingScheme;->lineLength:I

    return v0
.end method
