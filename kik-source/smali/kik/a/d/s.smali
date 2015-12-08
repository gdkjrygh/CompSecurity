.class public final Lkik/a/d/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/a/d/s$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Z

.field private d:I

.field private e:I

.field private f:Ljava/lang/String;

.field private g:Z

.field private h:Z

.field private i:Ljava/util/List;

.field private j:Ljava/util/Vector;

.field private k:J

.field private l:Z

.field private m:[B

.field private n:J

.field private o:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JIZI[B)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 148
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-boolean v0, p0, Lkik/a/d/s;->g:Z

    .line 25
    iput-boolean v0, p0, Lkik/a/d/s;->h:Z

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/a/d/s;->i:Ljava/util/List;

    .line 80
    sget v0, Lkik/a/d/s$a;->a:I

    iput v0, p0, Lkik/a/d/s;->o:I

    .line 149
    iput-object p1, p0, Lkik/a/d/s;->a:Ljava/lang/String;

    .line 150
    iput-object p2, p0, Lkik/a/d/s;->b:Ljava/lang/String;

    .line 151
    iput-boolean p3, p0, Lkik/a/d/s;->c:Z

    .line 152
    iput p7, p0, Lkik/a/d/s;->d:I

    .line 153
    iput-object p4, p0, Lkik/a/d/s;->f:Ljava/lang/String;

    .line 154
    iput-wide p5, p0, Lkik/a/d/s;->k:J

    .line 155
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lkik/a/d/s;->j:Ljava/util/Vector;

    .line 156
    iput-boolean p8, p0, Lkik/a/d/s;->g:Z

    .line 157
    iput p9, p0, Lkik/a/d/s;->e:I

    .line 158
    iput-object p10, p0, Lkik/a/d/s;->m:[B

    .line 159
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JI[B)V
    .locals 11

    .prologue
    .line 139
    const/4 v10, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-wide/from16 v6, p5

    move/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v10}, Lkik/a/d/s;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JI[BB)V

    .line 140
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JI[BB)V
    .locals 13

    .prologue
    .line 144
    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-wide/from16 v6, p5

    move/from16 v8, p7

    move-object/from16 v11, p8

    invoke-direct/range {v1 .. v11}, Lkik/a/d/s;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JIZI[B)V

    .line 145
    return-void
.end method

.method public static a(Ljava/lang/String;)Lkik/a/d/s;
    .locals 1

    .prologue
    .line 84
    sget v0, Lkik/a/d/s$a;->a:I

    invoke-static {p0, v0}, Lkik/a/d/s;->a(Ljava/lang/String;I)Lkik/a/d/s;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/String;I)Lkik/a/d/s;
    .locals 10

    .prologue
    .line 89
    new-instance v1, Lkik/a/d/s;

    const/4 v4, 0x1

    invoke-static {}, Lkik/a/f/l;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v6

    const/16 v8, 0x64

    const/4 v9, 0x0

    move-object v2, p0

    move-object v3, p0

    invoke-direct/range {v1 .. v9}, Lkik/a/d/s;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JI[B)V

    .line 90
    iput p1, v1, Lkik/a/d/s;->o:I

    .line 91
    return-object v1
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;I)Lkik/a/d/s;
    .locals 2

    .prologue
    .line 106
    invoke-static {p1, p2}, Lkik/a/d/s;->a(Ljava/lang/String;I)Lkik/a/d/s;

    move-result-object v0

    .line 107
    new-instance v1, Lkik/a/d/a/h;

    invoke-direct {v1, p0}, Lkik/a/d/a/h;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lkik/a/d/s;->a(Lkik/a/d/a/g;)V

    .line 108
    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J[B)Lkik/a/d/s;
    .locals 11

    .prologue
    .line 96
    new-instance v1, Lkik/a/d/s;

    const/4 v4, 0x0

    const/16 v8, 0x190

    move-object v2, p0

    move-object v3, p1

    move-object v5, p2

    move-wide v6, p3

    move-object/from16 v9, p5

    invoke-direct/range {v1 .. v9}, Lkik/a/d/s;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JI[B)V

    return-object v1
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 173
    const-class v0, Lkik/a/d/a/h;

    invoke-static {p0, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/h;

    .line 174
    if-eqz v0, :cond_0

    .line 175
    invoke-virtual {v0}, Lkik/a/d/a/h;->a()Ljava/lang/String;

    move-result-object v0

    .line 185
    :goto_0
    return-object v0

    .line 177
    :cond_0
    const-class v0, Lkik/a/d/a/m;

    invoke-static {p0, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/m;

    .line 178
    if-eqz v0, :cond_1

    .line 179
    invoke-virtual {v0}, Lkik/a/d/a/m;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 181
    :cond_1
    const-class v0, Lkik/a/d/a/l;

    invoke-static {p0, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/l;

    .line 182
    if-eqz v0, :cond_2

    .line 183
    invoke-virtual {v0}, Lkik/a/d/a/l;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 185
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final a(I)V
    .locals 1

    .prologue
    .line 163
    const/16 v0, -0x64

    if-ne p1, v0, :cond_1

    .line 164
    iput p1, p0, Lkik/a/d/s;->d:I

    .line 169
    :cond_0
    :goto_0
    return-void

    .line 166
    :cond_1
    iget v0, p0, Lkik/a/d/s;->d:I

    if-le p1, v0, :cond_0

    .line 167
    iput p1, p0, Lkik/a/d/s;->d:I

    goto :goto_0
.end method

.method public final a(J)V
    .locals 1

    .prologue
    .line 305
    iput-wide p1, p0, Lkik/a/d/s;->n:J

    .line 306
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 310
    iput-object p1, p0, Lkik/a/d/s;->i:Ljava/util/List;

    .line 311
    return-void
.end method

.method public final a(Lkik/a/d/a/g;)V
    .locals 1

    .prologue
    .line 272
    iget-object v0, p0, Lkik/a/d/s;->j:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 273
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 247
    iput-boolean p1, p0, Lkik/a/d/s;->g:Z

    .line 248
    return-void
.end method

.method public final a([B)V
    .locals 0

    .prologue
    .line 295
    iput-object p1, p0, Lkik/a/d/s;->m:[B

    .line 296
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Lkik/a/d/s;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final b(Z)V
    .locals 0

    .prologue
    .line 257
    iput-boolean p1, p0, Lkik/a/d/s;->l:Z

    .line 258
    return-void
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 195
    iget v0, p0, Lkik/a/d/s;->d:I

    return v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 200
    iget-boolean v0, p0, Lkik/a/d/s;->c:Z

    return v0
.end method

.method public final e()J
    .locals 2

    .prologue
    .line 211
    iget-wide v0, p0, Lkik/a/d/s;->k:J

    return-wide v0
.end method

.method public final f()I
    .locals 1

    .prologue
    .line 216
    iget v0, p0, Lkik/a/d/s;->e:I

    return v0
.end method

.method public final g()V
    .locals 1

    .prologue
    .line 221
    iget v0, p0, Lkik/a/d/s;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lkik/a/d/s;->e:I

    .line 222
    return-void
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 229
    iget-object v0, p0, Lkik/a/d/s;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 237
    iget-object v0, p0, Lkik/a/d/s;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Z
    .locals 1

    .prologue
    .line 252
    iget-boolean v0, p0, Lkik/a/d/s;->g:Z

    return v0
.end method

.method public final k()Z
    .locals 1

    .prologue
    .line 262
    iget-boolean v0, p0, Lkik/a/d/s;->l:Z

    return v0
.end method

.method public final l()Ljava/util/Vector;
    .locals 1

    .prologue
    .line 267
    iget-object v0, p0, Lkik/a/d/s;->j:Ljava/util/Vector;

    return-object v0
.end method

.method public final m()Z
    .locals 1

    .prologue
    .line 280
    iget-boolean v0, p0, Lkik/a/d/s;->h:Z

    return v0
.end method

.method public final n()V
    .locals 1

    .prologue
    .line 285
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/a/d/s;->h:Z

    .line 286
    return-void
.end method

.method public final o()[B
    .locals 1

    .prologue
    .line 290
    iget-object v0, p0, Lkik/a/d/s;->m:[B

    return-object v0
.end method

.method public final p()J
    .locals 2

    .prologue
    .line 300
    iget-wide v0, p0, Lkik/a/d/s;->n:J

    return-wide v0
.end method

.method public final q()Ljava/util/List;
    .locals 1

    .prologue
    .line 315
    iget-object v0, p0, Lkik/a/d/s;->i:Ljava/util/List;

    return-object v0
.end method

.method public final r()I
    .locals 1

    .prologue
    .line 325
    iget v0, p0, Lkik/a/d/s;->o:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 206
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "message: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lkik/a/d/s;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
