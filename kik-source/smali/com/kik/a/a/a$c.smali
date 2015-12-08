.class public final Lcom/kik/a/a/a$c;
.super Lcom/c/b/as;
.source "SourceFile"

# interfaces
.implements Lcom/kik/a/a/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/a/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/a/a/a$c$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final i:Lcom/kik/a/a/a$c;


# instance fields
.field private f:Lcom/kik/o/c;

.field private g:B

.field private h:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 1401
    new-instance v0, Lcom/kik/a/a/a$c;

    invoke-direct {v0}, Lcom/kik/a/a/a$c;-><init>()V

    sput-object v0, Lcom/kik/a/a/a$c;->i:Lcom/kik/a/a/a$c;

    .line 1408
    new-instance v0, Lcom/kik/a/a/d;

    invoke-direct {v0}, Lcom/kik/a/a/d;-><init>()V

    sput-object v0, Lcom/kik/a/a/a$c;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 908
    invoke-direct {p0}, Lcom/c/b/as;-><init>()V

    .line 1008
    iput-byte v0, p0, Lcom/kik/a/a/a$c;->g:B

    .line 1025
    iput v0, p0, Lcom/kik/a/a/a$c;->h:I

    .line 909
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$a;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 906
    invoke-direct {p0, p1}, Lcom/c/b/as;-><init>(Lcom/c/b/as$a;)V

    .line 1008
    iput-byte v0, p0, Lcom/kik/a/a/a$c;->g:B

    .line 1025
    iput v0, p0, Lcom/kik/a/a/a$c;->h:I

    .line 907
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$a;B)V
    .locals 0

    .prologue
    .line 900
    invoke-direct {p0, p1}, Lcom/kik/a/a/a$c;-><init>(Lcom/c/b/as$a;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 919
    invoke-direct {p0}, Lcom/kik/a/a/a$c;-><init>()V

    .line 920
    const/4 v0, 0x0

    move v2, v0

    .line 923
    :cond_0
    :goto_0
    if-nez v2, :cond_1

    .line 924
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v0

    .line 925
    sparse-switch v0, :sswitch_data_0

    .line 930
    invoke-virtual {p1, v0}, Lcom/c/b/g;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    move v2, v3

    .line 931
    goto :goto_0

    :sswitch_0
    move v2, v3

    .line 928
    goto :goto_0

    .line 936
    :sswitch_1
    const/4 v0, 0x0

    .line 937
    iget-object v1, p0, Lcom/kik/a/a/a$c;->f:Lcom/kik/o/c;

    if-eqz v1, :cond_2

    .line 938
    iget-object v0, p0, Lcom/kik/a/a/a$c;->f:Lcom/kik/o/c;

    invoke-virtual {v0}, Lcom/kik/o/c;->j()Lcom/kik/o/c$a;

    move-result-object v0

    move-object v1, v0

    .line 940
    :goto_1
    sget-object v0, Lcom/kik/o/c;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v0, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/kik/o/c;

    iput-object v0, p0, Lcom/kik/a/a/a$c;->f:Lcom/kik/o/c;

    .line 941
    if-eqz v1, :cond_0

    .line 942
    iget-object v0, p0, Lcom/kik/a/a/a$c;->f:Lcom/kik/o/c;

    invoke-virtual {v1, v0}, Lcom/kik/o/c$a;->a(Lcom/kik/o/c;)Lcom/kik/o/c$a;

    .line 943
    invoke-virtual {v1}, Lcom/kik/o/c$a;->s()Lcom/kik/o/c;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/a/a/a$c;->f:Lcom/kik/o/c;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 950
    :catch_0
    move-exception v0

    .line 951
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 957
    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/kik/a/a/a$c;->L()V

    throw v0

    :cond_1
    invoke-virtual {p0}, Lcom/kik/a/a/a$c;->L()V

    .line 958
    return-void

    .line 952
    :catch_1
    move-exception v0

    .line 953
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

    :cond_2
    move-object v1, v0

    goto :goto_1

    .line 925
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 900
    invoke-direct {p0, p1, p2}, Lcom/kik/a/a/a$c;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method static synthetic a(Lcom/kik/a/a/a$c;Lcom/kik/o/c;)Lcom/kik/o/c;
    .locals 0

    .prologue
    .line 900
    iput-object p1, p0, Lcom/kik/a/a/a$c;->f:Lcom/kik/o/c;

    return-object p1
.end method

.method public static j()Lcom/kik/a/a/a$c$a;
    .locals 1

    .prologue
    .line 1095
    sget-object v0, Lcom/kik/a/a/a$c;->i:Lcom/kik/a/a/a$c;

    invoke-direct {v0}, Lcom/kik/a/a/a$c;->m()Lcom/kik/a/a/a$c$a;

    move-result-object v0

    return-object v0
.end method

.method public static k()Lcom/kik/a/a/a$c;
    .locals 1

    .prologue
    .line 1405
    sget-object v0, Lcom/kik/a/a/a$c;->i:Lcom/kik/a/a/a$c;

    return-object v0
.end method

.method static synthetic l()Z
    .locals 1

    .prologue
    .line 900
    sget-boolean v0, Lcom/kik/a/a/a$c;->d:Z

    return v0
.end method

.method private m()Lcom/kik/a/a/a$c$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1101
    sget-object v0, Lcom/kik/a/a/a$c;->i:Lcom/kik/a/a/a$c;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/kik/a/a/a$c$a;

    invoke-direct {v0, v1}, Lcom/kik/a/a/a$c$a;-><init>(B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/kik/a/a/a$c$a;

    invoke-direct {v0, v1}, Lcom/kik/a/a/a$c$a;-><init>(B)V

    invoke-virtual {v0, p0}, Lcom/kik/a/a/a$c$a;->a(Lcom/kik/a/a/a$c;)Lcom/kik/a/a/a$c$a;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 900
    new-instance v0, Lcom/kik/a/a/a$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/kik/a/a/a$c$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 2

    .prologue
    .line 1020
    iget-object v0, p0, Lcom/kik/a/a/a$c;->f:Lcom/kik/o/c;

    if-eqz v0, :cond_0

    .line 1021
    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/kik/a/a/a$c;->i()Lcom/kik/o/c;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 1023
    :cond_0
    return-void
.end method

.method public final a()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 1010
    iget-byte v1, p0, Lcom/kik/a/a/a$c;->g:B

    .line 1011
    if-ne v1, v0, :cond_0

    .line 1015
    :goto_0
    return v0

    .line 1012
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    .line 1014
    :cond_1
    iput-byte v0, p0, Lcom/kik/a/a/a$c;->g:B

    goto :goto_0
.end method

.method public final b()I
    .locals 2

    .prologue
    .line 1027
    iget v0, p0, Lcom/kik/a/a/a$c;->h:I

    .line 1028
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 1036
    :goto_0
    return v0

    .line 1030
    :cond_0
    const/4 v0, 0x0

    .line 1031
    iget-object v1, p0, Lcom/kik/a/a/a$c;->f:Lcom/kik/o/c;

    if-eqz v1, :cond_1

    .line 1032
    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/kik/a/a/a$c;->i()Lcom/kik/o/c;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 1035
    :cond_1
    iput v0, p0, Lcom/kik/a/a/a$c;->h:I

    goto :goto_0
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 967
    invoke-static {}, Lcom/kik/a/a/a;->d()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/kik/a/a/a$c;

    const-class v2, Lcom/kik/a/a/a$c$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 914
    invoke-static {}, Lcom/c/b/by;->e()Lcom/c/b/by;

    move-result-object v0

    return-object v0
.end method

.method public final h()Z
    .locals 1

    .prologue
    .line 983
    iget-object v0, p0, Lcom/kik/a/a/a$c;->f:Lcom/kik/o/c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()Lcom/kik/o/c;
    .locals 1

    .prologue
    .line 994
    iget-object v0, p0, Lcom/kik/a/a/a$c;->f:Lcom/kik/o/c;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/kik/o/c;->k()Lcom/kik/o/c;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/kik/a/a/a$c;->f:Lcom/kik/o/c;

    goto :goto_0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 1433
    sget-object v0, Lcom/kik/a/a/a$c;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 900
    sget-object v0, Lcom/kik/a/a/a$c;->i:Lcom/kik/a/a/a$c;

    invoke-direct {v0}, Lcom/kik/a/a/a$c;->m()Lcom/kik/a/a/a$c$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 900
    invoke-direct {p0}, Lcom/kik/a/a/a$c;->m()Lcom/kik/a/a/a$c$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 900
    sget-object v0, Lcom/kik/a/a/a$c;->i:Lcom/kik/a/a/a$c;

    return-object v0
.end method
