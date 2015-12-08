.class public final Lcom/kik/cards/web/ao;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/a;


# static fields
.field static final synthetic a:Z


# instance fields
.field private final b:La/a;

.field private final c:Ljavax/inject/Provider;

.field private final d:Ljavax/inject/Provider;

.field private final e:Ljavax/inject/Provider;

.field private final f:Ljavax/inject/Provider;

.field private final g:Ljavax/inject/Provider;

.field private final h:Ljavax/inject/Provider;

.field private final i:Ljavax/inject/Provider;

.field private final j:Ljavax/inject/Provider;

.field private final k:Ljavax/inject/Provider;

.field private final l:Ljavax/inject/Provider;

.field private final m:Ljavax/inject/Provider;

.field private final n:Ljavax/inject/Provider;

.field private final o:Ljavax/inject/Provider;

.field private final p:Ljavax/inject/Provider;

.field private final q:Ljavax/inject/Provider;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const-class v0, Lcom/kik/cards/web/ao;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/kik/cards/web/ao;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 2

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    sget-boolean v1, Lcom/kik/cards/web/ao;->a:Z

    if-nez v1, :cond_0

    if-nez p1, :cond_0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 44
    :cond_0
    iput-object p1, p0, Lcom/kik/cards/web/ao;->b:La/a;

    .line 45
    sget-boolean v1, Lcom/kik/cards/web/ao;->a:Z

    if-nez v1, :cond_1

    if-nez p2, :cond_1

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 46
    :cond_1
    iput-object p2, p0, Lcom/kik/cards/web/ao;->c:Ljavax/inject/Provider;

    .line 47
    sget-boolean v1, Lcom/kik/cards/web/ao;->a:Z

    if-nez v1, :cond_2

    if-nez p3, :cond_2

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 48
    :cond_2
    iput-object p3, p0, Lcom/kik/cards/web/ao;->d:Ljavax/inject/Provider;

    .line 49
    sget-boolean v1, Lcom/kik/cards/web/ao;->a:Z

    if-nez v1, :cond_3

    if-nez p4, :cond_3

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 50
    :cond_3
    iput-object p4, p0, Lcom/kik/cards/web/ao;->e:Ljavax/inject/Provider;

    .line 51
    sget-boolean v1, Lcom/kik/cards/web/ao;->a:Z

    if-nez v1, :cond_4

    if-nez p5, :cond_4

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 52
    :cond_4
    iput-object p5, p0, Lcom/kik/cards/web/ao;->f:Ljavax/inject/Provider;

    .line 53
    sget-boolean v1, Lcom/kik/cards/web/ao;->a:Z

    if-nez v1, :cond_5

    if-nez p6, :cond_5

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 54
    :cond_5
    iput-object p6, p0, Lcom/kik/cards/web/ao;->g:Ljavax/inject/Provider;

    .line 55
    sget-boolean v1, Lcom/kik/cards/web/ao;->a:Z

    if-nez v1, :cond_6

    if-nez p7, :cond_6

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 56
    :cond_6
    iput-object p7, p0, Lcom/kik/cards/web/ao;->h:Ljavax/inject/Provider;

    .line 57
    sget-boolean v1, Lcom/kik/cards/web/ao;->a:Z

    if-nez v1, :cond_7

    if-nez p8, :cond_7

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 58
    :cond_7
    iput-object p8, p0, Lcom/kik/cards/web/ao;->i:Ljavax/inject/Provider;

    .line 59
    sget-boolean v1, Lcom/kik/cards/web/ao;->a:Z

    if-nez v1, :cond_8

    if-nez p9, :cond_8

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 60
    :cond_8
    iput-object p9, p0, Lcom/kik/cards/web/ao;->j:Ljavax/inject/Provider;

    .line 61
    sget-boolean v1, Lcom/kik/cards/web/ao;->a:Z

    if-nez v1, :cond_9

    if-nez p10, :cond_9

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 62
    :cond_9
    iput-object p10, p0, Lcom/kik/cards/web/ao;->k:Ljavax/inject/Provider;

    .line 63
    sget-boolean v1, Lcom/kik/cards/web/ao;->a:Z

    if-nez v1, :cond_a

    if-nez p11, :cond_a

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 64
    :cond_a
    iput-object p11, p0, Lcom/kik/cards/web/ao;->l:Ljavax/inject/Provider;

    .line 65
    sget-boolean v1, Lcom/kik/cards/web/ao;->a:Z

    if-nez v1, :cond_b

    if-nez p12, :cond_b

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 66
    :cond_b
    iput-object p12, p0, Lcom/kik/cards/web/ao;->m:Ljavax/inject/Provider;

    .line 67
    sget-boolean v1, Lcom/kik/cards/web/ao;->a:Z

    if-nez v1, :cond_c

    if-nez p13, :cond_c

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 68
    :cond_c
    iput-object p13, p0, Lcom/kik/cards/web/ao;->n:Ljavax/inject/Provider;

    .line 69
    sget-boolean v1, Lcom/kik/cards/web/ao;->a:Z

    if-nez v1, :cond_d

    if-nez p14, :cond_d

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 70
    :cond_d
    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/kik/cards/web/ao;->o:Ljavax/inject/Provider;

    .line 71
    sget-boolean v1, Lcom/kik/cards/web/ao;->a:Z

    if-nez v1, :cond_e

    if-nez p15, :cond_e

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 72
    :cond_e
    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/kik/cards/web/ao;->p:Ljavax/inject/Provider;

    .line 73
    sget-boolean v1, Lcom/kik/cards/web/ao;->a:Z

    if-nez v1, :cond_f

    if-nez p16, :cond_f

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 74
    :cond_f
    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/kik/cards/web/ao;->q:Ljavax/inject/Provider;

    .line 75
    return-void
