.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# static fields
.field private static final c:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$i;",
            ">;"
        }
    .end annotation
.end field

.field private static final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$d;

.field private b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/16 v8, 0x63

    const/16 v7, 0x5a

    const/16 v6, 0x50

    const/16 v5, 0x32

    const/16 v4, 0xa

    .line 2271
    new-instance v0, Landroid/util/SparseArray;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->c:Landroid/util/SparseArray;

    .line 2272
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->d:Ljava/util/List;

    .line 2275
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->c:Landroid/util/SparseArray;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$i;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v4}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$i;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 2276
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->c:Landroid/util/SparseArray;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$i;

    invoke-direct {v2, v4, v6}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$i;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 2277
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->c:Landroid/util/SparseArray;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$i;

    const/16 v3, 0x400

    invoke-direct {v2, v6, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$i;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 2279
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->d:Ljava/util/List;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2280
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->d:Ljava/util/List;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2281
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->d:Ljava/util/List;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2282
    return-void
.end method

.method public constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$d;)V
    .locals 0

    .prologue
    .line 2284
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 2285
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$d;

    .line 2286
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 2289
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->b:Z

    .line 2290
    return-void
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 2293
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->b:Z

    return v0
.end method

.method public c()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 2297
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$d;

    if-eqz v0, :cond_0

    .line 2298
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$d;

    invoke-interface {v0, v1, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$d;->a(II)V

    .line 2300
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->start()V

    .line 2301
    return-void
.end method

.method public d()V
    .locals 1

    .prologue
    .line 2304
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$d;

    if-eqz v0, :cond_0

    .line 2305
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$d;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$d;->a()V

    .line 2307
    :cond_0
    return-void
.end method

.method public run()V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 2311
    move v1, v2

    move v3, v2

    .line 2315
    :goto_0
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->b:Z

    if-nez v0, :cond_0

    .line 2316
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v1, v0, :cond_1

    .line 2335
    :cond_0
    return-void

    .line 2319
    :cond_1
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 2320
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->c:Landroid/util/SparseArray;

    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$i;

    .line 2321
    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$i;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$i;)I

    move-result v5

    if-ne v5, v3, :cond_3

    .line 2322
    add-int/lit8 v1, v1, 0x1

    .line 2324
    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$d;

    if-eqz v3, :cond_2

    .line 2325
    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$d;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$i;->b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$i;)I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    invoke-interface {v3, v4, v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$d;->a(II)V

    :cond_2
    move v0, v1

    move v3, v2

    .line 2329
    :goto_1
    const-wide/16 v4, 0x3e8

    :try_start_0
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2333
    :goto_2
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    move v1, v0

    goto :goto_0

    .line 2330
    :catch_0
    move-exception v1

    .line 2331
    invoke-virtual {v1}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_2

    :cond_3
    move v0, v1

    goto :goto_1
.end method
