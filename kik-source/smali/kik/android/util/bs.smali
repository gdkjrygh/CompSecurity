.class public final Lkik/android/util/bs;
.super Ljava/util/LinkedHashMap;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Z


# direct methods
.method public constructor <init>(I)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 13
    const/16 v0, 0xa

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x3ff6666666666666L    # 1.4

    mul-double/2addr v0, v2

    double-to-int v0, v0

    const/high16 v1, 0x3f400000    # 0.75f

    invoke-direct {p0, v0, v1, v4}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 9
    iput-boolean v4, p0, Lkik/android/util/bs;->b:Z

    .line 14
    if-gtz p1, :cond_0

    .line 15
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/util/bs;->b:Z

    .line 17
    :cond_0
    iput p1, p0, Lkik/android/util/bs;->a:I

    .line 18
    return-void
.end method


# virtual methods
.method protected final removeEldestEntry(Ljava/util/Map$Entry;)Z
    .locals 2

    .prologue
    .line 23
    invoke-virtual {p0}, Lkik/android/util/bs;->size()I

    move-result v0

    iget v1, p0, Lkik/android/util/bs;->a:I

    if-le v0, v1, :cond_0

    iget-boolean v0, p0, Lkik/android/util/bs;->b:Z

    if-nez v0, :cond_1

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 31
    :goto_0
    return v0

    .line 26
    :cond_1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    .line 28
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 29
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 31
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method
