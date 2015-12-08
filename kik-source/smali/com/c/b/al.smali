.class public final Lcom/c/b/al;
.super Lcom/c/b/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/al$a;
    }
.end annotation


# instance fields
.field private final c:Lcom/c/b/ak$a;

.field private final d:Lcom/c/b/ar;

.field private final e:[Lcom/c/b/ak$f;

.field private final f:Lcom/c/b/by;

.field private g:I


# direct methods
.method constructor <init>(Lcom/c/b/ak$a;Lcom/c/b/ar;[Lcom/c/b/ak$f;Lcom/c/b/by;)V
    .locals 1

    .prologue
    .line 68
    invoke-direct {p0}, Lcom/c/b/a;-><init>()V

    .line 55
    const/4 v0, -0x1

    iput v0, p0, Lcom/c/b/al;->g:I

    .line 69
    iput-object p1, p0, Lcom/c/b/al;->c:Lcom/c/b/ak$a;

    .line 70
    iput-object p2, p0, Lcom/c/b/al;->d:Lcom/c/b/ar;

    .line 71
    iput-object p3, p0, Lcom/c/b/al;->e:[Lcom/c/b/ak$f;

    .line 72
    iput-object p4, p0, Lcom/c/b/al;->f:Lcom/c/b/by;

    .line 73
    return-void
.end method

.method static synthetic a(Lcom/c/b/al;)Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/c/b/al;->c:Lcom/c/b/ak$a;

    return-object v0
.end method

.method public static a(Lcom/c/b/ak$a;)Lcom/c/b/al;
    .locals 4

    .prologue
    .line 80
    invoke-virtual {p0}, Lcom/c/b/ak$a;->a()Lcom/c/b/i$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/i$a;->o()I

    move-result v0

    .line 81
    new-array v0, v0, [Lcom/c/b/ak$f;

    .line 82
    new-instance v1, Lcom/c/b/al;

    invoke-static {}, Lcom/c/b/ar;->b()Lcom/c/b/ar;

    move-result-object v2

    invoke-static {}, Lcom/c/b/by;->e()Lcom/c/b/by;

    move-result-object v3

    invoke-direct {v1, p0, v2, v0, v3}, Lcom/c/b/al;-><init>(Lcom/c/b/ak$a;Lcom/c/b/ar;[Lcom/c/b/ak$f;Lcom/c/b/by;)V

    return-object v1
.end method

.method static a(Lcom/c/b/ak$a;Lcom/c/b/ar;)Z
    .locals 3

    .prologue
    .line 222
    invoke-virtual {p0}, Lcom/c/b/ak$a;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$f;

    .line 223
    invoke-virtual {v0}, Lcom/c/b/ak$f;->m()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 224
    invoke-virtual {p1, v0}, Lcom/c/b/ar;->a(Lcom/c/b/ar$a;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 225
    const/4 v0, 0x0

    .line 231
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p1}, Lcom/c/b/ar;->h()Z

    move-result v0

    goto :goto_0
.end method

.method public static b(Lcom/c/b/ak$a;)Lcom/c/b/al$a;
    .locals 2

    .prologue
    .line 145
    new-instance v0, Lcom/c/b/al$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/c/b/al$a;-><init>(Lcom/c/b/ak$a;B)V

    return-object v0
.end method

.method static synthetic b(Lcom/c/b/al;)Lcom/c/b/ar;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/c/b/al;->d:Lcom/c/b/ar;

    return-object v0
.end method

.method static synthetic c(Lcom/c/b/al;)Lcom/c/b/by;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/c/b/al;->f:Lcom/c/b/by;

    return-object v0
.end method

.method private c(Lcom/c/b/ak$f;)V
    .locals 2

    .prologue
    .line 297
    invoke-virtual {p1}, Lcom/c/b/ak$f;->t()Lcom/c/b/ak$a;

    move-result-object v0

    iget-object v1, p0, Lcom/c/b/al;->c:Lcom/c/b/ak$a;

    if-eq v0, v1, :cond_0

    .line 298
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "FieldDescriptor does not match message type."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 301
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/c/b/al;)[Lcom/c/b/ak$f;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/c/b/al;->e:[Lcom/c/b/ak$f;

    return-object v0
.end method

.method private h()Lcom/c/b/al$a;
    .locals 3

    .prologue
    .line 268
    new-instance v0, Lcom/c/b/al$a;

    iget-object v1, p0, Lcom/c/b/al;->c:Lcom/c/b/ak$a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/c/b/al$a;-><init>(Lcom/c/b/ak$a;B)V

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/c/b/h;)V
    .locals 1

    .prologue
    .line 241
    iget-object v0, p0, Lcom/c/b/al;->c:Lcom/c/b/ak$a;

    invoke-virtual {v0}, Lcom/c/b/ak$a;->e()Lcom/c/b/i$s;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/i$s;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 242
    iget-object v0, p0, Lcom/c/b/al;->d:Lcom/c/b/ar;

    invoke-virtual {v0, p1}, Lcom/c/b/ar;->b(Lcom/c/b/h;)V

    .line 243
    iget-object v0, p0, Lcom/c/b/al;->f:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->b(Lcom/c/b/h;)V

    .line 248
    :goto_0
    return-void

    .line 245
    :cond_0
    iget-object v0, p0, Lcom/c/b/al;->d:Lcom/c/b/ar;

    invoke-virtual {v0, p1}, Lcom/c/b/ar;->a(Lcom/c/b/h;)V

    .line 246
    iget-object v0, p0, Lcom/c/b/al;->f:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    goto :goto_0
.end method

.method public final a()Z
    .locals 2

    .prologue
    .line 236
    iget-object v0, p0, Lcom/c/b/al;->c:Lcom/c/b/ak$a;

    iget-object v1, p0, Lcom/c/b/al;->d:Lcom/c/b/ar;

    invoke-static {v0, v1}, Lcom/c/b/al;->a(Lcom/c/b/ak$a;Lcom/c/b/ar;)Z

    move-result v0

    return v0
.end method

.method public final a(Lcom/c/b/ak$f;)Z
    .locals 1

    .prologue
    .line 186
    invoke-direct {p0, p1}, Lcom/c/b/al;->c(Lcom/c/b/ak$f;)V

    .line 187
    iget-object v0, p0, Lcom/c/b/al;->d:Lcom/c/b/ar;

    invoke-virtual {v0, p1}, Lcom/c/b/ar;->a(Lcom/c/b/ar$a;)Z

    move-result v0

    return v0
.end method

.method public final b()I
    .locals 2

    .prologue
    .line 252
    iget v0, p0, Lcom/c/b/al;->g:I

    .line 253
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 264
    :goto_0
    return v0

    .line 255
    :cond_0
    iget-object v0, p0, Lcom/c/b/al;->c:Lcom/c/b/ak$a;

    invoke-virtual {v0}, Lcom/c/b/ak$a;->e()Lcom/c/b/i$s;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/i$s;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 256
    iget-object v0, p0, Lcom/c/b/al;->d:Lcom/c/b/ar;

    invoke-virtual {v0}, Lcom/c/b/ar;->j()I

    move-result v0

    .line 257
    iget-object v1, p0, Lcom/c/b/al;->f:Lcom/c/b/by;

    invoke-virtual {v1}, Lcom/c/b/by;->g()I

    move-result v1

    add-int/2addr v0, v1

    .line 263
    :goto_1
    iput v0, p0, Lcom/c/b/al;->g:I

    goto :goto_0

    .line 259
    :cond_1
    iget-object v0, p0, Lcom/c/b/al;->d:Lcom/c/b/ar;

    invoke-virtual {v0}, Lcom/c/b/ar;->i()I

    move-result v0

    .line 260
    iget-object v1, p0, Lcom/c/b/al;->f:Lcom/c/b/by;

    invoke-virtual {v1}, Lcom/c/b/by;->b()I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_1
.end method

.method public final b(Lcom/c/b/ak$f;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 191
    invoke-direct {p0, p1}, Lcom/c/b/al;->c(Lcom/c/b/ak$f;)V

    .line 192
    iget-object v0, p0, Lcom/c/b/al;->d:Lcom/c/b/ar;

    invoke-virtual {v0, p1}, Lcom/c/b/ar;->b(Lcom/c/b/ar$a;)Ljava/lang/Object;

    move-result-object v0

    .line 193
    if-nez v0, :cond_0

    .line 194
    invoke-virtual {p1}, Lcom/c/b/ak$f;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 195
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    .line 202
    :cond_0
    :goto_0
    return-object v0

    .line 196
    :cond_1
    invoke-virtual {p1}, Lcom/c/b/ak$f;->f()Lcom/c/b/ak$f$a;

    move-result-object v0

    sget-object v1, Lcom/c/b/ak$f$a;->i:Lcom/c/b/ak$f$a;

    if-ne v0, v1, :cond_2

    .line 197
    invoke-virtual {p1}, Lcom/c/b/ak$f;->w()Lcom/c/b/ak$a;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/al;->a(Lcom/c/b/ak$a;)Lcom/c/b/al;

    move-result-object v0

    goto :goto_0

    .line 199
    :cond_2
    invoke-virtual {p1}, Lcom/c/b/ak$f;->r()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public final d_()Ljava/util/Map;
    .locals 1

    .prologue
    .line 168
    iget-object v0, p0, Lcom/c/b/al;->d:Lcom/c/b/ar;

    invoke-virtual {v0}, Lcom/c/b/ar;->f()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lcom/c/b/al;->c:Lcom/c/b/ak$a;

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 216
    iget-object v0, p0, Lcom/c/b/al;->f:Lcom/c/b/by;

    return-object v0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 276
    new-instance v0, Lcom/c/b/am;

    invoke-direct {v0, p0}, Lcom/c/b/am;-><init>(Lcom/c/b/al;)V

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/c/b/al;->h()Lcom/c/b/al$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/c/b/al;->h()Lcom/c/b/al$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/c/b/al$a;->d(Lcom/c/b/bd;)Lcom/c/b/al$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/c/b/al;->c:Lcom/c/b/ak$a;

    invoke-static {v0}, Lcom/c/b/al;->a(Lcom/c/b/ak$a;)Lcom/c/b/al;

    move-result-object v0

    return-object v0
.end method
