.class public Lcom/actionbarsherlock/internal/view/menu/a;
.super Ljava/lang/Object;
.source "MenuBuilder.java"

# interfaces
.implements Lcom/actionbarsherlock/a/a;


# static fields
.field private static final d:[I


# instance fields
.field a:Ljava/lang/CharSequence;

.field b:Landroid/graphics/drawable/Drawable;

.field c:Landroid/view/View;

.field private final e:Landroid/content/Context;

.field private final f:Landroid/content/res/Resources;

.field private g:Z

.field private h:Z

.field private i:Lcom/actionbarsherlock/internal/view/menu/b;

.field private j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/actionbarsherlock/internal/view/menu/c;",
            ">;"
        }
    .end annotation
.end field

.field private k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/actionbarsherlock/internal/view/menu/c;",
            ">;"
        }
    .end annotation
.end field

.field private l:Z

.field private m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/actionbarsherlock/internal/view/menu/c;",
            ">;"
        }
    .end annotation
.end field

.field private n:Landroid/view/ContextMenu$ContextMenuInfo;

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:Z

.field private s:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/actionbarsherlock/internal/view/menu/c;",
            ">;"
        }
    .end annotation
.end field

.field private t:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList",
            "<",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/actionbarsherlock/internal/view/menu/h;",
            ">;>;"
        }
    .end annotation
.end field

.field private u:Lcom/actionbarsherlock/internal/view/menu/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 59
    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/actionbarsherlock/internal/view/menu/a;->d:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x1
        0x4
        0x5
        0x3
        0x2
        0x0
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 167
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 130
    iput-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->o:Z

    .line 131
    iput-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->p:Z

    .line 133
    iput-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->q:Z

    .line 135
    iput-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->r:Z

    .line 137
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->s:Ljava/util/ArrayList;

    .line 139
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 168
    iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->e:Landroid/content/Context;

    .line 169
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->f:Landroid/content/res/Resources;

    .line 171
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    .line 173
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->k:Ljava/util/ArrayList;

    .line 174
    iput-boolean v1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->l:Z

    .line 176
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->m:Ljava/util/ArrayList;

    .line 178
    invoke-direct {p0, v1}, Lcom/actionbarsherlock/internal/view/menu/a;->e(Z)V

    .line 179
    return-void
.end method

