.class Lcom/facebook/common/u/f;
.super Ljava/lang/Object;
.source "UriTemplateMap.java"


# instance fields
.field a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/common/w/s",
            "<",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic b:Lcom/facebook/common/u/c;

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/common/u/c",
            "<TT;>.com/facebook/common/u/g;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/regex/Pattern;

.field private final e:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/facebook/common/u/c;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    .prologue
    .line 147
    iput-object p1, p0, Lcom/facebook/common/u/f;->b:Lcom/facebook/common/u/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 132
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/common/u/f;->c:Ljava/util/Map;

    .line 140
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/common/u/f;->a:Ljava/util/List;

    .line 149
    iput-object p3, p0, Lcom/facebook/common/u/f;->e:Ljava/lang/Object;

    .line 152
    invoke-static {p2}, Lcom/facebook/common/u/c;->b(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 153
    const/4 v0, 0x0

    aget-object v0, v1, v0

    .line 154
    const/4 v2, 0x1

    aget-object v2, v1, v2

    .line 156
    invoke-static {}, Lcom/facebook/common/u/c;->a()Ljava/util/regex/Pattern;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    .line 159
    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 160
    const/4 v1, 0x0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v0, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 165
    :cond_0
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 167
    :goto_0
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 168
    const/4 v1, 0x0

    invoke-virtual {v3, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v5

    .line 169
    const/4 v1, 0x1

    invoke-virtual {v3, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    const-string v6, "#"

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    .line 170
    if-eqz v6, :cond_1

    const-class v1, Ljava/lang/Long;

    .line 171
    :goto_1
    const/4 v7, 0x2

    invoke-virtual {v3, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v7

    .line 172
    iget-object v8, p0, Lcom/facebook/common/u/f;->a:Ljava/util/List;

    new-instance v9, Lcom/facebook/common/w/s;

    invoke-direct {v9, v1, v7}, Lcom/facebook/common/w/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 174
    invoke-interface {v4, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 175
    new-instance v0, Lcom/facebook/common/u/e;

    const-string v1, "Duplicate template key"

    invoke-direct {v0, v1}, Lcom/facebook/common/u/e;-><init>(Ljava/lang/String;)V

    throw v0

    .line 170
    :cond_1
    const-class v1, Ljava/lang/String;

    goto :goto_1

    .line 179
    :cond_2
    if-eqz v6, :cond_3

    const-string v1, "(-?[0-9]+)"

    .line 180
    :goto_2
    invoke-virtual {v0, v5, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 179
    :cond_3
    const-string v1, "([^/]+)"

    goto :goto_2

    .line 185
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "[/]?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 187
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/u/f;->d:Ljava/util/regex/Pattern;

    .line 190
    invoke-static {v2}, Lcom/facebook/common/u/c;->c(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 192
    invoke-static {}, Lcom/facebook/common/u/c;->b()Ljava/util/regex/Pattern;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v3, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    .line 194
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-nez v1, :cond_5

    .line 195
    new-instance v0, Lcom/facebook/common/u/e;

    const-string v1, "Query parameter does not match templating syntax"

    invoke-direct {v0, v1}, Lcom/facebook/common/u/e;-><init>(Ljava/lang/String;)V

    throw v0

    .line 199
    :cond_5
    sget-object v1, Lcom/facebook/common/u/h;->STRING:Lcom/facebook/common/u/h;

    .line 201
    const-string v5, "#"

    const/4 v6, 0x1

    invoke-virtual {v3, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 202
    sget-object v1, Lcom/facebook/common/u/h;->LONG:Lcom/facebook/common/u/h;

    .line 206
    :cond_6
    :goto_4
    const/4 v5, 0x2

    invoke-virtual {v3, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v5

    .line 207
    const/4 v6, 0x3

    invoke-virtual {v3, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    .line 209
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 211
    invoke-interface {v4, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    .line 212
    new-instance v0, Lcom/facebook/common/u/e;

    const-string v1, "Duplicate template key"

    invoke-direct {v0, v1}, Lcom/facebook/common/u/e;-><init>(Ljava/lang/String;)V

    throw v0

    .line 203
    :cond_7
    const-string v5, "!"

    const/4 v6, 0x1

    invoke-virtual {v3, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 204
    sget-object v1, Lcom/facebook/common/u/h;->BOOLEAN:Lcom/facebook/common/u/h;

    goto :goto_4

    .line 215
    :cond_8
    iget-object v6, p0, Lcom/facebook/common/u/f;->c:Ljava/util/Map;

    new-instance v7, Lcom/facebook/common/u/g;

    invoke-direct {v7, p1, v5, v1, v3}, Lcom/facebook/common/u/g;-><init>(Lcom/facebook/common/u/c;Ljava/lang/String;Lcom/facebook/common/u/h;Ljava/lang/String;)V

    invoke-interface {v6, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 217
    :cond_9
    return-void
.end method


# virtual methods
.method a(Ljava/lang/String;)Lcom/facebook/common/u/i;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/facebook/common/u/i",
            "<TT;>;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    const/4 v0, 0x0

    .line 228
    invoke-static {p1}, Lcom/facebook/common/u/c;->b(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 229
    aget-object v3, v1, v0

    .line 230
    const/4 v4, 0x1

    aget-object v4, v1, v4

    .line 232
    iget-object v1, p0, Lcom/facebook/common/u/f;->d:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    .line 233
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-nez v1, :cond_0

    move-object v0, v2

    .line 269
    :goto_0
    return-object v0

    .line 237
    :cond_0
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    move v1, v0

    .line 238
    :goto_1
    iget-object v0, p0, Lcom/facebook/common/u/f;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 239
    iget-object v0, p0, Lcom/facebook/common/u/f;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/w/s;

    .line 240
    iget-object v6, v0, Lcom/facebook/common/w/s;->a:Ljava/lang/Object;

    const-class v7, Ljava/lang/Long;

    if-ne v6, v7, :cond_1

    .line 241
    iget-object v0, v0, Lcom/facebook/common/w/s;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    add-int/lit8 v6, v1, 0x1

    invoke-virtual {v3, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    invoke-virtual {v5, v0, v6, v7}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 238
    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 243
    :cond_1
    iget-object v0, v0, Lcom/facebook/common/w/s;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    add-int/lit8 v6, v1, 0x1

    invoke-virtual {v3, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v0, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 248
    :cond_2
    invoke-static {v4}, Lcom/facebook/common/u/c;->c(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 250
    iget-object v0, p0, Lcom/facebook/common/u/f;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 252
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 253
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/u/g;

    .line 254
    iget-object v6, v0, Lcom/facebook/common/u/g;->c:Ljava/lang/String;

    .line 255
    iget-boolean v7, v0, Lcom/facebook/common/u/g;->a:Z

    if-eqz v7, :cond_3

    invoke-interface {v3, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    move-object v0, v2

    .line 256
    goto :goto_0

    .line 258
    :cond_3
    invoke-interface {v3, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 260
    :goto_4
    iget-object v7, v0, Lcom/facebook/common/u/g;->d:Lcom/facebook/common/u/h;

    sget-object v8, Lcom/facebook/common/u/h;->LONG:Lcom/facebook/common/u/h;

    if-ne v7, v8, :cond_5

    .line 261
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v5, v6, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    goto :goto_3

    .line 258
    :cond_4
    iget-object v1, v0, Lcom/facebook/common/u/g;->b:Ljava/lang/String;

    goto :goto_4

    .line 262
    :cond_5
    iget-object v0, v0, Lcom/facebook/common/u/g;->d:Lcom/facebook/common/u/h;

    sget-object v7, Lcom/facebook/common/u/h;->BOOLEAN:Lcom/facebook/common/u/h;

    if-ne v0, v7, :cond_6

    .line 263
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v5, v6, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_3

    .line 265
    :cond_6
    invoke-virtual {v5, v6, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    .line 269
    :cond_7
    new-instance v0, Lcom/facebook/common/u/i;

    iget-object v1, p0, Lcom/facebook/common/u/f;->e:Ljava/lang/Object;

    invoke-direct {v0, v1, v5}, Lcom/facebook/common/u/i;-><init>(Ljava/lang/Object;Landroid/os/Bundle;)V

    goto/16 :goto_0
.end method
