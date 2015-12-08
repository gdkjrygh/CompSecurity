.class public final Lcom/kik/l/am;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/l/ab;
.implements Lkik/a/e/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/l/am$b;,
        Lcom/kik/l/am$c;,
        Lcom/kik/l/am$a;
    }
.end annotation


# static fields
.field private static D:Ljava/io/File;

.field private static final a:Lorg/c/b;

.field private static t:Ljava/io/File;

.field private static u:Ljava/io/File;

.field private static v:Ljava/io/File;


# instance fields
.field private final A:Lcom/kik/cache/bb;

.field private final B:Lcom/kik/cache/s;

.field private final C:Lcom/kik/cache/s;

.field private final E:I

.field private final F:I

.field private final G:Lcom/kik/l/l;

.field private final H:Lcom/kik/l/w;

.field private final I:Lcom/kik/l/ae;

.field private final J:Lcom/kik/l/d;

.field private final K:Lcom/kik/l/ac;

.field private final L:Lkik/android/w;

.field private final M:Lcom/kik/l/aq;

.field private final N:Ljava/lang/String;

.field private O:Lcom/kik/g/k;

.field private P:Lcom/kik/g/k;

.field private Q:Lcom/kik/g/k;

.field private R:Lcom/kik/g/k;

.field private S:Lcom/kik/g/f;

.field private final b:Landroid/content/Context;

.field private c:Lkik/android/util/aq;

.field private d:Lkik/android/util/bs;

.field private e:Lkik/android/util/bs;

.field private final f:Lkik/a/e/h;

.field private final g:Lcom/kik/l/am$a;

.field private final h:Lcom/kik/l/am$c;

.field private final i:Lcom/kik/l/am$b;

.field private final j:Lkik/a/e/t;

.field private k:Ljava/io/File;

.field private l:Ljava/io/File;

.field private m:Ljava/io/File;

.field private n:Ljava/io/File;

.field private o:Ljava/io/File;

.field private p:Ljava/io/File;

.field private q:Ljava/io/File;

.field private r:Ljava/io/File;

.field private s:Ljava/io/File;

.field private w:Lcom/kik/l/f;

.field private x:Lcom/kik/l/p;

.field private y:Lcom/kik/l/al;

