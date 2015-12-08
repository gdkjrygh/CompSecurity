.class public Lkik/a/f/e/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/f/e/g;
.implements Lkik/a/f/e/i;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lkik/a/f/o;Lkik/a/d/a/g;)J
    .locals 7

    .prologue
    .line 34
    check-cast p2, Lkik/a/d/a/a;

    .line 36
    const-string v0, "content"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 39
    const-string v0, "id"

    invoke-virtual {p2}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    invoke-virtual {p2}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 42
    const-string v0, "app-id"

    invoke-virtual {p2}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    :cond_0
    const-string v0, "v"

    invoke-virtual {p2}, Lkik/a/d/a/a;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    const-string v0, "strings"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p2}, Lkik/a/d/a/a;->r()Ljava/util/Hashtable;

    move-result-object v1

    .line 52
    const-string v0, "app-name"

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 53
    const-string v2, "app-name"

    const-string v0, "app-name"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v2, v0}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    :cond_1
    const-string v0, "file-size"

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 57
    const-string v2, "file-size"

    const-string v0, "file-size"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v2, v0}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    :cond_2
    invoke-virtual {p1}, Lkik/a/f/o;->a()V

    .line 63
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 64
    :cond_3
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 65
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 66
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 68
    if-eqz v1, :cond_3

    const-string v3, "file-url"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "int-"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 70
    const-string v3, "app-name"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "file-size"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 74
    invoke-virtual {p1, v1}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 78
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 79
    invoke-virtual {p1, v1}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 82
    :cond_4
    const-wide/16 v0, 0x0

    invoke-virtual {p1}, Lkik/a/f/o;->b()J

    move-result-wide v2

    add-long/2addr v2, v0

    .line 83
    const-string v0, "strings"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 85
    const-string v0, "extras"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 86
    invoke-virtual {p1}, Lkik/a/f/o;->a()V

    .line 88
    invoke-virtual {p2}, Lkik/a/d/a/a;->q()Ljava/util/Hashtable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Hashtable;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 89
    :cond_5
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 90
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 91
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 92
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 93
    invoke-static {v1}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_5

    invoke-static {v0}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_5

    .line 94
    const-string v5, "item"

    invoke-virtual {p1, v5}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 95
    const-string v5, "key"

    invoke-virtual {p1, v5, v1}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    const-string v1, "val"

    invoke-virtual {p1, v1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    const-string v0, "item"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    goto :goto_1

    .line 101
    :cond_6
    invoke-virtual {p1}, Lkik/a/f/o;->b()J

    move-result-wide v0

    add-long/2addr v2, v0

    .line 102
    const-string v0, "extras"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 104
    const-string v0, "images"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 105
    invoke-virtual {p1}, Lkik/a/f/o;->a()V

    .line 107
    invoke-virtual {p2}, Lkik/a/d/a/a;->s()Ljava/util/Hashtable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Hashtable;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 108
    :cond_7
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 109
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 111
    invoke-static {}, Lkik/a/h/e;->a()Lkik/a/h/e;

    move-result-object v5

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/d/o;

    invoke-virtual {v5, v1}, Lkik/a/h/e;->a(Lkik/a/d/o;)[B

    move-result-object v1

    .line 112
    if-eqz v1, :cond_7

    .line 113
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 114
    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 115
    invoke-static {v1}, Lcom/kik/m/e;->a([B)Ljava/lang/String;

    move-result-object v1

    .line 116
    invoke-virtual {p1, v1}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 117
    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    goto :goto_2

    .line 121
    :cond_8
    invoke-virtual {p1}, Lkik/a/f/o;->b()J

    move-result-wide v0

    add-long/2addr v2, v0

    .line 122
    const-string v0, "images"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 124
    const-string v0, "uris"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 125
    invoke-virtual {p2}, Lkik/a/d/a/a;->f()Ljava/util/ArrayList;

    move-result-object v4

    .line 126
    if-eqz v4, :cond_d

    .line 127
    const/4 v0, 0x0

    move v1, v0

    :goto_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_d

    .line 128
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/f/a/a/a;

    .line 129
    const-string v5, "uri"

    invoke-virtual {p1, v5}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 130
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->c()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_9

    .line 131
    const-string v5, "platform"

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v5, v6}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    :cond_9
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->d()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_a

    .line 134
    const-string v5, "type"

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->d()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v5, v6}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    :cond_a
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->i()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_b

    .line 137
    const-string v5, "file-content-type"

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->i()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v5, v6}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    :cond_b
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_c

    const-string v0, ""

    .line 140
    :goto_4
    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 141
    const-string v0, "uri"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 127
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    .line 139
    :cond_c
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    .line 144
    :cond_d
    const-string v0, "uris"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 146
    const-string v0, "content"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 148
    return-wide v2
.end method

