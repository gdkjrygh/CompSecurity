.class public Lezvcard/io/scribe/VCardPropertyScribe$SemiStructuredIterator;
.super Ljava/lang/Object;
.source "VCardPropertyScribe.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/io/scribe/VCardPropertyScribe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "SemiStructuredIterator"
.end annotation


# instance fields
.field private final it:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Iterator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 937
    .local p1, "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 938
    iput-object p1, p0, Lezvcard/io/scribe/VCardPropertyScribe$SemiStructuredIterator;->it:Ljava/util/Iterator;

    .line 939
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .prologue
    .line 956
    iget-object v0, p0, Lezvcard/io/scribe/VCardPropertyScribe$SemiStructuredIterator;->it:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 947
    invoke-virtual {p0}, Lezvcard/io/scribe/VCardPropertyScribe$SemiStructuredIterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    .line 952
    :goto_0
    return-object v1

    .line 951
    :cond_0
    iget-object v2, p0, Lezvcard/io/scribe/VCardPropertyScribe$SemiStructuredIterator;->it:Ljava/util/Iterator;

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 952
    .local v0, "value":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_1

    move-object v0, v1

    .end local v0    # "value":Ljava/lang/String;
    :cond_1
    move-object v1, v0

    goto :goto_0
.end method
