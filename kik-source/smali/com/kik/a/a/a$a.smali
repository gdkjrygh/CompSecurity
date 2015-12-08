.class public final Lcom/kik/a/a/a$a;
.super Lcom/c/b/as;
.source "SourceFile"

# interfaces
.implements Lcom/kik/a/a/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/a/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/a/a/a$a$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final k:Lcom/kik/a/a/a$a;


# instance fields
.field private volatile f:Ljava/lang/Object;

.field private volatile g:Ljava/lang/Object;

.field private volatile h:Ljava/lang/Object;

.field private i:B

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 824
    new-instance v0, Lcom/kik/a/a/a$a;

    invoke-direct {v0}, Lcom/kik/a/a/a$a;-><init>()V

    sput-object v0, Lcom/kik/a/a/a$a;->k:Lcom/kik/a/a/a$a;

    .line 831
    new-instance v0, Lcom/kik/a/a/c;

    invoke-direct {v0}, Lcom/kik/a/a/c;-><init>()V

    sput-object v0, Lcom/kik/a/a/a$a;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 84
    invoke-direct {p0}, Lcom/c/b/as;-><init>()V

    .line 292
    iput-byte v0, p0, Lcom/kik/a/a/a$a;->i:B

    .line 315
    iput v0, p0, Lcom/kik/a/a/a$a;->j:I

    .line 85
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/a/a/a$a;->f:Ljava/lang/Object;

    .line 86
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/a/a/a$a;->g:Ljava/lang/Object;

    .line 87
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/a/a/a$a;->h:Ljava/lang/Object;

    .line 88
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$a;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 82
    invoke-direct {p0, p1}, Lcom/c/b/as;-><init>(Lcom/c/b/as$a;)V

    .line 292
    iput-byte v0, p0, Lcom/kik/a/a/a$a;->i:B

    .line 315
    iput v0, p0, Lcom/kik/a/a/a$a;->j:I

    .line 83
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$a;B)V
    .locals 0

    .prologue
    .line 76
    invoke-direct {p0, p1}, Lcom/kik/a/a/a$a;-><init>(Lcom/c/b/as$a;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 98
    invoke-direct {p0}, Lcom/kik/a/a/a$a;-><init>()V

    .line 99
    const/4 v0, 0x0

    .line 102
    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 103
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v2

    .line 104
    sparse-switch v2, :sswitch_data_0

    .line 109
    invoke-virtual {p1, v2}, Lcom/c/b/g;->b(I)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    .line 110
    goto :goto_0

    :sswitch_0
    move v0, v1

    .line 107
    goto :goto_0

    .line 115
    :sswitch_1
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v2

    .line 117
    iput-object v2, p0, Lcom/kik/a/a/a$a;->f:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 134
    :catch_0
    move-exception v0

    .line 135
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 141
    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/kik/a/a/a$a;->L()V

    throw v0

    .line 121
    :sswitch_2
    :try_start_2
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v2

    .line 123
    iput-object v2, p0, Lcom/kik/a/a/a$a;->g:Ljava/lang/Object;
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 136
    :catch_1
    move-exception v0

    .line 137
    :try_start_3
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Lcom/c/b/av;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/c/b/av;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 127
    :sswitch_3
    :try_start_4
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v2

    .line 129
    iput-object v2, p0, Lcom/kik/a/a/a$a;->h:Ljava/lang/Object;
    :try_end_4
    .catch Lcom/c/b/av; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    .line 141
    :cond_1
    invoke-virtual {p0}, Lcom/kik/a/a/a$a;->L()V

    .line 142
    return-void

    .line 104
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;B)V
    .locals 0

    .prologue
    .line 76
    invoke-direct {p0, p1}, Lcom/kik/a/a/a$a;-><init>(Lcom/c/b/g;)V

    return-void
.end method

