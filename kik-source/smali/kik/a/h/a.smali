.class public final Lkik/a/h/a;
.super Ljava/util/LinkedHashMap;
.source "SourceFile"


# instance fields
.field private final a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 15
    const/16 v0, 0x64

    iput v0, p0, Lkik/a/h/a;->a:I

    .line 16
    return-void
.end method


# virtual methods
.method protected final removeEldestEntry(Ljava/util/Map$Entry;)Z
    .locals 2

    .prologue
    .line 21
    invoke-super {p0}, Ljava/util/LinkedHashMap;->size()I

    move-result v0

    iget v1, p0, Lkik/a/h/a;->a:I

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
