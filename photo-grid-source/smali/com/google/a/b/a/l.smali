.class final Lcom/google/a/b/a/l;
.super Lcom/google/a/am;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/a/am",
        "<",
        "Ljava/util/Map",
        "<TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/a/b/a/k;

.field private final b:Lcom/google/a/am;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/a/am",
            "<TK;>;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/a/am;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/a/am",
            "<TV;>;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/a/b/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/a/b/s",
            "<+",
            "Ljava/util/Map",
            "<TK;TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/a/b/a/k;Lcom/google/a/k;Ljava/lang/reflect/Type;Lcom/google/a/am;Ljava/lang/reflect/Type;Lcom/google/a/am;Lcom/google/a/b/s;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/a/k;",
            "Ljava/lang/reflect/Type;",
            "Lcom/google/a/am",
            "<TK;>;",
            "Ljava/lang/reflect/Type;",
            "Lcom/google/a/am",
            "<TV;>;",
            "Lcom/google/a/b/s",
            "<+",
            "Ljava/util/Map",
            "<TK;TV;>;>;)V"
        }
    .end annotation

    .prologue
    .line 153
    iput-object p1, p0, Lcom/google/a/b/a/l;->a:Lcom/google/a/b/a/k;

    invoke-direct {p0}, Lcom/google/a/am;-><init>()V

    .line 154
    new-instance v0, Lcom/google/a/b/a/x;

    invoke-direct {v0, p2, p4, p3}, Lcom/google/a/b/a/x;-><init>(Lcom/google/a/k;Lcom/google/a/am;Ljava/lang/reflect/Type;)V

    iput-object v0, p0, Lcom/google/a/b/a/l;->b:Lcom/google/a/am;

    .line 156
    new-instance v0, Lcom/google/a/b/a/x;

    invoke-direct {v0, p2, p6, p5}, Lcom/google/a/b/a/x;-><init>(Lcom/google/a/k;Lcom/google/a/am;Ljava/lang/reflect/Type;)V

    iput-object v0, p0, Lcom/google/a/b/a/l;->c:Lcom/google/a/am;

    .line 158
    iput-object p7, p0, Lcom/google/a/b/a/l;->d:Lcom/google/a/b/s;

    .line 159
    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/a/d/a;)Ljava/lang/Object;
    .locals 4

    .prologue
    .line 146
    .line 1162
    invoke-virtual {p1}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    move-result-object v1

    .line 1163
    sget-object v0, Lcom/google/a/d/e;->i:Lcom/google/a/d/e;

    if-ne v1, v0, :cond_0

    .line 1164
    invoke-virtual {p1}, Lcom/google/a/d/a;->j()V

    .line 1165
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 1168
    :cond_0
    iget-object v0, p0, Lcom/google/a/b/a/l;->d:Lcom/google/a/b/s;

    invoke-interface {v0}, Lcom/google/a/b/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 1170
    sget-object v2, Lcom/google/a/d/e;->a:Lcom/google/a/d/e;

    if-ne v1, v2, :cond_3

    .line 1171
    invoke-virtual {p1}, Lcom/google/a/d/a;->a()V

    .line 1172
    :goto_1
    invoke-virtual {p1}, Lcom/google/a/d/a;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1173
    invoke-virtual {p1}, Lcom/google/a/d/a;->a()V

    .line 1174
    iget-object v1, p0, Lcom/google/a/b/a/l;->b:Lcom/google/a/am;

    invoke-virtual {v1, p1}, Lcom/google/a/am;->a(Lcom/google/a/d/a;)Ljava/lang/Object;

    move-result-object v1

    .line 1175
    iget-object v2, p0, Lcom/google/a/b/a/l;->c:Lcom/google/a/am;

    invoke-virtual {v2, p1}, Lcom/google/a/am;->a(Lcom/google/a/d/a;)Ljava/lang/Object;

    move-result-object v2

    .line 1176
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 1177
    if-eqz v2, :cond_1

    .line 1178
    new-instance v0, Lcom/google/a/ag;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "duplicate key: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/a/ag;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1180
    :cond_1
    invoke-virtual {p1}, Lcom/google/a/d/a;->b()V

    goto :goto_1

    .line 1182
    :cond_2
    invoke-virtual {p1}, Lcom/google/a/d/a;->b()V

    goto :goto_0

    .line 1184
    :cond_3
    invoke-virtual {p1}, Lcom/google/a/d/a;->c()V

    .line 1185
    :cond_4
    invoke-virtual {p1}, Lcom/google/a/d/a;->e()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 1186
    sget-object v1, Lcom/google/a/b/q;->a:Lcom/google/a/b/q;

    invoke-virtual {v1, p1}, Lcom/google/a/b/q;->a(Lcom/google/a/d/a;)V

    .line 1187
    iget-object v1, p0, Lcom/google/a/b/a/l;->b:Lcom/google/a/am;

    invoke-virtual {v1, p1}, Lcom/google/a/am;->a(Lcom/google/a/d/a;)Ljava/lang/Object;

    move-result-object v1

    .line 1188
    iget-object v2, p0, Lcom/google/a/b/a/l;->c:Lcom/google/a/am;

    invoke-virtual {v2, p1}, Lcom/google/a/am;->a(Lcom/google/a/d/a;)Ljava/lang/Object;

    move-result-object v2

    .line 1189
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 1190
    if-eqz v2, :cond_4

    .line 1191
    new-instance v0, Lcom/google/a/ag;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "duplicate key: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/a/ag;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1194
    :cond_5
    invoke-virtual {p1}, Lcom/google/a/d/a;->d()V

    goto :goto_0
