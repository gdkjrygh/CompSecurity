.class public Lcom/qihoo/security/engine/e/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/engine/e/c$a;,
        Lcom/qihoo/security/engine/e/c$b;,
        Lcom/qihoo/security/engine/e/c$c;
    }
.end annotation


# instance fields
.field final a:Lcom/qihoo/security/engine/b/c;

.field public final b:Landroid/util/SparseBooleanArray;

.field private c:Z

.field private d:Lcom/qihoo/security/engine/e/b;

.field private e:I

.field private final f:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lcom/qihoo/security/engine/e/a;",
            ">;"
        }
    .end annotation
.end field

.field private volatile g:Z

.field private h:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(Lcom/qihoo/security/engine/b/c;)V
    .locals 4

    const/4 v3, 0x2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v1, p0, Lcom/qihoo/security/engine/e/c;->c:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/engine/e/c;->d:Lcom/qihoo/security/engine/e/b;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/e/c;->f:Landroid/util/SparseArray;

    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/e/c;->b:Landroid/util/SparseBooleanArray;

    iput-boolean v1, p0, Lcom/qihoo/security/engine/e/c;->g:Z

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/engine/e/c;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, Lcom/qihoo/security/engine/e/c;->a:Lcom/qihoo/security/engine/b/c;

    iget-object v0, p0, Lcom/qihoo/security/engine/e/c;->f:Landroid/util/SparseArray;

    new-instance v1, Lcom/qihoo/security/engine/e/a;

    const/16 v2, 0x32

    invoke-direct {v1, v3, p1, v2}, Lcom/qihoo/security/engine/e/a;-><init>(ILcom/qihoo/security/engine/b/c;I)V

    invoke-virtual {v0, v3, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    return-void
.end method

.method private a(ILcom/qihoo/security/services/ScanResult;)I
    .locals 7

    const/4 v2, 0x2

    const/4 v0, 0x1

    const/4 v1, 0x4

    :try_start_0
    iget-object v3, p0, Lcom/qihoo/security/engine/e/c;->a:Lcom/qihoo/security/engine/b/c;

    iget-object v3, v3, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    invoke-virtual {v3, p1}, Lcom/qihoo/security/services/d;->a(I)Lcom/qihoo/security/services/a;

    move-result-object v4

    const v3, -0x7fffbffc

    if-eqz v4, :cond_4

    iget-boolean v5, p0, Lcom/qihoo/security/engine/e/c;->g:Z

    if-eqz v5, :cond_1

    move v0, v1

    :cond_0
    :goto_0
    return v0

    :cond_1
    sget-boolean v5, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    if-eqz v5, :cond_2

    :cond_2
    iget-object v5, p0, Lcom/qihoo/security/engine/e/c;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-interface {v4, p1, p2}, Lcom/qihoo/security/services/a;->a(ILcom/qihoo/security/services/ScanResult;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result v3

    :goto_1
    :try_start_2
    iget-object v4, p0, Lcom/qihoo/security/engine/e/c;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    if-nez v3, :cond_5

    sget-boolean v1, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :catch_0
    move-exception v4

    iget-object v5, p0, Lcom/qihoo/security/engine/e/c;->a:Lcom/qihoo/security/engine/b/c;

    iget-object v6, p2, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v6, v6, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, p1, v6, v4}, Lcom/qihoo/security/engine/b/c;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v0

    :cond_3
    move v0, v1

    goto :goto_0

    :cond_4
    move v0, v1

    goto :goto_0

    :cond_5
    iget-boolean v0, p0, Lcom/qihoo/security/engine/e/c;->g:Z

    if-eqz v0, :cond_6

    move v0, v1

    goto :goto_0

    :cond_6
    packed-switch p1, :pswitch_data_0

    :pswitch_0
    const/4 v0, 0x0

    :cond_7
    :goto_2
    if-eqz v0, :cond_3

    iget-object v3, p0, Lcom/qihoo/security/engine/e/c;->a:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v3, v0}, Lcom/qihoo/security/engine/b/c;->a(Lcom/qihoo/security/engine/a;)V

    move v0, v2

    goto :goto_0

    :pswitch_1
    new-instance v3, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/qihoo/security/engine/a;

    const/4 v4, 0x1

    iget-object v5, p0, Lcom/qihoo/security/engine/e/c;->a:Lcom/qihoo/security/engine/b/c;

    iget-object v5, v5, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    iget-object v6, p0, Lcom/qihoo/security/engine/e/c;->a:Lcom/qihoo/security/engine/b/c;

    invoke-direct {v0, v4, v5, v3, v6}, Lcom/qihoo/security/engine/a;-><init>(ILcom/qihoo/security/services/d;Ljava/util/List;Lcom/qihoo/security/engine/a$a;)V

    goto :goto_2

    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/engine/e/c;->f:Landroid/util/SparseArray;

    const/4 v3, 0x2

    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/e/a;

    const/4 v3, 0x0

    invoke-virtual {v0, p2, v3}, Lcom/qihoo/security/engine/e/a;->a(Lcom/qihoo/security/services/ScanResult;Z)Lcom/qihoo/security/engine/a;

    move-result-object v0

    if-nez v0, :cond_7

    move v0, v2

    goto :goto_0

    :pswitch_3
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/qihoo/security/engine/a;

    const/4 v4, 0x6

    iget-object v5, p0, Lcom/qihoo/security/engine/e/c;->a:Lcom/qihoo/security/engine/b/c;

    iget-object v5, v5, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    iget-object v6, p0, Lcom/qihoo/security/engine/e/c;->a:Lcom/qihoo/security/engine/b/c;

    invoke-direct {v0, v4, v5, v3, v6}, Lcom/qihoo/security/engine/a;-><init>(ILcom/qihoo/security/services/d;Ljava/util/List;Lcom/qihoo/security/engine/a$a;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method private a(ILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/engine/a;",
            ">;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/qihoo/security/engine/e/c;->g:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/engine/e/c;->b:Landroid/util/SparseBooleanArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/e/c;->f:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/e/a;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/e/a;->a()Lcom/qihoo/security/engine/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/engine/e/c;I)V
    .locals 0

    iput p1, p0, Lcom/qihoo/security/engine/e/c;->e:I

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/engine/e/c;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/qihoo/security/engine/e/c;->g:Z

    return v0
.end method

.method private a(Lcom/qihoo/security/services/ScanResult;)Z
    .locals 4

    const/16 v3, 0x7f

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/qihoo/security/engine/e/c;->g()Lcom/qihoo/security/engine/e/b;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/qihoo/security/engine/e/b;->b(Lcom/qihoo/security/services/ScanResult;)I

    move-result v2

    if-nez v2, :cond_0

    iput v3, p1, Lcom/qihoo/security/services/ScanResult;->state:I

    :goto_0
    return v0

    :cond_0
    invoke-direct {p0, v2, p1}, Lcom/qihoo/security/engine/e/c;->a(ILcom/qihoo/security/services/ScanResult;)I

    move-result v2

    if-ne v2, v0, :cond_2

    invoke-interface {v1, p1}, Lcom/qihoo/security/engine/e/b;->a(Lcom/qihoo/security/services/ScanResult;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0, p1}, Lcom/qihoo/security/engine/e/c;->a(Lcom/qihoo/security/services/ScanResult;)Z

    move-result v0

    goto :goto_0

    :cond_1
    iput v3, p1, Lcom/qihoo/security/services/ScanResult;->state:I

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/engine/e/c;)I
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/e/c;->e:I

    return v0
.end method


# virtual methods
.method public a(IILjava/util/List;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/services/ScanResult;",
            ">;)I"
        }
    .end annotation

    const/4 v6, 0x2

    const/4 v1, 0x0

    if-ne p1, v6, :cond_2

    invoke-static {p2}, Lcom/qihoo/security/engine/consts/a;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/engine/e/c;->b:Landroid/util/SparseBooleanArray;

    const/4 v2, 0x7

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_5

    :cond_1
    iget-boolean v0, p0, Lcom/qihoo/security/engine/e/c;->g:Z

    if-eqz v0, :cond_6

    :cond_2
    :goto_1
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_7

    :cond_4
    iget-boolean v0, p0, Lcom/qihoo/security/engine/e/c;->g:Z

    if-eqz v0, :cond_c

    const v0, -0x7fffbffc

    :goto_3
    return v0

    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/ScanResult;

    iget-boolean v4, p0, Lcom/qihoo/security/engine/e/c;->g:Z

    if-nez v4, :cond_1

    iget-object v4, v0, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-boolean v4, v4, Lcom/qihoo/security/engine/FileInfo;->shouldUpload:Z

    if-eqz v4, :cond_0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/engine/e/c;->a:Lcom/qihoo/security/engine/b/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/c;->i:Lcom/qihoo/security/engine/b/g;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/engine/b/g;->a(Ljava/util/List;)V

    goto :goto_1

    :cond_7
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/ScanResult;

    iget-boolean v3, p0, Lcom/qihoo/security/engine/e/c;->g:Z

    if-nez v3, :cond_4

    if-ne p1, v6, :cond_8

    invoke-static {p2}, Lcom/qihoo/security/engine/consts/a;->a(I)Z

    move-result v3

    if-eqz v3, :cond_8

    iget-object v3, v0, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    if-eqz v3, :cond_8

    const-string/jumbo v4, "ec"

    const-string/jumbo v5, "em"

    invoke-virtual {v3, v4, v5}, Lcom/qihoo/security/engine/FileInfo;->getExIniValue(Ljava/lang/String;Ljava/lang/String;)Lnet/jarlehansen/protobuf/javame/b;

    move-result-object v3

    invoke-virtual {v3}, Lnet/jarlehansen/protobuf/javame/b;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_8

    const-string/jumbo v4, "0"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    :cond_8
    sget-boolean v3, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    if-eqz v3, :cond_9

    :cond_9
    invoke-static {p2}, Lcom/qihoo/security/engine/consts/a;->b(I)Z

    move-result v3

    if-nez v3, :cond_a

    invoke-virtual {p0}, Lcom/qihoo/security/engine/e/c;->g()Lcom/qihoo/security/engine/e/b;

    move-result-object v3

    invoke-interface {v3, v0}, Lcom/qihoo/security/engine/e/b;->a(Lcom/qihoo/security/services/ScanResult;)Z

    move-result v3

    if-eqz v3, :cond_b

    :cond_a
    invoke-direct {p0, v0}, Lcom/qihoo/security/engine/e/c;->a(Lcom/qihoo/security/services/ScanResult;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/qihoo/security/engine/e/c;->a:Lcom/qihoo/security/engine/b/c;

    iget-object v3, v3, Lcom/qihoo/security/engine/b/c;->h:Lcom/qihoo/security/engine/b/d;

    invoke-virtual {v3, v0}, Lcom/qihoo/security/engine/b/d;->a(Lcom/qihoo/security/services/ScanResult;)V

    goto/16 :goto_2

    :cond_b
    const/16 v3, 0x7f

    iput v3, v0, Lcom/qihoo/security/services/ScanResult;->state:I

    iget-object v3, p0, Lcom/qihoo/security/engine/e/c;->a:Lcom/qihoo/security/engine/b/c;

    iget-object v3, v3, Lcom/qihoo/security/engine/b/c;->h:Lcom/qihoo/security/engine/b/d;

    invoke-virtual {v3, v0}, Lcom/qihoo/security/engine/b/d;->a(Lcom/qihoo/security/services/ScanResult;)V

    goto/16 :goto_2

    :cond_c
    move v0, v1

    goto/16 :goto_3
.end method

.method public a(Lcom/qihoo/security/engine/d/b;)I
    .locals 8

    const/16 v7, 0x7f

    const/4 v2, 0x0

    const/4 v6, 0x2

    const v1, -0x7fffbffc

    new-instance v3, Lcom/qihoo/security/services/ScanResult;

    invoke-direct {v3, p1}, Lcom/qihoo/security/services/ScanResult;-><init>(Lcom/qihoo/security/engine/d/b;)V

    iget-object v0, p1, Lcom/qihoo/security/engine/d/b;->c:Lcom/qihoo/security/engine/FileInfo;

    iget v0, v0, Lcom/qihoo/security/engine/FileInfo;->fileType:I

    if-eqz v0, :cond_2

    sget-boolean v0, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/qihoo/security/engine/e/c;->b:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, v6, v2}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/qihoo/security/engine/e/c;->a:Lcom/qihoo/security/engine/b/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    invoke-virtual {v0, v6}, Lcom/qihoo/security/services/d;->a(I)Lcom/qihoo/security/services/a;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-boolean v4, p0, Lcom/qihoo/security/engine/e/c;->g:Z

    if-eqz v4, :cond_1

    :cond_0
    :goto_0
    return v1

    :cond_1
    iget-object v4, p0, Lcom/qihoo/security/engine/e/c;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    const/4 v4, 0x2

    :try_start_0
    invoke-interface {v0, v4, v3}, Lcom/qihoo/security/services/a;->a(ILcom/qihoo/security/services/ScanResult;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_1
    iget-object v4, p0, Lcom/qihoo/security/engine/e/c;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    :goto_2
    iget-boolean v4, p0, Lcom/qihoo/security/engine/e/c;->g:Z

    if-nez v4, :cond_0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/qihoo/security/engine/e/c;->g()Lcom/qihoo/security/engine/e/b;

    move-result-object v0

    invoke-interface {v0, v3}, Lcom/qihoo/security/engine/e/b;->a(Lcom/qihoo/security/services/ScanResult;)Z

    move-result v0

    if-nez v0, :cond_3

    iput v7, v3, Lcom/qihoo/security/services/ScanResult;->state:I

    :cond_2
    :goto_3
    iget-boolean v0, p0, Lcom/qihoo/security/engine/e/c;->g:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/e/c;->a:Lcom/qihoo/security/engine/b/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/c;->h:Lcom/qihoo/security/engine/b/d;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/engine/b/d;->a(Lcom/qihoo/security/services/ScanResult;)V

    move v1, v2

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v4, p0, Lcom/qihoo/security/engine/e/c;->a:Lcom/qihoo/security/engine/b/c;

    iget-object v5, v3, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v5, v5, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v6, v5, v0}, Lcom/qihoo/security/engine/b/c;->a(ILjava/lang/String;Ljava/lang/String;)V

    move v0, v1

    goto :goto_1

    :cond_3
    iput v2, v3, Lcom/qihoo/security/services/ScanResult;->state:I

    invoke-direct {p0, v3}, Lcom/qihoo/security/engine/e/c;->a(Lcom/qihoo/security/services/ScanResult;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput v7, v3, Lcom/qihoo/security/services/ScanResult;->state:I

    goto :goto_3

    :cond_4
    move v0, v1

    goto :goto_2
.end method

.method public a()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/e/c;->g:Z

    iget-object v0, p0, Lcom/qihoo/security/engine/e/c;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v0, p0, Lcom/qihoo/security/engine/e/c;->f:Landroid/util/SparseArray;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/e/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/qihoo/security/engine/e/a;->c()V

    :cond_0
    return-void
.end method

.method public a(II)V
    .locals 3

    iget-object v0, p0, Lcom/qihoo/security/engine/e/c;->f:Landroid/util/SparseArray;

    new-instance v1, Lcom/qihoo/security/engine/e/a;

    iget-object v2, p0, Lcom/qihoo/security/engine/e/c;->a:Lcom/qihoo/security/engine/b/c;

    invoke-direct {v1, p1, v2, p2}, Lcom/qihoo/security/engine/e/a;-><init>(ILcom/qihoo/security/engine/b/c;I)V

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public a(IZ)V
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/e/c;->b:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseBooleanArray;->put(IZ)V

    return-void
.end method

.method public b()V
    .locals 4

    const/4 v2, 0x2

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/qihoo/security/engine/e/c;->g:Z

    iget-object v0, p0, Lcom/qihoo/security/engine/e/c;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/engine/e/c;->d:Lcom/qihoo/security/engine/e/b;

    iget-object v0, p0, Lcom/qihoo/security/engine/e/c;->f:Landroid/util/SparseArray;

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/e/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/qihoo/security/engine/e/a;->d()V

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/e/c;->a:Lcom/qihoo/security/engine/b/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    invoke-virtual {v0}, Lcom/qihoo/security/services/d;->e()Lcom/qihoo/security/services/a;

    move-result-object v0

    if-eqz v0, :cond_3

    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/engine/e/c;->b:Landroid/util/SparseBooleanArray;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->e(I)I

    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/engine/e/c;->b:Landroid/util/SparseBooleanArray;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->e(I)I

    :cond_2
    iget-object v1, p0, Lcom/qihoo/security/engine/e/c;->b:Landroid/util/SparseBooleanArray;

    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x6

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->e(I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public c()V
    .locals 4

    iget-object v0, p0, Lcom/qihoo/security/engine/e/c;->a:Lcom/qihoo/security/engine/b/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    invoke-virtual {v0}, Lcom/qihoo/security/services/d;->e()Lcom/qihoo/security/services/a;

    move-result-object v0

    if-eqz v0, :cond_2

    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/engine/e/c;->b:Landroid/util/SparseBooleanArray;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->g(I)I

    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/engine/e/c;->b:Landroid/util/SparseBooleanArray;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->g(I)I

    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/engine/e/c;->b:Landroid/util/SparseBooleanArray;

    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x6

    invoke-interface {v0, v1}, Lcom/qihoo/security/services/a;->g(I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/e/c;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()Z
    .locals 2

    iget-object v0, p0, Lcom/qihoo/security/engine/e/c;->f:Landroid/util/SparseArray;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/e/a;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/e/a;->b()Z

    move-result v0

    return v0
.end method

.method public f()Z
    .locals 3

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    const/4 v1, 0x2

    invoke-direct {p0, v1, v0}, Lcom/qihoo/security/engine/e/c;->a(ILjava/util/List;)V

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/a;

    iget-object v2, p0, Lcom/qihoo/security/engine/e/c;->a:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v2, v0}, Lcom/qihoo/security/engine/b/c;->a(Lcom/qihoo/security/engine/a;)V

    goto :goto_1
.end method

.method g()Lcom/qihoo/security/engine/e/b;
    .locals 3

    iget-boolean v0, p0, Lcom/qihoo/security/engine/e/c;->c:Z

    sget-boolean v1, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    xor-int/2addr v0, v1

    iget-object v1, p0, Lcom/qihoo/security/engine/e/c;->d:Lcom/qihoo/security/engine/e/b;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_1

    :cond_0
    sget-boolean v0, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    iput-boolean v0, p0, Lcom/qihoo/security/engine/e/c;->c:Z

    sget-boolean v0, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/engine/e/c;->e:I

    new-instance v0, Lcom/qihoo/security/engine/e/c$a;

    invoke-direct {v0, p0}, Lcom/qihoo/security/engine/e/c$a;-><init>(Lcom/qihoo/security/engine/e/c;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/e/c;->d:Lcom/qihoo/security/engine/e/b;

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/engine/e/c;->d:Lcom/qihoo/security/engine/e/b;

    return-object v0

    :cond_2
    const-string/jumbo v0, "1"

    iget-object v1, p0, Lcom/qihoo/security/engine/e/c;->a:Lcom/qihoo/security/engine/b/c;

    const-string/jumbo v2, "scan.cloudfirst"

    invoke-virtual {v1, v2}, Lcom/qihoo/security/engine/b/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Lcom/qihoo/security/engine/e/c$b;

    invoke-direct {v0, p0}, Lcom/qihoo/security/engine/e/c$b;-><init>(Lcom/qihoo/security/engine/e/c;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/e/c;->d:Lcom/qihoo/security/engine/e/b;

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/qihoo/security/engine/e/c$c;

    invoke-direct {v0, p0}, Lcom/qihoo/security/engine/e/c$c;-><init>(Lcom/qihoo/security/engine/e/c;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/e/c;->d:Lcom/qihoo/security/engine/e/b;

    goto :goto_0
.end method
