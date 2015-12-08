.class public abstract Lcom/kik/cache/z;
.super Lcom/android/volley/toolbox/m;
.source "SourceFile"

# interfaces
.implements Lcom/kik/cache/au;


# static fields
.field public static final a:Landroid/graphics/Bitmap$Config;

.field public static final d:Lcom/android/volley/r$a;

.field public static final e:Lcom/android/volley/r$b;


# instance fields
.field b:Lcom/android/volley/r$b;

.field c:Lcom/android/volley/r$a;

.field private f:Ljava/util/ArrayList;

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    sput-object v0, Lcom/kik/cache/z;->a:Landroid/graphics/Bitmap$Config;

    .line 30
    new-instance v0, Lcom/kik/cache/aa;

    invoke-direct {v0}, Lcom/kik/cache/aa;-><init>()V

    sput-object v0, Lcom/kik/cache/z;->d:Lcom/android/volley/r$a;

    .line 37
    new-instance v0, Lcom/kik/cache/ab;

    invoke-direct {v0}, Lcom/kik/cache/ab;-><init>()V

    sput-object v0, Lcom/kik/cache/z;->e:Lcom/android/volley/r$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/String;Lcom/android/volley/r$b;IILandroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;)V
    .locals 7

    .prologue
    .line 47
    if-eqz p3, :cond_0

    move-object v2, p3

    :goto_0
    if-eqz p7, :cond_1

    move-object v6, p7

    :goto_1
    move-object v0, p0

    move-object v1, p2

    move v3, p4

    move v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v6}, Lcom/android/volley/toolbox/m;-><init>(Ljava/lang/String;Lcom/android/volley/r$b;IILandroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;)V

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kik/cache/z;->f:Ljava/util/ArrayList;

    .line 25
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cache/z;->g:Z

    .line 48
    iput-object p1, p0, Lcom/kik/cache/z;->i:Ljava/lang/Object;

    .line 49
    return-void

    .line 47
    :cond_0
    sget-object v2, Lcom/kik/cache/z;->e:Lcom/android/volley/r$b;

    goto :goto_0

    :cond_1
    sget-object v6, Lcom/kik/cache/z;->d:Lcom/android/volley/r$a;

    goto :goto_1
.end method


# virtual methods
.method protected a(Lcom/android/volley/k;)Lcom/android/volley/r;
    .locals 2

    .prologue
    .line 137
    invoke-virtual {p0}, Lcom/kik/cache/z;->w()Z

    move-result v0

    if-nez v0, :cond_0

    .line 138
    new-instance v0, Ljava/lang/IllegalAccessError;

    const-string v1, "Non-nework sublclasses must not call through the super."

    invoke-direct {v0, v1}, Ljava/lang/IllegalAccessError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 140
    :cond_0
    invoke-super {p0, p1}, Lcom/android/volley/toolbox/m;->a(Lcom/android/volley/k;)Lcom/android/volley/r;

    move-result-object v0

    return-object v0
.end method