.end method

.method public final synthetic a(Lcom/google/a/d/f;Ljava/lang/Object;)V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 146
    check-cast p2, Ljava/util/Map;

    .line 1200
    if-nez p2, :cond_0

    .line 1201
    invoke-virtual {p1}, Lcom/google/a/d/f;->f()Lcom/google/a/d/f;

    .line 1234
    :goto_0
    return-void

    .line 1205
    :cond_0
    iget-object v0, p0, Lcom/google/a/b/a/l;->a:Lcom/google/a/b/a/k;

    invoke-static {v0}, Lcom/google/a/b/a/k;->a(Lcom/google/a/b/a/k;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1206
    invoke-virtual {p1}, Lcom/google/a/d/f;->d()Lcom/google/a/d/f;

    .line 1207
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1208
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/google/a/d/f;->a(Ljava/lang/String;)Lcom/google/a/d/f;

    .line 1209
    iget-object v2, p0, Lcom/google/a/b/a/l;->c:Lcom/google/a/am;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, p1, v0}, Lcom/google/a/am;->a(Lcom/google/a/d/f;Ljava/lang/Object;)V

    goto :goto_1

    .line 1211
    :cond_1
    invoke-virtual {p1}, Lcom/google/a/d/f;->e()Lcom/google/a/d/f;

    goto :goto_0

    .line 1216
    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v0

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1218
    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v0

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1219
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v1, v2

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1220
    iget-object v6, p0, Lcom/google/a/b/a/l;->b:Lcom/google/a/am;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/google/a/am;->a(Ljava/lang/Object;)Lcom/google/a/x;

    move-result-object v6

    .line 1221
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1222
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2040
    instance-of v0, v6, Lcom/google/a/u;

    .line 1223
    if-nez v0, :cond_3

    .line 2049
    instance-of v0, v6, Lcom/google/a/aa;

    .line 1223
    if-eqz v0, :cond_4

    :cond_3
    const/4 v0, 0x1

    :goto_3
    or-int/2addr v0, v1

    move v1, v0

    .line 1224
    goto :goto_2

    :cond_4
    move v0, v2

    .line 1223
    goto :goto_3

    .line 1226
    :cond_5
    if-eqz v1, :cond_7

    .line 1227
    invoke-virtual {p1}, Lcom/google/a/d/f;->b()Lcom/google/a/d/f;

    .line 1228
    :goto_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_6

    .line 1229
    invoke-virtual {p1}, Lcom/google/a/d/f;->b()Lcom/google/a/d/f;

    .line 1230
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/a/x;

    invoke-static {v0, p1}, Lcom/google/a/b/u;->a(Lcom/google/a/x;Lcom/google/a/d/f;)V

    .line 1231
    iget-object v0, p0, Lcom/google/a/b/a/l;->c:Lcom/google/a/am;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/a/am;->a(Lcom/google/a/d/f;Ljava/lang/Object;)V

    .line 1232
    invoke-virtual {p1}, Lcom/google/a/d/f;->c()Lcom/google/a/d/f;

    .line 1228
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 1234
    :cond_6
    invoke-virtual {p1}, Lcom/google/a/d/f;->c()Lcom/google/a/d/f;

    goto/16 :goto_0

    .line 1236
    :cond_7
    invoke-virtual {p1}, Lcom/google/a/d/f;->d()Lcom/google/a/d/f;

    .line 1237
    :goto_5
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_d

    .line 1238
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/a/x;

    .line 3058
    instance-of v1, v0, Lcom/google/a/ad;

    .line 2247
    if-eqz v1, :cond_b

    .line 2248
    invoke-virtual {v0}, Lcom/google/a/x;->k()Lcom/google/a/ad;

    move-result-object v0

    .line 2249
    invoke-virtual {v0}, Lcom/google/a/ad;->l()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 2250
    invoke-virtual {v0}, Lcom/google/a/ad;->b()Ljava/lang/Number;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 1239
    :goto_6
    invoke-virtual {p1, v0}, Lcom/google/a/d/f;->a(Ljava/lang/String;)Lcom/google/a/d/f;

    .line 1240
    iget-object v0, p0, Lcom/google/a/b/a/l;->c:Lcom/google/a/am;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/a/am;->a(Lcom/google/a/d/f;Ljava/lang/Object;)V

    .line 1237
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    .line 2251
    :cond_8
    invoke-virtual {v0}, Lcom/google/a/ad;->a()Z

    move-result v1

    if-eqz v1, :cond_9

    .line 2252
    invoke-virtual {v0}, Lcom/google/a/ad;->h()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    .line 2253
    :cond_9
    invoke-virtual {v0}, Lcom/google/a/ad;->m()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 2254
    invoke-virtual {v0}, Lcom/google/a/ad;->c()Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    .line 2256
    :cond_a
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 3068
    :cond_b
    instance-of v0, v0, Lcom/google/a/z;

    .line 2258
    if-eqz v0, :cond_c

    .line 2259
    const-string v0, "null"

    goto :goto_6

    .line 2261
    :cond_c
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1242
    :cond_d
    invoke-virtual {p1}, Lcom/google/a/d/f;->e()Lcom/google/a/d/f;

    goto/16 :goto_0
.end method