.method static synthetic a(Lcom/kik/a/a/a$a;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/kik/a/a/a$a;->f:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lcom/kik/a/a/a$a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/kik/a/a/a$a;->f:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic b(Lcom/kik/a/a/a$a;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/kik/a/a/a$a;->g:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic b(Lcom/kik/a/a/a$a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/kik/a/a/a$a;->g:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic c(Lcom/kik/a/a/a$a;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/kik/a/a/a$a;->h:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic c(Lcom/kik/a/a/a$a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/kik/a/a/a$a;->h:Ljava/lang/Object;

    return-object p1
.end method

.method public static k()Lcom/kik/a/a/a$a;
    .locals 1

    .prologue
    .line 828
    sget-object v0, Lcom/kik/a/a/a$a;->k:Lcom/kik/a/a/a$a;

    return-object v0
.end method

.method static synthetic l()Z
    .locals 1

    .prologue
    .line 76
    sget-boolean v0, Lcom/kik/a/a/a$a;->d:Z

    return v0
.end method

.method private m()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 188
    iget-object v0, p0, Lcom/kik/a/a/a$a;->f:Ljava/lang/Object;

    .line 189
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 190
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 193
    iput-object v0, p0, Lcom/kik/a/a/a$a;->f:Ljava/lang/Object;

    .line 196
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private n()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 232
    iget-object v0, p0, Lcom/kik/a/a/a$a;->g:Ljava/lang/Object;

    .line 233
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 234
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 237
    iput-object v0, p0, Lcom/kik/a/a/a$a;->g:Ljava/lang/Object;

    .line 240
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private o()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 280
    iget-object v0, p0, Lcom/kik/a/a/a$a;->h:Ljava/lang/Object;

    .line 281
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 282
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 285
    iput-object v0, p0, Lcom/kik/a/a/a$a;->h:Ljava/lang/Object;

    .line 288
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private p()Lcom/kik/a/a/a$a$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 399
    sget-object v0, Lcom/kik/a/a/a$a;->k:Lcom/kik/a/a/a$a;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/kik/a/a/a$a$a;

    invoke-direct {v0, v1}, Lcom/kik/a/a/a$a$a;-><init>(B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/kik/a/a/a$a$a;

    invoke-direct {v0, v1}, Lcom/kik/a/a/a$a$a;-><init>(B)V

    invoke-virtual {v0, p0}, Lcom/kik/a/a/a$a$a;->a(Lcom/kik/a/a/a$a;)Lcom/kik/a/a/a$a$a;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 76
    new-instance v0, Lcom/kik/a/a/a$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/kik/a/a/a$a$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 2

    .prologue
    .line 304
    invoke-direct {p0}, Lcom/kik/a/a/a$a;->m()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/f;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 305
    const/4 v0, 0x1

    invoke-direct {p0}, Lcom/kik/a/a/a$a;->m()Lcom/c/b/f;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 307
    :cond_0
    invoke-direct {p0}, Lcom/kik/a/a/a$a;->n()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/f;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 308
    const/4 v0, 0x2

    invoke-direct {p0}, Lcom/kik/a/a/a$a;->n()Lcom/c/b/f;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 310
    :cond_1
    invoke-direct {p0}, Lcom/kik/a/a/a$a;->o()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/f;->d()Z

    move-result v0

    if-nez v0, :cond_2

    .line 311
    const/4 v0, 0x3

    invoke-direct {p0}, Lcom/kik/a/a/a$a;->o()Lcom/c/b/f;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 313
    :cond_2
    return-void
.end method

.method public final a()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 294
    iget-byte v1, p0, Lcom/kik/a/a/a$a;->i:B

    .line 295
    if-ne v1, v0, :cond_0

    .line 299
    :goto_0
    return v0

    .line 296
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    .line 298
    :cond_1
    iput-byte v0, p0, Lcom/kik/a/a/a$a;->i:B

    goto :goto_0
.end method

.method public final b()I
    .locals 3

    .prologue
    .line 317
    iget v0, p0, Lcom/kik/a/a/a$a;->j:I

    .line 318
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 334
    :goto_0
    return v0

    .line 320
    :cond_0
    const/4 v0, 0x0

    .line 321
    invoke-direct {p0}, Lcom/kik/a/a/a$a;->m()Lcom/c/b/f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/c/b/f;->d()Z

    move-result v1

    if-nez v1, :cond_1

    .line 322
    const/4 v0, 0x1

    invoke-direct {p0}, Lcom/kik/a/a/a$a;->m()Lcom/c/b/f;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 325
    :cond_1
    invoke-direct {p0}, Lcom/kik/a/a/a$a;->n()Lcom/c/b/f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/c/b/f;->d()Z

    move-result v1

    if-nez v1, :cond_2

    .line 326
    const/4 v1, 0x2

    invoke-direct {p0}, Lcom/kik/a/a/a$a;->n()Lcom/c/b/f;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v1

    add-int/2addr v0, v1

    .line 329
    :cond_2
    invoke-direct {p0}, Lcom/kik/a/a/a$a;->o()Lcom/c/b/f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/c/b/f;->d()Z

    move-result v1

    if-nez v1, :cond_3

    .line 330
    const/4 v1, 0x3

    invoke-direct {p0}, Lcom/kik/a/a/a$a;->o()Lcom/c/b/f;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v1

    add-int/2addr v0, v1

    .line 333
    :cond_3
    iput v0, p0, Lcom/kik/a/a/a$a;->j:I

    goto :goto_0
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 151
    invoke-static {}, Lcom/kik/a/a/a;->b()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/kik/a/a/a$a;

    const-class v2, Lcom/kik/a/a/a$a$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 93
    invoke-static {}, Lcom/c/b/by;->e()Lcom/c/b/by;

    move-result-object v0

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 2

    .prologue
    .line 166
    iget-object v0, p0, Lcom/kik/a/a/a$a;->f:Ljava/lang/Object;

    .line 167
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 168
    check-cast v0, Ljava/lang/String;

    .line 176
    :goto_0
    return-object v0

    .line 170
    :cond_0
    check-cast v0, Lcom/c/b/f;

    .line 172
    invoke-virtual {v0}, Lcom/c/b/f;->f()Ljava/lang/String;

    move-result-object v1

    .line 173
    invoke-virtual {v0}, Lcom/c/b/f;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 174
    iput-object v1, p0, Lcom/kik/a/a/a$a;->f:Ljava/lang/Object;

    :cond_1
    move-object v0, v1

    .line 176
    goto :goto_0
.end method

.method public final i()Ljava/lang/String;
    .locals 2

    .prologue
    .line 210
    iget-object v0, p0, Lcom/kik/a/a/a$a;->g:Ljava/lang/Object;

    .line 211
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 212
    check-cast v0, Ljava/lang/String;

    .line 220
    :goto_0
    return-object v0

    .line 214
    :cond_0
    check-cast v0, Lcom/c/b/f;

    .line 216
    invoke-virtual {v0}, Lcom/c/b/f;->f()Ljava/lang/String;

    move-result-object v1

    .line 217
    invoke-virtual {v0}, Lcom/c/b/f;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 218
    iput-object v1, p0, Lcom/kik/a/a/a$a;->g:Ljava/lang/Object;

    :cond_1
    move-object v0, v1

    .line 220
    goto :goto_0
.end method

.method public final j()Ljava/lang/String;
    .locals 2

    .prologue
    .line 256
    iget-object v0, p0, Lcom/kik/a/a/a$a;->h:Ljava/lang/Object;

    .line 257
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 258
    check-cast v0, Ljava/lang/String;

    .line 266
    :goto_0
    return-object v0

    .line 260
    :cond_0
    check-cast v0, Lcom/c/b/f;

    .line 262
    invoke-virtual {v0}, Lcom/c/b/f;->f()Ljava/lang/String;

    move-result-object v1

    .line 263
    invoke-virtual {v0}, Lcom/c/b/f;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 264
    iput-object v1, p0, Lcom/kik/a/a/a$a;->h:Ljava/lang/Object;

    :cond_1
    move-object v0, v1

    .line 266
    goto :goto_0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 856
    sget-object v0, Lcom/kik/a/a/a$a;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 76
    sget-object v0, Lcom/kik/a/a/a$a;->k:Lcom/kik/a/a/a$a;

    invoke-direct {v0}, Lcom/kik/a/a/a$a;->p()Lcom/kik/a/a/a$a$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 76
    invoke-direct {p0}, Lcom/kik/a/a/a$a;->p()Lcom/kik/a/a/a$a$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 76
    sget-object v0, Lcom/kik/a/a/a$a;->k:Lcom/kik/a/a/a$a;

    return-object v0
.end method
