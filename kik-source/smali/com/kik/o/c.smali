.class public final Lcom/kik/o/c;
.super Lcom/c/b/as;
.source "SourceFile"

# interfaces
.implements Lcom/kik/o/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/o/c$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final i:Lcom/kik/o/c;


# instance fields
.field private volatile f:Ljava/lang/Object;

.field private g:B

.field private h:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 415
    new-instance v0, Lcom/kik/o/c;

    invoke-direct {v0}, Lcom/kik/o/c;-><init>()V

    sput-object v0, Lcom/kik/o/c;->i:Lcom/kik/o/c;

    .line 422
    new-instance v0, Lcom/kik/o/d;

    invoke-direct {v0}, Lcom/kik/o/d;-><init>()V

    sput-object v0, Lcom/kik/o/c;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 22
    invoke-direct {p0}, Lcom/c/b/as;-><init>()V

    .line 116
    iput-byte v0, p0, Lcom/kik/o/c;->g:B

    .line 133
    iput v0, p0, Lcom/kik/o/c;->h:I

    .line 23
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/o/c;->f:Ljava/lang/Object;

    .line 24
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$a;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 20
    invoke-direct {p0, p1}, Lcom/c/b/as;-><init>(Lcom/c/b/as$a;)V

    .line 116
    iput-byte v0, p0, Lcom/kik/o/c;->g:B

    .line 133
    iput v0, p0, Lcom/kik/o/c;->h:I

    .line 21
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$a;B)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0, p1}, Lcom/kik/o/c;-><init>(Lcom/c/b/as$a;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 34
    invoke-direct {p0}, Lcom/kik/o/c;-><init>()V

    .line 35
    const/4 v0, 0x0

    .line 38
    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 39
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v2

    .line 40
    sparse-switch v2, :sswitch_data_0

    .line 45
    invoke-virtual {p1, v2}, Lcom/c/b/g;->b(I)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    .line 46
    goto :goto_0

    :sswitch_0
    move v0, v1

    .line 43
    goto :goto_0

    .line 51
    :sswitch_1
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v2

    .line 53
    iput-object v2, p0, Lcom/kik/o/c;->f:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 58
    :catch_0
    move-exception v0

    .line 59
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/kik/o/c;->L()V

    throw v0

    :cond_1
    invoke-virtual {p0}, Lcom/kik/o/c;->L()V

    .line 66
    return-void

    .line 60
    :catch_1
    move-exception v0

    .line 61
    :try_start_2
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Lcom/c/b/av;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/c/b/av;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;B)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0, p1}, Lcom/kik/o/c;-><init>(Lcom/c/b/g;)V

    return-void
.end method

