.class Lcom/facebook/user/a/c;
.super Lcom/facebook/user/a/d;
.source "ContactLocaleUtils.java"


# instance fields
.field final synthetic a:Lcom/facebook/user/a/a;


# direct methods
.method private constructor <init>(Lcom/facebook/user/a/a;)V
    .locals 0

    .prologue
    .line 51
    iput-object p1, p0, Lcom/facebook/user/a/c;->a:Lcom/facebook/user/a/a;

    invoke-direct {p0, p1}, Lcom/facebook/user/a/d;-><init>(Lcom/facebook/user/a/a;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/user/a/a;Lcom/facebook/user/a/b;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0, p1}, Lcom/facebook/user/a/c;-><init>(Lcom/facebook/user/a/a;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/util/Iterator;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Iterator",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/16 v10, 0x20

    const/4 v9, 0x0

    .line 82
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 83
    invoke-static {}, Lcom/facebook/user/a/e;->a()Lcom/facebook/user/a/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/user/a/e;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 84
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 85
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_4

    .line 92
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/a/f;

    .line 93
    const/4 v7, 0x2

    iget v8, v0, Lcom/facebook/user/a/f;->a:I

    if-ne v7, v8, :cond_1

    .line 94
    iget-object v7, v0, Lcom/facebook/user/a/f;->c:Ljava/lang/String;

    invoke-virtual {v4, v9, v7}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    iget-object v7, v0, Lcom/facebook/user/a/f;->c:Ljava/lang/String;

    invoke-virtual {v7, v9}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-virtual {v5, v9, v7}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 107
    :cond_0
    :goto_1
    iget-object v0, v0, Lcom/facebook/user/a/f;->b:Ljava/lang/String;

    invoke-virtual {v6, v9, v0}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 109
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 110
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 91
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 96
    :cond_1
    const/4 v7, 0x1

    iget v8, v0, Lcom/facebook/user/a/f;->a:I

    if-ne v7, v8, :cond_0

    .line 98
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v7

    if-lez v7, :cond_2

    .line 99
    invoke-virtual {v4, v9, v10}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 101
    :cond_2
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    move-result v7

    if-lez v7, :cond_3

    .line 102
    invoke-virtual {v6, v9, v10}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 104
    :cond_3
    iget-object v7, v0, Lcom/facebook/user/a/f;->b:Ljava/lang/String;

    invoke-virtual {v4, v9, v7}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    iget-object v7, v0, Lcom/facebook/user/a/f;->b:Ljava/lang/String;

    invoke-virtual {v7, v9}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-virtual {v5, v9, v7}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 112
    :cond_4
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
