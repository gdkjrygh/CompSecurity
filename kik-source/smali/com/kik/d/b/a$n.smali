.class public final Lcom/kik/d/b/a$n;
.super Lcom/c/b/as;
.source "SourceFile"

# interfaces
.implements Lcom/kik/d/b/a$o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/d/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "n"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/d/b/a$n$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final k:Lcom/kik/d/b/a$n;


# instance fields
.field private f:I

.field private volatile g:Ljava/lang/Object;

.field private h:Lcom/c/b/az;

.field private i:B

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 8497
    new-instance v0, Lcom/kik/d/b/a$n;

    invoke-direct {v0}, Lcom/kik/d/b/a$n;-><init>()V

    sput-object v0, Lcom/kik/d/b/a$n;->k:Lcom/kik/d/b/a$n;

    .line 8504
    new-instance v0, Lcom/kik/d/b/k;

    invoke-direct {v0}, Lcom/kik/d/b/k;-><init>()V

    sput-object v0, Lcom/kik/d/b/a$n;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 7920
    invoke-direct {p0}, Lcom/c/b/as;-><init>()V

    .line 8067
    iput-byte v0, p0, Lcom/kik/d/b/a$n;->i:B

    .line 8092
    iput v0, p0, Lcom/kik/d/b/a$n;->j:I

    .line 7921
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/d/b/a$n;->g:Ljava/lang/Object;

    .line 7922
    sget-object v0, Lcom/c/b/ay;->a:Lcom/c/b/az;

    iput-object v0, p0, Lcom/kik/d/b/a$n;->h:Lcom/c/b/az;

    .line 7923
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$a;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 7918
    invoke-direct {p0, p1}, Lcom/c/b/as;-><init>(Lcom/c/b/as$a;)V

    .line 8067
    iput-byte v0, p0, Lcom/kik/d/b/a$n;->i:B

    .line 8092
    iput v0, p0, Lcom/kik/d/b/a$n;->j:I

    .line 7919
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$a;B)V
    .locals 0

    .prologue
    .line 7912
    invoke-direct {p0, p1}, Lcom/kik/d/b/a$n;-><init>(Lcom/c/b/as$a;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 8

    .prologue
    const/4 v2, 0x1

    const/4 v0, 0x0

    const/4 v6, 0x2

    .line 7933
    invoke-direct {p0}, Lcom/kik/d/b/a$n;-><init>()V

    .line 7936
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v3

    move v1, v0

    .line 7939
    :cond_0
    :goto_0
    if-nez v1, :cond_3

    .line 7940
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v4

    .line 7941
    sparse-switch v4, :sswitch_data_0

    .line 7946
    invoke-virtual {p0, p1, v3, p2, v4}, Lcom/kik/d/b/a$n;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z

    move-result v4

    if-nez v4, :cond_0

    move v1, v2

    .line 7948
    goto :goto_0

    :sswitch_0
    move v1, v2

    .line 7944
    goto :goto_0

    .line 7953
    :sswitch_1
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v4

    .line 7954
    iget v5, p0, Lcom/kik/d/b/a$n;->f:I

    or-int/lit8 v5, v5, 0x1

    iput v5, p0, Lcom/kik/d/b/a$n;->f:I

    .line 7955
    iput-object v4, p0, Lcom/kik/d/b/a$n;->g:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_0

    .line 7969
    :catch_0
    move-exception v1

    move-object v7, v1

    move v1, v0

    move-object v0, v7

    .line 7970
    :try_start_1
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 7976
    :catchall_0
    move-exception v0

    :goto_1
    and-int/lit8 v1, v1, 0x2

    if-ne v1, v6, :cond_1

    .line 7977
    iget-object v1, p0, Lcom/kik/d/b/a$n;->h:Lcom/c/b/az;

    invoke-interface {v1}, Lcom/c/b/az;->e()Lcom/c/b/az;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/d/b/a$n;->h:Lcom/c/b/az;

    .line 7979
    :cond_1
    invoke-virtual {v3}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/d/b/a$n;->e:Lcom/c/b/by;

    .line 7980
    invoke-virtual {p0}, Lcom/kik/d/b/a$n;->L()V

    throw v0

    .line 7959
    :sswitch_2
    :try_start_2
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v4

    .line 7960
    and-int/lit8 v5, v0, 0x2

    if-eq v5, v6, :cond_2

    .line 7961
    new-instance v5, Lcom/c/b/ay;

    invoke-direct {v5}, Lcom/c/b/ay;-><init>()V

    iput-object v5, p0, Lcom/kik/d/b/a$n;->h:Lcom/c/b/az;

    .line 7962
    or-int/lit8 v0, v0, 0x2

    .line 7964
    :cond_2
    iget-object v5, p0, Lcom/kik/d/b/a$n;->h:Lcom/c/b/az;

    invoke-interface {v5, v4}, Lcom/c/b/az;->a(Lcom/c/b/f;)V
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    .line 7971
    :catch_1
    move-exception v1

    move-object v7, v1

    move v1, v0

    move-object v0, v7

    .line 7972
    :try_start_3
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v4, Lcom/c/b/av;

    .line 7974
    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Lcom/c/b/av;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 7976
    :cond_3
    and-int/lit8 v0, v0, 0x2

    if-ne v0, v6, :cond_4

    .line 7977
    iget-object v0, p0, Lcom/kik/d/b/a$n;->h:Lcom/c/b/az;

    invoke-interface {v0}, Lcom/c/b/az;->e()Lcom/c/b/az;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$n;->h:Lcom/c/b/az;

    .line 7979
    :cond_4
    invoke-virtual {v3}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$n;->e:Lcom/c/b/by;

    .line 7980
    invoke-virtual {p0}, Lcom/kik/d/b/a$n;->L()V

    .line 7981
    return-void

    .line 7976
    :catchall_1
    move-exception v1

    move-object v7, v1

    move v1, v0

    move-object v0, v7

    goto :goto_1

    .line 7941
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 7912
    invoke-direct {p0, p1, p2}, Lcom/kik/d/b/a$n;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method static synthetic a(Lcom/kik/d/b/a$n;I)I
    .locals 0

    .prologue
    .line 7912
    iput p1, p0, Lcom/kik/d/b/a$n;->f:I

    return p1
.end method

.method static synthetic a(Lcom/kik/d/b/a$n;Lcom/c/b/az;)Lcom/c/b/az;
    .locals 0

    .prologue
    .line 7912
    iput-object p1, p0, Lcom/kik/d/b/a$n;->h:Lcom/c/b/az;

    return-object p1
.end method

.method static synthetic a(Lcom/kik/d/b/a$n;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 7912
    iget-object v0, p0, Lcom/kik/d/b/a$n;->g:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lcom/kik/d/b/a$n;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 7912
    iput-object p1, p0, Lcom/kik/d/b/a$n;->g:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic b(Lcom/kik/d/b/a$n;)Lcom/c/b/az;
    .locals 1

    .prologue
    .line 7912
    iget-object v0, p0, Lcom/kik/d/b/a$n;->h:Lcom/c/b/az;

    return-object v0
.end method

.method static synthetic c(Lcom/kik/d/b/a$n;)Lcom/c/b/by;
    .locals 1

    .prologue
    .line 7912
    iget-object v0, p0, Lcom/kik/d/b/a$n;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public static i()Lcom/kik/d/b/a$n$a;
    .locals 1

    .prologue
    .line 8172
    sget-object v0, Lcom/kik/d/b/a$n;->k:Lcom/kik/d/b/a$n;

    invoke-direct {v0}, Lcom/kik/d/b/a$n;->m()Lcom/kik/d/b/a$n$a;

    move-result-object v0

    return-object v0
.end method

.method public static j()Lcom/kik/d/b/a$n;
    .locals 1

    .prologue
    .line 8501
    sget-object v0, Lcom/kik/d/b/a$n;->k:Lcom/kik/d/b/a$n;

    return-object v0
.end method

.method static synthetic k()Z
    .locals 1

    .prologue
    .line 7912
    sget-boolean v0, Lcom/kik/d/b/a$n;->d:Z

    return v0
.end method

.method private l()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 8026
    iget-object v0, p0, Lcom/kik/d/b/a$n;->g:Ljava/lang/Object;

    .line 8027
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 8028
    check-cast v0, Ljava/lang/String;

    .line 8029
    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 8031
    iput-object v0, p0, Lcom/kik/d/b/a$n;->g:Ljava/lang/Object;

    .line 8034
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private m()Lcom/kik/d/b/a$n$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 8178
    sget-object v0, Lcom/kik/d/b/a$n;->k:Lcom/kik/d/b/a$n;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/kik/d/b/a$n$a;

    invoke-direct {v0, v1}, Lcom/kik/d/b/a$n$a;-><init>(B)V

    .line 8179
    :goto_0
    return-object v0

    .line 8178
    :cond_0
    new-instance v0, Lcom/kik/d/b/a$n$a;

    invoke-direct {v0, v1}, Lcom/kik/d/b/a$n$a;-><init>(B)V

    .line 8179
    invoke-virtual {v0, p0}, Lcom/kik/d/b/a$n$a;->a(Lcom/kik/d/b/a$n;)Lcom/kik/d/b/a$n$a;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 7912
    new-instance v0, Lcom/kik/d/b/a$n$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/kik/d/b/a$n$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 8083
    iget v0, p0, Lcom/kik/d/b/a$n;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    .line 8084
    invoke-direct {p0}, Lcom/kik/d/b/a$n;->l()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 8086
    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/kik/d/b/a$n;->h:Lcom/c/b/az;

    invoke-interface {v1}, Lcom/c/b/az;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 8087
    const/4 v1, 0x2

    iget-object v2, p0, Lcom/kik/d/b/a$n;->h:Lcom/c/b/az;

    invoke-interface {v2, v0}, Lcom/c/b/az;->a(I)Lcom/c/b/f;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 8086
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 8089
    :cond_1
    iget-object v0, p0, Lcom/kik/d/b/a$n;->e:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 8090
    return-void
.end method

.method public final a()Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 8069
    iget-byte v2, p0, Lcom/kik/d/b/a$n;->i:B

    .line 8070
    if-ne v2, v0, :cond_0

    .line 8078
    :goto_0
    return v0

    .line 8071
    :cond_0
    if-nez v2, :cond_1

    move v0, v1

    goto :goto_0

    .line 8073
    :cond_1
    invoke-virtual {p0}, Lcom/kik/d/b/a$n;->h()Z

    move-result v2

    if-nez v2, :cond_2

    .line 8074
    iput-byte v1, p0, Lcom/kik/d/b/a$n;->i:B

    move v0, v1

    .line 8075
    goto :goto_0

    .line 8077
    :cond_2
    iput-byte v0, p0, Lcom/kik/d/b/a$n;->i:B

    goto :goto_0
.end method

.method public final b()I
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 8094
    iget v0, p0, Lcom/kik/d/b/a$n;->j:I

    .line 8095
    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    .line 8113
    :goto_0
    return v0

    .line 8098
    :cond_0
    iget v0, p0, Lcom/kik/d/b/a$n;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v3, :cond_2

    .line 8100
    invoke-direct {p0}, Lcom/kik/d/b/a$n;->l()Lcom/c/b/f;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    :goto_1
    move v2, v1

    .line 8104
    :goto_2
    iget-object v3, p0, Lcom/kik/d/b/a$n;->h:Lcom/c/b/az;

    invoke-interface {v3}, Lcom/c/b/az;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    .line 8105
    iget-object v3, p0, Lcom/kik/d/b/a$n;->h:Lcom/c/b/az;

    .line 8106
    invoke-interface {v3, v1}, Lcom/c/b/az;->a(I)Lcom/c/b/f;

    move-result-object v3

    invoke-static {v3}, Lcom/c/b/h;->b(Lcom/c/b/f;)I

    move-result v3

    add-int/2addr v2, v3

    .line 8104
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 8108
    :cond_1
    add-int/2addr v0, v2

    .line 8109
    iget-object v1, p0, Lcom/kik/d/b/a$n;->h:Lcom/c/b/az;

    invoke-interface {v1}, Lcom/c/b/bm;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    .line 8111
    iget-object v1, p0, Lcom/kik/d/b/a$n;->e:Lcom/c/b/by;

    invoke-virtual {v1}, Lcom/c/b/by;->b()I

    move-result v1

    add-int/2addr v0, v1

    .line 8112
    iput v0, p0, Lcom/kik/d/b/a$n;->j:I

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 7990
    invoke-static {}, Lcom/kik/d/b/a;->n()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/kik/d/b/a$n;

    const-class v2, Lcom/kik/d/b/a$n$a;

    .line 7991
    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 7928
    iget-object v0, p0, Lcom/kik/d/b/a$n;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 8002
    iget v1, p0, Lcom/kik/d/b/a$n;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 8529
    sget-object v0, Lcom/kik/d/b/a$n;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 7912
    sget-object v0, Lcom/kik/d/b/a$n;->k:Lcom/kik/d/b/a$n;

    invoke-direct {v0}, Lcom/kik/d/b/a$n;->m()Lcom/kik/d/b/a$n$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 7912
    invoke-direct {p0}, Lcom/kik/d/b/a$n;->m()Lcom/kik/d/b/a$n$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 7912
    sget-object v0, Lcom/kik/d/b/a$n;->k:Lcom/kik/d/b/a$n;

    return-object v0
.end method
