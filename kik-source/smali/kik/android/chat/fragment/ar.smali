.class public final Lkik/android/chat/fragment/ar;
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


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    const-class v0, Lkik/android/chat/fragment/ar;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lkik/android/chat/fragment/ar;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    sget-boolean v0, Lkik/android/chat/fragment/ar;->a:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 27
    :cond_0
    iput-object p1, p0, Lkik/android/chat/fragment/ar;->b:La/a;

    .line 28
    sget-boolean v0, Lkik/android/chat/fragment/ar;->a:Z

    if-nez v0, :cond_1

    if-nez p2, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 29
    :cond_1
    iput-object p2, p0, Lkik/android/chat/fragment/ar;->c:Ljavax/inject/Provider;

    .line 30
    sget-boolean v0, Lkik/android/chat/fragment/ar;->a:Z

    if-nez v0, :cond_2

    if-nez p3, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 31
    :cond_2
    iput-object p3, p0, Lkik/android/chat/fragment/ar;->d:Ljavax/inject/Provider;

    .line 32
    sget-boolean v0, Lkik/android/chat/fragment/ar;->a:Z

    if-nez v0, :cond_3

    if-nez p4, :cond_3

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 33
    :cond_3
    iput-object p4, p0, Lkik/android/chat/fragment/ar;->e:Ljavax/inject/Provider;

    .line 34
    sget-boolean v0, Lkik/android/chat/fragment/ar;->a:Z

    if-nez v0, :cond_4

    if-nez p5, :cond_4

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 35
    :cond_4
    iput-object p5, p0, Lkik/android/chat/fragment/ar;->f:Ljavax/inject/Provider;

    .line 36
    sget-boolean v0, Lkik/android/chat/fragment/ar;->a:Z

    if-nez v0, :cond_5

    if-nez p6, :cond_5

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 37
    :cond_5
    iput-object p6, p0, Lkik/android/chat/fragment/ar;->g:Ljavax/inject/Provider;

    .line 38
    sget-boolean v0, Lkik/android/chat/fragment/ar;->a:Z

    if-nez v0, :cond_6

    if-nez p7, :cond_6

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 39
    :cond_6
    iput-object p7, p0, Lkik/android/chat/fragment/ar;->h:Ljavax/inject/Provider;

    .line 40
    sget-boolean v0, Lkik/android/chat/fragment/ar;->a:Z

    if-nez v0, :cond_7

    if-nez p8, :cond_7

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 41
    :cond_7
    iput-object p8, p0, Lkik/android/chat/fragment/ar;->i:Ljavax/inject/Provider;

    .line 42
    return-void
.end method

.method public static a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;
    .locals 9

    .prologue
    .line 60
    new-instance v0, Lkik/android/chat/fragment/ar;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lkik/android/chat/fragment/ar;-><init>(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 14
    check-cast p1, Lkik/android/chat/fragment/ConversationsBaseFragment;

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Cannot inject members into a null reference"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/ar;->b:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lkik/android/chat/fragment/ar;->c:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/i;

    iput-object v0, p1, Lkik/android/chat/fragment/ConversationsBaseFragment;->a:Lkik/a/e/i;

    iget-object v0, p0, Lkik/android/chat/fragment/ar;->d:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/r;

    iput-object v0, p1, Lkik/android/chat/fragment/ConversationsBaseFragment;->b:Lkik/a/e/r;

    iget-object v0, p0, Lkik/android/chat/fragment/ar;->e:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/v;

    iput-object v0, p1, Lkik/android/chat/fragment/ConversationsBaseFragment;->c:Lkik/a/e/v;

    iget-object v0, p0, Lkik/android/chat/fragment/ar;->f:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/l;

    iput-object v0, p1, Lkik/android/chat/fragment/ConversationsBaseFragment;->d:Lkik/a/e/l;

    iget-object v0, p0, Lkik/android/chat/fragment/ar;->g:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/n;

    iput-object v0, p1, Lkik/android/chat/fragment/ConversationsBaseFragment;->e:Lkik/a/e/n;

    iget-object v0, p0, Lkik/android/chat/fragment/ar;->h:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/a;

    iput-object v0, p1, Lkik/android/chat/fragment/ConversationsBaseFragment;->f:Lcom/kik/android/a;

    iget-object v0, p0, Lkik/android/chat/fragment/ar;->i:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/l/ab;

    iput-object v0, p1, Lkik/android/chat/fragment/ConversationsBaseFragment;->g:Lcom/kik/l/ab;

    return-void
.end method