.method public a(II)Ljava/lang/String;
    .locals 3

    .prologue
    .line 190
    invoke-virtual {p0}, Lcom/kik/cache/z;->d()Ljava/lang/String;

    move-result-object v0

    .line 191
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0xc

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "#W"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "#H"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final a(Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    .line 85
    const/4 v0, 0x0

    .line 87
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/kik/cache/z;->b(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 92
    :goto_0
    invoke-super {p0, v0}, Lcom/android/volley/toolbox/m;->a(Landroid/graphics/Bitmap;)V

    .line 93
    iget-object v1, p0, Lcom/kik/cache/z;->b:Lcom/android/volley/r$b;

    if-eqz v1, :cond_0

    .line 94
    iget-object v1, p0, Lcom/kik/cache/z;->b:Lcom/android/volley/r$b;

    invoke-interface {v1, v0}, Lcom/android/volley/r$b;->a(Ljava/lang/Object;)V

    .line 96
    :cond_0
    return-void

    .line 89
    :catch_0
    move-exception v1

    invoke-static {v1}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final a(Lcom/kik/g/as;)V
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lcom/kik/cache/z;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 60
    if-eqz p1, :cond_0

    const-string v0, "network-http-complete"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/cache/z;->g:Z

    .line 63
    :cond_0
    invoke-super {p0, p1}, Lcom/android/volley/toolbox/m;->a(Ljava/lang/String;)V

    .line 64
    return-void
.end method

.method public final a_(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 210
    iput-object p1, p0, Lcom/kik/cache/z;->h:Ljava/lang/String;

    .line 211
    return-void
.end method

.method protected final b(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    .line 114
    iget-object v0, p0, Lcom/kik/cache/z;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/g/as;

    .line 115
    if-eqz v0, :cond_0

    .line 116
    invoke-interface {v0, p1}, Lcom/kik/g/as;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    move-object p1, v0

    goto :goto_0

    .line 119
    :cond_1
    return-object p1
.end method

.method public b(Lcom/android/volley/b$a;)Lcom/android/volley/b$a;
    .locals 4

    .prologue
    const-wide/32 v2, 0x1d4c0

    .line 167
    if-nez p1, :cond_0

    .line 168
    new-instance p1, Lcom/android/volley/b$a;

    invoke-direct {p1}, Lcom/android/volley/b$a;-><init>()V

    .line 169
    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p1, Lcom/android/volley/b$a;->a:[B

    .line 170
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    add-long/2addr v0, v2

    iput-wide v0, p1, Lcom/android/volley/b$a;->e:J

    .line 171
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    add-long/2addr v0, v2

    iput-wide v0, p1, Lcom/android/volley/b$a;->d:J

    .line 181
    :goto_0
    return-object p1

    .line 175
    :cond_0
    invoke-virtual {p1}, Lcom/android/volley/b$a;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 177
    const/4 p1, 0x0

    goto :goto_0

    .line 179
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    add-long/2addr v0, v2

    iput-wide v0, p1, Lcom/android/volley/b$a;->e:J

    .line 180
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    add-long/2addr v0, v2

    iput-wide v0, p1, Lcom/android/volley/b$a;->d:J

    goto :goto_0
.end method

.method public final b(Lcom/android/volley/w;)V
    .locals 1

    .prologue
    .line 106
    invoke-super {p0, p1}, Lcom/android/volley/toolbox/m;->b(Lcom/android/volley/w;)V

    .line 107
    iget-object v0, p0, Lcom/kik/cache/z;->c:Lcom/android/volley/r$a;

    if-eqz v0, :cond_0

    .line 108
    iget-object v0, p0, Lcom/kik/cache/z;->c:Lcom/android/volley/r$a;

    invoke-interface {v0, p1}, Lcom/android/volley/r$a;->a(Lcom/android/volley/w;)V

    .line 110
    :cond_0
    return-void
.end method

.method protected final synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 19
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/kik/cache/z;->a(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 198
    iget-object v0, p0, Lcom/kik/cache/z;->h:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cache/z;->h:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0}, Lcom/android/volley/toolbox/m;->d()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public e_()Z
    .locals 1

    .prologue
    .line 156
    const/4 v0, 0x1

    return v0
.end method

.method public final t()Ljava/lang/String;
    .locals 1

    .prologue
    .line 204
    invoke-super {p0}, Lcom/android/volley/toolbox/m;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v()Z
    .locals 1

    .prologue
    .line 53
    iget-boolean v0, p0, Lcom/kik/cache/z;->g:Z

    return v0
.end method

.method public w()Z
    .locals 1

    .prologue
    .line 131
    const/4 v0, 0x1

    return v0
.end method

.method protected final x()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 145
    iget-object v0, p0, Lcom/kik/cache/z;->i:Ljava/lang/Object;

    return-object v0
.end method
