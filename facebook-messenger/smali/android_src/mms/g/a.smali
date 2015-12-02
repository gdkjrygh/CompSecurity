.class public abstract Landroid_src/mms/g/a;
.super Ljava/lang/Object;
.source "AbstractCache.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<TK;",
            "Landroid_src/mms/g/c",
            "<TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroid_src/mms/g/a;->a:Ljava/util/HashMap;

    .line 35
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    .prologue
    .line 69
    if-eqz p1, :cond_0

    .line 70
    iget-object v0, p0, Landroid_src/mms/g/a;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid_src/mms/g/c;

    .line 71
    if-eqz v0, :cond_0

    .line 72
    iget v1, v0, Landroid_src/mms/g/c;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Landroid_src/mms/g/c;->a:I

    .line 76
    iget-object v0, v0, Landroid_src/mms/g/c;->b:Ljava/lang/Object;

    .line 79
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Landroid_src/mms/g/a;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 102
    return-void
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)Z"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 42
    iget-object v1, p0, Landroid_src/mms/g/a;->a:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    const/16 v2, 0x1f4

    if-lt v1, v2, :cond_1

    .line 61
    :cond_0
    :goto_0
    return v0

    .line 51
    :cond_1
    if-eqz p1, :cond_0

    .line 52
    new-instance v0, Landroid_src/mms/g/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid_src/mms/g/c;-><init>(Landroid_src/mms/g/b;)V

    .line 53
    iput-object p2, v0, Landroid_src/mms/g/c;->b:Ljava/lang/Object;

    .line 54
    iget-object v1, p0, Landroid_src/mms/g/a;->a:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    .prologue
    .line 87
    iget-object v0, p0, Landroid_src/mms/g/a;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid_src/mms/g/c;

    .line 93
    if-eqz v0, :cond_0

    iget-object v0, v0, Landroid_src/mms/g/c;->b:Ljava/lang/Object;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
