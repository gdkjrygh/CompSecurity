.class public abstract Lezvcard/io/scribe/StringPropertyScribe;
.super Lezvcard/io/scribe/SimplePropertyScribe;
.source "StringPropertyScribe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lezvcard/property/TextProperty;",
        ">",
        "Lezvcard/io/scribe/SimplePropertyScribe",
        "<TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 1
    .param p2, "propertyName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 38
    .local p0, "this":Lezvcard/io/scribe/StringPropertyScribe;, "Lezvcard/io/scribe/StringPropertyScribe<TT;>;"
    .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    sget-object v0, Lezvcard/VCardDataType;->TEXT:Lezvcard/VCardDataType;

    invoke-direct {p0, p1, p2, v0}, Lezvcard/io/scribe/StringPropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 39
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;Lezvcard/VCardDataType;)V
    .locals 0
    .param p2, "propertyName"    # Ljava/lang/String;
    .param p3, "dataType"    # Lezvcard/VCardDataType;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/String;",
            "Lezvcard/VCardDataType;",
            ")V"
        }
    .end annotation

    .prologue
    .line 42
    .local p0, "this":Lezvcard/io/scribe/StringPropertyScribe;, "Lezvcard/io/scribe/StringPropertyScribe<TT;>;"
    .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    invoke-direct {p0, p1, p2, p3}, Lezvcard/io/scribe/SimplePropertyScribe;-><init>(Ljava/lang/Class;Ljava/lang/String;Lezvcard/VCardDataType;)V

    .line 43
    return-void
.end method


# virtual methods
.method protected _writeValue(Lezvcard/property/TextProperty;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 47
    .local p0, "this":Lezvcard/io/scribe/StringPropertyScribe;, "Lezvcard/io/scribe/StringPropertyScribe<TT;>;"
    .local p1, "property":Lezvcard/property/TextProperty;, "TT;"
    invoke-virtual {p1}, Lezvcard/property/TextProperty;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method protected bridge synthetic _writeValue(Lezvcard/property/VCardProperty;)Ljava/lang/String;
    .locals 1
    .param p1, "x0"    # Lezvcard/property/VCardProperty;

    .prologue
    .line 36
    .local p0, "this":Lezvcard/io/scribe/StringPropertyScribe;, "Lezvcard/io/scribe/StringPropertyScribe<TT;>;"
    check-cast p1, Lezvcard/property/TextProperty;

    .end local p1    # "x0":Lezvcard/property/VCardProperty;
    invoke-virtual {p0, p1}, Lezvcard/io/scribe/StringPropertyScribe;->_writeValue(Lezvcard/property/TextProperty;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
