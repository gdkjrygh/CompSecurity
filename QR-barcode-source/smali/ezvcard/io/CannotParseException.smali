.class public Lezvcard/io/CannotParseException;
.super Lezvcard/VCardException;
.source "CannotParseException.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Lezvcard/VCardException;-><init>()V

    .line 43
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "reason"    # Ljava/lang/String;

    .prologue
    .line 50
    invoke-direct {p0, p1}, Lezvcard/VCardException;-><init>(Ljava/lang/String;)V

    .line 51
    return-void
.end method