.end method

.method public static a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;
    .locals 17

    .prologue
    .line 101
    new-instance v0, Lcom/kik/cards/web/ao;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    invoke-direct/range {v0 .. v16}, Lcom/kik/cards/web/ao;-><init>(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 23
    check-cast p1, Lcom/kik/cards/web/CardsWebViewFragment;

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Cannot inject members into a null reference"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/ao;->b:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/kik/cards/web/ao;->c:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/a;

    iput-object v0, p1, Lcom/kik/cards/web/CardsWebViewFragment;->c:Lcom/kik/android/a;

    iget-object v0, p0, Lcom/kik/cards/web/ao;->d:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/j/m;

    iput-object v0, p1, Lcom/kik/cards/web/CardsWebViewFragment;->d:Lkik/a/j/m;

    iget-object v0, p0, Lcom/kik/cards/web/ao;->e:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/u;

    iput-object v0, p1, Lcom/kik/cards/web/CardsWebViewFragment;->e:Lkik/a/e/u;

    iget-object v0, p0, Lcom/kik/cards/web/ao;->f:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/c/f;

    iput-object v0, p1, Lcom/kik/cards/web/CardsWebViewFragment;->f:Lcom/kik/android/c/f;

    iget-object v0, p0, Lcom/kik/cards/web/ao;->g:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/r;

    iput-object v0, p1, Lcom/kik/cards/web/CardsWebViewFragment;->g:Lkik/a/e/r;

    iget-object v0, p0, Lcom/kik/cards/web/ao;->h:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/d;

    iput-object v0, p1, Lcom/kik/cards/web/CardsWebViewFragment;->h:Lkik/a/e/d;

    iget-object v0, p0, Lcom/kik/cards/web/ao;->i:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/i/h;

    iput-object v0, p1, Lcom/kik/cards/web/CardsWebViewFragment;->i:Lkik/a/i/h;

    iget-object v0, p0, Lcom/kik/cards/web/ao;->j:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/m;

    iput-object v0, p1, Lcom/kik/cards/web/CardsWebViewFragment;->j:Lkik/a/e/m;

    iget-object v0, p0, Lcom/kik/cards/web/ao;->k:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/v;

    iput-object v0, p1, Lcom/kik/cards/web/CardsWebViewFragment;->k:Lkik/a/e/v;

    iget-object v0, p0, Lcom/kik/cards/web/ao;->l:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/l/ab;

    iput-object v0, p1, Lcom/kik/cards/web/CardsWebViewFragment;->l:Lcom/kik/l/ab;

    iget-object v0, p0, Lcom/kik/cards/web/ao;->m:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/w;

    iput-object v0, p1, Lcom/kik/cards/web/CardsWebViewFragment;->m:Lkik/a/e/w;

    iget-object v0, p0, Lcom/kik/cards/web/ao;->n:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/k;

    iput-object v0, p1, Lcom/kik/cards/web/CardsWebViewFragment;->n:Lkik/a/f/k;

    iget-object v0, p0, Lcom/kik/cards/web/ao;->o:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/q;

    iput-object v0, p1, Lcom/kik/cards/web/CardsWebViewFragment;->o:Lkik/a/e/q;

    iget-object v0, p0, Lcom/kik/cards/web/ao;->p:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/ad;

    iput-object v0, p1, Lcom/kik/cards/web/CardsWebViewFragment;->p:Lcom/kik/cache/ad;

    iget-object v0, p0, Lcom/kik/cards/web/ao;->q:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/util/ar;

    iput-object v0, p1, Lcom/kik/cards/web/CardsWebViewFragment;->q:Lkik/android/util/ar;

    return-void
.end method
