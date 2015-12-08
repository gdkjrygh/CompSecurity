.class public final Lcom/c/b/i$c;
.super Lcom/c/b/as;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/i$c$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final l:Lcom/c/b/i$c;


# instance fields
.field private f:I

.field private volatile g:Ljava/lang/Object;

.field private h:Ljava/util/List;

.field private i:Lcom/c/b/i$e;

.field private j:B

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 12703
    new-instance v0, Lcom/c/b/i$c;

    invoke-direct {v0}, Lcom/c/b/i$c;-><init>()V

    sput-object v0, Lcom/c/b/i$c;->l:Lcom/c/b/i$c;

    .line 12710
    new-instance v0, Lcom/c/b/n;

    invoke-direct {v0}, Lcom/c/b/n;-><init>()V

    sput-object v0, Lcom/c/b/i$c;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 11758
    invoke-direct {p0}, Lcom/c/b/as;-><init>()V

    .line 11944
    iput-byte v0, p0, Lcom/c/b/i$c;->j:B

    .line 11980
    iput v0, p0, Lcom/c/b/i$c;->k:I

    .line 11759
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$c;->g:Ljava/lang/Object;

    .line 11760
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$c;->h:Ljava/util/List;

    .line 11761
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$a;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 11756
    invoke-direct {p0, p1}, Lcom/c/b/as;-><init>(Lcom/c/b/as$a;)V

    .line 11944
    iput-byte v0, p0, Lcom/c/b/i$c;->j:B

    .line 11980
    iput v0, p0, Lcom/c/b/i$c;->k:I

    .line 11757
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$a;B)V
    .locals 0

    .prologue
    .line 11750
    invoke-direct {p0, p1}, Lcom/c/b/i$c;-><init>(Lcom/c/b/as$a;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 7

    .prologue
    const/4 v4, 0x1

    const/4 v0, 0x0

    const/4 v6, 0x2

    .line 11771
    invoke-direct {p0}, Lcom/c/b/i$c;-><init>()V

    .line 11773
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v5

    move v3, v0

    move v1, v0

    .line 11777
    :cond_0
    :goto_0
    if-nez v3, :cond_4

    .line 11778
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v0

    .line 11779
    sparse-switch v0, :sswitch_data_0

    .line 11784
    invoke-virtual {p0, p1, v5, p2, v0}, Lcom/c/b/i$c;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z

    move-result v0

    if-nez v0, :cond_0

    move v3, v4

    .line 11786
    goto :goto_0

    :sswitch_0
    move v3, v4

    .line 11782
    goto :goto_0

    .line 11791
    :sswitch_1
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v0

    .line 11792
    iget v2, p0, Lcom/c/b/i$c;->f:I

    or-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/c/b/i$c;->f:I

    .line 11793
    iput-object v0, p0, Lcom/c/b/i$c;->g:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 11819
    :catch_0
    move-exception v0

    .line 11820
    :try_start_1
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11826
    :catchall_0
    move-exception v0

    and-int/lit8 v1, v1, 0x2

    if-ne v1, v6, :cond_1

    .line 11827
    iget-object v1, p0, Lcom/c/b/i$c;->h:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$c;->h:Ljava/util/List;

    .line 11829
    :cond_1
    invoke-virtual {v5}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$c;->e:Lcom/c/b/by;

    .line 11830
    invoke-virtual {p0}, Lcom/c/b/i$c;->L()V

    .line 11826
    throw v0

    .line 11797
    :sswitch_2
    and-int/lit8 v0, v1, 0x2

    if-eq v0, v6, :cond_2

    .line 11798
    :try_start_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/c/b/i$c;->h:Ljava/util/List;

    .line 11799
    or-int/lit8 v1, v1, 0x2

    .line 11801
    :cond_2
    iget-object v0, p0, Lcom/c/b/i$c;->h:Ljava/util/List;

    sget-object v2, Lcom/c/b/i$g;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v2, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 11821
    :catch_1
    move-exception v0

    .line 11822
    :try_start_3
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Lcom/c/b/av;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/c/b/av;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 11805
    :sswitch_3
    const/4 v0, 0x0

    .line 11806
    :try_start_4
    iget v2, p0, Lcom/c/b/i$c;->f:I

    and-int/lit8 v2, v2, 0x2

    if-ne v2, v6, :cond_6

    .line 11807
    iget-object v0, p0, Lcom/c/b/i$c;->i:Lcom/c/b/i$e;

    invoke-virtual {v0}, Lcom/c/b/i$e;->l()Lcom/c/b/i$e$a;

    move-result-object v0

    move-object v2, v0

    .line 11809
    :goto_1
    sget-object v0, Lcom/c/b/i$e;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v0, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$e;

    iput-object v0, p0, Lcom/c/b/i$c;->i:Lcom/c/b/i$e;

    .line 11810
    if-eqz v2, :cond_3

    .line 11811
    iget-object v0, p0, Lcom/c/b/i$c;->i:Lcom/c/b/i$e;

    invoke-virtual {v2, v0}, Lcom/c/b/i$e$a;->a(Lcom/c/b/i$e;)Lcom/c/b/i$e$a;

    .line 11812
    invoke-virtual {v2}, Lcom/c/b/i$e$a;->g()Lcom/c/b/i$e;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$c;->i:Lcom/c/b/i$e;

    .line 11814
    :cond_3
    iget v0, p0, Lcom/c/b/i$c;->f:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/c/b/i$c;->f:I
    :try_end_4
    .catch Lcom/c/b/av; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_0

    .line 11826
    :cond_4
    and-int/lit8 v0, v1, 0x2

    if-ne v0, v6, :cond_5

    .line 11827
    iget-object v0, p0, Lcom/c/b/i$c;->h:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$c;->h:Ljava/util/List;

    .line 11829
    :cond_5
    invoke-virtual {v5}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$c;->e:Lcom/c/b/by;

    .line 11830
    invoke-virtual {p0}, Lcom/c/b/i$c;->L()V

    .line 11831
    return-void

    :cond_6
    move-object v2, v0

    goto :goto_1

    .line 11779
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 11750
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$c;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method static synthetic a(Lcom/c/b/i$c;I)I
    .locals 0

    .prologue
    .line 11750
    iput p1, p0, Lcom/c/b/i$c;->f:I

    return p1
.end method

.method static synthetic a(Lcom/c/b/i$c;Lcom/c/b/i$e;)Lcom/c/b/i$e;
    .locals 0

    .prologue
    .line 11750
    iput-object p1, p0, Lcom/c/b/i$c;->i:Lcom/c/b/i$e;

    return-object p1
.end method

.method static synthetic a(Lcom/c/b/i$c;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 11750
    iget-object v0, p0, Lcom/c/b/i$c;->g:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lcom/c/b/i$c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 11750
    iput-object p1, p0, Lcom/c/b/i$c;->g:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic a(Lcom/c/b/i$c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 11750
    iput-object p1, p0, Lcom/c/b/i$c;->h:Ljava/util/List;

    return-object p1
.end method

.method static synthetic b(Lcom/c/b/i$c;)Ljava/util/List;
    .locals 1

    .prologue
    .line 11750
    iget-object v0, p0, Lcom/c/b/i$c;->h:Ljava/util/List;

    return-object v0
.end method

.method public static m()Lcom/c/b/i$c;
    .locals 1

    .prologue
    .line 12707
    sget-object v0, Lcom/c/b/i$c;->l:Lcom/c/b/i$c;

    return-object v0
.end method

.method private n()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 11876
    iget-object v0, p0, Lcom/c/b/i$c;->g:Ljava/lang/Object;

    .line 11877
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 11878
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 11881
    iput-object v0, p0, Lcom/c/b/i$c;->g:Ljava/lang/Object;

    .line 11884
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private o()Lcom/c/b/i$c$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 12065
    sget-object v0, Lcom/c/b/i$c;->l:Lcom/c/b/i$c;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/c/b/i$c$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$c$a;-><init>(B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/c/b/i$c$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$c$a;-><init>(B)V

    invoke-virtual {v0, p0}, Lcom/c/b/i$c$a;->a(Lcom/c/b/i$c;)Lcom/c/b/i$c$a;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 11750
    new-instance v0, Lcom/c/b/i$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/c/b/i$c$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(I)Lcom/c/b/i$g;
    .locals 1

    .prologue
    .line 11913
    iget-object v0, p0, Lcom/c/b/i$c;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$g;

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 3

    .prologue
    const/4 v2, 0x2

    const/4 v1, 0x1

    .line 11968
    iget v0, p0, Lcom/c/b/i$c;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    .line 11969
    invoke-direct {p0}, Lcom/c/b/i$c;->n()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 11971
    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/c/b/i$c;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 11972
    iget-object v0, p0, Lcom/c/b/i$c;->h:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-virtual {p1, v2, v0}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 11971
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 11974
    :cond_1
    iget v0, p0, Lcom/c/b/i$c;->f:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v2, :cond_2

    .line 11975
    const/4 v0, 0x3

    invoke-virtual {p0}, Lcom/c/b/i$c;->l()Lcom/c/b/i$e;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 11977
    :cond_2
    iget-object v0, p0, Lcom/c/b/i$c;->e:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 11978
    return-void
.end method

.method public final a()Z
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 11946
    iget-byte v0, p0, Lcom/c/b/i$c;->j:B

    .line 11947
    if-ne v0, v2, :cond_1

    move v1, v2

    .line 11963
    :cond_0
    :goto_0
    return v1

    .line 11948
    :cond_1
    if-eqz v0, :cond_0

    move v0, v1

    .line 11950
    :goto_1
    invoke-virtual {p0}, Lcom/c/b/i$c;->j()I

    move-result v3

    if-ge v0, v3, :cond_3

    .line 11951
    invoke-virtual {p0, v0}, Lcom/c/b/i$c;->a(I)Lcom/c/b/i$g;

    move-result-object v3

    invoke-virtual {v3}, Lcom/c/b/i$g;->a()Z

    move-result v3

    if-nez v3, :cond_2

    .line 11952
    iput-byte v1, p0, Lcom/c/b/i$c;->j:B

    goto :goto_0

    .line 11950
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 11956
    :cond_3
    invoke-virtual {p0}, Lcom/c/b/i$c;->k()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 11957
    invoke-virtual {p0}, Lcom/c/b/i$c;->l()Lcom/c/b/i$e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/i$e;->a()Z

    move-result v0

    if-nez v0, :cond_4

    .line 11958
    iput-byte v1, p0, Lcom/c/b/i$c;->j:B

    goto :goto_0

    .line 11962
    :cond_4
    iput-byte v2, p0, Lcom/c/b/i$c;->j:B

    move v1, v2

    .line 11963
    goto :goto_0
.end method

.method public final b()I
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 11982
    iget v0, p0, Lcom/c/b/i$c;->k:I

    .line 11983
    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    .line 12000
    :goto_0
    return v0

    .line 11986
    :cond_0
    iget v0, p0, Lcom/c/b/i$c;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v3, :cond_3

    .line 11987
    invoke-direct {p0}, Lcom/c/b/i$c;->n()Lcom/c/b/f;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    :goto_1
    move v2, v0

    .line 11990
    :goto_2
    iget-object v0, p0, Lcom/c/b/i$c;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 11991
    iget-object v0, p0, Lcom/c/b/i$c;->h:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-static {v4, v0}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v0

    add-int/2addr v0, v2

    .line 11990
    add-int/lit8 v1, v1, 0x1

    move v2, v0

    goto :goto_2

    .line 11994
    :cond_1
    iget v0, p0, Lcom/c/b/i$c;->f:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v4, :cond_2

    .line 11995
    const/4 v0, 0x3

    invoke-virtual {p0}, Lcom/c/b/i$c;->l()Lcom/c/b/i$e;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v0

    add-int/2addr v2, v0

    .line 11998
    :cond_2
    iget-object v0, p0, Lcom/c/b/i$c;->e:Lcom/c/b/by;

    invoke-virtual {v0}, Lcom/c/b/by;->b()I

    move-result v0

    add-int/2addr v0, v2

    .line 11999
    iput v0, p0, Lcom/c/b/i$c;->k:I

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_1
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 11840
    invoke-static {}, Lcom/c/b/i;->o()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$c;

    const-class v2, Lcom/c/b/i$c$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 11766
    iget-object v0, p0, Lcom/c/b/i$c;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 11852
    iget v1, p0, Lcom/c/b/i$c;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()Ljava/lang/String;
    .locals 2

    .prologue
    .line 11858
    iget-object v0, p0, Lcom/c/b/i$c;->g:Ljava/lang/Object;

    .line 11859
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 11860
    check-cast v0, Ljava/lang/String;

    .line 11868
    :goto_0
    return-object v0

    .line 11862
    :cond_0
    check-cast v0, Lcom/c/b/f;

    .line 11864
    invoke-virtual {v0}, Lcom/c/b/f;->f()Ljava/lang/String;

    move-result-object v1

    .line 11865
    invoke-virtual {v0}, Lcom/c/b/f;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 11866
    iput-object v1, p0, Lcom/c/b/i$c;->g:Ljava/lang/Object;

    :cond_1
    move-object v0, v1

    .line 11868
    goto :goto_0
.end method

.method public final j()I
    .locals 1

    .prologue
    .line 11907
    iget-object v0, p0, Lcom/c/b/i$c;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final k()Z
    .locals 2

    .prologue
    .line 11929
    iget v0, p0, Lcom/c/b/i$c;->f:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final l()Lcom/c/b/i$e;
    .locals 1

    .prologue
    .line 11935
    iget-object v0, p0, Lcom/c/b/i$c;->i:Lcom/c/b/i$e;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/c/b/i$e;->m()Lcom/c/b/i$e;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/c/b/i$c;->i:Lcom/c/b/i$e;

    goto :goto_0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 12735
    sget-object v0, Lcom/c/b/i$c;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 11750
    sget-object v0, Lcom/c/b/i$c;->l:Lcom/c/b/i$c;

    invoke-direct {v0}, Lcom/c/b/i$c;->o()Lcom/c/b/i$c$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 11750
    invoke-direct {p0}, Lcom/c/b/i$c;->o()Lcom/c/b/i$c$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 11750
    sget-object v0, Lcom/c/b/i$c;->l:Lcom/c/b/i$c;

    return-object v0
.end method
