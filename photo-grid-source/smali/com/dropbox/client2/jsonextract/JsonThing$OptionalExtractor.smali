.class public final Lcom/dropbox/client2/jsonextract/JsonThing$OptionalExtractor;
.super Lcom/dropbox/client2/jsonextract/JsonExtractor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/dropbox/client2/jsonextract/JsonExtractor",
        "<TT;>;"
    }
.end annotation


# instance fields
.field public final elementExtractor:Lcom/dropbox/client2/jsonextract/JsonExtractor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/dropbox/client2/jsonextract/JsonExtractor",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/dropbox/client2/jsonextract/JsonExtractor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/dropbox/client2/jsonextract/JsonExtractor",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 206
    invoke-direct {p0}, Lcom/dropbox/client2/jsonextract/JsonExtractor;-><init>()V

    .line 207
    iput-object p1, p0, Lcom/dropbox/client2/jsonextract/JsonThing$OptionalExtractor;->elementExtractor:Lcom/dropbox/client2/jsonextract/JsonExtractor;

    .line 208
    return-void
.end method


# virtual methods
.method public final extract(Lcom/dropbox/client2/jsonextract/JsonThing;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/dropbox/client2/jsonextract/JsonThing;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 212
    iget-object v0, p0, Lcom/dropbox/client2/jsonextract/JsonThing$OptionalExtractor;->elementExtractor:Lcom/dropbox/client2/jsonextract/JsonExtractor;

    invoke-virtual {p1, v0}, Lcom/dropbox/client2/jsonextract/JsonThing;->optionalExtract(Lcom/dropbox/client2/jsonextract/JsonExtractor;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
