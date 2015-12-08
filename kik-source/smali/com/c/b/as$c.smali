.class public abstract Lcom/c/b/as$c;
.super Lcom/c/b/as$a;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/as$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/as;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# instance fields
.field private a:Lcom/c/b/ar;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 1015
    invoke-direct {p0}, Lcom/c/b/as$a;-><init>()V

    .line 1013
    invoke-static {}, Lcom/c/b/ar;->b()Lcom/c/b/ar;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$c;->a:Lcom/c/b/ar;

    .line 1015
    return-void
.end method

.method protected constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 1019
    invoke-direct {p0, p1}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 1013
    invoke-static {}, Lcom/c/b/ar;->b()Lcom/c/b/ar;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$c;->a:Lcom/c/b/ar;

    .line 1020
    return-void
.end method

.method static synthetic a(Lcom/c/b/as$c;)Lcom/c/b/ar;
    .locals 1

    .prologue
    .line 1007
    iget-object v0, p0, Lcom/c/b/as$c;->a:Lcom/c/b/ar;

    invoke-virtual {v0}, Lcom/c/b/ar;->c()V

    iget-object v0, p0, Lcom/c/b/as$c;->a:Lcom/c/b/ar;

    return-object v0
.end method

.method private d(Lcom/c/b/ak$f;)V
    .locals 2

    .prologue
    .line 1333
    invoke-virtual {p1}, Lcom/c/b/ak$f;->t()Lcom/c/b/ak$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/c/b/as$c;->e()Lcom/c/b/ak$a;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 1334
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "FieldDescriptor does not match message type."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1337
    :cond_0
    return-void
.end method

