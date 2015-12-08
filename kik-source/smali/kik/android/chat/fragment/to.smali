.class public final Lkik/android/chat/fragment/to;
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


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 15
    const-class v0, Lkik/android/chat/fragment/to;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lkik/android/chat/fragment/to;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    sget-boolean v0, Lkik/android/chat/fragment/to;->a:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 30
    :cond_0
    iput-object p1, p0, Lkik/android/chat/fragment/to;->b:La/a;

    .line 31
    sget-boolean v0, Lkik/android/chat/fragment/to;->a:Z

    if-nez v0, :cond_1

    if-nez p2, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 32
    :cond_1
    iput-object p2, p0, Lkik/android/chat/fragment/to;->c:Ljavax/inject/Provider;

    .line 33
    sget-boolean v0, Lkik/android/chat/fragment/to;->a:Z

    if-nez v0, :cond_2

    if-nez p3, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 34
    :cond_2
    iput-object p3, p0, Lkik/android/chat/fragment/to;->d:Ljavax/inject/Provider;

    .line 35
    sget-boolean v0, Lkik/android/chat/fragment/to;->a:Z

    if-nez v0, :cond_3

    if-nez p4, :cond_3

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 36
    :cond_3
    iput-object p4, p0, Lkik/android/chat/fragment/to;->e:Ljavax/inject/Provider;

    .line 37
    sget-boolean v0, Lkik/android/chat/fragment/to;->a:Z

    if-nez v0, :cond_4

    if-nez p5, :cond_4

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 38
    :cond_4
    iput-object p5, p0, Lkik/android/chat/fragment/to;->f:Ljavax/inject/Provider;

    .line 39
    sget-boolean v0, Lkik/android/chat/fragment/to;->a:Z

    if-nez v0, :cond_5

    if-nez p6, :cond_5

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 40
    :cond_5
    iput-object p6, p0, Lkik/android/chat/fragment/to;->g:Ljavax/inject/Provider;

    .line 41
    sget-boolean v0, Lkik/android/chat/fragment/to;->a:Z

    if-nez v0, :cond_6

    if-nez p7, :cond_6

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 42
    :cond_6
    iput-object p7, p0, Lkik/android/chat/fragment/to;->h:Ljavax/inject/Provider;

    .line 43
    sget-boolean v0, Lkik/android/chat/fragment/to;->a:Z

    if-nez v0, :cond_7

    if-nez p8, :cond_7

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 44
    :cond_7
    iput-object p8, p0, Lkik/android/chat/fragment/to;->i:Ljavax/inject/Provider;

    .line 45
    sget-boolean v0, Lkik/android/chat/fragment/to;->a:Z

    if-nez v0, :cond_8

    if-nez p9, :cond_8

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 46
    :cond_8
    iput-object p9, p0, Lkik/android/chat/fragment/to;->j:Ljavax/inject/Provider;

    .line 47
    sget-boolean v0, Lkik/android/chat/fragment/to;->a:Z

    if-nez v0, :cond_9

    if-nez p10, :cond_9

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 48
    :cond_9
    iput-object p10, p0, Lkik/android/chat/fragment/to;->k:Ljavax/inject/Provider;

    .line 49
    return-void
.end method

.method public static a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;
    .locals 11

    .prologue
    .line 69
    new-instance v0, Lkik/android/chat/fragment/to;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v10}, Lkik/android/chat/fragment/to;-><init>(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 15
    check-cast p1, Lkik/android/chat/fragment/ViewPictureFragment;

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Cannot inject members into a null reference"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/to;->b:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lkik/android/chat/fragment/to;->c:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/ad;

    iput-object v0, p1, Lkik/android/chat/fragment/ViewPictureFragment;->b:Lcom/kik/cache/ad;

    iget-object v0, p0, Lkik/android/chat/fragment/to;->d:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/ad;

    iput-object v0, p1, Lkik/android/chat/fragment/ViewPictureFragment;->c:Lcom/kik/cache/ad;

    iget-object v0, p0, Lkik/android/chat/fragment/to;->e:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/r;

    iput-object v0, p1, Lkik/android/chat/fragment/ViewPictureFragment;->d:Lkik/a/e/r;

    iget-object v0, p0, Lkik/android/chat/fragment/to;->f:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/w;

    iput-object v0, p1, Lkik/android/chat/fragment/ViewPictureFragment;->e:Lkik/a/e/w;

    iget-object v0, p0, Lkik/android/chat/fragment/to;->g:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/a;

    iput-object v0, p1, Lkik/android/chat/fragment/ViewPictureFragment;->f:Lcom/kik/android/a;

    iget-object v0, p0, Lkik/android/chat/fragment/to;->h:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/n;

    iput-object v0, p1, Lkik/android/chat/fragment/ViewPictureFragment;->g:Lkik/a/e/n;

    iget-object v0, p0, Lkik/android/chat/fragment/to;->i:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/k;

    iput-object v0, p1, Lkik/android/chat/fragment/ViewPictureFragment;->h:Lkik/a/f/k;

    iget-object v0, p0, Lkik/android/chat/fragment/to;->j:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/v;

    iput-object v0, p1, Lkik/android/chat/fragment/ViewPictureFragment;->i:Lkik/a/e/v;

    iget-object v0, p0, Lkik/android/chat/fragment/to;->k:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/l/ab;

    iput-object v0, p1, Lkik/android/chat/fragment/ViewPictureFragment;->j:Lcom/kik/l/ab;

    return-void
.end method
