.class public Lezvcard/property/UriProperty;
.super Lezvcard/property/TextProperty;
.source "UriProperty.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "uri"    # Ljava/lang/String;

    .prologue
    .line 42
    invoke-direct {p0, p1}, Lezvcard/property/TextProperty;-><init>(Ljava/lang/String;)V

    .line 43
    return-void
.end method
