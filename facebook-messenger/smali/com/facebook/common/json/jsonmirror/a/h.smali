.class public Lcom/facebook/common/json/jsonmirror/a/h;
.super Lcom/facebook/common/json/jsonmirror/a/a;
.source "JMList.java"


# instance fields
.field protected final g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/common/json/jsonmirror/a/a;",
            ">;"
        }
    .end annotation
.end field

.field public final h:I

.field public final i:I


# direct methods
.method public constructor <init>(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/common/json/jsonmirror/a/a;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 19
    invoke-direct {p0, p1, v0, v0}, Lcom/facebook/common/json/jsonmirror/a/h;-><init>(Ljava/util/Set;II)V

    .line 20
    return-void
.end method

.method public constructor <init>(Ljava/util/Set;II)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/common/json/jsonmirror/a/a;",
            ">;II)V"
        }
    .end annotation

    .prologue
    const/4 v6, 0x1

    const/4 v0, 0x0

    .line 22
    invoke-direct {p0}, Lcom/facebook/common/json/jsonmirror/a/a;-><init>()V

    .line 32
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v0

    move v2, v0

    move v3, v0

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/json/jsonmirror/a/a;

    .line 33
    instance-of v5, v0, Lcom/facebook/common/json/jsonmirror/a/h;

    if-eqz v5, :cond_0

    .line 34
    add-int/lit8 v2, v2, 0x1

    move v0, v1

    move v1, v2

    move v2, v3

    :goto_1
    move v3, v2

    move v2, v1

    move v1, v0

    .line 39
    goto :goto_0

    .line 35
    :cond_0
    instance-of v5, v0, Lcom/facebook/common/json/jsonmirror/a/c;

    if-nez v5, :cond_1

    instance-of v5, v0, Lcom/facebook/common/json/jsonmirror/a/j;

    if-eqz v5, :cond_2

    .line 37
    :cond_1
    add-int/lit8 v1, v1, 0x1

    move v0, v1

    move v1, v2

    move v2, v3

    goto :goto_1

    .line 38
    :cond_2
    instance-of v0, v0, Lcom/facebook/common/json/jsonmirror/a/l;

    if-eqz v0, :cond_7

    .line 39
    add-int/lit8 v3, v3, 0x1

    move v0, v1

    move v1, v2

    move v2, v3

    goto :goto_1

    .line 43
    :cond_3
    if-le v2, v6, :cond_4

    .line 44
    new-instance v0, Lcom/facebook/common/json/jsonmirror/f;

    const-string v1, "We don\'t handle multiple types of child lists in the same list."

    invoke-direct {v0, v1}, Lcom/facebook/common/json/jsonmirror/f;-><init>(Ljava/lang/String;)V

    throw v0

    .line 46
    :cond_4
    if-le v1, v6, :cond_5

    .line 47
    new-instance v0, Lcom/facebook/common/json/jsonmirror/f;

    const-string v1, "We don\'t handle multiple types of child dictionaries in the same list."

    invoke-direct {v0, v1}, Lcom/facebook/common/json/jsonmirror/f;-><init>(Ljava/lang/String;)V

    throw v0

    .line 49
    :cond_5
    if-le v3, v6, :cond_6

    .line 50
    new-instance v0, Lcom/facebook/common/json/jsonmirror/f;

    const-string v1, "We don\'t handle multiple types of strings in the same list."

    invoke-direct {v0, v1}, Lcom/facebook/common/json/jsonmirror/f;-><init>(Ljava/lang/String;)V

    throw v0

    .line 54
    :cond_6
    iput-object p1, p0, Lcom/facebook/common/json/jsonmirror/a/h;->g:Ljava/util/Set;

    .line 55
    iput p2, p0, Lcom/facebook/common/json/jsonmirror/a/h;->h:I

    .line 56
    iput p3, p0, Lcom/facebook/common/json/jsonmirror/a/h;->i:I

    .line 57
    return-void

    :cond_7
    move v0, v1

    move v1, v2

    move v2, v3

    goto :goto_1
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/common/json/jsonmirror/a/a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/common/json/jsonmirror/a/h;->g:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
