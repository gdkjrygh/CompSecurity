.class public final Lcom/c/b/i$ae;
.super Lcom/c/b/as;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$af;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ae"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/i$ae$a;,
        Lcom/c/b/i$ae$b;,
        Lcom/c/b/i$ae$c;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final i:Lcom/c/b/i$ae;


# instance fields
.field private f:Ljava/util/List;

.field private g:B

.field private h:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32510
    new-instance v0, Lcom/c/b/i$ae;

    invoke-direct {v0}, Lcom/c/b/i$ae;-><init>()V

    sput-object v0, Lcom/c/b/i$ae;->i:Lcom/c/b/i$ae;

    .line 32517
    new-instance v0, Lcom/c/b/ag;

    invoke-direct {v0}, Lcom/c/b/ag;-><init>()V

    sput-object v0, Lcom/c/b/i$ae;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 28866
    invoke-direct {p0}, Lcom/c/b/as;-><init>()V

    .line 31219
    iput-byte v0, p0, Lcom/c/b/i$ae;->g:B

    .line 31237
    iput v0, p0, Lcom/c/b/i$ae;->h:I

    .line 28867
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$ae;->f:Ljava/util/List;

    .line 28868
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$a;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 28864
    invoke-direct {p0, p1}, Lcom/c/b/as;-><init>(Lcom/c/b/as$a;)V

    .line 31219
    iput-byte v0, p0, Lcom/c/b/i$ae;->g:B

    .line 31237
    iput v0, p0, Lcom/c/b/i$ae;->h:I

    .line 28865
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$a;B)V
    .locals 0

    .prologue
    .line 28858
    invoke-direct {p0, p1}, Lcom/c/b/i$ae;-><init>(Lcom/c/b/as$a;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 7

    .prologue
    const/4 v0, 0x0

    const/4 v2, 0x1

    .line 28878
    invoke-direct {p0}, Lcom/c/b/i$ae;-><init>()V

    .line 28880
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v3

    move v1, v0

    .line 28884
    :cond_0
    :goto_0
    if-nez v1, :cond_3

    .line 28885
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v4

    .line 28886
    sparse-switch v4, :sswitch_data_0

    .line 28891
    invoke-virtual {p0, p1, v3, p2, v4}, Lcom/c/b/i$ae;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z

    move-result v4

    if-nez v4, :cond_0

    move v1, v2

    .line 28893
    goto :goto_0

    :sswitch_0
    move v1, v2

    .line 28889
    goto :goto_0

    .line 28898
    :sswitch_1
    and-int/lit8 v4, v0, 0x1

    if-eq v4, v2, :cond_1

    .line 28899
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Lcom/c/b/i$ae;->f:Ljava/util/List;

    .line 28900
    or-int/lit8 v0, v0, 0x1

    .line 28902
    :cond_1
    iget-object v4, p0, Lcom/c/b/i$ae;->f:Ljava/util/List;

    sget-object v5, Lcom/c/b/i$ae$b;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v5, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_0

    .line 28907
    :catch_0
    move-exception v1

    move-object v6, v1

    move v1, v0

    move-object v0, v6

    .line 28908
    :try_start_1
    new-instance v4, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28914
    :catchall_0
    move-exception v0

    :goto_1
    and-int/lit8 v1, v1, 0x1

    if-ne v1, v2, :cond_2

    .line 28915
    iget-object v1, p0, Lcom/c/b/i$ae;->f:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$ae;->f:Ljava/util/List;

    .line 28917
    :cond_2
    invoke-virtual {v3}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$ae;->e:Lcom/c/b/by;

    .line 28918
    invoke-virtual {p0}, Lcom/c/b/i$ae;->L()V

    .line 28914
    throw v0

    .line 28909
    :catch_1
    move-exception v1

    move-object v6, v1

    move v1, v0

    move-object v0, v6

    .line 28910
    :try_start_2
    new-instance v4, Ljava/lang/RuntimeException;

    new-instance v5, Lcom/c/b/av;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/c/b/av;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 28914
    :cond_3
    and-int/lit8 v0, v0, 0x1

    if-ne v0, v2, :cond_4

    .line 28915
    iget-object v0, p0, Lcom/c/b/i$ae;->f:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$ae;->f:Ljava/util/List;

    .line 28917
    :cond_4
    invoke-virtual {v3}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$ae;->e:Lcom/c/b/by;

    .line 28918
    invoke-virtual {p0}, Lcom/c/b/i$ae;->L()V

    .line 28919
    return-void

    .line 28914
    :catchall_1
    move-exception v1

    move-object v6, v1

    move v1, v0

    move-object v0, v6

    goto :goto_1

    .line 28886
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
    .line 28858
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$ae;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method public static a(Lcom/c/b/i$ae;)Lcom/c/b/i$ae$a;
    .locals 1

    .prologue
    .line 31311
    sget-object v0, Lcom/c/b/i$ae;->i:Lcom/c/b/i$ae;

    invoke-virtual {v0}, Lcom/c/b/i$ae;->h()Lcom/c/b/i$ae$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/c/b/i$ae$a;->a(Lcom/c/b/i$ae;)Lcom/c/b/i$ae$a;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/c/b/i$ae;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 28858
    iput-object p1, p0, Lcom/c/b/i$ae;->f:Ljava/util/List;

    return-object p1
.end method

.method static synthetic b(Lcom/c/b/i$ae;)Ljava/util/List;
    .locals 1

    .prologue
    .line 28858
    iget-object v0, p0, Lcom/c/b/i$ae;->f:Ljava/util/List;

    return-object v0
.end method

.method public static i()Lcom/c/b/i$ae;
    .locals 1

    .prologue
    .line 32514
    sget-object v0, Lcom/c/b/i$ae;->i:Lcom/c/b/i$ae;

    return-object v0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 28858
    new-instance v0, Lcom/c/b/i$ae$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/c/b/i$ae$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 3

    .prologue
    .line 31231
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/c/b/i$ae;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 31232
    const/4 v2, 0x1

    iget-object v0, p0, Lcom/c/b/i$ae;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-virtual {p1, v2, v0}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 31231
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 31234
    :cond_0
    iget-object v0, p0, Lcom/c/b/i$ae;->e:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 31235
    return-void
.end method

.method public final a()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 31221
    iget-byte v1, p0, Lcom/c/b/i$ae;->g:B

    .line 31222
    if-ne v1, v0, :cond_0

    .line 31226
    :goto_0
    return v0

    .line 31223
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    .line 31225
    :cond_1
    iput-byte v0, p0, Lcom/c/b/i$ae;->g:B

    goto :goto_0
.end method

.method public final b()I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 31239
    iget v1, p0, Lcom/c/b/i$ae;->h:I

    .line 31240
    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    move v0, v1

    .line 31249
    :goto_0
    return v0

    :cond_0
    move v1, v0

    move v2, v0

    .line 31243
    :goto_1
    iget-object v0, p0, Lcom/c/b/i$ae;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 31244
    const/4 v3, 0x1

    iget-object v0, p0, Lcom/c/b/i$ae;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-static {v3, v0}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v0

    add-int/2addr v2, v0

    .line 31243
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 31247
    :cond_1
    iget-object v0, p0, Lcom/c/b/i$ae;->e:Lcom/c/b/by;

    invoke-virtual {v0}, Lcom/c/b/by;->b()I

    move-result v0

    add-int/2addr v0, v2

    .line 31248
    iput v0, p0, Lcom/c/b/i$ae;->h:I

    goto :goto_0
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 28928
    invoke-static {}, Lcom/c/b/i;->O()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$ae;

    const-class v2, Lcom/c/b/i$ae$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 28873
    iget-object v0, p0, Lcom/c/b/i$ae;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public final h()Lcom/c/b/i$ae$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 31314
    sget-object v0, Lcom/c/b/i$ae;->i:Lcom/c/b/i$ae;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/c/b/i$ae$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$ae$a;-><init>(B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/c/b/i$ae$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$ae$a;-><init>(B)V

    invoke-virtual {v0, p0}, Lcom/c/b/i$ae$a;->a(Lcom/c/b/i$ae;)Lcom/c/b/i$ae$a;

    move-result-object v0

    goto :goto_0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 32542
    sget-object v0, Lcom/c/b/i$ae;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 28858
    sget-object v0, Lcom/c/b/i$ae;->i:Lcom/c/b/i$ae;

    invoke-virtual {v0}, Lcom/c/b/i$ae;->h()Lcom/c/b/i$ae$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 28858
    invoke-virtual {p0}, Lcom/c/b/i$ae;->h()Lcom/c/b/i$ae$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 28858
    sget-object v0, Lcom/c/b/i$ae;->i:Lcom/c/b/i$ae;

    return-object v0
.end method
