.class public Lezvcard/util/VCardFloatFormatter;
.super Ljava/text/DecimalFormat;
.source "VCardFloatFormatter.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 42
    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lezvcard/util/VCardFloatFormatter;-><init>(I)V

    .line 43
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2
    .param p1, "decimals"    # I

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/text/DecimalFormat;-><init>()V

    .line 50
    invoke-virtual {p0, p1}, Lezvcard/util/VCardFloatFormatter;->setMaximumFractionDigits(I)V

    .line 51
    if-lez p1, :cond_0

    .line 52
    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lezvcard/util/VCardFloatFormatter;->setMinimumFractionDigits(I)V

    .line 56
    :cond_0
    new-instance v0, Ljava/text/DecimalFormatSymbols;

    invoke-direct {v0}, Ljava/text/DecimalFormatSymbols;-><init>()V

    .line 57
    .local v0, "symbols":Ljava/text/DecimalFormatSymbols;
    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/text/DecimalFormatSymbols;->setDecimalSeparator(C)V

    .line 58
    const/16 v1, 0x2d

    invoke-virtual {v0, v1}, Ljava/text/DecimalFormatSymbols;->setMinusSign(C)V

    .line 59
    invoke-virtual {p0, v0}, Lezvcard/util/VCardFloatFormatter;->setDecimalFormatSymbols(Ljava/text/DecimalFormatSymbols;)V

    .line 60
    return-void
.end method
