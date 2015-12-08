.class final Lcom/kik/l/as;
.super Lcom/kik/l/y;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/database/Cursor;)V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0, p1}, Lcom/kik/l/y;-><init>(Landroid/database/Cursor;)V

    .line 58
    return-void
.end method

.method public static a(Lkik/a/d/a/a;)Ljava/util/ArrayList;
    .locals 7

    .prologue
    .line 62
    invoke-virtual {p0}, Lkik/a/d/a/a;->f()Ljava/util/ArrayList;

    move-result-object v1

    .line 63
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 64
    const/4 v0, 0x0

    .line 66
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/f/a/a/a;

    .line 67
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 69
    const-string v5, "platform"

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    const-string v5, "content_uri"

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    const-string v5, "type"

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->d()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    const-string v5, "byline"

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->e()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    const-string v5, "priority"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 74
    const-string v5, "content_id"

    invoke-virtual {p0}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    const-string v5, "file_content_type"

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    .line 79
    goto :goto_0

    .line 81
    :cond_0
    return-object v2
.end method


# virtual methods
.method final b(Lkik/a/d/a/a;)Lkik/a/d/a/a;
    .locals 6

    .prologue
    .line 86
    if-eqz p1, :cond_0

    .line 87
    const-string v0, "content_uri"

    invoke-virtual {p0, v0}, Lcom/kik/l/as;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v0, "platform"

    invoke-virtual {p0, v0}, Lcom/kik/l/as;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "type"

    invoke-virtual {p0, v0}, Lcom/kik/l/as;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v0, "byline"

    invoke-virtual {p0, v0}, Lcom/kik/l/as;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "file_content_type"

    invoke-virtual {p0, v0}, Lcom/kik/l/as;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    :cond_0
    return-object p1
.end method
