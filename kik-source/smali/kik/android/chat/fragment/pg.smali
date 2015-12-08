.class public final Lkik/android/chat/fragment/pg;
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
    .line 16
    const-class v0, Lkik/android/chat/fragment/pg;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lkik/android/chat/fragment/pg;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    sget-boolean v0, Lkik/android/chat/fragment/pg;->a:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 31
    :cond_0
    iput-object p1, p0, Lkik/android/chat/fragment/pg;->b:La/a;

    .line 32
    sget-boolean v0, Lkik/android/chat/fragment/pg;->a:Z

    if-nez v0, :cond_1

    if-nez p2, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 33
    :cond_1
    iput-object p2, p0, Lkik/android/chat/fragment/pg;->c:Ljavax/inject/Provider;

    .line 34
    sget-boolean v0, Lkik/android/chat/fragment/pg;->a:Z

    if-nez v0, :cond_2

    if-nez p3, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 35
    :cond_2
    iput-object p3, p0, Lkik/android/chat/fragment/pg;->d:Ljavax/inject/Provider;

    .line 36
    sget-boolean v0, Lkik/android/chat/fragment/pg;->a:Z

    if-nez v0, :cond_3

    if-nez p4, :cond_3

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 37
    :cond_3
    iput-object p4, p0, Lkik/android/chat/fragment/pg;->e:Ljavax/inject/Provider;

    .line 38
    sget-boolean v0, Lkik/android/chat/fragment/pg;->a:Z

    if-nez v0, :cond_4

    if-nez p5, :cond_4

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 39
    :cond_4
    iput-object p5, p0, Lkik/android/chat/fragment/pg;->f:Ljavax/inject/Provider;

    .line 40
    sget-boolean v0, Lkik/android/chat/fragment/pg;->a:Z

    if-nez v0, :cond_5

    if-nez p6, :cond_5

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 41
    :cond_5
    iput-object p6, p0, Lkik/android/chat/fragment/pg;->g:Ljavax/inject/Provider;

    .line 42
    sget-boolean v0, Lkik/android/chat/fragment/pg;->a:Z

    if-nez v0, :cond_6

    if-nez p7, :cond_6

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 43
    :cond_6
    iput-object p7, p0, Lkik/android/chat/fragment/pg;->h:Ljavax/inject/Provider;

    .line 44
    sget-boolean v0, Lkik/android/chat/fragment/pg;->a:Z

    if-nez v0, :cond_7

    if-nez p8, :cond_7

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 45
    :cond_7
    iput-object p8, p0, Lkik/android/chat/fragment/pg;->i:Ljavax/inject/Provider;

    .line 46
    sget-boolean v0, Lkik/android/chat/fragment/pg;->a:Z

    if-nez v0, :cond_8

    if-nez p9, :cond_8

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 47
    :cond_8
    iput-object p9, p0, Lkik/android/chat/fragment/pg;->j:Ljavax/inject/Provider;

    .line 48
    sget-boolean v0, Lkik/android/chat/fragment/pg;->a:Z

    if-nez v0, :cond_9

    if-nez p10, :cond_9

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 49
    :cond_9
    iput-object p10, p0, Lkik/android/chat/fragment/pg;->k:Ljavax/inject/Provider;

    .line 50
    return-void
.end method

.method public static a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;
    .locals 11

    .prologue
    .line 70
    new-instance v0, Lkik/android/chat/fragment/pg;

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

    invoke-direct/range {v0 .. v10}, Lkik/android/chat/fragment/pg;-><init>(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 16
    check-cast p1, Lkik/android/chat/fragment/KikRegistrationFragment;

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Cannot inject members into a null reference"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/pg;->b:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lkik/android/chat/fragment/pg;->c:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/a;

    iput-object v0, p1, Lkik/android/chat/fragment/KikRegistrationFragment;->a:Lcom/kik/android/a;

    iget-object v0, p0, Lkik/android/chat/fragment/pg;->d:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/n;

    iput-object v0, p1, Lkik/android/chat/fragment/KikRegistrationFragment;->b:Lkik/a/e/n;

    iget-object v0, p0, Lkik/android/chat/fragment/pg;->e:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/t;

    iput-object v0, p1, Lkik/android/chat/fragment/KikRegistrationFragment;->c:Lkik/a/e/t;

    iget-object v0, p0, Lkik/android/chat/fragment/pg;->f:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/w;

    iput-object v0, p1, Lkik/android/chat/fragment/KikRegistrationFragment;->d:Lkik/a/e/w;

    iget-object v0, p0, Lkik/android/chat/fragment/pg;->g:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/v;

    iput-object v0, p1, Lkik/android/chat/fragment/KikRegistrationFragment;->e:Lkik/a/e/v;

    iget-object v0, p0, Lkik/android/chat/fragment/pg;->h:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/f;

    iput-object v0, p1, Lkik/android/chat/fragment/KikRegistrationFragment;->f:Lkik/a/e/f;

    iget-object v0, p0, Lkik/android/chat/fragment/pg;->i:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/f/k;

    iput-object v0, p1, Lkik/android/chat/fragment/KikRegistrationFragment;->g:Lkik/a/f/k;

    iget-object v0, p0, Lkik/android/chat/fragment/pg;->j:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/aa;

    iput-object v0, p1, Lkik/android/chat/fragment/KikRegistrationFragment;->h:Lkik/a/aa;

    iget-object v0, p0, Lkik/android/chat/fragment/pg;->k:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/util/ar;

    iput-object v0, p1, Lkik/android/chat/fragment/KikRegistrationFragment;->i:Lkik/android/util/ar;

    return-void
.end method
