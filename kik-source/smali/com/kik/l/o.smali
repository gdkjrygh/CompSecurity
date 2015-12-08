.class final Lcom/kik/l/o;
.super Lcom/kik/l/y;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/database/Cursor;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1}, Lcom/kik/l/y;-><init>(Landroid/database/Cursor;)V

    .line 29
    return-void
.end method

.method public static a(Lkik/a/d/a/a;)Ljava/util/ArrayList;
    .locals 9

    .prologue
    .line 53
    invoke-virtual {p0}, Lkik/a/d/a/a;->q()Ljava/util/Hashtable;

    move-result-object v0

    .line 54
    invoke-virtual {p0}, Lkik/a/d/a/a;->r()Ljava/util/Hashtable;

    move-result-object v1

    .line 55
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 57
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 59
    const/4 v4, 0x2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 64
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 65
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 66
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Hashtable;

    invoke-virtual {v1}, Ljava/util/Hashtable;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 67
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 69
    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 71
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 72
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 73
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 75
    invoke-static {v1}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_1

    invoke-static {v0}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_1

    .line 76
    const-string v7, "content_id"

    invoke-virtual {p0}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    const-string v7, "content_type"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 78
    const-string v7, "content_name"

    invoke-virtual {v6, v7, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    const-string v1, "content_string"

    invoke-virtual {v6, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 85
    :cond_2
    return-object v2
.end method


# virtual methods
.method final b(Lkik/a/d/a/a;)Lkik/a/d/a/a;
    .locals 4

    .prologue
    .line 90
    const-string v0, "content_id"

    invoke-virtual {p0, v0}, Lcom/kik/l/o;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    const-string v0, "content_type"

    invoke-virtual {p0, v0}, Lcom/kik/l/o;->d(Ljava/lang/String;)I

    move-result v0

    .line 92
    const-string v1, "content_name"

    invoke-virtual {p0, v1}, Lcom/kik/l/o;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 93
    const-string v2, "content_string"

    invoke-virtual {p0, v2}, Lcom/kik/l/o;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 95
    if-eqz p1, :cond_0

    .line 96
    packed-switch v0, :pswitch_data_0

    .line 107
    :cond_0
    :goto_0
    return-object p1

    .line 98
    :pswitch_0
    invoke-virtual {p1, v1, v2}, Lkik/a/d/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 101
    :pswitch_1
    new-instance v0, Lkik/a/d/d;

    const/4 v3, 0x0

    invoke-direct {v0, v3}, Lkik/a/d/d;-><init>([B)V

    .line 102
    invoke-virtual {v0, v2}, Lkik/a/d/d;->a(Ljava/lang/String;)V

    .line 103
    invoke-virtual {p1, v1, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    goto :goto_0

    .line 106
    :pswitch_2
    invoke-virtual {p1, v1, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 96
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