.method private e(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/as$c;
    .locals 1

    .prologue
    .line 1274
    invoke-virtual {p1}, Lcom/c/b/ak$f;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1275
    invoke-direct {p0, p1}, Lcom/c/b/as$c;->d(Lcom/c/b/ak$f;)V

    .line 1276
    invoke-direct {p0}, Lcom/c/b/as$c;->s()V

    .line 1277
    iget-object v0, p0, Lcom/c/b/as$c;->a:Lcom/c/b/ar;

    invoke-virtual {v0, p1, p2}, Lcom/c/b/ar;->a(Lcom/c/b/ar$a;Ljava/lang/Object;)V

    .line 1278
    invoke-virtual {p0}, Lcom/c/b/as$c;->q()V

    .line 1281
    :goto_0
    return-object p0

    :cond_0
    invoke-super {p0, p1, p2}, Lcom/c/b/as$a;->c(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/as$a;

    move-result-object v0

    check-cast v0, Lcom/c/b/as$c;

    move-object p0, v0

    goto :goto_0
.end method

.method private f(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/as$c;
    .locals 1

    .prologue
    .line 1315
    invoke-virtual {p1}, Lcom/c/b/ak$f;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1316
    invoke-direct {p0, p1}, Lcom/c/b/as$c;->d(Lcom/c/b/ak$f;)V

    .line 1317
    invoke-direct {p0}, Lcom/c/b/as$c;->s()V

    .line 1318
    iget-object v0, p0, Lcom/c/b/as$c;->a:Lcom/c/b/ar;

    invoke-virtual {v0, p1, p2}, Lcom/c/b/ar;->b(Lcom/c/b/ar$a;Ljava/lang/Object;)V

    .line 1319
    invoke-virtual {p0}, Lcom/c/b/as$c;->q()V

    .line 1322
    :goto_0
    return-object p0

    :cond_0
    invoke-super {p0, p1, p2}, Lcom/c/b/as$a;->d(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/as$a;

    move-result-object v0

    check-cast v0, Lcom/c/b/as$c;

    move-object p0, v0

    goto :goto_0
.end method

.method private s()V
    .locals 1

    .prologue
    .line 1042
    iget-object v0, p0, Lcom/c/b/as$c;->a:Lcom/c/b/ar;

    invoke-virtual {v0}, Lcom/c/b/ar;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1043
    iget-object v0, p0, Lcom/c/b/as$c;->a:Lcom/c/b/ar;

    invoke-virtual {v0}, Lcom/c/b/ar;->e()Lcom/c/b/ar;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$c;->a:Lcom/c/b/ar;

    .line 1045
    :cond_0
    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 1006
    invoke-direct {p0, p1, p2}, Lcom/c/b/as$c;->f(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/as$c;

    move-result-object v0

    return-object v0
.end method

.method protected final a(Lcom/c/b/as$d;)V
    .locals 2

    .prologue
    .line 1327
    invoke-direct {p0}, Lcom/c/b/as$c;->s()V

    .line 1328
    iget-object v0, p0, Lcom/c/b/as$c;->a:Lcom/c/b/ar;

    invoke-static {p1}, Lcom/c/b/as$d;->a(Lcom/c/b/as$d;)Lcom/c/b/ar;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/c/b/ar;->a(Lcom/c/b/ar;)V

    .line 1329
    invoke-virtual {p0}, Lcom/c/b/as$c;->q()V

    .line 1330
    return-void
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 1191
    invoke-super {p0}, Lcom/c/b/as$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/c/b/as$c;->a:Lcom/c/b/ar;

    invoke-virtual {v0}, Lcom/c/b/ar;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Lcom/c/b/ak$f;)Z
    .locals 1

    .prologue
    .line 1263
    invoke-virtual {p1}, Lcom/c/b/ak$f;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1264
    invoke-direct {p0, p1}, Lcom/c/b/as$c;->d(Lcom/c/b/ak$f;)V

    .line 1265
    iget-object v0, p0, Lcom/c/b/as$c;->a:Lcom/c/b/ar;

    invoke-virtual {v0, p1}, Lcom/c/b/ar;->a(Lcom/c/b/ar$a;)Z

    move-result v0

    .line 1267
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/ak$f;)Z

    move-result v0

    goto :goto_0
.end method

.method public final synthetic b()Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 1006
    invoke-super {p0}, Lcom/c/b/as$a;->o()Lcom/c/b/as$a;

    move-result-object v0

    check-cast v0, Lcom/c/b/as$c;

    return-object v0
.end method

.method public final synthetic b(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 1006
    invoke-direct {p0, p1, p2}, Lcom/c/b/as$c;->e(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/as$c;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lcom/c/b/ak$f;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 1221
    invoke-virtual {p1}, Lcom/c/b/ak$f;->s()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1222
    invoke-direct {p0, p1}, Lcom/c/b/as$c;->d(Lcom/c/b/ak$f;)V

    .line 1223
    iget-object v0, p0, Lcom/c/b/as$c;->a:Lcom/c/b/ar;

    invoke-virtual {v0, p1}, Lcom/c/b/ar;->b(Lcom/c/b/ar$a;)Ljava/lang/Object;

    move-result-object v0

    .line 1224
    if-nez v0, :cond_0

    .line 1225
    invoke-virtual {p1}, Lcom/c/b/ak$f;->f()Lcom/c/b/ak$f$a;

    move-result-object v0

    sget-object v1, Lcom/c/b/ak$f$a;->i:Lcom/c/b/ak$f$a;

    if-ne v0, v1, :cond_1

    .line 1228
    invoke-virtual {p1}, Lcom/c/b/ak$f;->w()Lcom/c/b/ak$a;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/al;->a(Lcom/c/b/ak$a;)Lcom/c/b/al;

    move-result-object v0

    .line 1236
    :cond_0
    :goto_0
    return-object v0

    .line 1230
    :cond_1
    invoke-virtual {p1}, Lcom/c/b/ak$f;->r()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    .line 1236
    :cond_2
    invoke-super {p0, p1}, Lcom/c/b/as$a;->b(Lcom/c/b/ak$f;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public final synthetic c(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/as$a;
    .locals 1

    .prologue
    .line 1006
    invoke-direct {p0, p1, p2}, Lcom/c/b/as$c;->e(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/as$c;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c()Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 1006
    invoke-super {p0}, Lcom/c/b/as$a;->o()Lcom/c/b/as$a;

    move-result-object v0

    check-cast v0, Lcom/c/b/as$c;

    return-object v0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1006
    invoke-super {p0}, Lcom/c/b/as$a;->o()Lcom/c/b/as$a;

    move-result-object v0

    check-cast v0, Lcom/c/b/as$c;

    return-object v0
.end method

.method public final synthetic d(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/as$a;
    .locals 1

    .prologue
    .line 1006
    invoke-direct {p0, p1, p2}, Lcom/c/b/as$c;->f(Lcom/c/b/ak$f;Ljava/lang/Object;)Lcom/c/b/as$c;

    move-result-object v0

    return-object v0
.end method

.method public final d_()Ljava/util/Map;
    .locals 2

    .prologue
    .line 1214
    invoke-static {p0}, Lcom/c/b/as$a;->a(Lcom/c/b/as$a;)Ljava/util/Map;

    move-result-object v0

    .line 1215
    iget-object v1, p0, Lcom/c/b/as$c;->a:Lcom/c/b/ar;

    invoke-virtual {v1}, Lcom/c/b/ar;->f()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 1216
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic o()Lcom/c/b/as$a;
    .locals 1

    .prologue
    .line 1006
    invoke-super {p0}, Lcom/c/b/as$a;->o()Lcom/c/b/as$a;

    move-result-object v0

    check-cast v0, Lcom/c/b/as$c;

    return-object v0
.end method

.method protected final r()Z
    .locals 1

    .prologue
    .line 1177
    iget-object v0, p0, Lcom/c/b/as$c;->a:Lcom/c/b/ar;

    invoke-virtual {v0}, Lcom/c/b/ar;->h()Z

    move-result v0

    return v0
.end method