.method private static a(Ljava/util/ArrayList;I)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/actionbarsherlock/internal/view/menu/c;",
            ">;I)I"
        }
    .end annotation

    .prologue
    .line 660
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_1

    .line 661
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/internal/view/menu/c;

    .line 662
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->f()I

    move-result v0

    if-gt v0, p1, :cond_0

    .line 663
    add-int/lit8 v0, v1, 0x1

    .line 667
    :goto_1
    return v0

    .line 660
    :cond_0
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 667
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private a(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 916
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/a;->f()Landroid/content/res/Resources;

    move-result-object v0

    .line 918
    if-eqz p5, :cond_0

    .line 919
    iput-object p5, p0, Lcom/actionbarsherlock/internal/view/menu/a;->c:Landroid/view/View;

    .line 922
    iput-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/a;->a:Ljava/lang/CharSequence;

    .line 923
    iput-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/a;->b:Landroid/graphics/drawable/Drawable;

    .line 942
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/a;->c(Z)V

    .line 943
    return-void

    .line 925
    :cond_0
    if-lez p1, :cond_3

    .line 926
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    iput-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->a:Ljava/lang/CharSequence;

    .line 931
    :cond_1
    :goto_1
    if-lez p3, :cond_4

    .line 932
    invoke-virtual {v0, p3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->b:Landroid/graphics/drawable/Drawable;

    .line 938
    :cond_2
    :goto_2
    iput-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/a;->c:Landroid/view/View;

    goto :goto_0

    .line 927
    :cond_3
    if-eqz p2, :cond_1

    .line 928
    iput-object p2, p0, Lcom/actionbarsherlock/internal/view/menu/a;->a:Ljava/lang/CharSequence;

    goto :goto_1

    .line 933
    :cond_4
    if-eqz p4, :cond_2

    .line 934
    iput-object p4, p0, Lcom/actionbarsherlock/internal/view/menu/a;->b:Landroid/graphics/drawable/Drawable;

    goto :goto_2
.end method

.method private a(Lcom/actionbarsherlock/internal/view/menu/l;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 224
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 236
    :goto_0
    return v0

    .line 228
    :cond_0
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v2, v0

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 229
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/actionbarsherlock/internal/view/menu/h;

    .line 230
    if-nez v1, :cond_1

    .line 231
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    move v0, v2

    :goto_2
    move v2, v0

    .line 235
    goto :goto_1

    .line 232
    :cond_1
    if-nez v2, :cond_3

    .line 233
    invoke-interface {v1, p1}, Lcom/actionbarsherlock/internal/view/menu/h;->a(Lcom/actionbarsherlock/internal/view/menu/l;)Z

    move-result v2

    move v0, v2

    goto :goto_2

    :cond_2
    move v0, v2

    .line 236
    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_2
.end method

.method private c(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/a/b;
    .locals 7

    .prologue
    .line 299
    invoke-static {p3}, Lcom/actionbarsherlock/internal/view/menu/a;->k(I)I

    move-result v5

    .line 301
    new-instance v0, Lcom/actionbarsherlock/internal/view/menu/c;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/actionbarsherlock/internal/view/menu/c;-><init>(Lcom/actionbarsherlock/internal/view/menu/a;IIIILjava/lang/CharSequence;)V

    .line 304
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->n:Landroid/view/ContextMenu$ContextMenuInfo;

    if-eqz v1, :cond_0

    .line 306
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->n:Landroid/view/ContextMenu$ContextMenuInfo;

    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/c;->a(Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 309
    :cond_0
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-static {v2, v5}, Lcom/actionbarsherlock/internal/view/menu/a;->a(Ljava/util/ArrayList;I)I

    move-result v2

    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 310
    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/view/menu/a;->c(Z)V

    .line 312
    return-object v0
.end method

.method private c(IZ)V
    .locals 1

    .prologue
    .line 411
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 416
    :cond_0
    :goto_0
    return-void

    .line 413
    :cond_1
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 415
    if-eqz p2, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/a;->c(Z)V

    goto :goto_0
.end method

.method private d(Z)V
    .locals 3

    .prologue
    .line 209
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 221
    :goto_0
    return-void

    .line 211
    :cond_0
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/a;->i()V

    .line 212
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 213
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/actionbarsherlock/internal/view/menu/h;

    .line 214
    if-nez v1, :cond_1

    .line 215
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    .line 217
    :cond_1
    invoke-interface {v1, p1}, Lcom/actionbarsherlock/internal/view/menu/h;->b(Z)V

    goto :goto_1

    .line 220
    :cond_2
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/a;->j()V

    goto :goto_0
.end method

.method private e(Z)V
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 625
    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->f:Landroid/content/res/Resources;

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->keyboard:I

    if-eq v1, v0, :cond_0

    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->f:Landroid/content/res/Resources;

    sget v2, Lcom/facebook/e;->abs__config_showMenuShortcutsWhenKeyboardPresent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    iput-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->h:Z

    .line 629
    return-void

    .line 625
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static k(I)I
    .locals 2

    .prologue
    .line 593
    const/high16 v0, -0x10000

    and-int/2addr v0, p0

    shr-int/lit8 v0, v0, 0x10

    .line 595
    if-ltz v0, :cond_0

    sget-object v1, Lcom/actionbarsherlock/internal/view/menu/a;->d:[I

    array-length v1, v1

    if-lt v0, v1, :cond_1

    .line 596
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "order does not contain a valid category."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 599
    :cond_1
    sget-object v1, Lcom/actionbarsherlock/internal/view/menu/a;->d:[I

    aget v0, v1, v0

    shl-int/lit8 v0, v0, 0x10

    const v1, 0xffff

    and-int/2addr v1, p0

    or-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public a(II)I
    .locals 3

    .prologue
    .line 545
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/a;->c()I

    move-result v2

    .line 547
    if-gez p2, :cond_0

    .line 548
    const/4 p2, 0x0

    :cond_0
    move v1, p2

    .line 551
    :goto_0
    if-ge v1, v2, :cond_2

    .line 552
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/internal/view/menu/c;

    .line 554
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->c()I

    move-result v0

    if-ne v0, p1, :cond_1

    move v0, v1

    .line 559
    :goto_1
    return v0

    .line 551
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 559
    :cond_2
    const/4 v0, -0x1

    goto :goto_1
.end method

.method public a(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Lcom/actionbarsherlock/a/b;)I
    .locals 9

    .prologue
    .line 353
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 354
    const/4 v0, 0x0

    invoke-virtual {v4, p4, p5, p6, v0}, Landroid/content/pm/PackageManager;->queryIntentActivityOptions(Landroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v5

    .line 356
    if-eqz v5, :cond_2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    move v3, v0

    .line 358
    :goto_0
    and-int/lit8 v0, p7, 0x1

    if-nez v0, :cond_0

    .line 359
    invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/a;->d(I)V

    .line 362
    :cond_0
    const/4 v0, 0x0

    move v2, v0

    :goto_1
    if-ge v2, v3, :cond_4

    .line 363
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 364
    new-instance v6, Landroid/content/Intent;

    iget v1, v0, Landroid/content/pm/ResolveInfo;->specificIndex:I

    if-gez v1, :cond_3

    move-object v1, p6

    :goto_2
    invoke-direct {v6, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 366
    new-instance v1, Landroid/content/ComponentName;

    iget-object v7, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v7, v7, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v7, v7, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    iget-object v8, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v8, v8, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-direct {v1, v7, v8}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 369
    invoke-virtual {v0, v4}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p0, p1, p2, p3, v1}, Lcom/actionbarsherlock/internal/view/menu/a;->a(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/a/b;

    move-result-object v1

    invoke-virtual {v0, v4}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-interface {v1, v7}, Lcom/actionbarsherlock/a/b;->a(Landroid/graphics/drawable/Drawable;)Lcom/actionbarsherlock/a/b;

    move-result-object v1

    invoke-interface {v1, v6}, Lcom/actionbarsherlock/a/b;->a(Landroid/content/Intent;)Lcom/actionbarsherlock/a/b;

    move-result-object v1

    .line 372
    if-eqz p8, :cond_1

    iget v6, v0, Landroid/content/pm/ResolveInfo;->specificIndex:I

    if-ltz v6, :cond_1

    .line 373
    iget v0, v0, Landroid/content/pm/ResolveInfo;->specificIndex:I

    aput-object v1, p8, v0

    .line 362
    :cond_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 356
    :cond_2
    const/4 v0, 0x0

    move v3, v0

    goto :goto_0

    .line 364
    :cond_3
    iget v1, v0, Landroid/content/pm/ResolveInfo;->specificIndex:I

    aget-object v1, p5, v1

    goto :goto_2

    .line 377
    :cond_4
    return v3
.end method

.method public a(I)Lcom/actionbarsherlock/a/b;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 320
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->f:Landroid/content/res/Resources;

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v1, v1, v0}, Lcom/actionbarsherlock/internal/view/menu/a;->c(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/a/b;

    move-result-object v0

    return-object v0
.end method

.method public a(IIII)Lcom/actionbarsherlock/a/b;
    .locals 1

    .prologue
    .line 328
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->f:Landroid/content/res/Resources;

    invoke-virtual {v0, p4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/actionbarsherlock/internal/view/menu/a;->c(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/a/b;

    move-result-object v0

    return-object v0
.end method

.method public a(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/a/b;
    .locals 1

    .prologue
    .line 324
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/actionbarsherlock/internal/view/menu/a;->c(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/a/b;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/a/b;
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 316
    invoke-direct {p0, v0, v0, v0, p1}, Lcom/actionbarsherlock/internal/view/menu/a;->c(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/a/b;

    move-result-object v0

    return-object v0
.end method

.method protected a(Landroid/graphics/drawable/Drawable;)Lcom/actionbarsherlock/internal/view/menu/a;
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 977
    move-object v0, p0

    move v3, v1

    move-object v4, p1

    move-object v5, v2

    invoke-direct/range {v0 .. v5}, Lcom/actionbarsherlock/internal/view/menu/a;->a(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    .line 978
    return-object p0
.end method

.method protected a(Landroid/view/View;)Lcom/actionbarsherlock/internal/view/menu/a;
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 1001
    move-object v0, p0

    move v3, v1

    move-object v4, v2

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/actionbarsherlock/internal/view/menu/a;->a(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    .line 1002
    return-object p0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 432
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->u:Lcom/actionbarsherlock/internal/view/menu/c;

    if-eqz v0, :cond_0

    .line 433
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->u:Lcom/actionbarsherlock/internal/view/menu/c;

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/a;->b(Lcom/actionbarsherlock/internal/view/menu/c;)Z

    .line 435
    :cond_0
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 437
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/a;->c(Z)V

    .line 438
    return-void
.end method

.method public a(IZ)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 469
    iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v3, v0

    move v2, v0

    .line 475
    :goto_0
    if-ge v3, v4, :cond_0

    .line 476
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/internal/view/menu/c;

    .line 477
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->c()I

    move-result v5

    if-ne v5, p1, :cond_2

    .line 478
    invoke-virtual {v0, p2}, Lcom/actionbarsherlock/internal/view/menu/c;->f(Z)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    .line 475
    :goto_1
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    move v2, v0

    goto :goto_0

    .line 482
    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/view/menu/a;->c(Z)V

    .line 483
    :cond_1
    return-void

    :cond_2
    move v0, v2

    goto :goto_1
.end method

.method public a(IZZ)V
    .locals 4

    .prologue
    .line 457
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 459
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 460
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/internal/view/menu/c;

    .line 461
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->c()I

    move-result v3

    if-ne v3, p1, :cond_0

    .line 462
    invoke-virtual {v0, p3}, Lcom/actionbarsherlock/internal/view/menu/c;->c(Z)V

    .line 463
    invoke-virtual {v0, p2}, Lcom/actionbarsherlock/internal/view/menu/c;->b(Z)Lcom/actionbarsherlock/a/b;

    .line 459
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 466
    :cond_1
    return-void
.end method

.method a(Lcom/actionbarsherlock/a/b;)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 441
    invoke-interface {p1}, Lcom/actionbarsherlock/a/b;->c()I

    move-result v4

    .line 443
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v3, v2

    .line 444
    :goto_0
    if-ge v3, v5, :cond_3

    .line 445
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/internal/view/menu/c;

    .line 446
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->c()I

    move-result v1

    if-ne v1, v4, :cond_0

    .line 447
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->s()Z

    move-result v1

    if-nez v1, :cond_1

    .line 444
    :cond_0
    :goto_1
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 448
    :cond_1
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->r()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 451
    if-ne v0, p1, :cond_2

    const/4 v1, 0x1

    :goto_2
    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/c;->e(Z)V

    goto :goto_1

    :cond_2
    move v1, v2

    goto :goto_2

    .line 454
    :cond_3
    return-void
.end method

.method public a(Lcom/actionbarsherlock/internal/view/menu/b;)V
    .locals 0

    .prologue
    .line 292
    iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->i:Lcom/actionbarsherlock/internal/view/menu/b;

    .line 293
    return-void
.end method

.method a(Lcom/actionbarsherlock/internal/view/menu/c;)V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 880
    iput-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->l:Z

    .line 881
    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/a;->c(Z)V

    .line 882
    return-void
.end method

.method public a(Lcom/actionbarsherlock/internal/view/menu/h;)V
    .locals 2

    .prologue
    .line 189
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 190
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->e:Landroid/content/Context;

    invoke-interface {p1, v0, p0}, Lcom/actionbarsherlock/internal/view/menu/h;->a(Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/a;)V

    .line 191
    return-void
.end method

.method a(Ljava/util/List;ILandroid/view/KeyEvent;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/actionbarsherlock/internal/view/menu/c;",
            ">;I",
            "Landroid/view/KeyEvent;",
            ")V"
        }
    .end annotation

    .prologue
    const/16 v10, 0x43

    const/4 v3, 0x0

    .line 694
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/a;->d()Z

    move-result v4

    .line 695
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v5

    .line 696
    new-instance v6, Landroid/view/KeyCharacterMap$KeyData;

    invoke-direct {v6}, Landroid/view/KeyCharacterMap$KeyData;-><init>()V

    .line 698
    invoke-virtual {p3, v6}, Landroid/view/KeyEvent;->getKeyData(Landroid/view/KeyCharacterMap$KeyData;)Z

    move-result v0

    .line 700
    if-nez v0, :cond_1

    if-eq p2, v10, :cond_1

    .line 722
    :cond_0
    return-void

    .line 705
    :cond_1
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    move v2, v3

    .line 706
    :goto_0
    if-ge v2, v7, :cond_0

    .line 707
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/internal/view/menu/c;

    .line 708
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->n()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 709
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->m()Lcom/actionbarsherlock/a/d;

    move-result-object v1

    check-cast v1, Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v1, p1, p2, p3}, Lcom/actionbarsherlock/internal/view/menu/a;->a(Ljava/util/List;ILandroid/view/KeyEvent;)V

    .line 711
    :cond_2
    if-eqz v4, :cond_5

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->h()C

    move-result v1

    .line 712
    :goto_1
    and-int/lit8 v8, v5, 0x5

    if-nez v8, :cond_4

    if-eqz v1, :cond_4

    iget-object v8, v6, Landroid/view/KeyCharacterMap$KeyData;->meta:[C

    aget-char v8, v8, v3

    if-eq v1, v8, :cond_3

    iget-object v8, v6, Landroid/view/KeyCharacterMap$KeyData;->meta:[C

    const/4 v9, 0x2

    aget-char v8, v8, v9

    if-eq v1, v8, :cond_3

    if-eqz v4, :cond_4

    const/16 v8, 0x8

    if-ne v1, v8, :cond_4

    if-ne p2, v10, :cond_4

    :cond_3
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->b()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 719
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 706
    :cond_4
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 711
    :cond_5
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->i()C

    move-result v1

    goto :goto_1
.end method

.method public a(Z)V
    .locals 1

    .prologue
    .line 576
    iput-boolean p1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->g:Z

    .line 578
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/a;->c(Z)V

    .line 579
    return-void
.end method

.method public a(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 572
    invoke-virtual {p0, p1, p2}, Lcom/actionbarsherlock/internal/view/menu/a;->b(ILandroid/view/KeyEvent;)Lcom/actionbarsherlock/internal/view/menu/c;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(ILandroid/view/KeyEvent;I)Z
    .locals 2

    .prologue
    .line 671
    invoke-virtual {p0, p1, p2}, Lcom/actionbarsherlock/internal/view/menu/a;->b(ILandroid/view/KeyEvent;)Lcom/actionbarsherlock/internal/view/menu/c;

    move-result-object v1

    .line 673
    const/4 v0, 0x0

    .line 675
    if-eqz v1, :cond_0

    .line 676
    invoke-virtual {p0, v1, p3}, Lcom/actionbarsherlock/internal/view/menu/a;->a(Lcom/actionbarsherlock/a/b;I)Z

    move-result v0

    .line 679
    :cond_0
    and-int/lit8 v1, p3, 0x2

    if-eqz v1, :cond_1

    .line 680
    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/actionbarsherlock/internal/view/menu/a;->b(Z)V

    .line 683
    :cond_1
    return v0
.end method

.method public a(Lcom/actionbarsherlock/a/b;I)Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 782
    move-object v0, p1

    check-cast v0, Lcom/actionbarsherlock/internal/view/menu/c;

    .line 784
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->b()Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    move v0, v2

    .line 802
    :cond_1
    :goto_0
    return v0

    .line 788
    :cond_2
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->a()Z

    move-result v1

    .line 790
    invoke-interface {p1}, Lcom/actionbarsherlock/a/b;->n()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 791
    invoke-virtual {p0, v2}, Lcom/actionbarsherlock/internal/view/menu/a;->b(Z)V

    .line 793
    invoke-interface {p1}, Lcom/actionbarsherlock/a/b;->m()Lcom/actionbarsherlock/a/d;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/internal/view/menu/l;

    .line 794
    invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/a;->a(Lcom/actionbarsherlock/internal/view/menu/l;)Z

    move-result v0

    or-int/2addr v0, v1

    .line 795
    if-nez v0, :cond_1

    invoke-virtual {p0, v3}, Lcom/actionbarsherlock/internal/view/menu/a;->b(Z)V

    goto :goto_0

    .line 797
    :cond_3
    and-int/lit8 v0, p2, 0x1

    if-nez v0, :cond_4

    .line 798
    invoke-virtual {p0, v3}, Lcom/actionbarsherlock/internal/view/menu/a;->b(Z)V

    :cond_4
    move v0, v1

    goto :goto_0
.end method

.method a(Lcom/actionbarsherlock/internal/view/menu/a;Lcom/actionbarsherlock/a/b;)Z
    .locals 1

    .prologue
    .line 647
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->i:Lcom/actionbarsherlock/internal/view/menu/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->i:Lcom/actionbarsherlock/internal/view/menu/b;

    invoke-interface {v0, p1, p2}, Lcom/actionbarsherlock/internal/view/menu/b;->a(Lcom/actionbarsherlock/internal/view/menu/a;Lcom/actionbarsherlock/a/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(I)Lcom/actionbarsherlock/a/d;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 336
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->f:Landroid/content/res/Resources;

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v1, v1, v0}, Lcom/actionbarsherlock/internal/view/menu/a;->b(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/a/d;

    move-result-object v0

    return-object v0
.end method

.method public b(IIII)Lcom/actionbarsherlock/a/d;
    .locals 1

    .prologue
    .line 348
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->f:Landroid/content/res/Resources;

    invoke-virtual {v0, p4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/actionbarsherlock/internal/view/menu/a;->b(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/a/d;

    move-result-object v0

    return-object v0
.end method

.method public b(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/a/d;
    .locals 3

    .prologue
    .line 340
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/actionbarsherlock/internal/view/menu/a;->c(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/a/b;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/internal/view/menu/c;

    .line 341
    new-instance v1, Lcom/actionbarsherlock/internal/view/menu/l;

    iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/a;->e:Landroid/content/Context;

    invoke-direct {v1, v2, p0, v0}, Lcom/actionbarsherlock/internal/view/menu/l;-><init>(Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/a;Lcom/actionbarsherlock/internal/view/menu/c;)V

    .line 342
    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/c;->a(Lcom/actionbarsherlock/internal/view/menu/l;)V

    .line 344
    return-object v1
.end method

.method public b(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/a/d;
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 332
    invoke-virtual {p0, v0, v0, v0, p1}, Lcom/actionbarsherlock/internal/view/menu/a;->b(IIILjava/lang/CharSequence;)Lcom/actionbarsherlock/a/d;

    move-result-object v0

    return-object v0
.end method

.method b(ILandroid/view/KeyEvent;)Lcom/actionbarsherlock/internal/view/menu/c;
    .locals 12

    .prologue
    const/4 v2, 0x0

    const/4 v4, 0x0

    .line 738
    iget-object v5, p0, Lcom/actionbarsherlock/internal/view/menu/a;->s:Ljava/util/ArrayList;

    .line 739
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 740
    invoke-virtual {p0, v5, p1, p2}, Lcom/actionbarsherlock/internal/view/menu/a;->a(Ljava/util/List;ILandroid/view/KeyEvent;)V

    .line 742
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, v2

    .line 773
    :cond_0
    :goto_0
    return-object v0

    .line 746
    :cond_1
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v6

    .line 747
    new-instance v7, Landroid/view/KeyCharacterMap$KeyData;

    invoke-direct {v7}, Landroid/view/KeyCharacterMap$KeyData;-><init>()V

    .line 749
    invoke-virtual {p2, v7}, Landroid/view/KeyEvent;->getKeyData(Landroid/view/KeyCharacterMap$KeyData;)Z

    .line 752
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v8

    .line 753
    const/4 v0, 0x1

    if-ne v8, v0, :cond_2

    .line 754
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/internal/view/menu/c;

    goto :goto_0

    .line 757
    :cond_2
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/a;->d()Z

    move-result v9

    move v3, v4

    .line 760
    :goto_1
    if-ge v3, v8, :cond_7

    .line 761
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/internal/view/menu/c;

    .line 762
    if-eqz v9, :cond_6

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->h()C

    move-result v1

    .line 764
    :goto_2
    iget-object v10, v7, Landroid/view/KeyCharacterMap$KeyData;->meta:[C

    aget-char v10, v10, v4

    if-ne v1, v10, :cond_3

    and-int/lit8 v10, v6, 0x2

    if-eqz v10, :cond_0

    :cond_3
    iget-object v10, v7, Landroid/view/KeyCharacterMap$KeyData;->meta:[C

    const/4 v11, 0x2

    aget-char v10, v10, v11

    if-ne v1, v10, :cond_4

    and-int/lit8 v10, v6, 0x2

    if-nez v10, :cond_0

    :cond_4
    if-eqz v9, :cond_5

    const/16 v10, 0x8

    if-ne v1, v10, :cond_5

    const/16 v1, 0x43

    if-eq p1, v1, :cond_0

    .line 760
    :cond_5
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 762
    :cond_6
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->i()C

    move-result v1

    goto :goto_2

    :cond_7
    move-object v0, v2

    .line 773
    goto :goto_0
.end method

.method public b(IZ)V
    .locals 4

    .prologue
    .line 486
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 488
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 489
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/internal/view/menu/c;

    .line 490
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->c()I

    move-result v3

    if-ne v3, p1, :cond_0

    .line 491
    invoke-virtual {v0, p2}, Lcom/actionbarsherlock/internal/view/menu/c;->a(Z)Lcom/actionbarsherlock/a/b;

    .line 488
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 494
    :cond_1
    return-void
.end method

.method final b(Z)V
    .locals 3

    .prologue
    .line 815
    iget-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->r:Z

    if-eqz v0, :cond_0

    .line 827
    :goto_0
    return-void

    .line 817
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->r:Z

    .line 818
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 819
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/actionbarsherlock/internal/view/menu/h;

    .line 820
    if-nez v1, :cond_1

    .line 821
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    .line 823
    :cond_1
    invoke-interface {v1, p0, p1}, Lcom/actionbarsherlock/internal/view/menu/h;->a(Lcom/actionbarsherlock/internal/view/menu/a;Z)V

    goto :goto_1

    .line 826
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->r:Z

    goto :goto_0
.end method

.method public b()Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 497
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/a;->c()I

    move-result v3

    move v2, v1

    .line 499
    :goto_0
    if-ge v2, v3, :cond_1

    .line 500
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/internal/view/menu/c;

    .line 501
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 502
    const/4 v0, 0x1

    .line 506
    :goto_1
    return v0

    .line 499
    :cond_0
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_1
    move v0, v1

    .line 506
    goto :goto_1
.end method

.method public b(II)Z
    .locals 1

    .prologue
    .line 778
    invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/a;->e(I)Lcom/actionbarsherlock/a/b;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/actionbarsherlock/internal/view/menu/a;->a(Lcom/actionbarsherlock/a/b;I)Z

    move-result v0

    return v0
.end method

.method public b(Lcom/actionbarsherlock/internal/view/menu/c;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 1067
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->u:Lcom/actionbarsherlock/internal/view/menu/c;

    if-eq v1, p1, :cond_1

    .line 1085
    :cond_0
    :goto_0
    return v0

    .line 1071
    :cond_1
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/a;->i()V

    .line 1072
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v2, v0

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 1073
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/actionbarsherlock/internal/view/menu/h;

    .line 1074
    if-nez v1, :cond_3

    .line 1075
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    move v0, v2

    :cond_2
    move v2, v0

    .line 1079
    goto :goto_1

    .line 1076
    :cond_3
    invoke-interface {v1, p0, p1}, Lcom/actionbarsherlock/internal/view/menu/h;->a(Lcom/actionbarsherlock/internal/view/menu/a;Lcom/actionbarsherlock/internal/view/menu/c;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1080
    :goto_2
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/a;->j()V

    .line 1082
    if-eqz v0, :cond_0

    .line 1083
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->u:Lcom/actionbarsherlock/internal/view/menu/c;

    goto :goto_0

    :cond_4
    move v0, v2

    goto :goto_2
.end method

.method public c()I
    .locals 1

    .prologue
    .line 563
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method protected c(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/internal/view/menu/a;
    .locals 6

    .prologue
    const/4 v4, 0x0

    const/4 v1, 0x0

    .line 953
    move-object v0, p0

    move-object v2, p1

    move v3, v1

    move-object v5, v4

    invoke-direct/range {v0 .. v5}, Lcom/actionbarsherlock/internal/view/menu/a;->a(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    .line 954
    return-object p0
.end method

.method public c(I)V
    .locals 2

    .prologue
    .line 381
    invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/a;->f(I)I

    move-result v0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/actionbarsherlock/internal/view/menu/a;->c(IZ)V

    .line 382
    return-void
.end method

.method c(Z)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 842
    iget-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->o:Z

    if-nez v0, :cond_1

    .line 843
    if-eqz p1, :cond_0

    .line 844
    iput-boolean v1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->l:Z

    .line 847
    :cond_0
    invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/a;->d(Z)V

    .line 851
    :goto_0
    return-void

    .line 849
    :cond_1
    iput-boolean v1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->p:Z

    goto :goto_0
.end method

.method public d(I)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 385
    invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/a;->g(I)I

    move-result v3

    .line 387
    if-ltz v3, :cond_1

    .line 388
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int v4, v0, v3

    move v0, v1

    .line 390
    :goto_0
    add-int/lit8 v2, v0, 0x1

    if-ge v0, v4, :cond_0

    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/internal/view/menu/c;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->c()I

    move-result v0

    if-ne v0, p1, :cond_0

    .line 392
    invoke-direct {p0, v3, v1}, Lcom/actionbarsherlock/internal/view/menu/a;->c(IZ)V

    move v0, v2

    goto :goto_0

    .line 396
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/a;->c(Z)V

    .line 398
    :cond_1
    return-void
.end method

.method d()Z
    .locals 1

    .prologue
    .line 606
    iget-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->g:Z

    return v0
.end method

.method public e(I)Lcom/actionbarsherlock/a/b;
    .locals 4

    .prologue
    .line 510
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/a;->c()I

    move-result v2

    .line 511
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_3

    .line 512
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/internal/view/menu/c;

    .line 513
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->d()I

    move-result v3

    if-ne v3, p1, :cond_1

    .line 524
    :cond_0
    :goto_1
    return-object v0

    .line 515
    :cond_1
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->n()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 516
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->m()Lcom/actionbarsherlock/a/d;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/actionbarsherlock/a/d;->e(I)Lcom/actionbarsherlock/a/b;

    move-result-object v0

    .line 518
    if-nez v0, :cond_0

    .line 511
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 524
    :cond_3
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 635
    iget-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->h:Z

    return v0
.end method

.method public f(I)I
    .locals 3

    .prologue
    .line 528
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/a;->c()I

    move-result v2

    .line 530
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 531
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/internal/view/menu/c;

    .line 532
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->d()I

    move-result v0

    if-ne v0, p1, :cond_0

    move v0, v1

    .line 537
    :goto_1
    return v0

    .line 530
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 537
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method f()Landroid/content/res/Resources;
    .locals 1

    .prologue
    .line 639
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->f:Landroid/content/res/Resources;

    return-object v0
.end method

.method public g(I)I
    .locals 1

    .prologue
    .line 541
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/actionbarsherlock/internal/view/menu/a;->a(II)I

    move-result v0

    return v0
.end method

.method public g()Landroid/content/Context;
    .locals 1

    .prologue
    .line 643
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->e:Landroid/content/Context;

    return-object v0
.end method

.method public h(I)Lcom/actionbarsherlock/a/b;
    .locals 1

    .prologue
    .line 568
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/a/b;

    return-object v0
.end method

.method public h()V
    .locals 1

    .prologue
    .line 831
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/a;->b(Z)V

    .line 832
    return-void
.end method

.method protected i(I)Lcom/actionbarsherlock/internal/view/menu/a;
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 965
    const/4 v3, 0x0

    move-object v0, p0

    move v1, p1

    move-object v4, v2

    move-object v5, v2

    invoke-direct/range {v0 .. v5}, Lcom/actionbarsherlock/internal/view/menu/a;->a(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    .line 966
    return-object p0
.end method

.method public i()V
    .locals 1

    .prologue
    .line 859
    iget-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->o:Z

    if-nez v0, :cond_0

    .line 860
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->o:Z

    .line 861
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->p:Z

    .line 863
    :cond_0
    return-void
.end method

.method protected j(I)Lcom/actionbarsherlock/internal/view/menu/a;
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 989
    const/4 v1, 0x0

    move-object v0, p0

    move v3, p1

    move-object v4, v2

    move-object v5, v2

    invoke-direct/range {v0 .. v5}, Lcom/actionbarsherlock/internal/view/menu/a;->a(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    .line 990
    return-object p0
.end method

.method public j()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 866
    iput-boolean v1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->o:Z

    .line 868
    iget-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->p:Z

    if-eqz v0, :cond_0

    .line 869
    iput-boolean v1, p0, Lcom/actionbarsherlock/internal/view/menu/a;->p:Z

    .line 870
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/a;->c(Z)V

    .line 872
    :cond_0
    return-void
.end method

.method k()Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/actionbarsherlock/internal/view/menu/c;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 885
    iget-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->l:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->k:Ljava/util/ArrayList;

    .line 899
    :goto_0
    return-object v0

    .line 888
    :cond_0
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 890
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v1, v2

    .line 892
    :goto_1
    if-ge v1, v3, :cond_2

    .line 893
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/internal/view/menu/c;

    .line 894
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->u()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lcom/actionbarsherlock/internal/view/menu/a;->k:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 892
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 897
    :cond_2
    iput-boolean v2, p0, Lcom/actionbarsherlock/internal/view/menu/a;->l:Z

    .line 899
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->k:Ljava/util/ArrayList;

    goto :goto_0
.end method

.method l()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/actionbarsherlock/internal/view/menu/c;",
            ">;"
        }
    .end annotation

    .prologue
    .line 903
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->m:Ljava/util/ArrayList;

    return-object v0
.end method

.method public m()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 907
    iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->b:Landroid/graphics/drawable/Drawable;

    .line 908
    iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->a:Ljava/lang/CharSequence;

    .line 909
    iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->c:Landroid/view/View;

    .line 911
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/a;->c(Z)V

    .line 912
    return-void
.end method

.method public n()Lcom/actionbarsherlock/internal/view/menu/a;
    .locals 0

    .prologue
    .line 1022
    return-object p0
.end method

.method o()Z
    .locals 1

    .prologue
    .line 1041
    iget-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->q:Z

    return v0
.end method

.method public p()Lcom/actionbarsherlock/internal/view/menu/c;
    .locals 1

    .prologue
    .line 1089
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/a;->u:Lcom/actionbarsherlock/internal/view/menu/c;

    return-object v0
.end method