.method public final a(Lkik/a/f/n;)Lkik/a/d/a/g;
    .locals 14

    .prologue
    .line 154
    new-instance v7, Ljava/util/Hashtable;

    invoke-direct {v7}, Ljava/util/Hashtable;-><init>()V

    .line 155
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 156
    new-instance v5, Ljava/util/Hashtable;

    invoke-direct {v5}, Ljava/util/Hashtable;-><init>()V

    .line 157
    new-instance v6, Ljava/util/Hashtable;

    invoke-direct {v6}, Ljava/util/Hashtable;-><init>()V

    .line 159
    const-string v0, "content"

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    const-string v0, "id"

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 163
    const-string v0, "app-id"

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 164
    const-string v0, "v"

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v0}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 166
    invoke-virtual {p1}, Lkik/a/f/n;->getDepth()I

    move-result v9

    :cond_0
    invoke-virtual {p1}, Lkik/a/f/n;->a()I

    move-result v0

    if-ge v9, v0, :cond_c

    .line 167
    const-string v0, "uris"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 168
    invoke-virtual {p1}, Lkik/a/f/n;->getDepth()I

    move-result v0

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lkik/a/f/n;->a()I

    move-result v8

    if-ge v0, v8, :cond_0

    .line 169
    const-string v8, "uri"

    invoke-virtual {p1, v8}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 170
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/16 v10, 0xa

    if-ge v8, v10, :cond_1

    .line 171
    const-string v8, "priority"

    const/4 v10, 0x0

    invoke-virtual {p1, v10, v8}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 174
    const-string v10, "platform"

    const/4 v11, 0x0

    invoke-virtual {p1, v11, v10}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 175
    const-string v11, "type"

    const/4 v12, 0x0

    invoke-virtual {p1, v12, v11}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 176
    const-string v12, "file-content-type"

    const/4 v13, 0x0

    invoke-virtual {p1, v13, v12}, Lkik/a/f/n;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 177
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v13

    .line 178
    invoke-static {v8}, Lkik/a/h/i;->b(Ljava/lang/String;)I

    .line 180
    new-instance v8, Lcom/kik/f/a/a/a;

    invoke-direct {v8, v13, v2}, Lcom/kik/f/a/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    invoke-virtual {v8, v10}, Lcom/kik/f/a/a/a;->a(Ljava/lang/String;)Lcom/kik/f/a/a/a;

    .line 182
    invoke-virtual {v8, v11}, Lcom/kik/f/a/a/a;->b(Ljava/lang/String;)Lcom/kik/f/a/a/a;

    .line 183
    invoke-virtual {v8, v12}, Lcom/kik/f/a/a/a;->e(Ljava/lang/String;)Lcom/kik/f/a/a/a;

    .line 184
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 188
    :cond_2
    const-string v0, "extras"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 189
    invoke-virtual {p1}, Lkik/a/f/n;->getDepth()I

    move-result v10

    :cond_3
    :goto_1
    invoke-virtual {p1}, Lkik/a/f/n;->a()I

    move-result v0

    if-ge v10, v0, :cond_0

    .line 190
    const-string v0, "item"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 191
    const/4 v8, 0x0

    .line 192
    const/4 v0, 0x0

    .line 194
    invoke-virtual {p1}, Lkik/a/f/n;->getDepth()I

    move-result v11

    :cond_4
    :goto_2
    invoke-virtual {p1}, Lkik/a/f/n;->a()I

    move-result v12

    if-ge v11, v12, :cond_6

    .line 195
    const-string v12, "key"

    invoke-virtual {p1, v12}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_5

    .line 196
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v8

    goto :goto_2

    .line 198
    :cond_5
    const-string v12, "val"

    invoke-virtual {p1, v12}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_4

    .line 199
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 203
    :cond_6
    invoke-static {v8}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_3

    invoke-static {v0}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_3

    .line 204
    invoke-virtual {v7, v8, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 209
    :cond_7
    const-string v0, "strings"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 210
    invoke-virtual {p1}, Lkik/a/f/n;->getDepth()I

    move-result v8

    :cond_8
    :goto_3
    invoke-virtual {p1}, Lkik/a/f/n;->a()I

    move-result v0

    if-ge v8, v0, :cond_0

    .line 211
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 212
    invoke-virtual {p1}, Lkik/a/f/n;->getName()Ljava/lang/String;

    move-result-object v10

    .line 213
    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v0

    .line 215
    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v11

    const/16 v12, 0x3e8

    if-lt v11, v12, :cond_9

    .line 216
    const/4 v11, 0x0

    const/16 v12, 0x3e8

    invoke-virtual {v0, v11, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 218
    :cond_9
    invoke-virtual {v5, v10, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 222
    :cond_a
    const-string v0, "images"

    invoke-virtual {p1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 223
    invoke-virtual {p1}, Lkik/a/f/n;->getDepth()I

    move-result v0

    :cond_b
    :goto_4
    invoke-virtual {p1}, Lkik/a/f/n;->a()I

    move-result v8

    if-ge v0, v8, :cond_0

    .line 224
    const/4 v8, 0x0

    invoke-virtual {p1, v8}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_b

    .line 225
    invoke-virtual {p1}, Lkik/a/f/n;->getName()Ljava/lang/String;

    move-result-object v8

    new-instance v10, Lkik/a/d/o;

    invoke-virtual {p1}, Lkik/a/f/n;->nextText()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/kik/m/e;->a(Ljava/lang/String;)[B

    move-result-object v11

    invoke-direct {v10, v11}, Lkik/a/d/o;-><init>([B)V

    invoke-virtual {v6, v8, v10}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 231
    :cond_c
    new-instance v0, Lkik/a/d/a/a;

    invoke-direct/range {v0 .. v7}, Lkik/a/d/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Hashtable;Ljava/util/Hashtable;Ljava/util/Hashtable;)V

    return-object v0
.end method
