.class abstract Lezvcard/Ezvcard$ParserChain;
.super Ljava/lang/Object;
.source "Ezvcard.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/Ezvcard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "ParserChain"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field final index:Lezvcard/io/scribe/ScribeIndex;

.field final this_:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field warnings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 592
    .local p0, "this":Lezvcard/Ezvcard$ParserChain;, "Lezvcard/Ezvcard$ParserChain<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 593
    new-instance v0, Lezvcard/io/scribe/ScribeIndex;

    invoke-direct {v0}, Lezvcard/io/scribe/ScribeIndex;-><init>()V

    iput-object v0, p0, Lezvcard/Ezvcard$ParserChain;->index:Lezvcard/io/scribe/ScribeIndex;

    .line 596
    iput-object p0, p0, Lezvcard/Ezvcard$ParserChain;->this_:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public abstract all()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lezvcard/VCard;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xml/sax/SAXException;
        }
    .end annotation
.end method

.method public abstract first()Lezvcard/VCard;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xml/sax/SAXException;
        }
    .end annotation
.end method

.method public register(Lezvcard/io/scribe/VCardPropertyScribe;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lezvcard/io/scribe/VCardPropertyScribe",
            "<+",
            "Lezvcard/property/VCardProperty;",
            ">;)TT;"
        }
    .end annotation

    .prologue
    .line 605
    .local p0, "this":Lezvcard/Ezvcard$ParserChain;, "Lezvcard/Ezvcard$ParserChain<TT;>;"
    .local p1, "scribe":Lezvcard/io/scribe/VCardPropertyScribe;, "Lezvcard/io/scribe/VCardPropertyScribe<+Lezvcard/property/VCardProperty;>;"
    iget-object v0, p0, Lezvcard/Ezvcard$ParserChain;->index:Lezvcard/io/scribe/ScribeIndex;

    invoke-virtual {v0, p1}, Lezvcard/io/scribe/ScribeIndex;->register(Lezvcard/io/scribe/VCardPropertyScribe;)V

    .line 606
    iget-object v0, p0, Lezvcard/Ezvcard$ParserChain;->this_:Ljava/lang/Object;

    return-object v0
.end method

.method public warnings(Ljava/util/List;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;>;)TT;"
        }
    .end annotation

    .prologue
    .line 620
    .local p0, "this":Lezvcard/Ezvcard$ParserChain;, "Lezvcard/Ezvcard$ParserChain<TT;>;"
    .local p1, "warnings":Ljava/util/List;, "Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>;"
    iput-object p1, p0, Lezvcard/Ezvcard$ParserChain;->warnings:Ljava/util/List;

    .line 621
    iget-object v0, p0, Lezvcard/Ezvcard$ParserChain;->this_:Ljava/lang/Object;

    return-object v0
.end method
