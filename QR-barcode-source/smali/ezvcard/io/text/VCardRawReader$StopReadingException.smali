.class public Lezvcard/io/text/VCardRawReader$StopReadingException;
.super Lezvcard/VCardException;
.source "VCardRawReader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/io/text/VCardRawReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StopReadingException"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 360
    invoke-direct {p0}, Lezvcard/VCardException;-><init>()V

    return-void
.end method