.method public static a(Lcom/kik/o/c;)Lcom/kik/o/c$a;
    .locals 1

    .prologue
    .line 206
    sget-object v0, Lcom/kik/o/c;->i:Lcom/kik/o/c;

    invoke-virtual {v0}, Lcom/kik/o/c;->j()Lcom/kik/o/c$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kik/o/c$a;->a(Lcom/kik/o/c;)Lcom/kik/o/c$a;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/kik/o/c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 14
    iput-object p1, p0, Lcom/kik/o/c;->f:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic b(Lcom/kik/o/c;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/kik/o/c;->f:Ljava/lang/Object;

    return-object v0
.end method

.method public static i()Lcom/kik/o/c$a;
    .locals 1

    .prologue
    .line 203
    sget-object v0, Lcom/kik/o/c;->i:Lcom/kik/o/c;

    invoke-virtual {v0}, Lcom/kik/o/c;->j()Lcom/kik/o/c$a;

    move-result-object v0

    return-object v0
.end method

.method public static k()Lcom/kik/o/c;
    .locals 1

    .prologue
    .line 419
    sget-object v0, Lcom/kik/o/c;->i:Lcom/kik/o/c;

    return-object v0
.end method

.method static synthetic l()Z
    .locals 1

    .prologue
    .line 14
    sget-boolean v0, Lcom/kik/o/c;->d:Z

    return v0
.end method

.method private m()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 104
    iget-object v0, p0, Lcom/kik/o/c;->f:Ljava/lang/Object;

    .line 105
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 106
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 109
    iput-object v0, p0, Lcom/kik/o/c;->f:Ljava/lang/Object;

    .line 112
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 14
    new-instance v0, Lcom/kik/o/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/kik/o/c$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 2

    .prologue
    .line 128
    invoke-direct {p0}, Lcom/kik/o/c;->m()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/f;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 129
    const/4 v0, 0x1

    invoke-direct {p0}, Lcom/kik/o/c;->m()Lcom/c/b/f;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 131
    :cond_0
    return-void
.end method

.method public final a()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 118
    iget-byte v1, p0, Lcom/kik/o/c;->g:B

    .line 119
    if-ne v1, v0, :cond_0

    .line 123
    :goto_0
    return v0

    .line 120
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    .line 122
    :cond_1
    iput-byte v0, p0, Lcom/kik/o/c;->g:B

    goto :goto_0
.end method

.method public final b()I
    .locals 2

    .prologue
    .line 135
    iget v0, p0, Lcom/kik/o/c;->h:I

    .line 136
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 144
    :goto_0
    return v0

    .line 138
    :cond_0
    const/4 v0, 0x0

    .line 139
    invoke-direct {p0}, Lcom/kik/o/c;->m()Lcom/c/b/f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/c/b/f;->d()Z

    move-result v1

    if-nez v1, :cond_1

    .line 140
    const/4 v0, 0x1

    invoke-direct {p0}, Lcom/kik/o/c;->m()Lcom/c/b/f;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 143
    :cond_1
    iput v0, p0, Lcom/kik/o/c;->h:I

    goto :goto_0
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 75
    sget-object v0, Lcom/kik/o/a;->d:Lcom/c/b/as$g;

    const-class v1, Lcom/kik/o/c;

    const-class v2, Lcom/kik/o/c$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 29
    invoke-static {}, Lcom/c/b/by;->e()Lcom/c/b/by;

    move-result-object v0

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 2

    .prologue
    .line 86
    iget-object v0, p0, Lcom/kik/o/c;->f:Ljava/lang/Object;

    .line 87
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 88
    check-cast v0, Ljava/lang/String;

    .line 96
    :goto_0
    return-object v0

    .line 90
    :cond_0
    check-cast v0, Lcom/c/b/f;

    .line 92
    invoke-virtual {v0}, Lcom/c/b/f;->f()Ljava/lang/String;

    move-result-object v1

    .line 93
    invoke-virtual {v0}, Lcom/c/b/f;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 94
    iput-object v1, p0, Lcom/kik/o/c;->f:Ljava/lang/Object;

    :cond_1
    move-object v0, v1

    .line 96
    goto :goto_0
.end method

.method public final j()Lcom/kik/o/c$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 209
    sget-object v0, Lcom/kik/o/c;->i:Lcom/kik/o/c;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/kik/o/c$a;

    invoke-direct {v0, v1}, Lcom/kik/o/c$a;-><init>(B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/kik/o/c$a;

    invoke-direct {v0, v1}, Lcom/kik/o/c$a;-><init>(B)V

    invoke-virtual {v0, p0}, Lcom/kik/o/c$a;->a(Lcom/kik/o/c;)Lcom/kik/o/c$a;

    move-result-object v0

    goto :goto_0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 447
    sget-object v0, Lcom/kik/o/c;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 14
    sget-object v0, Lcom/kik/o/c;->i:Lcom/kik/o/c;

    invoke-virtual {v0}, Lcom/kik/o/c;->j()Lcom/kik/o/c$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 14
    invoke-virtual {p0}, Lcom/kik/o/c;->j()Lcom/kik/o/c$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 14
    sget-object v0, Lcom/kik/o/c;->i:Lcom/kik/o/c;

    return-object v0
.end method