.field private z:Lkik/a/e/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 88
    const-string v0, "Storage"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/l/am;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkik/a/e/t;Ljava/util/concurrent/ExecutorService;Lkik/a/f/k;Lkik/android/util/aq;Lkik/a/e/q;Ljava/lang/String;)V
    .locals 11

    .prologue
    .line 228
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 150
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/kik/l/am;->w:Lcom/kik/l/f;

    .line 151
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/kik/l/am;->x:Lcom/kik/l/p;

    .line 152
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/kik/l/am;->y:Lcom/kik/l/al;

    .line 160
    const/16 v1, 0xa

    iput v1, p0, Lcom/kik/l/am;->E:I

    .line 161
    const/4 v1, 0x5

    iput v1, p0, Lcom/kik/l/am;->F:I

    .line 176
    new-instance v1, Lcom/kik/g/f;

    invoke-direct {v1}, Lcom/kik/g/f;-><init>()V

    iput-object v1, p0, Lcom/kik/l/am;->S:Lcom/kik/g/f;

    .line 229
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/l/am;->b:Landroid/content/Context;

    .line 230
    move-object/from16 v0, p6

    iput-object v0, p0, Lcom/kik/l/am;->z:Lkik/a/e/q;

    .line 231
    move-object/from16 v0, p5

    iput-object v0, p0, Lcom/kik/l/am;->c:Lkik/android/util/aq;

    .line 232
    move-object/from16 v0, p7

    iput-object v0, p0, Lcom/kik/l/am;->N:Ljava/lang/String;

    .line 233
    invoke-direct {p0}, Lcom/kik/l/am;->s()Ljava/io/File;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/l/am;->k:Ljava/io/File;

    iget-object v1, p0, Lcom/kik/l/am;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/l/am;->k:Ljava/io/File;

    const-string v3, "profPics"

    invoke-static {v2, v1, v3}, Lcom/kik/l/am;->a(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    iput-object v2, p0, Lcom/kik/l/am;->l:Ljava/io/File;

    iget-object v2, p0, Lcom/kik/l/am;->k:Ljava/io/File;

    const-string v3, "chatPicsSmall"

    invoke-static {v2, v1, v3}, Lcom/kik/l/am;->a(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    sput-object v2, Lcom/kik/l/am;->v:Ljava/io/File;

    iget-object v2, p0, Lcom/kik/l/am;->k:Ljava/io/File;

    const-string v3, "chatPicsBig"

    invoke-static {v2, v1, v3}, Lcom/kik/l/am;->a(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    iput-object v2, p0, Lcom/kik/l/am;->m:Ljava/io/File;

    iget-object v2, p0, Lcom/kik/l/am;->k:Ljava/io/File;

    const-string v3, "chatVids"

    invoke-static {v2, v1, v3}, Lcom/kik/l/am;->a(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    iput-object v2, p0, Lcom/kik/l/am;->n:Ljava/io/File;

    iget-object v2, p0, Lcom/kik/l/am;->k:Ljava/io/File;

    const-string v3, "linkModCache"

    invoke-static {v2, v1, v3}, Lcom/kik/l/am;->a(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    iput-object v2, p0, Lcom/kik/l/am;->s:Ljava/io/File;

    iget-object v2, p0, Lcom/kik/l/am;->k:Ljava/io/File;

    const-string v3, "gifs"

    invoke-static {v2, v1, v3}, Lcom/kik/l/am;->a(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    iput-object v2, p0, Lcom/kik/l/am;->o:Ljava/io/File;

    iget-object v2, p0, Lcom/kik/l/am;->k:Ljava/io/File;

    const-string v3, "gifs_"

    invoke-static {v2, v1, v3}, Lcom/kik/l/am;->a(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    iput-object v2, p0, Lcom/kik/l/am;->p:Ljava/io/File;

    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/kik/l/am;->b:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    const-string v4, "staging"

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v2, p0, Lcom/kik/l/am;->r:Ljava/io/File;

    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/kik/l/am;->r:Ljava/io/File;

    const-string v4, "large"

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sput-object v2, Lcom/kik/l/am;->t:Ljava/io/File;

    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/kik/l/am;->r:Ljava/io/File;

    const-string v4, "thumbs"

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sput-object v2, Lcom/kik/l/am;->u:Ljava/io/File;

    new-instance v2, Ljava/io/File;

    const-string v3, "tempVids"

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v2, p0, Lcom/kik/l/am;->q:Ljava/io/File;

    new-instance v1, Lkik/android/util/bs;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Lkik/android/util/bs;-><init>(I)V

    iput-object v1, p0, Lcom/kik/l/am;->d:Lkik/android/util/bs;

    new-instance v1, Lkik/android/util/bs;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lkik/android/util/bs;-><init>(I)V

    iput-object v1, p0, Lcom/kik/l/am;->e:Lkik/android/util/bs;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_a

    :cond_0
    const/4 v1, 0x0

    sput-object v1, Lcom/kik/l/am;->D:Ljava/io/File;

    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/kik/l/am;->t()V

    .line 234
    iget-object v1, p0, Lcom/kik/l/am;->l:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/kik/l/am;->l:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_2
    iget-object v1, p0, Lcom/kik/l/am;->m:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/kik/l/am;->m:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_3
    iget-object v1, p0, Lcom/kik/l/am;->r:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/kik/l/am;->r:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_4
    sget-object v1, Lcom/kik/l/am;->t:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_5

    sget-object v1, Lcom/kik/l/am;->t:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_5
    iget-object v1, p0, Lcom/kik/l/am;->n:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, p0, Lcom/kik/l/am;->n:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_6
    iget-object v1, p0, Lcom/kik/l/am;->o:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, p0, Lcom/kik/l/am;->o:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_7
    iget-object v1, p0, Lcom/kik/l/am;->q:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_8

    iget-object v1, p0, Lcom/kik/l/am;->q:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_8
    sget-object v1, Lcom/kik/l/am;->u:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_9

    sget-object v1, Lcom/kik/l/am;->u:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 235
    :cond_9
    invoke-static {}, Lkik/a/h/e;->a()Lkik/a/h/e;

    move-result-object v1

    invoke-virtual {v1, p0}, Lkik/a/h/e;->a(Lkik/a/e/v;)V

    .line 236
    new-instance v1, Lcom/kik/g/a;

    invoke-direct {v1, p0, p3}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v1, p0, Lcom/kik/l/am;->O:Lcom/kik/g/k;

    .line 237
    new-instance v1, Lcom/kik/g/a;

    invoke-direct {v1, p0, p3}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v1, p0, Lcom/kik/l/am;->P:Lcom/kik/g/k;

    .line 238
    new-instance v1, Lcom/kik/g/a;

    invoke-direct {v1, p0, p3}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v1, p0, Lcom/kik/l/am;->Q:Lcom/kik/g/k;

    .line 239
    new-instance v1, Lcom/kik/g/a;

    invoke-direct {v1, p0, p3}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    iput-object v1, p0, Lcom/kik/l/am;->R:Lcom/kik/g/k;

    .line 241
    new-instance v1, Lcom/kik/l/am$b;

    iget-object v2, p0, Lcom/kik/l/am;->b:Landroid/content/Context;

    iget-object v3, p0, Lcom/kik/l/am;->N:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/kik/l/am$b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/kik/l/am;->i:Lcom/kik/l/am$b;

    .line 242
    iput-object p2, p0, Lcom/kik/l/am;->j:Lkik/a/e/t;

    .line 243
    new-instance v1, Lcom/kik/l/f;

    invoke-direct {p0}, Lcom/kik/l/am;->s()Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/kik/l/f;-><init>(Ljava/io/File;)V

    iput-object v1, p0, Lcom/kik/l/am;->w:Lcom/kik/l/f;

    .line 244
    iget-object v1, p0, Lcom/kik/l/am;->S:Lcom/kik/g/f;

    iget-object v2, p0, Lcom/kik/l/am;->w:Lcom/kik/l/f;

    invoke-virtual {v2}, Lcom/kik/l/f;->a()Lcom/kik/g/e;

    move-result-object v2

    new-instance v3, Lcom/kik/l/an;

    invoke-direct {v3, p0}, Lcom/kik/l/an;-><init>(Lcom/kik/l/am;)V

    invoke-virtual {v1, v2, v3}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 251
    new-instance v1, Lcom/kik/l/p;

    invoke-direct {p0}, Lcom/kik/l/am;->s()Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/kik/l/p;-><init>(Ljava/io/File;)V

    iput-object v1, p0, Lcom/kik/l/am;->x:Lcom/kik/l/p;

    .line 252
    new-instance v1, Lcom/kik/l/al;

    invoke-direct {p0}, Lcom/kik/l/am;->s()Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/kik/l/al;-><init>(Ljava/io/File;)V

    iput-object v1, p0, Lcom/kik/l/am;->y:Lcom/kik/l/al;

    .line 254
    new-instance v1, Lcom/kik/l/u;

    iget-object v2, p0, Lcom/kik/l/am;->c:Lkik/android/util/aq;

    invoke-direct {v1, v2}, Lcom/kik/l/u;-><init>(Lkik/android/util/ar;)V

    iput-object v1, p0, Lcom/kik/l/am;->f:Lkik/a/e/h;

    .line 255
    new-instance v1, Lcom/kik/l/ac;

    iget-object v3, p0, Lcom/kik/l/am;->l:Ljava/io/File;

    iget-object v4, p0, Lcom/kik/l/am;->m:Ljava/io/File;

    iget-object v5, p0, Lcom/kik/l/am;->n:Ljava/io/File;

    sget-object v6, Lcom/kik/l/am;->t:Ljava/io/File;

    sget-object v7, Lcom/kik/l/am;->u:Ljava/io/File;

    iget-object v8, p0, Lcom/kik/l/am;->d:Lkik/android/util/bs;

    iget-object v9, p0, Lcom/kik/l/am;->e:Lkik/android/util/bs;

    iget-object v10, p0, Lcom/kik/l/am;->x:Lcom/kik/l/p;

    move-object v2, p1

    invoke-direct/range {v1 .. v10}, Lcom/kik/l/ac;-><init>(Landroid/content/Context;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/io/File;Lkik/android/util/bs;Lkik/android/util/bs;Lcom/kik/l/p;)V

    iput-object v1, p0, Lcom/kik/l/am;->K:Lcom/kik/l/ac;

    .line 257
    new-instance v1, Lcom/kik/l/am$a;

    iget-object v2, p0, Lcom/kik/l/am;->b:Landroid/content/Context;

    invoke-direct {v1, v2, p0, p4}, Lcom/kik/l/am$a;-><init>(Landroid/content/Context;Lcom/kik/l/am;Lkik/a/f/k;)V

    iput-object v1, p0, Lcom/kik/l/am;->g:Lcom/kik/l/am$a;

    .line 258
    new-instance v1, Lcom/kik/l/am$c;

    iget-object v2, p0, Lcom/kik/l/am;->b:Landroid/content/Context;

    iget-object v3, p0, Lcom/kik/l/am;->N:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/kik/l/am$c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/kik/l/am;->h:Lcom/kik/l/am$c;

    .line 259
    new-instance v1, Lcom/kik/l/l;

    iget-object v2, p0, Lcom/kik/l/am;->g:Lcom/kik/l/am$a;

    invoke-direct {v1, v2}, Lcom/kik/l/l;-><init>(Landroid/database/sqlite/SQLiteOpenHelper;)V

    iput-object v1, p0, Lcom/kik/l/am;->G:Lcom/kik/l/l;

    .line 260
    new-instance v1, Lcom/kik/l/w;

    iget-object v2, p0, Lcom/kik/l/am;->g:Lcom/kik/l/am$a;

    invoke-direct {v1, v2}, Lcom/kik/l/w;-><init>(Landroid/database/sqlite/SQLiteOpenHelper;)V

    iput-object v1, p0, Lcom/kik/l/am;->H:Lcom/kik/l/w;

    .line 261
    new-instance v1, Lkik/android/w;

    iget-object v2, p0, Lcom/kik/l/am;->h:Lcom/kik/l/am$c;

    invoke-direct {v1, v2}, Lkik/android/w;-><init>(Landroid/database/sqlite/SQLiteOpenHelper;)V

    iput-object v1, p0, Lcom/kik/l/am;->L:Lkik/android/w;

    .line 262
    new-instance v1, Lcom/kik/l/ae;

    iget-object v2, p0, Lcom/kik/l/am;->g:Lcom/kik/l/am$a;

    sget-object v3, Lcom/kik/l/am;->t:Ljava/io/File;

    sget-object v4, Lcom/kik/l/am;->u:Ljava/io/File;

    iget-object v5, p0, Lcom/kik/l/am;->m:Ljava/io/File;

    move-object v6, p0

    invoke-direct/range {v1 .. v6}, Lcom/kik/l/ae;-><init>(Landroid/database/sqlite/SQLiteOpenHelper;Ljava/io/File;Ljava/io/File;Ljava/io/File;Lkik/a/e/v;)V

    iput-object v1, p0, Lcom/kik/l/am;->I:Lcom/kik/l/ae;

    .line 263
    new-instance v1, Lcom/kik/l/aq;

    iget-object v2, p0, Lcom/kik/l/am;->g:Lcom/kik/l/am$a;

    invoke-direct {v1, v2}, Lcom/kik/l/aq;-><init>(Landroid/database/sqlite/SQLiteOpenHelper;)V

    iput-object v1, p0, Lcom/kik/l/am;->M:Lcom/kik/l/aq;

    .line 264
    new-instance v1, Lcom/kik/l/d;

    iget-object v2, p0, Lcom/kik/l/am;->g:Lcom/kik/l/am$a;

    invoke-direct {v1, v2}, Lcom/kik/l/d;-><init>(Landroid/database/sqlite/SQLiteOpenHelper;)V

    iput-object v1, p0, Lcom/kik/l/am;->J:Lcom/kik/l/d;

    .line 265
    new-instance v1, Lcom/kik/cache/bb;

    iget-object v2, p0, Lcom/kik/l/am;->n:Ljava/io/File;

    const-string v3, "com.kik.ext.video-camera"

    invoke-direct {v1, v2, v3}, Lcom/kik/cache/bb;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/kik/l/am;->A:Lcom/kik/cache/bb;

    .line 266
    new-instance v1, Lcom/kik/cache/s;

    iget-object v2, p0, Lcom/kik/l/am;->o:Ljava/io/File;

    const-string v3, "com.kik.ext.gif"

    invoke-direct {v1, v2, v3}, Lcom/kik/cache/s;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/kik/l/am;->B:Lcom/kik/cache/s;

    .line 267
    new-instance v1, Lcom/kik/cache/s;

    iget-object v2, p0, Lcom/kik/l/am;->p:Ljava/io/File;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/kik/cache/s;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/kik/l/am;->C:Lcom/kik/cache/s;

    .line 268
    return-void

    .line 233
    :cond_a
    new-instance v2, Ljava/io/File;

    const-string v3, "Kik"

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sput-object v2, Lcom/kik/l/am;->D:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/kik/l/am;->D:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    goto/16 :goto_0
.end method

.method private static a(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 2

    .prologue
    .line 372
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 373
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 374
    invoke-static {v1, v0}, Lkik/android/util/d;->a(Ljava/io/File;Ljava/io/File;)V

    .line 375
    return-object v0
.end method

.method static synthetic a(Lcom/kik/l/am;)V
    .locals 8

    .prologue
    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v5, 0x1

    const/4 v3, 0x0

    .line 86
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    const v0, 0x7f020043

    invoke-static {v0}, Lkik/android/chat/KikApplication;->c(I)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Lkik/android/f/a/f;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lkik/android/util/e;->a(Landroid/graphics/Bitmap;)[B

    move-result-object v2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_0
    :try_start_0
    const-string v0, "MD5"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    array-length v1, v2

    invoke-virtual {v0, v2, v3, v1}, Ljava/security/MessageDigest;->update([BII)V

    new-instance v1, Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-direct {v1, v5, v0}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-virtual {v1, v7}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/kik/l/am$a;->a:Ljava/lang/String;

    sget-object v1, Lcom/kik/l/am$a;->a:Ljava/lang/String;

    move-object v0, p0

    move v4, v3

    invoke-virtual/range {v0 .. v5}, Lcom/kik/l/am;->a(Ljava/lang/String;Ljava/lang/Object;ZZZ)Ljava/io/File;

    :cond_1
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    const v0, 0x7f020124

    invoke-static {v0}, Lkik/android/chat/KikApplication;->c(I)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Lkik/android/f/a/f;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lkik/android/util/e;->a(Landroid/graphics/Bitmap;)[B

    move-result-object v2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_2
    :try_start_1
    const-string v0, "MD5"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v6

    :goto_1
    array-length v0, v2

    invoke-virtual {v6, v2, v3, v0}, Ljava/security/MessageDigest;->update([BII)V

    new-instance v0, Ljava/math/BigInteger;

    invoke-virtual {v6}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    invoke-direct {v0, v5, v1}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-virtual {v0, v7}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/kik/l/am$a;->b:Ljava/lang/String;

    sget-object v1, Lcom/kik/l/am$a;->b:Ljava/lang/String;

    move-object v0, p0

    move v4, v3

    invoke-virtual/range {v0 .. v5}, Lcom/kik/l/am;->a(Ljava/lang/String;Ljava/lang/Object;ZZZ)Ljava/io/File;

    :cond_3
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V

    move-object v0, v6

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V

    goto :goto_1
.end method

.method static synthetic q()Ljava/io/File;
    .locals 1

    .prologue
    .line 86
    sget-object v0, Lcom/kik/l/am;->v:Ljava/io/File;

    return-object v0
.end method

.method static synthetic r()Ljava/io/File;
    .locals 1

    .prologue
    .line 86
    sget-object v0, Lcom/kik/l/am;->u:Ljava/io/File;

    return-object v0
.end method

.method private s()Ljava/io/File;
    .locals 2

    .prologue
    .line 282
    iget-object v0, p0, Lcom/kik/l/am;->z:Lkik/a/e/q;

    const-string v1, "cache"

    invoke-interface {v0, v1}, Lkik/a/e/q;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private t()V
    .locals 10

    .prologue
    .line 767
    iget-object v0, p0, Lcom/kik/l/am;->q:Ljava/io/File;

    if-eqz v0, :cond_1

    .line 768
    iget-object v0, p0, Lcom/kik/l/am;->q:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    .line 769
    if-eqz v1, :cond_1

    .line 770
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 771
    array-length v4, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v4, :cond_1

    aget-object v5, v1, v0

    .line 772
    invoke-virtual {v5}, Ljava/io/File;->lastModified()J

    move-result-wide v6

    .line 773
    sub-long v6, v2, v6

    const-wide/32 v8, 0x240c8400

    cmp-long v6, v6, v8

    if-lez v6, :cond_0

    .line 774
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 771
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 779
    :cond_1
    return-void
.end method

.method private static z(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 1808
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    .prologue
    .line 624
    iget-object v0, p0, Lcom/kik/l/am;->G:Lcom/kik/l/l;

    invoke-virtual {v0, p1}, Lcom/kik/l/l;->a(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    .prologue
    .line 618
    iget-object v0, p0, Lcom/kik/l/am;->G:Lcom/kik/l/l;

    invoke-virtual {v0, p1, p2}, Lcom/kik/l/l;->a(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public final a()Lcom/kik/cache/ad;
    .locals 1

    .prologue
    .line 1597
    iget-object v0, p0, Lcom/kik/l/am;->w:Lcom/kik/l/f;

    invoke-virtual {v0}, Lcom/kik/l/f;->b()Lcom/kik/cache/ad;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;Lkik/a/e/s;Lcom/kik/android/a;)Lcom/kik/g/p;
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 1696
    if-nez p1, :cond_0

    .line 1697
    invoke-static {v3}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v0

    .line 1701
    :goto_0
    return-object v0

    .line 1700
    :cond_0
    invoke-static {p1}, Lcom/kik/l/am;->z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1701
    iget-object v0, p0, Lcom/kik/l/am;->B:Lcom/kik/cache/s;

    const/high16 v6, 0x100000

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v6}, Lcom/kik/cache/s;->a(Ljava/lang/String;Ljava/lang/String;[BLkik/a/e/s;Lcom/kik/android/a;I)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0
.end method

.method public final a(Lkik/a/d/a/a;[BLkik/a/e/s;Lcom/kik/android/a;)Lcom/kik/g/p;
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 1664
    if-nez p1, :cond_0

    .line 1665
    invoke-static {v3}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v0

    .line 1670
    :goto_0
    return-object v0

    .line 1669
    :cond_0
    invoke-virtual {p1}, Lkik/a/d/a/a;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v3, p2

    .line 1670
    :cond_1
    iget-object v0, p0, Lcom/kik/l/am;->A:Lcom/kik/cache/bb;

    invoke-virtual {p1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lkik/a/d/a/a;->h()Ljava/lang/String;

    move-result-object v2

    const/high16 v6, 0x1400000

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v6}, Lcom/kik/cache/bb;->a(Ljava/lang/String;Ljava/lang/String;[BLkik/a/e/s;Lcom/kik/android/a;I)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Object;ZZZ)Ljava/io/File;
    .locals 6

    .prologue
    .line 948
    iget-object v0, p0, Lcom/kik/l/am;->K:Lcom/kik/l/ac;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/kik/l/ac;->a(Ljava/lang/String;Ljava/lang/Object;ZZZ)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;I)Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 814
    iget-object v0, p0, Lcom/kik/l/am;->c:Lkik/android/util/aq;

    invoke-interface {v0}, Lkik/android/util/aq;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;Z)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1029
    iget-object v0, p0, Lcom/kik/l/am;->K:Lcom/kik/l/ac;

    invoke-virtual {v0, p1, p2}, Lcom/kik/l/ac;->a(Ljava/lang/String;Z)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final a(Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 972
    if-nez p1, :cond_0

    .line 979
    :goto_0
    return-void

    .line 975
    :cond_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 976
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 977
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 978
    iget-object v1, p0, Lcom/kik/l/am;->K:Lcom/kik/l/ac;

    invoke-virtual {v1, p2, v0}, Lcom/kik/l/ac;->a(Ljava/lang/String;[B)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Integer;)V
    .locals 1

    .prologue
    .line 223
    iget-object v0, p0, Lcom/kik/l/am;->R:Lcom/kik/g/k;

    invoke-virtual {v0, p1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 224
    return-void
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 1627
    instance-of v0, p1, Lcom/android/volley/toolbox/n;

    if-eqz v0, :cond_0

    .line 1628
    iget-object v0, p0, Lcom/kik/l/am;->y:Lcom/kik/l/al;

    invoke-virtual {v0}, Lcom/kik/l/al;->a()Lcom/android/volley/p;

    move-result-object v0

    check-cast p1, Lcom/android/volley/toolbox/n;

    invoke-virtual {v0, p1}, Lcom/android/volley/p;->a(Lcom/android/volley/n;)Lcom/android/volley/n;

    .line 1630
    :cond_0
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 1

    .prologue
    .line 199
    iget-object v0, p0, Lcom/kik/l/am;->Q:Lcom/kik/g/k;

    invoke-virtual {v0, p1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 200
    return-void
.end method

.method public final a(Ljava/util/List;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 694
    iget-object v0, p0, Lcom/kik/l/am;->M:Lcom/kik/l/aq;

    invoke-virtual {v0, p1, p2}, Lcom/kik/l/aq;->a(Ljava/util/List;Ljava/lang/String;)Z

    .line 695
    return-void
.end method

.method public final a(Ljava/util/UUID;Ljava/io/File;)V
    .locals 2

    .prologue
    .line 1001
    iget-object v0, p0, Lcom/kik/l/am;->K:Lcom/kik/l/ac;

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lcom/kik/l/ac;->a(Ljava/lang/String;Ljava/io/File;)V

    .line 1002
    return-void
.end method

.method public final a(Lkik/a/d/aa;)V
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 726
    iget-object v1, p0, Lcom/kik/l/am;->f:Lkik/a/e/h;

    invoke-interface {v1}, Lkik/a/e/h;->b()V

    .line 727
    iget-object v1, p0, Lcom/kik/l/am;->y:Lcom/kik/l/al;

    invoke-virtual {v1}, Lcom/kik/l/al;->b()V

    .line 728
    iget-object v1, p0, Lcom/kik/l/am;->c:Lkik/android/util/aq;

    invoke-interface {v1}, Lkik/android/util/aq;->b()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 729
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 730
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/f/a/f;->j()V

    .line 731
    sget-object v1, Lcom/kik/l/am;->t:Ljava/io/File;

    if-eqz v1, :cond_0

    sget-object v1, Lcom/kik/l/am;->t:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    if-eqz v3, :cond_0

    array-length v4, v3

    move v1, v0

    :goto_0
    if-ge v1, v4, :cond_0

    aget-object v5, v3, v1

    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/kik/l/am;->u:Ljava/io/File;

    if-eqz v1, :cond_1

    sget-object v1, Lcom/kik/l/am;->u:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_1

    array-length v3, v1

    :goto_1
    if-ge v0, v3, :cond_1

    aget-object v4, v1, v0

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/kik/l/am;->w:Lcom/kik/l/f;

    invoke-virtual {v0}, Lcom/kik/l/f;->c()V

    .line 740
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 741
    iget-object v0, p0, Lcom/kik/l/am;->c:Lkik/android/util/aq;

    invoke-interface {v0}, Lkik/android/util/aq;->a()V

    .line 743
    iget-object v0, p0, Lcom/kik/l/am;->c:Lkik/android/util/aq;

    invoke-interface {v0}, Lkik/android/util/aq;->c()Landroid/content/SharedPreferences;

    move-result-object v1

    .line 744
    const-string v0, "usernameLogin"

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 745
    if-eqz p1, :cond_2

    iget-object v2, p1, Lkik/a/d/aa;->c:Ljava/lang/String;

    if-eqz v2, :cond_2

    .line 746
    iget-object v0, p1, Lkik/a/d/aa;->c:Ljava/lang/String;

    .line 750
    :cond_2
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "usernameLogin"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 753
    iget-object v0, p0, Lcom/kik/l/am;->z:Lkik/a/e/q;

    invoke-interface {v0}, Lkik/a/e/q;->a()Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x1

    sget-object v2, Lcom/kik/l/am;->a:Lorg/c/b;

    invoke-static {v0, v1, v2}, Lkik/a/h/c;->a(Ljava/io/File;ZLorg/c/b;)Z

    .line 755
    iget-object v0, p0, Lcom/kik/l/am;->g:Lcom/kik/l/am$a;

    invoke-virtual {v0}, Lcom/kik/l/am$a;->a()V

    .line 756
    iget-object v0, p0, Lcom/kik/l/am;->h:Lcom/kik/l/am$c;

    invoke-virtual {v0}, Lcom/kik/l/am$c;->a()V

    .line 757
    iget-object v0, p0, Lcom/kik/l/am;->i:Lcom/kik/l/am$b;

    invoke-virtual {v0}, Lcom/kik/l/am$b;->a()V

    .line 758
    return-void
.end method

.method public final a(Lkik/a/d/f;Lkik/a/d/s;)V
    .locals 3

    .prologue
    .line 575
    if-nez p1, :cond_0

    .line 587
    :goto_0
    return-void

    .line 578
    :cond_0
    iget-object v0, p0, Lcom/kik/l/am;->c:Lkik/android/util/aq;

    invoke-virtual {p1}, Lkik/a/d/f;->s()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/android/util/aq;->a(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 581
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 583
    if-eqz p2, :cond_1

    .line 584
    const-string v1, "kik.chat.LastMessageSeen"

    invoke-virtual {p2}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 586
    :cond_1
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_0
.end method

.method public final a(Lkik/a/d/k;)V
    .locals 1

    .prologue
    .line 211
    iget-object v0, p0, Lcom/kik/l/am;->O:Lcom/kik/g/k;

    invoke-virtual {v0, p1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 212
    return-void
.end method

.method public final a([BLkik/a/d/aa;)V
    .locals 1

    .prologue
    .line 519
    iget-object v0, p0, Lcom/kik/l/am;->w:Lcom/kik/l/f;

    invoke-virtual {v0, p1, p2}, Lcom/kik/l/f;->a([BLkik/a/d/aa;)V

    .line 520
    return-void
.end method

.method public final a([BLkik/a/d/n;)V
    .locals 1

    .prologue
    .line 514
    iget-object v0, p0, Lcom/kik/l/am;->w:Lcom/kik/l/f;

    invoke-virtual {v0, p1, p2}, Lcom/kik/l/f;->a([BLkik/a/d/n;)V

    .line 515
    return-void
.end method

.method public final a(Ljava/io/File;)Z
    .locals 1

    .prologue
    .line 966
    iget-object v0, p0, Lcom/kik/l/am;->K:Lcom/kik/l/ac;

    invoke-virtual {v0, p1}, Lcom/kik/l/ac;->c(Ljava/io/File;)Z

    move-result v0

    return v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Boolean;)Z
    .locals 2

    .prologue
    .line 874
    iget-object v0, p0, Lcom/kik/l/am;->c:Lkik/android/util/aq;

    invoke-interface {v0}, Lkik/android/util/aq;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 875
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 876
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 877
    const/4 v0, 0x1

    return v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Integer;)Z
    .locals 2

    .prologue
    .line 856
    iget-object v0, p0, Lcom/kik/l/am;->c:Lkik/android/util/aq;

    invoke-interface {v0}, Lkik/android/util/aq;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 857
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 858
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 859
    const/4 v0, 0x1

    return v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Long;)Z
    .locals 4

    .prologue
    .line 865
    iget-object v0, p0, Lcom/kik/l/am;->c:Lkik/android/util/aq;

    invoke-interface {v0}, Lkik/android/util/aq;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 866
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {v0, p1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 867
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 868
    const/4 v0, 0x1

    return v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 929
    iget-object v0, p0, Lcom/kik/l/am;->K:Lcom/kik/l/ac;

    invoke-virtual {v0, p1, p2, p3}, Lcom/kik/l/ac;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 1744
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1745
    iget-object v1, p0, Lcom/kik/l/am;->A:Lcom/kik/cache/bb;

    invoke-virtual {v1, p1, v0}, Lcom/kik/cache/bb;->a(Ljava/lang/String;Ljava/io/File;)Z

    move-result v1

    .line 1746
    if-eqz v1, :cond_0

    .line 1747
    invoke-virtual {v0}, Ljava/io/File;->deleteOnExit()V

    .line 1749
    :cond_0
    return v1
.end method

.method public final a(Ljava/util/ArrayList;)Z
    .locals 1

    .prologue
    .line 537
    iget-object v0, p0, Lcom/kik/l/am;->H:Lcom/kik/l/w;

    invoke-virtual {v0, p1}, Lcom/kik/l/w;->a(Ljava/util/ArrayList;)Z

    move-result v0

    return v0
.end method

.method public final a(Ljava/util/Vector;)Z
    .locals 1

    .prologue
    .line 485
    iget-object v0, p0, Lcom/kik/l/am;->L:Lkik/android/w;

    invoke-virtual {v0, p1}, Lkik/android/w;->a(Ljava/util/Vector;)Z

    move-result v0

    return v0
.end method

.method public final a(Lkik/a/d/g;)Z
    .locals 1

    .prologue
    .line 531
    iget-object v0, p0, Lcom/kik/l/am;->H:Lcom/kik/l/w;

    invoke-virtual {v0, p1}, Lcom/kik/l/w;->a(Lkik/a/d/g;)Z

    move-result v0

    return v0
.end method

.method public final a(Lkik/a/d/i;)Z
    .locals 1

    .prologue
    .line 479
    iget-object v0, p0, Lcom/kik/l/am;->L:Lkik/android/w;

    invoke-virtual {v0, p1}, Lkik/android/w;->a(Lkik/a/d/i;)Z

    move-result v0

    return v0
.end method

.method public final a(Lkik/a/d/s;)Z
    .locals 1

    .prologue
    .line 682
    iget-object v0, p0, Lcom/kik/l/am;->I:Lcom/kik/l/ae;

    invoke-virtual {v0, p1}, Lcom/kik/l/ae;->a(Lkik/a/d/s;)Z

    move-result v0

    return v0
.end method

.method public final b()Lcom/kik/cache/ad;
    .locals 1

    .prologue
    .line 1603
    iget-object v0, p0, Lcom/kik/l/am;->x:Lcom/kik/l/p;

    invoke-virtual {v0}, Lcom/kik/l/p;->a()Lcom/kik/cache/ad;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lkik/a/d/a/a;[BLkik/a/e/s;Lcom/kik/android/a;)Lcom/kik/g/p;
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 1676
    if-nez p1, :cond_0

    .line 1677
    invoke-static {v3}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v0

    .line 1690
    :goto_0
    return-object v0

    .line 1680
    :cond_0
    invoke-virtual {p1}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.kik.ext.gif"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1681
    sget-object v0, Lkik/android/gifs/a;->a:Lkik/a/d/a/a$c;

    invoke-virtual {p1, v0}, Lkik/a/d/a/a;->a(Lkik/a/d/a/a$c;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p3, p4}, Lcom/kik/l/am;->a(Ljava/lang/String;Lkik/a/e/s;Lcom/kik/android/a;)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0

    .line 1685
    :cond_1
    invoke-virtual {p1}, Lkik/a/d/a/a;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v3, p2

    .line 1690
    :cond_2
    iget-object v0, p0, Lcom/kik/l/am;->A:Lcom/kik/cache/bb;

    invoke-virtual {p1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lkik/a/d/a/a;->h()Ljava/lang/String;

    move-result-object v2

    const/high16 v6, 0x100000

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v6}, Lcom/kik/cache/bb;->a(Ljava/lang/String;Ljava/lang/String;[BLkik/a/e/s;Lcom/kik/android/a;I)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0
.end method

.method public final b(Ljava/lang/String;Z)Ljava/io/File;
    .locals 1

    .prologue
    .line 1053
    iget-object v0, p0, Lcom/kik/l/am;->K:Lcom/kik/l/ac;

    invoke-virtual {v0, p1, p2}, Lcom/kik/l/ac;->b(Ljava/lang/String;Z)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 1635
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1636
    iget-object v1, p0, Lcom/kik/l/am;->q:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1637
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1638
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1639
    const-string v1, ".mp4"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1640
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 794
    const-string v0, "CredentialData.password"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 795
    iget-object v0, p0, Lcom/kik/l/am;->c:Lkik/android/util/aq;

    invoke-interface {v0}, Lkik/android/util/aq;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 796
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x28

    if-eq v1, v2, :cond_0

    .line 797
    iget-object v1, p0, Lcom/kik/l/am;->j:Lkik/a/e/t;

    invoke-interface {v1, v0}, Lkik/a/e/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 798
    invoke-virtual {p0, p1, v0}, Lcom/kik/l/am;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 802
    :cond_0
    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/kik/l/am;->c:Lkik/android/util/aq;

    invoke-interface {v0}, Lkik/android/util/aq;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final b(Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1768
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x50

    invoke-virtual {p1, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 1769
    iget-object v0, p0, Lcom/kik/l/am;->C:Lcom/kik/cache/s;

    invoke-static {p2}, Lcom/kik/l/am;->z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lcom/kik/cache/s;->a(Ljava/lang/String;Ljava/io/InputStream;)Z

    .line 1770
    return-void
.end method

.method public final b(Ljava/io/File;)V
    .locals 1

    .prologue
    .line 1007
    iget-object v0, p0, Lcom/kik/l/am;->K:Lcom/kik/l/ac;

    invoke-virtual {v0, p1}, Lcom/kik/l/ac;->a(Ljava/io/File;)V

    .line 1008
    return-void
.end method

.method public final b(Ljava/lang/String;I)V
    .locals 7

    .prologue
    .line 1164
    iget-object v1, p0, Lcom/kik/l/am;->g:Lcom/kik/l/am$a;

    monitor-enter v1

    .line 1165
    :try_start_0
    iget-object v0, p0, Lcom/kik/l/am;->g:Lcom/kik/l/am$a;

    invoke-virtual {v0}, Lcom/kik/l/am$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 1166
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 1167
    const-string v3, "content_string"

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1168
    const-string v3, "content_id = \'%s\' AND content_name = \'%s\' AND content_type = \'%s\'"

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v5, 0x1

    const-string v6, "int-chunk-progress"

    aput-object v6, v4, v5

    const/4 v5, 0x2

    const/4 v6, 0x2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 1170
    const-string v4, "KIKContentTable"

    const/4 v5, 0x0

    invoke-virtual {v0, v4, v2, v3, v5}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 1171
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final b([BLkik/a/d/aa;)V
    .locals 1

    .prologue
    .line 524
    iget-object v0, p0, Lcom/kik/l/am;->w:Lcom/kik/l/f;

    invoke-virtual {v0, p1, p2}, Lcom/kik/l/f;->b([BLkik/a/d/aa;)V

    .line 525
    return-void
.end method

.method public final b(Ljava/util/List;)Z
    .locals 1

    .prologue
    .line 600
    iget-object v0, p0, Lcom/kik/l/am;->G:Lcom/kik/l/l;

    invoke-virtual {v0, p1}, Lcom/kik/l/l;->a(Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method public final b(Lkik/a/d/k;)Z
    .locals 1

    .prologue
    .line 594
    iget-object v0, p0, Lcom/kik/l/am;->G:Lcom/kik/l/l;

    invoke-virtual {v0, p1}, Lcom/kik/l/l;->a(Lkik/a/d/k;)Z

    move-result v0

    return v0
.end method

.method public final b(Lkik/a/d/s;)Z
    .locals 1

    .prologue
    .line 688
    iget-object v0, p0, Lcom/kik/l/am;->I:Lcom/kik/l/ae;

    invoke-virtual {v0, p1}, Lcom/kik/l/ae;->b(Lkik/a/d/s;)Z

    move-result v0

    return v0
.end method

.method public final c()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 205
    iget-object v0, p0, Lcom/kik/l/am;->O:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final c(Ljava/io/File;)Z
    .locals 1

    .prologue
    .line 1013
    invoke-static {p1}, Lcom/kik/l/ac;->b(Ljava/io/File;)Z

    move-result v0

    return v0
.end method

.method public final c(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 1755
    iget-object v0, p0, Lcom/kik/l/am;->A:Lcom/kik/cache/bb;

    invoke-virtual {v0, p1}, Lcom/kik/cache/bb;->e(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 847
    iget-object v0, p0, Lcom/kik/l/am;->c:Lkik/android/util/aq;

    invoke-interface {v0}, Lkik/android/util/aq;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 848
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 849
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 850
    const/4 v0, 0x1

    return v0
.end method

.method public final c(Ljava/util/List;)Z
    .locals 1

    .prologue
    .line 606
    iget-object v0, p0, Lcom/kik/l/am;->G:Lcom/kik/l/l;

    invoke-virtual {v0, p1}, Lcom/kik/l/l;->b(Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method public final c(Lkik/a/d/k;)Z
    .locals 2

    .prologue
    .line 673
    iget-object v1, p0, Lcom/kik/l/am;->g:Lcom/kik/l/am$a;

    monitor-enter v1

    .line 674
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/kik/l/am;->b(Lkik/a/d/k;)Z

    move-result v0

    monitor-exit v1

    return v0

    .line 675
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final c(Lkik/a/d/s;)Z
    .locals 1

    .prologue
    .line 712
    iget-object v0, p0, Lcom/kik/l/am;->I:Lcom/kik/l/ae;

    invoke-virtual {v0, p1}, Lcom/kik/l/ae;->c(Lkik/a/d/s;)Z

    move-result v0

    return v0
.end method

.method public final d()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 217
    iget-object v0, p0, Lcom/kik/l/am;->R:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final d(Lkik/a/d/s;)Lkik/a/d/s;
    .locals 14

    .prologue
    const v3, 0x7f020124

    const/4 v9, 0x0

    .line 1077
    const-class v1, Lkik/a/d/a/a;

    invoke-static {p1, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lkik/a/d/a/a;

    .line 1078
    if-eqz v7, :cond_8

    .line 1079
    invoke-virtual {p1}, Lkik/a/d/s;->d()Z

    move-result v1

    if-nez v1, :cond_1

    .line 1080
    const-string v1, "com.kik.ext.camera"

    invoke-virtual {v7}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "com.kik.ext.video-camera"

    invoke-virtual {v7}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1081
    :cond_0
    iget-object v1, p0, Lcom/kik/l/am;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020043

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    .line 1082
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    invoke-static {v1}, Lkik/android/f/a/f;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 1083
    if-eqz v2, :cond_1

    .line 1084
    const-string v3, "icon"

    new-instance v4, Lkik/a/d/d;

    invoke-static {v2}, Lkik/android/util/e;->a(Landroid/graphics/Bitmap;)[B

    move-result-object v5

    invoke-direct {v4, v5}, Lkik/a/d/d;-><init>([B)V

    invoke-virtual {v7, v3, v4}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    .line 1085
    if-eq v1, v2, :cond_1

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_1

    .line 1086
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 1102
    :cond_1
    :goto_0
    iget-object v10, p0, Lcom/kik/l/am;->g:Lcom/kik/l/am$a;

    monitor-enter v10

    :try_start_0
    iget-object v1, p0, Lcom/kik/l/am;->g:Lcom/kik/l/am$a;

    invoke-virtual {v1}, Lcom/kik/l/am$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v11

    if-eqz v7, :cond_7

    new-instance v12, Ljava/util/Vector;

    invoke-direct {v12}, Ljava/util/Vector;-><init>()V

    invoke-virtual {v7}, Lkik/a/d/a/a;->s()Ljava/util/Hashtable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Hashtable;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_2
    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    move-object v0, v2

    check-cast v0, Ljava/lang/String;

    move-object v8, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    const-string v2, "MD5"

    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v2

    :goto_2
    :try_start_2
    invoke-static {}, Lkik/a/h/e;->a()Lkik/a/h/e;

    move-result-object v3

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/d/o;

    invoke-virtual {v3, v1}, Lkik/a/h/e;->a(Lkik/a/d/o;)[B

    move-result-object v3

    if-eqz v3, :cond_2

    const/4 v1, 0x0

    array-length v4, v3

    invoke-virtual {v2, v3, v1, v4}, Ljava/security/MessageDigest;->update([BII)V

    new-instance v1, Ljava/math/BigInteger;

    const/4 v4, 0x1

    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v2

    invoke-direct {v1, v4, v2}, Ljava/math/BigInteger;-><init>(I[B)V

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lcom/kik/l/am;->a(Ljava/lang/String;Ljava/lang/Object;ZZZ)Ljava/io/File;

    new-instance v1, Lkik/a/d/d;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, Lkik/a/d/d;-><init>([B)V

    invoke-virtual {v1, v2}, Lkik/a/d/d;->a(Ljava/lang/String;)V

    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    const-string v4, "content_id"

    invoke-virtual {v7}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "content_type"

    const/4 v5, 0x3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v4, "content_name"

    invoke-virtual {v3, v4, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "content_string"

    invoke-virtual {v3, v4, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v12, v3}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7, v8, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    goto :goto_1

    :catchall_0
    move-exception v1

    monitor-exit v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    .line 1090
    :cond_3
    const-string v1, "com.kik.ext.gallery"

    invoke-virtual {v7}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "com.kik.ext.video-gallery"

    invoke-virtual {v7}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1091
    :cond_4
    iget-object v1, p0, Lcom/kik/l/am;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    .line 1092
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    iget-object v1, p0, Lcom/kik/l/am;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v1}, Lkik/android/f/a/f;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 1094
    if-eqz v1, :cond_1

    .line 1095
    const-string v3, "icon"

    new-instance v4, Lkik/a/d/d;

    invoke-static {v1}, Lkik/android/util/e;->a(Landroid/graphics/Bitmap;)[B

    move-result-object v5

    invoke-direct {v4, v5}, Lkik/a/d/d;-><init>([B)V

    invoke-virtual {v7, v3, v4}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    .line 1096
    if-eq v2, v1, :cond_1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_1

    .line 1097
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    goto/16 :goto_0

    .line 1102
    :catch_0
    move-exception v2

    :try_start_3
    invoke-virtual {v2}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V

    move-object v2, v9

    goto/16 :goto_2

    :cond_5
    invoke-virtual {v11}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v12}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ContentValues;

    const-string v3, "KIKContentTable"

    const/4 v4, 0x0

    invoke-virtual {v11, v3, v4, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v1

    :try_start_5
    invoke-virtual {v11}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_6
    :try_start_6
    invoke-virtual {v11}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :try_start_7
    invoke-virtual {v11}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    :cond_7
    monitor-exit v10
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 1104
    :cond_8
    return-object p1
.end method

.method public final d(Lkik/a/d/k;)V
    .locals 1

    .prologue
    .line 896
    if-nez p1, :cond_0

    .line 900
    :goto_0
    return-void

    .line 899
    :cond_0
    iget-object v0, p0, Lcom/kik/l/am;->w:Lcom/kik/l/f;

    invoke-virtual {v0, p1}, Lcom/kik/l/f;->a(Lkik/a/d/k;)V

    goto :goto_0
.end method

.method public final d(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 1658
    iget-object v0, p0, Lcom/kik/l/am;->A:Lcom/kik/cache/bb;

    invoke-virtual {v0, p1}, Lcom/kik/cache/bb;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final d(Ljava/util/List;)Z
    .locals 1

    .prologue
    .line 706
    iget-object v0, p0, Lcom/kik/l/am;->I:Lcom/kik/l/ae;

    invoke-virtual {v0, p1}, Lcom/kik/l/ae;->a(Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method public final e()V
    .locals 7

    .prologue
    const/16 v6, 0x12

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 296
    iget-object v2, p0, Lcom/kik/l/am;->c:Lkik/android/util/aq;

    if-eqz v2, :cond_3

    const-string v3, "Kik.Storage.ContactImageCache.pref"

    invoke-interface {v2, v3}, Lkik/android/util/ar;->a(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "ContactImageCache.volley.migrated"

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_3

    move v2, v0

    :goto_0
    if-eqz v2, :cond_0

    .line 297
    iget-object v2, p0, Lcom/kik/l/am;->w:Lcom/kik/l/f;

    iget-object v3, p0, Lcom/kik/l/am;->G:Lcom/kik/l/l;

    invoke-virtual {v3}, Lcom/kik/l/l;->a()Ljava/util/Hashtable;

    move-result-object v3

    iget-object v4, p0, Lcom/kik/l/am;->b:Landroid/content/Context;

    iget-object v5, p0, Lcom/kik/l/am;->c:Lkik/android/util/aq;

    invoke-virtual {v2, v3, v4, v5}, Lcom/kik/l/f;->a(Ljava/util/Hashtable;Landroid/content/Context;Lkik/android/util/ar;)V

    .line 299
    :cond_0
    iget-object v2, p0, Lcom/kik/l/am;->w:Lcom/kik/l/f;

    const-string v3, "profpics"

    iget-object v4, p0, Lcom/kik/l/am;->R:Lcom/kik/g/k;

    invoke-virtual {v4}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v4

    iget-object v5, p0, Lcom/kik/l/am;->b:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Lcom/kik/l/f;->a(Ljava/lang/String;Lcom/kik/g/e;Ljava/io/File;)V

    .line 301
    iget-object v2, p0, Lcom/kik/l/am;->c:Lkik/android/util/aq;

    const-string v3, "Kik.Storage.ContentImageCache.pref"

    invoke-interface {v2, v3}, Lkik/android/util/ar;->a(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "ContentImageCache.volley.migrated"

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_4

    :goto_1
    if-eqz v0, :cond_1

    .line 302
    iget-object v0, p0, Lcom/kik/l/am;->x:Lcom/kik/l/p;

    invoke-direct {p0}, Lcom/kik/l/am;->s()Ljava/io/File;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/l/am;->c:Lkik/android/util/aq;

    invoke-virtual {v0, v1, v2}, Lcom/kik/l/p;->a(Ljava/io/File;Lkik/android/util/ar;)V

    .line 305
    :cond_1
    iget-object v0, p0, Lcom/kik/l/am;->x:Lcom/kik/l/p;

    const-string v1, "contentpics"

    iget-object v2, p0, Lcom/kik/l/am;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/l/p;->a(Ljava/lang/String;Ljava/io/File;)V

    .line 307
    iget-object v0, p0, Lcom/kik/l/am;->y:Lcom/kik/l/al;

    const-string v1, "sponsoredresponse"

    iget-object v2, p0, Lcom/kik/l/am;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/l/al;->a(Ljava/lang/String;Ljava/io/File;)V

    .line 310
    iget-object v0, p0, Lcom/kik/l/am;->g:Lcom/kik/l/am$a;

    invoke-virtual {v0}, Lcom/kik/l/am$a;->c()I

    move-result v0

    if-lt v0, v6, :cond_2

    iget-object v0, p0, Lcom/kik/l/am;->g:Lcom/kik/l/am$a;

    invoke-virtual {v0}, Lcom/kik/l/am$a;->b()I

    move-result v0

    if-ge v0, v6, :cond_2

    .line 311
    iget-object v0, p0, Lcom/kik/l/am;->G:Lcom/kik/l/l;

    invoke-virtual {v0}, Lcom/kik/l/l;->b()Ljava/util/Hashtable;

    move-result-object v0

    .line 312
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/Hashtable;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 313
    iget-object v0, p0, Lcom/kik/l/am;->w:Lcom/kik/l/f;

    invoke-virtual {v0, v1}, Lcom/kik/l/f;->a(Ljava/util/List;)V

    .line 315
    :cond_2
    return-void

    :cond_3
    move v2, v1

    .line 296
    goto/16 :goto_0

    :cond_4
    move v0, v1

    .line 301
    goto :goto_1
.end method

.method public final e(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 1718
    iget-object v0, p0, Lcom/kik/l/am;->q:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 1719
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1720
    const/4 v0, 0x1

    .line 1723
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final f(Ljava/lang/String;)Ljava/io/File;
    .locals 1

    .prologue
    .line 1730
    iget-object v0, p0, Lcom/kik/l/am;->A:Lcom/kik/cache/bb;

    invoke-virtual {v0, p1}, Lcom/kik/cache/bb;->c(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public final f()Ljava/util/Hashtable;
    .locals 1

    .prologue
    .line 549
    iget-object v0, p0, Lcom/kik/l/am;->H:Lcom/kik/l/w;

    invoke-virtual {v0}, Lcom/kik/l/w;->a()Ljava/util/Hashtable;

    move-result-object v0

    return-object v0
.end method

.method public final g(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 1792
    .line 1794
    :try_start_0
    iget-object v1, p0, Lcom/kik/l/am;->C:Lcom/kik/cache/s;

    invoke-static {p1}, Lcom/kik/l/am;->z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kik/cache/s;->d(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 1795
    if-nez v1, :cond_0

    .line 1796
    invoke-static {v1}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    .line 1802
    :goto_0
    return-object v0

    .line 1799
    :cond_0
    :try_start_1
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput-object v0, v2, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    const/4 v0, 0x1

    iput-boolean v0, v2, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    const/4 v0, 0x1

    iput-boolean v0, v2, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z

    const/4 v0, 0x0

    invoke-static {v1, v0, v2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v0

    .line 1802
    invoke-static {v1}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_1
    invoke-static {v1}, Lcom/kik/m/h;->a(Ljava/io/Closeable;)V

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_1
.end method

.method public final g()V
    .locals 3

    .prologue
    .line 560
    iget-object v0, p0, Lcom/kik/l/am;->c:Lkik/android/util/aq;

    invoke-interface {v0}, Lkik/android/util/aq;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 561
    const-string v1, "kik.mute.status.pull"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 562
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 563
    return-void
.end method

.method public final h(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 187
    iget-object v0, p0, Lcom/kik/l/am;->P:Lcom/kik/g/k;

    invoke-virtual {v0, p1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 188
    return-void
.end method

.method public final h()Z
    .locals 3

    .prologue
    .line 568
    iget-object v0, p0, Lcom/kik/l/am;->c:Lkik/android/util/aq;

    invoke-interface {v0}, Lkik/android/util/aq;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 569
    const-string v1, "kik.mute.status.pull"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final i()Ljava/util/Hashtable;
    .locals 1

    .prologue
    .line 658
    iget-object v0, p0, Lcom/kik/l/am;->G:Lcom/kik/l/l;

    invoke-virtual {v0}, Lcom/kik/l/l;->a()Ljava/util/Hashtable;

    move-result-object v0

    return-object v0
.end method

.method public final i(Ljava/lang/String;)Lkik/a/d/i;
    .locals 1

    .prologue
    .line 508
    iget-object v0, p0, Lcom/kik/l/am;->L:Lkik/android/w;

    invoke-virtual {v0, p1}, Lkik/android/w;->a(Ljava/lang/String;)Lkik/a/d/i;

    move-result-object v0

    return-object v0
.end method

.method public final j()Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 700
    iget-object v0, p0, Lcom/kik/l/am;->M:Lcom/kik/l/aq;

    invoke-virtual {v0}, Lcom/kik/l/aq;->a()Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method public final j(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 543
    iget-object v0, p0, Lcom/kik/l/am;->H:Lcom/kik/l/w;

    invoke-virtual {v0, p1}, Lcom/kik/l/w;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final k(Ljava/lang/String;)Lkik/a/d/k;
    .locals 1

    .prologue
    .line 641
    iget-object v0, p0, Lcom/kik/l/am;->G:Lcom/kik/l/l;

    invoke-virtual {v0, p1}, Lcom/kik/l/l;->b(Ljava/lang/String;)Lkik/a/d/k;

    move-result-object v0

    return-object v0
.end method

.method public final k()V
    .locals 1

    .prologue
    .line 883
    iget-object v0, p0, Lcom/kik/l/am;->g:Lcom/kik/l/am$a;

    invoke-virtual {v0}, Lcom/kik/l/am$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 884
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 886
    iget-object v0, p0, Lcom/kik/l/am;->h:Lcom/kik/l/am$c;

    invoke-virtual {v0}, Lcom/kik/l/am$c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 887
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 889
    iget-object v0, p0, Lcom/kik/l/am;->i:Lcom/kik/l/am$b;

    invoke-virtual {v0}, Lcom/kik/l/am$b;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 890
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 891
    return-void
.end method

.method public final l()Ljava/util/Hashtable;
    .locals 1

    .prologue
    .line 917
    iget-object v0, p0, Lcom/kik/l/am;->I:Lcom/kik/l/ae;

    invoke-virtual {v0}, Lcom/kik/l/ae;->a()Ljava/util/Hashtable;

    move-result-object v0

    .line 918
    return-object v0
.end method

.method public final l(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 652
    iget-object v0, p0, Lcom/kik/l/am;->G:Lcom/kik/l/l;

    invoke-virtual {v0, p1}, Lcom/kik/l/l;->c(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1188
    iget-object v0, p0, Lcom/kik/l/am;->N:Ljava/lang/String;

    return-object v0
.end method

.method public final m(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 718
    iget-object v0, p0, Lcom/kik/l/am;->I:Lcom/kik/l/ae;

    invoke-virtual {v0, p1}, Lcom/kik/l/ae;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final n(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 784
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/kik/l/am;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final n()Lkik/a/e/h;
    .locals 1

    .prologue
    .line 1585
    iget-object v0, p0, Lcom/kik/l/am;->f:Lkik/a/e/h;

    return-object v0
.end method

.method public final o(Ljava/lang/String;)Ljava/lang/Long;
    .locals 4

    .prologue
    .line 820
    iget-object v0, p0, Lcom/kik/l/am;->c:Lkik/android/util/aq;

    invoke-interface {v0}, Lkik/android/util/aq;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    const-wide/16 v2, 0x0

    invoke-interface {v0, p1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public final o()Z
    .locals 1

    .prologue
    .line 1591
    iget-object v0, p0, Lcom/kik/l/am;->w:Lcom/kik/l/f;

    invoke-virtual {v0}, Lcom/kik/l/f;->d()Z

    move-result v0

    return v0
.end method

.method public final p()Ljava/io/File;
    .locals 1

    .prologue
    .line 1646
    iget-object v0, p0, Lcom/kik/l/am;->s:Ljava/io/File;

    return-object v0
.end method

.method public final p(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 2

    .prologue
    .line 826
    iget-object v0, p0, Lcom/kik/l/am;->c:Lkik/android/util/aq;

    invoke-interface {v0}, Lkik/android/util/aq;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final q(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 838
    iget-object v0, p0, Lcom/kik/l/am;->c:Lkik/android/util/aq;

    invoke-interface {v0}, Lkik/android/util/aq;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 839
    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 840
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 841
    const/4 v0, 0x1

    return v0
.end method

.method public final r(Ljava/lang/String;)Lkik/a/d/a/a;
    .locals 1

    .prologue
    .line 905
    iget-object v0, p0, Lcom/kik/l/am;->I:Lcom/kik/l/ae;

    invoke-virtual {v0, p1}, Lcom/kik/l/ae;->b(Ljava/lang/String;)Lkik/a/d/a/a;

    move-result-object v0

    return-object v0
.end method

.method public final s(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 954
    iget-object v0, p0, Lcom/kik/l/am;->K:Lcom/kik/l/ac;

    invoke-virtual {v0, p1}, Lcom/kik/l/ac;->a(Ljava/lang/String;)V

    .line 955
    return-void
.end method

.method public final t(Ljava/lang/String;)Z
    .locals 4

    .prologue
    .line 984
    sget-object v0, Lcom/kik/l/am;->D:Ljava/io/File;

    if-nez v0, :cond_0

    .line 985
    const/4 v0, 0x0

    .line 989
    :goto_0
    return v0

    .line 988
    :cond_0
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/kik/l/am;->D:Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ".jpg"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 989
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    goto :goto_0
.end method

.method public final u(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 1019
    iget-object v0, p0, Lcom/kik/l/am;->K:Lcom/kik/l/ac;

    invoke-virtual {v0, p1}, Lcom/kik/l/ac;->b(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final v(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 1035
    iget-object v0, p0, Lcom/kik/l/am;->K:Lcom/kik/l/ac;

    invoke-virtual {v0, p1}, Lcom/kik/l/ac;->c(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final w(Ljava/lang/String;)[I
    .locals 1

    .prologue
    .line 1041
    iget-object v0, p0, Lcom/kik/l/am;->K:Lcom/kik/l/ac;

    invoke-virtual {v0, p1}, Lcom/kik/l/ac;->d(Ljava/lang/String;)[I

    move-result-object v0

    return-object v0
.end method

.method public final x(Ljava/lang/String;)[B
    .locals 1

    .prologue
    .line 1047
    iget-object v0, p0, Lcom/kik/l/am;->K:Lcom/kik/l/ac;

    invoke-virtual {v0, p1}, Lcom/kik/l/ac;->e(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public final y(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 1177
    iget-object v0, p0, Lcom/kik/l/am;->c:Lkik/android/util/aq;

    invoke-interface {v0}, Lkik/android/util/aq;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
