.class public Lezvcard/io/SkipMeException;
.super Lezvcard/VCardException;
.source "SkipMeException.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Lezvcard/VCardException;-><init>()V

    .line 48
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "msg"    # Ljava/lang/String;

    .prologue
    .line 55
    invoke-direct {p0, p1}, Lezvcard/VCardException;-><init>(Ljava/lang/String;)V

    .line 56
    return-void
.end method
